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
 * {@link DescribeAppAgentTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppAgentTemplatesResponseBody</p>
 */
public class DescribeAppAgentTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Templates")
    private java.util.List<Templates> templates;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Long totalNum;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Long totalPage;

    private DescribeAppAgentTemplatesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templates = builder.templates;
        this.totalNum = builder.totalNum;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppAgentTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templates
     */
    public java.util.List<Templates> getTemplates() {
        return this.templates;
    }

    /**
     * @return totalNum
     */
    public Long getTotalNum() {
        return this.totalNum;
    }

    /**
     * @return totalPage
     */
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Templates> templates; 
        private Long totalNum; 
        private Long totalPage; 

        private Builder() {
        } 

        private Builder(DescribeAppAgentTemplatesResponseBody model) {
            this.requestId = model.requestId;
            this.templates = model.templates;
            this.totalNum = model.totalNum;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>30D41049-D02D-1C21-86AE-B3E5FD805C27</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Templates.
         */
        public Builder templates(java.util.List<Templates> templates) {
            this.templates = templates;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeAppAgentTemplatesResponseBody build() {
            return new DescribeAppAgentTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAppAgentTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppAgentTemplatesResponseBody</p>
     */
    public static class AgentSilenceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertTimeout")
        private Integer alertTimeout;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Strategy")
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
     * {@link DescribeAppAgentTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppAgentTemplatesResponseBody</p>
     */
    public static class VadConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InterruptSpeechDuration")
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
     * {@link DescribeAppAgentTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppAgentTemplatesResponseBody</p>
     */
    public static class WordWeights extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Lang")
        private String lang;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        @com.aliyun.core.annotation.NameInMap("Word")
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
             * Weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            /**
             * Word.
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
     * {@link DescribeAppAgentTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppAgentTemplatesResponseBody</p>
     */
    public static class AsrConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxSentenceSilence")
        private Integer maxSentenceSilence;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("VadConfig")
        private VadConfig vadConfig;

        @com.aliyun.core.annotation.NameInMap("VocabularyId")
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
             * Name.
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
     * {@link DescribeAppAgentTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppAgentTemplatesResponseBody</p>
     */
    public static class LlmConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentAppId")
        private String agentAppId;

        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("HistoryDepth")
        private Integer historyDepth;

        @com.aliyun.core.annotation.NameInMap("MaxToken")
        private Integer maxToken;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Prompt")
        private String prompt;

        @com.aliyun.core.annotation.NameInMap("Temperature")
        private Float temperature;

        @com.aliyun.core.annotation.NameInMap("TopP")
        private Float topP;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        private LlmConfig(Builder builder) {
            this.agentAppId = builder.agentAppId;
            this.apiKey = builder.apiKey;
            this.historyDepth = builder.historyDepth;
            this.maxToken = builder.maxToken;
            this.model = builder.model;
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
         * @return model
         */
        public String getModel() {
            return this.model;
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
            private String model; 
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
                this.model = model.model;
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
             * ApiKey.
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
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * Name.
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
     * {@link DescribeAppAgentTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppAgentTemplatesResponseBody</p>
     */
    public static class TtsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("FilterBrackets")
        private java.util.List<Integer> filterBrackets;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Pitch")
        private Float pitch;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private Float rate;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        @com.aliyun.core.annotation.NameInMap("Voice")
        private String voice;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Integer volume;

        private TtsConfig(Builder builder) {
            this.apiKey = builder.apiKey;
            this.filterBrackets = builder.filterBrackets;
            this.model = builder.model;
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
         * @return model
         */
        public String getModel() {
            return this.model;
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
            private String model; 
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
                this.model = model.model;
                this.name = model.name;
                this.pitch = model.pitch;
                this.rate = model.rate;
                this.vendor = model.vendor;
                this.voice = model.voice;
                this.volume = model.volume;
            } 

            /**
             * ApiKey.
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
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * Name.
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
             * Vendor.
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
    /**
     * 
     * {@link DescribeAppAgentTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppAgentTemplatesResponseBody</p>
     */
    public static class Templates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentSilenceConfig")
        private AgentSilenceConfig agentSilenceConfig;

        @com.aliyun.core.annotation.NameInMap("AsrConfig")
        private AsrConfig asrConfig;

        @com.aliyun.core.annotation.NameInMap("ChatMode")
        private Integer chatMode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Greeting")
        private String greeting;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InterruptMode")
        private Integer interruptMode;

        @com.aliyun.core.annotation.NameInMap("LlmConfig")
        private LlmConfig llmConfig;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TtsConfig")
        private TtsConfig ttsConfig;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private Templates(Builder builder) {
            this.agentSilenceConfig = builder.agentSilenceConfig;
            this.asrConfig = builder.asrConfig;
            this.chatMode = builder.chatMode;
            this.createTime = builder.createTime;
            this.greeting = builder.greeting;
            this.id = builder.id;
            this.interruptMode = builder.interruptMode;
            this.llmConfig = builder.llmConfig;
            this.name = builder.name;
            this.ttsConfig = builder.ttsConfig;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Templates create() {
            return builder().build();
        }

        /**
         * @return agentSilenceConfig
         */
        public AgentSilenceConfig getAgentSilenceConfig() {
            return this.agentSilenceConfig;
        }

        /**
         * @return asrConfig
         */
        public AsrConfig getAsrConfig() {
            return this.asrConfig;
        }

        /**
         * @return chatMode
         */
        public Integer getChatMode() {
            return this.chatMode;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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

        public static final class Builder {
            private AgentSilenceConfig agentSilenceConfig; 
            private AsrConfig asrConfig; 
            private Integer chatMode; 
            private String createTime; 
            private String greeting; 
            private String id; 
            private Integer interruptMode; 
            private LlmConfig llmConfig; 
            private String name; 
            private TtsConfig ttsConfig; 
            private Integer type; 

            private Builder() {
            } 

            private Builder(Templates model) {
                this.agentSilenceConfig = model.agentSilenceConfig;
                this.asrConfig = model.asrConfig;
                this.chatMode = model.chatMode;
                this.createTime = model.createTime;
                this.greeting = model.greeting;
                this.id = model.id;
                this.interruptMode = model.interruptMode;
                this.llmConfig = model.llmConfig;
                this.name = model.name;
                this.ttsConfig = model.ttsConfig;
                this.type = model.type;
            } 

            /**
             * AgentSilenceConfig.
             */
            public Builder agentSilenceConfig(AgentSilenceConfig agentSilenceConfig) {
                this.agentSilenceConfig = agentSilenceConfig;
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
             * ChatMode.
             */
            public Builder chatMode(Integer chatMode) {
                this.chatMode = chatMode;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * InterruptMode.
             */
            public Builder interruptMode(Integer interruptMode) {
                this.interruptMode = interruptMode;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
}
