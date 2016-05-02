package com.example.mom.jaktcodingchallenge;

import android.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by MOM on 4/28/16.
 */
public class FragmentB extends Fragment {

    public ProgressBar pb;
    public FragmentB(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View fragmentB= inflater.inflate(R.layout.fragment_b, container, false);

        FloatingActionButton fab= (FloatingActionButton) fragmentB.findViewById(R.id.buttonB);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
               pb= (ProgressBar)fragmentB.findViewById(R.id.progressBar);
                pb.setVisibility(View.VISIBLE);
                FragmentAsync fragmentAsync= new FragmentAsync();
                fragmentAsync.execute();
            }
        });

        return fragmentB;
    }

    @Override
    public void onViewCreated(final View view, Bundle savedInstanceState) {

    }
    public class FragmentAsync extends AsyncTask<Integer, Integer, String>{


        @Override
        protected String doInBackground(Integer... params) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Task Completed";
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            pb.setVisibility(View.GONE);

        }
    }

}
