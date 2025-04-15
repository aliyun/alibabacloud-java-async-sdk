// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link SendCcoSmartCallRequest} extends {@link RequestModel}
 *
 * <p>SendCcoSmartCallRequest</p>
 */
public class SendCcoSmartCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionCodeBreak")
    private Boolean actionCodeBreak;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionCodeTimeBreak")
    private Integer actionCodeTimeBreak;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsrAlsAmId")
    private String asrAlsAmId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsrBaseId")
    private String asrBaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsrModelId")
    private String asrModelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsrVocabularyId")
    private String asrVocabularyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackgroundFileCode")
    private String backgroundFileCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackgroundSpeed")
    private Integer backgroundSpeed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackgroundVolume")
    @com.aliyun.core.annotation.Validation(maximum = 4)
    private Integer backgroundVolume;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledShowNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calledShowNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DynamicId")
    private String dynamicId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EarlyMediaAsr")
    private Boolean earlyMediaAsr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableITN")
    private Boolean enableITN;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MuteTime")
    private Integer muteTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PauseTime")
    private Integer pauseTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlayTimes")
    private Integer playTimes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdCode")
    private String prodCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordFlag")
    private Boolean recordFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionTimeout")
    private Integer sessionTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Speed")
    private Integer speed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtsConf")
    private Boolean ttsConf;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtsSpeed")
    private Integer ttsSpeed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtsStyle")
    private String ttsStyle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtsVolume")
    private Integer ttsVolume;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String voiceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceCodeParam")
    private String voiceCodeParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Volume")
    private Integer volume;

    private SendCcoSmartCallRequest(Builder builder) {
        super(builder);
        this.actionCodeBreak = builder.actionCodeBreak;
        this.actionCodeTimeBreak = builder.actionCodeTimeBreak;
        this.asrAlsAmId = builder.asrAlsAmId;
        this.asrBaseId = builder.asrBaseId;
        this.asrModelId = builder.asrModelId;
        this.asrVocabularyId = builder.asrVocabularyId;
        this.backgroundFileCode = builder.backgroundFileCode;
        this.backgroundSpeed = builder.backgroundSpeed;
        this.backgroundVolume = builder.backgroundVolume;
        this.calledNumber = builder.calledNumber;
        this.calledShowNumber = builder.calledShowNumber;
        this.dynamicId = builder.dynamicId;
        this.earlyMediaAsr = builder.earlyMediaAsr;
        this.enableITN = builder.enableITN;
        this.muteTime = builder.muteTime;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.pauseTime = builder.pauseTime;
        this.playTimes = builder.playTimes;
        this.prodCode = builder.prodCode;
        this.recordFlag = builder.recordFlag;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sessionTimeout = builder.sessionTimeout;
        this.speed = builder.speed;
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

    public static SendCcoSmartCallRequest create() {
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
     * @return asrAlsAmId
     */
    public String getAsrAlsAmId() {
        return this.asrAlsAmId;
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
     * @return asrVocabularyId
     */
    public String getAsrVocabularyId() {
        return this.asrVocabularyId;
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
     * @return playTimes
     */
    public Integer getPlayTimes() {
        return this.playTimes;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
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

    public static final class Builder extends Request.Builder<SendCcoSmartCallRequest, Builder> {
        private Boolean actionCodeBreak; 
        private Integer actionCodeTimeBreak; 
        private String asrAlsAmId; 
        private String asrBaseId; 
        private String asrModelId; 
        private String asrVocabularyId; 
        private String backgroundFileCode; 
        private Integer backgroundSpeed; 
        private Integer backgroundVolume; 
        private String calledNumber; 
        private String calledShowNumber; 
        private String dynamicId; 
        private Boolean earlyMediaAsr; 
        private Boolean enableITN; 
        private Integer muteTime; 
        private String outId; 
        private Long ownerId; 
        private Integer pauseTime; 
        private Integer playTimes; 
        private String prodCode; 
        private Boolean recordFlag; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer sessionTimeout; 
        private Integer speed; 
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

        private Builder(SendCcoSmartCallRequest request) {
            super(request);
            this.actionCodeBreak = request.actionCodeBreak;
            this.actionCodeTimeBreak = request.actionCodeTimeBreak;
            this.asrAlsAmId = request.asrAlsAmId;
            this.asrBaseId = request.asrBaseId;
            this.asrModelId = request.asrModelId;
            this.asrVocabularyId = request.asrVocabularyId;
            this.backgroundFileCode = request.backgroundFileCode;
            this.backgroundSpeed = request.backgroundSpeed;
            this.backgroundVolume = request.backgroundVolume;
            this.calledNumber = request.calledNumber;
            this.calledShowNumber = request.calledShowNumber;
            this.dynamicId = request.dynamicId;
            this.earlyMediaAsr = request.earlyMediaAsr;
            this.enableITN = request.enableITN;
            this.muteTime = request.muteTime;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.pauseTime = request.pauseTime;
            this.playTimes = request.playTimes;
            this.prodCode = request.prodCode;
            this.recordFlag = request.recordFlag;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sessionTimeout = request.sessionTimeout;
            this.speed = request.speed;
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
         * AsrAlsAmId.
         */
        public Builder asrAlsAmId(String asrAlsAmId) {
            this.putQueryParameter("AsrAlsAmId", asrAlsAmId);
            this.asrAlsAmId = asrAlsAmId;
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
         * AsrVocabularyId.
         */
        public Builder asrVocabularyId(String asrVocabularyId) {
            this.putQueryParameter("AsrVocabularyId", asrVocabularyId);
            this.asrVocabularyId = asrVocabularyId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>137****0000</p>
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0571****0000</p>
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
         * PlayTimes.
         */
        public Builder playTimes(Integer playTimes) {
            this.putQueryParameter("PlayTimes", playTimes);
            this.playTimes = playTimes;
            return this;
        }

        /**
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2d4c-4e78-8d2a-afbb06cf****.wav,$name$</p>
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
        public SendCcoSmartCallRequest build() {
            return new SendCcoSmartCallRequest(this);
        } 

    } 

}
