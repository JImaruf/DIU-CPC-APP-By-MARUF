package com.example.diucpc.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Toast;

import com.cncoderx.wheelview.OnWheelChangedListener;
import com.cncoderx.wheelview.WheelView;
import com.example.diucpc.Fragments.TeamFragment;
import com.example.diucpc.R;

public class TeamLIstbyYear extends Fragment {
    NumberPicker numberPicker;
    WheelView wheelView;
    String currentItem;
    Button teamViewer;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_team_l_istby_year, container, false);

            wheelView = v.findViewById(R.id.yearWheel);

          wheelView.setOnWheelChangedListener(new OnWheelChangedListener() {
              @Override
              public void onChanged(WheelView view, int oldIndex, int newIndex) {
              currentItem = (String) view.getCurrentItem();

                //  Toast.makeText(getContext(), currentItem+"", Toast.LENGTH_SHORT).show();

              }
          });

          teamViewer = v.findViewById(R.id.teamViewer);
          teamViewer.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  Toast.makeText(getContext(), "submit cliked with "+currentItem, Toast.LENGTH_SHORT).show();
                  Bundle result= new Bundle();

                  result.putString("year",currentItem);

                  getParentFragmentManager().setFragmentResult("teamListByYear",result);

                  FragmentManager fm = getActivity().getSupportFragmentManager();
                  FragmentTransaction ft = fm.beginTransaction();
                  ft.replace(R.id.fragmentcontainer,new TeamFragment());
                  ft.commit();
              }
          });





            return v;
        }

    }
