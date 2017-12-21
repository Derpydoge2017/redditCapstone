package com.example.admin.redditcapstone;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Admin on 12/14/17.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.PostsViewHolder> {

    private List<Reddit> subreddit_posts;
    private int rowLayout;
    private Context context;


    public static class PostsViewHolder extends RecyclerView.ViewHolder {
        LinearLayout redditLayout;
        TextView redditPostName;
        TextView redditDescriptionText;
        TextView redditAuthorName;
        TextView redditSubreddit;


        public PostsViewHolder(View v) {
            super(v);
            /*redditLayout = (LinearLayout) v.findViewById(R.id.movies_layout);
            redditPostName = (TextView) v.findViewById(R.id.title);
            redditDescriptionText = (TextView) v.findViewById(R.id.subtitle);
            redditAuthorName = (TextView) v.findViewById(R.id.description);
            redditSubreddit = (TextView) v.findViewById(R.id.rating);
            */
        }
    }

    public Adapter(List<Reddit> subredditList, int rowLayout, Context context) {
        this.subreddit_posts = subredditList;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public Adapter.PostsViewHolder onCreateViewHolder(ViewGroup parent,
                                                            int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new PostsViewHolder(view);
    }


    @Override
    public void onBindViewHolder(PostsViewHolder holder, final int position) {
        holder.redditPostName.setText(subreddit_posts.get(position).getPostTitle());
        holder.redditDescriptionText.setText(subreddit_posts.get(position).getPostDescription());
        holder.redditAuthorName.setText(subreddit_posts.get(position).getPostAuthor());
        holder.redditSubreddit.setText(subreddit_posts.get(position).getPostSubreddit().toString());
    }

    @Override
    public int getItemCount() {
        return subreddit_posts.size();
    }

}
