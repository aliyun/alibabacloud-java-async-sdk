// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101.models;

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
 * {@link ListScanTasksByTargetResponseBody} extends {@link TeaModel}
 *
 * <p>ListScanTasksByTargetResponseBody</p>
 */
public class ListScanTasksByTargetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListScanTasksByTargetResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScanTasksByTargetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListScanTasksByTargetResponseBody model) {
            this.data = model.data;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of scan tasks on the current page.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The normalized page number that actually takes effect. This value may differ from the input parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The normalized number of entries per page that actually takes effect. This value may differ from the input parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The unique identifier of the request, used for troubleshooting and log tracing.</p>
         * 
         * <strong>example:</strong>
         * <p>1EBD0C05-6C1F-4C95-9C63-B7AB7B5A9C8E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of scan tasks that match the filter conditions within the last 366-day window.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListScanTasksByTargetResponseBody build() {
            return new ListScanTasksByTargetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListScanTasksByTargetResponseBody} extends {@link TeaModel}
     *
     * <p>ListScanTasksByTargetResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("ExecuteCaseCount")
        private Long executeCaseCount;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("SampleLevel")
        private Long sampleLevel;

        @com.aliyun.core.annotation.NameInMap("ScanType")
        private String scanType;

        @com.aliyun.core.annotation.NameInMap("ScannerTaskId")
        private String scannerTaskId;

        @com.aliyun.core.annotation.NameInMap("ScannerTaskMessage")
        private String scannerTaskMessage;

        @com.aliyun.core.annotation.NameInMap("ScannerTaskStatus")
        private String scannerTaskStatus;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TotalCaseCount")
        private Long totalCaseCount;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.executeCaseCount = builder.executeCaseCount;
            this.riskLevel = builder.riskLevel;
            this.sampleLevel = builder.sampleLevel;
            this.scanType = builder.scanType;
            this.scannerTaskId = builder.scannerTaskId;
            this.scannerTaskMessage = builder.scannerTaskMessage;
            this.scannerTaskStatus = builder.scannerTaskStatus;
            this.startTime = builder.startTime;
            this.taskName = builder.taskName;
            this.totalCaseCount = builder.totalCaseCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return executeCaseCount
         */
        public Long getExecuteCaseCount() {
            return this.executeCaseCount;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return sampleLevel
         */
        public Long getSampleLevel() {
            return this.sampleLevel;
        }

        /**
         * @return scanType
         */
        public String getScanType() {
            return this.scanType;
        }

        /**
         * @return scannerTaskId
         */
        public String getScannerTaskId() {
            return this.scannerTaskId;
        }

        /**
         * @return scannerTaskMessage
         */
        public String getScannerTaskMessage() {
            return this.scannerTaskMessage;
        }

        /**
         * @return scannerTaskStatus
         */
        public String getScannerTaskStatus() {
            return this.scannerTaskStatus;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return totalCaseCount
         */
        public Long getTotalCaseCount() {
            return this.totalCaseCount;
        }

        public static final class Builder {
            private Long createTime; 
            private Long endTime; 
            private Long executeCaseCount; 
            private String riskLevel; 
            private Long sampleLevel; 
            private String scanType; 
            private String scannerTaskId; 
            private String scannerTaskMessage; 
            private String scannerTaskStatus; 
            private Long startTime; 
            private String taskName; 
            private Long totalCaseCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.endTime = model.endTime;
                this.executeCaseCount = model.executeCaseCount;
                this.riskLevel = model.riskLevel;
                this.sampleLevel = model.sampleLevel;
                this.scanType = model.scanType;
                this.scannerTaskId = model.scannerTaskId;
                this.scannerTaskMessage = model.scannerTaskMessage;
                this.scannerTaskStatus = model.scannerTaskStatus;
                this.startTime = model.startTime;
                this.taskName = model.taskName;
                this.totalCaseCount = model.totalCaseCount;
            } 

            /**
             * <p>The task creation time, in milliseconds (Unix epoch milliseconds).</p>
             * 
             * <strong>example:</strong>
             * <p>1735689600000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The task end time, in milliseconds (Unix epoch milliseconds). This value is null if the task has not ended.</p>
             * 
             * <strong>example:</strong>
             * <p>1735689600000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The number of samples that the task has executed.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder executeCaseCount(Long executeCaseCount) {
                this.executeCaseCount = executeCaseCount;
                return this;
            }

            /**
             * <p>The risk level of the task result. This value is null if the task is not completed or no risk assessment has been generated.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The detection intensity of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder sampleLevel(Long sampleLevel) {
                this.sampleLevel = sampleLevel;
                return this;
            }

            /**
             * <p>The scan type of the task. Historical tasks without a recorded scan type are normalized to attack.</p>
             * 
             * <strong>example:</strong>
             * <p>attack</p>
             */
            public Builder scanType(String scanType) {
                this.scanType = scanType;
                return this;
            }

            /**
             * <p>The unique identifier of the scan task. You can use this ID for result download and status tracking.</p>
             * 
             * <strong>example:</strong>
             * <p>task-abc123def4567</p>
             */
            public Builder scannerTaskId(String scannerTaskId) {
                this.scannerTaskId = scannerTaskId;
                return this;
            }

            /**
             * <p>The task message. This value contains the failure reason if the task failed, or is empty if the task succeeded or no message is available.</p>
             * 
             * <strong>example:</strong>
             * <p>Execution timed out</p>
             */
            public Builder scannerTaskMessage(String scannerTaskMessage) {
                this.scannerTaskMessage = scannerTaskMessage;
                return this;
            }

            /**
             * <p>The current status of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>completed</p>
             */
            public Builder scannerTaskStatus(String scannerTaskStatus) {
                this.scannerTaskStatus = scannerTaskStatus;
                return this;
            }

            /**
             * <p>The task start time, in milliseconds (Unix epoch milliseconds). This value is null if the task has not started.</p>
             * 
             * <strong>example:</strong>
             * <p>1735689600000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The task name. If no name is specified during creation, the default value is &quot;Target Scan - target name&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>Target Scan - My Bailian Target</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The total number of samples that the task plans to execute.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder totalCaseCount(Long totalCaseCount) {
                this.totalCaseCount = totalCaseCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
