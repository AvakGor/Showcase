package com.example.gor.showcase.Activity;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.gor.showcase.Adapter.Adapter;
import com.example.gor.showcase.Api.Api;
import com.example.gor.showcase.Model.Offer;
import com.example.gor.showcase.Model.OfferList;
import com.example.gor.showcase.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ShowcaseActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerView.Adapter mAdapter;
    ArrayList<Offer> mOffers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showcase);

        mOffers = new ArrayList<>();
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        Api.getApiService().getMyJSON().enqueue(new Callback<OfferList>() {
            @Override
            public void onResponse(@NonNull Call<OfferList> call, @NonNull Response<OfferList> response) {
                assert response.body() != null;
                mOffers = (ArrayList<Offer>) response.body().getOffers();
                mAdapter = new Adapter(mOffers);
                mRecyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(@NonNull Call<OfferList> call, @NonNull Throwable t) {
                Toast.makeText(ShowcaseActivity.this, t.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
