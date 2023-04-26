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
         * The size of the output file. Unit: byte.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The length of the output file. Unit: seconds.
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
             * The ID of the transcoding job.
             */
            public Builder audioStreamList(String audioStreamList) {
                this.audioStreamList = audioStreamList;
                return this;
            }

            /**
             * The time when the transcoding task was complete. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * The frame rate of the output file. Unit: frames per second.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The audio streams.
             */
            public Builder encryption(String encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * Queries details about transcoding jobs based on the transcoding task ID.
             */
            public Builder filesize(Long filesize) {
                this.filesize = filesize;
                return this;
            }

            /**
             * The IDs of the watermarks used by the output file.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * The error message returned when the transcoding job failed.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * The ID of the transcoding task.
             */
            public Builder outputFileUrl(String outputFileUrl) {
                this.outputFileUrl = outputFileUrl;
                return this;
            }

            /**
             * The time when the transcoding task was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder subtitleStreamList(String subtitleStreamList) {
                this.subtitleStreamList = subtitleStreamList;
                return this;
            }

            /**
             * The time when the transcoding job was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
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
             * Details about transcoding tasks.
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
             * The progress of the transcoding job. Valid values: `[0,100]`.
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * The status of the transcoding job.
             * <p>
             * 
             * *   **Transcoding**
             * *   **TranscodeSuccess**
             * *   **TranscodeFail**
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The encryption method of the output file. Valid values:
             * <p>
             * 
             * *   **AliyunVoDEncryption**: Alibaba Cloud proprietary cryptography
             * *   **HLSEncryption**: HTTP Live Streaming (HLS) encryption
             */
            public Builder definition(String definition) {
                this.definition = definition;
                return this;
            }

            /**
             * Details about transcoding jobs.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The height of the output video. Unit: pixels.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The IDs of the watermarks used by the output file.
             */
            public Builder inputFileUrl(String inputFileUrl) {
                this.inputFileUrl = inputFileUrl;
                return this;
            }

            /**
             * The ID of the transcoding template group.
             */
            public Builder outputFile(OutputFile outputFile) {
                this.outputFile = outputFile;
                return this;
            }

            /**
             * The subtitle streams.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The ID of the audio or video file.
             */
            public Builder transcodeJobId(String transcodeJobId) {
                this.transcodeJobId = transcodeJobId;
                return this;
            }

            /**
             * The priority of the transcoding job.
             */
            public Builder transcodeJobStatus(String transcodeJobStatus) {
                this.transcodeJobStatus = transcodeJobStatus;
                return this;
            }

            /**
             * The average bitrate of the output file. Unit: Kbit/s.
             */
            public Builder transcodeProgress(Long transcodeProgress) {
                this.transcodeProgress = transcodeProgress;
                return this;
            }

            /**
             * The status of the transcoding task. Valid values:
             * <p>
             * 
             * *   **Processing**: In progress.
             * *   **Partial**: Some transcoding jobs were complete.
             * *   **CompleteAllSucc**: All transcoding jobs were successful.
             * *   **CompleteAllFail**: All transcoding jobs failed. If an exception occurs in the source file, no transcoding job is initiated and the transcoding task fails.
             * *   **CompletePartialSucc**: All transcoding jobs were complete but only some were successful.
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
             * The Object Storage Service (OSS) URL of the input file.
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * The operation that you want to perform. Set the value to **GetTranscodeTask**.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The mode in which the transcoding task is triggered. Valid values:
             * <p>
             * 
             * *   **Auto**: The transcoding task is automatically triggered when the video is uploaded.
             * *   **Manual**: The transcoding task is triggered by calling the SubmitTranscodeJobs operation.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * The information about the output file.
             */
            public Builder transcodeJobInfoList(java.util.List < TranscodeJobInfoList> transcodeJobInfoList) {
                this.transcodeJobInfoList = transcodeJobInfoList;
                return this;
            }

            /**
             * The container format of the output file.
             */
            public Builder transcodeTaskId(String transcodeTaskId) {
                this.transcodeTaskId = transcodeTaskId;
                return this;
            }

            /**
             * The ID of the transcoding task. You can use one of the following methods to obtain the ID:
             * <p>
             * 
             * *   Obtain the value of TranscodeTaskId from the response to the [SubmitTranscodeJobs](~~68570~~) operation.
             * *   Obtain the value of TranscodeTaskId from the response to the [ListTranscodeTask](~~109120~~) operation.
             */
            public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
                this.transcodeTemplateGroupId = transcodeTemplateGroupId;
                return this;
            }

            /**
             * The video streams.
             */
            public Builder trigger(String trigger) {
                this.trigger = trigger;
                return this;
            }

            /**
             * The ID of the transcoding template.
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
