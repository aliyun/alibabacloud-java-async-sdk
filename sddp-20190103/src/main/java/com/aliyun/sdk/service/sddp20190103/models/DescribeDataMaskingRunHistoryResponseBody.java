// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataMaskingRunHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataMaskingRunHistoryResponseBody</p>
 */
public class DescribeDataMaskingRunHistoryResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
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
        @NameInMap("ConflictCount")
        private Long conflictCount;

        @NameInMap("DstType")
        private Integer dstType;

        @NameInMap("DstTypeCode")
        private String dstTypeCode;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("FailCode")
        private String failCode;

        @NameInMap("FailMsg")
        private String failMsg;

        @NameInMap("HasDownloadFile")
        private Integer hasDownloadFile;

        @NameInMap("HasSubProcess")
        private Integer hasSubProcess;

        @NameInMap("Id")
        private Long id;

        @NameInMap("MaskingCount")
        private Long maskingCount;

        @NameInMap("Percentage")
        private Integer percentage;

        @NameInMap("RunIndex")
        private Integer runIndex;

        @NameInMap("SrcTableName")
        private String srcTableName;

        @NameInMap("SrcType")
        private Integer srcType;

        @NameInMap("SrcTypeCode")
        private String srcTypeCode;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("Type")
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
             * ConflictCount.
             */
            public Builder conflictCount(Long conflictCount) {
                this.conflictCount = conflictCount;
                return this;
            }

            /**
             * DstType.
             */
            public Builder dstType(Integer dstType) {
                this.dstType = dstType;
                return this;
            }

            /**
             * DstTypeCode.
             */
            public Builder dstTypeCode(String dstTypeCode) {
                this.dstTypeCode = dstTypeCode;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * FailCode.
             */
            public Builder failCode(String failCode) {
                this.failCode = failCode;
                return this;
            }

            /**
             * FailMsg.
             */
            public Builder failMsg(String failMsg) {
                this.failMsg = failMsg;
                return this;
            }

            /**
             * HasDownloadFile.
             */
            public Builder hasDownloadFile(Integer hasDownloadFile) {
                this.hasDownloadFile = hasDownloadFile;
                return this;
            }

            /**
             * HasSubProcess.
             */
            public Builder hasSubProcess(Integer hasSubProcess) {
                this.hasSubProcess = hasSubProcess;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * MaskingCount.
             */
            public Builder maskingCount(Long maskingCount) {
                this.maskingCount = maskingCount;
                return this;
            }

            /**
             * Percentage.
             */
            public Builder percentage(Integer percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * RunIndex.
             */
            public Builder runIndex(Integer runIndex) {
                this.runIndex = runIndex;
                return this;
            }

            /**
             * SrcTableName.
             */
            public Builder srcTableName(String srcTableName) {
                this.srcTableName = srcTableName;
                return this;
            }

            /**
             * SrcType.
             */
            public Builder srcType(Integer srcType) {
                this.srcType = srcType;
                return this;
            }

            /**
             * SrcTypeCode.
             */
            public Builder srcTypeCode(String srcTypeCode) {
                this.srcTypeCode = srcTypeCode;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Type.
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
