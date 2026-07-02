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
 * {@link GetImageGenerationJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageGenerationJobResponseBody</p>
 */
public class GetImageGenerationJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageGenerationJob")
    private ImageGenerationJob imageGenerationJob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetImageGenerationJobResponseBody(Builder builder) {
        this.imageGenerationJob = builder.imageGenerationJob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageGenerationJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageGenerationJob
     */
    public ImageGenerationJob getImageGenerationJob() {
        return this.imageGenerationJob;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ImageGenerationJob imageGenerationJob; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetImageGenerationJobResponseBody model) {
            this.imageGenerationJob = model.imageGenerationJob;
            this.requestId = model.requestId;
        } 

        /**
         * ImageGenerationJob.
         */
        public Builder imageGenerationJob(ImageGenerationJob imageGenerationJob) {
            this.imageGenerationJob = imageGenerationJob;
            return this;
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

        public GetImageGenerationJobResponseBody build() {
            return new GetImageGenerationJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetImageGenerationJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageGenerationJobResponseBody</p>
     */
    public static class ImageGenerationJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AspectRatio")
        private String aspectRatio;

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
        private String n;

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

        private ImageGenerationJob(Builder builder) {
            this.aspectRatio = builder.aspectRatio;
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

        public static ImageGenerationJob create() {
            return builder().build();
        }

        /**
         * @return aspectRatio
         */
        public String getAspectRatio() {
            return this.aspectRatio;
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
        public String getN() {
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
            private String errorMessage; 
            private String input; 
            private String jobId; 
            private String jobParameters; 
            private String jobType; 
            private String model; 
            private String n; 
            private String output; 
            private String resolution; 
            private String scene; 
            private String status; 
            private String userData; 

            private Builder() {
            } 

            private Builder(ImageGenerationJob model) {
                this.aspectRatio = model.aspectRatio;
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
            public Builder n(String n) {
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

            public ImageGenerationJob build() {
                return new ImageGenerationJob(this);
            } 

        } 

    }
}
