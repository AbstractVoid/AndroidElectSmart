package com.electsmart.electsmart.Activities;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.electsmart.electsmart.API.Disqus.DisqusTask;
import com.electsmart.electsmart.API.Disqus.Models.Response;
import com.electsmart.electsmart.Adapters.ForumAdapter;
import com.electsmart.electsmart.Adapters.PostsAdapter;
import com.electsmart.electsmart.R;

import java.util.ArrayList;
import java.util.List;

public class ThreadActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread);
        List<Response> responseList = new ArrayList<>();
        PostsAdapter postsAdapter = new PostsAdapter(this, responseList);
        setListAdapter(postsAdapter);
        String threadId = getIntent().getStringExtra("threadId");

        new DisqusTask(threadId, postsAdapter).execute();

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/
    }

}
