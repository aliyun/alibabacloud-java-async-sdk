// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartExecutionResponseBody} extends {@link TeaModel}
 *
 * <p>StartExecutionResponseBody</p>
 */
public class StartExecutionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Execution")
    private Execution execution;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private StartExecutionResponseBody(Builder builder) {
        this.execution = builder.execution;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartExecutionResponseBody create() {
        return builder().build();
    }

    /**
     * @return execution
     */
    public Execution getExecution() {
        return this.execution;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Execution execution; 
        private String requestId; 

        /**
         * <p>The details of the execution.</p>
         */
        public Builder execution(Execution execution) {
            this.execution = execution;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>14A07460-EBE7-47CA-9757-12CC4761D47A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartExecutionResponseBody build() {
            return new StartExecutionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link StartExecutionResponseBody} extends {@link TeaModel}
     *
     * <p>StartExecutionResponseBody</p>
     */
    public static class CurrentTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskAction")
        private String taskAction;

        @com.aliyun.core.annotation.NameInMap("TaskExecutionId")
        private String taskExecutionId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        private CurrentTasks(Builder builder) {
            this.taskAction = builder.taskAction;
            this.taskExecutionId = builder.taskExecutionId;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CurrentTasks create() {
            return builder().build();
        }

        /**
         * @return taskAction
         */
        public String getTaskAction() {
            return this.taskAction;
        }

        /**
         * @return taskExecutionId
         */
        public String getTaskExecutionId() {
            return this.taskExecutionId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private String taskAction; 
            private String taskExecutionId; 
            private String taskName; 

            /**
             * <p>The action of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::TimerTrigger</p>
             */
            public Builder taskAction(String taskAction) {
                this.taskAction = taskAction;
                return this;
            }

            /**
             * <p>The execution ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>exec-dsadasdawq</p>
             */
            public Builder taskExecutionId(String taskExecutionId) {
                this.taskExecutionId = taskExecutionId;
                return this;
            }

            /**
             * <p>The name of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>testTask</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public CurrentTasks build() {
                return new CurrentTasks(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartExecutionResponseBody} extends {@link TeaModel}
     *
     * <p>StartExecutionResponseBody</p>
     */
    public static class Execution extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Counters")
        private java.util.Map < String, ? > counters;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("CurrentTasks")
        private java.util.List < CurrentTasks> currentTasks;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("ExecutedBy")
        private String executedBy;

        @com.aliyun.core.annotation.NameInMap("ExecutionId")
        private String executionId;

        @com.aliyun.core.annotation.NameInMap("IsParent")
        private Boolean isParent;

        @com.aliyun.core.annotation.NameInMap("LoopMode")
        private String loopMode;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Outputs")
        private String outputs;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private String parameters;

        @com.aliyun.core.annotation.NameInMap("ParentExecutionId")
        private String parentExecutionId;

        @com.aliyun.core.annotation.NameInMap("RamRole")
        private String ramRole;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SafetyCheck")
        private String safetyCheck;

        @com.aliyun.core.annotation.NameInMap("StartDate")
        private String startDate;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusMessage")
        private String statusMessage;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.Map < String, ? > tags;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateVersion")
        private String templateVersion;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private String updateDate;

        private Execution(Builder builder) {
            this.counters = builder.counters;
            this.createDate = builder.createDate;
            this.currentTasks = builder.currentTasks;
            this.description = builder.description;
            this.endDate = builder.endDate;
            this.executedBy = builder.executedBy;
            this.executionId = builder.executionId;
            this.isParent = builder.isParent;
            this.loopMode = builder.loopMode;
            this.mode = builder.mode;
            this.outputs = builder.outputs;
            this.parameters = builder.parameters;
            this.parentExecutionId = builder.parentExecutionId;
            this.ramRole = builder.ramRole;
            this.resourceGroupId = builder.resourceGroupId;
            this.safetyCheck = builder.safetyCheck;
            this.startDate = builder.startDate;
            this.status = builder.status;
            this.statusMessage = builder.statusMessage;
            this.tags = builder.tags;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateVersion = builder.templateVersion;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Execution create() {
            return builder().build();
        }

        /**
         * @return counters
         */
        public java.util.Map < String, ? > getCounters() {
            return this.counters;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return currentTasks
         */
        public java.util.List < CurrentTasks> getCurrentTasks() {
            return this.currentTasks;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return executedBy
         */
        public String getExecutedBy() {
            return this.executedBy;
        }

        /**
         * @return executionId
         */
        public String getExecutionId() {
            return this.executionId;
        }

        /**
         * @return isParent
         */
        public Boolean getIsParent() {
            return this.isParent;
        }

        /**
         * @return loopMode
         */
        public String getLoopMode() {
            return this.loopMode;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return outputs
         */
        public String getOutputs() {
            return this.outputs;
        }

        /**
         * @return parameters
         */
        public String getParameters() {
            return this.parameters;
        }

        /**
         * @return parentExecutionId
         */
        public String getParentExecutionId() {
            return this.parentExecutionId;
        }

        /**
         * @return ramRole
         */
        public String getRamRole() {
            return this.ramRole;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return safetyCheck
         */
        public String getSafetyCheck() {
            return this.safetyCheck;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
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
         * @return tags
         */
        public java.util.Map < String, ? > getTags() {
            return this.tags;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return templateVersion
         */
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private java.util.Map < String, ? > counters; 
            private String createDate; 
            private java.util.List < CurrentTasks> currentTasks; 
            private String description; 
            private String endDate; 
            private String executedBy; 
            private String executionId; 
            private Boolean isParent; 
            private String loopMode; 
            private String mode; 
            private String outputs; 
            private String parameters; 
            private String parentExecutionId; 
            private String ramRole; 
            private String resourceGroupId; 
            private String safetyCheck; 
            private String startDate; 
            private String status; 
            private String statusMessage; 
            private java.util.Map < String, ? > tags; 
            private String templateId; 
            private String templateName; 
            private String templateVersion; 
            private String updateDate; 

            /**
             * <p>The number of executions.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder counters(java.util.Map < String, ? > counters) {
                this.counters = counters;
                return this;
            }

            /**
             * <p>The time when the execution was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-05-16T10:26:14Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The information about in-progress tasks.</p>
             */
            public Builder currentTasks(java.util.List < CurrentTasks> currentTasks) {
                this.currentTasks = currentTasks;
                return this;
            }

            /**
             * <p>The description of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>test execution.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the execution stopped.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-05-16T10:26:14Z</p>
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>The account ID of the user who started the execution of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>root(13092080xx12344)</p>
             */
            public Builder executedBy(String executedBy) {
                this.executedBy = executedBy;
                return this;
            }

            /**
             * <p>The GUID of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>exec-xxxyyy</p>
             */
            public Builder executionId(String executionId) {
                this.executionId = executionId;
                return this;
            }

            /**
             * <p>Indicates whether the execution is a parent execution.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isParent(Boolean isParent) {
                this.isParent = isParent;
                return this;
            }

            /**
             * <p>The loop mode.</p>
             * 
             * <strong>example:</strong>
             * <p>Automatic</p>
             */
            public Builder loopMode(String loopMode) {
                this.loopMode = loopMode;
                return this;
            }

            /**
             * <p>The execution mode.</p>
             * 
             * <strong>example:</strong>
             * <p>Automatic</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The output of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;InstanceId&quot;:&quot;i-xxx&quot; }</p>
             */
            public Builder outputs(String outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * <p>The input parameters of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;Status&quot;:&quot;Running&quot; }</p>
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The ID of the parent execution.</p>
             * 
             * <strong>example:</strong>
             * <p>exec-xxxx</p>
             */
            public Builder parentExecutionId(String parentExecutionId) {
                this.parentExecutionId = parentExecutionId;
                return this;
            }

            /**
             * <p>The role that started the execution of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>OOSServiceRole</p>
             */
            public Builder ramRole(String ramRole) {
                this.ramRole = ramRole;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxsn4m4******</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The security check mode.</p>
             * 
             * <strong>example:</strong>
             * <p>Skip</p>
             */
            public Builder safetyCheck(String safetyCheck) {
                this.safetyCheck = safetyCheck;
                return this;
            }

            /**
             * <p>The time when the execution was started.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-05-16T10:26:14Z</p>
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * <p>The status of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The status information of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * <p>The tags of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;k1&quot;:&quot;v2&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
             */
            public Builder tags(java.util.Map < String, ? > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>t-1bd341007f</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The name of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>MyTemplate</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The version number of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * <p>The time when the execution was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-05-16T10:26:14Z</p>
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public Execution build() {
                return new Execution(this);
            } 

        } 

    }
}
