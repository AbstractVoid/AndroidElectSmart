package com.electsmart.electsmart.API.Disqus;

import android.os.AsyncTask;
import android.util.Log;

import com.electsmart.electsmart.API.Disqus.Models.Cursor;
import com.electsmart.electsmart.API.Disqus.Models.Response;
import com.electsmart.electsmart.API.Disqus.Models.Responses;
import com.electsmart.electsmart.Adapters.ForumAdapter;
import com.electsmart.electsmart.Adapters.PostsAdapter;
import com.google.gson.Gson;

import java.util.List;

/**
 * Created by stfranklin on 5/3/2016.
 */
    public class DisqusTask extends AsyncTask<Void, Void, String> {
        private PostsAdapter postsAdapter;
        private String KEY_STRING = "veLosqnJ37IHa8xvvE3jv7yTDBMfNdq9FkUm44HYWLLLxhxUdOZ1ys3ka5Agyvuc";
        private String URL = "https://disqus.com/api/3.0/threads/listPosts.json?api_key=";
        private String forumId = "";
        public DisqusTask(String forumId, PostsAdapter postsAdapter){
            this.forumId= forumId;
            this.postsAdapter = postsAdapter;
        }
        public DisqusTask(){}
        @Override
        protected String doInBackground(Void... arg0) {
            String request = URL + KEY_STRING + "&thread=" + forumId;
            com.electsmart.electsmart.API.Disqus.RestClient client = new com.electsmart.electsmart.API.Disqus.RestClient(request);

            try {
                client.Execute(com.electsmart.electsmart.API.Disqus.RestClient.RequestMethod.GET);
            } catch (Exception e) {
                e.printStackTrace();
            }
            String response = client.getResponse();
            String disqusResponse = response;
            return response;
        }

        protected void onPostExecute(String result) {
            try {
                // Will update UI here
                Gson gson = new Gson();
                Responses responses = gson.fromJson(result, com.electsmart.electsmart.API.Disqus.Models.Responses.class);
                List<Response> responseList = responses.getResponse();

                postsAdapter.clear();
                postsAdapter.addAll(responseList);
                postsAdapter.notifyDataSetChanged();
            } catch(Exception e) {
                // if an exception occurred, show an error message
                Log.e(this.getClass().toString(), e.getMessage());
            }
        }
    }

