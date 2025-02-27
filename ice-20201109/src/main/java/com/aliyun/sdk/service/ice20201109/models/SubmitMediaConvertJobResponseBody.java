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
 * {@link SubmitMediaConvertJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitMediaConvertJobResponseBody</p>
 */
public class SubmitMediaConvertJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Job")
    private Job job;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SubmitMediaConvertJobResponseBody(Builder builder) {
        this.job = builder.job;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitMediaConvertJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return job
     */
    public Job getJob() {
        return this.job;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Job job; 
        private String requestId; 

        /**
         * <p>The transcoding task.</p>
         */
        public Builder job(Job job) {
            this.job = job;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SubmitMediaConvertJobResponseBody build() {
            return new SubmitMediaConvertJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SubmitMediaConvertJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitMediaConvertJobResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Inputs")
        private java.util.List<MediaConvertInput> inputs;

        @com.aliyun.core.annotation.NameInMap("OutputGroups")
        private java.util.List<MediaConvertOutputGroup> outputGroups;

        @com.aliyun.core.annotation.NameInMap("Outputs")
        private java.util.List<MediaConvertOutput> outputs;

        private Config(Builder builder) {
            this.inputs = builder.inputs;
            this.outputGroups = builder.outputGroups;
            this.outputs = builder.outputs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return inputs
         */
        public java.util.List<MediaConvertInput> getInputs() {
            return this.inputs;
        }

        /**
         * @return outputGroups
         */
        public java.util.List<MediaConvertOutputGroup> getOutputGroups() {
            return this.outputGroups;
        }

        /**
         * @return outputs
         */
        public java.util.List<MediaConvertOutput> getOutputs() {
            return this.outputs;
        }

        public static final class Builder {
            private java.util.List<MediaConvertInput> inputs; 
            private java.util.List<MediaConvertOutputGroup> outputGroups; 
            private java.util.List<MediaConvertOutput> outputs; 

            /**
             * <p>The inputs of the transcoding task.</p>
             */
            public Builder inputs(java.util.List<MediaConvertInput> inputs) {
                this.inputs = inputs;
                return this;
            }

            /**
             * <p>The output group configurations.</p>
             */
            public Builder outputGroups(java.util.List<MediaConvertOutputGroup> outputGroups) {
                this.outputGroups = outputGroups;
                return this;
            }

            /**
             * <p>The output configurations.</p>
             */
            public Builder outputs(java.util.List<MediaConvertOutput> outputs) {
                this.outputs = outputs;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitMediaConvertJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitMediaConvertJobResponseBody</p>
     */
    public static class Job extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientToken")
        private String clientToken;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("OutputDetails")
        private java.util.List<MediaConvertOutputDetail> outputDetails;

        @com.aliyun.core.annotation.NameInMap("OutputGroupDetails")
        private java.util.List<MediaConvertOutputGroupDetail> outputGroupDetails;

        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private Job(Builder builder) {
            this.clientToken = builder.clientToken;
            this.code = builder.code;
            this.config = builder.config;
            this.jobId = builder.jobId;
            this.message = builder.message;
            this.outputDetails = builder.outputDetails;
            this.outputGroupDetails = builder.outputGroupDetails;
            this.pipelineId = builder.pipelineId;
            this.requestId = builder.requestId;
            this.state = builder.state;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Job create() {
            return builder().build();
        }

        /**
         * @return clientToken
         */
        public String getClientToken() {
            return this.clientToken;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
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
         * @return outputDetails
         */
        public java.util.List<MediaConvertOutputDetail> getOutputDetails() {
            return this.outputDetails;
        }

        /**
         * @return outputGroupDetails
         */
        public java.util.List<MediaConvertOutputGroupDetail> getOutputGroupDetails() {
            return this.outputGroupDetails;
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String clientToken; 
            private String code; 
            private Config config; 
            private String jobId; 
            private String message; 
            private java.util.List<MediaConvertOutputDetail> outputDetails; 
            private java.util.List<MediaConvertOutputGroupDetail> outputGroupDetails; 
            private String pipelineId; 
            private String requestId; 
            private String state; 
            private String userData; 

            /**
             * <p>The idempotency key of the request for creating the transcoding task.</p>
             * 
             * <strong>example:</strong>
             * <p>FB7F25E9-AD9B-1603-8AF6-F1E42DF2E706</p>
             */
            public Builder clientToken(String clientToken) {
                this.clientToken = clientToken;
                return this;
            }

            /**
             * <p>The error code returned when the transcoding task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The configurations of the transcoding task.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The ID of the transcoding task.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The error message returned when the transcoding task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The details of the transcoded outputs.</p>
             */
            public Builder outputDetails(java.util.List<MediaConvertOutputDetail> outputDetails) {
                this.outputDetails = outputDetails;
                return this;
            }

            /**
             * <p>The details of the output groups.</p>
             */
            public Builder outputGroupDetails(java.util.List<MediaConvertOutputGroupDetail> outputGroupDetails) {
                this.outputGroupDetails = outputGroupDetails;
                return this;
            }

            /**
             * <p>The ID of the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>3780049</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The ID of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>A2129C9F-CE95-58B5-B8C1-07758FF6C86F</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The status of the transcoding task. Valid values:</p>
             * <ul>
             * <li>Inited: The task is initialized.</li>
             * <li>Running</li>
             * <li>Success</li>
             * <li>Failed</li>
             * <li>Cancelled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The user data.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;videoId&quot;:&quot;abcd&quot;}</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public Job build() {
                return new Job(this);
            } 

        } 

    }
}
