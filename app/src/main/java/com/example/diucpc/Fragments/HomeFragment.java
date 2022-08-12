package com.example.diucpc.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.diucpc.Adapter.Upcoming_slider_adapter;
import com.example.diucpc.Adapter.onGoing_slider_adapter;
import com.example.diucpc.Models.Slider_model_ongoing;
import com.example.diucpc.Models.Slider_model_upcoming;
import com.example.diucpc.R;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator3;

public class HomeFragment extends Fragment {

    ImageCarousel imageCarousel;
    ViewPager2 viewpagerLayout,upcomingViewPager;
   List<Slider_model_ongoing> ongoingList;
   List<Slider_model_upcoming> upcomingList;
   CircleIndicator3 ongoingIndicator,upcomingIndicator;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        viewpagerLayout = v.findViewById(R.id.onGoingPager);
        upcomingViewPager = v.findViewById(R.id.upcomingPager);
        ongoingIndicator = v.findViewById(R.id.circleindicatorongoing);
        upcomingIndicator = v.findViewById(R.id.circleindicatorupcoming);

        ongoingList = new ArrayList<>();

        ongoingList.add(new Slider_model_ongoing(R.drawable.slideimage,"ongoing"));
        ongoingList.add(new Slider_model_ongoing(R.drawable.slideimage,"ongoing"));
        ongoingList.add(new Slider_model_ongoing(R.drawable.slideimage,"ongoing"));


        viewpagerLayout.setAdapter(new onGoing_slider_adapter(ongoingList));
        ongoingIndicator.setViewPager(viewpagerLayout);




        upcomingList = new ArrayList<>();

        upcomingList.add(new Slider_model_upcoming(R.drawable.upcominngimagedemo));
        upcomingList.add(new Slider_model_upcoming(R.drawable.maruf));
        upcomingList.add(new Slider_model_upcoming(R.drawable.slideimage));
        upcomingViewPager.setAdapter(new Upcoming_slider_adapter(upcomingList));
        upcomingIndicator.setViewPager(upcomingViewPager);











//        imageCarousel = v.findViewById(R.id.carousel);
//
//        imageCarousel.addData(new CarouselItem(R.drawable.slideimage,"Hello"));
//        imageCarousel.addData(new CarouselItem(R.drawable.cardimage,"Hello"));











        return  v;
    }
}