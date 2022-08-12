package com.example.diucpc.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.diucpc.Models.TeamListmodel;
import com.example.diucpc.R;

import java.util.List;

public class TeamListAdapter extends RecyclerView.Adapter<TeamListAdapter.MyViewHolder> {

    Context context;
    List<TeamListmodel> list;

    public TeamListAdapter(Context context, List<TeamListmodel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.team_avatar_profile,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.Name.setText(list.get(position).getName());
        holder.Post.setText(list.get(position).getPost());
        holder.profilePhoto.setImageResource(list.get(position).getProfile());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView Name,Post;
        ImageView profilePhoto;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            Name = itemView.findViewById(R.id.teamavatar);
            Post = itemView.findViewById(R.id.post);
            profilePhoto=itemView.findViewById(R.id.image);
        }
    }
}
