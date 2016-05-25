package com.electsmart.electsmart.Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.electsmart.electsmart.API.votesmart.Models.Candidate;
import com.electsmart.electsmart.API.votesmart.Models.ElectionsResponse;
import com.electsmart.electsmart.API.votesmart.Models.Stage;
import com.electsmart.electsmart.API.votesmart.VotesmartService;
import com.electsmart.electsmart.R;


import com.electsmart.electsmart.Adapters.UpcomingElectionsAdapter;
import com.electsmart.electsmart.Models.Election;
import com.electsmart.electsmart.Models.UpcomingElectionRow;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UpcomingElectionsFragment extends Fragment {

    private static final String TAG = UpcomingElectionsFragment.class.getSimpleName();
    private ArrayList<UpcomingElectionRow> upcomingElectionList;
    private UpcomingElectionsAdapter adapter;

    public UpcomingElectionsFragment() {
        // Required empty public constructor
    }

    public static UpcomingElectionsFragment newInstance() {
        UpcomingElectionsFragment fragment = new UpcomingElectionsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_upcoming_elections, null, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        List<Candidate> candidates = new ArrayList<Candidate>();
        HashMap<String, List<Candidate>> candidatePositionMap = new HashMap<String, List<Candidate>>();

        //DUMMY DATA IN PLACE OF APIS
        for(int j = 0; j < 3; j++){
            candidates.add(new Candidate("Party ", "Candidate " + j, "", ""));
        }

        Election elec1 = new Election(01, 01, 2017, 0L, 0L, "First Election", candidates);
        Election elec2 = new Election(12, 31, 2017, 1L, 1L,"Second Election", candidates);
        Election elec3 = new Election(02, 02, 2018, 2L, 2L,"Third Election", candidates);
        Election elec4 = new Election(07, 16, 2017, 3L, 3L,"My Birthday", candidates);

        UpcomingElectionRow row1 = new UpcomingElectionRow(elec1, elec2);
        UpcomingElectionRow row2 = new UpcomingElectionRow(elec3, elec4);


        upcomingElectionList = new ArrayList<UpcomingElectionRow>();
//        upcomingElectionList.add(row1);
//        upcomingElectionList.add(row2);

        adapter = new UpcomingElectionsAdapter(getActivity(), upcomingElectionList);
        ListView lView = (ListView) getView().findViewById(R.id.upcomingElectionList);
        lView.setAdapter(adapter);

        VotesmartService.createApiInstance().getElectionsByYearState(VotesmartService.API_KEY, String.valueOf(Calendar.getInstance().get(Calendar.YEAR)), null).enqueue(new Callback<ElectionsResponse>() {
            @Override
            public void onResponse(Call<ElectionsResponse> call, Response<ElectionsResponse> response) {
                Log.d(TAG, "Response received: " + response);
                if(response.isSuccessful()) {
                    upcomingElectionList.clear();
                    upcomingElectionList.addAll(createRows(response.body()));
                    adapter.notifyDataSetChanged();
                } else {
                    Log.d(TAG,"Response error code: " + response.code() + " errorBody: " + response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<ElectionsResponse> call, Throwable t) {
                Log.d(TAG, "Request failed");
            }
        });
    }

    private ArrayList<UpcomingElectionRow> createRows(ElectionsResponse response) {
        com.electsmart.electsmart.API.votesmart.Models.Election election = response.getElections().getElection();
        List<Stage> stages = election.getStage();
        List<Election> filteredElections = new ArrayList<>();
        ArrayList<UpcomingElectionRow> ret = new ArrayList<UpcomingElectionRow>();

        for(int i=0; i<stages.size(); i++) {
            if(passesFilter(stages.get(i))) {
                String[] date = stages.get(i).getElectionDate().split("-");
                int day = Integer.valueOf(date[2]);
                int month = Integer.valueOf(date[1]);
                int year = Integer.valueOf(date[0]);

                Election e1 = new Election(day, month, year, election.getElectionId(),stages.get(i).getElectionElectionstageId(), election.getName() + " " + stages.get(i).getStateId() + " " + stages.get(i).getName(), new ArrayList<Candidate>());
                filteredElections.add(e1);
            }
        }

        for(int i=0; i < filteredElections.size(); i +=2) {
            Election e1 = filteredElections.get(i);
            Election e2 = null;
            if(i+1 < filteredElections.size()) {
                e2 = filteredElections.get(i+1);
            }

            ret.add(new UpcomingElectionRow(e1, e2));
        }

        return ret;
    }

    private boolean passesFilter(Stage stage) {
        String[] date = stage.getElectionDate().split("-");
        int day = Integer.valueOf(date[2]);
        int month = Integer.valueOf(date[1]);
        int year = Integer.valueOf(date[0]);

        //10 days before now
        Calendar calDateBefore = Calendar.getInstance();
        calDateBefore.add(Calendar.DATE, -10);

        //40 days after now
        Calendar calDateAfter = Calendar.getInstance();
        calDateAfter.add(Calendar.DATE, 40);

        Calendar calDateElection = Calendar.getInstance();
        calDateElection.set(year, month - 1, day);

        //return true if within the range
        return calDateElection.after(calDateBefore) && calDateElection.before(calDateAfter);
    }
}