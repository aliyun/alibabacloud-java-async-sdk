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
         * <p>The list of templates.</p>
         */
        public Builder templates(java.util.List<Templates> templates) {
            this.templates = templates;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
             * <p>The timeout period for the silence alert, in seconds. This alert can be triggered multiple times. If the agent remains silent after the silence alert timeout, it will be triggered again upon the next timeout.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder alertTimeout(Integer alertTimeout) {
                this.alertTimeout = alertTimeout;
                return this;
            }

            /**
             * <p>The content of the silence prompt message.</p>
             * 
             * <strong>example:</strong>
             * <p>Hello, are you still there?</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The silence timeout handling strategy. Valid values:</p>
             * <ul>
             * <li>1: Broadcast the prompt message specified by content to the user via voice.</li>
             * <li>2: Send the prompt message specified by content and the conversation history to the LLM, and broadcast the reply generated by the model.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder strategy(Integer strategy) {
                this.strategy = strategy;
                return this;
            }

            /**
             * <p>The silence timeout period for triggering the agent silence timeout webhook, in seconds. This webhook can be triggered multiple times. If the agent remains silent after the webhook silence timeout, it will be triggered again upon the next timeout.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
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
    public static class AmbientSoundConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SoundId")
        private String soundId;

        @com.aliyun.core.annotation.NameInMap("Volume")
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
             * <p>The ID of the ambient sound.</p>
             * 
             * <strong>example:</strong>
             * <p>office</p>
             */
            public Builder soundId(String soundId) {
                this.soundId = soundId;
                return this;
            }

            /**
             * <p>The volume of the ambient sound.</p>
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
             * <p>The minimum duration of continuous human voice signal detection required to avoid false interruptions, in milliseconds. Valid values: 0 to 3000.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
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
             * <p>The language code.</p>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * <p>The weight of the hotword. Valid values: integers from 1 to 5. Common value: 4. If the effect is not obvious, you can increase the weight. However, a large weight may cause negative effects and lead to inaccurate recognition of other words.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            /**
             * <p>The text of the hotword. Each word can be up to 10 Chinese characters or English words in length.</p>
             * 
             * <strong>example:</strong>
             * <p>Dezhou</p>
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
             * <p>The threshold for detecting sentence pauses in speech, in milliseconds. Default value: 500. Valid values: 200 to 6000.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder maxSentenceSilence(Integer maxSentenceSilence) {
                this.maxSentenceSilence = maxSentenceSilence;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>ASR configuration</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The Voice Activity Detection (VAD) configuration.</p>
             */
            public Builder vadConfig(VadConfig vadConfig) {
                this.vadConfig = vadConfig;
                return this;
            }

            /**
             * <p>The ID of the hotword vocabulary.</p>
             * 
             * <strong>example:</strong>
             * <p>ecfadace11114cf08a7f07aceee798ad</p>
             */
            public Builder vocabularyId(String vocabularyId) {
                this.vocabularyId = vocabularyId;
                return this;
            }

            /**
             * <p>The hotword weights. Each vocabulary can contain up to 500 hotwords, and each hotword can be up to 10 Chinese characters in length. Hotwords must be UTF-8 encoded and cannot contain punctuation marks or special characters. Otherwise, the hotword feature will not take effect.</p>
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
             * <p>Specifies whether to enable backchanneling after the user finishes speaking.</p>
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
     * {@link DescribeAppAgentTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppAgentTemplatesResponseBody</p>
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
             * <p>Specifies whether semantic interruption is enabled.</p>
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
             * <p>The application ID of the agent when the model is a Model Studio agent.</p>
             * 
             * <strong>example:</strong>
             * <p>1233312</p>
             */
            public Builder agentAppId(String agentAppId) {
                this.agentAppId = agentAppId;
                return this;
            }

            /**
             * <p>The API key required by the LLM service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>qW8GpBOdHK/pv9gdUSVLvQ==</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>The number of historical conversation turns provided to the LLM. Maximum value: 100. Default value: 3.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder historyDepth(Integer historyDepth) {
                this.historyDepth = historyDepth;
                return this;
            }

            /**
             * <p>The maximum number of tokens for the output text. Default value: 8192.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder maxToken(Integer maxToken) {
                this.maxToken = maxToken;
                return this;
            }

            /**
             * <p>The model provided by Alibaba Cloud Model Studio. Currently, qwen-plus and deepseek-r1 are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>deepseek-r1</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>llm</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The prompt for the large language model. The maximum length is 5,000 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>You are a senior psychologist</p>
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * <p>The sampling temperature. Valid values: 0 to 2 (exclusive). Default value: 0.7.</p>
             * 
             * <strong>example:</strong>
             * <p>0.8</p>
             */
            public Builder temperature(Float temperature) {
                this.temperature = temperature;
                return this;
            }

            /**
             * <p>The top-p sampling range. Valid values: (0, 1]. Default value: 0.8.</p>
             * 
             * <strong>example:</strong>
             * <p>0.8</p>
             */
            public Builder topP(Float topP) {
                this.topP = topP;
                return this;
            }

            /**
             * <p>The endpoint URL used to connect to a third-party large language model.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://test.com">https://test.com</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The vendor. Currently, Alibaba Cloud Model Studio and third-party configurations that comply with the OpenAI API specification are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun</p>
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
             * <p>The API key required by the LLM service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>N5448VFGI2mXJU8a/A03VQ==</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>The bracket filtering settings. Valid values:</p>
             * <ul>
             * <li>1: Chinese parentheses （）</li>
             * <li>2: English parentheses ()</li>
             * <li>3: Chinese square brackets 【】</li>
             * <li>4: English square brackets []</li>
             * <li>5: English curly braces {}</li>
             * </ul>
             */
            public Builder filterBrackets(java.util.List<Integer> filterBrackets) {
                this.filterBrackets = filterBrackets;
                return this;
            }

            /**
             * <p>The model provided by Alibaba Cloud Model Studio. Currently, only the cosyvoice-v1 model is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>cosyvoice-v1</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>Tts</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The pitch. Valid values: 0.5 to 2.0. Default value: 1.0.</p>
             * 
             * <strong>example:</strong>
             * <p>0.8</p>
             */
            public Builder pitch(Float pitch) {
                this.pitch = pitch;
                return this;
            }

            /**
             * <p>The speech rate. Valid values: 0.5 to 2.0. Default value: 1.0.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder rate(Float rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>The vendor. Currently, only Alibaba Cloud Model Studio is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun</p>
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            /**
             * <p>The voice. Default value: longxiaoxia. Valid values:</p>
             * <ul>
             * <li>longwan</li>
             * <li>longcheng</li>
             * <li>longhua</li>
             * <li>longxiaochun</li>
             * <li>longxiaoxia</li>
             * <li>longxiaocheng</li>
             * <li>longxiaobai</li>
             * <li>longlaotie</li>
             * <li>longshu</li>
             * <li>longshuo</li>
             * <li>longjing</li>
             * <li>longmiao</li>
             * <li>longyue</li>
             * <li>longyuan</li>
             * <li>longfei</li>
             * <li>longjielidou</li>
             * <li>longtong</li>
             * <li>longxiang</li>
             * <li>loongstella</li>
             * <li>loongbella</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>longwan</p>
             */
            public Builder voice(String voice) {
                this.voice = voice;
                return this;
            }

            /**
             * <p>The volume. Valid values: 0 to 100. Default value: 50.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
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

        @com.aliyun.core.annotation.NameInMap("AmbientSoundConfig")
        private AmbientSoundConfig ambientSoundConfig;

        @com.aliyun.core.annotation.NameInMap("AsrConfig")
        private AsrConfig asrConfig;

        @com.aliyun.core.annotation.NameInMap("BackChannelConfig")
        private BackChannelConfig backChannelConfig;

        @com.aliyun.core.annotation.NameInMap("ChatMode")
        private Integer chatMode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EnableVideoUnderstanding")
        private Boolean enableVideoUnderstanding;

        @com.aliyun.core.annotation.NameInMap("Greeting")
        private String greeting;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InterruptConfig")
        private InterruptConfig interruptConfig;

        @com.aliyun.core.annotation.NameInMap("InterruptMode")
        private Integer interruptMode;

        @com.aliyun.core.annotation.NameInMap("LlmConfig")
        private LlmConfig llmConfig;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PreferVideo")
        private Integer preferVideo;

        @com.aliyun.core.annotation.NameInMap("TtsConfig")
        private TtsConfig ttsConfig;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private Templates(Builder builder) {
            this.agentSilenceConfig = builder.agentSilenceConfig;
            this.ambientSoundConfig = builder.ambientSoundConfig;
            this.asrConfig = builder.asrConfig;
            this.backChannelConfig = builder.backChannelConfig;
            this.chatMode = builder.chatMode;
            this.createTime = builder.createTime;
            this.enableVideoUnderstanding = builder.enableVideoUnderstanding;
            this.greeting = builder.greeting;
            this.id = builder.id;
            this.interruptConfig = builder.interruptConfig;
            this.interruptMode = builder.interruptMode;
            this.llmConfig = builder.llmConfig;
            this.name = builder.name;
            this.preferVideo = builder.preferVideo;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return enableVideoUnderstanding
         */
        public Boolean getEnableVideoUnderstanding() {
            return this.enableVideoUnderstanding;
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
         * @return preferVideo
         */
        public Integer getPreferVideo() {
            return this.preferVideo;
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
            private AmbientSoundConfig ambientSoundConfig; 
            private AsrConfig asrConfig; 
            private BackChannelConfig backChannelConfig; 
            private Integer chatMode; 
            private String createTime; 
            private Boolean enableVideoUnderstanding; 
            private String greeting; 
            private String id; 
            private InterruptConfig interruptConfig; 
            private Integer interruptMode; 
            private LlmConfig llmConfig; 
            private String name; 
            private Integer preferVideo; 
            private TtsConfig ttsConfig; 
            private Integer type; 

            private Builder() {
            } 

            private Builder(Templates model) {
                this.agentSilenceConfig = model.agentSilenceConfig;
                this.ambientSoundConfig = model.ambientSoundConfig;
                this.asrConfig = model.asrConfig;
                this.backChannelConfig = model.backChannelConfig;
                this.chatMode = model.chatMode;
                this.createTime = model.createTime;
                this.enableVideoUnderstanding = model.enableVideoUnderstanding;
                this.greeting = model.greeting;
                this.id = model.id;
                this.interruptConfig = model.interruptConfig;
                this.interruptMode = model.interruptMode;
                this.llmConfig = model.llmConfig;
                this.name = model.name;
                this.preferVideo = model.preferVideo;
                this.ttsConfig = model.ttsConfig;
                this.type = model.type;
            } 

            /**
             * <p>The silence configuration for the agent.</p>
             */
            public Builder agentSilenceConfig(AgentSilenceConfig agentSilenceConfig) {
                this.agentSilenceConfig = agentSilenceConfig;
                return this;
            }

            /**
             * <p>The ambient sound configuration.</p>
             */
            public Builder ambientSoundConfig(AmbientSoundConfig ambientSoundConfig) {
                this.ambientSoundConfig = ambientSoundConfig;
                return this;
            }

            /**
             * <p>The speech-to-text configuration.</p>
             */
            public Builder asrConfig(AsrConfig asrConfig) {
                this.asrConfig = asrConfig;
                return this;
            }

            /**
             * <p>The backchannel configuration.</p>
             */
            public Builder backChannelConfig(BackChannelConfig backChannelConfig) {
                this.backChannelConfig = backChannelConfig;
                return this;
            }

            /**
             * <p>The conversation mode. Valid values:</p>
             * <ul>
             * <li>1: natural conversation mode (default)</li>
             * <li>2: walkie-talkie mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder chatMode(Integer chatMode) {
                this.chatMode = chatMode;
                return this;
            }

            /**
             * <p>The creation time. Format: yyyy-MM-ddTHH:mm:ssZ (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-04T06:22:15Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Specifies whether to enable video understanding. If enabled, the large language model must support multimodal data.</p>
             */
            public Builder enableVideoUnderstanding(Boolean enableVideoUnderstanding) {
                this.enableVideoUnderstanding = enableVideoUnderstanding;
                return this;
            }

            /**
             * <p>The greeting.</p>
             * 
             * <strong>example:</strong>
             * <p>Hello, robot</p>
             */
            public Builder greeting(String greeting) {
                this.greeting = greeting;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>wv7N****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The interruption configuration.</p>
             */
            public Builder interruptConfig(InterruptConfig interruptConfig) {
                this.interruptConfig = interruptConfig;
                return this;
            }

            /**
             * <p>The interruption mode. Valid values:</p>
             * <ul>
             * <li>1: Allow interruption (default).</li>
             * <li>2: Disable interruption.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder interruptMode(Integer interruptMode) {
                this.interruptMode = interruptMode;
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
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The preferred video stream for the agent to process when visual understanding is enabled. The agent can process only one video stream. When both the camera stream and the screen sharing stream are pushed, valid values are:</p>
             * <ul>
             * <li><p>1: The agent prioritizes the camera stream.</p>
             * </li>
             * <li><p>2: The agent prioritizes the screen sharing stream.</p>
             * </li>
             * </ul>
             * <p>Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder preferVideo(Integer preferVideo) {
                this.preferVideo = preferVideo;
                return this;
            }

            /**
             * <p>The text-to-speech settings.</p>
             */
            public Builder ttsConfig(TtsConfig ttsConfig) {
                this.ttsConfig = ttsConfig;
                return this;
            }

            /**
             * <p>The type of the agent. Valid values:</p>
             * <ul>
             * <li>1: Voice call (default).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
