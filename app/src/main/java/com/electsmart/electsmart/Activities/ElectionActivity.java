package com.electsmart.electsmart.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import com.electsmart.electsmart.API.votesmart.Models.Candidate;
import com.electsmart.electsmart.API.votesmart.Models.CandidateList;
import com.electsmart.electsmart.API.votesmart.Models.CandidateResponse;
import com.electsmart.electsmart.API.votesmart.VotesmartService;
import com.electsmart.electsmart.Adapters.ElectionAdapter;
import com.electsmart.electsmart.Models.Election;
import com.electsmart.electsmart.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ElectionActivity extends AppCompatActivity {

    private static final String TAG = ElectionActivity.class.getSimpleName();

    private Election election;
    private ElectionAdapter adapter;
    private ListView listView;

    private ArrayList<Candidate> mCandidates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_election);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        election = (Election) getIntent().getSerializableExtra("election");

        TextView electionName = (TextView) findViewById(R.id.electionName);
        TextView electionDate = (TextView) findViewById(R.id.electionDate);

        electionName.setText(election.getName());
        electionDate.setText(election.getMonth() + "/" + election.getDay() + "/" + election.getYear());

        mCandidates = new ArrayList<Candidate>(election.getCandidates());

        listView = (ListView) findViewById(R.id.candidateList);
        adapter = new ElectionAdapter(this, mCandidates);
        listView.setAdapter(adapter);

        mCandidates.clear();
        mCandidates.addAll(createCandidates());

//        VotesmartService.createApiInstance().getCandidatesByElection(VotesmartService.API_KEY, String.valueOf(election.getId()))
//                .enqueue(new Callback<CandidateResponse>() {
//                    @Override
//                    public void onResponse(Call<CandidateResponse> call, Response<CandidateResponse> response) {
//                        Log.d(TAG, "Response received: " + response);
//                        if(response.isSuccessful()) {
//                            mCandidates.clear();
//                            List<Candidate> filteredCandidates = filterCandidates(response.body().getCandidateList().getCandidate());
//                            Log.d(TAG, "Candidates: " + filteredCandidates);
//                            mCandidates.addAll(filteredCandidates);
//                            adapter.notifyDataSetChanged();
//                        } else {
//                            Log.d(TAG,"Response error code: " + response.code() + " errorBody: " + response.errorBody());
//                        }
//                    }
//
//                    @Override
//                    public void onFailure(Call<CandidateResponse> call, Throwable t) {
//                        Log.d(TAG, "Request failed");
//                    }
//        });
    }

    private List<Candidate> filterCandidates(List<Candidate> candidates) {
        List<Candidate> filteredCandidates = new ArrayList<>();
        for(Candidate candidate : candidates) {
            if(!candidate.getBallotName().isEmpty() && !candidate.getElectionParties().isEmpty()) {
                filteredCandidates.add(candidate);
            }
        }

        return filteredCandidates;
    }

    private List<Candidate> createCandidates() {
        Candidate kasich = new Candidate("Republican", "Gov. John Kasich", "https://s3-us-west-2.amazonaws.com/john-kasich-assets/wp-content/uploads/2015/07/John-Kasich-Headshot.jpg", "John Richard Kasich is an American politician and the current governor of Ohio, first elected in 2010 and re-elected in 2014. Kasich served nine terms as a member of the United States House of Representatives, representing Ohio's 12th congressional district from 1983 to 2001. His tenure in the House included 18 years on the House Armed Services Committee and six years as chairman of the House Budget Committee. He was a key figure in the passage of both welfare reform and the Balanced Budget Act of 1997.");
        Candidate trump = new Candidate("Republican", "Donald Trump", "https://upload.wikimedia.org/wikipedia/commons/d/d2/Donald_Trump_August_19,_2015_(cropped).jpg", "Donald John Trump is an American businessman, politician, television personality, author, and the presumptive nominee of the Republican Party for President of the United States in the 2016 election. Trump is the Chairman and President of The Trump Organization, as well as the founder of the gaming and hotel enterprise, Trump Entertainment Resorts, now owned by Carl Icahn.");
        Candidate cruz = new Candidate("Republican", "Sen. Ted Cruz", "https://www.tedcruz.org/wp-content/uploads/2015/06/Portrait.jpg", "Rafael Edward \"Ted\" Cruz is an American politician and the junior United States Senator from Texas. Cruz graduated from Princeton University in 1992 and from Harvard Law School in 1995. Between 1999 and 2003, he was the Director of the Office of Policy Planning at the Federal Trade Commission, an Associate Deputy Attorney General at the United States Department of Justice, and domestic policy advisor to George W. Bush on the 2000 George W. Bush presidential campaign. He served as Solicitor General of Texas, from 2003 to 2008, appointed by Texas Attorney General, Greg Abbott. He was the first Hispanic, and the longest-serving, Solicitor General in Texas history. From 2004 to 2009, Cruz was also an adjunct professor at the University of Texas School of Law in Austin, where he taught U.S. Supreme Court litigation.");
        Candidate clinton = new Candidate("Democrat", "Hillary Clinton", "https://upload.wikimedia.org/wikipedia/commons/2/27/Hillary_Clinton_official_Secretary_of_State_portrait_crop.jpg", "Hillary Diane Rodham Clinton is a former United States Secretary of State, U.S. Senator, and First Lady of the United States. From 2009 to 2013, she was the 67th Secretary of State, serving under President Barack Obama. She previously represented New York in the U.S. Senate. Before that, as the wife of President Bill Clinton, she was First Lady from 1993 to 2001. In the 2008 election, Clinton was a leading candidate for the Democratic presidential nomination.");
        Candidate sanders = new Candidate("Democrat", "Sen. Bernie Sanders", "https://upload.wikimedia.org/wikipedia/commons/d/de/Bernie_Sanders.jpg", "Bernard \"Bernie\" Sanders is an American politician and the junior United States senator from Vermont. He is a candidate for the Democratic nomination for President of the United States in the 2016 election. A member of the Democratic Party since 2015, Sanders had been the longest-serving independent in U.S. congressional history, though his caucusing with the Democrats entitled him to committee assignments and at times gave Democrats a majority. Sanders became the ranking minority member on the Senate Budget Committee in January 2015; he had previously served for two years as chair of the Senate Veterans' Affairs Committee.");

        List<Candidate> ret = new ArrayList<>();
        ret.add(kasich);
        ret.add(trump);
        ret.add(cruz);
        ret.add(clinton);
        ret.add(sanders);

        return ret;
    }
}
