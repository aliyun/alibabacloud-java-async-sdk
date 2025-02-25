// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link DescribeDataMaskingRunHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataMaskingRunHistoryResponseBody</p>
 */
public class DescribeDataMaskingRunHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

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
    public java.util.List<Items> getItems() {
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
        private java.util.List<Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The execution information about the de-identification task.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>769FB3C1-F4C9-4******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDataMaskingRunHistoryResponseBody build() {
            return new DescribeDataMaskingRunHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataMaskingRunHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataMaskingRunHistoryResponseBody</p>
     */
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
             * <p>The number of rows that are in conflict with the data to be de-identified in the destination table to which the data to be de-identified is moved.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder conflictCount(Long conflictCount) {
                this.conflictCount = conflictCount;
                return this;
            }

            /**
             * <p>The type of the service to which the de-identified data belongs. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates OSS. The value indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder dstType(Integer dstType) {
                this.dstType = dstType;
                return this;
            }

            /**
             * <p>The service that stores the de-identified data. Valid values include <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder dstTypeCode(String dstTypeCode) {
                this.dstTypeCode = dstTypeCode;
                return this;
            }

            /**
             * <p>The end time of the de-identification task.</p>
             * 
             * <strong>example:</strong>
             * <p>1582251233000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The error code that is returned when the de-identification task fails.</p>
             * 
             * <strong>example:</strong>
             * <p>masking_task_not_found</p>
             */
            public Builder failCode(String failCode) {
                this.failCode = failCode;
                return this;
            }

            /**
             * <p>The reason why the de-identification task fails.</p>
             * 
             * <strong>example:</strong>
             * <p>error</p>
             */
            public Builder failMsg(String failMsg) {
                this.failMsg = failMsg;
                return this;
            }

            /**
             * <p>Indicates whether a file is available for download.</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hasDownloadFile(Integer hasDownloadFile) {
                this.hasDownloadFile = hasDownloadFile;
                return this;
            }

            /**
             * <p>The number of created subtasks.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder hasSubProcess(Integer hasSubProcess) {
                this.hasSubProcess = hasSubProcess;
                return this;
            }

            /**
             * <p>The ID of the task execution record.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The number of rows that are de-identified.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maskingCount(Long maskingCount) {
                this.maskingCount = maskingCount;
                return this;
            }

            /**
             * <p>The progress of the de-identification task.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percentage(Integer percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * <p>The number of times that the de-identification task is executed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder runIndex(Integer runIndex) {
                this.runIndex = runIndex;
                return this;
            }

            /**
             * <p>The name of the source table.</p>
             * 
             * <strong>example:</strong>
             * <p>add</p>
             */
            public Builder srcTableName(String srcTableName) {
                this.srcTableName = srcTableName;
                return this;
            }

            /**
             * <p>The type of the service to which the data to be de-identified belongs. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates OSS. The value indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder srcType(Integer srcType) {
                this.srcType = srcType;
                return this;
            }

            /**
             * <p>The service to which the data to be de-identified belongs. Valid values include <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder srcTypeCode(String srcTypeCode) {
                this.srcTypeCode = srcTypeCode;
                return this;
            }

            /**
             * <p>The time when the de-identification task was executed. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1582251233000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the de-identification task. Valid values:</p>
             * <ul>
             * <li><strong>-1</strong>: waiting</li>
             * <li><strong>0</strong>: being executed</li>
             * <li><strong>1</strong>: executed</li>
             * <li><strong>2</strong>: failed to be executed</li>
             * <li><strong>3</strong>: terminated</li>
             * <li><strong>4</strong>: partially failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the identification task.</p>
             * 
             * <strong>example:</strong>
             * <p>mt4HBgtw1B******</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The mode in which the de-identification task is executed. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: manual</li>
             * <li><strong>2</strong>: scheduled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
