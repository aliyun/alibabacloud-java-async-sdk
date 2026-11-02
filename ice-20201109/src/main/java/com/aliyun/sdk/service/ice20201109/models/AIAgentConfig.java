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
 * {@link AIAgentConfig} extends {@link TeaModel}
 *
 * <p>AIAgentConfig</p>
 */
public class AIAgentConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AmbientSoundConfig")
    private AmbientSoundConfig ambientSoundConfig;

    @com.aliyun.core.annotation.NameInMap("AsrConfig")
    private AsrConfig asrConfig;

    @com.aliyun.core.annotation.NameInMap("AutoSpeechConfig")
    private AutoSpeechConfig autoSpeechConfig;

    @com.aliyun.core.annotation.NameInMap("AvatarConfig")
    private AvatarConfig avatarConfig;

    @com.aliyun.core.annotation.NameInMap("AvatarUrl")
    private String avatarUrl;

    @com.aliyun.core.annotation.NameInMap("AvatarUrlType")
    private String avatarUrlType;

    @com.aliyun.core.annotation.NameInMap("BackChannelingConfig")
    @Deprecated
    private java.util.List<BackChannelingConfig> backChannelingConfig;

    @com.aliyun.core.annotation.NameInMap("BackChannelingConfigs")
    private java.util.List<BackChannelingConfigs> backChannelingConfigs;

    @com.aliyun.core.annotation.NameInMap("EnableIntelligentSegment")
    private Boolean enableIntelligentSegment;

    @com.aliyun.core.annotation.NameInMap("EnablePushToTalk")
    private Boolean enablePushToTalk;

    @com.aliyun.core.annotation.NameInMap("ExperimentalConfig")
    private String experimentalConfig;

    @com.aliyun.core.annotation.NameInMap("GracefulShutdown")
    private Boolean gracefulShutdown;

    @com.aliyun.core.annotation.NameInMap("Greeting")
    private String greeting;

    @com.aliyun.core.annotation.NameInMap("InterruptConfig")
    private InterruptConfig interruptConfig;

    @com.aliyun.core.annotation.NameInMap("LlmConfig")
    private LlmConfig llmConfig;

    @com.aliyun.core.annotation.NameInMap("MaxIdleTime")
    private Integer maxIdleTime;

    @com.aliyun.core.annotation.NameInMap("TransferCallConfig")
    private TransferCallConfig transferCallConfig;

    @com.aliyun.core.annotation.NameInMap("TtsConfig")
    private TtsConfig ttsConfig;

    @com.aliyun.core.annotation.NameInMap("TurnDetectionConfig")
    private TurnDetectionConfig turnDetectionConfig;

    @com.aliyun.core.annotation.NameInMap("UserOfflineTimeout")
    private Integer userOfflineTimeout;

    @com.aliyun.core.annotation.NameInMap("UserOnlineTimeout")
    private Integer userOnlineTimeout;

    @com.aliyun.core.annotation.NameInMap("VcrConfig")
    private VcrConfig vcrConfig;

    @com.aliyun.core.annotation.NameInMap("VoiceprintConfig")
    private VoiceprintConfig voiceprintConfig;

    @com.aliyun.core.annotation.NameInMap("Volume")
    private Long volume;

    @com.aliyun.core.annotation.NameInMap("WakeUpQuery")
    private String wakeUpQuery;

    @com.aliyun.core.annotation.NameInMap("WorkflowOverrideParams")
    private String workflowOverrideParams;

    private AIAgentConfig(Builder builder) {
        this.ambientSoundConfig = builder.ambientSoundConfig;
        this.asrConfig = builder.asrConfig;
        this.autoSpeechConfig = builder.autoSpeechConfig;
        this.avatarConfig = builder.avatarConfig;
        this.avatarUrl = builder.avatarUrl;
        this.avatarUrlType = builder.avatarUrlType;
        this.backChannelingConfig = builder.backChannelingConfig;
        this.backChannelingConfigs = builder.backChannelingConfigs;
        this.enableIntelligentSegment = builder.enableIntelligentSegment;
        this.enablePushToTalk = builder.enablePushToTalk;
        this.experimentalConfig = builder.experimentalConfig;
        this.gracefulShutdown = builder.gracefulShutdown;
        this.greeting = builder.greeting;
        this.interruptConfig = builder.interruptConfig;
        this.llmConfig = builder.llmConfig;
        this.maxIdleTime = builder.maxIdleTime;
        this.transferCallConfig = builder.transferCallConfig;
        this.ttsConfig = builder.ttsConfig;
        this.turnDetectionConfig = builder.turnDetectionConfig;
        this.userOfflineTimeout = builder.userOfflineTimeout;
        this.userOnlineTimeout = builder.userOnlineTimeout;
        this.vcrConfig = builder.vcrConfig;
        this.voiceprintConfig = builder.voiceprintConfig;
        this.volume = builder.volume;
        this.wakeUpQuery = builder.wakeUpQuery;
        this.workflowOverrideParams = builder.workflowOverrideParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AIAgentConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ambientSoundConfig
     */
    public AmbientSoundConfig getAmbientSoundConfig() {
        return this.ambientSoundConfig;
    }

    /**
     * @return asrConfig
     */
    public AsrConfig getAsrConfig() {
        return this.asrConfig;
    }

    /**
     * @return autoSpeechConfig
     */
    public AutoSpeechConfig getAutoSpeechConfig() {
        return this.autoSpeechConfig;
    }

    /**
     * @return avatarConfig
     */
    public AvatarConfig getAvatarConfig() {
        return this.avatarConfig;
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
     * @return backChannelingConfig
     */
    public java.util.List<BackChannelingConfig> getBackChannelingConfig() {
        return this.backChannelingConfig;
    }

    /**
     * @return backChannelingConfigs
     */
    public java.util.List<BackChannelingConfigs> getBackChannelingConfigs() {
        return this.backChannelingConfigs;
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
     * @return experimentalConfig
     */
    public String getExperimentalConfig() {
        return this.experimentalConfig;
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
     * @return interruptConfig
     */
    public InterruptConfig getInterruptConfig() {
        return this.interruptConfig;
    }

    /**
     * @return llmConfig
     */
    public LlmConfig getLlmConfig() {
        return this.llmConfig;
    }

    /**
     * @return maxIdleTime
     */
    public Integer getMaxIdleTime() {
        return this.maxIdleTime;
    }

    /**
     * @return transferCallConfig
     */
    public TransferCallConfig getTransferCallConfig() {
        return this.transferCallConfig;
    }

    /**
     * @return ttsConfig
     */
    public TtsConfig getTtsConfig() {
        return this.ttsConfig;
    }

    /**
     * @return turnDetectionConfig
     */
    public TurnDetectionConfig getTurnDetectionConfig() {
        return this.turnDetectionConfig;
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
     * @return vcrConfig
     */
    public VcrConfig getVcrConfig() {
        return this.vcrConfig;
    }

    /**
     * @return voiceprintConfig
     */
    public VoiceprintConfig getVoiceprintConfig() {
        return this.voiceprintConfig;
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
        private AmbientSoundConfig ambientSoundConfig; 
        private AsrConfig asrConfig; 
        private AutoSpeechConfig autoSpeechConfig; 
        private AvatarConfig avatarConfig; 
        private String avatarUrl; 
        private String avatarUrlType; 
        private java.util.List<BackChannelingConfig> backChannelingConfig; 
        private java.util.List<BackChannelingConfigs> backChannelingConfigs; 
        private Boolean enableIntelligentSegment; 
        private Boolean enablePushToTalk; 
        private String experimentalConfig; 
        private Boolean gracefulShutdown; 
        private String greeting; 
        private InterruptConfig interruptConfig; 
        private LlmConfig llmConfig; 
        private Integer maxIdleTime; 
        private TransferCallConfig transferCallConfig; 
        private TtsConfig ttsConfig; 
        private TurnDetectionConfig turnDetectionConfig; 
        private Integer userOfflineTimeout; 
        private Integer userOnlineTimeout; 
        private VcrConfig vcrConfig; 
        private VoiceprintConfig voiceprintConfig; 
        private Long volume; 
        private String wakeUpQuery; 
        private String workflowOverrideParams; 

        private Builder() {
        } 

        private Builder(AIAgentConfig model) {
            this.ambientSoundConfig = model.ambientSoundConfig;
            this.asrConfig = model.asrConfig;
            this.autoSpeechConfig = model.autoSpeechConfig;
            this.avatarConfig = model.avatarConfig;
            this.avatarUrl = model.avatarUrl;
            this.avatarUrlType = model.avatarUrlType;
            this.backChannelingConfig = model.backChannelingConfig;
            this.backChannelingConfigs = model.backChannelingConfigs;
            this.enableIntelligentSegment = model.enableIntelligentSegment;
            this.enablePushToTalk = model.enablePushToTalk;
            this.experimentalConfig = model.experimentalConfig;
            this.gracefulShutdown = model.gracefulShutdown;
            this.greeting = model.greeting;
            this.interruptConfig = model.interruptConfig;
            this.llmConfig = model.llmConfig;
            this.maxIdleTime = model.maxIdleTime;
            this.transferCallConfig = model.transferCallConfig;
            this.ttsConfig = model.ttsConfig;
            this.turnDetectionConfig = model.turnDetectionConfig;
            this.userOfflineTimeout = model.userOfflineTimeout;
            this.userOnlineTimeout = model.userOnlineTimeout;
            this.vcrConfig = model.vcrConfig;
            this.voiceprintConfig = model.voiceprintConfig;
            this.volume = model.volume;
            this.wakeUpQuery = model.wakeUpQuery;
            this.workflowOverrideParams = model.workflowOverrideParams;
        } 

        /**
         * <p>The call ambient sound configuration.</p>
         */
        public Builder ambientSoundConfig(AmbientSoundConfig ambientSoundConfig) {
            this.ambientSoundConfig = ambientSoundConfig;
            return this;
        }

        /**
         * <p>The speech recognition configuration.</p>
         */
        public Builder asrConfig(AsrConfig asrConfig) {
            this.asrConfig = asrConfig;
            return this;
        }

        /**
         * <p>The automatic speech configuration module for the agent, which includes prompts for LLM response delays and inquiries during prolonged user silence.</p>
         */
        public Builder autoSpeechConfig(AutoSpeechConfig autoSpeechConfig) {
            this.autoSpeechConfig = autoSpeechConfig;
            return this;
        }

        /**
         * <p>The digital human configuration. This configuration takes effect only when the workflow includes a digital human node.</p>
         */
        public Builder avatarConfig(AvatarConfig avatarConfig) {
            this.avatarConfig = avatarConfig;
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
         * <p>The URL type of the agent avatar. Default value: none.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder avatarUrlType(String avatarUrlType) {
            this.avatarUrlType = avatarUrlType;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> Use BackChannelingConfigs instead.</p>
         */
        public Builder backChannelingConfig(java.util.List<BackChannelingConfig> backChannelingConfig) {
            this.backChannelingConfig = backChannelingConfig;
            return this;
        }

        /**
         * <p>The backchanneling feature configuration module. After this feature is enabled, the system randomly broadcasts short backchanneling phrases at specific trigger stages.</p>
         */
        public Builder backChannelingConfigs(java.util.List<BackChannelingConfigs> backChannelingConfigs) {
            this.backChannelingConfigs = backChannelingConfigs;
            return this;
        }

        /**
         * <p>Specifies whether to enable intelligent segmentation. After intelligent segmentation is enabled, segmented speech from the user is intelligently merged into a single sentence. Default value: true.</p>
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
         * <p>The experimental feature parameters. Contact technical support if you have any requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder experimentalConfig(String experimentalConfig) {
            this.experimentalConfig = experimentalConfig;
            return this;
        }

        /**
         * <p>Specifies whether to enable graceful shutdown. Default value: false.
         * Graceful shutdown: When the agent is stopped, it finishes broadcasting the current speech before shutting down. The maximum broadcast duration is 10 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder gracefulShutdown(Boolean gracefulShutdown) {
            this.gracefulShutdown = gracefulShutdown;
            return this;
        }

        /**
         * <p>The greeting. Modifications take effect the next time the user joins the call. Default value: none.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        public Builder greeting(String greeting) {
            this.greeting = greeting;
            return this;
        }

        /**
         * <p>The speech interruption policy configuration.</p>
         */
        public Builder interruptConfig(InterruptConfig interruptConfig) {
            this.interruptConfig = interruptConfig;
            return this;
        }

        /**
         * <p>The large language model (LLM) configuration.</p>
         */
        public Builder llmConfig(LlmConfig llmConfig) {
            this.llmConfig = llmConfig;
            return this;
        }

        /**
         * <p>The maximum wait time without interaction with the agent. If this time is exceeded, the agent goes offline. Unit: seconds. Default value: 600.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder maxIdleTime(Integer maxIdleTime) {
            this.maxIdleTime = maxIdleTime;
            return this;
        }

        /**
         * <p>The configuration for Real-Time Communication (RTC) call transfer. When you call ForwardAIAgentCall to transfer an RTC call (CallMode=0) to a regular phone, use this configuration to specify the line and the caller number.
         * Transfer is available only if CallerNumber is configured. If it is not configured, a 400 error is returned when you call the transfer API operation.
         * This configuration is read only once when the instance starts. Modifications during a call do not take effect.
         * This configuration does not apply to inbound and outbound call transfers. Use InboundCallConfig and OutboundCallConfig instead.</p>
         */
        public Builder transferCallConfig(TransferCallConfig transferCallConfig) {
            this.transferCallConfig = transferCallConfig;
            return this;
        }

        /**
         * <p>The speech synthesis configuration.</p>
         */
        public Builder ttsConfig(TtsConfig ttsConfig) {
            this.ttsConfig = ttsConfig;
            return this;
        }

        /**
         * <p>The turn detection configuration.</p>
         */
        public Builder turnDetectionConfig(TurnDetectionConfig turnDetectionConfig) {
            this.turnDetectionConfig = turnDetectionConfig;
            return this;
        }

        /**
         * <p>The timeout period for the agent to close the task after the user leaves the meeting. Unit: seconds. Default value: 5.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder userOfflineTimeout(Integer userOfflineTimeout) {
            this.userOfflineTimeout = userOfflineTimeout;
            return this;
        }

        /**
         * <p>The timeout period for the agent to close the task if the user does not join the meeting. Unit: seconds. Default value: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder userOnlineTimeout(Integer userOnlineTimeout) {
            this.userOnlineTimeout = userOnlineTimeout;
            return this;
        }

        /**
         * <p>The configuration for the video content recognition feature. This feature supports calling back the content recognized by the algorithm in the video to the client.</p>
         */
        public Builder vcrConfig(VcrConfig vcrConfig) {
            this.vcrConfig = vcrConfig;
            return this;
        }

        /**
         * <p>The voiceprint configuration.</p>
         */
        public Builder voiceprintConfig(VoiceprintConfig voiceprintConfig) {
            this.voiceprintConfig = voiceprintConfig;
            return this;
        }

        /**
         * <p>The volume of the agent\&quot;s voice.</p>
         * <ul>
         * <li>If you do not specify this parameter, the adaptive volume mode recommended by Alibaba Cloud is used by default.</li>
         * <li>If you specify this parameter, the valid values range from 0 to 400. Output volume = Voice output volume in the workflow × volume / 100. Examples:</li>
         * </ul>
         * <ol>
         * <li>If volume is set to 0, the output volume is 0.</li>
         * <li>If volume is set to 100, the output volume is the original volume.</li>
         * <li>If volume is set to 200, the output volume is twice the original volume.</li>
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
         * <p>The user\&quot;s instruction before the call starts. The agent responds to this sentence immediately after the call starts.</p>
         * 
         * <strong>example:</strong>
         * <p>How’s the weather today?</p>
         */
        public Builder wakeUpQuery(String wakeUpQuery) {
            this.wakeUpQuery = wakeUpQuery;
            return this;
        }

        /**
         * <p>The workflow override parameters. Default value: none.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder workflowOverrideParams(String workflowOverrideParams) {
            this.workflowOverrideParams = workflowOverrideParams;
            return this;
        }

        public AIAgentConfig build() {
            return new AIAgentConfig(this);
        } 

    } 

    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class AmbientSoundConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Integer volume;

        private AmbientSoundConfig(Builder builder) {
            this.resourceId = builder.resourceId;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AmbientSoundConfig create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return volume
         */
        public Integer getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private String resourceId; 
            private Integer volume; 

            private Builder() {
            } 

            private Builder(AmbientSoundConfig model) {
                this.resourceId = model.resourceId;
                this.volume = model.volume;
            } 

            /**
             * <p>The ID of the call ambient sound. You can obtain the ID from the advanced settings of the agent configuration in the console.</p>
             * 
             * <strong>example:</strong>
             * <p>f67901c595834************</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The volume of the call background sound. Valid values: 0 to 100. A value of 0 indicates that the background sound is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder volume(Integer volume) {
                this.volume = volume;
                return this;
            }

            public AmbientSoundConfig build() {
                return new AmbientSoundConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class AsrConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrContext")
        private String asrContext;

        @com.aliyun.core.annotation.NameInMap("AsrHotWords")
        private java.util.List<String> asrHotWords;

        @com.aliyun.core.annotation.NameInMap("AsrLanguageId")
        private String asrLanguageId;

        @com.aliyun.core.annotation.NameInMap("AsrMaxSilence")
        private Integer asrMaxSilence;

        @com.aliyun.core.annotation.NameInMap("AsrVocabulary")
        private String asrVocabulary;

        @com.aliyun.core.annotation.NameInMap("CustomParams")
        private String customParams;

        @com.aliyun.core.annotation.NameInMap("VadDuration")
        private Integer vadDuration;

        @com.aliyun.core.annotation.NameInMap("VadLevel")
        private Integer vadLevel;

        private AsrConfig(Builder builder) {
            this.asrContext = builder.asrContext;
            this.asrHotWords = builder.asrHotWords;
            this.asrLanguageId = builder.asrLanguageId;
            this.asrMaxSilence = builder.asrMaxSilence;
            this.asrVocabulary = builder.asrVocabulary;
            this.customParams = builder.customParams;
            this.vadDuration = builder.vadDuration;
            this.vadLevel = builder.vadLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AsrConfig create() {
            return builder().build();
        }

        /**
         * @return asrContext
         */
        public String getAsrContext() {
            return this.asrContext;
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
         * @return asrVocabulary
         */
        public String getAsrVocabulary() {
            return this.asrVocabulary;
        }

        /**
         * @return customParams
         */
        public String getCustomParams() {
            return this.customParams;
        }

        /**
         * @return vadDuration
         */
        public Integer getVadDuration() {
            return this.vadDuration;
        }

        /**
         * @return vadLevel
         */
        public Integer getVadLevel() {
            return this.vadLevel;
        }

        public static final class Builder {
            private String asrContext; 
            private java.util.List<String> asrHotWords; 
            private String asrLanguageId; 
            private Integer asrMaxSilence; 
            private String asrVocabulary; 
            private String customParams; 
            private Integer vadDuration; 
            private Integer vadLevel; 

            private Builder() {
            } 

            private Builder(AsrConfig model) {
                this.asrContext = model.asrContext;
                this.asrHotWords = model.asrHotWords;
                this.asrLanguageId = model.asrLanguageId;
                this.asrMaxSilence = model.asrMaxSilence;
                this.asrVocabulary = model.asrVocabulary;
                this.customParams = model.customParams;
                this.vadDuration = model.vadDuration;
                this.vadLevel = model.vadLevel;
            } 

            /**
             * <p>The ASR context enhancement.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;role&quot;:&quot;user&quot;,&quot;content&quot;:[{&quot;type&quot;:&quot;input_text&quot;,&quot;text&quot;:&quot;Alibaba Cloud, Qwen, Qwen-Audio&quot;}]},{&quot;role&quot;:&quot;assistant&quot;,&quot;content&quot;:[{&quot;type&quot;:&quot;text&quot;,&quot;text&quot;:&quot;Okay, I will incorporate these terms into our conversation.&quot;}]}]</p>
             */
            public Builder asrContext(String asrContext) {
                this.asrContext = asrContext;
                return this;
            }

            /**
             * <p>The ASR hotword list. The list supports a maximum of 128 hotwords.</p>
             */
            public Builder asrHotWords(java.util.List<String> asrHotWords) {
                this.asrHotWords = asrHotWords;
                return this;
            }

            /**
             * <p>The ASR language ID. Valid values:</p>
             * <ul>
             * <li>zh_mandarin: Chinese.</li>
             * <li>en: English.</li>
             * <li>zh_en: Mixed Chinese and English.</li>
             * <li>es: Spanish.</li>
             * <li>jp: Japanese.</li>
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
             * <p>The threshold for speech segmentation detection. If the silence duration exceeds this threshold, the speech is considered segmented. Valid values: 200 to 1200. Unit: milliseconds. Default value: 400.</p>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder asrMaxSilence(Integer asrMaxSilence) {
                this.asrMaxSilence = asrMaxSilence;
                return this;
            }

            /**
             * <p>The instance-level real-time hotwords and their weights for ASR.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Qwen&quot;:4,&quot;Qwen-Audio&quot;:5,&quot;Alibaba Cloud Speech Lab&quot;:50}</p>
             */
            public Builder asrVocabulary(String asrVocabulary) {
                this.asrVocabulary = asrVocabulary;
                return this;
            }

            /**
             * <p>The pass-through parameters for custom ASR integration.</p>
             * 
             * <strong>example:</strong>
             * <p>mode=fast&amp;sample=16000&amp;format=wav</p>
             */
            public Builder customParams(String customParams) {
                this.customParams = customParams;
                return this;
            }

            /**
             * <p>The minimum duration threshold for voice activity detection (VAD), which is used to control the sensitivity of interruptions. A value of 0 indicates that this feature is disabled. Valid values: 200 to 2000. Unit: milliseconds. Common values range from 200 to 500, which correspond to 1 to 4 words. Default value: null. If this parameter is left empty, this feature does not take effect.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder vadDuration(Integer vadDuration) {
                this.vadDuration = vadDuration;
                return this;
            }

            /**
             * <p>The interruption threshold parameter. Valid values: 0 to 11. Default value: 11.</p>
             * <ul>
             * <li>0: Disables the VAD feature.</li>
             * <li>1 to 10: A larger value indicates that it is more difficult to trigger an interruption.</li>
             * <li>11: Significantly different from previous values. It causes less damage to the pre-processed conversation audio and provides stronger anti-interference capability.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder vadLevel(Integer vadLevel) {
                this.vadLevel = vadLevel;
                return this;
            }

            public AsrConfig build() {
                return new AsrConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Probability")
        private Double probability;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private Messages(Builder builder) {
            this.probability = builder.probability;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return probability
         */
        public Double getProbability() {
            return this.probability;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Double probability; 
            private String text; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.probability = model.probability;
                this.text = model.text;
            } 

            /**
             * <p>The selection probability of the prompt. Valid values: 0 to 1, which correspond to 0% to 100%.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder probability(Double probability) {
                this.probability = probability;
                return this;
            }

            /**
             * <p>The text of the inquiry prompt. Maximum length: 100 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>Just a moment</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class LlmPending extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Messages")
        private java.util.List<Messages> messages;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("WaitTime")
        private Integer waitTime;

        private LlmPending(Builder builder) {
            this.messages = builder.messages;
            this.mode = builder.mode;
            this.waitTime = builder.waitTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LlmPending create() {
            return builder().build();
        }

        /**
         * @return messages
         */
        public java.util.List<Messages> getMessages() {
            return this.messages;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return waitTime
         */
        public Integer getWaitTime() {
            return this.waitTime;
        }

        public static final class Builder {
            private java.util.List<Messages> messages; 
            private String mode; 
            private Integer waitTime; 

            private Builder() {
            } 

            private Builder(LlmPending model) {
                this.messages = model.messages;
                this.mode = model.mode;
                this.waitTime = model.waitTime;
            } 

            /**
             * <p>The collection of inquiry prompts. A maximum of 10 prompts are supported. Each prompt can be up to 100 characters in length. The sum of probabilities must be 100%.</p>
             */
            public Builder messages(java.util.List<Messages> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * <p>The mode for selecting the soothing prompt from LlmPending.Messages to broadcast while waiting for the agent to reply. Valid values:</p>
             * <ul>
             * <li>ai_select: The AI selects the most appropriate prompt from Messages based on the current conversation. This mode does not check whether the sum of Probability values is 1, but WaitTime cannot be less than 800 milliseconds. This is the default value.</li>
             * <li>probability: A prompt is randomly selected based on the Probability weight of each prompt. The sum of all Probability values must be exactly 1.0.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ai_select</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The threshold for the waiting time for a response from the large language model (LLM). If the waiting time exceeds this threshold, a broadcast prompt is triggered. This parameter is required. Valid values: 500 to 10000. Unit: milliseconds. Set this parameter based on the actual usage of the LLM.</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder waitTime(Integer waitTime) {
                this.waitTime = waitTime;
                return this;
            }

            public LlmPending build() {
                return new LlmPending(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class UserIdleMessages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Probability")
        private Double probability;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private UserIdleMessages(Builder builder) {
            this.probability = builder.probability;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserIdleMessages create() {
            return builder().build();
        }

        /**
         * @return probability
         */
        public Double getProbability() {
            return this.probability;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Double probability; 
            private String text; 

            private Builder() {
            } 

            private Builder(UserIdleMessages model) {
                this.probability = model.probability;
                this.text = model.text;
            } 

            /**
             * <p>The selection probability of the prompt. Valid values: 0 to 1, which correspond to 0% to 100%.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder probability(Double probability) {
                this.probability = probability;
                return this;
            }

            /**
             * <p>The text of the inquiry prompt. Maximum length: 100 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>Are you still there?</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public UserIdleMessages build() {
                return new UserIdleMessages(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class UserIdle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HangupEndWord")
        private String hangupEndWord;

        @com.aliyun.core.annotation.NameInMap("MaxRepeats")
        private Integer maxRepeats;

        @com.aliyun.core.annotation.NameInMap("Messages")
        private java.util.List<UserIdleMessages> messages;

        @com.aliyun.core.annotation.NameInMap("WaitTime")
        private Integer waitTime;

        private UserIdle(Builder builder) {
            this.hangupEndWord = builder.hangupEndWord;
            this.maxRepeats = builder.maxRepeats;
            this.messages = builder.messages;
            this.waitTime = builder.waitTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserIdle create() {
            return builder().build();
        }

        /**
         * @return hangupEndWord
         */
        public String getHangupEndWord() {
            return this.hangupEndWord;
        }

        /**
         * @return maxRepeats
         */
        public Integer getMaxRepeats() {
            return this.maxRepeats;
        }

        /**
         * @return messages
         */
        public java.util.List<UserIdleMessages> getMessages() {
            return this.messages;
        }

        /**
         * @return waitTime
         */
        public Integer getWaitTime() {
            return this.waitTime;
        }

        public static final class Builder {
            private String hangupEndWord; 
            private Integer maxRepeats; 
            private java.util.List<UserIdleMessages> messages; 
            private Integer waitTime; 

            private Builder() {
            } 

            private Builder(UserIdle model) {
                this.hangupEndWord = model.hangupEndWord;
                this.maxRepeats = model.maxRepeats;
                this.messages = model.messages;
                this.waitTime = model.waitTime;
            } 

            /**
             * <p>The hang-up closing remark. It is broadcast before the call is hung up after a prolonged period of user unresponsiveness. Maximum length: 200 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>I\&quot;m hanging up, bye</p>
             */
            public Builder hangupEndWord(String hangupEndWord) {
                this.hangupEndWord = hangupEndWord;
                return this;
            }

            /**
             * <p>The maximum number of inquiries. Valid values: 0 to 10. This parameter is required. If the number of inquiries exceeds this value, no more inquiries are triggered and the call is directly closed.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder maxRepeats(Integer maxRepeats) {
                this.maxRepeats = maxRepeats;
                return this;
            }

            /**
             * <p>The collection of inquiry prompts. A maximum of 10 prompts are supported. Each prompt can be up to 100 characters in length. The sum of probabilities must be 100%.</p>
             */
            public Builder messages(java.util.List<UserIdleMessages> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * <p>The silence duration threshold. This parameter is required. If the silence duration exceeds this threshold, an inquiry is triggered. Valid values: 5000 to 600000. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
             */
            public Builder waitTime(Integer waitTime) {
                this.waitTime = waitTime;
                return this;
            }

            public UserIdle build() {
                return new UserIdle(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class AutoSpeechConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LlmPending")
        private LlmPending llmPending;

        @com.aliyun.core.annotation.NameInMap("UserIdle")
        private UserIdle userIdle;

        private AutoSpeechConfig(Builder builder) {
            this.llmPending = builder.llmPending;
            this.userIdle = builder.userIdle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoSpeechConfig create() {
            return builder().build();
        }

        /**
         * @return llmPending
         */
        public LlmPending getLlmPending() {
            return this.llmPending;
        }

        /**
         * @return userIdle
         */
        public UserIdle getUserIdle() {
            return this.userIdle;
        }

        public static final class Builder {
            private LlmPending llmPending; 
            private UserIdle userIdle; 

            private Builder() {
            } 

            private Builder(AutoSpeechConfig model) {
                this.llmPending = model.llmPending;
                this.userIdle = model.userIdle;
            } 

            /**
             * <p>The broadcast configuration for LLM response delays.</p>
             */
            public Builder llmPending(LlmPending llmPending) {
                this.llmPending = llmPending;
                return this;
            }

            /**
             * <p>The broadcast configuration for inquiries during prolonged user silence.</p>
             */
            public Builder userIdle(UserIdle userIdle) {
                this.userIdle = userIdle;
                return this;
            }

            public AutoSpeechConfig build() {
                return new AutoSpeechConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class AvatarConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvatarId")
        private String avatarId;

        @com.aliyun.core.annotation.NameInMap("Resolution")
        private String resolution;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private AvatarConfig(Builder builder) {
            this.avatarId = builder.avatarId;
            this.resolution = builder.resolution;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvatarConfig create() {
            return builder().build();
        }

        /**
         * @return avatarId
         */
        public String getAvatarId() {
            return this.avatarId;
        }

        /**
         * @return resolution
         */
        public String getResolution() {
            return this.resolution;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String avatarId; 
            private String resolution; 
            private String templateId; 

            private Builder() {
            } 

            private Builder(AvatarConfig model) {
                this.avatarId = model.avatarId;
                this.resolution = model.resolution;
                this.templateId = model.templateId;
            } 

            /**
             * <p>The model ID of the digital human.</p>
             * 
             * <strong>example:</strong>
             * <p>5257</p>
             */
            public Builder avatarId(String avatarId) {
                this.avatarId = avatarId;
                return this;
            }

            /**
             * <p>The resolution of the digital human video stream. The value must be in strictly lowercase letters and must be specified together with AvatarId. Valid values:</p>
             * <ul>
             * <li>360p</li>
             * <li>480p</li>
             * <li>720p</li>
             * <li>1080p</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1080p</p>
             */
            public Builder resolution(String resolution) {
                this.resolution = resolution;
                return this;
            }

            /**
             * <p>The ID of the digital human template, which specifies the template used when the digital human is started. The template is provided by the digital human service provider, and the provider also verifies whether the specified value is valid.</p>
             * 
             * <strong>example:</strong>
             * <p>tpl-9527</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public AvatarConfig build() {
                return new AvatarConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class Words extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Probability")
        private Double probability;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private Words(Builder builder) {
            this.probability = builder.probability;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Words create() {
            return builder().build();
        }

        /**
         * @return probability
         */
        public Double getProbability() {
            return this.probability;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Double probability; 
            private String text; 

            private Builder() {
            } 

            private Builder(Words model) {
                this.probability = model.probability;
                this.text = model.text;
            } 

            /**
             * <p>The trigger probability of the phrase. Valid values: 0.0 to 1.0. This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.3</p>
             */
            public Builder probability(Double probability) {
                this.probability = probability;
                return this;
            }

            /**
             * <p>The text of the phrase. Maximum length: 20 characters. Multiple languages are supported. This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Words build() {
                return new Words(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class BackChannelingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Probability")
        private Double probability;

        @com.aliyun.core.annotation.NameInMap("TriggerStage")
        private String triggerStage;

        @com.aliyun.core.annotation.NameInMap("Words")
        private java.util.List<Words> words;

        private BackChannelingConfig(Builder builder) {
            this.enabled = builder.enabled;
            this.probability = builder.probability;
            this.triggerStage = builder.triggerStage;
            this.words = builder.words;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackChannelingConfig create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return probability
         */
        public Double getProbability() {
            return this.probability;
        }

        /**
         * @return triggerStage
         */
        public String getTriggerStage() {
            return this.triggerStage;
        }

        /**
         * @return words
         */
        public java.util.List<Words> getWords() {
            return this.words;
        }

        public static final class Builder {
            private Boolean enabled; 
            private Double probability; 
            private String triggerStage; 
            private java.util.List<Words> words; 

            private Builder() {
            } 

            private Builder(BackChannelingConfig model) {
                this.enabled = model.enabled;
                this.probability = model.probability;
                this.triggerStage = model.triggerStage;
                this.words = model.words;
            } 

            /**
             * <p>Specifies whether to enable the backchanneling feature. This parameter is required. Valid values: true and false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The trigger probability of the feature. Valid values: 0.0 to 1.0. This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder probability(Double probability) {
                this.probability = probability;
                return this;
            }

            /**
             * <p>The trigger stage for backchanneling. Valid values:</p>
             * <ul>
             * <li>pause_detected: A short pause in speech is detected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pause_detected</p>
             */
            public Builder triggerStage(String triggerStage) {
                this.triggerStage = triggerStage;
                return this;
            }

            /**
             * <p>The collection of backchanneling phrases. A maximum of 10 phrases are supported. Each phrase can be up to 20 characters in length. The sum of probabilities must be 1.0.</p>
             */
            public Builder words(java.util.List<Words> words) {
                this.words = words;
                return this;
            }

            public BackChannelingConfig build() {
                return new BackChannelingConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class BackChannelingConfigsWords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Probability")
        private Double probability;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private BackChannelingConfigsWords(Builder builder) {
            this.probability = builder.probability;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackChannelingConfigsWords create() {
            return builder().build();
        }

        /**
         * @return probability
         */
        public Double getProbability() {
            return this.probability;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Double probability; 
            private String text; 

            private Builder() {
            } 

            private Builder(BackChannelingConfigsWords model) {
                this.probability = model.probability;
                this.text = model.text;
            } 

            /**
             * <p>The trigger probability of the phrase. Valid values: 0.0 to 1.0. This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.3</p>
             */
            public Builder probability(Double probability) {
                this.probability = probability;
                return this;
            }

            /**
             * <p>The text of the phrase. Maximum length: 20 characters. Multiple languages are supported. This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public BackChannelingConfigsWords build() {
                return new BackChannelingConfigsWords(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class BackChannelingConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Probability")
        private Double probability;

        @com.aliyun.core.annotation.NameInMap("TriggerStage")
        private String triggerStage;

        @com.aliyun.core.annotation.NameInMap("Words")
        private java.util.List<BackChannelingConfigsWords> words;

        private BackChannelingConfigs(Builder builder) {
            this.enabled = builder.enabled;
            this.probability = builder.probability;
            this.triggerStage = builder.triggerStage;
            this.words = builder.words;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackChannelingConfigs create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return probability
         */
        public Double getProbability() {
            return this.probability;
        }

        /**
         * @return triggerStage
         */
        public String getTriggerStage() {
            return this.triggerStage;
        }

        /**
         * @return words
         */
        public java.util.List<BackChannelingConfigsWords> getWords() {
            return this.words;
        }

        public static final class Builder {
            private Boolean enabled; 
            private Double probability; 
            private String triggerStage; 
            private java.util.List<BackChannelingConfigsWords> words; 

            private Builder() {
            } 

            private Builder(BackChannelingConfigs model) {
                this.enabled = model.enabled;
                this.probability = model.probability;
                this.triggerStage = model.triggerStage;
                this.words = model.words;
            } 

            /**
             * <p>Specifies whether to enable the backchanneling feature. This parameter is required. Valid values: true and false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The trigger probability of the feature. Valid values: 0.0 to 1.0. This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder probability(Double probability) {
                this.probability = probability;
                return this;
            }

            /**
             * <p>The trigger stage for backchanneling. Valid values:</p>
             * <ul>
             * <li>pause_detected: A short pause in speech is detected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pause_detected</p>
             */
            public Builder triggerStage(String triggerStage) {
                this.triggerStage = triggerStage;
                return this;
            }

            /**
             * <p>The collection of backchanneling phrases. A maximum of 10 phrases are supported. Each phrase can be up to 20 characters in length. The sum of probabilities must be 1.0.</p>
             */
            public Builder words(java.util.List<BackChannelingConfigsWords> words) {
                this.words = words;
                return this;
            }

            public BackChannelingConfigs build() {
                return new BackChannelingConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class InterruptConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableVoiceInterrupt")
        private Boolean enableVoiceInterrupt;

        @com.aliyun.core.annotation.NameInMap("InterruptWords")
        private java.util.List<String> interruptWords;

        @com.aliyun.core.annotation.NameInMap("KeepInterruptWordsForLLM")
        private Boolean keepInterruptWordsForLLM;

        @com.aliyun.core.annotation.NameInMap("NoInterruptMode")
        private String noInterruptMode;

        private InterruptConfig(Builder builder) {
            this.enableVoiceInterrupt = builder.enableVoiceInterrupt;
            this.interruptWords = builder.interruptWords;
            this.keepInterruptWordsForLLM = builder.keepInterruptWordsForLLM;
            this.noInterruptMode = builder.noInterruptMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InterruptConfig create() {
            return builder().build();
        }

        /**
         * @return enableVoiceInterrupt
         */
        public Boolean getEnableVoiceInterrupt() {
            return this.enableVoiceInterrupt;
        }

        /**
         * @return interruptWords
         */
        public java.util.List<String> getInterruptWords() {
            return this.interruptWords;
        }

        /**
         * @return keepInterruptWordsForLLM
         */
        public Boolean getKeepInterruptWordsForLLM() {
            return this.keepInterruptWordsForLLM;
        }

        /**
         * @return noInterruptMode
         */
        public String getNoInterruptMode() {
            return this.noInterruptMode;
        }

        public static final class Builder {
            private Boolean enableVoiceInterrupt; 
            private java.util.List<String> interruptWords; 
            private Boolean keepInterruptWordsForLLM; 
            private String noInterruptMode; 

            private Builder() {
            } 

            private Builder(InterruptConfig model) {
                this.enableVoiceInterrupt = model.enableVoiceInterrupt;
                this.interruptWords = model.interruptWords;
                this.keepInterruptWordsForLLM = model.keepInterruptWordsForLLM;
                this.noInterruptMode = model.noInterruptMode;
            } 

            /**
             * <p>Specifies whether to support speech interruption. Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableVoiceInterrupt(Boolean enableVoiceInterrupt) {
                this.enableVoiceInterrupt = enableVoiceInterrupt;
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
             * <p>Specifies whether to retain interrupt words when sending messages to the LLM. By default, interrupt words are discarded.
             * For example, if the interrupt word is &quot;wait&quot;, the message &quot;wait how is the weather today&quot; is changed to &quot;how is the weather today&quot; after the interrupt word is discarded.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder keepInterruptWordsForLLM(Boolean keepInterruptWordsForLLM) {
                this.keepInterruptWordsForLLM = keepInterruptWordsForLLM;
                return this;
            }

            /**
             * <p>The ASR processing policy in No Interrupting mode. Valid values:</p>
             * <ul>
             * <li>cache: Caches the ASR text. After the current turn ends, the cached ASR text is processed together in the next turn.</li>
             * <li>discard: Directly discards the ASR text.
             * Default value: cache.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cache</p>
             */
            public Builder noInterruptMode(String noInterruptMode) {
                this.noInterruptMode = noInterruptMode;
                return this;
            }

            public InterruptConfig build() {
                return new InterruptConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class FunctionMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Function")
        private String function;

        @com.aliyun.core.annotation.NameInMap("MatchFunction")
        private String matchFunction;

        private FunctionMap(Builder builder) {
            this.function = builder.function;
            this.matchFunction = builder.matchFunction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FunctionMap create() {
            return builder().build();
        }

        /**
         * @return function
         */
        public String getFunction() {
            return this.function;
        }

        /**
         * @return matchFunction
         */
        public String getMatchFunction() {
            return this.matchFunction;
        }

        public static final class Builder {
            private String function; 
            private String matchFunction; 

            private Builder() {
            } 

            private Builder(FunctionMap model) {
                this.function = model.function;
                this.matchFunction = model.matchFunction;
            } 

            /**
             * <p>The name of the built-in feature provided by the Alibaba Cloud agent system. Currently, only hangup is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>hangup</p>
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * <p>The name of the LLM function that corresponds to the feature. This name is customized by the user and is used to call the corresponding feature in the LLM. For more information about the user-defined LLM protocol, see <a href="https://help.aliyun.com/document_detail/2839094.html">Standard LLM API</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>hangup</p>
             */
            public Builder matchFunction(String matchFunction) {
                this.matchFunction = matchFunction;
                return this;
            }

            public FunctionMap build() {
                return new FunctionMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
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
             * <li>user: User.</li>
             * <li>assistant: Assistant.</li>
             * <li>system: System.</li>
             * <li>function: Function.</li>
             * <li>plugin: Plugin.</li>
             * <li>tool: Tool.</li>
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
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class LlmConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BailianAppParams")
        private String bailianAppParams;

        @com.aliyun.core.annotation.NameInMap("FunctionMap")
        private java.util.List<FunctionMap> functionMap;

        @com.aliyun.core.annotation.NameInMap("HistorySyncWithTTS")
        private Boolean historySyncWithTTS;

        @com.aliyun.core.annotation.NameInMap("LlmCompleteReply")
        private Boolean llmCompleteReply;

        @com.aliyun.core.annotation.NameInMap("LlmHistory")
        private java.util.List<LlmHistory> llmHistory;

        @com.aliyun.core.annotation.NameInMap("LlmHistoryLimit")
        private Integer llmHistoryLimit;

        @com.aliyun.core.annotation.NameInMap("LlmSystemPrompt")
        private String llmSystemPrompt;

        @com.aliyun.core.annotation.NameInMap("OpenAIExtraQuery")
        private String openAIExtraQuery;

        @com.aliyun.core.annotation.NameInMap("OutputMaxDelay")
        private Integer outputMaxDelay;

        @com.aliyun.core.annotation.NameInMap("OutputMinLength")
        private Integer outputMinLength;

        private LlmConfig(Builder builder) {
            this.bailianAppParams = builder.bailianAppParams;
            this.functionMap = builder.functionMap;
            this.historySyncWithTTS = builder.historySyncWithTTS;
            this.llmCompleteReply = builder.llmCompleteReply;
            this.llmHistory = builder.llmHistory;
            this.llmHistoryLimit = builder.llmHistoryLimit;
            this.llmSystemPrompt = builder.llmSystemPrompt;
            this.openAIExtraQuery = builder.openAIExtraQuery;
            this.outputMaxDelay = builder.outputMaxDelay;
            this.outputMinLength = builder.outputMinLength;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LlmConfig create() {
            return builder().build();
        }

        /**
         * @return bailianAppParams
         */
        public String getBailianAppParams() {
            return this.bailianAppParams;
        }

        /**
         * @return functionMap
         */
        public java.util.List<FunctionMap> getFunctionMap() {
            return this.functionMap;
        }

        /**
         * @return historySyncWithTTS
         */
        public Boolean getHistorySyncWithTTS() {
            return this.historySyncWithTTS;
        }

        /**
         * @return llmCompleteReply
         */
        public Boolean getLlmCompleteReply() {
            return this.llmCompleteReply;
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
         * @return openAIExtraQuery
         */
        public String getOpenAIExtraQuery() {
            return this.openAIExtraQuery;
        }

        /**
         * @return outputMaxDelay
         */
        public Integer getOutputMaxDelay() {
            return this.outputMaxDelay;
        }

        /**
         * @return outputMinLength
         */
        public Integer getOutputMinLength() {
            return this.outputMinLength;
        }

        public static final class Builder {
            private String bailianAppParams; 
            private java.util.List<FunctionMap> functionMap; 
            private Boolean historySyncWithTTS; 
            private Boolean llmCompleteReply; 
            private java.util.List<LlmHistory> llmHistory; 
            private Integer llmHistoryLimit; 
            private String llmSystemPrompt; 
            private String openAIExtraQuery; 
            private Integer outputMaxDelay; 
            private Integer outputMinLength; 

            private Builder() {
            } 

            private Builder(LlmConfig model) {
                this.bailianAppParams = model.bailianAppParams;
                this.functionMap = model.functionMap;
                this.historySyncWithTTS = model.historySyncWithTTS;
                this.llmCompleteReply = model.llmCompleteReply;
                this.llmHistory = model.llmHistory;
                this.llmHistoryLimit = model.llmHistoryLimit;
                this.llmSystemPrompt = model.llmSystemPrompt;
                this.openAIExtraQuery = model.openAIExtraQuery;
                this.outputMaxDelay = model.outputMaxDelay;
                this.outputMinLength = model.outputMinLength;
            } 

            /**
             * <p>The parameters for Alibaba Cloud Model Studio. The value must be a JSON string. For more information about the parameter format, see <a href="https://help.aliyun.com/document_detail/2858132.html">Alibaba Cloud Model Studio parameters</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{\&quot;biz_params\&quot;:{\&quot;user_defined_params\&quot;:{\&quot;your_plugin_id\&quot;:{\&quot;article_index\&quot;:2}}},\&quot;memory_id\&quot;:\&quot;your_memory_id\&quot;,\&quot;image_list\&quot;:[\&quot;<a href="https://your_image_url%5C%5C%22%5D,%5C%5C%22rag_options%5C%5C%22:%7B%5C%5C%22pipeline_ids%5C%5C%22:%5B%5C%5C%22your_id%5C%5C%22%5D,%5C%5C%22file_ids%5C%5C%22:%5B%5C%5C%22DocumentID1%5C%5C%22,%5C%5C%22DocumentID2%5C%5C%22%5D,%5C%5C%22metadata_filter%5C%5C%22:%7B%5C%5C%22name%5C%5C%22:%5C%5C%22ZhangSan%5C%5C%22%7D,%5C%5C%22structured_filter%5C%5C%22:%7B%5C%5C%22key1%5C%5C%22:%5C%5C%22value1%5C%5C%22,%5C%5C%22key2%5C%5C%22:%5C%5C%22value2%5C%5C%22%7D,%5C%5C%22tags%5C%5C%22:%5B%5C%5C%22Tag1%5C%5C%22,%5C%5C%22Tag2%5C%5C%22%5D%7D%7D">https://your_image_url\\&quot;],\\&quot;rag_options\\&quot;:{\\&quot;pipeline_ids\\&quot;:[\\&quot;your_id\\&quot;],\\&quot;file_ids\\&quot;:[\\&quot;DocumentID1\\&quot;,\\&quot;DocumentID2\\&quot;],\\&quot;metadata_filter\\&quot;:{\\&quot;name\\&quot;:\\&quot;ZhangSan\\&quot;},\\&quot;structured_filter\\&quot;:{\\&quot;key1\\&quot;:\\&quot;value1\\&quot;,\\&quot;key2\\&quot;:\\&quot;value2\\&quot;},\\&quot;tags\\&quot;:[\\&quot;Tag1\\&quot;,\\&quot;Tag2\\&quot;]}}</a>&quot;</p>
             */
            public Builder bailianAppParams(String bailianAppParams) {
                this.bailianAppParams = bailianAppParams;
                return this;
            }

            /**
             * <p>The function mapping list, which is used to map agent capabilities to LLM functions. Currently, only function calling with user-defined LLMs that use the OpenAI protocol is supported.</p>
             */
            public Builder functionMap(java.util.List<FunctionMap> functionMap) {
                this.functionMap = functionMap;
                return this;
            }

            /**
             * <p>Specifies whether to keep the LLM message history consistent with the text-to-speech (TTS) playback content. Default value: false. After this feature is enabled, the saved LLM messages are kept consistent with the TTS playback content.
             * When the user interrupts the agent in the LLM message history, the <code>&lt;ims_agent_interrupted&gt;</code> tag is inserted at the interruption position in the next message sent to the LLM. Example:</p>
             * <pre><code>[
             *   {&quot;role&quot;: &quot;user&quot;, &quot;content&quot;: &quot;Tell me a story.&quot;},
             *   {&quot;role&quot;: &quot;assistant&quot;, &quot;content&quot;: &quot;Okay, let me tell you a story about Romance of the Three Kingdoms. Do&lt;ims_agent_interrupted&gt; you want to listen?&quot;},
             *   {&quot;role&quot;: &quot;user&quot;, &quot;content&quot;: &quot;Tell me another one.&quot;}
             * ]
             * </code></pre>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder historySyncWithTTS(Boolean historySyncWithTTS) {
                this.historySyncWithTTS = historySyncWithTTS;
                return this;
            }

            /**
             * <p>Specifies whether to send the complete LLM result to the client after the LLM generates the complete response. This switch does not affect the streaming generation of subtitles.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder llmCompleteReply(Boolean llmCompleteReply) {
                this.llmCompleteReply = llmCompleteReply;
                return this;
            }

            /**
             * <p>The historical conversation context of the LLM or multimodal LLM.</p>
             */
            public Builder llmHistory(java.util.List<LlmHistory> llmHistory) {
                this.llmHistory = llmHistory;
                return this;
            }

            /**
             * <p>The maximum number of retained turns for the historical conversation context of the LLM or multimodal LLM. Default value: 10.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder llmHistoryLimit(Integer llmHistoryLimit) {
                this.llmHistoryLimit = llmHistoryLimit;
                return this;
            }

            /**
             * <p>The system prompt for the LLM after the call is started.</p>
             * 
             * <strong>example:</strong>
             * <p>You are the 1 friendly and helpful assistant, focused on providing accurate information and advice to users.</p>
             */
            public Builder llmSystemPrompt(String llmSystemPrompt) {
                this.llmSystemPrompt = llmSystemPrompt;
                return this;
            }

            /**
             * <p>The extra query parameters for the OpenAI-compatible LLM. Parameters must be in the key=value format. Multiple parameters are connected by an ampersand (&amp;). All values must be of the string type.</p>
             * 
             * <strong>example:</strong>
             * <p>api-version=2024-02-01&amp;api-key=sk-xxx</p>
             */
            public Builder openAIExtraQuery(String openAIExtraQuery) {
                this.openAIExtraQuery = openAIExtraQuery;
                return this;
            }

            /**
             * <p>The maximum delay time for text output in milliseconds. If this time is exceeded, the cached text is forcibly output. Valid values: 1000 to 10000. A value of 0 or empty indicates no limit. Default value: empty.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder outputMaxDelay(Integer outputMaxDelay) {
                this.outputMaxDelay = outputMaxDelay;
                return this;
            }

            /**
             * <p>The minimum length of text output in characters. Text shorter than this length is cached and concatenated. Valid values: 0 to 100. A value of 0 or empty indicates no limit. Default value: empty.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder outputMinLength(Integer outputMinLength) {
                this.outputMinLength = outputMinLength;
                return this;
            }

            public LlmConfig build() {
                return new LlmConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class TransferCallConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CalledNumber")
        @com.aliyun.core.annotation.Validation(maxLength = 32)
        private String calledNumber;

        @com.aliyun.core.annotation.NameInMap("CallerNumber")
        @com.aliyun.core.annotation.Validation(maxLength = 32)
        private String callerNumber;

        @com.aliyun.core.annotation.NameInMap("ForwardTranscriptionEnabled")
        private Boolean forwardTranscriptionEnabled;

        @com.aliyun.core.annotation.NameInMap("SipDomain")
        @com.aliyun.core.annotation.Validation(maxLength = 256)
        private String sipDomain;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private TransferCallConfig(Builder builder) {
            this.calledNumber = builder.calledNumber;
            this.callerNumber = builder.callerNumber;
            this.forwardTranscriptionEnabled = builder.forwardTranscriptionEnabled;
            this.sipDomain = builder.sipDomain;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferCallConfig create() {
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
         * @return forwardTranscriptionEnabled
         */
        public Boolean getForwardTranscriptionEnabled() {
            return this.forwardTranscriptionEnabled;
        }

        /**
         * @return sipDomain
         */
        public String getSipDomain() {
            return this.sipDomain;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String calledNumber; 
            private String callerNumber; 
            private Boolean forwardTranscriptionEnabled; 
            private String sipDomain; 
            private Integer type; 

            private Builder() {
            } 

            private Builder(TransferCallConfig model) {
                this.calledNumber = model.calledNumber;
                this.callerNumber = model.callerNumber;
                this.forwardTranscriptionEnabled = model.forwardTranscriptionEnabled;
                this.sipDomain = model.sipDomain;
                this.type = model.type;
            } 

            /**
             * <p>The default transfer number. This is a backup number. You must still explicitly pass the called number when you initiate a transfer call.</p>
             * 
             * <strong>example:</strong>
             * <p>0571xxxxxxx</p>
             */
            public Builder calledNumber(String calledNumber) {
                this.calledNumber = calledNumber;
                return this;
            }

            /**
             * <p>The caller number used for transfer calls. Configuring this field enables the RTC transfer capability. If this field is not configured, the behavior remains unchanged.</p>
             * 
             * <strong>example:</strong>
             * <p>0571xxxxxxx</p>
             */
            public Builder callerNumber(String callerNumber) {
                this.callerNumber = callerNumber;
                return this;
            }

            /**
             * <p>Specifies whether to perform real-time speech recognition for both parties (the RTC user and the transferred phone party) after the transfer is connected. When enabled, the recognition results are pushed to the client as subtitles through the RTC message channel and written to the call record. Valid values:</p>
             * <ul>
             * <li>true: Enabled. This is the default value.</li>
             * <li>false: Disabled. Subtitles and call records are not generated during the transfer.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder forwardTranscriptionEnabled(Boolean forwardTranscriptionEnabled) {
                this.forwardTranscriptionEnabled = forwardTranscriptionEnabled;
                return this;
            }

            /**
             * <p>The custom SIP outbound gateway address. This parameter is required only when Type is set to 1.</p>
             * 
             * <strong>example:</strong>
             * <p>sip.example.com:5060</p>
             */
            public Builder sipDomain(String sipDomain) {
                this.sipDomain = sipDomain;
                return this;
            }

            /**
             * <p>Valid values:</p>
             * <ul>
             * <li>0: Alibaba Cloud communication line. This is the default value.</li>
             * <li>1: Custom SIP line.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public TransferCallConfig build() {
                return new TransferCallConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class PronunciationRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Pronunciation")
        private String pronunciation;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Word")
        private String word;

        private PronunciationRules(Builder builder) {
            this.pronunciation = builder.pronunciation;
            this.type = builder.type;
            this.word = builder.word;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PronunciationRules create() {
            return builder().build();
        }

        /**
         * @return pronunciation
         */
        public String getPronunciation() {
            return this.pronunciation;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return word
         */
        public String getWord() {
            return this.word;
        }

        public static final class Builder {
            private String pronunciation; 
            private String type; 
            private String word; 

            private Builder() {
            } 

            private Builder(PronunciationRules model) {
                this.pronunciation = model.pronunciation;
                this.type = model.type;
                this.word = model.word;
            } 

            /**
             * <p>The target pronunciation. The length must be less than 10 characters. It must consist of Chinese characters and cannot contain spaces.</p>
             * 
             * <strong>example:</strong>
             * <p>110</p>
             */
            public Builder pronunciation(String pronunciation) {
                this.pronunciation = pronunciation;
                return this;
            }

            /**
             * <p>The specific pronunciation rule type. Valid values:</p>
             * <ul>
             * <li>replacement: A rule that directly replaces Word with Pronunciation.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>replacement</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The word to be replaced. The length must be less than 10 characters. It must consist of Chinese characters and cannot contain spaces.</p>
             * 
             * <strong>example:</strong>
             * <p>110</p>
             */
            public Builder word(String word) {
                this.word = word;
                return this;
            }

            public PronunciationRules build() {
                return new PronunciationRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class TtsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Emotion")
        private String emotion;

        @com.aliyun.core.annotation.NameInMap("HotFix")
        private String hotFix;

        @com.aliyun.core.annotation.NameInMap("Instruction")
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("LanguageId")
        private String languageId;

        @com.aliyun.core.annotation.NameInMap("ModelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("PronunciationRules")
        private java.util.List<PronunciationRules> pronunciationRules;

        @com.aliyun.core.annotation.NameInMap("SpeechRate")
        private Double speechRate;

        @com.aliyun.core.annotation.NameInMap("VoiceId")
        private String voiceId;

        @com.aliyun.core.annotation.NameInMap("VoiceIdList")
        private java.util.List<String> voiceIdList;

        private TtsConfig(Builder builder) {
            this.emotion = builder.emotion;
            this.hotFix = builder.hotFix;
            this.instruction = builder.instruction;
            this.languageId = builder.languageId;
            this.modelId = builder.modelId;
            this.pronunciationRules = builder.pronunciationRules;
            this.speechRate = builder.speechRate;
            this.voiceId = builder.voiceId;
            this.voiceIdList = builder.voiceIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TtsConfig create() {
            return builder().build();
        }

        /**
         * @return emotion
         */
        public String getEmotion() {
            return this.emotion;
        }

        /**
         * @return hotFix
         */
        public String getHotFix() {
            return this.hotFix;
        }

        /**
         * @return instruction
         */
        public String getInstruction() {
            return this.instruction;
        }

        /**
         * @return languageId
         */
        public String getLanguageId() {
            return this.languageId;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return pronunciationRules
         */
        public java.util.List<PronunciationRules> getPronunciationRules() {
            return this.pronunciationRules;
        }

        /**
         * @return speechRate
         */
        public Double getSpeechRate() {
            return this.speechRate;
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

        public static final class Builder {
            private String emotion; 
            private String hotFix; 
            private String instruction; 
            private String languageId; 
            private String modelId; 
            private java.util.List<PronunciationRules> pronunciationRules; 
            private Double speechRate; 
            private String voiceId; 
            private java.util.List<String> voiceIdList; 

            private Builder() {
            } 

            private Builder(TtsConfig model) {
                this.emotion = model.emotion;
                this.hotFix = model.hotFix;
                this.instruction = model.instruction;
                this.languageId = model.languageId;
                this.modelId = model.modelId;
                this.pronunciationRules = model.pronunciationRules;
                this.speechRate = model.speechRate;
                this.voiceId = model.voiceId;
                this.voiceIdList = model.voiceIdList;
            } 

            /**
             * <p>The emotion of the voice. Currently, only MiniMax is supported. MiniMax supports the following seven emotions:</p>
             * <ul>
             * <li>happy: Happy</li>
             * <li>sad: Sad</li>
             * <li>angry: Angry</li>
             * <li>fearful: Fearful</li>
             * <li>disgusted: Disgusted</li>
             * <li>surprised: Surprised</li>
             * <li>calm: Calm</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>happy</p>
             */
            public Builder emotion(String emotion) {
                this.emotion = emotion;
                return this;
            }

            /**
             * <p>The TTS pronunciation correction and text replacement configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;pronunciation&quot;:[{&quot;weather&quot;:&quot;tian1 qi4&quot;}],&quot;replace&quot;:[{&quot;today&quot;:&quot;golden day&quot;}]}</p>
             */
            public Builder hotFix(String hotFix) {
                this.hotFix = hotFix;
                return this;
            }

            /**
             * <p>The natural language instruction control for TTS.</p>
             * 
             * <strong>example:</strong>
             * <p>Please use a gentle and friendly female voice, and broadcast at a slightly slower speed</p>
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * <p>The language ID. Currently, only MiniMax is supported. Default value: empty. This parameter enhances the recognition capability for specified minority languages and dialects. Setting this parameter improves the voice performance in the specified minority language or dialect scenarios. If the minority language type is not specified, you can set this parameter to auto, and the model automatically determines the language type. Valid values:</p>
             * <details>
             * <summary>Supported languages</summary>
             * 
             * <ul>
             * <li>Chinese: Chinese</li>
             * <li>Chinese,Yue: Cantonese</li>
             * <li>English: English</li>
             * <li>Arabic: Arabic</li>
             * <li>Russian: Russian</li>
             * <li>Spanish: Spanish</li>
             * <li>French: French</li>
             * <li>Portuguese: Portuguese</li>
             * <li>German: German</li>
             * <li>Turkish: Turkish</li>
             * <li>Dutch: Dutch</li>
             * <li>Ukrainian: Ukrainian</li>
             * <li>Vietnamese: Vietnamese</li>
             * <li>Indonesian: Indonesian</li>
             * <li>Japanese: Japanese</li>
             * <li>Italian: Italian</li>
             * <li>Korean: Korean</li>
             * <li>Thai: Thai</li>
             * <li>Polish: Polish</li>
             * <li>Romanian: Romanian</li>
             * <li>Greek: Greek</li>
             * <li>Czech: Czech</li>
             * <li>Finnish: Finnish</li>
             * <li>Hindi: Hindi</li>
             * <li>auto: Automatic detection</details></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Chinese</p>
             */
            public Builder languageId(String languageId) {
                this.languageId = languageId;
                return this;
            }

            /**
             * <p>The model ID. Currently, only MiniMax is supported. Valid values:
             * speech-01-turbo and speech-02-turbo.</p>
             * 
             * <strong>example:</strong>
             * <p>speech-01-turbo</p>
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * <p>The TTS pronunciation rules. The array length cannot exceed 20. The rules are executed in sequence.</p>
             */
            public Builder pronunciationRules(java.util.List<PronunciationRules> pronunciationRules) {
                this.pronunciationRules = pronunciationRules;
                return this;
            }

            /**
             * <p>The speech rate. This parameter is supported on all platforms.
             * For CosyVoice, the default value is 1.0, and the valid values range from 0.5 to 2.0.
             * For MiniMax, the default value is 1.0, and the valid values range from 0.5 to 2.0.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder speechRate(Double speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * <p>The voice ID. Modifications take effect in the next sentence. If you do not specify this parameter, the voice ID configured in the agent template is used. This parameter takes effect only for preset TTS. The input length cannot exceed 64 characters. For valid values, refer to <a href="https://help.aliyun.com/document_detail/449563.html">Intelligent speech effect examples</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>longcheng_v2</p>
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

            public TtsConfig build() {
                return new TtsConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class TurnDetectionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Eagerness")
        private String eagerness;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("SemanticWaitDuration")
        private Integer semanticWaitDuration;

        @com.aliyun.core.annotation.NameInMap("TurnEndWords")
        private java.util.List<String> turnEndWords;

        private TurnDetectionConfig(Builder builder) {
            this.eagerness = builder.eagerness;
            this.mode = builder.mode;
            this.semanticWaitDuration = builder.semanticWaitDuration;
            this.turnEndWords = builder.turnEndWords;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TurnDetectionConfig create() {
            return builder().build();
        }

        /**
         * @return eagerness
         */
        public String getEagerness() {
            return this.eagerness;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return semanticWaitDuration
         */
        public Integer getSemanticWaitDuration() {
            return this.semanticWaitDuration;
        }

        /**
         * @return turnEndWords
         */
        public java.util.List<String> getTurnEndWords() {
            return this.turnEndWords;
        }

        public static final class Builder {
            private String eagerness; 
            private String mode; 
            private Integer semanticWaitDuration; 
            private java.util.List<String> turnEndWords; 

            private Builder() {
            } 

            private Builder(TurnDetectionConfig model) {
                this.eagerness = model.eagerness;
                this.mode = model.mode;
                this.semanticWaitDuration = model.semanticWaitDuration;
                this.turnEndWords = model.turnEndWords;
            } 

            /**
             * <p>The eagerness level. This parameter takes effect only in Semantic mode. It controls how quickly the AI starts to respond after detecting a pause:</p>
             * <ul>
             * <li>Low: Patient waiting. The maximum wait time is 6 seconds, which reduces the risk of being interrupted.</li>
             * <li>Medium: Balanced waiting. The maximum wait time is 4 seconds, which is suitable for most scenarios.</li>
             * <li>High: Fast response. The maximum wait time is 2 seconds, which improves speed but may increase the risk of false cut-offs.
             * Default value: empty.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>High</p>
             */
            public Builder eagerness(String eagerness) {
                this.eagerness = eagerness;
                return this;
            }

            /**
             * <p>The turn detection mode. Valid values:</p>
             * <ul>
             * <li>Normal: Normal mode. AI is not used to determine semantics. This is the default value.</li>
             * <li>Semantic: Semantic mode. AI is used to determine whether the user has finished speaking based on the context semantics.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Semantic</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The pause determination time in AI mode. Unit: milliseconds. Default value: -1. Valid values:</p>
             * <ul>
             * <li>-1: The AI automatically determines the appropriate wait time.</li>
             * <li>0 to 10000: A custom wait time. We recommend that you set this value to 0 to 1500 milliseconds.<blockquote>
             * <p>This parameter is invalid in Normal mode.</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder semanticWaitDuration(Integer semanticWaitDuration) {
                this.semanticWaitDuration = semanticWaitDuration;
                return this;
            }

            /**
             * <p>The list of keywords used to determine the end of a user turn.</p>
             */
            public Builder turnEndWords(java.util.List<String> turnEndWords) {
                this.turnEndWords = turnEndWords;
                return this;
            }

            public TurnDetectionConfig build() {
                return new TurnDetectionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class Equipment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        private Equipment(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Equipment create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(Equipment model) {
                this.enabled = model.enabled;
            } 

            /**
             * <p>Specifies whether to enable the disabled equipment check. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public Equipment build() {
                return new Equipment(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class HeadMotion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        private HeadMotion(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeadMotion create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(HeadMotion model) {
                this.enabled = model.enabled;
            } 

            /**
             * <p>Specifies whether to enable the head motion recognition check. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public HeadMotion build() {
                return new HeadMotion(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class InvalidFrameMotion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallbackDelay")
        private Integer callbackDelay;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        private InvalidFrameMotion(Builder builder) {
            this.callbackDelay = builder.callbackDelay;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvalidFrameMotion create() {
            return builder().build();
        }

        /**
         * @return callbackDelay
         */
        public Integer getCallbackDelay() {
            return this.callbackDelay;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Integer callbackDelay; 
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(InvalidFrameMotion model) {
                this.callbackDelay = model.callbackDelay;
                this.enabled = model.enabled;
            } 

            /**
             * <p>The delay for the invalid frame check notification. After this parameter is set, the notification is triggered after a static frame lasts for a specified period of time. Unit: milliseconds. Default value: empty. If this parameter is empty, the configuration in the console is used during the call. Valid values: 200 to 5000.</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder callbackDelay(Integer callbackDelay) {
                this.callbackDelay = callbackDelay;
                return this;
            }

            /**
             * <p>Specifies whether to enable the invalid frame check.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public InvalidFrameMotion build() {
                return new InvalidFrameMotion(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class LookAway extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        private LookAway(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LookAway create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(LookAway model) {
                this.enabled = model.enabled;
            } 

            /**
             * <p>Specifies whether to enable the look-away recognition configuration. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public LookAway build() {
                return new LookAway(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class PeopleCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        private PeopleCount(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeopleCount create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(PeopleCount model) {
                this.enabled = model.enabled;
            } 

            /**
             * <p>The switch for the people counting feature. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public PeopleCount build() {
                return new PeopleCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class StillFrameMotion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallbackDelay")
        private Integer callbackDelay;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        private StillFrameMotion(Builder builder) {
            this.callbackDelay = builder.callbackDelay;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StillFrameMotion create() {
            return builder().build();
        }

        /**
         * @return callbackDelay
         */
        public Integer getCallbackDelay() {
            return this.callbackDelay;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Integer callbackDelay; 
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(StillFrameMotion model) {
                this.callbackDelay = model.callbackDelay;
                this.enabled = model.enabled;
            } 

            /**
             * <p>The delay for the still frame check notification. After this parameter is set, the notification is triggered after a still frame lasts for a specified period of time. Unit: milliseconds. Default value: empty. If this parameter is empty, the configuration in the console is used during the call. Valid values: 200 to 5000.</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder callbackDelay(Integer callbackDelay) {
                this.callbackDelay = callbackDelay;
                return this;
            }

            /**
             * <p>Specifies whether to enable the still frame check. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public StillFrameMotion build() {
                return new StillFrameMotion(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class VcrConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Equipment")
        private Equipment equipment;

        @com.aliyun.core.annotation.NameInMap("HeadMotion")
        private HeadMotion headMotion;

        @com.aliyun.core.annotation.NameInMap("InvalidFrameMotion")
        private InvalidFrameMotion invalidFrameMotion;

        @com.aliyun.core.annotation.NameInMap("LookAway")
        private LookAway lookAway;

        @com.aliyun.core.annotation.NameInMap("PeopleCount")
        private PeopleCount peopleCount;

        @com.aliyun.core.annotation.NameInMap("StillFrameMotion")
        private StillFrameMotion stillFrameMotion;

        private VcrConfig(Builder builder) {
            this.equipment = builder.equipment;
            this.headMotion = builder.headMotion;
            this.invalidFrameMotion = builder.invalidFrameMotion;
            this.lookAway = builder.lookAway;
            this.peopleCount = builder.peopleCount;
            this.stillFrameMotion = builder.stillFrameMotion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VcrConfig create() {
            return builder().build();
        }

        /**
         * @return equipment
         */
        public Equipment getEquipment() {
            return this.equipment;
        }

        /**
         * @return headMotion
         */
        public HeadMotion getHeadMotion() {
            return this.headMotion;
        }

        /**
         * @return invalidFrameMotion
         */
        public InvalidFrameMotion getInvalidFrameMotion() {
            return this.invalidFrameMotion;
        }

        /**
         * @return lookAway
         */
        public LookAway getLookAway() {
            return this.lookAway;
        }

        /**
         * @return peopleCount
         */
        public PeopleCount getPeopleCount() {
            return this.peopleCount;
        }

        /**
         * @return stillFrameMotion
         */
        public StillFrameMotion getStillFrameMotion() {
            return this.stillFrameMotion;
        }

        public static final class Builder {
            private Equipment equipment; 
            private HeadMotion headMotion; 
            private InvalidFrameMotion invalidFrameMotion; 
            private LookAway lookAway; 
            private PeopleCount peopleCount; 
            private StillFrameMotion stillFrameMotion; 

            private Builder() {
            } 

            private Builder(VcrConfig model) {
                this.equipment = model.equipment;
                this.headMotion = model.headMotion;
                this.invalidFrameMotion = model.invalidFrameMotion;
                this.lookAway = model.lookAway;
                this.peopleCount = model.peopleCount;
                this.stillFrameMotion = model.stillFrameMotion;
            } 

            /**
             * <p>The equipment recognition configuration.</p>
             */
            public Builder equipment(Equipment equipment) {
                this.equipment = equipment;
                return this;
            }

            /**
             * <p>The head motion recognition configuration.</p>
             */
            public Builder headMotion(HeadMotion headMotion) {
                this.headMotion = headMotion;
                return this;
            }

            /**
             * <p>The parameter settings for the invalid frame check.</p>
             */
            public Builder invalidFrameMotion(InvalidFrameMotion invalidFrameMotion) {
                this.invalidFrameMotion = invalidFrameMotion;
                return this;
            }

            /**
             * <p>The look-away recognition configuration.</p>
             */
            public Builder lookAway(LookAway lookAway) {
                this.lookAway = lookAway;
                return this;
            }

            /**
             * <p>The configuration for the people counting feature.</p>
             */
            public Builder peopleCount(PeopleCount peopleCount) {
                this.peopleCount = peopleCount;
                return this;
            }

            /**
             * <p>The configuration for the still frame detection.</p>
             */
            public Builder stillFrameMotion(StillFrameMotion stillFrameMotion) {
                this.stillFrameMotion = stillFrameMotion;
                return this;
            }

            public VcrConfig build() {
                return new VcrConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link AIAgentConfig} extends {@link TeaModel}
     *
     * <p>AIAgentConfig</p>
     */
    public static class VoiceprintConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegistrationMode")
        private String registrationMode;

        @com.aliyun.core.annotation.NameInMap("UseVoiceprint")
        private Boolean useVoiceprint;

        @com.aliyun.core.annotation.NameInMap("VoiceprintId")
        private String voiceprintId;

        private VoiceprintConfig(Builder builder) {
            this.registrationMode = builder.registrationMode;
            this.useVoiceprint = builder.useVoiceprint;
            this.voiceprintId = builder.voiceprintId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoiceprintConfig create() {
            return builder().build();
        }

        /**
         * @return registrationMode
         */
        public String getRegistrationMode() {
            return this.registrationMode;
        }

        /**
         * @return useVoiceprint
         */
        public Boolean getUseVoiceprint() {
            return this.useVoiceprint;
        }

        /**
         * @return voiceprintId
         */
        public String getVoiceprintId() {
            return this.voiceprintId;
        }

        public static final class Builder {
            private String registrationMode; 
            private Boolean useVoiceprint; 
            private String voiceprintId; 

            private Builder() {
            } 

            private Builder(VoiceprintConfig model) {
                this.registrationMode = model.registrationMode;
                this.useVoiceprint = model.useVoiceprint;
                this.voiceprintId = model.voiceprintId;
            } 

            /**
             * <p>The voiceprint registration mode. Default value: Explicit.</p>
             * <table>
             * <thead>
             * <tr>
             * <th>Value</th>
             * <th>Description</th>
             * </tr>
             * </thead>
             * <tbody><tr>
             * <td>Explicit</td>
             * <td>Explicit registration mode. Users must upload audio through the voiceprint registration API operation in advance to complete the registration.</td>
             * </tr>
             * <tr>
             * <td>Implicit</td>
             * <td>Implicit registration mode. The system automatically collects the user\&quot;s voice and generates voiceprint features during the conversation.</td>
             * </tr>
             * </tbody></table>
             * 
             * <strong>example:</strong>
             * <p>Explicit</p>
             */
            public Builder registrationMode(String registrationMode) {
                this.registrationMode = registrationMode;
                return this;
            }

            /**
             * <p>Specifies whether to use voiceprint recognition. Default value: false. When voiceprint recognition is enabled, a valid voiceprint ID must be passed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder useVoiceprint(Boolean useVoiceprint) {
                this.useVoiceprint = useVoiceprint;
                return this;
            }

            /**
             * <p>The unique identity ID for voiceprint recognition. Default value: empty. The passed voiceprint ID must be registered through the voiceprint registration API operation. For more information about the API operation, refer to <a href="https://help.aliyun.com/document_detail/2964738.html">Register human voiceprint</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>zhixiaoxia</p>
             */
            public Builder voiceprintId(String voiceprintId) {
                this.voiceprintId = voiceprintId;
                return this;
            }

            public VoiceprintConfig build() {
                return new VoiceprintConfig(this);
            } 

        } 

    }
}
