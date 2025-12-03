package com.example.voteinformed.data.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "saved_articles")
public class SavedArticle {

    @PrimaryKey
    @NonNull
    public String articleId;

    public long savedAt;

    public SavedArticle(@NonNull String articleId) {
        this.articleId = articleId;
        this.savedAt = System.currentTimeMillis();
    }
}
