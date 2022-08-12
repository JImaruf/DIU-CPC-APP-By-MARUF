package com.example.diucpc.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.diucpc.Models.feedImagemodel;
import com.example.diucpc.R;

import java.util.List;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.MyViewHOlder> {


    List<feedImagemodel> feedlist;

    public FeedAdapter(List<feedImagemodel> feedlist) {
        this.feedlist = feedlist;
    }

    @NonNull
    @Override
    public MyViewHOlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.feed_item,parent,false);

        return new MyViewHOlder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHOlder holder, int position) {
        holder.imageView.setImageResource(feedlist.get(position).getImage());
        holder.textView.setText(feedlist.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return feedlist.size();
    }

    class MyViewHOlder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;
        public MyViewHOlder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageView9);
            textView = itemView.findViewById(R.id.textView3);
        }
    }

}
