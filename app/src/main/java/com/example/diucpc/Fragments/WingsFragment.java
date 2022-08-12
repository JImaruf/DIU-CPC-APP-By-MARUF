package com.example.diucpc.Fragments;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.diucpc.R;
import com.example.diucpc.databinding.FragmentWingsBinding;


public class WingsFragment extends Fragment {
    CardView task,develop,research,job;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_wings, container, false);


        task =v.findViewById(R.id.taskcard);
        develop =v.findViewById(R.id.developcard);
        research =v.findViewById(R.id.researchcard);
        job =v.findViewById(R.id.jobcard);


        task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(), "task", Toast.LENGTH_SHORT).show();

            }
        });

        develop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(), "develop", Toast.LENGTH_SHORT).show();

            }
        });

        research.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(), "research clicked", Toast.LENGTH_SHORT).show();

            }
        });

        job.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(), "job clicked", Toast.LENGTH_SHORT).show();

            }
        });







        return v;
    }
}