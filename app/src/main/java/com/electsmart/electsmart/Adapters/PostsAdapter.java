package com.electsmart.electsmart.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.electsmart.electsmart.API.Choreo.Models.Response;
import com.electsmart.electsmart.API.Disqus.DisqusTask;
import com.electsmart.electsmart.Activities.ThreadActivity;
import com.electsmart.electsmart.Models.ForumCandidate;
import com.electsmart.electsmart.R;

import java.util.List;

/**
 * Created by Scott on 3/11/2016.
 */
public class PostsAdapter extends ArrayAdapter<com.electsmart.electsmart.API.Disqus.Models.Response> {
    private Context context;
    private List<com.electsmart.electsmart.API.Disqus.Models.Response> responses;

    public PostsAdapter(Context context, List<com.electsmart.electsmart.API.Disqus.Models.Response> responses) {
        super(context, 0, responses);
        this.context = context;
        this.responses = responses;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        final com.electsmart.electsmart.API.Disqus.Models.Response currentPost = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.thread_list_row, parent, false);
        }
        TextView threadTitle = (TextView) convertView.findViewById(R.id.ThreadText);
        TextView threadDate = (TextView) convertView.findViewById(R.id.threadDate);
        TextView threadAuthor = (TextView) convertView.findViewById(R.id.threadAuthor);
        //TextView threadLikes = (TextView) convertView.findViewById(R.id.threadLikes);
        threadTitle.setText(currentPost.getRawMessage());
        threadDate.setText(currentPost.getCreatedAt());
        threadAuthor.setText(currentPost.getAuthor().getName());
        //threadLikes.setText(currentPost.getLikes().toString());
        //threadTime.setText(currentPerson.getParty());






        // Populate the data into the template view using the data object
        //tvName.setText(election.date);

        // Return the completed view to render on screen
        return convertView;
    }
}
