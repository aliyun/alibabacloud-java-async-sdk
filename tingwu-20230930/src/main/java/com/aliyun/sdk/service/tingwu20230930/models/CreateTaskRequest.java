// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateTaskRequest</p>
 */
public class CreateTaskRequest extends Request {
    @Body
    @NameInMap("AppKey")
    private String appKey;

    @Body
    @NameInMap("Input")
    private Input input;

    @Body
    @NameInMap("Parameters")
    private Parameters parameters;

    @Query
    @NameInMap("operation")
    private String operation;

    @Query
    @NameInMap("type")
    @Validation(required = true)
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
         * type.
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

    public static class Input extends TeaModel {
        @NameInMap("FileUrl")
        private String fileUrl;

        @NameInMap("Format")
        private String format;

        @NameInMap("MultipleStreamsEnabled")
        private Boolean multipleStreamsEnabled;

        @NameInMap("ProgressiveCallbacksEnabled")
        private Boolean progressiveCallbacksEnabled;

        @NameInMap("SampleRate")
        private Integer sampleRate;

        @NameInMap("SourceLanguage")
        @Validation(required = true)
        private String sourceLanguage;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskKey")
        private String taskKey;

        private Input(Builder builder) {
            this.fileUrl = builder.fileUrl;
            this.format = builder.format;
            this.multipleStreamsEnabled = builder.multipleStreamsEnabled;
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
         * @return multipleStreamsEnabled
         */
        public Boolean getMultipleStreamsEnabled() {
            return this.multipleStreamsEnabled;
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
            private String fileUrl; 
            private String format; 
            private Boolean multipleStreamsEnabled; 
            private Boolean progressiveCallbacksEnabled; 
            private Integer sampleRate; 
            private String sourceLanguage; 
            private String taskId; 
            private String taskKey; 

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
             * MultipleStreamsEnabled.
             */
            public Builder multipleStreamsEnabled(Boolean multipleStreamsEnabled) {
                this.multipleStreamsEnabled = multipleStreamsEnabled;
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
             * SourceLanguage.
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
    public static class MeetingAssistance extends TeaModel {
        @NameInMap("Types")
        private java.util.List < String > types;

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
        public java.util.List < String > getTypes() {
            return this.types;
        }

        public static final class Builder {
            private java.util.List < String > types; 

            /**
             * Types.
             */
            public Builder types(java.util.List < String > types) {
                this.types = types;
                return this;
            }

            public MeetingAssistance build() {
                return new MeetingAssistance(this);
            } 

        } 

    }
    public static class Summarization extends TeaModel {
        @NameInMap("Types")
        private java.util.List < String > types;

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
        public java.util.List < String > getTypes() {
            return this.types;
        }

        public static final class Builder {
            private java.util.List < String > types; 

            /**
             * Types.
             */
            public Builder types(java.util.List < String > types) {
                this.types = types;
                return this;
            }

            public Summarization build() {
                return new Summarization(this);
            } 

        } 

    }
    public static class Transcoding extends TeaModel {
        @NameInMap("SpectrumEnabled")
        private Boolean spectrumEnabled;

        @NameInMap("TargetAudioFormat")
        private String targetAudioFormat;

        @NameInMap("TargetVideoFormat")
        private String targetVideoFormat;

        @NameInMap("VideoThumbnailEnabled")
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
    public static class Diarization extends TeaModel {
        @NameInMap("SpeakerCount")
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
    public static class Transcription extends TeaModel {
        @NameInMap("AdditionalStreamOutputLevel")
        private Integer additionalStreamOutputLevel;

        @NameInMap("AudioEventDetectionEnabled")
        private Boolean audioEventDetectionEnabled;

        @NameInMap("Diarization")
        private Diarization diarization;

        @NameInMap("DiarizationEnabled")
        private Boolean diarizationEnabled;

        @NameInMap("OutputLevel")
        private Integer outputLevel;

        @NameInMap("PhraseId")
        private String phraseId;

        private Transcription(Builder builder) {
            this.additionalStreamOutputLevel = builder.additionalStreamOutputLevel;
            this.audioEventDetectionEnabled = builder.audioEventDetectionEnabled;
            this.diarization = builder.diarization;
            this.diarizationEnabled = builder.diarizationEnabled;
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
    public static class Translation extends TeaModel {
        @NameInMap("AdditionalStreamOutputLevel")
        private Integer additionalStreamOutputLevel;

        @NameInMap("OutputLevel")
        private Integer outputLevel;

        @NameInMap("TargetLanguages")
        private java.util.List < String > targetLanguages;

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
        public java.util.List < String > getTargetLanguages() {
            return this.targetLanguages;
        }

        public static final class Builder {
            private Integer additionalStreamOutputLevel; 
            private Integer outputLevel; 
            private java.util.List < String > targetLanguages; 

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
            public Builder targetLanguages(java.util.List < String > targetLanguages) {
                this.targetLanguages = targetLanguages;
                return this;
            }

            public Translation build() {
                return new Translation(this);
            } 

        } 

    }
    public static class Parameters extends TeaModel {
        @NameInMap("AutoChaptersEnabled")
        private Boolean autoChaptersEnabled;

        @NameInMap("MeetingAssistance")
        private MeetingAssistance meetingAssistance;

        @NameInMap("MeetingAssistanceEnabled")
        private Boolean meetingAssistanceEnabled;

        @NameInMap("PptExtractionEnabled")
        private Boolean pptExtractionEnabled;

        @NameInMap("Summarization")
        private Summarization summarization;

        @NameInMap("SummarizationEnabled")
        private Boolean summarizationEnabled;

        @NameInMap("TextPolishEnabled")
        private Boolean textPolishEnabled;

        @NameInMap("Transcoding")
        private Transcoding transcoding;

        @NameInMap("Transcription")
        private Transcription transcription;

        @NameInMap("Translation")
        private Translation translation;

        @NameInMap("TranslationEnabled")
        private Boolean translationEnabled;

        private Parameters(Builder builder) {
            this.autoChaptersEnabled = builder.autoChaptersEnabled;
            this.meetingAssistance = builder.meetingAssistance;
            this.meetingAssistanceEnabled = builder.meetingAssistanceEnabled;
            this.pptExtractionEnabled = builder.pptExtractionEnabled;
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
            private MeetingAssistance meetingAssistance; 
            private Boolean meetingAssistanceEnabled; 
            private Boolean pptExtractionEnabled; 
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
