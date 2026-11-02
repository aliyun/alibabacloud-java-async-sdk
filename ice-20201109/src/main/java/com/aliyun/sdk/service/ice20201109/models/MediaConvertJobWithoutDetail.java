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
 * {@link MediaConvertJobWithoutDetail} extends {@link TeaModel}
 *
 * <p>MediaConvertJobWithoutDetail</p>
 */
public class MediaConvertJobWithoutDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Config")
    private Config config;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("FinishTime")
    private String finishTime;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PipelineId")
    private String pipelineId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private MediaConvertJobWithoutDetail(Builder builder) {
        this.clientToken = builder.clientToken;
        this.code = builder.code;
        this.config = builder.config;
        this.createTime = builder.createTime;
        this.finishTime = builder.finishTime;
        this.jobId = builder.jobId;
        this.message = builder.message;
        this.pipelineId = builder.pipelineId;
        this.requestId = builder.requestId;
        this.state = builder.state;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MediaConvertJobWithoutDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String createTime; 
        private String finishTime; 
        private String jobId; 
        private String message; 
        private String pipelineId; 
        private String requestId; 
        private String state; 
        private String userData; 

        private Builder() {
        } 

        private Builder(MediaConvertJobWithoutDetail model) {
            this.clientToken = model.clientToken;
            this.code = model.code;
            this.config = model.config;
            this.createTime = model.createTime;
            this.finishTime = model.finishTime;
            this.jobId = model.jobId;
            this.message = model.message;
            this.pipelineId = model.pipelineId;
            this.requestId = model.requestId;
            this.state = model.state;
            this.userData = model.userData;
        } 

        /**
         * <p>The idempotency token provided during the task creation request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>12e8864746a0a398</strong></strong></p>
         */
        public Builder clientToken(String clientToken) {
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The error code for a failed task.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter.ResourceNotFound</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The task configuration.</p>
         */
        public Builder config(Config config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The time the task was created, in UTC format (<em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z).</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-07T13:01:07Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The time the task finished processing, in UTC format (<em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z).</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-07T13:01:07Z</p>
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>d80e4e4044975745c14b</strong></strong></p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The reason for a task failure.</p>
         * 
         * <strong>example:</strong>
         * <p>The resource operated &quot;%s&quot; cannot be found</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the queue on which this task was processed.</p>
         * 
         * <strong>example:</strong>
         * <p>688c2a8bfa4e44ddbba0c8730db91b0c</p>
         */
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * <p>The ID of the API request that created this task.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the task.</p>
         * <ul>
         * <li>Inited: The task is initialized.</li>
         * <li>Running</li>
         * <li>Complete</li>
         * <li>Error</li>
         * <li>Cancelled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Inited</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The user-defined data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;info&quot;: &quot;xxx&quot;}</p>
         */
        public Builder userData(String userData) {
            this.userData = userData;
            return this;
        }

        public MediaConvertJobWithoutDetail build() {
            return new MediaConvertJobWithoutDetail(this);
        } 

    } 

    /**
     * 
     * {@link MediaConvertJobWithoutDetail} extends {@link TeaModel}
     *
     * <p>MediaConvertJobWithoutDetail</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Inputs")
        private java.util.List<MediaConvertInput> inputs;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("OutputGroups")
        private java.util.List<MediaConvertOutputGroup> outputGroups;

        @com.aliyun.core.annotation.NameInMap("Outputs")
        private java.util.List<MediaConvertOutput> outputs;

        private Config(Builder builder) {
            this.inputs = builder.inputs;
            this.jobName = builder.jobName;
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
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
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
            private String jobName; 
            private java.util.List<MediaConvertOutputGroup> outputGroups; 
            private java.util.List<MediaConvertOutput> outputs; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.inputs = model.inputs;
                this.jobName = model.jobName;
                this.outputGroups = model.outputGroups;
                this.outputs = model.outputs;
            } 

            /**
             * <p>The input files for the task.</p>
             */
            public Builder inputs(java.util.List<MediaConvertInput> inputs) {
                this.inputs = inputs;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>Name</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The output groups.</p>
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
}
