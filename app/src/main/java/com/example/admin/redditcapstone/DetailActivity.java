package com.example.admin.redditcapstone;

import android.annotation.SuppressLint;
import android.content.AsyncTaskLoader;
import android.content.Context;
import android.content.Loader;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.example.admin.redditcapstone.Data.Reddit;
import com.example.admin.redditcapstone.Data.Data;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailActivity extends AppCompatActivity {

    private static final String TAG = DetailActivity.class.getSimpleName();

    public String subReddit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        subReddit = getIntent().getStringExtra("subRedditClicked");
        //getSupportLoaderManager().initLoader(0, null, (android.support.v4.app.LoaderManager.LoaderCallbacks<Object>) this).forceLoad();
        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<Data> call = apiService.getSubredditPosts(subReddit, "search.json", "", "new", "1");
        call.enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data>call, Response<Data> response) {
                List<Reddit> reddit_posts = response.body().getResults();
                Log.d(TAG, "Number posts recieved: " + reddit_posts.size());
                Toast.makeText(DetailActivity.this, "Number of posts recieved: " + reddit_posts.size(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Data>call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }
        });



    }


    public Loader<ArrayList> onCreateLoader(int id, Bundle args) {
        return new FetchRedditData(this);
    }

    @SuppressLint("NewApi")
    private class FetchRedditData extends AsyncTaskLoader<ArrayList> {

        public FetchRedditData(Context context) {
            super(context);
        }

        @Override
        public ArrayList loadInBackground() {

            ApiInterface apiService =
                    ApiClient.getClient().create(ApiInterface.class);

            Call<Data> call = apiService.getSubredditPosts(subReddit, "search.json", "", "new", "1");
            call.enqueue(new Callback<Data>() {
                @Override
                public void onResponse(Call<Data>call, Response<Data> response) {
                    List<Reddit> reddit_posts = response.body().getResults();
                    Log.d(TAG, "Number posts recieved: " + reddit_posts.size());
                    Toast.makeText(DetailActivity.this, "Number of posts recieved: " + reddit_posts.size(), Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onFailure(Call<Data>call, Throwable t) {
                    // Log error here since request failed
                    Log.e(TAG, t.toString());
                }
            });

            return null;
        }

        @Override
        public void deliverResult(ArrayList data) {
            super.deliverResult(data);
        }
    }


}

