package com.example.admin.redditcapstone.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static android.provider.BaseColumns._ID;
import static com.example.admin.redditcapstone.Data.redditContract.redditEntry.COLUMN_REDDIT_POST;
import static com.example.admin.redditcapstone.Data.redditContract.redditEntry.COLUMN_REDDIT_USER_COMMENT_LIST;
import static com.example.admin.redditcapstone.Data.redditContract.redditEntry.COLUMN_REDDIT_USER_NAME_LIST;
import static com.example.admin.redditcapstone.Data.redditContract.redditEntry.TABLE_NAME;

/**
 * Created by Admin on 07-Nov-17.
 */

public class redditDBHelper extends SQLiteOpenHelper{

    // The name of the database
    private static final String DATABASE_NAME = "redditDb.db";

    // If you change the database schema, you must increment the database version
    private static final int VERSION = 1;

    public redditDBHelper(Context context){
        super(context,DATABASE_NAME,null,1);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_NAME + "("
                + _ID + " INTEGER PRIMARY KEY," + COLUMN_REDDIT_POST + " TEXT,"
                + COLUMN_REDDIT_USER_NAME_LIST + " TEXT" + COLUMN_REDDIT_USER_COMMENT_LIST + " TEXT" + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + redditContract.redditEntry.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
