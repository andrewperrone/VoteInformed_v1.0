package com.example.voteinformed.data.entity.relation;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.example.voteinformed.data.entity.Politician;
import com.example.voteinformed.data.entity.Election;

import java.util.List;

public class PoliticianWithElections {

    @Embedded
    public Politician politician;

    @Relation(
            parentColumn = "politician_id",
            entityColumn = "election_id",
            entity = Election.class,
            associateBy = @Junction(value = Politician_Election.class,
                    parentColumn = "politician_id",
                    entityColumn = "election_id" )
    )
    public List<Election> elections;
}