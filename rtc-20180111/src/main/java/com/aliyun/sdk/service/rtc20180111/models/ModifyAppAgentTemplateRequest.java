// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link ModifyAppAgentTemplateRequest} extends {@link RequestModel}
 *
 * <p>ModifyAppAgentTemplateRequest</p>
 */
public class ModifyAppAgentTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentSilenceConfig")
    private AgentSilenceConfig agentSilenceConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AmbientSoundConfig")
    private AmbientSoundConfig ambientSoundConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsrConfig")
    private AsrConfig asrConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackChannelConfig")
    private BackChannelConfig backChannelConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChatMode")
    private Integer chatMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Greeting")
    private String greeting;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InterruptConfig")
    private InterruptConfig interruptConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InterruptMode")
    private Integer interruptMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LlmConfig")
    private LlmConfig llmConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtsConfig")
    private TtsConfig ttsConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    private ModifyAppAgentTemplateRequest(Builder builder) {
        super(builder);
        this.agentSilenceConfig = builder.agentSilenceConfig;
        this.ambientSoundConfig = builder.ambientSoundConfig;
        this.appId = builder.appId;
        this.asrConfig = builder.asrConfig;
        this.backChannelConfig = builder.backChannelConfig;
        this.chatMode = builder.chatMode;
        this.greeting = builder.greeting;
        this.id = builder.id;
        this.interruptConfig = builder.interruptConfig;
        this.interruptMode = builder.interruptMode;
        this.llmConfig = builder.llmConfig;
        this.name = builder.name;
        this.ttsConfig = builder.ttsConfig;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAppAgentTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSilenceConfig
     */
    public AgentSilenceConfig getAgentSilenceConfig() {
        return this.agentSilenceConfig;
    }

    /**
     * @return ambientSoundConfig
     */
    public AmbientSoundConfig getAmbientSoundConfig() {
        return this.ambientSoundConfig;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return asrConfig
     */
    public AsrConfig getAsrConfig() {
        return this.asrConfig;
    }

    /**
     * @return backChannelConfig
     */
    public BackChannelConfig getBackChannelConfig() {
        return this.backChannelConfig;
    }

    /**
     * @return chatMode
     */
    public Integer getChatMode() {
        return this.chatMode;
    }

    /**
     * @return greeting
     */
    public String getGreeting() {
        return this.greeting;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return interruptConfig
     */
    public InterruptConfig getInterruptConfig() {
        return this.interruptConfig;
    }

    /**
     * @return interruptMode
     */
    public Integer getInterruptMode() {
        return this.interruptMode;
    }

    /**
     * @return llmConfig
     */
    public LlmConfig getLlmConfig() {
        return this.llmConfig;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ttsConfig
     */
    public TtsConfig getTtsConfig() {
        return this.ttsConfig;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModifyAppAgentTemplateRequest, Builder> {
        private AgentSilenceConfig agentSilenceConfig; 
        private AmbientSoundConfig ambientSoundConfig; 
        private String appId; 
        private AsrConfig asrConfig; 
        private BackChannelConfig backChannelConfig; 
        private Integer chatMode; 
        private String greeting; 
        private String id; 
        private InterruptConfig interruptConfig; 
        private Integer interruptMode; 
        private LlmConfig llmConfig; 
        private String name; 
        private TtsConfig ttsConfig; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAppAgentTemplateRequest request) {
            super(request);
            this.agentSilenceConfig = request.agentSilenceConfig;
            this.ambientSoundConfig = request.ambientSoundConfig;
            this.appId = request.appId;
            this.asrConfig = request.asrConfig;
            this.backChannelConfig = request.backChannelConfig;
            this.chatMode = request.chatMode;
            this.greeting = request.greeting;
            this.id = request.id;
            this.interruptConfig = request.interruptConfig;
            this.interruptMode = request.interruptMode;
            this.llmConfig = request.llmConfig;
            this.name = request.name;
            this.ttsConfig = request.ttsConfig;
            this.type = request.type;
        } 

        /**
         * AgentSilenceConfig.
         */
        public Builder agentSilenceConfig(AgentSilenceConfig agentSilenceConfig) {
            String agentSilenceConfigShrink = shrink(agentSilenceConfig, "AgentSilenceConfig", "json");
            this.putQueryParameter("AgentSilenceConfig", agentSilenceConfigShrink);
            this.agentSilenceConfig = agentSilenceConfig;
            return this;
        }

        /**
         * AmbientSoundConfig.
         */
        public Builder ambientSoundConfig(AmbientSoundConfig ambientSoundConfig) {
            String ambientSoundConfigShrink = shrink(ambientSoundConfig, "AmbientSoundConfig", "json");
            this.putQueryParameter("AmbientSoundConfig", ambientSoundConfigShrink);
            this.ambientSoundConfig = ambientSoundConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ac7N****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AsrConfig.
         */
        public Builder asrConfig(AsrConfig asrConfig) {
            String asrConfigShrink = shrink(asrConfig, "AsrConfig", "json");
            this.putQueryParameter("AsrConfig", asrConfigShrink);
            this.asrConfig = asrConfig;
            return this;
        }

        /**
         * BackChannelConfig.
         */
        public Builder backChannelConfig(BackChannelConfig backChannelConfig) {
            String backChannelConfigShrink = shrink(backChannelConfig, "BackChannelConfig", "json");
            this.putQueryParameter("BackChannelConfig", backChannelConfigShrink);
            this.backChannelConfig = backChannelConfig;
            return this;
        }

        /**
         * ChatMode.
         */
        public Builder chatMode(Integer chatMode) {
            this.putQueryParameter("ChatMode", chatMode);
            this.chatMode = chatMode;
            return this;
        }

        /**
         * Greeting.
         */
        public Builder greeting(String greeting) {
            this.putQueryParameter("Greeting", greeting);
            this.greeting = greeting;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1231231312312131231</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * InterruptConfig.
         */
        public Builder interruptConfig(InterruptConfig interruptConfig) {
            String interruptConfigShrink = shrink(interruptConfig, "InterruptConfig", "json");
            this.putQueryParameter("InterruptConfig", interruptConfigShrink);
            this.interruptConfig = interruptConfig;
            return this;
        }

        /**
         * InterruptMode.
         */
        public Builder interruptMode(Integer interruptMode) {
            this.putQueryParameter("InterruptMode", interruptMode);
            this.interruptMode = interruptMode;
            return this;
        }

        /**
         * LlmConfig.
         */
        public Builder llmConfig(LlmConfig llmConfig) {
            String llmConfigShrink = shrink(llmConfig, "LlmConfig", "json");
            this.putQueryParameter("LlmConfig", llmConfigShrink);
            this.llmConfig = llmConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>智能体模版</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * TtsConfig.
         */
        public Builder ttsConfig(TtsConfig ttsConfig) {
            String ttsConfigShrink = shrink(ttsConfig, "TtsConfig", "json");
            this.putQueryParameter("TtsConfig", ttsConfigShrink);
            this.ttsConfig = ttsConfig;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifyAppAgentTemplateRequest build() {
            return new ModifyAppAgentTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyAppAgentTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyAppAgentTemplateRequest</p>
     */
    public static class AgentSilenceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertTimeout")
        private Integer alertTimeout;

        @com.aliyun.core.annotation.NameInMap("Content")
        @com.aliyun.core.annotation.Validation(maxLength = 2500)
        private String content;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        @com.aliyun.core.annotation.Validation(maximum = 2, minimum = 1)
        private Integer strategy;

        @com.aliyun.core.annotation.NameInMap("WebhookTriggerTimeout")
        private Integer webhookTriggerTimeout;

        private AgentSilenceConfig(Builder builder) {
            this.alertTimeout = builder.alertTimeout;
            this.content = builder.content;
            this.strategy = builder.strategy;
            this.webhookTriggerTimeout = builder.webhookTriggerTimeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentSilenceConfig create() {
            return builder().build();
        }

        /**
         * @return alertTimeout
         */
        public Integer getAlertTimeout() {
            return this.alertTimeout;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return strategy
         */
        public Integer getStrategy() {
            return this.strategy;
        }

        /**
         * @return webhookTriggerTimeout
         */
        public Integer getWebhookTriggerTimeout() {
            return this.webhookTriggerTimeout;
        }

        public static final class Builder {
            private Integer alertTimeout; 
            private String content; 
            private Integer strategy; 
            private Integer webhookTriggerTimeout; 

            private Builder() {
            } 

            private Builder(AgentSilenceConfig model) {
                this.alertTimeout = model.alertTimeout;
                this.content = model.content;
                this.strategy = model.strategy;
                this.webhookTriggerTimeout = model.webhookTriggerTimeout;
            } 

            /**
             * AlertTimeout.
             */
            public Builder alertTimeout(Integer alertTimeout) {
                this.alertTimeout = alertTimeout;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Strategy.
             */
            public Builder strategy(Integer strategy) {
                this.strategy = strategy;
                return this;
            }

            /**
             * WebhookTriggerTimeout.
             */
            public Builder webhookTriggerTimeout(Integer webhookTriggerTimeout) {
                this.webhookTriggerTimeout = webhookTriggerTimeout;
                return this;
            }

            public AgentSilenceConfig build() {
                return new AgentSilenceConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAppAgentTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyAppAgentTemplateRequest</p>
     */
    public static class AmbientSoundConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SoundId")
        @com.aliyun.core.annotation.Validation(maxLength = 30)
        private String soundId;

        @com.aliyun.core.annotation.NameInMap("Volume")
        @com.aliyun.core.annotation.Validation(maximum = 100)
        private Integer volume;

        private AmbientSoundConfig(Builder builder) {
            this.soundId = builder.soundId;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AmbientSoundConfig create() {
            return builder().build();
        }

        /**
         * @return soundId
         */
        public String getSoundId() {
            return this.soundId;
        }

        /**
         * @return volume
         */
        public Integer getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private String soundId; 
            private Integer volume; 

            private Builder() {
            } 

            private Builder(AmbientSoundConfig model) {
                this.soundId = model.soundId;
                this.volume = model.volume;
            } 

            /**
             * SoundId.
             */
            public Builder soundId(String soundId) {
                this.soundId = soundId;
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
     * {@link ModifyAppAgentTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyAppAgentTemplateRequest</p>
     */
    public static class VadConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InterruptSpeechDuration")
        @com.aliyun.core.annotation.Validation(maximum = 3000)
        private Integer interruptSpeechDuration;

        private VadConfig(Builder builder) {
            this.interruptSpeechDuration = builder.interruptSpeechDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VadConfig create() {
            return builder().build();
        }

        /**
         * @return interruptSpeechDuration
         */
        public Integer getInterruptSpeechDuration() {
            return this.interruptSpeechDuration;
        }

        public static final class Builder {
            private Integer interruptSpeechDuration; 

            private Builder() {
            } 

            private Builder(VadConfig model) {
                this.interruptSpeechDuration = model.interruptSpeechDuration;
            } 

            /**
             * InterruptSpeechDuration.
             */
            public Builder interruptSpeechDuration(Integer interruptSpeechDuration) {
                this.interruptSpeechDuration = interruptSpeechDuration;
                return this;
            }

            public VadConfig build() {
                return new VadConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAppAgentTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyAppAgentTemplateRequest</p>
     */
    public static class WordWeights extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Lang")
        private String lang;

        @com.aliyun.core.annotation.NameInMap("Weight")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer weight;

        @com.aliyun.core.annotation.NameInMap("Word")
        @com.aliyun.core.annotation.Validation(required = true)
        private String word;

        private WordWeights(Builder builder) {
            this.lang = builder.lang;
            this.weight = builder.weight;
            this.word = builder.word;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WordWeights create() {
            return builder().build();
        }

        /**
         * @return lang
         */
        public String getLang() {
            return this.lang;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        /**
         * @return word
         */
        public String getWord() {
            return this.word;
        }

        public static final class Builder {
            private String lang; 
            private Integer weight; 
            private String word; 

            private Builder() {
            } 

            private Builder(WordWeights model) {
                this.lang = model.lang;
                this.weight = model.weight;
                this.word = model.word;
            } 

            /**
             * Lang.
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>苹果</p>
             */
            public Builder word(String word) {
                this.word = word;
                return this;
            }

            public WordWeights build() {
                return new WordWeights(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAppAgentTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyAppAgentTemplateRequest</p>
     */
    public static class AsrConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxSentenceSilence")
        private Integer maxSentenceSilence;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
        private String name;

        @com.aliyun.core.annotation.NameInMap("VadConfig")
        private VadConfig vadConfig;

        @com.aliyun.core.annotation.NameInMap("VocabularyId")
        @com.aliyun.core.annotation.Validation(maxLength = 100)
        private String vocabularyId;

        @com.aliyun.core.annotation.NameInMap("WordWeights")
        private java.util.List<WordWeights> wordWeights;

        private AsrConfig(Builder builder) {
            this.maxSentenceSilence = builder.maxSentenceSilence;
            this.name = builder.name;
            this.vadConfig = builder.vadConfig;
            this.vocabularyId = builder.vocabularyId;
            this.wordWeights = builder.wordWeights;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AsrConfig create() {
            return builder().build();
        }

        /**
         * @return maxSentenceSilence
         */
        public Integer getMaxSentenceSilence() {
            return this.maxSentenceSilence;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return vadConfig
         */
        public VadConfig getVadConfig() {
            return this.vadConfig;
        }

        /**
         * @return vocabularyId
         */
        public String getVocabularyId() {
            return this.vocabularyId;
        }

        /**
         * @return wordWeights
         */
        public java.util.List<WordWeights> getWordWeights() {
            return this.wordWeights;
        }

        public static final class Builder {
            private Integer maxSentenceSilence; 
            private String name; 
            private VadConfig vadConfig; 
            private String vocabularyId; 
            private java.util.List<WordWeights> wordWeights; 

            private Builder() {
            } 

            private Builder(AsrConfig model) {
                this.maxSentenceSilence = model.maxSentenceSilence;
                this.name = model.name;
                this.vadConfig = model.vadConfig;
                this.vocabularyId = model.vocabularyId;
                this.wordWeights = model.wordWeights;
            } 

            /**
             * MaxSentenceSilence.
             */
            public Builder maxSentenceSilence(Integer maxSentenceSilence) {
                this.maxSentenceSilence = maxSentenceSilence;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>STT</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * VadConfig.
             */
            public Builder vadConfig(VadConfig vadConfig) {
                this.vadConfig = vadConfig;
                return this;
            }

            /**
             * VocabularyId.
             */
            public Builder vocabularyId(String vocabularyId) {
                this.vocabularyId = vocabularyId;
                return this;
            }

            /**
             * WordWeights.
             */
            public Builder wordWeights(java.util.List<WordWeights> wordWeights) {
                this.wordWeights = wordWeights;
                return this;
            }

            public AsrConfig build() {
                return new AsrConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAppAgentTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyAppAgentTemplateRequest</p>
     */
    public static class BackChannelConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserTurnEnd")
        private Boolean userTurnEnd;

        private BackChannelConfig(Builder builder) {
            this.userTurnEnd = builder.userTurnEnd;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackChannelConfig create() {
            return builder().build();
        }

        /**
         * @return userTurnEnd
         */
        public Boolean getUserTurnEnd() {
            return this.userTurnEnd;
        }

        public static final class Builder {
            private Boolean userTurnEnd; 

            private Builder() {
            } 

            private Builder(BackChannelConfig model) {
                this.userTurnEnd = model.userTurnEnd;
            } 

            /**
             * UserTurnEnd.
             */
            public Builder userTurnEnd(Boolean userTurnEnd) {
                this.userTurnEnd = userTurnEnd;
                return this;
            }

            public BackChannelConfig build() {
                return new BackChannelConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAppAgentTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyAppAgentTemplateRequest</p>
     */
    public static class InterruptConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SemanticsInterrupt")
        private Boolean semanticsInterrupt;

        private InterruptConfig(Builder builder) {
            this.semanticsInterrupt = builder.semanticsInterrupt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InterruptConfig create() {
            return builder().build();
        }

        /**
         * @return semanticsInterrupt
         */
        public Boolean getSemanticsInterrupt() {
            return this.semanticsInterrupt;
        }

        public static final class Builder {
            private Boolean semanticsInterrupt; 

            private Builder() {
            } 

            private Builder(InterruptConfig model) {
                this.semanticsInterrupt = model.semanticsInterrupt;
            } 

            /**
             * SemanticsInterrupt.
             */
            public Builder semanticsInterrupt(Boolean semanticsInterrupt) {
                this.semanticsInterrupt = semanticsInterrupt;
                return this;
            }

            public InterruptConfig build() {
                return new InterruptConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAppAgentTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyAppAgentTemplateRequest</p>
     */
    public static class LlmConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentAppId")
        @com.aliyun.core.annotation.Validation(maxLength = 500)
        private String agentAppId;

        @com.aliyun.core.annotation.NameInMap("ApiKey")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 200, minLength = 1)
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("HistoryDepth")
        private Integer historyDepth;

        @com.aliyun.core.annotation.NameInMap("MaxToken")
        private Integer maxToken;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Prompt")
        private String prompt;

        @com.aliyun.core.annotation.NameInMap("Temperature")
        private Float temperature;

        @com.aliyun.core.annotation.NameInMap("TopP")
        private Float topP;

        @com.aliyun.core.annotation.NameInMap("Url")
        @com.aliyun.core.annotation.Validation(maxLength = 100)
        private String url;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        private LlmConfig(Builder builder) {
            this.agentAppId = builder.agentAppId;
            this.apiKey = builder.apiKey;
            this.historyDepth = builder.historyDepth;
            this.maxToken = builder.maxToken;
            this.name = builder.name;
            this.prompt = builder.prompt;
            this.temperature = builder.temperature;
            this.topP = builder.topP;
            this.url = builder.url;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LlmConfig create() {
            return builder().build();
        }

        /**
         * @return agentAppId
         */
        public String getAgentAppId() {
            return this.agentAppId;
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return historyDepth
         */
        public Integer getHistoryDepth() {
            return this.historyDepth;
        }

        /**
         * @return maxToken
         */
        public Integer getMaxToken() {
            return this.maxToken;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return prompt
         */
        public String getPrompt() {
            return this.prompt;
        }

        /**
         * @return temperature
         */
        public Float getTemperature() {
            return this.temperature;
        }

        /**
         * @return topP
         */
        public Float getTopP() {
            return this.topP;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String agentAppId; 
            private String apiKey; 
            private Integer historyDepth; 
            private Integer maxToken; 
            private String name; 
            private String prompt; 
            private Float temperature; 
            private Float topP; 
            private String url; 
            private String vendor; 

            private Builder() {
            } 

            private Builder(LlmConfig model) {
                this.agentAppId = model.agentAppId;
                this.apiKey = model.apiKey;
                this.historyDepth = model.historyDepth;
                this.maxToken = model.maxToken;
                this.name = model.name;
                this.prompt = model.prompt;
                this.temperature = model.temperature;
                this.topP = model.topP;
                this.url = model.url;
                this.vendor = model.vendor;
            } 

            /**
             * AgentAppId.
             */
            public Builder agentAppId(String agentAppId) {
                this.agentAppId = agentAppId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ak-1213123123132123131</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * HistoryDepth.
             */
            public Builder historyDepth(Integer historyDepth) {
                this.historyDepth = historyDepth;
                return this;
            }

            /**
             * MaxToken.
             */
            public Builder maxToken(Integer maxToken) {
                this.maxToken = maxToken;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>llm</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Prompt.
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * Temperature.
             */
            public Builder temperature(Float temperature) {
                this.temperature = temperature;
                return this;
            }

            /**
             * TopP.
             */
            public Builder topP(Float topP) {
                this.topP = topP;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public LlmConfig build() {
                return new LlmConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAppAgentTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyAppAgentTemplateRequest</p>
     */
    public static class TtsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 200, minLength = 1)
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("FilterBrackets")
        private java.util.List<Integer> filterBrackets;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Pitch")
        private Float pitch;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private Float rate;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vendor;

        @com.aliyun.core.annotation.NameInMap("Voice")
        private String voice;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Integer volume;

        private TtsConfig(Builder builder) {
            this.apiKey = builder.apiKey;
            this.filterBrackets = builder.filterBrackets;
            this.name = builder.name;
            this.pitch = builder.pitch;
            this.rate = builder.rate;
            this.vendor = builder.vendor;
            this.voice = builder.voice;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TtsConfig create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return filterBrackets
         */
        public java.util.List<Integer> getFilterBrackets() {
            return this.filterBrackets;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pitch
         */
        public Float getPitch() {
            return this.pitch;
        }

        /**
         * @return rate
         */
        public Float getRate() {
            return this.rate;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        /**
         * @return voice
         */
        public String getVoice() {
            return this.voice;
        }

        /**
         * @return volume
         */
        public Integer getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private String apiKey; 
            private java.util.List<Integer> filterBrackets; 
            private String name; 
            private Float pitch; 
            private Float rate; 
            private String vendor; 
            private String voice; 
            private Integer volume; 

            private Builder() {
            } 

            private Builder(TtsConfig model) {
                this.apiKey = model.apiKey;
                this.filterBrackets = model.filterBrackets;
                this.name = model.name;
                this.pitch = model.pitch;
                this.rate = model.rate;
                this.vendor = model.vendor;
                this.voice = model.voice;
                this.volume = model.volume;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ak-1213123123132123131</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * FilterBrackets.
             */
            public Builder filterBrackets(java.util.List<Integer> filterBrackets) {
                this.filterBrackets = filterBrackets;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Tts</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Pitch.
             */
            public Builder pitch(Float pitch) {
                this.pitch = pitch;
                return this;
            }

            /**
             * Rate.
             */
            public Builder rate(Float rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun</p>
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            /**
             * Voice.
             */
            public Builder voice(String voice) {
                this.voice = voice;
                return this;
            }

            /**
             * Volume.
             */
            public Builder volume(Integer volume) {
                this.volume = volume;
                return this;
            }

            public TtsConfig build() {
                return new TtsConfig(this);
            } 

        } 

    }
}
