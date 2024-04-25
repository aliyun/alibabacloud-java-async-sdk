// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SmartCallRequest} extends {@link RequestModel}
 *
 * <p>SmartCallRequest</p>
 */
public class SmartCallRequest extends Request {
    @Query
    @NameInMap("ActionCodeBreak")
    private Boolean actionCodeBreak;

    @Query
    @NameInMap("ActionCodeTimeBreak")
    private Integer actionCodeTimeBreak;

    @Query
    @NameInMap("AsrBaseId")
    private String asrBaseId;

    @Query
    @NameInMap("AsrModelId")
    private String asrModelId;

    @Query
    @NameInMap("BackgroundFileCode")
    private String backgroundFileCode;

    @Query
    @NameInMap("BackgroundSpeed")
    private Integer backgroundSpeed;

    @Query
    @NameInMap("BackgroundVolume")
    @Validation(maximum = 4)
    private Integer backgroundVolume;

    @Query
    @NameInMap("CalledNumber")
    @Validation(required = true)
    private String calledNumber;

    @Query
    @NameInMap("CalledShowNumber")
    @Validation(required = true)
    private String calledShowNumber;

    @Query
    @NameInMap("DynamicId")
    private String dynamicId;

    @Query
    @NameInMap("EarlyMediaAsr")
    private Boolean earlyMediaAsr;

    @Query
    @NameInMap("EnableITN")
    private Boolean enableITN;

    @Query
    @NameInMap("MuteTime")
    private Integer muteTime;

    @Query
    @NameInMap("NoiseThreshold")
    private Double noiseThreshold;

    @Query
    @NameInMap("OutId")
    private String outId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PauseTime")
    private Integer pauseTime;

    @Query
    @NameInMap("RecordFlag")
    private Boolean recordFlag;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SessionTimeout")
    private Integer sessionTimeout;

    @Query
    @NameInMap("Speed")
    private Integer speed;

    @Query
    @NameInMap("StreamAsr")
    @Validation(maximum = 100)
    private Integer streamAsr;

    @Query
    @NameInMap("TtsConf")
    private Boolean ttsConf;

    @Query
    @NameInMap("TtsSpeed")
    private Integer ttsSpeed;

    @Query
    @NameInMap("TtsStyle")
    private String ttsStyle;

    @Query
    @NameInMap("TtsVolume")
    private Integer ttsVolume;

    @Query
    @NameInMap("VoiceCode")
    @Validation(required = true)
    private String voiceCode;

    @Query
    @NameInMap("VoiceCodeParam")
    private String voiceCodeParam;

    @Query
    @NameInMap("Volume")
    private Integer volume;

