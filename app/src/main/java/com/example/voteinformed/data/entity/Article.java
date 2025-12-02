package com.example.voteinformed.data.entity;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity//(tableName = "article")
public class Article {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="article_id")
    private int article_id;

    public Article (int article_id)
    {
        this.article_id = article_id;
    }

    public int getArticleId() {
        return article_id;
    }

    public void setArticleId(int article_id) {
        this.article_id = article_id;
    }

    @NonNull
    @Override
    public String toString() {
        return "Article{" +
                "article_id=" + article_id +
                '}';
    }
}
