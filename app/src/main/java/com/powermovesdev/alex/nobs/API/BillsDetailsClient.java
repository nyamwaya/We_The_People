package com.powermovesdev.alex.nobs.API;

import android.content.Intent;

import com.powermovesdev.alex.nobs.API.Models.Bill_Detail;
import com.powermovesdev.alex.nobs.BillsDetailActivity;

import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by aleckson on 6/21/15.
 */
public class BillsDetailsClient {

    public BillsDetailActivity context;
    public BillsApi mBillsApi;
    public static final String Gov_Tracker_Endpint = "https://www.govtrack.us/api/v2";

    public BillsDetailsClient(BillsDetailActivity context) {
        this.context = context;

        RestAdapter  restAdapter = new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(Gov_Tracker_Endpint)
                .build();
        mBillsApi = restAdapter.create(BillsApi.class);

    }


    public interface BillsApi {

        @GET("/bill/{billNumber}")
        rx.Observable<Bill_Detail> getDetails(
                @Path("billNumber") String billNumber);
    }

    public Observable<Bill_Detail> getBillDetails(String billNumber){

        return mBillsApi.getDetails(billNumber);

    }
}
