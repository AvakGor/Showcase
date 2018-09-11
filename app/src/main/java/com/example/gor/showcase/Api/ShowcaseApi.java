package com.example.gor.showcase.Api;

import com.example.gor.showcase.Model.OfferList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ShowcaseApi {
    @GET("/ins/?id=1")
    Call<OfferList> getMyJSON();
}
