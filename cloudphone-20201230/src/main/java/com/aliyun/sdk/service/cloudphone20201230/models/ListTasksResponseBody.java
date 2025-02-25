// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListTasksResponseBody</p>
 */
public class ListTasksResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Tasks")
    private Tasks tasks;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListTasksResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTasksResponseBody create() {
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
     * @return tasks
     */
    public Tasks getTasks() {
        return this.tasks;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String requestId; 
        private Tasks tasks; 
        private Integer totalCount; 

        /**
         * The maximum number of entries that is returned on each page. Valid values: 1 to 200. Default value: 50.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The tasks.
         */
        public Builder tasks(Tasks tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * The total number of tasks.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTasksResponseBody build() {
            return new ListTasksResponseBody(this);
        } 

    } 

    public static class Task extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ExecuteMsg")
        private String executeMsg;

        @NameInMap("FinishedTime")
        private String finishedTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskStatus")
        private String taskStatus;

        @NameInMap("TaskType")
        private String taskType;

        private Task(Builder builder) {
            this.createTime = builder.createTime;
            this.executeMsg = builder.executeMsg;
            this.finishedTime = builder.finishedTime;
            this.instanceId = builder.instanceId;
            this.progress = builder.progress;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return executeMsg
         */
        public String getExecuteMsg() {
            return this.executeMsg;
        }

        /**
         * @return finishedTime
         */
        public String getFinishedTime() {
            return this.finishedTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String createTime; 
            private String executeMsg; 
            private String finishedTime; 
            private String instanceId; 
            private String progress; 
            private String taskId; 
            private String taskStatus; 
            private String taskType; 

            /**
             * The time when the task was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The content that is returned after the task is executed. The content can be up to 1,024 bytes in length.
             */
            public Builder executeMsg(String executeMsg) {
                this.executeMsg = executeMsg;
                return this;
            }

            /**
             * The time when the task ended.
             */
            public Builder finishedTime(String finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The task progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The task state.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * The task type.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
    public static class Tasks extends TeaModel {
        @NameInMap("Task")
        private java.util.List < Task> task;

        private Tasks(Builder builder) {
            this.task = builder.task;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return task
         */
        public java.util.List < Task> getTask() {
            return this.task;
        }

        public static final class Builder {
            private java.util.List < Task> task; 

            /**
             * Task.
             */
            public Builder task(java.util.List < Task> task) {
                this.task = task;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
