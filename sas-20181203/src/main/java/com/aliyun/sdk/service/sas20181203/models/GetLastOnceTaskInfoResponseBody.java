// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetLastOnceTaskInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetLastOnceTaskInfoResponseBody</p>
 */
public class GetLastOnceTaskInfoResponseBody extends TeaModel {
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
         * <p>The time at which the task was run.</p>
         * 
         * <strong>example:</strong>
         * <p>1671184531000</p>
         */
        public Builder collectTime(Long collectTime) {
            this.collectTime = collectTime;
            return this;
        }

        /**
         * <p>The number of tasks that have been completed.</p>
         * 
         * <strong>example:</strong>
         * <p>67</p>
         */
        public Builder finishCount(Integer finishCount) {
            this.finishCount = finishCount;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>BE120DAB-F4E7-4C53-ADC3-A97578AB****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the latest scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>3f65e1f1bb13118891a889d569a3****</p>
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The information about the latest task.</p>
         */
        public Builder taskInfo(TaskInfo taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>44</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetLastOnceTaskInfoResponseBody build() {
            return new GetLastOnceTaskInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLastOnceTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetLastOnceTaskInfoResponseBody</p>
     */
    public static class TaskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The progress of the task in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>69</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The result of the scan task. Valid values:</p>
             * <ul>
             * <li><strong>SUCCESS</strong>: The task is successful.</li>
             * <li><strong>TASK_NOT_SUPPORT_REGION</strong>: The images are deployed in a region that is not supported by container image scan.</li>
             * <li><strong>TASK_NOT_EXISTS</strong>: The task does not exist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The task is not started.</li>
             * <li><strong>START</strong>: The task is started.</li>
             * <li><strong>SUCCESS</strong>: The task is complete.</li>
             * <li><strong>TIMEOUT</strong>: The task timed out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
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
