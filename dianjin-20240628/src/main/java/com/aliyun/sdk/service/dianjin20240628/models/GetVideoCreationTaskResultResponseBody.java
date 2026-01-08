// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link GetVideoCreationTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoCreationTaskResultResponseBody</p>
 */
public class GetVideoCreationTaskResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("retryAble")
    private Boolean retryAble;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetVideoCreationTaskResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.retryAble = builder.retryAble;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoCreationTaskResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return retryAble
     */
    public Boolean getRetryAble() {
        return this.retryAble;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private Boolean retryAble; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetVideoCreationTaskResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.retryAble = model.retryAble;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * retryAble.
         */
        public Builder retryAble(Boolean retryAble) {
            this.retryAble = retryAble;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetVideoCreationTaskResultResponseBody build() {
            return new GetVideoCreationTaskResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVideoCreationTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoCreationTaskResultResponseBody</p>
     */
    public static class FileInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileTraceId")
        private String fileTraceId;

        @com.aliyun.core.annotation.NameInMap("ossKey")
        private String ossKey;

        private FileInfo(Builder builder) {
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.fileTraceId = builder.fileTraceId;
            this.ossKey = builder.ossKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileInfo create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileTraceId
         */
        public String getFileTraceId() {
            return this.fileTraceId;
        }

        /**
         * @return ossKey
         */
        public String getOssKey() {
            return this.ossKey;
        }

        public static final class Builder {
            private String fileId; 
            private String fileName; 
            private String fileTraceId; 
            private String ossKey; 

            private Builder() {
            } 

            private Builder(FileInfo model) {
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.fileTraceId = model.fileTraceId;
                this.ossKey = model.ossKey;
            } 

            /**
             * fileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * fileTraceId.
             */
            public Builder fileTraceId(String fileTraceId) {
                this.fileTraceId = fileTraceId;
                return this;
            }

            /**
             * ossKey.
             */
            public Builder ossKey(String ossKey) {
                this.ossKey = ossKey;
                return this;
            }

            public FileInfo build() {
                return new FileInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoCreationTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoCreationTaskResultResponseBody</p>
     */
    public static class DetectionDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("confidence")
        private Double confidence;

        @com.aliyun.core.annotation.NameInMap("pass")
        private Boolean pass;

        @com.aliyun.core.annotation.NameInMap("reason")
        private String reason;

        private DetectionDetails(Builder builder) {
            this.code = builder.code;
            this.confidence = builder.confidence;
            this.pass = builder.pass;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetectionDetails create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return confidence
         */
        public Double getConfidence() {
            return this.confidence;
        }

        /**
         * @return pass
         */
        public Boolean getPass() {
            return this.pass;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private String code; 
            private Double confidence; 
            private Boolean pass; 
            private String reason; 

            private Builder() {
            } 

            private Builder(DetectionDetails model) {
                this.code = model.code;
                this.confidence = model.confidence;
                this.pass = model.pass;
                this.reason = model.reason;
            } 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * confidence.
             */
            public Builder confidence(Double confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * pass.
             */
            public Builder pass(Boolean pass) {
                this.pass = pass;
                return this;
            }

            /**
             * reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public DetectionDetails build() {
                return new DetectionDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoCreationTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoCreationTaskResultResponseBody</p>
     */
    public static class DetectionResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("detectionDetails")
        private java.util.List<DetectionDetails> detectionDetails;

        @com.aliyun.core.annotation.NameInMap("suggestions")
        private java.util.List<String> suggestions;

        private DetectionResult(Builder builder) {
            this.detectionDetails = builder.detectionDetails;
            this.suggestions = builder.suggestions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetectionResult create() {
            return builder().build();
        }

        /**
         * @return detectionDetails
         */
        public java.util.List<DetectionDetails> getDetectionDetails() {
            return this.detectionDetails;
        }

        /**
         * @return suggestions
         */
        public java.util.List<String> getSuggestions() {
            return this.suggestions;
        }

        public static final class Builder {
            private java.util.List<DetectionDetails> detectionDetails; 
            private java.util.List<String> suggestions; 

            private Builder() {
            } 

            private Builder(DetectionResult model) {
                this.detectionDetails = model.detectionDetails;
                this.suggestions = model.suggestions;
            } 

            /**
             * detectionDetails.
             */
            public Builder detectionDetails(java.util.List<DetectionDetails> detectionDetails) {
                this.detectionDetails = detectionDetails;
                return this;
            }

            /**
             * suggestions.
             */
            public Builder suggestions(java.util.List<String> suggestions) {
                this.suggestions = suggestions;
                return this;
            }

            public DetectionResult build() {
                return new DetectionResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoCreationTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoCreationTaskResultResponseBody</p>
     */
    public static class MediaDetectionTaskResultFileInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileTraceId")
        private String fileTraceId;

        @com.aliyun.core.annotation.NameInMap("ossKey")
        private String ossKey;

        private MediaDetectionTaskResultFileInfo(Builder builder) {
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.fileTraceId = builder.fileTraceId;
            this.ossKey = builder.ossKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaDetectionTaskResultFileInfo create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileTraceId
         */
        public String getFileTraceId() {
            return this.fileTraceId;
        }

        /**
         * @return ossKey
         */
        public String getOssKey() {
            return this.ossKey;
        }

        public static final class Builder {
            private String fileId; 
            private String fileName; 
            private String fileTraceId; 
            private String ossKey; 

            private Builder() {
            } 

            private Builder(MediaDetectionTaskResultFileInfo model) {
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.fileTraceId = model.fileTraceId;
                this.ossKey = model.ossKey;
            } 

            /**
             * fileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * fileTraceId.
             */
            public Builder fileTraceId(String fileTraceId) {
                this.fileTraceId = fileTraceId;
                return this;
            }

            /**
             * ossKey.
             */
            public Builder ossKey(String ossKey) {
                this.ossKey = ossKey;
                return this;
            }

            public MediaDetectionTaskResultFileInfo build() {
                return new MediaDetectionTaskResultFileInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoCreationTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoCreationTaskResultResponseBody</p>
     */
    public static class MediaDetectionTaskResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("detectionConclusion")
        private String detectionConclusion;

        @com.aliyun.core.annotation.NameInMap("detectionResult")
        private DetectionResult detectionResult;

        @com.aliyun.core.annotation.NameInMap("fileInfo")
        private MediaDetectionTaskResultFileInfo fileInfo;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("taskStatus")
        private String taskStatus;

        private MediaDetectionTaskResult(Builder builder) {
            this.detectionConclusion = builder.detectionConclusion;
            this.detectionResult = builder.detectionResult;
            this.fileInfo = builder.fileInfo;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaDetectionTaskResult create() {
            return builder().build();
        }

        /**
         * @return detectionConclusion
         */
        public String getDetectionConclusion() {
            return this.detectionConclusion;
        }

        /**
         * @return detectionResult
         */
        public DetectionResult getDetectionResult() {
            return this.detectionResult;
        }

        /**
         * @return fileInfo
         */
        public MediaDetectionTaskResultFileInfo getFileInfo() {
            return this.fileInfo;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private String detectionConclusion; 
            private DetectionResult detectionResult; 
            private MediaDetectionTaskResultFileInfo fileInfo; 
            private String taskId; 
            private String taskStatus; 

            private Builder() {
            } 

            private Builder(MediaDetectionTaskResult model) {
                this.detectionConclusion = model.detectionConclusion;
                this.detectionResult = model.detectionResult;
                this.fileInfo = model.fileInfo;
                this.taskId = model.taskId;
                this.taskStatus = model.taskStatus;
            } 

            /**
             * detectionConclusion.
             */
            public Builder detectionConclusion(String detectionConclusion) {
                this.detectionConclusion = detectionConclusion;
                return this;
            }

            /**
             * detectionResult.
             */
            public Builder detectionResult(DetectionResult detectionResult) {
                this.detectionResult = detectionResult;
                return this;
            }

            /**
             * fileInfo.
             */
            public Builder fileInfo(MediaDetectionTaskResultFileInfo fileInfo) {
                this.fileInfo = fileInfo;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * taskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public MediaDetectionTaskResult build() {
                return new MediaDetectionTaskResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoCreationTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoCreationTaskResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("estimatedWaitTimeInSeconds")
        private Long estimatedWaitTimeInSeconds;

        @com.aliyun.core.annotation.NameInMap("fileInfo")
        private FileInfo fileInfo;

        @com.aliyun.core.annotation.NameInMap("finishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("mediaDetectionTaskResult")
        private MediaDetectionTaskResult mediaDetectionTaskResult;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("statusReason")
        private String statusReason;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("taskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("videoUrl")
        private String videoUrl;

        private Data(Builder builder) {
            this.estimatedWaitTimeInSeconds = builder.estimatedWaitTimeInSeconds;
            this.fileInfo = builder.fileInfo;
            this.finishTime = builder.finishTime;
            this.mediaDetectionTaskResult = builder.mediaDetectionTaskResult;
            this.startTime = builder.startTime;
            this.statusReason = builder.statusReason;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
            this.videoUrl = builder.videoUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return estimatedWaitTimeInSeconds
         */
        public Long getEstimatedWaitTimeInSeconds() {
            return this.estimatedWaitTimeInSeconds;
        }

        /**
         * @return fileInfo
         */
        public FileInfo getFileInfo() {
            return this.fileInfo;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return mediaDetectionTaskResult
         */
        public MediaDetectionTaskResult getMediaDetectionTaskResult() {
            return this.mediaDetectionTaskResult;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return videoUrl
         */
        public String getVideoUrl() {
            return this.videoUrl;
        }

        public static final class Builder {
            private Long estimatedWaitTimeInSeconds; 
            private FileInfo fileInfo; 
            private String finishTime; 
            private MediaDetectionTaskResult mediaDetectionTaskResult; 
            private String startTime; 
            private String statusReason; 
            private String taskId; 
            private String taskStatus; 
            private String videoUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.estimatedWaitTimeInSeconds = model.estimatedWaitTimeInSeconds;
                this.fileInfo = model.fileInfo;
                this.finishTime = model.finishTime;
                this.mediaDetectionTaskResult = model.mediaDetectionTaskResult;
                this.startTime = model.startTime;
                this.statusReason = model.statusReason;
                this.taskId = model.taskId;
                this.taskStatus = model.taskStatus;
                this.videoUrl = model.videoUrl;
            } 

            /**
             * estimatedWaitTimeInSeconds.
             */
            public Builder estimatedWaitTimeInSeconds(Long estimatedWaitTimeInSeconds) {
                this.estimatedWaitTimeInSeconds = estimatedWaitTimeInSeconds;
                return this;
            }

            /**
             * fileInfo.
             */
            public Builder fileInfo(FileInfo fileInfo) {
                this.fileInfo = fileInfo;
                return this;
            }

            /**
             * finishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * mediaDetectionTaskResult.
             */
            public Builder mediaDetectionTaskResult(MediaDetectionTaskResult mediaDetectionTaskResult) {
                this.mediaDetectionTaskResult = mediaDetectionTaskResult;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * statusReason.
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * taskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * videoUrl.
             */
            public Builder videoUrl(String videoUrl) {
                this.videoUrl = videoUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
