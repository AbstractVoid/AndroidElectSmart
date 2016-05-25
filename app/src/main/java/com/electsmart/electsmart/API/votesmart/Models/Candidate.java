package com.electsmart.electsmart.API.votesmart.Models;

import java.io.Serializable;

/**
 * Created by Josh Kasuboski on 4/30/16.
 */
public class Candidate implements Serializable
{
    public Candidate(String electionParties, String ballotName, String photoUrl, String Bio) {
        this.electionParties = electionParties;
        this.ballotName = ballotName;
        this.photoUrl = photoUrl;
        this.Bio = Bio;
    }

    private String photoUrl;

    private String electionDistrictId;

    private String officeId;

    private String Bio;

    private String officeDistrictId;

    private String officeStateId;

    private String electionParties;

    private String title;

    private String candidateId;

    private String runningMateName;

    private String nickName;

    private String officeName;

    private String electionOfficeId;

    private String officeStatus;

    private String firstName;

    private String electionOfficeTypeId;

    private String middleName;

    private String officeDistrictName;

    private String ballotName;

    private String lastName;

    private String electionYear;

    private String electionSpecial;

    private String preferredName;

    private String electionDistrictName;

    private String suffix;

    private String officeTypeId;

    private String runningMateId;

    private String electionOffice;

    private String officeParties;

    private String electionStateId;

    private String electionStage;

    private String electionDate;

    private String electionStatus;

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getElectionDistrictId ()
    {
        return electionDistrictId;
    }

    public void setElectionDistrictId (String electionDistrictId)
    {
        this.electionDistrictId = electionDistrictId;
    }

    public String getOfficeId ()
    {
        return officeId;
    }

    public void setOfficeId (String officeId)
    {
        this.officeId = officeId;
    }

    public String getOfficeDistrictId ()
    {
        return officeDistrictId;
    }

    public void setOfficeDistrictId (String officeDistrictId)
    {
        this.officeDistrictId = officeDistrictId;
    }

    public void setBio(String Bio){
        this.Bio = Bio;
    }

    public String getBio(){
        return Bio;
    }
    public String getOfficeStateId ()
    {
        return officeStateId;
    }

    public void setOfficeStateId (String officeStateId)
    {
        this.officeStateId = officeStateId;
    }

    public String getElectionParties ()
    {
        return electionParties;
    }

    public void setElectionParties (String electionParties)
    {
        this.electionParties = electionParties;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getCandidateId ()
    {
        return candidateId;
    }

    public void setCandidateId (String candidateId)
    {
        this.candidateId = candidateId;
    }

    public String getRunningMateName ()
    {
        return runningMateName;
    }

    public void setRunningMateName (String runningMateName)
    {
        this.runningMateName = runningMateName;
    }

    public String getNickName ()
    {
        return nickName;
    }

    public void setNickName (String nickName)
    {
        this.nickName = nickName;
    }

    public String getOfficeName ()
    {
        return officeName;
    }

    public void setOfficeName (String officeName)
    {
        this.officeName = officeName;
    }

    public String getElectionOfficeId ()
    {
        return electionOfficeId;
    }

    public void setElectionOfficeId (String electionOfficeId)
    {
        this.electionOfficeId = electionOfficeId;
    }

    public String getOfficeStatus ()
    {
        return officeStatus;
    }

    public void setOfficeStatus (String officeStatus)
    {
        this.officeStatus = officeStatus;
    }

    public String getFirstName ()
    {
        return firstName;
    }

    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }

    public String getElectionOfficeTypeId ()
    {
        return electionOfficeTypeId;
    }

    public void setElectionOfficeTypeId (String electionOfficeTypeId)
    {
        this.electionOfficeTypeId = electionOfficeTypeId;
    }

    public String getMiddleName ()
    {
        return middleName;
    }

    public void setMiddleName (String middleName)
    {
        this.middleName = middleName;
    }

    public String getOfficeDistrictName ()
    {
        return officeDistrictName;
    }

    public void setOfficeDistrictName (String officeDistrictName)
    {
        this.officeDistrictName = officeDistrictName;
    }

    public String getBallotName ()
    {
        return ballotName;
    }

    public void setBallotName (String ballotName)
    {
        this.ballotName = ballotName;
    }

    public String getLastName ()
    {
        return lastName;
    }

    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    public String getElectionYear ()
    {
        return electionYear;
    }

    public void setElectionYear (String electionYear)
    {
        this.electionYear = electionYear;
    }

    public String getElectionSpecial ()
    {
        return electionSpecial;
    }

    public void setElectionSpecial (String electionSpecial)
    {
        this.electionSpecial = electionSpecial;
    }

    public String getPreferredName ()
    {
        return preferredName;
    }

    public void setPreferredName (String preferredName)
    {
        this.preferredName = preferredName;
    }

    public String getElectionDistrictName ()
    {
        return electionDistrictName;
    }

    public void setElectionDistrictName (String electionDistrictName)
    {
        this.electionDistrictName = electionDistrictName;
    }

    public String getSuffix ()
    {
        return suffix;
    }

    public void setSuffix (String suffix)
    {
        this.suffix = suffix;
    }

    public String getOfficeTypeId ()
    {
        return officeTypeId;
    }

    public void setOfficeTypeId (String officeTypeId)
    {
        this.officeTypeId = officeTypeId;
    }

    public String getRunningMateId ()
    {
        return runningMateId;
    }

    public void setRunningMateId (String runningMateId)
    {
        this.runningMateId = runningMateId;
    }

    public String getElectionOffice ()
    {
        return electionOffice;
    }

    public void setElectionOffice (String electionOffice)
    {
        this.electionOffice = electionOffice;
    }

    public String getOfficeParties ()
    {
        return officeParties;
    }

    public void setOfficeParties (String officeParties)
    {
        this.officeParties = officeParties;
    }

    public String getElectionStateId ()
    {
        return electionStateId;
    }

    public void setElectionStateId (String electionStateId)
    {
        this.electionStateId = electionStateId;
    }

    public String getElectionStage ()
    {
        return electionStage;
    }

    public void setElectionStage (String electionStage)
    {
        this.electionStage = electionStage;
    }

    public String getElectionDate ()
    {
        return electionDate;
    }

    public void setElectionDate (String electionDate)
    {
        this.electionDate = electionDate;
    }

    public String getElectionStatus ()
    {
        return electionStatus;
    }

    public void setElectionStatus (String electionStatus)
    {
        this.electionStatus = electionStatus;
    }

    @Override
    public String toString()
    {
        return "Candidate [electionDistrictId = "+electionDistrictId+", officeId = "+officeId+", officeDistrictId = "+officeDistrictId+", officeStateId = "+officeStateId+", electionParties = "+electionParties+", title = "+title+", candidateId = "+candidateId+", runningMateName = "+runningMateName+", nickName = "+nickName+", officeName = "+officeName+", electionOfficeId = "+electionOfficeId+", officeStatus = "+officeStatus+", firstName = "+firstName+", electionOfficeTypeId = "+electionOfficeTypeId+", middleName = "+middleName+", officeDistrictName = "+officeDistrictName+", ballotName = "+ballotName+", lastName = "+lastName+", electionYear = "+electionYear+", electionSpecial = "+electionSpecial+", preferredName = "+preferredName+", electionDistrictName = "+electionDistrictName+", suffix = "+suffix+", officeTypeId = "+officeTypeId+", runningMateId = "+runningMateId+", electionOffice = "+electionOffice+", officeParties = "+officeParties+", electionStateId = "+electionStateId+", electionStage = "+electionStage+", electionDate = "+electionDate+", electionStatus = "+electionStatus+"]";
    }
}
