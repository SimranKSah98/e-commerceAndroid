package com.example.myapplication;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;


public interface APIinterface {

    String BASE_URL = "https://api.androidhive.info/";
    @GET("json/glide.json")
    Call<List<Product>> getProd();
}
