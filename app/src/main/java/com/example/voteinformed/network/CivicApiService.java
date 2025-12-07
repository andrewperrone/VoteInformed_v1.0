package com.example.voteinformed.network;

import com.example.voteinformed.model.CivicElectionResponse;
import com.example.voteinformed.model.VoterInfoResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CivicApiService {

    String BASE_URL = "https://www.googleapis.com/civicinfo/v2/";


    @GET("elections")
    Call<CivicElectionResponse> getElections(
            @Query("key") String apiKey
    );

    @GET("voterinfo")
    Call<VoterInfoResponse> getVoterInfo(
            @Query("address") String address,
            @Query("electionId") String electionId, // Use "0" to return data for all supported elections
            @Query("officialOnly") boolean officialOnly,
            @Query("key") String apiKey
    );
}