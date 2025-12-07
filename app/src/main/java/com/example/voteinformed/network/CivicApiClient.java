package com.example.voteinformed.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CivicApiClient {

    private static Retrofit retrofit = null;

    private static final String BASE_URL = CivicApiService.BASE_URL;

    public static CivicApiService getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(CivicApiService.class);
    }
}