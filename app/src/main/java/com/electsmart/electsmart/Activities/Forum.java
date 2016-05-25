package com.electsmart.electsmart.Activities;

import android.app.ListActivity;
import android.os.Bundle;

import com.electsmart.electsmart.API.Disqus.DisqusTask;
//import com.electsmart.electsmart.API.Choreo.Models.Response;
import com.electsmart.electsmart.Adapters.ForumAdapter;
import com.electsmart.electsmart.Models.ForumCandidate;
import com.electsmart.electsmart.R;

import java.util.ArrayList;
import java.util.List;

public class Forum extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);
        List<ForumCandidate> persons = new ArrayList<>();
        buildPeople(persons);
        ForumAdapter forumAdapter = new ForumAdapter(this, persons);
        setListAdapter(forumAdapter);
        //new DisqusTask().execute();
    }

    private void buildPeople(List<ForumCandidate> persons) {
        ForumCandidate Hillary = new ForumCandidate();
        Hillary.setName("Hillary Clinton");
        Hillary.setParty("Democrat");
        Hillary.setForumId("4723533108");
        persons.add(Hillary);
        ForumCandidate Donald = new ForumCandidate();
        Donald.setParty("Republican");
        Donald.setName("Donald Trump");
        Donald.setForumId("4723537793");
        persons.add(Donald);
        ForumCandidate Bernie = new ForumCandidate();
        Bernie.setParty("Democrat");
        Bernie.setName("Bernie Sanders");
        Bernie.setForumId("4723538518");
        persons.add(Bernie);
        ForumCandidate Ted = new ForumCandidate();
        Ted.setParty("Republican");
        Ted.setName("Ted Cruz");
        Ted.setForumId("4723538757");
        persons.add(Ted);
        ForumCandidate John = new ForumCandidate();
        John.setParty("Republican");
        John.setName("John Kasich");
        John.setForumId("4723539079");
        persons.add(John);
    }
}
