package com.powermovesdev.alex.nobs.API.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 6/12/15.
 */
public class Bills {


    public class Results {

        @Expose
        public List<Result> results = new ArrayList<Result>();
        @Expose
        public int count;
        @Expose
        public Page page;

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
        public int getCount() {
            return count;
        }

        /**
         *
         * @param count
         * The count
         */
        public void setCount(int count) {
            this.count = count;
        }

        /**
         *
         * @return
         * The page
         */
        public Page getPage() {
            return page;
        }

        /**
         *
         * @param page
         * The page
         */
        public void setPage(Page page) {
            this.page = page;
        }

    }

    public class History {

        @Expose
        public boolean active;
        @SerializedName("awaiting_signature")
        @Expose
        public boolean awaitingSignature;
        @Expose
        public boolean enacted;
        @Expose
        public boolean vetoed;

        /**
         *
         * @return
         * The active
         */
        public boolean isActive() {
            return active;
        }

        /**
         *
         * @param active
         * The active
         */
        public void setActive(boolean active) {
            this.active = active;
        }

        /**
         *
         * @return
         * The awaitingSignature
         */
        public boolean isAwaitingSignature() {
            return awaitingSignature;
        }

        /**
         *
         * @param awaitingSignature
         * The awaiting_signature
         */
        public void setAwaitingSignature(boolean awaitingSignature) {
            this.awaitingSignature = awaitingSignature;
        }

        /**
         *
         * @return
         * The enacted
         */
        public boolean isEnacted() {
            return enacted;
        }

        /**
         *
         * @param enacted
         * The enacted
         */
        public void setEnacted(boolean enacted) {
            this.enacted = enacted;
        }

        /**
         *
         * @return
         * The vetoed
         */
        public boolean isVetoed() {
            return vetoed;
        }

        /**
         *
         * @param vetoed
         * The vetoed
         */
        public void setVetoed(boolean vetoed) {
            this.vetoed = vetoed;
        }

    }

    public class Page {

        @Expose
        public int count;
        @SerializedName("per_page")
        @Expose
        public int perPage;
        @Expose
        public int page;

        /**
         *
         * @return
         * The count
         */
        public int getCount() {
            return count;
        }

        /**
         *
         * @param count
         * The count
         */
        public void setCount(int count) {
            this.count = count;
        }

        /**
         *
         * @return
         * The perPage
         */
        public int getPerPage() {
            return perPage;
        }

        /**
         *
         * @param perPage
         * The per_page
         */
        public void setPerPage(int perPage) {
            this.perPage = perPage;
        }

        /**
         *
         * @return
         * The page
         */
        public int getPage() {
            return page;
        }

        /**
         *
         * @param page
         * The page
         */
        public void setPage(int page) {
            this.page = page;
        }

    }

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
        public int congress;
        @SerializedName("cosponsors_count")
        @Expose
        public int cosponsorsCount;
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
        public int number;
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
        public int withdrawnCosponsorsCount;

        /**
         *
         * @return
         * The billId
         */
        public String getBillId() {
            return billId;
        }

        /**
         *
         * @param billId
         * The bill_id
         */
        public void setBillId(String billId) {
            this.billId = billId;
        }

        /**
         *
         * @return
         * The billType
         */
        public String getBillType() {
            return billType;
        }

        /**
         *
         * @param billType
         * The bill_type
         */
        public void setBillType(String billType) {
            this.billType = billType;
        }

        /**
         *
         * @return
         * The chamber
         */
        public String getChamber() {
            return chamber;
        }

        /**
         *
         * @param chamber
         * The chamber
         */
        public void setChamber(String chamber) {
            this.chamber = chamber;
        }

        /**
         *
         * @return
         * The committeeIds
         */
        public List<String> getCommitteeIds() {
            return committeeIds;
        }

        /**
         *
         * @param committeeIds
         * The committee_ids
         */
        public void setCommitteeIds(List<String> committeeIds) {
            this.committeeIds = committeeIds;
        }

        /**
         *
         * @return
         * The congress
         */
        public int getCongress() {
            return congress;
        }

        /**
         *
         * @param congress
         * The congress
         */
        public void setCongress(int congress) {
            this.congress = congress;
        }

        /**
         *
         * @return
         * The cosponsorsCount
         */
        public int getCosponsorsCount() {
            return cosponsorsCount;
        }

        /**
         *
         * @param cosponsorsCount
         * The cosponsors_count
         */
        public void setCosponsorsCount(int cosponsorsCount) {
            this.cosponsorsCount = cosponsorsCount;
        }

        /**
         *
         * @return
         * The enactedAs
         */
        public Object getEnactedAs() {
            return enactedAs;
        }

        /**
         *
         * @param enactedAs
         * The enacted_as
         */
        public void setEnactedAs(Object enactedAs) {
            this.enactedAs = enactedAs;
        }

        /**
         *
         * @return
         * The history
         */
        public History getHistory() {
            return history;
        }

        /**
         *
         * @param history
         * The history
         */
        public void setHistory(History history) {
            this.history = history;
        }

        /**
         *
         * @return
         * The introducedOn
         */
        public String getIntroducedOn() {
            return introducedOn;
        }

        /**
         *
         * @param introducedOn
         * The introduced_on
         */
        public void setIntroducedOn(String introducedOn) {
            this.introducedOn = introducedOn;
        }

        /**
         *
         * @return
         * The lastActionAt
         */
        public String getLastActionAt() {
            return lastActionAt;
        }

