// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetWorkflowTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkflowTaskResponseBody</p>
 */
public class GetWorkflowTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WorkflowTask")
    private WorkflowTask workflowTask;

    private GetWorkflowTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.workflowTask = builder.workflowTask;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkflowTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return workflowTask
     */
    public WorkflowTask getWorkflowTask() {
        return this.workflowTask;
    }

    public static final class Builder {
        private String requestId; 
        private WorkflowTask workflowTask; 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>0C-7870-15FE-B96F-8880BB</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WorkflowTask.
         */
        public Builder workflowTask(WorkflowTask workflowTask) {
            this.workflowTask = workflowTask;
            return this;
        }

        public GetWorkflowTaskResponseBody build() {
            return new GetWorkflowTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkflowTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkflowTaskResponseBody</p>
     */
    public static class Workflow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("WorkflowId")
        private String workflowId;

        private Workflow(Builder builder) {
            this.createTime = builder.createTime;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.status = builder.status;
            this.type = builder.type;
            this.workflowId = builder.workflowId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workflow create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return workflowId
         */
        public String getWorkflowId() {
            return this.workflowId;
        }

        public static final class Builder {
            private String createTime; 
            private String modifiedTime; 
            private String name; 
            private String status; 
            private String type; 
            private String workflowId; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * WorkflowId.
             */
            public Builder workflowId(String workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            public Workflow build() {
                return new Workflow(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkflowTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkflowTaskResponseBody</p>
     */
    public static class WorkflowTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityResults")
        private String activityResults;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskInput")
        private String taskInput;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        @com.aliyun.core.annotation.NameInMap("Workflow")
        private Workflow workflow;

        private WorkflowTask(Builder builder) {
            this.activityResults = builder.activityResults;
            this.createTime = builder.createTime;
            this.finishTime = builder.finishTime;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskInput = builder.taskInput;
            this.userData = builder.userData;
            this.workflow = builder.workflow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkflowTask create() {
            return builder().build();
        }

        /**
         * @return activityResults
         */
        public String getActivityResults() {
            return this.activityResults;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskInput
         */
        public String getTaskInput() {
            return this.taskInput;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        /**
         * @return workflow
         */
        public Workflow getWorkflow() {
            return this.workflow;
        }

        public static final class Builder {
            private String activityResults; 
            private String createTime; 
            private String finishTime; 
            private String status; 
            private String taskId; 
            private String taskInput; 
            private String userData; 
            private Workflow workflow; 

            /**
             * ActivityResults.
             */
            public Builder activityResults(String activityResults) {
                this.activityResults = activityResults;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskInput.
             */
            public Builder taskInput(String taskInput) {
                this.taskInput = taskInput;
                return this;
            }

            /**
             * UserData.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * Workflow.
             */
            public Builder workflow(Workflow workflow) {
                this.workflow = workflow;
                return this;
            }

            public WorkflowTask build() {
                return new WorkflowTask(this);
            } 

        } 

    }
}
