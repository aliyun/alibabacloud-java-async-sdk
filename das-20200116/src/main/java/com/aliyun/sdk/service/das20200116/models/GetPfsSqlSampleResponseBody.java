// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPfsSqlSampleResponseBody} extends {@link TeaModel}
 *
 * <p>GetPfsSqlSampleResponseBody</p>
 */
public class GetPfsSqlSampleResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetPfsSqlSampleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPfsSqlSampleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code returned.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * The queried SQL sample data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPfsSqlSampleResponseBody build() {
            return new GetPfsSqlSampleResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CreateTmpDiskTables")
        private Integer createTmpDiskTables;

        @NameInMap("CreateTmpTables")
        private Integer createTmpTables;

        @NameInMap("Db")
        private String db;

        @NameInMap("EndEventId")
        private Integer endEventId;

        @NameInMap("Errors")
        private Integer errors;

        @NameInMap("EventId")
        private Integer eventId;

        @NameInMap("EventName")
        private String eventName;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Latency")
        private Double latency;

        @NameInMap("LockLatency")
        private Double lockLatency;

        @NameInMap("LogicId")
        private String logicId;

        @NameInMap("NoGoodIndexUsed")
        private Integer noGoodIndexUsed;

        @NameInMap("NoIndexUsed")
        private Integer noIndexUsed;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("RowsAffected")
        private Integer rowsAffected;

        @NameInMap("RowsExamined")
        private Integer rowsExamined;

        @NameInMap("RowsSent")
        private Integer rowsSent;

        @NameInMap("SelectFullJoin")
        private Integer selectFullJoin;

        @NameInMap("SelectFullRangeJoin")
        private Integer selectFullRangeJoin;

        @NameInMap("SelectRange")
        private Integer selectRange;

        @NameInMap("SelectRangeCheck")
        private Integer selectRangeCheck;

        @NameInMap("SelectScan")
        private Integer selectScan;

        @NameInMap("SortMergePasses")
        private Integer sortMergePasses;

        @NameInMap("SortRange")
        private Integer sortRange;

        @NameInMap("SortRows")
        private Integer sortRows;

        @NameInMap("SortScan")
        private Integer sortScan;

        @NameInMap("Sql")
        private String sql;

        @NameInMap("SqlId")
        private String sqlId;

        @NameInMap("ThreadId")
        private Integer threadId;

        @NameInMap("Timestamp")
        private Long timestamp;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("Warnings")
        private Integer warnings;

