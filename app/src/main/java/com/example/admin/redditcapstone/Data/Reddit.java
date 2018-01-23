package com.example.admin.redditcapstone.Data;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by Admin on 11/27/17.
 */
public class Reddit {

    private String id;
    private String title;
    private String author;
    private String selftext;
    private String subreddit;
    private String thumbnail;
    private String fallback_url;

    public Reddit() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostTitle() {
        return title;
    }

    public void setPostTitle(String title) {
        this.title = title;
    }

    public String getPostAuthor() {
        return author;
    }

    public void setPostAuthor(String author) {
        this.author = author;
    }

    public String getPostDescription() {
        return selftext;
    }

    public void setPostDescription(String description) {
        this.selftext = description;
    }

    public String getPostSubreddit() {
        return subreddit;
    }

    public void setPostSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }

    public String getVideoURL() { return fallback_url; }

    public void setVideoURL(String videoURL) {
        this.fallback_url = videoURL;
    }


    public String getThumbnail() { return thumbnail; }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }


}

