package com.example.user.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridKerajaanAdapter extends RecyclerView.Adapter<GridKerajaanAdapter.GridViewHolder> {

    public GridKerajaanAdapter(Context context) {
        this.context = context;
    }

    private Context context;

    public ArrayList<Kerajaan> getListKerajaan() {
        return listKerajaan;
    }

    public void setListKerajaan(ArrayList<Kerajaan> listKerajaan) {
        this.listKerajaan = listKerajaan;
    }

    private ArrayList<Kerajaan> listKerajaan;

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_kerajaan, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, final int position) {
        Glide.with(context)
                .load(getListKerajaan().get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

        holder.imgPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context.getApplicationContext(), DetailListActivity.class);
                i.putExtra("name",getListKerajaan().get(position).getName());
                i.putExtra("deskrip",getListKerajaan().get(position).getDeskrip());
                i.putExtra("gambar",getListKerajaan().get(position).getPhoto());
                context.startActivity(i);

            }
        });


    }

    @Override
    public int getItemCount() {
        return getListKerajaan().size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
