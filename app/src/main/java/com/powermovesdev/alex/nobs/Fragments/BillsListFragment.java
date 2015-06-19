package com.powermovesdev.alex.nobs.Fragments;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.powermovesdev.alex.nobs.API.CongressClient;
import com.powermovesdev.alex.nobs.API.Models.Congress;
import com.powermovesdev.alex.nobs.API.Pojo.Bills;
import com.powermovesdev.alex.nobs.Adapters.BillsAdapter;
import com.powermovesdev.alex.nobs.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by alex on 6/12/15.
 */
public class BillsListFragment extends Fragment {

    //  private Context context;
    List<Congress.Result> congressList;
    private BillsAdapter mBillsAdapter;
    private RecyclerView mRecyclerView;
    private String TAG = getClass().getSimpleName();
    public Context context;
    public int position;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRecyclerView = (RecyclerView) inflater.inflate(
                R.layout.fragment_bills_list, container, false);

        requestBills();

        return mRecyclerView;

    }

    private void setupRecyclerView(RecyclerView recyclerView) {
        mBillsAdapter = new BillsAdapter(this);
        mBillsAdapter.setData(congressList);
        recyclerView.setAdapter(mBillsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));


    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    private void requestBills() {

        CongressClient congressClient = new CongressClient(this);
        Observable<Congress> congressObservable = congressClient.getCongressAPI();

        congressObservable.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(congress -> {
                    Log.v(TAG, "Data Received");
                    congressList = congress.getResults();
                    setupRecyclerView(mRecyclerView);
                }, throwable -> {

                });


    }



}
