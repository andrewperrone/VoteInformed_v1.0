package com.example.voteinformed.data.entity;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user")
public class User {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "user_id")
    private int user_id;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "email")
    private String email;
    @ColumnInfo(name = "password")
    private String password;
    @ColumnInfo(name = "location")
    private String location;
    @ColumnInfo(name = "preference")
    private String preferences;

    public User(int user_id, String name, String email, String password, String location, String preferences) {
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.location = location;
        this.preferences = preferences;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserID(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword() {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation() {
        this.location = location;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences() {
        this.preferences = preferences;
    }
}
