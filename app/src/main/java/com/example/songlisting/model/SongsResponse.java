package com.example.songlisting.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SongsResponse {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private Data data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Data {

        @SerializedName("image_path")
        @Expose
        private String imagePath;
        @SerializedName("featured")
        @Expose
        private List<Featured> featured = null;

        public String getImagePath() {
            return imagePath;
        }

        public void setImagePath(String imagePath) {
            this.imagePath = imagePath;
        }

        public List<Featured> getFeatured() {
            return featured;
        }

        public void setFeatured(List<Featured> featured) {
            this.featured = featured;
        }



    }

    public class Featured {

        @SerializedName("channels_id")
        @Expose
        private String channelsId;
        @SerializedName("channel_name")
        @Expose
        private String channelName;
        @SerializedName("logo")
        @Expose
        private String logo;
        @SerializedName("featured")
        @Expose
        private String featured;
        @SerializedName("new")
        @Expose
        private String _new;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("feeds ")
        @Expose
        private String feeds;
        @SerializedName("favourite")
        @Expose
        private String favourite;

        public String getChannelsId() {
            return channelsId;
        }

        public void setChannelsId(String channelsId) {
            this.channelsId = channelsId;
        }

        public String getChannelName() {
            return channelName;
        }

        public void setChannelName(String channelName) {
            this.channelName = channelName;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getFeatured() {
            return featured;
        }

        public void setFeatured(String featured) {
            this.featured = featured;
        }

        public String getNew() {
            return _new;
        }

        public void setNew(String _new) {
            this._new = _new;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getFeeds() {
            return feeds;
        }

        public void setFeeds(String feeds) {
            this.feeds = feeds;
        }

        public String getFavourite() {
            return favourite;
        }

        public void setFavourite(String favourite) {
            this.favourite = favourite;
        }

    }

}
