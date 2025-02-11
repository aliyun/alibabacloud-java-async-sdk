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
 * {@link DescribeSlowLogStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowLogStatisticResponseBody</p>
 */
public class DescribeSlowLogStatisticResponseBody extends TeaModel {
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

    private DescribeSlowLogStatisticResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlowLogStatisticResponseBody create() {
        return builder().build();
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

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>AsyncResult&lt;DBLogRecords<SlowLogStat>&gt;</p>
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

        public DescribeSlowLogStatisticResponseBody build() {
            return new DescribeSlowLogStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSlowLogStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogStatisticResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private java.util.List<Long> count;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        private Item(Builder builder) {
            this.count = builder.count;
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
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        public static final class Builder {
            private java.util.List<Long> count; 
            private String nodeId; 

            /**
             * Count.
             */
            public Builder count(java.util.List<Long> count) {
                this.count = count;
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
     * {@link DescribeSlowLogStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogStatisticResponseBody</p>
     */
    public static class Histogram extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgLockTime")
        private java.util.List<Double> avgLockTime;

        @com.aliyun.core.annotation.NameInMap("AvgRowsExamined")
        private java.util.List<Double> avgRowsExamined;

        @com.aliyun.core.annotation.NameInMap("AvgRowsSent")
        private java.util.List<Double> avgRowsSent;

        @com.aliyun.core.annotation.NameInMap("AvgRt")
        private java.util.List<Double> avgRt;

        @com.aliyun.core.annotation.NameInMap("Count")
        private java.util.List<Long> count;

        @com.aliyun.core.annotation.NameInMap("Item")
        private java.util.List<Item> item;

        @com.aliyun.core.annotation.NameInMap("LockTime")
        private java.util.List<Double> lockTime;

        @com.aliyun.core.annotation.NameInMap("MaxLockTime")
        private java.util.List<Double> maxLockTime;

        @com.aliyun.core.annotation.NameInMap("MaxRowsExamined")
        private java.util.List<Long> maxRowsExamined;

        @com.aliyun.core.annotation.NameInMap("MaxRowsSent")
        private java.util.List<Long> maxRowsSent;

        @com.aliyun.core.annotation.NameInMap("MaxRt")
        private java.util.List<Double> maxRt;

        @com.aliyun.core.annotation.NameInMap("RowsExamined")
        private java.util.List<Long> rowsExamined;

        @com.aliyun.core.annotation.NameInMap("RowsSent")
        private java.util.List<Long> rowsSent;

        @com.aliyun.core.annotation.NameInMap("Rt")
        private java.util.List<Double> rt;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("Ts")
        private java.util.List<Long> ts;

        @com.aliyun.core.annotation.NameInMap("TsEnd")
        private java.util.List<Long> tsEnd;

        private Histogram(Builder builder) {
            this.avgLockTime = builder.avgLockTime;
            this.avgRowsExamined = builder.avgRowsExamined;
            this.avgRowsSent = builder.avgRowsSent;
            this.avgRt = builder.avgRt;
            this.count = builder.count;
            this.item = builder.item;
            this.lockTime = builder.lockTime;
            this.maxLockTime = builder.maxLockTime;
            this.maxRowsExamined = builder.maxRowsExamined;
            this.maxRowsSent = builder.maxRowsSent;
            this.maxRt = builder.maxRt;
            this.rowsExamined = builder.rowsExamined;
            this.rowsSent = builder.rowsSent;
            this.rt = builder.rt;
            this.total = builder.total;
            this.ts = builder.ts;
            this.tsEnd = builder.tsEnd;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Histogram create() {
            return builder().build();
        }

        /**
         * @return avgLockTime
         */
        public java.util.List<Double> getAvgLockTime() {
            return this.avgLockTime;
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
         * @return count
         */
        public java.util.List<Long> getCount() {
            return this.count;
        }

        /**
         * @return item
         */
        public java.util.List<Item> getItem() {
            return this.item;
        }

        /**
         * @return lockTime
         */
        public java.util.List<Double> getLockTime() {
            return this.lockTime;
        }

        /**
         * @return maxLockTime
         */
        public java.util.List<Double> getMaxLockTime() {
            return this.maxLockTime;
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
            private java.util.List<Double> avgLockTime; 
            private java.util.List<Double> avgRowsExamined; 
            private java.util.List<Double> avgRowsSent; 
            private java.util.List<Double> avgRt; 
            private java.util.List<Long> count; 
            private java.util.List<Item> item; 
            private java.util.List<Double> lockTime; 
            private java.util.List<Double> maxLockTime; 
            private java.util.List<Long> maxRowsExamined; 
            private java.util.List<Long> maxRowsSent; 
            private java.util.List<Double> maxRt; 
            private java.util.List<Long> rowsExamined; 
            private java.util.List<Long> rowsSent; 
            private java.util.List<Double> rt; 
            private Long total; 
            private java.util.List<Long> ts; 
            private java.util.List<Long> tsEnd; 

            /**
             * AvgLockTime.
             */
            public Builder avgLockTime(java.util.List<Double> avgLockTime) {
                this.avgLockTime = avgLockTime;
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
             * Count.
             */
            public Builder count(java.util.List<Long> count) {
                this.count = count;
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
             * LockTime.
             */
            public Builder lockTime(java.util.List<Double> lockTime) {
                this.lockTime = lockTime;
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

            public Histogram build() {
                return new Histogram(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSlowLogStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogStatisticResponseBody</p>
     */
    public static class SqlTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comments")
        private String comments;

        @com.aliyun.core.annotation.NameInMap("SqlId")
        private String sqlId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        private SqlTag(Builder builder) {
            this.comments = builder.comments;
            this.sqlId = builder.sqlId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SqlTag create() {
            return builder().build();
        }

        /**
         * @return comments
         */
        public String getComments() {
            return this.comments;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String comments; 
            private String sqlId; 
            private String tags; 

            /**
             * Comments.
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * <p>SQL ID。</p>
             * 
             * <strong>example:</strong>
             * <p>a3931d8c3a9315dd5ed016d71cf*****</p>
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            public SqlTag build() {
                return new SqlTag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSlowLogStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogStatisticResponseBody</p>
     */
    public static class Trend extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Object value;

        private Trend(Builder builder) {
            this.timestamp = builder.timestamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Trend create() {
            return builder().build();
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long timestamp; 
            private Object value; 

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public Trend build() {
                return new Trend(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSlowLogStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogStatisticResponseBody</p>
     */
    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AvgCPUTime")
        private Double avgCPUTime;

        @com.aliyun.core.annotation.NameInMap("AvgCPUTimeSeconds")
        private Double avgCPUTimeSeconds;

        @com.aliyun.core.annotation.NameInMap("AvgDocExamined")
        private Double avgDocExamined;

        @com.aliyun.core.annotation.NameInMap("AvgFrows")
        private Double avgFrows;

        @com.aliyun.core.annotation.NameInMap("AvgIOWrites")
        private Double avgIOWrites;

        @com.aliyun.core.annotation.NameInMap("AvgKeysExamined")
        private Double avgKeysExamined;

        @com.aliyun.core.annotation.NameInMap("AvgLastRowsCountAffected")
        private Double avgLastRowsCountAffected;

        @com.aliyun.core.annotation.NameInMap("AvgLockTime")
        private Double avgLockTime;

        @com.aliyun.core.annotation.NameInMap("AvgLockTimeSeconds")
        private Double avgLockTimeSeconds;

        @com.aliyun.core.annotation.NameInMap("AvgLogicalIOReads")
        private Double avgLogicalIOReads;

        @com.aliyun.core.annotation.NameInMap("AvgPhysicalIOReads")
        private Double avgPhysicalIOReads;

        @com.aliyun.core.annotation.NameInMap("AvgQueryTime")
        private Double avgQueryTime;

        @com.aliyun.core.annotation.NameInMap("AvgQueryTimeSeconds")
        private Double avgQueryTimeSeconds;

        @com.aliyun.core.annotation.NameInMap("AvgReturnNum")
        private Double avgReturnNum;

        @com.aliyun.core.annotation.NameInMap("AvgRows")
        private Double avgRows;

        @com.aliyun.core.annotation.NameInMap("AvgRowsCountAffected")
        private Double avgRowsCountAffected;

        @com.aliyun.core.annotation.NameInMap("AvgRowsExamined")
        private Double avgRowsExamined;

        @com.aliyun.core.annotation.NameInMap("AvgRowsSent")
        private Double avgRowsSent;

        @com.aliyun.core.annotation.NameInMap("AvgScnt")
        private Double avgScnt;

        @com.aliyun.core.annotation.NameInMap("CPUTime")
        private Double CPUTime;

        @com.aliyun.core.annotation.NameInMap("CPUTimeSeconds")
        private Double CPUTimeSeconds;

        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("CountRate")
        private Double countRate;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("DbInstanceName")
        private String dbInstanceName;

        @com.aliyun.core.annotation.NameInMap("DocExamined")
        private Long docExamined;

        @com.aliyun.core.annotation.NameInMap("DocsExamined")
        private Long docsExamined;

        @com.aliyun.core.annotation.NameInMap("Frows")
        private Long frows;

        @com.aliyun.core.annotation.NameInMap("Histogram")
        private Histogram histogram;

        @com.aliyun.core.annotation.NameInMap("HostAddress")
        private String hostAddress;

        @com.aliyun.core.annotation.NameInMap("HostInsId")
        private String hostInsId;

        @com.aliyun.core.annotation.NameInMap("IOWrites")
        private Long IOWrites;

        @com.aliyun.core.annotation.NameInMap("InsName")
        private String insName;

        @com.aliyun.core.annotation.NameInMap("InsRole")
        private String insRole;

        @com.aliyun.core.annotation.NameInMap("KeysExamined")
        private Long keysExamined;

        @com.aliyun.core.annotation.NameInMap("LastRowsCountAffected")
        private Long lastRowsCountAffected;

        @com.aliyun.core.annotation.NameInMap("LockTime")
        private Double lockTime;

        @com.aliyun.core.annotation.NameInMap("LockTimeSeconds")
        private Double lockTimeSeconds;

        @com.aliyun.core.annotation.NameInMap("LogicalIOReads")
        private Long logicalIOReads;

        @com.aliyun.core.annotation.NameInMap("MaxCPUTime")
        private Double maxCPUTime;

        @com.aliyun.core.annotation.NameInMap("MaxCPUTimeSeconds")
        private Double maxCPUTimeSeconds;

        @com.aliyun.core.annotation.NameInMap("MaxDocExamined")
        private Long maxDocExamined;

        @com.aliyun.core.annotation.NameInMap("MaxFrows")
        private Long maxFrows;

        @com.aliyun.core.annotation.NameInMap("MaxIOWrites")
        private Long maxIOWrites;

        @com.aliyun.core.annotation.NameInMap("MaxKeysExamined")
        private Long maxKeysExamined;

        @com.aliyun.core.annotation.NameInMap("MaxLastRowsCountAffected")
        private Long maxLastRowsCountAffected;

        @com.aliyun.core.annotation.NameInMap("MaxLockTime")
        private Double maxLockTime;

        @com.aliyun.core.annotation.NameInMap("MaxLockTimeSeconds")
        private Double maxLockTimeSeconds;

        @com.aliyun.core.annotation.NameInMap("MaxLogicalIOReads")
        private Long maxLogicalIOReads;

        @com.aliyun.core.annotation.NameInMap("MaxPhysicalIOReads")
        private Long maxPhysicalIOReads;

        @com.aliyun.core.annotation.NameInMap("MaxQueryTime")
        private Double maxQueryTime;

        @com.aliyun.core.annotation.NameInMap("MaxQueryTimeSeconds")
        private Double maxQueryTimeSeconds;

        @com.aliyun.core.annotation.NameInMap("MaxReturnNum")
        private Long maxReturnNum;

        @com.aliyun.core.annotation.NameInMap("MaxRows")
        private Long maxRows;

        @com.aliyun.core.annotation.NameInMap("MaxRowsCountAffected")
        private Long maxRowsCountAffected;

        @com.aliyun.core.annotation.NameInMap("MaxRowsExamined")
        private Long maxRowsExamined;

        @com.aliyun.core.annotation.NameInMap("MaxRowsSent")
        private Long maxRowsSent;

        @com.aliyun.core.annotation.NameInMap("MaxScnt")
        private Long maxScnt;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("OpType")
        private String opType;

        @com.aliyun.core.annotation.NameInMap("OriginAlias")
        private String originAlias;

        @com.aliyun.core.annotation.NameInMap("PhysicalIOReads")
        private Long physicalIOReads;

        @com.aliyun.core.annotation.NameInMap("Psql")
        private String psql;

        @com.aliyun.core.annotation.NameInMap("QueryId")
        private String queryId;

        @com.aliyun.core.annotation.NameInMap("QueryStartTime")
        private String queryStartTime;

        @com.aliyun.core.annotation.NameInMap("QueryTime")
        private Long queryTime;

        @com.aliyun.core.annotation.NameInMap("QueryTimeRate")
        private Double queryTimeRate;

        @com.aliyun.core.annotation.NameInMap("QueryTimeSeconds")
        private Double queryTimeSeconds;

        @com.aliyun.core.annotation.NameInMap("ReturnItemNumbers")
        private String returnItemNumbers;

        @com.aliyun.core.annotation.NameInMap("ReturnNum")
        private Long returnNum;

        @com.aliyun.core.annotation.NameInMap("Rows")
        private Long rows;

        @com.aliyun.core.annotation.NameInMap("RowsCountAffected")
        private Long rowsCountAffected;

        @com.aliyun.core.annotation.NameInMap("RowsExamined")
        private Long rowsExamined;

        @com.aliyun.core.annotation.NameInMap("RowsSent")
        private Long rowsSent;

        @com.aliyun.core.annotation.NameInMap("SQLText")
        private String SQLText;

        @com.aliyun.core.annotation.NameInMap("Scheme")
        private String scheme;

        @com.aliyun.core.annotation.NameInMap("Scnt")
        private Long scnt;

        @com.aliyun.core.annotation.NameInMap("SqlId")
        private String sqlId;

        @com.aliyun.core.annotation.NameInMap("SqlTag")
        private SqlTag sqlTag;

        @com.aliyun.core.annotation.NameInMap("SqlType")
        private String sqlType;

        @com.aliyun.core.annotation.NameInMap("SubInstanceId")
        private String subInstanceId;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("ThreadId")
        private String threadId;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("Trend")
        private java.util.List<Trend> trend;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private Logs(Builder builder) {
            this.accountName = builder.accountName;
            this.avgCPUTime = builder.avgCPUTime;
            this.avgCPUTimeSeconds = builder.avgCPUTimeSeconds;
            this.avgDocExamined = builder.avgDocExamined;
            this.avgFrows = builder.avgFrows;
            this.avgIOWrites = builder.avgIOWrites;
            this.avgKeysExamined = builder.avgKeysExamined;
            this.avgLastRowsCountAffected = builder.avgLastRowsCountAffected;
            this.avgLockTime = builder.avgLockTime;
            this.avgLockTimeSeconds = builder.avgLockTimeSeconds;
            this.avgLogicalIOReads = builder.avgLogicalIOReads;
            this.avgPhysicalIOReads = builder.avgPhysicalIOReads;
            this.avgQueryTime = builder.avgQueryTime;
            this.avgQueryTimeSeconds = builder.avgQueryTimeSeconds;
            this.avgReturnNum = builder.avgReturnNum;
            this.avgRows = builder.avgRows;
            this.avgRowsCountAffected = builder.avgRowsCountAffected;
            this.avgRowsExamined = builder.avgRowsExamined;
            this.avgRowsSent = builder.avgRowsSent;
            this.avgScnt = builder.avgScnt;
            this.CPUTime = builder.CPUTime;
            this.CPUTimeSeconds = builder.CPUTimeSeconds;
            this.command = builder.command;
            this.count = builder.count;
            this.countRate = builder.countRate;
            this.DBName = builder.DBName;
            this.database = builder.database;
            this.dbInstanceName = builder.dbInstanceName;
            this.docExamined = builder.docExamined;
            this.docsExamined = builder.docsExamined;
            this.frows = builder.frows;
            this.histogram = builder.histogram;
            this.hostAddress = builder.hostAddress;
            this.hostInsId = builder.hostInsId;
            this.IOWrites = builder.IOWrites;
            this.insName = builder.insName;
            this.insRole = builder.insRole;
            this.keysExamined = builder.keysExamined;
            this.lastRowsCountAffected = builder.lastRowsCountAffected;
            this.lockTime = builder.lockTime;
            this.lockTimeSeconds = builder.lockTimeSeconds;
            this.logicalIOReads = builder.logicalIOReads;
            this.maxCPUTime = builder.maxCPUTime;
            this.maxCPUTimeSeconds = builder.maxCPUTimeSeconds;
            this.maxDocExamined = builder.maxDocExamined;
            this.maxFrows = builder.maxFrows;
            this.maxIOWrites = builder.maxIOWrites;
            this.maxKeysExamined = builder.maxKeysExamined;
            this.maxLastRowsCountAffected = builder.maxLastRowsCountAffected;
            this.maxLockTime = builder.maxLockTime;
            this.maxLockTimeSeconds = builder.maxLockTimeSeconds;
            this.maxLogicalIOReads = builder.maxLogicalIOReads;
            this.maxPhysicalIOReads = builder.maxPhysicalIOReads;
            this.maxQueryTime = builder.maxQueryTime;
            this.maxQueryTimeSeconds = builder.maxQueryTimeSeconds;
            this.maxReturnNum = builder.maxReturnNum;
            this.maxRows = builder.maxRows;
            this.maxRowsCountAffected = builder.maxRowsCountAffected;
            this.maxRowsExamined = builder.maxRowsExamined;
            this.maxRowsSent = builder.maxRowsSent;
            this.maxScnt = builder.maxScnt;
            this.namespace = builder.namespace;
            this.nodeType = builder.nodeType;
            this.opType = builder.opType;
            this.originAlias = builder.originAlias;
            this.physicalIOReads = builder.physicalIOReads;
            this.psql = builder.psql;
            this.queryId = builder.queryId;
            this.queryStartTime = builder.queryStartTime;
            this.queryTime = builder.queryTime;
            this.queryTimeRate = builder.queryTimeRate;
            this.queryTimeSeconds = builder.queryTimeSeconds;
            this.returnItemNumbers = builder.returnItemNumbers;
            this.returnNum = builder.returnNum;
            this.rows = builder.rows;
            this.rowsCountAffected = builder.rowsCountAffected;
            this.rowsExamined = builder.rowsExamined;
            this.rowsSent = builder.rowsSent;
            this.SQLText = builder.SQLText;
            this.scheme = builder.scheme;
            this.scnt = builder.scnt;
            this.sqlId = builder.sqlId;
            this.sqlTag = builder.sqlTag;
            this.sqlType = builder.sqlType;
            this.subInstanceId = builder.subInstanceId;
            this.tableName = builder.tableName;
            this.threadId = builder.threadId;
            this.timestamp = builder.timestamp;
            this.trend = builder.trend;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return avgCPUTime
         */
        public Double getAvgCPUTime() {
            return this.avgCPUTime;
        }

        /**
         * @return avgCPUTimeSeconds
         */
        public Double getAvgCPUTimeSeconds() {
            return this.avgCPUTimeSeconds;
        }

        /**
         * @return avgDocExamined
         */
        public Double getAvgDocExamined() {
            return this.avgDocExamined;
        }

        /**
         * @return avgFrows
         */
        public Double getAvgFrows() {
            return this.avgFrows;
        }

        /**
         * @return avgIOWrites
         */
        public Double getAvgIOWrites() {
            return this.avgIOWrites;
        }

        /**
         * @return avgKeysExamined
         */
        public Double getAvgKeysExamined() {
            return this.avgKeysExamined;
        }

        /**
         * @return avgLastRowsCountAffected
         */
        public Double getAvgLastRowsCountAffected() {
            return this.avgLastRowsCountAffected;
        }

        /**
         * @return avgLockTime
         */
        public Double getAvgLockTime() {
            return this.avgLockTime;
        }

        /**
         * @return avgLockTimeSeconds
         */
        public Double getAvgLockTimeSeconds() {
            return this.avgLockTimeSeconds;
        }

        /**
         * @return avgLogicalIOReads
         */
        public Double getAvgLogicalIOReads() {
            return this.avgLogicalIOReads;
        }

        /**
         * @return avgPhysicalIOReads
         */
        public Double getAvgPhysicalIOReads() {
            return this.avgPhysicalIOReads;
        }

        /**
         * @return avgQueryTime
         */
        public Double getAvgQueryTime() {
            return this.avgQueryTime;
        }

        /**
         * @return avgQueryTimeSeconds
         */
        public Double getAvgQueryTimeSeconds() {
            return this.avgQueryTimeSeconds;
        }

        /**
         * @return avgReturnNum
         */
        public Double getAvgReturnNum() {
            return this.avgReturnNum;
        }

        /**
         * @return avgRows
         */
        public Double getAvgRows() {
            return this.avgRows;
        }

        /**
         * @return avgRowsCountAffected
         */
        public Double getAvgRowsCountAffected() {
            return this.avgRowsCountAffected;
        }

        /**
         * @return avgRowsExamined
         */
        public Double getAvgRowsExamined() {
            return this.avgRowsExamined;
        }

        /**
         * @return avgRowsSent
         */
        public Double getAvgRowsSent() {
            return this.avgRowsSent;
        }

        /**
         * @return avgScnt
         */
        public Double getAvgScnt() {
            return this.avgScnt;
        }

        /**
         * @return CPUTime
         */
        public Double getCPUTime() {
            return this.CPUTime;
        }

        /**
         * @return CPUTimeSeconds
         */
        public Double getCPUTimeSeconds() {
            return this.CPUTimeSeconds;
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return countRate
         */
        public Double getCountRate() {
            return this.countRate;
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return dbInstanceName
         */
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        /**
         * @return docExamined
         */
        public Long getDocExamined() {
            return this.docExamined;
        }

        /**
         * @return docsExamined
         */
        public Long getDocsExamined() {
            return this.docsExamined;
        }

        /**
         * @return frows
         */
        public Long getFrows() {
            return this.frows;
        }

        /**
         * @return histogram
         */
        public Histogram getHistogram() {
            return this.histogram;
        }

        /**
         * @return hostAddress
         */
        public String getHostAddress() {
            return this.hostAddress;
        }

        /**
         * @return hostInsId
         */
        public String getHostInsId() {
            return this.hostInsId;
        }

        /**
         * @return IOWrites
         */
        public Long getIOWrites() {
            return this.IOWrites;
        }

        /**
         * @return insName
         */
        public String getInsName() {
            return this.insName;
        }

        /**
         * @return insRole
         */
        public String getInsRole() {
            return this.insRole;
        }

        /**
         * @return keysExamined
         */
        public Long getKeysExamined() {
            return this.keysExamined;
        }

        /**
         * @return lastRowsCountAffected
         */
        public Long getLastRowsCountAffected() {
            return this.lastRowsCountAffected;
        }

        /**
         * @return lockTime
         */
        public Double getLockTime() {
            return this.lockTime;
        }

        /**
         * @return lockTimeSeconds
         */
        public Double getLockTimeSeconds() {
            return this.lockTimeSeconds;
        }

        /**
         * @return logicalIOReads
         */
        public Long getLogicalIOReads() {
            return this.logicalIOReads;
        }

        /**
         * @return maxCPUTime
         */
        public Double getMaxCPUTime() {
            return this.maxCPUTime;
        }

        /**
         * @return maxCPUTimeSeconds
         */
        public Double getMaxCPUTimeSeconds() {
            return this.maxCPUTimeSeconds;
        }

        /**
         * @return maxDocExamined
         */
        public Long getMaxDocExamined() {
            return this.maxDocExamined;
        }

        /**
         * @return maxFrows
         */
        public Long getMaxFrows() {
            return this.maxFrows;
        }

        /**
         * @return maxIOWrites
         */
        public Long getMaxIOWrites() {
            return this.maxIOWrites;
        }

        /**
         * @return maxKeysExamined
         */
        public Long getMaxKeysExamined() {
            return this.maxKeysExamined;
        }

        /**
         * @return maxLastRowsCountAffected
         */
        public Long getMaxLastRowsCountAffected() {
            return this.maxLastRowsCountAffected;
        }

        /**
         * @return maxLockTime
         */
        public Double getMaxLockTime() {
            return this.maxLockTime;
        }

        /**
         * @return maxLockTimeSeconds
         */
        public Double getMaxLockTimeSeconds() {
            return this.maxLockTimeSeconds;
        }

        /**
         * @return maxLogicalIOReads
         */
        public Long getMaxLogicalIOReads() {
            return this.maxLogicalIOReads;
        }

        /**
         * @return maxPhysicalIOReads
         */
        public Long getMaxPhysicalIOReads() {
            return this.maxPhysicalIOReads;
        }

        /**
         * @return maxQueryTime
         */
        public Double getMaxQueryTime() {
            return this.maxQueryTime;
        }

        /**
         * @return maxQueryTimeSeconds
         */
        public Double getMaxQueryTimeSeconds() {
            return this.maxQueryTimeSeconds;
        }

        /**
         * @return maxReturnNum
         */
        public Long getMaxReturnNum() {
            return this.maxReturnNum;
        }

        /**
         * @return maxRows
         */
        public Long getMaxRows() {
            return this.maxRows;
        }

        /**
         * @return maxRowsCountAffected
         */
        public Long getMaxRowsCountAffected() {
            return this.maxRowsCountAffected;
        }

        /**
         * @return maxRowsExamined
         */
        public Long getMaxRowsExamined() {
            return this.maxRowsExamined;
        }

        /**
         * @return maxRowsSent
         */
        public Long getMaxRowsSent() {
            return this.maxRowsSent;
        }

        /**
         * @return maxScnt
         */
        public Long getMaxScnt() {
            return this.maxScnt;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return opType
         */
        public String getOpType() {
            return this.opType;
        }

        /**
         * @return originAlias
         */
        public String getOriginAlias() {
            return this.originAlias;
        }

        /**
         * @return physicalIOReads
         */
        public Long getPhysicalIOReads() {
            return this.physicalIOReads;
        }

        /**
         * @return psql
         */
        public String getPsql() {
            return this.psql;
        }

        /**
         * @return queryId
         */
        public String getQueryId() {
            return this.queryId;
        }

        /**
         * @return queryStartTime
         */
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

        /**
         * @return queryTime
         */
        public Long getQueryTime() {
            return this.queryTime;
        }

        /**
         * @return queryTimeRate
         */
        public Double getQueryTimeRate() {
            return this.queryTimeRate;
        }

        /**
         * @return queryTimeSeconds
         */
        public Double getQueryTimeSeconds() {
            return this.queryTimeSeconds;
        }

        /**
         * @return returnItemNumbers
         */
        public String getReturnItemNumbers() {
            return this.returnItemNumbers;
        }

        /**
         * @return returnNum
         */
        public Long getReturnNum() {
            return this.returnNum;
        }

        /**
         * @return rows
         */
        public Long getRows() {
            return this.rows;
        }

        /**
         * @return rowsCountAffected
         */
        public Long getRowsCountAffected() {
            return this.rowsCountAffected;
        }

        /**
         * @return rowsExamined
         */
        public Long getRowsExamined() {
            return this.rowsExamined;
        }

        /**
         * @return rowsSent
         */
        public Long getRowsSent() {
            return this.rowsSent;
        }

        /**
         * @return SQLText
         */
        public String getSQLText() {
            return this.SQLText;
        }

        /**
         * @return scheme
         */
        public String getScheme() {
            return this.scheme;
        }

        /**
         * @return scnt
         */
        public Long getScnt() {
            return this.scnt;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return sqlTag
         */
        public SqlTag getSqlTag() {
            return this.sqlTag;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        /**
         * @return subInstanceId
         */
        public String getSubInstanceId() {
            return this.subInstanceId;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return threadId
         */
        public String getThreadId() {
            return this.threadId;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return trend
         */
        public java.util.List<Trend> getTrend() {
            return this.trend;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String accountName; 
            private Double avgCPUTime; 
            private Double avgCPUTimeSeconds; 
            private Double avgDocExamined; 
            private Double avgFrows; 
            private Double avgIOWrites; 
            private Double avgKeysExamined; 
            private Double avgLastRowsCountAffected; 
            private Double avgLockTime; 
            private Double avgLockTimeSeconds; 
            private Double avgLogicalIOReads; 
            private Double avgPhysicalIOReads; 
            private Double avgQueryTime; 
            private Double avgQueryTimeSeconds; 
            private Double avgReturnNum; 
            private Double avgRows; 
            private Double avgRowsCountAffected; 
            private Double avgRowsExamined; 
            private Double avgRowsSent; 
            private Double avgScnt; 
            private Double CPUTime; 
            private Double CPUTimeSeconds; 
            private String command; 
            private Long count; 
            private Double countRate; 
            private String DBName; 
            private String database; 
            private String dbInstanceName; 
            private Long docExamined; 
            private Long docsExamined; 
            private Long frows; 
            private Histogram histogram; 
            private String hostAddress; 
            private String hostInsId; 
            private Long IOWrites; 
            private String insName; 
            private String insRole; 
            private Long keysExamined; 
            private Long lastRowsCountAffected; 
            private Double lockTime; 
            private Double lockTimeSeconds; 
            private Long logicalIOReads; 
            private Double maxCPUTime; 
            private Double maxCPUTimeSeconds; 
            private Long maxDocExamined; 
            private Long maxFrows; 
            private Long maxIOWrites; 
            private Long maxKeysExamined; 
            private Long maxLastRowsCountAffected; 
            private Double maxLockTime; 
            private Double maxLockTimeSeconds; 
            private Long maxLogicalIOReads; 
            private Long maxPhysicalIOReads; 
            private Double maxQueryTime; 
            private Double maxQueryTimeSeconds; 
            private Long maxReturnNum; 
            private Long maxRows; 
            private Long maxRowsCountAffected; 
            private Long maxRowsExamined; 
            private Long maxRowsSent; 
            private Long maxScnt; 
            private String namespace; 
            private String nodeType; 
            private String opType; 
            private String originAlias; 
            private Long physicalIOReads; 
            private String psql; 
            private String queryId; 
            private String queryStartTime; 
            private Long queryTime; 
            private Double queryTimeRate; 
            private Double queryTimeSeconds; 
            private String returnItemNumbers; 
            private Long returnNum; 
            private Long rows; 
            private Long rowsCountAffected; 
            private Long rowsExamined; 
            private Long rowsSent; 
            private String SQLText; 
            private String scheme; 
            private Long scnt; 
            private String sqlId; 
            private SqlTag sqlTag; 
            private String sqlType; 
            private String subInstanceId; 
            private String tableName; 
            private String threadId; 
            private Long timestamp; 
            private java.util.List<Trend> trend; 
            private String user; 

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * AvgCPUTime.
             */
            public Builder avgCPUTime(Double avgCPUTime) {
                this.avgCPUTime = avgCPUTime;
                return this;
            }

            /**
             * AvgCPUTimeSeconds.
             */
            public Builder avgCPUTimeSeconds(Double avgCPUTimeSeconds) {
                this.avgCPUTimeSeconds = avgCPUTimeSeconds;
                return this;
            }

            /**
             * AvgDocExamined.
             */
            public Builder avgDocExamined(Double avgDocExamined) {
                this.avgDocExamined = avgDocExamined;
                return this;
            }

            /**
             * AvgFrows.
             */
            public Builder avgFrows(Double avgFrows) {
                this.avgFrows = avgFrows;
                return this;
            }

            /**
             * AvgIOWrites.
             */
            public Builder avgIOWrites(Double avgIOWrites) {
                this.avgIOWrites = avgIOWrites;
                return this;
            }

            /**
             * AvgKeysExamined.
             */
            public Builder avgKeysExamined(Double avgKeysExamined) {
                this.avgKeysExamined = avgKeysExamined;
                return this;
            }

            /**
             * AvgLastRowsCountAffected.
             */
            public Builder avgLastRowsCountAffected(Double avgLastRowsCountAffected) {
                this.avgLastRowsCountAffected = avgLastRowsCountAffected;
                return this;
            }

            /**
             * AvgLockTime.
             */
            public Builder avgLockTime(Double avgLockTime) {
                this.avgLockTime = avgLockTime;
                return this;
            }

            /**
             * AvgLockTimeSeconds.
             */
            public Builder avgLockTimeSeconds(Double avgLockTimeSeconds) {
                this.avgLockTimeSeconds = avgLockTimeSeconds;
                return this;
            }

            /**
             * AvgLogicalIOReads.
             */
            public Builder avgLogicalIOReads(Double avgLogicalIOReads) {
                this.avgLogicalIOReads = avgLogicalIOReads;
                return this;
            }

            /**
             * AvgPhysicalIOReads.
             */
            public Builder avgPhysicalIOReads(Double avgPhysicalIOReads) {
                this.avgPhysicalIOReads = avgPhysicalIOReads;
                return this;
            }

            /**
             * AvgQueryTime.
             */
            public Builder avgQueryTime(Double avgQueryTime) {
                this.avgQueryTime = avgQueryTime;
                return this;
            }

            /**
             * AvgQueryTimeSeconds.
             */
            public Builder avgQueryTimeSeconds(Double avgQueryTimeSeconds) {
                this.avgQueryTimeSeconds = avgQueryTimeSeconds;
                return this;
            }

            /**
             * AvgReturnNum.
             */
            public Builder avgReturnNum(Double avgReturnNum) {
                this.avgReturnNum = avgReturnNum;
                return this;
            }

            /**
             * AvgRows.
             */
            public Builder avgRows(Double avgRows) {
                this.avgRows = avgRows;
                return this;
            }

            /**
             * AvgRowsCountAffected.
             */
            public Builder avgRowsCountAffected(Double avgRowsCountAffected) {
                this.avgRowsCountAffected = avgRowsCountAffected;
                return this;
            }

            /**
             * AvgRowsExamined.
             */
            public Builder avgRowsExamined(Double avgRowsExamined) {
                this.avgRowsExamined = avgRowsExamined;
                return this;
            }

            /**
             * AvgRowsSent.
             */
            public Builder avgRowsSent(Double avgRowsSent) {
                this.avgRowsSent = avgRowsSent;
                return this;
            }

            /**
             * AvgScnt.
             */
            public Builder avgScnt(Double avgScnt) {
                this.avgScnt = avgScnt;
                return this;
            }

            /**
             * CPUTime.
             */
            public Builder CPUTime(Double CPUTime) {
                this.CPUTime = CPUTime;
                return this;
            }

            /**
             * CPUTimeSeconds.
             */
            public Builder CPUTimeSeconds(Double CPUTimeSeconds) {
                this.CPUTimeSeconds = CPUTimeSeconds;
                return this;
            }

            /**
             * Command.
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * CountRate.
             */
            public Builder countRate(Double countRate) {
                this.countRate = countRate;
                return this;
            }

            /**
             * DBName.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * Database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * DbInstanceName.
             */
            public Builder dbInstanceName(String dbInstanceName) {
                this.dbInstanceName = dbInstanceName;
                return this;
            }

            /**
             * DocExamined.
             */
            public Builder docExamined(Long docExamined) {
                this.docExamined = docExamined;
                return this;
            }

            /**
             * DocsExamined.
             */
            public Builder docsExamined(Long docsExamined) {
                this.docsExamined = docsExamined;
                return this;
            }

            /**
             * Frows.
             */
            public Builder frows(Long frows) {
                this.frows = frows;
                return this;
            }

            /**
             * Histogram.
             */
            public Builder histogram(Histogram histogram) {
                this.histogram = histogram;
                return this;
            }

            /**
             * HostAddress.
             */
            public Builder hostAddress(String hostAddress) {
                this.hostAddress = hostAddress;
                return this;
            }

            /**
             * HostInsId.
             */
            public Builder hostInsId(String hostInsId) {
                this.hostInsId = hostInsId;
                return this;
            }

            /**
             * IOWrites.
             */
            public Builder IOWrites(Long IOWrites) {
                this.IOWrites = IOWrites;
                return this;
            }

            /**
             * InsName.
             */
            public Builder insName(String insName) {
                this.insName = insName;
                return this;
            }

            /**
             * InsRole.
             */
            public Builder insRole(String insRole) {
                this.insRole = insRole;
                return this;
            }

            /**
             * KeysExamined.
             */
            public Builder keysExamined(Long keysExamined) {
                this.keysExamined = keysExamined;
                return this;
            }

            /**
             * LastRowsCountAffected.
             */
            public Builder lastRowsCountAffected(Long lastRowsCountAffected) {
                this.lastRowsCountAffected = lastRowsCountAffected;
                return this;
            }

            /**
             * LockTime.
             */
            public Builder lockTime(Double lockTime) {
                this.lockTime = lockTime;
                return this;
            }

            /**
             * LockTimeSeconds.
             */
            public Builder lockTimeSeconds(Double lockTimeSeconds) {
                this.lockTimeSeconds = lockTimeSeconds;
                return this;
            }

            /**
             * LogicalIOReads.
             */
            public Builder logicalIOReads(Long logicalIOReads) {
                this.logicalIOReads = logicalIOReads;
                return this;
            }

            /**
             * MaxCPUTime.
             */
            public Builder maxCPUTime(Double maxCPUTime) {
                this.maxCPUTime = maxCPUTime;
                return this;
            }

            /**
             * MaxCPUTimeSeconds.
             */
            public Builder maxCPUTimeSeconds(Double maxCPUTimeSeconds) {
                this.maxCPUTimeSeconds = maxCPUTimeSeconds;
                return this;
            }

            /**
             * MaxDocExamined.
             */
            public Builder maxDocExamined(Long maxDocExamined) {
                this.maxDocExamined = maxDocExamined;
                return this;
            }

            /**
             * MaxFrows.
             */
            public Builder maxFrows(Long maxFrows) {
                this.maxFrows = maxFrows;
                return this;
            }

            /**
             * MaxIOWrites.
             */
            public Builder maxIOWrites(Long maxIOWrites) {
                this.maxIOWrites = maxIOWrites;
                return this;
            }

            /**
             * MaxKeysExamined.
             */
            public Builder maxKeysExamined(Long maxKeysExamined) {
                this.maxKeysExamined = maxKeysExamined;
                return this;
            }

            /**
             * MaxLastRowsCountAffected.
             */
            public Builder maxLastRowsCountAffected(Long maxLastRowsCountAffected) {
                this.maxLastRowsCountAffected = maxLastRowsCountAffected;
                return this;
            }

            /**
             * MaxLockTime.
             */
            public Builder maxLockTime(Double maxLockTime) {
                this.maxLockTime = maxLockTime;
                return this;
            }

            /**
             * MaxLockTimeSeconds.
             */
            public Builder maxLockTimeSeconds(Double maxLockTimeSeconds) {
                this.maxLockTimeSeconds = maxLockTimeSeconds;
                return this;
            }

            /**
             * MaxLogicalIOReads.
             */
            public Builder maxLogicalIOReads(Long maxLogicalIOReads) {
                this.maxLogicalIOReads = maxLogicalIOReads;
                return this;
            }

            /**
             * MaxPhysicalIOReads.
             */
            public Builder maxPhysicalIOReads(Long maxPhysicalIOReads) {
                this.maxPhysicalIOReads = maxPhysicalIOReads;
                return this;
            }

            /**
             * MaxQueryTime.
             */
            public Builder maxQueryTime(Double maxQueryTime) {
                this.maxQueryTime = maxQueryTime;
                return this;
            }

            /**
             * MaxQueryTimeSeconds.
             */
            public Builder maxQueryTimeSeconds(Double maxQueryTimeSeconds) {
                this.maxQueryTimeSeconds = maxQueryTimeSeconds;
                return this;
            }

            /**
             * MaxReturnNum.
             */
            public Builder maxReturnNum(Long maxReturnNum) {
                this.maxReturnNum = maxReturnNum;
                return this;
            }

            /**
             * MaxRows.
             */
            public Builder maxRows(Long maxRows) {
                this.maxRows = maxRows;
                return this;
            }

            /**
             * MaxRowsCountAffected.
             */
            public Builder maxRowsCountAffected(Long maxRowsCountAffected) {
                this.maxRowsCountAffected = maxRowsCountAffected;
                return this;
            }

            /**
             * MaxRowsExamined.
             */
            public Builder maxRowsExamined(Long maxRowsExamined) {
                this.maxRowsExamined = maxRowsExamined;
                return this;
            }

            /**
             * MaxRowsSent.
             */
            public Builder maxRowsSent(Long maxRowsSent) {
                this.maxRowsSent = maxRowsSent;
                return this;
            }

            /**
             * MaxScnt.
             */
            public Builder maxScnt(Long maxScnt) {
                this.maxScnt = maxScnt;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * OpType.
             */
            public Builder opType(String opType) {
                this.opType = opType;
                return this;
            }

            /**
             * OriginAlias.
             */
            public Builder originAlias(String originAlias) {
                this.originAlias = originAlias;
                return this;
            }

            /**
             * PhysicalIOReads.
             */
            public Builder physicalIOReads(Long physicalIOReads) {
                this.physicalIOReads = physicalIOReads;
                return this;
            }

            /**
             * Psql.
             */
            public Builder psql(String psql) {
                this.psql = psql;
                return this;
            }

            /**
             * QueryId.
             */
            public Builder queryId(String queryId) {
                this.queryId = queryId;
                return this;
            }

            /**
             * QueryStartTime.
             */
            public Builder queryStartTime(String queryStartTime) {
                this.queryStartTime = queryStartTime;
                return this;
            }

            /**
             * QueryTime.
             */
            public Builder queryTime(Long queryTime) {
                this.queryTime = queryTime;
                return this;
            }

            /**
             * QueryTimeRate.
             */
            public Builder queryTimeRate(Double queryTimeRate) {
                this.queryTimeRate = queryTimeRate;
                return this;
            }

            /**
             * QueryTimeSeconds.
             */
            public Builder queryTimeSeconds(Double queryTimeSeconds) {
                this.queryTimeSeconds = queryTimeSeconds;
                return this;
            }

            /**
             * ReturnItemNumbers.
             */
            public Builder returnItemNumbers(String returnItemNumbers) {
                this.returnItemNumbers = returnItemNumbers;
                return this;
            }

            /**
             * ReturnNum.
             */
            public Builder returnNum(Long returnNum) {
                this.returnNum = returnNum;
                return this;
            }

            /**
             * Rows.
             */
            public Builder rows(Long rows) {
                this.rows = rows;
                return this;
            }

            /**
             * RowsCountAffected.
             */
            public Builder rowsCountAffected(Long rowsCountAffected) {
                this.rowsCountAffected = rowsCountAffected;
                return this;
            }

            /**
             * RowsExamined.
             */
            public Builder rowsExamined(Long rowsExamined) {
                this.rowsExamined = rowsExamined;
                return this;
            }

            /**
             * RowsSent.
             */
            public Builder rowsSent(Long rowsSent) {
                this.rowsSent = rowsSent;
                return this;
            }

            /**
             * SQLText.
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * Scheme.
             */
            public Builder scheme(String scheme) {
                this.scheme = scheme;
                return this;
            }

            /**
             * Scnt.
             */
            public Builder scnt(Long scnt) {
                this.scnt = scnt;
                return this;
            }

            /**
             * <p>SQL ID。</p>
             * 
             * <strong>example:</strong>
             * <p>2dca88762ec6b3812504ab8a4b******</p>
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * SqlTag.
             */
            public Builder sqlTag(SqlTag sqlTag) {
                this.sqlTag = sqlTag;
                return this;
            }

            /**
             * SqlType.
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * SubInstanceId.
             */
            public Builder subInstanceId(String subInstanceId) {
                this.subInstanceId = subInstanceId;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * ThreadId.
             */
            public Builder threadId(String threadId) {
                this.threadId = threadId;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * Trend.
             */
            public Builder trend(java.util.List<Trend> trend) {
                this.trend = trend;
                return this;
            }

            /**
             * User.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSlowLogStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogStatisticResponseBody</p>
     */
    public static class DataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbInstanceId")
        private Long dbInstanceId;

        @com.aliyun.core.annotation.NameInMap("DbInstanceName")
        private String dbInstanceName;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ItemsNumbers")
        private Long itemsNumbers;

        @com.aliyun.core.annotation.NameInMap("Logs")
        private java.util.List<Logs> logs;

        @com.aliyun.core.annotation.NameInMap("MaxRecordsPerPage")
        private Integer maxRecordsPerPage;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("PageNumbers")
        private Integer pageNumbers;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TotalRecords")
        private Long totalRecords;

        private DataData(Builder builder) {
            this.dbInstanceId = builder.dbInstanceId;
            this.dbInstanceName = builder.dbInstanceName;
            this.endTime = builder.endTime;
            this.itemsNumbers = builder.itemsNumbers;
            this.logs = builder.logs;
            this.maxRecordsPerPage = builder.maxRecordsPerPage;
            this.nodeId = builder.nodeId;
            this.pageNumbers = builder.pageNumbers;
            this.startTime = builder.startTime;
            this.totalRecords = builder.totalRecords;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return dbInstanceId
         */
        public Long getDbInstanceId() {
            return this.dbInstanceId;
        }

        /**
         * @return dbInstanceName
         */
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return itemsNumbers
         */
        public Long getItemsNumbers() {
            return this.itemsNumbers;
        }

        /**
         * @return logs
         */
        public java.util.List<Logs> getLogs() {
            return this.logs;
        }

        /**
         * @return maxRecordsPerPage
         */
        public Integer getMaxRecordsPerPage() {
            return this.maxRecordsPerPage;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return pageNumbers
         */
        public Integer getPageNumbers() {
            return this.pageNumbers;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return totalRecords
         */
        public Long getTotalRecords() {
            return this.totalRecords;
        }

        public static final class Builder {
            private Long dbInstanceId; 
            private String dbInstanceName; 
            private String endTime; 
            private Long itemsNumbers; 
            private java.util.List<Logs> logs; 
            private Integer maxRecordsPerPage; 
            private String nodeId; 
            private Integer pageNumbers; 
            private String startTime; 
            private Long totalRecords; 

            /**
             * DbInstanceId.
             */
            public Builder dbInstanceId(Long dbInstanceId) {
                this.dbInstanceId = dbInstanceId;
                return this;
            }

            /**
             * DbInstanceName.
             */
            public Builder dbInstanceName(String dbInstanceName) {
                this.dbInstanceName = dbInstanceName;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ItemsNumbers.
             */
            public Builder itemsNumbers(Long itemsNumbers) {
                this.itemsNumbers = itemsNumbers;
                return this;
            }

            /**
             * Logs.
             */
            public Builder logs(java.util.List<Logs> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * MaxRecordsPerPage.
             */
            public Builder maxRecordsPerPage(Integer maxRecordsPerPage) {
                this.maxRecordsPerPage = maxRecordsPerPage;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * PageNumbers.
             */
            public Builder pageNumbers(Integer pageNumbers) {
                this.pageNumbers = pageNumbers;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TotalRecords.
             */
            public Builder totalRecords(Long totalRecords) {
                this.totalRecords = totalRecords;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSlowLogStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogStatisticResponseBody</p>
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

            /**
             * <p>AsyncResult&lt;DBLogRecords<SlowLogStat>&gt;</p>
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
