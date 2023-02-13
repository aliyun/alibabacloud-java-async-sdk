// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTaskAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTaskAttributeResponseBody</p>
 */
public class DescribeTaskAttributeResponseBody extends TeaModel {
    @NameInMap("CreationTime")
    private String creationTime;

    @NameInMap("FailedCount")
    private Integer failedCount;

    @NameInMap("FinishedTime")
    private String finishedTime;

    @NameInMap("OperationProgressSet")
    private OperationProgressSet operationProgressSet;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuccessCount")
    private Integer successCount;

    @NameInMap("SupportCancel")
    private String supportCancel;

    @NameInMap("TaskAction")
    private String taskAction;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("TaskProcess")
    private String taskProcess;

    @NameInMap("TaskStatus")
    private String taskStatus;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeTaskAttributeResponseBody(Builder builder) {
        this.creationTime = builder.creationTime;
        this.failedCount = builder.failedCount;
        this.finishedTime = builder.finishedTime;
        this.operationProgressSet = builder.operationProgressSet;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.successCount = builder.successCount;
        this.supportCancel = builder.supportCancel;
        this.taskAction = builder.taskAction;
        this.taskId = builder.taskId;
        this.taskProcess = builder.taskProcess;
        this.taskStatus = builder.taskStatus;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTaskAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return failedCount
     */
    public Integer getFailedCount() {
        return this.failedCount;
    }

    /**
     * @return finishedTime
     */
    public String getFinishedTime() {
        return this.finishedTime;
    }

    /**
     * @return operationProgressSet
     */
    public OperationProgressSet getOperationProgressSet() {
        return this.operationProgressSet;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successCount
     */
    public Integer getSuccessCount() {
        return this.successCount;
    }

    /**
     * @return supportCancel
     */
    public String getSupportCancel() {
        return this.supportCancel;
    }

    /**
     * @return taskAction
     */
    public String getTaskAction() {
        return this.taskAction;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskProcess
     */
    public String getTaskProcess() {
        return this.taskProcess;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String creationTime; 
        private Integer failedCount; 
        private String finishedTime; 
        private OperationProgressSet operationProgressSet; 
        private String regionId; 
        private String requestId; 
        private Integer successCount; 
        private String supportCancel; 
        private String taskAction; 
        private String taskId; 
        private String taskProcess; 
        private String taskStatus; 
        private Integer totalCount; 

        /**
         * The time when the task was created.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * The number of failed tasks.
         */
        public Builder failedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * The time when the task was complete.
         */
        public Builder finishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }

        /**
         * An array consisting of OperationProgress data of each subtask.
         */
        public Builder operationProgressSet(OperationProgressSet operationProgressSet) {
            this.operationProgressSet = operationProgressSet;
            return this;
        }

        /**
         * The region ID of the task.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * The number of completed tasks.
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        /**
         * Indicates whether the task can be canceled ([CancelTask](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/canceltask)). Valid values: 
         * <p>
         * 
         * - true: The task can be canceled.
         * - false: The task cannot be canceled.
         */
        public Builder supportCancel(String supportCancel) {
            this.supportCancel = supportCancel;
            return this;
        }

        /**
         * The operation name of the task.
         */
        public Builder taskAction(String taskAction) {
            this.taskAction = taskAction;
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
         * The progress of the task.
         */
        public Builder taskProcess(String taskProcess) {
            this.taskProcess = taskProcess;
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
         * The total number of tasks.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTaskAttributeResponseBody build() {
            return new DescribeTaskAttributeResponseBody(this);
        } 

    } 

    public static class RelatedItem extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private RelatedItem(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedItem create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The name of the related item.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the related item.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RelatedItem build() {
                return new RelatedItem(this);
            } 

        } 

    }
    public static class RelatedItemSet extends TeaModel {
        @NameInMap("RelatedItem")
        private java.util.List < RelatedItem> relatedItem;

        private RelatedItemSet(Builder builder) {
            this.relatedItem = builder.relatedItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedItemSet create() {
            return builder().build();
        }

        /**
         * @return relatedItem
         */
        public java.util.List < RelatedItem> getRelatedItem() {
            return this.relatedItem;
        }

        public static final class Builder {
            private java.util.List < RelatedItem> relatedItem; 

            /**
             * RelatedItem.
             */
            public Builder relatedItem(java.util.List < RelatedItem> relatedItem) {
                this.relatedItem = relatedItem;
                return this;
            }

            public RelatedItemSet build() {
                return new RelatedItemSet(this);
            } 

        } 

    }
    public static class OperationProgress extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("OperationStatus")
        private String operationStatus;

        @NameInMap("RelatedItemSet")
        private RelatedItemSet relatedItemSet;

        private OperationProgress(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMsg = builder.errorMsg;
            this.operationStatus = builder.operationStatus;
            this.relatedItemSet = builder.relatedItemSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationProgress create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return operationStatus
         */
        public String getOperationStatus() {
            return this.operationStatus;
        }

        /**
         * @return relatedItemSet
         */
        public RelatedItemSet getRelatedItemSet() {
            return this.relatedItemSet;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMsg; 
            private String operationStatus; 
            private RelatedItemSet relatedItemSet; 

            /**
             * The error code.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * The status of the operation.
             */
            public Builder operationStatus(String operationStatus) {
                this.operationStatus = operationStatus;
                return this;
            }

            /**
             * An array consisting of RelatedItem data.
             */
            public Builder relatedItemSet(RelatedItemSet relatedItemSet) {
                this.relatedItemSet = relatedItemSet;
                return this;
            }

            public OperationProgress build() {
                return new OperationProgress(this);
            } 

        } 

    }
    public static class OperationProgressSet extends TeaModel {
        @NameInMap("OperationProgress")
        private java.util.List < OperationProgress> operationProgress;

        private OperationProgressSet(Builder builder) {
            this.operationProgress = builder.operationProgress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationProgressSet create() {
            return builder().build();
        }

        /**
         * @return operationProgress
         */
        public java.util.List < OperationProgress> getOperationProgress() {
            return this.operationProgress;
        }

        public static final class Builder {
            private java.util.List < OperationProgress> operationProgress; 

            /**
             * OperationProgress.
             */
            public Builder operationProgress(java.util.List < OperationProgress> operationProgress) {
                this.operationProgress = operationProgress;
                return this;
            }

            public OperationProgressSet build() {
                return new OperationProgressSet(this);
            } 

        } 

    }
}
