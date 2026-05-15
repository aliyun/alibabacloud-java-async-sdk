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
 * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
 */
public class QueryAiVoiceAgentDetailNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryAiVoiceAgentDetailNewResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAiVoiceAgentDetailNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryAiVoiceAgentDetailNewResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAiVoiceAgentDetailNewResponseBody build() {
            return new QueryAiVoiceAgentDetailNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class EventConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallAssistantHangup")
        private Boolean callAssistantHangup;

        @com.aliyun.core.annotation.NameInMap("CallAssistantRecognize")
        private Boolean callAssistantRecognize;

        @com.aliyun.core.annotation.NameInMap("MuteActive")
        private Boolean muteActive;

        @com.aliyun.core.annotation.NameInMap("MuteDuration")
        private Long muteDuration;

        @com.aliyun.core.annotation.NameInMap("MuteHangupNum")
        private Long muteHangupNum;

        @com.aliyun.core.annotation.NameInMap("SessionTimeout")
        private Long sessionTimeout;

        private EventConfig(Builder builder) {
            this.callAssistantHangup = builder.callAssistantHangup;
            this.callAssistantRecognize = builder.callAssistantRecognize;
            this.muteActive = builder.muteActive;
            this.muteDuration = builder.muteDuration;
            this.muteHangupNum = builder.muteHangupNum;
            this.sessionTimeout = builder.sessionTimeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventConfig create() {
            return builder().build();
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
         * @return sessionTimeout
         */
        public Long getSessionTimeout() {
            return this.sessionTimeout;
        }

        public static final class Builder {
            private Boolean callAssistantHangup; 
            private Boolean callAssistantRecognize; 
            private Boolean muteActive; 
            private Long muteDuration; 
            private Long muteHangupNum; 
            private Long sessionTimeout; 

            private Builder() {
            } 

            private Builder(EventConfig model) {
                this.callAssistantHangup = model.callAssistantHangup;
                this.callAssistantRecognize = model.callAssistantRecognize;
                this.muteActive = model.muteActive;
                this.muteDuration = model.muteDuration;
                this.muteHangupNum = model.muteHangupNum;
                this.sessionTimeout = model.sessionTimeout;
            } 

            /**
             * CallAssistantHangup.
             */
            public Builder callAssistantHangup(Boolean callAssistantHangup) {
                this.callAssistantHangup = callAssistantHangup;
                return this;
            }

            /**
             * CallAssistantRecognize.
             */
            public Builder callAssistantRecognize(Boolean callAssistantRecognize) {
                this.callAssistantRecognize = callAssistantRecognize;
                return this;
            }

            /**
             * MuteActive.
             */
            public Builder muteActive(Boolean muteActive) {
                this.muteActive = muteActive;
                return this;
            }

            /**
             * MuteDuration.
             */
            public Builder muteDuration(Long muteDuration) {
                this.muteDuration = muteDuration;
                return this;
            }

            /**
             * MuteHangupNum.
             */
            public Builder muteHangupNum(Long muteHangupNum) {
                this.muteHangupNum = muteHangupNum;
                return this;
            }

            /**
             * SessionTimeout.
             */
            public Builder sessionTimeout(Long sessionTimeout) {
                this.sessionTimeout = sessionTimeout;
                return this;
            }

            public EventConfig build() {
                return new EventConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class TransferConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CalledNumber")
        private String calledNumber;

        @com.aliyun.core.annotation.NameInMap("CallerNumber")
        private String callerNumber;

        @com.aliyun.core.annotation.NameInMap("CallerNumberType")
        private Long callerNumberType;

        @com.aliyun.core.annotation.NameInMap("CallingNumber")
        private String callingNumber;

        @com.aliyun.core.annotation.NameInMap("CallingNumberType")
        private Long callingNumberType;

        @com.aliyun.core.annotation.NameInMap("CustomerRouteCode")
        private String customerRouteCode;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("ExtraInfo")
        private String extraInfo;

        @com.aliyun.core.annotation.NameInMap("FailureContent")
        private String failureContent;

        @com.aliyun.core.annotation.NameInMap("SeatRouteCode")
        private String seatRouteCode;

        @com.aliyun.core.annotation.NameInMap("SeatRouteName")
        private String seatRouteName;

        @com.aliyun.core.annotation.NameInMap("TransferBizId")
        private String transferBizId;

        @com.aliyun.core.annotation.NameInMap("TransferContent")
        private String transferContent;

        @com.aliyun.core.annotation.NameInMap("TransferType")
        private Long transferType;

        private TransferConfig(Builder builder) {
            this.calledNumber = builder.calledNumber;
            this.callerNumber = builder.callerNumber;
            this.callerNumberType = builder.callerNumberType;
            this.callingNumber = builder.callingNumber;
            this.callingNumberType = builder.callingNumberType;
            this.customerRouteCode = builder.customerRouteCode;
            this.enabled = builder.enabled;
            this.extraInfo = builder.extraInfo;
            this.failureContent = builder.failureContent;
            this.seatRouteCode = builder.seatRouteCode;
            this.seatRouteName = builder.seatRouteName;
            this.transferBizId = builder.transferBizId;
            this.transferContent = builder.transferContent;
            this.transferType = builder.transferType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferConfig create() {
            return builder().build();
        }

        /**
         * @return calledNumber
         */
        public String getCalledNumber() {
            return this.calledNumber;
        }

        /**
         * @return callerNumber
         */
        public String getCallerNumber() {
            return this.callerNumber;
        }

        /**
         * @return callerNumberType
         */
        public Long getCallerNumberType() {
            return this.callerNumberType;
        }

        /**
         * @return callingNumber
         */
        public String getCallingNumber() {
            return this.callingNumber;
        }

        /**
         * @return callingNumberType
         */
        public Long getCallingNumberType() {
            return this.callingNumberType;
        }

        /**
         * @return customerRouteCode
         */
        public String getCustomerRouteCode() {
            return this.customerRouteCode;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return extraInfo
         */
        public String getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return failureContent
         */
        public String getFailureContent() {
            return this.failureContent;
        }

        /**
         * @return seatRouteCode
         */
        public String getSeatRouteCode() {
            return this.seatRouteCode;
        }

        /**
         * @return seatRouteName
         */
        public String getSeatRouteName() {
            return this.seatRouteName;
        }

        /**
         * @return transferBizId
         */
        public String getTransferBizId() {
            return this.transferBizId;
        }

        /**
         * @return transferContent
         */
        public String getTransferContent() {
            return this.transferContent;
        }

        /**
         * @return transferType
         */
        public Long getTransferType() {
            return this.transferType;
        }

        public static final class Builder {
            private String calledNumber; 
            private String callerNumber; 
            private Long callerNumberType; 
            private String callingNumber; 
            private Long callingNumberType; 
            private String customerRouteCode; 
            private Boolean enabled; 
            private String extraInfo; 
            private String failureContent; 
            private String seatRouteCode; 
            private String seatRouteName; 
            private String transferBizId; 
            private String transferContent; 
            private Long transferType; 

            private Builder() {
            } 

            private Builder(TransferConfig model) {
                this.calledNumber = model.calledNumber;
                this.callerNumber = model.callerNumber;
                this.callerNumberType = model.callerNumberType;
                this.callingNumber = model.callingNumber;
                this.callingNumberType = model.callingNumberType;
                this.customerRouteCode = model.customerRouteCode;
                this.enabled = model.enabled;
                this.extraInfo = model.extraInfo;
                this.failureContent = model.failureContent;
                this.seatRouteCode = model.seatRouteCode;
                this.seatRouteName = model.seatRouteName;
                this.transferBizId = model.transferBizId;
                this.transferContent = model.transferContent;
                this.transferType = model.transferType;
            } 

            /**
             * CalledNumber.
             */
            public Builder calledNumber(String calledNumber) {
                this.calledNumber = calledNumber;
                return this;
            }

            /**
             * CallerNumber.
             */
            public Builder callerNumber(String callerNumber) {
                this.callerNumber = callerNumber;
                return this;
            }

            /**
             * CallerNumberType.
             */
            public Builder callerNumberType(Long callerNumberType) {
                this.callerNumberType = callerNumberType;
                return this;
            }

            /**
             * CallingNumber.
             */
            public Builder callingNumber(String callingNumber) {
                this.callingNumber = callingNumber;
                return this;
            }

            /**
             * CallingNumberType.
             */
            public Builder callingNumberType(Long callingNumberType) {
                this.callingNumberType = callingNumberType;
                return this;
            }

            /**
             * CustomerRouteCode.
             */
            public Builder customerRouteCode(String customerRouteCode) {
                this.customerRouteCode = customerRouteCode;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * ExtraInfo.
             */
            public Builder extraInfo(String extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * FailureContent.
             */
            public Builder failureContent(String failureContent) {
                this.failureContent = failureContent;
                return this;
            }

            /**
             * SeatRouteCode.
             */
            public Builder seatRouteCode(String seatRouteCode) {
                this.seatRouteCode = seatRouteCode;
                return this;
            }

            /**
             * SeatRouteName.
             */
            public Builder seatRouteName(String seatRouteName) {
                this.seatRouteName = seatRouteName;
                return this;
            }

            /**
             * TransferBizId.
             */
            public Builder transferBizId(String transferBizId) {
                this.transferBizId = transferBizId;
                return this;
            }

            /**
             * TransferContent.
             */
            public Builder transferContent(String transferContent) {
                this.transferContent = transferContent;
                return this;
            }

            /**
             * TransferType.
             */
            public Builder transferType(Long transferType) {
                this.transferType = transferType;
                return this;
            }

            public TransferConfig build() {
                return new TransferConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
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
        private Boolean voiceType;

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
        public Boolean getVoiceType() {
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
            private Boolean voiceType; 

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
             * BackgroundEnabled.
             */
            public Builder backgroundEnabled(Boolean backgroundEnabled) {
                this.backgroundEnabled = backgroundEnabled;
                return this;
            }

            /**
             * BackgroundSound.
             */
            public Builder backgroundSound(Long backgroundSound) {
                this.backgroundSound = backgroundSound;
                return this;
            }

            /**
             * BackgroundVolume.
             */
            public Builder backgroundVolume(Long backgroundVolume) {
                this.backgroundVolume = backgroundVolume;
                return this;
            }

            /**
             * CustomerAccountId.
             */
            public Builder customerAccountId(Long customerAccountId) {
                this.customerAccountId = customerAccountId;
                return this;
            }

            /**
             * MixingEnabled.
             */
            public Builder mixingEnabled(Boolean mixingEnabled) {
                this.mixingEnabled = mixingEnabled;
                return this;
            }

            /**
             * MixingTemplate.
             */
            public Builder mixingTemplate(Long mixingTemplate) {
                this.mixingTemplate = mixingTemplate;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * TtsSpeed.
             */
            public Builder ttsSpeed(Long ttsSpeed) {
                this.ttsSpeed = ttsSpeed;
                return this;
            }

            /**
             * TtsStyle.
             */
            public Builder ttsStyle(String ttsStyle) {
                this.ttsStyle = ttsStyle;
                return this;
            }

            /**
             * TtsVolume.
             */
            public Builder ttsVolume(Long ttsVolume) {
                this.ttsVolume = ttsVolume;
                return this;
            }

            /**
             * VoiceCode.
             */
            public Builder voiceCode(String voiceCode) {
                this.voiceCode = voiceCode;
                return this;
            }

            /**
             * VoiceType.
             */
            public Builder voiceType(Boolean voiceType) {
                this.voiceType = voiceType;
                return this;
            }

            public TtsConfig build() {
                return new TtsConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class AgentCallConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventConfig")
        private EventConfig eventConfig;

        @com.aliyun.core.annotation.NameInMap("Prologue")
        private String prologue;

        @com.aliyun.core.annotation.NameInMap("RecordingFile")
        private String recordingFile;

        @com.aliyun.core.annotation.NameInMap("StartWordType")
        private Long startWordType;

        @com.aliyun.core.annotation.NameInMap("TransferConfig")
        private TransferConfig transferConfig;

        @com.aliyun.core.annotation.NameInMap("TtsConfig")
        private TtsConfig ttsConfig;

        @com.aliyun.core.annotation.NameInMap("VocabId")
        private String vocabId;

        private AgentCallConfig(Builder builder) {
            this.eventConfig = builder.eventConfig;
            this.prologue = builder.prologue;
            this.recordingFile = builder.recordingFile;
            this.startWordType = builder.startWordType;
            this.transferConfig = builder.transferConfig;
            this.ttsConfig = builder.ttsConfig;
            this.vocabId = builder.vocabId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentCallConfig create() {
            return builder().build();
        }

        /**
         * @return eventConfig
         */
        public EventConfig getEventConfig() {
            return this.eventConfig;
        }

        /**
         * @return prologue
         */
        public String getPrologue() {
            return this.prologue;
        }

        /**
         * @return recordingFile
         */
        public String getRecordingFile() {
            return this.recordingFile;
        }

        /**
         * @return startWordType
         */
        public Long getStartWordType() {
            return this.startWordType;
        }

        /**
         * @return transferConfig
         */
        public TransferConfig getTransferConfig() {
            return this.transferConfig;
        }

        /**
         * @return ttsConfig
         */
        public TtsConfig getTtsConfig() {
            return this.ttsConfig;
        }

        /**
         * @return vocabId
         */
        public String getVocabId() {
            return this.vocabId;
        }

        public static final class Builder {
            private EventConfig eventConfig; 
            private String prologue; 
            private String recordingFile; 
            private Long startWordType; 
            private TransferConfig transferConfig; 
            private TtsConfig ttsConfig; 
            private String vocabId; 

            private Builder() {
            } 

            private Builder(AgentCallConfig model) {
                this.eventConfig = model.eventConfig;
                this.prologue = model.prologue;
                this.recordingFile = model.recordingFile;
                this.startWordType = model.startWordType;
                this.transferConfig = model.transferConfig;
                this.ttsConfig = model.ttsConfig;
                this.vocabId = model.vocabId;
            } 

            /**
             * EventConfig.
             */
            public Builder eventConfig(EventConfig eventConfig) {
                this.eventConfig = eventConfig;
                return this;
            }

            /**
             * Prologue.
             */
            public Builder prologue(String prologue) {
                this.prologue = prologue;
                return this;
            }

            /**
             * RecordingFile.
             */
            public Builder recordingFile(String recordingFile) {
                this.recordingFile = recordingFile;
                return this;
            }

            /**
             * StartWordType.
             */
            public Builder startWordType(Long startWordType) {
                this.startWordType = startWordType;
                return this;
            }

            /**
             * TransferConfig.
             */
            public Builder transferConfig(TransferConfig transferConfig) {
                this.transferConfig = transferConfig;
                return this;
            }

            /**
             * TtsConfig.
             */
            public Builder ttsConfig(TtsConfig ttsConfig) {
                this.ttsConfig = ttsConfig;
                return this;
            }

            /**
             * VocabId.
             */
            public Builder vocabId(String vocabId) {
                this.vocabId = vocabId;
                return this;
            }

            public AgentCallConfig build() {
                return new AgentCallConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class AgentDemandConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiGenerate")
        private Boolean aiGenerate;

        @com.aliyun.core.annotation.NameInMap("BasicTaskDescription")
        private String basicTaskDescription;

        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private Long businessType;

        @com.aliyun.core.annotation.NameInMap("CoreTarget")
        private String coreTarget;

        @com.aliyun.core.annotation.NameInMap("SysRole")
        private String sysRole;

        @com.aliyun.core.annotation.NameInMap("UserRole")
        private String userRole;

        private AgentDemandConfig(Builder builder) {
            this.aiGenerate = builder.aiGenerate;
            this.basicTaskDescription = builder.basicTaskDescription;
            this.businessType = builder.businessType;
            this.coreTarget = builder.coreTarget;
            this.sysRole = builder.sysRole;
            this.userRole = builder.userRole;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentDemandConfig create() {
            return builder().build();
        }

        /**
         * @return aiGenerate
         */
        public Boolean getAiGenerate() {
            return this.aiGenerate;
        }

        /**
         * @return basicTaskDescription
         */
        public String getBasicTaskDescription() {
            return this.basicTaskDescription;
        }

        /**
         * @return businessType
         */
        public Long getBusinessType() {
            return this.businessType;
        }

        /**
         * @return coreTarget
         */
        public String getCoreTarget() {
            return this.coreTarget;
        }

        /**
         * @return sysRole
         */
        public String getSysRole() {
            return this.sysRole;
        }

        /**
         * @return userRole
         */
        public String getUserRole() {
            return this.userRole;
        }

        public static final class Builder {
            private Boolean aiGenerate; 
            private String basicTaskDescription; 
            private Long businessType; 
            private String coreTarget; 
            private String sysRole; 
            private String userRole; 

            private Builder() {
            } 

            private Builder(AgentDemandConfig model) {
                this.aiGenerate = model.aiGenerate;
                this.basicTaskDescription = model.basicTaskDescription;
                this.businessType = model.businessType;
                this.coreTarget = model.coreTarget;
                this.sysRole = model.sysRole;
                this.userRole = model.userRole;
            } 

            /**
             * AiGenerate.
             */
            public Builder aiGenerate(Boolean aiGenerate) {
                this.aiGenerate = aiGenerate;
                return this;
            }

            /**
             * BasicTaskDescription.
             */
            public Builder basicTaskDescription(String basicTaskDescription) {
                this.basicTaskDescription = basicTaskDescription;
                return this;
            }

            /**
             * BusinessType.
             */
            public Builder businessType(Long businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * CoreTarget.
             */
            public Builder coreTarget(String coreTarget) {
                this.coreTarget = coreTarget;
                return this;
            }

            /**
             * SysRole.
             */
            public Builder sysRole(String sysRole) {
                this.sysRole = sysRole;
                return this;
            }

            /**
             * UserRole.
             */
            public Builder userRole(String userRole) {
                this.userRole = userRole;
                return this;
            }

            public AgentDemandConfig build() {
                return new AgentDemandConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class KnowledgeIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KnowledgeId")
        private Long knowledgeId;

        @com.aliyun.core.annotation.NameInMap("KnowledgeName")
        private String knowledgeName;

        private KnowledgeIds(Builder builder) {
            this.knowledgeId = builder.knowledgeId;
            this.knowledgeName = builder.knowledgeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KnowledgeIds create() {
            return builder().build();
        }

        /**
         * @return knowledgeId
         */
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        /**
         * @return knowledgeName
         */
        public String getKnowledgeName() {
            return this.knowledgeName;
        }

        public static final class Builder {
            private Long knowledgeId; 
            private String knowledgeName; 

            private Builder() {
            } 

            private Builder(KnowledgeIds model) {
                this.knowledgeId = model.knowledgeId;
                this.knowledgeName = model.knowledgeName;
            } 

            /**
             * KnowledgeId.
             */
            public Builder knowledgeId(Long knowledgeId) {
                this.knowledgeId = knowledgeId;
                return this;
            }

            /**
             * KnowledgeName.
             */
            public Builder knowledgeName(String knowledgeName) {
                this.knowledgeName = knowledgeName;
                return this;
            }

            public KnowledgeIds build() {
                return new KnowledgeIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class RagConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        private RagConfig(Builder builder) {
            this.description = builder.description;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RagConfig create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private String description; 
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(RagConfig model) {
                this.description = model.description;
                this.enabled = model.enabled;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public RagConfig build() {
                return new RagConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class KnowledgeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KnowledgeIds")
        private java.util.List<KnowledgeIds> knowledgeIds;

        @com.aliyun.core.annotation.NameInMap("RagConfig")
        private RagConfig ragConfig;

        private KnowledgeConfig(Builder builder) {
            this.knowledgeIds = builder.knowledgeIds;
            this.ragConfig = builder.ragConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KnowledgeConfig create() {
            return builder().build();
        }

        /**
         * @return knowledgeIds
         */
        public java.util.List<KnowledgeIds> getKnowledgeIds() {
            return this.knowledgeIds;
        }

        /**
         * @return ragConfig
         */
        public RagConfig getRagConfig() {
            return this.ragConfig;
        }

        public static final class Builder {
            private java.util.List<KnowledgeIds> knowledgeIds; 
            private RagConfig ragConfig; 

            private Builder() {
            } 

            private Builder(KnowledgeConfig model) {
                this.knowledgeIds = model.knowledgeIds;
                this.ragConfig = model.ragConfig;
            } 

            /**
             * KnowledgeIds.
             */
            public Builder knowledgeIds(java.util.List<KnowledgeIds> knowledgeIds) {
                this.knowledgeIds = knowledgeIds;
                return this;
            }

            /**
             * RagConfig.
             */
            public Builder ragConfig(RagConfig ragConfig) {
                this.ragConfig = ragConfig;
                return this;
            }

            public KnowledgeConfig build() {
                return new KnowledgeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class PhoneTagEnum extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private PhoneTagEnum(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhoneTagEnum create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String id; 
            private String value; 

            private Builder() {
            } 

            private Builder(PhoneTagEnum model) {
                this.description = model.description;
                this.id = model.id;
                this.value = model.value;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public PhoneTagEnum build() {
                return new PhoneTagEnum(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class PhoneTagConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("PhoneTagEnum")
        private java.util.List<PhoneTagEnum> phoneTagEnum;

        @com.aliyun.core.annotation.NameInMap("PhoneTagKey")
        private String phoneTagKey;

        @com.aliyun.core.annotation.NameInMap("PhoneTagName")
        private String phoneTagName;

        @com.aliyun.core.annotation.NameInMap("PhoneTagRequired")
        private Boolean phoneTagRequired;

        @com.aliyun.core.annotation.NameInMap("PhoneTagSource")
        private String phoneTagSource;

        @com.aliyun.core.annotation.NameInMap("PhoneTagType")
        private String phoneTagType;

        private PhoneTagConfig(Builder builder) {
            this.id = builder.id;
            this.phoneTagEnum = builder.phoneTagEnum;
            this.phoneTagKey = builder.phoneTagKey;
            this.phoneTagName = builder.phoneTagName;
            this.phoneTagRequired = builder.phoneTagRequired;
            this.phoneTagSource = builder.phoneTagSource;
            this.phoneTagType = builder.phoneTagType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhoneTagConfig create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return phoneTagEnum
         */
        public java.util.List<PhoneTagEnum> getPhoneTagEnum() {
            return this.phoneTagEnum;
        }

        /**
         * @return phoneTagKey
         */
        public String getPhoneTagKey() {
            return this.phoneTagKey;
        }

        /**
         * @return phoneTagName
         */
        public String getPhoneTagName() {
            return this.phoneTagName;
        }

        /**
         * @return phoneTagRequired
         */
        public Boolean getPhoneTagRequired() {
            return this.phoneTagRequired;
        }

        /**
         * @return phoneTagSource
         */
        public String getPhoneTagSource() {
            return this.phoneTagSource;
        }

        /**
         * @return phoneTagType
         */
        public String getPhoneTagType() {
            return this.phoneTagType;
        }

        public static final class Builder {
            private String id; 
            private java.util.List<PhoneTagEnum> phoneTagEnum; 
            private String phoneTagKey; 
            private String phoneTagName; 
            private Boolean phoneTagRequired; 
            private String phoneTagSource; 
            private String phoneTagType; 

            private Builder() {
            } 

            private Builder(PhoneTagConfig model) {
                this.id = model.id;
                this.phoneTagEnum = model.phoneTagEnum;
                this.phoneTagKey = model.phoneTagKey;
                this.phoneTagName = model.phoneTagName;
                this.phoneTagRequired = model.phoneTagRequired;
                this.phoneTagSource = model.phoneTagSource;
                this.phoneTagType = model.phoneTagType;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * PhoneTagEnum.
             */
            public Builder phoneTagEnum(java.util.List<PhoneTagEnum> phoneTagEnum) {
                this.phoneTagEnum = phoneTagEnum;
                return this;
            }

            /**
             * PhoneTagKey.
             */
            public Builder phoneTagKey(String phoneTagKey) {
                this.phoneTagKey = phoneTagKey;
                return this;
            }

            /**
             * PhoneTagName.
             */
            public Builder phoneTagName(String phoneTagName) {
                this.phoneTagName = phoneTagName;
                return this;
            }

            /**
             * PhoneTagRequired.
             */
            public Builder phoneTagRequired(Boolean phoneTagRequired) {
                this.phoneTagRequired = phoneTagRequired;
                return this;
            }

            /**
             * PhoneTagSource.
             */
            public Builder phoneTagSource(String phoneTagSource) {
                this.phoneTagSource = phoneTagSource;
                return this;
            }

            /**
             * PhoneTagType.
             */
            public Builder phoneTagType(String phoneTagType) {
                this.phoneTagType = phoneTagType;
                return this;
            }

            public PhoneTagConfig build() {
                return new PhoneTagConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class DefaultTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        private DefaultTag(Builder builder) {
            this.desc = builder.desc;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultTag create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String desc; 
            private String tag; 

            private Builder() {
            } 

            private Builder(DefaultTag model) {
                this.desc = model.desc;
                this.tag = model.tag;
            } 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public DefaultTag build() {
                return new DefaultTag(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class MappingTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        private MappingTag(Builder builder) {
            this.desc = builder.desc;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MappingTag create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String desc; 
            private String tag; 

            private Builder() {
            } 

            private Builder(MappingTag model) {
                this.desc = model.desc;
                this.tag = model.tag;
            } 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public MappingTag build() {
                return new MappingTag(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class CallResultTagConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultTag")
        private DefaultTag defaultTag;

        @com.aliyun.core.annotation.NameInMap("MappingTag")
        private MappingTag mappingTag;

        private CallResultTagConfig(Builder builder) {
            this.defaultTag = builder.defaultTag;
            this.mappingTag = builder.mappingTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallResultTagConfig create() {
            return builder().build();
        }

        /**
         * @return defaultTag
         */
        public DefaultTag getDefaultTag() {
            return this.defaultTag;
        }

        /**
         * @return mappingTag
         */
        public MappingTag getMappingTag() {
            return this.mappingTag;
        }

        public static final class Builder {
            private DefaultTag defaultTag; 
            private MappingTag mappingTag; 

            private Builder() {
            } 

            private Builder(CallResultTagConfig model) {
                this.defaultTag = model.defaultTag;
                this.mappingTag = model.mappingTag;
            } 

            /**
             * DefaultTag.
             */
            public Builder defaultTag(DefaultTag defaultTag) {
                this.defaultTag = defaultTag;
                return this;
            }

            /**
             * MappingTag.
             */
            public Builder mappingTag(MappingTag mappingTag) {
                this.mappingTag = mappingTag;
                return this;
            }

            public CallResultTagConfig build() {
                return new CallResultTagConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class MainPurposeEnum extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private MainPurposeEnum(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MainPurposeEnum create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String id; 
            private String value; 

            private Builder() {
            } 

            private Builder(MainPurposeEnum model) {
                this.description = model.description;
                this.id = model.id;
                this.value = model.value;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MainPurposeEnum build() {
                return new MainPurposeEnum(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class MainPurpose extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MainPurposeDescription")
        private String mainPurposeDescription;

        @com.aliyun.core.annotation.NameInMap("MainPurposeEnum")
        private java.util.List<MainPurposeEnum> mainPurposeEnum;

        @com.aliyun.core.annotation.NameInMap("MainPurposeName")
        private String mainPurposeName;

        @com.aliyun.core.annotation.NameInMap("MainPurposeType")
        private String mainPurposeType;

        private MainPurpose(Builder builder) {
            this.id = builder.id;
            this.mainPurposeDescription = builder.mainPurposeDescription;
            this.mainPurposeEnum = builder.mainPurposeEnum;
            this.mainPurposeName = builder.mainPurposeName;
            this.mainPurposeType = builder.mainPurposeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MainPurpose create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mainPurposeDescription
         */
        public String getMainPurposeDescription() {
            return this.mainPurposeDescription;
        }

        /**
         * @return mainPurposeEnum
         */
        public java.util.List<MainPurposeEnum> getMainPurposeEnum() {
            return this.mainPurposeEnum;
        }

        /**
         * @return mainPurposeName
         */
        public String getMainPurposeName() {
            return this.mainPurposeName;
        }

        /**
         * @return mainPurposeType
         */
        public String getMainPurposeType() {
            return this.mainPurposeType;
        }

        public static final class Builder {
            private String id; 
            private String mainPurposeDescription; 
            private java.util.List<MainPurposeEnum> mainPurposeEnum; 
            private String mainPurposeName; 
            private String mainPurposeType; 

            private Builder() {
            } 

            private Builder(MainPurpose model) {
                this.id = model.id;
                this.mainPurposeDescription = model.mainPurposeDescription;
                this.mainPurposeEnum = model.mainPurposeEnum;
                this.mainPurposeName = model.mainPurposeName;
                this.mainPurposeType = model.mainPurposeType;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MainPurposeDescription.
             */
            public Builder mainPurposeDescription(String mainPurposeDescription) {
                this.mainPurposeDescription = mainPurposeDescription;
                return this;
            }

            /**
             * MainPurposeEnum.
             */
            public Builder mainPurposeEnum(java.util.List<MainPurposeEnum> mainPurposeEnum) {
                this.mainPurposeEnum = mainPurposeEnum;
                return this;
            }

            /**
             * MainPurposeName.
             */
            public Builder mainPurposeName(String mainPurposeName) {
                this.mainPurposeName = mainPurposeName;
                return this;
            }

            /**
             * MainPurposeType.
             */
            public Builder mainPurposeType(String mainPurposeType) {
                this.mainPurposeType = mainPurposeType;
                return this;
            }

            public MainPurpose build() {
                return new MainPurpose(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class OutputTagEnum extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private OutputTagEnum(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputTagEnum create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String id; 
            private String value; 

            private Builder() {
            } 

            private Builder(OutputTagEnum model) {
                this.description = model.description;
                this.id = model.id;
                this.value = model.value;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public OutputTagEnum build() {
                return new OutputTagEnum(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class OutputTagConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("OutputTagDescription")
        private String outputTagDescription;

        @com.aliyun.core.annotation.NameInMap("OutputTagEnum")
        private java.util.List<OutputTagEnum> outputTagEnum;

        @com.aliyun.core.annotation.NameInMap("OutputTagName")
        private String outputTagName;

        @com.aliyun.core.annotation.NameInMap("OutputTagType")
        private String outputTagType;

        private OutputTagConfig(Builder builder) {
            this.id = builder.id;
            this.outputTagDescription = builder.outputTagDescription;
            this.outputTagEnum = builder.outputTagEnum;
            this.outputTagName = builder.outputTagName;
            this.outputTagType = builder.outputTagType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputTagConfig create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return outputTagDescription
         */
        public String getOutputTagDescription() {
            return this.outputTagDescription;
        }

        /**
         * @return outputTagEnum
         */
        public java.util.List<OutputTagEnum> getOutputTagEnum() {
            return this.outputTagEnum;
        }

        /**
         * @return outputTagName
         */
        public String getOutputTagName() {
            return this.outputTagName;
        }

        /**
         * @return outputTagType
         */
        public String getOutputTagType() {
            return this.outputTagType;
        }

        public static final class Builder {
            private String id; 
            private String outputTagDescription; 
            private java.util.List<OutputTagEnum> outputTagEnum; 
            private String outputTagName; 
            private String outputTagType; 

            private Builder() {
            } 

            private Builder(OutputTagConfig model) {
                this.id = model.id;
                this.outputTagDescription = model.outputTagDescription;
                this.outputTagEnum = model.outputTagEnum;
                this.outputTagName = model.outputTagName;
                this.outputTagType = model.outputTagType;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * OutputTagDescription.
             */
            public Builder outputTagDescription(String outputTagDescription) {
                this.outputTagDescription = outputTagDescription;
                return this;
            }

            /**
             * OutputTagEnum.
             */
            public Builder outputTagEnum(java.util.List<OutputTagEnum> outputTagEnum) {
                this.outputTagEnum = outputTagEnum;
                return this;
            }

            /**
             * OutputTagName.
             */
            public Builder outputTagName(String outputTagName) {
                this.outputTagName = outputTagName;
                return this;
            }

            /**
             * OutputTagType.
             */
            public Builder outputTagType(String outputTagType) {
                this.outputTagType = outputTagType;
                return this;
            }

            public OutputTagConfig build() {
                return new OutputTagConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class SummaryConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallResultTagConfig")
        private CallResultTagConfig callResultTagConfig;

        @com.aliyun.core.annotation.NameInMap("MainPurpose")
        private MainPurpose mainPurpose;

        @com.aliyun.core.annotation.NameInMap("OutputTagConfig")
        private java.util.List<OutputTagConfig> outputTagConfig;

        private SummaryConfig(Builder builder) {
            this.callResultTagConfig = builder.callResultTagConfig;
            this.mainPurpose = builder.mainPurpose;
            this.outputTagConfig = builder.outputTagConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SummaryConfig create() {
            return builder().build();
        }

        /**
         * @return callResultTagConfig
         */
        public CallResultTagConfig getCallResultTagConfig() {
            return this.callResultTagConfig;
        }

        /**
         * @return mainPurpose
         */
        public MainPurpose getMainPurpose() {
            return this.mainPurpose;
        }

        /**
         * @return outputTagConfig
         */
        public java.util.List<OutputTagConfig> getOutputTagConfig() {
            return this.outputTagConfig;
        }

        public static final class Builder {
            private CallResultTagConfig callResultTagConfig; 
            private MainPurpose mainPurpose; 
            private java.util.List<OutputTagConfig> outputTagConfig; 

            private Builder() {
            } 

            private Builder(SummaryConfig model) {
                this.callResultTagConfig = model.callResultTagConfig;
                this.mainPurpose = model.mainPurpose;
                this.outputTagConfig = model.outputTagConfig;
            } 

            /**
             * CallResultTagConfig.
             */
            public Builder callResultTagConfig(CallResultTagConfig callResultTagConfig) {
                this.callResultTagConfig = callResultTagConfig;
                return this;
            }

            /**
             * MainPurpose.
             */
            public Builder mainPurpose(MainPurpose mainPurpose) {
                this.mainPurpose = mainPurpose;
                return this;
            }

            /**
             * OutputTagConfig.
             */
            public Builder outputTagConfig(java.util.List<OutputTagConfig> outputTagConfig) {
                this.outputTagConfig = outputTagConfig;
                return this;
            }

            public SummaryConfig build() {
                return new SummaryConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailNewResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentCallConfig")
        private AgentCallConfig agentCallConfig;

        @com.aliyun.core.annotation.NameInMap("AgentDemandConfig")
        private AgentDemandConfig agentDemandConfig;

        @com.aliyun.core.annotation.NameInMap("AgentDesc")
        private String agentDesc;

        @com.aliyun.core.annotation.NameInMap("AgentId")
        private Long agentId;

        @com.aliyun.core.annotation.NameInMap("AgentMode")
        private Long agentMode;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("BranchDeployStatus")
        private Long branchDeployStatus;

        @com.aliyun.core.annotation.NameInMap("BranchDesc")
        private String branchDesc;

        @com.aliyun.core.annotation.NameInMap("BranchId")
        private Long branchId;

        @com.aliyun.core.annotation.NameInMap("BranchName")
        private String branchName;

        @com.aliyun.core.annotation.NameInMap("KnowledgeConfig")
        private KnowledgeConfig knowledgeConfig;

        @com.aliyun.core.annotation.NameInMap("PhoneTagConfig")
        private java.util.List<PhoneTagConfig> phoneTagConfig;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("SummaryConfig")
        private SummaryConfig summaryConfig;

        @com.aliyun.core.annotation.NameInMap("VersionDesc")
        private String versionDesc;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private Long versionId;

        @com.aliyun.core.annotation.NameInMap("VersionName")
        private String versionName;

        @com.aliyun.core.annotation.NameInMap("VersionPublishStatus")
        private Long versionPublishStatus;

        @com.aliyun.core.annotation.NameInMap("VersionPublishTime")
        private String versionPublishTime;

        private Data(Builder builder) {
            this.agentCallConfig = builder.agentCallConfig;
            this.agentDemandConfig = builder.agentDemandConfig;
            this.agentDesc = builder.agentDesc;
            this.agentId = builder.agentId;
            this.agentMode = builder.agentMode;
            this.agentName = builder.agentName;
            this.branchDeployStatus = builder.branchDeployStatus;
            this.branchDesc = builder.branchDesc;
            this.branchId = builder.branchId;
            this.branchName = builder.branchName;
            this.knowledgeConfig = builder.knowledgeConfig;
            this.phoneTagConfig = builder.phoneTagConfig;
            this.scene = builder.scene;
            this.summaryConfig = builder.summaryConfig;
            this.versionDesc = builder.versionDesc;
            this.versionId = builder.versionId;
            this.versionName = builder.versionName;
            this.versionPublishStatus = builder.versionPublishStatus;
            this.versionPublishTime = builder.versionPublishTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentCallConfig
         */
        public AgentCallConfig getAgentCallConfig() {
            return this.agentCallConfig;
        }

        /**
         * @return agentDemandConfig
         */
        public AgentDemandConfig getAgentDemandConfig() {
            return this.agentDemandConfig;
        }

        /**
         * @return agentDesc
         */
        public String getAgentDesc() {
            return this.agentDesc;
        }

        /**
         * @return agentId
         */
        public Long getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentMode
         */
        public Long getAgentMode() {
            return this.agentMode;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return branchDeployStatus
         */
        public Long getBranchDeployStatus() {
            return this.branchDeployStatus;
        }

        /**
         * @return branchDesc
         */
        public String getBranchDesc() {
            return this.branchDesc;
        }

        /**
         * @return branchId
         */
        public Long getBranchId() {
            return this.branchId;
        }

        /**
         * @return branchName
         */
        public String getBranchName() {
            return this.branchName;
        }

        /**
         * @return knowledgeConfig
         */
        public KnowledgeConfig getKnowledgeConfig() {
            return this.knowledgeConfig;
        }

        /**
         * @return phoneTagConfig
         */
        public java.util.List<PhoneTagConfig> getPhoneTagConfig() {
            return this.phoneTagConfig;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return summaryConfig
         */
        public SummaryConfig getSummaryConfig() {
            return this.summaryConfig;
        }

        /**
         * @return versionDesc
         */
        public String getVersionDesc() {
            return this.versionDesc;
        }

        /**
         * @return versionId
         */
        public Long getVersionId() {
            return this.versionId;
        }

        /**
         * @return versionName
         */
        public String getVersionName() {
            return this.versionName;
        }

        /**
         * @return versionPublishStatus
         */
        public Long getVersionPublishStatus() {
            return this.versionPublishStatus;
        }

        /**
         * @return versionPublishTime
         */
        public String getVersionPublishTime() {
            return this.versionPublishTime;
        }

        public static final class Builder {
            private AgentCallConfig agentCallConfig; 
            private AgentDemandConfig agentDemandConfig; 
            private String agentDesc; 
            private Long agentId; 
            private Long agentMode; 
            private String agentName; 
            private Long branchDeployStatus; 
            private String branchDesc; 
            private Long branchId; 
            private String branchName; 
            private KnowledgeConfig knowledgeConfig; 
            private java.util.List<PhoneTagConfig> phoneTagConfig; 
            private String scene; 
            private SummaryConfig summaryConfig; 
            private String versionDesc; 
            private Long versionId; 
            private String versionName; 
            private Long versionPublishStatus; 
            private String versionPublishTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentCallConfig = model.agentCallConfig;
                this.agentDemandConfig = model.agentDemandConfig;
                this.agentDesc = model.agentDesc;
                this.agentId = model.agentId;
                this.agentMode = model.agentMode;
                this.agentName = model.agentName;
                this.branchDeployStatus = model.branchDeployStatus;
                this.branchDesc = model.branchDesc;
                this.branchId = model.branchId;
                this.branchName = model.branchName;
                this.knowledgeConfig = model.knowledgeConfig;
                this.phoneTagConfig = model.phoneTagConfig;
                this.scene = model.scene;
                this.summaryConfig = model.summaryConfig;
                this.versionDesc = model.versionDesc;
                this.versionId = model.versionId;
                this.versionName = model.versionName;
                this.versionPublishStatus = model.versionPublishStatus;
                this.versionPublishTime = model.versionPublishTime;
            } 

            /**
             * AgentCallConfig.
             */
            public Builder agentCallConfig(AgentCallConfig agentCallConfig) {
                this.agentCallConfig = agentCallConfig;
                return this;
            }

            /**
             * AgentDemandConfig.
             */
            public Builder agentDemandConfig(AgentDemandConfig agentDemandConfig) {
                this.agentDemandConfig = agentDemandConfig;
                return this;
            }

            /**
             * AgentDesc.
             */
            public Builder agentDesc(String agentDesc) {
                this.agentDesc = agentDesc;
                return this;
            }

            /**
             * AgentId.
             */
            public Builder agentId(Long agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * AgentMode.
             */
            public Builder agentMode(Long agentMode) {
                this.agentMode = agentMode;
                return this;
            }

            /**
             * AgentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * BranchDeployStatus.
             */
            public Builder branchDeployStatus(Long branchDeployStatus) {
                this.branchDeployStatus = branchDeployStatus;
                return this;
            }

            /**
             * BranchDesc.
             */
            public Builder branchDesc(String branchDesc) {
                this.branchDesc = branchDesc;
                return this;
            }

            /**
             * BranchId.
             */
            public Builder branchId(Long branchId) {
                this.branchId = branchId;
                return this;
            }

            /**
             * BranchName.
             */
            public Builder branchName(String branchName) {
                this.branchName = branchName;
                return this;
            }

            /**
             * KnowledgeConfig.
             */
            public Builder knowledgeConfig(KnowledgeConfig knowledgeConfig) {
                this.knowledgeConfig = knowledgeConfig;
                return this;
            }

            /**
             * PhoneTagConfig.
             */
            public Builder phoneTagConfig(java.util.List<PhoneTagConfig> phoneTagConfig) {
                this.phoneTagConfig = phoneTagConfig;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * SummaryConfig.
             */
            public Builder summaryConfig(SummaryConfig summaryConfig) {
                this.summaryConfig = summaryConfig;
                return this;
            }

            /**
             * VersionDesc.
             */
            public Builder versionDesc(String versionDesc) {
                this.versionDesc = versionDesc;
                return this;
            }

            /**
             * VersionId.
             */
            public Builder versionId(Long versionId) {
                this.versionId = versionId;
                return this;
            }

            /**
             * VersionName.
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            /**
             * VersionPublishStatus.
             */
            public Builder versionPublishStatus(Long versionPublishStatus) {
                this.versionPublishStatus = versionPublishStatus;
                return this;
            }

            /**
             * VersionPublishTime.
             */
            public Builder versionPublishTime(String versionPublishTime) {
                this.versionPublishTime = versionPublishTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
