// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAutoLiveStreamRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateAutoLiveStreamRuleRequest</p>
 */
public class UpdateAutoLiveStreamRuleRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("CallBack")
    private String callBack;

    @Query
    @NameInMap("ChannelIdPrefixes")
    private java.util.List < String > channelIdPrefixes;

    @Query
    @NameInMap("ChannelIds")
    private java.util.List < String > channelIds;

    @Query
    @NameInMap("MediaEncode")
    private Integer mediaEncode;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PlayDomain")
    @Validation(required = true)
    private String playDomain;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private Integer ruleId;

    @Query
    @NameInMap("RuleName")
    private String ruleName;

    private UpdateAutoLiveStreamRuleRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.callBack = builder.callBack;
        this.channelIdPrefixes = builder.channelIdPrefixes;
        this.channelIds = builder.channelIds;
        this.mediaEncode = builder.mediaEncode;
        this.ownerId = builder.ownerId;
        this.playDomain = builder.playDomain;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAutoLiveStreamRuleRequest create() {
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
    public java.util.List < String > getChannelIdPrefixes() {
        return this.channelIdPrefixes;
    }

    /**
     * @return channelIds
     */
    public java.util.List < String > getChannelIds() {
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
     * @return ruleId
     */
    public Integer getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder extends Request.Builder<UpdateAutoLiveStreamRuleRequest, Builder> {
        private String appId; 
        private String callBack; 
        private java.util.List < String > channelIdPrefixes; 
        private java.util.List < String > channelIds; 
        private Integer mediaEncode; 
        private Long ownerId; 
        private String playDomain; 
        private Integer ruleId; 
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAutoLiveStreamRuleRequest response) {
            super(response);
            this.appId = response.appId;
            this.callBack = response.callBack;
            this.channelIdPrefixes = response.channelIdPrefixes;
            this.channelIds = response.channelIds;
            this.mediaEncode = response.mediaEncode;
            this.ownerId = response.ownerId;
            this.playDomain = response.playDomain;
            this.ruleId = response.ruleId;
            this.ruleName = response.ruleName;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * CallBack.
         */
        public Builder callBack(String callBack) {
            this.putQueryParameter("CallBack", callBack);
            this.callBack = callBack;
            return this;
        }

        /**
         * ChannelIdPrefixes.
         */
        public Builder channelIdPrefixes(java.util.List < String > channelIdPrefixes) {
            this.putQueryParameter("ChannelIdPrefixes", channelIdPrefixes);
            this.channelIdPrefixes = channelIdPrefixes;
            return this;
        }

        /**
         * ChannelIds.
         */
        public Builder channelIds(java.util.List < String > channelIds) {
            this.putQueryParameter("ChannelIds", channelIds);
            this.channelIds = channelIds;
            return this;
        }

        /**
         * MediaEncode.
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
         * PlayDomain.
         */
        public Builder playDomain(String playDomain) {
            this.putQueryParameter("PlayDomain", playDomain);
            this.playDomain = playDomain;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(Integer ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        @Override
        public UpdateAutoLiveStreamRuleRequest build() {
            return new UpdateAutoLiveStreamRuleRequest(this);
        } 

    } 

}
