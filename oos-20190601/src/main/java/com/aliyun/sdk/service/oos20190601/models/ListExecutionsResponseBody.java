// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExecutionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListExecutionsResponseBody</p>
 */
public class ListExecutionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Executions")
    private java.util.List < Executions> executions;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListExecutionsResponseBody(Builder builder) {
        this.executions = builder.executions;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExecutionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return executions
     */
    public java.util.List < Executions> getExecutions() {
        return this.executions;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Executions> executions; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        /**
         * The details of the task executions.
         */
        public Builder executions(java.util.List < Executions> executions) {
            this.executions = executions;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used to retrieve the next page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListExecutionsResponseBody build() {
            return new ListExecutionsResponseBody(this);
        } 

    } 

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
             * The execution template of the task.
             */
            public Builder taskAction(String taskAction) {
                this.taskAction = taskAction;
                return this;
            }

            /**
             * The ID of the task execution.
             */
            public Builder taskExecutionId(String taskExecutionId) {
                this.taskExecutionId = taskExecutionId;
                return this;
            }

            /**
             * The name of the task.
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
    public static class Executions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

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

        @com.aliyun.core.annotation.NameInMap("LastSuccessfulTriggerTime")
        private String lastSuccessfulTriggerTime;

        @com.aliyun.core.annotation.NameInMap("LastTriggerOutputs")
        private String lastTriggerOutputs;

        @com.aliyun.core.annotation.NameInMap("LastTriggerStatus")
        private String lastTriggerStatus;

        @com.aliyun.core.annotation.NameInMap("LastTriggerStatusMessage")
        private String lastTriggerStatusMessage;

        @com.aliyun.core.annotation.NameInMap("LastTriggerTime")
        private String lastTriggerTime;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Outputs")
        private String outputs;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.Map < String, ? > parameters;

        @com.aliyun.core.annotation.NameInMap("ParentExecutionId")
        private String parentExecutionId;

        @com.aliyun.core.annotation.NameInMap("RamRole")
        private String ramRole;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceStatus")
        private String resourceStatus;

        @com.aliyun.core.annotation.NameInMap("SafetyCheck")
        private String safetyCheck;

        @com.aliyun.core.annotation.NameInMap("StartDate")
        private String startDate;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusMessage")
        private String statusMessage;

        @com.aliyun.core.annotation.NameInMap("StatusReason")
        private String statusReason;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.Map < String, ? > tags;

        @com.aliyun.core.annotation.NameInMap("Targets")
        private String targets;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateVersion")
        private String templateVersion;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private String updateDate;

        @com.aliyun.core.annotation.NameInMap("WaitingStatus")
        private String waitingStatus;

        private Executions(Builder builder) {
            this.category = builder.category;
            this.counters = builder.counters;
            this.createDate = builder.createDate;
            this.currentTasks = builder.currentTasks;
            this.description = builder.description;
            this.endDate = builder.endDate;
            this.executedBy = builder.executedBy;
            this.executionId = builder.executionId;
            this.isParent = builder.isParent;
            this.lastSuccessfulTriggerTime = builder.lastSuccessfulTriggerTime;
            this.lastTriggerOutputs = builder.lastTriggerOutputs;
            this.lastTriggerStatus = builder.lastTriggerStatus;
            this.lastTriggerStatusMessage = builder.lastTriggerStatusMessage;
            this.lastTriggerTime = builder.lastTriggerTime;
            this.mode = builder.mode;
            this.outputs = builder.outputs;
            this.parameters = builder.parameters;
            this.parentExecutionId = builder.parentExecutionId;
            this.ramRole = builder.ramRole;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceStatus = builder.resourceStatus;
            this.safetyCheck = builder.safetyCheck;
            this.startDate = builder.startDate;
            this.status = builder.status;
            this.statusMessage = builder.statusMessage;
            this.statusReason = builder.statusReason;
            this.tags = builder.tags;
            this.targets = builder.targets;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateVersion = builder.templateVersion;
            this.updateDate = builder.updateDate;
            this.waitingStatus = builder.waitingStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Executions create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
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
         * @return lastSuccessfulTriggerTime
         */
        public String getLastSuccessfulTriggerTime() {
            return this.lastSuccessfulTriggerTime;
        }

        /**
         * @return lastTriggerOutputs
         */
        public String getLastTriggerOutputs() {
            return this.lastTriggerOutputs;
        }

        /**
         * @return lastTriggerStatus
         */
        public String getLastTriggerStatus() {
            return this.lastTriggerStatus;
        }

        /**
         * @return lastTriggerStatusMessage
         */
        public String getLastTriggerStatusMessage() {
            return this.lastTriggerStatusMessage;
        }

        /**
         * @return lastTriggerTime
         */
        public String getLastTriggerTime() {
            return this.lastTriggerTime;
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
        public java.util.Map < String, ? > getParameters() {
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
         * @return resourceStatus
         */
        public String getResourceStatus() {
            return this.resourceStatus;
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
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        /**
         * @return tags
         */
        public java.util.Map < String, ? > getTags() {
            return this.tags;
        }

        /**
         * @return targets
         */
        public String getTargets() {
            return this.targets;
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

        /**
         * @return waitingStatus
         */
        public String getWaitingStatus() {
            return this.waitingStatus;
        }

        public static final class Builder {
            private String category; 
            private java.util.Map < String, ? > counters; 
            private String createDate; 
            private java.util.List < CurrentTasks> currentTasks; 
            private String description; 
            private String endDate; 
            private String executedBy; 
            private String executionId; 
            private Boolean isParent; 
            private String lastSuccessfulTriggerTime; 
            private String lastTriggerOutputs; 
            private String lastTriggerStatus; 
            private String lastTriggerStatusMessage; 
            private String lastTriggerTime; 
            private String mode; 
            private String outputs; 
            private java.util.Map < String, ? > parameters; 
            private String parentExecutionId; 
            private String ramRole; 
            private String resourceGroupId; 
            private String resourceStatus; 
            private String safetyCheck; 
            private String startDate; 
            private String status; 
            private String statusMessage; 
            private String statusReason; 
            private java.util.Map < String, ? > tags; 
            private String targets; 
            private String templateId; 
            private String templateName; 
            private String templateVersion; 
            private String updateDate; 
            private String waitingStatus; 

            /**
             * The type of the execution template. Valid values: Other, TimerTrigger, EventTrigger, and AlarmTrigger.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The number of tasks that are counted by execution status.
             */
            public Builder counters(java.util.Map < String, ? > counters) {
                this.counters = counters;
                return this;
            }

            /**
             * The time when the execution was created.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The information about the tasks that are running.
             */
            public Builder currentTasks(java.util.List < CurrentTasks> currentTasks) {
                this.currentTasks = currentTasks;
                return this;
            }

            /**
             * The description of the execution.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the execution stops running.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * The account ID of the user who started the execution of the template.
             */
            public Builder executedBy(String executedBy) {
                this.executedBy = executedBy;
                return this;
            }

            /**
             * The unique ID of the execution.
             */
            public Builder executionId(String executionId) {
                this.executionId = executionId;
                return this;
            }

            /**
             * Indicates whether the execution contains child executions.
             */
            public Builder isParent(Boolean isParent) {
                this.isParent = isParent;
                return this;
            }

            /**
             * The time when the template was last successfully triggered.
             */
            public Builder lastSuccessfulTriggerTime(String lastSuccessfulTriggerTime) {
                this.lastSuccessfulTriggerTime = lastSuccessfulTriggerTime;
                return this;
            }

            /**
             * The outputs of last trigger.
             */
            public Builder lastTriggerOutputs(String lastTriggerOutputs) {
                this.lastTriggerOutputs = lastTriggerOutputs;
                return this;
            }

            /**
             * The status of the execution after the template was last triggered.
             */
            public Builder lastTriggerStatus(String lastTriggerStatus) {
                this.lastTriggerStatus = lastTriggerStatus;
                return this;
            }

            /**
             * The status message of last trigger.
             */
            public Builder lastTriggerStatusMessage(String lastTriggerStatusMessage) {
                this.lastTriggerStatusMessage = lastTriggerStatusMessage;
                return this;
            }

            /**
             * The time when the template was last successfully triggered.
             */
            public Builder lastTriggerTime(String lastTriggerTime) {
                this.lastTriggerTime = lastTriggerTime;
                return this;
            }

            /**
             * The execution mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * The output of the execution.
             */
            public Builder outputs(String outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * The input parameters of the execution.
             */
            public Builder parameters(java.util.Map < String, ? > parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * The ID of the parent execution.
             */
            public Builder parentExecutionId(String parentExecutionId) {
                this.parentExecutionId = parentExecutionId;
                return this;
            }

            /**
             * The role that started the execution of the template.
             */
            public Builder ramRole(String ramRole) {
                this.ramRole = ramRole;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The status of the resource.
             */
            public Builder resourceStatus(String resourceStatus) {
                this.resourceStatus = resourceStatus;
                return this;
            }

            /**
             * The security check mode. Valid values: Skip, and ConfirmEveryHighRiskAction.
             */
            public Builder safetyCheck(String safetyCheck) {
                this.safetyCheck = safetyCheck;
                return this;
            }

            /**
             * The time when the execution was started.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * The status of the execution. Valid values: Started, Queued, Running, Waiting, Success, Failed, and Cancelled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The status of the task execution.
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * The reason for which the status occurs.
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * The tags of the execution.
             */
            public Builder tags(java.util.Map < String, ? > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The target resource.
             */
            public Builder targets(String targets) {
                this.targets = targets;
                return this;
            }

            /**
             * The ID of the template.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * The name of the template.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * The version number of the template.
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * The time when the execution was updated.
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            /**
             * The Waiting state.
             */
            public Builder waitingStatus(String waitingStatus) {
                this.waitingStatus = waitingStatus;
                return this;
            }

            public Executions build() {
                return new Executions(this);
            } 

        } 

    }
}
