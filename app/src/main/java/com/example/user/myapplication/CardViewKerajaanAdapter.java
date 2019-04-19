package com.example.user.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewKerajaanAdapter extends RecyclerView.Adapter<CardViewKerajaanAdapter.CardViewViewHolder> {

    public CardViewKerajaanAdapter(Context context) {

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
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_kerajaan, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder cardViewViewHolder, final int i) {
        Kerajaan k = getListKerajaan().get(i);
        Glide.with(context)
                .load(k.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(cardViewViewHolder.imgPhoto);
        cardViewViewHolder.tvName.setText(k.getName());
        cardViewViewHolder.tvRemarks.setText(k.getRemarks());

        cardViewViewHolder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Favorite "+getListKerajaan().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));

        cardViewViewHolder.btnShare.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Share "+getListKerajaan().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));

        cardViewViewHolder.detail_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(context.getApplicationContext(), DetailListActivity.class);
                a.putExtra("name", getListKerajaan().get(i).getName());
                a.putExtra("deskrip",getListKerajaan().get(i).getDeskrip());
                a.putExtra("gambar",getListKerajaan().get(i).getPhoto());
                context.startActivity(a);
            }
        });

    }

    @Override
    public int getItemCount() {
        return getListKerajaan().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button btnFavorite, btnShare;
        CardView detail_list;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);
            detail_list = itemView.findViewById(R.id.card_view);
        }
    }
}
