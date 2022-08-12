package com.example.diucpc.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.diucpc.Adapter.TeamListAdapter;
import com.example.diucpc.Models.TeamListmodel;
import com.example.diucpc.R;

import java.util.ArrayList;
import java.util.List;


public class TeamFragment extends Fragment {
    RecyclerView teamRecyler;
    List<TeamListmodel> teamlist;
    TeamListAdapter teamListAdapter;
    String selectedYear="hello";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_team, container, false);

       getParentFragmentManager().setFragmentResultListener("teamListByYear", this, new FragmentResultListener() {
           @Override
           public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
               selectedYear = result.getString("year");
            Toast.makeText(getContext(), "F2 selected is "+selectedYear, Toast.LENGTH_SHORT).show();
           }
       });
        teamRecyler = v.findViewById(R.id.teamrecyler);
        teamlist = new ArrayList<>();



        teamlist.add(new TeamListmodel(R.drawable.sohanb,"Sohan","Admin"));
        teamlist.add(new TeamListmodel(R.drawable.profilesvg,"Omi","Member"));
        teamlist.add(new TeamListmodel(R.drawable.likhon,"Likhon","Vice President"));

        teamlist.add(new TeamListmodel(R.drawable.maruf,"Maruf","Admin"));
        teamlist.add(new TeamListmodel(R.drawable.shefa,"Shefa","Junior Admin"));
        teamlist.add(new TeamListmodel(R.drawable.tahmid,"Tahmid","Secretery"));
        teamlist.add(new TeamListmodel(R.drawable.anonna,"Anonna","Junior Admin"));
        teamlist.add(new TeamListmodel(R.drawable.tahmid,"Tahmid","Secretery"));
        teamlist.add(new TeamListmodel(R.drawable.likhon,"Likhon","Vice President"));
        teamlist.add(new TeamListmodel(R.drawable.maruf,"Maruf","Admin"));
        teamlist.add(new TeamListmodel(R.drawable.shefa,"Shefa","Junior Admin"));
        teamlist.add(new TeamListmodel(R.drawable.sohanb,"Sohan","Admin"));;
        teamlist.add(new TeamListmodel(R.drawable.maruf,"Maruf","Admin"));
        teamlist.add(new TeamListmodel(R.drawable.anonna,"Anonna","Junior Admin"));
        teamlist.add(new TeamListmodel(R.drawable.profilesvg,"Maruf","Admin"));

        teamlist.add(new TeamListmodel(R.drawable.tahmid,"Tahmid","Secretery"));
        teamlist.add(new TeamListmodel(R.drawable.shefa,"Shefa","Junior Admin"));

        teamlist.add(new TeamListmodel(R.drawable.anonna,"Anonna","Junior Admin"));
        teamlist.add(new TeamListmodel(R.drawable.profilesvg,"Maruf","Admin"));
        teamlist.add(new TeamListmodel(R.drawable.profilesvg,"Maruf","Admin"));
        teamlist.add(new TeamListmodel(R.drawable.anonna,"Anonna","Junior Admin"));
        teamlist.add(new TeamListmodel(R.drawable.profilesvg,"Maruf","Admin"));
        teamlist.add(new TeamListmodel(R.drawable.sohanb,"Sohan","Admin"));
        teamlist.add(new TeamListmodel(R.drawable.profilesvg,"Maruf","Admin"));
        teamlist.add(new TeamListmodel(R.drawable.shefa,"Shefa","Junior Admin"));
        teamlist.add(new TeamListmodel(R.drawable.profilesvg,"Maruf","Admin"));
        teamlist.add(new TeamListmodel(R.drawable.maruf,"Maruf","Admin"));
        teamlist.add(new TeamListmodel(R.drawable.profilesvg,"Maruf","Admin"));
        teamlist.add(new TeamListmodel(R.drawable.tahmid,"Tahmid","Secretery"));
        teamlist.add(new TeamListmodel(R.drawable.profilesvg,"Nion","Secretery"));
        teamlist.add(new TeamListmodel(R.drawable.profilesvg,"Nion","Secretery"));
        teamlist.add(new TeamListmodel(R.drawable.likhon,"Likhon","Vice President"));
        teamlist.add(new TeamListmodel(R.drawable.profilesvg,"Jahid","Vice President"));
        teamlist.add(new TeamListmodel(R.drawable.profilesvg,"Jahid","Vice President"));
        teamlist.add(new TeamListmodel(R.drawable.profilesvg,"Jalal","Member"));
        teamlist.add(new TeamListmodel(R.drawable.profilesvg,"Sojib","Junior Admin"));
        teamlist.add(new TeamListmodel(R.drawable.profilesvg,"Sojib","Junior Admin"));

        teamListAdapter= new TeamListAdapter(getContext(),teamlist);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),3);
        teamRecyler.setAdapter(teamListAdapter);
        teamRecyler.setLayoutManager(gridLayoutManager);
















        return  v;
    }
}