package com.example.voteinformed.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class CivicElectionResponse {

    @SerializedName("kind")
    private String kind;

    @SerializedName("elections")
    private List<ElectionModel> elections;


    public String getKind() {
        return kind;
    }

    public List<ElectionModel> getElections() {
        return elections;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setElections(List<ElectionModel> elections) {
        this.elections = elections;
    }
}