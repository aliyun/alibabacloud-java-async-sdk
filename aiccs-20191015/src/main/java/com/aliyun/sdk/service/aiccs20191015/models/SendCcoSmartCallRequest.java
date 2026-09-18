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
         * <p>Specifies whether the opening audio file can be interrupted. Default value: <strong>true</strong>, which indicates the opening audio file can be interrupted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder actionCodeBreak(Boolean actionCodeBreak) {
            this.putQueryParameter("ActionCodeBreak", actionCodeBreak);
            this.actionCodeBreak = actionCodeBreak;
            return this;
        }

        /**
         * <p>The duration threshold for interrupting based on continuous user speech. This parameter takes effect only when ActionCodeBreak is set to <strong>true</strong>. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder actionCodeTimeBreak(Integer actionCodeTimeBreak) {
            this.putQueryParameter("ActionCodeTimeBreak", actionCodeTimeBreak);
            this.actionCodeTimeBreak = actionCodeTimeBreak;
            return this;
        }

        /**
         * <p>The acoustic model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder asrAlsAmId(String asrAlsAmId) {
            this.putQueryParameter("AsrAlsAmId", asrAlsAmId);
            this.asrAlsAmId = asrAlsAmId;
            return this;
        }

        /**
         * <p>The ASR foundation model.</p>
         * <ul>
         * <li><strong>customer_service_8k</strong>: Mandarin.</li>
         * <li><strong>dialect_customer_service_8k</strong>: Heavy accent.</li>
         * <li>If only <strong>asrModelId</strong> is set, the specified ASR model is used.</li>
         * <li>If only <strong>AsrBaseId</strong> is set, the specified ASR foundation model is used.</li>
         * <li>If neither is set, the default ASR foundation model is used. The default value of <strong>AsrBaseId</strong> is <strong>customer_service_8k</strong>, which indicates the ASR Mandarin foundation model.</li>
         * <li>If both are set, make sure they correspond correctly.</li>
         * </ul>
         * <blockquote>
         * <p>When you call the <strong>SendCcoSmartCall</strong> operation, specify the ASR model to use. Set either <strong>asrModelId</strong> or <strong>AsrBaseId</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>customer_service_8k</p>
         */
        public Builder asrBaseId(String asrBaseId) {
            this.putQueryParameter("AsrBaseId", asrBaseId);
            this.asrBaseId = asrBaseId;
            return this;
        }

        /**
         * <p>The ASR model ID. View the ASR model ID on the <a href="https://aiccs.console.aliyun.com/sentence/model/private?spm=a2c4g.11186623.0.0.7f9b2964fYSGv4">ASR Model Management page</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>bf71664d30d2478fb8cb8c39c6b6****</p>
         */
        public Builder asrModelId(String asrModelId) {
            this.putQueryParameter("AsrModelId", asrModelId);
            this.asrModelId = asrModelId;
            return this;
        }

        /**
         * <p>The hot word ID. View the ASR hot word ID on the <a href="https://aiccs.console.aliyun.com/sentence/vocab?spm=a2c4g.11186623.0.0.7f9bf965IKBpsi">ASR Hot Word Management page</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder asrVocabularyId(String asrVocabularyId) {
            this.putQueryParameter("AsrVocabularyId", asrVocabularyId);
            this.asrVocabularyId = asrVocabularyId;
            return this;
        }

        /**
         * <p>The ID of the background audio file played during the conversation between the user and the robot. Log on to the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>, choose <strong>Intelligent Interaction &gt; Voice File Management</strong>, and click <strong>Details</strong> to view the corresponding voice ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2d4c-4e78-8d2a-afbb06cf****.wav</p>
         */
        public Builder backgroundFileCode(String backgroundFileCode) {
            this.putQueryParameter("BackgroundFileCode", backgroundFileCode);
            this.backgroundFileCode = backgroundFileCode;
            return this;
        }

        /**
         * <p>This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder backgroundSpeed(Integer backgroundSpeed) {
            this.putQueryParameter("BackgroundSpeed", backgroundSpeed);
            this.backgroundSpeed = backgroundSpeed;
            return this;
        }

        /**
         * <p>This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder backgroundVolume(Integer backgroundVolume) {
            this.putQueryParameter("BackgroundVolume", backgroundVolume);
            this.backgroundVolume = backgroundVolume;
            return this;
        }

        /**
         * <p>The called number. Only numbers in the Chinese mainland are supported.</p>
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
         * <p>The China-only caller ID displayed to the called party. The number must be a purchased number.</p>
         * <p>Log on to the <a href="https://aiccs.console.aliyun.com/overview?spm=a2c4g.11186623.0.0.7f9bf9658X6jte">Contact Center console</a> to view purchased numbers.</p>
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
         * <p>The dynamic extension ID reserved for the caller. This ID is returned in the callback URL for the caller\&quot;s development identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder dynamicId(String dynamicId) {
            this.putQueryParameter("DynamicId", dynamicId);
            this.dynamicId = dynamicId;
            return this;
        }

        /**
         * <p>The early media speech recognition flag. If set to true, the reason for unanswered calls is recorded. Default value: <strong>false</strong>, which indicates the feature is disabled.</p>
         * <blockquote>
         * <p>To enable early media speech recognition, manually set this parameter to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder earlyMediaAsr(Boolean earlyMediaAsr) {
            this.putQueryParameter("EarlyMediaAsr", earlyMediaAsr);
            this.earlyMediaAsr = earlyMediaAsr;
            return this;
        }

        /**
         * <p>Specifies whether to perform Inverse Text Normalization (ITN) in post-processing.</p>
         * <blockquote>
         * <p>When set to <strong>true</strong>, Chinese numerals are converted to Arabic numerals in the output. Default value: <strong>false</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableITN(Boolean enableITN) {
            this.putQueryParameter("EnableITN", enableITN);
            this.enableITN = enableITN;
            return this;
        }

        /**
         * <p>The silence duration. Specifies how long the call ends after the user stops speaking. Unit: milliseconds. Valid values: <strong>1000 to 20000</strong>.</p>
         * <ul>
         * <li>If the specified value is outside this range, the default value of <strong>10000</strong> is used.</li>
         * <li>This parameter can be dynamically set during the call. The last setting takes effect.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder muteTime(Integer muteTime) {
            this.putQueryParameter("MuteTime", muteTime);
            this.muteTime = muteTime;
            return this;
        }

        /**
         * <p>The ID reserved for the caller. This ID is returned to the caller in the receipt message. The value is a string of 1 to 15 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>222356****</p>
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
         * <p>The pause duration. Specifies how long a user pause indicates the end of a sentence. Unit: milliseconds. Valid values: <strong>300 to 1200</strong>. If the specified value is outside this range, the default value of <strong>800</strong> is used.</p>
         * <blockquote>
         * <p>Only the first setting takes effect. Subsequent settings are ignored.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        public Builder pauseTime(Integer pauseTime) {
            this.putQueryParameter("PauseTime", pauseTime);
            this.pauseTime = pauseTime;
            return this;
        }

        /**
         * <p>This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder playTimes(Integer playTimes) {
            this.putQueryParameter("PlayTimes", playTimes);
            this.playTimes = playTimes;
            return this;
        }

        /**
         * <p>The product name. Default value: <strong>aiccs</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>aiccs</p>
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        /**
         * <p>Specifies whether to record the call. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Record the call.</li>
         * <li><strong>false</strong>: Do not record the call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The maximum call duration. Unit: seconds. The call is automatically hung up after the timeout.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder sessionTimeout(Integer sessionTimeout) {
            this.putQueryParameter("SessionTimeout", sessionTimeout);
            this.sessionTimeout = sessionTimeout;
            return this;
        }

        /**
         * <p>This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder speed(Integer speed) {
            this.putQueryParameter("Speed", speed);
            this.speed = speed;
            return this;
        }

        /**
         * <p>Specifies whether to set TTS voice parameters. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Set the voice style by using the TtsStyle, TtsVolume, and TtsSpeed parameters.</li>
         * <li><strong>false</strong>: Do not set the related parameters. Even if they are set, they do not take effect.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ttsConf(Boolean ttsConf) {
            this.putQueryParameter("TtsConf", ttsConf);
            this.ttsConf = ttsConf;
            return this;
        }

        /**
         * <p>The voice speed for TTS variable playback. Valid values: -200 to 200. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder ttsSpeed(Integer ttsSpeed) {
            this.putQueryParameter("TtsSpeed", ttsSpeed);
            this.ttsSpeed = ttsSpeed;
            return this;
        }

        /**
         * <p>The voice style for TTS variable playback. Default value: <strong>xiaoyun</strong>. For specific styles, refer to the voice style list.</p>
         * 
         * <strong>example:</strong>
         * <p>xiaoyun</p>
         */
        public Builder ttsStyle(String ttsStyle) {
            this.putQueryParameter("TtsStyle", ttsStyle);
            this.ttsStyle = ttsStyle;
            return this;
        }

        /**
         * <p>The volume for TTS variable playback. Valid values: <strong>0 to 100</strong>. Default value: <strong>0</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder ttsVolume(Integer ttsVolume) {
            this.putQueryParameter("TtsVolume", ttsVolume);
            this.ttsVolume = ttsVolume;
            return this;
        }

        /**
         * <p>The intelligent outbound call audio file. Network files and text-to-speech (TTS) are supported. Multiple files and TTS parameters can be mixed and separated by commas (,). The replacement values for TTS parameters are specified in <strong>VoiceCodeParam</strong>.</p>
         * <ul>
         * <li>When the audio file is a network file: Set VoiceCode to a public network access audio file URL. Use a WAV format audio file with a sampling frequency of 8000 Hz or 16000 Hz.</li>
         * <li>When the audio file is TTS: Set VoiceCode to a variable name such as $name$, and set the corresponding content for the variable in VoiceCodeParam in <strong>Settings</strong>.</li>
         * </ul>
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
         * <p>The TTS parameter string in JSON format. This parameter must correspond to the TTS parameters in VoiceCode.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;Hello, how are you&quot;}</p>
         */
        public Builder voiceCodeParam(String voiceCodeParam) {
            this.putQueryParameter("VoiceCodeParam", voiceCodeParam);
            this.voiceCodeParam = voiceCodeParam;
            return this;
        }

        /**
         * <p>The volume for playing user audio. Valid values: -4 to 4. Set this parameter to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
