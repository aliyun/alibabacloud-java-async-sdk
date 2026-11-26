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
 * {@link RtcSendSipDtmfRequest} extends {@link RequestModel}
 *
 * <p>RtcSendSipDtmfRequest</p>
 */
public class RtcSendSipDtmfRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelUserId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 120, minLength = 1)
    private String channelUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Digits")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String digits;

    private RtcSendSipDtmfRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.channelUserId = builder.channelUserId;
        this.deviceType = builder.deviceType;
        this.digits = builder.digits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RtcSendSipDtmfRequest create() {
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
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return channelUserId
     */
    public String getChannelUserId() {
        return this.channelUserId;
    }

    /**
     * @return deviceType
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * @return digits
     */
    public String getDigits() {
        return this.digits;
    }

    public static final class Builder extends Request.Builder<RtcSendSipDtmfRequest, Builder> {
        private String appId; 
        private String channelId; 
        private String channelUserId; 
        private String deviceType; 
        private String digits; 

        private Builder() {
            super();
        } 

        private Builder(RtcSendSipDtmfRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.channelUserId = request.channelUserId;
            this.deviceType = request.deviceType;
            this.digits = request.digits;
        } 

        /**
         * <p>The application ID. You can create and query the ID in the console. Only a single ID is supported.</p>
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
         * <p>The ID of an existing channel. Only a single ID is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testid</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>The user ID (sipUserId) in the target OneRTC SIP call.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder channelUserId(String channelUserId) {
            this.putQueryParameter("ChannelUserId", channelUserId);
            this.channelUserId = channelUserId;
            return this;
        }

        /**
         * <p>The device type of the third-party Session Initiation Protocol (SIP) device. Valid values:</p>
         * <ul>
         * <li>sip_device</li>
         * <li>mcu</li>
         * <li>phone</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mcu</p>
         */
        public Builder deviceType(String deviceType) {
            this.putQueryParameter("DeviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        /**
         * <p>The keys to be sent. Supported keys include 0-9, A-D, a-d, *, #, W or w (wait), and F or f (flash). The keys are sent in the original order and case.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12#W3f</p>
         */
        public Builder digits(String digits) {
            this.putQueryParameter("Digits", digits);
            this.digits = digits;
            return this;
        }

        @Override
        public RtcSendSipDtmfRequest build() {
            return new RtcSendSipDtmfRequest(this);
        } 

    } 

}
