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
    @com.aliyun.core.annotation.NameInMap("AsrConfig")
    private AsrConfig asrConfig;

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

    @com.aliyun.core.annotation.NameInMap("VoiceprintConfig")
    private VoiceprintConfig voiceprintConfig;

    @com.aliyun.core.annotation.NameInMap("Volume")
    private Long volume;

    @com.aliyun.core.annotation.NameInMap("WakeUpQuery")
    private String wakeUpQuery;

    @com.aliyun.core.annotation.NameInMap("WorkflowOverrideParams")
    private String workflowOverrideParams;

    private AIAgentConfig(Builder builder) {
        this.asrConfig = builder.asrConfig;
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
     * @return asrConfig
     */
    public AsrConfig getAsrConfig() {
        return this.asrConfig;
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
        private AsrConfig asrConfig; 
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
        private VoiceprintConfig voiceprintConfig; 
        private Long volume; 
        private String wakeUpQuery; 
        private String workflowOverrideParams; 

        private Builder() {
        } 

        private Builder(AIAgentConfig model) {
            this.asrConfig = model.asrConfig;
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
            this.voiceprintConfig = model.voiceprintConfig;
            this.volume = model.volume;
            this.wakeUpQuery = model.wakeUpQuery;
            this.workflowOverrideParams = model.workflowOverrideParams;
        } 

        /**
         * AsrConfig.
         */
        public Builder asrConfig(AsrConfig asrConfig) {
            this.asrConfig = asrConfig;
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
    public static class AsrConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrHotWords")
        private java.util.List<String> asrHotWords;

        @com.aliyun.core.annotation.NameInMap("AsrLanguageId")
        private String asrLanguageId;

        @com.aliyun.core.annotation.NameInMap("AsrMaxSilence")
        private Integer asrMaxSilence;

        @com.aliyun.core.annotation.NameInMap("VadLevel")
        private Integer vadLevel;

        private AsrConfig(Builder builder) {
            this.asrHotWords = builder.asrHotWords;
            this.asrLanguageId = builder.asrLanguageId;
            this.asrMaxSilence = builder.asrMaxSilence;
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
         * @return vadLevel
         */
        public Integer getVadLevel() {
            return this.vadLevel;
        }

        public static final class Builder {
            private java.util.List<String> asrHotWords; 
            private String asrLanguageId; 
            private Integer asrMaxSilence; 
            private Integer vadLevel; 

            private Builder() {
            } 

            private Builder(AsrConfig model) {
                this.asrHotWords = model.asrHotWords;
                this.asrLanguageId = model.asrLanguageId;
                this.asrMaxSilence = model.asrMaxSilence;
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

        @com.aliyun.core.annotation.NameInMap("LlmHistory")
        private java.util.List<LlmHistory> llmHistory;

        @com.aliyun.core.annotation.NameInMap("LlmHistoryLimit")
        private Integer llmHistoryLimit;

        @com.aliyun.core.annotation.NameInMap("LlmSystemPrompt")
        private String llmSystemPrompt;

        private LlmConfig(Builder builder) {
            this.bailianAppParams = builder.bailianAppParams;
            this.llmHistory = builder.llmHistory;
            this.llmHistoryLimit = builder.llmHistoryLimit;
            this.llmSystemPrompt = builder.llmSystemPrompt;
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

        public static final class Builder {
            private String bailianAppParams; 
            private java.util.List<LlmHistory> llmHistory; 
            private Integer llmHistoryLimit; 
            private String llmSystemPrompt; 

            private Builder() {
            } 

            private Builder(LlmConfig model) {
                this.bailianAppParams = model.bailianAppParams;
                this.llmHistory = model.llmHistory;
                this.llmHistoryLimit = model.llmHistoryLimit;
                this.llmSystemPrompt = model.llmSystemPrompt;
            } 

            /**
             * BailianAppParams.
             */
            public Builder bailianAppParams(String bailianAppParams) {
                this.bailianAppParams = bailianAppParams;
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
    public static class TtsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VoiceId")
        private String voiceId;

        @com.aliyun.core.annotation.NameInMap("VoiceIdList")
        private java.util.List<String> voiceIdList;

        private TtsConfig(Builder builder) {
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
            private String voiceId; 
            private java.util.List<String> voiceIdList; 

            private Builder() {
            } 

            private Builder(TtsConfig model) {
                this.voiceId = model.voiceId;
                this.voiceIdList = model.voiceIdList;
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
        @com.aliyun.core.annotation.NameInMap("TurnEndWords")
        private java.util.List<String> turnEndWords;

        private TurnDetectionConfig(Builder builder) {
            this.turnEndWords = builder.turnEndWords;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TurnDetectionConfig create() {
            return builder().build();
        }

        /**
         * @return turnEndWords
         */
        public java.util.List<String> getTurnEndWords() {
            return this.turnEndWords;
        }

        public static final class Builder {
            private java.util.List<String> turnEndWords; 

            private Builder() {
            } 

            private Builder(TurnDetectionConfig model) {
                this.turnEndWords = model.turnEndWords;
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
