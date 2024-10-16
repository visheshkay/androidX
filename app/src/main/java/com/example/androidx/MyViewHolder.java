package com.example.androidx;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder{
    public ImageView img;
    public TextView title;
    public TextView desc;
    public TextView link;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        img = itemView.findViewById(R.id.image_project_card);
        title = itemView.findViewById(R.id.title_project_card);
        desc = itemView.findViewById(R.id.desc_project_card);
        link = itemView.findViewById(R.id.link_project_card);
    }
}
