package com.electsmart.electsmart.Models;

/**
 * Created by stfranklin on 5/3/2016.
 */
public class ForumCandidate {
    String Name;
    String Party;
    String forumId;

    public void setName(String name){
        this.Name = name;
    }

    public void setParty(String party){
        this.Party = party;
    }

    public void setForumId(String id){
        this.forumId = id;
    }

    public String getName(){
        return this.Name;
    }

    public String getParty(){
        return this.Party;
    }

    public String getForumId(){
        return this.forumId;
    }
}
