package com.electsmart.electsmart.Adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.electsmart.electsmart.API.votesmart.Models.Candidate;
import com.electsmart.electsmart.Activities.CandidateActivity;
import com.electsmart.electsmart.DownloadImageTask;
import com.electsmart.electsmart.Models.Election;
import com.electsmart.electsmart.PreferencesManager;
import com.electsmart.electsmart.R;

import java.util.ArrayList;

/**
 * Created by brand on 3/15/2016.
 */
public class ElectionAdapter extends ArrayAdapter<Candidate> {

    private Context _context;

    public ElectionAdapter(Context context, ArrayList<Candidate> candidates) {
        super(context, 0, candidates);
        this._context = context;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) _context
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.election_view_candidate_listview_row, null);
        }


        final Candidate candidate = getItem(position);

        convertView.findViewById(R.id.candidates).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(_context, CandidateActivity.class);
                Candidate c = getItem(position);
                if (c != null) {
                    intent.putExtra("candidate", c);
                    _context.startActivity(intent);
                }
            }
        });

        TextView candidateNameView = (TextView) convertView.findViewById(R.id.candidateName);
        TextView candidatePartyView = (TextView) convertView.findViewById(R.id.candidateDescr);

        candidateNameView.setText(candidate.getBallotName());
        candidatePartyView.setText(candidate.getElectionParties());

        return convertView;
    }

}