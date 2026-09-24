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
 * {@link UpdateModelApplicationRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelApplicationRequest</p>
 */
public class UpdateModelApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationCps")
    private Long applicationCps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    private String applicationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallAssistantHangup")
    private Boolean callAssistantHangup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallAssistantRecognize")
    private Boolean callAssistantRecognize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallConnectedTriggerModel")
    private Boolean callConnectedTriggerModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtmfAllowedDigits")
    private String dtmfAllowedDigits;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtmfAutoValidateEnable")
    private Boolean dtmfAutoValidateEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtmfDigitCount")
    private Long dtmfDigitCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtmfInputTimeout")
    private Long dtmfInputTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtmfOutOfRangeAction")
    private String dtmfOutOfRangeAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtmfRetryPlayTimes")
    private Long dtmfRetryPlayTimes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtmfRetryPromptText")
    private String dtmfRetryPromptText;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtmfSendMaxCount")
    private Long dtmfSendMaxCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtmfSendWaitTimeout")
    private Long dtmfSendWaitTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DyvmsSceneName")
    private String dyvmsSceneName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableDtmfReceive")
    private Boolean enableDtmfReceive;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableDtmfSend")
    private Boolean enableDtmfSend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableMorse")
    private Boolean enableMorse;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InterruptConfig")
    private InterruptConfig interruptConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelCode")
    private String modelCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelVersion")
    private String modelVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MuteActive")
    private Boolean muteActive;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MuteDuration")
    private Long muteDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MuteHangupNum")
    private Long muteHangupNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MutePushMode")
    private String mutePushMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PauseTime")
    private Long pauseTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualificationId")
    private Long qualificationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualificationName")
    private String qualificationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordingFile")
    private String recordingFile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionTimeout")
    private Long sessionTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpeechContent")
    private String speechContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpeechId")
    private Long speechId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartWord")
    private String startWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartWordType")
    private Long startWordType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtsConfig")
    private TtsConfig ttsConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsageDesc")
    private String usageDesc;

    private UpdateModelApplicationRequest(Builder builder) {
        super(builder);
        this.applicationCode = builder.applicationCode;
        this.applicationCps = builder.applicationCps;
        this.applicationName = builder.applicationName;
        this.callAssistantHangup = builder.callAssistantHangup;
        this.callAssistantRecognize = builder.callAssistantRecognize;
        this.callConnectedTriggerModel = builder.callConnectedTriggerModel;
        this.dtmfAllowedDigits = builder.dtmfAllowedDigits;
        this.dtmfAutoValidateEnable = builder.dtmfAutoValidateEnable;
        this.dtmfDigitCount = builder.dtmfDigitCount;
        this.dtmfInputTimeout = builder.dtmfInputTimeout;
        this.dtmfOutOfRangeAction = builder.dtmfOutOfRangeAction;
        this.dtmfRetryPlayTimes = builder.dtmfRetryPlayTimes;
        this.dtmfRetryPromptText = builder.dtmfRetryPromptText;
        this.dtmfSendMaxCount = builder.dtmfSendMaxCount;
        this.dtmfSendWaitTimeout = builder.dtmfSendWaitTimeout;
        this.dyvmsSceneName = builder.dyvmsSceneName;
        this.enableDtmfReceive = builder.enableDtmfReceive;
        this.enableDtmfSend = builder.enableDtmfSend;
        this.enableMorse = builder.enableMorse;
        this.interruptConfig = builder.interruptConfig;
        this.modelCode = builder.modelCode;
        this.modelVersion = builder.modelVersion;
        this.muteActive = builder.muteActive;
        this.muteDuration = builder.muteDuration;
        this.muteHangupNum = builder.muteHangupNum;
        this.mutePushMode = builder.mutePushMode;
        this.ownerId = builder.ownerId;
        this.pauseTime = builder.pauseTime;
        this.prompt = builder.prompt;
        this.qualificationId = builder.qualificationId;
        this.qualificationName = builder.qualificationName;
        this.recordingFile = builder.recordingFile;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sessionTimeout = builder.sessionTimeout;
        this.source = builder.source;
        this.speechContent = builder.speechContent;
        this.speechId = builder.speechId;
        this.startWord = builder.startWord;
        this.startWordType = builder.startWordType;
        this.ttsConfig = builder.ttsConfig;
        this.usageDesc = builder.usageDesc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelApplicationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationCode
     */
    public String getApplicationCode() {
        return this.applicationCode;
    }

    /**
     * @return applicationCps
     */
    public Long getApplicationCps() {
        return this.applicationCps;
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return callAssistantHangup
     */
    public Boolean getCallAssistantHangup() {
        return this.callAssistantHangup;
    }

    /**
     * @return callAssistantRecognize
     */
    public Boolean getCallAssistantRecognize() {
        return this.callAssistantRecognize;
    }

    /**
     * @return callConnectedTriggerModel
     */
    public Boolean getCallConnectedTriggerModel() {
        return this.callConnectedTriggerModel;
    }

    /**
     * @return dtmfAllowedDigits
     */
    public String getDtmfAllowedDigits() {
        return this.dtmfAllowedDigits;
    }

    /**
     * @return dtmfAutoValidateEnable
     */
    public Boolean getDtmfAutoValidateEnable() {
        return this.dtmfAutoValidateEnable;
    }

    /**
     * @return dtmfDigitCount
     */
    public Long getDtmfDigitCount() {
        return this.dtmfDigitCount;
    }

    /**
     * @return dtmfInputTimeout
     */
    public Long getDtmfInputTimeout() {
        return this.dtmfInputTimeout;
    }

    /**
     * @return dtmfOutOfRangeAction
     */
    public String getDtmfOutOfRangeAction() {
        return this.dtmfOutOfRangeAction;
    }

    /**
     * @return dtmfRetryPlayTimes
     */
    public Long getDtmfRetryPlayTimes() {
        return this.dtmfRetryPlayTimes;
    }

    /**
     * @return dtmfRetryPromptText
     */
    public String getDtmfRetryPromptText() {
        return this.dtmfRetryPromptText;
    }

    /**
     * @return dtmfSendMaxCount
     */
    public Long getDtmfSendMaxCount() {
        return this.dtmfSendMaxCount;
    }

    /**
     * @return dtmfSendWaitTimeout
     */
    public Long getDtmfSendWaitTimeout() {
        return this.dtmfSendWaitTimeout;
    }

    /**
     * @return dyvmsSceneName
     */
    public String getDyvmsSceneName() {
        return this.dyvmsSceneName;
    }

    /**
     * @return enableDtmfReceive
     */
    public Boolean getEnableDtmfReceive() {
        return this.enableDtmfReceive;
    }

    /**
     * @return enableDtmfSend
     */
    public Boolean getEnableDtmfSend() {
        return this.enableDtmfSend;
    }

    /**
     * @return enableMorse
     */
    public Boolean getEnableMorse() {
        return this.enableMorse;
    }

    /**
     * @return interruptConfig
     */
    public InterruptConfig getInterruptConfig() {
        return this.interruptConfig;
    }

    /**
     * @return modelCode
     */
    public String getModelCode() {
        return this.modelCode;
    }

    /**
     * @return modelVersion
     */
    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * @return muteActive
     */
    public Boolean getMuteActive() {
        return this.muteActive;
    }

    /**
     * @return muteDuration
     */
    public Long getMuteDuration() {
        return this.muteDuration;
    }

    /**
     * @return muteHangupNum
     */
    public Long getMuteHangupNum() {
        return this.muteHangupNum;
    }

    /**
     * @return mutePushMode
     */
    public String getMutePushMode() {
        return this.mutePushMode;
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
    public Long getPauseTime() {
        return this.pauseTime;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return qualificationId
     */
    public Long getQualificationId() {
        return this.qualificationId;
    }

    /**
     * @return qualificationName
     */
    public String getQualificationName() {
        return this.qualificationName;
    }

    /**
     * @return recordingFile
     */
    public String getRecordingFile() {
        return this.recordingFile;
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
    public Long getSessionTimeout() {
        return this.sessionTimeout;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return speechContent
     */
    public String getSpeechContent() {
        return this.speechContent;
    }

    /**
     * @return speechId
     */
    public Long getSpeechId() {
        return this.speechId;
    }

    /**
     * @return startWord
     */
    public String getStartWord() {
        return this.startWord;
    }

    /**
     * @return startWordType
     */
    public Long getStartWordType() {
        return this.startWordType;
    }

    /**
     * @return ttsConfig
     */
    public TtsConfig getTtsConfig() {
        return this.ttsConfig;
    }

    /**
     * @return usageDesc
     */
    public String getUsageDesc() {
        return this.usageDesc;
    }

    public static final class Builder extends Request.Builder<UpdateModelApplicationRequest, Builder> {
        private String applicationCode; 
        private Long applicationCps; 
        private String applicationName; 
        private Boolean callAssistantHangup; 
        private Boolean callAssistantRecognize; 
        private Boolean callConnectedTriggerModel; 
        private String dtmfAllowedDigits; 
        private Boolean dtmfAutoValidateEnable; 
        private Long dtmfDigitCount; 
        private Long dtmfInputTimeout; 
        private String dtmfOutOfRangeAction; 
        private Long dtmfRetryPlayTimes; 
        private String dtmfRetryPromptText; 
        private Long dtmfSendMaxCount; 
        private Long dtmfSendWaitTimeout; 
        private String dyvmsSceneName; 
        private Boolean enableDtmfReceive; 
        private Boolean enableDtmfSend; 
        private Boolean enableMorse; 
        private InterruptConfig interruptConfig; 
        private String modelCode; 
        private String modelVersion; 
        private Boolean muteActive; 
        private Long muteDuration; 
        private Long muteHangupNum; 
        private String mutePushMode; 
        private Long ownerId; 
        private Long pauseTime; 
        private String prompt; 
        private Long qualificationId; 
        private String qualificationName; 
        private String recordingFile; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long sessionTimeout; 
        private String source; 
        private String speechContent; 
        private Long speechId; 
        private String startWord; 
        private Long startWordType; 
        private TtsConfig ttsConfig; 
        private String usageDesc; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelApplicationRequest request) {
            super(request);
            this.applicationCode = request.applicationCode;
            this.applicationCps = request.applicationCps;
            this.applicationName = request.applicationName;
            this.callAssistantHangup = request.callAssistantHangup;
            this.callAssistantRecognize = request.callAssistantRecognize;
            this.callConnectedTriggerModel = request.callConnectedTriggerModel;
            this.dtmfAllowedDigits = request.dtmfAllowedDigits;
            this.dtmfAutoValidateEnable = request.dtmfAutoValidateEnable;
            this.dtmfDigitCount = request.dtmfDigitCount;
            this.dtmfInputTimeout = request.dtmfInputTimeout;
            this.dtmfOutOfRangeAction = request.dtmfOutOfRangeAction;
            this.dtmfRetryPlayTimes = request.dtmfRetryPlayTimes;
            this.dtmfRetryPromptText = request.dtmfRetryPromptText;
            this.dtmfSendMaxCount = request.dtmfSendMaxCount;
            this.dtmfSendWaitTimeout = request.dtmfSendWaitTimeout;
            this.dyvmsSceneName = request.dyvmsSceneName;
            this.enableDtmfReceive = request.enableDtmfReceive;
            this.enableDtmfSend = request.enableDtmfSend;
            this.enableMorse = request.enableMorse;
            this.interruptConfig = request.interruptConfig;
            this.modelCode = request.modelCode;
            this.modelVersion = request.modelVersion;
            this.muteActive = request.muteActive;
            this.muteDuration = request.muteDuration;
            this.muteHangupNum = request.muteHangupNum;
            this.mutePushMode = request.mutePushMode;
            this.ownerId = request.ownerId;
            this.pauseTime = request.pauseTime;
            this.prompt = request.prompt;
            this.qualificationId = request.qualificationId;
            this.qualificationName = request.qualificationName;
            this.recordingFile = request.recordingFile;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sessionTimeout = request.sessionTimeout;
            this.source = request.source;
            this.speechContent = request.speechContent;
            this.speechId = request.speechId;
            this.startWord = request.startWord;
            this.startWordType = request.startWordType;
            this.ttsConfig = request.ttsConfig;
            this.usageDesc = request.usageDesc;
        } 

        /**
         * <p>The code of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DKSDLSA</p>
         */
        public Builder applicationCode(String applicationCode) {
            this.putQueryParameter("ApplicationCode", applicationCode);
            this.applicationCode = applicationCode;
            return this;
        }

        /**
         * <p>The number of concurrent requests for the application.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder applicationCps(Long applicationCps) {
            this.putQueryParameter("ApplicationCps", applicationCps);
            this.applicationCps = applicationCps;
            return this;
        }

        /**
         * <p>The name of the model application.</p>
         * 
         * <strong>example:</strong>
         * <p>TestApplication</p>
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * <p>Specifies whether to hang up when an intelligent answering service is detected.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder callAssistantHangup(Boolean callAssistantHangup) {
            this.putQueryParameter("CallAssistantHangup", callAssistantHangup);
            this.callAssistantHangup = callAssistantHangup;
            return this;
        }

        /**
         * <p>Specifies whether to enable call assistant recognition.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder callAssistantRecognize(Boolean callAssistantRecognize) {
            this.putQueryParameter("CallAssistantRecognize", callAssistantRecognize);
            this.callAssistantRecognize = callAssistantRecognize;
            return this;
        }

        /**
         * <p>Specifies whether to enable call-connected event push. This feature is disabled by default.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder callConnectedTriggerModel(Boolean callConnectedTriggerModel) {
            this.putQueryParameter("CallConnectedTriggerModel", callConnectedTriggerModel);
            this.callConnectedTriggerModel = callConnectedTriggerModel;
            return this;
        }

        /**
         * <p>The enumeration of allowed key digits, specified as comma-separated text such as 1,2,3. A maximum of 20 values are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dtmfAllowedDigits(String dtmfAllowedDigits) {
            this.putQueryParameter("DtmfAllowedDigits", dtmfAllowedDigits);
            this.dtmfAllowedDigits = dtmfAllowedDigits;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic key value validation.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dtmfAutoValidateEnable(Boolean dtmfAutoValidateEnable) {
            this.putQueryParameter("DtmfAutoValidateEnable", dtmfAutoValidateEnable);
            this.dtmfAutoValidateEnable = dtmfAutoValidateEnable;
            return this;
        }

        /**
         * <p>The number of DTMF key digits. Valid values: 1 to 12.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dtmfDigitCount(Long dtmfDigitCount) {
            this.putQueryParameter("DtmfDigitCount", dtmfDigitCount);
            this.dtmfDigitCount = dtmfDigitCount;
            return this;
        }

        /**
         * <p>The DTMF input timeout period in seconds. Valid values: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dtmfInputTimeout(Long dtmfInputTimeout) {
            this.putQueryParameter("DtmfInputTimeout", dtmfInputTimeout);
            this.dtmfInputTimeout = dtmfInputTimeout;
            return this;
        }

        /**
         * <p>The action to take when the input is out of range. Valid values:</p>
         * <ul>
         * <li>RETURN_MODEL</li>
         * <li>AUTO_RETRY</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RETURN_MODEL</p>
         */
        public Builder dtmfOutOfRangeAction(String dtmfOutOfRangeAction) {
            this.putQueryParameter("DtmfOutOfRangeAction", dtmfOutOfRangeAction);
            this.dtmfOutOfRangeAction = dtmfOutOfRangeAction;
            return this;
        }

        /**
         * <p>The number of retry attempts (PlayTimes). Valid values: 1 to 3. This parameter takes effect only when DtmfOutOfRangeAction is set to AUTO_RETRY.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dtmfRetryPlayTimes(Long dtmfRetryPlayTimes) {
            this.putQueryParameter("DtmfRetryPlayTimes", dtmfRetryPlayTimes);
            this.dtmfRetryPlayTimes = dtmfRetryPlayTimes;
            return this;
        }

        /**
         * <p>The custom retry prompt text. The maximum length is 50 characters. If this parameter is left empty, the default prompt &quot;Invalid input. Enter again.&quot; is used.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample text</p>
         */
        public Builder dtmfRetryPromptText(String dtmfRetryPromptText) {
            this.putQueryParameter("DtmfRetryPromptText", dtmfRetryPromptText);
            this.dtmfRetryPromptText = dtmfRetryPromptText;
            return this;
        }

        /**
         * <p>The maximum number of DTMF key sending attempts.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        public Builder dtmfSendMaxCount(Long dtmfSendMaxCount) {
            this.putQueryParameter("DtmfSendMaxCount", dtmfSendMaxCount);
            this.dtmfSendMaxCount = dtmfSendMaxCount;
            return this;
        }

        /**
         * <p>The timeout period for waiting for DTMF key sending.</p>
         * 
         * <strong>example:</strong>
         * <p>58</p>
         */
        public Builder dtmfSendWaitTimeout(Long dtmfSendWaitTimeout) {
            this.putQueryParameter("DtmfSendWaitTimeout", dtmfSendWaitTimeout);
            this.dtmfSendWaitTimeout = dtmfSendWaitTimeout;
            return this;
        }

        /**
         * <p>The name of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>TestScenario</p>
         */
        public Builder dyvmsSceneName(String dyvmsSceneName) {
            this.putQueryParameter("DyvmsSceneName", dyvmsSceneName);
            this.dyvmsSceneName = dyvmsSceneName;
            return this;
        }

        /**
         * <p>Specifies whether to enable DTMF key collection. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableDtmfReceive(Boolean enableDtmfReceive) {
            this.putQueryParameter("EnableDtmfReceive", enableDtmfReceive);
            this.enableDtmfReceive = enableDtmfReceive;
            return this;
        }

        /**
         * <p>Specifies whether to enable DTMF key sending.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableDtmfSend(Boolean enableDtmfSend) {
            this.putQueryParameter("EnableDtmfSend", enableDtmfSend);
            this.enableDtmfSend = enableDtmfSend;
            return this;
        }

        /**
         * <p>Specifies whether to enable Morse code configuration. This feature is disabled by default.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableMorse(Boolean enableMorse) {
            this.putQueryParameter("EnableMorse", enableMorse);
            this.enableMorse = enableMorse;
            return this;
        }

        /**
         * <p>The interruption configuration.</p>
         */
        public Builder interruptConfig(InterruptConfig interruptConfig) {
            String interruptConfigShrink = shrink(interruptConfig, "InterruptConfig", "json");
            this.putQueryParameter("InterruptConfig", interruptConfigShrink);
            this.interruptConfig = interruptConfig;
            return this;
        }

        /**
         * <p>The code of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>1231</p>
         */
        public Builder modelCode(String modelCode) {
            this.putQueryParameter("ModelCode", modelCode);
            this.modelCode = modelCode;
            return this;
        }

        /**
         * <p>The version of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder modelVersion(String modelVersion) {
            this.putQueryParameter("ModelVersion", modelVersion);
            this.modelVersion = modelVersion;
            return this;
        }

        /**
         * <p>Specifies whether the first mute event triggers the model.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder muteActive(Boolean muteActive) {
            this.putQueryParameter("MuteActive", muteActive);
            this.muteActive = muteActive;
            return this;
        }

        /**
         * <p>The mute duration.</p>
         * 
         * <strong>example:</strong>
         * <p>85</p>
         */
        public Builder muteDuration(Long muteDuration) {
            this.putQueryParameter("MuteDuration", muteDuration);
            this.muteDuration = muteDuration;
            return this;
        }

        /**
         * <p>The number of consecutive mute events before the system proactively hangs up.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        public Builder muteHangupNum(Long muteHangupNum) {
            this.putQueryParameter("MuteHangupNum", muteHangupNum);
            this.muteHangupNum = muteHangupNum;
            return this;
        }

        /**
         * <p>The push mode for mute events.</p>
         * 
         * <strong>example:</strong>
         * <p>FIRST_ONLY</p>
         */
        public Builder mutePushMode(String mutePushMode) {
            this.putQueryParameter("MutePushMode", mutePushMode);
            this.mutePushMode = mutePushMode;
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
         * <p>The ASR recognition pause duration.</p>
         * 
         * <strong>example:</strong>
         * <p>350</p>
         */
        public Builder pauseTime(Long pauseTime) {
            this.putQueryParameter("PauseTime", pauseTime);
            this.pauseTime = pauseTime;
            return this;
        }

        /**
         * <p>The prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>TestPrompt</p>
         */
        public Builder prompt(String prompt) {
            this.putQueryParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>The ID of the qualification.</p>
         * 
         * <strong>example:</strong>
         * <p>61</p>
         */
        public Builder qualificationId(Long qualificationId) {
            this.putQueryParameter("QualificationId", qualificationId);
            this.qualificationId = qualificationId;
            return this;
        }

        /**
         * <p>The name of the qualification.</p>
         * 
         * <strong>example:</strong>
         * <p>TestQualification</p>
         */
        public Builder qualificationName(String qualificationName) {
            this.putQueryParameter("QualificationName", qualificationName);
            this.qualificationName = qualificationName;
            return this;
        }

        /**
         * <p>The URL of the recording audio file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxxxxxxxxxxxxx.wav">https://xxxxxxxxxxxxxxx.wav</a></p>
         */
        public Builder recordingFile(String recordingFile) {
            this.putQueryParameter("RecordingFile", recordingFile);
            this.recordingFile = recordingFile;
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
         * <p>The maximum call duration.</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        public Builder sessionTimeout(Long sessionTimeout) {
            this.putQueryParameter("SessionTimeout", sessionTimeout);
            this.sessionTimeout = sessionTimeout;
            return this;
        }

        /**
         * <p>The source. Fixed value: USER.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The content of the speech script.</p>
         * 
         * <strong>example:</strong>
         * <p>TestSpeechScript</p>
         */
        public Builder speechContent(String speechContent) {
            this.putQueryParameter("SpeechContent", speechContent);
            this.speechContent = speechContent;
            return this;
        }

        /**
         * <p>The ID of the speech script.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder speechId(Long speechId) {
            this.putQueryParameter("SpeechId", speechId);
            this.speechId = speechId;
            return this;
        }

        /**
         * <p>The opening statement.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello, this is a test opening statement</p>
         */
        public Builder startWord(String startWord) {
            this.putQueryParameter("StartWord", startWord);
            this.startWord = startWord;
            return this;
        }

        /**
         * <p>The type of the opening statement.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder startWordType(Long startWordType) {
            this.putQueryParameter("StartWordType", startWordType);
            this.startWordType = startWordType;
            return this;
        }

        /**
         * <p>The text-to-speech (TTS) configuration, including voice, volume, and speed.</p>
         */
        public Builder ttsConfig(TtsConfig ttsConfig) {
            String ttsConfigShrink = shrink(ttsConfig, "TtsConfig", "json");
            this.putQueryParameter("TtsConfig", ttsConfigShrink);
            this.ttsConfig = ttsConfig;
            return this;
        }

        /**
         * <p>The usage description.</p>
         * 
         * <strong>example:</strong>
         * <p>TestUsage</p>
         */
        public Builder usageDesc(String usageDesc) {
            this.putQueryParameter("UsageDesc", usageDesc);
            this.usageDesc = usageDesc;
            return this;
        }

        @Override
        public UpdateModelApplicationRequest build() {
            return new UpdateModelApplicationRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateModelApplicationRequest} extends {@link TeaModel}
     *
     * <p>UpdateModelApplicationRequest</p>
     */
    public static class AvoidInterruptDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InterruptNum")
        private Long interruptNum;

        @com.aliyun.core.annotation.NameInMap("InterruptProtectDuration")
        private Double interruptProtectDuration;

        private AvoidInterruptDTO(Builder builder) {
            this.interruptNum = builder.interruptNum;
            this.interruptProtectDuration = builder.interruptProtectDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvoidInterruptDTO create() {
            return builder().build();
        }

        /**
         * @return interruptNum
         */
        public Long getInterruptNum() {
            return this.interruptNum;
        }

        /**
         * @return interruptProtectDuration
         */
        public Double getInterruptProtectDuration() {
            return this.interruptProtectDuration;
        }

        public static final class Builder {
            private Long interruptNum; 
            private Double interruptProtectDuration; 

            private Builder() {
            } 

            private Builder(AvoidInterruptDTO model) {
                this.interruptNum = model.interruptNum;
                this.interruptProtectDuration = model.interruptProtectDuration;
            } 

            /**
             * <p>The number of consecutive interruptions.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder interruptNum(Long interruptNum) {
                this.interruptNum = interruptNum;
                return this;
            }

            /**
             * <p>The interrupt protection duration.</p>
             * 
             * <strong>example:</strong>
             * <p>16.417547</p>
             */
            public Builder interruptProtectDuration(Double interruptProtectDuration) {
                this.interruptProtectDuration = interruptProtectDuration;
                return this;
            }

            public AvoidInterruptDTO build() {
                return new AvoidInterruptDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateModelApplicationRequest} extends {@link TeaModel}
     *
     * <p>UpdateModelApplicationRequest</p>
     */
    public static class InterruptConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvoidInterruptDTO")
        private AvoidInterruptDTO avoidInterruptDTO;

        @com.aliyun.core.annotation.NameInMap("EnableAvoidInterrupt")
        private Boolean enableAvoidInterrupt;

        @com.aliyun.core.annotation.NameInMap("EnableInterruptBackchannel")
        private Boolean enableInterruptBackchannel;

        @com.aliyun.core.annotation.NameInMap("EnableStartwordEntireNotInterrupt")
        private Boolean enableStartwordEntireNotInterrupt;

        @com.aliyun.core.annotation.NameInMap("EnableStartwordNotInterrupt")
        private Boolean enableStartwordNotInterrupt;

        @com.aliyun.core.annotation.NameInMap("StartwordProtectDuration")
        private Double startwordProtectDuration;

        private InterruptConfig(Builder builder) {
            this.avoidInterruptDTO = builder.avoidInterruptDTO;
            this.enableAvoidInterrupt = builder.enableAvoidInterrupt;
            this.enableInterruptBackchannel = builder.enableInterruptBackchannel;
            this.enableStartwordEntireNotInterrupt = builder.enableStartwordEntireNotInterrupt;
            this.enableStartwordNotInterrupt = builder.enableStartwordNotInterrupt;
            this.startwordProtectDuration = builder.startwordProtectDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InterruptConfig create() {
            return builder().build();
        }

        /**
         * @return avoidInterruptDTO
         */
        public AvoidInterruptDTO getAvoidInterruptDTO() {
            return this.avoidInterruptDTO;
        }

        /**
         * @return enableAvoidInterrupt
         */
        public Boolean getEnableAvoidInterrupt() {
            return this.enableAvoidInterrupt;
        }

        /**
         * @return enableInterruptBackchannel
         */
        public Boolean getEnableInterruptBackchannel() {
            return this.enableInterruptBackchannel;
        }

        /**
         * @return enableStartwordEntireNotInterrupt
         */
        public Boolean getEnableStartwordEntireNotInterrupt() {
            return this.enableStartwordEntireNotInterrupt;
        }

        /**
         * @return enableStartwordNotInterrupt
         */
        public Boolean getEnableStartwordNotInterrupt() {
            return this.enableStartwordNotInterrupt;
        }

        /**
         * @return startwordProtectDuration
         */
        public Double getStartwordProtectDuration() {
            return this.startwordProtectDuration;
        }

        public static final class Builder {
            private AvoidInterruptDTO avoidInterruptDTO; 
            private Boolean enableAvoidInterrupt; 
            private Boolean enableInterruptBackchannel; 
            private Boolean enableStartwordEntireNotInterrupt; 
            private Boolean enableStartwordNotInterrupt; 
            private Double startwordProtectDuration; 

            private Builder() {
            } 

            private Builder(InterruptConfig model) {
                this.avoidInterruptDTO = model.avoidInterruptDTO;
                this.enableAvoidInterrupt = model.enableAvoidInterrupt;
                this.enableInterruptBackchannel = model.enableInterruptBackchannel;
                this.enableStartwordEntireNotInterrupt = model.enableStartwordEntireNotInterrupt;
                this.enableStartwordNotInterrupt = model.enableStartwordNotInterrupt;
                this.startwordProtectDuration = model.startwordProtectDuration;
            } 

            /**
             * <p>The continuous interruption prevention configuration.</p>
             */
            public Builder avoidInterruptDTO(AvoidInterruptDTO avoidInterruptDTO) {
                this.avoidInterruptDTO = avoidInterruptDTO;
                return this;
            }

            /**
             * <p>Specifies whether to enable the continuous interruption prevention feature.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableAvoidInterrupt(Boolean enableAvoidInterrupt) {
                this.enableAvoidInterrupt = enableAvoidInterrupt;
                return this;
            }

            /**
             * <p>Specifies whether to enable the interrupt filler word configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableInterruptBackchannel(Boolean enableInterruptBackchannel) {
                this.enableInterruptBackchannel = enableInterruptBackchannel;
                return this;
            }

            /**
             * <p>Specifies whether to disable interruption during the entire opening statement.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableStartwordEntireNotInterrupt(Boolean enableStartwordEntireNotInterrupt) {
                this.enableStartwordEntireNotInterrupt = enableStartwordEntireNotInterrupt;
                return this;
            }

            /**
             * <p>Specifies whether to enable the opening line no-interrupt configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableStartwordNotInterrupt(Boolean enableStartwordNotInterrupt) {
                this.enableStartwordNotInterrupt = enableStartwordNotInterrupt;
                return this;
            }

            /**
             * <p>The opening line protection duration.</p>
             * 
             * <strong>example:</strong>
             * <p>1.4699</p>
             */
            public Builder startwordProtectDuration(Double startwordProtectDuration) {
                this.startwordProtectDuration = startwordProtectDuration;
                return this;
            }

            public InterruptConfig build() {
                return new InterruptConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateModelApplicationRequest} extends {@link TeaModel}
     *
     * <p>UpdateModelApplicationRequest</p>
     */
    public static class TtsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackgroundEnabled")
        private Boolean backgroundEnabled;

        @com.aliyun.core.annotation.NameInMap("BackgroundSound")
        private Long backgroundSound;

        @com.aliyun.core.annotation.NameInMap("BackgroundVolume")
        private Long backgroundVolume;

        @com.aliyun.core.annotation.NameInMap("CustomerAccountId")
        private Long customerAccountId;

        @com.aliyun.core.annotation.NameInMap("MixingEnabled")
        private Boolean mixingEnabled;

        @com.aliyun.core.annotation.NameInMap("MixingTemplate")
        private Long mixingTemplate;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("TtsSpeed")
        private Long ttsSpeed;

        @com.aliyun.core.annotation.NameInMap("TtsStyle")
        private String ttsStyle;

        @com.aliyun.core.annotation.NameInMap("TtsVolume")
        private Long ttsVolume;

        @com.aliyun.core.annotation.NameInMap("VoiceCode")
        private String voiceCode;

        @com.aliyun.core.annotation.NameInMap("VoiceType")
        private String voiceType;

        private TtsConfig(Builder builder) {
            this.backgroundEnabled = builder.backgroundEnabled;
            this.backgroundSound = builder.backgroundSound;
            this.backgroundVolume = builder.backgroundVolume;
            this.customerAccountId = builder.customerAccountId;
            this.mixingEnabled = builder.mixingEnabled;
            this.mixingTemplate = builder.mixingTemplate;
            this.resourceId = builder.resourceId;
            this.ttsSpeed = builder.ttsSpeed;
            this.ttsStyle = builder.ttsStyle;
            this.ttsVolume = builder.ttsVolume;
            this.voiceCode = builder.voiceCode;
            this.voiceType = builder.voiceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TtsConfig create() {
            return builder().build();
        }

        /**
         * @return backgroundEnabled
         */
        public Boolean getBackgroundEnabled() {
            return this.backgroundEnabled;
        }

        /**
         * @return backgroundSound
         */
        public Long getBackgroundSound() {
            return this.backgroundSound;
        }

        /**
         * @return backgroundVolume
         */
        public Long getBackgroundVolume() {
            return this.backgroundVolume;
        }

        /**
         * @return customerAccountId
         */
        public Long getCustomerAccountId() {
            return this.customerAccountId;
        }

        /**
         * @return mixingEnabled
         */
        public Boolean getMixingEnabled() {
            return this.mixingEnabled;
        }

        /**
         * @return mixingTemplate
         */
        public Long getMixingTemplate() {
            return this.mixingTemplate;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return ttsSpeed
         */
        public Long getTtsSpeed() {
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
        public Long getTtsVolume() {
            return this.ttsVolume;
        }

        /**
         * @return voiceCode
         */
        public String getVoiceCode() {
            return this.voiceCode;
        }

        /**
         * @return voiceType
         */
        public String getVoiceType() {
            return this.voiceType;
        }

        public static final class Builder {
            private Boolean backgroundEnabled; 
            private Long backgroundSound; 
            private Long backgroundVolume; 
            private Long customerAccountId; 
            private Boolean mixingEnabled; 
            private Long mixingTemplate; 
            private String resourceId; 
            private Long ttsSpeed; 
            private String ttsStyle; 
            private Long ttsVolume; 
            private String voiceCode; 
            private String voiceType; 

            private Builder() {
            } 

            private Builder(TtsConfig model) {
                this.backgroundEnabled = model.backgroundEnabled;
                this.backgroundSound = model.backgroundSound;
                this.backgroundVolume = model.backgroundVolume;
                this.customerAccountId = model.customerAccountId;
                this.mixingEnabled = model.mixingEnabled;
                this.mixingTemplate = model.mixingTemplate;
                this.resourceId = model.resourceId;
                this.ttsSpeed = model.ttsSpeed;
                this.ttsStyle = model.ttsStyle;
                this.ttsVolume = model.ttsVolume;
                this.voiceCode = model.voiceCode;
                this.voiceType = model.voiceType;
            } 

            /**
             * <p>Specifies whether to enable background sound.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder backgroundEnabled(Boolean backgroundEnabled) {
                this.backgroundEnabled = backgroundEnabled;
                return this;
            }

            /**
             * <p>The ID of the background sound.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder backgroundSound(Long backgroundSound) {
                this.backgroundSound = backgroundSound;
                return this;
            }

            /**
             * <p>The background sound volume (ID). Valid values:</p>
             * <ul>
             * <li>0: low.</li>
             * <li>1: medium.</li>
             * <li>2: high.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder backgroundVolume(Long backgroundVolume) {
                this.backgroundVolume = backgroundVolume;
                return this;
            }

            /**
             * <p>The account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>47</p>
             */
            public Builder customerAccountId(Long customerAccountId) {
                this.customerAccountId = customerAccountId;
                return this;
            }

            /**
             * <p>Specifies whether to enable audio mixing.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder mixingEnabled(Boolean mixingEnabled) {
                this.mixingEnabled = mixingEnabled;
                return this;
            }

            /**
             * <p>The ID of the mixing template.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder mixingTemplate(Long mixingTemplate) {
                this.mixingTemplate = mixingTemplate;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>122</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The speed for TTS variable playback. Valid values: -200 to 200. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder ttsSpeed(Long ttsSpeed) {
                this.ttsSpeed = ttsSpeed;
                return this;
            }

            /**
             * <p>The voice style.</p>
             * 
             * <strong>example:</strong>
             * <p>voice</p>
             */
            public Builder ttsStyle(String ttsStyle) {
                this.ttsStyle = ttsStyle;
                return this;
            }

            /**
             * <p>The volume for TTS variable playback. Valid values: 0 to 100. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder ttsVolume(Long ttsVolume) {
                this.ttsVolume = ttsVolume;
                return this;
            }

            /**
             * <p>The code of the voice.</p>
             * 
             * <strong>example:</strong>
             * <p>12123213123</p>
             */
            public Builder voiceCode(String voiceCode) {
                this.voiceCode = voiceCode;
                return this;
            }

            /**
             * <p>The voice type. Valid values:</p>
             * <ul>
             * <li>SYSTEM: system voice.</li>
             * <li>COSYCLONE: cloned voice.</li>
             * <li>BL-CUSTOM: custom premium cloned voice.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
             */
            public Builder voiceType(String voiceType) {
                this.voiceType = voiceType;
                return this;
            }

            public TtsConfig build() {
                return new TtsConfig(this);
            } 

        } 

    }
}
