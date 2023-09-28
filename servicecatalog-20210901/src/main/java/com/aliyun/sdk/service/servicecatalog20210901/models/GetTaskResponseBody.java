// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskResponseBody</p>
 */
public class GetTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskDetail")
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

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the task.
         */
        public Builder taskDetail(TaskDetail taskDetail) {
            this.taskDetail = taskDetail;
            return this;
        }

        public GetTaskResponseBody build() {
            return new GetTaskResponseBody(this);
        } 

    } 

    public static class TerraformLogs extends TeaModel {
        @NameInMap("Command")
        private String command;

        @NameInMap("Content")
        private String content;

        @NameInMap("Stream")
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

            /**
             * The name of the Terraform command that is run. Valid values:
             * <p>
             * 
             * *   apply
             * *   plan
             * *   destroy
             * *   version
             * 
             * For more information about Terraform commands, see [Basic CLI Features](https://www.terraform.io/cli/commands).
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * The content of the output stream that is returned after the command is run.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The output stream. Valid values:
             * <p>
             * 
             * *   stdout: a standard output stream
             * *   stderr: a standard error stream
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
    public static class Log extends TeaModel {
        @NameInMap("TerraformLogs")
        private java.util.List < TerraformLogs> terraformLogs;

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
        public java.util.List < TerraformLogs> getTerraformLogs() {
            return this.terraformLogs;
        }

        public static final class Builder {
            private java.util.List < TerraformLogs> terraformLogs; 

            /**
             * The Terraform logs.
             */
            public Builder terraformLogs(java.util.List < TerraformLogs> terraformLogs) {
                this.terraformLogs = terraformLogs;
                return this;
            }

            public Log build() {
                return new Log(this);
            } 

        } 

    }
    public static class Outputs extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("OutputKey")
        private String outputKey;

        @NameInMap("OutputValue")
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

            /**
             * The description of the output parameter for the template.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the output parameter for the template.
             */
            public Builder outputKey(String outputKey) {
                this.outputKey = outputKey;
                return this;
            }

            /**
             * The value of the output parameter for the template.
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
    public static class Parameters extends TeaModel {
        @NameInMap("ParameterKey")
        private String parameterKey;

        @NameInMap("ParameterValue")
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

            /**
             * The name of the input parameter for the template.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * The value of the input parameter for the template.
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
    public static class TaskTags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    public static class TaskDetail extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Log")
        private Log log;

        @NameInMap("Outputs")
        private java.util.List < Outputs> outputs;

        @NameInMap("Parameters")
        private java.util.List < Parameters> parameters;

        @NameInMap("PortfolioId")
        private String portfolioId;

        @NameInMap("ProductId")
        private String productId;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("ProductVersionId")
        private String productVersionId;

        @NameInMap("ProductVersionName")
        private String productVersionName;

        @NameInMap("ProvisionedProductId")
        private String provisionedProductId;

        @NameInMap("ProvisionedProductName")
        private String provisionedProductName;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusMessage")
        private String statusMessage;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskTags")
        private java.util.List < TaskTags> taskTags;

        @NameInMap("TaskType")
        private String taskType;

        @NameInMap("UpdateTime")
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
        public java.util.List < Outputs> getOutputs() {
            return this.outputs;
        }

        /**
         * @return parameters
         */
        public java.util.List < Parameters> getParameters() {
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
        public java.util.List < TaskTags> getTaskTags() {
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
            private java.util.List < Outputs> outputs; 
            private java.util.List < Parameters> parameters; 
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
            private java.util.List < TaskTags> taskTags; 
            private String taskType; 
            private String updateTime; 

            /**
             * The time when the task was created.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The logs of the product instance.
             */
            public Builder log(Log log) {
                this.log = log;
                return this;
            }

            /**
             * The output parameters of the template.
             */
            public Builder outputs(java.util.List < Outputs> outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * The input parameters of the template.
             */
            public Builder parameters(java.util.List < Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * The ID of the product portfolio.
             */
            public Builder portfolioId(String portfolioId) {
                this.portfolioId = portfolioId;
                return this;
            }

            /**
             * The ID of the product.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * The name of the product.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * The ID of the product version.
             */
            public Builder productVersionId(String productVersionId) {
                this.productVersionId = productVersionId;
                return this;
            }

            /**
             * The name of the product version.
             */
            public Builder productVersionName(String productVersionName) {
                this.productVersionName = productVersionName;
                return this;
            }

            /**
             * The ID of the product instance.
             */
            public Builder provisionedProductId(String provisionedProductId) {
                this.provisionedProductId = provisionedProductId;
                return this;
            }

            /**
             * The name of the product instance.
             */
            public Builder provisionedProductName(String provisionedProductName) {
                this.provisionedProductName = provisionedProductName;
                return this;
            }

            /**
             * The state of the task. Valid values:
             * <p>
             * 
             * *   Succeeded: The task was successful.
             * *   InProgress: The task was in progress.
             * *   Failed: The task failed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The message that is returned for the status of the task.
             * <p>
             * 
             * > This parameter is returned only when Failed is returned for the Status parameter.
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * The ID of the task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskTags.
             */
            public Builder taskTags(java.util.List < TaskTags> taskTags) {
                this.taskTags = taskTags;
                return this;
            }

            /**
             * The type of the task. Valid values:
             * <p>
             * 
             * *   LaunchProduct: a task that launches the product.
             * *   UpdateProvisionedProduct: a task that updates the information about the product instance.
             * *   TerminateProvisionedProduct: a task that terminates the product instance.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * The time when the task was last modified.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
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
