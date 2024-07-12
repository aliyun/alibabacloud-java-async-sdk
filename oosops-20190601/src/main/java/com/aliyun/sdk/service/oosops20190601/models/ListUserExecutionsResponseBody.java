// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserExecutionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserExecutionsResponseBody</p>
 */
public class ListUserExecutionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Executions")
    private java.util.List < Executions> executions;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListUserExecutionsResponseBody(Builder builder) {
        this.executions = builder.executions;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserExecutionsResponseBody create() {
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
         * Executions.
         */
        public Builder executions(java.util.List < Executions> executions) {
            this.executions = executions;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUserExecutionsResponseBody build() {
            return new ListUserExecutionsResponseBody(this);
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
             * TaskAction.
             */
            public Builder taskAction(String taskAction) {
                this.taskAction = taskAction;
                return this;
            }

            /**
             * TaskExecutionId.
             */
            public Builder taskExecutionId(String taskExecutionId) {
                this.taskExecutionId = taskExecutionId;
                return this;
            }

            /**
             * TaskName.
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
        @com.aliyun.core.annotation.NameInMap("Counters")
        private String counters;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("CurrentTasks")
        private java.util.List < CurrentTasks> currentTasks;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("ExecutedBy")
        private String executedBy;

        @com.aliyun.core.annotation.NameInMap("ExecutionId")
        private String executionId;

        @com.aliyun.core.annotation.NameInMap("IsParent")
        private Boolean isParent;

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

        @com.aliyun.core.annotation.NameInMap("SafetyCheck")
        private String safetyCheck;

        @com.aliyun.core.annotation.NameInMap("StartDate")
        private String startDate;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusMessage")
        private String statusMessage;

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
            this.counters = builder.counters;
            this.createDate = builder.createDate;
            this.currentTasks = builder.currentTasks;
            this.endDate = builder.endDate;
            this.executedBy = builder.executedBy;
            this.executionId = builder.executionId;
            this.isParent = builder.isParent;
            this.mode = builder.mode;
            this.outputs = builder.outputs;
            this.parameters = builder.parameters;
            this.parentExecutionId = builder.parentExecutionId;
            this.ramRole = builder.ramRole;
            this.safetyCheck = builder.safetyCheck;
            this.startDate = builder.startDate;
            this.status = builder.status;
            this.statusMessage = builder.statusMessage;
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
         * @return counters
         */
        public String getCounters() {
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
            private String counters; 
            private String createDate; 
            private java.util.List < CurrentTasks> currentTasks; 
            private String endDate; 
            private String executedBy; 
            private String executionId; 
            private Boolean isParent; 
            private String mode; 
            private String outputs; 
            private String parameters; 
            private String parentExecutionId; 
            private String ramRole; 
            private String safetyCheck; 
            private String startDate; 
            private String status; 
            private String statusMessage; 
            private String templateId; 
            private String templateName; 
            private String templateVersion; 
            private String updateDate; 
            private String waitingStatus; 

            /**
             * Counters.
             */
            public Builder counters(String counters) {
                this.counters = counters;
                return this;
            }

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * CurrentTasks.
             */
            public Builder currentTasks(java.util.List < CurrentTasks> currentTasks) {
                this.currentTasks = currentTasks;
                return this;
            }

            /**
             * EndDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * ExecutedBy.
             */
            public Builder executedBy(String executedBy) {
                this.executedBy = executedBy;
                return this;
            }

            /**
             * ExecutionId.
             */
            public Builder executionId(String executionId) {
                this.executionId = executionId;
                return this;
            }

            /**
             * IsParent.
             */
            public Builder isParent(Boolean isParent) {
                this.isParent = isParent;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Outputs.
             */
            public Builder outputs(String outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * ParentExecutionId.
             */
            public Builder parentExecutionId(String parentExecutionId) {
                this.parentExecutionId = parentExecutionId;
                return this;
            }

            /**
             * RamRole.
             */
            public Builder ramRole(String ramRole) {
                this.ramRole = ramRole;
                return this;
            }

            /**
             * SafetyCheck.
             */
            public Builder safetyCheck(String safetyCheck) {
                this.safetyCheck = safetyCheck;
                return this;
            }

            /**
             * StartDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
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
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * TemplateVersion.
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * UpdateDate.
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            /**
             * WaitingStatus.
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
