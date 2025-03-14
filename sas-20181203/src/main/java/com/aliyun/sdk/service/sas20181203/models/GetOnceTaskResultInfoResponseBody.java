// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetOnceTaskResultInfoResponseBody model) {
            this.collectTime = model.collectTime;
            this.finishCount = model.finishCount;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
            this.taskInfo = model.taskInfo;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The execution time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1671184531000</p>
         */
        public Builder collectTime(Long collectTime) {
            this.collectTime = collectTime;
            return this;
        }

        /**
         * <p>The number of tasks that were completed.</p>
         * 
         * <strong>example:</strong>
         * <p>47</p>
         */
        public Builder finishCount(Integer finishCount) {
            this.finishCount = finishCount;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>CE500770-42D3-442E-9DDD-156E0F9F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>e7b70a4b030db086db52231f1b58****</p>
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The information about the task.</p>
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

        public GetOnceTaskResultInfoResponseBody build() {
            return new GetOnceTaskResultInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOnceTaskResultInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetOnceTaskResultInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(TaskInfo model) {
                this.status = model.status;
            } 

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The task is not started.</li>
             * <li><strong>START</strong>: The task is started.</li>
             * <li><strong>SUCCESS</strong>: The task is complete.</li>
             * <li><strong>TIMEOUT</strong>: The task times out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>START</p>
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
