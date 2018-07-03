package com.example.sadba.androidshimmertest.Retrofit;

import com.example.sadba.androidshimmertest.Model.Model;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface IMyApi {

    @GET("photos")
    Observable<List<Model>> getData();
}
