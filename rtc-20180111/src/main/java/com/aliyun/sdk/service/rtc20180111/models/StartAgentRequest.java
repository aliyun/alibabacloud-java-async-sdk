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
         * <p>The application ID. You can create and query the ID in the console. Only a single ID is supported.</p>
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
         * <p>The ID of the channel to join. Only a single ID is supported.</p>
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
         * <p>The configuration for the agent to join a Real-Time Communication (RTC) channel.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder rtcConfig(RtcConfig rtcConfig) {
            String rtcConfigShrink = shrink(rtcConfig, "RtcConfig", "json");
            this.putQueryParameter("RtcConfig", rtcConfigShrink);
            this.rtcConfig = rtcConfig;
            return this;
        }

        /**
         * <p>The task ID.</p>
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
         * <p>The template ID.</p>
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
         * <p>The configuration for AI voice chat.</p>
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
             * <p>The list of user IDs subscribed by the agent. Currently, only one user ID is supported.</p>
             */
            public Builder targetUserIds(java.util.List<String> targetUserIds) {
                this.targetUserIds = targetUserIds;
                return this;
            }

            /**
             * <p>The user ID of the agent in the RTC channel.</p>
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
             * <p>The maximum duration threshold for user inactivity, in seconds.
             * When the duration of any of the following states reaches this threshold, the agent automatically stops and exits the channel:</p>
             * <ol>
             * <li>All users in the targetUserIds list have left the channel.</li>
             * <li>The users in the targetUserIds list have not joined the channel.</li>
             * </ol>
             * <p>Default value: 30.
             * Valid values: 5 to 180.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
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
             * <p>The minimum duration of continuous human voice signals required to avoid false interruptions, in milliseconds.
             * Valid values: 0 to 3000.
             * Default value: 300.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
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
             * <p>If this parameter is not specified, the model automatically identifies the language.
             * Currently supported language codes:</p>
             * <ul>
             * <li>zh: Chinese, including Mandarin and dialects such as Shanghainese, Wu, Minnan, Northeastern, Gansu, Guizhou, Henan, Hubei, Hunan, Jiangxi, Ningxia, Shanxi, Shaanxi, Shandong, Sichuan, Tianjin, Yunnan, and Cantonese.</li>
             * <li>en: English.</li>
             * <li>ja: Japanese.</li>
             * <li>yue: Cantonese.</li>
             * <li>ko: Korean.</li>
             * </ul>
             */
            public Builder languageHints(java.util.List<String> languageHints) {
                this.languageHints = languageHints;
                return this;
            }

            /**
             * <p>The voice segmentation detection threshold. Default value: 800. Unit: milliseconds. Recommended range: 200 to 6000.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder maxSentenceSilence(Integer maxSentenceSilence) {
                this.maxSentenceSilence = maxSentenceSilence;
                return this;
            }

            /**
             * <p>Specifies whether semantic or voice segmentation is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder semanticPunctuationEnabled(Boolean semanticPunctuationEnabled) {
                this.semanticPunctuationEnabled = semanticPunctuationEnabled;
                return this;
            }

            /**
             * <p>No configuration is required.</p>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
             */
            public Builder sourceLanguage(String sourceLanguage) {
                this.sourceLanguage = sourceLanguage;
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
             * <p>The ID of the supported hot word.</p>
             * 
             * <strong>example:</strong>
             * <p>vocab-xxx-24ee19fa8cfb4d52902170a0xxxxxxxx</p>
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
             * <p>The timeout period for silence reminders, in seconds.
             * This reminder can be triggered multiple times. If the agent remains silent after a silence reminder timeout, the reminder is triggered again upon the next timeout.
             * Valid values: 5 to 600.
             * Default value: 0. A value of 0 indicates that no reminder is sent.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder alertTimeout(Integer alertTimeout) {
                this.alertTimeout = alertTimeout;
                return this;
            }

            /**
             * <p>The content of the silence prompt message.</p>
             * 
             * <strong>example:</strong>
             * <p>**</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The switch.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The script strategy for silence reminders. Valid values:</p>
             * <ul>
             * <li>1: Broadcast the prompt message specified by Content to the user by voice.</li>
             * <li>2: Send the prompt message specified by Content and the conversation history to the LLM, and broadcast the generated reply by voice.
             * Default value: 1.</li>
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
             * <p>The silence timeout period for triggering the agent silence timeout webhook, in seconds.
             * This webhook can be triggered multiple times. If the agent remains silent after a webhook silence timeout, the webhook is triggered again upon the next timeout.
             * Valid values: 10 to 600.
             * Default value: 0. A value of 0 indicates that the webhook is not triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * <p>The ambient sound ID. Built-in and download modes are planned. Currently, only the built-in mode is supported.</p>
             * <ul>
             * <li>If this parameter is not specified or is left empty, ambient sound is disabled.</li>
             * <li>Built-in mode: The agent provides the following default ambient sounds: white_noise (white noise) and office (office environment).</li>
             * <li>Download mode: You can specify a custom soundId in the console (which must be different from built-in IDs) and provide a URL. The agent will download and bind the sound internally.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>white_noise</p>
             */
            public Builder soundId(String soundId) {
                this.soundId = soundId;
                return this;
            }

            /**
             * <p>The volume of the ambient sound.
             * Default value: 50 (original volume).
             * Valid values: 0 to 100.</p>
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
     * {@link StartAgentRequest} extends {@link TeaModel}
     *
     * <p>StartAgentRequest</p>
     */
    public static class BackChannelConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserTurnEnd")
        private Boolean userTurnEnd;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private BackChannelConfig(Builder builder) {
            this.userTurnEnd = builder.userTurnEnd;
            this.version = builder.version;
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

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean userTurnEnd; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(BackChannelConfig model) {
                this.userTurnEnd = model.userTurnEnd;
                this.version = model.version;
            } 

            /**
             * <p>Specifies whether to enable backchannel responses after the user finishes speaking. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder userTurnEnd(Boolean userTurnEnd) {
                this.userTurnEnd = userTurnEnd;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
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
             * <p>Specifies whether to enable semantic interruption. Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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

        @com.aliyun.core.annotation.NameInMap("BizParams")
        private Object bizParams;

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
            this.bizParams = builder.bizParams;
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
         * @return bizParams
         */
        public Object getBizParams() {
            return this.bizParams;
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
            private Object bizParams; 
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
                this.bizParams = model.bizParams;
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
             * <p>The API key of the service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxxxxxxx</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>The agent application ID. You must specify either Model or AppId. If both are specified, AppId takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>e****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The custom parameters.</p>
             */
            public Builder bizParams(Object bizParams) {
                this.bizParams = bizParams;
                return this;
            }

            /**
             * <p>The number of historical conversation turns provided to the LLM.
             * Default value: 3.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder historyDepth(Integer historyDepth) {
                this.historyDepth = historyDepth;
                return this;
            }

            /**
             * <p>The maximum number of tokens for the output text.
             * Default value: 8192.
             * The maximum value for DeepSeek and Qwen models is 8192.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder maxToken(Integer maxToken) {
                this.maxToken = maxToken;
                return this;
            }

            /**
             * <p>The model name.
             * Supported models under the aliyun provider:
             * [&quot;qwen-plus&quot;, &quot;deepseek-r1&quot;, &quot;qwen-omni-turbo&quot;]</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The custom user parameters in key-value pairs. This parameter is deprecated. Use the BizParams parameter instead.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;verification_code&quot;: &quot;xxx&quot;}</p>
             */
            public Builder params(java.util.Map<String, ?> params) {
                this.params = params;
                return this;
            }

            /**
             * <p>The prompt used to instruct the model on the role or behavior to adopt.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx</p>
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * <p>The sampling temperature used to control the randomness and creativity of the generated text. A higher value indicates higher randomness.
             * Default value: 0.7.
             * Valid values: 0 to 2, excluding 2.
             * Note: This parameter does not take effect for deepseek-r1.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7</p>
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
             * <p>The sampling range used to control the diversity of output tokens. The model samples from tokens whose cumulative probability exceeds this value to ensure the sampling range is not too broad. A higher value indicates a richer variety of output tokens.
             * Valid values: 0 to 1, excluding 0.
             * Default value: 0.8.</p>
             * 
             * <strong>example:</strong>
             * <p>0.8</p>
             */
            public Builder topP(Double topP) {
                this.topP = topP;
                return this;
            }

            /**
             * <p>The endpoint URL for integrating a third-party LLM.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxxxx">https://xxxxx</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The name of the service provider when a cloud service provider is integrated. Examples: aliyun for Model Studio, thirdparty.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun</p>
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
             * <p>The API key of the service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxx</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>The configuration to filter out characters within specified brackets from text-to-speech conversion.</p>
             * 
             * <strong>example:</strong>
             * <p>[1,2]</p>
             */
            public Builder filterBrackets(java.util.List<Integer> filterBrackets) {
                this.filterBrackets = filterBrackets;
                return this;
            }

            /**
             * <p>The model name. Example: cosyvoice-v1.</p>
             * 
             * <strong>example:</strong>
             * <p>cosyvoice-v1</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The pitch.
             * Valid values: 0.5 to 2.0.
             * Default value: 1.0.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pitch(Double pitch) {
                this.pitch = pitch;
                return this;
            }

            /**
             * <p>The speech rate.
             * Valid values: 0.5 to 2.0.
             * Default value: 1.0.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder rate(Double rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>The service provider. Example: aliyun for Model Studio.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun</p>
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            /**
             * <p>The voice. If you select the Alibaba Cloud cosyvoice-v1 model, the default voice is longxiaoxia.
             * Available voices:
             * longwan, longcheng, longhua, longxiaochun, longxiaoxia, longxiaocheng, longxiaobai, longlaotie, longshu, longshuo, longjing, longmiao, longyue, longyuan, longfei, longjielidou, longtong, longxiang, loongstella, and loongbella.</p>
             * 
             * <strong>example:</strong>
             * <p>longxiaoxia</p>
             */
            public Builder voice(String voice) {
                this.voice = voice;
                return this;
            }

            /**
             * <p>The volume.
             * Valid values: 0 to 100.
             * Default value: 50.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
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

        @com.aliyun.core.annotation.NameInMap("EnableVideoUnderstanding")
        private Boolean enableVideoUnderstanding;

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

        @com.aliyun.core.annotation.NameInMap("preferVideo")
        private Integer preferVideo;

        private VoiceChatConfig(Builder builder) {
            this.ASRConfig = builder.ASRConfig;
            this.agentSilenceConfig = builder.agentSilenceConfig;
            this.ambientSoundConfig = builder.ambientSoundConfig;
            this.backChannelConfig = builder.backChannelConfig;
            this.chatMode = builder.chatMode;
            this.enableVideoUnderstanding = builder.enableVideoUnderstanding;
            this.greeting = builder.greeting;
            this.interruptConfig = builder.interruptConfig;
            this.interruptMode = builder.interruptMode;
            this.LLMConfig = builder.LLMConfig;
            this.TTSConfig = builder.TTSConfig;
            this.preferVideo = builder.preferVideo;
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

        /**
         * @return preferVideo
         */
        public Integer getPreferVideo() {
            return this.preferVideo;
        }

        public static final class Builder {
            private ASRConfig ASRConfig; 
            private AgentSilenceConfig agentSilenceConfig; 
            private AmbientSoundConfig ambientSoundConfig; 
            private BackChannelConfig backChannelConfig; 
            private Integer chatMode; 
            private Boolean enableVideoUnderstanding; 
            private String greeting; 
            private InterruptConfig interruptConfig; 
            private Integer interruptMode; 
            private LLMConfig LLMConfig; 
            private TTSConfig TTSConfig; 
            private Integer preferVideo; 

            private Builder() {
            } 

            private Builder(VoiceChatConfig model) {
                this.ASRConfig = model.ASRConfig;
                this.agentSilenceConfig = model.agentSilenceConfig;
                this.ambientSoundConfig = model.ambientSoundConfig;
                this.backChannelConfig = model.backChannelConfig;
                this.chatMode = model.chatMode;
                this.enableVideoUnderstanding = model.enableVideoUnderstanding;
                this.greeting = model.greeting;
                this.interruptConfig = model.interruptConfig;
                this.interruptMode = model.interruptMode;
                this.LLMConfig = model.LLMConfig;
                this.TTSConfig = model.TTSConfig;
                this.preferVideo = model.preferVideo;
            } 

            /**
             * <p>The Automatic Speech Recognition (ASR) configuration.</p>
             */
            public Builder ASRConfig(ASRConfig ASRConfig) {
                this.ASRConfig = ASRConfig;
                return this;
            }

            /**
             * <p>The configuration for agent behavior during silence timeout. When a user joins the channel but does not interact effectively with the agent (the user does not speak), the agent is in a silent state. You can configure the agent to broadcast a voice messaging reminder or send a webhook notification during this silent state.</p>
             */
            public Builder agentSilenceConfig(AgentSilenceConfig agentSilenceConfig) {
                this.agentSilenceConfig = agentSilenceConfig;
                return this;
            }

            /**
             * <p>The ambient sound settings.</p>
             */
            public Builder ambientSoundConfig(AmbientSoundConfig ambientSoundConfig) {
                this.ambientSoundConfig = ambientSoundConfig;
                return this;
            }

            /**
             * <p>The backchannel settings.</p>
             */
            public Builder backChannelConfig(BackChannelConfig backChannelConfig) {
                this.backChannelConfig = backChannelConfig;
                return this;
            }

            /**
             * <p>The chat mode. Valid values:</p>
             * <ul>
             * <li>1: natural conversation mode. This is the default value.</li>
             * <li>2: walkie-talkie mode.</li>
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
             * <p>Specifies whether to enable visual understanding. If enabled, the large language model (LLM) must support multimodal data.</p>
             */
            public Builder enableVideoUnderstanding(Boolean enableVideoUnderstanding) {
                this.enableVideoUnderstanding = enableVideoUnderstanding;
                return this;
            }

            /**
             * <p>The greeting message.</p>
             * 
             * <strong>example:</strong>
             * <p>Good morning, my friend</p>
             */
            public Builder greeting(String greeting) {
                this.greeting = greeting;
                return this;
            }

            /**
             * <p>The interrupt settings.</p>
             */
            public Builder interruptConfig(InterruptConfig interruptConfig) {
                this.interruptConfig = interruptConfig;
                return this;
            }

            /**
             * <p>The interrupt mode. Valid values:</p>
             * <ul>
             * <li>1: voice interruption supported. This is the default value.</li>
             * <li>2: voice interruption disabled.</li>
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
            public Builder LLMConfig(LLMConfig LLMConfig) {
                this.LLMConfig = LLMConfig;
                return this;
            }

            /**
             * <p>The text-to-speech (TTS) configuration.</p>
             */
            public Builder TTSConfig(TTSConfig TTSConfig) {
                this.TTSConfig = TTSConfig;
                return this;
            }

            /**
             * <p>After visual understanding is enabled, you can specify the video stream that the agent prioritizes for understanding. The agent can understand only one video stream when both the camera stream and the screen sharing stream are pushed simultaneously.</p>
             * <ol>
             * <li>The agent prioritizes the camera stream.</li>
             * <li>The agent prioritizes the screen sharing stream.</li>
             * </ol>
             * <p>By default, the camera stream is prioritized.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder preferVideo(Integer preferVideo) {
                this.preferVideo = preferVideo;
                return this;
            }

            public VoiceChatConfig build() {
                return new VoiceChatConfig(this);
            } 

        } 

    }
}
