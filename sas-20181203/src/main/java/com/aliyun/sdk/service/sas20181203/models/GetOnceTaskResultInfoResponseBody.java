// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOnceTaskResultInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetOnceTaskResultInfoResponseBody</p>
 */
public class GetOnceTaskResultInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CollectTime")
    private Long collectTime;

    @com.aliyun.core.annotation.NameInMap("FinishCount")
    private Integer finishCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    @com.aliyun.core.annotation.NameInMap("TaskInfo")
    private TaskInfo taskInfo;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private GetOnceTaskResultInfoResponseBody(Builder builder) {
        this.collectTime = builder.collectTime;
        this.finishCount = builder.finishCount;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
        this.taskInfo = builder.taskInfo;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOnceTaskResultInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return collectTime
     */
    public Long getCollectTime() {
        return this.collectTime;
    }

    /**
     * @return finishCount
     */
    public Integer getFinishCount() {
        return this.finishCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskInfo
     */
    public TaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long collectTime; 
        private Integer finishCount; 
        private String requestId; 
        private Long taskId; 
        private TaskInfo taskInfo; 
        private Integer totalCount; 

        /**
         * The execution time of the task.
         */
        public Builder collectTime(Long collectTime) {
            this.collectTime = collectTime;
            return this;
        }

        /**
         * The number of tasks that were completed.
         */
        public Builder finishCount(Integer finishCount) {
            this.finishCount = finishCount;
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
         * The ID of the scan task.
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * The information about the task.
         */
        public Builder taskInfo(TaskInfo taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetOnceTaskResultInfoResponseBody build() {
            return new GetOnceTaskResultInfoResponseBody(this);
        } 

    } 

    public static class TaskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private TaskInfo(Builder builder) {
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInfo create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String status; 

            /**
             * The status of the task. Valid values:
             * <p>
             * 
             * *   **INIT**: The task is not started.
             * *   **START**: The task is started.
             * *   **SUCCESS**: The task is complete.
             * *   **TIMEOUT**: The task times out.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public TaskInfo build() {
                return new TaskInfo(this);
            } 

        } 

    }
}
