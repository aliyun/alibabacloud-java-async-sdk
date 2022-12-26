// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLastOnceTaskInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetLastOnceTaskInfoResponseBody</p>
 */
public class GetLastOnceTaskInfoResponseBody extends TeaModel {
    @NameInMap("CollectTime")
    private Long collectTime;

    @NameInMap("FinishCount")
    private Integer finishCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private Long taskId;

    @NameInMap("TaskInfo")
    private TaskInfo taskInfo;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private GetLastOnceTaskInfoResponseBody(Builder builder) {
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

    public static GetLastOnceTaskInfoResponseBody create() {
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
         * CollectTime.
         */
        public Builder collectTime(Long collectTime) {
            this.collectTime = collectTime;
            return this;
        }

        /**
         * FinishCount.
         */
        public Builder finishCount(Integer finishCount) {
            this.finishCount = finishCount;
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
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskInfo.
         */
        public Builder taskInfo(TaskInfo taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetLastOnceTaskInfoResponseBody build() {
            return new GetLastOnceTaskInfoResponseBody(this);
        } 

    } 

    public static class TaskInfo extends TeaModel {
        @NameInMap("Progress")
        private Integer progress;

        @NameInMap("Result")
        private String result;

        @NameInMap("Status")
        private String status;

        private TaskInfo(Builder builder) {
            this.progress = builder.progress;
            this.result = builder.result;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInfo create() {
            return builder().build();
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer progress; 
            private String result; 
            private String status; 

            /**
             * Progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * Status.
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
