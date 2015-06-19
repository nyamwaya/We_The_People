package com.powermovesdev.alex.nobs.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.powermovesdev.alex.nobs.API.Models.Congress;
import com.powermovesdev.alex.nobs.API.Pojo.Bills;
import com.powermovesdev.alex.nobs.Fragments.BillsListFragment;
import com.powermovesdev.alex.nobs.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by alex on 6/12/15.
 */
public class BillsAdapter extends RecyclerView.Adapter<BillsAdapter.ViewHolder> {

    List<Congress.Result> congressList;
    public BillsListFragment context;
    private String TAG = getClass().getSimpleName();
    public Context cOntext;
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
        holder.SponserFN.setText(congress.sponsor.firstName);
        Log.v(TAG, "First Name" + congress.sponsor.firstName);



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


        public ViewHolder(View itemView) {
            super(itemView);

            SponserFN = (TextView) itemView.findViewById(R.id.person_name);

        }
    }
}