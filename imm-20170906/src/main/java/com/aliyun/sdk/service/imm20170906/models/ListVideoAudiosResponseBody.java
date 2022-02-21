// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVideoAudiosResponseBody} extends {@link TeaModel}
 *
 * <p>ListVideoAudiosResponseBody</p>
 */
public class ListVideoAudiosResponseBody extends TeaModel {
    @NameInMap("Audios")
    private java.util.List < Audios> audios;

    @NameInMap("NextMarker")
    private String nextMarker;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SetId")
    private String setId;

    @NameInMap("VideoUri")
    private String videoUri;

    private ListVideoAudiosResponseBody(Builder builder) {
        this.audios = builder.audios;
        this.nextMarker = builder.nextMarker;
        this.requestId = builder.requestId;
        this.setId = builder.setId;
        this.videoUri = builder.videoUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVideoAudiosResponseBody create() {
        return builder().build();
    }

    /**
     * @return audios
     */
    public java.util.List < Audios> getAudios() {
        return this.audios;
    }

    /**
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return setId
     */
    public String getSetId() {
        return this.setId;
    }

    /**
     * @return videoUri
     */
    public String getVideoUri() {
        return this.videoUri;
    }

    public static final class Builder {
        private java.util.List < Audios> audios; 
        private String nextMarker; 
        private String requestId; 
        private String setId; 
        private String videoUri; 

        /**
         * Audios.
         */
        public Builder audios(java.util.List < Audios> audios) {
            this.audios = audios;
            return this;
        }

        /**
         * NextMarker.
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SetId.
         */
        public Builder setId(String setId) {
            this.setId = setId;
            return this;
        }

        /**
         * VideoUri.
         */
        public Builder videoUri(String videoUri) {
            this.videoUri = videoUri;
            return this;
        }

        public ListVideoAudiosResponseBody build() {
            return new ListVideoAudiosResponseBody(this);
        } 

    } 

    public static class AudioTexts extends TeaModel {
        @NameInMap("BeginTime")
        private Float beginTime;

        @NameInMap("ChannelId")
        private Integer channelId;

        @NameInMap("Confidence")
        private Float confidence;

        @NameInMap("EmotionValue")
        private Float emotionValue;

        @NameInMap("EndTime")
        private Float endTime;

        @NameInMap("Library")
        private String library;

        @NameInMap("Person")
        private String person;

        @NameInMap("SilenceDuration")
        private Float silenceDuration;

        @NameInMap("SpeechRate")
        private Integer speechRate;

        @NameInMap("Text")
        private String text;

        private AudioTexts(Builder builder) {
            this.beginTime = builder.beginTime;
            this.channelId = builder.channelId;
            this.confidence = builder.confidence;
            this.emotionValue = builder.emotionValue;
            this.endTime = builder.endTime;
            this.library = builder.library;
            this.person = builder.person;
            this.silenceDuration = builder.silenceDuration;
            this.speechRate = builder.speechRate;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioTexts create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public Float getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return channelId
         */
        public Integer getChannelId() {
            return this.channelId;
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        /**
         * @return emotionValue
         */
        public Float getEmotionValue() {
            return this.emotionValue;
        }

        /**
         * @return endTime
         */
        public Float getEndTime() {
            return this.endTime;
        }

        /**
         * @return library
         */
        public String getLibrary() {
            return this.library;
        }

        /**
         * @return person
         */
        public String getPerson() {
            return this.person;
        }

        /**
         * @return silenceDuration
         */
        public Float getSilenceDuration() {
            return this.silenceDuration;
        }

        /**
         * @return speechRate
         */
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Float beginTime; 
            private Integer channelId; 
            private Float confidence; 
            private Float emotionValue; 
            private Float endTime; 
            private String library; 
            private String person; 
            private Float silenceDuration; 
            private Integer speechRate; 
            private String text; 

            /**
             * BeginTime.
             */
            public Builder beginTime(Float beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(Integer channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * Confidence.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * EmotionValue.
             */
            public Builder emotionValue(Float emotionValue) {
                this.emotionValue = emotionValue;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Float endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Library.
             */
            public Builder library(String library) {
                this.library = library;
                return this;
            }

            /**
             * Person.
             */
            public Builder person(String person) {
                this.person = person;
                return this;
            }

            /**
             * SilenceDuration.
             */
            public Builder silenceDuration(Float silenceDuration) {
                this.silenceDuration = silenceDuration;
                return this;
            }

            /**
             * SpeechRate.
             */
            public Builder speechRate(Integer speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public AudioTexts build() {
                return new AudioTexts(this);
            } 

        } 

    }
    public static class Audios extends TeaModel {
        @NameInMap("AudioDuration")
        private Float audioDuration;

        @NameInMap("AudioFormat")
        private String audioFormat;

        @NameInMap("AudioRate")
        private Integer audioRate;

        @NameInMap("AudioTexts")
        private java.util.List < AudioTexts> audioTexts;

        @NameInMap("AudioTextsFailReason")
        private String audioTextsFailReason;

        @NameInMap("AudioTextsModifyTime")
        private String audioTextsModifyTime;

        @NameInMap("AudioTextsStatus")
        private String audioTextsStatus;

        @NameInMap("AudioUri")
        private String audioUri;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ExternalId")
        private String externalId;

        @NameInMap("FileSize")
        private Integer fileSize;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("ProcessFailReason")
        private String processFailReason;

        @NameInMap("ProcessModifyTime")
        private String processModifyTime;

        @NameInMap("ProcessStatus")
        private String processStatus;

        @NameInMap("RemarksA")
        private String remarksA;

        @NameInMap("RemarksB")
        private String remarksB;

        @NameInMap("RemarksC")
        private String remarksC;

        @NameInMap("RemarksD")
        private String remarksD;

        @NameInMap("SourcePosition")
        private String sourcePosition;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("SourceUri")
        private String sourceUri;

        private Audios(Builder builder) {
            this.audioDuration = builder.audioDuration;
            this.audioFormat = builder.audioFormat;
            this.audioRate = builder.audioRate;
            this.audioTexts = builder.audioTexts;
            this.audioTextsFailReason = builder.audioTextsFailReason;
            this.audioTextsModifyTime = builder.audioTextsModifyTime;
            this.audioTextsStatus = builder.audioTextsStatus;
            this.audioUri = builder.audioUri;
            this.createTime = builder.createTime;
            this.externalId = builder.externalId;
            this.fileSize = builder.fileSize;
            this.modifyTime = builder.modifyTime;
            this.processFailReason = builder.processFailReason;
            this.processModifyTime = builder.processModifyTime;
            this.processStatus = builder.processStatus;
            this.remarksA = builder.remarksA;
            this.remarksB = builder.remarksB;
            this.remarksC = builder.remarksC;
            this.remarksD = builder.remarksD;
            this.sourcePosition = builder.sourcePosition;
            this.sourceType = builder.sourceType;
            this.sourceUri = builder.sourceUri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Audios create() {
            return builder().build();
        }

        /**
         * @return audioDuration
         */
        public Float getAudioDuration() {
            return this.audioDuration;
        }

        /**
         * @return audioFormat
         */
        public String getAudioFormat() {
            return this.audioFormat;
        }

        /**
         * @return audioRate
         */
        public Integer getAudioRate() {
            return this.audioRate;
        }

        /**
         * @return audioTexts
         */
        public java.util.List < AudioTexts> getAudioTexts() {
            return this.audioTexts;
        }

        /**
         * @return audioTextsFailReason
         */
        public String getAudioTextsFailReason() {
            return this.audioTextsFailReason;
        }

        /**
         * @return audioTextsModifyTime
         */
        public String getAudioTextsModifyTime() {
            return this.audioTextsModifyTime;
        }

        /**
         * @return audioTextsStatus
         */
        public String getAudioTextsStatus() {
            return this.audioTextsStatus;
        }

        /**
         * @return audioUri
         */
        public String getAudioUri() {
            return this.audioUri;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return externalId
         */
        public String getExternalId() {
            return this.externalId;
        }

        /**
         * @return fileSize
         */
        public Integer getFileSize() {
            return this.fileSize;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return processFailReason
         */
        public String getProcessFailReason() {
            return this.processFailReason;
        }

        /**
         * @return processModifyTime
         */
        public String getProcessModifyTime() {
            return this.processModifyTime;
        }

        /**
         * @return processStatus
         */
        public String getProcessStatus() {
            return this.processStatus;
        }

        /**
         * @return remarksA
         */
        public String getRemarksA() {
            return this.remarksA;
        }

        /**
         * @return remarksB
         */
        public String getRemarksB() {
            return this.remarksB;
        }

        /**
         * @return remarksC
         */
        public String getRemarksC() {
            return this.remarksC;
        }

        /**
         * @return remarksD
         */
        public String getRemarksD() {
            return this.remarksD;
        }

        /**
         * @return sourcePosition
         */
        public String getSourcePosition() {
            return this.sourcePosition;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return sourceUri
         */
        public String getSourceUri() {
            return this.sourceUri;
        }

        public static final class Builder {
            private Float audioDuration; 
            private String audioFormat; 
            private Integer audioRate; 
            private java.util.List < AudioTexts> audioTexts; 
            private String audioTextsFailReason; 
            private String audioTextsModifyTime; 
            private String audioTextsStatus; 
            private String audioUri; 
            private String createTime; 
            private String externalId; 
            private Integer fileSize; 
            private String modifyTime; 
            private String processFailReason; 
            private String processModifyTime; 
            private String processStatus; 
            private String remarksA; 
            private String remarksB; 
            private String remarksC; 
            private String remarksD; 
            private String sourcePosition; 
            private String sourceType; 
            private String sourceUri; 

            /**
             * AudioDuration.
             */
            public Builder audioDuration(Float audioDuration) {
                this.audioDuration = audioDuration;
                return this;
            }

            /**
             * AudioFormat.
             */
            public Builder audioFormat(String audioFormat) {
                this.audioFormat = audioFormat;
                return this;
            }

            /**
             * AudioRate.
             */
            public Builder audioRate(Integer audioRate) {
                this.audioRate = audioRate;
                return this;
            }

            /**
             * AudioTexts.
             */
            public Builder audioTexts(java.util.List < AudioTexts> audioTexts) {
                this.audioTexts = audioTexts;
                return this;
            }

            /**
             * AudioTextsFailReason.
             */
            public Builder audioTextsFailReason(String audioTextsFailReason) {
                this.audioTextsFailReason = audioTextsFailReason;
                return this;
            }

            /**
             * AudioTextsModifyTime.
             */
            public Builder audioTextsModifyTime(String audioTextsModifyTime) {
                this.audioTextsModifyTime = audioTextsModifyTime;
                return this;
            }

            /**
             * AudioTextsStatus.
             */
            public Builder audioTextsStatus(String audioTextsStatus) {
                this.audioTextsStatus = audioTextsStatus;
                return this;
            }

            /**
             * AudioUri.
             */
            public Builder audioUri(String audioUri) {
                this.audioUri = audioUri;
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
             * ExternalId.
             */
            public Builder externalId(String externalId) {
                this.externalId = externalId;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(Integer fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * ProcessFailReason.
             */
            public Builder processFailReason(String processFailReason) {
                this.processFailReason = processFailReason;
                return this;
            }

            /**
             * ProcessModifyTime.
             */
            public Builder processModifyTime(String processModifyTime) {
                this.processModifyTime = processModifyTime;
                return this;
            }

            /**
             * ProcessStatus.
             */
            public Builder processStatus(String processStatus) {
                this.processStatus = processStatus;
                return this;
            }

            /**
             * RemarksA.
             */
            public Builder remarksA(String remarksA) {
                this.remarksA = remarksA;
                return this;
            }

            /**
             * RemarksB.
             */
            public Builder remarksB(String remarksB) {
                this.remarksB = remarksB;
                return this;
            }

            /**
             * RemarksC.
             */
            public Builder remarksC(String remarksC) {
                this.remarksC = remarksC;
                return this;
            }

            /**
             * RemarksD.
             */
            public Builder remarksD(String remarksD) {
                this.remarksD = remarksD;
                return this;
            }

            /**
             * SourcePosition.
             */
            public Builder sourcePosition(String sourcePosition) {
                this.sourcePosition = sourcePosition;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * SourceUri.
             */
            public Builder sourceUri(String sourceUri) {
                this.sourceUri = sourceUri;
                return this;
            }

            public Audios build() {
                return new Audios(this);
            } 

        } 

    }
}
