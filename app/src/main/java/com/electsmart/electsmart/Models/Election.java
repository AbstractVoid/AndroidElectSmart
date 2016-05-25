package com.electsmart.electsmart.Models;


import com.electsmart.electsmart.API.votesmart.Models.Candidate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by brand on 3/11/2016.
 */
public class Election implements Serializable {

    private int day;
    private int month;
    private int year;
    private Long id;
    private Long stageId;
    private String name;
    private List<Candidate> candidates;

    public Election (int day, int month, int year, Long id, Long stageId, String name, List<Candidate> candidates){
        this.day = day;
        this.month = month;
        this.year = year;
        this.id = id;
        this.stageId = stageId;
        this.name = name;
        this.candidates = candidates;
    }

    public Long getStageId() {
        return stageId;
    }

    public void setStageId(Long stageId) {
        this.stageId = stageId;
    }

    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    public Long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    public List<Candidate> getCandidates(){ return candidates; }

    public boolean equals(Object obj){
        Election e = (Election) obj;
        if(this.day == e.getDay() &&
                this.year == e.getYear() &&
                this.month == e.getMonth() &&
                this.id == e.getId() &&
                this.name == e.getName()){
            return true;
        }else{
            return false;
        }
    }
}