    private SmartCallRequest(Builder builder) {
        super(builder);
        this.actionCodeBreak = builder.actionCodeBreak;
        this.actionCodeTimeBreak = builder.actionCodeTimeBreak;
        this.asrBaseId = builder.asrBaseId;
        this.asrModelId = builder.asrModelId;
        this.backgroundFileCode = builder.backgroundFileCode;
        this.backgroundSpeed = builder.backgroundSpeed;
        this.backgroundVolume = builder.backgroundVolume;
        this.calledNumber = builder.calledNumber;
        this.calledShowNumber = builder.calledShowNumber;
        this.dynamicId = builder.dynamicId;
        this.earlyMediaAsr = builder.earlyMediaAsr;
        this.enableITN = builder.enableITN;
        this.muteTime = builder.muteTime;
        this.noiseThreshold = builder.noiseThreshold;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.pauseTime = builder.pauseTime;
        this.recordFlag = builder.recordFlag;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sessionTimeout = builder.sessionTimeout;
        this.speed = builder.speed;
        this.streamAsr = builder.streamAsr;
        this.ttsConf = builder.ttsConf;
        this.ttsSpeed = builder.ttsSpeed;
        this.ttsStyle = builder.ttsStyle;
        this.ttsVolume = builder.ttsVolume;
        this.voiceCode = builder.voiceCode;
        this.voiceCodeParam = builder.voiceCodeParam;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SmartCallRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionCodeBreak
     */
    public Boolean getActionCodeBreak() {
        return this.actionCodeBreak;
    }

    /**
     * @return actionCodeTimeBreak
     */
    public Integer getActionCodeTimeBreak() {
        return this.actionCodeTimeBreak;
    }

    /**
     * @return asrBaseId
     */
    public String getAsrBaseId() {
        return this.asrBaseId;
    }

    /**
     * @return asrModelId
     */
    public String getAsrModelId() {
        return this.asrModelId;
    }

    /**
     * @return backgroundFileCode
     */
    public String getBackgroundFileCode() {
        return this.backgroundFileCode;
    }

    /**
     * @return backgroundSpeed
     */
    public Integer getBackgroundSpeed() {
        return this.backgroundSpeed;
    }

    /**
     * @return backgroundVolume
     */
    public Integer getBackgroundVolume() {
        return this.backgroundVolume;
    }

    /**
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return calledShowNumber
     */
    public String getCalledShowNumber() {
        return this.calledShowNumber;
    }

    /**
     * @return dynamicId
     */
    public String getDynamicId() {
        return this.dynamicId;
    }

    /**
     * @return earlyMediaAsr
     */
    public Boolean getEarlyMediaAsr() {
        return this.earlyMediaAsr;
    }

    /**
     * @return enableITN
     */
    public Boolean getEnableITN() {
        return this.enableITN;
    }

    /**
     * @return muteTime
     */
    public Integer getMuteTime() {
        return this.muteTime;
    }

    /**
     * @return noiseThreshold
     */
    public Double getNoiseThreshold() {
        return this.noiseThreshold;
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
     * @return pauseTime
     */
    public Integer getPauseTime() {
        return this.pauseTime;
    }

    /**
     * @return recordFlag
     */
    public Boolean getRecordFlag() {
        return this.recordFlag;
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
     * @return sessionTimeout
     */
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    /**
     * @return speed
     */
    public Integer getSpeed() {
        return this.speed;
    }

    /**
     * @return streamAsr
     */
    public Integer getStreamAsr() {
        return this.streamAsr;
    }

    /**
     * @return ttsConf
     */
    public Boolean getTtsConf() {
        return this.ttsConf;
    }

    /**
     * @return ttsSpeed
     */
    public Integer getTtsSpeed() {
        return this.ttsSpeed;
    }

    /**
     * @return ttsStyle
     */
    public String getTtsStyle() {
        return this.ttsStyle;
    }

    /**
     * @return ttsVolume
     */
    public Integer getTtsVolume() {
        return this.ttsVolume;
    }

    /**
     * @return voiceCode
     */
    public String getVoiceCode() {
        return this.voiceCode;
    }

    /**
     * @return voiceCodeParam
     */
    public String getVoiceCodeParam() {
        return this.voiceCodeParam;
    }

    /**
     * @return volume
     */
    public Integer getVolume() {
        return this.volume;
    }

    public static final class Builder extends Request.Builder<SmartCallRequest, Builder> {
        private Boolean actionCodeBreak; 
        private Integer actionCodeTimeBreak; 
        private String asrBaseId; 
        private String asrModelId; 
        private String backgroundFileCode; 
        private Integer backgroundSpeed; 
        private Integer backgroundVolume; 
        private String calledNumber; 
        private String calledShowNumber; 
        private String dynamicId; 
        private Boolean earlyMediaAsr; 
        private Boolean enableITN; 
        private Integer muteTime; 
        private Double noiseThreshold; 
        private String outId; 
        private Long ownerId; 
        private Integer pauseTime; 
        private Boolean recordFlag; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer sessionTimeout; 
        private Integer speed; 
        private Integer streamAsr; 
        private Boolean ttsConf; 
        private Integer ttsSpeed; 
        private String ttsStyle; 
        private Integer ttsVolume; 
        private String voiceCode; 
        private String voiceCodeParam; 
        private Integer volume; 

        private Builder() {
            super();
        } 

        private Builder(SmartCallRequest request) {
            super(request);
            this.actionCodeBreak = request.actionCodeBreak;
            this.actionCodeTimeBreak = request.actionCodeTimeBreak;
            this.asrBaseId = request.asrBaseId;
            this.asrModelId = request.asrModelId;
            this.backgroundFileCode = request.backgroundFileCode;
            this.backgroundSpeed = request.backgroundSpeed;
            this.backgroundVolume = request.backgroundVolume;
            this.calledNumber = request.calledNumber;
            this.calledShowNumber = request.calledShowNumber;
            this.dynamicId = request.dynamicId;
            this.earlyMediaAsr = request.earlyMediaAsr;
            this.enableITN = request.enableITN;
            this.muteTime = request.muteTime;
            this.noiseThreshold = request.noiseThreshold;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.pauseTime = request.pauseTime;
            this.recordFlag = request.recordFlag;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sessionTimeout = request.sessionTimeout;
            this.speed = request.speed;
            this.streamAsr = request.streamAsr;
            this.ttsConf = request.ttsConf;
            this.ttsSpeed = request.ttsSpeed;
            this.ttsStyle = request.ttsStyle;
            this.ttsVolume = request.ttsVolume;
            this.voiceCode = request.voiceCode;
            this.voiceCodeParam = request.voiceCodeParam;
            this.volume = request.volume;
        } 

        /**
         * ActionCodeBreak.
         */
        public Builder actionCodeBreak(Boolean actionCodeBreak) {
            this.putQueryParameter("ActionCodeBreak", actionCodeBreak);
            this.actionCodeBreak = actionCodeBreak;
            return this;
        }

        /**
         * ActionCodeTimeBreak.
         */
        public Builder actionCodeTimeBreak(Integer actionCodeTimeBreak) {
            this.putQueryParameter("ActionCodeTimeBreak", actionCodeTimeBreak);
            this.actionCodeTimeBreak = actionCodeTimeBreak;
            return this;
        }

        /**
         * AsrBaseId.
         */
        public Builder asrBaseId(String asrBaseId) {
            this.putQueryParameter("AsrBaseId", asrBaseId);
            this.asrBaseId = asrBaseId;
            return this;
        }

        /**
         * AsrModelId.
         */
        public Builder asrModelId(String asrModelId) {
            this.putQueryParameter("AsrModelId", asrModelId);
            this.asrModelId = asrModelId;
            return this;
        }

        /**
         * BackgroundFileCode.
         */
        public Builder backgroundFileCode(String backgroundFileCode) {
            this.putQueryParameter("BackgroundFileCode", backgroundFileCode);
            this.backgroundFileCode = backgroundFileCode;
            return this;
        }

        /**
         * BackgroundSpeed.
         */
        public Builder backgroundSpeed(Integer backgroundSpeed) {
            this.putQueryParameter("BackgroundSpeed", backgroundSpeed);
            this.backgroundSpeed = backgroundSpeed;
            return this;
        }

        /**
         * BackgroundVolume.
         */
        public Builder backgroundVolume(Integer backgroundVolume) {
            this.putQueryParameter("BackgroundVolume", backgroundVolume);
            this.backgroundVolume = backgroundVolume;
            return this;
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
         * CalledShowNumber.
         */
        public Builder calledShowNumber(String calledShowNumber) {
            this.putQueryParameter("CalledShowNumber", calledShowNumber);
            this.calledShowNumber = calledShowNumber;
            return this;
        }

        /**
         * DynamicId.
         */
        public Builder dynamicId(String dynamicId) {
            this.putQueryParameter("DynamicId", dynamicId);
            this.dynamicId = dynamicId;
            return this;
        }

        /**
         * EarlyMediaAsr.
         */
        public Builder earlyMediaAsr(Boolean earlyMediaAsr) {
            this.putQueryParameter("EarlyMediaAsr", earlyMediaAsr);
            this.earlyMediaAsr = earlyMediaAsr;
            return this;
        }

        /**
         * EnableITN.
         */
        public Builder enableITN(Boolean enableITN) {
            this.putQueryParameter("EnableITN", enableITN);
            this.enableITN = enableITN;
            return this;
        }

        /**
         * MuteTime.
         */
        public Builder muteTime(Integer muteTime) {
            this.putQueryParameter("MuteTime", muteTime);
            this.muteTime = muteTime;
            return this;
        }

        /**
         * NoiseThreshold.
         */
        public Builder noiseThreshold(Double noiseThreshold) {
            this.putQueryParameter("NoiseThreshold", noiseThreshold);
            this.noiseThreshold = noiseThreshold;
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
         * PauseTime.
         */
        public Builder pauseTime(Integer pauseTime) {
            this.putQueryParameter("PauseTime", pauseTime);
            this.pauseTime = pauseTime;
            return this;
        }

        /**
         * RecordFlag.
         */
        public Builder recordFlag(Boolean recordFlag) {
            this.putQueryParameter("RecordFlag", recordFlag);
            this.recordFlag = recordFlag;
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
         * SessionTimeout.
         */
        public Builder sessionTimeout(Integer sessionTimeout) {
            this.putQueryParameter("SessionTimeout", sessionTimeout);
            this.sessionTimeout = sessionTimeout;
            return this;
        }

        /**
         * Speed.
         */
        public Builder speed(Integer speed) {
            this.putQueryParameter("Speed", speed);
            this.speed = speed;
            return this;
        }

        /**
         * StreamAsr.
         */
        public Builder streamAsr(Integer streamAsr) {
            this.putQueryParameter("StreamAsr", streamAsr);
            this.streamAsr = streamAsr;
            return this;
        }

        /**
         * TtsConf.
         */
        public Builder ttsConf(Boolean ttsConf) {
            this.putQueryParameter("TtsConf", ttsConf);
            this.ttsConf = ttsConf;
            return this;
        }

        /**
         * TtsSpeed.
         */
        public Builder ttsSpeed(Integer ttsSpeed) {
            this.putQueryParameter("TtsSpeed", ttsSpeed);
            this.ttsSpeed = ttsSpeed;
            return this;
        }

        /**
         * TtsStyle.
         */
        public Builder ttsStyle(String ttsStyle) {
            this.putQueryParameter("TtsStyle", ttsStyle);
            this.ttsStyle = ttsStyle;
            return this;
        }

        /**
         * TtsVolume.
         */
        public Builder ttsVolume(Integer ttsVolume) {
            this.putQueryParameter("TtsVolume", ttsVolume);
            this.ttsVolume = ttsVolume;
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
         * VoiceCodeParam.
         */
        public Builder voiceCodeParam(String voiceCodeParam) {
            this.putQueryParameter("VoiceCodeParam", voiceCodeParam);
            this.voiceCodeParam = voiceCodeParam;
            return this;
        }

        /**
         * Volume.
         */
        public Builder volume(Integer volume) {
            this.putQueryParameter("Volume", volume);
            this.volume = volume;
            return this;
        }

        @Override
        public SmartCallRequest build() {
            return new SmartCallRequest(this);
        } 

    } 

}
