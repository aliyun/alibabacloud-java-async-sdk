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
 * {@link CreateChannelRequest} extends {@link RequestModel}
 *
 * <p>CreateChannelRequest</p>
 */
public class CreateChannelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPolicy")
    private Boolean accessPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelTier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelTier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FillerSourceLocationName")
    private String fillerSourceLocationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FillerSourceName")
    private String fillerSourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutPutConfigList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outPutConfigList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlaybackMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playbackMode;

    private CreateChannelRequest(Builder builder) {
        super(builder);
        this.accessPolicy = builder.accessPolicy;
        this.accessToken = builder.accessToken;
        this.channelName = builder.channelName;
        this.channelTier = builder.channelTier;
        this.fillerSourceLocationName = builder.fillerSourceLocationName;
        this.fillerSourceName = builder.fillerSourceName;
        this.outPutConfigList = builder.outPutConfigList;
        this.playbackMode = builder.playbackMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChannelRequest create() {
        return builder().build();
    }

    @Override
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
     * @return outPutConfigList
     */
    public String getOutPutConfigList() {
        return this.outPutConfigList;
    }

    /**
     * @return playbackMode
     */
    public String getPlaybackMode() {
        return this.playbackMode;
    }

    public static final class Builder extends Request.Builder<CreateChannelRequest, Builder> {
        private Boolean accessPolicy; 
        private String accessToken; 
        private String channelName; 
        private String channelTier; 
        private String fillerSourceLocationName; 
        private String fillerSourceName; 
        private String outPutConfigList; 
        private String playbackMode; 

        private Builder() {
            super();
        } 

        private Builder(CreateChannelRequest request) {
            super(request);
            this.accessPolicy = request.accessPolicy;
            this.accessToken = request.accessToken;
            this.channelName = request.channelName;
            this.channelTier = request.channelTier;
            this.fillerSourceLocationName = request.fillerSourceLocationName;
            this.fillerSourceName = request.fillerSourceName;
            this.outPutConfigList = request.outPutConfigList;
            this.playbackMode = request.playbackMode;
        } 

        /**
         * AccessPolicy.
         */
        public Builder accessPolicy(Boolean accessPolicy) {
            this.putQueryParameter("AccessPolicy", accessPolicy);
            this.accessPolicy = accessPolicy;
            return this;
        }

        /**
         * AccessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("AccessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyChannel</p>
         */
        public Builder channelName(String channelName) {
            this.putQueryParameter("ChannelName", channelName);
            this.channelName = channelName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        public Builder channelTier(String channelTier) {
            this.putQueryParameter("ChannelTier", channelTier);
            this.channelTier = channelTier;
            return this;
        }

        /**
         * FillerSourceLocationName.
         */
        public Builder fillerSourceLocationName(String fillerSourceLocationName) {
            this.putQueryParameter("FillerSourceLocationName", fillerSourceLocationName);
            this.fillerSourceLocationName = fillerSourceLocationName;
            return this;
        }

        /**
         * FillerSourceName.
         */
        public Builder fillerSourceName(String fillerSourceName) {
            this.putQueryParameter("FillerSourceName", fillerSourceName);
            this.fillerSourceName = fillerSourceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{
         *     &quot;ManifestName&quot;: &quot;manifest-1&quot;,
         *     &quot;Format&quot;: &quot;HLS&quot;,
         *     &quot;SourceGroupName&quot;: &quot;source-group-1&quot;,
         *     &quot;ManifestSettings&quot;: {
         *         &quot;WindowDuration&quot;: 60,
         *         &quot;AdMarkType&quot;: &quot;Daterange&quot;
         *     }
         * }]</p>
         */
        public Builder outPutConfigList(String outPutConfigList) {
            this.putQueryParameter("OutPutConfigList", outPutConfigList);
            this.outPutConfigList = outPutConfigList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>loop</p>
         */
        public Builder playbackMode(String playbackMode) {
            this.putQueryParameter("PlaybackMode", playbackMode);
            this.playbackMode = playbackMode;
            return this;
        }

        @Override
        public CreateChannelRequest build() {
            return new CreateChannelRequest(this);
        } 

    } 

}
