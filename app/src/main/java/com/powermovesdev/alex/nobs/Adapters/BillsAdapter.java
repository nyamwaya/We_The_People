package com.powermovesdev.alex.nobs.Adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.powermovesdev.alex.nobs.API.Models.Congress;
import com.powermovesdev.alex.nobs.BillsDetailActivity;
import com.powermovesdev.alex.nobs.Fragments.BillsListFragment;
import com.powermovesdev.alex.nobs.R;


import java.util.List;

/**
 * Created by alex on 6/12/15.
 */
public class BillsAdapter extends RecyclerView.Adapter<BillsAdapter.ViewHolder> {

    List<Congress.Result> congressList;

    public BillsListFragment context;
    private String TAG = getClass().getSimpleName();



    public String RepsPictures = "https://theunitedstates.io/images/congress/";


    public BillsAdapter(BillsListFragment context) {
        this.context = context;

    }

    public void setData(List<Congress.Result> congressList) {
        this.congressList = congressList;
    }

    @Override
    public BillsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int position) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bills_list, parent, false);

        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(BillsAdapter.ViewHolder holder, int position) {
        Congress.Result congress = congressList.get(position);
        holder.SponserFN.setText(congress.sponsor.firstName
                + " " + congress.sponsor.lastName
                + "(" + congress.sponsor.title + ")");



        //To see if data is being received
        Log.v(TAG, "First Name" + congress.sponsor.firstName);
        //A short description of the Bill
        holder.official_title.setText(congress.officialTitle);

        //On click listner  for the whole card
        holder.mView.setOnClickListener(view -> {
            Context context1 = view.getContext();

            Intent intent = new Intent(context1, BillsDetailActivity.class);
            intent.putExtra("id",congress.sponsorId);
            intent.putExtra("first_name",congress.sponsor.firstName);
            intent.putExtra("last_name",congress.sponsor.lastName);
            intent.putExtra("number", congress.number.toString());

           /* intent.putExtra(BillsDetailActivity.REP_NAME);*/

            context1.startActivity(intent);

        });


    }

    @Override
    public int getItemCount() {
        if (congressList != null) {
            Log.v(TAG, "getItemCount not null");
            return congressList.size();

        } else
            return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView SponserFN;
        TextView official_title;
        public final View mView;


        public ViewHolder(View itemView) {
            super(itemView);

            mView = itemView;
            SponserFN = (TextView) itemView.findViewById(R.id.person_name);
            official_title = (TextView) itemView.findViewById(R.id.official_title);


        }

    }

}