// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLSamplesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLSamplesResponseBody</p>
 */
public class DescribeSQLSamplesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSQLSamplesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLSamplesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * The list of sample data of slow query execution details.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSQLSamplesResponseBody build() {
            return new DescribeSQLSamplesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AffectedRows")
        private Double affectedRows;

        @com.aliyun.core.annotation.NameInMap("ApplicationWaitTime")
        private Double applicationWaitTime;

        @com.aliyun.core.annotation.NameInMap("BlockCacheHit")
        private Double blockCacheHit;

        @com.aliyun.core.annotation.NameInMap("BlockIndexCacheHit")
        private Double blockIndexCacheHit;

        @com.aliyun.core.annotation.NameInMap("BloomFilterCacheHit")
        private Double bloomFilterCacheHit;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("ClientPort")
        private String clientPort;

        @com.aliyun.core.annotation.NameInMap("ConcurrencyWaitTime")
        private Double concurrencyWaitTime;

        @com.aliyun.core.annotation.NameInMap("ConsistencyLevel")
        private String consistencyLevel;

        @com.aliyun.core.annotation.NameInMap("CpuTime")
        private Double cpuTime;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("DecodeTime")
        private Double decodeTime;

        @com.aliyun.core.annotation.NameInMap("DiskReads")
        private Double diskReads;

        @com.aliyun.core.annotation.NameInMap("ElapsedTime")
        private Double elapsedTime;

        @com.aliyun.core.annotation.NameInMap("ExecuteTime")
        private Double executeTime;

        @com.aliyun.core.annotation.NameInMap("ExecutorRpc")
        private Boolean executorRpc;

        @com.aliyun.core.annotation.NameInMap("ExpectedWorkerCount")
        private Double expectedWorkerCount;

        @com.aliyun.core.annotation.NameInMap("FullSqlText")
        private String fullSqlText;

        @com.aliyun.core.annotation.NameInMap("GetPlanTime")
        private Double getPlanTime;

        @com.aliyun.core.annotation.NameInMap("HitPlan")
        private Boolean hitPlan;

        @com.aliyun.core.annotation.NameInMap("Inner")
        private Boolean inner;

        @com.aliyun.core.annotation.NameInMap("MemstoreReadRows")
        private Double memstoreReadRows;

        @com.aliyun.core.annotation.NameInMap("NetTime")
        private Double netTime;

        @com.aliyun.core.annotation.NameInMap("NetWaitTime")
        private Double netWaitTime;

        @com.aliyun.core.annotation.NameInMap("ObDbId")
        private Double obDbId;

        @com.aliyun.core.annotation.NameInMap("ObServerId")
        private Double obServerId;

        @com.aliyun.core.annotation.NameInMap("ObUserId")
        private Double obUserId;

        @com.aliyun.core.annotation.NameInMap("ParamsValue")
        private String paramsValue;

        @com.aliyun.core.annotation.NameInMap("PartitionCount")
        private Double partitionCount;

        @com.aliyun.core.annotation.NameInMap("PlanId")
        private Double planId;

        @com.aliyun.core.annotation.NameInMap("PlanType")
        private String planType;

        @com.aliyun.core.annotation.NameInMap("QueueTime")
        private Double queueTime;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("RequestTime")
        private String requestTime;

        @com.aliyun.core.annotation.NameInMap("RetCode")
        private Double retCode;

        @com.aliyun.core.annotation.NameInMap("RetryCount")
        private Double retryCount;

        @com.aliyun.core.annotation.NameInMap("ReturnRows")
        private Double returnRows;

        @com.aliyun.core.annotation.NameInMap("RowCacheHit")
        private Double rowCacheHit;

        @com.aliyun.core.annotation.NameInMap("RpcCount")
        private Double rpcCount;

        @com.aliyun.core.annotation.NameInMap("ScheduleTime")
        private Double scheduleTime;

        @com.aliyun.core.annotation.NameInMap("Server")
        private String server;

        @com.aliyun.core.annotation.NameInMap("SqlText")
        private String sqlText;

        @com.aliyun.core.annotation.NameInMap("SqlType")
        private String sqlType;

        @com.aliyun.core.annotation.NameInMap("SsstoreReadRows")
        private Double ssstoreReadRows;

        @com.aliyun.core.annotation.NameInMap("Statement")
        private String statement;

