package com.example.gor.showcase.Adapter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gor.showcase.Activity.ItemActivity;
import com.example.gor.showcase.Model.Offer;
import com.example.gor.showcase.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<Offer> mOffers;
    private ArrayList<String> mStrings = new ArrayList<>();


    public Adapter(ArrayList<Offer> offers) {
        this.mOffers= offers;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final Offer offer = mOffers.get(position);
        holder.offerName.setText(offer.getName());
        holder.offerDes.setText(offer.getDes());
        Picasso.get().load(offer.getLogo()).into(holder.logo);
        holder.go.setText(offer.getBtn());

        mStrings.add(offer.getLogo());
        mStrings.add(offer.getName());
        mStrings.add(offer.getDescFull());
        mStrings.add(offer.getBtn2());
        mStrings.add(offer.getUrl());

        final ArrayList<String> strings = mStrings;

        holder.go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ItemActivity.class);
                intent.putExtra("data", strings);
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mOffers.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        TextView offerName;
        TextView offerDes;
        ImageView logo;
        Button go;

        ViewHolder(View itemView) {
            super(itemView);

            offerName = itemView.findViewById(R.id.offerName);
            offerDes = itemView.findViewById(R.id.offerDes);
            logo = itemView.findViewById(R.id.logo);
            go = itemView.findViewById(R.id.go);
        }
    }
}
