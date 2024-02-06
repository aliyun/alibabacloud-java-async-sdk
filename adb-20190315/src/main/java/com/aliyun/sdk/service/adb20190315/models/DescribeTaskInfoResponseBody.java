// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTaskInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTaskInfoResponseBody</p>
 */
public class DescribeTaskInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskInfo")
    private TaskInfo taskInfo;

    private DescribeTaskInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskInfo = builder.taskInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTaskInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskInfo
     */
    public TaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static final class Builder {
        private String requestId; 
        private TaskInfo taskInfo; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The queried task.
         */
        public Builder taskInfo(TaskInfo taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }

        public DescribeTaskInfoResponseBody build() {
            return new DescribeTaskInfoResponseBody(this);
        } 

    } 

    public static class TaskInfo extends TeaModel {
        @NameInMap("BeginTime")
        private String beginTime;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskId")
        private Integer taskId;

        private TaskInfo(Builder builder) {
            this.beginTime = builder.beginTime;
            this.finishTime = builder.finishTime;
            this.progress = builder.progress;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInfo create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
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
        public Integer getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String beginTime; 
            private String finishTime; 
            private String progress; 
            private String status; 
            private Integer taskId; 

            /**
             * The start time of the task. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * The end time of the task. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The progress of the task. Unit: %.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The status. Valid values:
             * <p>
             * 
             * *   Waiting
             * *   Running
             * *   Finished
             * *   Failed
             * *   Closed
             * *   Cancel
             * *   Retry
             * *   Pause
             * *   Stop
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder taskId(Integer taskId) {
                this.taskId = taskId;
                return this;
            }

            public TaskInfo build() {
                return new TaskInfo(this);
            } 

        } 

    }
}
