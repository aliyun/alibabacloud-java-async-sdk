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
 * {@link QueryAiVoiceAgentDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAiVoiceAgentDetailResponseBody</p>
 */
public class QueryAiVoiceAgentDetailResponseBody extends TeaModel {
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

    private QueryAiVoiceAgentDetailResponseBody(Builder builder) {
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

    public static QueryAiVoiceAgentDetailResponseBody create() {
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

        private Builder(QueryAiVoiceAgentDetailResponseBody model) {
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

        public QueryAiVoiceAgentDetailResponseBody build() {
            return new QueryAiVoiceAgentDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAiVoiceAgentDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailResponseBody</p>
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
     * {@link QueryAiVoiceAgentDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailResponseBody</p>
     */
    public static class TtsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackgroundEnabled")
        private Boolean backgroundEnabled;

        @com.aliyun.core.annotation.NameInMap("BackgroundSound")
        private Long backgroundSound;

        @com.aliyun.core.annotation.NameInMap("BackgroundVolume")
        private Long backgroundVolume;

        @com.aliyun.core.annotation.NameInMap("MixingEnabled")
        private Boolean mixingEnabled;

        @com.aliyun.core.annotation.NameInMap("MixingTemplate")
        private Long mixingTemplate;

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
            this.mixingEnabled = builder.mixingEnabled;
            this.mixingTemplate = builder.mixingTemplate;
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
            private Boolean mixingEnabled; 
            private Long mixingTemplate; 
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
                this.mixingEnabled = model.mixingEnabled;
                this.mixingTemplate = model.mixingTemplate;
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
            public Builder voiceType(String voiceType) {
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
     * {@link QueryAiVoiceAgentDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailResponseBody</p>
     */
    public static class AiVoiceAgentCallConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventConfig")
        private EventConfig eventConfig;

        @com.aliyun.core.annotation.NameInMap("TtsConfig")
        private TtsConfig ttsConfig;

        @com.aliyun.core.annotation.NameInMap("VocabId")
        private String vocabId;

        private AiVoiceAgentCallConfig(Builder builder) {
            this.eventConfig = builder.eventConfig;
            this.ttsConfig = builder.ttsConfig;
            this.vocabId = builder.vocabId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiVoiceAgentCallConfig create() {
            return builder().build();
        }

        /**
         * @return eventConfig
         */
        public EventConfig getEventConfig() {
            return this.eventConfig;
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
            private TtsConfig ttsConfig; 
            private String vocabId; 

            private Builder() {
            } 

            private Builder(AiVoiceAgentCallConfig model) {
                this.eventConfig = model.eventConfig;
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

            public AiVoiceAgentCallConfig build() {
                return new AiVoiceAgentCallConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailResponseBody</p>
     */
    public static class ChildTaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChildTaskDescription")
        private String childTaskDescription;

        @com.aliyun.core.annotation.NameInMap("ChildTaskName")
        private String childTaskName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        private ChildTaskList(Builder builder) {
            this.childTaskDescription = builder.childTaskDescription;
            this.childTaskName = builder.childTaskName;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChildTaskList create() {
            return builder().build();
        }

        /**
         * @return childTaskDescription
         */
        public String getChildTaskDescription() {
            return this.childTaskDescription;
        }

        /**
         * @return childTaskName
         */
        public String getChildTaskName() {
            return this.childTaskName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String childTaskDescription; 
            private String childTaskName; 
            private String id; 

            private Builder() {
            } 

            private Builder(ChildTaskList model) {
                this.childTaskDescription = model.childTaskDescription;
                this.childTaskName = model.childTaskName;
                this.id = model.id;
            } 

            /**
             * ChildTaskDescription.
             */
            public Builder childTaskDescription(String childTaskDescription) {
                this.childTaskDescription = childTaskDescription;
                return this;
            }

            /**
             * ChildTaskName.
             */
            public Builder childTaskName(String childTaskName) {
                this.childTaskName = childTaskName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public ChildTaskList build() {
                return new ChildTaskList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailResponseBody</p>
     */
    public static class CustomExceptionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExceptionSign")
        private Boolean exceptionSign;

        @com.aliyun.core.annotation.NameInMap("ExceptionType")
        private String exceptionType;

        @com.aliyun.core.annotation.NameInMap("Reply")
        private String reply;

        @com.aliyun.core.annotation.NameInMap("SupportBreak")
        private Boolean supportBreak;

        private CustomExceptionList(Builder builder) {
            this.exceptionSign = builder.exceptionSign;
            this.exceptionType = builder.exceptionType;
            this.reply = builder.reply;
            this.supportBreak = builder.supportBreak;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomExceptionList create() {
            return builder().build();
        }

        /**
         * @return exceptionSign
         */
        public Boolean getExceptionSign() {
            return this.exceptionSign;
        }

        /**
         * @return exceptionType
         */
        public String getExceptionType() {
            return this.exceptionType;
        }

        /**
         * @return reply
         */
        public String getReply() {
            return this.reply;
        }

        /**
         * @return supportBreak
         */
        public Boolean getSupportBreak() {
            return this.supportBreak;
        }

        public static final class Builder {
            private Boolean exceptionSign; 
            private String exceptionType; 
            private String reply; 
            private Boolean supportBreak; 

            private Builder() {
            } 

            private Builder(CustomExceptionList model) {
                this.exceptionSign = model.exceptionSign;
                this.exceptionType = model.exceptionType;
                this.reply = model.reply;
                this.supportBreak = model.supportBreak;
            } 

            /**
             * ExceptionSign.
             */
            public Builder exceptionSign(Boolean exceptionSign) {
                this.exceptionSign = exceptionSign;
                return this;
            }

            /**
             * ExceptionType.
             */
            public Builder exceptionType(String exceptionType) {
                this.exceptionType = exceptionType;
                return this;
            }

            /**
             * Reply.
             */
            public Builder reply(String reply) {
                this.reply = reply;
                return this;
            }

            /**
             * SupportBreak.
             */
            public Builder supportBreak(Boolean supportBreak) {
                this.supportBreak = supportBreak;
                return this;
            }

            public CustomExceptionList build() {
                return new CustomExceptionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailResponseBody</p>
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
     * {@link QueryAiVoiceAgentDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailResponseBody</p>
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
     * {@link QueryAiVoiceAgentDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailResponseBody</p>
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
     * {@link QueryAiVoiceAgentDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailResponseBody</p>
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
     * {@link QueryAiVoiceAgentDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailResponseBody</p>
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
     * {@link QueryAiVoiceAgentDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailResponseBody</p>
     */
    public static class PhoneTagConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("PhoneTagDescription")
        private String phoneTagDescription;

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
            this.phoneTagDescription = builder.phoneTagDescription;
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
         * @return phoneTagDescription
         */
        public String getPhoneTagDescription() {
            return this.phoneTagDescription;
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
            private String phoneTagDescription; 
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
                this.phoneTagDescription = model.phoneTagDescription;
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
             * PhoneTagDescription.
             */
            public Builder phoneTagDescription(String phoneTagDescription) {
                this.phoneTagDescription = phoneTagDescription;
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
     * {@link QueryAiVoiceAgentDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailResponseBody</p>
     */
    public static class AiVoiceAgentModelConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BasicTaskDescription")
        private String basicTaskDescription;

        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private Long businessType;

        @com.aliyun.core.annotation.NameInMap("ChildTaskList")
        private java.util.List<ChildTaskList> childTaskList;

        @com.aliyun.core.annotation.NameInMap("CustomExceptionEnable")
        private Boolean customExceptionEnable;

        @com.aliyun.core.annotation.NameInMap("CustomExceptionFileId")
        private String customExceptionFileId;

        @com.aliyun.core.annotation.NameInMap("CustomExceptionFileName")
        private String customExceptionFileName;

        @com.aliyun.core.annotation.NameInMap("CustomExceptionList")
        private java.util.List<CustomExceptionList> customExceptionList;

        @com.aliyun.core.annotation.NameInMap("CustomExceptionUrlPath")
        private String customExceptionUrlPath;

        @com.aliyun.core.annotation.NameInMap("CustomExceptionVoiceStyle")
        private Long customExceptionVoiceStyle;

        @com.aliyun.core.annotation.NameInMap("FlowDesc")
        private String flowDesc;

        @com.aliyun.core.annotation.NameInMap("KnowledgeDocIdList")
        private java.util.List<String> knowledgeDocIdList;

        @com.aliyun.core.annotation.NameInMap("KnowledgeDocNameList")
        private java.util.List<String> knowledgeDocNameList;

        @com.aliyun.core.annotation.NameInMap("KnowledgeDocOriginalNameList")
        private java.util.List<String> knowledgeDocOriginalNameList;

        @com.aliyun.core.annotation.NameInMap("KnowledgeEnable")
        private Boolean knowledgeEnable;

        @com.aliyun.core.annotation.NameInMap("KnowledgeId")
        private String knowledgeId;

        @com.aliyun.core.annotation.NameInMap("MainPurpose")
        private MainPurpose mainPurpose;

        @com.aliyun.core.annotation.NameInMap("OutputTagConfig")
        private java.util.List<OutputTagConfig> outputTagConfig;

        @com.aliyun.core.annotation.NameInMap("PhoneTagConfig")
        private java.util.List<PhoneTagConfig> phoneTagConfig;

        @com.aliyun.core.annotation.NameInMap("Prologue")
        private String prologue;

        @com.aliyun.core.annotation.NameInMap("RecordingFile")
        private String recordingFile;

        @com.aliyun.core.annotation.NameInMap("StartWordType")
        private Long startWordType;

        @com.aliyun.core.annotation.NameInMap("SysRole")
        private String sysRole;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("UserRole")
        private String userRole;

        private AiVoiceAgentModelConfig(Builder builder) {
            this.basicTaskDescription = builder.basicTaskDescription;
            this.businessType = builder.businessType;
            this.childTaskList = builder.childTaskList;
            this.customExceptionEnable = builder.customExceptionEnable;
            this.customExceptionFileId = builder.customExceptionFileId;
            this.customExceptionFileName = builder.customExceptionFileName;
            this.customExceptionList = builder.customExceptionList;
            this.customExceptionUrlPath = builder.customExceptionUrlPath;
            this.customExceptionVoiceStyle = builder.customExceptionVoiceStyle;
            this.flowDesc = builder.flowDesc;
            this.knowledgeDocIdList = builder.knowledgeDocIdList;
            this.knowledgeDocNameList = builder.knowledgeDocNameList;
            this.knowledgeDocOriginalNameList = builder.knowledgeDocOriginalNameList;
            this.knowledgeEnable = builder.knowledgeEnable;
            this.knowledgeId = builder.knowledgeId;
            this.mainPurpose = builder.mainPurpose;
            this.outputTagConfig = builder.outputTagConfig;
            this.phoneTagConfig = builder.phoneTagConfig;
            this.prologue = builder.prologue;
            this.recordingFile = builder.recordingFile;
            this.startWordType = builder.startWordType;
            this.sysRole = builder.sysRole;
            this.taskType = builder.taskType;
            this.userRole = builder.userRole;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiVoiceAgentModelConfig create() {
            return builder().build();
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
         * @return childTaskList
         */
        public java.util.List<ChildTaskList> getChildTaskList() {
            return this.childTaskList;
        }

        /**
         * @return customExceptionEnable
         */
        public Boolean getCustomExceptionEnable() {
            return this.customExceptionEnable;
        }

        /**
         * @return customExceptionFileId
         */
        public String getCustomExceptionFileId() {
            return this.customExceptionFileId;
        }

        /**
         * @return customExceptionFileName
         */
        public String getCustomExceptionFileName() {
            return this.customExceptionFileName;
        }

        /**
         * @return customExceptionList
         */
        public java.util.List<CustomExceptionList> getCustomExceptionList() {
            return this.customExceptionList;
        }

        /**
         * @return customExceptionUrlPath
         */
        public String getCustomExceptionUrlPath() {
            return this.customExceptionUrlPath;
        }

        /**
         * @return customExceptionVoiceStyle
         */
        public Long getCustomExceptionVoiceStyle() {
            return this.customExceptionVoiceStyle;
        }

        /**
         * @return flowDesc
         */
        public String getFlowDesc() {
            return this.flowDesc;
        }

        /**
         * @return knowledgeDocIdList
         */
        public java.util.List<String> getKnowledgeDocIdList() {
            return this.knowledgeDocIdList;
        }

        /**
         * @return knowledgeDocNameList
         */
        public java.util.List<String> getKnowledgeDocNameList() {
            return this.knowledgeDocNameList;
        }

        /**
         * @return knowledgeDocOriginalNameList
         */
        public java.util.List<String> getKnowledgeDocOriginalNameList() {
            return this.knowledgeDocOriginalNameList;
        }

        /**
         * @return knowledgeEnable
         */
        public Boolean getKnowledgeEnable() {
            return this.knowledgeEnable;
        }

        /**
         * @return knowledgeId
         */
        public String getKnowledgeId() {
            return this.knowledgeId;
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

        /**
         * @return phoneTagConfig
         */
        public java.util.List<PhoneTagConfig> getPhoneTagConfig() {
            return this.phoneTagConfig;
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
         * @return sysRole
         */
        public String getSysRole() {
            return this.sysRole;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return userRole
         */
        public String getUserRole() {
            return this.userRole;
        }

        public static final class Builder {
            private String basicTaskDescription; 
            private Long businessType; 
            private java.util.List<ChildTaskList> childTaskList; 
            private Boolean customExceptionEnable; 
            private String customExceptionFileId; 
            private String customExceptionFileName; 
            private java.util.List<CustomExceptionList> customExceptionList; 
            private String customExceptionUrlPath; 
            private Long customExceptionVoiceStyle; 
            private String flowDesc; 
            private java.util.List<String> knowledgeDocIdList; 
            private java.util.List<String> knowledgeDocNameList; 
            private java.util.List<String> knowledgeDocOriginalNameList; 
            private Boolean knowledgeEnable; 
            private String knowledgeId; 
            private MainPurpose mainPurpose; 
            private java.util.List<OutputTagConfig> outputTagConfig; 
            private java.util.List<PhoneTagConfig> phoneTagConfig; 
            private String prologue; 
            private String recordingFile; 
            private Long startWordType; 
            private String sysRole; 
            private String taskType; 
            private String userRole; 

            private Builder() {
            } 

            private Builder(AiVoiceAgentModelConfig model) {
                this.basicTaskDescription = model.basicTaskDescription;
                this.businessType = model.businessType;
                this.childTaskList = model.childTaskList;
                this.customExceptionEnable = model.customExceptionEnable;
                this.customExceptionFileId = model.customExceptionFileId;
                this.customExceptionFileName = model.customExceptionFileName;
                this.customExceptionList = model.customExceptionList;
                this.customExceptionUrlPath = model.customExceptionUrlPath;
                this.customExceptionVoiceStyle = model.customExceptionVoiceStyle;
                this.flowDesc = model.flowDesc;
                this.knowledgeDocIdList = model.knowledgeDocIdList;
                this.knowledgeDocNameList = model.knowledgeDocNameList;
                this.knowledgeDocOriginalNameList = model.knowledgeDocOriginalNameList;
                this.knowledgeEnable = model.knowledgeEnable;
                this.knowledgeId = model.knowledgeId;
                this.mainPurpose = model.mainPurpose;
                this.outputTagConfig = model.outputTagConfig;
                this.phoneTagConfig = model.phoneTagConfig;
                this.prologue = model.prologue;
                this.recordingFile = model.recordingFile;
                this.startWordType = model.startWordType;
                this.sysRole = model.sysRole;
                this.taskType = model.taskType;
                this.userRole = model.userRole;
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
             * ChildTaskList.
             */
            public Builder childTaskList(java.util.List<ChildTaskList> childTaskList) {
                this.childTaskList = childTaskList;
                return this;
            }

            /**
             * CustomExceptionEnable.
             */
            public Builder customExceptionEnable(Boolean customExceptionEnable) {
                this.customExceptionEnable = customExceptionEnable;
                return this;
            }

            /**
             * CustomExceptionFileId.
             */
            public Builder customExceptionFileId(String customExceptionFileId) {
                this.customExceptionFileId = customExceptionFileId;
                return this;
            }

            /**
             * CustomExceptionFileName.
             */
            public Builder customExceptionFileName(String customExceptionFileName) {
                this.customExceptionFileName = customExceptionFileName;
                return this;
            }

            /**
             * CustomExceptionList.
             */
            public Builder customExceptionList(java.util.List<CustomExceptionList> customExceptionList) {
                this.customExceptionList = customExceptionList;
                return this;
            }

            /**
             * CustomExceptionUrlPath.
             */
            public Builder customExceptionUrlPath(String customExceptionUrlPath) {
                this.customExceptionUrlPath = customExceptionUrlPath;
                return this;
            }

            /**
             * CustomExceptionVoiceStyle.
             */
            public Builder customExceptionVoiceStyle(Long customExceptionVoiceStyle) {
                this.customExceptionVoiceStyle = customExceptionVoiceStyle;
                return this;
            }

            /**
             * FlowDesc.
             */
            public Builder flowDesc(String flowDesc) {
                this.flowDesc = flowDesc;
                return this;
            }

            /**
             * KnowledgeDocIdList.
             */
            public Builder knowledgeDocIdList(java.util.List<String> knowledgeDocIdList) {
                this.knowledgeDocIdList = knowledgeDocIdList;
                return this;
            }

            /**
             * KnowledgeDocNameList.
             */
            public Builder knowledgeDocNameList(java.util.List<String> knowledgeDocNameList) {
                this.knowledgeDocNameList = knowledgeDocNameList;
                return this;
            }

            /**
             * KnowledgeDocOriginalNameList.
             */
            public Builder knowledgeDocOriginalNameList(java.util.List<String> knowledgeDocOriginalNameList) {
                this.knowledgeDocOriginalNameList = knowledgeDocOriginalNameList;
                return this;
            }

            /**
             * KnowledgeEnable.
             */
            public Builder knowledgeEnable(Boolean knowledgeEnable) {
                this.knowledgeEnable = knowledgeEnable;
                return this;
            }

            /**
             * KnowledgeId.
             */
            public Builder knowledgeId(String knowledgeId) {
                this.knowledgeId = knowledgeId;
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

            /**
             * PhoneTagConfig.
             */
            public Builder phoneTagConfig(java.util.List<PhoneTagConfig> phoneTagConfig) {
                this.phoneTagConfig = phoneTagConfig;
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
             * SysRole.
             */
            public Builder sysRole(String sysRole) {
                this.sysRole = sysRole;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * UserRole.
             */
            public Builder userRole(String userRole) {
                this.userRole = userRole;
                return this;
            }

            public AiVoiceAgentModelConfig build() {
                return new AiVoiceAgentModelConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiVoiceAgentDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiVoiceAgentDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private Long agentId;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("AiVoiceAgentCallConfig")
        private AiVoiceAgentCallConfig aiVoiceAgentCallConfig;

        @com.aliyun.core.annotation.NameInMap("AiVoiceAgentModelConfig")
        private AiVoiceAgentModelConfig aiVoiceAgentModelConfig;

        @com.aliyun.core.annotation.NameInMap("BusinessTypeName")
        private String businessTypeName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("KnowledgeName")
        private String knowledgeName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("VoiceStyleName")
        private String voiceStyleName;

        private Data(Builder builder) {
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
            this.aiVoiceAgentCallConfig = builder.aiVoiceAgentCallConfig;
            this.aiVoiceAgentModelConfig = builder.aiVoiceAgentModelConfig;
            this.businessTypeName = builder.businessTypeName;
            this.description = builder.description;
            this.knowledgeName = builder.knowledgeName;
            this.status = builder.status;
            this.voiceStyleName = builder.voiceStyleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public Long getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return aiVoiceAgentCallConfig
         */
        public AiVoiceAgentCallConfig getAiVoiceAgentCallConfig() {
            return this.aiVoiceAgentCallConfig;
        }

        /**
         * @return aiVoiceAgentModelConfig
         */
        public AiVoiceAgentModelConfig getAiVoiceAgentModelConfig() {
            return this.aiVoiceAgentModelConfig;
        }

        /**
         * @return businessTypeName
         */
        public String getBusinessTypeName() {
            return this.businessTypeName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return knowledgeName
         */
        public String getKnowledgeName() {
            return this.knowledgeName;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return voiceStyleName
         */
        public String getVoiceStyleName() {
            return this.voiceStyleName;
        }

        public static final class Builder {
            private Long agentId; 
            private String agentName; 
            private AiVoiceAgentCallConfig aiVoiceAgentCallConfig; 
            private AiVoiceAgentModelConfig aiVoiceAgentModelConfig; 
            private String businessTypeName; 
            private String description; 
            private String knowledgeName; 
            private Long status; 
            private String voiceStyleName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentId = model.agentId;
                this.agentName = model.agentName;
                this.aiVoiceAgentCallConfig = model.aiVoiceAgentCallConfig;
                this.aiVoiceAgentModelConfig = model.aiVoiceAgentModelConfig;
                this.businessTypeName = model.businessTypeName;
                this.description = model.description;
                this.knowledgeName = model.knowledgeName;
                this.status = model.status;
                this.voiceStyleName = model.voiceStyleName;
            } 

            /**
             * AgentId.
             */
            public Builder agentId(Long agentId) {
                this.agentId = agentId;
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
             * AiVoiceAgentCallConfig.
             */
            public Builder aiVoiceAgentCallConfig(AiVoiceAgentCallConfig aiVoiceAgentCallConfig) {
                this.aiVoiceAgentCallConfig = aiVoiceAgentCallConfig;
                return this;
            }

            /**
             * AiVoiceAgentModelConfig.
             */
            public Builder aiVoiceAgentModelConfig(AiVoiceAgentModelConfig aiVoiceAgentModelConfig) {
                this.aiVoiceAgentModelConfig = aiVoiceAgentModelConfig;
                return this;
            }

            /**
             * BusinessTypeName.
             */
            public Builder businessTypeName(String businessTypeName) {
                this.businessTypeName = businessTypeName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * KnowledgeName.
             */
            public Builder knowledgeName(String knowledgeName) {
                this.knowledgeName = knowledgeName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * VoiceStyleName.
             */
            public Builder voiceStyleName(String voiceStyleName) {
                this.voiceStyleName = voiceStyleName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
