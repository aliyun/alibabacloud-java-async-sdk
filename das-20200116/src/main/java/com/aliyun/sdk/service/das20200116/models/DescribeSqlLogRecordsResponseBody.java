// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data that is returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * <blockquote>
         * <p> If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message that contains information such as an error code is returned.</p>
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
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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

        @com.aliyun.core.annotation.NameInMap("Collection")
        private String collection;

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

        @com.aliyun.core.annotation.NameInMap("PhysicAsyncRead")
        private Long physicAsyncRead;

        @com.aliyun.core.annotation.NameInMap("PhysicRead")
        private Long physicRead;

        @com.aliyun.core.annotation.NameInMap("PhysicSyncRead")
        private Long physicSyncRead;

        @com.aliyun.core.annotation.NameInMap("ReturnRows")
        private Long returnRows;

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
            this.collection = builder.collection;
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
            this.physicAsyncRead = builder.physicAsyncRead;
            this.physicRead = builder.physicRead;
            this.physicSyncRead = builder.physicSyncRead;
            this.returnRows = builder.returnRows;
            this.rows = builder.rows;
            this.scanRows = builder.scanRows;
            this.scnt = builder.scnt;
            this.sqlId = builder.sqlId;
            this.sqlText = builder.sqlText;
            this.sqlType = builder.sqlType;
            this.state = builder.state;
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
         * @return collection
         */
        public String getCollection() {
            return this.collection;
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
         * @return returnRows
         */
        public Long getReturnRows() {
            return this.returnRows;
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
            private String collection; 
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
            private Long physicAsyncRead; 
            private Long physicRead; 
            private Long physicSyncRead; 
            private Long returnRows; 
            private Long rows; 
            private Long scanRows; 
            private Long scnt; 
            private String sqlId; 
            private String sqlText; 
            private String sqlType; 
            private String state; 
            private Long threadId; 
            private String traceId; 
            private String trxId; 
            private Long updateRows; 
            private String useImciEngine; 
            private String vip; 
            private Long writes; 

            /**
             * <p>The account of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>testname</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder collection(String collection) {
                this.collection = collection;
                return this;
            }

            /**
             * <p>The amount of time that is consumed to execute the SQL statement. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>58</p>
             */
            public Builder consume(Long consume) {
                this.consume = consume;
                return this;
            }

            /**
             * <p>The CPU execution duration. Unit: microsecond.</p>
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
             * <p>The time when the SQL statement was executed. The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-12-07T02:15:32Z</p>
             */
            public Builder executeTime(String executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * <p>The extended information. This parameter is a reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder ext(String ext) {
                this.ext = ext;
                return this;
            }

            /**
             * <p>The number of rows that are pulled by the compute nodes of the PolarDB-X 2.0 instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder frows(Long frows) {
                this.frows = frows;
                return this;
            }

            /**
             * <p>The IP address of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>11.197.XX.XX</p>
             */
            public Builder hostAddress(String hostAddress) {
                this.hostAddress = hostAddress;
                return this;
            }

            /**
             * <p>The lock wait duration. Unit: millisecond.</p>
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
             * <p>The timestamp generated when the SQL statement was executed. The value of this parameter is a UNIX timestamp. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>1701886532000</p>
             */
            public Builder originTime(Long originTime) {
                this.originTime = originTime;
                return this;
            }

            /**
             * <p>The parallel queue time of the PolarDB for MySQL instance. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder parallelDegree(String parallelDegree) {
                this.parallelDegree = parallelDegree;
                return this;
            }

            /**
             * <p>The parallelism of the PolarDB for MySQL cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder parallelQueueTime(String parallelQueueTime) {
                this.parallelQueueTime = parallelQueueTime;
                return this;
            }

            /**
             * <p>The number of physical asynchronous reads.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder physicAsyncRead(Long physicAsyncRead) {
                this.physicAsyncRead = physicAsyncRead;
                return this;
            }

            /**
             * <p>The total number of physical reads.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder physicRead(Long physicRead) {
                this.physicRead = physicRead;
                return this;
            }

            /**
             * <p>The number of physical synchronous reads.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder physicSyncRead(Long physicSyncRead) {
                this.physicSyncRead = physicSyncRead;
                return this;
            }

            /**
             * <p>The number of rows returned by the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder returnRows(Long returnRows) {
                this.returnRows = returnRows;
                return this;
            }

            /**
             * <p>The total number of rows that are updated or returned by the compute nodes of the PolarDB-X 2.0 instance.</p>
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
             * <p>The number of requests that are sent from the compute nodes to the data nodes of the PolarDB-X 2.0 instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder scnt(Long scnt) {
                this.scnt = scnt;
                return this;
            }

            /**
             * <p>The SQL statement ID.</p>
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
             * <p>select resource_id as cluster_id, tpl_name \n\tfrom dbfree_alert_resource_tpl_ref\n\twhere user_id=? and type=&quot;cluster&quot; group by resource_id, tpl_name</p>
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
             * <p>The execution status of the SQL statement.</p>
             * <ul>
             * <li><strong>0</strong>: The execution was successful.</li>
             * <li><strong>1</strong>: The execution failed.</li>
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
             * <p>The trace ID of the PolarDB-X 2.0 instance. The value is the execution ID of the SQL statement on the data node.</p>
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
             * <p>The number of rows that are updated.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder updateRows(Long updateRows) {
                this.updateRows = updateRows;
                return this;
            }

            /**
             * <p>Indicates whether the In-Memory Column Index (IMCI) feature is enabled for the PolarDB for MySQL cluster. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>The IP address that is resolved from the endpoint of the query link.</p>
             * 
             * <strong>example:</strong>
             * <p>100.115.XX.XX</p>
             */
            public Builder vip(String vip) {
                this.vip = vip;
                return this;
            }

            /**
             * <p>The number of writes to the ApsaraDB RDS for SQL Server instance.</p>
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
        private java.util.List < SQLLogRecord> SQLLogRecord;

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
        public java.util.List < SQLLogRecord> getSQLLogRecord() {
            return this.SQLLogRecord;
        }

        public static final class Builder {
            private java.util.List < SQLLogRecord> SQLLogRecord; 

            /**
             * <p>The SQL log data.</p>
             */
            public Builder SQLLogRecord(java.util.List < SQLLogRecord> SQLLogRecord) {
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

            /**
             * <p>The end of the time range to query. This value is a UNIX timestamp. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>1608888296000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Indicates whether the task was complete. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no</li>
             * <li><strong>1</strong>: yes</li>
             * </ul>
             * <blockquote>
             * <p> If the value of <strong>Finish</strong> is 0 and the value of <strong>JobId</strong> is returned, the request is an asynchronous request and the return result cannot be directly obtained. You must query the return result based on the value of <strong>JobId</strong>. Specify JobId as the key of <strong>Filters</strong> and the value of <strong>JobId</strong> as the value of Filters. Example: <code>Filters=[{&quot;Key&quot;: &quot;JobId&quot;, &quot;Value&quot;: &quot;******&quot;}]</code>.</p>
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
             * <p>The data.</p>
             */
            public Builder items(Items items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The ID of the asynchronous task.</p>
             * 
             * <strong>example:</strong>
             * <p>MzI4NTZfUUlOR0RBT19DTTlfTlUyMF9NWVNRTF9PREJTX0xWU18zMjg1Nl9teXNxbF9XZWQgTWFyIDA2IDE0OjUwOjQ3IENTVCAyMDI0XzBfMzBfRXhlY3V0ZVRpbWVfREVTQ19XZWQgTWFyIDA2IDE0OjM1OjQ3IENTVCAyMDI0Xw==_1709708406465</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The beginning of the time range to query. This value is a UNIX timestamp. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>1596177993000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
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
