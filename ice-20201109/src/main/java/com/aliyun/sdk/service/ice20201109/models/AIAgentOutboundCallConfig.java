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
 * {@link AIAgentOutboundCallConfig} extends {@link TeaModel}
 *
 * <p>AIAgentOutboundCallConfig</p>
 */
public class AIAgentOutboundCallConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AmbientSoundConfig")
    private AmbientSoundConfig ambientSoundConfig;

    @com.aliyun.core.annotation.NameInMap("AsrConfig")
    private AsrConfig asrConfig;

    @com.aliyun.core.annotation.NameInMap("AutoSpeechConfig")
    private AutoSpeechConfig autoSpeechConfig;

    @com.aliyun.core.annotation.NameInMap("BackChannelingConfig")
    @Deprecated
    private BackChannelingConfig backChannelingConfig;

    @com.aliyun.core.annotation.NameInMap("BackChannelingConfigs")
    private java.util.List<BackChannelingConfigs> backChannelingConfigs;

    @com.aliyun.core.annotation.NameInMap("EnableIntelligentSegment")
    private Boolean enableIntelligentSegment;

    @com.aliyun.core.annotation.NameInMap("ExperimentalConfig")
    private String experimentalConfig;

    @com.aliyun.core.annotation.NameInMap("Greeting")
    private String greeting;

    @com.aliyun.core.annotation.NameInMap("GreetingDelay")
    private Integer greetingDelay;

    @com.aliyun.core.annotation.NameInMap("InterruptConfig")
    private InterruptConfig interruptConfig;

    @com.aliyun.core.annotation.NameInMap("LlmConfig")
    private LlmConfig llmConfig;

    @com.aliyun.core.annotation.NameInMap("MaxIdleTime")
    private Integer maxIdleTime;

    @com.aliyun.core.annotation.NameInMap("TtsConfig")
    private TtsConfig ttsConfig;

    @com.aliyun.core.annotation.NameInMap("TurnDetectionConfig")
    private TurnDetectionConfig turnDetectionConfig;

    private AIAgentOutboundCallConfig(Builder builder) {
        this.ambientSoundConfig = builder.ambientSoundConfig;
        this.asrConfig = builder.asrConfig;
        this.autoSpeechConfig = builder.autoSpeechConfig;
        this.backChannelingConfig = builder.backChannelingConfig;
        this.backChannelingConfigs = builder.backChannelingConfigs;
        this.enableIntelligentSegment = builder.enableIntelligentSegment;
        this.experimentalConfig = builder.experimentalConfig;
        this.greeting = builder.greeting;
        this.greetingDelay = builder.greetingDelay;
        this.interruptConfig = builder.interruptConfig;
        this.llmConfig = builder.llmConfig;
        this.maxIdleTime = builder.maxIdleTime;
        this.ttsConfig = builder.ttsConfig;
        this.turnDetectionConfig = builder.turnDetectionConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AIAgentOutboundCallConfig create() {
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
     * @return backChannelingConfig
     */
    public BackChannelingConfig getBackChannelingConfig() {
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
     * @return experimentalConfig
     */
    public String getExperimentalConfig() {
        return this.experimentalConfig;
    }

    /**
     * @return greeting
     */
    public String getGreeting() {
        return this.greeting;
    }

    /**
     * @return greetingDelay
     */
    public Integer getGreetingDelay() {
        return this.greetingDelay;
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

    public static final class Builder {
        private AmbientSoundConfig ambientSoundConfig; 
        private AsrConfig asrConfig; 
        private AutoSpeechConfig autoSpeechConfig; 
        private BackChannelingConfig backChannelingConfig; 
        private java.util.List<BackChannelingConfigs> backChannelingConfigs; 
        private Boolean enableIntelligentSegment; 
        private String experimentalConfig; 
        private String greeting; 
        private Integer greetingDelay; 
        private InterruptConfig interruptConfig; 
        private LlmConfig llmConfig; 
        private Integer maxIdleTime; 
        private TtsConfig ttsConfig; 
        private TurnDetectionConfig turnDetectionConfig; 

        private Builder() {
        } 

        private Builder(AIAgentOutboundCallConfig model) {
            this.ambientSoundConfig = model.ambientSoundConfig;
            this.asrConfig = model.asrConfig;
            this.autoSpeechConfig = model.autoSpeechConfig;
            this.backChannelingConfig = model.backChannelingConfig;
            this.backChannelingConfigs = model.backChannelingConfigs;
            this.enableIntelligentSegment = model.enableIntelligentSegment;
            this.experimentalConfig = model.experimentalConfig;
            this.greeting = model.greeting;
            this.greetingDelay = model.greetingDelay;
            this.interruptConfig = model.interruptConfig;
            this.llmConfig = model.llmConfig;
            this.maxIdleTime = model.maxIdleTime;
            this.ttsConfig = model.ttsConfig;
            this.turnDetectionConfig = model.turnDetectionConfig;
        } 

        /**
         * <p>The ambient sound configuration for calls.</p>
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
         * <p>The automatic speech configuration module for the agent, including LLM waiting prompts and user long-time silence inquiries.</p>
         */
        public Builder autoSpeechConfig(AutoSpeechConfig autoSpeechConfig) {
            this.autoSpeechConfig = autoSpeechConfig;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> Use BackChannelingConfigs instead.</p>
         */
        public Builder backChannelingConfig(BackChannelingConfig backChannelingConfig) {
            this.backChannelingConfig = backChannelingConfig;
            return this;
        }

        /**
         * <p>The backchanneling feature configuration module. After this feature is enabled, the system randomly broadcasts short backchanneling words at specific trigger timings.</p>
         */
        public Builder backChannelingConfigs(java.util.List<BackChannelingConfigs> backChannelingConfigs) {
            this.backChannelingConfigs = backChannelingConfigs;
            return this;
        }

        /**
         * <p>Specifies whether to enable intelligent segmentation. After this feature is enabled, fragmented sentences spoken by the user are intelligently merged into a single sentence. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableIntelligentSegment(Boolean enableIntelligentSegment) {
            this.enableIntelligentSegment = enableIntelligentSegment;
            return this;
        }

        /**
         * <p>The parameters for experimental features. Contact technical support if you have any requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder experimentalConfig(String experimentalConfig) {
            this.experimentalConfig = experimentalConfig;
            return this;
        }

        /**
         * <p>The greeting message. Changes take effect in the next session. Default value: none.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        public Builder greeting(String greeting) {
            this.greeting = greeting;
            return this;
        }

        /**
         * <p>The delay time for the greeting message. Unit: milliseconds. Default value: 0. Valid values: 0 to 5000.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder greetingDelay(Integer greetingDelay) {
            this.greetingDelay = greetingDelay;
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
         * <p>The maximum waiting time without interaction with the agent. If this time is exceeded, the agent goes offline. Unit: seconds. Default value: 600.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder maxIdleTime(Integer maxIdleTime) {
            this.maxIdleTime = maxIdleTime;
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
         * <p>The conversation turn detection configuration.</p>
         */
        public Builder turnDetectionConfig(TurnDetectionConfig turnDetectionConfig) {
            this.turnDetectionConfig = turnDetectionConfig;
            return this;
        }

        public AIAgentOutboundCallConfig build() {
            return new AIAgentOutboundCallConfig(this);
        } 

    } 

    /**
     * 
     * {@link AIAgentOutboundCallConfig} extends {@link TeaModel}
     *
     * <p>AIAgentOutboundCallConfig</p>
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
             * <p>The ID of the ambient sound for calls. You can obtain this ID in the advanced configurations of the agent configuration in the console.</p>
             * 
             * <strong>example:</strong>
             * <p>f67901c595834************</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The volume of the background sound for calls. Valid values: 0 to 100. A value of 0 indicates that the background sound is disabled.</p>
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
     * {@link AIAgentOutboundCallConfig} extends {@link TeaModel}
     *
     * <p>AIAgentOutboundCallConfig</p>
     */
    public static class AsrConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrHotWords")
        private java.util.List<String> asrHotWords;

        @com.aliyun.core.annotation.NameInMap("AsrLanguageId")
        private String asrLanguageId;

        @com.aliyun.core.annotation.NameInMap("AsrMaxSilence")
        private Integer asrMaxSilence;

        @com.aliyun.core.annotation.NameInMap("CustomParams")
        private String customParams;

        @com.aliyun.core.annotation.NameInMap("VadDuration")
        private Integer vadDuration;

        @com.aliyun.core.annotation.NameInMap("VadLevel")
        private Integer vadLevel;

        private AsrConfig(Builder builder) {
            this.asrHotWords = builder.asrHotWords;
            this.asrLanguageId = builder.asrLanguageId;
            this.asrMaxSilence = builder.asrMaxSilence;
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
            private java.util.List<String> asrHotWords; 
            private String asrLanguageId; 
            private Integer asrMaxSilence; 
            private String customParams; 
            private Integer vadDuration; 
            private Integer vadLevel; 

            private Builder() {
            } 

            private Builder(AsrConfig model) {
                this.asrHotWords = model.asrHotWords;
                this.asrLanguageId = model.asrLanguageId;
                this.asrMaxSilence = model.asrMaxSilence;
                this.customParams = model.customParams;
                this.vadDuration = model.vadDuration;
                this.vadLevel = model.vadLevel;
            } 

            /**
             * <p>The list of ASR hotwords. The list supports a maximum of 128 hotwords.</p>
             */
            public Builder asrHotWords(java.util.List<String> asrHotWords) {
                this.asrHotWords = asrHotWords;
                return this;
            }

            /**
             * <p>The language ID for automatic speech recognition (ASR). Valid values:</p>
             * <ul>
             * <li><p>zh_mandarin: Chinese</p>
             * </li>
             * <li><p>en: English</p>
             * </li>
             * <li><p>zh_en: Chinese and English mixed</p>
             * </li>
             * <li><p>es: Spanish</p>
             * </li>
             * <li><p>jp: Japanese</p>
             * </li>
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
             * <p>The silence duration threshold for speech segmentation. If the silence duration exceeds this threshold, the speech is considered segmented. Valid values: 200 to 1200. Unit: milliseconds. Default value: 400.</p>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder asrMaxSilence(Integer asrMaxSilence) {
                this.asrMaxSilence = asrMaxSilence;
                return this;
            }

            /**
             * <p>The pass-through parameters for the proprietary ASR integration.</p>
             * 
             * <strong>example:</strong>
             * <p>mode=fast&amp;sample=16000&amp;format=wav</p>
             */
            public Builder customParams(String customParams) {
                this.customParams = customParams;
                return this;
            }

            /**
             * <p>The minimum duration threshold for voice activity detection, which is used to control the sensitivity of interruptions. A value of 0 disables this feature. Valid values: 200 to 2000. Unit: milliseconds. Common values: 200 to 500, which correspond to 1 to 4 characters. Default value: empty. This parameter does not take effect when left empty.</p>
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
             * <li>0: Disables the voice activity detection (VAD) feature.</li>
             * <li>1 to 10: A higher value indicates that it is more difficult to interrupt the speech.</li>
             * <li>11: Significantly different from previous values. It causes less damage to the conversation voice during pre-processing and provides stronger anti-interference capability.</li>
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
     * {@link AIAgentOutboundCallConfig} extends {@link TeaModel}
     *
     * <p>AIAgentOutboundCallConfig</p>
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
             * <p>The text of the inquiry prompt. The maximum length is 100 characters.</p>
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
     * {@link AIAgentOutboundCallConfig} extends {@link TeaModel}
     *
     * <p>AIAgentOutboundCallConfig</p>
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
             * <p>The collection of inquiry prompts. A maximum of 10 prompts are supported. The length of each prompt cannot exceed 100 characters. The sum of probabilities must be 100%.</p>
             */
            public Builder messages(java.util.List<Messages> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The waiting time threshold for the LLM response. If this time is exceeded, a broadcast prompt is triggered. This parameter is required. Unit: milliseconds. Valid values: 500 to 10000. Set this parameter based on the actual usage of the LLM.</p>
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
     * {@link AIAgentOutboundCallConfig} extends {@link TeaModel}
     *
     * <p>AIAgentOutboundCallConfig</p>
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
             * <p>The text of the inquiry prompt. The maximum length is 100 characters.</p>
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
     * {@link AIAgentOutboundCallConfig} extends {@link TeaModel}
     *
     * <p>AIAgentOutboundCallConfig</p>
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
             * <p>The hang-up closing word. It is broadcast before the call is hung up after the user does not respond for a long time. The maximum length is 200 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>I’m hanging up, goodbye.</p>
             */
            public Builder hangupEndWord(String hangupEndWord) {
                this.hangupEndWord = hangupEndWord;
                return this;
            }

            /**
             * <p>The maximum number of inquiries. Valid values: 0 to 10. This parameter is required. If this number is exceeded, no more inquiries are triggered, and the call is directly closed.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder maxRepeats(Integer maxRepeats) {
                this.maxRepeats = maxRepeats;
                return this;
            }

            /**
             * <p>The collection of inquiry prompts. A maximum of 10 prompts are supported. The length of each prompt cannot exceed 100 characters. The sum of probabilities must be 100%.</p>
             */
            public Builder messages(java.util.List<UserIdleMessages> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * <p>The silence duration threshold. Unit: milliseconds. This parameter is required. An inquiry is triggered when the silence duration exceeds this threshold. Valid values: 5000 to 600000.</p>
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
     * {@link AIAgentOutboundCallConfig} extends {@link TeaModel}
     *
     * <p>AIAgentOutboundCallConfig</p>
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
             * <p>The broadcast configuration when the LLM response is delayed.</p>
             */
            public Builder llmPending(LlmPending llmPending) {
                this.llmPending = llmPending;
                return this;
            }

            /**
             * <p>The inquiry broadcast configuration when the user is silent for a long time.</p>
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
     * {@link AIAgentOutboundCallConfig} extends {@link TeaModel}
     *
     * <p>AIAgentOutboundCallConfig</p>
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
             * <p>The text of the inquiry prompt. The maximum length is 100 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>Are you still there?</p>
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
     * {@link AIAgentOutboundCallConfig} extends {@link TeaModel}
     *
     * <p>AIAgentOutboundCallConfig</p>
     */
    public static class BackChannelingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Probability")
        private Double probability;

        @com.aliyun.core.annotation.NameInMap("TriggerStage")
        private String triggerStage;

        @com.aliyun.core.annotation.NameInMap("Words")
        private Words words;

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
        public Words getWords() {
            return this.words;
        }

        public static final class Builder {
            private Boolean enabled; 
            private Double probability; 
            private String triggerStage; 
            private Words words; 

            private Builder() {
            } 

            private Builder(BackChannelingConfig model) {
                this.enabled = model.enabled;
                this.probability = model.probability;
                this.triggerStage = model.triggerStage;
                this.words = model.words;
            } 

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
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
             * TriggerStage.
             */
            public Builder triggerStage(String triggerStage) {
                this.triggerStage = triggerStage;
                return this;
            }

            /**
             * Words.
             */
            public Builder words(Words words) {
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
     * {@link AIAgentOutboundCallConfig} extends {@link TeaModel}
     *
     * <p>AIAgentOutboundCallConfig</p>
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
             * <p>The trigger probability of the phrase. Valid values: 0.0 to 1.0. Required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.3</p>
             */
            public Builder probability(Double probability) {
                this.probability = probability;
                return this;
            }

            /**
             * <p>The text of the phrase. The maximum length is 20 characters. Multiple languages are supported. Required.</p>
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
     * {@link AIAgentOutboundCallConfig} extends {@link TeaModel}
     *
     * <p>AIAgentOutboundCallConfig</p>
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
             * <p>The trigger timing for backchanneling. Valid values:</p>
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
             * <p>The collection of backchanneling phrases. A maximum of 10 phrases are supported. The length of each phrase cannot exceed 20 characters. The sum of probabilities must be 1.0.</p>
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
     * {@link AIAgentOutboundCallConfig} extends {@link TeaModel}
     *
     * <p>AIAgentOutboundCallConfig</p>
     */
    public static class InterruptConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Eagerness")
        @Deprecated
        private String eagerness;

        @com.aliyun.core.annotation.NameInMap("EnableVoiceInterrupt")
        private Boolean enableVoiceInterrupt;

        @com.aliyun.core.annotation.NameInMap("InterruptWords")
        private java.util.List<String> interruptWords;

        @com.aliyun.core.annotation.NameInMap("KeepInterruptWordsForLLM")
        private Boolean keepInterruptWordsForLLM;

        @com.aliyun.core.annotation.NameInMap("NoInterruptMode")
        private String noInterruptMode;

        private InterruptConfig(Builder builder) {
            this.eagerness = builder.eagerness;
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
         * @return eagerness
         */
        public String getEagerness() {
            return this.eagerness;
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
            private String eagerness; 
            private Boolean enableVoiceInterrupt; 
            private java.util.List<String> interruptWords; 
            private Boolean keepInterruptWordsForLLM; 
            private String noInterruptMode; 

            private Builder() {
            } 

            private Builder(InterruptConfig model) {
                this.eagerness = model.eagerness;
                this.enableVoiceInterrupt = model.enableVoiceInterrupt;
                this.interruptWords = model.interruptWords;
                this.keepInterruptWordsForLLM = model.keepInterruptWordsForLLM;
                this.noInterruptMode = model.noInterruptMode;
            } 

            /**
             * Eagerness.
             */
            public Builder eagerness(String eagerness) {
                this.eagerness = eagerness;
                return this;
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
             * <p>The specific words or phrases that trigger conversation interruption.</p>
             */
            public Builder interruptWords(java.util.List<String> interruptWords) {
                this.interruptWords = interruptWords;
                return this;
            }

            /**
             * <p>Specifies whether to retain the interrupt words and send them to the LLM. Default value: discard.</p>
             * <blockquote>
             * <p>Example: If the interrupt word is &quot;wait&quot;, the phrase &quot;wait how is the weather today&quot; becomes &quot;how is the weather today&quot; after the interrupt word is discarded and sent to the LLM.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder keepInterruptWordsForLLM(Boolean keepInterruptWordsForLLM) {
                this.keepInterruptWordsForLLM = keepInterruptWordsForLLM;
                return this;
            }

            /**
             * <p>The ASR processing policy in the No Interrupting mode. Valid values:</p>
             * <ul>
             * <li><p>cache: Caches the ASR text. After the current turn ends, the cached ASR text is processed together in the next turn.</p>
             * </li>
             * <li><p>discard: Directly discards the ASR text.</p>
             * </li>
             * </ul>
             * <p>Default value: cache.</p>
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
     * {@link AIAgentOutboundCallConfig} extends {@link TeaModel}
     *
     * <p>AIAgentOutboundCallConfig</p>
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
             * <p>The name of the LLM function that corresponds to the feature. This name is customized by the user and used to call the corresponding feature in the LLM. For the user-defined LLM protocol, refer to <a href="https://help.aliyun.com/document_detail/2839094.html">Standard LLM API</a>.</p>
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
     * {@link AIAgentOutboundCallConfig} extends {@link TeaModel}
     *
     * <p>AIAgentOutboundCallConfig</p>
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
             * <p>The actual text content of the conversation, which records the specific expression or response of the role in the conversation.</p>
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
             * <li><p>plugin: Plugin</p>
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
     * {@link AIAgentOutboundCallConfig} extends {@link TeaModel}
     *
     * <p>AIAgentOutboundCallConfig</p>
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
        private String outputMaxDelay;

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
        public String getOutputMaxDelay() {
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
            private String outputMaxDelay; 
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
             * <p>The parameters for Alibaba Cloud Model Studio Application Center. For the parameter format, refer to <a href="https://help.aliyun.com/document_detail/2858132.html">Alibaba Cloud Model Studio Application Center parameters</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{\&quot;biz_params\&quot;:{\&quot;user_defined_params\&quot;:{\&quot;your_plugin_id\&quot;:{\&quot;article_index\&quot;:2}}},\&quot;memory_id\&quot;:\&quot;your_memory_id\&quot;,\&quot;image_list\&quot;:[\&quot;<a href="https://your_image_url%5C%5C%22%5D,%5C%5C%22rag_options%5C%5C%22:%7B%5C%5C%22pipeline_ids%5C%5C%22:%5B%5C%5C%22your_id%5C%5C%22%5D,%5C%5C%22file_ids%5C%5C%22:%5B%5C%5C%22DocumentID1%5C%5C%22,%5C%5C%22DocumentID2%5C%5C%22%5D,%5C%5C%22metadata_filter%5C%5C%22:%7B%5C%5C%22name%5C%5C%22:%5C%5C%22ZhangSan%5C%5C%22%7D,%5C%5C%22structured_filter%5C%5C%22:%7B%5C%5C%22key1%5C%5C%22:%5C%5C%22value1%5C%5C%22,%5C%5C%22key2%5C%5C%22:%5C%5C%22value2%5C%5C%22%7D,%5C%5C%22tags%5C%5C%22:%5B%5C%5C%22Tag1%5C%5C%22,%5C%5C%22Tag2%5C%5C%22%5D%7D%7D">https://your_image_url\\&quot;],\\&quot;rag_options\\&quot;:{\\&quot;pipeline_ids\\&quot;:[\\&quot;your_id\\&quot;],\\&quot;file_ids\\&quot;:[\\&quot;DocumentID1\\&quot;,\\&quot;DocumentID2\\&quot;],\\&quot;metadata_filter\\&quot;:{\\&quot;name\\&quot;:\\&quot;ZhangSan\\&quot;},\\&quot;structured_filter\\&quot;:{\\&quot;key1\\&quot;:\\&quot;value1\\&quot;,\\&quot;key2\\&quot;:\\&quot;value2\\&quot;},\\&quot;tags\\&quot;:[\\&quot;Tag1\\&quot;,\\&quot;Tag2\\&quot;]}}</a>&quot;</p>
             */
            public Builder bailianAppParams(String bailianAppParams) {
                this.bailianAppParams = bailianAppParams;
                return this;
            }

            /**
             * <p>The list of function mappings, which is used to map agent capabilities to LLM functions. Currently, only function calling with user-defined OpenAI-compatible LLMs is supported.</p>
             */
            public Builder functionMap(java.util.List<FunctionMap> functionMap) {
                this.functionMap = functionMap;
                return this;
            }

            /**
             * <p>Specifies whether the LLM message history is consistent with the text-to-speech (TTS) playback content. Default value: false. After this feature is enabled, the saved LLM messages are consistent with the TTS playback content.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder historySyncWithTTS(Boolean historySyncWithTTS) {
                this.historySyncWithTTS = historySyncWithTTS;
                return this;
            }

            /**
             * <p>After this feature is enabled, the complete LLM result is sent to the client after the LLM generates the result.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder llmCompleteReply(Boolean llmCompleteReply) {
                this.llmCompleteReply = llmCompleteReply;
                return this;
            }

            /**
             * <p>The LLM or MLLM conversation history context.</p>
             */
            public Builder llmHistory(java.util.List<LlmHistory> llmHistory) {
                this.llmHistory = llmHistory;
                return this;
            }

            /**
             * <p>The maximum number of retained turns for the LLM or multimodal LLM (MLLM) conversation history context. Default value: 10.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder llmHistoryLimit(Integer llmHistoryLimit) {
                this.llmHistoryLimit = llmHistoryLimit;
                return this;
            }

            /**
             * <p>The system prompt for the LLM after the call is initiated.</p>
             * 
             * <strong>example:</strong>
             * <p>You are a friendly and helpful assistant, focused on providing users with accurate information and advice.</p>
             */
            public Builder llmSystemPrompt(String llmSystemPrompt) {
                this.llmSystemPrompt = llmSystemPrompt;
                return this;
            }

            /**
             * <p>The additional query parameters for the OpenAI-compatible LLM. Parameters must be in the key=value format. Multiple parameters are connected by an ampersand (&amp;). All values must be of the string type.</p>
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
            public Builder outputMaxDelay(String outputMaxDelay) {
                this.outputMaxDelay = outputMaxDelay;
                return this;
            }

            /**
             * <p>The minimum length of text output in characters. Text shorter than this length is cached and waiting to be concatenated. Valid values: 0 to 100. A value of 0 or empty indicates no limit. Default value: empty.</p>
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
     * {@link AIAgentOutboundCallConfig} extends {@link TeaModel}
     *
     * <p>AIAgentOutboundCallConfig</p>
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
             * <p>Dashi Lane</p>
             */
            public Builder pronunciation(String pronunciation) {
                this.pronunciation = pronunciation;
                return this;
            }

            /**
             * <p>The specific pronunciation rule type. Valid values:</p>
             * <ul>
             * <li>replacement: The rule that directly replaces the word with the pronunciation.</li>
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
             * <p>Dashi Lane</p>
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
     * {@link AIAgentOutboundCallConfig} extends {@link TeaModel}
     *
     * <p>AIAgentOutboundCallConfig</p>
     */
    public static class TtsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Emotion")
        private String emotion;

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
                this.languageId = model.languageId;
                this.modelId = model.modelId;
                this.pronunciationRules = model.pronunciationRules;
                this.speechRate = model.speechRate;
                this.voiceId = model.voiceId;
                this.voiceIdList = model.voiceIdList;
            } 

            /**
             * <p>The emotion. Currently, only MiniMax is supported. MiniMax supports the following seven emotions:</p>
             * <ul>
             * <li>happy: Happy</li>
             * <li>sad: Sad</li>
             * <li>angry: Angry</li>
             * <li>fearful: Fearful</li>
             * <li>disgusted: Disgusted</li>
             * <li>surprised: Surprised</li>
             * <li>calm: Neutral</li>
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
             * <p>The language ID. Currently, only MiniMax is supported. Default value: empty. This parameter enhances the recognition capability for specified minority languages and dialects. After this parameter is set, the speech performance in the specified minority language or dialect scenarios is improved. If the minority language type is not clear, you can set this parameter to auto, and the model automatically determines the minority language type. Valid values:</p>
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
             * <p>The model ID. Currently, only MiniMax is supported. Valid values: speech-01-turbo and speech-02-turbo.</p>
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
             * <p>The speech rate. This parameter is supported on all platforms. For CosyVoice, the default value is 1.0, and the valid values are 0.5 to 2.0. For MiniMax, the default value is 1.0, and the valid values are 0.5 to 2.0.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder speechRate(Double speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * <p>The voice ID. Changes take effect in the next sentence. If this parameter is not specified, the voice ID configured in the agent template is used. This parameter takes effect only for preset TTS. The input length cannot exceed 64 characters. For valid values, refer to <a href="https://help.aliyun.com/document_detail/449563.html">Intelligent speech effect examples</a>.</p>
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
     * {@link AIAgentOutboundCallConfig} extends {@link TeaModel}
     *
     * <p>AIAgentOutboundCallConfig</p>
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
             * <p>The eagerness level. This parameter takes effect only in Semantic mode. It controls the speed at which the AI initiates a response after detecting a pause. Valid values:</p>
             * <ul>
             * <li>Low: Waits patiently with a maximum waiting time of 6 seconds to reduce the risk of being interrupted.</li>
             * <li>Medium: Balances waiting with a maximum waiting time of 4 seconds. This value is suitable for most scenarios.</li>
             * <li>High: Responds quickly with a maximum waiting time of 2 seconds. This value improves speed but may increase the risk of false cuts.</li>
             * </ul>
             * <p>Default value: empty.</p>
             * 
             * <strong>example:</strong>
             * <p>Low</p>
             */
            public Builder eagerness(String eagerness) {
                this.eagerness = eagerness;
                return this;
            }

            /**
             * <p>The turn detection mode. Valid values:</p>
             * <ul>
             * <li><p>Normal: The normal mode, which does not use AI to determine semantics.</p>
             * </li>
             * <li><p>Semantic: Uses AI to determine whether the user has finished speaking based on the context semantics.</p>
             * </li>
             * </ul>
             * <p>Default value: Normal.</p>
             * 
             * <strong>example:</strong>
             * <p>Semantic</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The pause determination time in AI mode. Unit: milliseconds. Default value: -1.</p>
             * <ul>
             * <li><p>-1: AI automatically determines the appropriate waiting time.</p>
             * </li>
             * <li><p>0 to 10000: Custom waiting time. We recommend that you set this value to 0 to 1500.</p>
             * </li>
             * </ul>
             * <p>Note: This parameter is invalid in normal mode.</p>
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
}
