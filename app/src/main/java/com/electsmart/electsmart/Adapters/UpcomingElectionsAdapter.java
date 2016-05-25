package com.electsmart.electsmart.Adapters;

import android.app.Activity;

import android.content.Intent;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.electsmart.electsmart.Activities.ElectionActivity;
import com.electsmart.electsmart.Models.Election;
import com.electsmart.electsmart.Models.UpcomingElectionRow;
import com.electsmart.electsmart.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brand on 3/11/2016.
 */
public class UpcomingElectionsAdapter extends ArrayAdapter<UpcomingElectionRow> {
    Context context;
//    List<UpcomingElectionRow> upcomingElectionList;

    public UpcomingElectionsAdapter(Context context, ArrayList<UpcomingElectionRow> upcomingElectionsList) {
        super(context, 0, upcomingElectionsList);
        this.context = context;
//        this.upcomingElectionList = upcomingElectionsList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) context
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.upcoming_elections_listview_row, null);
        }

        TextView leftElectionDate = (TextView) convertView.findViewById(R.id.UpcomingElection_Calendar_Date_Left);
        TextView rightElectionDate = (TextView) convertView.findViewById(R.id.UpcomingElection_Calendar_Date_Right);
        TextView leftElectionName = (TextView) convertView.findViewById(R.id.UpcomingElection_Title_Left);
        TextView rightElectionName = (TextView) convertView.findViewById(R.id.UpcomingElection_Title_Right);

        final UpcomingElectionRow row = getItem(position);

        Election left = row.getLeft();
        Election right = row.getRight();

        if(null != left) {
            leftElectionDate.setText(" " + left.getDay() + " ");
            leftElectionName.setText(row.getLeft().getName());

            convertView.findViewById(R.id.leftElection).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, ElectionActivity.class);
                    intent.putExtra("election", row.getLeft());
                    ((Activity) context).startActivity(intent);
                }
            });
        }

        if(null != right) {
            rightElectionDate.setText(" " + row.getRight().getDay() + " ");
            rightElectionName.setText(row.getRight().getName());

            convertView.findViewById(R.id.rightElection).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, ElectionActivity.class);
                    intent.putExtra("election", row.getRight());
                    ((Activity) context).startActivity(intent);
                }
            });
        } else {
            convertView.findViewById(R.id.rightElection).setVisibility(View.INVISIBLE);
        }

        return convertView;
    }
}