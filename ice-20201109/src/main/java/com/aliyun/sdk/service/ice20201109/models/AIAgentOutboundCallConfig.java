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

    @com.aliyun.core.annotation.NameInMap("TtsConfig")
    private TtsConfig ttsConfig;

    @com.aliyun.core.annotation.NameInMap("TurnDetectionConfig")
    private TurnDetectionConfig turnDetectionConfig;

    private AIAgentOutboundCallConfig(Builder builder) {
        this.ambientSoundConfig = builder.ambientSoundConfig;
        this.asrConfig = builder.asrConfig;
        this.enableIntelligentSegment = builder.enableIntelligentSegment;
        this.experimentalConfig = builder.experimentalConfig;
        this.greeting = builder.greeting;
        this.greetingDelay = builder.greetingDelay;
        this.interruptConfig = builder.interruptConfig;
        this.llmConfig = builder.llmConfig;
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
        private Boolean enableIntelligentSegment; 
        private String experimentalConfig; 
        private String greeting; 
        private Integer greetingDelay; 
        private InterruptConfig interruptConfig; 
        private LlmConfig llmConfig; 
        private TtsConfig ttsConfig; 
        private TurnDetectionConfig turnDetectionConfig; 

        private Builder() {
        } 

        private Builder(AIAgentOutboundCallConfig model) {
            this.ambientSoundConfig = model.ambientSoundConfig;
            this.asrConfig = model.asrConfig;
            this.enableIntelligentSegment = model.enableIntelligentSegment;
            this.experimentalConfig = model.experimentalConfig;
            this.greeting = model.greeting;
            this.greetingDelay = model.greetingDelay;
            this.interruptConfig = model.interruptConfig;
            this.llmConfig = model.llmConfig;
            this.ttsConfig = model.ttsConfig;
            this.turnDetectionConfig = model.turnDetectionConfig;
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
         * EnableIntelligentSegment.
         */
        public Builder enableIntelligentSegment(Boolean enableIntelligentSegment) {
            this.enableIntelligentSegment = enableIntelligentSegment;
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
         * Greeting.
         */
        public Builder greeting(String greeting) {
            this.greeting = greeting;
            return this;
        }

        /**
         * GreetingDelay.
         */
        public Builder greetingDelay(Integer greetingDelay) {
            this.greetingDelay = greetingDelay;
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
     * {@link AIAgentOutboundCallConfig} extends {@link TeaModel}
     *
     * <p>AIAgentOutboundCallConfig</p>
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
     * {@link AIAgentOutboundCallConfig} extends {@link TeaModel}
     *
     * <p>AIAgentOutboundCallConfig</p>
     */
    public static class LlmConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BailianAppParams")
        private String bailianAppParams;

        @com.aliyun.core.annotation.NameInMap("FunctionMap")
        private java.util.List<FunctionMap> functionMap;

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
            public Builder outputMaxDelay(String outputMaxDelay) {
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
     * {@link AIAgentOutboundCallConfig} extends {@link TeaModel}
     *
     * <p>AIAgentOutboundCallConfig</p>
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
}
