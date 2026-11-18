// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link GetVideoCharacterReplaceJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoCharacterReplaceJobResponseBody</p>
 */
public class GetVideoCharacterReplaceJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("AppParams")
    private String appParams;

    @com.aliyun.core.annotation.NameInMap("ExecutionFinishTime")
    private String executionFinishTime;

    @com.aliyun.core.annotation.NameInMap("ExecutionStartTime")
    private String executionStartTime;

    @com.aliyun.core.annotation.NameInMap("FolderId")
    private String folderId;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetVideoCharacterReplaceJobResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.appParams = builder.appParams;
        this.executionFinishTime = builder.executionFinishTime;
        this.executionStartTime = builder.executionStartTime;
        this.folderId = builder.folderId;
        this.jobId = builder.jobId;
        this.projectId = builder.projectId;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoCharacterReplaceJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appParams
     */
    public String getAppParams() {
        return this.appParams;
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
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String appParams; 
        private String executionFinishTime; 
        private String executionStartTime; 
        private String folderId; 
        private String jobId; 
        private String projectId; 
        private String requestId; 
        private Result result; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetVideoCharacterReplaceJobResponseBody model) {
            this.appId = model.appId;
            this.appParams = model.appParams;
            this.executionFinishTime = model.executionFinishTime;
            this.executionStartTime = model.executionStartTime;
            this.folderId = model.folderId;
            this.jobId = model.jobId;
            this.projectId = model.projectId;
            this.requestId = model.requestId;
            this.result = model.result;
            this.status = model.status;
        } 

        /**
         * <p>The ID of the video character replacement application. Use a configured application.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * <p>The application input parameters, which are serialized into a JSON string. The field names and material requirements are subject to the input definition of the corresponding AppId.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;LoadImage.1.TargetImage&quot;:&quot;1a7852b032c371f0b64fe6f6c74b****&quot;}</p>
         */
        public Builder appParams(String appParams) {
            this.appParams = appParams;
            return this;
        }

        /**
         * <p>The time when the task finished execution, in ISO 8601 format with time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-06T18:54:18.809+08:00</p>
         */
        public Builder executionFinishTime(String executionFinishTime) {
            this.executionFinishTime = executionFinishTime;
            return this;
        }

        /**
         * <p>The time when the task started execution, in ISO 8601 format with time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-06T18:53:34.001+08:00</p>
         */
        public Builder executionStartTime(String executionStartTime) {
            this.executionStartTime = executionStartTime;
            return this;
        }

        /**
         * <p>The folder ID.</p>
         * 
         * <strong>example:</strong>
         * <p>folder-u3ilwhoc36ux9a****</p>
         */
        public Builder folderId(String folderId) {
            this.folderId = folderId;
            return this;
        }

        /**
         * <p>The task ID, which is returned by SubmitVideoCharacterReplaceJob.</p>
         * 
         * <strong>example:</strong>
         * <p>ag_83baeea38b534ee1937b8a4acd08****</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pd_061716****</p>
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task output results, categorized by image, video, and audio.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>Created: The task is created.</li>
         * <li>Queuing: The task is queuing.</li>
         * <li>Executing: The task is being executed.</li>
         * <li>Finished: The task is finished.</li>
         * <li>Failed: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetVideoCharacterReplaceJobResponseBody build() {
            return new GetVideoCharacterReplaceJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVideoCharacterReplaceJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoCharacterReplaceJobResponseBody</p>
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
             * <p>The ID of the output media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1a7852b032c371f0b64fe6f6c74b****</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The download URL of the output media asset.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.mp3">https://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.mp3</a></p>
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
     * {@link GetVideoCharacterReplaceJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoCharacterReplaceJobResponseBody</p>
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
             * <p>The ID of the output media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1a7852b032c371f0b64fe6f6c74b****</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The download URL of the output media asset.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.png">https://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.png</a></p>
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
     * {@link GetVideoCharacterReplaceJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoCharacterReplaceJobResponseBody</p>
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
             * <p>The ID of the output media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1a7852b032c371f0b64fe6f6c74b****</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The download URL of the output media asset.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.mp4">https://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.mp4</a></p>
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
     * {@link GetVideoCharacterReplaceJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoCharacterReplaceJobResponseBody</p>
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
             * <p>The list of output audio files.</p>
             */
            public Builder audioResult(java.util.List<AudioResult> audioResult) {
                this.audioResult = audioResult;
                return this;
            }

            /**
             * <p>The list of output images.</p>
             */
            public Builder imageResult(java.util.List<ImageResult> imageResult) {
                this.imageResult = imageResult;
                return this;
            }

            /**
             * <p>The list of output videos.</p>
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
}
