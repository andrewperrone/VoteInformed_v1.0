package com.example.voteinformed.data.util;

import com.example.voteinformed.data.entity.relation.Politician_Issue;
import java.util.ArrayList;
import java.util.List;

public class DatabaseClient {

    public static List<Politician_Issue> getInitialPoliticianIssueRelations() {
        List<Politician_Issue> relations = new ArrayList<Politician_Issue>();

        relations.add(new Politician_Issue(1, 1, "Strongly Supports"));
        relations.add(new Politician_Issue(1, 2, "Strongly Supports"));
        relations.add(new Politician_Issue(1, 5, "Primary Focus"));
        relations.add(new Politician_Issue(1, 6, "Key Platform"));
        relations.add(new Politician_Issue(1, 8, "Strongly Supports"));
        relations.add(new Politician_Issue(1, 13, "Strongly Supports"));

        relations.add(new Politician_Issue(2, 9, "Key Focus"));
        relations.add(new Politician_Issue(2, 8, "Supports"));
        relations.add(new Politician_Issue(2, 2, "Supports"));
        relations.add(new Politician_Issue(2, 4, "Supports"));

        relations.add(new Politician_Issue(3, 6, "Supports"));
        relations.add(new Politician_Issue(3, 1, "Supports"));
        relations.add(new Politician_Issue(3, 2, "Supports"));
        relations.add(new Politician_Issue(3, 5, "Supports"));

        relations.add(new Politician_Issue(4, 6, "Supports"));
        relations.add(new Politician_Issue(4, 2, "Supports"));
        relations.add(new Politician_Issue(4, 8, "Supports"));
        relations.add(new Politician_Issue(4, 1, "Supports"));

        relations.add(new Politician_Issue(5, 1, "Supports"));
        relations.add(new Politician_Issue(5, 2, "Supports"));
        relations.add(new Politician_Issue(5, 6, "Supports"));
        relations.add(new Politician_Issue(5, 9, "Supports"));
        relations.add(new Politician_Issue(5, 8, "Supports"));

        relations.add(new Politician_Issue(6, 1, "Supports"));
        relations.add(new Politician_Issue(6, 2, "Supports"));
        relations.add(new Politician_Issue(6, 3, "Key Platform"));
        relations.add(new Politician_Issue(6, 4, "Supports"));
        relations.add(new Politician_Issue(6, 5, "Supports"));
        relations.add(new Politician_Issue(6, 6, "Supports"));
        relations.add(new Politician_Issue(6, 8, "Key Platform"));
        relations.add(new Politician_Issue(6, 12, "Supports"));
        relations.add(new Politician_Issue(6, 13, "Strongly Supports"));

        relations.add(new Politician_Issue(7, 1, "Supports"));
        relations.add(new Politician_Issue(7, 3, "Supports"));
        relations.add(new Politician_Issue(7, 4, "Supports"));
        relations.add(new Politician_Issue(7, 5, "Key Platform"));
        relations.add(new Politician_Issue(7, 6, "Key Platform"));
        relations.add(new Politician_Issue(7, 7, "Strongly Supports"));
        relations.add(new Politician_Issue(7, 9, "Strongly Supports"));
        relations.add(new Politician_Issue(7, 11, "Strongly Supports"));
        relations.add(new Politician_Issue(7, 12, "Supports"));

        relations.add(new Politician_Issue(8, 1, "Supports"));
        relations.add(new Politician_Issue(8, 2, "Supports"));
        relations.add(new Politician_Issue(8, 3, "Supports"));
        relations.add(new Politician_Issue(8, 4, "Supports"));
        relations.add(new Politician_Issue(8, 5, "Key Platform"));
        relations.add(new Politician_Issue(8, 6, "Supports"));
        relations.add(new Politician_Issue(8, 8, "Supports"));
        relations.add(new Politician_Issue(8, 12, "Key Platform"));
        relations.add(new Politician_Issue(8, 13, "Supports"));

        relations.add(new Politician_Issue(9, 1, "Supports"));
        relations.add(new Politician_Issue(9, 3, "Supports"));
        relations.add(new Politician_Issue(9, 4, "Supports"));
        relations.add(new Politician_Issue(9, 5, "Key Platform"));
        relations.add(new Politician_Issue(9, 6, "Key Platform"));
        relations.add(new Politician_Issue(9, 7, "Strongly Supports"));
        relations.add(new Politician_Issue(9, 9, "Strongly Supports"));
        relations.add(new Politician_Issue(9, 10, "Supports"));
        relations.add(new Politician_Issue(9, 11, "Strongly Supports"));

        relations.add(new Politician_Issue(10, 3, "Supports"));
        relations.add(new Politician_Issue(10, 4, "Supports"));
        relations.add(new Politician_Issue(10, 5, "Key Platform"));
        relations.add(new Politician_Issue(10, 6, "Key Platform"));
        relations.add(new Politician_Issue(10, 7, "Strongly Supports"));
        relations.add(new Politician_Issue(10, 9, "Strongly Supports"));
        relations.add(new Politician_Issue(10, 10, "Supports"));
        relations.add(new Politician_Issue(10, 11, "Strongly Supports"));

        relations.add(new Politician_Issue(16, 1, "Supports"));
        relations.add(new Politician_Issue(16, 2, "Supports"));
        relations.add(new Politician_Issue(16, 3, "Supports"));
        relations.add(new Politician_Issue(16, 4, "Supports"));
        relations.add(new Politician_Issue(16, 5, "Supports"));
        relations.add(new Politician_Issue(16, 6, "Supports"));
        relations.add(new Politician_Issue(16, 7, "Neutral"));
        relations.add(new Politician_Issue(16, 8, "Supports"));
        relations.add(new Politician_Issue(16, 9, "Key Platform"));
        relations.add(new Politician_Issue(16, 10, "Neutral"));
        relations.add(new Politician_Issue(16, 11, "Neutral"));
        relations.add(new Politician_Issue(16, 12, "Key Platform"));
        relations.add(new Politician_Issue(16, 13, "Supports"));

        relations.add(new Politician_Issue(17, 1, "Supports"));
        relations.add(new Politician_Issue(17, 2, "Neutral"));
        relations.add(new Politician_Issue(17, 3, "Supports"));
        relations.add(new Politician_Issue(17, 4, "Supports"));
        relations.add(new Politician_Issue(17, 5, "Supports"));
        relations.add(new Politician_Issue(17, 6, "Key Platform"));
        relations.add(new Politician_Issue(17, 7, "Supports"));
        relations.add(new Politician_Issue(17, 8, "Neutral"));
        relations.add(new Politician_Issue(17, 9, "Key Platform"));
        relations.add(new Politician_Issue(17, 10, "Supports"));
        relations.add(new Politician_Issue(17, 11, "Key Platform"));
        relations.add(new Politician_Issue(17, 12, "Neutral"));
        relations.add(new Politician_Issue(17, 13, "Neutral"));

        relations.add(new Politician_Issue(18, 1, "Key Platform"));
        relations.add(new Politician_Issue(18, 2, "Supports"));
        relations.add(new Politician_Issue(18, 3, "Supports"));
        relations.add(new Politician_Issue(18, 4, "Supports"));
        relations.add(new Politician_Issue(18, 5, "Supports"));
        relations.add(new Politician_Issue(18, 6, "Supports"));
        relations.add(new Politician_Issue(18, 7, "Neutral"));
        relations.add(new Politician_Issue(18, 8, "Key Platform"));
        relations.add(new Politician_Issue(18, 9, "Supports"));
        relations.add(new Politician_Issue(18, 10, "Neutral"));
        relations.add(new Politician_Issue(18, 11, "Neutral"));
        relations.add(new Politician_Issue(18, 12, "Key Platform"));
        relations.add(new Politician_Issue(18, 13, "Supports"));

        relations.add(new Politician_Issue(19, 1, "Supports"));
        relations.add(new Politician_Issue(19, 2, "Neutral"));
        relations.add(new Politician_Issue(19, 3, "Key Platform"));
        relations.add(new Politician_Issue(19, 4, "Key Platform"));
        relations.add(new Politician_Issue(19, 5, "Supports"));
        relations.add(new Politician_Issue(19, 6, "Key Platform"));
        relations.add(new Politician_Issue(19, 7, "Supports"));
        relations.add(new Politician_Issue(19, 8, "Neutral"));
        relations.add(new Politician_Issue(19, 9, "Supports"));
        relations.add(new Politician_Issue(19, 10, "Neutral"));
        relations.add(new Politician_Issue(19, 11, "Key Platform"));
        relations.add(new Politician_Issue(19, 12, "Supports"));
        relations.add(new Politician_Issue(19, 13, "Neutral"));

        relations.add(new Politician_Issue(20, 1, "Supports"));
        relations.add(new Politician_Issue(20, 2, "Neutral"));
        relations.add(new Politician_Issue(20, 3, "Supports"));
        relations.add(new Politician_Issue(20, 4, "Supports"));
        relations.add(new Politician_Issue(20, 5, "Key Platform"));
        relations.add(new Politician_Issue(20, 6, "Key Platform"));
        relations.add(new Politician_Issue(20, 7, "Supports"));
        relations.add(new Politician_Issue(20, 8, "Neutral"));
        relations.add(new Politician_Issue(20, 9, "Key Platform"));
        relations.add(new Politician_Issue(20, 10, "Supports"));
        relations.add(new Politician_Issue(20, 11, "Key Platform"));
        relations.add(new Politician_Issue(20, 12, "Supports"));
        relations.add(new Politician_Issue(20, 13, "Neutral"));

        relations.add(new Politician_Issue(21, 1, "Supports"));
        relations.add(new Politician_Issue(21, 2, "Neutral"));
        relations.add(new Politician_Issue(21, 3, "Supports"));
        relations.add(new Politician_Issue(21, 4, "Supports"));
        relations.add(new Politician_Issue(21, 5, "Key Platform"));
        relations.add(new Politician_Issue(21, 6, "Key Platform"));
        relations.add(new Politician_Issue(21, 7, "Supports"));
        relations.add(new Politician_Issue(21, 8, "Neutral"));
        relations.add(new Politician_Issue(21, 9, "Key Platform"));
        relations.add(new Politician_Issue(21, 10, "Supports"));
        relations.add(new Politician_Issue(21, 11, "Key Platform"));
        relations.add(new Politician_Issue(21, 12, "Supports"));
        relations.add(new Politician_Issue(21, 13, "Neutral"));

        relations.add(new Politician_Issue(22, 1, "Key Platform"));
        relations.add(new Politician_Issue(22, 2, "Supports"));
        relations.add(new Politician_Issue(22, 3, "Supports"));
        relations.add(new Politician_Issue(22, 4, "Supports"));
        relations.add(new Politician_Issue(22, 5, "Key Platform"));
        relations.add(new Politician_Issue(22, 6, "Key Platform"));
        relations.add(new Politician_Issue(22, 7, "Supports"));
        relations.add(new Politician_Issue(22, 8, "Supports"));
        relations.add(new Politician_Issue(22, 9, "Supports"));
        relations.add(new Politician_Issue(22, 10, "Neutral"));
        relations.add(new Politician_Issue(22, 11, "Supports"));
        relations.add(new Politician_Issue(22, 12, "Supports"));
        relations.add(new Politician_Issue(22, 13, "Supports"));

        relations.add(new Politician_Issue(23, 1, "Supports"));
        relations.add(new Politician_Issue(23, 2, "Supports"));
        relations.add(new Politician_Issue(23, 3, "Neutral"));
        relations.add(new Politician_Issue(23, 4, "Neutral"));
        relations.add(new Politician_Issue(23, 5, "Supports"));
        relations.add(new Politician_Issue(23, 6, "Supports"));
        relations.add(new Politician_Issue(23, 7, "Neutral"));
        relations.add(new Politician_Issue(23, 8, "Supports"));
        relations.add(new Politician_Issue(23, 9, "Supports"));
        relations.add(new Politician_Issue(23, 10, "Neutral"));
        relations.add(new Politician_Issue(23, 11, "Supports"));
        relations.add(new Politician_Issue(23, 12, "Key Platform"));
        relations.add(new Politician_Issue(23, 13, "Supports"));

        relations.add(new Politician_Issue(24, 1, "Key Platform"));
        relations.add(new Politician_Issue(24, 2, "Supports"));
        relations.add(new Politician_Issue(24, 3, "Neutral"));
        relations.add(new Politician_Issue(24, 4, "Neutral"));
        relations.add(new Politician_Issue(24, 5, "Supports"));
        relations.add(new Politician_Issue(24, 6, "Supports"));
        relations.add(new Politician_Issue(24, 7, "Neutral"));
        relations.add(new Politician_Issue(24, 8, "Supports"));
        relations.add(new Politician_Issue(24, 9, "Key Platform"));
        relations.add(new Politician_Issue(24, 10, "Supports"));
        relations.add(new Politician_Issue(24, 11, "Supports"));
        relations.add(new Politician_Issue(24, 12, "Supports"));
        relations.add(new Politician_Issue(24, 13, "Key Platform"));

        relations.add(new Politician_Issue(25, 1, "Key Platform"));
        relations.add(new Politician_Issue(25, 2, "Supports"));
        relations.add(new Politician_Issue(25, 3, "Supports"));
        relations.add(new Politician_Issue(25, 4, "Supports"));
        relations.add(new Politician_Issue(25, 5, "Key Platform"));
        relations.add(new Politician_Issue(25, 6, "Key Platform"));
        relations.add(new Politician_Issue(25, 7, "Neutral"));
        relations.add(new Politician_Issue(25, 8, "Key Platform"));
        relations.add(new Politician_Issue(25, 9, "Supports"));
        relations.add(new Politician_Issue(25, 10, "Supports"));
        relations.add(new Politician_Issue(25, 11, "Supports"));
        relations.add(new Politician_Issue(25, 12, "Supports"));
        relations.add(new Politician_Issue(25, 13, "Supports"));

        relations.add(new Politician_Issue(31, 1, "Strongly Supports"));
        relations.add(new Politician_Issue(31, 2, "Supports"));
        relations.add(new Politician_Issue(31, 3, "Supports"));
        relations.add(new Politician_Issue(31, 4, "Supports"));
        relations.add(new Politician_Issue(31, 5, "Key Platform"));
        relations.add(new Politician_Issue(31, 6, "Key Platform"));
        relations.add(new Politician_Issue(31, 8, "Supports"));
        relations.add(new Politician_Issue(31, 9, "Supports"));
        relations.add(new Politician_Issue(31, 11, "Supports"));
        relations.add(new Politician_Issue(31, 12, "Supports"));
        relations.add(new Politician_Issue(31, 13, "Strongly Supports"));

        relations.add(new Politician_Issue(32, 1, "Supports"));
        relations.add(new Politician_Issue(32, 3, "Supports"));
        relations.add(new Politician_Issue(32, 4, "Supports"));
        relations.add(new Politician_Issue(32, 5, "Supports"));
        relations.add(new Politician_Issue(32, 6, "Key Platform"));
        relations.add(new Politician_Issue(32, 8, "Key Platform"));
        relations.add(new Politician_Issue(32, 11, "Neutral"));
        relations.add(new Politician_Issue(32, 12, "Supports"));
        relations.add(new Politician_Issue(32, 13, "Supports"));

        relations.add(new Politician_Issue(33, 1, "Key Platform"));
        relations.add(new Politician_Issue(33, 2, "Strongly Supports"));
        relations.add(new Politician_Issue(33, 5, "Supports"));
        relations.add(new Politician_Issue(33, 6, "Supports"));
        relations.add(new Politician_Issue(33, 8, "Supports"));
        relations.add(new Politician_Issue(33, 9, "Key Platform"));
        relations.add(new Politician_Issue(33, 10, "Supports"));
        relations.add(new Politician_Issue(33, 12, "Supports"));
        relations.add(new Politician_Issue(33, 13, "Strongly Supports"));

        relations.add(new Politician_Issue(34, 1, "Supports"));
        relations.add(new Politician_Issue(34, 2, "Against"));
        relations.add(new Politician_Issue(34, 3, "Supports"));
        relations.add(new Politician_Issue(34, 4, "Supports"));
        relations.add(new Politician_Issue(34, 5, "Key Platform"));
        relations.add(new Politician_Issue(34, 6, "Key Platform"));
        relations.add(new Politician_Issue(34, 7, "Strongly Supports"));
        relations.add(new Politician_Issue(34, 8, "Supports"));
        relations.add(new Politician_Issue(34, 9, "Key Platform"));
        relations.add(new Politician_Issue(34, 11, "Strongly Against"));
        relations.add(new Politician_Issue(34, 12, "Supports"));

        relations.add(new Politician_Issue(35, 1, "Supports"));
        relations.add(new Politician_Issue(35, 3, "Key Platform"));
        relations.add(new Politician_Issue(35, 4, "Supports"));
        relations.add(new Politician_Issue(35, 5, "Supports"));
        relations.add(new Politician_Issue(35, 6, "Key Platform"));
        relations.add(new Politician_Issue(35, 7, "Supports"));
        relations.add(new Politician_Issue(35, 8, "Key Platform"));
        relations.add(new Politician_Issue(35, 9, "Supports"));
        relations.add(new Politician_Issue(35, 11, "Strongly Against"));
        relations.add(new Politician_Issue(35, 12, "Supports"));

        relations.add(new Politician_Issue(36, 1, "Supports"));
        relations.add(new Politician_Issue(36, 2, "Supports"));
        relations.add(new Politician_Issue(36, 3, "Key Platform"));
        relations.add(new Politician_Issue(36, 4, "Supports"));
        relations.add(new Politician_Issue(36, 5, "Key Platform"));
        relations.add(new Politician_Issue(36, 6, "Key Platform"));
        relations.add(new Politician_Issue(36, 7, "Supports"));
        relations.add(new Politician_Issue(36, 8, "Supports"));
        relations.add(new Politician_Issue(36, 9, "Key Platform"));
        relations.add(new Politician_Issue(36, 11, "Key Platform"));
        relations.add(new Politician_Issue(36, 12, "Supports"));
        relations.add(new Politician_Issue(36, 13, "Supports"));

        relations.add(new Politician_Issue(37, 1, "Supports"));
        relations.add(new Politician_Issue(37, 2, "Supports"));
        relations.add(new Politician_Issue(37, 3, "Supports"));
        relations.add(new Politician_Issue(37, 4, "Supports"));
        relations.add(new Politician_Issue(37, 5, "Key Platform"));
        relations.add(new Politician_Issue(37, 6, "Key Platform"));
        relations.add(new Politician_Issue(37, 7, "Supports"));
        relations.add(new Politician_Issue(37, 8, "Key Platform"));
        relations.add(new Politician_Issue(37, 9, "Key Platform"));
        relations.add(new Politician_Issue(37, 12, "Supports"));
        relations.add(new Politician_Issue(37, 13, "Supports"));

        relations.add(new Politician_Issue(38, 1, "Key Platform"));
        relations.add(new Politician_Issue(38, 2, "Supports"));
        relations.add(new Politician_Issue(38, 3, "Supports"));
        relations.add(new Politician_Issue(38, 4, "Supports"));
        relations.add(new Politician_Issue(38, 5, "Supports"));
        relations.add(new Politician_Issue(38, 6, "Key Platform"));
        relations.add(new Politician_Issue(38, 7, "Supports"));
        relations.add(new Politician_Issue(38, 8, "Supports"));
        relations.add(new Politician_Issue(38, 9, "Supports"));
        relations.add(new Politician_Issue(38, 11, "Supports"));
        relations.add(new Politician_Issue(38, 12, "Supports"));
        relations.add(new Politician_Issue(38, 13, "Strongly Supports"));

        relations.add(new Politician_Issue(39, 1, "Key Platform"));
        relations.add(new Politician_Issue(39, 2, "Supports"));
        relations.add(new Politician_Issue(39, 3, "Supports"));
        relations.add(new Politician_Issue(39, 4, "Supports"));
        relations.add(new Politician_Issue(39, 5, "Supports"));
        relations.add(new Politician_Issue(39, 6, "Supports"));
        relations.add(new Politician_Issue(39, 8, "Supports"));
        relations.add(new Politician_Issue(39, 9, "Supports"));
        relations.add(new Politician_Issue(39, 10, "Supports"));
        relations.add(new Politician_Issue(39, 12, "Key Platform"));
        relations.add(new Politician_Issue(39, 13, "Strongly Supports"));

        relations.add(new Politician_Issue(40, 1, "Key Platform"));
        relations.add(new Politician_Issue(40, 2, "Supports"));
        relations.add(new Politician_Issue(40, 3, "Supports"));
        relations.add(new Politician_Issue(40, 4, "Supports"));
        relations.add(new Politician_Issue(40, 5, "Key Platform"));
        relations.add(new Politician_Issue(40, 6, "Supports"));
        relations.add(new Politician_Issue(40, 8, "Supports"));
        relations.add(new Politician_Issue(40, 9, "Supports"));
        relations.add(new Politician_Issue(40, 11, "Supports"));
        relations.add(new Politician_Issue(40, 12, "Supports"));
        relations.add(new Politician_Issue(40, 13, "Strongly Supports"));

        return relations;
    }
}



