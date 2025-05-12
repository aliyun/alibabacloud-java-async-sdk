// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link ListExecutionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListExecutionsResponseBody</p>
 */
public class ListExecutionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Executions")
    private java.util.List<Executions> executions;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListExecutionsResponseBody(Builder builder) {
        this.executions = builder.executions;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExecutionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executions
     */
    public java.util.List<Executions> getExecutions() {
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Executions> executions; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListExecutionsResponseBody model) {
            this.executions = model.executions;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The details of the task executions.</p>
         */
        public Builder executions(java.util.List<Executions> executions) {
            this.executions = executions;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>MTRBMDc0NjAtRUJFNy00N0NBLTk3NTctMTJDQzQ</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>14A074-47CA-9757-12CC4761D47A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of the executions.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListExecutionsResponseBody build() {
            return new ListExecutionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExecutionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExecutionsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(CurrentTasks model) {
                this.taskAction = model.taskAction;
                this.taskExecutionId = model.taskExecutionId;
                this.taskName = model.taskName;
            } 

            /**
             * <p>The execution template of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>acs::Template</p>
             */
            public Builder taskAction(String taskAction) {
                this.taskAction = taskAction;
                return this;
            }

            /**
             * <p>The ID of the task execution.</p>
             * 
             * <strong>example:</strong>
             * <p>task-exec-44d32b45d2a49899#1</p>
             */
            public Builder taskExecutionId(String taskExecutionId) {
                this.taskExecutionId = taskExecutionId;
                return this;
            }

            /**
             * <p>The name of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>installSLSILogtail</p>
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
     * {@link ListExecutionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExecutionsResponseBody</p>
     */
    public static class Executions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Counters")
        private java.util.Map<String, ?> counters;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("CurrentTasks")
        private java.util.List<CurrentTasks> currentTasks;

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

        @com.aliyun.core.annotation.NameInMap("NextScheduleTime")
        private String nextScheduleTime;

        @com.aliyun.core.annotation.NameInMap("Outputs")
        private String outputs;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.Map<String, ?> parameters;

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
        private java.util.Map<String, ?> tags;

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
            this.nextScheduleTime = builder.nextScheduleTime;
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
        public java.util.Map<String, ?> getCounters() {
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
        public java.util.List<CurrentTasks> getCurrentTasks() {
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
         * @return nextScheduleTime
         */
        public String getNextScheduleTime() {
            return this.nextScheduleTime;
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
        public java.util.Map<String, ?> getParameters() {
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
        public java.util.Map<String, ?> getTags() {
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
            private java.util.Map<String, ?> counters; 
            private String createDate; 
            private java.util.List<CurrentTasks> currentTasks; 
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
            private String nextScheduleTime; 
            private String outputs; 
            private java.util.Map<String, ?> parameters; 
            private String parentExecutionId; 
            private String ramRole; 
            private String resourceGroupId; 
            private String resourceStatus; 
            private String safetyCheck; 
            private String startDate; 
            private String status; 
            private String statusMessage; 
            private String statusReason; 
            private java.util.Map<String, ?> tags; 
            private String targets; 
            private String templateId; 
            private String templateName; 
            private String templateVersion; 
            private String updateDate; 
            private String waitingStatus; 

            private Builder() {
            } 

            private Builder(Executions model) {
                this.category = model.category;
                this.counters = model.counters;
                this.createDate = model.createDate;
                this.currentTasks = model.currentTasks;
                this.description = model.description;
                this.endDate = model.endDate;
                this.executedBy = model.executedBy;
                this.executionId = model.executionId;
                this.isParent = model.isParent;
                this.lastSuccessfulTriggerTime = model.lastSuccessfulTriggerTime;
                this.lastTriggerOutputs = model.lastTriggerOutputs;
                this.lastTriggerStatus = model.lastTriggerStatus;
                this.lastTriggerStatusMessage = model.lastTriggerStatusMessage;
                this.lastTriggerTime = model.lastTriggerTime;
                this.mode = model.mode;
                this.nextScheduleTime = model.nextScheduleTime;
                this.outputs = model.outputs;
                this.parameters = model.parameters;
                this.parentExecutionId = model.parentExecutionId;
                this.ramRole = model.ramRole;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceStatus = model.resourceStatus;
                this.safetyCheck = model.safetyCheck;
                this.startDate = model.startDate;
                this.status = model.status;
                this.statusMessage = model.statusMessage;
                this.statusReason = model.statusReason;
                this.tags = model.tags;
                this.targets = model.targets;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
                this.templateVersion = model.templateVersion;
                this.updateDate = model.updateDate;
                this.waitingStatus = model.waitingStatus;
            } 

            /**
             * <p>The type of the execution template. Valid values: Other, TimerTrigger, EventTrigger, and AlarmTrigger.</p>
             * 
             * <strong>example:</strong>
             * <p>Other</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The number of tasks that are counted by execution status.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Failed&quot;: 0,&quot;Success&quot;: 1,&quot;Total&quot;: 2}</p>
             */
            public Builder counters(java.util.Map<String, ?> counters) {
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
             * <p>The information about the tasks that are running.</p>
             */
            public Builder currentTasks(java.util.List<CurrentTasks> currentTasks) {
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
             * <p>The time when the execution stops running.</p>
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
             * <p>1309252800</p>
             */
            public Builder executedBy(String executedBy) {
                this.executedBy = executedBy;
                return this;
            }

            /**
             * <p>The unique ID of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>exec-44d32b45d2a449e</p>
             */
            public Builder executionId(String executionId) {
                this.executionId = executionId;
                return this;
            }

            /**
             * <p>Indicates whether the execution contains child executions.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isParent(Boolean isParent) {
                this.isParent = isParent;
                return this;
            }

            /**
             * <p>The time when the template was last successfully triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-05-27T09:29:18Z</p>
             */
            public Builder lastSuccessfulTriggerTime(String lastSuccessfulTriggerTime) {
                this.lastSuccessfulTriggerTime = lastSuccessfulTriggerTime;
                return this;
            }

            /**
             * <p>The outputs of last trigger.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;InstanceId&quot;: &quot;i-xxx&quot;
             * }</p>
             */
            public Builder lastTriggerOutputs(String lastTriggerOutputs) {
                this.lastTriggerOutputs = lastTriggerOutputs;
                return this;
            }

            /**
             * <p>The status of the execution after the template was last triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder lastTriggerStatus(String lastTriggerStatus) {
                this.lastTriggerStatus = lastTriggerStatus;
                return this;
            }

            /**
             * <p>The status message of last trigger.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder lastTriggerStatusMessage(String lastTriggerStatusMessage) {
                this.lastTriggerStatusMessage = lastTriggerStatusMessage;
                return this;
            }

            /**
             * <p>The time when the template was last successfully triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-05-27T09:29:18Z</p>
             */
            public Builder lastTriggerTime(String lastTriggerTime) {
                this.lastTriggerTime = lastTriggerTime;
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
             * <p>The next schedule time for timer trigger execution.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-05-16T10:26:14Z</p>
             */
            public Builder nextScheduleTime(String nextScheduleTime) {
                this.nextScheduleTime = nextScheduleTime;
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
            public Builder parameters(java.util.Map<String, ?> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The ID of the parent execution.</p>
             * 
             * <strong>example:</strong>
             * <p>exec-xxx</p>
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
             * <p>The status of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>{ 			&quot;Success&quot;: 1 		}</p>
             */
            public Builder resourceStatus(String resourceStatus) {
                this.resourceStatus = resourceStatus;
                return this;
            }

            /**
             * <p>The security check mode. Valid values: Skip, and ConfirmEveryHighRiskAction.</p>
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
             * <p>The status of the execution. Valid values: Started, Queued, Running, Waiting, Success, Failed, and Cancelled.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The status of the task execution.</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * <p>The reason for which the status occurs.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * <p>The tags of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder tags(java.util.Map<String, ?> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The target resource.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{&quot;ResourceType&quot;: &quot;ALIYUN::ECS::Instance&quot;, &quot;Filters&quot;: [{&quot;ResourceIds&quot;: [&quot;i-bp14z07dg3464980x72o&quot;], &quot;RegionId&quot;: &quot;cn-hangzhou&quot;, &quot;Type&quot;: &quot;ResourceIds&quot;}]}&quot;</p>
             */
            public Builder targets(String targets) {
                this.targets = targets;
                return this;
            }

            /**
             * <p>The ID of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
             * <p>The time when the execution was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-05-16T10:26:14Z</p>
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            /**
             * <p>The Waiting state.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
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
