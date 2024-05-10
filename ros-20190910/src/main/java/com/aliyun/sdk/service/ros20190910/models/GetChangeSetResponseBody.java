// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChangeSetResponseBody} extends {@link TeaModel}
 *
 * <p>GetChangeSetResponseBody</p>
 */
public class GetChangeSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChangeSetId")
    private String changeSetId;

    @com.aliyun.core.annotation.NameInMap("ChangeSetName")
    private String changeSetName;

    @com.aliyun.core.annotation.NameInMap("ChangeSetType")
    private String changeSetType;

    @com.aliyun.core.annotation.NameInMap("Changes")
    private java.util.List < java.util.Map<String, ?>> changes;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DisableRollback")
    private Boolean disableRollback;

    @com.aliyun.core.annotation.NameInMap("ExecutionStatus")
    private String executionStatus;

    @com.aliyun.core.annotation.NameInMap("Log")
    private Log log;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List < Parameters> parameters;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StackId")
    private String stackId;

    @com.aliyun.core.annotation.NameInMap("StackName")
    private String stackName;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StatusReason")
    private String statusReason;

    @com.aliyun.core.annotation.NameInMap("TemplateBody")
    private String templateBody;

    @com.aliyun.core.annotation.NameInMap("TimeoutInMinutes")
    private Integer timeoutInMinutes;

    private GetChangeSetResponseBody(Builder builder) {
        this.changeSetId = builder.changeSetId;
        this.changeSetName = builder.changeSetName;
        this.changeSetType = builder.changeSetType;
        this.changes = builder.changes;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.disableRollback = builder.disableRollback;
        this.executionStatus = builder.executionStatus;
        this.log = builder.log;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.stackId = builder.stackId;
        this.stackName = builder.stackName;
        this.status = builder.status;
        this.statusReason = builder.statusReason;
        this.templateBody = builder.templateBody;
        this.timeoutInMinutes = builder.timeoutInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChangeSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return changeSetId
     */
    public String getChangeSetId() {
        return this.changeSetId;
    }

    /**
     * @return changeSetName
     */
    public String getChangeSetName() {
        return this.changeSetName;
    }

    /**
     * @return changeSetType
     */
    public String getChangeSetType() {
        return this.changeSetType;
    }

    /**
     * @return changes
     */
    public java.util.List < java.util.Map<String, ?>> getChanges() {
        return this.changes;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return disableRollback
     */
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    /**
     * @return executionStatus
     */
    public String getExecutionStatus() {
        return this.executionStatus;
    }

    /**
     * @return log
     */
    public Log getLog() {
        return this.log;
    }

    /**
     * @return parameters
     */
    public java.util.List < Parameters> getParameters() {
        return this.parameters;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    /**
     * @return stackName
     */
    public String getStackName() {
        return this.stackName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusReason
     */
    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * @return templateBody
     */
    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * @return timeoutInMinutes
     */
    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public static final class Builder {
        private String changeSetId; 
        private String changeSetName; 
        private String changeSetType; 
        private java.util.List < java.util.Map<String, ?>> changes; 
        private String createTime; 
        private String description; 
        private Boolean disableRollback; 
        private String executionStatus; 
        private Log log; 
        private java.util.List < Parameters> parameters; 
        private String regionId; 
        private String requestId; 
        private String stackId; 
        private String stackName; 
        private String status; 
        private String statusReason; 
        private String templateBody; 
        private Integer timeoutInMinutes; 

        /**
         * The ID of the change set.
         */
        public Builder changeSetId(String changeSetId) {
            this.changeSetId = changeSetId;
            return this;
        }

        /**
         * The name of the change set.
         */
        public Builder changeSetName(String changeSetName) {
            this.changeSetName = changeSetName;
            return this;
        }

        /**
         * The type of the change set.
         */
        public Builder changeSetType(String changeSetType) {
            this.changeSetType = changeSetType;
            return this;
        }

        /**
         * The changes of the change set.
         */
        public Builder changes(java.util.List < java.util.Map<String, ?>> changes) {
            this.changes = changes;
            return this;
        }

        /**
         * The time when the change set was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The description of the change set.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Indicates whether rollback was performed when the stack failed to be created or updated.
         */
        public Builder disableRollback(Boolean disableRollback) {
            this.disableRollback = disableRollback;
            return this;
        }

        /**
         * The execution status of the change set.
         */
        public Builder executionStatus(String executionStatus) {
            this.executionStatus = executionStatus;
            return this;
        }

        /**
         * The output logs of the change set.
         */
        public Builder log(Log log) {
            this.log = log;
            return this;
        }

        /**
         * The parameters of the stack.
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * The region ID of the change set.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the stack with which the change set is associated.
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            return this;
        }

        /**
         * The name of the stack with which the change set is associated.
         */
        public Builder stackName(String stackName) {
            this.stackName = stackName;
            return this;
        }

        /**
         * The status of the change set.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The reason why the change set is in its current state.
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * The template body of the change set.
         * <p>
         * 
         * > This parameter takes effect only if you set ShowTemplate to true.
         */
        public Builder templateBody(String templateBody) {
            this.templateBody = templateBody;
            return this;
        }

        /**
         * The timeout period that is specified for the stack creation or update operation.
         */
        public Builder timeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }

        public GetChangeSetResponseBody build() {
            return new GetChangeSetResponseBody(this);
        } 

    } 

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

            /**
             * The name of the Terraform command that is run. Valid values:
             * <p>
             * 
             * *   apply
             * *   plan
             * *   destroy
             * *   version
             * 
             * For more information about Terraform commands, see [Command](https://www.terraform.io/cli/commands).
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
             * *   stdout: standard output stream
             * *   stderr: standard error stream
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
        @com.aliyun.core.annotation.NameInMap("TerraformLogs")
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
             * The Terraform logs. This parameter is returned only for change sets of Terraform stacks.
             * <p>
             * 
             * > This parameter is not returned for change sets that are in the Creating state. This parameter indicates the logs of the change set creation operation for Terraform stacks.
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

            /**
             * The key of the parameter.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * The value of the parameter.
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
}
