package com.example.user.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListKerajaanAdapter extends RecyclerView.Adapter<ListKerajaanAdapter.CategoryViewHolder> {

    public ListKerajaanAdapter(Context context) {
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
    public ListKerajaanAdapter.CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_kerajaan, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ListKerajaanAdapter.CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvName.setText(getListKerajaan().get(position).getName());
        categoryViewHolder.tvRemarks.setText(getListKerajaan().get(position).getRemarks());
        Glide.with(context)
                .load(getListKerajaan().get(position).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListKerajaan().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
