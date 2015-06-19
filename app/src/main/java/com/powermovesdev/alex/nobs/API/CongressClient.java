package com.powermovesdev.alex.nobs.API;

import com.powermovesdev.alex.nobs.API.Models.Congress;
import com.powermovesdev.alex.nobs.Fragments.BillsListFragment;
import com.powermovesdev.alex.nobs.R;

import retrofit.RestAdapter;
import rx.Observable;

/**
 * Created by alex on 6/12/15.
 */
public class CongressClient {


    public BillsListFragment context;
    public CongressAPI mCongressAPI;
    public static final String SUNLIGHT_CONGRESS = "http://congress.api.sunlightfoundation.com";


    public CongressClient(BillsListFragment context) {
        this.context = context;

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(SUNLIGHT_CONGRESS)
                .build();
        mCongressAPI = restAdapter.create(CongressAPI.class);
        this.context = context;


    }
    public Observable<Congress> getCongressAPI(){

        String congressKey = context.getResources().getString(R.string.CongressKey);
        return mCongressAPI.getBills(congressKey);
    }
}
