
package com.electsmart.electsmart.API.Disqus.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Avatar {

    @SerializedName("small")
    @Expose
    private Small small;
    @SerializedName("isCustom")
    @Expose
    private Boolean isCustom;
    @SerializedName("permalink")
    @Expose
    private String permalink;
    @SerializedName("cache")
    @Expose
    private String cache;
    @SerializedName("large")
    @Expose
    private Large large;

    /**
     * 
     * @return
     *     The small
     */
    public Small getSmall() {
        return small;
    }

    /**
     * 
     * @param small
     *     The small
     */
    public void setSmall(Small small) {
        this.small = small;
    }

    /**
     * 
     * @return
     *     The isCustom
     */
    public Boolean getIsCustom() {
        return isCustom;
    }

    /**
     * 
     * @param isCustom
     *     The isCustom
     */
    public void setIsCustom(Boolean isCustom) {
        this.isCustom = isCustom;
    }

    /**
     * 
     * @return
     *     The permalink
     */
    public String getPermalink() {
        return permalink;
    }

    /**
     * 
     * @param permalink
     *     The permalink
     */
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    /**
     * 
     * @return
     *     The cache
     */
    public String getCache() {
        return cache;
    }

    /**
     * 
     * @param cache
     *     The cache
     */
    public void setCache(String cache) {
        this.cache = cache;
    }

    /**
     * 
     * @return
     *     The large
     */
    public Large getLarge() {
        return large;
    }

    /**
     * 
     * @param large
     *     The large
     */
    public void setLarge(Large large) {
        this.large = large;
    }

}
