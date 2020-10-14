package com.example.songlisting.network;

import com.example.songlisting.model.SongsResponse;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {


    @POST("getFeaturedChannels")
    Call<SongsResponse> getSongList(@Body JsonObject jsonObject);

}
