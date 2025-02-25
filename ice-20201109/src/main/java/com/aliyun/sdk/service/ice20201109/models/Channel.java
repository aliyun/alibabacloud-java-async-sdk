// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Channel} extends {@link TeaModel}
 *
 * <p>Channel</p>
 */
public class Channel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessPolicy")
    private Boolean accessPolicy;

    @com.aliyun.core.annotation.NameInMap("AccessToken")
    private String accessToken;

    @com.aliyun.core.annotation.NameInMap("Arn")
    private String arn;

    @com.aliyun.core.annotation.NameInMap("ChannelName")
    private String channelName;

    @com.aliyun.core.annotation.NameInMap("ChannelTier")
    private String channelTier;

    @com.aliyun.core.annotation.NameInMap("FillerSourceLocationName")
    private String fillerSourceLocationName;

    @com.aliyun.core.annotation.NameInMap("FillerSourceName")
    private String fillerSourceName;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("OutPutConfigList")
    private java.util.List<OutPutConfigList> outPutConfigList;

    @com.aliyun.core.annotation.NameInMap("PlaybackMode")
    private String playbackMode;

    @com.aliyun.core.annotation.NameInMap("State")
    private Integer state;

    private Channel(Builder builder) {
        this.accessPolicy = builder.accessPolicy;
        this.accessToken = builder.accessToken;
        this.arn = builder.arn;
        this.channelName = builder.channelName;
        this.channelTier = builder.channelTier;
        this.fillerSourceLocationName = builder.fillerSourceLocationName;
        this.fillerSourceName = builder.fillerSourceName;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.outPutConfigList = builder.outPutConfigList;
        this.playbackMode = builder.playbackMode;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Channel create() {
        return builder().build();
    }

    /**
     * @return accessPolicy
     */
    public Boolean getAccessPolicy() {
        return this.accessPolicy;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * @return channelName
     */
    public String getChannelName() {
        return this.channelName;
    }

    /**
     * @return channelTier
     */
    public String getChannelTier() {
        return this.channelTier;
    }

    /**
     * @return fillerSourceLocationName
     */
    public String getFillerSourceLocationName() {
        return this.fillerSourceLocationName;
    }

    /**
     * @return fillerSourceName
     */
    public String getFillerSourceName() {
        return this.fillerSourceName;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return outPutConfigList
     */
    public java.util.List<OutPutConfigList> getOutPutConfigList() {
        return this.outPutConfigList;
    }

    /**
     * @return playbackMode
     */
    public String getPlaybackMode() {
        return this.playbackMode;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return this.state;
    }

    public static final class Builder {
        private Boolean accessPolicy; 
        private String accessToken; 
        private String arn; 
        private String channelName; 
        private String channelTier; 
        private String fillerSourceLocationName; 
        private String fillerSourceName; 
        private String gmtCreate; 
        private String gmtModified; 
        private java.util.List<OutPutConfigList> outPutConfigList; 
        private String playbackMode; 
        private Integer state; 

        /**
         * AccessPolicy.
         */
        public Builder accessPolicy(Boolean accessPolicy) {
            this.accessPolicy = accessPolicy;
            return this;
        }

        /**
         * AccessToken.
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * Arn.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * ChannelName.
         */
        public Builder channelName(String channelName) {
            this.channelName = channelName;
            return this;
        }

        /**
         * ChannelTier.
         */
        public Builder channelTier(String channelTier) {
            this.channelTier = channelTier;
            return this;
        }

        /**
         * FillerSourceLocationName.
         */
        public Builder fillerSourceLocationName(String fillerSourceLocationName) {
            this.fillerSourceLocationName = fillerSourceLocationName;
            return this;
        }

        /**
         * FillerSourceName.
         */
        public Builder fillerSourceName(String fillerSourceName) {
            this.fillerSourceName = fillerSourceName;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * OutPutConfigList.
         */
        public Builder outPutConfigList(java.util.List<OutPutConfigList> outPutConfigList) {
            this.outPutConfigList = outPutConfigList;
            return this;
        }

        /**
         * PlaybackMode.
         */
        public Builder playbackMode(String playbackMode) {
            this.playbackMode = playbackMode;
            return this;
        }

        /**
         * State.
         */
        public Builder state(Integer state) {
            this.state = state;
            return this;
        }

        public Channel build() {
            return new Channel(this);
        } 

    } 

    /**
     * 
     * {@link Channel} extends {@link TeaModel}
     *
     * <p>Channel</p>
     */
    public static class OutPutConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelName")
        private String channelName;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("ManifestName")
        private String manifestName;

        @com.aliyun.core.annotation.NameInMap("ManifestSettings")
        private String manifestSettings;

        @com.aliyun.core.annotation.NameInMap("PlaybackUrl")
        private String playbackUrl;

        @com.aliyun.core.annotation.NameInMap("SourceGroupName")
        private String sourceGroupName;

        private OutPutConfigList(Builder builder) {
            this.channelName = builder.channelName;
            this.format = builder.format;
            this.manifestName = builder.manifestName;
            this.manifestSettings = builder.manifestSettings;
            this.playbackUrl = builder.playbackUrl;
            this.sourceGroupName = builder.sourceGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutPutConfigList create() {
            return builder().build();
        }

        /**
         * @return channelName
         */
        public String getChannelName() {
            return this.channelName;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return manifestName
         */
        public String getManifestName() {
            return this.manifestName;
        }

        /**
         * @return manifestSettings
         */
        public String getManifestSettings() {
            return this.manifestSettings;
        }

        /**
         * @return playbackUrl
         */
        public String getPlaybackUrl() {
            return this.playbackUrl;
        }

        /**
         * @return sourceGroupName
         */
        public String getSourceGroupName() {
            return this.sourceGroupName;
        }

        public static final class Builder {
            private String channelName; 
            private String format; 
            private String manifestName; 
            private String manifestSettings; 
            private String playbackUrl; 
            private String sourceGroupName; 

            /**
             * ChannelName.
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * ManifestName.
             */
            public Builder manifestName(String manifestName) {
                this.manifestName = manifestName;
                return this;
            }

            /**
             * ManifestSettings.
             */
            public Builder manifestSettings(String manifestSettings) {
                this.manifestSettings = manifestSettings;
                return this;
            }

            /**
             * PlaybackUrl.
             */
            public Builder playbackUrl(String playbackUrl) {
                this.playbackUrl = playbackUrl;
                return this;
            }

            /**
             * SourceGroupName.
             */
            public Builder sourceGroupName(String sourceGroupName) {
                this.sourceGroupName = sourceGroupName;
                return this;
            }

            public OutPutConfigList build() {
                return new OutPutConfigList(this);
            } 

        } 

    }
}
