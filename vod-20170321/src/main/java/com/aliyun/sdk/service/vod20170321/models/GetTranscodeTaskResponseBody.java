// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTranscodeTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetTranscodeTaskResponseBody</p>
 */
public class GetTranscodeTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TranscodeTask")
    private TranscodeTask transcodeTask;

    private GetTranscodeTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transcodeTask = builder.transcodeTask;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTranscodeTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transcodeTask
     */
    public TranscodeTask getTranscodeTask() {
        return this.transcodeTask;
    }

    public static final class Builder {
        private String requestId; 
        private TranscodeTask transcodeTask; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TranscodeTask.
         */
        public Builder transcodeTask(TranscodeTask transcodeTask) {
            this.transcodeTask = transcodeTask;
            return this;
        }

        public GetTranscodeTaskResponseBody build() {
            return new GetTranscodeTaskResponseBody(this);
        } 

    } 

    public static class OutputFile extends TeaModel {
        @NameInMap("AudioStreamList")
        private String audioStreamList;

        @NameInMap("Bitrate")
        private String bitrate;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("Encryption")
        private String encryption;

        @NameInMap("Filesize")
        private Long filesize;

        @NameInMap("Format")
        private String format;

        @NameInMap("Fps")
        private String fps;

        @NameInMap("Height")
        private String height;

        @NameInMap("OutputFileUrl")
        private String outputFileUrl;

        @NameInMap("SubtitleStreamList")
        private String subtitleStreamList;

        @NameInMap("VideoStreamList")
        private String videoStreamList;

        @NameInMap("WatermarkIdList")
        private java.util.List < String > watermarkIdList;

        @NameInMap("Width")
        private String width;

        private OutputFile(Builder builder) {
            this.audioStreamList = builder.audioStreamList;
            this.bitrate = builder.bitrate;
            this.duration = builder.duration;
            this.encryption = builder.encryption;
            this.filesize = builder.filesize;
            this.format = builder.format;
            this.fps = builder.fps;
            this.height = builder.height;
            this.outputFileUrl = builder.outputFileUrl;
            this.subtitleStreamList = builder.subtitleStreamList;
            this.videoStreamList = builder.videoStreamList;
            this.watermarkIdList = builder.watermarkIdList;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputFile create() {
            return builder().build();
        }

        /**
         * @return audioStreamList
         */
        public String getAudioStreamList() {
            return this.audioStreamList;
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return encryption
         */
        public String getEncryption() {
            return this.encryption;
        }

        /**
         * @return filesize
         */
        public Long getFilesize() {
            return this.filesize;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return fps
         */
        public String getFps() {
            return this.fps;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return outputFileUrl
         */
        public String getOutputFileUrl() {
            return this.outputFileUrl;
        }

        /**
         * @return subtitleStreamList
         */
        public String getSubtitleStreamList() {
            return this.subtitleStreamList;
        }

        /**
         * @return videoStreamList
         */
        public String getVideoStreamList() {
            return this.videoStreamList;
        }

        /**
         * @return watermarkIdList
         */
        public java.util.List < String > getWatermarkIdList() {
            return this.watermarkIdList;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String audioStreamList; 
            private String bitrate; 
            private String duration; 
            private String encryption; 
            private Long filesize; 
            private String format; 
            private String fps; 
            private String height; 
            private String outputFileUrl; 
            private String subtitleStreamList; 
            private String videoStreamList; 
            private java.util.List < String > watermarkIdList; 
            private String width; 

            /**
             * AudioStreamList.
             */
            public Builder audioStreamList(String audioStreamList) {
                this.audioStreamList = audioStreamList;
                return this;
            }

            /**
             * Bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Encryption.
             */
            public Builder encryption(String encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * Filesize.
             */
            public Builder filesize(Long filesize) {
                this.filesize = filesize;
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
             * Fps.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * OutputFileUrl.
             */
            public Builder outputFileUrl(String outputFileUrl) {
                this.outputFileUrl = outputFileUrl;
                return this;
            }

            /**
             * SubtitleStreamList.
             */
            public Builder subtitleStreamList(String subtitleStreamList) {
                this.subtitleStreamList = subtitleStreamList;
                return this;
            }

            /**
             * VideoStreamList.
             */
            public Builder videoStreamList(String videoStreamList) {
                this.videoStreamList = videoStreamList;
                return this;
            }

            /**
             * WatermarkIdList.
             */
            public Builder watermarkIdList(java.util.List < String > watermarkIdList) {
                this.watermarkIdList = watermarkIdList;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public OutputFile build() {
                return new OutputFile(this);
            } 

        } 

    }
    public static class TranscodeJobInfoList extends TeaModel {
        @NameInMap("CompleteTime")
        private String completeTime;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Definition")
        private String definition;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("InputFileUrl")
        private String inputFileUrl;

        @NameInMap("OutputFile")
        private OutputFile outputFile;

        @NameInMap("Priority")
        private String priority;

        @NameInMap("TranscodeJobId")
        private String transcodeJobId;

        @NameInMap("TranscodeJobStatus")
        private String transcodeJobStatus;

        @NameInMap("TranscodeProgress")
        private Long transcodeProgress;

        @NameInMap("TranscodeTemplateId")
        private String transcodeTemplateId;

        private TranscodeJobInfoList(Builder builder) {
            this.completeTime = builder.completeTime;
            this.creationTime = builder.creationTime;
            this.definition = builder.definition;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.inputFileUrl = builder.inputFileUrl;
            this.outputFile = builder.outputFile;
            this.priority = builder.priority;
            this.transcodeJobId = builder.transcodeJobId;
            this.transcodeJobStatus = builder.transcodeJobStatus;
            this.transcodeProgress = builder.transcodeProgress;
            this.transcodeTemplateId = builder.transcodeTemplateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeJobInfoList create() {
            return builder().build();
        }

        /**
         * @return completeTime
         */
        public String getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return definition
         */
        public String getDefinition() {
            return this.definition;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return inputFileUrl
         */
        public String getInputFileUrl() {
            return this.inputFileUrl;
        }

        /**
         * @return outputFile
         */
        public OutputFile getOutputFile() {
            return this.outputFile;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return transcodeJobId
         */
        public String getTranscodeJobId() {
            return this.transcodeJobId;
        }

        /**
         * @return transcodeJobStatus
         */
        public String getTranscodeJobStatus() {
            return this.transcodeJobStatus;
        }

        /**
         * @return transcodeProgress
         */
        public Long getTranscodeProgress() {
            return this.transcodeProgress;
        }

        /**
         * @return transcodeTemplateId
         */
        public String getTranscodeTemplateId() {
            return this.transcodeTemplateId;
        }

        public static final class Builder {
            private String completeTime; 
            private String creationTime; 
            private String definition; 
            private String errorCode; 
            private String errorMessage; 
            private String inputFileUrl; 
            private OutputFile outputFile; 
            private String priority; 
            private String transcodeJobId; 
            private String transcodeJobStatus; 
            private Long transcodeProgress; 
            private String transcodeTemplateId; 

            /**
             * CompleteTime.
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Definition.
             */
            public Builder definition(String definition) {
                this.definition = definition;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * InputFileUrl.
             */
            public Builder inputFileUrl(String inputFileUrl) {
                this.inputFileUrl = inputFileUrl;
                return this;
            }

            /**
             * OutputFile.
             */
            public Builder outputFile(OutputFile outputFile) {
                this.outputFile = outputFile;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * TranscodeJobId.
             */
            public Builder transcodeJobId(String transcodeJobId) {
                this.transcodeJobId = transcodeJobId;
                return this;
            }

            /**
             * TranscodeJobStatus.
             */
            public Builder transcodeJobStatus(String transcodeJobStatus) {
                this.transcodeJobStatus = transcodeJobStatus;
                return this;
            }

            /**
             * TranscodeProgress.
             */
            public Builder transcodeProgress(Long transcodeProgress) {
                this.transcodeProgress = transcodeProgress;
                return this;
            }

            /**
             * TranscodeTemplateId.
             */
            public Builder transcodeTemplateId(String transcodeTemplateId) {
                this.transcodeTemplateId = transcodeTemplateId;
                return this;
            }

            public TranscodeJobInfoList build() {
                return new TranscodeJobInfoList(this);
            } 

        } 

    }
    public static class TranscodeTask extends TeaModel {
        @NameInMap("CompleteTime")
        private String completeTime;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("TaskStatus")
        private String taskStatus;

        @NameInMap("TranscodeJobInfoList")
        private java.util.List < TranscodeJobInfoList> transcodeJobInfoList;

        @NameInMap("TranscodeTaskId")
        private String transcodeTaskId;

        @NameInMap("TranscodeTemplateGroupId")
        private String transcodeTemplateGroupId;

        @NameInMap("Trigger")
        private String trigger;

        @NameInMap("VideoId")
        private String videoId;

        private TranscodeTask(Builder builder) {
            this.completeTime = builder.completeTime;
            this.creationTime = builder.creationTime;
            this.taskStatus = builder.taskStatus;
            this.transcodeJobInfoList = builder.transcodeJobInfoList;
            this.transcodeTaskId = builder.transcodeTaskId;
            this.transcodeTemplateGroupId = builder.transcodeTemplateGroupId;
            this.trigger = builder.trigger;
            this.videoId = builder.videoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeTask create() {
            return builder().build();
        }

        /**
         * @return completeTime
         */
        public String getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return transcodeJobInfoList
         */
        public java.util.List < TranscodeJobInfoList> getTranscodeJobInfoList() {
            return this.transcodeJobInfoList;
        }

        /**
         * @return transcodeTaskId
         */
        public String getTranscodeTaskId() {
            return this.transcodeTaskId;
        }

        /**
         * @return transcodeTemplateGroupId
         */
        public String getTranscodeTemplateGroupId() {
            return this.transcodeTemplateGroupId;
        }

        /**
         * @return trigger
         */
        public String getTrigger() {
            return this.trigger;
        }

        /**
         * @return videoId
         */
        public String getVideoId() {
            return this.videoId;
        }

        public static final class Builder {
            private String completeTime; 
            private String creationTime; 
            private String taskStatus; 
            private java.util.List < TranscodeJobInfoList> transcodeJobInfoList; 
            private String transcodeTaskId; 
            private String transcodeTemplateGroupId; 
            private String trigger; 
            private String videoId; 

            /**
             * CompleteTime.
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * TranscodeJobInfoList.
             */
            public Builder transcodeJobInfoList(java.util.List < TranscodeJobInfoList> transcodeJobInfoList) {
                this.transcodeJobInfoList = transcodeJobInfoList;
                return this;
            }

            /**
             * TranscodeTaskId.
             */
            public Builder transcodeTaskId(String transcodeTaskId) {
                this.transcodeTaskId = transcodeTaskId;
                return this;
            }

            /**
             * TranscodeTemplateGroupId.
             */
            public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
                this.transcodeTemplateGroupId = transcodeTemplateGroupId;
                return this;
            }

            /**
             * Trigger.
             */
            public Builder trigger(String trigger) {
                this.trigger = trigger;
                return this;
            }

            /**
             * VideoId.
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            public TranscodeTask build() {
                return new TranscodeTask(this);
            } 

        } 

    }
}
