package com.example.admin.redditcapstone;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Admin on 12/14/17.
 */

public class RedditResponse {

    @SerializedName("children")
    private List<Reddit> children;

    public List<Reddit> getResults() {
        return children;
    }

    public void setResults(List<Reddit> children) {
        this.children = children;
    }

}