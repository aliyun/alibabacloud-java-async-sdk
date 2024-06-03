// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataMaskingRunHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataMaskingRunHistoryResponseBody</p>
 */
public class DescribeDataMaskingRunHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDataMaskingRunHistoryResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataMaskingRunHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List < Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The page number of the returned page.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The execution information about the de-identification task.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDataMaskingRunHistoryResponseBody build() {
            return new DescribeDataMaskingRunHistoryResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConflictCount")
        private Long conflictCount;

        @com.aliyun.core.annotation.NameInMap("DstType")
        private Integer dstType;

        @com.aliyun.core.annotation.NameInMap("DstTypeCode")
        private String dstTypeCode;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("FailCode")
        private String failCode;

        @com.aliyun.core.annotation.NameInMap("FailMsg")
        private String failMsg;

        @com.aliyun.core.annotation.NameInMap("HasDownloadFile")
        private Integer hasDownloadFile;

        @com.aliyun.core.annotation.NameInMap("HasSubProcess")
        private Integer hasSubProcess;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MaskingCount")
        private Long maskingCount;

        @com.aliyun.core.annotation.NameInMap("Percentage")
        private Integer percentage;

        @com.aliyun.core.annotation.NameInMap("RunIndex")
        private Integer runIndex;

        @com.aliyun.core.annotation.NameInMap("SrcTableName")
        private String srcTableName;

        @com.aliyun.core.annotation.NameInMap("SrcType")
        private Integer srcType;

        @com.aliyun.core.annotation.NameInMap("SrcTypeCode")
        private String srcTypeCode;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private Items(Builder builder) {
            this.conflictCount = builder.conflictCount;
            this.dstType = builder.dstType;
            this.dstTypeCode = builder.dstTypeCode;
            this.endTime = builder.endTime;
            this.failCode = builder.failCode;
            this.failMsg = builder.failMsg;
            this.hasDownloadFile = builder.hasDownloadFile;
            this.hasSubProcess = builder.hasSubProcess;
            this.id = builder.id;
            this.maskingCount = builder.maskingCount;
            this.percentage = builder.percentage;
            this.runIndex = builder.runIndex;
            this.srcTableName = builder.srcTableName;
            this.srcType = builder.srcType;
            this.srcTypeCode = builder.srcTypeCode;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return conflictCount
         */
        public Long getConflictCount() {
            return this.conflictCount;
        }

        /**
         * @return dstType
         */
        public Integer getDstType() {
            return this.dstType;
        }

        /**
         * @return dstTypeCode
         */
        public String getDstTypeCode() {
            return this.dstTypeCode;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return failCode
         */
        public String getFailCode() {
            return this.failCode;
        }

        /**
         * @return failMsg
         */
        public String getFailMsg() {
            return this.failMsg;
        }

        /**
         * @return hasDownloadFile
         */
        public Integer getHasDownloadFile() {
            return this.hasDownloadFile;
        }

        /**
         * @return hasSubProcess
         */
        public Integer getHasSubProcess() {
            return this.hasSubProcess;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return maskingCount
         */
        public Long getMaskingCount() {
            return this.maskingCount;
        }

        /**
         * @return percentage
         */
        public Integer getPercentage() {
            return this.percentage;
        }

        /**
         * @return runIndex
         */
        public Integer getRunIndex() {
            return this.runIndex;
        }

        /**
         * @return srcTableName
         */
        public String getSrcTableName() {
            return this.srcTableName;
        }

        /**
         * @return srcType
         */
        public Integer getSrcType() {
            return this.srcType;
        }

        /**
         * @return srcTypeCode
         */
        public String getSrcTypeCode() {
            return this.srcTypeCode;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Long conflictCount; 
            private Integer dstType; 
            private String dstTypeCode; 
            private Long endTime; 
            private String failCode; 
            private String failMsg; 
            private Integer hasDownloadFile; 
            private Integer hasSubProcess; 
            private Long id; 
            private Long maskingCount; 
            private Integer percentage; 
            private Integer runIndex; 
            private String srcTableName; 
            private Integer srcType; 
            private String srcTypeCode; 
            private Long startTime; 
            private Integer status; 
            private String taskId; 
            private Integer type; 

            /**
             * The number of rows that are in conflict with the data to be de-identified in the destination table to which the data to be de-identified is moved.
             */
            public Builder conflictCount(Long conflictCount) {
                this.conflictCount = conflictCount;
                return this;
            }

            /**
             * The type of the service to which the de-identified data belongs. Valid values: **1**, **2**, **3**, **4**, and **5**. The value 1 indicates MaxCompute. The value 2 indicates OSS. The value indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.
             */
            public Builder dstType(Integer dstType) {
                this.dstType = dstType;
                return this;
            }

            /**
             * The service that stores the de-identified data. Valid values include **MaxCompute, OSS, ADS, OTS, and RDS**.
             */
            public Builder dstTypeCode(String dstTypeCode) {
                this.dstTypeCode = dstTypeCode;
                return this;
            }

            /**
             * The end time of the de-identification task.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The error code that is returned when the de-identification task fails.
             */
            public Builder failCode(String failCode) {
                this.failCode = failCode;
                return this;
            }

            /**
             * The reason why the de-identification task fails.
             */
            public Builder failMsg(String failMsg) {
                this.failMsg = failMsg;
                return this;
            }

            /**
             * Indicates whether a file is available for download.
             * <p>
             * 
             * *   **1**: yes
             * *   **0**: no
             */
            public Builder hasDownloadFile(Integer hasDownloadFile) {
                this.hasDownloadFile = hasDownloadFile;
                return this;
            }

            /**
             * The number of created subtasks.
             */
            public Builder hasSubProcess(Integer hasSubProcess) {
                this.hasSubProcess = hasSubProcess;
                return this;
            }

            /**
             * The ID of the task execution record.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The number of rows that are de-identified.
             */
            public Builder maskingCount(Long maskingCount) {
                this.maskingCount = maskingCount;
                return this;
            }

            /**
             * The progress of the de-identification task.
             */
            public Builder percentage(Integer percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * The number of times that the de-identification task is executed.
             */
            public Builder runIndex(Integer runIndex) {
                this.runIndex = runIndex;
                return this;
            }

            /**
             * The name of the source table.
             */
            public Builder srcTableName(String srcTableName) {
                this.srcTableName = srcTableName;
                return this;
            }

            /**
             * The type of the service to which the data to be de-identified belongs. Valid values: **1**, **2**, **3**, **4**, and **5**. The value 1 indicates MaxCompute. The value 2 indicates OSS. The value indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.
             */
            public Builder srcType(Integer srcType) {
                this.srcType = srcType;
                return this;
            }

            /**
             * The service to which the data to be de-identified belongs. Valid values include **MaxCompute, OSS, ADS, OTS, and RDS**.
             */
            public Builder srcTypeCode(String srcTypeCode) {
                this.srcTypeCode = srcTypeCode;
                return this;
            }

            /**
             * The time when the de-identification task was executed. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the de-identification task. Valid values:
             * <p>
             * 
             * *   **-1**: waiting
             * *   **0**: being executed
             * *   **1**: executed
             * *   **2**: failed to be executed
             * *   **3**: terminated
             * *   **4**: partially failed
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the identification task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The mode in which the de-identification task is executed. Valid values:
             * <p>
             * 
             * *   **1**: manual
             * *   **2**: scheduled
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
