// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SmartCallRequest} extends {@link RequestModel}
 *
 * <p>SmartCallRequest</p>
 */
public class SmartCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionCodeBreak")
    private Boolean actionCodeBreak;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionCodeTimeBreak")
    private Integer actionCodeTimeBreak;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsrBaseId")
    private String asrBaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsrModelId")
    private String asrModelId;

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
    @com.aliyun.core.annotation.NameInMap("NoiseThreshold")
    private Double noiseThreshold;

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
    @com.aliyun.core.annotation.NameInMap("StreamAsr")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer streamAsr;

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
         * <p>Specifies whether the playback of the recording file can be interrupted. Default value: <strong>true</strong>. The default value indicates that the playback of the recording file can be interrupted.</p>
         * <p>If you set the value of this parameter to false, the playback of the recording file cannot be interrupted even if the value of action_break is set to true.</p>
         * <blockquote>
         * <p>The value of action_code_break takes precedence over the value of action_break.</p>
         * </blockquote>
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
         * <p>The duration that the user keeps speaking. The playback of the recording file is interrupted when this duration is reached. Unit: milliseconds.</p>
         * <p>If the value of ActionCodeBreak is set to <strong>true</strong> for the recording file and the duration that the user keeps speaking reaches the specified duration, the playback of the recording file is interrupted. If you do not specify ActionCodeTimeBreak or set the value of ActionCodeTimeBreak to 0, the setting of ActionCodeBreak does not take effect.</p>
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
         * <p>The ASR base model. Valid values:</p>
         * <ul>
         * <li><strong>customer_service_8k</strong> (default): Chinese Mandarin.</li>
         * <li><strong>dialect_customer_service_8k</strong>: a heavy accent.</li>
         * </ul>
         * <blockquote>
         * <p>You must specify the ASR model when you call the SmartCall operation. We recommend that you specify either of the AsrModelId and AsrBaseId parameters.</p>
         * </blockquote>
         * <ul>
         * <li><p>If you specify only the AsrModelId parameter, the specified ASR model is used.</p>
         * </li>
         * <li><p>If you specify only the AsrBaseId parameter, the ASR base model is used.</p>
         * </li>
         * <li><p>If you specify neither of the two parameters, the default ASR base model is used, that is, the default value customer_service_8k is used for the AsrBaseId parameter.</p>
         * </li>
         * <li><p>If you specify both parameters, make sure that their values do not conflict with each other.</p>
         * </li>
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
         * <p>The ID of the Automatic Speech Recognition (ASR) model.</p>
         * <p>You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a> and view the ID of the ASR model on the <strong>ASR Model Management</strong> page.</p>
         * <blockquote>
         * <p>You must specify the ASR model when you call the SmartCall operation. We recommend that you specify either of the AsrModelId and AsrBaseId parameters.</p>
         * </blockquote>
         * <ul>
         * <li><p>If you specify only the AsrModelId parameter, the specified ASR model is used.</p>
         * </li>
         * <li><p>If you specify only the AsrBaseId parameter, the specified ASR base model is used.</p>
         * </li>
         * <li><p>If you specify neither of the two parameters, the default value customer_service_8k is used for the AsrBaseId parameter. This means that the default Mandarin ASR base model is used.</p>
         * </li>
         * <li><p>If you specify both parameters, make sure that their values do not conflict with each other.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2070aca1eff146f9a7bc826f1c3d****</p>
         */
        public Builder asrModelId(String asrModelId) {
            this.putQueryParameter("AsrModelId", asrModelId);
            this.asrModelId = asrModelId;
            return this;
        }

        /**
         * <p>The ID of the background voice file that is played back when the user talks with the robot.</p>
         * <p>You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a>, choose <strong>Voice File Management</strong>, click the <strong>Intelligent Speech Interaction Recording File</strong> tab, and then click <strong>Details</strong> in the Actions column to view the voice ID.</p>
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
         * <p>This parameter is unavailable.</p>
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
         * <p>This parameter is unavailable.</p>
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
         * <p>The called number. Only phone numbers in the Chinese mainland are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1590****0000</p>
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * <p>The number displayed to the called party. The value must be the number you purchased.</p>
         * <p>You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a> and choose <strong>Voice Numbers</strong> &gt; <strong>Real Number Management</strong> to view the number you purchased.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0571****5678</p>
         */
        public Builder calledShowNumber(String calledShowNumber) {
            this.putQueryParameter("CalledShowNumber", calledShowNumber);
            this.calledShowNumber = calledShowNumber;
            return this;
        }

        /**
         * <p>The dynamic extension ID that is reserved for the caller of the operation. This ID is returned in the callback URL and is used as the development identifier of the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>abcdefgh</p>
         */
        public Builder dynamicId(String dynamicId) {
            this.putQueryParameter("DynamicId", dynamicId);
            this.dynamicId = dynamicId;
            return this;
        }

        /**
         * <p>Specifies whether to enable speech recognition of early media. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): Speech recognition of early media is disabled.</li>
         * <li><strong>true</strong>: Speech recognition of early media is enabled.</li>
         * </ul>
         * <blockquote>
         * <p>If you set the value of this parameter to <strong>true</strong>, the reason why the call is not answered is recorded.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder earlyMediaAsr(Boolean earlyMediaAsr) {
            this.putQueryParameter("EarlyMediaAsr", earlyMediaAsr);
            this.earlyMediaAsr = earlyMediaAsr;
            return this;
        }

        /**
         * <p>Specifies whether to enable Inverse Text Normalization (ITN) during post-processing. Default value: <strong>false</strong>. If you set the value to false, ITN is not enabled during post-processing.</p>
         * <p>If you set the value to <strong>true</strong>, Chinese numerals are converted into Arabic numerals for output.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableITN(Boolean enableITN) {
            this.putQueryParameter("EnableITN", enableITN);
            this.enableITN = enableITN;
            return this;
        }

        /**
         * <p>The silence duration. The system determines the end of the conversation based on the silence duration of the user. Unit: milliseconds. Valid values: 1000 to 20000.****</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you specify a value out of the valid range, the default value <strong>10000</strong> is used.</p>
         * </li>
         * <li><p>The parameter value can be adjusted during the conversation. The last setting prevails.</p>
         * </li>
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
         * NoiseThreshold.
         */
        public Builder noiseThreshold(Double noiseThreshold) {
            this.putQueryParameter("NoiseThreshold", noiseThreshold);
            this.noiseThreshold = noiseThreshold;
            return this;
        }

        /**
         * <p>The ID that is reserved for the caller of the operation. This ID is returned to the caller in a receipt message.</p>
         * <p>The value is of the STRING type and must be 1 to 15 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>342268*****</p>
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
         * <p>The pause duration. The system determines the end of a sentence based on the pause duration of the user in the conversation. Unit: milliseconds. Valid values: 300 to 1200.****</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you specify a value out of the valid range, the default value <strong>800</strong> is used.</p>
         * </li>
         * <li><p>You cannot change the parameter value after specifying it.</p>
         * </li>
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
         * <p>Specifies whether to record the conversation. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The conversation is recorded.</li>
         * <li><strong>false</strong>: The conversation is not recorded.</li>
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
         * <p>The maximum call duration. The call is automatically hung up when the maximum call duration is reached. Unit: seconds.</p>
         * <blockquote>
         * <p>The maximum call duration is 3,600 seconds.</p>
         * </blockquote>
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
         * <p>This parameter is unavailable.</p>
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
         * <p>Specifies whether to enable streaming ASR, which intelligently judges what the user wants to express based on the first few words spoken by the user. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Streaming ASR is disabled.</li>
         * <li><strong>1</strong>: Streaming ASR is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder streamAsr(Integer streamAsr) {
            this.putQueryParameter("StreamAsr", streamAsr);
            this.streamAsr = streamAsr;
            return this;
        }

        /**
         * <p>Specifies whether to set TTS sound parameters. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: TTS sound parameters must be set. You must set the <strong>TtsStyle</strong>, <strong>TtsColume</strong>, and <strong>TtsSpeed</strong> parameters to specify a sound style.</li>
         * <li><strong>false</strong>: TTS sound parameters do not need to be set. The values of TTS sound parameters do not take effect even if you set them.</li>
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
         * <p>The speed of TTS variable playback. Valid values: -200 to 200. Default value: 0.</p>
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
         * <p>The sound style for TTS variable playback. Default value: <strong>xiaoyun</strong>. For more information about the sound styles, see the <strong>Sound styles</strong> table below.</p>
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
         * <p>The volume of TTS variable playback. Valid values: 0 to 100. Default value: 0.</p>
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
         * <p>The recording file that is played back in the intelligent outbound call.</p>
         * <p>The file can be an online file, a voice file uploaded from the Voice Messaging Service console, or a text-to-speech (TTS) template that contains variables. You can specify multiple files and a TTS variable together. Separate them with commas (,). The values of the variables in the TTS template are specified by the <strong>VoiceCodeParam</strong> parameter.</p>
         * <ul>
         * <li>If you use an online file as the recording file, set the value of <strong>VoiceCode</strong> to the URL of the file that can be accessed over the Internet.</li>
         * <li>If you use a voice file uploaded from the Voice Messaging Service console as the recording file, set the value of <strong>VoiceCode</strong> to the voice ID of the file. You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a>, choose <strong>Voice File Management</strong>, click the <strong>Intelligent Speech Interaction Recording File</strong> tab, and then click <strong>Details</strong> in the Actions column to view the voice ID.</li>
         * <li>If you use a TTS template that contains variables as the recording file, set the value of <strong>VoiceCode</strong> to a variable name such as $name$, and also set a value for the variable in the <strong>VoiceCodeParam</strong> parameter.</li>
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
         * <p>The value of the TTS variable, in the JSON format. This value must match the TTS variable specified by the <strong>VoiceCode</strong> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;hello&quot;}</p>
         */
        public Builder voiceCodeParam(String voiceCodeParam) {
            this.putQueryParameter("VoiceCodeParam", voiceCodeParam);
            this.voiceCodeParam = voiceCodeParam;
            return this;
        }

        /**
         * <p>The volume at which the recording file is played. Valid values: -4 to 4. We recommend that you set the value of this parameter to <strong>1</strong>.</p>
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
        public SmartCallRequest build() {
            return new SmartCallRequest(this);
        } 

    } 

}
