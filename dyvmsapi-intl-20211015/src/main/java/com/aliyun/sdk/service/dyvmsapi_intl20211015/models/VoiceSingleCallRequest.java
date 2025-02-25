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
 * {@link VoiceSingleCallRequest} extends {@link RequestModel}
 *
 * <p>VoiceSingleCallRequest</p>
 */
public class VoiceSingleCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    private String calledNumber;

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
    @com.aliyun.core.annotation.NameInMap("TtsParam")
    private String ttsParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceCode")
    private String voiceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Volume")
    private Long volume;

    private VoiceSingleCallRequest(Builder builder) {
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
        this.ttsParam = builder.ttsParam;
        this.voiceCode = builder.voiceCode;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VoiceSingleCallRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calledNumber
     */
    public String getCalledNumber() {
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
     * @return ttsParam
     */
    public String getTtsParam() {
        return this.ttsParam;
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

    public static final class Builder extends Request.Builder<VoiceSingleCallRequest, Builder> {
        private String calledNumber; 
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
        private String ttsParam; 
        private String voiceCode; 
        private Long volume; 

        private Builder() {
            super();
        } 

        private Builder(VoiceSingleCallRequest request) {
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
            this.ttsParam = request.ttsParam;
            this.voiceCode = request.voiceCode;
            this.volume = request.volume;
        } 

        /**
         * CalledNumber.
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * CallerIdNumber.
         */
        public Builder callerIdNumber(String callerIdNumber) {
            this.putQueryParameter("CallerIdNumber", callerIdNumber);
            this.callerIdNumber = callerIdNumber;
            return this;
        }

        /**
         * CountryId.
         */
        public Builder countryId(String countryId) {
            this.putQueryParameter("CountryId", countryId);
            this.countryId = countryId;
            return this;
        }

        /**
         * OutId.
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
         * PlayTimes.
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
         * SendType.
         */
        public Builder sendType(Long sendType) {
            this.putQueryParameter("SendType", sendType);
            this.sendType = sendType;
            return this;
        }

        /**
         * Speed.
         */
        public Builder speed(Long speed) {
            this.putQueryParameter("Speed", speed);
            this.speed = speed;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * TimingStart.
         */
        public Builder timingStart(String timingStart) {
            this.putQueryParameter("TimingStart", timingStart);
            this.timingStart = timingStart;
            return this;
        }

        /**
         * TtsCode.
         */
        public Builder ttsCode(String ttsCode) {
            this.putQueryParameter("TtsCode", ttsCode);
            this.ttsCode = ttsCode;
            return this;
        }

        /**
         * TtsParam.
         */
        public Builder ttsParam(String ttsParam) {
            this.putQueryParameter("TtsParam", ttsParam);
            this.ttsParam = ttsParam;
            return this;
        }

        /**
         * VoiceCode.
         */
        public Builder voiceCode(String voiceCode) {
            this.putQueryParameter("VoiceCode", voiceCode);
            this.voiceCode = voiceCode;
            return this;
        }

        /**
         * Volume.
         */
        public Builder volume(Long volume) {
            this.putQueryParameter("Volume", volume);
            this.volume = volume;
            return this;
        }

        @Override
        public VoiceSingleCallRequest build() {
            return new VoiceSingleCallRequest(this);
        } 

    } 

}
