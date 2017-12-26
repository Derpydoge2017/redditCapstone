package com.example.admin.redditcapstone;

import android.util.Log;

import com.ihsanbal.logging.Logger;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Admin on 12/14/17.
 */

public class ApiClient {

        public static final String REDDIT_URL_1 = "https://www.reddit.com/";

        private static Retrofit retrofit = null;

        public static Retrofit getClient() {
            if (retrofit==null) {
                retrofit = new Retrofit.Builder()
                        .baseUrl(REDDIT_URL_1)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
            return retrofit;
        }
    }
