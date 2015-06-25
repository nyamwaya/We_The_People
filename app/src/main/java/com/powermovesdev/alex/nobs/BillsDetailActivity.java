package com.powermovesdev.alex.nobs;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.powermovesdev.alex.nobs.API.BillsDetailsClient;
import com.powermovesdev.alex.nobs.API.Models.Bill_Detail;
import com.powermovesdev.alex.nobs.API.Models.Congress;
import com.powermovesdev.alex.nobs.Adapters.Detailed_Bills_Adapter;
import com.squareup.picasso.Picasso;

import java.util.List;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class BillsDetailActivity extends AppCompatActivity {


    public String BACK_DROP_URL = "https://theunitedstates.io/images/congress/";

    private String TAG = getClass().getSimpleName();

    public int position;
    public Detailed_Bills_Adapter mDetailedAdapter;
    public RecyclerView mRecyclerView;

    List<Bill_Detail> bill_details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bills_detail);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);


        returnBillsData();
        materialDesign();
        loadBackdrop();


    }

    public void returnBillsData(){

        String number = getIntent().getStringExtra("number");



            BillsDetailsClient billsDetailsClient = new BillsDetailsClient(this);
            Observable<Bill_Detail> billDetailObservable = billsDetailsClient.getBillDetails(number);

            billDetailObservable.observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.io())
                    .subscribe(bill_detail -> {
                        mDetailedAdapter = new Detailed_Bills_Adapter(this, bill_details);
                        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
                        mRecyclerView.setAdapter(mDetailedAdapter);

                        bill_detail = bill_details.get(position);
                        Log.v(TAG, "Getting current Data");

                    }, throwable -> {

                    });







    }



   /* public void displayData(List<Bill_Detail> bill_details, int position){
        TextView info_ = (TextView) findViewById(R.id.info_);

        info_.setText(bill_details.get(position).titleWithoutNumber);




    }*/

    public void materialDesign() {
        //String firstName = getIntent().getStringExtra("first_name");
        //String lastname = getIntent().getStringExtra("last_name");


        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        /*if (firstName != null && !firstName.equalsIgnoreCase("") || lastname != null && lastname.equalsIgnoreCase("")) {

            collapsingToolbar.setTitle(firstName + "" + lastname);

        }*/


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bills_detail, menu);
        return true;
    }

    public void loadBackdrop() {

        String photoId = getIntent().getStringExtra("id");
        if (photoId != null && !photoId.equalsIgnoreCase("")) {
            final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
            Picasso.with(this)
                    .load(BACK_DROP_URL + "225x275/" + photoId + ".jpg")
                    .into(imageView);
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
