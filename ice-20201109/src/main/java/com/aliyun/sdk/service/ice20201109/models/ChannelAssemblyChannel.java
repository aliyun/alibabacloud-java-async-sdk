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
 * {@link ChannelAssemblyChannel} extends {@link TeaModel}
 *
 * <p>ChannelAssemblyChannel</p>
 */
public class ChannelAssemblyChannel extends TeaModel {
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

    private ChannelAssemblyChannel(Builder builder) {
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

    public static ChannelAssemblyChannel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ChannelAssemblyChannel model) {
            this.accessPolicy = model.accessPolicy;
            this.accessToken = model.accessToken;
            this.arn = model.arn;
            this.channelName = model.channelName;
            this.channelTier = model.channelTier;
            this.fillerSourceLocationName = model.fillerSourceLocationName;
            this.fillerSourceName = model.fillerSourceName;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.outPutConfigList = model.outPutConfigList;
            this.playbackMode = model.playbackMode;
            this.state = model.state;
        } 

        /**
         * <p>Specifies whether to enable access control.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder accessPolicy(Boolean accessPolicy) {
            this.accessPolicy = accessPolicy;
            return this;
        }

        /**
         * <p>The token for accessing the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * <p>The ARN of the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ims:mediaweaver:<regionId>:<userId>:channel/myChannel</p>
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * <p>The name of the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>MyChannel</p>
         */
        public Builder channelName(String channelName) {
            this.channelName = channelName;
            return this;
        }

        /**
         * <p>The tier of the channel. Valid values: basic and standard.</p>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        public Builder channelTier(String channelTier) {
            this.channelTier = channelTier;
            return this;
        }

        /**
         * <p>The source location of the filler slate.</p>
         * 
         * <strong>example:</strong>
         * <p>MySourceLocation</p>
         */
        public Builder fillerSourceLocationName(String fillerSourceLocationName) {
            this.fillerSourceLocationName = fillerSourceLocationName;
            return this;
        }

        /**
         * <p>The source name of the filler slate.</p>
         * 
         * <strong>example:</strong>
         * <p>MySource</p>
         */
        public Builder fillerSourceName(String fillerSourceName) {
            this.fillerSourceName = fillerSourceName;
            return this;
        }

        /**
         * <p>The time when the channel was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-15T03:44:16Z</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The time when the channel was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-01T10:09Z</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The channel output configurations.</p>
         */
        public Builder outPutConfigList(java.util.List<OutPutConfigList> outPutConfigList) {
            this.outPutConfigList = outPutConfigList;
            return this;
        }

        /**
         * <p>The playback mode. Valid values: loop and linear.</p>
         * 
         * <strong>example:</strong>
         * <p>loop</p>
         */
        public Builder playbackMode(String playbackMode) {
            this.playbackMode = playbackMode;
            return this;
        }

        /**
         * <p>The channel status. A value of 0 specifies stopped. A value of 1 specifies running.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder state(Integer state) {
            this.state = state;
            return this;
        }

        public ChannelAssemblyChannel build() {
            return new ChannelAssemblyChannel(this);
        } 

    } 

    /**
     * 
     * {@link ChannelAssemblyChannel} extends {@link TeaModel}
     *
     * <p>ChannelAssemblyChannel</p>
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

            private Builder() {
            } 

            private Builder(OutPutConfigList model) {
                this.channelName = model.channelName;
                this.format = model.format;
                this.manifestName = model.manifestName;
                this.manifestSettings = model.manifestSettings;
                this.playbackUrl = model.playbackUrl;
                this.sourceGroupName = model.sourceGroupName;
            } 

            /**
             * <p>The name of the channel.</p>
             * 
             * <strong>example:</strong>
             * <p>MyChannel</p>
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * <p>The streaming protocol. Only HTTP Live Streaming (HLS) is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>hls</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The name of the manifest file.</p>
             * 
             * <strong>example:</strong>
             * <p>index1</p>
             */
            public Builder manifestName(String manifestName) {
                this.manifestName = manifestName;
                return this;
            }

            /**
             * <p>The manifest settings.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;WindowDuration&quot;: 60,&quot;AdMarkType&quot;:&quot;Daterange&quot;}</p>
             */
            public Builder manifestSettings(String manifestSettings) {
                this.manifestSettings = manifestSettings;
                return this;
            }

            /**
             * <p>The playback URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxxxx.com/xxx.m3u8">https://xxxxx.com/xxx.m3u8</a></p>
             */
            public Builder playbackUrl(String playbackUrl) {
                this.playbackUrl = playbackUrl;
                return this;
            }

            /**
             * <p>The name of the source group.</p>
             * 
             * <strong>example:</strong>
             * <p>group1</p>
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
