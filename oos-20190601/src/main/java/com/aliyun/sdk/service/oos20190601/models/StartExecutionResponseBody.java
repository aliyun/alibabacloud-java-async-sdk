// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartExecutionResponseBody} extends {@link TeaModel}
 *
 * <p>StartExecutionResponseBody</p>
 */
public class StartExecutionResponseBody extends TeaModel {
    @NameInMap("Execution")
    private Execution execution;

    @NameInMap("RequestId")
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
         * Execution.
         */
        public Builder execution(Execution execution) {
            this.execution = execution;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartExecutionResponseBody build() {
            return new StartExecutionResponseBody(this);
        } 

    } 

    public static class CurrentTasks extends TeaModel {
        @NameInMap("TaskAction")
        private String taskAction;

        @NameInMap("TaskExecutionId")
        private String taskExecutionId;

        @NameInMap("TaskName")
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
    public static class Execution extends TeaModel {
        @NameInMap("Counters")
        private java.util.Map < String, ? > counters;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("CurrentTasks")
        private java.util.List < CurrentTasks> currentTasks;

        @NameInMap("Description")
        private String description;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("ExecutedBy")
        private String executedBy;

        @NameInMap("ExecutionId")
        private String executionId;

        @NameInMap("IsParent")
        private Boolean isParent;

        @NameInMap("LoopMode")
        private String loopMode;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("Outputs")
        private String outputs;

        @NameInMap("Parameters")
        private String parameters;

        @NameInMap("ParentExecutionId")
        private String parentExecutionId;

        @NameInMap("RamRole")
        private String ramRole;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SafetyCheck")
        private String safetyCheck;

        @NameInMap("StartDate")
        private String startDate;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusMessage")
        private String statusMessage;

        @NameInMap("Tags")
        private java.util.Map < String, ? > tags;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("TemplateVersion")
        private String templateVersion;

        @NameInMap("UpdateDate")
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
             * Counters.
             */
            public Builder counters(java.util.Map < String, ? > counters) {
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * LoopMode.
             */
            public Builder loopMode(String loopMode) {
                this.loopMode = loopMode;
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
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
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
             * Tags.
             */
            public Builder tags(java.util.Map < String, ? > tags) {
                this.tags = tags;
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

            public Execution build() {
                return new Execution(this);
            } 

        } 

    }
}
