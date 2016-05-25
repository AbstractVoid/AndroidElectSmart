
package com.electsmart.electsmart.API.Disqus.Models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("forum")
    @Expose
    private String forum;
    @SerializedName("parent")
    @Expose
    private Object parent;
    @SerializedName("isApproved")
    @Expose
    private Boolean isApproved;
    @SerializedName("author")
    @Expose
    private Author author;
    @SerializedName("media")
    @Expose
    private List<Object> media = new ArrayList<Object>();
    @SerializedName("isDeleted")
    @Expose
    private Boolean isDeleted;
    @SerializedName("isFlagged")
    @Expose
    private Boolean isFlagged;
    @SerializedName("dislikes")
    @Expose
    private Integer dislikes;
    @SerializedName("raw_message")
    @Expose
    private String rawMessage;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("thread")
    @Expose
    private String thread;
    @SerializedName("numReports")
    @Expose
    private Integer numReports;
    @SerializedName("isDeletedByAuthor")
    @Expose
    private Boolean isDeletedByAuthor;
    @SerializedName("likes")
    @Expose
    private Integer likes;
    @SerializedName("isEdited")
    @Expose
    private Boolean isEdited;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("isSpam")
    @Expose
    private Boolean isSpam;
    @SerializedName("isHighlighted")
    @Expose
    private Boolean isHighlighted;
    @SerializedName("points")
    @Expose
    private Integer points;

    /**
     * 
     * @return
     *     The forum
     */
    public String getForum() {
        return forum;
    }

    /**
     * 
     * @param forum
     *     The forum
     */
    public void setForum(String forum) {
        this.forum = forum;
    }

    /**
     * 
     * @return
     *     The parent
     */
    public Object getParent() {
        return parent;
    }

    /**
     * 
     * @param parent
     *     The parent
     */
    public void setParent(Object parent) {
        this.parent = parent;
    }

    /**
     * 
     * @return
     *     The isApproved
     */
    public Boolean getIsApproved() {
        return isApproved;
    }

    /**
     * 
     * @param isApproved
     *     The isApproved
     */
    public void setIsApproved(Boolean isApproved) {
        this.isApproved = isApproved;
    }

    /**
     * 
     * @return
     *     The author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * 
     * @param author
     *     The author
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * 
     * @return
     *     The media
     */
    public List<Object> getMedia() {
        return media;
    }

    /**
     * 
     * @param media
     *     The media
     */
    public void setMedia(List<Object> media) {
        this.media = media;
    }

    /**
     * 
     * @return
     *     The isDeleted
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * 
     * @param isDeleted
     *     The isDeleted
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 
     * @return
     *     The isFlagged
     */
    public Boolean getIsFlagged() {
        return isFlagged;
    }

    /**
     * 
     * @param isFlagged
     *     The isFlagged
     */
    public void setIsFlagged(Boolean isFlagged) {
        this.isFlagged = isFlagged;
    }

    /**
     * 
     * @return
     *     The dislikes
     */
    public Integer getDislikes() {
        return dislikes;
    }

    /**
     * 
     * @param dislikes
     *     The dislikes
     */
    public void setDislikes(Integer dislikes) {
        this.dislikes = dislikes;
    }

    /**
     * 
     * @return
     *     The rawMessage
     */
    public String getRawMessage() {
        return rawMessage;
    }

    /**
     * 
     * @param rawMessage
     *     The raw_message
     */
    public void setRawMessage(String rawMessage) {
        this.rawMessage = rawMessage;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The createdAt
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
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
     *     The thread
     */
    public String getThread() {
        return thread;
    }

    /**
     * 
     * @param thread
     *     The thread
     */
    public void setThread(String thread) {
        this.thread = thread;
    }

    /**
     * 
     * @return
     *     The numReports
     */
    public Integer getNumReports() {
        return numReports;
    }

    /**
     * 
     * @param numReports
     *     The numReports
     */
    public void setNumReports(Integer numReports) {
        this.numReports = numReports;
    }

    /**
     * 
     * @return
     *     The isDeletedByAuthor
     */
    public Boolean getIsDeletedByAuthor() {
        return isDeletedByAuthor;
    }

    /**
     * 
     * @param isDeletedByAuthor
     *     The isDeletedByAuthor
     */
    public void setIsDeletedByAuthor(Boolean isDeletedByAuthor) {
        this.isDeletedByAuthor = isDeletedByAuthor;
    }

    /**
     * 
     * @return
     *     The likes
     */
    public Integer getLikes() {
        return likes;
    }

    /**
     * 
     * @param likes
     *     The likes
     */
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    /**
     * 
     * @return
     *     The isEdited
     */
    public Boolean getIsEdited() {
        return isEdited;
    }

    /**
     * 
     * @param isEdited
     *     The isEdited
     */
    public void setIsEdited(Boolean isEdited) {
        this.isEdited = isEdited;
    }

    /**
     * 
     * @return
     *     The message
     */
    public String getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 
     * @return
     *     The isSpam
     */
    public Boolean getIsSpam() {
        return isSpam;
    }

    /**
     * 
     * @param isSpam
     *     The isSpam
     */
    public void setIsSpam(Boolean isSpam) {
        this.isSpam = isSpam;
    }

    /**
     * 
     * @return
     *     The isHighlighted
     */
    public Boolean getIsHighlighted() {
        return isHighlighted;
    }

    /**
     * 
     * @param isHighlighted
     *     The isHighlighted
     */
    public void setIsHighlighted(Boolean isHighlighted) {
        this.isHighlighted = isHighlighted;
    }

    /**
     * 
     * @return
     *     The points
     */
    public Integer getPoints() {
        return points;
    }

    /**
     * 
     * @param points
     *     The points
     */
    public void setPoints(Integer points) {
        this.points = points;
    }

}
