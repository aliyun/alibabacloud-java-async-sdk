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
 * {@link DescribeSqlLogTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSqlLogTaskResponseBody</p>
 */
public class DescribeSqlLogTaskResponseBody extends TeaModel {
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

    private DescribeSqlLogTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSqlLogTaskResponseBody create() {
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
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message is returned.</p>
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
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
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

        public DescribeSqlLogTaskResponseBody build() {
            return new DescribeSqlLogTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSqlLogTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlLogTaskResponseBody</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Object value;

        private Filters(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private Object value; 

            /**
             * <p>The name of the filter parameter.</p>
             * <blockquote>
             * <p> For more information about the filter parameters, see the <strong>Valid values of Key</strong> section of this topic.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>keyWords</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the filter parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>select</p>
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSqlLogTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlLogTaskResponseBody</p>
     */
    public static class Queries extends TeaModel {
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

        private Queries(Builder builder) {
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

        public static Queries create() {
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
             * Collection.
             */
            public Builder collection(String collection) {
                this.collection = collection;
                return this;
            }

            /**
             * <p>The execution duration. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>58</p>
             */
            public Builder consume(Long consume) {
                this.consume = consume;
                return this;
            }

            /**
             * <p>The CPU execution time. Unit: microsecond.</p>
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
             * <p>testdb01</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>The execution time. The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
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
             * <p>The number of rows pulled by the CNs of the PolarDB-X 2.0 instance.</p>
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
             * <p>The lock wait time. Unit: millisecond.</p>
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
             * <p>The ID of the child node.</p>
             * 
             * <strong>example:</strong>
             * <p>pi-bp1o58x3ib7e6****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The execution timestamp. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1701886532000</p>
             */
            public Builder originTime(Long originTime) {
                this.originTime = originTime;
                return this;
            }

            /**
             * <p>The wait time of parallel queries in the queue in the PolarDB for MySQL instance. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder parallelDegree(String parallelDegree) {
                this.parallelDegree = parallelDegree;
                return this;
            }

            /**
             * <p>The degree of parallelism (DOP) value of the PolarDB for MySQL instance.</p>
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
             * <p>The number of rows returned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder returnRows(Long returnRows) {
                this.returnRows = returnRows;
                return this;
            }

            /**
             * <p>The total number of rows updated or returned by the CNs of the PolarDB-X 2.0 instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder rows(Long rows) {
                this.rows = rows;
                return this;
            }

            /**
             * <p>The number of rows scanned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scanRows(Long scanRows) {
                this.scanRows = scanRows;
                return this;
            }

            /**
             * <p>The number of requests from the compute nodes (CNs) to the data nodes (DNs) in the PolarDB-X 2.0 instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder scnt(Long scnt) {
                this.scnt = scnt;
                return this;
            }

            /**
             * <p>The ID of the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>a4111670e80596c5bf42cf5154438a91</p>
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * <p>The queried SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT @@session.transaction_read_only</p>
             */
            public Builder sqlText(String sqlText) {
                this.sqlText = sqlText;
                return this;
            }

            /**
             * <p>The type of the SQL statement. Valid values:</p>
             * <ul>
             * <li><strong>SELECT</strong></li>
             * <li><strong>UPDATE</strong></li>
             * <li><strong>DELETE</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SELECT</p>
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * <p>The execution result of the SQL statement. Valid values:</p>
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
             * <p>The trace ID of the PolarDB-X 2.0 instance, which is the execution ID of the SQL statement on the DN.</p>
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
             * <p>The number of rows updated.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder updateRows(Long updateRows) {
                this.updateRows = updateRows;
                return this;
            }

            /**
             * <p>Indicates whether the PolarDB for MySQL instance uses In-Memory Column Indexes (IMCIs). Valid values:</p>
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
             * <p>The IP address to which the endpoint used for query is resolved.</p>
             * 
             * <strong>example:</strong>
             * <p>10.146.XX.XX</p>
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

            public Queries build() {
                return new Queries(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSqlLogTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlLogTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("End")
        private Long end;

        @com.aliyun.core.annotation.NameInMap("Expire")
        private Boolean expire;

        @com.aliyun.core.annotation.NameInMap("Export")
        private String export;

        @com.aliyun.core.annotation.NameInMap("Filters")
        private java.util.List<Filters> filters;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Queries")
        private java.util.List<Queries> queries;

        @com.aliyun.core.annotation.NameInMap("Start")
        private Long start;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.end = builder.end;
            this.expire = builder.expire;
            this.export = builder.export;
            this.filters = builder.filters;
            this.name = builder.name;
            this.queries = builder.queries;
            this.start = builder.start;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return end
         */
        public Long getEnd() {
            return this.end;
        }

        /**
         * @return expire
         */
        public Boolean getExpire() {
            return this.expire;
        }

        /**
         * @return export
         */
        public String getExport() {
            return this.export;
        }

        /**
         * @return filters
         */
        public java.util.List<Filters> getFilters() {
            return this.filters;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return queries
         */
        public java.util.List<Queries> getQueries() {
            return this.queries;
        }

        /**
         * @return start
         */
        public Long getStart() {
            return this.start;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long createTime; 
            private Long end; 
            private Boolean expire; 
            private String export; 
            private java.util.List<Filters> filters; 
            private String name; 
            private java.util.List<Queries> queries; 
            private Long start; 
            private String status; 
            private String taskId; 
            private String taskType; 
            private Long total; 

            /**
             * <p>The time when the task was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1681363254423</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The end of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1608888296000</p>
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * <p>Indicates whether the task has expired. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder expire(Boolean expire) {
                this.expire = expire;
                return this;
            }

            /**
             * <p>The download URL of the export task.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;<a href="https://das-sqllog-download-cn-hongkong.oss-cn-hongkong.aliyuncs.com/">https://das-sqllog-download-cn-hongkong.oss-cn-hongkong.aliyuncs.com/</a>****&quot;</p>
             */
            public Builder export(String export) {
                this.export = export;
                return this;
            }

            /**
             * <p>The filter parameters.</p>
             */
            public Builder filters(java.util.List<Filters> filters) {
                this.filters = filters;
                return this;
            }

            /**
             * <p>The task name.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The results of the offline querying task.</p>
             */
            public Builder queries(java.util.List<Queries> queries) {
                this.queries = queries;
                return this;
            }

            /**
             * <p>The beginning of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1596177993000</p>
             */
            public Builder start(Long start) {
                this.start = start;
                return this;
            }

            /**
             * <p>The task state. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The task is to be scheduled.</li>
             * <li><strong>RUNNING</strong>: The task is running.</li>
             * <li><strong>FAILED</strong>: The task failed.</li>
             * <li><strong>CANCELED</strong>: The task is canceled.</li>
             * <li><strong>COMPLETED</strong>: The task is complete.</li>
             * </ul>
             * <blockquote>
             * <p> If a task is in the <strong>COMPLETED</strong> state, you can view the results of the task.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>COMPLETED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9a4f5c4494dbd6713185d87a97aa53e8</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task type. Valid values:</p>
             * <ul>
             * <li><strong>Export</strong></li>
             * <li><strong>Query</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Query</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The total number of tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
