package com.example.admin.redditcapstone.Data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by Admin on 07-Nov-17.
 */

public class redditContract {

    public static final String AUTHORITY = "com.example.admin.redditCapstone.Data";

    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + AUTHORITY);

    public static final String PATH_TASKS = "tasks";

    public static final class redditEntry implements BaseColumns {

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_TASKS).build();

        public static final String TABLE_NAME = "redditList";

        public static final String COLUMN_REDDIT_POST = "redditPostName";
        public static final String COLUMN_REDDIT_USER_NAME_LIST = "redditUsernameList";
        public static final String COLUMN_REDDIT_USER_COMMENT_LIST = "redditUserPostList";

    }

}
