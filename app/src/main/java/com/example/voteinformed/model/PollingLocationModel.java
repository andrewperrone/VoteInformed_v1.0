package com.example.voteinformed.model;

import com.google.gson.annotations.SerializedName;

public class PollingLocationModel {

    @SerializedName("address")
    private AddressModel address;

    @SerializedName("pollingHours")
    private String pollingHours;

    @SerializedName("notes")
    private String notes;

    public AddressModel getAddress() {
        return address;
    }

    public String getPollingHours() {
        return pollingHours;
    }

    public String getNotes() {
        return notes;
    }


    public void setAddress(AddressModel address) {
        this.address = address;
    }

    public void setPollingHours(String pollingHours) {
        this.pollingHours = pollingHours;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}