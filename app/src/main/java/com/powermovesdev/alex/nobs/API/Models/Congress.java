package com.powermovesdev.alex.nobs.API.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.powermovesdev.alex.nobs.API.Pojo.Bills;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 6/12/15.
 */
public class Congress {
    @Expose
    public List<Result> results = new ArrayList<Result>();
    @Expose
    public Integer count;
//    @Expose
//    public Page page;

    /**
     *
     * @return
     * The results
     */
    public List<Result> getResults() {
        return results;
    }

    /**
     *
     * @param results
     * The results
     */
    public void setResults(List<Result> results) {
        this.results = results;
    }

    /**
     *
     * @return
     * The count
     */
    public Integer getCount() {
        return count;
    }

    /**
     *
     * @param count
     * The count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

//    /**
//     *
//     * @return
//     * The page
//     */
//    public Page getPage() {
//        return page;
//    }
//
//    /**
//     *
//     * @param page
//     * The page
//     */
//    public void setPage(Page page) {
//        this.page = page;
//    }

    public class Result {

        @SerializedName("bill_id")
        @Expose
        public String billId;
        @SerializedName("bill_type")
        @Expose
        public String billType;
        @Expose
        public String chamber;
        @SerializedName("committee_ids")
        @Expose
        public List<String> committeeIds = new ArrayList<String>();
        @Expose
        public Integer congress;
        @SerializedName("cosponsors_count")
        @Expose
        public Integer cosponsorsCount;
        @SerializedName("enacted_as")
        @Expose
        public Object enactedAs;
        @Expose
        public History history;
        @SerializedName("introduced_on")
        @Expose
        public String introducedOn;
        @SerializedName("last_action_at")
        @Expose
        public String lastActionAt;
        @SerializedName("last_vote_at")
        @Expose
        public Object lastVoteAt;
        @Expose
        public Integer number;
        @SerializedName("official_title")
        @Expose
        public String officialTitle;
        @SerializedName("popular_title")
        @Expose
        public Object popularTitle;
        @SerializedName("related_bill_ids")
        @Expose
        public List<Object> relatedBillIds = new ArrayList<Object>();
        @SerializedName("short_title")
        @Expose
        public Object shortTitle;
        @Expose
        public Sponsor sponsor;
        @SerializedName("sponsor_id")
        @Expose
        public String sponsorId;
        @Expose
        public Urls urls;
        @SerializedName("withdrawn_cosponsors_count")
        @Expose
        public Integer withdrawnCosponsorsCount;

    }

    public class History {

        @Expose
        public Boolean active;
        @SerializedName("awaiting_signature")
        @Expose
        public Boolean awaitingSignature;
        @Expose
        public Boolean enacted;
        @Expose
        public Boolean vetoed;

    }
    
    public class Sponsor {

        @SerializedName("first_name")
        @Expose
        public String firstName;
        @SerializedName("last_name")
        @Expose
        public String lastName;
        @SerializedName("middle_name")
        @Expose
        public String middleName;
        @SerializedName("name_suffix")
        @Expose
        public Object nameSuffix;
        @Expose
        public Object nickname;
        @Expose
        public String title;

    }

    public class Urls {

        @Expose
        public String congress;
        @Expose
        public String govtrack;
        @Expose
        public String opencongress;
    }

}