        private Data(Builder builder) {
            this.createTmpDiskTables = builder.createTmpDiskTables;
            this.createTmpTables = builder.createTmpTables;
            this.db = builder.db;
            this.endEventId = builder.endEventId;
            this.errors = builder.errors;
            this.eventId = builder.eventId;
            this.eventName = builder.eventName;
            this.instanceId = builder.instanceId;
            this.latency = builder.latency;
            this.lockLatency = builder.lockLatency;
            this.logicId = builder.logicId;
            this.noGoodIndexUsed = builder.noGoodIndexUsed;
            this.noIndexUsed = builder.noIndexUsed;
            this.nodeId = builder.nodeId;
            this.rowsAffected = builder.rowsAffected;
            this.rowsExamined = builder.rowsExamined;
            this.rowsSent = builder.rowsSent;
            this.selectFullJoin = builder.selectFullJoin;
            this.selectFullRangeJoin = builder.selectFullRangeJoin;
            this.selectRange = builder.selectRange;
            this.selectRangeCheck = builder.selectRangeCheck;
            this.selectScan = builder.selectScan;
            this.sortMergePasses = builder.sortMergePasses;
            this.sortRange = builder.sortRange;
            this.sortRows = builder.sortRows;
            this.sortScan = builder.sortScan;
            this.sql = builder.sql;
            this.sqlId = builder.sqlId;
            this.threadId = builder.threadId;
            this.timestamp = builder.timestamp;
            this.userId = builder.userId;
            this.warnings = builder.warnings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTmpDiskTables
         */
        public Integer getCreateTmpDiskTables() {
            return this.createTmpDiskTables;
        }

        /**
         * @return createTmpTables
         */
        public Integer getCreateTmpTables() {
            return this.createTmpTables;
        }

        /**
         * @return db
         */
        public String getDb() {
            return this.db;
        }

        /**
         * @return endEventId
         */
        public Integer getEndEventId() {
            return this.endEventId;
        }

        /**
         * @return errors
         */
        public Integer getErrors() {
            return this.errors;
        }

        /**
         * @return eventId
         */
        public Integer getEventId() {
            return this.eventId;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return latency
         */
        public Double getLatency() {
            return this.latency;
        }

        /**
         * @return lockLatency
         */
        public Double getLockLatency() {
            return this.lockLatency;
        }

        /**
         * @return logicId
         */
        public String getLogicId() {
            return this.logicId;
        }

        /**
         * @return noGoodIndexUsed
         */
        public Integer getNoGoodIndexUsed() {
            return this.noGoodIndexUsed;
        }

        /**
         * @return noIndexUsed
         */
        public Integer getNoIndexUsed() {
            return this.noIndexUsed;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return rowsAffected
         */
        public Integer getRowsAffected() {
            return this.rowsAffected;
        }

        /**
         * @return rowsExamined
         */
        public Integer getRowsExamined() {
            return this.rowsExamined;
        }

        /**
         * @return rowsSent
         */
        public Integer getRowsSent() {
            return this.rowsSent;
        }

        /**
         * @return selectFullJoin
         */
        public Integer getSelectFullJoin() {
            return this.selectFullJoin;
        }

        /**
         * @return selectFullRangeJoin
         */
        public Integer getSelectFullRangeJoin() {
            return this.selectFullRangeJoin;
        }

        /**
         * @return selectRange
         */
        public Integer getSelectRange() {
            return this.selectRange;
        }

        /**
         * @return selectRangeCheck
         */
        public Integer getSelectRangeCheck() {
            return this.selectRangeCheck;
        }

        /**
         * @return selectScan
         */
        public Integer getSelectScan() {
            return this.selectScan;
        }

        /**
         * @return sortMergePasses
         */
        public Integer getSortMergePasses() {
            return this.sortMergePasses;
        }

        /**
         * @return sortRange
         */
        public Integer getSortRange() {
            return this.sortRange;
        }

        /**
         * @return sortRows
         */
        public Integer getSortRows() {
            return this.sortRows;
        }

        /**
         * @return sortScan
         */
        public Integer getSortScan() {
            return this.sortScan;
        }

        /**
         * @return sql
         */
        public String getSql() {
            return this.sql;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return threadId
         */
        public Integer getThreadId() {
            return this.threadId;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return warnings
         */
        public Integer getWarnings() {
            return this.warnings;
        }

        public static final class Builder {
            private Integer createTmpDiskTables; 
            private Integer createTmpTables; 
            private String db; 
            private Integer endEventId; 
            private Integer errors; 
            private Integer eventId; 
            private String eventName; 
            private String instanceId; 
            private Double latency; 
            private Double lockLatency; 
            private String logicId; 
            private Integer noGoodIndexUsed; 
            private Integer noIndexUsed; 
            private String nodeId; 
            private Integer rowsAffected; 
            private Integer rowsExamined; 
            private Integer rowsSent; 
            private Integer selectFullJoin; 
            private Integer selectFullRangeJoin; 
            private Integer selectRange; 
            private Integer selectRangeCheck; 
            private Integer selectScan; 
            private Integer sortMergePasses; 
            private Integer sortRange; 
            private Integer sortRows; 
            private Integer sortScan; 
            private String sql; 
            private String sqlId; 
            private Integer threadId; 
            private Long timestamp; 
            private String userId; 
            private Integer warnings; 

            /**
             * The number of internal on-disk temporary tables that were created when the SQL statement was executed.
             */
            public Builder createTmpDiskTables(Integer createTmpDiskTables) {
                this.createTmpDiskTables = createTmpDiskTables;
                return this;
            }

            /**
             * The number of internal temporary tables that were created when the SQL statement was executed.
             */
            public Builder createTmpTables(Integer createTmpTables) {
                this.createTmpTables = createTmpTables;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder db(String db) {
                this.db = db;
                return this;
            }

            /**
             * The end ID of the event. By default, the value of this parameter is NULL when the event starts and is changed to the event ID when the event ends.
             */
            public Builder endEventId(Integer endEventId) {
                this.endEventId = endEventId;
                return this;
            }

            /**
             * The number of errors returned for the SQL statement.
             */
            public Builder errors(Integer errors) {
                this.errors = errors;
                return this;
            }

            /**
             * The event ID.
             */
            public Builder eventId(Integer eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * The name of the event.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The execution duration. Unit: millisecond.
             */
            public Builder latency(Double latency) {
                this.latency = latency;
                return this;
            }

            /**
             * The lock wait duration. Unit: millisecond.
             */
            public Builder lockLatency(Double lockLatency) {
                this.lockLatency = lockLatency;
                return this;
            }

            /**
             * The logical database ID.
             */
            public Builder logicId(String logicId) {
                this.logicId = logicId;
                return this;
            }

            /**
             * Indicates whether the server failed to find an index that can be used for the SQL statement. Valid values:
             * <p>
             * 
             * * **1:** yes.
             * * **0:** no.
             */
            public Builder noGoodIndexUsed(Integer noGoodIndexUsed) {
                this.noGoodIndexUsed = noGoodIndexUsed;
                return this;
            }

            /**
             * Indicates whether table scans were performed when indexes were not used. Valid values:
             * <p>
             * 
             * * **1:** yes.
             * * **0:** no.
             */
            public Builder noIndexUsed(Integer noIndexUsed) {
                this.noIndexUsed = noIndexUsed;
                return this;
            }

            /**
             * The node ID.
             * <p>
             * 
             * > This parameter is returned only for ApsaraDB RDS for MySQL Cluster Edition instances and PolarDB for MySQL clusters.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The number of rows affected by the SQL statement.
             */
            public Builder rowsAffected(Integer rowsAffected) {
                this.rowsAffected = rowsAffected;
                return this;
            }

            /**
             * The number of rows scanned by the SQL statement.
             */
            public Builder rowsExamined(Integer rowsExamined) {
                this.rowsExamined = rowsExamined;
                return this;
            }

            /**
             * The number of rows returned by the SQL statement.
             */
            public Builder rowsSent(Integer rowsSent) {
                this.rowsSent = rowsSent;
                return this;
            }

            /**
             * The number of joins that are used to perform table scans without using indexes.
             * <p>
             * 
             * > This parameter is used to count the number of joins that did not use indexes. If the value of this parameter is not 0, check the table indexes.
             */
            public Builder selectFullJoin(Integer selectFullJoin) {
                this.selectFullJoin = selectFullJoin;
                return this;
            }

            /**
             * The number of joins that used ranges on referenced tables.
             */
            public Builder selectFullRangeJoin(Integer selectFullRangeJoin) {
                this.selectFullRangeJoin = selectFullRangeJoin;
                return this;
            }

            /**
             * The number of joins that used ranges on the first table.
             */
            public Builder selectRange(Integer selectRange) {
                this.selectRange = selectRange;
                return this;
            }

            /**
             * The number of joins that did not have key values. The keys and values were checked for each row of data.
             * <p>
             * 
             * >  This parameter is used to count the number of joins that did not use indexes. If the value of this parameter is not 0, check the table indexes.
             */
            public Builder selectRangeCheck(Integer selectRangeCheck) {
                this.selectRangeCheck = selectRangeCheck;
                return this;
            }

            /**
             * The number of scans.
             */
            public Builder selectScan(Integer selectScan) {
                this.selectScan = selectScan;
                return this;
            }

            /**
             * The number of merges that the sorting algorithm must perform.
             */
            public Builder sortMergePasses(Integer sortMergePasses) {
                this.sortMergePasses = sortMergePasses;
                return this;
            }

            /**
             * The number of times the data was sorted by using ranges.
             */
            public Builder sortRange(Integer sortRange) {
                this.sortRange = sortRange;
                return this;
            }

            /**
             * The number of sorted rows.
             */
            public Builder sortRows(Integer sortRows) {
                this.sortRows = sortRows;
                return this;
            }

            /**
             * The number of sorts that were performed during table scans.
             */
            public Builder sortScan(Integer sortScan) {
                this.sortScan = sortScan;
                return this;
            }

            /**
             * The SQL sample.
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * The SQL ID.
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * The thread ID.
             */
            public Builder threadId(Integer threadId) {
                this.threadId = threadId;
                return this;
            }

            /**
             * The time when the SQL statement was executed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * The user ID.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The number of warnings returned for the SQL statement.
             */
            public Builder warnings(Integer warnings) {
                this.warnings = warnings;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
