package com.example.voteinformed.database.user;
import androidx.room.ColumnInfo;
import androidx.room.Dao;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Dao
public class User_Politician {
    @ColumnInfo(name = "user_id")
    private int user_id;

    @ColumnInfo(name = "politician_id")
    private int politician_id;

}
