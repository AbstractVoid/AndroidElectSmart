package com.electsmart.electsmart.Models;

import com.electsmart.electsmart.Adapters.UpcomingElectionsAdapter;

/**
 * Created by brand on 3/11/2016.
 */
public class UpcomingElectionRow {
    private Election left;
    private Election right;

    public UpcomingElectionRow(Election electionLeft, Election electionRight){
        this.left = electionLeft;
        this.right = electionRight;
    }

    public boolean equals(Object obj){
        return (this.left.equals(((UpcomingElectionRow) obj).left) && this.right.equals(((UpcomingElectionRow) obj).right));
    }

    public Election getLeft(){
        return this.left;
    }
    public Election getRight(){
        return this.right;
    }
}
