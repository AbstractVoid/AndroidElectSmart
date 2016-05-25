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
public class ForumAdapter extends ArrayAdapter<ForumCandidate> {
    private Context context;
    private List<ForumCandidate> people;

    public ForumAdapter(Context context, List<ForumCandidate> people) {
        super(context, 0, people);
        this.context = context;
        this.people = people;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        final ForumCandidate currentPerson = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.forum_list_item, parent, false);
        }
        TextView threadTitle = (TextView) convertView.findViewById(R.id.ForumTitle);
        TextView threadParty = (TextView) convertView.findViewById(R.id.TimePassed);

        threadTitle.setText(currentPerson.getName());
        threadParty.setText(currentPerson.getParty());


        RelativeLayout threadContainer = (RelativeLayout) convertView.findViewById(R.id.ForumContent);
        threadContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ThreadActivity.class);
                intent.putExtra("threadId", currentPerson.getForumId());
                context.startActivity(intent);
            }
        });




        // Populate the data into the template view using the data object
        //tvName.setText(election.date);

        // Return the completed view to render on screen
        return convertView;
    }
}
