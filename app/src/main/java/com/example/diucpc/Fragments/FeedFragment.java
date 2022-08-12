package com.example.diucpc.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.diucpc.Adapter.FeedAdapter;
import com.example.diucpc.Models.feedImagemodel;
import com.example.diucpc.R;

import java.util.ArrayList;
import java.util.List;

public class FeedFragment extends Fragment {
    ViewPager2 viewPager2;
    WebView timeweb;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_feed, container, false);

        timeweb = v.findViewById(R.id.timewebview);

        timeweb.getSettings().setJavaScriptEnabled(true);

        timeweb.loadUrl("https://www.timeanddate.com/worldclock/bangladesh/dhaka");








    return  v;
    }
}