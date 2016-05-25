package com.electsmart.electsmart.API.votesmart.Models;

/**
 * Created by Josh Kasuboski on 4/30/16.
 */
public class CandidateResponse {
    private CandidateList candidateList;

    public CandidateResponse() {
    }

    public CandidateResponse(CandidateList candidateList) {
        this.candidateList = candidateList;
    }

    public CandidateList getCandidateList() {
        return candidateList;
    }

    public void setCandidateList(CandidateList candidateList) {
        this.candidateList = candidateList;
    }
}
