// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaskExecutionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTaskExecutionsResponseBody</p>
 */
public class ListTaskExecutionsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskExecutions")
    private java.util.List < TaskExecutions> taskExecutions;

    private ListTaskExecutionsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.taskExecutions = builder.taskExecutions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaskExecutionsResponseBody create() {
        return builder().build();
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
     * @return taskExecutions
     */
    public java.util.List < TaskExecutions> getTaskExecutions() {
        return this.taskExecutions;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < TaskExecutions> taskExecutions; 

        /**
         * The details of the task executions.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The number of entries returned on each page.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The execution ID of the child node.
         */
        public Builder taskExecutions(java.util.List < TaskExecutions> taskExecutions) {
            this.taskExecutions = taskExecutions;
            return this;
        }

        public ListTaskExecutionsResponseBody build() {
            return new ListTaskExecutionsResponseBody(this);
        } 

    } 

    public static class TaskExecutions extends TeaModel {
        @NameInMap("ChildExecutionId")
        private String childExecutionId;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("ExecutionId")
        private String executionId;

        @NameInMap("ExtraData")
        private java.util.Map < String, ? > extraData;

        @NameInMap("Loop")
        private java.util.Map < String, ? > loop;

        @NameInMap("LoopBatchNumber")
        private Integer loopBatchNumber;

        @NameInMap("LoopItem")
        private String loopItem;

        @NameInMap("Outputs")
        private String outputs;

        @NameInMap("ParentTaskExecutionId")
        private String parentTaskExecutionId;

        @NameInMap("Properties")
        private String properties;

        @NameInMap("StartDate")
        private String startDate;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusMessage")
        private String statusMessage;

        @NameInMap("TaskAction")
        private String taskAction;

        @NameInMap("TaskExecutionId")
        private String taskExecutionId;

        @NameInMap("TaskName")
        private String taskName;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("UpdateDate")
        private String updateDate;

        private TaskExecutions(Builder builder) {
            this.childExecutionId = builder.childExecutionId;
            this.createDate = builder.createDate;
            this.endDate = builder.endDate;
            this.executionId = builder.executionId;
            this.extraData = builder.extraData;
            this.loop = builder.loop;
            this.loopBatchNumber = builder.loopBatchNumber;
            this.loopItem = builder.loopItem;
            this.outputs = builder.outputs;
            this.parentTaskExecutionId = builder.parentTaskExecutionId;
            this.properties = builder.properties;
            this.startDate = builder.startDate;
            this.status = builder.status;
            this.statusMessage = builder.statusMessage;
            this.taskAction = builder.taskAction;
            this.taskExecutionId = builder.taskExecutionId;
            this.taskName = builder.taskName;
            this.templateId = builder.templateId;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskExecutions create() {
            return builder().build();
        }

        /**
         * @return childExecutionId
         */
        public String getChildExecutionId() {
            return this.childExecutionId;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return executionId
         */
        public String getExecutionId() {
            return this.executionId;
        }

        /**
         * @return extraData
         */
        public java.util.Map < String, ? > getExtraData() {
            return this.extraData;
        }

        /**
         * @return loop
         */
        public java.util.Map < String, ? > getLoop() {
            return this.loop;
        }

        /**
         * @return loopBatchNumber
         */
        public Integer getLoopBatchNumber() {
            return this.loopBatchNumber;
        }

        /**
         * @return loopItem
         */
        public String getLoopItem() {
            return this.loopItem;
        }

        /**
         * @return outputs
         */
        public String getOutputs() {
            return this.outputs;
        }

        /**
         * @return parentTaskExecutionId
         */
        public String getParentTaskExecutionId() {
            return this.parentTaskExecutionId;
        }

        /**
         * @return properties
         */
        public String getProperties() {
            return this.properties;
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

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private String childExecutionId; 
            private String createDate; 
            private String endDate; 
            private String executionId; 
            private java.util.Map < String, ? > extraData; 
            private java.util.Map < String, ? > loop; 
            private Integer loopBatchNumber; 
            private String loopItem; 
            private String outputs; 
            private String parentTaskExecutionId; 
            private String properties; 
            private String startDate; 
            private String status; 
            private String statusMessage; 
            private String taskAction; 
            private String taskExecutionId; 
            private String taskName; 
            private String templateId; 
            private String updateDate; 

            /**
             * The output of the execution.
             */
            public Builder childExecutionId(String childExecutionId) {
                this.childExecutionId = childExecutionId;
                return this;
            }

            /**
             * The ID of the execution.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The execution ID of the parent node.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * The action of the task.
             */
            public Builder executionId(String executionId) {
                this.executionId = executionId;
                return this;
            }

            /**
             * The Input parameters of the task execution.
             */
            public Builder extraData(java.util.Map < String, ? > extraData) {
                this.extraData = extraData;
                return this;
            }

            /**
             * The ID of the template.
             */
            public Builder loop(java.util.Map < String, ? > loop) {
                this.loop = loop;
                return this;
            }

            /**
             * The status information of the task execution.
             */
            public Builder loopBatchNumber(Integer loopBatchNumber) {
                this.loopBatchNumber = loopBatchNumber;
                return this;
            }

            /**
             * The time when the execution was created.
             */
            public Builder loopItem(String loopItem) {
                this.loopItem = loopItem;
                return this;
            }

            /**
             * The status of the task.
             */
            public Builder outputs(String outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * The name of the task.
             */
            public Builder parentTaskExecutionId(String parentTaskExecutionId) {
                this.parentTaskExecutionId = parentTaskExecutionId;
                return this;
            }

            /**
             * Queries task executions. Multiple methods are supported to filter task executions.
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * The elements in the loop task.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * The time when the task execution stopped running.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The additional information.
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * The execution ID of the task.
             */
            public Builder taskAction(String taskAction) {
                this.taskAction = taskAction;
                return this;
            }

            /**
             * The time when the execution was last updated.
             */
            public Builder taskExecutionId(String taskExecutionId) {
                this.taskExecutionId = taskExecutionId;
                return this;
            }

            /**
             * The time when the execution started.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * The number of times for which the loop task is run.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * The configuration and statistics information of the loop task. This parameter is returned only for the parent node of the loop task.
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public TaskExecutions build() {
                return new TaskExecutions(this);
            } 

        } 

    }
}
