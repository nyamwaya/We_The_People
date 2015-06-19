package com.powermovesdev.alex.nobs.API;

import com.powermovesdev.alex.nobs.API.Models.Congress;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by alex on 6/12/15.
 */
public interface CongressAPI {


    @GET("/bills")
    Observable<Congress> getBills(
            @Query("apikey") String apikey);

    @GET("upcoming_bills")
    Observable getUpcomingBills(
            @Query("apikey") String apikey);
}
