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
 * {@link StartAgentRequest} extends {@link RequestModel}
 *
 * <p>StartAgentRequest</p>
 */
public class StartAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RtcConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private RtcConfig rtcConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceChatConfig")
    private VoiceChatConfig voiceChatConfig;

    private StartAgentRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.rtcConfig = builder.rtcConfig;
        this.taskId = builder.taskId;
        this.templateId = builder.templateId;
        this.voiceChatConfig = builder.voiceChatConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return rtcConfig
     */
    public RtcConfig getRtcConfig() {
        return this.rtcConfig;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return voiceChatConfig
     */
    public VoiceChatConfig getVoiceChatConfig() {
        return this.voiceChatConfig;
    }

    public static final class Builder extends Request.Builder<StartAgentRequest, Builder> {
        private String appId; 
        private String channelId; 
        private RtcConfig rtcConfig; 
        private String taskId; 
        private String templateId; 
        private VoiceChatConfig voiceChatConfig; 

        private Builder() {
            super();
        } 

        private Builder(StartAgentRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.rtcConfig = request.rtcConfig;
            this.taskId = request.taskId;
            this.templateId = request.templateId;
            this.voiceChatConfig = request.voiceChatConfig;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aoe****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourChannelId</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder rtcConfig(RtcConfig rtcConfig) {
            String rtcConfigShrink = shrink(rtcConfig, "RtcConfig", "json");
            this.putQueryParameter("RtcConfig", rtcConfigShrink);
            this.rtcConfig = rtcConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourTaskId</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>76dasgb****</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * VoiceChatConfig.
         */
        public Builder voiceChatConfig(VoiceChatConfig voiceChatConfig) {
            String voiceChatConfigShrink = shrink(voiceChatConfig, "VoiceChatConfig", "json");
            this.putQueryParameter("VoiceChatConfig", voiceChatConfigShrink);
            this.voiceChatConfig = voiceChatConfig;
            return this;
        }

        @Override
        public StartAgentRequest build() {
            return new StartAgentRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartAgentRequest} extends {@link TeaModel}
     *
     * <p>StartAgentRequest</p>
     */
    public static class RtcConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetUserIds")
        private java.util.List<String> targetUserIds;

        @com.aliyun.core.annotation.NameInMap("UserId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserInactivityTimeout")
        private Integer userInactivityTimeout;

        private RtcConfig(Builder builder) {
            this.targetUserIds = builder.targetUserIds;
            this.userId = builder.userId;
            this.userInactivityTimeout = builder.userInactivityTimeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RtcConfig create() {
            return builder().build();
        }

        /**
         * @return targetUserIds
         */
        public java.util.List<String> getTargetUserIds() {
            return this.targetUserIds;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userInactivityTimeout
         */
        public Integer getUserInactivityTimeout() {
            return this.userInactivityTimeout;
        }

        public static final class Builder {
            private java.util.List<String> targetUserIds; 
            private String userId; 
            private Integer userInactivityTimeout; 

            private Builder() {
            } 

            private Builder(RtcConfig model) {
                this.targetUserIds = model.targetUserIds;
                this.userId = model.userId;
                this.userInactivityTimeout = model.userInactivityTimeout;
            } 

            /**
             * TargetUserIds.
             */
            public Builder targetUserIds(java.util.List<String> targetUserIds) {
                this.targetUserIds = targetUserIds;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>423341</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserInactivityTimeout.
             */
            public Builder userInactivityTimeout(Integer userInactivityTimeout) {
                this.userInactivityTimeout = userInactivityTimeout;
                return this;
            }

            public RtcConfig build() {
                return new RtcConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartAgentRequest} extends {@link TeaModel}
     *
     * <p>StartAgentRequest</p>
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
     * {@link StartAgentRequest} extends {@link TeaModel}
     *
     * <p>StartAgentRequest</p>
     */
    public static class ASRConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LanguageHints")
        private java.util.List<String> languageHints;

        @com.aliyun.core.annotation.NameInMap("MaxSentenceSilence")
        private Integer maxSentenceSilence;

        @com.aliyun.core.annotation.NameInMap("SemanticPunctuationEnabled")
        private Boolean semanticPunctuationEnabled;

        @com.aliyun.core.annotation.NameInMap("SourceLanguage")
        private String sourceLanguage;

        @com.aliyun.core.annotation.NameInMap("VadConfig")
        private VadConfig vadConfig;

        @com.aliyun.core.annotation.NameInMap("VocabularyId")
        private String vocabularyId;

        private ASRConfig(Builder builder) {
            this.languageHints = builder.languageHints;
            this.maxSentenceSilence = builder.maxSentenceSilence;
            this.semanticPunctuationEnabled = builder.semanticPunctuationEnabled;
            this.sourceLanguage = builder.sourceLanguage;
            this.vadConfig = builder.vadConfig;
            this.vocabularyId = builder.vocabularyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ASRConfig create() {
            return builder().build();
        }

        /**
         * @return languageHints
         */
        public java.util.List<String> getLanguageHints() {
            return this.languageHints;
        }

        /**
         * @return maxSentenceSilence
         */
        public Integer getMaxSentenceSilence() {
            return this.maxSentenceSilence;
        }

        /**
         * @return semanticPunctuationEnabled
         */
        public Boolean getSemanticPunctuationEnabled() {
            return this.semanticPunctuationEnabled;
        }

        /**
         * @return sourceLanguage
         */
        public String getSourceLanguage() {
            return this.sourceLanguage;
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

        public static final class Builder {
            private java.util.List<String> languageHints; 
            private Integer maxSentenceSilence; 
            private Boolean semanticPunctuationEnabled; 
            private String sourceLanguage; 
            private VadConfig vadConfig; 
            private String vocabularyId; 

            private Builder() {
            } 

            private Builder(ASRConfig model) {
                this.languageHints = model.languageHints;
                this.maxSentenceSilence = model.maxSentenceSilence;
                this.semanticPunctuationEnabled = model.semanticPunctuationEnabled;
                this.sourceLanguage = model.sourceLanguage;
                this.vadConfig = model.vadConfig;
                this.vocabularyId = model.vocabularyId;
            } 

            /**
             * LanguageHints.
             */
            public Builder languageHints(java.util.List<String> languageHints) {
                this.languageHints = languageHints;
                return this;
            }

            /**
             * MaxSentenceSilence.
             */
            public Builder maxSentenceSilence(Integer maxSentenceSilence) {
                this.maxSentenceSilence = maxSentenceSilence;
                return this;
            }

            /**
             * SemanticPunctuationEnabled.
             */
            public Builder semanticPunctuationEnabled(Boolean semanticPunctuationEnabled) {
                this.semanticPunctuationEnabled = semanticPunctuationEnabled;
                return this;
            }

            /**
             * SourceLanguage.
             */
            public Builder sourceLanguage(String sourceLanguage) {
                this.sourceLanguage = sourceLanguage;
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

            public ASRConfig build() {
                return new ASRConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartAgentRequest} extends {@link TeaModel}
     *
     * <p>StartAgentRequest</p>
     */
    public static class AgentSilenceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertTimeout")
        private Integer alertTimeout;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private Integer strategy;

        @com.aliyun.core.annotation.NameInMap("WebhookTriggerTimeout")
        private Integer webhookTriggerTimeout;

        private AgentSilenceConfig(Builder builder) {
            this.alertTimeout = builder.alertTimeout;
            this.content = builder.content;
            this.enable = builder.enable;
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
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
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
            private Boolean enable; 
            private Integer strategy; 
            private Integer webhookTriggerTimeout; 

            private Builder() {
            } 

            private Builder(AgentSilenceConfig model) {
                this.alertTimeout = model.alertTimeout;
                this.content = model.content;
                this.enable = model.enable;
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
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
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
     * {@link StartAgentRequest} extends {@link TeaModel}
     *
     * <p>StartAgentRequest</p>
     */
    public static class AmbientSoundConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SoundId")
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
     * {@link StartAgentRequest} extends {@link TeaModel}
     *
     * <p>StartAgentRequest</p>
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
     * {@link StartAgentRequest} extends {@link TeaModel}
     *
     * <p>StartAgentRequest</p>
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
     * {@link StartAgentRequest} extends {@link TeaModel}
     *
     * <p>StartAgentRequest</p>
     */
    public static class LLMConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("HistoryDepth")
        private Integer historyDepth;

        @com.aliyun.core.annotation.NameInMap("MaxToken")
        private Integer maxToken;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("Params")
        private java.util.Map<String, ?> params;

        @com.aliyun.core.annotation.NameInMap("Prompt")
        private String prompt;

        @com.aliyun.core.annotation.NameInMap("Temperature")
        private Double temperature;

        @com.aliyun.core.annotation.NameInMap("ToolExecutionConfig")
        private Object toolExecutionConfig;

        @com.aliyun.core.annotation.NameInMap("Tools")
        private java.util.List<?> tools;

        @com.aliyun.core.annotation.NameInMap("TopP")
        private Double topP;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        private LLMConfig(Builder builder) {
            this.apiKey = builder.apiKey;
            this.appId = builder.appId;
            this.historyDepth = builder.historyDepth;
            this.maxToken = builder.maxToken;
            this.model = builder.model;
            this.params = builder.params;
            this.prompt = builder.prompt;
            this.temperature = builder.temperature;
            this.toolExecutionConfig = builder.toolExecutionConfig;
            this.tools = builder.tools;
            this.topP = builder.topP;
            this.url = builder.url;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LLMConfig create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
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
         * @return params
         */
        public java.util.Map<String, ?> getParams() {
            return this.params;
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
        public Double getTemperature() {
            return this.temperature;
        }

        /**
         * @return toolExecutionConfig
         */
        public Object getToolExecutionConfig() {
            return this.toolExecutionConfig;
        }

        /**
         * @return tools
         */
        public java.util.List<?> getTools() {
            return this.tools;
        }

        /**
         * @return topP
         */
        public Double getTopP() {
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
            private String apiKey; 
            private String appId; 
            private Integer historyDepth; 
            private Integer maxToken; 
            private String model; 
            private java.util.Map<String, ?> params; 
            private String prompt; 
            private Double temperature; 
            private Object toolExecutionConfig; 
            private java.util.List<?> tools; 
            private Double topP; 
            private String url; 
            private String vendor; 

            private Builder() {
            } 

            private Builder(LLMConfig model) {
                this.apiKey = model.apiKey;
                this.appId = model.appId;
                this.historyDepth = model.historyDepth;
                this.maxToken = model.maxToken;
                this.model = model.model;
                this.params = model.params;
                this.prompt = model.prompt;
                this.temperature = model.temperature;
                this.toolExecutionConfig = model.toolExecutionConfig;
                this.tools = model.tools;
                this.topP = model.topP;
                this.url = model.url;
                this.vendor = model.vendor;
            } 

            /**
             * ApiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>aoe****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
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
             * Params.
             */
            public Builder params(java.util.Map<String, ?> params) {
                this.params = params;
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
            public Builder temperature(Double temperature) {
                this.temperature = temperature;
                return this;
            }

            /**
             * ToolExecutionConfig.
             */
            public Builder toolExecutionConfig(Object toolExecutionConfig) {
                this.toolExecutionConfig = toolExecutionConfig;
                return this;
            }

            /**
             * Tools.
             */
            public Builder tools(java.util.List<?> tools) {
                this.tools = tools;
                return this;
            }

            /**
             * TopP.
             */
            public Builder topP(Double topP) {
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

            public LLMConfig build() {
                return new LLMConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartAgentRequest} extends {@link TeaModel}
     *
     * <p>StartAgentRequest</p>
     */
    public static class TTSConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("FilterBrackets")
        private java.util.List<Integer> filterBrackets;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("Pitch")
        private Double pitch;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private Double rate;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        @com.aliyun.core.annotation.NameInMap("Voice")
        private String voice;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Integer volume;

        private TTSConfig(Builder builder) {
            this.apiKey = builder.apiKey;
            this.filterBrackets = builder.filterBrackets;
            this.model = builder.model;
            this.pitch = builder.pitch;
            this.rate = builder.rate;
            this.vendor = builder.vendor;
            this.voice = builder.voice;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TTSConfig create() {
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
         * @return pitch
         */
        public Double getPitch() {
            return this.pitch;
        }

        /**
         * @return rate
         */
        public Double getRate() {
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
            private Double pitch; 
            private Double rate; 
            private String vendor; 
            private String voice; 
            private Integer volume; 

            private Builder() {
            } 

            private Builder(TTSConfig model) {
                this.apiKey = model.apiKey;
                this.filterBrackets = model.filterBrackets;
                this.model = model.model;
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
             * Pitch.
             */
            public Builder pitch(Double pitch) {
                this.pitch = pitch;
                return this;
            }

            /**
             * Rate.
             */
            public Builder rate(Double rate) {
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

            public TTSConfig build() {
                return new TTSConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartAgentRequest} extends {@link TeaModel}
     *
     * <p>StartAgentRequest</p>
     */
    public static class VoiceChatConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ASRConfig")
        private ASRConfig ASRConfig;

        @com.aliyun.core.annotation.NameInMap("AgentSilenceConfig")
        private AgentSilenceConfig agentSilenceConfig;

        @com.aliyun.core.annotation.NameInMap("AmbientSoundConfig")
        private AmbientSoundConfig ambientSoundConfig;

        @com.aliyun.core.annotation.NameInMap("BackChannelConfig")
        private BackChannelConfig backChannelConfig;

        @com.aliyun.core.annotation.NameInMap("ChatMode")
        private Integer chatMode;

        @com.aliyun.core.annotation.NameInMap("Greeting")
        private String greeting;

        @com.aliyun.core.annotation.NameInMap("InterruptConfig")
        private InterruptConfig interruptConfig;

        @com.aliyun.core.annotation.NameInMap("InterruptMode")
        private Integer interruptMode;

        @com.aliyun.core.annotation.NameInMap("LLMConfig")
        private LLMConfig LLMConfig;

        @com.aliyun.core.annotation.NameInMap("TTSConfig")
        private TTSConfig TTSConfig;

        private VoiceChatConfig(Builder builder) {
            this.ASRConfig = builder.ASRConfig;
            this.agentSilenceConfig = builder.agentSilenceConfig;
            this.ambientSoundConfig = builder.ambientSoundConfig;
            this.backChannelConfig = builder.backChannelConfig;
            this.chatMode = builder.chatMode;
            this.greeting = builder.greeting;
            this.interruptConfig = builder.interruptConfig;
            this.interruptMode = builder.interruptMode;
            this.LLMConfig = builder.LLMConfig;
            this.TTSConfig = builder.TTSConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoiceChatConfig create() {
            return builder().build();
        }

        /**
         * @return ASRConfig
         */
        public ASRConfig getASRConfig() {
            return this.ASRConfig;
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
         * @return LLMConfig
         */
        public LLMConfig getLLMConfig() {
            return this.LLMConfig;
        }

        /**
         * @return TTSConfig
         */
        public TTSConfig getTTSConfig() {
            return this.TTSConfig;
        }

        public static final class Builder {
            private ASRConfig ASRConfig; 
            private AgentSilenceConfig agentSilenceConfig; 
            private AmbientSoundConfig ambientSoundConfig; 
            private BackChannelConfig backChannelConfig; 
            private Integer chatMode; 
            private String greeting; 
            private InterruptConfig interruptConfig; 
            private Integer interruptMode; 
            private LLMConfig LLMConfig; 
            private TTSConfig TTSConfig; 

            private Builder() {
            } 

            private Builder(VoiceChatConfig model) {
                this.ASRConfig = model.ASRConfig;
                this.agentSilenceConfig = model.agentSilenceConfig;
                this.ambientSoundConfig = model.ambientSoundConfig;
                this.backChannelConfig = model.backChannelConfig;
                this.chatMode = model.chatMode;
                this.greeting = model.greeting;
                this.interruptConfig = model.interruptConfig;
                this.interruptMode = model.interruptMode;
                this.LLMConfig = model.LLMConfig;
                this.TTSConfig = model.TTSConfig;
            } 

            /**
             * ASRConfig.
             */
            public Builder ASRConfig(ASRConfig ASRConfig) {
                this.ASRConfig = ASRConfig;
                return this;
            }

            /**
             * AgentSilenceConfig.
             */
            public Builder agentSilenceConfig(AgentSilenceConfig agentSilenceConfig) {
                this.agentSilenceConfig = agentSilenceConfig;
                return this;
            }

            /**
             * AmbientSoundConfig.
             */
            public Builder ambientSoundConfig(AmbientSoundConfig ambientSoundConfig) {
                this.ambientSoundConfig = ambientSoundConfig;
                return this;
            }

            /**
             * BackChannelConfig.
             */
            public Builder backChannelConfig(BackChannelConfig backChannelConfig) {
                this.backChannelConfig = backChannelConfig;
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
             * InterruptMode.
             */
            public Builder interruptMode(Integer interruptMode) {
                this.interruptMode = interruptMode;
                return this;
            }

            /**
             * LLMConfig.
             */
            public Builder LLMConfig(LLMConfig LLMConfig) {
                this.LLMConfig = LLMConfig;
                return this;
            }

            /**
             * TTSConfig.
             */
            public Builder TTSConfig(TTSConfig TTSConfig) {
                this.TTSConfig = TTSConfig;
                return this;
            }

            public VoiceChatConfig build() {
                return new VoiceChatConfig(this);
            } 

        } 

    }
}
