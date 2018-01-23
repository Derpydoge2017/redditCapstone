package com.example.admin.redditcapstone.Data;

import com.example.admin.redditcapstone.Data.Reddit;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Admin on 12/14/17.
 */

public class Data {

    @SerializedName("children")
    private List<Reddit> children;

    public List<Reddit> getResults() {
        return children;
    }

    public void setResults(List<Reddit> children) {
        this.children = children;
    }

}
