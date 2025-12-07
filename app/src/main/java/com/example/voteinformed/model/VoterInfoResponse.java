package com.example.voteinformed.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class VoterInfoResponse {

    @SerializedName("kind")
    private String kind;

    @SerializedName("normalizedInput")
    private AddressModel normalizedInput;

    @SerializedName("pollingLocations")
    private List<PollingLocationModel> pollingLocations;

    public String getKind() {
        return kind;
    }

    public AddressModel getNormalizedInput() {
        return normalizedInput;
    }

    public List<PollingLocationModel> getPollingLocations() {
        return pollingLocations;
    }


    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setNormalizedInput(AddressModel normalizedInput) {
        this.normalizedInput = normalizedInput;
    }

    public void setPollingLocations(List<PollingLocationModel> pollingLocations) {
        this.pollingLocations = pollingLocations;
    }
}