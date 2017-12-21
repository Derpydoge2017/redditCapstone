package com.example.admin.redditcapstone;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import com.example.admin.redditcapstone.DetailActivity.*;

/**
 * Created by Admin on 12/14/17.
 */

public interface ApiInterface {
    @GET("r/{subReddit}/{json}")
    Call<RedditResponse> getSubredditPosts(@Path("subReddit") String subReddit, @Path("json") String search_json, @Query("q") String query, @Query("sort") String sort, @Query("restrict_sr") String restriction);

}
