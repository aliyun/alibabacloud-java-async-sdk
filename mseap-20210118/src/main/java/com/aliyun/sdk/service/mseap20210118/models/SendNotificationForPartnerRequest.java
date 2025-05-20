// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mseap20210118.models;

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
 * {@link SendNotificationForPartnerRequest} extends {@link RequestModel}
 *
 * <p>SendNotificationForPartnerRequest</p>
 */
public class SendNotificationForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelType")
    private String channelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyType")
    private String notifyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifycationEventType")
    private String notifycationEventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamMap")
    private java.util.Map<String, String> paramMap;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendTarget")
    private String sendTarget;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartSubChannels")
    private java.util.List<String> smartSubChannels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrackId")
    private String trackId;

    private SendNotificationForPartnerRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.channelType = builder.channelType;
        this.notifyType = builder.notifyType;
        this.notifycationEventType = builder.notifycationEventType;
        this.paramMap = builder.paramMap;
        this.sendTarget = builder.sendTarget;
        this.smartSubChannels = builder.smartSubChannels;
        this.trackId = builder.trackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendNotificationForPartnerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return channelType
     */
    public String getChannelType() {
        return this.channelType;
    }

    /**
     * @return notifyType
     */
    public String getNotifyType() {
        return this.notifyType;
    }

    /**
     * @return notifycationEventType
     */
    public String getNotifycationEventType() {
        return this.notifycationEventType;
    }

    /**
     * @return paramMap
     */
    public java.util.Map<String, String> getParamMap() {
        return this.paramMap;
    }

    /**
     * @return sendTarget
     */
    public String getSendTarget() {
        return this.sendTarget;
    }

    /**
     * @return smartSubChannels
     */
    public java.util.List<String> getSmartSubChannels() {
        return this.smartSubChannels;
    }

    /**
     * @return trackId
     */
    public String getTrackId() {
        return this.trackId;
    }

    public static final class Builder extends Request.Builder<SendNotificationForPartnerRequest, Builder> {
        private String bizId; 
        private String channelType; 
        private String notifyType; 
        private String notifycationEventType; 
        private java.util.Map<String, String> paramMap; 
        private String sendTarget; 
        private java.util.List<String> smartSubChannels; 
        private String trackId; 

        private Builder() {
            super();
        } 

        private Builder(SendNotificationForPartnerRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.channelType = request.channelType;
            this.notifyType = request.notifyType;
            this.notifycationEventType = request.notifycationEventType;
            this.paramMap = request.paramMap;
            this.sendTarget = request.sendTarget;
            this.smartSubChannels = request.smartSubChannels;
            this.trackId = request.trackId;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ChannelType.
         */
        public Builder channelType(String channelType) {
            this.putQueryParameter("ChannelType", channelType);
            this.channelType = channelType;
            return this;
        }

        /**
         * NotifyType.
         */
        public Builder notifyType(String notifyType) {
            this.putQueryParameter("NotifyType", notifyType);
            this.notifyType = notifyType;
            return this;
        }

        /**
         * NotifycationEventType.
         */
        public Builder notifycationEventType(String notifycationEventType) {
            this.putQueryParameter("NotifycationEventType", notifycationEventType);
            this.notifycationEventType = notifycationEventType;
            return this;
        }

        /**
         * ParamMap.
         */
        public Builder paramMap(java.util.Map<String, String> paramMap) {
            String paramMapShrink = shrink(paramMap, "ParamMap", "json");
            this.putQueryParameter("ParamMap", paramMapShrink);
            this.paramMap = paramMap;
            return this;
        }

        /**
         * SendTarget.
         */
        public Builder sendTarget(String sendTarget) {
            this.putQueryParameter("SendTarget", sendTarget);
            this.sendTarget = sendTarget;
            return this;
        }

        /**
         * SmartSubChannels.
         */
        public Builder smartSubChannels(java.util.List<String> smartSubChannels) {
            String smartSubChannelsShrink = shrink(smartSubChannels, "SmartSubChannels", "json");
            this.putQueryParameter("SmartSubChannels", smartSubChannelsShrink);
            this.smartSubChannels = smartSubChannels;
            return this;
        }

        /**
         * TrackId.
         */
        public Builder trackId(String trackId) {
            this.putQueryParameter("TrackId", trackId);
            this.trackId = trackId;
            return this;
        }

        @Override
        public SendNotificationForPartnerRequest build() {
            return new SendNotificationForPartnerRequest(this);
        } 

    } 

}
