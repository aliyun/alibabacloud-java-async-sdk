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
 * {@link RtcSipInviteMemberRequest} extends {@link RequestModel}
 *
 * <p>RtcSipInviteMemberRequest</p>
 */
public class RtcSipInviteMemberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppToken")
    private String appToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallNumber")
    @com.aliyun.core.annotation.Validation(maxLength = 30)
    private String callNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Registered")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean registered;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerAddress")
    private String serverAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SipDisplayName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 200, minLength = 1)
    private String sipDisplayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SipRoomId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sipRoomId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SipUri")
    private String sipUri;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SipUserAgent")
    private String sipUserAgent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SipUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sipUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SipUserPassword")
    private String sipUserPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(maxLength = 100)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uid;

    private RtcSipInviteMemberRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appToken = builder.appToken;
        this.callNumber = builder.callNumber;
        this.channelId = builder.channelId;
        this.deviceType = builder.deviceType;
        this.registered = builder.registered;
        this.serverAddress = builder.serverAddress;
        this.sipDisplayName = builder.sipDisplayName;
        this.sipRoomId = builder.sipRoomId;
        this.sipUri = builder.sipUri;
        this.sipUserAgent = builder.sipUserAgent;
        this.sipUserId = builder.sipUserId;
        this.sipUserPassword = builder.sipUserPassword;
        this.taskId = builder.taskId;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RtcSipInviteMemberRequest create() {
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
     * @return appToken
     */
    public String getAppToken() {
        return this.appToken;
    }

    /**
     * @return callNumber
     */
    public String getCallNumber() {
        return this.callNumber;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return deviceType
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * @return registered
     */
    public Boolean getRegistered() {
        return this.registered;
    }

    /**
     * @return serverAddress
     */
    public String getServerAddress() {
        return this.serverAddress;
    }

    /**
     * @return sipDisplayName
     */
    public String getSipDisplayName() {
        return this.sipDisplayName;
    }

    /**
     * @return sipRoomId
     */
    public String getSipRoomId() {
        return this.sipRoomId;
    }

    /**
     * @return sipUri
     */
    public String getSipUri() {
        return this.sipUri;
    }

    /**
     * @return sipUserAgent
     */
    public String getSipUserAgent() {
        return this.sipUserAgent;
    }

    /**
     * @return sipUserId
     */
    public String getSipUserId() {
        return this.sipUserId;
    }

    /**
     * @return sipUserPassword
     */
    public String getSipUserPassword() {
        return this.sipUserPassword;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<RtcSipInviteMemberRequest, Builder> {
        private String appId; 
        private String appToken; 
        private String callNumber; 
        private String channelId; 
        private String deviceType; 
        private Boolean registered; 
        private String serverAddress; 
        private String sipDisplayName; 
        private String sipRoomId; 
        private String sipUri; 
        private String sipUserAgent; 
        private String sipUserId; 
        private String sipUserPassword; 
        private String taskId; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(RtcSipInviteMemberRequest request) {
            super(request);
            this.appId = request.appId;
            this.appToken = request.appToken;
            this.callNumber = request.callNumber;
            this.channelId = request.channelId;
            this.deviceType = request.deviceType;
            this.registered = request.registered;
            this.serverAddress = request.serverAddress;
            this.sipDisplayName = request.sipDisplayName;
            this.sipRoomId = request.sipRoomId;
            this.sipUri = request.sipUri;
            this.sipUserAgent = request.sipUserAgent;
            this.sipUserId = request.sipUserId;
            this.sipUserPassword = request.sipUserPassword;
            this.taskId = request.taskId;
            this.uid = request.uid;
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
         * <p>The meeting token. For code generation, refer to <a href="https://help.aliyun.com/document_detail/2689025.html">https://help.aliyun.com/document_detail/2689025.html</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>000qaaasas……b</p>
         */
        public Builder appToken(String appToken) {
            this.putQueryParameter("AppToken", appToken);
            this.appToken = appToken;
            return this;
        }

        /**
         * <p>The custom line number in PSTN scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>055112345678</p>
         */
        public Builder callNumber(String callNumber) {
            this.putQueryParameter("CallNumber", callNumber);
            this.callNumber = callNumber;
            return this;
        }

        /**
         * <p>The channel ID. Only a single ID is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>$rtc_channelid</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>The type of the device used to call the third-party SIP endpoint. Valid values:</p>
         * <ul>
         * <li>sip_device</li>
         * <li>mcu</li>
         * <li>phone</li>
         * </ul>
         * <p>Note: Currently, only the phone type is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>phone</p>
         */
        public Builder deviceType(String deviceType) {
            this.putQueryParameter("DeviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        /**
         * <p>Specifies whether the third-party meeting system requires registration for inbound calls.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder registered(Boolean registered) {
            this.putQueryParameter("Registered", registered);
            this.registered = registered;
            return this;
        }

        /**
         * <ol>
         * <li>The IP address of the nearest RTC SIP server.</li>
         * <li>You can resolve the domain name rtcsip.dingtalk.com locally to obtain the nearest access address.
         * For example, run dig rtcsip.dingtalk.com to obtain the address.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>39.101.232.13</p>
         */
        public Builder serverAddress(String serverAddress) {
            this.putQueryParameter("ServerAddress", serverAddress);
            this.serverAddress = serverAddress;
            return this;
        }

        /**
         * <p>The username displayed on the third-party system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testdevice</p>
         */
        public Builder sipDisplayName(String sipDisplayName) {
            this.putQueryParameter("SipDisplayName", sipDisplayName);
            this.sipDisplayName = sipDisplayName;
            return this;
        }

        /**
         * <ol>
         * <li>When the device is mcu, it indicates the channel number of the third-party meeting system to be called.</li>
         * <li>When the device is sip_device, it indicates the registration number of the registered device to be invited.</li>
         * <li>When the device is phone, it indicates the called phone number.</li>
         * </ol>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>18512514528</p>
         */
        public Builder sipRoomId(String sipRoomId) {
            this.putQueryParameter("SipRoomId", sipRoomId);
            this.sipRoomId = sipRoomId;
            return this;
        }

        /**
         * <ol>
         * <li>When the device is mcu, it indicates the address information of the third-party meeting system in the format of ip:port;transport=tcp/udp/tls.
         * Example: &quot;30.240.160.66:5060;transport=tcp&quot;</li>
         * <li>When the device is sip_device, it indicates the registration address of the registered device to be invited.
         * Example: 39.101.232.13</li>
         * <li>When the device is phone, it indicates the address information of the telephone gateway.
         * Example: &quot;30.240.160.66:5060;transport=tcp&quot;</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>30.240.160.66:5060;transport=tcp</p>
         */
        public Builder sipUri(String sipUri) {
            this.putQueryParameter("SipUri", sipUri);
            this.sipUri = sipUri;
            return this;
        }

        /**
         * <p>The brand and model of the third-party SIP endpoint being called, such as polycom, cisco, tencent, zoom, or pstn.</p>
         * 
         * <strong>example:</strong>
         * <p>pstn</p>
         */
        public Builder sipUserAgent(String sipUserAgent) {
            this.putQueryParameter("SipUserAgent", sipUserAgent);
            this.sipUserAgent = sipUserAgent;
            return this;
        }

        /**
         * <ol>
         * <li>When DeviceType is mcu, it represents the third-party meeting system.</li>
         * <li>When DeviceType is sip_device, it represents the registered device.</li>
         * <li>If the third-party meeting system requires registration for inbound calls, it is the account provided by the third-party system to create an account.</li>
         * <li>If registration is not required, it is the SIP username or RTC user ID for calling the third-party system.</li>
         * </ol>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>$reg_userid</p>
         */
        public Builder sipUserId(String sipUserId) {
            this.putQueryParameter("SipUserId", sipUserId);
            this.sipUserId = sipUserId;
            return this;
        }

        /**
         * <p>The registration password that matches the SipUserId if the third-party system requires registration for inbound calls.</p>
         * 
         * <strong>example:</strong>
         * <p>654321</p>
         */
        public Builder sipUserPassword(String sipUserPassword) {
            this.putQueryParameter("SipUserPassword", sipUserPassword);
            this.sipUserPassword = sipUserPassword;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>taskId</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>$rtc_userid</p>
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public RtcSipInviteMemberRequest build() {
            return new RtcSipInviteMemberRequest(this);
        } 

    } 

}
