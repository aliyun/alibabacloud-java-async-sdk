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
    @NameInMap("Name")
    private String name;

    @NameInMap("Description")
    private String description;

    @NameInMap("Status")
    private String status;

    @NameInMap("LastModified")
    private String lastModified;

    @NameInMap("PublishUrls")
    private LiveChannelPublishUrls publishUrls;

    @NameInMap("PlayUrls")
    private LiveChannelPlayUrls playUrls;


    private LiveChannel(Builder builder) {
        this.name = builder.name;
        this.description = builder.description;
        this.status = builder.status;
        this.lastModified = builder.lastModified;
        this.publishUrls = builder.publishUrls;
        this.playUrls = builder.playUrls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LiveChannel create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String name() {
        return this.name;
    }

    /**
     * @return description
     */
    public String description() {
        return this.description;
    }

    /**
     * @return status
     */
    public String status() {
        return this.status;
    }

    /**
     * @return lastModified
     */
    public String lastModified() {
        return this.lastModified;
    }

    /**
     * @return publishUrls
     */
    public LiveChannelPublishUrls publishUrls() {
        return this.publishUrls;
    }

    /**
     * @return playUrls
     */
    public LiveChannelPlayUrls playUrls() {
        return this.playUrls;
    }

    public static final class Builder {
        private String name; 
        private String description; 
        private String status; 
        private String lastModified; 
        private LiveChannelPublishUrls publishUrls; 
        private LiveChannelPlayUrls playUrls; 

        /**
         * <p>description</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

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
        public Builder status(String status) {
            this.status = status;
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
         * <p>PublishUrls.</p>
         */
        public Builder publishUrls(LiveChannelPublishUrls publishUrls) {
            this.publishUrls = publishUrls;
            return this;
        }

        /**
         * <p>PlayUrls.</p>
         */
        public Builder playUrls(LiveChannelPlayUrls playUrls) {
            this.playUrls = playUrls;
            return this;
        }

        public LiveChannel build() {
            return new LiveChannel(this);
        } 

    } 

}
