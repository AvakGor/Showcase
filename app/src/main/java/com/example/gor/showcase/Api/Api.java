package com.example.gor.showcase.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {

    private static final String ROOT_URL = "http://sandytrast.info";

    private static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ShowcaseApi getApiService() {
        return getRetrofitInstance().create(ShowcaseApi.class);
    }

}
