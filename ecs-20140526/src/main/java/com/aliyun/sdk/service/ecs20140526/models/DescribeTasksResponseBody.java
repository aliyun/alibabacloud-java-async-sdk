// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTasksResponseBody</p>
 */
public class DescribeTasksResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("TaskSet")
    private TaskSet taskSet;

    private DescribeTasksResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.regionId = builder.regionId;
        this.taskSet = builder.taskSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return taskSet
     */
    public TaskSet getTaskSet() {
        return this.taskSet;
    }

    public static final class Builder {
        private Integer pageSize; 
        private Integer pageNumber; 
        private String requestId; 
        private Integer totalCount; 
        private String regionId; 
        private TaskSet taskSet; 

        /**
         * The number of entries in the current page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The current page number of the paged query.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The collection of tasks.
         */
        public Builder taskSet(TaskSet taskSet) {
            this.taskSet = taskSet;
            return this;
        }

        public DescribeTasksResponseBody build() {
            return new DescribeTasksResponseBody(this);
        } 

    } 

    public static class Task extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("TaskStatus")
        private String taskStatus;

        @NameInMap("FinishedTime")
        private String finishedTime;

        @NameInMap("SupportCancel")
        private String supportCancel;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskAction")
        private String taskAction;

        private Task(Builder builder) {
            this.creationTime = builder.creationTime;
            this.taskStatus = builder.taskStatus;
            this.finishedTime = builder.finishedTime;
            this.supportCancel = builder.supportCancel;
            this.taskId = builder.taskId;
            this.taskAction = builder.taskAction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return finishedTime
         */
        public String getFinishedTime() {
            return this.finishedTime;
        }

        /**
         * @return supportCancel
         */
        public String getSupportCancel() {
            return this.supportCancel;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskAction
         */
        public String getTaskAction() {
            return this.taskAction;
        }

        public static final class Builder {
            private String creationTime; 
            private String taskStatus; 
            private String finishedTime; 
            private String supportCancel; 
            private String taskId; 
            private String taskAction; 

            /**
             * The creation time.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The status of the task.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * The end time.
             */
            public Builder finishedTime(String finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * Indicates whether the task can be canceled.
             */
            public Builder supportCancel(String supportCancel) {
                this.supportCancel = supportCancel;
                return this;
            }

            /**
             * The ID of the task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The name of the task.
             */
            public Builder taskAction(String taskAction) {
                this.taskAction = taskAction;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
    public static class TaskSet extends TeaModel {
        @NameInMap("Task")
        private java.util.List < Task> task;

        private TaskSet(Builder builder) {
            this.task = builder.task;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskSet create() {
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

            public TaskSet build() {
                return new TaskSet(this);
            } 

        } 

    }
}
