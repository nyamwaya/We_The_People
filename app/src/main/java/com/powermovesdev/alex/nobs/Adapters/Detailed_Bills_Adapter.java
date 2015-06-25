package com.powermovesdev.alex.nobs.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.powermovesdev.alex.nobs.API.Models.Bill_Detail;
import com.powermovesdev.alex.nobs.API.Models.Congress;
import com.powermovesdev.alex.nobs.BillsDetailActivity;
import com.powermovesdev.alex.nobs.Fragments.BillsListFragment;
import com.powermovesdev.alex.nobs.MainActivity;
import com.powermovesdev.alex.nobs.R;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by aleckson on 6/24/15.
 */
public class Detailed_Bills_Adapter extends RecyclerView.Adapter<Detailed_Bills_Adapter.ViewHolder> {
    List<Bill_Detail> bill_details;
    public final LayoutInflater mLayoutInflater;
    public final BillsDetailActivity context;


    public Detailed_Bills_Adapter(BillsDetailActivity context, List<Bill_Detail> bill_details) {
        mLayoutInflater = LayoutInflater.from(context);
        this.context = context;
        this.bill_details = bill_details;

    }


    @Override
    public Detailed_Bills_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.list_detail_bills, parent, false);

        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(Detailed_Bills_Adapter.ViewHolder holder, int position) {


        /*ForecastCondition forecastCondition = forecastConditions.get(position);
        holder.weather.setText(forecastCondition.condition);*/
        Bill_Detail bill_detail = bill_details.get(position);
        holder.title_info.setText(bill_detail.titleWithoutNumber);


    }

    @Override
    public int getItemCount() {
        return bill_details.size();
    }

    protected class ViewHolder extends RecyclerView.ViewHolder {

        public TextView title_info;


        public ViewHolder(View itemView) {
            super(itemView);

            title_info = (TextView) itemView.findViewById(R.id.title_info);


        }
    }
}
