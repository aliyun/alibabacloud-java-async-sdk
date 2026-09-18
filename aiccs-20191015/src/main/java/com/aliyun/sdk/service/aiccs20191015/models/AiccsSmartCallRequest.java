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
 * {@link AiccsSmartCallRequest} extends {@link RequestModel}
 *
 * <p>AiccsSmartCallRequest</p>
 */
public class AiccsSmartCallRequest extends Request {
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

    private AiccsSmartCallRequest(Builder builder) {
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

    public static AiccsSmartCallRequest create() {
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

    public static final class Builder extends Request.Builder<AiccsSmartCallRequest, Builder> {
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

        private Builder(AiccsSmartCallRequest request) {
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
         * <p>Whether the initial audio playback file is interruptible. The default value is <strong>true</strong>, which means the initial audio playback file can be interrupted.</p>
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
         * <p>Interrupts based on the user\&quot;s continuous speaking duration. Takes effect only when ActionCodeBreak is <strong>true</strong>. Unit: milliseconds.</p>
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
         * <p>Acoustic model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23387****</p>
         */
        public Builder asrAlsAmId(String asrAlsAmId) {
            this.putQueryParameter("AsrAlsAmId", asrAlsAmId);
            this.asrAlsAmId = asrAlsAmId;
            return this;
        }

        /**
         * <p>ASR foundation model.</p>
         * <ul>
         * <li><strong>customer_service_8k</strong>: Mandarin.</li>
         * <li><strong>dialect_customer_service_8k</strong>: Heavy accent.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>When invoking the <strong>SendCcoSmartCall</strong> API, you must specify an ASR model. We recommend that you provide either the <strong>asrModelId</strong> or <strong>AsrBaseId</strong> parameter.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>If only <strong>asrModelId</strong> is set, the specified ASR model is used.</li>
         * <li>If only <strong>AsrBaseId</strong> is set, the specified ASR foundation model is used.</li>
         * <li>If neither parameter is set, the default ASR foundation model is used. By default, <strong>AsrBaseId</strong> is <strong>customer_service_8k</strong>, which corresponds to the Mandarin ASR foundation model.</li>
         * <li>If both parameters are set, confirm that they correctly correspond to each other.</li>
         * </ul>
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
         * <p>ASR model ID. You can view the ASR model ID on the <a href="https://aiccs.console.aliyun.com/sentence/model/private?spm=a2c4g.11186623.0.0.7f9b2964fYSGv4">ASR Model Management page</a>.</p>
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
         * <p>Hotword ID. You can view the ASR hotword ID on the <a href="https://aiccs.console.aliyun.com/sentence/vocab?spm=a2c4g.11186623.0.0.7f9bf965IKBpsi">ASR Hotword Management Page</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>6689****</p>
         */
        public Builder asrVocabularyId(String asrVocabularyId) {
            this.putQueryParameter("AsrVocabularyId", asrVocabularyId);
            this.asrVocabularyId = asrVocabularyId;
            return this;
        }

        /**
         * <p>ID of the background audio file played during the conversation between the user and the robot.  </p>
         * <p>You can log on to the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>, choose <strong>Intelligent Interaction &gt; Audio File Management</strong>, and click <strong>View</strong> to check the corresponding audio ID.</p>
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
         * <p>This parameter is currently not supported.</p>
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
         * <p>The parameter is not supported yet.</p>
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
         * <p>Called number. Only numbers in the Chinese mainland are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1862222****</p>
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * <p>The caller ID displayed to the callee. This must be a number you have purchased.</p>
         * <p>You can log on to the <a href="https://aiccs.console.aliyun.com/overview?spm=a2c4g.11186623.0.0.7f9bf9658X6jte">Contact Center console</a> to view your purchased numbers.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0571000****</p>
         */
        public Builder calledShowNumber(String calledShowNumber) {
            this.putQueryParameter("CalledShowNumber", calledShowNumber);
            this.calledShowNumber = calledShowNumber;
            return this;
        }

        /**
         * <p>A dynamic extension ID reserved for the caller, which is returned in the webhook address to serve as the customer\&quot;s developer identity.</p>
         * 
         * <strong>example:</strong>
         * <p>2234****</p>
         */
        public Builder dynamicId(String dynamicId) {
            this.putQueryParameter("DynamicId", dynamicId);
            this.dynamicId = dynamicId;
            return this;
        }

        /**
         * <p>Early media speech recognition identity. When set to <strong>true</strong>, it records the reason why the call was not answered. Default value: <strong>false</strong>, meaning disabled.</p>
         * <blockquote>
         * <p>To enable early media speech recognition, you must manually set this parameter to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fasle</p>
         */
        public Builder earlyMediaAsr(Boolean earlyMediaAsr) {
            this.putQueryParameter("EarlyMediaAsr", earlyMediaAsr);
            this.earlyMediaAsr = earlyMediaAsr;
            return this;
        }

        /**
         * <p>Whether to execute ITN during post-processing.  </p>
         * <blockquote>
         * <p>When set to <strong>true</strong>, Chinese numerals are converted to Arabic numerals in the output. The default value is <strong>false</strong>.</p>
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
         * <p>Silence duration. This parameter defines how long the call waits for user speech before ending the call. The unit is milliseconds, and valid values range from <strong>1000 to 20000</strong>.</p>
         * <ul>
         * <li>If the specified value is outside this range, <strong>MuteTime</strong> defaults to <strong>10000</strong>.</li>
         * <li>This parameter can be dynamically updated during the call. The last set value takes effect.</li>
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
         * <p>An ID reserved for the caller. This ID will be returned to the caller in the receipt message.<br>It is a string with a length of 1 to 15 bytes.</p>
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
         * <p>Pause duration. Specifies how long the user must pause to indicate the end of a sentence. Unit: milliseconds. Valid range: <strong>300–1200</strong>.</p>
         * <ul>
         * <li>If the specified value is outside this range, PauseTime defaults to <strong>800</strong>.</li>
         * <li>Only the first setting takes effect; subsequent settings are ignored.</li>
         * </ul>
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
         * <p>The parameter is not supported yet.</p>
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
         * <p>Product name. Default value: <strong>aiccs</strong>.</p>
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
         * <p>Whether to record during the call.</p>
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
         * <p>Maximum call duration, in seconds. The call is automatically disconnected after timeout.</p>
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
         * <p>This parameter is not currently supported.</p>
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
         * <p>Whether to configure TTS voice parameters.</p>
         * <ul>
         * <li>If set to <strong>true</strong>, you must use the TtsStyle, TtsVolume, and TtsSpeed parameters to define the voice style.</li>
         * <li>If set to <strong>false</strong>, related parameters are not required and will have no effect even if configured.</li>
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
         * <p>Speech speed when playing TTS variables. Valid values range from <strong>-200 to 200</strong>. The default value is <strong>0</strong>.</p>
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
         * <p>Voice style used during TTS variable playback. Default value: <strong>xiaoyun</strong>. For available styles, see the voice style list.</p>
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
         * <p>The volume for TTS variable playback. Valid values range from <strong>0 to 100</strong>. The default value is <strong>0</strong>.</p>
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
         * <p>The Intelligent Outbound Call playback audio file supports both network files and TTS. Multiple files and TTS parameters can be mixed for playback, separated by commas (,). The replacement values for TTS parameters are specified in <strong>VoiceCodeParam</strong>.</p>
         * <ul>
         * <li>When the playback file is a network file: Set the VoiceCode parameter to a publicly accessible URL of the audio file. We recommend using a WAV-formatted audio file with a sampling frequency of 8000 Hz or 16000 Hz.</li>
         * <li>When the playback file uses TTS: Set the VoiceCode parameter to a variable name such as $name$, and define the corresponding content for this variable in VoiceCodeParam.</li>
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
         * <p>TTS parameter string in JSON format. It must correspond to the TTS parameters of VoiceCode.</p>
         * 
         * <strong>example:</strong>
         * <p>“{\”name\”:\”喂，你好\”}”</p>
         */
        public Builder voiceCodeParam(String voiceCodeParam) {
            this.putQueryParameter("VoiceCodeParam", voiceCodeParam);
            this.voiceCodeParam = voiceCodeParam;
            return this;
        }

        /**
         * <p>The volume for playing user audio. Valid values range from <strong>-4 to 4</strong>. We recommend setting it to <strong>1</strong>.</p>
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
        public AiccsSmartCallRequest build() {
            return new AiccsSmartCallRequest(this);
        } 

    } 

}
