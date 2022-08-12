package com.example.diucpc.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.diucpc.Models.Slider_model_ongoing;
import com.example.diucpc.Models.Slider_model_upcoming;
import com.example.diucpc.R;

import java.util.List;

public class Upcoming_slider_adapter extends RecyclerView.Adapter<Upcoming_slider_adapter.MyviewHolder> {

    List<Slider_model_upcoming> list;

    public Upcoming_slider_adapter(List<Slider_model_upcoming> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.upcoming_item,parent,false);

        MyviewHolder myviewHolder = new MyviewHolder(view);
        return myviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {

        holder.imageView.setImageResource(list.get(position).getImage());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyviewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView title;

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.upcomingImage);
            title = itemView.findViewById(R.id.ongoingTV);


        }
    }
}
