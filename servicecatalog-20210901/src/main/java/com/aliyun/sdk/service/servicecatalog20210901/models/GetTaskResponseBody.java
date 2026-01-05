// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link GetTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskResponseBody</p>
 */
public class GetTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskDetail")
    private TaskDetail taskDetail;

    private GetTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskDetail = builder.taskDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskResponseBody create() {
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
     * @return taskDetail
     */
    public TaskDetail getTaskDetail() {
        return this.taskDetail;
    }

    public static final class Builder {
        private String requestId; 
        private TaskDetail taskDetail; 

        private Builder() {
        } 

        private Builder(GetTaskResponseBody model) {
            this.requestId = model.requestId;
            this.taskDetail = model.taskDetail;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the task.</p>
         */
        public Builder taskDetail(TaskDetail taskDetail) {
            this.taskDetail = taskDetail;
            return this;
        }

        public GetTaskResponseBody build() {
            return new GetTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskResponseBody</p>
     */
    public static class TerraformLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Stream")
        private String stream;

        private TerraformLogs(Builder builder) {
            this.command = builder.command;
            this.content = builder.content;
            this.stream = builder.stream;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TerraformLogs create() {
            return builder().build();
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return stream
         */
        public String getStream() {
            return this.stream;
        }

        public static final class Builder {
            private String command; 
            private String content; 
            private String stream; 

            private Builder() {
            } 

            private Builder(TerraformLogs model) {
                this.command = model.command;
                this.content = model.content;
                this.stream = model.stream;
            } 

            /**
             * <p>The name of the Terraform command that is run. Valid values:</p>
             * <ul>
             * <li>apply</li>
             * <li>plan</li>
             * <li>destroy</li>
             * <li>version</li>
             * </ul>
             * <p>For more information about Terraform commands, see <a href="https://www.terraform.io/cli/commands">Basic CLI Features</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>apply</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The content of the output stream that is returned after the command is run.</p>
             * 
             * <strong>example:</strong>
             * <p>Apply complete! Resources: 42 added, 0 changed, 0 destroyed.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The output stream. Valid values:</p>
             * <ul>
             * <li>stdout: a standard output stream</li>
             * <li>stderr: a standard error stream</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>stdout</p>
             */
            public Builder stream(String stream) {
                this.stream = stream;
                return this;
            }

            public TerraformLogs build() {
                return new TerraformLogs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskResponseBody</p>
     */
    public static class Log extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TerraformLogs")
        private java.util.List<TerraformLogs> terraformLogs;

        private Log(Builder builder) {
            this.terraformLogs = builder.terraformLogs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Log create() {
            return builder().build();
        }

        /**
         * @return terraformLogs
         */
        public java.util.List<TerraformLogs> getTerraformLogs() {
            return this.terraformLogs;
        }

        public static final class Builder {
            private java.util.List<TerraformLogs> terraformLogs; 

            private Builder() {
            } 

            private Builder(Log model) {
                this.terraformLogs = model.terraformLogs;
            } 

            /**
             * <p>The Terraform logs.</p>
             */
            public Builder terraformLogs(java.util.List<TerraformLogs> terraformLogs) {
                this.terraformLogs = terraformLogs;
                return this;
            }

            public Log build() {
                return new Log(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskResponseBody</p>
     */
    public static class Outputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("OutputKey")
        private String outputKey;

        @com.aliyun.core.annotation.NameInMap("OutputValue")
        private String outputValue;

        private Outputs(Builder builder) {
            this.description = builder.description;
            this.outputKey = builder.outputKey;
            this.outputValue = builder.outputValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outputs create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return outputKey
         */
        public String getOutputKey() {
            return this.outputKey;
        }

        /**
         * @return outputValue
         */
        public String getOutputValue() {
            return this.outputValue;
        }

        public static final class Builder {
            private String description; 
            private String outputKey; 
            private String outputValue; 

            private Builder() {
            } 

            private Builder(Outputs model) {
                this.description = model.description;
                this.outputKey = model.outputKey;
                this.outputValue = model.outputValue;
            } 

            /**
             * <p>The description of the output parameter for the template.</p>
             * 
             * <strong>example:</strong>
             * <p>The ECS instance ID.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the output parameter for the template.</p>
             * 
             * <strong>example:</strong>
             * <p>instance_id</p>
             */
            public Builder outputKey(String outputKey) {
                this.outputKey = outputKey;
                return this;
            }

            /**
             * <p>The value of the output parameter for the template.</p>
             * 
             * <strong>example:</strong>
             * <p>i-xxxxxx</p>
             */
            public Builder outputValue(String outputValue) {
                this.outputValue = outputValue;
                return this;
            }

            public Outputs build() {
                return new Outputs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskResponseBody</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterKey")
        private String parameterKey;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        private String parameterValue;

        private Parameters(Builder builder) {
            this.parameterKey = builder.parameterKey;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return parameterKey
         */
        public String getParameterKey() {
            return this.parameterKey;
        }

        /**
         * @return parameterValue
         */
        public String getParameterValue() {
            return this.parameterValue;
        }

        public static final class Builder {
            private String parameterKey; 
            private String parameterValue; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.parameterKey = model.parameterKey;
                this.parameterValue = model.parameterValue;
            } 

            /**
             * <p>The name of the input parameter for the template.</p>
             * 
             * <strong>example:</strong>
             * <p>instance_type</p>
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * <p>The value of the input parameter for the template.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.s6-c1m1.small</p>
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskResponseBody</p>
     */
    public static class TaskTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TaskTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskTags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(TaskTags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The custom tag key.</p>
             * <p>The tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The custom tag value.</p>
             * <p>The value must be 1 to 128 characters in length. It cannot start with <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TaskTags build() {
                return new TaskTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskResponseBody</p>
     */
    public static class TaskDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Log")
        private Log log;

        @com.aliyun.core.annotation.NameInMap("Outputs")
        private java.util.List<Outputs> outputs;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.List<Parameters> parameters;

        @com.aliyun.core.annotation.NameInMap("PortfolioId")
        private String portfolioId;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("ProductVersionId")
        private String productVersionId;

        @com.aliyun.core.annotation.NameInMap("ProductVersionName")
        private String productVersionName;

        @com.aliyun.core.annotation.NameInMap("ProvisionedProductId")
        private String provisionedProductId;

        @com.aliyun.core.annotation.NameInMap("ProvisionedProductName")
        private String provisionedProductName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusMessage")
        private String statusMessage;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskTags")
        private java.util.List<TaskTags> taskTags;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private TaskDetail(Builder builder) {
            this.createTime = builder.createTime;
            this.log = builder.log;
            this.outputs = builder.outputs;
            this.parameters = builder.parameters;
            this.portfolioId = builder.portfolioId;
            this.productId = builder.productId;
            this.productName = builder.productName;
            this.productVersionId = builder.productVersionId;
            this.productVersionName = builder.productVersionName;
            this.provisionedProductId = builder.provisionedProductId;
            this.provisionedProductName = builder.provisionedProductName;
            this.status = builder.status;
            this.statusMessage = builder.statusMessage;
            this.taskId = builder.taskId;
            this.taskTags = builder.taskTags;
            this.taskType = builder.taskType;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskDetail create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return log
         */
        public Log getLog() {
            return this.log;
        }

        /**
         * @return outputs
         */
        public java.util.List<Outputs> getOutputs() {
            return this.outputs;
        }

        /**
         * @return parameters
         */
        public java.util.List<Parameters> getParameters() {
            return this.parameters;
        }

        /**
         * @return portfolioId
         */
        public String getPortfolioId() {
            return this.portfolioId;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return productVersionId
         */
        public String getProductVersionId() {
            return this.productVersionId;
        }

        /**
         * @return productVersionName
         */
        public String getProductVersionName() {
            return this.productVersionName;
        }

        /**
         * @return provisionedProductId
         */
        public String getProvisionedProductId() {
            return this.provisionedProductId;
        }

        /**
         * @return provisionedProductName
         */
        public String getProvisionedProductName() {
            return this.provisionedProductName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusMessage
         */
        public String getStatusMessage() {
            return this.statusMessage;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskTags
         */
        public java.util.List<TaskTags> getTaskTags() {
            return this.taskTags;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private Log log; 
            private java.util.List<Outputs> outputs; 
            private java.util.List<Parameters> parameters; 
            private String portfolioId; 
            private String productId; 
            private String productName; 
            private String productVersionId; 
            private String productVersionName; 
            private String provisionedProductId; 
            private String provisionedProductName; 
            private String status; 
            private String statusMessage; 
            private String taskId; 
            private java.util.List<TaskTags> taskTags; 
            private String taskType; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(TaskDetail model) {
                this.createTime = model.createTime;
                this.log = model.log;
                this.outputs = model.outputs;
                this.parameters = model.parameters;
                this.portfolioId = model.portfolioId;
                this.productId = model.productId;
                this.productName = model.productName;
                this.productVersionId = model.productVersionId;
                this.productVersionName = model.productVersionName;
                this.provisionedProductId = model.provisionedProductId;
                this.provisionedProductName = model.provisionedProductName;
                this.status = model.status;
                this.statusMessage = model.statusMessage;
                this.taskId = model.taskId;
                this.taskTags = model.taskTags;
                this.taskType = model.taskType;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The time when the task was created.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-23T09:46:27Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The logs of the instance.</p>
             */
            public Builder log(Log log) {
                this.log = log;
                return this;
            }

            /**
             * <p>The output parameters of the template.</p>
             */
            public Builder outputs(java.util.List<Outputs> outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * <p>The parameters that are specified in the template.</p>
             */
            public Builder parameters(java.util.List<Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The ID of the product portfolio.</p>
             * 
             * <strong>example:</strong>
             * <p>port-bp1yt7582g****</p>
             */
            public Builder portfolioId(String portfolioId) {
                this.portfolioId = portfolioId;
                return this;
            }

            /**
             * <p>The ID of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>prod-bp18r7q127****</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The name of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>DEMO-Create an ECS instance</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The ID of the product version.</p>
             * 
             * <strong>example:</strong>
             * <p>pv-bp15e79d26****</p>
             */
            public Builder productVersionId(String productVersionId) {
                this.productVersionId = productVersionId;
                return this;
            }

            /**
             * <p>The name of the product version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder productVersionName(String productVersionName) {
                this.productVersionName = productVersionName;
                return this;
            }

            /**
             * <p>The ID of the product instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pp-bp1ddg1n2a****</p>
             */
            public Builder provisionedProductId(String provisionedProductId) {
                this.provisionedProductId = provisionedProductId;
                return this;
            }

            /**
             * <p>The name of the product instance.</p>
             * 
             * <strong>example:</strong>
             * <p>DEMO-ECS instance</p>
             */
            public Builder provisionedProductName(String provisionedProductName) {
                this.provisionedProductName = provisionedProductName;
                return this;
            }

            /**
             * <p>The state of the task. Valid values:</p>
             * <ul>
             * <li>Succeeded: The task was successful.</li>
             * <li>InProgress: The task was in progress.</li>
             * <li>Failed: The task failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Succeeded</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The message that is returned for the status of the task.</p>
             * <blockquote>
             * <p>This parameter is returned only when Failed is returned for the Status parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Resource CREATE failed: terraform stack sc-146611588617****-pp-bp1ddg1n2a**** failure...</p>
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>task-bp1dmg242c****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The custom tags.</p>
             */
            public Builder taskTags(java.util.List<TaskTags> taskTags) {
                this.taskTags = taskTags;
                return this;
            }

            /**
             * <p>The type of the task. Valid values:</p>
             * <ul>
             * <li>LaunchProduct: a task that launches the product.</li>
             * <li>UpdateProvisionedProduct: a task that updates the information about the product instance.</li>
             * <li>TerminateProvisionedProduct: a task that terminates the product instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>LaunchProduct</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The time when the task was last modified.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-23T09:47:29Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public TaskDetail build() {
                return new TaskDetail(this);
            } 

        } 

    }
}
