// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link DescribeSlowLogHistogramAsyncResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowLogHistogramAsyncResponseBody</p>
 */
public class DescribeSlowLogHistogramAsyncResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeSlowLogHistogramAsyncResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlowLogHistogramAsyncResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(DescribeSlowLogHistogramAsyncResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>AsyncResult<Histogram>。</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSlowLogHistogramAsyncResponseBody build() {
            return new DescribeSlowLogHistogramAsyncResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSlowLogHistogramAsyncResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogHistogramAsyncResponseBody</p>
     */
    public static class InsItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private java.util.List<Long> count;

        @com.aliyun.core.annotation.NameInMap("InsId")
        private String insId;

        @com.aliyun.core.annotation.NameInMap("InsRole")
        private String insRole;

        private InsItems(Builder builder) {
            this.count = builder.count;
            this.insId = builder.insId;
            this.insRole = builder.insRole;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InsItems create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public java.util.List<Long> getCount() {
            return this.count;
        }

        /**
         * @return insId
         */
        public String getInsId() {
            return this.insId;
        }

        /**
         * @return insRole
         */
        public String getInsRole() {
            return this.insRole;
        }

        public static final class Builder {
            private java.util.List<Long> count; 
            private String insId; 
            private String insRole; 

            private Builder() {
            } 

            private Builder(InsItems model) {
                this.count = model.count;
                this.insId = model.insId;
                this.insRole = model.insRole;
            } 

            /**
             * Count.
             */
            public Builder count(java.util.List<Long> count) {
                this.count = count;
                return this;
            }

            /**
             * InsId.
             */
            public Builder insId(String insId) {
                this.insId = insId;
                return this;
            }

            /**
             * InsRole.
             */
            public Builder insRole(String insRole) {
                this.insRole = insRole;
                return this;
            }

            public InsItems build() {
                return new InsItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSlowLogHistogramAsyncResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogHistogramAsyncResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private java.util.List<Long> count;

        @com.aliyun.core.annotation.NameInMap("InsItems")
        private java.util.List<InsItems> insItems;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        private Item(Builder builder) {
            this.count = builder.count;
            this.insItems = builder.insItems;
            this.nodeId = builder.nodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public java.util.List<Long> getCount() {
            return this.count;
        }

        /**
         * @return insItems
         */
        public java.util.List<InsItems> getInsItems() {
            return this.insItems;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        public static final class Builder {
            private java.util.List<Long> count; 
            private java.util.List<InsItems> insItems; 
            private String nodeId; 

            private Builder() {
            } 

            private Builder(Item model) {
                this.count = model.count;
                this.insItems = model.insItems;
                this.nodeId = model.nodeId;
            } 

            /**
             * Count.
             */
            public Builder count(java.util.List<Long> count) {
                this.count = count;
                return this;
            }

            /**
             * InsItems.
             */
            public Builder insItems(java.util.List<InsItems> insItems) {
                this.insItems = insItems;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSlowLogHistogramAsyncResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogHistogramAsyncResponseBody</p>
     */
    public static class DataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgCPUTime")
        private java.util.List<Double> avgCPUTime;

        @com.aliyun.core.annotation.NameInMap("AvgDocExamined")
        private java.util.List<Double> avgDocExamined;

        @com.aliyun.core.annotation.NameInMap("AvgFrows")
        private java.util.List<Double> avgFrows;

        @com.aliyun.core.annotation.NameInMap("AvgIOWrites")
        private java.util.List<Double> avgIOWrites;

        @com.aliyun.core.annotation.NameInMap("AvgKeysExamined")
        private java.util.List<Double> avgKeysExamined;

        @com.aliyun.core.annotation.NameInMap("AvgLastRowsCountAffected")
        private java.util.List<Double> avgLastRowsCountAffected;

        @com.aliyun.core.annotation.NameInMap("AvgLockTime")
        private java.util.List<Double> avgLockTime;

        @com.aliyun.core.annotation.NameInMap("AvgLogicalIOReads")
        private java.util.List<Double> avgLogicalIOReads;

        @com.aliyun.core.annotation.NameInMap("AvgPhysicalIOReads")
        private java.util.List<Double> avgPhysicalIOReads;

        @com.aliyun.core.annotation.NameInMap("AvgReturnNum")
        private java.util.List<Double> avgReturnNum;

        @com.aliyun.core.annotation.NameInMap("AvgRows")
        private java.util.List<Double> avgRows;

        @com.aliyun.core.annotation.NameInMap("AvgRowsCountAffected")
        private java.util.List<Double> avgRowsCountAffected;

        @com.aliyun.core.annotation.NameInMap("AvgRowsExamined")
        private java.util.List<Double> avgRowsExamined;

        @com.aliyun.core.annotation.NameInMap("AvgRowsSent")
        private java.util.List<Double> avgRowsSent;

        @com.aliyun.core.annotation.NameInMap("AvgRt")
        private java.util.List<Double> avgRt;

        @com.aliyun.core.annotation.NameInMap("AvgScnt")
        private java.util.List<Double> avgScnt;

        @com.aliyun.core.annotation.NameInMap("CPUTime")
        private java.util.List<Double> CPUTime;

        @com.aliyun.core.annotation.NameInMap("Count")
        private java.util.List<Long> count;

        @com.aliyun.core.annotation.NameInMap("DocExamined")
        private java.util.List<Long> docExamined;

        @com.aliyun.core.annotation.NameInMap("Frows")
        private java.util.List<Long> frows;

        @com.aliyun.core.annotation.NameInMap("IOWrites")
        private java.util.List<Long> IOWrites;

        @com.aliyun.core.annotation.NameInMap("Item")
        private java.util.List<Item> item;

        @com.aliyun.core.annotation.NameInMap("KeysExamined")
        private java.util.List<Long> keysExamined;

        @com.aliyun.core.annotation.NameInMap("LastRowsCountAffected")
        private java.util.List<Long> lastRowsCountAffected;

        @com.aliyun.core.annotation.NameInMap("LockTime")
        private java.util.List<Double> lockTime;

        @com.aliyun.core.annotation.NameInMap("LogicalIOReads")
        private java.util.List<Long> logicalIOReads;

        @com.aliyun.core.annotation.NameInMap("MaxCPUTime")
        private java.util.List<Double> maxCPUTime;

        @com.aliyun.core.annotation.NameInMap("MaxDocExamined")
        private java.util.List<Long> maxDocExamined;

        @com.aliyun.core.annotation.NameInMap("MaxFrows")
        private java.util.List<Long> maxFrows;

        @com.aliyun.core.annotation.NameInMap("MaxIOWrites")
        private java.util.List<Long> maxIOWrites;

        @com.aliyun.core.annotation.NameInMap("MaxKeysExamined")
        private java.util.List<Long> maxKeysExamined;

        @com.aliyun.core.annotation.NameInMap("MaxLastRowsCountAffected")
        private java.util.List<Long> maxLastRowsCountAffected;

        @com.aliyun.core.annotation.NameInMap("MaxLockTime")
        private java.util.List<Double> maxLockTime;

        @com.aliyun.core.annotation.NameInMap("MaxLogicalIOReads")
        private java.util.List<Long> maxLogicalIOReads;

        @com.aliyun.core.annotation.NameInMap("MaxPhysicalIOReads")
        private java.util.List<Long> maxPhysicalIOReads;

        @com.aliyun.core.annotation.NameInMap("MaxReturnNum")
        private java.util.List<Long> maxReturnNum;

        @com.aliyun.core.annotation.NameInMap("MaxRows")
        private java.util.List<Long> maxRows;

        @com.aliyun.core.annotation.NameInMap("MaxRowsCountAffected")
        private java.util.List<Long> maxRowsCountAffected;

        @com.aliyun.core.annotation.NameInMap("MaxRowsExamined")
        private java.util.List<Long> maxRowsExamined;

        @com.aliyun.core.annotation.NameInMap("MaxRowsSent")
        private java.util.List<Long> maxRowsSent;

        @com.aliyun.core.annotation.NameInMap("MaxRt")
        private java.util.List<Double> maxRt;

        @com.aliyun.core.annotation.NameInMap("MaxScnt")
        private java.util.List<Long> maxScnt;

        @com.aliyun.core.annotation.NameInMap("PhysicalIOReads")
        private java.util.List<Long> physicalIOReads;

        @com.aliyun.core.annotation.NameInMap("ReturnNum")
        private java.util.List<Long> returnNum;

        @com.aliyun.core.annotation.NameInMap("Rows")
        private java.util.List<Long> rows;

        @com.aliyun.core.annotation.NameInMap("RowsCountAffected")
        private java.util.List<Long> rowsCountAffected;

        @com.aliyun.core.annotation.NameInMap("RowsExamined")
        private java.util.List<Long> rowsExamined;

        @com.aliyun.core.annotation.NameInMap("RowsSent")
        private java.util.List<Long> rowsSent;

        @com.aliyun.core.annotation.NameInMap("Rt")
        private java.util.List<Double> rt;

        @com.aliyun.core.annotation.NameInMap("Scnt")
        private java.util.List<Long> scnt;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("Ts")
        private java.util.List<Long> ts;

        @com.aliyun.core.annotation.NameInMap("TsEnd")
        private java.util.List<Long> tsEnd;

        private DataData(Builder builder) {
            this.avgCPUTime = builder.avgCPUTime;
            this.avgDocExamined = builder.avgDocExamined;
            this.avgFrows = builder.avgFrows;
            this.avgIOWrites = builder.avgIOWrites;
            this.avgKeysExamined = builder.avgKeysExamined;
            this.avgLastRowsCountAffected = builder.avgLastRowsCountAffected;
            this.avgLockTime = builder.avgLockTime;
            this.avgLogicalIOReads = builder.avgLogicalIOReads;
            this.avgPhysicalIOReads = builder.avgPhysicalIOReads;
            this.avgReturnNum = builder.avgReturnNum;
            this.avgRows = builder.avgRows;
            this.avgRowsCountAffected = builder.avgRowsCountAffected;
            this.avgRowsExamined = builder.avgRowsExamined;
            this.avgRowsSent = builder.avgRowsSent;
            this.avgRt = builder.avgRt;
            this.avgScnt = builder.avgScnt;
            this.CPUTime = builder.CPUTime;
            this.count = builder.count;
            this.docExamined = builder.docExamined;
            this.frows = builder.frows;
            this.IOWrites = builder.IOWrites;
            this.item = builder.item;
            this.keysExamined = builder.keysExamined;
            this.lastRowsCountAffected = builder.lastRowsCountAffected;
            this.lockTime = builder.lockTime;
            this.logicalIOReads = builder.logicalIOReads;
            this.maxCPUTime = builder.maxCPUTime;
            this.maxDocExamined = builder.maxDocExamined;
            this.maxFrows = builder.maxFrows;
            this.maxIOWrites = builder.maxIOWrites;
            this.maxKeysExamined = builder.maxKeysExamined;
            this.maxLastRowsCountAffected = builder.maxLastRowsCountAffected;
            this.maxLockTime = builder.maxLockTime;
            this.maxLogicalIOReads = builder.maxLogicalIOReads;
            this.maxPhysicalIOReads = builder.maxPhysicalIOReads;
            this.maxReturnNum = builder.maxReturnNum;
            this.maxRows = builder.maxRows;
            this.maxRowsCountAffected = builder.maxRowsCountAffected;
            this.maxRowsExamined = builder.maxRowsExamined;
            this.maxRowsSent = builder.maxRowsSent;
            this.maxRt = builder.maxRt;
            this.maxScnt = builder.maxScnt;
            this.physicalIOReads = builder.physicalIOReads;
            this.returnNum = builder.returnNum;
            this.rows = builder.rows;
            this.rowsCountAffected = builder.rowsCountAffected;
            this.rowsExamined = builder.rowsExamined;
            this.rowsSent = builder.rowsSent;
            this.rt = builder.rt;
            this.scnt = builder.scnt;
            this.total = builder.total;
            this.ts = builder.ts;
            this.tsEnd = builder.tsEnd;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return avgCPUTime
         */
        public java.util.List<Double> getAvgCPUTime() {
            return this.avgCPUTime;
        }

        /**
         * @return avgDocExamined
         */
        public java.util.List<Double> getAvgDocExamined() {
            return this.avgDocExamined;
        }

        /**
         * @return avgFrows
         */
        public java.util.List<Double> getAvgFrows() {
            return this.avgFrows;
        }

        /**
         * @return avgIOWrites
         */
        public java.util.List<Double> getAvgIOWrites() {
            return this.avgIOWrites;
        }

        /**
         * @return avgKeysExamined
         */
        public java.util.List<Double> getAvgKeysExamined() {
            return this.avgKeysExamined;
        }

        /**
         * @return avgLastRowsCountAffected
         */
        public java.util.List<Double> getAvgLastRowsCountAffected() {
            return this.avgLastRowsCountAffected;
        }

        /**
         * @return avgLockTime
         */
        public java.util.List<Double> getAvgLockTime() {
            return this.avgLockTime;
        }

        /**
         * @return avgLogicalIOReads
         */
        public java.util.List<Double> getAvgLogicalIOReads() {
            return this.avgLogicalIOReads;
        }

        /**
         * @return avgPhysicalIOReads
         */
        public java.util.List<Double> getAvgPhysicalIOReads() {
            return this.avgPhysicalIOReads;
        }

        /**
         * @return avgReturnNum
         */
        public java.util.List<Double> getAvgReturnNum() {
            return this.avgReturnNum;
        }

        /**
         * @return avgRows
         */
        public java.util.List<Double> getAvgRows() {
            return this.avgRows;
        }

        /**
         * @return avgRowsCountAffected
         */
        public java.util.List<Double> getAvgRowsCountAffected() {
            return this.avgRowsCountAffected;
        }

        /**
         * @return avgRowsExamined
         */
        public java.util.List<Double> getAvgRowsExamined() {
            return this.avgRowsExamined;
        }

        /**
         * @return avgRowsSent
         */
        public java.util.List<Double> getAvgRowsSent() {
            return this.avgRowsSent;
        }

        /**
         * @return avgRt
         */
        public java.util.List<Double> getAvgRt() {
            return this.avgRt;
        }

        /**
         * @return avgScnt
         */
        public java.util.List<Double> getAvgScnt() {
            return this.avgScnt;
        }

        /**
         * @return CPUTime
         */
        public java.util.List<Double> getCPUTime() {
            return this.CPUTime;
        }

        /**
         * @return count
         */
        public java.util.List<Long> getCount() {
            return this.count;
        }

        /**
         * @return docExamined
         */
        public java.util.List<Long> getDocExamined() {
            return this.docExamined;
        }

        /**
         * @return frows
         */
        public java.util.List<Long> getFrows() {
            return this.frows;
        }

        /**
         * @return IOWrites
         */
        public java.util.List<Long> getIOWrites() {
            return this.IOWrites;
        }

        /**
         * @return item
         */
        public java.util.List<Item> getItem() {
            return this.item;
        }

        /**
         * @return keysExamined
         */
        public java.util.List<Long> getKeysExamined() {
            return this.keysExamined;
        }

        /**
         * @return lastRowsCountAffected
         */
        public java.util.List<Long> getLastRowsCountAffected() {
            return this.lastRowsCountAffected;
        }

        /**
         * @return lockTime
         */
        public java.util.List<Double> getLockTime() {
            return this.lockTime;
        }

        /**
         * @return logicalIOReads
         */
        public java.util.List<Long> getLogicalIOReads() {
            return this.logicalIOReads;
        }

        /**
         * @return maxCPUTime
         */
        public java.util.List<Double> getMaxCPUTime() {
            return this.maxCPUTime;
        }

        /**
         * @return maxDocExamined
         */
        public java.util.List<Long> getMaxDocExamined() {
            return this.maxDocExamined;
        }

        /**
         * @return maxFrows
         */
        public java.util.List<Long> getMaxFrows() {
            return this.maxFrows;
        }

        /**
         * @return maxIOWrites
         */
        public java.util.List<Long> getMaxIOWrites() {
            return this.maxIOWrites;
        }

        /**
         * @return maxKeysExamined
         */
        public java.util.List<Long> getMaxKeysExamined() {
            return this.maxKeysExamined;
        }

        /**
         * @return maxLastRowsCountAffected
         */
        public java.util.List<Long> getMaxLastRowsCountAffected() {
            return this.maxLastRowsCountAffected;
        }

        /**
         * @return maxLockTime
         */
        public java.util.List<Double> getMaxLockTime() {
            return this.maxLockTime;
        }

        /**
         * @return maxLogicalIOReads
         */
        public java.util.List<Long> getMaxLogicalIOReads() {
            return this.maxLogicalIOReads;
        }

        /**
         * @return maxPhysicalIOReads
         */
        public java.util.List<Long> getMaxPhysicalIOReads() {
            return this.maxPhysicalIOReads;
        }

        /**
         * @return maxReturnNum
         */
        public java.util.List<Long> getMaxReturnNum() {
            return this.maxReturnNum;
        }

        /**
         * @return maxRows
         */
        public java.util.List<Long> getMaxRows() {
            return this.maxRows;
        }

        /**
         * @return maxRowsCountAffected
         */
        public java.util.List<Long> getMaxRowsCountAffected() {
            return this.maxRowsCountAffected;
        }

        /**
         * @return maxRowsExamined
         */
        public java.util.List<Long> getMaxRowsExamined() {
            return this.maxRowsExamined;
        }

        /**
         * @return maxRowsSent
         */
        public java.util.List<Long> getMaxRowsSent() {
            return this.maxRowsSent;
        }

        /**
         * @return maxRt
         */
        public java.util.List<Double> getMaxRt() {
            return this.maxRt;
        }

        /**
         * @return maxScnt
         */
        public java.util.List<Long> getMaxScnt() {
            return this.maxScnt;
        }

        /**
         * @return physicalIOReads
         */
        public java.util.List<Long> getPhysicalIOReads() {
            return this.physicalIOReads;
        }

        /**
         * @return returnNum
         */
        public java.util.List<Long> getReturnNum() {
            return this.returnNum;
        }

        /**
         * @return rows
         */
        public java.util.List<Long> getRows() {
            return this.rows;
        }

        /**
         * @return rowsCountAffected
         */
        public java.util.List<Long> getRowsCountAffected() {
            return this.rowsCountAffected;
        }

        /**
         * @return rowsExamined
         */
        public java.util.List<Long> getRowsExamined() {
            return this.rowsExamined;
        }

        /**
         * @return rowsSent
         */
        public java.util.List<Long> getRowsSent() {
            return this.rowsSent;
        }

        /**
         * @return rt
         */
        public java.util.List<Double> getRt() {
            return this.rt;
        }

        /**
         * @return scnt
         */
        public java.util.List<Long> getScnt() {
            return this.scnt;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return ts
         */
        public java.util.List<Long> getTs() {
            return this.ts;
        }

        /**
         * @return tsEnd
         */
        public java.util.List<Long> getTsEnd() {
            return this.tsEnd;
        }

        public static final class Builder {
            private java.util.List<Double> avgCPUTime; 
            private java.util.List<Double> avgDocExamined; 
            private java.util.List<Double> avgFrows; 
            private java.util.List<Double> avgIOWrites; 
            private java.util.List<Double> avgKeysExamined; 
            private java.util.List<Double> avgLastRowsCountAffected; 
            private java.util.List<Double> avgLockTime; 
            private java.util.List<Double> avgLogicalIOReads; 
            private java.util.List<Double> avgPhysicalIOReads; 
            private java.util.List<Double> avgReturnNum; 
            private java.util.List<Double> avgRows; 
            private java.util.List<Double> avgRowsCountAffected; 
            private java.util.List<Double> avgRowsExamined; 
            private java.util.List<Double> avgRowsSent; 
            private java.util.List<Double> avgRt; 
            private java.util.List<Double> avgScnt; 
            private java.util.List<Double> CPUTime; 
            private java.util.List<Long> count; 
            private java.util.List<Long> docExamined; 
            private java.util.List<Long> frows; 
            private java.util.List<Long> IOWrites; 
            private java.util.List<Item> item; 
            private java.util.List<Long> keysExamined; 
            private java.util.List<Long> lastRowsCountAffected; 
            private java.util.List<Double> lockTime; 
            private java.util.List<Long> logicalIOReads; 
            private java.util.List<Double> maxCPUTime; 
            private java.util.List<Long> maxDocExamined; 
            private java.util.List<Long> maxFrows; 
            private java.util.List<Long> maxIOWrites; 
            private java.util.List<Long> maxKeysExamined; 
            private java.util.List<Long> maxLastRowsCountAffected; 
            private java.util.List<Double> maxLockTime; 
            private java.util.List<Long> maxLogicalIOReads; 
            private java.util.List<Long> maxPhysicalIOReads; 
            private java.util.List<Long> maxReturnNum; 
            private java.util.List<Long> maxRows; 
            private java.util.List<Long> maxRowsCountAffected; 
            private java.util.List<Long> maxRowsExamined; 
            private java.util.List<Long> maxRowsSent; 
            private java.util.List<Double> maxRt; 
            private java.util.List<Long> maxScnt; 
            private java.util.List<Long> physicalIOReads; 
            private java.util.List<Long> returnNum; 
            private java.util.List<Long> rows; 
            private java.util.List<Long> rowsCountAffected; 
            private java.util.List<Long> rowsExamined; 
            private java.util.List<Long> rowsSent; 
            private java.util.List<Double> rt; 
            private java.util.List<Long> scnt; 
            private Long total; 
            private java.util.List<Long> ts; 
            private java.util.List<Long> tsEnd; 

            private Builder() {
            } 

            private Builder(DataData model) {
                this.avgCPUTime = model.avgCPUTime;
                this.avgDocExamined = model.avgDocExamined;
                this.avgFrows = model.avgFrows;
                this.avgIOWrites = model.avgIOWrites;
                this.avgKeysExamined = model.avgKeysExamined;
                this.avgLastRowsCountAffected = model.avgLastRowsCountAffected;
                this.avgLockTime = model.avgLockTime;
                this.avgLogicalIOReads = model.avgLogicalIOReads;
                this.avgPhysicalIOReads = model.avgPhysicalIOReads;
                this.avgReturnNum = model.avgReturnNum;
                this.avgRows = model.avgRows;
                this.avgRowsCountAffected = model.avgRowsCountAffected;
                this.avgRowsExamined = model.avgRowsExamined;
                this.avgRowsSent = model.avgRowsSent;
                this.avgRt = model.avgRt;
                this.avgScnt = model.avgScnt;
                this.CPUTime = model.CPUTime;
                this.count = model.count;
                this.docExamined = model.docExamined;
                this.frows = model.frows;
                this.IOWrites = model.IOWrites;
                this.item = model.item;
                this.keysExamined = model.keysExamined;
                this.lastRowsCountAffected = model.lastRowsCountAffected;
                this.lockTime = model.lockTime;
                this.logicalIOReads = model.logicalIOReads;
                this.maxCPUTime = model.maxCPUTime;
                this.maxDocExamined = model.maxDocExamined;
                this.maxFrows = model.maxFrows;
                this.maxIOWrites = model.maxIOWrites;
                this.maxKeysExamined = model.maxKeysExamined;
                this.maxLastRowsCountAffected = model.maxLastRowsCountAffected;
                this.maxLockTime = model.maxLockTime;
                this.maxLogicalIOReads = model.maxLogicalIOReads;
                this.maxPhysicalIOReads = model.maxPhysicalIOReads;
                this.maxReturnNum = model.maxReturnNum;
                this.maxRows = model.maxRows;
                this.maxRowsCountAffected = model.maxRowsCountAffected;
                this.maxRowsExamined = model.maxRowsExamined;
                this.maxRowsSent = model.maxRowsSent;
                this.maxRt = model.maxRt;
                this.maxScnt = model.maxScnt;
                this.physicalIOReads = model.physicalIOReads;
                this.returnNum = model.returnNum;
                this.rows = model.rows;
                this.rowsCountAffected = model.rowsCountAffected;
                this.rowsExamined = model.rowsExamined;
                this.rowsSent = model.rowsSent;
                this.rt = model.rt;
                this.scnt = model.scnt;
                this.total = model.total;
                this.ts = model.ts;
                this.tsEnd = model.tsEnd;
            } 

            /**
             * AvgCPUTime.
             */
            public Builder avgCPUTime(java.util.List<Double> avgCPUTime) {
                this.avgCPUTime = avgCPUTime;
                return this;
            }

            /**
             * AvgDocExamined.
             */
            public Builder avgDocExamined(java.util.List<Double> avgDocExamined) {
                this.avgDocExamined = avgDocExamined;
                return this;
            }

            /**
             * AvgFrows.
             */
            public Builder avgFrows(java.util.List<Double> avgFrows) {
                this.avgFrows = avgFrows;
                return this;
            }

            /**
             * AvgIOWrites.
             */
            public Builder avgIOWrites(java.util.List<Double> avgIOWrites) {
                this.avgIOWrites = avgIOWrites;
                return this;
            }

            /**
             * AvgKeysExamined.
             */
            public Builder avgKeysExamined(java.util.List<Double> avgKeysExamined) {
                this.avgKeysExamined = avgKeysExamined;
                return this;
            }

            /**
             * AvgLastRowsCountAffected.
             */
            public Builder avgLastRowsCountAffected(java.util.List<Double> avgLastRowsCountAffected) {
                this.avgLastRowsCountAffected = avgLastRowsCountAffected;
                return this;
            }

            /**
             * AvgLockTime.
             */
            public Builder avgLockTime(java.util.List<Double> avgLockTime) {
                this.avgLockTime = avgLockTime;
                return this;
            }

            /**
             * AvgLogicalIOReads.
             */
            public Builder avgLogicalIOReads(java.util.List<Double> avgLogicalIOReads) {
                this.avgLogicalIOReads = avgLogicalIOReads;
                return this;
            }

            /**
             * AvgPhysicalIOReads.
             */
            public Builder avgPhysicalIOReads(java.util.List<Double> avgPhysicalIOReads) {
                this.avgPhysicalIOReads = avgPhysicalIOReads;
                return this;
            }

            /**
             * AvgReturnNum.
             */
            public Builder avgReturnNum(java.util.List<Double> avgReturnNum) {
                this.avgReturnNum = avgReturnNum;
                return this;
            }

            /**
             * AvgRows.
             */
            public Builder avgRows(java.util.List<Double> avgRows) {
                this.avgRows = avgRows;
                return this;
            }

            /**
             * AvgRowsCountAffected.
             */
            public Builder avgRowsCountAffected(java.util.List<Double> avgRowsCountAffected) {
                this.avgRowsCountAffected = avgRowsCountAffected;
                return this;
            }

            /**
             * AvgRowsExamined.
             */
            public Builder avgRowsExamined(java.util.List<Double> avgRowsExamined) {
                this.avgRowsExamined = avgRowsExamined;
                return this;
            }

            /**
             * AvgRowsSent.
             */
            public Builder avgRowsSent(java.util.List<Double> avgRowsSent) {
                this.avgRowsSent = avgRowsSent;
                return this;
            }

            /**
             * AvgRt.
             */
            public Builder avgRt(java.util.List<Double> avgRt) {
                this.avgRt = avgRt;
                return this;
            }

            /**
             * AvgScnt.
             */
            public Builder avgScnt(java.util.List<Double> avgScnt) {
                this.avgScnt = avgScnt;
                return this;
            }

            /**
             * CPUTime.
             */
            public Builder CPUTime(java.util.List<Double> CPUTime) {
                this.CPUTime = CPUTime;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(java.util.List<Long> count) {
                this.count = count;
                return this;
            }

            /**
             * DocExamined.
             */
            public Builder docExamined(java.util.List<Long> docExamined) {
                this.docExamined = docExamined;
                return this;
            }

            /**
             * Frows.
             */
            public Builder frows(java.util.List<Long> frows) {
                this.frows = frows;
                return this;
            }

            /**
             * IOWrites.
             */
            public Builder IOWrites(java.util.List<Long> IOWrites) {
                this.IOWrites = IOWrites;
                return this;
            }

            /**
             * Item.
             */
            public Builder item(java.util.List<Item> item) {
                this.item = item;
                return this;
            }

            /**
             * KeysExamined.
             */
            public Builder keysExamined(java.util.List<Long> keysExamined) {
                this.keysExamined = keysExamined;
                return this;
            }

            /**
             * LastRowsCountAffected.
             */
            public Builder lastRowsCountAffected(java.util.List<Long> lastRowsCountAffected) {
                this.lastRowsCountAffected = lastRowsCountAffected;
                return this;
            }

            /**
             * LockTime.
             */
            public Builder lockTime(java.util.List<Double> lockTime) {
                this.lockTime = lockTime;
                return this;
            }

            /**
             * LogicalIOReads.
             */
            public Builder logicalIOReads(java.util.List<Long> logicalIOReads) {
                this.logicalIOReads = logicalIOReads;
                return this;
            }

            /**
             * MaxCPUTime.
             */
            public Builder maxCPUTime(java.util.List<Double> maxCPUTime) {
                this.maxCPUTime = maxCPUTime;
                return this;
            }

            /**
             * MaxDocExamined.
             */
            public Builder maxDocExamined(java.util.List<Long> maxDocExamined) {
                this.maxDocExamined = maxDocExamined;
                return this;
            }

            /**
             * MaxFrows.
             */
            public Builder maxFrows(java.util.List<Long> maxFrows) {
                this.maxFrows = maxFrows;
                return this;
            }

            /**
             * MaxIOWrites.
             */
            public Builder maxIOWrites(java.util.List<Long> maxIOWrites) {
                this.maxIOWrites = maxIOWrites;
                return this;
            }

            /**
             * MaxKeysExamined.
             */
            public Builder maxKeysExamined(java.util.List<Long> maxKeysExamined) {
                this.maxKeysExamined = maxKeysExamined;
                return this;
            }

            /**
             * MaxLastRowsCountAffected.
             */
            public Builder maxLastRowsCountAffected(java.util.List<Long> maxLastRowsCountAffected) {
                this.maxLastRowsCountAffected = maxLastRowsCountAffected;
                return this;
            }

            /**
             * MaxLockTime.
             */
            public Builder maxLockTime(java.util.List<Double> maxLockTime) {
                this.maxLockTime = maxLockTime;
                return this;
            }

            /**
             * MaxLogicalIOReads.
             */
            public Builder maxLogicalIOReads(java.util.List<Long> maxLogicalIOReads) {
                this.maxLogicalIOReads = maxLogicalIOReads;
                return this;
            }

            /**
             * MaxPhysicalIOReads.
             */
            public Builder maxPhysicalIOReads(java.util.List<Long> maxPhysicalIOReads) {
                this.maxPhysicalIOReads = maxPhysicalIOReads;
                return this;
            }

            /**
             * MaxReturnNum.
             */
            public Builder maxReturnNum(java.util.List<Long> maxReturnNum) {
                this.maxReturnNum = maxReturnNum;
                return this;
            }

            /**
             * MaxRows.
             */
            public Builder maxRows(java.util.List<Long> maxRows) {
                this.maxRows = maxRows;
                return this;
            }

            /**
             * MaxRowsCountAffected.
             */
            public Builder maxRowsCountAffected(java.util.List<Long> maxRowsCountAffected) {
                this.maxRowsCountAffected = maxRowsCountAffected;
                return this;
            }

            /**
             * MaxRowsExamined.
             */
            public Builder maxRowsExamined(java.util.List<Long> maxRowsExamined) {
                this.maxRowsExamined = maxRowsExamined;
                return this;
            }

            /**
             * MaxRowsSent.
             */
            public Builder maxRowsSent(java.util.List<Long> maxRowsSent) {
                this.maxRowsSent = maxRowsSent;
                return this;
            }

            /**
             * MaxRt.
             */
            public Builder maxRt(java.util.List<Double> maxRt) {
                this.maxRt = maxRt;
                return this;
            }

            /**
             * MaxScnt.
             */
            public Builder maxScnt(java.util.List<Long> maxScnt) {
                this.maxScnt = maxScnt;
                return this;
            }

            /**
             * PhysicalIOReads.
             */
            public Builder physicalIOReads(java.util.List<Long> physicalIOReads) {
                this.physicalIOReads = physicalIOReads;
                return this;
            }

            /**
             * ReturnNum.
             */
            public Builder returnNum(java.util.List<Long> returnNum) {
                this.returnNum = returnNum;
                return this;
            }

            /**
             * Rows.
             */
            public Builder rows(java.util.List<Long> rows) {
                this.rows = rows;
                return this;
            }

            /**
             * RowsCountAffected.
             */
            public Builder rowsCountAffected(java.util.List<Long> rowsCountAffected) {
                this.rowsCountAffected = rowsCountAffected;
                return this;
            }

            /**
             * RowsExamined.
             */
            public Builder rowsExamined(java.util.List<Long> rowsExamined) {
                this.rowsExamined = rowsExamined;
                return this;
            }

            /**
             * RowsSent.
             */
            public Builder rowsSent(java.util.List<Long> rowsSent) {
                this.rowsSent = rowsSent;
                return this;
            }

            /**
             * Rt.
             */
            public Builder rt(java.util.List<Double> rt) {
                this.rt = rt;
                return this;
            }

            /**
             * Scnt.
             */
            public Builder scnt(java.util.List<Long> scnt) {
                this.scnt = scnt;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * Ts.
             */
            public Builder ts(java.util.List<Long> ts) {
                this.ts = ts;
                return this;
            }

            /**
             * TsEnd.
             */
            public Builder tsEnd(java.util.List<Long> tsEnd) {
                this.tsEnd = tsEnd;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSlowLogHistogramAsyncResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogHistogramAsyncResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private DataData data;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private Integer errorCode;

        @com.aliyun.core.annotation.NameInMap("IsFinish")
        private Boolean isFinish;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RequestKey")
        private String requestKey;

        @com.aliyun.core.annotation.NameInMap("ResultId")
        private String resultId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private Data(Builder builder) {
            this.data = builder.data;
            this.errorCode = builder.errorCode;
            this.isFinish = builder.isFinish;
            this.message = builder.message;
            this.requestKey = builder.requestKey;
            this.resultId = builder.resultId;
            this.state = builder.state;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public DataData getData() {
            return this.data;
        }

        /**
         * @return errorCode
         */
        public Integer getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return isFinish
         */
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return requestKey
         */
        public String getRequestKey() {
            return this.requestKey;
        }

        /**
         * @return resultId
         */
        public String getResultId() {
            return this.resultId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private DataData data; 
            private Integer errorCode; 
            private Boolean isFinish; 
            private String message; 
            private String requestKey; 
            private String resultId; 
            private String state; 
            private Long timestamp; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.data = model.data;
                this.errorCode = model.errorCode;
                this.isFinish = model.isFinish;
                this.message = model.message;
                this.requestKey = model.requestKey;
                this.resultId = model.resultId;
                this.state = model.state;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>AsyncResult<Histogram>。</p>
             */
            public Builder data(DataData data) {
                this.data = data;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(Integer errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * IsFinish.
             */
            public Builder isFinish(Boolean isFinish) {
                this.isFinish = isFinish;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * RequestKey.
             */
            public Builder requestKey(String requestKey) {
                this.requestKey = requestKey;
                return this;
            }

            /**
             * ResultId.
             */
            public Builder resultId(String resultId) {
                this.resultId = resultId;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
