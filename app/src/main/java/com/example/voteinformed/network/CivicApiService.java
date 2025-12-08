package com.example.voteinformed.network;

import com.example.voteinformed.model.CivicElectionResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CivicApiService {

    String BASE_URL = "https://www.googleapis.com/civicinfo/v2/";


    @GET("elections")
    Call<CivicElectionResponse> getElections(
            @Query("key") String apiKey
    );

}