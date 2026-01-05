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
 * {@link ListTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListTasksResponseBody</p>
 */
public class ListTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskDetails")
    private java.util.List<TaskDetails> taskDetails;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListTasksResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.taskDetails = builder.taskDetails;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskDetails
     */
    public java.util.List<TaskDetails> getTaskDetails() {
        return this.taskDetails;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<TaskDetails> taskDetails; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListTasksResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.taskDetails = model.taskDetails;
            this.totalCount = model.totalCount;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskDetails.
         */
        public Builder taskDetails(java.util.List<TaskDetails> taskDetails) {
            this.taskDetails = taskDetails;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTasksResponseBody build() {
            return new ListTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListTasksResponseBody</p>
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
             * Command.
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Stream.
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
     * {@link ListTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListTasksResponseBody</p>
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
             * TerraformLogs.
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
     * {@link ListTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListTasksResponseBody</p>
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * OutputKey.
             */
            public Builder outputKey(String outputKey) {
                this.outputKey = outputKey;
                return this;
            }

            /**
             * OutputValue.
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
     * {@link ListTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListTasksResponseBody</p>
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
             * ParameterKey.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * ParameterValue.
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
     * {@link ListTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListTasksResponseBody</p>
     */
    public static class TaskDetails extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private TaskDetails(Builder builder) {
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
            this.taskType = builder.taskType;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskDetails create() {
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
            private String taskType; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(TaskDetails model) {
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
                this.taskType = model.taskType;
                this.updateTime = model.updateTime;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Log.
             */
            public Builder log(Log log) {
                this.log = log;
                return this;
            }

            /**
             * Outputs.
             */
            public Builder outputs(java.util.List<Outputs> outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(java.util.List<Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * PortfolioId.
             */
            public Builder portfolioId(String portfolioId) {
                this.portfolioId = portfolioId;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * ProductVersionId.
             */
            public Builder productVersionId(String productVersionId) {
                this.productVersionId = productVersionId;
                return this;
            }

            /**
             * ProductVersionName.
             */
            public Builder productVersionName(String productVersionName) {
                this.productVersionName = productVersionName;
                return this;
            }

            /**
             * ProvisionedProductId.
             */
            public Builder provisionedProductId(String provisionedProductId) {
                this.provisionedProductId = provisionedProductId;
                return this;
            }

            /**
             * ProvisionedProductName.
             */
            public Builder provisionedProductName(String provisionedProductName) {
                this.provisionedProductName = provisionedProductName;
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
             * StatusMessage.
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * <p>代表资源名称的资源属性字段</p>
             * 
             * <strong>example:</strong>
             * <p>task-bp1dmg242c****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public TaskDetails build() {
                return new TaskDetails(this);
            } 

        } 

    }
}
