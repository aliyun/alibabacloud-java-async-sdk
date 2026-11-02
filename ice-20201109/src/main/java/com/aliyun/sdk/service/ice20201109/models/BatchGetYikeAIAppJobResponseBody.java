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
         * <p>The list of tasks. Each element in the list matches the result of GetYikeAIAppJob.</p>
         */
        public Builder jobList(java.util.List<JobList> jobList) {
            this.jobList = jobList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
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
             * <p>The media asset ID.</p>
             * 
             * <strong>example:</strong>
             * <p>bb1dfa20a0c971f08c94e7f6d6496202</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The output file URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dtlive-bj.oss-cn-beijing.aliyuncs.com/cover/01e1271d-ff4f-4689-9c20-e1df81486859_open_live_cover.mp3">https://dtlive-bj.oss-cn-beijing.aliyuncs.com/cover/01e1271d-ff4f-4689-9c20-e1df81486859_open_live_cover.mp3</a></p>
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
             * <p>The media asset ID.</p>
             * 
             * <strong>example:</strong>
             * <p>318d6350a57d71f08c9ae7f7d4496302</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The output file URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dtlive-bj.oss-cn-beijing.aliyuncs.com/cover/01e1271d-ff4f-4689-9c20-e1df81486859_open_live_cover.jpg">https://dtlive-bj.oss-cn-beijing.aliyuncs.com/cover/01e1271d-ff4f-4689-9c20-e1df81486859_open_live_cover.jpg</a></p>
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
             * <p>The media asset ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ec2de25068fd71f0a48cf7e6c4596302</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The output file URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dtlive-bj.oss-cn-beijing.aliyuncs.com/cover/01e1271d-ff4f-4689-9c20-e1df81486859_open_live_cover.mp4">https://dtlive-bj.oss-cn-beijing.aliyuncs.com/cover/01e1271d-ff4f-4689-9c20-e1df81486859_open_live_cover.mp4</a></p>
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
             * <p>The audio task result.</p>
             */
            public Builder audioResult(java.util.List<AudioResult> audioResult) {
                this.audioResult = audioResult;
                return this;
            }

            /**
             * <p>The image task result.</p>
             */
            public Builder imageResult(java.util.List<ImageResult> imageResult) {
                this.imageResult = imageResult;
                return this;
            }

            /**
             * <p>The video task result.</p>
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
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9e09955d662a</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The input parameters for running the AI application, formatted as a string after you serialize the parameters in JSON.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;LoadImage.1.TargetImage\&quot;:\&quot;MediaId1\&quot;}</p>
             */
            public Builder appInputConfig(String appInputConfig) {
                this.appInputConfig = appInputConfig;
                return this;
            }

            /**
             * <p>The task start time, in the yyyy-MM-ddTHH:mm:ssZ format (UTC time).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-02-06T18:53:34.001+08:00</p>
             */
            public Builder executionFinishTime(String executionFinishTime) {
                this.executionFinishTime = executionFinishTime;
                return this;
            }

            /**
             * <p>The task end time, in the yyyy-MM-ddTHH:mm:ssZ format (UTC time).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-02-06T18:53:18.809+08:00</p>
             */
            public Builder executionStartTime(String executionStartTime) {
                this.executionStartTime = executionStartTime;
                return this;
            }

            /**
             * <p>The folder ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pd_0617169475</p>
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pd_0617169475</p>
             */
            public Builder productionId(String productionId) {
                this.productionId = productionId;
                return this;
            }

            /**
             * <p>The task execution result.</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>Created: The task was just created.</li>
             * <li>Queuing: The task is in the queue.</li>
             * <li>Executing: The task is being executed.</li>
             * <li>Finished: The task execution is complete.</li>
             * <li>Failed: The task execution failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
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
