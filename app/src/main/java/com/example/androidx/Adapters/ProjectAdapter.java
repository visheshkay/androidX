package com.example.androidx.Adapters;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidx.Models.ProjectModel;
import com.example.androidx.MyViewHolder;
import com.example.androidx.R;

import java.net.URL;
import java.util.List;

public class ProjectAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context context;
    List<ProjectModel> projects;

    public ProjectAdapter(Context context, List<ProjectModel> projects) {
        this.context = context;
        this.projects = projects;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.project_card,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.title.setText(projects.get(position).getTitle());
        holder.desc.setText(projects.get(position).getDesc());
        holder.link.setText(projects.get(position).getLink());
        holder.img.setImageResource(projects.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return projects.size();
    }
}
