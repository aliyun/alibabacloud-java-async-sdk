// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link GetVideoGenerationJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoGenerationJobResponseBody</p>
 */
public class GetVideoGenerationJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VideoGenerationJob")
    private VideoGenerationJob videoGenerationJob;

    private GetVideoGenerationJobResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.videoGenerationJob = builder.videoGenerationJob;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoGenerationJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return videoGenerationJob
     */
    public VideoGenerationJob getVideoGenerationJob() {
        return this.videoGenerationJob;
    }

    public static final class Builder {
        private String requestId; 
        private VideoGenerationJob videoGenerationJob; 

        private Builder() {
        } 

        private Builder(GetVideoGenerationJobResponseBody model) {
            this.requestId = model.requestId;
            this.videoGenerationJob = model.videoGenerationJob;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VideoGenerationJob.
         */
        public Builder videoGenerationJob(VideoGenerationJob videoGenerationJob) {
            this.videoGenerationJob = videoGenerationJob;
            return this;
        }

        public GetVideoGenerationJobResponseBody build() {
            return new GetVideoGenerationJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVideoGenerationJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoGenerationJobResponseBody</p>
     */
    public static class VideoGenerationJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AspectRatio")
        private String aspectRatio;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Input")
        private String input;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobParameters")
        private String jobParameters;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("N")
        private Integer n;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("Resolution")
        private String resolution;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private VideoGenerationJob(Builder builder) {
            this.aspectRatio = builder.aspectRatio;
            this.duration = builder.duration;
            this.errorMessage = builder.errorMessage;
            this.input = builder.input;
            this.jobId = builder.jobId;
            this.jobParameters = builder.jobParameters;
            this.jobType = builder.jobType;
            this.model = builder.model;
            this.n = builder.n;
            this.output = builder.output;
            this.resolution = builder.resolution;
            this.scene = builder.scene;
            this.status = builder.status;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoGenerationJob create() {
            return builder().build();
        }

        /**
         * @return aspectRatio
         */
        public String getAspectRatio() {
            return this.aspectRatio;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return input
         */
        public String getInput() {
            return this.input;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobParameters
         */
        public String getJobParameters() {
            return this.jobParameters;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return n
         */
        public Integer getN() {
            return this.n;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return resolution
         */
        public String getResolution() {
            return this.resolution;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String aspectRatio; 
            private String duration; 
            private String errorMessage; 
            private String input; 
            private String jobId; 
            private String jobParameters; 
            private String jobType; 
            private String model; 
            private Integer n; 
            private String output; 
            private String resolution; 
            private String scene; 
            private String status; 
            private String userData; 

            private Builder() {
            } 

            private Builder(VideoGenerationJob model) {
                this.aspectRatio = model.aspectRatio;
                this.duration = model.duration;
                this.errorMessage = model.errorMessage;
                this.input = model.input;
                this.jobId = model.jobId;
                this.jobParameters = model.jobParameters;
                this.jobType = model.jobType;
                this.model = model.model;
                this.n = model.n;
                this.output = model.output;
                this.resolution = model.resolution;
                this.scene = model.scene;
                this.status = model.status;
                this.userData = model.userData;
            } 

            /**
             * AspectRatio.
             */
            public Builder aspectRatio(String aspectRatio) {
                this.aspectRatio = aspectRatio;
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
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Input.
             */
            public Builder input(String input) {
                this.input = input;
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
             * JobParameters.
             */
            public Builder jobParameters(String jobParameters) {
                this.jobParameters = jobParameters;
                return this;
            }

            /**
             * JobType.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
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
             * N.
             */
            public Builder n(Integer n) {
                this.n = n;
                return this;
            }

            /**
             * Output.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * Resolution.
             */
            public Builder resolution(String resolution) {
                this.resolution = resolution;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
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
             * UserData.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public VideoGenerationJob build() {
                return new VideoGenerationJob(this);
            } 

        } 

    }
}
