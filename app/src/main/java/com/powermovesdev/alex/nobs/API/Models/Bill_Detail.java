package com.powermovesdev.alex.nobs.API.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aleckson on 6/21/15.
 */
public class Bill_Detail {



        @SerializedName("bill_resolution_type")
        @Expose
        public String billResolutionType;
        @SerializedName("bill_type")
        @Expose
        public String billType;
        @SerializedName("bill_type_label")
        @Expose
        public String billTypeLabel;
        @Expose
        public List<Committee> committees = new ArrayList<Committee>();
        @Expose
        public Integer congress;
        @Expose
        public List<Cosponsor> cosponsors = new ArrayList<Cosponsor>();
        @SerializedName("current_status")
        @Expose
        public String currentStatus;
        @SerializedName("current_status_date")
        @Expose
        public String currentStatusDate;
        @SerializedName("current_status_description")
        @Expose
        public String currentStatusDescription;
        @SerializedName("current_status_label")
        @Expose
        public String currentStatusLabel;
        @SerializedName("display_number")
        @Expose
        public String displayNumber;
        @SerializedName("docs_house_gov_postdate")
        @Expose
        public Object docsHouseGovPostdate;
        @Expose
        public Integer id;
        @SerializedName("introduced_date")
        @Expose
        public String introducedDate;
        @SerializedName("is_alive")
        @Expose
        public Boolean isAlive;
        @SerializedName("is_current")
        @Expose
        public Boolean isCurrent;
        @Expose
        public String link;
        @SerializedName("lock_title")
        @Expose
        public Boolean lockTitle;
        @SerializedName("major_actions")
        @Expose
        public List<List<String>> majorActions = new ArrayList<List<String>>();
        @Expose
        public String noun;
        @Expose
        public Integer number;
        @SerializedName("senate_floor_schedule_postdate")
        @Expose
        public Object senateFloorSchedulePostdate;
        @Expose
        public Object sliplawnum;
        @Expose
        public Object sliplawpubpriv;
        @Expose
        public String source;
        @SerializedName("source_link")
        @Expose
        public Object sourceLink;
        @Expose
        public Sponsor sponsor;
        @SerializedName("sponsor_role")
        @Expose
        public SponsorRole sponsorRole;
        @Expose
        public List<Term> terms = new ArrayList<Term>();
        @SerializedName("thomas_link")
        @Expose
        public String thomasLink;
        @Expose
        public String title;
        @SerializedName("title_without_number")
        @Expose
        public String titleWithoutNumber;
        @Expose
        public List<List<String>> titles = new ArrayList<List<String>>();

        /**
         * @return The billResolutionType
         */
        public String getBillResolutionType() {
            return billResolutionType;
        }

        /**
         * @param billResolutionType The bill_resolution_type
         */
        public void setBillResolutionType(String billResolutionType) {
            this.billResolutionType = billResolutionType;
        }

        /**
         * @return The billType
         */
        public String getBillType() {
            return billType;
        }

        /**
         * @param billType The bill_type
         */
        public void setBillType(String billType) {
            this.billType = billType;
        }

        /**
         * @return The billTypeLabel
         */
        public String getBillTypeLabel() {
            return billTypeLabel;
        }

        /**
         * @param billTypeLabel The bill_type_label
         */
        public void setBillTypeLabel(String billTypeLabel) {
            this.billTypeLabel = billTypeLabel;
        }

        /**
         * @return The committees
         */
        public List<Committee> getCommittees() {
            return committees;
        }

        /**
         * @param committees The committees
         */
        public void setCommittees(List<Committee> committees) {
            this.committees = committees;
        }

        /**
         * @return The congress
         */
        public Integer getCongress() {
            return congress;
        }

        /**
         * @param congress The congress
         */
        public void setCongress(Integer congress) {
            this.congress = congress;
        }

        /**
         * @return The cosponsors
         */
        public List<Cosponsor> getCosponsors() {
            return cosponsors;
        }

        /**
         * @param cosponsors The cosponsors
         */
        public void setCosponsors(List<Cosponsor> cosponsors) {
            this.cosponsors = cosponsors;
        }

        /**
         * @return The currentStatus
         */
        public String getCurrentStatus() {
            return currentStatus;
        }

