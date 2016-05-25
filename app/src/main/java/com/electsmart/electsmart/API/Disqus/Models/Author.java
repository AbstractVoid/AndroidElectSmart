
package com.electsmart.electsmart.API.Disqus.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Author {

    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("about")
    @Expose
    private String about;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("disable3rdPartyTrackers")
    @Expose
    private Boolean disable3rdPartyTrackers;
    @SerializedName("isPowerContributor")
    @Expose
    private Boolean isPowerContributor;
    @SerializedName("isAnonymous")
    @Expose
    private Boolean isAnonymous;
    @SerializedName("rep")
    @Expose
    private Double rep;
    @SerializedName("profileUrl")
    @Expose
    private String profileUrl;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("reputation")
    @Expose
    private Double reputation;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("isPrivate")
    @Expose
    private Boolean isPrivate;
    @SerializedName("signedUrl")
    @Expose
    private String signedUrl;
    @SerializedName("isPrimary")
    @Expose
    private Boolean isPrimary;
    @SerializedName("joinedAt")
    @Expose
    private String joinedAt;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("avatar")
    @Expose
    private Avatar avatar;

    /**
     * 
     * @return
     *     The username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 
     * @param username
     *     The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 
     * @return
     *     The about
     */
    public String getAbout() {
        return about;
    }

    /**
     * 
     * @param about
     *     The about
     */
    public void setAbout(String about) {
        this.about = about;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The disable3rdPartyTrackers
     */
    public Boolean getDisable3rdPartyTrackers() {
        return disable3rdPartyTrackers;
    }

    /**
     * 
     * @param disable3rdPartyTrackers
     *     The disable3rdPartyTrackers
     */
    public void setDisable3rdPartyTrackers(Boolean disable3rdPartyTrackers) {
        this.disable3rdPartyTrackers = disable3rdPartyTrackers;
    }

    /**
     * 
     * @return
     *     The isPowerContributor
     */
    public Boolean getIsPowerContributor() {
        return isPowerContributor;
    }

    /**
     * 
     * @param isPowerContributor
     *     The isPowerContributor
     */
    public void setIsPowerContributor(Boolean isPowerContributor) {
        this.isPowerContributor = isPowerContributor;
    }

    /**
     * 
     * @return
     *     The isAnonymous
     */
    public Boolean getIsAnonymous() {
        return isAnonymous;
    }

    /**
     * 
     * @param isAnonymous
     *     The isAnonymous
     */
    public void setIsAnonymous(Boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    /**
     * 
     * @return
     *     The rep
     */
    public Double getRep() {
        return rep;
    }

    /**
     * 
     * @param rep
     *     The rep
     */
    public void setRep(Double rep) {
        this.rep = rep;
    }

    /**
     * 
     * @return
     *     The profileUrl
     */
    public String getProfileUrl() {
        return profileUrl;
    }

    /**
     * 
     * @param profileUrl
     *     The profileUrl
     */
    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The reputation
     */
    public Double getReputation() {
        return reputation;
    }

    /**
     * 
     * @param reputation
     *     The reputation
     */
    public void setReputation(Double reputation) {
        this.reputation = reputation;
    }

    /**
     * 
     * @return
     *     The location
     */
    public String getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The isPrivate
     */
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    /**
     * 
     * @param isPrivate
     *     The isPrivate
     */
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    /**
     * 
     * @return
     *     The signedUrl
     */
    public String getSignedUrl() {
        return signedUrl;
    }

    /**
     * 
     * @param signedUrl
     *     The signedUrl
     */
    public void setSignedUrl(String signedUrl) {
        this.signedUrl = signedUrl;
    }

    /**
     * 
     * @return
     *     The isPrimary
     */
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    /**
     * 
     * @param isPrimary
     *     The isPrimary
     */
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    /**
     * 
     * @return
     *     The joinedAt
     */
    public String getJoinedAt() {
        return joinedAt;
    }

    /**
     * 
     * @param joinedAt
     *     The joinedAt
     */
    public void setJoinedAt(String joinedAt) {
        this.joinedAt = joinedAt;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The avatar
     */
    public Avatar getAvatar() {
        return avatar;
    }

    /**
     * 
     * @param avatar
     *     The avatar
     */
    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

}
