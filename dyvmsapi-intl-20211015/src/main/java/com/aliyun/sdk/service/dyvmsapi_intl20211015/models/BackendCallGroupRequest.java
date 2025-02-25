// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi_intl20211015.models;

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
 * {@link BackendCallGroupRequest} extends {@link RequestModel}
 *
 * <p>BackendCallGroupRequest</p>
 */
public class BackendCallGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    private java.util.List<String> calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallerIdNumber")
    private String callerIdNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CountryId")
    private String countryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlayTimes")
    private Long playTimes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendType")
    private Long sendType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Speed")
    private Long speed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimingStart")
    private String timingStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtsCode")
    private String ttsCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceCode")
    private String voiceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Volume")
    private Long volume;

    private BackendCallGroupRequest(Builder builder) {
        super(builder);
        this.calledNumber = builder.calledNumber;
        this.callerIdNumber = builder.callerIdNumber;
        this.countryId = builder.countryId;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.playTimes = builder.playTimes;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sendType = builder.sendType;
        this.speed = builder.speed;
        this.taskName = builder.taskName;
        this.timingStart = builder.timingStart;
        this.ttsCode = builder.ttsCode;
        this.voiceCode = builder.voiceCode;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BackendCallGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calledNumber
     */
    public java.util.List<String> getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return callerIdNumber
     */
    public String getCallerIdNumber() {
        return this.callerIdNumber;
    }

    /**
     * @return countryId
     */
    public String getCountryId() {
        return this.countryId;
    }

    /**
     * @return outId
     */
    public String getOutId() {
        return this.outId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return playTimes
     */
    public Long getPlayTimes() {
        return this.playTimes;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sendType
     */
    public Long getSendType() {
        return this.sendType;
    }

    /**
     * @return speed
     */
    public Long getSpeed() {
        return this.speed;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return timingStart
     */
    public String getTimingStart() {
        return this.timingStart;
    }

    /**
     * @return ttsCode
     */
    public String getTtsCode() {
        return this.ttsCode;
    }

    /**
     * @return voiceCode
     */
    public String getVoiceCode() {
        return this.voiceCode;
    }

    /**
     * @return volume
     */
    public Long getVolume() {
        return this.volume;
    }

    public static final class Builder extends Request.Builder<BackendCallGroupRequest, Builder> {
        private java.util.List<String> calledNumber; 
        private String callerIdNumber; 
        private String countryId; 
        private String outId; 
        private Long ownerId; 
        private Long playTimes; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long sendType; 
        private Long speed; 
        private String taskName; 
        private String timingStart; 
        private String ttsCode; 
        private String voiceCode; 
        private Long volume; 

        private Builder() {
            super();
        } 

        private Builder(BackendCallGroupRequest request) {
            super(request);
            this.calledNumber = request.calledNumber;
            this.callerIdNumber = request.callerIdNumber;
            this.countryId = request.countryId;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.playTimes = request.playTimes;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sendType = request.sendType;
            this.speed = request.speed;
            this.taskName = request.taskName;
            this.timingStart = request.timingStart;
            this.ttsCode = request.ttsCode;
            this.voiceCode = request.voiceCode;
            this.volume = request.volume;
        } 

        /**
         * <p>The called numbers. You can specify up to 50,000 phone numbers.</p>
         */
        public Builder calledNumber(java.util.List<String> calledNumber) {
            String calledNumberShrink = shrink(calledNumber, "CalledNumber", "json");
            this.putQueryParameter("CalledNumber", calledNumberShrink);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * <p>The calling number.</p>
         * <p>If you do not specify this parameter, the system uses a local random number as the display number. If you use a dedicated number for outbound calls, you must specify the purchased number. You can specify only one number. You can log on to the VMS console and choose Number Management to view the purchased phone numbers.</p>
         * 
         * <strong>example:</strong>
         * <p>852****1111</p>
         */
        public Builder callerIdNumber(String callerIdNumber) {
            this.putQueryParameter("CallerIdNumber", callerIdNumber);
            this.callerIdNumber = callerIdNumber;
            return this;
        }

        /**
         * <p>The ISO2 country code.</p>
         * 
         * <strong>example:</strong>
         * <p>HK</p>
         */
        public Builder countryId(String countryId) {
            this.putQueryParameter("CountryId", countryId);
            this.countryId = countryId;
            return this;
        }

        /**
         * <p>The ID reserved for the caller. This ID is returned to the caller in a receipt message.</p>
         * <p>The value must be of the STRING type and 1 to 15 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>22596****</p>
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
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
         * <p>The number of times the audio file is played. Valid values: 1 to 3.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder playTimes(Long playTimes) {
            this.putQueryParameter("PlayTimes", playTimes);
            this.playTimes = playTimes;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The delivery type. Valid values: 1 and 2.</p>
         * <p>1: The audio file is delivered immediately.</p>
         * <p>2: The audio file is delivered at a scheduled time. If you specify SendType as 2, you must specify TimingStart.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder sendType(Long sendType) {
            this.putQueryParameter("SendType", sendType);
            this.sendType = sendType;
            return this;
        }

        /**
         * <p>The playback speed. Valid values: -500 to 500.</p>
         * <p>You must specify this parameter when the audio type is text-to-speech (TTS). You do not need to specify this parameter when you use recordings.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder speed(Long speed) {
            this.putQueryParameter("Speed", speed);
            this.speed = speed;
            return this;
        }

        /**
         * <p>The task name.</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The time when the audio file is scheduled to be delivered.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-01T08:00:00+08:00</p>
         */
        public Builder timingStart(String timingStart) {
            this.putQueryParameter("TimingStart", timingStart);
            this.timingStart = timingStart;
            return this;
        }

        /**
         * <p>The voice template ID of the audio file.</p>
         * <p>You can log on to the VMS console and choose Voice Call Template &gt; Audio File to view the template ID.</p>
         * <p>You must specify either TtsCode or VoiceCode. You can specify TtsCode to use the audio file as the call content. Alternatively, you can specify VoiceCode to use preset text as the call content.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        public Builder ttsCode(String ttsCode) {
            this.putQueryParameter("TtsCode", ttsCode);
            this.ttsCode = ttsCode;
            return this;
        }

        /**
         * <p>The TTS template ID.</p>
         * <p>You can log on to the VMS console and choose Voice Call Template &gt; TTS Template to view the template ID.</p>
         * <p>You must specify either TtsCode or VoiceCode. You can specify TtsCode to use the audio file as the call content. Alternatively, you can specify VoiceCode to use preset text as the call content.</p>
         * 
         * <strong>example:</strong>
         * <p>200001</p>
         */
        public Builder voiceCode(String voiceCode) {
            this.putQueryParameter("VoiceCode", voiceCode);
            this.voiceCode = voiceCode;
            return this;
        }

        /**
         * <p>The playback volume of the audio file. Valid values: 0 to 100. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder volume(Long volume) {
            this.putQueryParameter("Volume", volume);
            this.volume = volume;
            return this;
        }

        @Override
        public BackendCallGroupRequest build() {
            return new BackendCallGroupRequest(this);
        } 

    } 

}