        /**
         * @param currentStatus The current_status
         */
        public void setCurrentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
        }

        /**
         * @return The currentStatusDate
         */
        public String getCurrentStatusDate() {
            return currentStatusDate;
        }

        /**
         * @param currentStatusDate The current_status_date
         */
        public void setCurrentStatusDate(String currentStatusDate) {
            this.currentStatusDate = currentStatusDate;
        }

        /**
         * @return The currentStatusDescription
         */
        public String getCurrentStatusDescription() {
            return currentStatusDescription;
        }

        /**
         * @param currentStatusDescription The current_status_description
         */
        public void setCurrentStatusDescription(String currentStatusDescription) {
            this.currentStatusDescription = currentStatusDescription;
        }

        /**
         * @return The currentStatusLabel
         */
        public String getCurrentStatusLabel() {
            return currentStatusLabel;
        }

        /**
         * @param currentStatusLabel The current_status_label
         */
        public void setCurrentStatusLabel(String currentStatusLabel) {
            this.currentStatusLabel = currentStatusLabel;
        }

        /**
         * @return The displayNumber
         */
        public String getDisplayNumber() {
            return displayNumber;
        }

        /**
         * @param displayNumber The display_number
         */
        public void setDisplayNumber(String displayNumber) {
            this.displayNumber = displayNumber;
        }

        /**
         * @return The docsHouseGovPostdate
         */
        public Object getDocsHouseGovPostdate() {
            return docsHouseGovPostdate;
        }

        /**
         * @param docsHouseGovPostdate The docs_house_gov_postdate
         */
        public void setDocsHouseGovPostdate(Object docsHouseGovPostdate) {
            this.docsHouseGovPostdate = docsHouseGovPostdate;
        }

        /**
         * @return The id
         */
        public Integer getId() {
            return id;
        }

        /**
         * @param id The id
         */
        public void setId(Integer id) {
            this.id = id;
        }

        /**
         * @return The introducedDate
         */
        public String getIntroducedDate() {
            return introducedDate;
        }

        /**
         * @param introducedDate The introduced_date
         */
        public void setIntroducedDate(String introducedDate) {
            this.introducedDate = introducedDate;
        }

        /**
         * @return The isAlive
         */
        public Boolean getIsAlive() {
            return isAlive;
        }

        /**
         * @param isAlive The is_alive
         */
        public void setIsAlive(Boolean isAlive) {
            this.isAlive = isAlive;
        }

        /**
         * @return The isCurrent
         */
        public Boolean getIsCurrent() {
            return isCurrent;
        }

        /**
         * @param isCurrent The is_current
         */
        public void setIsCurrent(Boolean isCurrent) {
            this.isCurrent = isCurrent;
        }

        /**
         * @return The link
         */
        public String getLink() {
            return link;
        }

        /**
         * @param link The link
         */
        public void setLink(String link) {
            this.link = link;
        }

        /**
         * @return The lockTitle
         */
        public Boolean getLockTitle() {
            return lockTitle;
        }

        /**
         * @param lockTitle The lock_title
         */
        public void setLockTitle(Boolean lockTitle) {
            this.lockTitle = lockTitle;
        }

        /**
         * @return The majorActions
         */
        public List<List<String>> getMajorActions() {
            return majorActions;
        }

        /**
         * @param majorActions The major_actions
         */
        public void setMajorActions(List<List<String>> majorActions) {
            this.majorActions = majorActions;
        }

        /**
         * @return The noun
         */
        public String getNoun() {
            return noun;
        }

        /**
         * @param noun The noun
         */
        public void setNoun(String noun) {
            this.noun = noun;
        }

        /**
         * @return The number
         */
        public Integer getNumber() {
            return number;
        }

        /**
         * @param number The number
         */
        public void setNumber(Integer number) {
            this.number = number;
        }

        /**
         * @return The senateFloorSchedulePostdate
         */
        public Object getSenateFloorSchedulePostdate() {
            return senateFloorSchedulePostdate;
        }

        /**
         * @param senateFloorSchedulePostdate The senate_floor_schedule_postdate
         */
        public void setSenateFloorSchedulePostdate(Object senateFloorSchedulePostdate) {
            this.senateFloorSchedulePostdate = senateFloorSchedulePostdate;
        }

        /**
         * @return The sliplawnum
         */
        public Object getSliplawnum() {
            return sliplawnum;
        }

        /**
         * @param sliplawnum The sliplawnum
         */
        public void setSliplawnum(Object sliplawnum) {
            this.sliplawnum = sliplawnum;
        }

        /**
         * @return The sliplawpubpriv
         */
        public Object getSliplawpubpriv() {
            return sliplawpubpriv;
        }

        /**
         * @param sliplawpubpriv The sliplawpubpriv
         */
        public void setSliplawpubpriv(Object sliplawpubpriv) {
            this.sliplawpubpriv = sliplawpubpriv;
        }

        /**
         * @return The source
         */
        public String getSource() {
            return source;
        }

        /**
         * @param source The source
         */
        public void setSource(String source) {
            this.source = source;
        }

        /**
         * @return The sourceLink
         */
        public Object getSourceLink() {
            return sourceLink;
        }

        /**
         * @param sourceLink The source_link
         */
        public void setSourceLink(Object sourceLink) {
            this.sourceLink = sourceLink;
        }

        /**
         * @return The sponsor
         */
        public Sponsor getSponsor() {
            return sponsor;
        }

        /**
         * @param sponsor The sponsor
         */
        public void setSponsor(Sponsor sponsor) {
            this.sponsor = sponsor;
        }

        /**
         * @return The sponsorRole
         */
        public SponsorRole getSponsorRole() {
            return sponsorRole;
        }

        /**
         * @param sponsorRole The sponsor_role
         */
        public void setSponsorRole(SponsorRole sponsorRole) {
            this.sponsorRole = sponsorRole;
        }

        /**
         * @return The terms
         */
        public List<Term> getTerms() {
            return terms;
        }

        /**
         * @param terms The terms
         */
        public void setTerms(List<Term> terms) {
            this.terms = terms;
        }

        /**
         * @return The thomasLink
         */
        public String getThomasLink() {
            return thomasLink;
        }

        /**
         * @param thomasLink The thomas_link
         */
        public void setThomasLink(String thomasLink) {
            this.thomasLink = thomasLink;
        }

        /**
         * @return The title
         */
        public String getTitle() {
            return title;
        }

        /**
         * @param title The title
         */
        public void setTitle(String title) {
            this.title = title;
        }

        /**
         * @return The titleWithoutNumber
         */
        public String getTitleWithoutNumber() {
            return titleWithoutNumber;
        }

        /**
         * @param titleWithoutNumber The title_without_number
         */
        public void setTitleWithoutNumber(String titleWithoutNumber) {
            this.titleWithoutNumber = titleWithoutNumber;
        }

        /**
         * @return The titles
         */
        public List<List<String>> getTitles() {
            return titles;
        }

        /**
         * @param titles The titles
         */
        public void setTitles(List<List<String>> titles) {
            this.titles = titles;
        }



    public class Committee {

        @Expose
        public String abbrev;
        @Expose
        public String code;
        @Expose
        public Object committee;
        @SerializedName("committee_type")
        @Expose
        public String committeeType;
        @SerializedName("committee_type_label")
        @Expose
        public String committeeTypeLabel;
        @Expose
        public Integer id;
        @Expose
        public String jurisdiction;
        @SerializedName("jurisdiction_link")
        @Expose
        public String jurisdictionLink;
        @Expose
        public String name;
        @Expose
        public Boolean obsolete;
        @Expose
        public String url;

        /**
         * @return The abbrev
         */
        public String getAbbrev() {
            return abbrev;
        }

        /**
         * @param abbrev The abbrev
         */
        public void setAbbrev(String abbrev) {
            this.abbrev = abbrev;
        }

        /**
         * @return The code
         */
        public String getCode() {
            return code;
        }

        /**
         * @param code The code
         */
        public void setCode(String code) {
            this.code = code;
        }

        /**
         * @return The committee
         */
        public Object getCommittee() {
            return committee;
        }

        /**
         * @param committee The committee
         */
        public void setCommittee(Object committee) {
            this.committee = committee;
        }

        /**
         * @return The committeeType
         */
        public String getCommitteeType() {
            return committeeType;
        }

        /**
         * @param committeeType The committee_type
         */
        public void setCommitteeType(String committeeType) {
            this.committeeType = committeeType;
        }

        /**
         * @return The committeeTypeLabel
         */
        public String getCommitteeTypeLabel() {
            return committeeTypeLabel;
        }

        /**
         * @param committeeTypeLabel The committee_type_label
         */
        public void setCommitteeTypeLabel(String committeeTypeLabel) {
            this.committeeTypeLabel = committeeTypeLabel;
        }

        /**
         * @return The id
         */
        public Integer getId() {
            return id;
        }

        /**
         * @param id The id
         */
        public void setId(Integer id) {
            this.id = id;
        }

        /**
         * @return The jurisdiction
         */
        public String getJurisdiction() {
            return jurisdiction;
        }

        /**
         * @param jurisdiction The jurisdiction
         */
        public void setJurisdiction(String jurisdiction) {
            this.jurisdiction = jurisdiction;
        }

        /**
         * @return The jurisdictionLink
         */
        public String getJurisdictionLink() {
            return jurisdictionLink;
        }

        /**
         * @param jurisdictionLink The jurisdiction_link
         */
        public void setJurisdictionLink(String jurisdictionLink) {
            this.jurisdictionLink = jurisdictionLink;
        }

        /**
         * @return The name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @return The obsolete
         */
        public Boolean getObsolete() {
            return obsolete;
        }

        /**
         * @param obsolete The obsolete
         */
        public void setObsolete(Boolean obsolete) {
            this.obsolete = obsolete;
        }

        /**
         * @return The url
         */
        public String getUrl() {
            return url;
        }

        /**
         * @param url The url
         */
        public void setUrl(String url) {
            this.url = url;
        }

    }

    public class Cosponsor {

        @Expose
        public String bioguideid;
        @Expose
        public String birthday;
        @Expose
        public Integer cspanid;
        @Expose
        public String firstname;
        @Expose
        public String gender;
        @SerializedName("gender_label")
        @Expose
        public String genderLabel;
        @Expose
        public Integer id;
        @Expose
        public String lastname;
        @Expose
        public String link;
        @Expose
        public String middlename;
        @Expose
        public String name;
        @Expose
        public String namemod;
        @Expose
        public String nickname;
        @Expose
        public String osid;
        @Expose
        public String pvsid;
        @Expose
        public String sortname;
        @Expose
        public String twitterid;
        @Expose
        public String youtubeid;

        /**
         * @return The bioguideid
         */
        public String getBioguideid() {
            return bioguideid;
        }

        /**
         * @param bioguideid The bioguideid
         */
        public void setBioguideid(String bioguideid) {
            this.bioguideid = bioguideid;
        }

        /**
         * @return The birthday
         */
        public String getBirthday() {
            return birthday;
        }

        /**
         * @param birthday The birthday
         */
        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        /**
         * @return The cspanid
         */
        public Integer getCspanid() {
            return cspanid;
        }

        /**
         * @param cspanid The cspanid
         */
        public void setCspanid(Integer cspanid) {
            this.cspanid = cspanid;
        }

        /**
         * @return The firstname
         */
        public String getFirstname() {
            return firstname;
        }

        /**
         * @param firstname The firstname
         */
        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        /**
         * @return The gender
         */
        public String getGender() {
            return gender;
        }

        /**
         * @param gender The gender
         */
        public void setGender(String gender) {
            this.gender = gender;
        }

        /**
         * @return The genderLabel
         */
        public String getGenderLabel() {
            return genderLabel;
        }

        /**
         * @param genderLabel The gender_label
         */
        public void setGenderLabel(String genderLabel) {
            this.genderLabel = genderLabel;
        }

        /**
         * @return The id
         */
        public Integer getId() {
            return id;
        }

        /**
         * @param id The id
         */
        public void setId(Integer id) {
            this.id = id;
        }

        /**
         * @return The lastname
         */
        public String getLastname() {
            return lastname;
        }

        /**
         * @param lastname The lastname
         */
        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        /**
         * @return The link
         */
        public String getLink() {
            return link;
        }

        /**
         * @param link The link
         */
        public void setLink(String link) {
            this.link = link;
        }

        /**
         * @return The middlename
         */
        public String getMiddlename() {
            return middlename;
        }

        /**
         * @param middlename The middlename
         */
        public void setMiddlename(String middlename) {
            this.middlename = middlename;
        }

        /**
         * @return The name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @return The namemod
         */
        public String getNamemod() {
            return namemod;
        }

        /**
         * @param namemod The namemod
         */
        public void setNamemod(String namemod) {
            this.namemod = namemod;
        }

        /**
         * @return The nickname
         */
        public String getNickname() {
            return nickname;
        }

        /**
         * @param nickname The nickname
         */
        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        /**
         * @return The osid
         */
        public String getOsid() {
            return osid;
        }

        /**
         * @param osid The osid
         */
        public void setOsid(String osid) {
            this.osid = osid;
        }

        /**
         * @return The pvsid
         */
        public String getPvsid() {
            return pvsid;
        }

        /**
         * @param pvsid The pvsid
         */
        public void setPvsid(String pvsid) {
            this.pvsid = pvsid;
        }

        /**
         * @return The sortname
         */
        public String getSortname() {
            return sortname;
        }

        /**
         * @param sortname The sortname
         */
        public void setSortname(String sortname) {
            this.sortname = sortname;
        }

        /**
         * @return The twitterid
         */
        public String getTwitterid() {
            return twitterid;
        }

        /**
         * @param twitterid The twitterid
         */
        public void setTwitterid(String twitterid) {
            this.twitterid = twitterid;
        }

        /**
         * @return The youtubeid
         */
        public String getYoutubeid() {
            return youtubeid;
        }

        /**
         * @param youtubeid The youtubeid
         */
        public void setYoutubeid(String youtubeid) {
            this.youtubeid = youtubeid;
        }

    }



    public class Sponsor {

        @Expose
        public String bioguideid;
        @Expose
        public String birthday;
        @Expose
        public Integer cspanid;
        @Expose
        public String firstname;
        @Expose
        public String gender;
        @SerializedName("gender_label")
        @Expose
        public String genderLabel;
        @Expose
        public Integer id;
        @Expose
        public String lastname;
        @Expose
        public String link;
        @Expose
        public String middlename;
        @Expose
        public String name;
        @Expose
        public String namemod;
        @Expose
        public String nickname;
        @Expose
        public String osid;
        @Expose
        public String pvsid;
        @Expose
        public String sortname;
        @Expose
        public Object twitterid;
        @Expose
        public Object youtubeid;

        /**
         * @return The bioguideid
         */
        public String getBioguideid() {
            return bioguideid;
        }

        /**
         * @param bioguideid The bioguideid
         */
        public void setBioguideid(String bioguideid) {
            this.bioguideid = bioguideid;
        }

        /**
         * @return The birthday
         */
        public String getBirthday() {
            return birthday;
        }

        /**
         * @param birthday The birthday
         */
        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        /**
         * @return The cspanid
         */
        public Integer getCspanid() {
            return cspanid;
        }

        /**
         * @param cspanid The cspanid
         */
        public void setCspanid(Integer cspanid) {
            this.cspanid = cspanid;
        }

        /**
         * @return The firstname
         */
        public String getFirstname() {
            return firstname;
        }

        /**
         * @param firstname The firstname
         */
        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        /**
         * @return The gender
         */
        public String getGender() {
            return gender;
        }

        /**
         * @param gender The gender
         */
        public void setGender(String gender) {
            this.gender = gender;
        }

        /**
         * @return The genderLabel
         */
        public String getGenderLabel() {
            return genderLabel;
        }

        /**
         * @param genderLabel The gender_label
         */
        public void setGenderLabel(String genderLabel) {
            this.genderLabel = genderLabel;
        }

        /**
         * @return The id
         */
        public Integer getId() {
            return id;
        }

        /**
         * @param id The id
         */
        public void setId(Integer id) {
            this.id = id;
        }

        /**
         * @return The lastname
         */
        public String getLastname() {
            return lastname;
        }

        /**
         * @param lastname The lastname
         */
        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        /**
         * @return The link
         */
        public String getLink() {
            return link;
        }

        /**
         * @param link The link
         */
        public void setLink(String link) {
            this.link = link;
        }

        /**
         * @return The middlename
         */
        public String getMiddlename() {
            return middlename;
        }

        /**
         * @param middlename The middlename
         */
        public void setMiddlename(String middlename) {
            this.middlename = middlename;
        }

        /**
         * @return The name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @return The namemod
         */
        public String getNamemod() {
            return namemod;
        }

        /**
         * @param namemod The namemod
         */
        public void setNamemod(String namemod) {
            this.namemod = namemod;
        }

        /**
         * @return The nickname
         */
        public String getNickname() {
            return nickname;
        }

        /**
         * @param nickname The nickname
         */
        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        /**
         * @return The osid
         */
        public String getOsid() {
            return osid;
        }

        /**
         * @param osid The osid
         */
        public void setOsid(String osid) {
            this.osid = osid;
        }

        /**
         * @return The pvsid
         */
        public String getPvsid() {
            return pvsid;
        }

        /**
         * @param pvsid The pvsid
         */
        public void setPvsid(String pvsid) {
            this.pvsid = pvsid;
        }

        /**
         * @return The sortname
         */
        public String getSortname() {
            return sortname;
        }

        /**
         * @param sortname The sortname
         */
        public void setSortname(String sortname) {
            this.sortname = sortname;
        }

        /**
         * @return The twitterid
         */
        public Object getTwitterid() {
            return twitterid;
        }

        /**
         * @param twitterid The twitterid
         */
        public void setTwitterid(Object twitterid) {
            this.twitterid = twitterid;
        }

        /**
         * @return The youtubeid
         */
        public Object getYoutubeid() {
            return youtubeid;
        }

        /**
         * @param youtubeid The youtubeid
         */
        public void setYoutubeid(Object youtubeid) {
            this.youtubeid = youtubeid;
        }

    }

    public class SponsorRole {

        @Expose
        public Object caucus;
        @SerializedName("congress_numbers")
        @Expose
        public List<Integer> congressNumbers = new ArrayList<Integer>();
        @Expose
        public Boolean current;
        @Expose
        public String description;
        @Expose
        public Integer district;
        @Expose
        public String enddate;
        @Expose
        public Integer id;
        @SerializedName("leadership_title")
        @Expose
        public Object leadershipTitle;
        @Expose
        public String party;
        @Expose
        public Integer person;
        @Expose
        public Object phone;
        @SerializedName("role_type")
        @Expose
        public String roleType;
        @SerializedName("role_type_label")
        @Expose
        public String roleTypeLabel;
        @SerializedName("senator_class")
        @Expose
        public Object senatorClass;
        @SerializedName("senator_rank")
        @Expose
        public Object senatorRank;
        @Expose
        public String startdate;
        @Expose
        public String state;
        @Expose
        public String title;
        @SerializedName("title_long")
        @Expose
        public String titleLong;
        @Expose
        public String website;

        /**
         * @return The caucus
         */
        public Object getCaucus() {
            return caucus;
        }

        /**
         * @param caucus The caucus
         */
        public void setCaucus(Object caucus) {
            this.caucus = caucus;
        }

        /**
         * @return The congressNumbers
         */
        public List<Integer> getCongressNumbers() {
            return congressNumbers;
        }

        /**
         * @param congressNumbers The congress_numbers
         */
        public void setCongressNumbers(List<Integer> congressNumbers) {
            this.congressNumbers = congressNumbers;
        }

        /**
         * @return The current
         */
        public Boolean getCurrent() {
            return current;
        }

        /**
         * @param current The current
         */
        public void setCurrent(Boolean current) {
            this.current = current;
        }

        /**
         * @return The description
         */
        public String getDescription() {
            return description;
        }

        /**
         * @param description The description
         */
        public void setDescription(String description) {
            this.description = description;
        }

        /**
         * @return The district
         */
        public Integer getDistrict() {
            return district;
        }

        /**
         * @param district The district
         */
        public void setDistrict(Integer district) {
            this.district = district;
        }

        /**
         * @return The enddate
         */
        public String getEnddate() {
            return enddate;
        }

        /**
         * @param enddate The enddate
         */
        public void setEnddate(String enddate) {
            this.enddate = enddate;
        }

        /**
         * @return The id
         */
        public Integer getId() {
            return id;
        }

        /**
         * @param id The id
         */
        public void setId(Integer id) {
            this.id = id;
        }

        /**
         * @return The leadershipTitle
         */
        public Object getLeadershipTitle() {
            return leadershipTitle;
        }

        /**
         * @param leadershipTitle The leadership_title
         */
        public void setLeadershipTitle(Object leadershipTitle) {
            this.leadershipTitle = leadershipTitle;
        }

        /**
         * @return The party
         */
        public String getParty() {
            return party;
        }

        /**
         * @param party The party
         */
        public void setParty(String party) {
            this.party = party;
        }

        /**
         * @return The person
         */
        public Integer getPerson() {
            return person;
        }

        /**
         * @param person The person
         */
        public void setPerson(Integer person) {
            this.person = person;
        }

        /**
         * @return The phone
         */
        public Object getPhone() {
            return phone;
        }

        /**
         * @param phone The phone
         */
        public void setPhone(Object phone) {
            this.phone = phone;
        }

        /**
         * @return The roleType
         */
        public String getRoleType() {
            return roleType;
        }

        /**
         * @param roleType The role_type
         */
        public void setRoleType(String roleType) {
            this.roleType = roleType;
        }

        /**
         * @return The roleTypeLabel
         */
        public String getRoleTypeLabel() {
            return roleTypeLabel;
        }

        /**
         * @param roleTypeLabel The role_type_label
         */
        public void setRoleTypeLabel(String roleTypeLabel) {
            this.roleTypeLabel = roleTypeLabel;
        }

        /**
         * @return The senatorClass
         */
        public Object getSenatorClass() {
            return senatorClass;
        }

        /**
         * @param senatorClass The senator_class
         */
        public void setSenatorClass(Object senatorClass) {
            this.senatorClass = senatorClass;
        }

        /**
         * @return The senatorRank
         */
        public Object getSenatorRank() {
            return senatorRank;
        }

        /**
         * @param senatorRank The senator_rank
         */
        public void setSenatorRank(Object senatorRank) {
            this.senatorRank = senatorRank;
        }

        /**
         * @return The startdate
         */
        public String getStartdate() {
            return startdate;
        }

        /**
         * @param startdate The startdate
         */
        public void setStartdate(String startdate) {
            this.startdate = startdate;
        }

        /**
         * @return The state
         */
        public String getState() {
            return state;
        }

        /**
         * @param state The state
         */
        public void setState(String state) {
            this.state = state;
        }

        /**
         * @return The title
         */
        public String getTitle() {
            return title;
        }

        /**
         * @param title The title
         */
        public void setTitle(String title) {
            this.title = title;
        }

        /**
         * @return The titleLong
         */
        public String getTitleLong() {
            return titleLong;
        }

        /**
         * @param titleLong The title_long
         */
        public void setTitleLong(String titleLong) {
            this.titleLong = titleLong;
        }

        /**
         * @return The website
         */
        public String getWebsite() {
            return website;
        }

        /**
         * @param website The website
         */
        public void setWebsite(String website) {
            this.website = website;
        }

    }

    public class Term {

        @Expose
        public Integer id;
        @Expose
        public String name;
        @SerializedName("term_type")
        @Expose
        public String termType;
        @SerializedName("term_type_label")
        @Expose
        public String termTypeLabel;

        /**
         * @return The id
         */
        public Integer getId() {
            return id;
        }

        /**
         * @param id The id
         */
        public void setId(Integer id) {
            this.id = id;
        }

        /**
         * @return The name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @return The termType
         */
        public String getTermType() {
            return termType;
        }

        /**
         * @param termType The term_type
         */
        public void setTermType(String termType) {
            this.termType = termType;
        }

        /**
         * @return The termTypeLabel
         */
        public String getTermTypeLabel() {
            return termTypeLabel;
        }

        /**
         * @param termTypeLabel The term_type_label
         */
        public void setTermTypeLabel(String termTypeLabel) {
            this.termTypeLabel = termTypeLabel;
        }

    }


}
