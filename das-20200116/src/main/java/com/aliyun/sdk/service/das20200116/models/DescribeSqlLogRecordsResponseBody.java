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
 * {@link DescribeSqlLogRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSqlLogRecordsResponseBody</p>
 */
public class DescribeSqlLogRecordsResponseBody extends TeaModel {
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

    private DescribeSqlLogRecordsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSqlLogRecordsResponseBody create() {
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

        private Builder(DescribeSqlLogRecordsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p>If the request is successful, <strong>Successful</strong> is returned. Otherwise, an error message is returned.</p>
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
         * <p>F43E7FB3-CE67-5FFD-A59C-EFD278BCD7BE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The request was successful.</p>
         * </li>
         * <li><p><strong>false</strong>: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSqlLogRecordsResponseBody build() {
            return new DescribeSqlLogRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSqlLogRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlLogRecordsResponseBody</p>
     */
    public static class SQLLogRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AffectColumns")
        private String affectColumns;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("ClientPort")
        private Long clientPort;

        @com.aliyun.core.annotation.NameInMap("Collection")
        private String collection;

        @com.aliyun.core.annotation.NameInMap("ConnectionId")
        private String connectionId;

        @com.aliyun.core.annotation.NameInMap("Consume")
        private Long consume;

        @com.aliyun.core.annotation.NameInMap("CpuTime")
        private Long cpuTime;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("ExecuteTime")
        private String executeTime;

        @com.aliyun.core.annotation.NameInMap("Ext")
        private String ext;

        @com.aliyun.core.annotation.NameInMap("Frows")
        private Long frows;

        @com.aliyun.core.annotation.NameInMap("HostAddress")
        private String hostAddress;

        @com.aliyun.core.annotation.NameInMap("LockTime")
        private Long lockTime;

        @com.aliyun.core.annotation.NameInMap("LogicRead")
        private Long logicRead;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("OriginTime")
        private Long originTime;

        @com.aliyun.core.annotation.NameInMap("ParallelDegree")
        private String parallelDegree;

        @com.aliyun.core.annotation.NameInMap("ParallelQueueTime")
        private String parallelQueueTime;

        @com.aliyun.core.annotation.NameInMap("Params")
        private String params;

        @com.aliyun.core.annotation.NameInMap("PhysicAsyncRead")
        private Long physicAsyncRead;

        @com.aliyun.core.annotation.NameInMap("PhysicRead")
        private Long physicRead;

        @com.aliyun.core.annotation.NameInMap("PhysicSyncRead")
        private Long physicSyncRead;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("ReturnRows")
        private Long returnRows;

        @com.aliyun.core.annotation.NameInMap("RowKey")
        private String rowKey;

        @com.aliyun.core.annotation.NameInMap("Rows")
        private Long rows;

        @com.aliyun.core.annotation.NameInMap("ScanRows")
        private Long scanRows;

        @com.aliyun.core.annotation.NameInMap("Scnt")
        private Long scnt;

        @com.aliyun.core.annotation.NameInMap("SqlId")
        private String sqlId;

        @com.aliyun.core.annotation.NameInMap("SqlText")
        private String sqlText;

        @com.aliyun.core.annotation.NameInMap("SqlType")
        private String sqlType;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("ThreadId")
        private Long threadId;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        @com.aliyun.core.annotation.NameInMap("TrxId")
        private String trxId;

        @com.aliyun.core.annotation.NameInMap("UpdateRows")
        private Long updateRows;

        @com.aliyun.core.annotation.NameInMap("UseImciEngine")
        private String useImciEngine;

        @com.aliyun.core.annotation.NameInMap("Vip")
        private String vip;

        @com.aliyun.core.annotation.NameInMap("Writes")
        private Long writes;

        private SQLLogRecord(Builder builder) {
            this.accountName = builder.accountName;
            this.affectColumns = builder.affectColumns;
            this.clientIp = builder.clientIp;
            this.clientPort = builder.clientPort;
            this.collection = builder.collection;
            this.connectionId = builder.connectionId;
            this.consume = builder.consume;
            this.cpuTime = builder.cpuTime;
            this.DBName = builder.DBName;
            this.executeTime = builder.executeTime;
            this.ext = builder.ext;
            this.frows = builder.frows;
            this.hostAddress = builder.hostAddress;
            this.lockTime = builder.lockTime;
            this.logicRead = builder.logicRead;
            this.nodeId = builder.nodeId;
            this.originTime = builder.originTime;
            this.parallelDegree = builder.parallelDegree;
            this.parallelQueueTime = builder.parallelQueueTime;
            this.params = builder.params;
            this.physicAsyncRead = builder.physicAsyncRead;
            this.physicRead = builder.physicRead;
            this.physicSyncRead = builder.physicSyncRead;
            this.protocol = builder.protocol;
            this.returnRows = builder.returnRows;
            this.rowKey = builder.rowKey;
            this.rows = builder.rows;
            this.scanRows = builder.scanRows;
            this.scnt = builder.scnt;
            this.sqlId = builder.sqlId;
            this.sqlText = builder.sqlText;
            this.sqlType = builder.sqlType;
            this.state = builder.state;
            this.tableName = builder.tableName;
            this.threadId = builder.threadId;
            this.traceId = builder.traceId;
            this.trxId = builder.trxId;
            this.updateRows = builder.updateRows;
            this.useImciEngine = builder.useImciEngine;
            this.vip = builder.vip;
            this.writes = builder.writes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SQLLogRecord create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return affectColumns
         */
        public String getAffectColumns() {
            return this.affectColumns;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return clientPort
         */
        public Long getClientPort() {
            return this.clientPort;
        }

        /**
         * @return collection
         */
        public String getCollection() {
            return this.collection;
        }

        /**
         * @return connectionId
         */
        public String getConnectionId() {
            return this.connectionId;
        }

        /**
         * @return consume
         */
        public Long getConsume() {
            return this.consume;
        }

        /**
         * @return cpuTime
         */
        public Long getCpuTime() {
            return this.cpuTime;
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return executeTime
         */
        public String getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return ext
         */
        public String getExt() {
            return this.ext;
        }

        /**
         * @return frows
         */
        public Long getFrows() {
            return this.frows;
        }

        /**
         * @return hostAddress
         */
        public String getHostAddress() {
            return this.hostAddress;
        }

        /**
         * @return lockTime
         */
        public Long getLockTime() {
            return this.lockTime;
        }

        /**
         * @return logicRead
         */
        public Long getLogicRead() {
            return this.logicRead;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return originTime
         */
        public Long getOriginTime() {
            return this.originTime;
        }

        /**
         * @return parallelDegree
         */
        public String getParallelDegree() {
            return this.parallelDegree;
        }

        /**
         * @return parallelQueueTime
         */
        public String getParallelQueueTime() {
            return this.parallelQueueTime;
        }

        /**
         * @return params
         */
        public String getParams() {
            return this.params;
        }

        /**
         * @return physicAsyncRead
         */
        public Long getPhysicAsyncRead() {
            return this.physicAsyncRead;
        }

        /**
         * @return physicRead
         */
        public Long getPhysicRead() {
            return this.physicRead;
        }

        /**
         * @return physicSyncRead
         */
        public Long getPhysicSyncRead() {
            return this.physicSyncRead;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return returnRows
         */
        public Long getReturnRows() {
            return this.returnRows;
        }

        /**
         * @return rowKey
         */
        public String getRowKey() {
            return this.rowKey;
        }

        /**
         * @return rows
         */
        public Long getRows() {
            return this.rows;
        }

        /**
         * @return scanRows
         */
        public Long getScanRows() {
            return this.scanRows;
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
         * @return sqlText
         */
        public String getSqlText() {
            return this.sqlText;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
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
        public Long getThreadId() {
            return this.threadId;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        /**
         * @return trxId
         */
        public String getTrxId() {
            return this.trxId;
        }

        /**
         * @return updateRows
         */
        public Long getUpdateRows() {
            return this.updateRows;
        }

        /**
         * @return useImciEngine
         */
        public String getUseImciEngine() {
            return this.useImciEngine;
        }

        /**
         * @return vip
         */
        public String getVip() {
            return this.vip;
        }

        /**
         * @return writes
         */
        public Long getWrites() {
            return this.writes;
        }

        public static final class Builder {
            private String accountName; 
            private String affectColumns; 
            private String clientIp; 
            private Long clientPort; 
            private String collection; 
            private String connectionId; 
            private Long consume; 
            private Long cpuTime; 
            private String DBName; 
            private String executeTime; 
            private String ext; 
            private Long frows; 
            private String hostAddress; 
            private Long lockTime; 
            private Long logicRead; 
            private String nodeId; 
            private Long originTime; 
            private String parallelDegree; 
            private String parallelQueueTime; 
            private String params; 
            private Long physicAsyncRead; 
            private Long physicRead; 
            private Long physicSyncRead; 
            private String protocol; 
            private Long returnRows; 
            private String rowKey; 
            private Long rows; 
            private Long scanRows; 
            private Long scnt; 
            private String sqlId; 
            private String sqlText; 
            private String sqlType; 
            private String state; 
            private String tableName; 
            private Long threadId; 
            private String traceId; 
            private String trxId; 
            private Long updateRows; 
            private String useImciEngine; 
            private String vip; 
            private Long writes; 

            private Builder() {
            } 

            private Builder(SQLLogRecord model) {
                this.accountName = model.accountName;
                this.affectColumns = model.affectColumns;
                this.clientIp = model.clientIp;
                this.clientPort = model.clientPort;
                this.collection = model.collection;
                this.connectionId = model.connectionId;
                this.consume = model.consume;
                this.cpuTime = model.cpuTime;
                this.DBName = model.DBName;
                this.executeTime = model.executeTime;
                this.ext = model.ext;
                this.frows = model.frows;
                this.hostAddress = model.hostAddress;
                this.lockTime = model.lockTime;
                this.logicRead = model.logicRead;
                this.nodeId = model.nodeId;
                this.originTime = model.originTime;
                this.parallelDegree = model.parallelDegree;
                this.parallelQueueTime = model.parallelQueueTime;
                this.params = model.params;
                this.physicAsyncRead = model.physicAsyncRead;
                this.physicRead = model.physicRead;
                this.physicSyncRead = model.physicSyncRead;
                this.protocol = model.protocol;
                this.returnRows = model.returnRows;
                this.rowKey = model.rowKey;
                this.rows = model.rows;
                this.scanRows = model.scanRows;
                this.scnt = model.scnt;
                this.sqlId = model.sqlId;
                this.sqlText = model.sqlText;
                this.sqlType = model.sqlType;
                this.state = model.state;
                this.tableName = model.tableName;
                this.threadId = model.threadId;
                this.traceId = model.traceId;
                this.trxId = model.trxId;
                this.updateRows = model.updateRows;
                this.useImciEngine = model.useImciEngine;
                this.vip = model.vip;
                this.writes = model.writes;
            } 

            /**
             * <p>The database account.</p>
             * 
             * <strong>example:</strong>
             * <p>testname</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The affected columns.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;col1&quot;]</p>
             */
            public Builder affectColumns(String affectColumns) {
                this.affectColumns = affectColumns;
                return this;
            }

            /**
             * <p>The client IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.1xx</p>
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * <p>The client port.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder clientPort(Long clientPort) {
                this.clientPort = clientPort;
                return this;
            }

            /**
             * <p>This parameter is reserved.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder collection(String collection) {
                this.collection = collection;
                return this;
            }

            /**
             * <p>The connection ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ld-******</p>
             */
            public Builder connectionId(String connectionId) {
                this.connectionId = connectionId;
                return this;
            }

            /**
             * <p>The execution duration. Unit: microseconds (μs).</p>
             * 
             * <strong>example:</strong>
             * <p>58</p>
             */
            public Builder consume(Long consume) {
                this.consume = consume;
                return this;
            }

            /**
             * <p>The CPU execution time. Unit: microseconds (μs).</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder cpuTime(Long cpuTime) {
                this.cpuTime = cpuTime;
                return this;
            }

            /**
             * <p>The database name.</p>
             * 
             * <strong>example:</strong>
             * <p>testdb</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>The execution time. The time is in UTC. Format: <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-12-07T02:15:32Z</p>
             */
            public Builder executeTime(String executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * <p>The extended information. This parameter is reserved.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder ext(String ext) {
                this.ext = ext;
                return this;
            }

            /**
             * <p>The number of rows fetched by the compute node (CN) in a PolarDB-X 2.0 instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder frows(Long frows) {
                this.frows = frows;
                return this;
            }

            /**
             * <p>The client IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>11.197.XX.XX</p>
             */
            public Builder hostAddress(String hostAddress) {
                this.hostAddress = hostAddress;
                return this;
            }

            /**
             * <p>The lock wait time. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lockTime(Long lockTime) {
                this.lockTime = lockTime;
                return this;
            }

            /**
             * <p>The number of logical reads.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder logicRead(Long logicRead) {
                this.logicRead = logicRead;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pi-uf6k5f6g3912i****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The execution time. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1701886532000</p>
             */
            public Builder originTime(Long originTime) {
                this.originTime = originTime;
                return this;
            }

            /**
             * <p>The degree of parallelism (DOP) for the PolarDB for MySQL instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder parallelDegree(String parallelDegree) {
                this.parallelDegree = parallelDegree;
                return this;
            }

            /**
             * <p>The parallel queue time for the PolarDB for MySQL instance. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder parallelQueueTime(String parallelQueueTime) {
                this.parallelQueueTime = parallelQueueTime;
                return this;
            }

            /**
             * <p>The SQL parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>[1, &quot;das&quot;]</p>
             */
            public Builder params(String params) {
                this.params = params;
                return this;
            }

            /**
             * <p>The number of asynchronous physical reads.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder physicAsyncRead(Long physicAsyncRead) {
                this.physicAsyncRead = physicAsyncRead;
                return this;
            }

            /**
             * <p>The number of physical reads.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder physicRead(Long physicRead) {
                this.physicRead = physicRead;
                return this;
            }

            /**
             * <p>The number of synchronous physical reads.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder physicSyncRead(Long physicSyncRead) {
                this.physicSyncRead = physicSyncRead;
                return this;
            }

            /**
             * <p>The protocol type.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The number of returned rows.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder returnRows(Long returnRows) {
                this.returnRows = returnRows;
                return this;
            }

            /**
             * <p>The row key of the SQL log record.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder rowKey(String rowKey) {
                this.rowKey = rowKey;
                return this;
            }

            /**
             * <p>The total number of rows updated or returned by the compute node (CN) of a PolarDB-X 2.0 instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder rows(Long rows) {
                this.rows = rows;
                return this;
            }

            /**
             * <p>The number of scanned rows.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scanRows(Long scanRows) {
                this.scanRows = scanRows;
                return this;
            }

            /**
             * <p>The number of requests sent from a compute node (CN) to data nodes (DNs) in a PolarDB-X 2.0 instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder scnt(Long scnt) {
                this.scnt = scnt;
                return this;
            }

            /**
             * <p>The SQL ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c67649d4a7fb62c4f8c7a447c52b5b17</p>
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * <p>The SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>select resource_id as cluster_id, tpl_name \n\tfrom dbfree_alert_resource_tpl_ref\n\twhere user_id=? and type=\&quot;cluster\&quot; group by resource_id, tpl_name</p>
             */
            public Builder sqlText(String sqlText) {
                this.sqlText = sqlText;
                return this;
            }

            /**
             * <p>The type of the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>select</p>
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * <p>The execution status. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: The execution was successful.</p>
             * </li>
             * <li><p><strong>1</strong>: The execution failed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The name of the table that the SQL statement references.</p>
             * 
             * <strong>example:</strong>
             * <p>das</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The thread ID.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder threadId(Long threadId) {
                this.threadId = threadId;
                return this;
            }

            /**
             * <p>The trace ID for a PolarDB-X 2.0 instance. This is the ID of the SQL statement that was executed on a data node (DN).</p>
             * 
             * <strong>example:</strong>
             * <p>14c93b7c7bf00000</p>
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * <p>The transaction ID.</p>
             * 
             * <strong>example:</strong>
             * <p>200000</p>
             */
            public Builder trxId(String trxId) {
                this.trxId = trxId;
                return this;
            }

            /**
             * <p>The number of updated rows.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder updateRows(Long updateRows) {
                this.updateRows = updateRows;
                return this;
            }

            /**
             * <p>Indicates whether an In-Memory Column Index (IMCI) is used for the PolarDB for MySQL instance.</p>
             * <ul>
             * <li><p><strong>true</strong></p>
             * </li>
             * <li><p><strong>false</strong></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder useImciEngine(String useImciEngine) {
                this.useImciEngine = useImciEngine;
                return this;
            }

            /**
             * <p>The endpoint that is resolved from the query connection string.</p>
             * 
             * <strong>example:</strong>
             * <p>100.115.XX.XX</p>
             */
            public Builder vip(String vip) {
                this.vip = vip;
                return this;
            }

            /**
             * <p>The number of write operations on an ApsaraDB RDS for SQL Server instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder writes(Long writes) {
                this.writes = writes;
                return this;
            }

            public SQLLogRecord build() {
                return new SQLLogRecord(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSqlLogRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlLogRecordsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SQLLogRecord")
        private java.util.List<SQLLogRecord> SQLLogRecord;

        private Items(Builder builder) {
            this.SQLLogRecord = builder.SQLLogRecord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return SQLLogRecord
         */
        public java.util.List<SQLLogRecord> getSQLLogRecord() {
            return this.SQLLogRecord;
        }

        public static final class Builder {
            private java.util.List<SQLLogRecord> SQLLogRecord; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.SQLLogRecord = model.SQLLogRecord;
            } 

            /**
             * <p>The SQL log data.</p>
             */
            public Builder SQLLogRecord(java.util.List<SQLLogRecord> SQLLogRecord) {
                this.SQLLogRecord = SQLLogRecord;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSqlLogRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlLogRecordsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Finish")
        private String finish;

        @com.aliyun.core.annotation.NameInMap("Items")
        private Items items;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("TotalRecords")
        private Long totalRecords;

        private Data(Builder builder) {
            this.endTime = builder.endTime;
            this.finish = builder.finish;
            this.items = builder.items;
            this.jobId = builder.jobId;
            this.startTime = builder.startTime;
            this.totalRecords = builder.totalRecords;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return finish
         */
        public String getFinish() {
            return this.finish;
        }

        /**
         * @return items
         */
        public Items getItems() {
            return this.items;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return totalRecords
         */
        public Long getTotalRecords() {
            return this.totalRecords;
        }

        public static final class Builder {
            private Long endTime; 
            private String finish; 
            private Items items; 
            private String jobId; 
            private Long startTime; 
            private Long totalRecords; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.endTime = model.endTime;
                this.finish = model.finish;
                this.items = model.items;
                this.jobId = model.jobId;
                this.startTime = model.startTime;
                this.totalRecords = model.totalRecords;
            } 

            /**
             * <p>The end time of the query. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1608888296000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Indicates whether the task is complete. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: The task is in progress.</p>
             * </li>
             * <li><p><strong>1</strong>: The task is complete.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>If this parameter is <strong>0</strong> and the <strong>JobId</strong> parameter is returned, the current request is an asynchronous request and you cannot obtain the returned results. You must use the value of <strong>JobId</strong> to initiate another request. Set the <strong>Filters</strong> parameter to the value of <strong>JobId</strong>. Example: <code>Filters=[{&quot;Key&quot;: &quot;JobId&quot;, &quot;Value&quot;: &quot;******&quot;}]</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder finish(String finish) {
                this.finish = finish;
                return this;
            }

            /**
             * <p>The details of the SQL logs.</p>
             */
            public Builder items(Items items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The asynchronous task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>MzI4NTZfUUlOR0RBT19DTTlfTlUyMF9NWVNRTF9PREJTX0xWU18zMjg1Nl9teXNxbF9XZWQgTWFyIDA2IDE0OjUwOjQ3IENTVCAyMDI0XzBfMzBfRXhlY3V0ZVRpbWVfREVTQ19XZWQgTWFyIDA2IDE0OjM1OjQ3IENTVCAyMDI0Xw==_1709708406465</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The start time of the query. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1596177993000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalRecords(Long totalRecords) {
                this.totalRecords = totalRecords;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
