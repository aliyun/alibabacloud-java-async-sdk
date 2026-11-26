// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link CreateAutoLiveStreamRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateAutoLiveStreamRuleRequest</p>
 */
public class CreateAutoLiveStreamRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallBack")
    private String callBack;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelIdPrefixes")
    private java.util.List<String> channelIdPrefixes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelIds")
    private java.util.List<String> channelIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaEncode")
    private Integer mediaEncode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlayDomain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    private CreateAutoLiveStreamRuleRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.callBack = builder.callBack;
        this.channelIdPrefixes = builder.channelIdPrefixes;
        this.channelIds = builder.channelIds;
        this.mediaEncode = builder.mediaEncode;
        this.ownerId = builder.ownerId;
        this.playDomain = builder.playDomain;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAutoLiveStreamRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return callBack
     */
    public String getCallBack() {
        return this.callBack;
    }

    /**
     * @return channelIdPrefixes
     */
    public java.util.List<String> getChannelIdPrefixes() {
        return this.channelIdPrefixes;
    }

    /**
     * @return channelIds
     */
    public java.util.List<String> getChannelIds() {
        return this.channelIds;
    }

    /**
     * @return mediaEncode
     */
    public Integer getMediaEncode() {
        return this.mediaEncode;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return playDomain
     */
    public String getPlayDomain() {
        return this.playDomain;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder extends Request.Builder<CreateAutoLiveStreamRuleRequest, Builder> {
        private String appId; 
        private String callBack; 
        private java.util.List<String> channelIdPrefixes; 
        private java.util.List<String> channelIds; 
        private Integer mediaEncode; 
        private Long ownerId; 
        private String playDomain; 
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(CreateAutoLiveStreamRuleRequest request) {
            super(request);
            this.appId = request.appId;
            this.callBack = request.callBack;
            this.channelIdPrefixes = request.channelIdPrefixes;
            this.channelIds = request.channelIds;
            this.mediaEncode = request.mediaEncode;
            this.ownerId = request.ownerId;
            this.playDomain = request.playDomain;
            this.ruleName = request.ruleName;
        } 

        /**
         * <p>The application ID, which can be created and queried in the console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eo85****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The callback URL used to notify the start and end of the relay. For details about the callback content, see the CallBack callback example below.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/callback">http://example.com/callback</a></p>
         */
        public Builder callBack(String callBack) {
            this.putQueryParameter("CallBack", callBack);
            this.callBack = callBack;
            return this;
        }

        /**
         * <p>The list of channel ID prefixes that are fuzzy matched.</p>
         */
        public Builder channelIdPrefixes(java.util.List<String> channelIdPrefixes) {
            this.putQueryParameter("ChannelIdPrefixes", channelIdPrefixes);
            this.channelIdPrefixes = channelIdPrefixes;
            return this;
        }

        /**
         * <p>The list of channel IDs that are exactly matched.</p>
         */
        public Builder channelIds(java.util.List<String> channelIds) {
            this.putQueryParameter("ChannelIds", channelIds);
            this.channelIds = channelIds;
            return this;
        }

        /**
         * <p>The encoding option. For more information, see the MediaEncode enumeration values below.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder mediaEncode(Integer mediaEncode) {
            this.putQueryParameter("MediaEncode", mediaEncode);
            this.mediaEncode = mediaEncode;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The streaming domain name for automatic relay. The streaming URL of an automatic relay task is in the format rtmp://${domain}/${app}/${stream}.</p>
         * <ul>
         * <li>domain: your live streaming domain name.</li>
         * <li>app: live.</li>
         * <li>stream: urlencode(${AppId}<em>${ChannelId}</em>${UserId}_${SourceType}), where SourceType indicates the type of the input source.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://${domain}/${app}/${stream}</p>
         */
        public Builder playDomain(String playDomain) {
            this.putQueryParameter("PlayDomain", playDomain);
            this.playDomain = playDomain;
            return this;
        }

        /**
         * <p>The name of the relay rule.</p>
         * 
         * <strong>example:</strong>
         * <p>testRule</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        @Override
        public CreateAutoLiveStreamRuleRequest build() {
            return new CreateAutoLiveStreamRuleRequest(this);
        } 

    } 

}
