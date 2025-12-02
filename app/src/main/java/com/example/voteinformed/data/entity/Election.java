package com.example.voteinformed.data.entity;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.util.Date;
import java.util.Objects;

@Entity(tableName = "election")
public class Election {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="election_id")
    private int election_id;
    @ColumnInfo(name="election_name")
    private String election_name;
    @ColumnInfo(name="election_date")
    private Date election_date;
    @ColumnInfo(name="politician_location")
    private String politician_location;
    @ColumnInfo(name="description")
    private String politician_description;

    public Election(String election_name, Date election_date, String politician_location, String politician_description) {
        this.election_name = election_name;
        this.election_date = election_date;
        this.politician_location = politician_location;
        this.politician_description = politician_description;
    }

    public int getElection_id() {
        return election_id;
    }

    public void setElection_id(int election_id) {
        this.election_id = election_id;
    }

    public String getElection_name() {
        return election_name;
    }

    public void setElection_name(String election_name) {
        this.election_name = election_name;
    }

    public Date getElection_date() {
        return election_date;
    }

    public void setElection_date(Date election_date) {
        this.election_date = election_date;
    }

    public String getPolitician_location() {
        return politician_location;
    }

    public void setPolitician_location(String politician_location) {
        this.politician_location = politician_location;
    }

    public String getPolitician_description() {
        return politician_description;
    }

    public void setPolitician_description(String politician_description) {
        this.politician_description = politician_description;
    }

    @Override
    public String toString() {
        return "Election{" +
                "election_id=" + election_id +
                ", election_name='" + election_name + '\'' +
                ", election_date=" + election_date +
                ", politician_location='" + politician_location + '\'' +
                ", politician_description='" + politician_description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Election election = (Election) o;
        return election_id == election.election_id && Objects.equals(election_name, election.election_name) && Objects.equals(election_date, election.election_date) && Objects.equals(politician_location, election.politician_location) && Objects.equals(politician_description, election.politician_description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(election_id, election_name, election_date, politician_location, politician_description);
    }
}
