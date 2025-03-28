// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
    private java.util.List<java.util.Map<String, ?>> changes;

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
    private java.util.List<Parameters> parameters;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("StackId")
    private String stackId;

    @com.aliyun.core.annotation.NameInMap("StackName")
    private String stackName;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StatusReason")
    private String statusReason;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

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
        this.resourceGroupId = builder.resourceGroupId;
        this.stackId = builder.stackId;
        this.stackName = builder.stackName;
        this.status = builder.status;
        this.statusReason = builder.statusReason;
        this.tags = builder.tags;
        this.templateBody = builder.templateBody;
        this.timeoutInMinutes = builder.timeoutInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChangeSetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<java.util.Map<String, ?>> getChanges() {
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
    public java.util.List<Parameters> getParameters() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
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
        private java.util.List<java.util.Map<String, ?>> changes; 
        private String createTime; 
        private String description; 
        private Boolean disableRollback; 
        private String executionStatus; 
        private Log log; 
        private java.util.List<Parameters> parameters; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private String stackId; 
        private String stackName; 
        private String status; 
        private String statusReason; 
        private java.util.List<Tags> tags; 
        private String templateBody; 
        private Integer timeoutInMinutes; 

        private Builder() {
        } 

        private Builder(GetChangeSetResponseBody model) {
            this.changeSetId = model.changeSetId;
            this.changeSetName = model.changeSetName;
            this.changeSetType = model.changeSetType;
            this.changes = model.changes;
            this.createTime = model.createTime;
            this.description = model.description;
            this.disableRollback = model.disableRollback;
            this.executionStatus = model.executionStatus;
            this.log = model.log;
            this.parameters = model.parameters;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.stackId = model.stackId;
            this.stackName = model.stackName;
            this.status = model.status;
            this.statusReason = model.statusReason;
            this.tags = model.tags;
            this.templateBody = model.templateBody;
            this.timeoutInMinutes = model.timeoutInMinutes;
        } 

        /**
         * <p>The ID of the change set.</p>
         * 
         * <strong>example:</strong>
         * <p>4c11658d-bd47-4dd0-ba64-727edc62****</p>
         */
        public Builder changeSetId(String changeSetId) {
            this.changeSetId = changeSetId;
            return this;
        }

        /**
         * <p>The name of the change set.</p>
         * 
         * <strong>example:</strong>
         * <p>ChangeSet_template</p>
         */
        public Builder changeSetName(String changeSetName) {
            this.changeSetName = changeSetName;
            return this;
        }

        /**
         * <p>The type of the change set.</p>
         * 
         * <strong>example:</strong>
         * <p>UPDATE</p>
         */
        public Builder changeSetType(String changeSetType) {
            this.changeSetType = changeSetType;
            return this;
        }

        /**
         * <p>The changes of the change set.</p>
         */
        public Builder changes(java.util.List<java.util.Map<String, ?>> changes) {
            this.changes = changes;
            return this;
        }

        /**
         * <p>The time when the change set was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-01T02:20:56</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the change set.</p>
         * 
         * <strong>example:</strong>
         * <p>It is a demo.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether rollback was performed when the stack failed to be created or updated.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableRollback(Boolean disableRollback) {
            this.disableRollback = disableRollback;
            return this;
        }

        /**
         * <p>The execution status of the change set.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        public Builder executionStatus(String executionStatus) {
            this.executionStatus = executionStatus;
            return this;
        }

        /**
         * <p>The output logs of the change set.</p>
         */
        public Builder log(Log log) {
            this.log = log;
            return this;
        }

        /**
         * <p>The parameters of the stack.</p>
         */
        public Builder parameters(java.util.List<Parameters> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The region ID of the change set.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3766EE04-76DD-50F9-9C23-3AF136CD5708</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the stack with which the change set is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>a486fc19-ebb7-4ce9-a70b-554a7c3d****</p>
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            return this;
        }

        /**
         * <p>The name of the stack with which the change set is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>stack_2021-10-13</p>
         */
        public Builder stackName(String stackName) {
            this.stackName = stackName;
            return this;
        }

        /**
         * <p>The status of the change set.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE_COMPLETE</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The reason why the change set is in its current state.</p>
         * 
         * <strong>example:</strong>
         * <p>too many changes.</p>
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The template body of the change set.</p>
         * <blockquote>
         * <p>This parameter takes effect only if you set ShowTemplate to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;}</p>
         */
        public Builder templateBody(String templateBody) {
            this.templateBody = templateBody;
            return this;
        }

        /**
         * <p>The timeout period that is specified for the stack creation or update operation.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder timeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }

        public GetChangeSetResponseBody build() {
            return new GetChangeSetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetChangeSetResponseBody} extends {@link TeaModel}
     *
     * <p>GetChangeSetResponseBody</p>
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
             * <p>For more information about Terraform commands, see <a href="https://www.terraform.io/cli/commands">Command</a>.</p>
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
             * <li>stdout: standard output stream</li>
             * <li>stderr: standard error stream</li>
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
     * {@link GetChangeSetResponseBody} extends {@link TeaModel}
     *
     * <p>GetChangeSetResponseBody</p>
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
             * <p>The Terraform logs. This parameter is returned only for change sets of Terraform stacks.</p>
             * <blockquote>
             * <p>This parameter is not returned for change sets that are in the Creating state. This parameter indicates the logs of the change set creation operation for Terraform stacks.</p>
             * </blockquote>
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
     * {@link GetChangeSetResponseBody} extends {@link TeaModel}
     *
     * <p>GetChangeSetResponseBody</p>
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
             * <p>The key of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::Region</p>
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
     * {@link GetChangeSetResponseBody} extends {@link TeaModel}
     *
     * <p>GetChangeSetResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

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

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
