// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link LiveChannel} extends {@link TeaModel}
 *
 * <p>LiveChannel</p>
 */
public class LiveChannel extends TeaModel {
    @NameInMap("Description")
    private String description;

    @NameInMap("LastModified")
    private String lastModified;

    @NameInMap("Name")
    private String name;

    @NameInMap("PlayUrls")
    private LiveChannelPlayUrls playUrls;

    @NameInMap("PublishUrls")
    private LiveChannelPublishUrls publishUrls;

    @NameInMap("Status")
    private String status;


    private LiveChannel(Builder builder) {
        this.description = builder.description;
        this.lastModified = builder.lastModified;
        this.name = builder.name;
        this.playUrls = builder.playUrls;
        this.publishUrls = builder.publishUrls;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LiveChannel create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return lastModified
     */
    public String getLastModified() {
        return this.lastModified;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return playUrls
     */
    public LiveChannelPlayUrls getPlayUrls() {
        return this.playUrls;
    }

    /**
     * @return publishUrls
     */
    public LiveChannelPublishUrls getPublishUrls() {
        return this.publishUrls;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String description; 
        private String lastModified; 
        private String name; 
        private LiveChannelPlayUrls playUrls; 
        private LiveChannelPublishUrls publishUrls; 
        private String status; 

        /**
         * <p>description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder lastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>PlayUrls.</p>
         */
        public Builder playUrls(LiveChannelPlayUrls playUrls) {
            this.playUrls = playUrls;
            return this;
        }

        /**
         * <p>PublishUrls.</p>
         */
        public Builder publishUrls(LiveChannelPublishUrls publishUrls) {
            this.publishUrls = publishUrls;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public LiveChannel build() {
            return new LiveChannel(this);
        } 

    } 

}
