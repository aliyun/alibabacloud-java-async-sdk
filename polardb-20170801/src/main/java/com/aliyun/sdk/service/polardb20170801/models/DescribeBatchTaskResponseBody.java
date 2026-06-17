// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeBatchTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBatchTaskResponseBody</p>
 */
public class DescribeBatchTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationType")
    private String applicationType;

    @com.aliyun.core.annotation.NameInMap("BatchId")
    private String batchId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SubTasks")
    private java.util.List<SubTasks> subTasks;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
    private Integer successCount;

    @com.aliyun.core.annotation.NameInMap("TaskBegin")
    private String taskBegin;

    @com.aliyun.core.annotation.NameInMap("TaskEnd")
    private String taskEnd;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeBatchTaskResponseBody(Builder builder) {
        this.applicationType = builder.applicationType;
        this.batchId = builder.batchId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.subTasks = builder.subTasks;
        this.successCount = builder.successCount;
        this.taskBegin = builder.taskBegin;
        this.taskEnd = builder.taskEnd;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBatchTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationType
     */
    public String getApplicationType() {
        return this.applicationType;
    }

    /**
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subTasks
     */
    public java.util.List<SubTasks> getSubTasks() {
        return this.subTasks;
    }

    /**
     * @return successCount
     */
    public Integer getSuccessCount() {
        return this.successCount;
    }

    /**
     * @return taskBegin
     */
    public String getTaskBegin() {
        return this.taskBegin;
    }

    /**
     * @return taskEnd
     */
    public String getTaskEnd() {
        return this.taskEnd;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String applicationType; 
        private String batchId; 
        private String requestId; 
        private String status; 
        private java.util.List<SubTasks> subTasks; 
        private Integer successCount; 
        private String taskBegin; 
        private String taskEnd; 
        private String taskName; 
        private String taskType; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeBatchTaskResponseBody model) {
            this.applicationType = model.applicationType;
            this.batchId = model.batchId;
            this.requestId = model.requestId;
            this.status = model.status;
            this.subTasks = model.subTasks;
            this.successCount = model.successCount;
            this.taskBegin = model.taskBegin;
            this.taskEnd = model.taskEnd;
            this.taskName = model.taskName;
            this.taskType = model.taskType;
            this.totalCount = model.totalCount;
        } 

        /**
         * ApplicationType.
         */
        public Builder applicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }

        /**
         * BatchId.
         */
        public Builder batchId(String batchId) {
            this.batchId = batchId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>25C70FF3-D49B-594D-BECE-0DE2BA1D8BBB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * SubTasks.
         */
        public Builder subTasks(java.util.List<SubTasks> subTasks) {
            this.subTasks = subTasks;
            return this;
        }

        /**
         * SuccessCount.
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        /**
         * TaskBegin.
         */
        public Builder taskBegin(String taskBegin) {
            this.taskBegin = taskBegin;
            return this;
        }

        /**
         * TaskEnd.
         */
        public Builder taskEnd(String taskEnd) {
            this.taskEnd = taskEnd;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBatchTaskResponseBody build() {
            return new DescribeBatchTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBatchTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBatchTaskResponseBody</p>
     */
    public static class SubTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskBegin")
        private String taskBegin;

        @com.aliyun.core.annotation.NameInMap("TaskEnd")
        private String taskEnd;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private SubTasks(Builder builder) {
            this.errorMsg = builder.errorMsg;
            this.instanceId = builder.instanceId;
            this.status = builder.status;
            this.taskBegin = builder.taskBegin;
            this.taskEnd = builder.taskEnd;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubTasks create() {
            return builder().build();
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskBegin
         */
        public String getTaskBegin() {
            return this.taskBegin;
        }

        /**
         * @return taskEnd
         */
        public String getTaskEnd() {
            return this.taskEnd;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String errorMsg; 
            private String instanceId; 
            private String status; 
            private String taskBegin; 
            private String taskEnd; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(SubTasks model) {
                this.errorMsg = model.errorMsg;
                this.instanceId = model.instanceId;
                this.status = model.status;
                this.taskBegin = model.taskBegin;
                this.taskEnd = model.taskEnd;
                this.taskId = model.taskId;
            } 

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskBegin.
             */
            public Builder taskBegin(String taskBegin) {
                this.taskBegin = taskBegin;
                return this;
            }

            /**
             * TaskEnd.
             */
            public Builder taskEnd(String taskEnd) {
                this.taskEnd = taskEnd;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public SubTasks build() {
                return new SubTasks(this);
            } 

        } 

    }
}
