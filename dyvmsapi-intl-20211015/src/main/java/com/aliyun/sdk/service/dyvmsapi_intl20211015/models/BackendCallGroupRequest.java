// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi_intl20211015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BackendCallGroupRequest} extends {@link RequestModel}
 *
 * <p>BackendCallGroupRequest</p>
 */
public class BackendCallGroupRequest extends Request {
    @Query
    @NameInMap("CalledNumber")
    private java.util.List < String > calledNumber;

    @Query
    @NameInMap("CallerIdNumber")
    private String callerIdNumber;

    @Query
    @NameInMap("CountryId")
    private String countryId;

    @Query
    @NameInMap("OutId")
    private String outId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PlayTimes")
    private Long playTimes;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SendType")
    private Long sendType;

    @Query
    @NameInMap("Speed")
    private Long speed;

    @Query
    @NameInMap("TaskName")
    private String taskName;

    @Query
    @NameInMap("TimingStart")
    private String timingStart;

    @Query
    @NameInMap("TtsCode")
    private String ttsCode;

    @Query
    @NameInMap("VoiceCode")
    private String voiceCode;

    @Query
    @NameInMap("Volume")
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
    public java.util.List < String > getCalledNumber() {
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
        private java.util.List < String > calledNumber; 
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
         * The called numbers. You can specify up to 50,000 phone numbers.
         */
        public Builder calledNumber(java.util.List < String > calledNumber) {
            String calledNumberShrink = shrink(calledNumber, "CalledNumber", "json");
            this.putQueryParameter("CalledNumber", calledNumberShrink);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * The calling number.
         * <p>
         * 
         * If you do not specify this parameter, the system uses a local random number as the display number. If you use a dedicated number for outbound calls, you must specify the purchased number. You can specify only one number. You can log on to the VMS console and choose Number Management to view the purchased phone numbers.
         */
        public Builder callerIdNumber(String callerIdNumber) {
            this.putQueryParameter("CallerIdNumber", callerIdNumber);
            this.callerIdNumber = callerIdNumber;
            return this;
        }

        /**
         * The ISO2 country code.
         */
        public Builder countryId(String countryId) {
            this.putQueryParameter("CountryId", countryId);
            this.countryId = countryId;
            return this;
        }

        /**
         * The ID reserved for the caller. This ID is returned to the caller in a receipt message.
         * <p>
         * 
         * The value must be of the STRING type and 1 to 15 bytes in length.
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
         * The number of times the audio file is played. Valid values: 1 to 3.
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
         * The delivery type. Valid values: 1 and 2.
         * <p>
         * 
         * 1: The audio file is delivered immediately.
         * 
         * 2: The audio file is delivered at a scheduled time. If you specify SendType as 2, you must specify TimingStart.
         */
        public Builder sendType(Long sendType) {
            this.putQueryParameter("SendType", sendType);
            this.sendType = sendType;
            return this;
        }

        /**
         * The playback speed. Valid values: -500 to 500.
         * <p>
         * 
         * You must specify this parameter when the audio type is text-to-speech (TTS). You do not need to specify this parameter when you use recordings.
         */
        public Builder speed(Long speed) {
            this.putQueryParameter("Speed", speed);
            this.speed = speed;
            return this;
        }

        /**
         * The task name.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * The time when the audio file is scheduled to be delivered.
         */
        public Builder timingStart(String timingStart) {
            this.putQueryParameter("TimingStart", timingStart);
            this.timingStart = timingStart;
            return this;
        }

        /**
         * The voice template ID of the audio file.
         * <p>
         * 
         * You can log on to the VMS console and choose Voice Call Template > Audio File to view the template ID.
         * 
         * You must specify either TtsCode or VoiceCode. You can specify TtsCode to use the audio file as the call content. Alternatively, you can specify VoiceCode to use preset text as the call content.
         */
        public Builder ttsCode(String ttsCode) {
            this.putQueryParameter("TtsCode", ttsCode);
            this.ttsCode = ttsCode;
            return this;
        }

        /**
         * The TTS template ID.
         * <p>
         * 
         * You can log on to the VMS console and choose Voice Call Template > TTS Template to view the template ID.
         * 
         * You must specify either TtsCode or VoiceCode. You can specify TtsCode to use the audio file as the call content. Alternatively, you can specify VoiceCode to use preset text as the call content.
         */
        public Builder voiceCode(String voiceCode) {
            this.putQueryParameter("VoiceCode", voiceCode);
            this.voiceCode = voiceCode;
            return this;
        }

        /**
         * The playback volume of the audio file. Valid values: 0 to 100. Default value: 100.
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
