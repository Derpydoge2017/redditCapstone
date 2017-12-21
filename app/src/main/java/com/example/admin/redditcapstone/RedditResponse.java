package com.example.admin.redditcapstone;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Admin on 12/14/17.
 */

public class RedditResponse {

    @SerializedName("results")
    private List<Reddit> results;

    public List<Reddit> getResults() {
        return results;
    }

    public void setResults(List<Reddit> results) {
        this.results = results;
    }

}
