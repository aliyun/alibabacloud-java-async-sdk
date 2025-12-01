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
        this.enableIntelligentSegment = builder.enableIntelligentSegment;
        this.enablePushToTalk = builder.enablePushToTalk;
        this.experimentalConfig = builder.experimentalConfig;
        this.gracefulShutdown = builder.gracefulShutdown;
        this.greeting = builder.greeting;
        this.interruptConfig = builder.interruptConfig;
        this.llmConfig = builder.llmConfig;
        this.maxIdleTime = builder.maxIdleTime;
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
        private Boolean enableIntelligentSegment; 
        private Boolean enablePushToTalk; 
        private String experimentalConfig; 
        private Boolean gracefulShutdown; 
        private String greeting; 
        private InterruptConfig interruptConfig; 
        private LlmConfig llmConfig; 
        private Integer maxIdleTime; 
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
            this.enableIntelligentSegment = model.enableIntelligentSegment;
            this.enablePushToTalk = model.enablePushToTalk;
            this.experimentalConfig = model.experimentalConfig;
            this.gracefulShutdown = model.gracefulShutdown;
            this.greeting = model.greeting;
            this.interruptConfig = model.interruptConfig;
            this.llmConfig = model.llmConfig;
            this.maxIdleTime = model.maxIdleTime;
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
         * AmbientSoundConfig.
         */
        public Builder ambientSoundConfig(AmbientSoundConfig ambientSoundConfig) {
            this.ambientSoundConfig = ambientSoundConfig;
            return this;
        }

        /**
         * AsrConfig.
         */
        public Builder asrConfig(AsrConfig asrConfig) {
            this.asrConfig = asrConfig;
            return this;
        }

        /**
         * AutoSpeechConfig.
         */
        public Builder autoSpeechConfig(AutoSpeechConfig autoSpeechConfig) {
            this.autoSpeechConfig = autoSpeechConfig;
            return this;
        }

        /**
         * AvatarConfig.
         */
        public Builder avatarConfig(AvatarConfig avatarConfig) {
            this.avatarConfig = avatarConfig;
            return this;
        }

        /**
         * AvatarUrl.
         */
        public Builder avatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }

        /**
         * AvatarUrlType.
         */
        public Builder avatarUrlType(String avatarUrlType) {
            this.avatarUrlType = avatarUrlType;
            return this;
        }

        /**
         * EnableIntelligentSegment.
         */
        public Builder enableIntelligentSegment(Boolean enableIntelligentSegment) {
            this.enableIntelligentSegment = enableIntelligentSegment;
            return this;
        }

        /**
         * EnablePushToTalk.
         */
        public Builder enablePushToTalk(Boolean enablePushToTalk) {
            this.enablePushToTalk = enablePushToTalk;
            return this;
        }

        /**
         * ExperimentalConfig.
         */
        public Builder experimentalConfig(String experimentalConfig) {
            this.experimentalConfig = experimentalConfig;
            return this;
        }

        /**
         * GracefulShutdown.
         */
        public Builder gracefulShutdown(Boolean gracefulShutdown) {
            this.gracefulShutdown = gracefulShutdown;
            return this;
        }

        /**
         * Greeting.
         */
        public Builder greeting(String greeting) {
            this.greeting = greeting;
            return this;
        }

        /**
         * InterruptConfig.
         */
        public Builder interruptConfig(InterruptConfig interruptConfig) {
            this.interruptConfig = interruptConfig;
            return this;
        }

        /**
         * LlmConfig.
         */
        public Builder llmConfig(LlmConfig llmConfig) {
            this.llmConfig = llmConfig;
            return this;
        }

        /**
         * MaxIdleTime.
         */
        public Builder maxIdleTime(Integer maxIdleTime) {
            this.maxIdleTime = maxIdleTime;
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
         * TurnDetectionConfig.
         */
        public Builder turnDetectionConfig(TurnDetectionConfig turnDetectionConfig) {
            this.turnDetectionConfig = turnDetectionConfig;
            return this;
        }

        /**
         * UserOfflineTimeout.
         */
        public Builder userOfflineTimeout(Integer userOfflineTimeout) {
            this.userOfflineTimeout = userOfflineTimeout;
            return this;
        }

        /**
         * UserOnlineTimeout.
         */
        public Builder userOnlineTimeout(Integer userOnlineTimeout) {
            this.userOnlineTimeout = userOnlineTimeout;
            return this;
        }

        /**
         * VcrConfig.
         */
        public Builder vcrConfig(VcrConfig vcrConfig) {
            this.vcrConfig = vcrConfig;
            return this;
        }

        /**
         * VoiceprintConfig.
         */
        public Builder voiceprintConfig(VoiceprintConfig voiceprintConfig) {
            this.voiceprintConfig = voiceprintConfig;
            return this;
        }

        /**
         * Volume.
         */
        public Builder volume(Long volume) {
            this.volume = volume;
            return this;
        }

        /**
         * WakeUpQuery.
         */
        public Builder wakeUpQuery(String wakeUpQuery) {
            this.wakeUpQuery = wakeUpQuery;
            return this;
        }

        /**
         * WorkflowOverrideParams.
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
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * Volume.
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
             * AsrHotWords.
             */
            public Builder asrHotWords(java.util.List<String> asrHotWords) {
                this.asrHotWords = asrHotWords;
                return this;
            }

            /**
             * AsrLanguageId.
             */
            public Builder asrLanguageId(String asrLanguageId) {
                this.asrLanguageId = asrLanguageId;
                return this;
            }

            /**
             * AsrMaxSilence.
             */
            public Builder asrMaxSilence(Integer asrMaxSilence) {
                this.asrMaxSilence = asrMaxSilence;
                return this;
            }

            /**
             * CustomParams.
             */
            public Builder customParams(String customParams) {
                this.customParams = customParams;
                return this;
            }

            /**
             * VadDuration.
             */
            public Builder vadDuration(Integer vadDuration) {
                this.vadDuration = vadDuration;
                return this;
            }

            /**
             * VadLevel.
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
             * Probability.
             */
            public Builder probability(Double probability) {
                this.probability = probability;
                return this;
            }

            /**
             * Text.
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

        @com.aliyun.core.annotation.NameInMap("WaitTime")
        private Integer waitTime;

        private LlmPending(Builder builder) {
            this.messages = builder.messages;
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
         * @return waitTime
         */
        public Integer getWaitTime() {
            return this.waitTime;
        }

        public static final class Builder {
            private java.util.List<Messages> messages; 
            private Integer waitTime; 

            private Builder() {
            } 

            private Builder(LlmPending model) {
                this.messages = model.messages;
                this.waitTime = model.waitTime;
            } 

            /**
             * Messages.
             */
            public Builder messages(java.util.List<Messages> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * WaitTime.
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
             * Probability.
             */
            public Builder probability(Double probability) {
                this.probability = probability;
                return this;
            }

            /**
             * Text.
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
        @com.aliyun.core.annotation.NameInMap("MaxRepeats")
        private Integer maxRepeats;

        @com.aliyun.core.annotation.NameInMap("Messages")
        private java.util.List<UserIdleMessages> messages;

        @com.aliyun.core.annotation.NameInMap("WaitTime")
        private Integer waitTime;

        private UserIdle(Builder builder) {
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
            private Integer maxRepeats; 
            private java.util.List<UserIdleMessages> messages; 
            private Integer waitTime; 

            private Builder() {
            } 

            private Builder(UserIdle model) {
                this.maxRepeats = model.maxRepeats;
                this.messages = model.messages;
                this.waitTime = model.waitTime;
            } 

            /**
             * MaxRepeats.
             */
            public Builder maxRepeats(Integer maxRepeats) {
                this.maxRepeats = maxRepeats;
                return this;
            }

            /**
             * Messages.
             */
            public Builder messages(java.util.List<UserIdleMessages> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * WaitTime.
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
             * LlmPending.
             */
            public Builder llmPending(LlmPending llmPending) {
                this.llmPending = llmPending;
                return this;
            }

            /**
             * UserIdle.
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

        private AvatarConfig(Builder builder) {
            this.avatarId = builder.avatarId;
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

        public static final class Builder {
            private String avatarId; 

            private Builder() {
            } 

            private Builder(AvatarConfig model) {
                this.avatarId = model.avatarId;
            } 

            /**
             * AvatarId.
             */
            public Builder avatarId(String avatarId) {
                this.avatarId = avatarId;
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
    public static class InterruptConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableVoiceInterrupt")
        private Boolean enableVoiceInterrupt;

        @com.aliyun.core.annotation.NameInMap("InterruptWords")
        private java.util.List<String> interruptWords;

        private InterruptConfig(Builder builder) {
            this.enableVoiceInterrupt = builder.enableVoiceInterrupt;
            this.interruptWords = builder.interruptWords;
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

        public static final class Builder {
            private Boolean enableVoiceInterrupt; 
            private java.util.List<String> interruptWords; 

            private Builder() {
            } 

            private Builder(InterruptConfig model) {
                this.enableVoiceInterrupt = model.enableVoiceInterrupt;
                this.interruptWords = model.interruptWords;
            } 

            /**
             * EnableVoiceInterrupt.
             */
            public Builder enableVoiceInterrupt(Boolean enableVoiceInterrupt) {
                this.enableVoiceInterrupt = enableVoiceInterrupt;
                return this;
            }

            /**
             * InterruptWords.
             */
            public Builder interruptWords(java.util.List<String> interruptWords) {
                this.interruptWords = interruptWords;
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
             * Function.
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * MatchFunction.
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
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Role.
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
             * BailianAppParams.
             */
            public Builder bailianAppParams(String bailianAppParams) {
                this.bailianAppParams = bailianAppParams;
                return this;
            }

            /**
             * FunctionMap.
             */
            public Builder functionMap(java.util.List<FunctionMap> functionMap) {
                this.functionMap = functionMap;
                return this;
            }

            /**
             * HistorySyncWithTTS.
             */
            public Builder historySyncWithTTS(Boolean historySyncWithTTS) {
                this.historySyncWithTTS = historySyncWithTTS;
                return this;
            }

            /**
             * LlmCompleteReply.
             */
            public Builder llmCompleteReply(Boolean llmCompleteReply) {
                this.llmCompleteReply = llmCompleteReply;
                return this;
            }

            /**
             * LlmHistory.
             */
            public Builder llmHistory(java.util.List<LlmHistory> llmHistory) {
                this.llmHistory = llmHistory;
                return this;
            }

            /**
             * LlmHistoryLimit.
             */
            public Builder llmHistoryLimit(Integer llmHistoryLimit) {
                this.llmHistoryLimit = llmHistoryLimit;
                return this;
            }

            /**
             * LlmSystemPrompt.
             */
            public Builder llmSystemPrompt(String llmSystemPrompt) {
                this.llmSystemPrompt = llmSystemPrompt;
                return this;
            }

            /**
             * OpenAIExtraQuery.
             */
            public Builder openAIExtraQuery(String openAIExtraQuery) {
                this.openAIExtraQuery = openAIExtraQuery;
                return this;
            }

            /**
             * OutputMaxDelay.
             */
            public Builder outputMaxDelay(Integer outputMaxDelay) {
                this.outputMaxDelay = outputMaxDelay;
                return this;
            }

            /**
             * OutputMinLength.
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
             * Pronunciation.
             */
            public Builder pronunciation(String pronunciation) {
                this.pronunciation = pronunciation;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Word.
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
             * Emotion.
             */
            public Builder emotion(String emotion) {
                this.emotion = emotion;
                return this;
            }

            /**
             * LanguageId.
             */
            public Builder languageId(String languageId) {
                this.languageId = languageId;
                return this;
            }

            /**
             * ModelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * PronunciationRules.
             */
            public Builder pronunciationRules(java.util.List<PronunciationRules> pronunciationRules) {
                this.pronunciationRules = pronunciationRules;
                return this;
            }

            /**
             * SpeechRate.
             */
            public Builder speechRate(Double speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * VoiceId.
             */
            public Builder voiceId(String voiceId) {
                this.voiceId = voiceId;
                return this;
            }

            /**
             * VoiceIdList.
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
        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("SemanticWaitDuration")
        private Integer semanticWaitDuration;

        @com.aliyun.core.annotation.NameInMap("TurnEndWords")
        private java.util.List<String> turnEndWords;

        private TurnDetectionConfig(Builder builder) {
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
            private String mode; 
            private Integer semanticWaitDuration; 
            private java.util.List<String> turnEndWords; 

            private Builder() {
            } 

            private Builder(TurnDetectionConfig model) {
                this.mode = model.mode;
                this.semanticWaitDuration = model.semanticWaitDuration;
                this.turnEndWords = model.turnEndWords;
            } 

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * SemanticWaitDuration.
             */
            public Builder semanticWaitDuration(Integer semanticWaitDuration) {
                this.semanticWaitDuration = semanticWaitDuration;
                return this;
            }

            /**
             * TurnEndWords.
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
             * Enabled.
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
             * Enabled.
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
             * CallbackDelay.
             */
            public Builder callbackDelay(Integer callbackDelay) {
                this.callbackDelay = callbackDelay;
                return this;
            }

            /**
             * Enabled.
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
             * Enabled.
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
             * Enabled.
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
             * CallbackDelay.
             */
            public Builder callbackDelay(Integer callbackDelay) {
                this.callbackDelay = callbackDelay;
                return this;
            }

            /**
             * Enabled.
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
             * Equipment.
             */
            public Builder equipment(Equipment equipment) {
                this.equipment = equipment;
                return this;
            }

            /**
             * HeadMotion.
             */
            public Builder headMotion(HeadMotion headMotion) {
                this.headMotion = headMotion;
                return this;
            }

            /**
             * InvalidFrameMotion.
             */
            public Builder invalidFrameMotion(InvalidFrameMotion invalidFrameMotion) {
                this.invalidFrameMotion = invalidFrameMotion;
                return this;
            }

            /**
             * LookAway.
             */
            public Builder lookAway(LookAway lookAway) {
                this.lookAway = lookAway;
                return this;
            }

            /**
             * PeopleCount.
             */
            public Builder peopleCount(PeopleCount peopleCount) {
                this.peopleCount = peopleCount;
                return this;
            }

            /**
             * StillFrameMotion.
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
        @com.aliyun.core.annotation.NameInMap("UseVoiceprint")
        private Boolean useVoiceprint;

        @com.aliyun.core.annotation.NameInMap("VoiceprintId")
        private String voiceprintId;

        private VoiceprintConfig(Builder builder) {
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
            private Boolean useVoiceprint; 
            private String voiceprintId; 

            private Builder() {
            } 

            private Builder(VoiceprintConfig model) {
                this.useVoiceprint = model.useVoiceprint;
                this.voiceprintId = model.voiceprintId;
            } 

            /**
             * UseVoiceprint.
             */
            public Builder useVoiceprint(Boolean useVoiceprint) {
                this.useVoiceprint = useVoiceprint;
                return this;
            }

            /**
             * VoiceprintId.
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
