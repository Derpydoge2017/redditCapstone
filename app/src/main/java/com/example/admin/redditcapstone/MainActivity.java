package com.example.admin.redditcapstone;

import android.annotation.SuppressLint;
import android.content.AsyncTaskLoader;
import android.content.Context;
import android.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public Button mainMenuButton;

    private RadioGroup radioSubredditGroup;
    private RadioButton radioSubredditButton;
    Context context = this;
    public String subReddit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioSubredditGroup = (RadioGroup) findViewById(R.id.mainmenu_reddit_radioList);
        mainMenuButton = (Button) findViewById(R.id.mainmenu_button);
        mainMenuButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // get selected radio button from radioGroup
                int selectedId = radioSubredditGroup.getCheckedRadioButtonId();

                radioSubredditButton = (RadioButton) findViewById(selectedId);

                Toast.makeText(MainActivity.this,
                        radioSubredditButton.getText(), Toast.LENGTH_SHORT).show();

                subReddit = (String) radioSubredditButton.getText();

                Class destinationClass = DetailActivity.class;
                Intent intentToStartDetailActivity = new Intent(getBaseContext(), destinationClass);
                intentToStartDetailActivity.putExtra("subRedditClicked", subReddit);
                startActivity(intentToStartDetailActivity);
            }
        });

    }
}