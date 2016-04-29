package com.example.mom.jaktcodingchallenge;

import android.app.AlertDialog;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by MOM on 4/28/16.
 */
public class FragmentA extends Fragment {

    public FragmentA(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View fragmentA= inflater.inflate(R.layout.fragment_a,container,false);

        FloatingActionButton fabA=(FloatingActionButton)fragmentA.findViewById(R.id.buttonA);
        fabA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert= new AlertDialog.Builder(getActivity());
                alert.setMessage("Hello");
                alert.show();
            }
        });

        return fragmentA;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

    }
}
