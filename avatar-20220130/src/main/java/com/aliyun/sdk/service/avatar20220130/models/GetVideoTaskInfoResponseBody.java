// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVideoTaskInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoTaskInfoResponseBody</p>
 */
public class GetVideoTaskInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetVideoTaskInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoTaskInfoResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetVideoTaskInfoResponseBody build() {
            return new GetVideoTaskInfoResponseBody(this);
        } 

    } 

    public static class TaskResult extends TeaModel {
        @NameInMap("FailCode")
        private String failCode;

        @NameInMap("FailReason")
        private String failReason;

        @NameInMap("SubtitlesUrl")
        private String subtitlesUrl;

        @NameInMap("VideoDuration")
        private Integer videoDuration;

        @NameInMap("VideoUrl")
        private String videoUrl;

        @NameInMap("WordSubtitlesUrl")
        private String wordSubtitlesUrl;

        private TaskResult(Builder builder) {
            this.failCode = builder.failCode;
            this.failReason = builder.failReason;
            this.subtitlesUrl = builder.subtitlesUrl;
            this.videoDuration = builder.videoDuration;
            this.videoUrl = builder.videoUrl;
            this.wordSubtitlesUrl = builder.wordSubtitlesUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskResult create() {
            return builder().build();
        }

        /**
         * @return failCode
         */
        public String getFailCode() {
            return this.failCode;
        }

        /**
         * @return failReason
         */
        public String getFailReason() {
            return this.failReason;
        }

        /**
         * @return subtitlesUrl
         */
        public String getSubtitlesUrl() {
            return this.subtitlesUrl;
        }

        /**
         * @return videoDuration
         */
        public Integer getVideoDuration() {
            return this.videoDuration;
        }

        /**
         * @return videoUrl
         */
        public String getVideoUrl() {
            return this.videoUrl;
        }

        /**
         * @return wordSubtitlesUrl
         */
        public String getWordSubtitlesUrl() {
            return this.wordSubtitlesUrl;
        }

        public static final class Builder {
            private String failCode; 
            private String failReason; 
            private String subtitlesUrl; 
            private Integer videoDuration; 
            private String videoUrl; 
            private String wordSubtitlesUrl; 

            /**
             * FailCode.
             */
            public Builder failCode(String failCode) {
                this.failCode = failCode;
                return this;
            }

            /**
             * FailReason.
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * SubtitlesUrl.
             */
            public Builder subtitlesUrl(String subtitlesUrl) {
                this.subtitlesUrl = subtitlesUrl;
                return this;
            }

            /**
             * VideoDuration.
             */
            public Builder videoDuration(Integer videoDuration) {
                this.videoDuration = videoDuration;
                return this;
            }

            /**
             * VideoUrl.
             */
            public Builder videoUrl(String videoUrl) {
                this.videoUrl = videoUrl;
                return this;
            }

            /**
             * 字粒度的时间戳文件，特定任务支持
             */
            public Builder wordSubtitlesUrl(String wordSubtitlesUrl) {
                this.wordSubtitlesUrl = wordSubtitlesUrl;
                return this;
            }

            public TaskResult build() {
                return new TaskResult(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Process")
        private String process;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskResult")
        private TaskResult taskResult;

        @NameInMap("TaskUuid")
        private String taskUuid;

        @NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.process = builder.process;
            this.status = builder.status;
            this.taskResult = builder.taskResult;
            this.taskUuid = builder.taskUuid;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return process
         */
        public String getProcess() {
            return this.process;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskResult
         */
        public TaskResult getTaskResult() {
            return this.taskResult;
        }

        /**
         * @return taskUuid
         */
        public String getTaskUuid() {
            return this.taskUuid;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String process; 
            private String status; 
            private TaskResult taskResult; 
            private String taskUuid; 
            private String type; 

            /**
             * Process.
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskResult.
             */
            public Builder taskResult(TaskResult taskResult) {
                this.taskResult = taskResult;
                return this;
            }

            /**
             * TaskUuid.
             */
            public Builder taskUuid(String taskUuid) {
                this.taskUuid = taskUuid;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
