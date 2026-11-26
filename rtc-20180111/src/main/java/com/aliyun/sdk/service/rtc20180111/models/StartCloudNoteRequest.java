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
 * {@link StartCloudNoteRequest} extends {@link RequestModel}
 *
 * <p>StartCloudNoteRequest</p>
 */
public class StartCloudNoteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoChapters")
    private AutoChapters autoChapters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomPrompt")
    private CustomPrompt customPrompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LanguageHints")
    private java.util.List<String> languageHints;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MeetingAssistance")
    private MeetingAssistance meetingAssistance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealtimeSubtitle")
    private RealtimeSubtitle realtimeSubtitle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInspection")
    private ServiceInspection serviceInspection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceLanguage")
    private String sourceLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private StorageConfig storageConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Summarization")
    private Summarization summarization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 55, minLength = 1)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TextPolish")
    private TextPolish textPolish;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Transcription")
    private Transcription transcription;

    private StartCloudNoteRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.autoChapters = builder.autoChapters;
        this.channelId = builder.channelId;
        this.customPrompt = builder.customPrompt;
        this.languageHints = builder.languageHints;
        this.meetingAssistance = builder.meetingAssistance;
        this.realtimeSubtitle = builder.realtimeSubtitle;
        this.serviceInspection = builder.serviceInspection;
        this.sourceLanguage = builder.sourceLanguage;
        this.storageConfig = builder.storageConfig;
        this.summarization = builder.summarization;
        this.taskId = builder.taskId;
        this.textPolish = builder.textPolish;
        this.transcription = builder.transcription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartCloudNoteRequest create() {
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
     * @return autoChapters
     */
    public AutoChapters getAutoChapters() {
        return this.autoChapters;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return customPrompt
     */
    public CustomPrompt getCustomPrompt() {
        return this.customPrompt;
    }

    /**
     * @return languageHints
     */
    public java.util.List<String> getLanguageHints() {
        return this.languageHints;
    }

    /**
     * @return meetingAssistance
     */
    public MeetingAssistance getMeetingAssistance() {
        return this.meetingAssistance;
    }

    /**
     * @return realtimeSubtitle
     */
    public RealtimeSubtitle getRealtimeSubtitle() {
        return this.realtimeSubtitle;
    }

    /**
     * @return serviceInspection
     */
    public ServiceInspection getServiceInspection() {
        return this.serviceInspection;
    }

    /**
     * @return sourceLanguage
     */
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    /**
     * @return storageConfig
     */
    public StorageConfig getStorageConfig() {
        return this.storageConfig;
    }

    /**
     * @return summarization
     */
    public Summarization getSummarization() {
        return this.summarization;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return textPolish
     */
    public TextPolish getTextPolish() {
        return this.textPolish;
    }

    /**
     * @return transcription
     */
    public Transcription getTranscription() {
        return this.transcription;
    }

    public static final class Builder extends Request.Builder<StartCloudNoteRequest, Builder> {
        private String appId; 
        private AutoChapters autoChapters; 
        private String channelId; 
        private CustomPrompt customPrompt; 
        private java.util.List<String> languageHints; 
        private MeetingAssistance meetingAssistance; 
        private RealtimeSubtitle realtimeSubtitle; 
        private ServiceInspection serviceInspection; 
        private String sourceLanguage; 
        private StorageConfig storageConfig; 
        private Summarization summarization; 
        private String taskId; 
        private TextPolish textPolish; 
        private Transcription transcription; 

        private Builder() {
            super();
        } 

        private Builder(StartCloudNoteRequest request) {
            super(request);
            this.appId = request.appId;
            this.autoChapters = request.autoChapters;
            this.channelId = request.channelId;
            this.customPrompt = request.customPrompt;
            this.languageHints = request.languageHints;
            this.meetingAssistance = request.meetingAssistance;
            this.realtimeSubtitle = request.realtimeSubtitle;
            this.serviceInspection = request.serviceInspection;
            this.sourceLanguage = request.sourceLanguage;
            this.storageConfig = request.storageConfig;
            this.summarization = request.summarization;
            this.taskId = request.taskId;
            this.textPolish = request.textPolish;
            this.transcription = request.transcription;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2ws***z3</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The auto chapters feature. When enabled, chapter titles and summaries are generated.</p>
         */
        public Builder autoChapters(AutoChapters autoChapters) {
            String autoChaptersShrink = shrink(autoChapters, "AutoChapters", "json");
            this.putQueryParameter("AutoChapters", autoChaptersShrink);
            this.autoChapters = autoChapters;
            return this;
        }

        /**
         * <p>The channel ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>The custom prompt control parameter object.</p>
         */
        public Builder customPrompt(CustomPrompt customPrompt) {
            String customPromptShrink = shrink(customPrompt, "CustomPrompt", "json");
            this.putQueryParameter("CustomPrompt", customPromptShrink);
            this.customPrompt = customPrompt;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated. You do not need to specify it.</p>
         */
        public Builder languageHints(java.util.List<String> languageHints) {
            this.putQueryParameter("LanguageHints", languageHints);
            this.languageHints = languageHints;
            return this;
        }

        /**
         * <p>The intelligent meeting minutes feature. When enabled, keywords, key content, and to-do items are generated.</p>
         */
        public Builder meetingAssistance(MeetingAssistance meetingAssistance) {
            String meetingAssistanceShrink = shrink(meetingAssistance, "MeetingAssistance", "json");
            this.putQueryParameter("MeetingAssistance", meetingAssistanceShrink);
            this.meetingAssistance = meetingAssistance;
            return this;
        }

        /**
         * <p>The real-time subtitles.</p>
         */
        public Builder realtimeSubtitle(RealtimeSubtitle realtimeSubtitle) {
            String realtimeSubtitleShrink = shrink(realtimeSubtitle, "RealtimeSubtitle", "json");
            this.putQueryParameter("RealtimeSubtitle", realtimeSubtitleShrink);
            this.realtimeSubtitle = realtimeSubtitle;
            return this;
        }

        /**
         * <p>The service inspection feature.</p>
         */
        public Builder serviceInspection(ServiceInspection serviceInspection) {
            String serviceInspectionShrink = shrink(serviceInspection, "ServiceInspection", "json");
            this.putQueryParameter("ServiceInspection", serviceInspectionShrink);
            this.serviceInspection = serviceInspection;
            return this;
        }

        /**
         * <p>The source language model used by the channel. Valid values:</p>
         * <ul>
         * <li>cn: Chinese</li>
         * <li>yue: Cantonese</li>
         * <li>en: English</li>
         * <li>multilingual: Multilingual</li>
         * <li>ja: Japanese</li>
         * <li>ko: Korean</li>
         * <li>de: German</li>
         * <li>fr: French</li>
         * <li>ru: Russian</li>
         * <li>es: Spanish</li>
         * <li>vi: Vietnamese</li>
         * <li>it: Italian</li>
         * <li>sv: Swedish</li>
         * <li>cs: Czech</li>
         * <li>pl: Polish</li>
         * <li>th: Thai</li>
         * <li>fi: Finnish</li>
         * <li>hi: Hindi</li>
         * <li>id: Indonesian</li>
         * <li>pt: Portuguese</li>
         * <li>ar: Arabic</li>
         * <li>fil: Filipino</li>
         * <li>ms: Malay</li>
         * <li>tr: Turkish</li>
         * <li>hu: Hungarian</li>
         * <li>lo: Lao</li>
         * <li>pt-br: Portuguese (Brazil)</li>
         * <li>es-ar: Spanish (Argentina)</li>
         * <li>es-mx: Spanish (Mexico)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        public Builder sourceLanguage(String sourceLanguage) {
            this.putQueryParameter("SourceLanguage", sourceLanguage);
            this.sourceLanguage = sourceLanguage;
            return this;
        }

        /**
         * <p>The storage configuration.</p>
         * <p>This parameter is required.</p>
         */
        public Builder storageConfig(StorageConfig storageConfig) {
            this.putQueryParameter("StorageConfig", storageConfig);
            this.storageConfig = storageConfig;
            return this;
        }

        /**
         * <p>The summarization feature. When enabled, full-text summaries and speaker summaries are generated.</p>
         */
        public Builder summarization(Summarization summarization) {
            String summarizationShrink = shrink(summarization, "Summarization", "json");
            this.putQueryParameter("Summarization", summarizationShrink);
            this.summarization = summarization;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rtc</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The text polishing feature.</p>
         */
        public Builder textPolish(TextPolish textPolish) {
            String textPolishShrink = shrink(textPolish, "TextPolish", "json");
            this.putQueryParameter("TextPolish", textPolishShrink);
            this.textPolish = textPolish;
            return this;
        }

        /**
         * <p>The transcription feature. Enabled by default.</p>
         */
        public Builder transcription(Transcription transcription) {
            String transcriptionShrink = shrink(transcription, "Transcription", "json");
            this.putQueryParameter("Transcription", transcriptionShrink);
            this.transcription = transcription;
            return this;
        }

        @Override
        public StartCloudNoteRequest build() {
            return new StartCloudNoteRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartCloudNoteRequest} extends {@link TeaModel}
     *
     * <p>StartCloudNoteRequest</p>
     */
    public static class AutoChapters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        private AutoChapters(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoChapters create() {
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

            private Builder(AutoChapters model) {
                this.enabled = model.enabled;
            } 

            /**
             * <p>Specifies whether to enable the feature.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public AutoChapters build() {
                return new AutoChapters(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudNoteRequest} extends {@link TeaModel}
     *
     * <p>StartCloudNoteRequest</p>
     */
    public static class CustomPromptContents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Prompt")
        @com.aliyun.core.annotation.Validation(required = true)
        private String prompt;

        @com.aliyun.core.annotation.NameInMap("TransType")
        private String transType;

        private CustomPromptContents(Builder builder) {
            this.model = builder.model;
            this.name = builder.name;
            this.prompt = builder.prompt;
            this.transType = builder.transType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomPromptContents create() {
            return builder().build();
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
         * @return transType
         */
        public String getTransType() {
            return this.transType;
        }

        public static final class Builder {
            private String model; 
            private String name; 
            private String prompt; 
            private String transType; 

            private Builder() {
            } 

            private Builder(CustomPromptContents model) {
                this.model = model.model;
                this.name = model.name;
                this.prompt = model.prompt;
                this.transType = model.transType;
            } 

            /**
             * <p>The model used for the prompt. Valid values: tingwu-turbo, tingwu-plus, and qwen-max. Default value: tingwu-turbo.</p>
             * 
             * <strong>example:</strong>
             * <p>tingwu-turbo</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The custom name of the prompt, which is used to match the output results.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>split-summary-demo</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The custom content of the prompt. The content must include the {Transcription} tag. The {Transcription} tag is automatically replaced with the speech transcription result as the model input.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Summarize the following conversation by speaker:\n {Transcription}</p>
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * <p>The format of the {Transcription} tag. Valid values:</p>
             * <ul>
             * <li>chat: The transcription result includes speaker information.</li>
             * <li>default: The transcription result is in plain text format.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>chat</p>
             */
            public Builder transType(String transType) {
                this.transType = transType;
                return this;
            }

            public CustomPromptContents build() {
                return new CustomPromptContents(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudNoteRequest} extends {@link TeaModel}
     *
     * <p>StartCloudNoteRequest</p>
     */
    public static class CustomPrompt extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomPromptContents")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<CustomPromptContents> customPromptContents;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        private CustomPrompt(Builder builder) {
            this.customPromptContents = builder.customPromptContents;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomPrompt create() {
            return builder().build();
        }

        /**
         * @return customPromptContents
         */
        public java.util.List<CustomPromptContents> getCustomPromptContents() {
            return this.customPromptContents;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private java.util.List<CustomPromptContents> customPromptContents; 
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(CustomPrompt model) {
                this.customPromptContents = model.customPromptContents;
                this.enabled = model.enabled;
            } 

            /**
             * <p>The list of parameters for the custom prompt.</p>
             * <p>This parameter is required.</p>
             */
            public Builder customPromptContents(java.util.List<CustomPromptContents> customPromptContents) {
                this.customPromptContents = customPromptContents;
                return this;
            }

            /**
             * <p>Specifies whether to enable the feature.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public CustomPrompt build() {
                return new CustomPrompt(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudNoteRequest} extends {@link TeaModel}
     *
     * <p>StartCloudNoteRequest</p>
     */
    public static class MeetingAssistance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("MeetingAssistanceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> meetingAssistanceType;

        private MeetingAssistance(Builder builder) {
            this.enabled = builder.enabled;
            this.meetingAssistanceType = builder.meetingAssistanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeetingAssistance create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return meetingAssistanceType
         */
        public java.util.List<String> getMeetingAssistanceType() {
            return this.meetingAssistanceType;
        }

        public static final class Builder {
            private Boolean enabled; 
            private java.util.List<String> meetingAssistanceType; 

            private Builder() {
            } 

            private Builder(MeetingAssistance model) {
                this.enabled = model.enabled;
                this.meetingAssistanceType = model.meetingAssistanceType;
            } 

            /**
             * <p>Specifies whether to enable the feature.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The algorithm type for the intelligent meeting minutes feature.</p>
             * <p>This parameter is required.</p>
             */
            public Builder meetingAssistanceType(java.util.List<String> meetingAssistanceType) {
                this.meetingAssistanceType = meetingAssistanceType;
                return this;
            }

            public MeetingAssistance build() {
                return new MeetingAssistance(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudNoteRequest} extends {@link TeaModel}
     *
     * <p>StartCloudNoteRequest</p>
     */
    public static class Translation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TranslateLevel")
        private Integer translateLevel;

        private Translation(Builder builder) {
            this.translateLevel = builder.translateLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Translation create() {
            return builder().build();
        }

        /**
         * @return translateLevel
         */
        public Integer getTranslateLevel() {
            return this.translateLevel;
        }

        public static final class Builder {
            private Integer translateLevel; 

            private Builder() {
            } 

            private Builder(Translation model) {
                this.translateLevel = model.translateLevel;
            } 

            /**
             * <p>The output level of the translated text. Default value: 2.</p>
             * <ul>
             * <li>1: Returns results when a complete sentence is recognized.</li>
             * <li>2: Returns results when intermediate results and complete sentences are recognized.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder translateLevel(Integer translateLevel) {
                this.translateLevel = translateLevel;
                return this;
            }

            public Translation build() {
                return new Translation(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudNoteRequest} extends {@link TeaModel}
     *
     * <p>StartCloudNoteRequest</p>
     */
    public static class RealtimeSubtitle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrCallback")
        private Boolean asrCallback;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Translation")
        private Translation translation;

        private RealtimeSubtitle(Builder builder) {
            this.asrCallback = builder.asrCallback;
            this.enabled = builder.enabled;
            this.translation = builder.translation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealtimeSubtitle create() {
            return builder().build();
        }

        /**
         * @return asrCallback
         */
        public Boolean getAsrCallback() {
            return this.asrCallback;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return translation
         */
        public Translation getTranslation() {
            return this.translation;
        }

        public static final class Builder {
            private Boolean asrCallback; 
            private Boolean enabled; 
            private Translation translation; 

            private Builder() {
            } 

            private Builder(RealtimeSubtitle model) {
                this.asrCallback = model.asrCallback;
                this.enabled = model.enabled;
                this.translation = model.translation;
            } 

            /**
             * <p>Specifies whether to enable server-side callbacks.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder asrCallback(Boolean asrCallback) {
                this.asrCallback = asrCallback;
                return this;
            }

            /**
             * <p>Specifies whether to enable the feature.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The translation parameters. You can specify the target translation language by using the SDK.</p>
             */
            public Builder translation(Translation translation) {
                this.translation = translation;
                return this;
            }

            public RealtimeSubtitle build() {
                return new RealtimeSubtitle(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudNoteRequest} extends {@link TeaModel}
     *
     * <p>StartCloudNoteRequest</p>
     */
    public static class InspectionContents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("Title")
        @com.aliyun.core.annotation.Validation(required = true)
        private String title;

        private InspectionContents(Builder builder) {
            this.content = builder.content;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InspectionContents create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private String title; 

            private Builder() {
            } 

            private Builder(InspectionContents model) {
                this.content = model.content;
                this.title = model.title;
            } 

            /**
             * <p>The definition of the inspection dimension for service inspection.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>The salesperson proactively greets and welcomes the customer during the opening remarks</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The name of the inspection dimension for service inspection.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Store arrival welcome - Welcome greeting</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public InspectionContents build() {
                return new InspectionContents(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudNoteRequest} extends {@link TeaModel}
     *
     * <p>StartCloudNoteRequest</p>
     */
    public static class ServiceInspection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("InspectionContents")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<InspectionContents> inspectionContents;

        @com.aliyun.core.annotation.NameInMap("InspectionIntroduction")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024)
        private String inspectionIntroduction;

        @com.aliyun.core.annotation.NameInMap("SceneIntroduction")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024)
        private String sceneIntroduction;

        private ServiceInspection(Builder builder) {
            this.enabled = builder.enabled;
            this.inspectionContents = builder.inspectionContents;
            this.inspectionIntroduction = builder.inspectionIntroduction;
            this.sceneIntroduction = builder.sceneIntroduction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceInspection create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return inspectionContents
         */
        public java.util.List<InspectionContents> getInspectionContents() {
            return this.inspectionContents;
        }

        /**
         * @return inspectionIntroduction
         */
        public String getInspectionIntroduction() {
            return this.inspectionIntroduction;
        }

        /**
         * @return sceneIntroduction
         */
        public String getSceneIntroduction() {
            return this.sceneIntroduction;
        }

        public static final class Builder {
            private Boolean enabled; 
            private java.util.List<InspectionContents> inspectionContents; 
            private String inspectionIntroduction; 
            private String sceneIntroduction; 

            private Builder() {
            } 

            private Builder(ServiceInspection model) {
                this.enabled = model.enabled;
                this.inspectionContents = model.inspectionContents;
                this.inspectionIntroduction = model.inspectionIntroduction;
                this.sceneIntroduction = model.sceneIntroduction;
            } 

            /**
             * <p>Specifies whether to enable the feature.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The list of inspection dimensions for service inspection, including the names and definitions of the dimensions. This specifies the criteria for the large language model to determine whether a dimension is hit.</p>
             * <p>This parameter is required.</p>
             */
            public Builder inspectionContents(java.util.List<InspectionContents> inspectionContents) {
                this.inspectionContents = inspectionContents;
                return this;
            }

            /**
             * <p>The description of the inspection objectives and focus areas for service inspection.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Monitor whether the sales staff in the dialogue are enthusiastic and have a good attitude when receiving customers</p>
             */
            public Builder inspectionIntroduction(String inspectionIntroduction) {
                this.inspectionIntroduction = inspectionIntroduction;
                return this;
            }

            /**
             * <p>The description of the dialogue scene for service inspection.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Offline sales scenario at an automobile dealership</p>
             */
            public Builder sceneIntroduction(String sceneIntroduction) {
                this.sceneIntroduction = sceneIntroduction;
                return this;
            }

            public ServiceInspection build() {
                return new ServiceInspection(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudNoteRequest} extends {@link TeaModel}
     *
     * <p>StartCloudNoteRequest</p>
     */
    public static class StorageConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKey")
        @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
        private String accessKey;

        @com.aliyun.core.annotation.NameInMap("Bucket")
        @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Region")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer region;

        @com.aliyun.core.annotation.NameInMap("SecretKey")
        @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
        private String secretKey;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
        private Integer vendor;

        private StorageConfig(Builder builder) {
            this.accessKey = builder.accessKey;
            this.bucket = builder.bucket;
            this.region = builder.region;
            this.secretKey = builder.secretKey;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageConfig create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return region
         */
        public Integer getRegion() {
            return this.region;
        }

        /**
         * @return secretKey
         */
        public String getSecretKey() {
            return this.secretKey;
        }

        /**
         * @return vendor
         */
        public Integer getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String accessKey; 
            private String bucket; 
            private Integer region; 
            private String secretKey; 
            private Integer vendor; 

            private Builder() {
            } 

            private Builder(StorageConfig model) {
                this.accessKey = model.accessKey;
                this.bucket = model.bucket;
                this.region = model.region;
                this.secretKey = model.secretKey;
                this.vendor = model.vendor;
            } 

            /**
             * <p>The AccessKey.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>LTAX***</p>
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * <p>The bucket name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test-bucket-for-recording</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The storage region.</p>
             * <table>
             * <thead>
             * <tr>
             * <th>Region</th>
             * <th>AliYun OSS</th>
             * </tr>
             * </thead>
             * <tbody><tr>
             * <td>0</td>
             * <td>CN_Hangzhou</td>
             * </tr>
             * <tr>
             * <td>1</td>
             * <td>CN_Shanghai</td>
             * </tr>
             * <tr>
             * <td>2</td>
             * <td>CN_Qingdao</td>
             * </tr>
             * <tr>
             * <td>3</td>
             * <td>CN_Beijing</td>
             * </tr>
             * <tr>
             * <td>4</td>
             * <td>CN_Zhangjiakou</td>
             * </tr>
             * <tr>
             * <td>5</td>
             * <td>CN_Huhehaote</td>
             * </tr>
             * <tr>
             * <td>6</td>
             * <td>CN_Shenzhen</td>
             * </tr>
             * <tr>
             * <td>7</td>
             * <td>CN_Hongkong</td>
             * </tr>
             * <tr>
             * <td>8</td>
             * <td>US_West_1</td>
             * </tr>
             * <tr>
             * <td>9</td>
             * <td>US_East_1</td>
             * </tr>
             * <tr>
             * <td>10</td>
             * <td>AP_Southeast_1</td>
             * </tr>
             * <tr>
             * <td>11</td>
             * <td>AP_Southeast_2</td>
             * </tr>
             * <tr>
             * <td>12</td>
             * <td>AP_Southeast_3</td>
             * </tr>
             * <tr>
             * <td>13</td>
             * <td>AP_Southeast_5</td>
             * </tr>
             * <tr>
             * <td>14</td>
             * <td>AP_Northeast_1</td>
             * </tr>
             * <tr>
             * <td>15</td>
             * <td>AP_South_1 (Offline. Do not use.)</td>
             * </tr>
             * <tr>
             * <td>16</td>
             * <td>EU_Central_1</td>
             * </tr>
             * <tr>
             * <td>17</td>
             * <td>EU_West_1</td>
             * </tr>
             * <tr>
             * <td>18</td>
             * <td>EU_East_1(ME_East_1)</td>
             * </tr>
             * <tr>
             * <td>19</td>
             * <td>AP_Southeast_6</td>
             * </tr>
             * <tr>
             * <td>20</td>
             * <td>CN_Heyuan</td>
             * </tr>
             * <tr>
             * <td>21</td>
             * <td>CN_Guangzhou</td>
             * </tr>
             * <tr>
             * <td>22</td>
             * <td>CN_Chengdu</td>
             * </tr>
             * <tr>
             * <td>23</td>
             * <td>CN_Nanjing</td>
             * </tr>
             * <tr>
             * <td>24</td>
             * <td>CN_Fuzhou</td>
             * </tr>
             * <tr>
             * <td>25</td>
             * <td>CN_Wulanchabu</td>
             * </tr>
             * <tr>
             * <td>26</td>
             * <td>AP_Northeast_2</td>
             * </tr>
             * <tr>
             * <td>27</td>
             * <td>AP_Southeast_7</td>
             * </tr>
             * </tbody></table>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder region(Integer region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The AccessKey secret.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>APb6qWYEzKtYxE***</p>
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            /**
             * <p>The storage platform. Valid values:</p>
             * <table>
             * <thead>
             * <tr>
             * <th>vendor</th>
             * <th>Object storage service</th>
             * <th>Remarks</th>
             * </tr>
             * </thead>
             * <tbody><tr>
             * <td>1</td>
             * <td>AliYun OSS</td>
             * <td>Alibaba Cloud</td>
             * </tr>
             * </tbody></table>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            public StorageConfig build() {
                return new StorageConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudNoteRequest} extends {@link TeaModel}
     *
     * <p>StartCloudNoteRequest</p>
     */
    public static class Summarization extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> type;

        private Summarization(Builder builder) {
            this.enabled = builder.enabled;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summarization create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return type
         */
        public java.util.List<String> getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean enabled; 
            private java.util.List<String> type; 

            private Builder() {
            } 

            private Builder(Summarization model) {
                this.enabled = model.enabled;
                this.type = model.type;
            } 

            /**
             * <p>Specifies whether to enable the feature.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The specific type.</p>
             * <p>This parameter is required.</p>
             */
            public Builder type(java.util.List<String> type) {
                this.type = type;
                return this;
            }

            public Summarization build() {
                return new Summarization(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudNoteRequest} extends {@link TeaModel}
     *
     * <p>StartCloudNoteRequest</p>
     */
    public static class TextPolish extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        private TextPolish(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextPolish create() {
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

            private Builder(TextPolish model) {
                this.enabled = model.enabled;
            } 

            /**
             * <p>Specifies whether to enable the feature.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public TextPolish build() {
                return new TextPolish(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudNoteRequest} extends {@link TeaModel}
     *
     * <p>StartCloudNoteRequest</p>
     */
    public static class Transcription extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiarizationEnabled")
        private Boolean diarizationEnabled;

        @com.aliyun.core.annotation.NameInMap("PhraseId")
        @com.aliyun.core.annotation.Validation(maxLength = 50, minLength = 1)
        private String phraseId;

        @com.aliyun.core.annotation.NameInMap("SpeakerCount")
        private Integer speakerCount;

        @com.aliyun.core.annotation.NameInMap("TranscriptionLevel")
        private Integer transcriptionLevel;

        private Transcription(Builder builder) {
            this.diarizationEnabled = builder.diarizationEnabled;
            this.phraseId = builder.phraseId;
            this.speakerCount = builder.speakerCount;
            this.transcriptionLevel = builder.transcriptionLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Transcription create() {
            return builder().build();
        }

        /**
         * @return diarizationEnabled
         */
        public Boolean getDiarizationEnabled() {
            return this.diarizationEnabled;
        }

        /**
         * @return phraseId
         */
        public String getPhraseId() {
            return this.phraseId;
        }

        /**
         * @return speakerCount
         */
        public Integer getSpeakerCount() {
            return this.speakerCount;
        }

        /**
         * @return transcriptionLevel
         */
        public Integer getTranscriptionLevel() {
            return this.transcriptionLevel;
        }

        public static final class Builder {
            private Boolean diarizationEnabled; 
            private String phraseId; 
            private Integer speakerCount; 
            private Integer transcriptionLevel; 

            private Builder() {
            } 

            private Builder(Transcription model) {
                this.diarizationEnabled = model.diarizationEnabled;
                this.phraseId = model.phraseId;
                this.speakerCount = model.speakerCount;
                this.transcriptionLevel = model.transcriptionLevel;
            } 

            /**
             * <p>Specifies whether to enable speaker diarization.</p>
             */
            public Builder diarizationEnabled(Boolean diarizationEnabled) {
                this.diarizationEnabled = diarizationEnabled;
                return this;
            }

            /**
             * <p>The hotword table ID.</p>
             * 
             * <strong>example:</strong>
             * <p>b27cb31b8ca24c5b8e664e0387bac573</p>
             */
            public Builder phraseId(String phraseId) {
                this.phraseId = phraseId;
                return this;
            }

            /**
             * <p>The number of speakers for speaker diarization. Default value: 0. Valid values:</p>
             * <ul>
             * <li>0: The number of speakers is unknown.</li>
             * <li>2: The number of speakers is 2.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder speakerCount(Integer speakerCount) {
                this.speakerCount = speakerCount;
                return this;
            }

            /**
             * <p>The return level of speech recognition results. Default value: 2. Valid values:</p>
             * <ul>
             * <li>1: Returns recognition results when a complete sentence is recognized.</li>
             * <li>2: Returns recognition results when intermediate results and complete sentences are recognized.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder transcriptionLevel(Integer transcriptionLevel) {
                this.transcriptionLevel = transcriptionLevel;
                return this;
            }

            public Transcription build() {
                return new Transcription(this);
            } 

        } 

    }
}