        @com.aliyun.core.annotation.NameInMap("TableScan")
        private Boolean tableScan;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        @com.aliyun.core.annotation.NameInMap("TransHash")
        private String transHash;

        @com.aliyun.core.annotation.NameInMap("UsedWorkerCount")
        private Double usedWorkerCount;

        @com.aliyun.core.annotation.NameInMap("UserIoWaitTime")
        private Double userIoWaitTime;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("WaitCount")
        private Double waitCount;

        @com.aliyun.core.annotation.NameInMap("WaitEvent")
        private String waitEvent;

        @com.aliyun.core.annotation.NameInMap("WaitTime")
        private Double waitTime;

        private Data(Builder builder) {
            this.affectedRows = builder.affectedRows;
            this.applicationWaitTime = builder.applicationWaitTime;
            this.blockCacheHit = builder.blockCacheHit;
            this.blockIndexCacheHit = builder.blockIndexCacheHit;
            this.bloomFilterCacheHit = builder.bloomFilterCacheHit;
            this.clientIp = builder.clientIp;
            this.clientPort = builder.clientPort;
            this.concurrencyWaitTime = builder.concurrencyWaitTime;
            this.consistencyLevel = builder.consistencyLevel;
            this.cpuTime = builder.cpuTime;
            this.dbName = builder.dbName;
            this.decodeTime = builder.decodeTime;
            this.diskReads = builder.diskReads;
            this.elapsedTime = builder.elapsedTime;
            this.executeTime = builder.executeTime;
            this.executorRpc = builder.executorRpc;
            this.expectedWorkerCount = builder.expectedWorkerCount;
            this.fullSqlText = builder.fullSqlText;
            this.getPlanTime = builder.getPlanTime;
            this.hitPlan = builder.hitPlan;
            this.inner = builder.inner;
            this.memstoreReadRows = builder.memstoreReadRows;
            this.netTime = builder.netTime;
            this.netWaitTime = builder.netWaitTime;
            this.obDbId = builder.obDbId;
            this.obServerId = builder.obServerId;
            this.obUserId = builder.obUserId;
            this.paramsValue = builder.paramsValue;
            this.partitionCount = builder.partitionCount;
            this.planId = builder.planId;
            this.planType = builder.planType;
            this.queueTime = builder.queueTime;
            this.requestId = builder.requestId;
            this.requestTime = builder.requestTime;
            this.retCode = builder.retCode;
            this.retryCount = builder.retryCount;
            this.returnRows = builder.returnRows;
            this.rowCacheHit = builder.rowCacheHit;
            this.rpcCount = builder.rpcCount;
            this.scheduleTime = builder.scheduleTime;
            this.server = builder.server;
            this.sqlText = builder.sqlText;
            this.sqlType = builder.sqlType;
            this.ssstoreReadRows = builder.ssstoreReadRows;
            this.statement = builder.statement;
            this.tableScan = builder.tableScan;
            this.traceId = builder.traceId;
            this.transHash = builder.transHash;
            this.usedWorkerCount = builder.usedWorkerCount;
            this.userIoWaitTime = builder.userIoWaitTime;
            this.userName = builder.userName;
            this.waitCount = builder.waitCount;
            this.waitEvent = builder.waitEvent;
            this.waitTime = builder.waitTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return affectedRows
         */
        public Double getAffectedRows() {
            return this.affectedRows;
        }

        /**
         * @return applicationWaitTime
         */
        public Double getApplicationWaitTime() {
            return this.applicationWaitTime;
        }

        /**
         * @return blockCacheHit
         */
        public Double getBlockCacheHit() {
            return this.blockCacheHit;
        }

        /**
         * @return blockIndexCacheHit
         */
        public Double getBlockIndexCacheHit() {
            return this.blockIndexCacheHit;
        }

        /**
         * @return bloomFilterCacheHit
         */
        public Double getBloomFilterCacheHit() {
            return this.bloomFilterCacheHit;
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
        public String getClientPort() {
            return this.clientPort;
        }

        /**
         * @return concurrencyWaitTime
         */
        public Double getConcurrencyWaitTime() {
            return this.concurrencyWaitTime;
        }

        /**
         * @return consistencyLevel
         */
        public String getConsistencyLevel() {
            return this.consistencyLevel;
        }

        /**
         * @return cpuTime
         */
        public Double getCpuTime() {
            return this.cpuTime;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return decodeTime
         */
        public Double getDecodeTime() {
            return this.decodeTime;
        }

        /**
         * @return diskReads
         */
        public Double getDiskReads() {
            return this.diskReads;
        }

        /**
         * @return elapsedTime
         */
        public Double getElapsedTime() {
            return this.elapsedTime;
        }

        /**
         * @return executeTime
         */
        public Double getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return executorRpc
         */
        public Boolean getExecutorRpc() {
            return this.executorRpc;
        }

        /**
         * @return expectedWorkerCount
         */
        public Double getExpectedWorkerCount() {
            return this.expectedWorkerCount;
        }

        /**
         * @return fullSqlText
         */
        public String getFullSqlText() {
            return this.fullSqlText;
        }

        /**
         * @return getPlanTime
         */
        public Double getGetPlanTime() {
            return this.getPlanTime;
        }

        /**
         * @return hitPlan
         */
        public Boolean getHitPlan() {
            return this.hitPlan;
        }

        /**
         * @return inner
         */
        public Boolean getInner() {
            return this.inner;
        }

        /**
         * @return memstoreReadRows
         */
        public Double getMemstoreReadRows() {
            return this.memstoreReadRows;
        }

        /**
         * @return netTime
         */
        public Double getNetTime() {
            return this.netTime;
        }

        /**
         * @return netWaitTime
         */
        public Double getNetWaitTime() {
            return this.netWaitTime;
        }

        /**
         * @return obDbId
         */
        public Double getObDbId() {
            return this.obDbId;
        }

        /**
         * @return obServerId
         */
        public Double getObServerId() {
            return this.obServerId;
        }

        /**
         * @return obUserId
         */
        public Double getObUserId() {
            return this.obUserId;
        }

        /**
         * @return paramsValue
         */
        public String getParamsValue() {
            return this.paramsValue;
        }

        /**
         * @return partitionCount
         */
        public Double getPartitionCount() {
            return this.partitionCount;
        }

        /**
         * @return planId
         */
        public Double getPlanId() {
            return this.planId;
        }

        /**
         * @return planType
         */
        public String getPlanType() {
            return this.planType;
        }

        /**
         * @return queueTime
         */
        public Double getQueueTime() {
            return this.queueTime;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return requestTime
         */
        public String getRequestTime() {
            return this.requestTime;
        }

        /**
         * @return retCode
         */
        public Double getRetCode() {
            return this.retCode;
        }

        /**
         * @return retryCount
         */
        public Double getRetryCount() {
            return this.retryCount;
        }

        /**
         * @return returnRows
         */
        public Double getReturnRows() {
            return this.returnRows;
        }

        /**
         * @return rowCacheHit
         */
        public Double getRowCacheHit() {
            return this.rowCacheHit;
        }

        /**
         * @return rpcCount
         */
        public Double getRpcCount() {
            return this.rpcCount;
        }

        /**
         * @return scheduleTime
         */
        public Double getScheduleTime() {
            return this.scheduleTime;
        }

        /**
         * @return server
         */
        public String getServer() {
            return this.server;
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
         * @return ssstoreReadRows
         */
        public Double getSsstoreReadRows() {
            return this.ssstoreReadRows;
        }

        /**
         * @return statement
         */
        public String getStatement() {
            return this.statement;
        }

        /**
         * @return tableScan
         */
        public Boolean getTableScan() {
            return this.tableScan;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        /**
         * @return transHash
         */
        public String getTransHash() {
            return this.transHash;
        }

        /**
         * @return usedWorkerCount
         */
        public Double getUsedWorkerCount() {
            return this.usedWorkerCount;
        }

        /**
         * @return userIoWaitTime
         */
        public Double getUserIoWaitTime() {
            return this.userIoWaitTime;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return waitCount
         */
        public Double getWaitCount() {
            return this.waitCount;
        }

        /**
         * @return waitEvent
         */
        public String getWaitEvent() {
            return this.waitEvent;
        }

        /**
         * @return waitTime
         */
        public Double getWaitTime() {
            return this.waitTime;
        }

        public static final class Builder {
            private Double affectedRows; 
            private Double applicationWaitTime; 
            private Double blockCacheHit; 
            private Double blockIndexCacheHit; 
            private Double bloomFilterCacheHit; 
            private String clientIp; 
            private String clientPort; 
            private Double concurrencyWaitTime; 
            private String consistencyLevel; 
            private Double cpuTime; 
            private String dbName; 
            private Double decodeTime; 
            private Double diskReads; 
            private Double elapsedTime; 
            private Double executeTime; 
            private Boolean executorRpc; 
            private Double expectedWorkerCount; 
            private String fullSqlText; 
            private Double getPlanTime; 
            private Boolean hitPlan; 
            private Boolean inner; 
            private Double memstoreReadRows; 
            private Double netTime; 
            private Double netWaitTime; 
            private Double obDbId; 
            private Double obServerId; 
            private Double obUserId; 
            private String paramsValue; 
            private Double partitionCount; 
            private Double planId; 
            private String planType; 
            private Double queueTime; 
            private String requestId; 
            private String requestTime; 
            private Double retCode; 
            private Double retryCount; 
            private Double returnRows; 
            private Double rowCacheHit; 
            private Double rpcCount; 
            private Double scheduleTime; 
            private String server; 
            private String sqlText; 
            private String sqlType; 
            private Double ssstoreReadRows; 
            private String statement; 
            private Boolean tableScan; 
            private String traceId; 
            private String transHash; 
            private Double usedWorkerCount; 
            private Double userIoWaitTime; 
            private String userName; 
            private Double waitCount; 
            private String waitEvent; 
            private Double waitTime; 

            /**
             * Average updated rows during the execution period.
             */
            public Builder affectedRows(Double affectedRows) {
                this.affectedRows = affectedRows;
                return this;
            }

            /**
             * Application event waiting time (in milliseconds).
             */
            public Builder applicationWaitTime(Double applicationWaitTime) {
                this.applicationWaitTime = applicationWaitTime;
                return this;
            }

            /**
             * BlockCache hit count
             */
            public Builder blockCacheHit(Double blockCacheHit) {
                this.blockCacheHit = blockCacheHit;
                return this;
            }

            /**
             * BlockIndexCache hit count
             */
            public Builder blockIndexCacheHit(Double blockIndexCacheHit) {
                this.blockIndexCacheHit = blockIndexCacheHit;
                return this;
            }

            /**
             * BloomFilterCache hit count.
             */
            public Builder bloomFilterCacheHit(Double bloomFilterCacheHit) {
                this.bloomFilterCacheHit = bloomFilterCacheHit;
                return this;
            }

            /**
             * Client IP.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * Client port.
             */
            public Builder clientPort(String clientPort) {
                this.clientPort = clientPort;
                return this;
            }

            /**
             * Concurrency event waiting time (in milliseconds).
             */
            public Builder concurrencyWaitTime(Double concurrencyWaitTime) {
                this.concurrencyWaitTime = concurrencyWaitTime;
                return this;
            }

            /**
             * Consistency level.
             */
            public Builder consistencyLevel(String consistencyLevel) {
                this.consistencyLevel = consistencyLevel;
                return this;
            }

            /**
             * CPU time (in milliseconds).
             */
            public Builder cpuTime(Double cpuTime) {
                this.cpuTime = cpuTime;
                return this;
            }

            /**
             * Database name.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * Syntax parsing time (in milliseconds).
             */
            public Builder decodeTime(Double decodeTime) {
                this.decodeTime = decodeTime;
                return this;
            }

            /**
             * Disk read count.
             */
            public Builder diskReads(Double diskReads) {
                this.diskReads = diskReads;
                return this;
            }

            /**
             * Response time (in milliseconds).
             */
            public Builder elapsedTime(Double elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * Plan execution time (in milliseconds).
             */
            public Builder executeTime(Double executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * Whether to initiate RPC.
             */
            public Builder executorRpc(Boolean executorRpc) {
                this.executorRpc = executorRpc;
                return this;
            }

            /**
             * Degree of parallelism.
             */
            public Builder expectedWorkerCount(Double expectedWorkerCount) {
                this.expectedWorkerCount = expectedWorkerCount;
                return this;
            }

            /**
             * FullSqlText.
             */
            public Builder fullSqlText(String fullSqlText) {
                this.fullSqlText = fullSqlText;
                return this;
            }

            /**
             * Plan generation time (in milliseconds).
             */
            public Builder getPlanTime(Double getPlanTime) {
                this.getPlanTime = getPlanTime;
                return this;
            }

            /**
             * Whether to hit the execution plan.
             */
            public Builder hitPlan(Boolean hitPlan) {
                this.hitPlan = hitPlan;
                return this;
            }

            /**
             * Whether an internal SQL.
             */
            public Builder inner(Boolean inner) {
                this.inner = inner;
                return this;
            }

            /**
             * Memstore read row count.
             */
            public Builder memstoreReadRows(Double memstoreReadRows) {
                this.memstoreReadRows = memstoreReadRows;
                return this;
            }

            /**
             * Network transmission time (in milliseconds).
             */
            public Builder netTime(Double netTime) {
                this.netTime = netTime;
                return this;
            }

            /**
             * Network enqueue time (in milliseconds).
             */
            public Builder netWaitTime(Double netWaitTime) {
                this.netWaitTime = netWaitTime;
                return this;
            }

            /**
             * Database ID.
             */
            public Builder obDbId(Double obDbId) {
                this.obDbId = obDbId;
                return this;
            }

            /**
             * Server  ID.
             */
            public Builder obServerId(Double obServerId) {
                this.obServerId = obServerId;
                return this;
            }

            /**
             * User ID.
             */
            public Builder obUserId(Double obUserId) {
                this.obUserId = obUserId;
                return this;
            }

            /**
             * ParamsValue.
             */
            public Builder paramsValue(String paramsValue) {
                this.paramsValue = paramsValue;
                return this;
            }

            /**
             * Average number of partition accessed during the execution period.
             */
            public Builder partitionCount(Double partitionCount) {
                this.partitionCount = partitionCount;
                return this;
            }

            /**
             * The execution plan ID.
             */
            public Builder planId(Double planId) {
                this.planId = planId;
                return this;
            }

            /**
             * Plan type.
             */
            public Builder planType(String planType) {
                this.planType = planType;
                return this;
            }

            /**
             * Queueing time (in milliseconds).
             */
            public Builder queueTime(Double queueTime) {
                this.queueTime = queueTime;
                return this;
            }

            /**
             * Request ID.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * SQL request time.
             */
            public Builder requestTime(String requestTime) {
                this.requestTime = requestTime;
                return this;
            }

            /**
             * Result code.
             */
            public Builder retCode(Double retCode) {
                this.retCode = retCode;
                return this;
            }

            /**
             * Retry count.
             */
            public Builder retryCount(Double retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * Average returned rows during the execution period.
             */
            public Builder returnRows(Double returnRows) {
                this.returnRows = returnRows;
                return this;
            }

            /**
             * RowCache hit count.
             */
            public Builder rowCacheHit(Double rowCacheHit) {
                this.rowCacheHit = rowCacheHit;
                return this;
            }

            /**
             * Number of RPC sent.
             */
            public Builder rpcCount(Double rpcCount) {
                this.rpcCount = rpcCount;
                return this;
            }

            /**
             * Schedule event waiting time (in milliseconds).
             */
            public Builder scheduleTime(Double scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            /**
             * The server where the SQL is executed.
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * SqlText.
             */
            public Builder sqlText(String sqlText) {
                this.sqlText = sqlText;
                return this;
            }

            /**
             * SQL type.
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * Ssstore read row count.
             */
            public Builder ssstoreReadRows(Double ssstoreReadRows) {
                this.ssstoreReadRows = ssstoreReadRows;
                return this;
            }

            /**
             * Parameterized SQL text.
             */
            public Builder statement(String statement) {
                this.statement = statement;
                return this;
            }

            /**
             * Whether to perform full table scan.
             */
            public Builder tableScan(Boolean tableScan) {
                this.tableScan = tableScan;
                return this;
            }

            /**
             * Trace ID.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * Transaction hash.
             */
            public Builder transHash(String transHash) {
                this.transHash = transHash;
                return this;
            }

            /**
             * Actual number of SQL execution threads.
             */
            public Builder usedWorkerCount(Double usedWorkerCount) {
                this.usedWorkerCount = usedWorkerCount;
                return this;
            }

            /**
             * UserIO event waiting time (in milliseconds).
             */
            public Builder userIoWaitTime(Double userIoWaitTime) {
                this.userIoWaitTime = userIoWaitTime;
                return this;
            }

            /**
             * Username.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * Wait count.
             */
            public Builder waitCount(Double waitCount) {
                this.waitCount = waitCount;
                return this;
            }

            /**
             * Longest wait event during the execution period.
             */
            public Builder waitEvent(String waitEvent) {
                this.waitEvent = waitEvent;
                return this;
            }

            /**
             * Wait time (in milliseconds).
             */
            public Builder waitTime(Double waitTime) {
                this.waitTime = waitTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
