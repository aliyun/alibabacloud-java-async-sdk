// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlowSQLHistoryListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowSQLHistoryListResponseBody</p>
 */
public class DescribeSlowSQLHistoryListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlowSQLHistoryList")
    private SlowSQLHistoryList slowSQLHistoryList;

    private DescribeSlowSQLHistoryListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slowSQLHistoryList = builder.slowSQLHistoryList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlowSQLHistoryListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slowSQLHistoryList
     */
    public SlowSQLHistoryList getSlowSQLHistoryList() {
        return this.slowSQLHistoryList;
    }

    public static final class Builder {
        private String requestId; 
        private SlowSQLHistoryList slowSQLHistoryList; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The execution history of the slow SQL statement.
         */
        public Builder slowSQLHistoryList(SlowSQLHistoryList slowSQLHistoryList) {
            this.slowSQLHistoryList = slowSQLHistoryList;
            return this;
        }

        public DescribeSlowSQLHistoryListResponseBody build() {
            return new DescribeSlowSQLHistoryListResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AffectedRows")
        private Double affectedRows;

        @com.aliyun.core.annotation.NameInMap("AppWaitTime")
        private Double appWaitTime;

        @com.aliyun.core.annotation.NameInMap("BlockCacheHit")
        private Double blockCacheHit;

        @com.aliyun.core.annotation.NameInMap("BlockIndexCacheHit")
        private Double blockIndexCacheHit;

        @com.aliyun.core.annotation.NameInMap("BloomFilterCacheHit")
        private Double bloomFilterCacheHit;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("ConcurrencyWaitTime")
        private Double concurrencyWaitTime;

        @com.aliyun.core.annotation.NameInMap("CpuTime")
        private Double cpuTime;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("DecodeTime")
        private Double decodeTime;

        @com.aliyun.core.annotation.NameInMap("DiskRead")
        private Double diskRead;

        @com.aliyun.core.annotation.NameInMap("ElapsedTime")
        private Double elapsedTime;

        @com.aliyun.core.annotation.NameInMap("EndTimeUTCString")
        private String endTimeUTCString;

        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("ExecPerSecond")
        private Double execPerSecond;

        @com.aliyun.core.annotation.NameInMap("ExecuteTime")
        private Double executeTime;

        @com.aliyun.core.annotation.NameInMap("Executions")
        private Double executions;

        @com.aliyun.core.annotation.NameInMap("FailTimes")
        private Double failTimes;

        @com.aliyun.core.annotation.NameInMap("GetPlanTime")
        private Double getPlanTime;

        @com.aliyun.core.annotation.NameInMap("IOWaitTime")
        private Double IOWaitTime;

        @com.aliyun.core.annotation.NameInMap("LogicalRead")
        private Double logicalRead;

        @com.aliyun.core.annotation.NameInMap("MaxCpuTime")
        private Double maxCpuTime;

        @com.aliyun.core.annotation.NameInMap("MaxElapsedTime")
        private Double maxElapsedTime;

        @com.aliyun.core.annotation.NameInMap("MemstoreReadRowCount")
        private Double memstoreReadRowCount;

        @com.aliyun.core.annotation.NameInMap("MissPlans")
        private Double missPlans;

        @com.aliyun.core.annotation.NameInMap("NetWaitTime")
        private Double netWaitTime;

        @com.aliyun.core.annotation.NameInMap("NodeIp")
        private String nodeIp;

        @com.aliyun.core.annotation.NameInMap("QueueTime")
        private Double queueTime;

        @com.aliyun.core.annotation.NameInMap("RPCCount")
        private Double RPCCount;

        @com.aliyun.core.annotation.NameInMap("RemotePlans")
        private Double remotePlans;

        @com.aliyun.core.annotation.NameInMap("RetryCount")
        private Double retryCount;

        @com.aliyun.core.annotation.NameInMap("ReturnRows")
        private Double returnRows;

        @com.aliyun.core.annotation.NameInMap("RowCacheHit")
        private Double rowCacheHit;

        @com.aliyun.core.annotation.NameInMap("ScheduleTime")
        private Double scheduleTime;

        @com.aliyun.core.annotation.NameInMap("SqlId")
        private String sqlId;

        @com.aliyun.core.annotation.NameInMap("SqlType")
        private String sqlType;

        @com.aliyun.core.annotation.NameInMap("SsstoreReadRowCount")
        private Double ssstoreReadRowCount;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        @com.aliyun.core.annotation.NameInMap("TotalWaitTime")
        private Double totalWaitTime;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private List(Builder builder) {
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
            this.endTimeUTCString = builder.endTimeUTCString;
            this.event = builder.event;
            this.execPerSecond = builder.execPerSecond;
            this.executeTime = builder.executeTime;
            this.executions = builder.executions;
            this.failTimes = builder.failTimes;
            this.getPlanTime = builder.getPlanTime;
            this.IOWaitTime = builder.IOWaitTime;
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
            this.scheduleTime = builder.scheduleTime;
            this.sqlId = builder.sqlId;
            this.sqlType = builder.sqlType;
            this.ssstoreReadRowCount = builder.ssstoreReadRowCount;
            this.tenantName = builder.tenantName;
            this.totalWaitTime = builder.totalWaitTime;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return affectedRows
         */
        public Double getAffectedRows() {
            return this.affectedRows;
        }

        /**
         * @return appWaitTime
         */
        public Double getAppWaitTime() {
            return this.appWaitTime;
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
         * @return concurrencyWaitTime
         */
        public Double getConcurrencyWaitTime() {
            return this.concurrencyWaitTime;
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
         * @return diskRead
         */
        public Double getDiskRead() {
            return this.diskRead;
        }

        /**
         * @return elapsedTime
         */
        public Double getElapsedTime() {
            return this.elapsedTime;
        }

        /**
         * @return endTimeUTCString
         */
        public String getEndTimeUTCString() {
            return this.endTimeUTCString;
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
        public Double getExecPerSecond() {
            return this.execPerSecond;
        }

        /**
         * @return executeTime
         */
        public Double getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return executions
         */
        public Double getExecutions() {
            return this.executions;
        }

        /**
         * @return failTimes
         */
        public Double getFailTimes() {
            return this.failTimes;
        }

        /**
         * @return getPlanTime
         */
        public Double getGetPlanTime() {
            return this.getPlanTime;
        }

        /**
         * @return IOWaitTime
         */
        public Double getIOWaitTime() {
            return this.IOWaitTime;
        }

        /**
         * @return logicalRead
         */
        public Double getLogicalRead() {
            return this.logicalRead;
        }

        /**
         * @return maxCpuTime
         */
        public Double getMaxCpuTime() {
            return this.maxCpuTime;
        }

        /**
         * @return maxElapsedTime
         */
        public Double getMaxElapsedTime() {
            return this.maxElapsedTime;
        }

        /**
         * @return memstoreReadRowCount
         */
        public Double getMemstoreReadRowCount() {
            return this.memstoreReadRowCount;
        }

        /**
         * @return missPlans
         */
        public Double getMissPlans() {
            return this.missPlans;
        }

        /**
         * @return netWaitTime
         */
        public Double getNetWaitTime() {
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
        public Double getQueueTime() {
            return this.queueTime;
        }

        /**
         * @return RPCCount
         */
        public Double getRPCCount() {
            return this.RPCCount;
        }

        /**
         * @return remotePlans
         */
        public Double getRemotePlans() {
            return this.remotePlans;
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
         * @return scheduleTime
         */
        public Double getScheduleTime() {
            return this.scheduleTime;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        /**
         * @return ssstoreReadRowCount
         */
        public Double getSsstoreReadRowCount() {
            return this.ssstoreReadRowCount;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        /**
         * @return totalWaitTime
         */
        public Double getTotalWaitTime() {
            return this.totalWaitTime;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Double affectedRows; 
            private Double appWaitTime; 
            private Double blockCacheHit; 
            private Double blockIndexCacheHit; 
            private Double bloomFilterCacheHit; 
            private String clientIp; 
            private Double concurrencyWaitTime; 
            private Double cpuTime; 
            private String dbName; 
            private Double decodeTime; 
            private Double diskRead; 
            private Double elapsedTime; 
            private String endTimeUTCString; 
            private String event; 
            private Double execPerSecond; 
            private Double executeTime; 
            private Double executions; 
            private Double failTimes; 
            private Double getPlanTime; 
            private Double IOWaitTime; 
            private Double logicalRead; 
            private Double maxCpuTime; 
            private Double maxElapsedTime; 
            private Double memstoreReadRowCount; 
            private Double missPlans; 
            private Double netWaitTime; 
            private String nodeIp; 
            private Double queueTime; 
            private Double RPCCount; 
            private Double remotePlans; 
            private Double retryCount; 
            private Double returnRows; 
            private Double rowCacheHit; 
            private Double scheduleTime; 
            private String sqlId; 
            private String sqlType; 
            private Double ssstoreReadRowCount; 
            private String tenantName; 
            private Double totalWaitTime; 
            private String userName; 

            /**
             * The number of rows affected.
             */
            public Builder affectedRows(Double affectedRows) {
                this.affectedRows = affectedRows;
                return this;
            }

            /**
             * The wait time of the client.
             */
            public Builder appWaitTime(Double appWaitTime) {
                this.appWaitTime = appWaitTime;
                return this;
            }

            /**
             * The number of block cache hits.
             */
            public Builder blockCacheHit(Double blockCacheHit) {
                this.blockCacheHit = blockCacheHit;
                return this;
            }

            /**
             * The number of block index cache hits.
             */
            public Builder blockIndexCacheHit(Double blockIndexCacheHit) {
                this.blockIndexCacheHit = blockIndexCacheHit;
                return this;
            }

            /**
             * The number of Bloom filter cache hits.
             */
            public Builder bloomFilterCacheHit(Double bloomFilterCacheHit) {
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
            public Builder concurrencyWaitTime(Double concurrencyWaitTime) {
                this.concurrencyWaitTime = concurrencyWaitTime;
                return this;
            }

            /**
             * The average CPU time.
             */
            public Builder cpuTime(Double cpuTime) {
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
            public Builder decodeTime(Double decodeTime) {
                this.decodeTime = decodeTime;
                return this;
            }

            /**
             * The number of physical reads.
             */
            public Builder diskRead(Double diskRead) {
                this.diskRead = diskRead;
                return this;
            }

            /**
             * The average response time.
             */
            public Builder elapsedTime(Double elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * The end time.
             */
            public Builder endTimeUTCString(String endTimeUTCString) {
                this.endTimeUTCString = endTimeUTCString;
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
            public Builder execPerSecond(Double execPerSecond) {
                this.execPerSecond = execPerSecond;
                return this;
            }

            /**
             * The internal execution time.
             */
            public Builder executeTime(Double executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * The number of executions.
             */
            public Builder executions(Double executions) {
                this.executions = executions;
                return this;
            }

            /**
             * The number of failures.
             */
            public Builder failTimes(Double failTimes) {
                this.failTimes = failTimes;
                return this;
            }

            /**
             * Hard parsing time.
             */
            public Builder getPlanTime(Double getPlanTime) {
                this.getPlanTime = getPlanTime;
                return this;
            }

            /**
             * The I/O wait time.
             */
            public Builder IOWaitTime(Double IOWaitTime) {
                this.IOWaitTime = IOWaitTime;
                return this;
            }

            /**
             * The number of logical reads.
             */
            public Builder logicalRead(Double logicalRead) {
                this.logicalRead = logicalRead;
                return this;
            }

            /**
             * The maximum CPU time.
             */
            public Builder maxCpuTime(Double maxCpuTime) {
                this.maxCpuTime = maxCpuTime;
                return this;
            }

            /**
             * The maximum response time.
             */
            public Builder maxElapsedTime(Double maxElapsedTime) {
                this.maxElapsedTime = maxElapsedTime;
                return this;
            }

            /**
             * The number of rows read from the memory.
             */
            public Builder memstoreReadRowCount(Double memstoreReadRowCount) {
                this.memstoreReadRowCount = memstoreReadRowCount;
                return this;
            }

            /**
             * The number of plan misses.
             */
            public Builder missPlans(Double missPlans) {
                this.missPlans = missPlans;
                return this;
            }

            /**
             * The wait time for network.
             */
            public Builder netWaitTime(Double netWaitTime) {
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
            public Builder queueTime(Double queueTime) {
                this.queueTime = queueTime;
                return this;
            }

            /**
             * The number of RPCs.
             */
            public Builder RPCCount(Double RPCCount) {
                this.RPCCount = RPCCount;
                return this;
            }

            /**
             * The number of remote plans.
             */
            public Builder remotePlans(Double remotePlans) {
                this.remotePlans = remotePlans;
                return this;
            }

            /**
             * The number of retries.
             */
            public Builder retryCount(Double retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * The number of rows returned.
             */
            public Builder returnRows(Double returnRows) {
                this.returnRows = returnRows;
                return this;
            }

            /**
             * The number of row cache hits.
             */
            public Builder rowCacheHit(Double rowCacheHit) {
                this.rowCacheHit = rowCacheHit;
                return this;
            }

            /**
             * The scheduling duration.
             */
            public Builder scheduleTime(Double scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            /**
             * SQLID.
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * The SQL type.
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * The number of rows read from the disk.
             */
            public Builder ssstoreReadRowCount(Double ssstoreReadRowCount) {
                this.ssstoreReadRowCount = ssstoreReadRowCount;
                return this;
            }

            /**
             * The name of the tenant.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * The internal wait time.
             */
            public Builder totalWaitTime(Double totalWaitTime) {
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

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class SlowSQLHistoryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List < List> list;

        private SlowSQLHistoryList(Builder builder) {
            this.count = builder.count;
            this.list = builder.list;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlowSQLHistoryList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        public static final class Builder {
            private Long count; 
            private java.util.List < List> list; 

            /**
             * The quantity.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The return result of the request.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            public SlowSQLHistoryList build() {
                return new SlowSQLHistoryList(this);
            } 

        } 

    }
}
