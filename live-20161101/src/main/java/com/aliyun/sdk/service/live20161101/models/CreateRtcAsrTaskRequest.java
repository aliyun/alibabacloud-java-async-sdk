// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link CreateRtcAsrTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateRtcAsrTaskRequest</p>
 */
public class CreateRtcAsrTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthKey")
    private String authKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoTerminateDelay")
    private Long autoTerminateDelay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoTerminateEnabled")
    private Boolean autoTerminateEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackURL")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callbackURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelID")
    private String channelID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    @com.aliyun.core.annotation.Validation(required = true)
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportInterval")
    private Long reportInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RtcUserId")
    private String rtcUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SDKAppID")
    private String SDKAppID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamURL")
    private String streamURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetLanguages")
    private String targetLanguages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranslateEnabled")
    private Boolean translateEnabled;

    private CreateRtcAsrTaskRequest(Builder builder) {
        super(builder);
        this.authKey = builder.authKey;
        this.autoTerminateDelay = builder.autoTerminateDelay;
        this.autoTerminateEnabled = builder.autoTerminateEnabled;
        this.callbackURL = builder.callbackURL;
        this.channelID = builder.channelID;
        this.language = builder.language;
        this.mode = builder.mode;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.reportInterval = builder.reportInterval;
        this.rtcUserId = builder.rtcUserId;
        this.SDKAppID = builder.SDKAppID;
        this.streamURL = builder.streamURL;
        this.targetLanguages = builder.targetLanguages;
        this.translateEnabled = builder.translateEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRtcAsrTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authKey
     */
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @return autoTerminateDelay
     */
    public Long getAutoTerminateDelay() {
        return this.autoTerminateDelay;
    }

    /**
     * @return autoTerminateEnabled
     */
    public Boolean getAutoTerminateEnabled() {
        return this.autoTerminateEnabled;
    }

    /**
     * @return callbackURL
     */
    public String getCallbackURL() {
        return this.callbackURL;
    }

    /**
     * @return channelID
     */
    public String getChannelID() {
        return this.channelID;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reportInterval
     */
    public Long getReportInterval() {
        return this.reportInterval;
    }

    /**
     * @return rtcUserId
     */
    public String getRtcUserId() {
        return this.rtcUserId;
    }

    /**
     * @return SDKAppID
     */
    public String getSDKAppID() {
        return this.SDKAppID;
    }

    /**
     * @return streamURL
     */
    public String getStreamURL() {
        return this.streamURL;
    }

    /**
     * @return targetLanguages
     */
    public String getTargetLanguages() {
        return this.targetLanguages;
    }

    /**
     * @return translateEnabled
     */
    public Boolean getTranslateEnabled() {
        return this.translateEnabled;
    }

    public static final class Builder extends Request.Builder<CreateRtcAsrTaskRequest, Builder> {
        private String authKey; 
        private Long autoTerminateDelay; 
        private Boolean autoTerminateEnabled; 
        private String callbackURL; 
        private String channelID; 
        private String language; 
        private String mode; 
        private Long ownerId; 
        private String regionId; 
        private Long reportInterval; 
        private String rtcUserId; 
        private String SDKAppID; 
        private String streamURL; 
        private String targetLanguages; 
        private Boolean translateEnabled; 

        private Builder() {
            super();
        } 

        private Builder(CreateRtcAsrTaskRequest request) {
            super(request);
            this.authKey = request.authKey;
            this.autoTerminateDelay = request.autoTerminateDelay;
            this.autoTerminateEnabled = request.autoTerminateEnabled;
            this.callbackURL = request.callbackURL;
            this.channelID = request.channelID;
            this.language = request.language;
            this.mode = request.mode;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.reportInterval = request.reportInterval;
            this.rtcUserId = request.rtcUserId;
            this.SDKAppID = request.SDKAppID;
            this.streamURL = request.streamURL;
            this.targetLanguages = request.targetLanguages;
            this.translateEnabled = request.translateEnabled;
        } 

        /**
         * <p>The AuthKey that is used to generate the MD5 signature in callbacks.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd</p>
         */
        public Builder authKey(String authKey) {
            this.putQueryParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * <p>The maximum latency at which the task is automatically stopped. Unit: seconds. Valid values: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder autoTerminateDelay(Long autoTerminateDelay) {
            this.putQueryParameter("AutoTerminateDelay", autoTerminateDelay);
            this.autoTerminateDelay = autoTerminateDelay;
            return this;
        }

        /**
         * <p>Specifies whether to automatically stop the task when the latency exceeds the specified limit. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoTerminateEnabled(Boolean autoTerminateEnabled) {
            this.putQueryParameter("AutoTerminateEnabled", autoTerminateEnabled);
            this.autoTerminateEnabled = autoTerminateEnabled;
            return this;
        }

        /**
         * <p>The callback URL.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx.com">http://xxx.com</a></p>
         */
        public Builder callbackURL(String callbackURL) {
            this.putQueryParameter("CallbackURL", callbackURL);
            this.callbackURL = callbackURL;
            return this;
        }

        /**
         * <p>The ID of the channel.</p>
         * <blockquote>
         * <p> This parameter is required and takes effect only if you set the Mode parameter to rtc.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>channelId</p>
         */
        public Builder channelID(String channelID) {
            this.putQueryParameter("ChannelID", channelID);
            this.channelID = channelID;
            return this;
        }

        /**
         * <p>The source language of the audio. Valid values:</p>
         * <ul>
         * <li>ja: Japanese</li>
         * <li>yue: Cantonese</li>
         * <li>fspk: mixed Mandarin and English</li>
         * <li>en: English</li>
         * <li>cn: Mandarin</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The type of the stream. Valid values: live and rtc. The value live specifies a regular live stream, such as a Real-Time Messaging Protocol (RTMP) stream.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>live</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The interval at which callbacks are returned. Unit: milliseconds. Valid values: -1 and 0 to 500.</p>
         * <ul>
         * <li>-1: accepts callbacks only for whole sentences, but not for incomplete sentences.</li>
         * <li>0 or an empty value: returns callbacks in real time.</li>
         * <li>A value that is greater than 0 and less than or equal to 500: returns callbacks at the specified interval.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder reportInterval(Long reportInterval) {
            this.putQueryParameter("ReportInterval", reportInterval);
            this.reportInterval = reportInterval;
            return this;
        }

        /**
         * <p>The ID of the user who ingests the stream.</p>
         * <blockquote>
         * <p> This parameter is required and takes effect only if you set the Mode parameter to rtc. You can specify only one user ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        public Builder rtcUserId(String rtcUserId) {
            this.putQueryParameter("RtcUserId", rtcUserId);
            this.rtcUserId = rtcUserId;
            return this;
        }

        /**
         * <p>The ID of the ApsaraVideo Real-time Communication (ARTC) application.</p>
         * <blockquote>
         * <p> This parameter is required and takes effect only if you set the Mode parameter to rtc.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>appId</p>
         */
        public Builder SDKAppID(String SDKAppID) {
            this.putQueryParameter("SDKAppID", SDKAppID);
            this.SDKAppID = SDKAppID;
            return this;
        }

        /**
         * <p>The URL of the live stream.</p>
         * <blockquote>
         * <p> This parameter is required and takes effect only if you set the Mode parameter to live.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rtmp://xxx</p>
         */
        public Builder streamURL(String streamURL) {
            this.putQueryParameter("StreamURL", streamURL);
            this.streamURL = streamURL;
            return this;
        }

        /**
         * <p>The language into which the subtitles are translated. Valid values:</p>
         * <ul>
         * <li>cn: Chinese</li>
         * <li>en: English</li>
         * <li>ja: Japanese</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder targetLanguages(String targetLanguages) {
            this.putQueryParameter("TargetLanguages", targetLanguages);
            this.targetLanguages = targetLanguages;
            return this;
        }

        /**
         * <p>Specifies whether to enable the translation feature.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder translateEnabled(Boolean translateEnabled) {
            this.putQueryParameter("TranslateEnabled", translateEnabled);
            this.translateEnabled = translateEnabled;
            return this;
        }

        @Override
        public CreateRtcAsrTaskRequest build() {
            return new CreateRtcAsrTaskRequest(this);
        } 

    } 

}
