// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTaskExecutionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTaskExecutionsResponseBody</p>
 */
public class ListTaskExecutionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskExecutions")
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
         * <p>The details of the task executions.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>MTRBMDc0NjAtRUJFNy00N0NBLTk3NTctMTJDQzQ3NjFENDdB</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>CDABABABAB-FC28-4D9C-8FB5-68DC6F0486FC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The execution ID of the child node.</p>
         */
        public Builder taskExecutions(java.util.List < TaskExecutions> taskExecutions) {
            this.taskExecutions = taskExecutions;
            return this;
        }

        public ListTaskExecutionsResponseBody build() {
            return new ListTaskExecutionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTaskExecutionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTaskExecutionsResponseBody</p>
     */
    public static class TaskExecutions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChildExecutionId")
        private String childExecutionId;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("ExecutionId")
        private String executionId;

        @com.aliyun.core.annotation.NameInMap("ExtraData")
        private java.util.Map < String, ? > extraData;

        @com.aliyun.core.annotation.NameInMap("Loop")
        private java.util.Map < String, ? > loop;

        @com.aliyun.core.annotation.NameInMap("LoopBatchNumber")
        private Integer loopBatchNumber;

        @com.aliyun.core.annotation.NameInMap("LoopItem")
        private String loopItem;

        @com.aliyun.core.annotation.NameInMap("Outputs")
        private String outputs;

        @com.aliyun.core.annotation.NameInMap("ParentTaskExecutionId")
        private String parentTaskExecutionId;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private String properties;

        @com.aliyun.core.annotation.NameInMap("StartDate")
        private String startDate;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusMessage")
        private String statusMessage;

        @com.aliyun.core.annotation.NameInMap("TaskAction")
        private String taskAction;

        @com.aliyun.core.annotation.NameInMap("TaskExecutionId")
        private String taskExecutionId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
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
             * <p>The output of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>exec-xxx</p>
             */
            public Builder childExecutionId(String childExecutionId) {
                this.childExecutionId = childExecutionId;
                return this;
            }

            /**
             * <p>The ID of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-05-16T10:26:14Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The execution ID of the parent node.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-05-16T10:26:14Z</p>
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>The action of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>exec-44d32b45d2a449e49899</p>
             */
            public Builder executionId(String executionId) {
                this.executionId = executionId;
                return this;
            }

            /**
             * <p>The Input parameters of the task execution.</p>
             * 
             * <strong>example:</strong>
             * <p>{                     &quot;NotifyNote&quot;:&quot;&quot;                 }</p>
             */
            public Builder extraData(java.util.Map < String, ? > extraData) {
                this.extraData = extraData;
                return this;
            }

            /**
             * <p>The ID of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder loop(java.util.Map < String, ? > loop) {
                this.loop = loop;
                return this;
            }

            /**
             * <p>The status information of the task execution.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder loopBatchNumber(Integer loopBatchNumber) {
                this.loopBatchNumber = loopBatchNumber;
                return this;
            }

            /**
             * <p>The time when the execution was created.</p>
             * 
             * <strong>example:</strong>
             * <p>i-1234566zxcvvb</p>
             */
            public Builder loopItem(String loopItem) {
                this.loopItem = loopItem;
                return this;
            }

            /**
             * <p>The status of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;InstanceId&quot;:&quot;i-xxx&quot; }</p>
             */
            public Builder outputs(String outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * <p>The name of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>task-exec-xxx</p>
             */
            public Builder parentTaskExecutionId(String parentTaskExecutionId) {
                this.parentTaskExecutionId = parentTaskExecutionId;
                return this;
            }

            /**
             * <p>Queries task executions. Multiple methods are supported to filter task executions.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;Status&quot;:&quot;Running&quot; }</p>
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The elements in the loop task.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-05-16T10:26:14Z</p>
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * <p>The time when the task execution stopped running.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The additional information.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * <p>The execution ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::Sleep</p>
             */
            public Builder taskAction(String taskAction) {
                this.taskAction = taskAction;
                return this;
            }

            /**
             * <p>The time when the execution was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>task-exec-xxx</p>
             */
            public Builder taskExecutionId(String taskExecutionId) {
                this.taskExecutionId = taskExecutionId;
                return this;
            }

            /**
             * <p>The time when the execution started.</p>
             * 
             * <strong>example:</strong>
             * <p>describeInstance</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The number of times for which the loop task is run.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The configuration and statistics information of the loop task. This parameter is returned only for the parent node of the loop task.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-05-16T10:26:14Z</p>
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
