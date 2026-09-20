// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20230930.models;

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
 * {@link CreateTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateTaskRequest</p>
 */
public class CreateTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppKey")
    private String appKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Input")
    private Input input;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private Parameters parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("operation")
    private String operation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateTaskRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.input = builder.input;
        this.parameters = builder.parameters;
        this.operation = builder.operation;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return input
     */
    public Input getInput() {
        return this.input;
    }

    /**
     * @return parameters
     */
    public Parameters getParameters() {
        return this.parameters;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateTaskRequest, Builder> {
        private String appKey; 
        private Input input; 
        private Parameters parameters; 
        private String operation; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateTaskRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.input = request.input;
            this.parameters = request.parameters;
            this.operation = request.operation;
            this.type = request.type;
        } 

        /**
         * <p>The AppKey of the project created in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>JV1sRTisRMi****</p>
         */
        public Builder appKey(String appKey) {
            this.putBodyParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>The basic parameters set when creating a task. The required parameters vary depending on the task type.</p>
         * <ul>
         * <li><p>When type=offline (offline task), you must set the SourceLanguage and FileUrl parameters.</p>
         * </li>
         * <li><p>When type=realtime (real-time meeting task), you must additionally set the SourceLanguage, Format, and SampleRate parameters.</p>
         * </li>
         * </ul>
         */
        public Builder input(Input input) {
            this.putBodyParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * <p>The algorithm-related parameters set when creating a task. You can set these as needed.</p>
         */
        public Builder parameters(Parameters parameters) {
            this.putBodyParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The operation. Valid values:</p>
         * <ul>
         * <li>start: creates a task. This is the default value. In most cases, you do not need to explicitly set this parameter.</li>
         * <li>stop: stops a real-time meeting task. This value is used in real-time meeting scenarios. After a meeting ends, set this parameter to stop and trigger the call.</li>
         * </ul>
         * <blockquote>
         * <p>Note: When ending a real-time recording, you must set this parameter to stop.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>stop</p>
         */
        public Builder operation(String operation) {
            this.putQueryParameter("operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li><strong>offline</strong>: offline task, such as offline transcription.</li>
         * <li><strong>realtime</strong>: real-time task, such as creating a real-time recording.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>offline</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateTaskRequest build() {
            return new CreateTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTaskRequest</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioChannelMode")
        private String audioChannelMode;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("LanguageHints")
        private java.util.List<String> languageHints;

        @com.aliyun.core.annotation.NameInMap("MultipleStreamsEnabled")
        private Boolean multipleStreamsEnabled;

        @com.aliyun.core.annotation.NameInMap("OutputPath")
        private String outputPath;

        @com.aliyun.core.annotation.NameInMap("ProgressiveCallbacksEnabled")
        private Boolean progressiveCallbacksEnabled;

        @com.aliyun.core.annotation.NameInMap("SampleRate")
        private Integer sampleRate;

        @com.aliyun.core.annotation.NameInMap("SourceLanguage")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sourceLanguage;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskKey")
        private String taskKey;

        private Input(Builder builder) {
            this.audioChannelMode = builder.audioChannelMode;
            this.fileUrl = builder.fileUrl;
            this.format = builder.format;
            this.languageHints = builder.languageHints;
            this.multipleStreamsEnabled = builder.multipleStreamsEnabled;
            this.outputPath = builder.outputPath;
            this.progressiveCallbacksEnabled = builder.progressiveCallbacksEnabled;
            this.sampleRate = builder.sampleRate;
            this.sourceLanguage = builder.sourceLanguage;
            this.taskId = builder.taskId;
            this.taskKey = builder.taskKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return audioChannelMode
         */
        public String getAudioChannelMode() {
            return this.audioChannelMode;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return languageHints
         */
        public java.util.List<String> getLanguageHints() {
            return this.languageHints;
        }

        /**
         * @return multipleStreamsEnabled
         */
        public Boolean getMultipleStreamsEnabled() {
            return this.multipleStreamsEnabled;
        }

        /**
         * @return outputPath
         */
        public String getOutputPath() {
            return this.outputPath;
        }

        /**
         * @return progressiveCallbacksEnabled
         */
        public Boolean getProgressiveCallbacksEnabled() {
            return this.progressiveCallbacksEnabled;
        }

        /**
         * @return sampleRate
         */
        public Integer getSampleRate() {
            return this.sampleRate;
        }

        /**
         * @return sourceLanguage
         */
        public String getSourceLanguage() {
            return this.sourceLanguage;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskKey
         */
        public String getTaskKey() {
            return this.taskKey;
        }

        public static final class Builder {
            private String audioChannelMode; 
            private String fileUrl; 
            private String format; 
            private java.util.List<String> languageHints; 
            private Boolean multipleStreamsEnabled; 
            private String outputPath; 
            private Boolean progressiveCallbacksEnabled; 
            private Integer sampleRate; 
            private String sourceLanguage; 
            private String taskId; 
            private String taskKey; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.audioChannelMode = model.audioChannelMode;
                this.fileUrl = model.fileUrl;
                this.format = model.format;
                this.languageHints = model.languageHints;
                this.multipleStreamsEnabled = model.multipleStreamsEnabled;
                this.outputPath = model.outputPath;
                this.progressiveCallbacksEnabled = model.progressiveCallbacksEnabled;
                this.sampleRate = model.sampleRate;
                this.sourceLanguage = model.sourceLanguage;
                this.taskId = model.taskId;
                this.taskKey = model.taskKey;
            } 

            /**
             * <p>The multi-channel audio and video processing mode.</p>
             */
            public Builder audioChannelMode(String audioChannelMode) {
                this.audioChannelMode = audioChannelMode;
                return this;
            }

            /**
             * <p>The HTTP or HTTPS URL of the original audio or video file. This parameter is required when you create an offline transcription task.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxx.com/zzz/1.wav">http://xxx.com/zzz/1.wav</a></p>
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * <p>The encoding format of the audio stream data when you create a real-time meeting, such as pcm. Valid values:</p>
             * <ul>
             * <li><strong>pcm</strong></li>
             * <li><strong>opus</strong></li>
             * <li><strong>aac</strong></li>
             * <li><strong>speex</strong></li>
             * <li><strong>mp3</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pcm</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The preferred languages. This parameter takes effect only when SourceLanguage is set to &quot;multilingual&quot;. It restricts the output languages of the model.</p>
             */
            public Builder languageHints(java.util.List<String> languageHints) {
                this.languageHints = languageHints;
                return this;
            }

            /**
             * <p>Specifies whether to enable multi-channel audio stream recognition. This parameter needs to be set only in real-time recording scenarios. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder multipleStreamsEnabled(Boolean multipleStreamsEnabled) {
                this.multipleStreamsEnabled = multipleStreamsEnabled;
                return this;
            }

            /**
             * <p>After configuring OSS information in the console, you can specify an OSS write path to save results directly to your custom OSS bucket.</p>
             */
            public Builder outputPath(String outputPath) {
                this.outputPath = outputPath;
                return this;
            }

            /**
             * <p>Specifies whether to enable the callback feature.
             * To enable the callback feature, configure the callback type and address in the console, and set this parameter to true when creating a task.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder progressiveCallbacksEnabled(Boolean progressiveCallbacksEnabled) {
                this.progressiveCallbacksEnabled = progressiveCallbacksEnabled;
                return this;
            }

            /**
             * <p>The sample rate of the audio stream data when you create a real-time meeting. Valid values: 8000 and 16000.</p>
             * <ul>
             * <li><strong>8000</strong>: telephone customer service scenarios.</li>
             * <li><strong>16000</strong>: real-time meeting audio capture scenarios.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>16000</p>
             */
            public Builder sampleRate(Integer sampleRate) {
                this.sampleRate = sampleRate;
                return this;
            }

            /**
             * <p>The language model used for audio transcription. Valid values:</p>
             * <ul>
             * <li><strong>cn</strong>: Chinese</li>
             * <li><strong>en</strong>: English</li>
             * <li><strong>fspk</strong>: Chinese-English free speaking</li>
             * <li><strong>ja</strong>: Japanese</li>
             * <li><strong>yue</strong>: Cantonese</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn</p>
             */
            public Builder sourceLanguage(String sourceLanguage) {
                this.sourceLanguage = sourceLanguage;
                return this;
            }

            /**
             * <p>The TaskId returned when you create a real-time recording. You can use this ID to end the real-time recording. Set this parameter only when ending a real-time recording. Do not set it at other times.</p>
             * 
             * <strong>example:</strong>
             * <p>9922c84c087044eda18659c128b56c84</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The custom identifier set by the user to associate with this task.</p>
             * 
             * <strong>example:</strong>
             * <p>task_tingwu_123</p>
             */
            public Builder taskKey(String taskKey) {
                this.taskKey = taskKey;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTaskRequest</p>
     */
    public static class AutoChapters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChapterGranularity")
        private String chapterGranularity;

        private AutoChapters(Builder builder) {
            this.chapterGranularity = builder.chapterGranularity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoChapters create() {
            return builder().build();
        }

        /**
         * @return chapterGranularity
         */
        public String getChapterGranularity() {
            return this.chapterGranularity;
        }

        public static final class Builder {
            private String chapterGranularity; 

            private Builder() {
            } 

            private Builder(AutoChapters model) {
                this.chapterGranularity = model.chapterGranularity;
            } 

            /**
             * ChapterGranularity.
             */
            public Builder chapterGranularity(String chapterGranularity) {
                this.chapterGranularity = chapterGranularity;
                return this;
            }

            public AutoChapters build() {
                return new AutoChapters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTaskRequest</p>
     */
    public static class ExtractionContents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Identity")
        private String identity;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private ExtractionContents(Builder builder) {
            this.content = builder.content;
            this.identity = builder.identity;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtractionContents create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return identity
         */
        public String getIdentity() {
            return this.identity;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private String identity; 
            private String title; 

            private Builder() {
            } 

            private Builder(ExtractionContents model) {
                this.content = model.content;
                this.identity = model.identity;
                this.title = model.title;
            } 

            /**
             * <p>The extraction dimension definition for conversation content extraction.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Identity.
             */
            public Builder identity(String identity) {
                this.identity = identity;
                return this;
            }

            /**
             * <p>The extraction dimension name for conversation content extraction.</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public ExtractionContents build() {
                return new ExtractionContents(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTaskRequest</p>
     */
    public static class ContentExtraction extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtractionContents")
        private java.util.List<ExtractionContents> extractionContents;

        @com.aliyun.core.annotation.NameInMap("SceneIntroduction")
        private String sceneIntroduction;

        @com.aliyun.core.annotation.NameInMap("SpeakerMap")
        private java.util.Map<String, ?> speakerMap;

        private ContentExtraction(Builder builder) {
            this.extractionContents = builder.extractionContents;
            this.sceneIntroduction = builder.sceneIntroduction;
            this.speakerMap = builder.speakerMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentExtraction create() {
            return builder().build();
        }

        /**
         * @return extractionContents
         */
        public java.util.List<ExtractionContents> getExtractionContents() {
            return this.extractionContents;
        }

        /**
         * @return sceneIntroduction
         */
        public String getSceneIntroduction() {
            return this.sceneIntroduction;
        }

        /**
         * @return speakerMap
         */
        public java.util.Map<String, ?> getSpeakerMap() {
            return this.speakerMap;
        }

        public static final class Builder {
            private java.util.List<ExtractionContents> extractionContents; 
            private String sceneIntroduction; 
            private java.util.Map<String, ?> speakerMap; 

            private Builder() {
            } 

            private Builder(ContentExtraction model) {
                this.extractionContents = model.extractionContents;
                this.sceneIntroduction = model.sceneIntroduction;
                this.speakerMap = model.speakerMap;
            } 

            /**
             * <p>The list of extraction dimensions for conversation content extraction, including the name and definition of each extraction item.</p>
             */
            public Builder extractionContents(java.util.List<ExtractionContents> extractionContents) {
                this.extractionContents = extractionContents;
                return this;
            }

            /**
             * <p>The scene description for conversation content extraction.</p>
             */
            public Builder sceneIntroduction(String sceneIntroduction) {
                this.sceneIntroduction = sceneIntroduction;
                return this;
            }

            /**
             * SpeakerMap.
             */
            public Builder speakerMap(java.util.Map<String, ?> speakerMap) {
                this.speakerMap = speakerMap;
                return this;
            }

            public ContentExtraction build() {
                return new ContentExtraction(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTaskRequest</p>
     */
    public static class Contents extends TeaModel {
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

        private Contents(Builder builder) {
            this.model = builder.model;
            this.name = builder.name;
            this.prompt = builder.prompt;
            this.transType = builder.transType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contents create() {
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

            private Builder(Contents model) {
                this.model = model.model;
                this.name = model.name;
                this.prompt = model.prompt;
                this.transType = model.transType;
            } 

            /**
             * <p>The model specified for the prompt.</p>
             * 
             * <strong>example:</strong>
             * <p>tingwu-turbo</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The custom name of the prompt, used to match output results.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>summary-demo</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The custom content of the prompt.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Summarize the following conversation:{Transcription}</p>
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * <p>The format of the {Transcription} tag.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder transType(String transType) {
                this.transType = transType;
                return this;
            }

            public Contents build() {
                return new Contents(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTaskRequest</p>
     */
    public static class CustomPrompt extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Contents")
        private java.util.List<Contents> contents;

        private CustomPrompt(Builder builder) {
            this.contents = builder.contents;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomPrompt create() {
            return builder().build();
        }

        /**
         * @return contents
         */
        public java.util.List<Contents> getContents() {
            return this.contents;
        }

        public static final class Builder {
            private java.util.List<Contents> contents; 

            private Builder() {
            } 

            private Builder(CustomPrompt model) {
                this.contents = model.contents;
            } 

            /**
             * <p>The list of custom prompt parameters.</p>
             */
            public Builder contents(java.util.List<Contents> contents) {
                this.contents = contents;
                return this;
            }

            public CustomPrompt build() {
                return new CustomPrompt(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTaskRequest</p>
     */
    public static class TranslationHotwordMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("bizUserId")
        private String bizUserId;

        private TranslationHotwordMap(Builder builder) {
            this.bizType = builder.bizType;
            this.bizUserId = builder.bizUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranslationHotwordMap create() {
            return builder().build();
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return bizUserId
         */
        public String getBizUserId() {
            return this.bizUserId;
        }

        public static final class Builder {
            private String bizType; 
            private String bizUserId; 

            private Builder() {
            } 

            private Builder(TranslationHotwordMap model) {
                this.bizType = model.bizType;
                this.bizUserId = model.bizUserId;
            } 

            /**
             * <p>The business scenario type.</p>
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * bizUserId.
             */
            public Builder bizUserId(String bizUserId) {
                this.bizUserId = bizUserId;
                return this;
            }

            public TranslationHotwordMap build() {
                return new TranslationHotwordMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTaskRequest</p>
     */
    public static class ExtraParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainEducationEnabled")
        private Boolean domainEducationEnabled;

        @com.aliyun.core.annotation.NameInMap("FullTextSummaryFormat")
        private String fullTextSummaryFormat;

        @com.aliyun.core.annotation.NameInMap("MaxKeywords")
        private Integer maxKeywords;

        @com.aliyun.core.annotation.NameInMap("NfixEnabled")
        private Boolean nfixEnabled;

        @com.aliyun.core.annotation.NameInMap("OcrAuxiliaryEnabled")
        private Boolean ocrAuxiliaryEnabled;

        @com.aliyun.core.annotation.NameInMap("TranslateLlmSceneEnabled")
        private Boolean translateLlmSceneEnabled;

        @com.aliyun.core.annotation.NameInMap("TranslationHotwordMap")
        private TranslationHotwordMap translationHotwordMap;

        private ExtraParams(Builder builder) {
            this.domainEducationEnabled = builder.domainEducationEnabled;
            this.fullTextSummaryFormat = builder.fullTextSummaryFormat;
            this.maxKeywords = builder.maxKeywords;
            this.nfixEnabled = builder.nfixEnabled;
            this.ocrAuxiliaryEnabled = builder.ocrAuxiliaryEnabled;
            this.translateLlmSceneEnabled = builder.translateLlmSceneEnabled;
            this.translationHotwordMap = builder.translationHotwordMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtraParams create() {
            return builder().build();
        }

        /**
         * @return domainEducationEnabled
         */
        public Boolean getDomainEducationEnabled() {
            return this.domainEducationEnabled;
        }

        /**
         * @return fullTextSummaryFormat
         */
        public String getFullTextSummaryFormat() {
            return this.fullTextSummaryFormat;
        }

        /**
         * @return maxKeywords
         */
        public Integer getMaxKeywords() {
            return this.maxKeywords;
        }

        /**
         * @return nfixEnabled
         */
        public Boolean getNfixEnabled() {
            return this.nfixEnabled;
        }

        /**
         * @return ocrAuxiliaryEnabled
         */
        public Boolean getOcrAuxiliaryEnabled() {
            return this.ocrAuxiliaryEnabled;
        }

        /**
         * @return translateLlmSceneEnabled
         */
        public Boolean getTranslateLlmSceneEnabled() {
            return this.translateLlmSceneEnabled;
        }

        /**
         * @return translationHotwordMap
         */
        public TranslationHotwordMap getTranslationHotwordMap() {
            return this.translationHotwordMap;
        }

        public static final class Builder {
            private Boolean domainEducationEnabled; 
            private String fullTextSummaryFormat; 
            private Integer maxKeywords; 
            private Boolean nfixEnabled; 
            private Boolean ocrAuxiliaryEnabled; 
            private Boolean translateLlmSceneEnabled; 
            private TranslationHotwordMap translationHotwordMap; 

            private Builder() {
            } 

            private Builder(ExtraParams model) {
                this.domainEducationEnabled = model.domainEducationEnabled;
                this.fullTextSummaryFormat = model.fullTextSummaryFormat;
                this.maxKeywords = model.maxKeywords;
                this.nfixEnabled = model.nfixEnabled;
                this.ocrAuxiliaryEnabled = model.ocrAuxiliaryEnabled;
                this.translateLlmSceneEnabled = model.translateLlmSceneEnabled;
                this.translationHotwordMap = model.translationHotwordMap;
            } 

            /**
             * DomainEducationEnabled.
             */
            public Builder domainEducationEnabled(Boolean domainEducationEnabled) {
                this.domainEducationEnabled = domainEducationEnabled;
                return this;
            }

            /**
             * <p>The return format of the full-text summary.</p>
             */
            public Builder fullTextSummaryFormat(String fullTextSummaryFormat) {
                this.fullTextSummaryFormat = fullTextSummaryFormat;
                return this;
            }

            /**
             * <p>The number of keywords to extract.</p>
             */
            public Builder maxKeywords(Integer maxKeywords) {
                this.maxKeywords = maxKeywords;
                return this;
            }

            /**
             * <p>Specifies whether to enable Nfix. In most cases, you do not need to set this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder nfixEnabled(Boolean nfixEnabled) {
                this.nfixEnabled = nfixEnabled;
                return this;
            }

            /**
             * OcrAuxiliaryEnabled.
             */
            public Builder ocrAuxiliaryEnabled(Boolean ocrAuxiliaryEnabled) {
                this.ocrAuxiliaryEnabled = ocrAuxiliaryEnabled;
                return this;
            }

            /**
             * TranslateLlmSceneEnabled.
             */
            public Builder translateLlmSceneEnabled(Boolean translateLlmSceneEnabled) {
                this.translateLlmSceneEnabled = translateLlmSceneEnabled;
                return this;
            }

            /**
             * <p>The translation hotword configuration.</p>
             */
            public Builder translationHotwordMap(TranslationHotwordMap translationHotwordMap) {
                this.translationHotwordMap = translationHotwordMap;
                return this;
            }

            public ExtraParams build() {
                return new ExtraParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTaskRequest</p>
     */
    public static class IdentityContents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private IdentityContents(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IdentityContents create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String description; 
            private String name; 

            private Builder() {
            } 

            private Builder(IdentityContents model) {
                this.description = model.description;
                this.name = model.name;
            } 

            /**
             * <p>The identity description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The identity name.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public IdentityContents build() {
                return new IdentityContents(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTaskRequest</p>
     */
    public static class IdentityRecognition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IdentityContents")
        private java.util.List<IdentityContents> identityContents;

        @com.aliyun.core.annotation.NameInMap("SceneIntroduction")
        private String sceneIntroduction;

        private IdentityRecognition(Builder builder) {
            this.identityContents = builder.identityContents;
            this.sceneIntroduction = builder.sceneIntroduction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IdentityRecognition create() {
            return builder().build();
        }

        /**
         * @return identityContents
         */
        public java.util.List<IdentityContents> getIdentityContents() {
            return this.identityContents;
        }

        /**
         * @return sceneIntroduction
         */
        public String getSceneIntroduction() {
            return this.sceneIntroduction;
        }

        public static final class Builder {
            private java.util.List<IdentityContents> identityContents; 
            private String sceneIntroduction; 

            private Builder() {
            } 

            private Builder(IdentityRecognition model) {
                this.identityContents = model.identityContents;
                this.sceneIntroduction = model.sceneIntroduction;
            } 

            /**
             * <p>The list of identity contents for identity recognition, including the identity name and description.</p>
             */
            public Builder identityContents(java.util.List<IdentityContents> identityContents) {
                this.identityContents = identityContents;
                return this;
            }

            /**
             * <p>The scene description for identity recognition.</p>
             */
            public Builder sceneIntroduction(String sceneIntroduction) {
                this.sceneIntroduction = sceneIntroduction;
                return this;
            }

            public IdentityRecognition build() {
                return new IdentityRecognition(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTaskRequest</p>
     */
    public static class MeetingAssistance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Types")
        private java.util.List<String> types;

        private MeetingAssistance(Builder builder) {
            this.types = builder.types;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeetingAssistance create() {
            return builder().build();
        }

        /**
         * @return types
         */
        public java.util.List<String> getTypes() {
            return this.types;
        }

        public static final class Builder {
            private java.util.List<String> types; 

            private Builder() {
            } 

            private Builder(MeetingAssistance model) {
                this.types = model.types;
            } 

            /**
             * <p>When the intelligent meeting notes feature is enabled, pass in the expected feature parameter types. Supported types: action items (Actions) and key information (KeyInformation). Key information includes keywords and key content (key sentences).</p>
             */
            public Builder types(java.util.List<String> types) {
                this.types = types;
                return this;
            }

            public MeetingAssistance build() {
                return new MeetingAssistance(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTaskRequest</p>
     */
    public static class InspectionContents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Title")
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
             * <p>The inspection dimension definition for service inspection.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The inspection dimension name for service inspection.</p>
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
     * {@link CreateTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTaskRequest</p>
     */
    public static class ServiceInspection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InspectionContents")
        private java.util.List<InspectionContents> inspectionContents;

        @com.aliyun.core.annotation.NameInMap("InspectionIntroduction")
        private String inspectionIntroduction;

        @com.aliyun.core.annotation.NameInMap("SceneIntroduction")
        private String sceneIntroduction;

        @com.aliyun.core.annotation.NameInMap("SpeakerMap")
        private java.util.Map<String, ?> speakerMap;

        private ServiceInspection(Builder builder) {
            this.inspectionContents = builder.inspectionContents;
            this.inspectionIntroduction = builder.inspectionIntroduction;
            this.sceneIntroduction = builder.sceneIntroduction;
            this.speakerMap = builder.speakerMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceInspection create() {
            return builder().build();
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

        /**
         * @return speakerMap
         */
        public java.util.Map<String, ?> getSpeakerMap() {
            return this.speakerMap;
        }

        public static final class Builder {
            private java.util.List<InspectionContents> inspectionContents; 
            private String inspectionIntroduction; 
            private String sceneIntroduction; 
            private java.util.Map<String, ?> speakerMap; 

            private Builder() {
            } 

            private Builder(ServiceInspection model) {
                this.inspectionContents = model.inspectionContents;
                this.inspectionIntroduction = model.inspectionIntroduction;
                this.sceneIntroduction = model.sceneIntroduction;
                this.speakerMap = model.speakerMap;
            } 

            /**
             * <p>The list of inspection dimensions for service inspection, including the dimension name and definition. The definition specifies the criteria that the large language model uses to determine whether a dimension is matched.</p>
             */
            public Builder inspectionContents(java.util.List<InspectionContents> inspectionContents) {
                this.inspectionContents = inspectionContents;
                return this;
            }

            /**
             * <p>The description of the inspection target and focus for service inspection.</p>
             */
            public Builder inspectionIntroduction(String inspectionIntroduction) {
                this.inspectionIntroduction = inspectionIntroduction;
                return this;
            }

            /**
             * <p>The conversation scene description for service inspection.</p>
             */
            public Builder sceneIntroduction(String sceneIntroduction) {
                this.sceneIntroduction = sceneIntroduction;
                return this;
            }

            /**
             * SpeakerMap.
             */
            public Builder speakerMap(java.util.Map<String, ?> speakerMap) {
                this.speakerMap = speakerMap;
                return this;
            }

            public ServiceInspection build() {
                return new ServiceInspection(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTaskRequest</p>
     */
    public static class Summarization extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Types")
        private java.util.List<String> types;

        private Summarization(Builder builder) {
            this.types = builder.types;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summarization create() {
            return builder().build();
        }

        /**
         * @return types
         */
        public java.util.List<String> getTypes() {
            return this.types;
        }

        public static final class Builder {
            private java.util.List<String> types; 

            private Builder() {
            } 

            private Builder(Summarization model) {
                this.types = model.types;
            } 

            /**
             * <p>When the summarization feature is enabled, pass in the expected summarization types. Supported types: full-text summary (Paragraph), speaker summary (Conversational), and Q&amp;A review summary (QuestionsAnswering).</p>
             * 
             * <strong>example:</strong>
             * <p>Paragraph</p>
             */
            public Builder types(java.util.List<String> types) {
                this.types = types;
                return this;
            }

            public Summarization build() {
                return new Summarization(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTaskRequest</p>
     */
    public static class Transcoding extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpectrumEnabled")
        private Boolean spectrumEnabled;

        @com.aliyun.core.annotation.NameInMap("TargetAudioFormat")
        private String targetAudioFormat;

        @com.aliyun.core.annotation.NameInMap("TargetVideoFormat")
        private String targetVideoFormat;

        @com.aliyun.core.annotation.NameInMap("VideoThumbnailEnabled")
        private Boolean videoThumbnailEnabled;

        private Transcoding(Builder builder) {
            this.spectrumEnabled = builder.spectrumEnabled;
            this.targetAudioFormat = builder.targetAudioFormat;
            this.targetVideoFormat = builder.targetVideoFormat;
            this.videoThumbnailEnabled = builder.videoThumbnailEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Transcoding create() {
            return builder().build();
        }

        /**
         * @return spectrumEnabled
         */
        public Boolean getSpectrumEnabled() {
            return this.spectrumEnabled;
        }

        /**
         * @return targetAudioFormat
         */
        public String getTargetAudioFormat() {
            return this.targetAudioFormat;
        }

        /**
         * @return targetVideoFormat
         */
        public String getTargetVideoFormat() {
            return this.targetVideoFormat;
        }

        /**
         * @return videoThumbnailEnabled
         */
        public Boolean getVideoThumbnailEnabled() {
            return this.videoThumbnailEnabled;
        }

        public static final class Builder {
            private Boolean spectrumEnabled; 
            private String targetAudioFormat; 
            private String targetVideoFormat; 
            private Boolean videoThumbnailEnabled; 

            private Builder() {
            } 

            private Builder(Transcoding model) {
                this.spectrumEnabled = model.spectrumEnabled;
                this.targetAudioFormat = model.targetAudioFormat;
                this.targetVideoFormat = model.targetVideoFormat;
                this.videoThumbnailEnabled = model.videoThumbnailEnabled;
            } 

            /**
             * <p>Specifies whether to generate an audio waveform from the original audio/video file or audio stream and save it. Currently, only MP3 format is supported. This parameter is optional when creating offline file transcription or real-time meetings.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder spectrumEnabled(Boolean spectrumEnabled) {
                this.spectrumEnabled = spectrumEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to convert the original audio/video file or audio stream to MP3 format for storage. Currently, only MP3 format is supported. This parameter is optional when creating offline file transcription or real-time meetings.</p>
             * 
             * <strong>example:</strong>
             * <p>mp3</p>
             */
            public Builder targetAudioFormat(String targetAudioFormat) {
                this.targetAudioFormat = targetAudioFormat;
                return this;
            }

            /**
             * <p>Specifies whether to convert the original video file to MP4 format for storage. Currently, only MP4 format is supported. This parameter is meaningful only when creating offline file transcription and the original file is in video format. Typically, you do not need to set this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>mp4</p>
             */
            public Builder targetVideoFormat(String targetVideoFormat) {
                this.targetVideoFormat = targetVideoFormat;
                return this;
            }

            /**
             * <p>Specifies whether to extract video thumbnails from the original video file and save them. This parameter is meaningful only when creating offline file transcription and the original file is in video format. Typically, you do not need to set this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder videoThumbnailEnabled(Boolean videoThumbnailEnabled) {
                this.videoThumbnailEnabled = videoThumbnailEnabled;
                return this;
            }

            public Transcoding build() {
                return new Transcoding(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTaskRequest</p>
     */
    public static class Diarization extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpeakerCount")
        private Integer speakerCount;

        private Diarization(Builder builder) {
            this.speakerCount = builder.speakerCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Diarization create() {
            return builder().build();
        }

        /**
         * @return speakerCount
         */
        public Integer getSpeakerCount() {
            return this.speakerCount;
        }

        public static final class Builder {
            private Integer speakerCount; 

            private Builder() {
            } 

            private Builder(Diarization model) {
                this.speakerCount = model.speakerCount;
            } 

            /**
             * <p>Sets the speaker diarization parameter.</p>
             * <p>If not set: speaker role differentiation is not used. </p>
             * <p>0: the number of speakers is undetermined.</p>
             * <p>2: the number of speakers is 2.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder speakerCount(Integer speakerCount) {
                this.speakerCount = speakerCount;
                return this;
            }

            public Diarization build() {
                return new Diarization(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTaskRequest</p>
     */
    public static class Transcription extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdditionalStreamOutputLevel")
        private Integer additionalStreamOutputLevel;

        @com.aliyun.core.annotation.NameInMap("AudioEventDetectionEnabled")
        private Boolean audioEventDetectionEnabled;

        @com.aliyun.core.annotation.NameInMap("Diarization")
        private Diarization diarization;

        @com.aliyun.core.annotation.NameInMap("DiarizationEnabled")
        private Boolean diarizationEnabled;

        @com.aliyun.core.annotation.NameInMap("DisfluencyEnabled")
        private Boolean disfluencyEnabled;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("OutputLevel")
        private Integer outputLevel;

        @com.aliyun.core.annotation.NameInMap("Phrase")
        private java.util.Map<String, ?> phrase;

        @com.aliyun.core.annotation.NameInMap("PhraseId")
        private String phraseId;

        @com.aliyun.core.annotation.NameInMap("ProfanityFilterEnabled")
        private Boolean profanityFilterEnabled;

        @com.aliyun.core.annotation.NameInMap("RealtimeDiarizationEnabled")
        private Boolean realtimeDiarizationEnabled;

        private Transcription(Builder builder) {
            this.additionalStreamOutputLevel = builder.additionalStreamOutputLevel;
            this.audioEventDetectionEnabled = builder.audioEventDetectionEnabled;
            this.diarization = builder.diarization;
            this.diarizationEnabled = builder.diarizationEnabled;
            this.disfluencyEnabled = builder.disfluencyEnabled;
            this.model = builder.model;
            this.outputLevel = builder.outputLevel;
            this.phrase = builder.phrase;
            this.phraseId = builder.phraseId;
            this.profanityFilterEnabled = builder.profanityFilterEnabled;
            this.realtimeDiarizationEnabled = builder.realtimeDiarizationEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Transcription create() {
            return builder().build();
        }

        /**
         * @return additionalStreamOutputLevel
         */
        public Integer getAdditionalStreamOutputLevel() {
            return this.additionalStreamOutputLevel;
        }

        /**
         * @return audioEventDetectionEnabled
         */
        public Boolean getAudioEventDetectionEnabled() {
            return this.audioEventDetectionEnabled;
        }

        /**
         * @return diarization
         */
        public Diarization getDiarization() {
            return this.diarization;
        }

        /**
         * @return diarizationEnabled
         */
        public Boolean getDiarizationEnabled() {
            return this.diarizationEnabled;
        }

        /**
         * @return disfluencyEnabled
         */
        public Boolean getDisfluencyEnabled() {
            return this.disfluencyEnabled;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return outputLevel
         */
        public Integer getOutputLevel() {
            return this.outputLevel;
        }

        /**
         * @return phrase
         */
        public java.util.Map<String, ?> getPhrase() {
            return this.phrase;
        }

        /**
         * @return phraseId
         */
        public String getPhraseId() {
            return this.phraseId;
        }

        /**
         * @return profanityFilterEnabled
         */
        public Boolean getProfanityFilterEnabled() {
            return this.profanityFilterEnabled;
        }

        /**
         * @return realtimeDiarizationEnabled
         */
        public Boolean getRealtimeDiarizationEnabled() {
            return this.realtimeDiarizationEnabled;
        }

        public static final class Builder {
            private Integer additionalStreamOutputLevel; 
            private Boolean audioEventDetectionEnabled; 
            private Diarization diarization; 
            private Boolean diarizationEnabled; 
            private Boolean disfluencyEnabled; 
            private String model; 
            private Integer outputLevel; 
            private java.util.Map<String, ?> phrase; 
            private String phraseId; 
            private Boolean profanityFilterEnabled; 
            private Boolean realtimeDiarizationEnabled; 

            private Builder() {
            } 

            private Builder(Transcription model) {
                this.additionalStreamOutputLevel = model.additionalStreamOutputLevel;
                this.audioEventDetectionEnabled = model.audioEventDetectionEnabled;
                this.diarization = model.diarization;
                this.diarizationEnabled = model.diarizationEnabled;
                this.disfluencyEnabled = model.disfluencyEnabled;
                this.model = model.model;
                this.outputLevel = model.outputLevel;
                this.phrase = model.phrase;
                this.phraseId = model.phraseId;
                this.profanityFilterEnabled = model.profanityFilterEnabled;
                this.realtimeDiarizationEnabled = model.realtimeDiarizationEnabled;
            } 

            /**
             * <p>Sets the output level for speech recognition results of the active speaker in real-time recording scenarios.</p>
             * <ul>
             * <li><p><strong>1</strong>: Returns results when a complete sentence is recognized.</p>
             * </li>
             * <li><p><strong>2</strong>: Returns results for both intermediate results and complete sentences.</p>
             * </li>
             * </ul>
             * <p>Set this parameter as needed only in real-time recording scenarios when MultipleStreamsEnabled is set to true. This parameter does not need to be set for offline transcription scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder additionalStreamOutputLevel(Integer additionalStreamOutputLevel) {
                this.additionalStreamOutputLevel = additionalStreamOutputLevel;
                return this;
            }

            /**
             * <p>Specifies whether to enable audio event detection during speech transcription to determine whether events such as music exist in the audio.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder audioEventDetectionEnabled(Boolean audioEventDetectionEnabled) {
                this.audioEventDetectionEnabled = audioEventDetectionEnabled;
                return this;
            }

            /**
             * <p>The speaker diarization parameters.</p>
             */
            public Builder diarization(Diarization diarization) {
                this.diarization = diarization;
                return this;
            }

            /**
             * <p>Specifies whether to enable speaker diarization.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder diarizationEnabled(Boolean diarizationEnabled) {
                this.diarizationEnabled = diarizationEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to enable disfluency removal during speech transcription. Enabled by default.</p>
             */
            public Builder disfluencyEnabled(Boolean disfluencyEnabled) {
                this.disfluencyEnabled = disfluencyEnabled;
                return this;
            }

            /**
             * <p>Sets the speech transcription model to improve transcription accuracy in specific domains.</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>Sets the output level for speech recognition results. Default value: 1.</p>
             * <ul>
             * <li><p><strong>1</strong>: Returns results when a complete sentence is recognized.</p>
             * </li>
             * <li><p><strong>2</strong>: Returns results for both intermediate results and complete sentences.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder outputLevel(Integer outputLevel) {
                this.outputLevel = outputLevel;
                return this;
            }

            /**
             * Phrase.
             */
            public Builder phrase(java.util.Map<String, ?> phrase) {
                this.phrase = phrase;
                return this;
            }

            /**
             * <p>The vocabulary ID of the hot words.</p>
             * 
             * <strong>example:</strong>
             * <p>ce9c2a34b6d847bf92a77d0a196f****</p>
             */
            public Builder phraseId(String phraseId) {
                this.phraseId = phraseId;
                return this;
            }

            /**
             * <p>Specifies whether to enable profanity filtering during speech transcription. Enabled by default.</p>
             */
            public Builder profanityFilterEnabled(Boolean profanityFilterEnabled) {
                this.profanityFilterEnabled = profanityFilterEnabled;
                return this;
            }

            /**
             * RealtimeDiarizationEnabled.
             */
            public Builder realtimeDiarizationEnabled(Boolean realtimeDiarizationEnabled) {
                this.realtimeDiarizationEnabled = realtimeDiarizationEnabled;
                return this;
            }

            public Transcription build() {
                return new Transcription(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTaskRequest</p>
     */
    public static class Translation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdditionalStreamOutputLevel")
        private Integer additionalStreamOutputLevel;

        @com.aliyun.core.annotation.NameInMap("OutputLevel")
        private Integer outputLevel;

        @com.aliyun.core.annotation.NameInMap("TargetLanguages")
        private java.util.List<String> targetLanguages;

        @com.aliyun.core.annotation.NameInMap("TranslateLlmSceneEnabled")
        private Boolean translateLlmSceneEnabled;

        private Translation(Builder builder) {
            this.additionalStreamOutputLevel = builder.additionalStreamOutputLevel;
            this.outputLevel = builder.outputLevel;
            this.targetLanguages = builder.targetLanguages;
            this.translateLlmSceneEnabled = builder.translateLlmSceneEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Translation create() {
            return builder().build();
        }

        /**
         * @return additionalStreamOutputLevel
         */
        public Integer getAdditionalStreamOutputLevel() {
            return this.additionalStreamOutputLevel;
        }

        /**
         * @return outputLevel
         */
        public Integer getOutputLevel() {
            return this.outputLevel;
        }

        /**
         * @return targetLanguages
         */
        public java.util.List<String> getTargetLanguages() {
            return this.targetLanguages;
        }

        /**
         * @return translateLlmSceneEnabled
         */
        public Boolean getTranslateLlmSceneEnabled() {
            return this.translateLlmSceneEnabled;
        }

        public static final class Builder {
            private Integer additionalStreamOutputLevel; 
            private Integer outputLevel; 
            private java.util.List<String> targetLanguages; 
            private Boolean translateLlmSceneEnabled; 

            private Builder() {
            } 

            private Builder(Translation model) {
                this.additionalStreamOutputLevel = model.additionalStreamOutputLevel;
                this.outputLevel = model.outputLevel;
                this.targetLanguages = model.targetLanguages;
                this.translateLlmSceneEnabled = model.translateLlmSceneEnabled;
            } 

            /**
             * <p>Sets the output level for translation results of the active speaker in real-time recording scenarios.</p>
             * <ul>
             * <li><strong>1</strong>: Returns results when a complete sentence is recognized.</li>
             * <li><strong>2</strong>: Returns results for both intermediate results and complete sentences.</li>
             * </ul>
             * <p>Set this parameter as needed only in real-time recording scenarios when MultipleStreamsEnabled is set to true. This parameter does not need to be set for offline transcription scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder additionalStreamOutputLevel(Integer additionalStreamOutputLevel) {
                this.additionalStreamOutputLevel = additionalStreamOutputLevel;
                return this;
            }

            /**
             * <p>Sets the output level for real-time translation results. Default value: 1.</p>
             * <ul>
             * <li><strong>1</strong>: Returns results when a complete sentence is recognized.</li>
             * <li><strong>2</strong>: Returns results for both intermediate results and complete sentences.</li>
             * </ul>
             * <p>Set this parameter as needed only in real-time recording scenarios. This parameter does not need to be set for offline transcription scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder outputLevel(Integer outputLevel) {
                this.outputLevel = outputLevel;
                return this;
            }

            /**
             * <p>The target languages to set when the translation feature is enabled. Chinese, English, and Japanese are supported.</p>
             */
            public Builder targetLanguages(java.util.List<String> targetLanguages) {
                this.targetLanguages = targetLanguages;
                return this;
            }

            /**
             * <p>Specifies whether to use large language model-based translation. Default value: false.</p>
             */
            public Builder translateLlmSceneEnabled(Boolean translateLlmSceneEnabled) {
                this.translateLlmSceneEnabled = translateLlmSceneEnabled;
                return this;
            }

            public Translation build() {
                return new Translation(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTaskRequest</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoChapters")
        private AutoChapters autoChapters;

        @com.aliyun.core.annotation.NameInMap("AutoChaptersEnabled")
        private Boolean autoChaptersEnabled;

        @com.aliyun.core.annotation.NameInMap("ContentExtraction")
        private ContentExtraction contentExtraction;

        @com.aliyun.core.annotation.NameInMap("ContentExtractionEnabled")
        private Boolean contentExtractionEnabled;

        @com.aliyun.core.annotation.NameInMap("CustomPrompt")
        private CustomPrompt customPrompt;

        @com.aliyun.core.annotation.NameInMap("CustomPromptEnabled")
        private Boolean customPromptEnabled;

        @com.aliyun.core.annotation.NameInMap("ExtraParams")
        private ExtraParams extraParams;

        @com.aliyun.core.annotation.NameInMap("IdentityRecognition")
        private IdentityRecognition identityRecognition;

        @com.aliyun.core.annotation.NameInMap("IdentityRecognitionEnabled")
        private Boolean identityRecognitionEnabled;

        @com.aliyun.core.annotation.NameInMap("LlmOutputLanguage")
        private String llmOutputLanguage;

        @com.aliyun.core.annotation.NameInMap("MeetingAssistance")
        private MeetingAssistance meetingAssistance;

        @com.aliyun.core.annotation.NameInMap("MeetingAssistanceEnabled")
        private Boolean meetingAssistanceEnabled;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("PptExtractionEnabled")
        private Boolean pptExtractionEnabled;

        @com.aliyun.core.annotation.NameInMap("ServiceInspection")
        private ServiceInspection serviceInspection;

        @com.aliyun.core.annotation.NameInMap("ServiceInspectionEnabled")
        private Boolean serviceInspectionEnabled;

        @com.aliyun.core.annotation.NameInMap("Summarization")
        private Summarization summarization;

        @com.aliyun.core.annotation.NameInMap("SummarizationEnabled")
        private Boolean summarizationEnabled;

        @com.aliyun.core.annotation.NameInMap("TextPolishEnabled")
        private Boolean textPolishEnabled;

        @com.aliyun.core.annotation.NameInMap("Transcoding")
        private Transcoding transcoding;

        @com.aliyun.core.annotation.NameInMap("Transcription")
        private Transcription transcription;

        @com.aliyun.core.annotation.NameInMap("Translation")
        private Translation translation;

        @com.aliyun.core.annotation.NameInMap("TranslationEnabled")
        private Boolean translationEnabled;

        private Parameters(Builder builder) {
            this.autoChapters = builder.autoChapters;
            this.autoChaptersEnabled = builder.autoChaptersEnabled;
            this.contentExtraction = builder.contentExtraction;
            this.contentExtractionEnabled = builder.contentExtractionEnabled;
            this.customPrompt = builder.customPrompt;
            this.customPromptEnabled = builder.customPromptEnabled;
            this.extraParams = builder.extraParams;
            this.identityRecognition = builder.identityRecognition;
            this.identityRecognitionEnabled = builder.identityRecognitionEnabled;
            this.llmOutputLanguage = builder.llmOutputLanguage;
            this.meetingAssistance = builder.meetingAssistance;
            this.meetingAssistanceEnabled = builder.meetingAssistanceEnabled;
            this.model = builder.model;
            this.pptExtractionEnabled = builder.pptExtractionEnabled;
            this.serviceInspection = builder.serviceInspection;
            this.serviceInspectionEnabled = builder.serviceInspectionEnabled;
            this.summarization = builder.summarization;
            this.summarizationEnabled = builder.summarizationEnabled;
            this.textPolishEnabled = builder.textPolishEnabled;
            this.transcoding = builder.transcoding;
            this.transcription = builder.transcription;
            this.translation = builder.translation;
            this.translationEnabled = builder.translationEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return autoChapters
         */
        public AutoChapters getAutoChapters() {
            return this.autoChapters;
        }

        /**
         * @return autoChaptersEnabled
         */
        public Boolean getAutoChaptersEnabled() {
            return this.autoChaptersEnabled;
        }

        /**
         * @return contentExtraction
         */
        public ContentExtraction getContentExtraction() {
            return this.contentExtraction;
        }

        /**
         * @return contentExtractionEnabled
         */
        public Boolean getContentExtractionEnabled() {
            return this.contentExtractionEnabled;
        }

        /**
         * @return customPrompt
         */
        public CustomPrompt getCustomPrompt() {
            return this.customPrompt;
        }

        /**
         * @return customPromptEnabled
         */
        public Boolean getCustomPromptEnabled() {
            return this.customPromptEnabled;
        }

        /**
         * @return extraParams
         */
        public ExtraParams getExtraParams() {
            return this.extraParams;
        }

        /**
         * @return identityRecognition
         */
        public IdentityRecognition getIdentityRecognition() {
            return this.identityRecognition;
        }

        /**
         * @return identityRecognitionEnabled
         */
        public Boolean getIdentityRecognitionEnabled() {
            return this.identityRecognitionEnabled;
        }

        /**
         * @return llmOutputLanguage
         */
        public String getLlmOutputLanguage() {
            return this.llmOutputLanguage;
        }

        /**
         * @return meetingAssistance
         */
        public MeetingAssistance getMeetingAssistance() {
            return this.meetingAssistance;
        }

        /**
         * @return meetingAssistanceEnabled
         */
        public Boolean getMeetingAssistanceEnabled() {
            return this.meetingAssistanceEnabled;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return pptExtractionEnabled
         */
        public Boolean getPptExtractionEnabled() {
            return this.pptExtractionEnabled;
        }

        /**
         * @return serviceInspection
         */
        public ServiceInspection getServiceInspection() {
            return this.serviceInspection;
        }

        /**
         * @return serviceInspectionEnabled
         */
        public Boolean getServiceInspectionEnabled() {
            return this.serviceInspectionEnabled;
        }

        /**
         * @return summarization
         */
        public Summarization getSummarization() {
            return this.summarization;
        }

        /**
         * @return summarizationEnabled
         */
        public Boolean getSummarizationEnabled() {
            return this.summarizationEnabled;
        }

        /**
         * @return textPolishEnabled
         */
        public Boolean getTextPolishEnabled() {
            return this.textPolishEnabled;
        }

        /**
         * @return transcoding
         */
        public Transcoding getTranscoding() {
            return this.transcoding;
        }

        /**
         * @return transcription
         */
        public Transcription getTranscription() {
            return this.transcription;
        }

        /**
         * @return translation
         */
        public Translation getTranslation() {
            return this.translation;
        }

        /**
         * @return translationEnabled
         */
        public Boolean getTranslationEnabled() {
            return this.translationEnabled;
        }

        public static final class Builder {
            private AutoChapters autoChapters; 
            private Boolean autoChaptersEnabled; 
            private ContentExtraction contentExtraction; 
            private Boolean contentExtractionEnabled; 
            private CustomPrompt customPrompt; 
            private Boolean customPromptEnabled; 
            private ExtraParams extraParams; 
            private IdentityRecognition identityRecognition; 
            private Boolean identityRecognitionEnabled; 
            private String llmOutputLanguage; 
            private MeetingAssistance meetingAssistance; 
            private Boolean meetingAssistanceEnabled; 
            private String model; 
            private Boolean pptExtractionEnabled; 
            private ServiceInspection serviceInspection; 
            private Boolean serviceInspectionEnabled; 
            private Summarization summarization; 
            private Boolean summarizationEnabled; 
            private Boolean textPolishEnabled; 
            private Transcoding transcoding; 
            private Transcription transcription; 
            private Translation translation; 
            private Boolean translationEnabled; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.autoChapters = model.autoChapters;
                this.autoChaptersEnabled = model.autoChaptersEnabled;
                this.contentExtraction = model.contentExtraction;
                this.contentExtractionEnabled = model.contentExtractionEnabled;
                this.customPrompt = model.customPrompt;
                this.customPromptEnabled = model.customPromptEnabled;
                this.extraParams = model.extraParams;
                this.identityRecognition = model.identityRecognition;
                this.identityRecognitionEnabled = model.identityRecognitionEnabled;
                this.llmOutputLanguage = model.llmOutputLanguage;
                this.meetingAssistance = model.meetingAssistance;
                this.meetingAssistanceEnabled = model.meetingAssistanceEnabled;
                this.model = model.model;
                this.pptExtractionEnabled = model.pptExtractionEnabled;
                this.serviceInspection = model.serviceInspection;
                this.serviceInspectionEnabled = model.serviceInspectionEnabled;
                this.summarization = model.summarization;
                this.summarizationEnabled = model.summarizationEnabled;
                this.textPolishEnabled = model.textPolishEnabled;
                this.transcoding = model.transcoding;
                this.transcription = model.transcription;
                this.translation = model.translation;
                this.translationEnabled = model.translationEnabled;
            } 

            /**
             * AutoChapters.
             */
            public Builder autoChapters(AutoChapters autoChapters) {
                this.autoChapters = autoChapters;
                return this;
            }

            /**
             * <p>Specifies whether to enable the chapter overview feature. When enabled, chapter titles and chapter summaries are generated.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoChaptersEnabled(Boolean autoChaptersEnabled) {
                this.autoChaptersEnabled = autoChaptersEnabled;
                return this;
            }

            /**
             * <p>The conversation content extraction parameter object.</p>
             */
            public Builder contentExtraction(ContentExtraction contentExtraction) {
                this.contentExtraction = contentExtraction;
                return this;
            }

            /**
             * <p>The business user ID.</p>
             */
            public Builder contentExtractionEnabled(Boolean contentExtractionEnabled) {
                this.contentExtractionEnabled = contentExtractionEnabled;
                return this;
            }

            /**
             * <p>The custom prompt control parameter object.</p>
             */
            public Builder customPrompt(CustomPrompt customPrompt) {
                this.customPrompt = customPrompt;
                return this;
            }

            /**
             * <p>Specifies whether to enable the custom prompt feature. When enabled, you can enter a personalized custom prompt.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder customPromptEnabled(Boolean customPromptEnabled) {
                this.customPromptEnabled = customPromptEnabled;
                return this;
            }

            /**
             * <p>The extra parameters. In most cases, you do not need to set this parameter.</p>
             */
            public Builder extraParams(ExtraParams extraParams) {
                this.extraParams = extraParams;
                return this;
            }

            /**
             * <p>The identity recognition parameter object.</p>
             */
            public Builder identityRecognition(IdentityRecognition identityRecognition) {
                this.identityRecognition = identityRecognition;
                return this;
            }

            /**
             * <p>Specifies whether to enable the identity recognition feature.</p>
             */
            public Builder identityRecognitionEnabled(Boolean identityRecognitionEnabled) {
                this.identityRecognitionEnabled = identityRecognitionEnabled;
                return this;
            }

            /**
             * LlmOutputLanguage.
             */
            public Builder llmOutputLanguage(String llmOutputLanguage) {
                this.llmOutputLanguage = llmOutputLanguage;
                return this;
            }

            /**
             * <p>The control parameters for the intelligent meeting notes feature, which supports algorithm processing for action items, keywords, and key content. If you enable MeetingAssistanceEnabled but do not specify algorithm types through MeetingAssistance, all types are called and returned by default.</p>
             */
            public Builder meetingAssistance(MeetingAssistance meetingAssistance) {
                this.meetingAssistance = meetingAssistance;
                return this;
            }

            /**
             * <p>Specifies whether to enable the intelligent meeting notes feature. When enabled, results such as keywords, key content, and action items are generated.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder meetingAssistanceEnabled(Boolean meetingAssistanceEnabled) {
                this.meetingAssistanceEnabled = meetingAssistanceEnabled;
                return this;
            }

            /**
             * <p>Sets the speech transcription model to improve transcription accuracy in specific domains.</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>Specifies whether to enable PPT extraction and PPT summarization. When enabled, PPT frames are extracted from the video file and corresponding summaries are generated. Enable this parameter only for offline transcription when the source file is a video file. Results cannot be generated in real-time recording scenarios or offline transcription scenarios where the source file is audio only.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder pptExtractionEnabled(Boolean pptExtractionEnabled) {
                this.pptExtractionEnabled = pptExtractionEnabled;
                return this;
            }

            /**
             * <p>The service inspection parameter object.</p>
             */
            public Builder serviceInspection(ServiceInspection serviceInspection) {
                this.serviceInspection = serviceInspection;
                return this;
            }

            /**
             * <p>Specifies whether to enable the service inspection feature. Default value: false.</p>
             */
            public Builder serviceInspectionEnabled(Boolean serviceInspectionEnabled) {
                this.serviceInspectionEnabled = serviceInspectionEnabled;
                return this;
            }

            /**
             * <p>The summarization control parameters.</p>
             */
            public Builder summarization(Summarization summarization) {
                this.summarization = summarization;
                return this;
            }

            /**
             * <p>Specifies whether to enable the summarization feature. When enabled, results such as full-text summaries and speaker summaries can be generated.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder summarizationEnabled(Boolean summarizationEnabled) {
                this.summarizationEnabled = summarizationEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to enable the spoken-to-written text conversion feature.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder textPolishEnabled(Boolean textPolishEnabled) {
                this.textPolishEnabled = textPolishEnabled;
                return this;
            }

            /**
             * <p>The audio/video or audio stream transcoding module.</p>
             */
            public Builder transcoding(Transcoding transcoding) {
                this.transcoding = transcoding;
                return this;
            }

            /**
             * <p>The speech transcription control parameters.</p>
             */
            public Builder transcription(Transcription transcription) {
                this.transcription = transcription;
                return this;
            }

            /**
             * <p>The translation control parameters.</p>
             */
            public Builder translation(Translation translation) {
                this.translation = translation;
                return this;
            }

            /**
             * <p>Specifies whether to enable the translation feature.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder translationEnabled(Boolean translationEnabled) {
                this.translationEnabled = translationEnabled;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
