// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link AIAgentTemplateConfig} extends {@link TeaModel}
 *
 * <p>AIAgentTemplateConfig</p>
 */
public class AIAgentTemplateConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvatarChat3D")
    private AvatarChat3D avatarChat3D;

    @com.aliyun.core.annotation.NameInMap("VisionChat")
    private VisionChat visionChat;

    @com.aliyun.core.annotation.NameInMap("VoiceChat")
    private VoiceChat voiceChat;

    private AIAgentTemplateConfig(Builder builder) {
        this.avatarChat3D = builder.avatarChat3D;
        this.visionChat = builder.visionChat;
        this.voiceChat = builder.voiceChat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AIAgentTemplateConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return avatarChat3D
     */
    public AvatarChat3D getAvatarChat3D() {
        return this.avatarChat3D;
    }

    /**
     * @return visionChat
     */
    public VisionChat getVisionChat() {
        return this.visionChat;
    }

    /**
     * @return voiceChat
     */
    public VoiceChat getVoiceChat() {
        return this.voiceChat;
    }

    public static final class Builder {
        private AvatarChat3D avatarChat3D; 
        private VisionChat visionChat; 
        private VoiceChat voiceChat; 

        private Builder() {
        } 

        private Builder(AIAgentTemplateConfig model) {
            this.avatarChat3D = model.avatarChat3D;
            this.visionChat = model.visionChat;
            this.voiceChat = model.voiceChat;
        } 

        /**
         * <p>The 3D digital human parameters.</p>
         */
        public Builder avatarChat3D(AvatarChat3D avatarChat3D) {
            this.avatarChat3D = avatarChat3D;
            return this;
        }

        /**
         * <p>The visual agent parameters.</p>
         */
        public Builder visionChat(VisionChat visionChat) {
            this.visionChat = visionChat;
            return this;
        }

        /**
         * <p>The voice call parameters.</p>
         */
        public Builder voiceChat(VoiceChat voiceChat) {
            this.voiceChat = voiceChat;
            return this;
        }

        public AIAgentTemplateConfig build() {
            return new AIAgentTemplateConfig(this);
        } 

    } 

    /**
     * 
     * {@link AIAgentTemplateConfig} extends {@link TeaModel}
     *
     * <p>AIAgentTemplateConfig</p>
     */
    public static class LlmHistory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private LlmHistory(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LlmHistory create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String content; 
            private String role; 

            private Builder() {
            } 

            private Builder(LlmHistory model) {
                this.content = model.content;
                this.role = model.role;
            } 

            /**
             * <p>The actual text of the conversation content, which records the specific expression or response of the role in the conversation.</p>
             * 
             * <strong>example:</strong>
             * <p>hello</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The role of the conversation participant. Valid values:</p>
             * <ul>
             * <li><p>user: User</p>
             * </li>
             * <li><p>assistant: Assistant</p>
             * </li>
             * <li><p>system: System</p>
             * </li>
             * <li><p>function: Function</p>
             * </li>
             * <li><p>plugin: Plug-in</p>
             * </li>
             * <li><p>tool: Tool</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public LlmHistory build() {
                return new LlmHistory(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentTemplateConfig} extends {@link TeaModel}
     *
     * <p>AIAgentTemplateConfig</p>
     */
    public static class AvatarChat3D extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrHotWords")
        private java.util.List<String> asrHotWords;

        @com.aliyun.core.annotation.NameInMap("AsrLanguageId")
        private String asrLanguageId;

        @com.aliyun.core.annotation.NameInMap("AsrMaxSilence")
        private Integer asrMaxSilence;

        @com.aliyun.core.annotation.NameInMap("AvatarId")
        private String avatarId;

        @com.aliyun.core.annotation.NameInMap("BailianAppParams")
        private String bailianAppParams;

        @com.aliyun.core.annotation.NameInMap("CharBreak")
        private Boolean charBreak;

        @com.aliyun.core.annotation.NameInMap("EnableIntelligentSegment")
        private Boolean enableIntelligentSegment;

        @com.aliyun.core.annotation.NameInMap("EnablePushToTalk")
        private Boolean enablePushToTalk;

        @com.aliyun.core.annotation.NameInMap("EnableVoiceInterrupt")
        private Boolean enableVoiceInterrupt;

        @com.aliyun.core.annotation.NameInMap("GracefulShutdown")
        private Boolean gracefulShutdown;

        @com.aliyun.core.annotation.NameInMap("Greeting")
        private String greeting;

        @com.aliyun.core.annotation.NameInMap("InterruptWords")
        private java.util.List<String> interruptWords;

        @com.aliyun.core.annotation.NameInMap("LlmHistory")
        private java.util.List<LlmHistory> llmHistory;

        @com.aliyun.core.annotation.NameInMap("LlmHistoryLimit")
        private Integer llmHistoryLimit;

        @com.aliyun.core.annotation.NameInMap("LlmSystemPrompt")
        private String llmSystemPrompt;

        @com.aliyun.core.annotation.NameInMap("MaxIdleTime")
        private Integer maxIdleTime;

        @com.aliyun.core.annotation.NameInMap("UseVoiceprint")
        private Boolean useVoiceprint;

        @com.aliyun.core.annotation.NameInMap("UserOfflineTimeout")
        private Integer userOfflineTimeout;

        @com.aliyun.core.annotation.NameInMap("UserOnlineTimeout")
        private Integer userOnlineTimeout;

        @com.aliyun.core.annotation.NameInMap("VadLevel")
        private Integer vadLevel;

        @com.aliyun.core.annotation.NameInMap("VoiceId")
        private String voiceId;

        @com.aliyun.core.annotation.NameInMap("VoiceIdList")
        private java.util.List<String> voiceIdList;

        @com.aliyun.core.annotation.NameInMap("VoiceprintId")
        private String voiceprintId;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Long volume;

        @com.aliyun.core.annotation.NameInMap("WakeUpQuery")
        private String wakeUpQuery;

        @com.aliyun.core.annotation.NameInMap("WorkflowOverrideParams")
        private String workflowOverrideParams;

        private AvatarChat3D(Builder builder) {
            this.asrHotWords = builder.asrHotWords;
            this.asrLanguageId = builder.asrLanguageId;
            this.asrMaxSilence = builder.asrMaxSilence;
            this.avatarId = builder.avatarId;
            this.bailianAppParams = builder.bailianAppParams;
            this.charBreak = builder.charBreak;
            this.enableIntelligentSegment = builder.enableIntelligentSegment;
            this.enablePushToTalk = builder.enablePushToTalk;
            this.enableVoiceInterrupt = builder.enableVoiceInterrupt;
            this.gracefulShutdown = builder.gracefulShutdown;
            this.greeting = builder.greeting;
            this.interruptWords = builder.interruptWords;
            this.llmHistory = builder.llmHistory;
            this.llmHistoryLimit = builder.llmHistoryLimit;
            this.llmSystemPrompt = builder.llmSystemPrompt;
            this.maxIdleTime = builder.maxIdleTime;
            this.useVoiceprint = builder.useVoiceprint;
            this.userOfflineTimeout = builder.userOfflineTimeout;
            this.userOnlineTimeout = builder.userOnlineTimeout;
            this.vadLevel = builder.vadLevel;
            this.voiceId = builder.voiceId;
            this.voiceIdList = builder.voiceIdList;
            this.voiceprintId = builder.voiceprintId;
            this.volume = builder.volume;
            this.wakeUpQuery = builder.wakeUpQuery;
            this.workflowOverrideParams = builder.workflowOverrideParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvatarChat3D create() {
            return builder().build();
        }

        /**
         * @return asrHotWords
         */
        public java.util.List<String> getAsrHotWords() {
            return this.asrHotWords;
        }

        /**
         * @return asrLanguageId
         */
        public String getAsrLanguageId() {
            return this.asrLanguageId;
        }

        /**
         * @return asrMaxSilence
         */
        public Integer getAsrMaxSilence() {
            return this.asrMaxSilence;
        }

        /**
         * @return avatarId
         */
        public String getAvatarId() {
            return this.avatarId;
        }

        /**
         * @return bailianAppParams
         */
        public String getBailianAppParams() {
            return this.bailianAppParams;
        }

        /**
         * @return charBreak
         */
        public Boolean getCharBreak() {
            return this.charBreak;
        }

        /**
         * @return enableIntelligentSegment
         */
        public Boolean getEnableIntelligentSegment() {
            return this.enableIntelligentSegment;
        }

        /**
         * @return enablePushToTalk
         */
        public Boolean getEnablePushToTalk() {
            return this.enablePushToTalk;
        }

        /**
         * @return enableVoiceInterrupt
         */
        public Boolean getEnableVoiceInterrupt() {
            return this.enableVoiceInterrupt;
        }

        /**
         * @return gracefulShutdown
         */
        public Boolean getGracefulShutdown() {
            return this.gracefulShutdown;
        }

        /**
         * @return greeting
         */
        public String getGreeting() {
            return this.greeting;
        }

        /**
         * @return interruptWords
         */
        public java.util.List<String> getInterruptWords() {
            return this.interruptWords;
        }

        /**
         * @return llmHistory
         */
        public java.util.List<LlmHistory> getLlmHistory() {
            return this.llmHistory;
        }

        /**
         * @return llmHistoryLimit
         */
        public Integer getLlmHistoryLimit() {
            return this.llmHistoryLimit;
        }

        /**
         * @return llmSystemPrompt
         */
        public String getLlmSystemPrompt() {
            return this.llmSystemPrompt;
        }

        /**
         * @return maxIdleTime
         */
        public Integer getMaxIdleTime() {
            return this.maxIdleTime;
        }

        /**
         * @return useVoiceprint
         */
        public Boolean getUseVoiceprint() {
            return this.useVoiceprint;
        }

        /**
         * @return userOfflineTimeout
         */
        public Integer getUserOfflineTimeout() {
            return this.userOfflineTimeout;
        }

        /**
         * @return userOnlineTimeout
         */
        public Integer getUserOnlineTimeout() {
            return this.userOnlineTimeout;
        }

        /**
         * @return vadLevel
         */
        public Integer getVadLevel() {
            return this.vadLevel;
        }

        /**
         * @return voiceId
         */
        public String getVoiceId() {
            return this.voiceId;
        }

        /**
         * @return voiceIdList
         */
        public java.util.List<String> getVoiceIdList() {
            return this.voiceIdList;
        }

        /**
         * @return voiceprintId
         */
        public String getVoiceprintId() {
            return this.voiceprintId;
        }

        /**
         * @return volume
         */
        public Long getVolume() {
            return this.volume;
        }

        /**
         * @return wakeUpQuery
         */
        public String getWakeUpQuery() {
            return this.wakeUpQuery;
        }

        /**
         * @return workflowOverrideParams
         */
        public String getWorkflowOverrideParams() {
            return this.workflowOverrideParams;
        }

        public static final class Builder {
            private java.util.List<String> asrHotWords; 
            private String asrLanguageId; 
            private Integer asrMaxSilence; 
            private String avatarId; 
            private String bailianAppParams; 
            private Boolean charBreak; 
            private Boolean enableIntelligentSegment; 
            private Boolean enablePushToTalk; 
            private Boolean enableVoiceInterrupt; 
            private Boolean gracefulShutdown; 
            private String greeting; 
            private java.util.List<String> interruptWords; 
            private java.util.List<LlmHistory> llmHistory; 
            private Integer llmHistoryLimit; 
            private String llmSystemPrompt; 
            private Integer maxIdleTime; 
            private Boolean useVoiceprint; 
            private Integer userOfflineTimeout; 
            private Integer userOnlineTimeout; 
            private Integer vadLevel; 
            private String voiceId; 
            private java.util.List<String> voiceIdList; 
            private String voiceprintId; 
            private Long volume; 
            private String wakeUpQuery; 
            private String workflowOverrideParams; 

            private Builder() {
            } 

            private Builder(AvatarChat3D model) {
                this.asrHotWords = model.asrHotWords;
                this.asrLanguageId = model.asrLanguageId;
                this.asrMaxSilence = model.asrMaxSilence;
                this.avatarId = model.avatarId;
                this.bailianAppParams = model.bailianAppParams;
                this.charBreak = model.charBreak;
                this.enableIntelligentSegment = model.enableIntelligentSegment;
                this.enablePushToTalk = model.enablePushToTalk;
                this.enableVoiceInterrupt = model.enableVoiceInterrupt;
                this.gracefulShutdown = model.gracefulShutdown;
                this.greeting = model.greeting;
                this.interruptWords = model.interruptWords;
                this.llmHistory = model.llmHistory;
                this.llmHistoryLimit = model.llmHistoryLimit;
                this.llmSystemPrompt = model.llmSystemPrompt;
                this.maxIdleTime = model.maxIdleTime;
                this.useVoiceprint = model.useVoiceprint;
                this.userOfflineTimeout = model.userOfflineTimeout;
                this.userOnlineTimeout = model.userOnlineTimeout;
                this.vadLevel = model.vadLevel;
                this.voiceId = model.voiceId;
                this.voiceIdList = model.voiceIdList;
                this.voiceprintId = model.voiceprintId;
                this.volume = model.volume;
                this.wakeUpQuery = model.wakeUpQuery;
                this.workflowOverrideParams = model.workflowOverrideParams;
            } 

            /**
             * <p>The list of hotwords for ASR. The hotword list supports a maximum of 128 words.</p>
             */
            public Builder asrHotWords(java.util.List<String> asrHotWords) {
                this.asrHotWords = asrHotWords;
                return this;
            }

            /**
             * <p>The language ID for automatic speech recognition (ASR). Valid values:</p>
             * <ul>
             * <li>zh_mandarin: Chinese</li>
             * <li>en: English</li>
             * <li>zh_en: Chinese and English mixed</li>
             * <li>es: Spanish</li>
             * <li>jp: Japanese</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>zh_mandarin</p>
             */
            public Builder asrLanguageId(String asrLanguageId) {
                this.asrLanguageId = asrLanguageId;
                return this;
            }

            /**
             * <p>The threshold for speech segmentation detection. Silence exceeding this threshold is treated as a sentence break. Valid values: 200 to 1200. Unit: milliseconds. Default value: 400.</p>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder asrMaxSilence(Integer asrMaxSilence) {
                this.asrMaxSilence = asrMaxSilence;
                return this;
            }

            /**
             * <p>The ID of the digital human model.</p>
             * 
             * <strong>example:</strong>
             * <p>1231</p>
             */
            public Builder avatarId(String avatarId) {
                this.avatarId = avatarId;
                return this;
            }

            /**
             * <p>The parameters for Alibaba Cloud Model Studio Application Center. For the parameter format, refer to <a href="https://help.aliyun.com/document_detail/2858132.html">Alibaba Cloud Model Studio Application Center parameters</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder bailianAppParams(String bailianAppParams) {
                this.bailianAppParams = bailianAppParams;
                return this;
            }

            /**
             * CharBreak.
             */
            public Builder charBreak(Boolean charBreak) {
                this.charBreak = charBreak;
                return this;
            }

            /**
             * <p>Specifies whether to enable intelligent segmentation. After this feature is enabled, sentence breaks in user speech are intelligently merged into a single sentence. Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableIntelligentSegment(Boolean enableIntelligentSegment) {
                this.enableIntelligentSegment = enableIntelligentSegment;
                return this;
            }

            /**
             * <p>Specifies whether to enable the push-to-talk mode. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enablePushToTalk(Boolean enablePushToTalk) {
                this.enablePushToTalk = enablePushToTalk;
                return this;
            }

            /**
             * <p>Specifies whether to support voice interruption. Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableVoiceInterrupt(Boolean enableVoiceInterrupt) {
                this.enableVoiceInterrupt = enableVoiceInterrupt;
                return this;
            }

            /**
             * <p>Specifies whether to enable graceful shutdown. Default value: false.</p>
             * <ul>
             * <li>Graceful shutdown: When the agent is stopped, it finishes broadcasting the current speech before stopping, with a maximum broadcast duration of 10 seconds.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder gracefulShutdown(Boolean gracefulShutdown) {
                this.gracefulShutdown = gracefulShutdown;
                return this;
            }

            /**
             * <p>The greeting message, which takes effect when joining the session. If not specified, the greeting configured in the agent template is used. Maximum length: 128 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>Good morning, my friend!</p>
             */
            public Builder greeting(String greeting) {
                this.greeting = greeting;
                return this;
            }

            /**
             * <p>The list of specific words or phrases that trigger conversation interruption.</p>
             */
            public Builder interruptWords(java.util.List<String> interruptWords) {
                this.interruptWords = interruptWords;
                return this;
            }

            /**
             * <p>The maximum number of retained turns for the LLM or MLLM historical conversation context. Default value: 10.</p>
             */
            public Builder llmHistory(java.util.List<LlmHistory> llmHistory) {
                this.llmHistory = llmHistory;
                return this;
            }

            /**
             * <p>The maximum number of retained turns for the LLM or MLLM historical conversation context. Default value: 10.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder llmHistoryLimit(Integer llmHistoryLimit) {
                this.llmHistoryLimit = llmHistoryLimit;
                return this;
            }

            /**
             * <p>The system prompt for the LLM after the call starts.</p>
             * 
             * <strong>example:</strong>
             * <p>You are a friendly and helpful assistant, focused on providing users with accurate information and advice.</p>
             */
            public Builder llmSystemPrompt(String llmSystemPrompt) {
                this.llmSystemPrompt = llmSystemPrompt;
                return this;
            }

            /**
             * <p>The maximum waiting time without interaction with the agent. The agent goes offline upon timeout. Unit: seconds. Default value: 600.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder maxIdleTime(Integer maxIdleTime) {
                this.maxIdleTime = maxIdleTime;
                return this;
            }

            /**
             * <p>Specifies whether to enable voiceprint recognition. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder useVoiceprint(Boolean useVoiceprint) {
                this.useVoiceprint = useVoiceprint;
                return this;
            }

            /**
             * <p>The timeout period for the agent to close the task after the user leaves the session. Unit: seconds. Default value: 5.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder userOfflineTimeout(Integer userOfflineTimeout) {
                this.userOfflineTimeout = userOfflineTimeout;
                return this;
            }

            /**
             * <p>The timeout period for the agent to close the task if the user does not join the session. Unit: seconds. Default value: 60.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder userOnlineTimeout(Integer userOnlineTimeout) {
                this.userOnlineTimeout = userOnlineTimeout;
                return this;
            }

            /**
             * <p>The interruption threshold parameter. Valid values: 0 to 11. Default value: 11.</p>
             * <ul>
             * <li>0: Disables the voice activity detection (VAD) feature.</li>
             * <li>1 to 10: A higher value indicates that it is more difficult to interrupt.</li>
             * <li>11: Significantly different from previous values, with lower pre-processing speech damage and stronger anti-interference.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder vadLevel(Integer vadLevel) {
                this.vadLevel = vadLevel;
                return this;
            }

            /**
             * <p>The ID of the voice, which takes effect in the next sentence. If not specified, the voice ID configured in the agent template is used. This parameter applies only to preset text-to-speech (TTS). Maximum length: 64 characters. For valid values, refer to <a href="https://help.aliyun.com/document_detail/449563.html">Intelligent speech effect examples</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>zhixiaoxia</p>
             */
            public Builder voiceId(String voiceId) {
                this.voiceId = voiceId;
                return this;
            }

            /**
             * <p>The list of available voices.</p>
             */
            public Builder voiceIdList(java.util.List<String> voiceIdList) {
                this.voiceIdList = voiceIdList;
                return this;
            }

            /**
             * <p>The unique identity ID for voiceprint recognition. Default value: none.</p>
             * 
             * <strong>example:</strong>
             * <p>uniqueId</p>
             */
            public Builder voiceprintId(String voiceprintId) {
                this.voiceprintId = voiceprintId;
                return this;
            }

            /**
             * <p>The volume of the agent\&quot;s speech.</p>
             * <ul>
             * <li><p>If not specified: The adaptive volume mode recommended by Alibaba Cloud is used by default.</p>
             * </li>
             * <li><p>If specified: Valid values are 0 to 400. Output volume = Speech output volume in the workflow × volume / 100. Examples:</p>
             * </li>
             * </ul>
             * <ol>
             * <li><p>If volume is set to 0, the output volume is 0.</p>
             * </li>
             * <li><p>If volume is set to 100, the volume is the original volume.</p>
             * </li>
             * <li><p>If volume is set to 200, the volume is twice the original volume.</p>
             * </li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder volume(Long volume) {
                this.volume = volume;
                return this;
            }

            /**
             * <p>The user\&quot;s instruction before the call starts, which is used for the agent to respond immediately after the call starts.</p>
             * 
             * <strong>example:</strong>
             * <p>How’s the weather today?</p>
             */
            public Builder wakeUpQuery(String wakeUpQuery) {
                this.wakeUpQuery = wakeUpQuery;
                return this;
            }

            /**
             * <p>The override parameters for the workflow. Default value: none.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder workflowOverrideParams(String workflowOverrideParams) {
                this.workflowOverrideParams = workflowOverrideParams;
                return this;
            }

            public AvatarChat3D build() {
                return new AvatarChat3D(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentTemplateConfig} extends {@link TeaModel}
     *
     * <p>AIAgentTemplateConfig</p>
     */
    public static class VisionChatLlmHistory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private VisionChatLlmHistory(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VisionChatLlmHistory create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String content; 
            private String role; 

            private Builder() {
            } 

            private Builder(VisionChatLlmHistory model) {
                this.content = model.content;
                this.role = model.role;
            } 

            /**
             * <p>The actual text of the conversation content, which records the specific expression or response of the role in the conversation.</p>
             * 
             * <strong>example:</strong>
             * <p>hello</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The role of the conversation participant. Valid values:</p>
             * <ul>
             * <li><p>user: User</p>
             * </li>
             * <li><p>assistant: Assistant</p>
             * </li>
             * <li><p>system: System</p>
             * </li>
             * <li><p>function: Function</p>
             * </li>
             * <li><p>plugin: Plug-in</p>
             * </li>
             * <li><p>tool: Tool</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public VisionChatLlmHistory build() {
                return new VisionChatLlmHistory(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentTemplateConfig} extends {@link TeaModel}
     *
     * <p>AIAgentTemplateConfig</p>
     */
    public static class VisionChat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrHotWords")
        private java.util.List<String> asrHotWords;

        @com.aliyun.core.annotation.NameInMap("AsrLanguageId")
        private String asrLanguageId;

        @com.aliyun.core.annotation.NameInMap("AsrMaxSilence")
        private Integer asrMaxSilence;

        @com.aliyun.core.annotation.NameInMap("BailianAppParams")
        private String bailianAppParams;

        @com.aliyun.core.annotation.NameInMap("CharBreak")
        private Boolean charBreak;

        @com.aliyun.core.annotation.NameInMap("EnableIntelligentSegment")
        private Boolean enableIntelligentSegment;

        @com.aliyun.core.annotation.NameInMap("EnablePushToTalk")
        private Boolean enablePushToTalk;

        @com.aliyun.core.annotation.NameInMap("EnableVoiceInterrupt")
        private Boolean enableVoiceInterrupt;

        @com.aliyun.core.annotation.NameInMap("GracefulShutdown")
        private Boolean gracefulShutdown;

        @com.aliyun.core.annotation.NameInMap("Greeting")
        private String greeting;

        @com.aliyun.core.annotation.NameInMap("InterruptWords")
        private java.util.List<String> interruptWords;

        @com.aliyun.core.annotation.NameInMap("LlmHistory")
        private java.util.List<VisionChatLlmHistory> llmHistory;

        @com.aliyun.core.annotation.NameInMap("LlmHistoryLimit")
        private Integer llmHistoryLimit;

        @com.aliyun.core.annotation.NameInMap("LlmSystemPrompt")
        private String llmSystemPrompt;

        @com.aliyun.core.annotation.NameInMap("MaxIdleTime")
        private Integer maxIdleTime;

        @com.aliyun.core.annotation.NameInMap("UseVoiceprint")
        private Boolean useVoiceprint;

        @com.aliyun.core.annotation.NameInMap("UserOfflineTimeout")
        private Integer userOfflineTimeout;

        @com.aliyun.core.annotation.NameInMap("UserOnlineTimeout")
        private Integer userOnlineTimeout;

        @com.aliyun.core.annotation.NameInMap("VadLevel")
        private Integer vadLevel;

        @com.aliyun.core.annotation.NameInMap("VoiceId")
        private String voiceId;

        @com.aliyun.core.annotation.NameInMap("VoiceIdList")
        private java.util.List<String> voiceIdList;

        @com.aliyun.core.annotation.NameInMap("VoiceprintId")
        private String voiceprintId;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Long volume;

        @com.aliyun.core.annotation.NameInMap("WakeUpQuery")
        private String wakeUpQuery;

        @com.aliyun.core.annotation.NameInMap("WorkflowOverrideParams")
        private String workflowOverrideParams;

        private VisionChat(Builder builder) {
            this.asrHotWords = builder.asrHotWords;
            this.asrLanguageId = builder.asrLanguageId;
            this.asrMaxSilence = builder.asrMaxSilence;
            this.bailianAppParams = builder.bailianAppParams;
            this.charBreak = builder.charBreak;
            this.enableIntelligentSegment = builder.enableIntelligentSegment;
            this.enablePushToTalk = builder.enablePushToTalk;
            this.enableVoiceInterrupt = builder.enableVoiceInterrupt;
            this.gracefulShutdown = builder.gracefulShutdown;
            this.greeting = builder.greeting;
            this.interruptWords = builder.interruptWords;
            this.llmHistory = builder.llmHistory;
            this.llmHistoryLimit = builder.llmHistoryLimit;
            this.llmSystemPrompt = builder.llmSystemPrompt;
            this.maxIdleTime = builder.maxIdleTime;
            this.useVoiceprint = builder.useVoiceprint;
            this.userOfflineTimeout = builder.userOfflineTimeout;
            this.userOnlineTimeout = builder.userOnlineTimeout;
            this.vadLevel = builder.vadLevel;
            this.voiceId = builder.voiceId;
            this.voiceIdList = builder.voiceIdList;
            this.voiceprintId = builder.voiceprintId;
            this.volume = builder.volume;
            this.wakeUpQuery = builder.wakeUpQuery;
            this.workflowOverrideParams = builder.workflowOverrideParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VisionChat create() {
            return builder().build();
        }

        /**
         * @return asrHotWords
         */
        public java.util.List<String> getAsrHotWords() {
            return this.asrHotWords;
        }

        /**
         * @return asrLanguageId
         */
        public String getAsrLanguageId() {
            return this.asrLanguageId;
        }

        /**
         * @return asrMaxSilence
         */
        public Integer getAsrMaxSilence() {
            return this.asrMaxSilence;
        }

        /**
         * @return bailianAppParams
         */
        public String getBailianAppParams() {
            return this.bailianAppParams;
        }

        /**
         * @return charBreak
         */
        public Boolean getCharBreak() {
            return this.charBreak;
        }

        /**
         * @return enableIntelligentSegment
         */
        public Boolean getEnableIntelligentSegment() {
            return this.enableIntelligentSegment;
        }

        /**
         * @return enablePushToTalk
         */
        public Boolean getEnablePushToTalk() {
            return this.enablePushToTalk;
        }

        /**
         * @return enableVoiceInterrupt
         */
        public Boolean getEnableVoiceInterrupt() {
            return this.enableVoiceInterrupt;
        }

        /**
         * @return gracefulShutdown
         */
        public Boolean getGracefulShutdown() {
            return this.gracefulShutdown;
        }

        /**
         * @return greeting
         */
        public String getGreeting() {
            return this.greeting;
        }

        /**
         * @return interruptWords
         */
        public java.util.List<String> getInterruptWords() {
            return this.interruptWords;
        }

        /**
         * @return llmHistory
         */
        public java.util.List<VisionChatLlmHistory> getLlmHistory() {
            return this.llmHistory;
        }

        /**
         * @return llmHistoryLimit
         */
        public Integer getLlmHistoryLimit() {
            return this.llmHistoryLimit;
        }

        /**
         * @return llmSystemPrompt
         */
        public String getLlmSystemPrompt() {
            return this.llmSystemPrompt;
        }

        /**
         * @return maxIdleTime
         */
        public Integer getMaxIdleTime() {
            return this.maxIdleTime;
        }

        /**
         * @return useVoiceprint
         */
        public Boolean getUseVoiceprint() {
            return this.useVoiceprint;
        }

        /**
         * @return userOfflineTimeout
         */
        public Integer getUserOfflineTimeout() {
            return this.userOfflineTimeout;
        }

        /**
         * @return userOnlineTimeout
         */
        public Integer getUserOnlineTimeout() {
            return this.userOnlineTimeout;
        }

        /**
         * @return vadLevel
         */
        public Integer getVadLevel() {
            return this.vadLevel;
        }

        /**
         * @return voiceId
         */
        public String getVoiceId() {
            return this.voiceId;
        }

        /**
         * @return voiceIdList
         */
        public java.util.List<String> getVoiceIdList() {
            return this.voiceIdList;
        }

        /**
         * @return voiceprintId
         */
        public String getVoiceprintId() {
            return this.voiceprintId;
        }

        /**
         * @return volume
         */
        public Long getVolume() {
            return this.volume;
        }

        /**
         * @return wakeUpQuery
         */
        public String getWakeUpQuery() {
            return this.wakeUpQuery;
        }

        /**
         * @return workflowOverrideParams
         */
        public String getWorkflowOverrideParams() {
            return this.workflowOverrideParams;
        }

        public static final class Builder {
            private java.util.List<String> asrHotWords; 
            private String asrLanguageId; 
            private Integer asrMaxSilence; 
            private String bailianAppParams; 
            private Boolean charBreak; 
            private Boolean enableIntelligentSegment; 
            private Boolean enablePushToTalk; 
            private Boolean enableVoiceInterrupt; 
            private Boolean gracefulShutdown; 
            private String greeting; 
            private java.util.List<String> interruptWords; 
            private java.util.List<VisionChatLlmHistory> llmHistory; 
            private Integer llmHistoryLimit; 
            private String llmSystemPrompt; 
            private Integer maxIdleTime; 
            private Boolean useVoiceprint; 
            private Integer userOfflineTimeout; 
            private Integer userOnlineTimeout; 
            private Integer vadLevel; 
            private String voiceId; 
            private java.util.List<String> voiceIdList; 
            private String voiceprintId; 
            private Long volume; 
            private String wakeUpQuery; 
            private String workflowOverrideParams; 

            private Builder() {
            } 

            private Builder(VisionChat model) {
                this.asrHotWords = model.asrHotWords;
                this.asrLanguageId = model.asrLanguageId;
                this.asrMaxSilence = model.asrMaxSilence;
                this.bailianAppParams = model.bailianAppParams;
                this.charBreak = model.charBreak;
                this.enableIntelligentSegment = model.enableIntelligentSegment;
                this.enablePushToTalk = model.enablePushToTalk;
                this.enableVoiceInterrupt = model.enableVoiceInterrupt;
                this.gracefulShutdown = model.gracefulShutdown;
                this.greeting = model.greeting;
                this.interruptWords = model.interruptWords;
                this.llmHistory = model.llmHistory;
                this.llmHistoryLimit = model.llmHistoryLimit;
                this.llmSystemPrompt = model.llmSystemPrompt;
                this.maxIdleTime = model.maxIdleTime;
                this.useVoiceprint = model.useVoiceprint;
                this.userOfflineTimeout = model.userOfflineTimeout;
                this.userOnlineTimeout = model.userOnlineTimeout;
                this.vadLevel = model.vadLevel;
                this.voiceId = model.voiceId;
                this.voiceIdList = model.voiceIdList;
                this.voiceprintId = model.voiceprintId;
                this.volume = model.volume;
                this.wakeUpQuery = model.wakeUpQuery;
                this.workflowOverrideParams = model.workflowOverrideParams;
            } 

            /**
             * <p>The list of hotwords for ASR. The hotword list supports a maximum of 128 words.</p>
             */
            public Builder asrHotWords(java.util.List<String> asrHotWords) {
                this.asrHotWords = asrHotWords;
                return this;
            }

            /**
             * <p>The language ID for automatic speech recognition (ASR). Valid values:</p>
             * <ul>
             * <li>zh_mandarin: Chinese</li>
             * <li>en: English</li>
             * <li>zh_en: Chinese and English mixed</li>
             * <li>es: Spanish</li>
             * <li>jp: Japanese</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>zh_mandarin</p>
             */
            public Builder asrLanguageId(String asrLanguageId) {
                this.asrLanguageId = asrLanguageId;
                return this;
            }

            /**
             * <p>The threshold for speech segmentation detection. Silence exceeding this threshold is treated as a sentence break. Valid values: 200 to 1200. Unit: milliseconds. Default value: 400.</p>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder asrMaxSilence(Integer asrMaxSilence) {
                this.asrMaxSilence = asrMaxSilence;
                return this;
            }

            /**
             * <p>The parameters for Alibaba Cloud Model Studio Application Center. For the parameter format, refer to <a href="https://help.aliyun.com/document_detail/2858132.html">Alibaba Cloud Model Studio Application Center parameters</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder bailianAppParams(String bailianAppParams) {
                this.bailianAppParams = bailianAppParams;
                return this;
            }

            /**
             * CharBreak.
             */
            public Builder charBreak(Boolean charBreak) {
                this.charBreak = charBreak;
                return this;
            }

            /**
             * <p>Specifies whether to enable intelligent segmentation. After this feature is enabled, sentence breaks in user speech are intelligently merged into a single sentence. Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableIntelligentSegment(Boolean enableIntelligentSegment) {
                this.enableIntelligentSegment = enableIntelligentSegment;
                return this;
            }

            /**
             * <p>Specifies whether to enable the push-to-talk mode. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enablePushToTalk(Boolean enablePushToTalk) {
                this.enablePushToTalk = enablePushToTalk;
                return this;
            }

            /**
             * <p>Specifies whether to support voice interruption. Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableVoiceInterrupt(Boolean enableVoiceInterrupt) {
                this.enableVoiceInterrupt = enableVoiceInterrupt;
                return this;
            }

            /**
             * <p>Specifies whether to enable graceful shutdown. Default value: false.</p>
             * <p>Graceful shutdown: When the agent is stopped, it finishes broadcasting the current speech before stopping, with a maximum broadcast duration of 10 seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder gracefulShutdown(Boolean gracefulShutdown) {
                this.gracefulShutdown = gracefulShutdown;
                return this;
            }

            /**
             * <p>The greeting message, which takes effect when joining the session. If not specified, the greeting configured in the agent template is used. Maximum length: 128 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>Good morning, my friend!</p>
             */
            public Builder greeting(String greeting) {
                this.greeting = greeting;
                return this;
            }

            /**
             * <p>The list of specific words or phrases that trigger conversation interruption.</p>
             */
            public Builder interruptWords(java.util.List<String> interruptWords) {
                this.interruptWords = interruptWords;
                return this;
            }

            /**
             * <p>The maximum number of retained turns for the LLM or MLLM historical conversation context. Default value: 10.</p>
             */
            public Builder llmHistory(java.util.List<VisionChatLlmHistory> llmHistory) {
                this.llmHistory = llmHistory;
                return this;
            }

            /**
             * <p>The maximum number of retained turns for the LLM or MLLM historical conversation context. Default value: 10.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder llmHistoryLimit(Integer llmHistoryLimit) {
                this.llmHistoryLimit = llmHistoryLimit;
                return this;
            }

            /**
             * <p>The system prompt for the LLM after the call starts.</p>
             * 
             * <strong>example:</strong>
             * <p>You are a friendly and helpful assistant, focused on providing users with accurate information and advice.</p>
             */
            public Builder llmSystemPrompt(String llmSystemPrompt) {
                this.llmSystemPrompt = llmSystemPrompt;
                return this;
            }

            /**
             * <p>The maximum waiting time without interaction with the agent. The agent goes offline upon timeout. Unit: seconds. Default value: 600.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder maxIdleTime(Integer maxIdleTime) {
                this.maxIdleTime = maxIdleTime;
                return this;
            }

            /**
             * <p>Specifies whether to enable voiceprint recognition. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder useVoiceprint(Boolean useVoiceprint) {
                this.useVoiceprint = useVoiceprint;
                return this;
            }

            /**
             * <p>The timeout period for the agent to close the task after the user leaves the session. Unit: seconds. Default value: 5.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder userOfflineTimeout(Integer userOfflineTimeout) {
                this.userOfflineTimeout = userOfflineTimeout;
                return this;
            }

            /**
             * <p>The timeout period for the agent to close the task if the user does not join the session. Unit: seconds. Default value: 60.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder userOnlineTimeout(Integer userOnlineTimeout) {
                this.userOnlineTimeout = userOnlineTimeout;
                return this;
            }

            /**
             * <p>The interruption threshold parameter. Valid values: 0 to 11. Default value: 11.</p>
             * <ul>
             * <li>0: Disables the voice activity detection (VAD) feature.</li>
             * <li>1 to 10: A higher value indicates that it is more difficult to interrupt.</li>
             * <li>11: Significantly different from previous values, with lower pre-processing speech damage and stronger anti-interference.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder vadLevel(Integer vadLevel) {
                this.vadLevel = vadLevel;
                return this;
            }

            /**
             * <p>The ID of the voice, which takes effect in the next sentence. If not specified, the voice ID configured in the agent template is used. This parameter applies only to preset text-to-speech (TTS). Maximum length: 64 characters. For valid values, refer to <a href="https://help.aliyun.com/document_detail/449563.html">Intelligent speech effect examples</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>zhixiaoxia</p>
             */
            public Builder voiceId(String voiceId) {
                this.voiceId = voiceId;
                return this;
            }

            /**
             * <p>The list of available voices.</p>
             */
            public Builder voiceIdList(java.util.List<String> voiceIdList) {
                this.voiceIdList = voiceIdList;
                return this;
            }

            /**
             * <p>The unique identity ID for voiceprint recognition. Default value: none.</p>
             * 
             * <strong>example:</strong>
             * <p>uniqueId</p>
             */
            public Builder voiceprintId(String voiceprintId) {
                this.voiceprintId = voiceprintId;
                return this;
            }

            /**
             * <p>The volume of the agent\&quot;s speech.</p>
             * <p>If not specified: The adaptive volume mode recommended by Alibaba Cloud is used by default.</p>
             * <p>If specified: Valid values are 0 to 400. Output volume = Speech output volume in the workflow × volume / 100. Examples:</p>
             * <p>If volume is set to 0, the output volume is 0.</p>
             * <p>If volume is set to 100, the volume is the original volume.</p>
             * <p>If volume is set to 200, the volume is twice the original volume.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder volume(Long volume) {
                this.volume = volume;
                return this;
            }

            /**
             * <p>The user\&quot;s instruction before the call starts, which is used for the agent to respond immediately after the call starts.</p>
             * 
             * <strong>example:</strong>
             * <p>How’s the weather today?</p>
             */
            public Builder wakeUpQuery(String wakeUpQuery) {
                this.wakeUpQuery = wakeUpQuery;
                return this;
            }

            /**
             * <p>The override parameters for the workflow. Default value: none.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder workflowOverrideParams(String workflowOverrideParams) {
                this.workflowOverrideParams = workflowOverrideParams;
                return this;
            }

            public VisionChat build() {
                return new VisionChat(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentTemplateConfig} extends {@link TeaModel}
     *
     * <p>AIAgentTemplateConfig</p>
     */
    public static class VoiceChatLlmHistory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private VoiceChatLlmHistory(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoiceChatLlmHistory create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String content; 
            private String role; 

            private Builder() {
            } 

            private Builder(VoiceChatLlmHistory model) {
                this.content = model.content;
                this.role = model.role;
            } 

            /**
             * <p>The actual text of the conversation content, which records the specific expression or response of the role in the conversation.</p>
             * 
             * <strong>example:</strong>
             * <p>hello</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The role of the conversation participant. Valid values:</p>
             * <ul>
             * <li><p>user: user</p>
             * </li>
             * <li><p>assistant: assistant</p>
             * </li>
             * <li><p>system: system</p>
             * </li>
             * <li><p>function: function</p>
             * </li>
             * <li><p>plugin: plug-in</p>
             * </li>
             * <li><p>tool: tool</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public VoiceChatLlmHistory build() {
                return new VoiceChatLlmHistory(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentTemplateConfig} extends {@link TeaModel}
     *
     * <p>AIAgentTemplateConfig</p>
     */
    public static class VoiceChat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrHotWords")
        private java.util.List<String> asrHotWords;

        @com.aliyun.core.annotation.NameInMap("AsrLanguageId")
        private String asrLanguageId;

        @com.aliyun.core.annotation.NameInMap("AsrMaxSilence")
        private Integer asrMaxSilence;

        @com.aliyun.core.annotation.NameInMap("AvatarUrl")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("AvatarUrlType")
        private String avatarUrlType;

        @com.aliyun.core.annotation.NameInMap("BailianAppParams")
        private String bailianAppParams;

        @com.aliyun.core.annotation.NameInMap("CharBreak")
        private Boolean charBreak;

        @com.aliyun.core.annotation.NameInMap("EnableIntelligentSegment")
        private Boolean enableIntelligentSegment;

        @com.aliyun.core.annotation.NameInMap("EnablePushToTalk")
        private Boolean enablePushToTalk;

        @com.aliyun.core.annotation.NameInMap("EnableVoiceInterrupt")
        private Boolean enableVoiceInterrupt;

        @com.aliyun.core.annotation.NameInMap("GracefulShutdown")
        private Boolean gracefulShutdown;

        @com.aliyun.core.annotation.NameInMap("Greeting")
        private String greeting;

        @com.aliyun.core.annotation.NameInMap("InterruptWords")
        private java.util.List<String> interruptWords;

        @com.aliyun.core.annotation.NameInMap("LlmHistory")
        private java.util.List<VoiceChatLlmHistory> llmHistory;

        @com.aliyun.core.annotation.NameInMap("LlmHistoryLimit")
        private Integer llmHistoryLimit;

        @com.aliyun.core.annotation.NameInMap("LlmSystemPrompt")
        private String llmSystemPrompt;

        @com.aliyun.core.annotation.NameInMap("MaxIdleTime")
        private Integer maxIdleTime;

        @com.aliyun.core.annotation.NameInMap("UseVoiceprint")
        private Boolean useVoiceprint;

        @com.aliyun.core.annotation.NameInMap("UserOfflineTimeout")
        private Integer userOfflineTimeout;

        @com.aliyun.core.annotation.NameInMap("UserOnlineTimeout")
        private Integer userOnlineTimeout;

        @com.aliyun.core.annotation.NameInMap("VadLevel")
        private Integer vadLevel;

        @com.aliyun.core.annotation.NameInMap("VoiceId")
        private String voiceId;

        @com.aliyun.core.annotation.NameInMap("VoiceIdList")
        private java.util.List<String> voiceIdList;

        @com.aliyun.core.annotation.NameInMap("VoiceprintId")
        private String voiceprintId;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Long volume;

        @com.aliyun.core.annotation.NameInMap("WakeUpQuery")
        private String wakeUpQuery;

        @com.aliyun.core.annotation.NameInMap("WorkflowOverrideParams")
        private String workflowOverrideParams;

        private VoiceChat(Builder builder) {
            this.asrHotWords = builder.asrHotWords;
            this.asrLanguageId = builder.asrLanguageId;
            this.asrMaxSilence = builder.asrMaxSilence;
            this.avatarUrl = builder.avatarUrl;
            this.avatarUrlType = builder.avatarUrlType;
            this.bailianAppParams = builder.bailianAppParams;
            this.charBreak = builder.charBreak;
            this.enableIntelligentSegment = builder.enableIntelligentSegment;
            this.enablePushToTalk = builder.enablePushToTalk;
            this.enableVoiceInterrupt = builder.enableVoiceInterrupt;
            this.gracefulShutdown = builder.gracefulShutdown;
            this.greeting = builder.greeting;
            this.interruptWords = builder.interruptWords;
            this.llmHistory = builder.llmHistory;
            this.llmHistoryLimit = builder.llmHistoryLimit;
            this.llmSystemPrompt = builder.llmSystemPrompt;
            this.maxIdleTime = builder.maxIdleTime;
            this.useVoiceprint = builder.useVoiceprint;
            this.userOfflineTimeout = builder.userOfflineTimeout;
            this.userOnlineTimeout = builder.userOnlineTimeout;
            this.vadLevel = builder.vadLevel;
            this.voiceId = builder.voiceId;
            this.voiceIdList = builder.voiceIdList;
            this.voiceprintId = builder.voiceprintId;
            this.volume = builder.volume;
            this.wakeUpQuery = builder.wakeUpQuery;
            this.workflowOverrideParams = builder.workflowOverrideParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoiceChat create() {
            return builder().build();
        }

        /**
         * @return asrHotWords
         */
        public java.util.List<String> getAsrHotWords() {
            return this.asrHotWords;
        }

        /**
         * @return asrLanguageId
         */
        public String getAsrLanguageId() {
            return this.asrLanguageId;
        }

        /**
         * @return asrMaxSilence
         */
        public Integer getAsrMaxSilence() {
            return this.asrMaxSilence;
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return avatarUrlType
         */
        public String getAvatarUrlType() {
            return this.avatarUrlType;
        }

        /**
         * @return bailianAppParams
         */
        public String getBailianAppParams() {
            return this.bailianAppParams;
        }

        /**
         * @return charBreak
         */
        public Boolean getCharBreak() {
            return this.charBreak;
        }

        /**
         * @return enableIntelligentSegment
         */
        public Boolean getEnableIntelligentSegment() {
            return this.enableIntelligentSegment;
        }

        /**
         * @return enablePushToTalk
         */
        public Boolean getEnablePushToTalk() {
            return this.enablePushToTalk;
        }

        /**
         * @return enableVoiceInterrupt
         */
        public Boolean getEnableVoiceInterrupt() {
            return this.enableVoiceInterrupt;
        }

        /**
         * @return gracefulShutdown
         */
        public Boolean getGracefulShutdown() {
            return this.gracefulShutdown;
        }

        /**
         * @return greeting
         */
        public String getGreeting() {
            return this.greeting;
        }

        /**
         * @return interruptWords
         */
        public java.util.List<String> getInterruptWords() {
            return this.interruptWords;
        }

        /**
         * @return llmHistory
         */
        public java.util.List<VoiceChatLlmHistory> getLlmHistory() {
            return this.llmHistory;
        }

        /**
         * @return llmHistoryLimit
         */
        public Integer getLlmHistoryLimit() {
            return this.llmHistoryLimit;
        }

        /**
         * @return llmSystemPrompt
         */
        public String getLlmSystemPrompt() {
            return this.llmSystemPrompt;
        }

        /**
         * @return maxIdleTime
         */
        public Integer getMaxIdleTime() {
            return this.maxIdleTime;
        }

        /**
         * @return useVoiceprint
         */
        public Boolean getUseVoiceprint() {
            return this.useVoiceprint;
        }

        /**
         * @return userOfflineTimeout
         */
        public Integer getUserOfflineTimeout() {
            return this.userOfflineTimeout;
        }

        /**
         * @return userOnlineTimeout
         */
        public Integer getUserOnlineTimeout() {
            return this.userOnlineTimeout;
        }

        /**
         * @return vadLevel
         */
        public Integer getVadLevel() {
            return this.vadLevel;
        }

        /**
         * @return voiceId
         */
        public String getVoiceId() {
            return this.voiceId;
        }

        /**
         * @return voiceIdList
         */
        public java.util.List<String> getVoiceIdList() {
            return this.voiceIdList;
        }

        /**
         * @return voiceprintId
         */
        public String getVoiceprintId() {
            return this.voiceprintId;
        }

        /**
         * @return volume
         */
        public Long getVolume() {
            return this.volume;
        }

        /**
         * @return wakeUpQuery
         */
        public String getWakeUpQuery() {
            return this.wakeUpQuery;
        }

        /**
         * @return workflowOverrideParams
         */
        public String getWorkflowOverrideParams() {
            return this.workflowOverrideParams;
        }

        public static final class Builder {
            private java.util.List<String> asrHotWords; 
            private String asrLanguageId; 
            private Integer asrMaxSilence; 
            private String avatarUrl; 
            private String avatarUrlType; 
            private String bailianAppParams; 
            private Boolean charBreak; 
            private Boolean enableIntelligentSegment; 
            private Boolean enablePushToTalk; 
            private Boolean enableVoiceInterrupt; 
            private Boolean gracefulShutdown; 
            private String greeting; 
            private java.util.List<String> interruptWords; 
            private java.util.List<VoiceChatLlmHistory> llmHistory; 
            private Integer llmHistoryLimit; 
            private String llmSystemPrompt; 
            private Integer maxIdleTime; 
            private Boolean useVoiceprint; 
            private Integer userOfflineTimeout; 
            private Integer userOnlineTimeout; 
            private Integer vadLevel; 
            private String voiceId; 
            private java.util.List<String> voiceIdList; 
            private String voiceprintId; 
            private Long volume; 
            private String wakeUpQuery; 
            private String workflowOverrideParams; 

            private Builder() {
            } 

            private Builder(VoiceChat model) {
                this.asrHotWords = model.asrHotWords;
                this.asrLanguageId = model.asrLanguageId;
                this.asrMaxSilence = model.asrMaxSilence;
                this.avatarUrl = model.avatarUrl;
                this.avatarUrlType = model.avatarUrlType;
                this.bailianAppParams = model.bailianAppParams;
                this.charBreak = model.charBreak;
                this.enableIntelligentSegment = model.enableIntelligentSegment;
                this.enablePushToTalk = model.enablePushToTalk;
                this.enableVoiceInterrupt = model.enableVoiceInterrupt;
                this.gracefulShutdown = model.gracefulShutdown;
                this.greeting = model.greeting;
                this.interruptWords = model.interruptWords;
                this.llmHistory = model.llmHistory;
                this.llmHistoryLimit = model.llmHistoryLimit;
                this.llmSystemPrompt = model.llmSystemPrompt;
                this.maxIdleTime = model.maxIdleTime;
                this.useVoiceprint = model.useVoiceprint;
                this.userOfflineTimeout = model.userOfflineTimeout;
                this.userOnlineTimeout = model.userOnlineTimeout;
                this.vadLevel = model.vadLevel;
                this.voiceId = model.voiceId;
                this.voiceIdList = model.voiceIdList;
                this.voiceprintId = model.voiceprintId;
                this.volume = model.volume;
                this.wakeUpQuery = model.wakeUpQuery;
                this.workflowOverrideParams = model.workflowOverrideParams;
            } 

            /**
             * <p>The list of hotwords for ASR. The hotword list supports a maximum of 128 words.</p>
             */
            public Builder asrHotWords(java.util.List<String> asrHotWords) {
                this.asrHotWords = asrHotWords;
                return this;
            }

            /**
             * <p>The language ID for automatic speech recognition (ASR). Valid values:</p>
             * <ul>
             * <li>zh_mandarin: Chinese</li>
             * <li>en: English</li>
             * <li>zh_en: Chinese and English mixed</li>
             * <li>es: Spanish</li>
             * <li>jp: Japanese</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>zh_mandarin</p>
             */
            public Builder asrLanguageId(String asrLanguageId) {
                this.asrLanguageId = asrLanguageId;
                return this;
            }

            /**
             * <p>The threshold for speech segmentation detection. Silence exceeding this threshold is treated as a sentence break. Valid values: 200 to 1200. Unit: milliseconds. Default value: 400.</p>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder asrMaxSilence(Integer asrMaxSilence) {
                this.asrMaxSilence = asrMaxSilence;
                return this;
            }

            /**
             * <p>The URL of the agent avatar for voice calls. Default value: none.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com/a.jpg">http://example.com/a.jpg</a></p>
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * <p>The type of the agent avatar URL. Default value: none.</p>
             * 
             * <strong>example:</strong>
             * <p>USER</p>
             */
            public Builder avatarUrlType(String avatarUrlType) {
                this.avatarUrlType = avatarUrlType;
                return this;
            }

            /**
             * <p>The parameters for Alibaba Cloud Model Studio Application Center. For the parameter format, refer to <a href="https://help.aliyun.com/document_detail/2858132.html">Alibaba Cloud Model Studio Application Center parameters</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder bailianAppParams(String bailianAppParams) {
                this.bailianAppParams = bailianAppParams;
                return this;
            }

            /**
             * CharBreak.
             */
            public Builder charBreak(Boolean charBreak) {
                this.charBreak = charBreak;
                return this;
            }

            /**
             * <p>Specifies whether to enable intelligent segmentation. After this feature is enabled, sentence breaks in user speech are intelligently merged into a single sentence. Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableIntelligentSegment(Boolean enableIntelligentSegment) {
                this.enableIntelligentSegment = enableIntelligentSegment;
                return this;
            }

            /**
             * <p>Specifies whether to enable the push-to-talk mode. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enablePushToTalk(Boolean enablePushToTalk) {
                this.enablePushToTalk = enablePushToTalk;
                return this;
            }

            /**
             * <p>Specifies whether to support voice interruption. Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableVoiceInterrupt(Boolean enableVoiceInterrupt) {
                this.enableVoiceInterrupt = enableVoiceInterrupt;
                return this;
            }

            /**
             * <p>Specifies whether to enable graceful shutdown. Default value: false.</p>
             * <ul>
             * <li>Graceful shutdown: When the agent is stopped, it finishes broadcasting the current speech before stopping, with a maximum broadcast duration of 10 seconds.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder gracefulShutdown(Boolean gracefulShutdown) {
                this.gracefulShutdown = gracefulShutdown;
                return this;
            }

            /**
             * <p>The greeting message, which takes effect when joining the session. If not specified, the greeting configured in the agent template is used. Maximum length: 128 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>Good morning, my friend</p>
             */
            public Builder greeting(String greeting) {
                this.greeting = greeting;
                return this;
            }

            /**
             * <p>The list of specific words or phrases that trigger conversation interruption.</p>
             */
            public Builder interruptWords(java.util.List<String> interruptWords) {
                this.interruptWords = interruptWords;
                return this;
            }

            /**
             * <p>The historical conversation context of the LLM or MLLM.</p>
             */
            public Builder llmHistory(java.util.List<VoiceChatLlmHistory> llmHistory) {
                this.llmHistory = llmHistory;
                return this;
            }

            /**
             * <p>The maximum number of retained turns for the LLM or MLLM historical conversation context. Default value: 10.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder llmHistoryLimit(Integer llmHistoryLimit) {
                this.llmHistoryLimit = llmHistoryLimit;
                return this;
            }

            /**
             * <p>The system prompt for the LLM after the call starts.</p>
             * 
             * <strong>example:</strong>
             * <p>You are a friendly and helpful assistant, focused on providing users with accurate information and advice.</p>
             */
            public Builder llmSystemPrompt(String llmSystemPrompt) {
                this.llmSystemPrompt = llmSystemPrompt;
                return this;
            }

            /**
             * <p>The maximum waiting time without interaction with the agent. The agent goes offline upon timeout. Unit: seconds. Default value: 600.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder maxIdleTime(Integer maxIdleTime) {
                this.maxIdleTime = maxIdleTime;
                return this;
            }

            /**
             * <p>Specifies whether to enable voiceprint recognition. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder useVoiceprint(Boolean useVoiceprint) {
                this.useVoiceprint = useVoiceprint;
                return this;
            }

            /**
             * <p>The timeout period for the agent to close the task after the user leaves the session. Unit: seconds. Default value: 5.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder userOfflineTimeout(Integer userOfflineTimeout) {
                this.userOfflineTimeout = userOfflineTimeout;
                return this;
            }

            /**
             * <p>The timeout period for the agent to close the task if the user does not join the session. Unit: seconds. Default value: 60.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder userOnlineTimeout(Integer userOnlineTimeout) {
                this.userOnlineTimeout = userOnlineTimeout;
                return this;
            }

            /**
             * <p>The interruption threshold parameter. Valid values: 0 to 11. Default value: 11.</p>
             * <ul>
             * <li>0: Disables the voice activity detection (VAD) feature.</li>
             * <li>1 to 10: A higher value indicates that it is more difficult to interrupt.</li>
             * <li>11: Significantly different from previous values, with lower pre-processing speech damage and stronger anti-interference.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder vadLevel(Integer vadLevel) {
                this.vadLevel = vadLevel;
                return this;
            }

            /**
             * <p>The ID of the voice, which takes effect in the next sentence. If not specified, the voice ID configured in the agent template is used. This parameter applies only to preset text-to-speech (TTS). Maximum length: 64 characters. For valid values, refer to <a href="https://help.aliyun.com/document_detail/449563.html">Intelligent speech effect examples</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>zhixiaoxia</p>
             */
            public Builder voiceId(String voiceId) {
                this.voiceId = voiceId;
                return this;
            }

            /**
             * <p>The list of available voices.</p>
             */
            public Builder voiceIdList(java.util.List<String> voiceIdList) {
                this.voiceIdList = voiceIdList;
                return this;
            }

            /**
             * <p>The unique identity ID for voiceprint recognition. Default value: none.</p>
             * 
             * <strong>example:</strong>
             * <p>uniqueId</p>
             */
            public Builder voiceprintId(String voiceprintId) {
                this.voiceprintId = voiceprintId;
                return this;
            }

            /**
             * <p>The volume of the agent\&quot;s speech.</p>
             * <ul>
             * <li><p>If not specified: The adaptive volume mode recommended by Alibaba Cloud is used by default.</p>
             * </li>
             * <li><p>If specified: Valid values are 0 to 400. Output volume = Speech output volume in the workflow × volume / 100. Examples:</p>
             * </li>
             * </ul>
             * <ol>
             * <li><p>If volume is set to 0, the output volume is 0.</p>
             * </li>
             * <li><p>If volume is set to 100, the volume is the original volume.</p>
             * </li>
             * <li><p>If volume is set to 200, the volume is twice the original volume.</p>
             * </li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder volume(Long volume) {
                this.volume = volume;
                return this;
            }

            /**
             * <p>The user\&quot;s instruction before the call starts, which is used for the agent to respond immediately after the call starts.</p>
             * 
             * <strong>example:</strong>
             * <p>How’s the weather today?</p>
             */
            public Builder wakeUpQuery(String wakeUpQuery) {
                this.wakeUpQuery = wakeUpQuery;
                return this;
            }

            /**
             * <p>The override parameters for the workflow. Default value: none.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder workflowOverrideParams(String workflowOverrideParams) {
                this.workflowOverrideParams = workflowOverrideParams;
                return this;
            }

            public VoiceChat build() {
                return new VoiceChat(this);
            } 

        } 

    }
}
