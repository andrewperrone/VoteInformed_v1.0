package com.example.voteinformed.model;

import com.google.gson.annotations.SerializedName;

public class ElectionModel {
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("electionDay")
    private String electionDay;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getElectionDay() {
        return electionDay;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setElectionDay(String electionDay) {
        this.electionDay = electionDay;
    }}