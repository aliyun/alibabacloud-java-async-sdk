// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeTaskAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTaskAttributeResponseBody</p>
 */
public class DescribeTaskAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("FailedCount")
    private Integer failedCount;

    @com.aliyun.core.annotation.NameInMap("FinishedTime")
    private String finishedTime;

    @com.aliyun.core.annotation.NameInMap("OperationProgressSet")
    private OperationProgressSet operationProgressSet;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
    private Integer successCount;

    @com.aliyun.core.annotation.NameInMap("SupportCancel")
    private String supportCancel;

    @com.aliyun.core.annotation.NameInMap("TaskAction")
    private String taskAction;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskProcess")
    private String taskProcess;

    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-11-23T02:13Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The number of failed tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder failedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * <p>The time when the task was complete.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-11-23T02:19Z</p>
         */
        public Builder finishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }

        /**
         * <p>An array consisting of OperationProgress data of each subtask.</p>
         */
        public Builder operationProgressSet(OperationProgressSet operationProgressSet) {
            this.operationProgressSet = operationProgressSet;
            return this;
        }

        /**
         * <p>The region ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of completed tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        /**
         * <p>Indicates whether the task can be canceled (<a href="https://www.alibabacloud.com/help/en/elastic-compute-service/latest/canceltask">CancelTask</a>). Valid values: </p>
         * <ul>
         * <li>true: The task can be canceled.</li>
         * <li>false: The task cannot be canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder supportCancel(String supportCancel) {
            this.supportCancel = supportCancel;
            return this;
        }

        /**
         * <p>The operation name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>ExportImage</p>
         */
        public Builder taskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>t-ce946ntx4wr****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The progress of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        public Builder taskProcess(String taskProcess) {
            this.taskProcess = taskProcess;
            return this;
        }

        /**
         * <p>The status of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * <p>The total number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTaskAttributeResponseBody build() {
            return new DescribeTaskAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTaskAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTaskAttributeResponseBody</p>
     */
    public static class RelatedItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The name of the related item.</p>
             * 
             * <strong>example:</strong>
             * <p>OSSObject</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the related item.</p>
             * 
             * <strong>example:</strong>
             * <p>MYOSSPRE_m-23f8tcp***_t-23ym6mv***.vhd</p>
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
    /**
     * 
     * {@link DescribeTaskAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTaskAttributeResponseBody</p>
     */
    public static class RelatedItemSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RelatedItem")
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
    /**
     * 
     * {@link DescribeTaskAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTaskAttributeResponseBody</p>
     */
    public static class OperationProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("OperationStatus")
        private String operationStatus;

        @com.aliyun.core.annotation.NameInMap("RelatedItemSet")
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
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>ParameterInvalid</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>The specified RegionId parameter is invalid.</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The status of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder operationStatus(String operationStatus) {
                this.operationStatus = operationStatus;
                return this;
            }

            /**
             * <p>An array consisting of RelatedItem data.</p>
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
    /**
     * 
     * {@link DescribeTaskAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTaskAttributeResponseBody</p>
     */
    public static class OperationProgressSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperationProgress")
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
