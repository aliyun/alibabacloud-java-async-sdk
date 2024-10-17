// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPackageJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetPackageJobResponseBody</p>
 */
public class GetPackageJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PackageJob")
    private PackageJob packageJob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPackageJobResponseBody(Builder builder) {
        this.packageJob = builder.packageJob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPackageJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return packageJob
     */
    public PackageJob getPackageJob() {
        return this.packageJob;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PackageJob packageJob; 
        private String requestId; 

        /**
         * PackageJob.
         */
        public Builder packageJob(PackageJob packageJob) {
            this.packageJob = packageJob;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPackageJobResponseBody build() {
            return new GetPackageJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPackageJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetPackageJobResponseBody</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Input(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String type; 

            /**
             * Media.
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPackageJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetPackageJobResponseBody</p>
     */
    public static class Inputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Input")
        private Input input;

        private Inputs(Builder builder) {
            this.input = builder.input;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Inputs create() {
            return builder().build();
        }

        /**
         * @return input
         */
        public Input getInput() {
            return this.input;
        }

        public static final class Builder {
            private Input input; 

            /**
             * Input.
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            public Inputs build() {
                return new Inputs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPackageJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetPackageJobResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Output(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String type; 

            /**
             * Media.
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPackageJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetPackageJobResponseBody</p>
     */
    public static class PackageJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Inputs")
        private java.util.List < Inputs> inputs;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Output")
        private Output output;

        @com.aliyun.core.annotation.NameInMap("OutputUrl")
        private String outputUrl;

        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubmitTime")
        private String submitTime;

        @com.aliyun.core.annotation.NameInMap("TriggerSource")
        private String triggerSource;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private PackageJob(Builder builder) {
            this.code = builder.code;
            this.createTime = builder.createTime;
            this.finishTime = builder.finishTime;
            this.inputs = builder.inputs;
            this.jobId = builder.jobId;
            this.message = builder.message;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.output = builder.output;
            this.outputUrl = builder.outputUrl;
            this.pipelineId = builder.pipelineId;
            this.priority = builder.priority;
            this.status = builder.status;
            this.submitTime = builder.submitTime;
            this.triggerSource = builder.triggerSource;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackageJob create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return inputs
         */
        public java.util.List < Inputs> getInputs() {
            return this.inputs;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return output
         */
        public Output getOutput() {
            return this.output;
        }

        /**
         * @return outputUrl
         */
        public String getOutputUrl() {
            return this.outputUrl;
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        /**
         * @return triggerSource
         */
        public String getTriggerSource() {
            return this.triggerSource;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String code; 
            private String createTime; 
            private String finishTime; 
            private java.util.List < Inputs> inputs; 
            private String jobId; 
            private String message; 
            private String modifiedTime; 
            private String name; 
            private Output output; 
            private String outputUrl; 
            private String pipelineId; 
            private Integer priority; 
            private String status; 
            private String submitTime; 
            private String triggerSource; 
            private String userData; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * Inputs.
             */
            public Builder inputs(java.util.List < Inputs> inputs) {
                this.inputs = inputs;
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
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Output.
             */
            public Builder output(Output output) {
                this.output = output;
                return this;
            }

            /**
             * OutputUrl.
             */
            public Builder outputUrl(String outputUrl) {
                this.outputUrl = outputUrl;
                return this;
            }

            /**
             * PipelineId.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
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
             * SubmitTime.
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * TriggerSource.
             */
            public Builder triggerSource(String triggerSource) {
                this.triggerSource = triggerSource;
                return this;
            }

            /**
             * UserData.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public PackageJob build() {
                return new PackageJob(this);
            } 

        } 

    }
}
