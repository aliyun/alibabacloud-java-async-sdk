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
 * {@link GetPfsSqlSampleResponseBody} extends {@link TeaModel}
 *
 * <p>GetPfsSqlSampleResponseBody</p>
 */
public class GetPfsSqlSampleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The SQL sample data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9CB97BC4-6479-55D0-B9D0-EA925AFE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPfsSqlSampleResponseBody build() {
            return new GetPfsSqlSampleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPfsSqlSampleResponseBody} extends {@link TeaModel}
     *
     * <p>GetPfsSqlSampleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTmpDiskTables")
        private Integer createTmpDiskTables;

        @com.aliyun.core.annotation.NameInMap("CreateTmpTables")
        private Integer createTmpTables;

        @com.aliyun.core.annotation.NameInMap("Db")
        private String db;

        @com.aliyun.core.annotation.NameInMap("EndEventId")
        private Integer endEventId;

        @com.aliyun.core.annotation.NameInMap("Errors")
        private Integer errors;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private Integer eventId;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Latency")
        private Double latency;

        @com.aliyun.core.annotation.NameInMap("LockLatency")
        private Double lockLatency;

        @com.aliyun.core.annotation.NameInMap("LogicId")
        private String logicId;

        @com.aliyun.core.annotation.NameInMap("NoGoodIndexUsed")
        private Integer noGoodIndexUsed;

        @com.aliyun.core.annotation.NameInMap("NoIndexUsed")
        private Integer noIndexUsed;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("RowsAffected")
        private Integer rowsAffected;

        @com.aliyun.core.annotation.NameInMap("RowsExamined")
        private Integer rowsExamined;

        @com.aliyun.core.annotation.NameInMap("RowsSent")
        private Integer rowsSent;

        @com.aliyun.core.annotation.NameInMap("SelectFullJoin")
        private Integer selectFullJoin;

        @com.aliyun.core.annotation.NameInMap("SelectFullRangeJoin")
        private Integer selectFullRangeJoin;

        @com.aliyun.core.annotation.NameInMap("SelectRange")
        private Integer selectRange;

        @com.aliyun.core.annotation.NameInMap("SelectRangeCheck")
        private Integer selectRangeCheck;

        @com.aliyun.core.annotation.NameInMap("SelectScan")
        private Integer selectScan;

        @com.aliyun.core.annotation.NameInMap("SortMergePasses")
        private Integer sortMergePasses;

        @com.aliyun.core.annotation.NameInMap("SortRange")
        private Integer sortRange;

        @com.aliyun.core.annotation.NameInMap("SortRows")
        private Integer sortRows;

        @com.aliyun.core.annotation.NameInMap("SortScan")
        private Integer sortScan;

        @com.aliyun.core.annotation.NameInMap("Sql")
        private String sql;

        @com.aliyun.core.annotation.NameInMap("SqlId")
        private String sqlId;

        @com.aliyun.core.annotation.NameInMap("ThreadId")
        private Integer threadId;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Warnings")
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
             * <p>The number of internal on-disk temporary tables that were created when the SQL statement was executed.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder createTmpDiskTables(Integer createTmpDiskTables) {
                this.createTmpDiskTables = createTmpDiskTables;
                return this;
            }

            /**
             * <p>The number of internal temporary tables that were created when the SQL statement was executed.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder createTmpTables(Integer createTmpTables) {
                this.createTmpTables = createTmpTables;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>testDB</p>
             */
            public Builder db(String db) {
                this.db = db;
                return this;
            }

            /**
             * <p>The end ID of the event. By default, the value of this parameter is NULL when the event starts and is changed to the event ID when the event ends.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder endEventId(Integer endEventId) {
                this.endEventId = endEventId;
                return this;
            }

            /**
             * <p>The number of errors returned for the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder errors(Integer errors) {
                this.errors = errors;
                return this;
            }

            /**
             * <p>The event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>63735293</p>
             */
            public Builder eventId(Integer eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The name of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>statement/sql/select</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze1jdv45i7l6****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The execution duration. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>0.199</p>
             */
            public Builder latency(Double latency) {
                this.latency = latency;
                return this;
            }

            /**
             * <p>The lock wait duration. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>0.09</p>
             */
            public Builder lockLatency(Double lockLatency) {
                this.lockLatency = lockLatency;
                return this;
            }

            /**
             * <p>The ID of the logical database.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxx</p>
             */
            public Builder logicId(String logicId) {
                this.logicId = logicId;
                return this;
            }

            /**
             * <p>Indicates whether the server failed to find an index that can be used for the SQL statement. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes.</li>
             * <li><strong>0</strong>: no.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder noGoodIndexUsed(Integer noGoodIndexUsed) {
                this.noGoodIndexUsed = noGoodIndexUsed;
                return this;
            }

            /**
             * <p>Indicates whether table scans were performed when indexes were not used. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes.</li>
             * <li><strong>0</strong>: no.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder noIndexUsed(Integer noIndexUsed) {
                this.noIndexUsed = noIndexUsed;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * <blockquote>
             * <p> This parameter is returned only for ApsaraDB RDS for MySQL Cluster Edition instances or PolarDB for MySQL clusters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>r-x****-db-0</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The number of rows affected by the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rowsAffected(Integer rowsAffected) {
                this.rowsAffected = rowsAffected;
                return this;
            }

            /**
             * <p>The number of rows scanned by the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>2048576</p>
             */
            public Builder rowsExamined(Integer rowsExamined) {
                this.rowsExamined = rowsExamined;
                return this;
            }

            /**
             * <p>The number of rows returned by the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rowsSent(Integer rowsSent) {
                this.rowsSent = rowsSent;
                return this;
            }

            /**
             * <p>The number of joins that are used to perform table scans without using indexes.</p>
             * <blockquote>
             * <p>: This parameter is used for the scenario in which indexes are not used in a union query. If the returned value is not 0, check the indexes of tables.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder selectFullJoin(Integer selectFullJoin) {
                this.selectFullJoin = selectFullJoin;
                return this;
            }

            /**
             * <p>The number of joins that used ranges on referenced tables.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder selectFullRangeJoin(Integer selectFullRangeJoin) {
                this.selectFullRangeJoin = selectFullRangeJoin;
                return this;
            }

            /**
             * <p>The number of joins that used ranges on the first table.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder selectRange(Integer selectRange) {
                this.selectRange = selectRange;
                return this;
            }

            /**
             * <p>The number of joins that did not have key values. The keys and values were checked for each row of data.</p>
             * <blockquote>
             * <p>: This parameter is used for the scenario in which indexes are not used in a union query. If the returned value is not 0, check the indexes of tables.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder selectRangeCheck(Integer selectRangeCheck) {
                this.selectRangeCheck = selectRangeCheck;
                return this;
            }

            /**
             * <p>The number of scans.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder selectScan(Integer selectScan) {
                this.selectScan = selectScan;
                return this;
            }

            /**
             * <p>The number of merges that the sorting algorithm must perform.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sortMergePasses(Integer sortMergePasses) {
                this.sortMergePasses = sortMergePasses;
                return this;
            }

            /**
             * <p>The number of times the data was sorted by using ranges.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sortRange(Integer sortRange) {
                this.sortRange = sortRange;
                return this;
            }

            /**
             * <p>The number of sorted rows.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sortRows(Integer sortRows) {
                this.sortRows = sortRows;
                return this;
            }

            /**
             * <p>The number of sorts that were performed during table scans.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sortScan(Integer sortScan) {
                this.sortScan = sortScan;
                return this;
            }

            /**
             * <p>The sample SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>select * from xxxx where ****</p>
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * <p>The SQL statement ID.</p>
             * 
             * <strong>example:</strong>
             * <p>651b56fe9418d48edb8fdf0980ec****</p>
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * <p>The thread ID.</p>
             * 
             * <strong>example:</strong>
             * <p>81751940</p>
             */
            public Builder threadId(Integer threadId) {
                this.threadId = threadId;
                return this;
            }

            /**
             * <p>The time when the SQL statement was executed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1660100753556</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>196278346919****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The number of warnings returned for the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
