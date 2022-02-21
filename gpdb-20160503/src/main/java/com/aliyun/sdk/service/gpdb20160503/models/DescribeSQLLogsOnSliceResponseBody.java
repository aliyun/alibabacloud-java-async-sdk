// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLLogsOnSliceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLLogsOnSliceResponseBody</p>
 */
public class DescribeSQLLogsOnSliceResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SliceLogItems")
    private java.util.List < SliceLogItems> sliceLogItems;

    private DescribeSQLLogsOnSliceResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.sliceLogItems = builder.sliceLogItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLLogsOnSliceResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sliceLogItems
     */
    public java.util.List < SliceLogItems> getSliceLogItems() {
        return this.sliceLogItems;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private java.util.List < SliceLogItems> sliceLogItems; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * SliceLogItems.
         */
        public Builder sliceLogItems(java.util.List < SliceLogItems> sliceLogItems) {
            this.sliceLogItems = sliceLogItems;
            return this;
        }

        public DescribeSQLLogsOnSliceResponseBody build() {
            return new DescribeSQLLogsOnSliceResponseBody(this);
        } 

    } 

    public static class SliceLogItems extends TeaModel {
        @NameInMap("ExecuteCost")
        private Float executeCost;

        @NameInMap("ExecuteStatus")
        private String executeStatus;

        @NameInMap("OperationExecuteEndTime")
        private String operationExecuteEndTime;

        @NameInMap("OperationExecuteTime")
        private String operationExecuteTime;

        @NameInMap("PeakMemory")
        private Float peakMemory;

        @NameInMap("ReturnRowCounts")
        private Long returnRowCounts;

        @NameInMap("SegmentId")
        private String segmentId;

        @NameInMap("SegmentName")
        private String segmentName;

        private SliceLogItems(Builder builder) {
            this.executeCost = builder.executeCost;
            this.executeStatus = builder.executeStatus;
            this.operationExecuteEndTime = builder.operationExecuteEndTime;
            this.operationExecuteTime = builder.operationExecuteTime;
            this.peakMemory = builder.peakMemory;
            this.returnRowCounts = builder.returnRowCounts;
            this.segmentId = builder.segmentId;
            this.segmentName = builder.segmentName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SliceLogItems create() {
            return builder().build();
        }

        /**
         * @return executeCost
         */
        public Float getExecuteCost() {
            return this.executeCost;
        }

        /**
         * @return executeStatus
         */
        public String getExecuteStatus() {
            return this.executeStatus;
        }

        /**
         * @return operationExecuteEndTime
         */
        public String getOperationExecuteEndTime() {
            return this.operationExecuteEndTime;
        }

        /**
         * @return operationExecuteTime
         */
        public String getOperationExecuteTime() {
            return this.operationExecuteTime;
        }

        /**
         * @return peakMemory
         */
        public Float getPeakMemory() {
            return this.peakMemory;
        }

        /**
         * @return returnRowCounts
         */
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        /**
         * @return segmentId
         */
        public String getSegmentId() {
            return this.segmentId;
        }

        /**
         * @return segmentName
         */
        public String getSegmentName() {
            return this.segmentName;
        }

        public static final class Builder {
            private Float executeCost; 
            private String executeStatus; 
            private String operationExecuteEndTime; 
            private String operationExecuteTime; 
            private Float peakMemory; 
            private Long returnRowCounts; 
            private String segmentId; 
            private String segmentName; 

            /**
             * ExecuteCost.
             */
            public Builder executeCost(Float executeCost) {
                this.executeCost = executeCost;
                return this;
            }

            /**
             * ExecuteStatus.
             */
            public Builder executeStatus(String executeStatus) {
                this.executeStatus = executeStatus;
                return this;
            }

            /**
             * OperationExecuteEndTime.
             */
            public Builder operationExecuteEndTime(String operationExecuteEndTime) {
                this.operationExecuteEndTime = operationExecuteEndTime;
                return this;
            }

            /**
             * OperationExecuteTime.
             */
            public Builder operationExecuteTime(String operationExecuteTime) {
                this.operationExecuteTime = operationExecuteTime;
                return this;
            }

            /**
             * PeakMemory.
             */
            public Builder peakMemory(Float peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * ReturnRowCounts.
             */
            public Builder returnRowCounts(Long returnRowCounts) {
                this.returnRowCounts = returnRowCounts;
                return this;
            }

            /**
             * SegmentId.
             */
            public Builder segmentId(String segmentId) {
                this.segmentId = segmentId;
                return this;
            }

            /**
             * SegmentName.
             */
            public Builder segmentName(String segmentName) {
                this.segmentName = segmentName;
                return this;
            }

            public SliceLogItems build() {
                return new SliceLogItems(this);
            } 

        } 

    }
}
