// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlowSQLListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowSQLListResponseBody</p>
 */
public class DescribeSlowSQLListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlowSQLList")
    private java.util.List < SlowSQLList> slowSQLList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeSlowSQLListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slowSQLList = builder.slowSQLList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlowSQLListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slowSQLList
     */
    public java.util.List < SlowSQLList> getSlowSQLList() {
        return this.slowSQLList;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SlowSQLList> slowSQLList; 
        private Long totalCount; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of slow SQL statements.
         */
        public Builder slowSQLList(java.util.List < SlowSQLList> slowSQLList) {
            this.slowSQLList = slowSQLList;
            return this;
        }

        /**
         * The total count.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSlowSQLListResponseBody build() {
            return new DescribeSlowSQLListResponseBody(this);
        } 

    } 

    public static class SlowSQLList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AffectedRows")
        private Long affectedRows;

        @com.aliyun.core.annotation.NameInMap("AppWaitTime")
        private Float appWaitTime;

        @com.aliyun.core.annotation.NameInMap("BlockCacheHit")
        private Long blockCacheHit;

        @com.aliyun.core.annotation.NameInMap("BlockIndexCacheHit")
        private Long blockIndexCacheHit;

        @com.aliyun.core.annotation.NameInMap("BloomFilterCacheHit")
        private Long bloomFilterCacheHit;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("ConcurrencyWaitTime")
        private Float concurrencyWaitTime;

        @com.aliyun.core.annotation.NameInMap("CpuTime")
        private Float cpuTime;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("DecodeTime")
        private Float decodeTime;

        @com.aliyun.core.annotation.NameInMap("DiskRead")
        private Long diskRead;

        @com.aliyun.core.annotation.NameInMap("ElapsedTime")
        private Float elapsedTime;

        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("ExecPerSecond")
        private Float execPerSecond;

        @com.aliyun.core.annotation.NameInMap("ExecuteTime")
        private Float executeTime;

        @com.aliyun.core.annotation.NameInMap("Executions")
        private Long executions;

        @com.aliyun.core.annotation.NameInMap("FailTimes")
        private Long failTimes;

        @com.aliyun.core.annotation.NameInMap("GetPlanTime")
        private Float getPlanTime;

        @com.aliyun.core.annotation.NameInMap("IOWaitTime")
        private Float IOWaitTime;

        @com.aliyun.core.annotation.NameInMap("Key")
        private Long key;

        @com.aliyun.core.annotation.NameInMap("LogicalRead")
        private Long logicalRead;

        @com.aliyun.core.annotation.NameInMap("MaxCpuTime")
        private Float maxCpuTime;

        @com.aliyun.core.annotation.NameInMap("MaxElapsedTime")
        private Float maxElapsedTime;

        @com.aliyun.core.annotation.NameInMap("MemstoreReadRowCount")
        private Long memstoreReadRowCount;

        @com.aliyun.core.annotation.NameInMap("MissPlans")
        private Long missPlans;

        @com.aliyun.core.annotation.NameInMap("NetWaitTime")
        private Float netWaitTime;

        @com.aliyun.core.annotation.NameInMap("NodeIp")
        private String nodeIp;

        @com.aliyun.core.annotation.NameInMap("QueueTime")
        private Float queueTime;

        @com.aliyun.core.annotation.NameInMap("RPCCount")
        private Long RPCCount;

        @com.aliyun.core.annotation.NameInMap("RemotePlans")
        private Long remotePlans;

        @com.aliyun.core.annotation.NameInMap("RetryCount")
        private Long retryCount;

        @com.aliyun.core.annotation.NameInMap("ReturnRows")
        private Long returnRows;

        @com.aliyun.core.annotation.NameInMap("RowCacheHit")
        private Long rowCacheHit;

        @com.aliyun.core.annotation.NameInMap("SQLId")
        private String SQLId;

        @com.aliyun.core.annotation.NameInMap("SQLText")
        private String SQLText;

        @com.aliyun.core.annotation.NameInMap("SQLType")
        private Long SQLType;

        @com.aliyun.core.annotation.NameInMap("ScheduleTime")
        private Float scheduleTime;

        @com.aliyun.core.annotation.NameInMap("SsstoreReadRowCount")
        private Long ssstoreReadRowCount;

        @com.aliyun.core.annotation.NameInMap("TotalWaitTime")
        private Float totalWaitTime;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private SlowSQLList(Builder builder) {
            this.affectedRows = builder.affectedRows;
            this.appWaitTime = builder.appWaitTime;
            this.blockCacheHit = builder.blockCacheHit;
            this.blockIndexCacheHit = builder.blockIndexCacheHit;
            this.bloomFilterCacheHit = builder.bloomFilterCacheHit;
            this.clientIp = builder.clientIp;
            this.concurrencyWaitTime = builder.concurrencyWaitTime;
            this.cpuTime = builder.cpuTime;
            this.dbName = builder.dbName;
            this.decodeTime = builder.decodeTime;
            this.diskRead = builder.diskRead;
            this.elapsedTime = builder.elapsedTime;
            this.event = builder.event;
            this.execPerSecond = builder.execPerSecond;
            this.executeTime = builder.executeTime;
            this.executions = builder.executions;
            this.failTimes = builder.failTimes;
            this.getPlanTime = builder.getPlanTime;
            this.IOWaitTime = builder.IOWaitTime;
            this.key = builder.key;
            this.logicalRead = builder.logicalRead;
            this.maxCpuTime = builder.maxCpuTime;
            this.maxElapsedTime = builder.maxElapsedTime;
            this.memstoreReadRowCount = builder.memstoreReadRowCount;
            this.missPlans = builder.missPlans;
            this.netWaitTime = builder.netWaitTime;
            this.nodeIp = builder.nodeIp;
            this.queueTime = builder.queueTime;
            this.RPCCount = builder.RPCCount;
            this.remotePlans = builder.remotePlans;
            this.retryCount = builder.retryCount;
            this.returnRows = builder.returnRows;
            this.rowCacheHit = builder.rowCacheHit;
            this.SQLId = builder.SQLId;
            this.SQLText = builder.SQLText;
            this.SQLType = builder.SQLType;
            this.scheduleTime = builder.scheduleTime;
            this.ssstoreReadRowCount = builder.ssstoreReadRowCount;
            this.totalWaitTime = builder.totalWaitTime;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlowSQLList create() {
            return builder().build();
        }

        /**
         * @return affectedRows
         */
        public Long getAffectedRows() {
            return this.affectedRows;
        }

        /**
         * @return appWaitTime
         */
        public Float getAppWaitTime() {
            return this.appWaitTime;
        }

        /**
         * @return blockCacheHit
         */
        public Long getBlockCacheHit() {
            return this.blockCacheHit;
        }

        /**
         * @return blockIndexCacheHit
         */
        public Long getBlockIndexCacheHit() {
            return this.blockIndexCacheHit;
        }

        /**
         * @return bloomFilterCacheHit
         */
        public Long getBloomFilterCacheHit() {
            return this.bloomFilterCacheHit;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return concurrencyWaitTime
         */
        public Float getConcurrencyWaitTime() {
            return this.concurrencyWaitTime;
        }

        /**
         * @return cpuTime
         */
        public Float getCpuTime() {
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
        public Float getDecodeTime() {
            return this.decodeTime;
        }

        /**
         * @return diskRead
         */
        public Long getDiskRead() {
            return this.diskRead;
        }

        /**
         * @return elapsedTime
         */
        public Float getElapsedTime() {
            return this.elapsedTime;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return execPerSecond
         */
        public Float getExecPerSecond() {
            return this.execPerSecond;
        }

        /**
         * @return executeTime
         */
        public Float getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return executions
         */
        public Long getExecutions() {
            return this.executions;
        }

        /**
         * @return failTimes
         */
        public Long getFailTimes() {
            return this.failTimes;
        }

        /**
         * @return getPlanTime
         */
        public Float getGetPlanTime() {
            return this.getPlanTime;
        }

        /**
         * @return IOWaitTime
         */
        public Float getIOWaitTime() {
            return this.IOWaitTime;
        }

        /**
         * @return key
         */
        public Long getKey() {
            return this.key;
        }

        /**
         * @return logicalRead
         */
        public Long getLogicalRead() {
            return this.logicalRead;
        }

        /**
         * @return maxCpuTime
         */
        public Float getMaxCpuTime() {
            return this.maxCpuTime;
        }

        /**
         * @return maxElapsedTime
         */
        public Float getMaxElapsedTime() {
            return this.maxElapsedTime;
        }

        /**
         * @return memstoreReadRowCount
         */
        public Long getMemstoreReadRowCount() {
            return this.memstoreReadRowCount;
        }

        /**
         * @return missPlans
         */
        public Long getMissPlans() {
            return this.missPlans;
        }

        /**
         * @return netWaitTime
         */
        public Float getNetWaitTime() {
            return this.netWaitTime;
        }

        /**
         * @return nodeIp
         */
        public String getNodeIp() {
            return this.nodeIp;
        }

        /**
         * @return queueTime
         */
        public Float getQueueTime() {
            return this.queueTime;
        }

        /**
         * @return RPCCount
         */
        public Long getRPCCount() {
            return this.RPCCount;
        }

        /**
         * @return remotePlans
         */
        public Long getRemotePlans() {
            return this.remotePlans;
        }

        /**
         * @return retryCount
         */
        public Long getRetryCount() {
            return this.retryCount;
        }

        /**
         * @return returnRows
         */
        public Long getReturnRows() {
            return this.returnRows;
        }

        /**
         * @return rowCacheHit
         */
        public Long getRowCacheHit() {
            return this.rowCacheHit;
        }

        /**
         * @return SQLId
         */
        public String getSQLId() {
            return this.SQLId;
        }

        /**
         * @return SQLText
         */
        public String getSQLText() {
            return this.SQLText;
        }

        /**
         * @return SQLType
         */
        public Long getSQLType() {
            return this.SQLType;
        }

        /**
         * @return scheduleTime
         */
        public Float getScheduleTime() {
            return this.scheduleTime;
        }

        /**
         * @return ssstoreReadRowCount
         */
        public Long getSsstoreReadRowCount() {
            return this.ssstoreReadRowCount;
        }

        /**
         * @return totalWaitTime
         */
        public Float getTotalWaitTime() {
            return this.totalWaitTime;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Long affectedRows; 
            private Float appWaitTime; 
            private Long blockCacheHit; 
            private Long blockIndexCacheHit; 
            private Long bloomFilterCacheHit; 
            private String clientIp; 
            private Float concurrencyWaitTime; 
            private Float cpuTime; 
            private String dbName; 
            private Float decodeTime; 
            private Long diskRead; 
            private Float elapsedTime; 
            private String event; 
            private Float execPerSecond; 
            private Float executeTime; 
            private Long executions; 
            private Long failTimes; 
            private Float getPlanTime; 
            private Float IOWaitTime; 
            private Long key; 
            private Long logicalRead; 
            private Float maxCpuTime; 
            private Float maxElapsedTime; 
            private Long memstoreReadRowCount; 
            private Long missPlans; 
            private Float netWaitTime; 
            private String nodeIp; 
            private Float queueTime; 
            private Long RPCCount; 
            private Long remotePlans; 
            private Long retryCount; 
            private Long returnRows; 
            private Long rowCacheHit; 
            private String SQLId; 
            private String SQLText; 
            private Long SQLType; 
            private Float scheduleTime; 
            private Long ssstoreReadRowCount; 
            private Float totalWaitTime; 
            private String userName; 

            /**
             * The number of rows affected.
             */
            public Builder affectedRows(Long affectedRows) {
                this.affectedRows = affectedRows;
                return this;
            }

            /**
             * The wait time of the client.
             */
            public Builder appWaitTime(Float appWaitTime) {
                this.appWaitTime = appWaitTime;
                return this;
            }

            /**
             * The number of block cache hits.
             */
            public Builder blockCacheHit(Long blockCacheHit) {
                this.blockCacheHit = blockCacheHit;
                return this;
            }

            /**
             * The number of block index cache hits.
             */
            public Builder blockIndexCacheHit(Long blockIndexCacheHit) {
                this.blockIndexCacheHit = blockIndexCacheHit;
                return this;
            }

            /**
             * The number of Bloom filter cache hits.
             */
            public Builder bloomFilterCacheHit(Long bloomFilterCacheHit) {
                this.bloomFilterCacheHit = bloomFilterCacheHit;
                return this;
            }

            /**
             * The IP address of the client.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * The wait time in concurrent execution.
             */
            public Builder concurrencyWaitTime(Float concurrencyWaitTime) {
                this.concurrencyWaitTime = concurrencyWaitTime;
                return this;
            }

            /**
             * The average CPU time.
             */
            public Builder cpuTime(Float cpuTime) {
                this.cpuTime = cpuTime;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * The time to wait for decoding.
             */
            public Builder decodeTime(Float decodeTime) {
                this.decodeTime = decodeTime;
                return this;
            }

            /**
             * The number of physical reads.
             */
            public Builder diskRead(Long diskRead) {
                this.diskRead = diskRead;
                return this;
            }

            /**
             * The average response time.
             */
            public Builder elapsedTime(Float elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * The wait event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * The number of executions per second.
             */
            public Builder execPerSecond(Float execPerSecond) {
                this.execPerSecond = execPerSecond;
                return this;
            }

            /**
             * The internal execution time.
             */
            public Builder executeTime(Float executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * The number of executions.
             */
            public Builder executions(Long executions) {
                this.executions = executions;
                return this;
            }

            /**
             * The number of failures.
             */
            public Builder failTimes(Long failTimes) {
                this.failTimes = failTimes;
                return this;
            }

            /**
             * The time spent in hard parsing.
             */
            public Builder getPlanTime(Float getPlanTime) {
                this.getPlanTime = getPlanTime;
                return this;
            }

            /**
             * The I/O wait time.
             */
            public Builder IOWaitTime(Float IOWaitTime) {
                this.IOWaitTime = IOWaitTime;
                return this;
            }

            /**
             * The sequence number of the returned SQL statement.
             */
            public Builder key(Long key) {
                this.key = key;
                return this;
            }

            /**
             * The number of logical reads.
             */
            public Builder logicalRead(Long logicalRead) {
                this.logicalRead = logicalRead;
                return this;
            }

            /**
             * The maximum CPU time.
             */
            public Builder maxCpuTime(Float maxCpuTime) {
                this.maxCpuTime = maxCpuTime;
                return this;
            }

            /**
             * The maximum response time.
             */
            public Builder maxElapsedTime(Float maxElapsedTime) {
                this.maxElapsedTime = maxElapsedTime;
                return this;
            }

            /**
             * The number of rows read from the memory.
             */
            public Builder memstoreReadRowCount(Long memstoreReadRowCount) {
                this.memstoreReadRowCount = memstoreReadRowCount;
                return this;
            }

            /**
             * The number of plan misses.
             */
            public Builder missPlans(Long missPlans) {
                this.missPlans = missPlans;
                return this;
            }

            /**
             * The network latency.
             */
            public Builder netWaitTime(Float netWaitTime) {
                this.netWaitTime = netWaitTime;
                return this;
            }

            /**
             * The IP address of the node.
             */
            public Builder nodeIp(String nodeIp) {
                this.nodeIp = nodeIp;
                return this;
            }

            /**
             * The queuing time.
             */
            public Builder queueTime(Float queueTime) {
                this.queueTime = queueTime;
                return this;
            }

            /**
             * The number of RPCs.
             */
            public Builder RPCCount(Long RPCCount) {
                this.RPCCount = RPCCount;
                return this;
            }

            /**
             * The number of remote plans.
             */
            public Builder remotePlans(Long remotePlans) {
                this.remotePlans = remotePlans;
                return this;
            }

            /**
             * The number of retries.
             */
            public Builder retryCount(Long retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * The number of rows returned.
             */
            public Builder returnRows(Long returnRows) {
                this.returnRows = returnRows;
                return this;
            }

            /**
             * The number of row cache hits.
             */
            public Builder rowCacheHit(Long rowCacheHit) {
                this.rowCacheHit = rowCacheHit;
                return this;
            }

            /**
             * SQLID.
             */
            public Builder SQLId(String SQLId) {
                this.SQLId = SQLId;
                return this;
            }

            /**
             * The SQL text.
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * The SQL type.
             */
            public Builder SQLType(Long SQLType) {
                this.SQLType = SQLType;
                return this;
            }

            /**
             * The scheduling duration.
             */
            public Builder scheduleTime(Float scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            /**
             * The number of rows read from the disk.
             */
            public Builder ssstoreReadRowCount(Long ssstoreReadRowCount) {
                this.ssstoreReadRowCount = ssstoreReadRowCount;
                return this;
            }

            /**
             * The internal wait time.
             */
            public Builder totalWaitTime(Float totalWaitTime) {
                this.totalWaitTime = totalWaitTime;
                return this;
            }

            /**
             * The username.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public SlowSQLList build() {
                return new SlowSQLList(this);
            } 

        } 

    }
}
