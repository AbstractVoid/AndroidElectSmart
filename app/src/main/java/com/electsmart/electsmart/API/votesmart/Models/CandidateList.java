package com.electsmart.electsmart.API.votesmart.Models;

import java.util.List;

/**
 * Created by Josh Kasuboski on 4/30/16.
 */
public class CandidateList {
    private GeneralInfo generalInfo;

    private List<Candidate> candidate;

    public GeneralInfo getGeneralInfo ()
    {
        return generalInfo;
    }

    public void setGeneralInfo (GeneralInfo generalInfo)
    {
        this.generalInfo = generalInfo;
    }

    public List<Candidate> getCandidate ()
    {
        return candidate;
    }

    public void setCandidate (List<Candidate> candidate)
    {
        this.candidate = candidate;
    }

    @Override
    public String toString()
    {
        return "CandidateList [generalInfo = "+generalInfo+", candidate = "+candidate+"]";
    }
}
