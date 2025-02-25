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
         * AppKey.
         */
        public Builder appKey(String appKey) {
            this.putBodyParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * Input.
         */
        public Builder input(Input input) {
            this.putBodyParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(Parameters parameters) {
            this.putBodyParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * operation.
         */
        public Builder operation(String operation) {
            this.putQueryParameter("operation", operation);
            this.operation = operation;
            return this;
        }

        /**
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

            /**
             * AudioChannelMode.
             */
            public Builder audioChannelMode(String audioChannelMode) {
                this.audioChannelMode = audioChannelMode;
                return this;
            }

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * LanguageHints.
             */
            public Builder languageHints(java.util.List<String> languageHints) {
                this.languageHints = languageHints;
                return this;
            }

            /**
             * MultipleStreamsEnabled.
             */
            public Builder multipleStreamsEnabled(Boolean multipleStreamsEnabled) {
                this.multipleStreamsEnabled = multipleStreamsEnabled;
                return this;
            }

            /**
             * OutputPath.
             */
            public Builder outputPath(String outputPath) {
                this.outputPath = outputPath;
                return this;
            }

            /**
             * ProgressiveCallbacksEnabled.
             */
            public Builder progressiveCallbacksEnabled(Boolean progressiveCallbacksEnabled) {
                this.progressiveCallbacksEnabled = progressiveCallbacksEnabled;
                return this;
            }

            /**
             * SampleRate.
             */
            public Builder sampleRate(Integer sampleRate) {
                this.sampleRate = sampleRate;
                return this;
            }

            /**
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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskKey.
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
    public static class ExtractionContents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private ExtractionContents(Builder builder) {
            this.content = builder.content;
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
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private String title; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Title.
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

            /**
             * ExtractionContents.
             */
            public Builder extractionContents(java.util.List<ExtractionContents> extractionContents) {
                this.extractionContents = extractionContents;
                return this;
            }

            /**
             * SceneIntroduction.
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

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * TransType.
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

            /**
             * Contents.
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
    public static class ExtraParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainEducationEnabled")
        private Boolean domainEducationEnabled;

        @com.aliyun.core.annotation.NameInMap("MaxKeywords")
        private Integer maxKeywords;

        @com.aliyun.core.annotation.NameInMap("NfixEnabled")
        private Boolean nfixEnabled;

        @com.aliyun.core.annotation.NameInMap("OcrAuxiliaryEnabled")
        private Boolean ocrAuxiliaryEnabled;

        @com.aliyun.core.annotation.NameInMap("TranslateLlmSceneEnabled")
        private Boolean translateLlmSceneEnabled;

        private ExtraParams(Builder builder) {
            this.domainEducationEnabled = builder.domainEducationEnabled;
            this.maxKeywords = builder.maxKeywords;
            this.nfixEnabled = builder.nfixEnabled;
            this.ocrAuxiliaryEnabled = builder.ocrAuxiliaryEnabled;
            this.translateLlmSceneEnabled = builder.translateLlmSceneEnabled;
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

        public static final class Builder {
            private Boolean domainEducationEnabled; 
            private Integer maxKeywords; 
            private Boolean nfixEnabled; 
            private Boolean ocrAuxiliaryEnabled; 
            private Boolean translateLlmSceneEnabled; 

            /**
             * DomainEducationEnabled.
             */
            public Builder domainEducationEnabled(Boolean domainEducationEnabled) {
                this.domainEducationEnabled = domainEducationEnabled;
                return this;
            }

            /**
             * MaxKeywords.
             */
            public Builder maxKeywords(Integer maxKeywords) {
                this.maxKeywords = maxKeywords;
                return this;
            }

            /**
             * NfixEnabled.
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

            /**
             * Types.
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

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Title.
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

            /**
             * InspectionContents.
             */
            public Builder inspectionContents(java.util.List<InspectionContents> inspectionContents) {
                this.inspectionContents = inspectionContents;
                return this;
            }

            /**
             * InspectionIntroduction.
             */
            public Builder inspectionIntroduction(String inspectionIntroduction) {
                this.inspectionIntroduction = inspectionIntroduction;
                return this;
            }

            /**
             * SceneIntroduction.
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

            /**
             * Types.
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

            /**
             * SpectrumEnabled.
             */
            public Builder spectrumEnabled(Boolean spectrumEnabled) {
                this.spectrumEnabled = spectrumEnabled;
                return this;
            }

            /**
             * TargetAudioFormat.
             */
            public Builder targetAudioFormat(String targetAudioFormat) {
                this.targetAudioFormat = targetAudioFormat;
                return this;
            }

            /**
             * TargetVideoFormat.
             */
            public Builder targetVideoFormat(String targetVideoFormat) {
                this.targetVideoFormat = targetVideoFormat;
                return this;
            }

            /**
             * VideoThumbnailEnabled.
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

            /**
             * SpeakerCount.
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

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("OutputLevel")
        private Integer outputLevel;

        @com.aliyun.core.annotation.NameInMap("PhraseId")
        private String phraseId;

        private Transcription(Builder builder) {
            this.additionalStreamOutputLevel = builder.additionalStreamOutputLevel;
            this.audioEventDetectionEnabled = builder.audioEventDetectionEnabled;
            this.diarization = builder.diarization;
            this.diarizationEnabled = builder.diarizationEnabled;
            this.model = builder.model;
            this.outputLevel = builder.outputLevel;
            this.phraseId = builder.phraseId;
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
         * @return phraseId
         */
        public String getPhraseId() {
            return this.phraseId;
        }

        public static final class Builder {
            private Integer additionalStreamOutputLevel; 
            private Boolean audioEventDetectionEnabled; 
            private Diarization diarization; 
            private Boolean diarizationEnabled; 
            private String model; 
            private Integer outputLevel; 
            private String phraseId; 

            /**
             * AdditionalStreamOutputLevel.
             */
            public Builder additionalStreamOutputLevel(Integer additionalStreamOutputLevel) {
                this.additionalStreamOutputLevel = additionalStreamOutputLevel;
                return this;
            }

            /**
             * AudioEventDetectionEnabled.
             */
            public Builder audioEventDetectionEnabled(Boolean audioEventDetectionEnabled) {
                this.audioEventDetectionEnabled = audioEventDetectionEnabled;
                return this;
            }

            /**
             * Diarization.
             */
            public Builder diarization(Diarization diarization) {
                this.diarization = diarization;
                return this;
            }

            /**
             * DiarizationEnabled.
             */
            public Builder diarizationEnabled(Boolean diarizationEnabled) {
                this.diarizationEnabled = diarizationEnabled;
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
             * OutputLevel.
             */
            public Builder outputLevel(Integer outputLevel) {
                this.outputLevel = outputLevel;
                return this;
            }

            /**
             * PhraseId.
             */
            public Builder phraseId(String phraseId) {
                this.phraseId = phraseId;
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

        private Translation(Builder builder) {
            this.additionalStreamOutputLevel = builder.additionalStreamOutputLevel;
            this.outputLevel = builder.outputLevel;
            this.targetLanguages = builder.targetLanguages;
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

        public static final class Builder {
            private Integer additionalStreamOutputLevel; 
            private Integer outputLevel; 
            private java.util.List<String> targetLanguages; 

            /**
             * AdditionalStreamOutputLevel.
             */
            public Builder additionalStreamOutputLevel(Integer additionalStreamOutputLevel) {
                this.additionalStreamOutputLevel = additionalStreamOutputLevel;
                return this;
            }

            /**
             * OutputLevel.
             */
            public Builder outputLevel(Integer outputLevel) {
                this.outputLevel = outputLevel;
                return this;
            }

            /**
             * TargetLanguages.
             */
            public Builder targetLanguages(java.util.List<String> targetLanguages) {
                this.targetLanguages = targetLanguages;
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

        @com.aliyun.core.annotation.NameInMap("MeetingAssistance")
        private MeetingAssistance meetingAssistance;

        @com.aliyun.core.annotation.NameInMap("MeetingAssistanceEnabled")
        private Boolean meetingAssistanceEnabled;

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
            this.autoChaptersEnabled = builder.autoChaptersEnabled;
            this.contentExtraction = builder.contentExtraction;
            this.contentExtractionEnabled = builder.contentExtractionEnabled;
            this.customPrompt = builder.customPrompt;
            this.customPromptEnabled = builder.customPromptEnabled;
            this.extraParams = builder.extraParams;
            this.meetingAssistance = builder.meetingAssistance;
            this.meetingAssistanceEnabled = builder.meetingAssistanceEnabled;
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
            private Boolean autoChaptersEnabled; 
            private ContentExtraction contentExtraction; 
            private Boolean contentExtractionEnabled; 
            private CustomPrompt customPrompt; 
            private Boolean customPromptEnabled; 
            private ExtraParams extraParams; 
            private MeetingAssistance meetingAssistance; 
            private Boolean meetingAssistanceEnabled; 
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

            /**
             * AutoChaptersEnabled.
             */
            public Builder autoChaptersEnabled(Boolean autoChaptersEnabled) {
                this.autoChaptersEnabled = autoChaptersEnabled;
                return this;
            }

            /**
             * ContentExtraction.
             */
            public Builder contentExtraction(ContentExtraction contentExtraction) {
                this.contentExtraction = contentExtraction;
                return this;
            }

            /**
             * ContentExtractionEnabled.
             */
            public Builder contentExtractionEnabled(Boolean contentExtractionEnabled) {
                this.contentExtractionEnabled = contentExtractionEnabled;
                return this;
            }

            /**
             * CustomPrompt.
             */
            public Builder customPrompt(CustomPrompt customPrompt) {
                this.customPrompt = customPrompt;
                return this;
            }

            /**
             * CustomPromptEnabled.
             */
            public Builder customPromptEnabled(Boolean customPromptEnabled) {
                this.customPromptEnabled = customPromptEnabled;
                return this;
            }

            /**
             * ExtraParams.
             */
            public Builder extraParams(ExtraParams extraParams) {
                this.extraParams = extraParams;
                return this;
            }

            /**
             * MeetingAssistance.
             */
            public Builder meetingAssistance(MeetingAssistance meetingAssistance) {
                this.meetingAssistance = meetingAssistance;
                return this;
            }

            /**
             * MeetingAssistanceEnabled.
             */
            public Builder meetingAssistanceEnabled(Boolean meetingAssistanceEnabled) {
                this.meetingAssistanceEnabled = meetingAssistanceEnabled;
                return this;
            }

            /**
             * PptExtractionEnabled.
             */
            public Builder pptExtractionEnabled(Boolean pptExtractionEnabled) {
                this.pptExtractionEnabled = pptExtractionEnabled;
                return this;
            }

            /**
             * ServiceInspection.
             */
            public Builder serviceInspection(ServiceInspection serviceInspection) {
                this.serviceInspection = serviceInspection;
                return this;
            }

            /**
             * ServiceInspectionEnabled.
             */
            public Builder serviceInspectionEnabled(Boolean serviceInspectionEnabled) {
                this.serviceInspectionEnabled = serviceInspectionEnabled;
                return this;
            }

            /**
             * Summarization.
             */
            public Builder summarization(Summarization summarization) {
                this.summarization = summarization;
                return this;
            }

            /**
             * SummarizationEnabled.
             */
            public Builder summarizationEnabled(Boolean summarizationEnabled) {
                this.summarizationEnabled = summarizationEnabled;
                return this;
            }

            /**
             * TextPolishEnabled.
             */
            public Builder textPolishEnabled(Boolean textPolishEnabled) {
                this.textPolishEnabled = textPolishEnabled;
                return this;
            }

            /**
             * Transcoding.
             */
            public Builder transcoding(Transcoding transcoding) {
                this.transcoding = transcoding;
                return this;
            }

            /**
             * Transcription.
             */
            public Builder transcription(Transcription transcription) {
                this.transcription = transcription;
                return this;
            }

            /**
             * Translation.
             */
            public Builder translation(Translation translation) {
                this.translation = translation;
                return this;
            }

            /**
             * TranslationEnabled.
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
