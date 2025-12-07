package com.example.voteinformed.model;

import com.google.gson.annotations.SerializedName;

public class AddressModel {

    @SerializedName("locationName")
    private String locationName;

    @SerializedName("line1")
    private String line1;

    @SerializedName("city")
    private String city;

    @SerializedName("state")
    private String state;

    @SerializedName("zip")
    private String zip;


    public String getLocationName() {
        return locationName;
    }

    public String getLine1() {
        return line1;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getFullAddress() {
        return line1 + ", " + city + ", " + state + " " + zip;
    }


    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}