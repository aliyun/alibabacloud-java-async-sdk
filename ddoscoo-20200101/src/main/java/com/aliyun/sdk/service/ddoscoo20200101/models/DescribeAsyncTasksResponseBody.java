// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAsyncTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAsyncTasksResponseBody</p>
 */
public class DescribeAsyncTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AsyncTasks")
    private java.util.List < AsyncTasks> asyncTasks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * An array that consists of the details of the asynchronous export tasks.
         */
        public Builder asyncTasks(java.util.List < AsyncTasks> asyncTasks) {
            this.asyncTasks = asyncTasks;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of asynchronous export tasks that are returned.
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

            /**
             * The end time of the task. This value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The start time of the task. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The ID of the job.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The task parameter. The value is a JSON string. The returned field in the value varies based on the value of **TaskType**.
             * <p>
             * 
             * If **TaskType** is set to **1**, **3**, **4**, **5**, or **6**, the following filed is returned:
             * 
             * *   **instanceId**: the ID of the instance. Data type: string.
             * 
             * If **TaskType** is set to **2**, the following field is returned:
             * 
             * *   **domain**: the domain name of the website. Data type: string.
             */
            public Builder taskParams(String taskParams) {
                this.taskParams = taskParams;
                return this;
            }

            /**
             * The execution result of the task. The value is a JSON string. The returned fields in the value vary based on the value of **TaskType**.
             * <p>
             * 
             * If **TaskType** is set to **1**, **3**, **4**, **5**, or **6**, the following fields are returned:
             * 
             * *   **instanceId**: the ID of the instance. Data type: string.
             * *   **url**: the URL to download the exported file from Object Storage Service (OSS). Data type: string.
             * 
             * If **TaskType** is set to **2**, the following fields are returned:
             * 
             * *   **domain**: the domain name of the website. Data type: string.
             * *   **url**: the URL to download the exported file from OSS. Data type: string.
             */
            public Builder taskResult(String taskResult) {
                this.taskResult = taskResult;
                return this;
            }

            /**
             * The status of the task. Valid values:
             * <p>
             * 
             * *   **0**: indicates that the task is being initialized.
             * *   **1**: indicates that the task is in progress.
             * *   **2**: indicates that the task is successful.
             * *   **3**: indicates that the task failed.
             */
            public Builder taskStatus(Integer taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * The type of the task. Valid values:
             * <p>
             * 
             * *   **1**: the task to export the port forwarding rules of an instance
             * *   **2**: the task to export the forwarding rules of a website protected by an instance
             * *   **3**: the task to export the sessions and health check settings of an instance
             * *   **4**: the task to export the mitigation policies of an instance
             * *   **5**: the task to download the blacklist for destination IP addresses of an instance
             * *   **6**: the task to download the whitelist for destination IP addresses of an instance
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
