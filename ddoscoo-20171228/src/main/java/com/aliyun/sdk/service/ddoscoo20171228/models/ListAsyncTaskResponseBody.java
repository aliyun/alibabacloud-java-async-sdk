// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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
 * {@link ListAsyncTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListAsyncTaskResponseBody</p>
 */
public class ListAsyncTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AsyncTasks")
    private java.util.List<AsyncTasks> asyncTasks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListAsyncTaskResponseBody(Builder builder) {
        this.asyncTasks = builder.asyncTasks;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAsyncTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asyncTasks
     */
    public java.util.List<AsyncTasks> getAsyncTasks() {
        return this.asyncTasks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<AsyncTasks> asyncTasks; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListAsyncTaskResponseBody model) {
            this.asyncTasks = model.asyncTasks;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * AsyncTasks.
         */
        public Builder asyncTasks(java.util.List<AsyncTasks> asyncTasks) {
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListAsyncTaskResponseBody build() {
            return new ListAsyncTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAsyncTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListAsyncTaskResponseBody</p>
     */
    public static class AsyncTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("TaskParams")
        private String taskParams;

        @com.aliyun.core.annotation.NameInMap("TaskResult")
        private String taskResult;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private Integer taskStatus;

        @com.aliyun.core.annotation.NameInMap("TaskType")
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

            private Builder() {
            } 

            private Builder(AsyncTasks model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
                this.taskId = model.taskId;
                this.taskParams = model.taskParams;
                this.taskResult = model.taskResult;
                this.taskStatus = model.taskStatus;
                this.taskType = model.taskType;
            } 

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