        /**
         *
         * @param lastActionAt
         * The last_action_at
         */
        public void setLastActionAt(String lastActionAt) {
            this.lastActionAt = lastActionAt;
        }

        /**
         *
         * @return
         * The lastVoteAt
         */
        public Object getLastVoteAt() {
            return lastVoteAt;
        }

        /**
         *
         * @param lastVoteAt
         * The last_vote_at
         */
        public void setLastVoteAt(Object lastVoteAt) {
            this.lastVoteAt = lastVoteAt;
        }

        /**
         *
         * @return
         * The number
         */
        public int getNumber() {
            return number;
        }

        /**
         *
         * @param number
         * The number
         */
        public void setNumber(int number) {
            this.number = number;
        }

        /**
         *
         * @return
         * The officialTitle
         */
        public String getOfficialTitle() {
            return officialTitle;
        }

        /**
         *
         * @param officialTitle
         * The official_title
         */
        public void setOfficialTitle(String officialTitle) {
            this.officialTitle = officialTitle;
        }

        /**
         *
         * @return
         * The popularTitle
         */
        public Object getPopularTitle() {
            return popularTitle;
        }

        /**
         *
         * @param popularTitle
         * The popular_title
         */
        public void setPopularTitle(Object popularTitle) {
            this.popularTitle = popularTitle;
        }

        /**
         *
         * @return
         * The relatedBillIds
         */
        public List<Object> getRelatedBillIds() {
            return relatedBillIds;
        }

        /**
         *
         * @param relatedBillIds
         * The related_bill_ids
         */
        public void setRelatedBillIds(List<Object> relatedBillIds) {
            this.relatedBillIds = relatedBillIds;
        }

        /**
         *
         * @return
         * The shortTitle
         */
        public Object getShortTitle() {
            return shortTitle;
        }

        /**
         *
         * @param shortTitle
         * The short_title
         */
        public void setShortTitle(Object shortTitle) {
            this.shortTitle = shortTitle;
        }

        /**
         *
         * @return
         * The sponsor
         */
        public Sponsor getSponsor() {
            return sponsor;
        }

        /**
         *
         * @param sponsor
         * The sponsor
         */
        public void setSponsor(Sponsor sponsor) {
            this.sponsor = sponsor;
        }

        /**
         *
         * @return
         * The sponsorId
         */
        public String getSponsorId() {
            return sponsorId;
        }

        /**
         *
         * @param sponsorId
         * The sponsor_id
         */
        public void setSponsorId(String sponsorId) {
            this.sponsorId = sponsorId;
        }

        /**
         *
         * @return
         * The urls
         */
        public Urls getUrls() {
            return urls;
        }

        /**
         *
         * @param urls
         * The urls
         */
        public void setUrls(Urls urls) {
            this.urls = urls;
        }

        /**
         *
         * @return
         * The withdrawnCosponsorsCount
         */
        public int getWithdrawnCosponsorsCount() {
            return withdrawnCosponsorsCount;
        }

        /**
         *
         * @param withdrawnCosponsorsCount
         * The withdrawn_cosponsors_count
         */
        public void setWithdrawnCosponsorsCount(int withdrawnCosponsorsCount) {
            this.withdrawnCosponsorsCount = withdrawnCosponsorsCount;
        }

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
        public Object middleName;
        @SerializedName("name_suffix")
        @Expose
        public Object nameSuffix;
        @Expose
        public Object nickname;
        @Expose
        public String title;

        /**
         *
         * @return
         * The firstName
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         *
         * @param firstName
         * The first_name
         */
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        /**
         *
         * @return
         * The lastName
         */
        public String getLastName() {
            return lastName;
        }

        /**
         *
         * @param lastName
         * The last_name
         */
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        /**
         *
         * @return
         * The middleName
         */
        public Object getMiddleName() {
            return middleName;
        }

        /**
         *
         * @param middleName
         * The middle_name
         */
        public void setMiddleName(Object middleName) {
            this.middleName = middleName;
        }

        /**
         *
         * @return
         * The nameSuffix
         */
        public Object getNameSuffix() {
            return nameSuffix;
        }

        /**
         *
         * @param nameSuffix
         * The name_suffix
         */
        public void setNameSuffix(Object nameSuffix) {
            this.nameSuffix = nameSuffix;
        }

        /**
         *
         * @return
         * The nickname
         */
        public Object getNickname() {
            return nickname;
        }

        /**
         *
         * @param nickname
         * The nickname
         */
        public void setNickname(Object nickname) {
            this.nickname = nickname;
        }

        /**
         *
         * @return
         * The title
         */
        public String getTitle() {
            return title;
        }

        /**
         *
         * @param title
         * The title
         */
        public void setTitle(String title) {
            this.title = title;
        }

    }

    public class Urls {

        @Expose
        public String congress;
        @Expose
        public String govtrack;
        @Expose
        public String opencongress;

        /**
         *
         * @return
         * The congress
         */
        public String getCongress() {
            return congress;
        }

        /**
         *
         * @param congress
         * The congress
         */
        public void setCongress(String congress) {
            this.congress = congress;
        }

        /**
         *
         * @return
         * The govtrack
         */
        public String getGovtrack() {
            return govtrack;
        }

        /**
         *
         * @param govtrack
         * The govtrack
         */
        public void setGovtrack(String govtrack) {
            this.govtrack = govtrack;
        }

        /**
         *
         * @return
         * The opencongress
         */
        public String getOpencongress() {
            return opencongress;
        }

        /**
         *
         * @param opencongress
         * The opencongress
         */
        public void setOpencongress(String opencongress) {
            this.opencongress = opencongress;
        }

    }
}
