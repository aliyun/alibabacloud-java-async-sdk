// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link BatchGetYikeAIAppJobResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetYikeAIAppJobResponseBody</p>
 */
public class BatchGetYikeAIAppJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobList")
    private java.util.List<JobList> jobList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchGetYikeAIAppJobResponseBody(Builder builder) {
        this.jobList = builder.jobList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetYikeAIAppJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobList
     */
    public java.util.List<JobList> getJobList() {
        return this.jobList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<JobList> jobList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(BatchGetYikeAIAppJobResponseBody model) {
            this.jobList = model.jobList;
            this.requestId = model.requestId;
        } 

        /**
         * JobList.
         */
        public Builder jobList(java.util.List<JobList> jobList) {
            this.jobList = jobList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchGetYikeAIAppJobResponseBody build() {
            return new BatchGetYikeAIAppJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchGetYikeAIAppJobResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetYikeAIAppJobResponseBody</p>
     */
    public static class AudioResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("OutputUrl")
        private String outputUrl;

        private AudioResult(Builder builder) {
            this.mediaId = builder.mediaId;
            this.outputUrl = builder.outputUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioResult create() {
            return builder().build();
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return outputUrl
         */
        public String getOutputUrl() {
            return this.outputUrl;
        }

        public static final class Builder {
            private String mediaId; 
            private String outputUrl; 

            private Builder() {
            } 

            private Builder(AudioResult model) {
                this.mediaId = model.mediaId;
                this.outputUrl = model.outputUrl;
            } 

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * OutputUrl.
             */
            public Builder outputUrl(String outputUrl) {
                this.outputUrl = outputUrl;
                return this;
            }

            public AudioResult build() {
                return new AudioResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetYikeAIAppJobResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetYikeAIAppJobResponseBody</p>
     */
    public static class ImageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("OutputUrl")
        private String outputUrl;

        private ImageResult(Builder builder) {
            this.mediaId = builder.mediaId;
            this.outputUrl = builder.outputUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageResult create() {
            return builder().build();
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return outputUrl
         */
        public String getOutputUrl() {
            return this.outputUrl;
        }

        public static final class Builder {
            private String mediaId; 
            private String outputUrl; 

            private Builder() {
            } 

            private Builder(ImageResult model) {
                this.mediaId = model.mediaId;
                this.outputUrl = model.outputUrl;
            } 

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * OutputUrl.
             */
            public Builder outputUrl(String outputUrl) {
                this.outputUrl = outputUrl;
                return this;
            }

            public ImageResult build() {
                return new ImageResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetYikeAIAppJobResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetYikeAIAppJobResponseBody</p>
     */
    public static class VideoResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("OutputUrl")
        private String outputUrl;

        private VideoResult(Builder builder) {
            this.mediaId = builder.mediaId;
            this.outputUrl = builder.outputUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoResult create() {
            return builder().build();
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return outputUrl
         */
        public String getOutputUrl() {
            return this.outputUrl;
        }

        public static final class Builder {
            private String mediaId; 
            private String outputUrl; 

            private Builder() {
            } 

            private Builder(VideoResult model) {
                this.mediaId = model.mediaId;
                this.outputUrl = model.outputUrl;
            } 

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * OutputUrl.
             */
            public Builder outputUrl(String outputUrl) {
                this.outputUrl = outputUrl;
                return this;
            }

            public VideoResult build() {
                return new VideoResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetYikeAIAppJobResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetYikeAIAppJobResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioResult")
        private java.util.List<AudioResult> audioResult;

        @com.aliyun.core.annotation.NameInMap("ImageResult")
        private java.util.List<ImageResult> imageResult;

        @com.aliyun.core.annotation.NameInMap("VideoResult")
        private java.util.List<VideoResult> videoResult;

        private Result(Builder builder) {
            this.audioResult = builder.audioResult;
            this.imageResult = builder.imageResult;
            this.videoResult = builder.videoResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return audioResult
         */
        public java.util.List<AudioResult> getAudioResult() {
            return this.audioResult;
        }

        /**
         * @return imageResult
         */
        public java.util.List<ImageResult> getImageResult() {
            return this.imageResult;
        }

        /**
         * @return videoResult
         */
        public java.util.List<VideoResult> getVideoResult() {
            return this.videoResult;
        }

        public static final class Builder {
            private java.util.List<AudioResult> audioResult; 
            private java.util.List<ImageResult> imageResult; 
            private java.util.List<VideoResult> videoResult; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.audioResult = model.audioResult;
                this.imageResult = model.imageResult;
                this.videoResult = model.videoResult;
            } 

            /**
             * AudioResult.
             */
            public Builder audioResult(java.util.List<AudioResult> audioResult) {
                this.audioResult = audioResult;
                return this;
            }

            /**
             * ImageResult.
             */
            public Builder imageResult(java.util.List<ImageResult> imageResult) {
                this.imageResult = imageResult;
                return this;
            }

            /**
             * VideoResult.
             */
            public Builder videoResult(java.util.List<VideoResult> videoResult) {
                this.videoResult = videoResult;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetYikeAIAppJobResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetYikeAIAppJobResponseBody</p>
     */
    public static class JobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppInputConfig")
        private String appInputConfig;

        @com.aliyun.core.annotation.NameInMap("ExecutionFinishTime")
        private String executionFinishTime;

        @com.aliyun.core.annotation.NameInMap("ExecutionStartTime")
        private String executionStartTime;

        @com.aliyun.core.annotation.NameInMap("FolderId")
        private String folderId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("ProductionId")
        private String productionId;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Result result;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private JobList(Builder builder) {
            this.appId = builder.appId;
            this.appInputConfig = builder.appInputConfig;
            this.executionFinishTime = builder.executionFinishTime;
            this.executionStartTime = builder.executionStartTime;
            this.folderId = builder.folderId;
            this.jobId = builder.jobId;
            this.productionId = builder.productionId;
            this.result = builder.result;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appInputConfig
         */
        public String getAppInputConfig() {
            return this.appInputConfig;
        }

        /**
         * @return executionFinishTime
         */
        public String getExecutionFinishTime() {
            return this.executionFinishTime;
        }

        /**
         * @return executionStartTime
         */
        public String getExecutionStartTime() {
            return this.executionStartTime;
        }

        /**
         * @return folderId
         */
        public String getFolderId() {
            return this.folderId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return productionId
         */
        public String getProductionId() {
            return this.productionId;
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String appId; 
            private String appInputConfig; 
            private String executionFinishTime; 
            private String executionStartTime; 
            private String folderId; 
            private String jobId; 
            private String productionId; 
            private Result result; 
            private String status; 

            private Builder() {
            } 

            private Builder(JobList model) {
                this.appId = model.appId;
                this.appInputConfig = model.appInputConfig;
                this.executionFinishTime = model.executionFinishTime;
                this.executionStartTime = model.executionStartTime;
                this.folderId = model.folderId;
                this.jobId = model.jobId;
                this.productionId = model.productionId;
                this.result = model.result;
                this.status = model.status;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppInputConfig.
             */
            public Builder appInputConfig(String appInputConfig) {
                this.appInputConfig = appInputConfig;
                return this;
            }

            /**
             * ExecutionFinishTime.
             */
            public Builder executionFinishTime(String executionFinishTime) {
                this.executionFinishTime = executionFinishTime;
                return this;
            }

            /**
             * ExecutionStartTime.
             */
            public Builder executionStartTime(String executionStartTime) {
                this.executionStartTime = executionStartTime;
                return this;
            }

            /**
             * FolderId.
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * ProductionId.
             */
            public Builder productionId(String productionId) {
                this.productionId = productionId;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public JobList build() {
                return new JobList(this);
            } 

        } 

    }
}
