// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlowSQLHistoryListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowSQLHistoryListResponseBody</p>
 */
public class DescribeSlowSQLHistoryListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SlowSQLHistoryList")
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
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 慢SQL历史列表
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
        @NameInMap("AffectedRows")
        private Double affectedRows;

        @NameInMap("AppWaitTime")
        private Double appWaitTime;

        @NameInMap("BlockCacheHit")
        private Double blockCacheHit;

        @NameInMap("BlockIndexCacheHit")
        private Double blockIndexCacheHit;

        @NameInMap("BloomFilterCacheHit")
        private Double bloomFilterCacheHit;

        @NameInMap("ClientIp")
        private String clientIp;

        @NameInMap("ConcurrencyWaitTime")
        private Double concurrencyWaitTime;

        @NameInMap("CpuTime")
        private Double cpuTime;

        @NameInMap("DbName")
        private String dbName;

        @NameInMap("DecodeTime")
        private Double decodeTime;

        @NameInMap("DiskRead")
        private Double diskRead;

        @NameInMap("ElapsedTime")
        private Double elapsedTime;

        @NameInMap("EndTimeUTCString")
        private String endTimeUTCString;

        @NameInMap("Event")
        private String event;

        @NameInMap("ExecPerSecond")
        private Double execPerSecond;

        @NameInMap("ExecuteTime")
        private Double executeTime;

        @NameInMap("Executions")
        private Double executions;

        @NameInMap("FailTimes")
        private Double failTimes;

        @NameInMap("GetPlanTime")
        private Double getPlanTime;

        @NameInMap("IOWaitTime")
        private Double IOWaitTime;

        @NameInMap("LogicalRead")
        private Double logicalRead;

        @NameInMap("MaxCpuTime")
        private Double maxCpuTime;

        @NameInMap("MaxElapsedTime")
        private Double maxElapsedTime;

        @NameInMap("MemstoreReadRowCount")
        private Double memstoreReadRowCount;

        @NameInMap("MissPlans")
        private Double missPlans;

        @NameInMap("NetWaitTime")
        private Double netWaitTime;

        @NameInMap("NodeIp")
        private String nodeIp;

        @NameInMap("QueueTime")
        private Double queueTime;

        @NameInMap("RPCCount")
        private Double RPCCount;

        @NameInMap("RemotePlans")
        private Double remotePlans;

        @NameInMap("RetryCount")
        private Double retryCount;

        @NameInMap("ReturnRows")
        private Double returnRows;

        @NameInMap("RowCacheHit")
        private Double rowCacheHit;

        @NameInMap("ScheduleTime")
        private Double scheduleTime;

        @NameInMap("SqlId")
        private String sqlId;

        @NameInMap("SqlType")
        private String sqlType;

        @NameInMap("SsstoreReadRowCount")
        private Double ssstoreReadRowCount;

        @NameInMap("TenantName")
        private String tenantName;

        @NameInMap("TotalWaitTime")
        private Double totalWaitTime;

        @NameInMap("UserName")
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
             * AffectedRows.
             */
            public Builder affectedRows(Double affectedRows) {
                this.affectedRows = affectedRows;
                return this;
            }

            /**
             * AppWaitTime.
             */
            public Builder appWaitTime(Double appWaitTime) {
                this.appWaitTime = appWaitTime;
                return this;
            }

            /**
             * BlockCacheHit.
             */
            public Builder blockCacheHit(Double blockCacheHit) {
                this.blockCacheHit = blockCacheHit;
                return this;
            }

            /**
             * BlockIndexCacheHit.
             */
            public Builder blockIndexCacheHit(Double blockIndexCacheHit) {
                this.blockIndexCacheHit = blockIndexCacheHit;
                return this;
            }

            /**
             * BloomFilterCacheHit.
             */
            public Builder bloomFilterCacheHit(Double bloomFilterCacheHit) {
                this.bloomFilterCacheHit = bloomFilterCacheHit;
                return this;
            }

            /**
             * ClientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * ConcurrencyWaitTime.
             */
            public Builder concurrencyWaitTime(Double concurrencyWaitTime) {
                this.concurrencyWaitTime = concurrencyWaitTime;
                return this;
            }

            /**
             * CpuTime.
             */
            public Builder cpuTime(Double cpuTime) {
                this.cpuTime = cpuTime;
                return this;
            }

            /**
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * DecodeTime.
             */
            public Builder decodeTime(Double decodeTime) {
                this.decodeTime = decodeTime;
                return this;
            }

            /**
             * DiskRead.
             */
            public Builder diskRead(Double diskRead) {
                this.diskRead = diskRead;
                return this;
            }

            /**
             * ElapsedTime.
             */
            public Builder elapsedTime(Double elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * EndTimeUTCString.
             */
            public Builder endTimeUTCString(String endTimeUTCString) {
                this.endTimeUTCString = endTimeUTCString;
                return this;
            }

            /**
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * ExecPerSecond.
             */
            public Builder execPerSecond(Double execPerSecond) {
                this.execPerSecond = execPerSecond;
                return this;
            }

            /**
             * ExecuteTime.
             */
            public Builder executeTime(Double executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * Executions.
             */
            public Builder executions(Double executions) {
                this.executions = executions;
                return this;
            }

            /**
             * FailTimes.
             */
            public Builder failTimes(Double failTimes) {
                this.failTimes = failTimes;
                return this;
            }

            /**
             * GetPlanTime.
             */
            public Builder getPlanTime(Double getPlanTime) {
                this.getPlanTime = getPlanTime;
                return this;
            }

            /**
             * IOWaitTime.
             */
            public Builder IOWaitTime(Double IOWaitTime) {
                this.IOWaitTime = IOWaitTime;
                return this;
            }

            /**
             * LogicalRead.
             */
            public Builder logicalRead(Double logicalRead) {
                this.logicalRead = logicalRead;
                return this;
            }

            /**
             * MaxCpuTime.
             */
            public Builder maxCpuTime(Double maxCpuTime) {
                this.maxCpuTime = maxCpuTime;
                return this;
            }

            /**
             * MaxElapsedTime.
             */
            public Builder maxElapsedTime(Double maxElapsedTime) {
                this.maxElapsedTime = maxElapsedTime;
                return this;
            }

            /**
             * MemstoreReadRowCount.
             */
            public Builder memstoreReadRowCount(Double memstoreReadRowCount) {
                this.memstoreReadRowCount = memstoreReadRowCount;
                return this;
            }

            /**
             * MissPlans.
             */
            public Builder missPlans(Double missPlans) {
                this.missPlans = missPlans;
                return this;
            }

            /**
             * NetWaitTime.
             */
            public Builder netWaitTime(Double netWaitTime) {
                this.netWaitTime = netWaitTime;
                return this;
            }

            /**
             * NodeIp.
             */
            public Builder nodeIp(String nodeIp) {
                this.nodeIp = nodeIp;
                return this;
            }

            /**
             * QueueTime.
             */
            public Builder queueTime(Double queueTime) {
                this.queueTime = queueTime;
                return this;
            }

            /**
             * RPCCount.
             */
            public Builder RPCCount(Double RPCCount) {
                this.RPCCount = RPCCount;
                return this;
            }

            /**
             * RemotePlans.
             */
            public Builder remotePlans(Double remotePlans) {
                this.remotePlans = remotePlans;
                return this;
            }

            /**
             * RetryCount.
             */
            public Builder retryCount(Double retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * ReturnRows.
             */
            public Builder returnRows(Double returnRows) {
                this.returnRows = returnRows;
                return this;
            }

            /**
             * RowCacheHit.
             */
            public Builder rowCacheHit(Double rowCacheHit) {
                this.rowCacheHit = rowCacheHit;
                return this;
            }

            /**
             * ScheduleTime.
             */
            public Builder scheduleTime(Double scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            /**
             * SqlId.
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
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
             * SsstoreReadRowCount.
             */
            public Builder ssstoreReadRowCount(Double ssstoreReadRowCount) {
                this.ssstoreReadRowCount = ssstoreReadRowCount;
                return this;
            }

            /**
             * TenantName.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * TotalWaitTime.
             */
            public Builder totalWaitTime(Double totalWaitTime) {
                this.totalWaitTime = totalWaitTime;
                return this;
            }

            /**
             * UserName.
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
        @NameInMap("Count")
        private Long count;

        @NameInMap("List")
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
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * List.
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
