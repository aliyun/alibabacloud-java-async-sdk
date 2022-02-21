// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAsyncTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAsyncTasksResponseBody</p>
 */
public class DescribeAsyncTasksResponseBody extends TeaModel {
    @NameInMap("AsyncTasks")
    private java.util.List < AsyncTasks> asyncTasks;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAsyncTasksResponseBody(Builder builder) {
        this.asyncTasks = builder.asyncTasks;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAsyncTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return asyncTasks
     */
    public java.util.List < AsyncTasks> getAsyncTasks() {
        return this.asyncTasks;
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
        private java.util.List < AsyncTasks> asyncTasks; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * AsyncTasks.
         */
        public Builder asyncTasks(java.util.List < AsyncTasks> asyncTasks) {
            this.asyncTasks = asyncTasks;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAsyncTasksResponseBody build() {
            return new DescribeAsyncTasksResponseBody(this);
        } 

    } 

    public static class AsyncTasks extends TeaModel {
        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("TaskId")
        private Long taskId;

        @NameInMap("TaskParams")
        private String taskParams;

        @NameInMap("TaskResult")
        private String taskResult;

        @NameInMap("TaskStatus")
        private Integer taskStatus;

        @NameInMap("TaskType")
        private Integer taskType;

        private AsyncTasks(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.taskId = builder.taskId;
            this.taskParams = builder.taskParams;
            this.taskResult = builder.taskResult;
            this.taskStatus = builder.taskStatus;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AsyncTasks create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskParams
         */
        public String getTaskParams() {
            return this.taskParams;
        }

        /**
         * @return taskResult
         */
        public String getTaskResult() {
            return this.taskResult;
        }

        /**
         * @return taskStatus
         */
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return taskType
         */
        public Integer getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 
            private Long taskId; 
            private String taskParams; 
            private String taskResult; 
            private Integer taskStatus; 
            private Integer taskType; 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskParams.
             */
            public Builder taskParams(String taskParams) {
                this.taskParams = taskParams;
                return this;
            }

            /**
             * TaskResult.
             */
            public Builder taskResult(String taskResult) {
                this.taskResult = taskResult;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(Integer taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(Integer taskType) {
                this.taskType = taskType;
                return this;
            }

            public AsyncTasks build() {
                return new AsyncTasks(this);
            } 

        } 

    }
}
