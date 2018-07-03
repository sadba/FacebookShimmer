package com.example.sadba.androidshimmertest.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sadba.androidshimmertest.Model.Model;
import com.example.sadba.androidshimmertest.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private Context context;
    private LayoutInflater inflater;
    private List<Model> models;

    public MyAdapter(Context context, List<Model> models){
        this.context = context;
        this.models = models;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }


    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, int position) {
        Picasso.get().load(models.get(position).getThumbnailUrl())
                .into(holder.thumbnail);
        holder.title.setText(models.get(position).getTitle());
        holder.url.setText(models.get(position).getUrl());

    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView url,title;
        ImageView thumbnail;

        public MyViewHolder(View itemView){
            super(itemView);
            thumbnail = itemView.findViewById(R.id.thumbnail);
            url = itemView.findViewById(R.id.url);
            title = itemView.findViewById(R.id.title);
        }


    }
}
