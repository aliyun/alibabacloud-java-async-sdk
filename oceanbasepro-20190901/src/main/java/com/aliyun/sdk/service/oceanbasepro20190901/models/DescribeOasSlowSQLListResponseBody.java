// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOasSlowSQLListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOasSlowSQLListResponseBody</p>
 */
public class DescribeOasSlowSQLListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOasSlowSQLListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOasSlowSQLListResponseBody create() {
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
         * The list of slow queries.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOasSlowSQLListResponseBody build() {
            return new DescribeOasSlowSQLListResponseBody(this);
        } 

    } 

    public static class SqlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgAffectedRows")
        private Double avgAffectedRows;

        @com.aliyun.core.annotation.NameInMap("AvgApplicationWaitTime")
        private Double avgApplicationWaitTime;

        @com.aliyun.core.annotation.NameInMap("AvgBlockCacheHit")
        private Double avgBlockCacheHit;

        @com.aliyun.core.annotation.NameInMap("AvgBlockIndexCacheHit")
        private Double avgBlockIndexCacheHit;

        @com.aliyun.core.annotation.NameInMap("AvgBloomFilterCacheHit")
        private Double avgBloomFilterCacheHit;

        @com.aliyun.core.annotation.NameInMap("AvgConcurrencyWaitTime")
        private Double avgConcurrencyWaitTime;

        @com.aliyun.core.annotation.NameInMap("AvgCpuTime")
        private Double avgCpuTime;

        @com.aliyun.core.annotation.NameInMap("AvgDbTime")
        private Double avgDbTime;

        @com.aliyun.core.annotation.NameInMap("AvgDecodeTime")
        private Double avgDecodeTime;

        @com.aliyun.core.annotation.NameInMap("AvgDiskReads")
        private Double avgDiskReads;

        @com.aliyun.core.annotation.NameInMap("AvgElapsedTime")
        private Double avgElapsedTime;

        @com.aliyun.core.annotation.NameInMap("AvgExecuteTime")
        private Double avgExecuteTime;

        @com.aliyun.core.annotation.NameInMap("AvgExecutorRpcCount")
        private Double avgExecutorRpcCount;

        @com.aliyun.core.annotation.NameInMap("AvgExpectedWorkerCount")
        private Double avgExpectedWorkerCount;

        @com.aliyun.core.annotation.NameInMap("AvgGetPlanTime")
        private Double avgGetPlanTime;

        @com.aliyun.core.annotation.NameInMap("AvgLogicalReads")
        private Double avgLogicalReads;

        @com.aliyun.core.annotation.NameInMap("AvgMemstoreReadRows")
        private Double avgMemstoreReadRows;

        @com.aliyun.core.annotation.NameInMap("AvgNetTime")
        private Double avgNetTime;

        @com.aliyun.core.annotation.NameInMap("AvgNetWaitTime")
        private Double avgNetWaitTime;

        @com.aliyun.core.annotation.NameInMap("AvgPartitionCount")
        private Double avgPartitionCount;

        @com.aliyun.core.annotation.NameInMap("AvgQueueTime")
        private Double avgQueueTime;

        @com.aliyun.core.annotation.NameInMap("AvgReturnRows")
        private Double avgReturnRows;

        @com.aliyun.core.annotation.NameInMap("AvgRowCacheHit")
        private Double avgRowCacheHit;

        @com.aliyun.core.annotation.NameInMap("AvgRpcCount")
        private Double avgRpcCount;

        @com.aliyun.core.annotation.NameInMap("AvgScheduleTime")
        private Double avgScheduleTime;

        @com.aliyun.core.annotation.NameInMap("AvgSsstoreReadRows")
        private Double avgSsstoreReadRows;

        @com.aliyun.core.annotation.NameInMap("AvgUsedWorkerCount")
        private Double avgUsedWorkerCount;

        @com.aliyun.core.annotation.NameInMap("AvgUserIoWaitTime")
        private Double avgUserIoWaitTime;

        @com.aliyun.core.annotation.NameInMap("AvgWaitCount")
        private Double avgWaitCount;

        @com.aliyun.core.annotation.NameInMap("AvgWaitTime")
        private Double avgWaitTime;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("DistPlanPercentage")
        private Double distPlanPercentage;

        @com.aliyun.core.annotation.NameInMap("ExecPs")
        private Double execPs;

        @com.aliyun.core.annotation.NameInMap("Executions")
        private Double executions;

        @com.aliyun.core.annotation.NameInMap("FailCount")
        private Double failCount;

        @com.aliyun.core.annotation.NameInMap("FailPercentage")
        private Double failPercentage;

        @com.aliyun.core.annotation.NameInMap("Inner")
        private Boolean inner;

        @com.aliyun.core.annotation.NameInMap("LocalPlanPercentage")
        private Double localPlanPercentage;

        @com.aliyun.core.annotation.NameInMap("MaxAffectedRows")
        private Double maxAffectedRows;

        @com.aliyun.core.annotation.NameInMap("MaxApplicationWaitTime")
        private Double maxApplicationWaitTime;

        @com.aliyun.core.annotation.NameInMap("MaxConcurrencyWaitTime")
        private Double maxConcurrencyWaitTime;

        @com.aliyun.core.annotation.NameInMap("MaxCpuTime")
        private Double maxCpuTime;

        @com.aliyun.core.annotation.NameInMap("MaxDiskReads")
        private Double maxDiskReads;

        @com.aliyun.core.annotation.NameInMap("MaxElapsedTime")
        private Double maxElapsedTime;

        @com.aliyun.core.annotation.NameInMap("MaxReturnRows")
        private Double maxReturnRows;

        @com.aliyun.core.annotation.NameInMap("MaxUserIoWaitTime")
        private Double maxUserIoWaitTime;

        @com.aliyun.core.annotation.NameInMap("MaxWaitTime")
        private Double maxWaitTime;

        @com.aliyun.core.annotation.NameInMap("MissPlanPercentage")
        private Double missPlanPercentage;

        @com.aliyun.core.annotation.NameInMap("MissPlans")
        private Double missPlans;

        @com.aliyun.core.annotation.NameInMap("RemotePlanPercentage")
        private Double remotePlanPercentage;

        @com.aliyun.core.annotation.NameInMap("RemotePlans")
        private Double remotePlans;

        @com.aliyun.core.annotation.NameInMap("RetCode4012Count")
        private Long retCode4012Count;

        @com.aliyun.core.annotation.NameInMap("RetCode4013Count")
        private Long retCode4013Count;

        @com.aliyun.core.annotation.NameInMap("RetCode5001Count")
        private Long retCode5001Count;

        @com.aliyun.core.annotation.NameInMap("RetCode5024Count")
        private Long retCode5024Count;

        @com.aliyun.core.annotation.NameInMap("RetCode5167Count")
        private Long retCode5167Count;

        @com.aliyun.core.annotation.NameInMap("RetCode5217Count")
        private Long retCode5217Count;

        @com.aliyun.core.annotation.NameInMap("RetCode6002Count")
        private Long retCode6002Count;

        @com.aliyun.core.annotation.NameInMap("RetryCount")
        private Double retryCount;

        @com.aliyun.core.annotation.NameInMap("RpcCount")
        private Double rpcCount;

        @com.aliyun.core.annotation.NameInMap("Server")
        private String server;

        @com.aliyun.core.annotation.NameInMap("ServerIp")
        private String serverIp;

        @com.aliyun.core.annotation.NameInMap("ServerPort")
        private Long serverPort;

        @com.aliyun.core.annotation.NameInMap("SqlId")
        private String sqlId;

        @com.aliyun.core.annotation.NameInMap("SqlTextShort")
        private String sqlTextShort;

        @com.aliyun.core.annotation.NameInMap("SqlType")
        private String sqlType;

        @com.aliyun.core.annotation.NameInMap("StrongConsistencyPercentage")
        private Double strongConsistencyPercentage;

        @com.aliyun.core.annotation.NameInMap("SumDbTime")
        private Double sumDbTime;

        @com.aliyun.core.annotation.NameInMap("SumElapsedTime")
        private Double sumElapsedTime;

        @com.aliyun.core.annotation.NameInMap("SumLogicalReads")
        private Double sumLogicalReads;

        @com.aliyun.core.annotation.NameInMap("SumWaitTime")
        private Double sumWaitTime;

        @com.aliyun.core.annotation.NameInMap("TableScanPercentage")
        private Double tableScanPercentage;

        @com.aliyun.core.annotation.NameInMap("TotalWaitTime")
        private Double totalWaitTime;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("WaitEvent")
        private String waitEvent;

        @com.aliyun.core.annotation.NameInMap("WeakConsistencyPercentage")
        private Double weakConsistencyPercentage;

        private SqlList(Builder builder) {
            this.avgAffectedRows = builder.avgAffectedRows;
            this.avgApplicationWaitTime = builder.avgApplicationWaitTime;
            this.avgBlockCacheHit = builder.avgBlockCacheHit;
            this.avgBlockIndexCacheHit = builder.avgBlockIndexCacheHit;
            this.avgBloomFilterCacheHit = builder.avgBloomFilterCacheHit;
            this.avgConcurrencyWaitTime = builder.avgConcurrencyWaitTime;
            this.avgCpuTime = builder.avgCpuTime;
            this.avgDbTime = builder.avgDbTime;
            this.avgDecodeTime = builder.avgDecodeTime;
            this.avgDiskReads = builder.avgDiskReads;
            this.avgElapsedTime = builder.avgElapsedTime;
            this.avgExecuteTime = builder.avgExecuteTime;
            this.avgExecutorRpcCount = builder.avgExecutorRpcCount;
            this.avgExpectedWorkerCount = builder.avgExpectedWorkerCount;
            this.avgGetPlanTime = builder.avgGetPlanTime;
            this.avgLogicalReads = builder.avgLogicalReads;
            this.avgMemstoreReadRows = builder.avgMemstoreReadRows;
            this.avgNetTime = builder.avgNetTime;
            this.avgNetWaitTime = builder.avgNetWaitTime;
            this.avgPartitionCount = builder.avgPartitionCount;
            this.avgQueueTime = builder.avgQueueTime;
            this.avgReturnRows = builder.avgReturnRows;
            this.avgRowCacheHit = builder.avgRowCacheHit;
            this.avgRpcCount = builder.avgRpcCount;
            this.avgScheduleTime = builder.avgScheduleTime;
            this.avgSsstoreReadRows = builder.avgSsstoreReadRows;
            this.avgUsedWorkerCount = builder.avgUsedWorkerCount;
            this.avgUserIoWaitTime = builder.avgUserIoWaitTime;
            this.avgWaitCount = builder.avgWaitCount;
            this.avgWaitTime = builder.avgWaitTime;
            this.clientIp = builder.clientIp;
            this.dbName = builder.dbName;
            this.distPlanPercentage = builder.distPlanPercentage;
            this.execPs = builder.execPs;
            this.executions = builder.executions;
            this.failCount = builder.failCount;
            this.failPercentage = builder.failPercentage;
            this.inner = builder.inner;
            this.localPlanPercentage = builder.localPlanPercentage;
            this.maxAffectedRows = builder.maxAffectedRows;
            this.maxApplicationWaitTime = builder.maxApplicationWaitTime;
            this.maxConcurrencyWaitTime = builder.maxConcurrencyWaitTime;
            this.maxCpuTime = builder.maxCpuTime;
            this.maxDiskReads = builder.maxDiskReads;
            this.maxElapsedTime = builder.maxElapsedTime;
            this.maxReturnRows = builder.maxReturnRows;
            this.maxUserIoWaitTime = builder.maxUserIoWaitTime;
            this.maxWaitTime = builder.maxWaitTime;
            this.missPlanPercentage = builder.missPlanPercentage;
            this.missPlans = builder.missPlans;
            this.remotePlanPercentage = builder.remotePlanPercentage;
            this.remotePlans = builder.remotePlans;
            this.retCode4012Count = builder.retCode4012Count;
            this.retCode4013Count = builder.retCode4013Count;
            this.retCode5001Count = builder.retCode5001Count;
            this.retCode5024Count = builder.retCode5024Count;
            this.retCode5167Count = builder.retCode5167Count;
            this.retCode5217Count = builder.retCode5217Count;
            this.retCode6002Count = builder.retCode6002Count;
            this.retryCount = builder.retryCount;
            this.rpcCount = builder.rpcCount;
            this.server = builder.server;
            this.serverIp = builder.serverIp;
            this.serverPort = builder.serverPort;
            this.sqlId = builder.sqlId;
            this.sqlTextShort = builder.sqlTextShort;
            this.sqlType = builder.sqlType;
            this.strongConsistencyPercentage = builder.strongConsistencyPercentage;
            this.sumDbTime = builder.sumDbTime;
            this.sumElapsedTime = builder.sumElapsedTime;
            this.sumLogicalReads = builder.sumLogicalReads;
            this.sumWaitTime = builder.sumWaitTime;
            this.tableScanPercentage = builder.tableScanPercentage;
            this.totalWaitTime = builder.totalWaitTime;
            this.userName = builder.userName;
            this.waitEvent = builder.waitEvent;
            this.weakConsistencyPercentage = builder.weakConsistencyPercentage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SqlList create() {
            return builder().build();
        }

        /**
         * @return avgAffectedRows
         */
        public Double getAvgAffectedRows() {
            return this.avgAffectedRows;
        }

        /**
         * @return avgApplicationWaitTime
         */
        public Double getAvgApplicationWaitTime() {
            return this.avgApplicationWaitTime;
        }

        /**
         * @return avgBlockCacheHit
         */
        public Double getAvgBlockCacheHit() {
            return this.avgBlockCacheHit;
        }

        /**
         * @return avgBlockIndexCacheHit
         */
        public Double getAvgBlockIndexCacheHit() {
            return this.avgBlockIndexCacheHit;
        }

        /**
         * @return avgBloomFilterCacheHit
         */
        public Double getAvgBloomFilterCacheHit() {
            return this.avgBloomFilterCacheHit;
        }

        /**
         * @return avgConcurrencyWaitTime
         */
        public Double getAvgConcurrencyWaitTime() {
            return this.avgConcurrencyWaitTime;
        }

        /**
         * @return avgCpuTime
         */
        public Double getAvgCpuTime() {
            return this.avgCpuTime;
        }

        /**
         * @return avgDbTime
         */
        public Double getAvgDbTime() {
            return this.avgDbTime;
        }

        /**
         * @return avgDecodeTime
         */
        public Double getAvgDecodeTime() {
            return this.avgDecodeTime;
        }

        /**
         * @return avgDiskReads
         */
        public Double getAvgDiskReads() {
            return this.avgDiskReads;
        }

        /**
         * @return avgElapsedTime
         */
        public Double getAvgElapsedTime() {
            return this.avgElapsedTime;
        }

        /**
         * @return avgExecuteTime
         */
        public Double getAvgExecuteTime() {
            return this.avgExecuteTime;
        }

        /**
         * @return avgExecutorRpcCount
         */
        public Double getAvgExecutorRpcCount() {
            return this.avgExecutorRpcCount;
        }

        /**
         * @return avgExpectedWorkerCount
         */
        public Double getAvgExpectedWorkerCount() {
            return this.avgExpectedWorkerCount;
        }

        /**
         * @return avgGetPlanTime
         */
        public Double getAvgGetPlanTime() {
            return this.avgGetPlanTime;
        }

        /**
         * @return avgLogicalReads
         */
        public Double getAvgLogicalReads() {
            return this.avgLogicalReads;
        }

        /**
         * @return avgMemstoreReadRows
         */
        public Double getAvgMemstoreReadRows() {
            return this.avgMemstoreReadRows;
        }

        /**
         * @return avgNetTime
         */
        public Double getAvgNetTime() {
            return this.avgNetTime;
        }

        /**
         * @return avgNetWaitTime
         */
        public Double getAvgNetWaitTime() {
            return this.avgNetWaitTime;
        }

        /**
         * @return avgPartitionCount
         */
        public Double getAvgPartitionCount() {
            return this.avgPartitionCount;
        }

        /**
         * @return avgQueueTime
         */
        public Double getAvgQueueTime() {
            return this.avgQueueTime;
        }

        /**
         * @return avgReturnRows
         */
        public Double getAvgReturnRows() {
            return this.avgReturnRows;
        }

        /**
         * @return avgRowCacheHit
         */
        public Double getAvgRowCacheHit() {
            return this.avgRowCacheHit;
        }

        /**
         * @return avgRpcCount
         */
        public Double getAvgRpcCount() {
            return this.avgRpcCount;
        }

        /**
         * @return avgScheduleTime
         */
        public Double getAvgScheduleTime() {
            return this.avgScheduleTime;
        }

        /**
         * @return avgSsstoreReadRows
         */
        public Double getAvgSsstoreReadRows() {
            return this.avgSsstoreReadRows;
        }

        /**
         * @return avgUsedWorkerCount
         */
        public Double getAvgUsedWorkerCount() {
            return this.avgUsedWorkerCount;
        }

        /**
         * @return avgUserIoWaitTime
         */
        public Double getAvgUserIoWaitTime() {
            return this.avgUserIoWaitTime;
        }

        /**
         * @return avgWaitCount
         */
        public Double getAvgWaitCount() {
            return this.avgWaitCount;
        }

        /**
         * @return avgWaitTime
         */
        public Double getAvgWaitTime() {
            return this.avgWaitTime;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return distPlanPercentage
         */
        public Double getDistPlanPercentage() {
            return this.distPlanPercentage;
        }

        /**
         * @return execPs
         */
        public Double getExecPs() {
            return this.execPs;
        }

        /**
         * @return executions
         */
        public Double getExecutions() {
            return this.executions;
        }

        /**
         * @return failCount
         */
        public Double getFailCount() {
            return this.failCount;
        }

        /**
         * @return failPercentage
         */
        public Double getFailPercentage() {
            return this.failPercentage;
        }

        /**
         * @return inner
         */
        public Boolean getInner() {
            return this.inner;
        }

        /**
         * @return localPlanPercentage
         */
        public Double getLocalPlanPercentage() {
            return this.localPlanPercentage;
        }

        /**
         * @return maxAffectedRows
         */
        public Double getMaxAffectedRows() {
            return this.maxAffectedRows;
        }

        /**
         * @return maxApplicationWaitTime
         */
        public Double getMaxApplicationWaitTime() {
            return this.maxApplicationWaitTime;
        }

        /**
         * @return maxConcurrencyWaitTime
         */
        public Double getMaxConcurrencyWaitTime() {
            return this.maxConcurrencyWaitTime;
        }

        /**
         * @return maxCpuTime
         */
        public Double getMaxCpuTime() {
            return this.maxCpuTime;
        }

        /**
         * @return maxDiskReads
         */
        public Double getMaxDiskReads() {
            return this.maxDiskReads;
        }

        /**
         * @return maxElapsedTime
         */
        public Double getMaxElapsedTime() {
            return this.maxElapsedTime;
        }

        /**
         * @return maxReturnRows
         */
        public Double getMaxReturnRows() {
            return this.maxReturnRows;
        }

        /**
         * @return maxUserIoWaitTime
         */
        public Double getMaxUserIoWaitTime() {
            return this.maxUserIoWaitTime;
        }

        /**
         * @return maxWaitTime
         */
        public Double getMaxWaitTime() {
            return this.maxWaitTime;
        }

        /**
         * @return missPlanPercentage
         */
        public Double getMissPlanPercentage() {
            return this.missPlanPercentage;
        }

        /**
         * @return missPlans
         */
        public Double getMissPlans() {
            return this.missPlans;
        }

        /**
         * @return remotePlanPercentage
         */
        public Double getRemotePlanPercentage() {
            return this.remotePlanPercentage;
        }

        /**
         * @return remotePlans
         */
        public Double getRemotePlans() {
            return this.remotePlans;
        }

        /**
         * @return retCode4012Count
         */
        public Long getRetCode4012Count() {
            return this.retCode4012Count;
        }

        /**
         * @return retCode4013Count
         */
        public Long getRetCode4013Count() {
            return this.retCode4013Count;
        }

        /**
         * @return retCode5001Count
         */
        public Long getRetCode5001Count() {
            return this.retCode5001Count;
        }

        /**
         * @return retCode5024Count
         */
        public Long getRetCode5024Count() {
            return this.retCode5024Count;
        }

        /**
         * @return retCode5167Count
         */
        public Long getRetCode5167Count() {
            return this.retCode5167Count;
        }

        /**
         * @return retCode5217Count
         */
        public Long getRetCode5217Count() {
            return this.retCode5217Count;
        }

        /**
         * @return retCode6002Count
         */
        public Long getRetCode6002Count() {
            return this.retCode6002Count;
        }

        /**
         * @return retryCount
         */
        public Double getRetryCount() {
            return this.retryCount;
        }

        /**
         * @return rpcCount
         */
        public Double getRpcCount() {
            return this.rpcCount;
        }

        /**
         * @return server
         */
        public String getServer() {
            return this.server;
        }

        /**
         * @return serverIp
         */
        public String getServerIp() {
            return this.serverIp;
        }

        /**
         * @return serverPort
         */
        public Long getServerPort() {
            return this.serverPort;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return sqlTextShort
         */
        public String getSqlTextShort() {
            return this.sqlTextShort;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        /**
         * @return strongConsistencyPercentage
         */
        public Double getStrongConsistencyPercentage() {
            return this.strongConsistencyPercentage;
        }

        /**
         * @return sumDbTime
         */
        public Double getSumDbTime() {
            return this.sumDbTime;
        }

        /**
         * @return sumElapsedTime
         */
        public Double getSumElapsedTime() {
            return this.sumElapsedTime;
        }

        /**
         * @return sumLogicalReads
         */
        public Double getSumLogicalReads() {
            return this.sumLogicalReads;
        }

        /**
         * @return sumWaitTime
         */
        public Double getSumWaitTime() {
            return this.sumWaitTime;
        }

        /**
         * @return tableScanPercentage
         */
        public Double getTableScanPercentage() {
            return this.tableScanPercentage;
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

        /**
         * @return waitEvent
         */
        public String getWaitEvent() {
            return this.waitEvent;
        }

        /**
         * @return weakConsistencyPercentage
         */
        public Double getWeakConsistencyPercentage() {
            return this.weakConsistencyPercentage;
        }

        public static final class Builder {
            private Double avgAffectedRows; 
            private Double avgApplicationWaitTime; 
            private Double avgBlockCacheHit; 
            private Double avgBlockIndexCacheHit; 
            private Double avgBloomFilterCacheHit; 
            private Double avgConcurrencyWaitTime; 
            private Double avgCpuTime; 
            private Double avgDbTime; 
            private Double avgDecodeTime; 
            private Double avgDiskReads; 
            private Double avgElapsedTime; 
            private Double avgExecuteTime; 
            private Double avgExecutorRpcCount; 
            private Double avgExpectedWorkerCount; 
            private Double avgGetPlanTime; 
            private Double avgLogicalReads; 
            private Double avgMemstoreReadRows; 
            private Double avgNetTime; 
            private Double avgNetWaitTime; 
            private Double avgPartitionCount; 
            private Double avgQueueTime; 
            private Double avgReturnRows; 
            private Double avgRowCacheHit; 
            private Double avgRpcCount; 
            private Double avgScheduleTime; 
            private Double avgSsstoreReadRows; 
            private Double avgUsedWorkerCount; 
            private Double avgUserIoWaitTime; 
            private Double avgWaitCount; 
            private Double avgWaitTime; 
            private String clientIp; 
            private String dbName; 
            private Double distPlanPercentage; 
            private Double execPs; 
            private Double executions; 
            private Double failCount; 
            private Double failPercentage; 
            private Boolean inner; 
            private Double localPlanPercentage; 
            private Double maxAffectedRows; 
            private Double maxApplicationWaitTime; 
            private Double maxConcurrencyWaitTime; 
            private Double maxCpuTime; 
            private Double maxDiskReads; 
            private Double maxElapsedTime; 
            private Double maxReturnRows; 
            private Double maxUserIoWaitTime; 
            private Double maxWaitTime; 
            private Double missPlanPercentage; 
            private Double missPlans; 
            private Double remotePlanPercentage; 
            private Double remotePlans; 
            private Long retCode4012Count; 
            private Long retCode4013Count; 
            private Long retCode5001Count; 
            private Long retCode5024Count; 
            private Long retCode5167Count; 
            private Long retCode5217Count; 
            private Long retCode6002Count; 
            private Double retryCount; 
            private Double rpcCount; 
            private String server; 
            private String serverIp; 
            private Long serverPort; 
            private String sqlId; 
            private String sqlTextShort; 
            private String sqlType; 
            private Double strongConsistencyPercentage; 
            private Double sumDbTime; 
            private Double sumElapsedTime; 
            private Double sumLogicalReads; 
            private Double sumWaitTime; 
            private Double tableScanPercentage; 
            private Double totalWaitTime; 
            private String userName; 
            private String waitEvent; 
            private Double weakConsistencyPercentage; 

            /**
             * AvgAffectedRows.
             */
            public Builder avgAffectedRows(Double avgAffectedRows) {
                this.avgAffectedRows = avgAffectedRows;
                return this;
            }

            /**
             * AvgApplicationWaitTime.
             */
            public Builder avgApplicationWaitTime(Double avgApplicationWaitTime) {
                this.avgApplicationWaitTime = avgApplicationWaitTime;
                return this;
            }

            /**
             * AvgBlockCacheHit.
             */
            public Builder avgBlockCacheHit(Double avgBlockCacheHit) {
                this.avgBlockCacheHit = avgBlockCacheHit;
                return this;
            }

            /**
             * AvgBlockIndexCacheHit.
             */
            public Builder avgBlockIndexCacheHit(Double avgBlockIndexCacheHit) {
                this.avgBlockIndexCacheHit = avgBlockIndexCacheHit;
                return this;
            }

            /**
             * AvgBloomFilterCacheHit.
             */
            public Builder avgBloomFilterCacheHit(Double avgBloomFilterCacheHit) {
                this.avgBloomFilterCacheHit = avgBloomFilterCacheHit;
                return this;
            }

            /**
             * AvgConcurrencyWaitTime.
             */
            public Builder avgConcurrencyWaitTime(Double avgConcurrencyWaitTime) {
                this.avgConcurrencyWaitTime = avgConcurrencyWaitTime;
                return this;
            }

            /**
             * AvgCpuTime.
             */
            public Builder avgCpuTime(Double avgCpuTime) {
                this.avgCpuTime = avgCpuTime;
                return this;
            }

            /**
             * AvgDbTime.
             */
            public Builder avgDbTime(Double avgDbTime) {
                this.avgDbTime = avgDbTime;
                return this;
            }

            /**
             * AvgDecodeTime.
             */
            public Builder avgDecodeTime(Double avgDecodeTime) {
                this.avgDecodeTime = avgDecodeTime;
                return this;
            }

            /**
             * AvgDiskReads.
             */
            public Builder avgDiskReads(Double avgDiskReads) {
                this.avgDiskReads = avgDiskReads;
                return this;
            }

            /**
             * AvgElapsedTime.
             */
            public Builder avgElapsedTime(Double avgElapsedTime) {
                this.avgElapsedTime = avgElapsedTime;
                return this;
            }

            /**
             * AvgExecuteTime.
             */
            public Builder avgExecuteTime(Double avgExecuteTime) {
                this.avgExecuteTime = avgExecuteTime;
                return this;
            }

            /**
             * AvgExecutorRpcCount.
             */
            public Builder avgExecutorRpcCount(Double avgExecutorRpcCount) {
                this.avgExecutorRpcCount = avgExecutorRpcCount;
                return this;
            }

            /**
             * AvgExpectedWorkerCount.
             */
            public Builder avgExpectedWorkerCount(Double avgExpectedWorkerCount) {
                this.avgExpectedWorkerCount = avgExpectedWorkerCount;
                return this;
            }

            /**
             * AvgGetPlanTime.
             */
            public Builder avgGetPlanTime(Double avgGetPlanTime) {
                this.avgGetPlanTime = avgGetPlanTime;
                return this;
            }

            /**
             * AvgLogicalReads.
             */
            public Builder avgLogicalReads(Double avgLogicalReads) {
                this.avgLogicalReads = avgLogicalReads;
                return this;
            }

            /**
             * AvgMemstoreReadRows.
             */
            public Builder avgMemstoreReadRows(Double avgMemstoreReadRows) {
                this.avgMemstoreReadRows = avgMemstoreReadRows;
                return this;
            }

            /**
             * AvgNetTime.
             */
            public Builder avgNetTime(Double avgNetTime) {
                this.avgNetTime = avgNetTime;
                return this;
            }

            /**
             * AvgNetWaitTime.
             */
            public Builder avgNetWaitTime(Double avgNetWaitTime) {
                this.avgNetWaitTime = avgNetWaitTime;
                return this;
            }

            /**
             * AvgPartitionCount.
             */
            public Builder avgPartitionCount(Double avgPartitionCount) {
                this.avgPartitionCount = avgPartitionCount;
                return this;
            }

            /**
             * AvgQueueTime.
             */
            public Builder avgQueueTime(Double avgQueueTime) {
                this.avgQueueTime = avgQueueTime;
                return this;
            }

            /**
             * AvgReturnRows.
             */
            public Builder avgReturnRows(Double avgReturnRows) {
                this.avgReturnRows = avgReturnRows;
                return this;
            }

            /**
             * AvgRowCacheHit.
             */
            public Builder avgRowCacheHit(Double avgRowCacheHit) {
                this.avgRowCacheHit = avgRowCacheHit;
                return this;
            }

            /**
             * AvgRpcCount.
             */
            public Builder avgRpcCount(Double avgRpcCount) {
                this.avgRpcCount = avgRpcCount;
                return this;
            }

            /**
             * AvgScheduleTime.
             */
            public Builder avgScheduleTime(Double avgScheduleTime) {
                this.avgScheduleTime = avgScheduleTime;
                return this;
            }

            /**
             * AvgSsstoreReadRows.
             */
            public Builder avgSsstoreReadRows(Double avgSsstoreReadRows) {
                this.avgSsstoreReadRows = avgSsstoreReadRows;
                return this;
            }

            /**
             * AvgUsedWorkerCount.
             */
            public Builder avgUsedWorkerCount(Double avgUsedWorkerCount) {
                this.avgUsedWorkerCount = avgUsedWorkerCount;
                return this;
            }

            /**
             * AvgUserIoWaitTime.
             */
            public Builder avgUserIoWaitTime(Double avgUserIoWaitTime) {
                this.avgUserIoWaitTime = avgUserIoWaitTime;
                return this;
            }

            /**
             * AvgWaitCount.
             */
            public Builder avgWaitCount(Double avgWaitCount) {
                this.avgWaitCount = avgWaitCount;
                return this;
            }

            /**
             * AvgWaitTime.
             */
            public Builder avgWaitTime(Double avgWaitTime) {
                this.avgWaitTime = avgWaitTime;
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
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * DistPlanPercentage.
             */
            public Builder distPlanPercentage(Double distPlanPercentage) {
                this.distPlanPercentage = distPlanPercentage;
                return this;
            }

            /**
             * ExecPs.
             */
            public Builder execPs(Double execPs) {
                this.execPs = execPs;
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
             * FailCount.
             */
            public Builder failCount(Double failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * FailPercentage.
             */
            public Builder failPercentage(Double failPercentage) {
                this.failPercentage = failPercentage;
                return this;
            }

            /**
             * Inner.
             */
            public Builder inner(Boolean inner) {
                this.inner = inner;
                return this;
            }

            /**
             * LocalPlanPercentage.
             */
            public Builder localPlanPercentage(Double localPlanPercentage) {
                this.localPlanPercentage = localPlanPercentage;
                return this;
            }

            /**
             * MaxAffectedRows.
             */
            public Builder maxAffectedRows(Double maxAffectedRows) {
                this.maxAffectedRows = maxAffectedRows;
                return this;
            }

            /**
             * MaxApplicationWaitTime.
             */
            public Builder maxApplicationWaitTime(Double maxApplicationWaitTime) {
                this.maxApplicationWaitTime = maxApplicationWaitTime;
                return this;
            }

            /**
             * MaxConcurrencyWaitTime.
             */
            public Builder maxConcurrencyWaitTime(Double maxConcurrencyWaitTime) {
                this.maxConcurrencyWaitTime = maxConcurrencyWaitTime;
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
             * MaxDiskReads.
             */
            public Builder maxDiskReads(Double maxDiskReads) {
                this.maxDiskReads = maxDiskReads;
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
             * MaxReturnRows.
             */
            public Builder maxReturnRows(Double maxReturnRows) {
                this.maxReturnRows = maxReturnRows;
                return this;
            }

            /**
             * MaxUserIoWaitTime.
             */
            public Builder maxUserIoWaitTime(Double maxUserIoWaitTime) {
                this.maxUserIoWaitTime = maxUserIoWaitTime;
                return this;
            }

            /**
             * MaxWaitTime.
             */
            public Builder maxWaitTime(Double maxWaitTime) {
                this.maxWaitTime = maxWaitTime;
                return this;
            }

            /**
             * MissPlanPercentage.
             */
            public Builder missPlanPercentage(Double missPlanPercentage) {
                this.missPlanPercentage = missPlanPercentage;
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
             * RemotePlanPercentage.
             */
            public Builder remotePlanPercentage(Double remotePlanPercentage) {
                this.remotePlanPercentage = remotePlanPercentage;
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
             * RetCode4012Count.
             */
            public Builder retCode4012Count(Long retCode4012Count) {
                this.retCode4012Count = retCode4012Count;
                return this;
            }

            /**
             * RetCode4013Count.
             */
            public Builder retCode4013Count(Long retCode4013Count) {
                this.retCode4013Count = retCode4013Count;
                return this;
            }

            /**
             * RetCode5001Count.
             */
            public Builder retCode5001Count(Long retCode5001Count) {
                this.retCode5001Count = retCode5001Count;
                return this;
            }

            /**
             * RetCode5024Count.
             */
            public Builder retCode5024Count(Long retCode5024Count) {
                this.retCode5024Count = retCode5024Count;
                return this;
            }

            /**
             * RetCode5167Count.
             */
            public Builder retCode5167Count(Long retCode5167Count) {
                this.retCode5167Count = retCode5167Count;
                return this;
            }

            /**
             * RetCode5217Count.
             */
            public Builder retCode5217Count(Long retCode5217Count) {
                this.retCode5217Count = retCode5217Count;
                return this;
            }

            /**
             * RetCode6002Count.
             */
            public Builder retCode6002Count(Long retCode6002Count) {
                this.retCode6002Count = retCode6002Count;
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
             * RpcCount.
             */
            public Builder rpcCount(Double rpcCount) {
                this.rpcCount = rpcCount;
                return this;
            }

            /**
             * Server.
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * ServerIp.
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * ServerPort.
             */
            public Builder serverPort(Long serverPort) {
                this.serverPort = serverPort;
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
             * SqlTextShort.
             */
            public Builder sqlTextShort(String sqlTextShort) {
                this.sqlTextShort = sqlTextShort;
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
             * StrongConsistencyPercentage.
             */
            public Builder strongConsistencyPercentage(Double strongConsistencyPercentage) {
                this.strongConsistencyPercentage = strongConsistencyPercentage;
                return this;
            }

            /**
             * SumDbTime.
             */
            public Builder sumDbTime(Double sumDbTime) {
                this.sumDbTime = sumDbTime;
                return this;
            }

            /**
             * SumElapsedTime.
             */
            public Builder sumElapsedTime(Double sumElapsedTime) {
                this.sumElapsedTime = sumElapsedTime;
                return this;
            }

            /**
             * SumLogicalReads.
             */
            public Builder sumLogicalReads(Double sumLogicalReads) {
                this.sumLogicalReads = sumLogicalReads;
                return this;
            }

            /**
             * SumWaitTime.
             */
            public Builder sumWaitTime(Double sumWaitTime) {
                this.sumWaitTime = sumWaitTime;
                return this;
            }

            /**
             * TableScanPercentage.
             */
            public Builder tableScanPercentage(Double tableScanPercentage) {
                this.tableScanPercentage = tableScanPercentage;
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

            /**
             * WaitEvent.
             */
            public Builder waitEvent(String waitEvent) {
                this.waitEvent = waitEvent;
                return this;
            }

            /**
             * WeakConsistencyPercentage.
             */
            public Builder weakConsistencyPercentage(Double weakConsistencyPercentage) {
                this.weakConsistencyPercentage = weakConsistencyPercentage;
                return this;
            }

            public SqlList build() {
                return new SqlList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgAffectedRows")
        private Double avgAffectedRows;

        @com.aliyun.core.annotation.NameInMap("AvgApplicationWaitTime")
        private Double avgApplicationWaitTime;

        @com.aliyun.core.annotation.NameInMap("AvgBlockCacheHit")
        private Double avgBlockCacheHit;

        @com.aliyun.core.annotation.NameInMap("AvgBlockIndexCacheHit")
        private Double avgBlockIndexCacheHit;

        @com.aliyun.core.annotation.NameInMap("AvgBloomFilterCacheHit")
        private Double avgBloomFilterCacheHit;

        @com.aliyun.core.annotation.NameInMap("AvgConcurrencyWaitTime")
        private Double avgConcurrencyWaitTime;

        @com.aliyun.core.annotation.NameInMap("AvgCpuTime")
        private Double avgCpuTime;

        @com.aliyun.core.annotation.NameInMap("AvgDbTime")
        private Double avgDbTime;

        @com.aliyun.core.annotation.NameInMap("AvgDecodeTime")
        private Double avgDecodeTime;

        @com.aliyun.core.annotation.NameInMap("AvgDiskReads")
        private Double avgDiskReads;

        @com.aliyun.core.annotation.NameInMap("AvgElapsedTime")
        private Double avgElapsedTime;

        @com.aliyun.core.annotation.NameInMap("AvgExecuteTime")
        private Double avgExecuteTime;

        @com.aliyun.core.annotation.NameInMap("AvgExecutorRpcCount")
        private Double avgExecutorRpcCount;

        @com.aliyun.core.annotation.NameInMap("AvgExpectedWorkerCount")
        private Double avgExpectedWorkerCount;

        @com.aliyun.core.annotation.NameInMap("AvgGetPlanTime")
        private Double avgGetPlanTime;

        @com.aliyun.core.annotation.NameInMap("AvgLogicalReads")
        private Double avgLogicalReads;

        @com.aliyun.core.annotation.NameInMap("AvgMemstoreReadRows")
        private Double avgMemstoreReadRows;

        @com.aliyun.core.annotation.NameInMap("AvgNetTime")
        private Double avgNetTime;

        @com.aliyun.core.annotation.NameInMap("AvgNetWaitTime")
        private Double avgNetWaitTime;

        @com.aliyun.core.annotation.NameInMap("AvgPartitionCount")
        private Double avgPartitionCount;

        @com.aliyun.core.annotation.NameInMap("AvgQueueTime")
        private Double avgQueueTime;

        @com.aliyun.core.annotation.NameInMap("AvgReturnRows")
        private Double avgReturnRows;

        @com.aliyun.core.annotation.NameInMap("AvgRowCacheHit")
        private Double avgRowCacheHit;

        @com.aliyun.core.annotation.NameInMap("AvgRpcCount")
        private Double avgRpcCount;

        @com.aliyun.core.annotation.NameInMap("AvgScheduleTime")
        private Double avgScheduleTime;

        @com.aliyun.core.annotation.NameInMap("AvgSsstoreReadRows")
        private Double avgSsstoreReadRows;

        @com.aliyun.core.annotation.NameInMap("AvgUsedWorkerCount")
        private Double avgUsedWorkerCount;

        @com.aliyun.core.annotation.NameInMap("AvgUserIoWaitTime")
        private Double avgUserIoWaitTime;

        @com.aliyun.core.annotation.NameInMap("AvgWaitCount")
        private Double avgWaitCount;

        @com.aliyun.core.annotation.NameInMap("AvgWaitTime")
        private Double avgWaitTime;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("DistPlanPercentage")
        private Double distPlanPercentage;

        @com.aliyun.core.annotation.NameInMap("DynamicSql")
        private Boolean dynamicSql;

        @com.aliyun.core.annotation.NameInMap("ExecPs")
        private Double execPs;

        @com.aliyun.core.annotation.NameInMap("Executions")
        private Double executions;

        @com.aliyun.core.annotation.NameInMap("FailCount")
        private Double failCount;

        @com.aliyun.core.annotation.NameInMap("FailPercentage")
        private Double failPercentage;

        @com.aliyun.core.annotation.NameInMap("Inner")
        private Boolean inner;

        @com.aliyun.core.annotation.NameInMap("LocalPlanPercentage")
        private Double localPlanPercentage;

        @com.aliyun.core.annotation.NameInMap("MaxAffectedRows")
        private Double maxAffectedRows;

        @com.aliyun.core.annotation.NameInMap("MaxApplicationWaitTime")
        private Double maxApplicationWaitTime;

        @com.aliyun.core.annotation.NameInMap("MaxConcurrencyWaitTime")
        private Double maxConcurrencyWaitTime;

        @com.aliyun.core.annotation.NameInMap("MaxCpuTime")
        private Double maxCpuTime;

        @com.aliyun.core.annotation.NameInMap("MaxDiskReads")
        private Double maxDiskReads;

        @com.aliyun.core.annotation.NameInMap("MaxElapsedTime")
        private Double maxElapsedTime;

        @com.aliyun.core.annotation.NameInMap("MaxReturnRows")
        private Double maxReturnRows;

        @com.aliyun.core.annotation.NameInMap("MaxUserIoWaitTime")
        private Double maxUserIoWaitTime;

        @com.aliyun.core.annotation.NameInMap("MaxWaitTime")
        private Double maxWaitTime;

        @com.aliyun.core.annotation.NameInMap("MissPlanPercentage")
        private Double missPlanPercentage;

        @com.aliyun.core.annotation.NameInMap("MissPlans")
        private Double missPlans;

        @com.aliyun.core.annotation.NameInMap("RemotePlanPercentage")
        private Double remotePlanPercentage;

        @com.aliyun.core.annotation.NameInMap("RemotePlans")
        private Double remotePlans;

        @com.aliyun.core.annotation.NameInMap("RetCode4012Count")
        private Double retCode4012Count;

        @com.aliyun.core.annotation.NameInMap("RetCode4013Count")
        private Double retCode4013Count;

        @com.aliyun.core.annotation.NameInMap("RetCode5001Count")
        private Double retCode5001Count;

        @com.aliyun.core.annotation.NameInMap("RetCode5024Count")
        private Double retCode5024Count;

        @com.aliyun.core.annotation.NameInMap("RetCode5167Count")
        private Double retCode5167Count;

        @com.aliyun.core.annotation.NameInMap("RetCode5217Count")
        private Double retCode5217Count;

        @com.aliyun.core.annotation.NameInMap("RetCode6002Count")
        private Double retCode6002Count;

        @com.aliyun.core.annotation.NameInMap("RetryCount")
        private Double retryCount;

        @com.aliyun.core.annotation.NameInMap("RpcCount")
        private Double rpcCount;

        @com.aliyun.core.annotation.NameInMap("Server")
        private String server;

        @com.aliyun.core.annotation.NameInMap("ServerIp")
        private String serverIp;

        @com.aliyun.core.annotation.NameInMap("ServerPort")
        private Long serverPort;

        @com.aliyun.core.annotation.NameInMap("SqlId")
        private String sqlId;

        @com.aliyun.core.annotation.NameInMap("SqlList")
        private java.util.List < SqlList> sqlList;

        @com.aliyun.core.annotation.NameInMap("SqlTextShort")
        private String sqlTextShort;

        @com.aliyun.core.annotation.NameInMap("SqlType")
        private String sqlType;

        @com.aliyun.core.annotation.NameInMap("StrongConsistencyPercentage")
        private Double strongConsistencyPercentage;

        @com.aliyun.core.annotation.NameInMap("SumDbTime")
        private Double sumDbTime;

        @com.aliyun.core.annotation.NameInMap("SumElapsedTime")
        private Double sumElapsedTime;

        @com.aliyun.core.annotation.NameInMap("SumLogicalReads")
        private Double sumLogicalReads;

        @com.aliyun.core.annotation.NameInMap("SumWaitTime")
        private Double sumWaitTime;

        @com.aliyun.core.annotation.NameInMap("TableScanPercentage")
        private Double tableScanPercentage;

        @com.aliyun.core.annotation.NameInMap("TotalWaitTime")
        private Double totalWaitTime;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("WaitEvent")
        private String waitEvent;

        @com.aliyun.core.annotation.NameInMap("WeakConsistencyPercentage")
        private Double weakConsistencyPercentage;

        private Data(Builder builder) {
            this.avgAffectedRows = builder.avgAffectedRows;
            this.avgApplicationWaitTime = builder.avgApplicationWaitTime;
            this.avgBlockCacheHit = builder.avgBlockCacheHit;
            this.avgBlockIndexCacheHit = builder.avgBlockIndexCacheHit;
            this.avgBloomFilterCacheHit = builder.avgBloomFilterCacheHit;
            this.avgConcurrencyWaitTime = builder.avgConcurrencyWaitTime;
            this.avgCpuTime = builder.avgCpuTime;
            this.avgDbTime = builder.avgDbTime;
            this.avgDecodeTime = builder.avgDecodeTime;
            this.avgDiskReads = builder.avgDiskReads;
            this.avgElapsedTime = builder.avgElapsedTime;
            this.avgExecuteTime = builder.avgExecuteTime;
            this.avgExecutorRpcCount = builder.avgExecutorRpcCount;
            this.avgExpectedWorkerCount = builder.avgExpectedWorkerCount;
            this.avgGetPlanTime = builder.avgGetPlanTime;
            this.avgLogicalReads = builder.avgLogicalReads;
            this.avgMemstoreReadRows = builder.avgMemstoreReadRows;
            this.avgNetTime = builder.avgNetTime;
            this.avgNetWaitTime = builder.avgNetWaitTime;
            this.avgPartitionCount = builder.avgPartitionCount;
            this.avgQueueTime = builder.avgQueueTime;
            this.avgReturnRows = builder.avgReturnRows;
            this.avgRowCacheHit = builder.avgRowCacheHit;
            this.avgRpcCount = builder.avgRpcCount;
            this.avgScheduleTime = builder.avgScheduleTime;
            this.avgSsstoreReadRows = builder.avgSsstoreReadRows;
            this.avgUsedWorkerCount = builder.avgUsedWorkerCount;
            this.avgUserIoWaitTime = builder.avgUserIoWaitTime;
            this.avgWaitCount = builder.avgWaitCount;
            this.avgWaitTime = builder.avgWaitTime;
            this.clientIp = builder.clientIp;
            this.dbName = builder.dbName;
            this.distPlanPercentage = builder.distPlanPercentage;
            this.dynamicSql = builder.dynamicSql;
            this.execPs = builder.execPs;
            this.executions = builder.executions;
            this.failCount = builder.failCount;
            this.failPercentage = builder.failPercentage;
            this.inner = builder.inner;
            this.localPlanPercentage = builder.localPlanPercentage;
            this.maxAffectedRows = builder.maxAffectedRows;
            this.maxApplicationWaitTime = builder.maxApplicationWaitTime;
            this.maxConcurrencyWaitTime = builder.maxConcurrencyWaitTime;
            this.maxCpuTime = builder.maxCpuTime;
            this.maxDiskReads = builder.maxDiskReads;
            this.maxElapsedTime = builder.maxElapsedTime;
            this.maxReturnRows = builder.maxReturnRows;
            this.maxUserIoWaitTime = builder.maxUserIoWaitTime;
            this.maxWaitTime = builder.maxWaitTime;
            this.missPlanPercentage = builder.missPlanPercentage;
            this.missPlans = builder.missPlans;
            this.remotePlanPercentage = builder.remotePlanPercentage;
            this.remotePlans = builder.remotePlans;
            this.retCode4012Count = builder.retCode4012Count;
            this.retCode4013Count = builder.retCode4013Count;
            this.retCode5001Count = builder.retCode5001Count;
            this.retCode5024Count = builder.retCode5024Count;
            this.retCode5167Count = builder.retCode5167Count;
            this.retCode5217Count = builder.retCode5217Count;
            this.retCode6002Count = builder.retCode6002Count;
            this.retryCount = builder.retryCount;
            this.rpcCount = builder.rpcCount;
            this.server = builder.server;
            this.serverIp = builder.serverIp;
            this.serverPort = builder.serverPort;
            this.sqlId = builder.sqlId;
            this.sqlList = builder.sqlList;
            this.sqlTextShort = builder.sqlTextShort;
            this.sqlType = builder.sqlType;
            this.strongConsistencyPercentage = builder.strongConsistencyPercentage;
            this.sumDbTime = builder.sumDbTime;
            this.sumElapsedTime = builder.sumElapsedTime;
            this.sumLogicalReads = builder.sumLogicalReads;
            this.sumWaitTime = builder.sumWaitTime;
            this.tableScanPercentage = builder.tableScanPercentage;
            this.totalWaitTime = builder.totalWaitTime;
            this.userName = builder.userName;
            this.waitEvent = builder.waitEvent;
            this.weakConsistencyPercentage = builder.weakConsistencyPercentage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return avgAffectedRows
         */
        public Double getAvgAffectedRows() {
            return this.avgAffectedRows;
        }

        /**
         * @return avgApplicationWaitTime
         */
        public Double getAvgApplicationWaitTime() {
            return this.avgApplicationWaitTime;
        }

        /**
         * @return avgBlockCacheHit
         */
        public Double getAvgBlockCacheHit() {
            return this.avgBlockCacheHit;
        }

        /**
         * @return avgBlockIndexCacheHit
         */
        public Double getAvgBlockIndexCacheHit() {
            return this.avgBlockIndexCacheHit;
        }

        /**
         * @return avgBloomFilterCacheHit
         */
        public Double getAvgBloomFilterCacheHit() {
            return this.avgBloomFilterCacheHit;
        }

        /**
         * @return avgConcurrencyWaitTime
         */
        public Double getAvgConcurrencyWaitTime() {
            return this.avgConcurrencyWaitTime;
        }

        /**
         * @return avgCpuTime
         */
        public Double getAvgCpuTime() {
            return this.avgCpuTime;
        }

        /**
         * @return avgDbTime
         */
        public Double getAvgDbTime() {
            return this.avgDbTime;
        }

        /**
         * @return avgDecodeTime
         */
        public Double getAvgDecodeTime() {
            return this.avgDecodeTime;
        }

        /**
         * @return avgDiskReads
         */
        public Double getAvgDiskReads() {
            return this.avgDiskReads;
        }

        /**
         * @return avgElapsedTime
         */
        public Double getAvgElapsedTime() {
            return this.avgElapsedTime;
        }

        /**
         * @return avgExecuteTime
         */
        public Double getAvgExecuteTime() {
            return this.avgExecuteTime;
        }

        /**
         * @return avgExecutorRpcCount
         */
        public Double getAvgExecutorRpcCount() {
            return this.avgExecutorRpcCount;
        }

        /**
         * @return avgExpectedWorkerCount
         */
        public Double getAvgExpectedWorkerCount() {
            return this.avgExpectedWorkerCount;
        }

        /**
         * @return avgGetPlanTime
         */
        public Double getAvgGetPlanTime() {
            return this.avgGetPlanTime;
        }

        /**
         * @return avgLogicalReads
         */
        public Double getAvgLogicalReads() {
            return this.avgLogicalReads;
        }

        /**
         * @return avgMemstoreReadRows
         */
        public Double getAvgMemstoreReadRows() {
            return this.avgMemstoreReadRows;
        }

        /**
         * @return avgNetTime
         */
        public Double getAvgNetTime() {
            return this.avgNetTime;
        }

        /**
         * @return avgNetWaitTime
         */
        public Double getAvgNetWaitTime() {
            return this.avgNetWaitTime;
        }

        /**
         * @return avgPartitionCount
         */
        public Double getAvgPartitionCount() {
            return this.avgPartitionCount;
        }

        /**
         * @return avgQueueTime
         */
        public Double getAvgQueueTime() {
            return this.avgQueueTime;
        }

        /**
         * @return avgReturnRows
         */
        public Double getAvgReturnRows() {
            return this.avgReturnRows;
        }

        /**
         * @return avgRowCacheHit
         */
        public Double getAvgRowCacheHit() {
            return this.avgRowCacheHit;
        }

        /**
         * @return avgRpcCount
         */
        public Double getAvgRpcCount() {
            return this.avgRpcCount;
        }

        /**
         * @return avgScheduleTime
         */
        public Double getAvgScheduleTime() {
            return this.avgScheduleTime;
        }

        /**
         * @return avgSsstoreReadRows
         */
        public Double getAvgSsstoreReadRows() {
            return this.avgSsstoreReadRows;
        }

        /**
         * @return avgUsedWorkerCount
         */
        public Double getAvgUsedWorkerCount() {
            return this.avgUsedWorkerCount;
        }

        /**
         * @return avgUserIoWaitTime
         */
        public Double getAvgUserIoWaitTime() {
            return this.avgUserIoWaitTime;
        }

        /**
         * @return avgWaitCount
         */
        public Double getAvgWaitCount() {
            return this.avgWaitCount;
        }

        /**
         * @return avgWaitTime
         */
        public Double getAvgWaitTime() {
            return this.avgWaitTime;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return distPlanPercentage
         */
        public Double getDistPlanPercentage() {
            return this.distPlanPercentage;
        }

        /**
         * @return dynamicSql
         */
        public Boolean getDynamicSql() {
            return this.dynamicSql;
        }

        /**
         * @return execPs
         */
        public Double getExecPs() {
            return this.execPs;
        }

        /**
         * @return executions
         */
        public Double getExecutions() {
            return this.executions;
        }

        /**
         * @return failCount
         */
        public Double getFailCount() {
            return this.failCount;
        }

        /**
         * @return failPercentage
         */
        public Double getFailPercentage() {
            return this.failPercentage;
        }

        /**
         * @return inner
         */
        public Boolean getInner() {
            return this.inner;
        }

        /**
         * @return localPlanPercentage
         */
        public Double getLocalPlanPercentage() {
            return this.localPlanPercentage;
        }

        /**
         * @return maxAffectedRows
         */
        public Double getMaxAffectedRows() {
            return this.maxAffectedRows;
        }

        /**
         * @return maxApplicationWaitTime
         */
        public Double getMaxApplicationWaitTime() {
            return this.maxApplicationWaitTime;
        }

        /**
         * @return maxConcurrencyWaitTime
         */
        public Double getMaxConcurrencyWaitTime() {
            return this.maxConcurrencyWaitTime;
        }

        /**
         * @return maxCpuTime
         */
        public Double getMaxCpuTime() {
            return this.maxCpuTime;
        }

        /**
         * @return maxDiskReads
         */
        public Double getMaxDiskReads() {
            return this.maxDiskReads;
        }

        /**
         * @return maxElapsedTime
         */
        public Double getMaxElapsedTime() {
            return this.maxElapsedTime;
        }

        /**
         * @return maxReturnRows
         */
        public Double getMaxReturnRows() {
            return this.maxReturnRows;
        }

        /**
         * @return maxUserIoWaitTime
         */
        public Double getMaxUserIoWaitTime() {
            return this.maxUserIoWaitTime;
        }

        /**
         * @return maxWaitTime
         */
        public Double getMaxWaitTime() {
            return this.maxWaitTime;
        }

        /**
         * @return missPlanPercentage
         */
        public Double getMissPlanPercentage() {
            return this.missPlanPercentage;
        }

        /**
         * @return missPlans
         */
        public Double getMissPlans() {
            return this.missPlans;
        }

        /**
         * @return remotePlanPercentage
         */
        public Double getRemotePlanPercentage() {
            return this.remotePlanPercentage;
        }

        /**
         * @return remotePlans
         */
        public Double getRemotePlans() {
            return this.remotePlans;
        }

        /**
         * @return retCode4012Count
         */
        public Double getRetCode4012Count() {
            return this.retCode4012Count;
        }

        /**
         * @return retCode4013Count
         */
        public Double getRetCode4013Count() {
            return this.retCode4013Count;
        }

        /**
         * @return retCode5001Count
         */
        public Double getRetCode5001Count() {
            return this.retCode5001Count;
        }

        /**
         * @return retCode5024Count
         */
        public Double getRetCode5024Count() {
            return this.retCode5024Count;
        }

        /**
         * @return retCode5167Count
         */
        public Double getRetCode5167Count() {
            return this.retCode5167Count;
        }

        /**
         * @return retCode5217Count
         */
        public Double getRetCode5217Count() {
            return this.retCode5217Count;
        }

        /**
         * @return retCode6002Count
         */
        public Double getRetCode6002Count() {
            return this.retCode6002Count;
        }

        /**
         * @return retryCount
         */
        public Double getRetryCount() {
            return this.retryCount;
        }

        /**
         * @return rpcCount
         */
        public Double getRpcCount() {
            return this.rpcCount;
        }

        /**
         * @return server
         */
        public String getServer() {
            return this.server;
        }

        /**
         * @return serverIp
         */
        public String getServerIp() {
            return this.serverIp;
        }

        /**
         * @return serverPort
         */
        public Long getServerPort() {
            return this.serverPort;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return sqlList
         */
        public java.util.List < SqlList> getSqlList() {
            return this.sqlList;
        }

        /**
         * @return sqlTextShort
         */
        public String getSqlTextShort() {
            return this.sqlTextShort;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        /**
         * @return strongConsistencyPercentage
         */
        public Double getStrongConsistencyPercentage() {
            return this.strongConsistencyPercentage;
        }

        /**
         * @return sumDbTime
         */
        public Double getSumDbTime() {
            return this.sumDbTime;
        }

        /**
         * @return sumElapsedTime
         */
        public Double getSumElapsedTime() {
            return this.sumElapsedTime;
        }

        /**
         * @return sumLogicalReads
         */
        public Double getSumLogicalReads() {
            return this.sumLogicalReads;
        }

        /**
         * @return sumWaitTime
         */
        public Double getSumWaitTime() {
            return this.sumWaitTime;
        }

        /**
         * @return tableScanPercentage
         */
        public Double getTableScanPercentage() {
            return this.tableScanPercentage;
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

        /**
         * @return waitEvent
         */
        public String getWaitEvent() {
            return this.waitEvent;
        }

        /**
         * @return weakConsistencyPercentage
         */
        public Double getWeakConsistencyPercentage() {
            return this.weakConsistencyPercentage;
        }

        public static final class Builder {
            private Double avgAffectedRows; 
            private Double avgApplicationWaitTime; 
            private Double avgBlockCacheHit; 
            private Double avgBlockIndexCacheHit; 
            private Double avgBloomFilterCacheHit; 
            private Double avgConcurrencyWaitTime; 
            private Double avgCpuTime; 
            private Double avgDbTime; 
            private Double avgDecodeTime; 
            private Double avgDiskReads; 
            private Double avgElapsedTime; 
            private Double avgExecuteTime; 
            private Double avgExecutorRpcCount; 
            private Double avgExpectedWorkerCount; 
            private Double avgGetPlanTime; 
            private Double avgLogicalReads; 
            private Double avgMemstoreReadRows; 
            private Double avgNetTime; 
            private Double avgNetWaitTime; 
            private Double avgPartitionCount; 
            private Double avgQueueTime; 
            private Double avgReturnRows; 
            private Double avgRowCacheHit; 
            private Double avgRpcCount; 
            private Double avgScheduleTime; 
            private Double avgSsstoreReadRows; 
            private Double avgUsedWorkerCount; 
            private Double avgUserIoWaitTime; 
            private Double avgWaitCount; 
            private Double avgWaitTime; 
            private String clientIp; 
            private String dbName; 
            private Double distPlanPercentage; 
            private Boolean dynamicSql; 
            private Double execPs; 
            private Double executions; 
            private Double failCount; 
            private Double failPercentage; 
            private Boolean inner; 
            private Double localPlanPercentage; 
            private Double maxAffectedRows; 
            private Double maxApplicationWaitTime; 
            private Double maxConcurrencyWaitTime; 
            private Double maxCpuTime; 
            private Double maxDiskReads; 
            private Double maxElapsedTime; 
            private Double maxReturnRows; 
            private Double maxUserIoWaitTime; 
            private Double maxWaitTime; 
            private Double missPlanPercentage; 
            private Double missPlans; 
            private Double remotePlanPercentage; 
            private Double remotePlans; 
            private Double retCode4012Count; 
            private Double retCode4013Count; 
            private Double retCode5001Count; 
            private Double retCode5024Count; 
            private Double retCode5167Count; 
            private Double retCode5217Count; 
            private Double retCode6002Count; 
            private Double retryCount; 
            private Double rpcCount; 
            private String server; 
            private String serverIp; 
            private Long serverPort; 
            private String sqlId; 
            private java.util.List < SqlList> sqlList; 
            private String sqlTextShort; 
            private String sqlType; 
            private Double strongConsistencyPercentage; 
            private Double sumDbTime; 
            private Double sumElapsedTime; 
            private Double sumLogicalReads; 
            private Double sumWaitTime; 
            private Double tableScanPercentage; 
            private Double totalWaitTime; 
            private String userName; 
            private String waitEvent; 
            private Double weakConsistencyPercentage; 

            /**
             * Average updated rows during the execution period.
             */
            public Builder avgAffectedRows(Double avgAffectedRows) {
                this.avgAffectedRows = avgAffectedRows;
                return this;
            }

            /**
             * Average Application event wait time (in milliseconds) during the client waiting period.
             */
            public Builder avgApplicationWaitTime(Double avgApplicationWaitTime) {
                this.avgApplicationWaitTime = avgApplicationWaitTime;
                return this;
            }

            /**
             * Average BlockCache hit count during the execution period.
             */
            public Builder avgBlockCacheHit(Double avgBlockCacheHit) {
                this.avgBlockCacheHit = avgBlockCacheHit;
                return this;
            }

            /**
             * Average BlockIndexCache hit count during the execution period.
             */
            public Builder avgBlockIndexCacheHit(Double avgBlockIndexCacheHit) {
                this.avgBlockIndexCacheHit = avgBlockIndexCacheHit;
                return this;
            }

            /**
             * Average BloomFilterCache hit count during the execution period.
             */
            public Builder avgBloomFilterCacheHit(Double avgBloomFilterCacheHit) {
                this.avgBloomFilterCacheHit = avgBloomFilterCacheHit;
                return this;
            }

            /**
             * Average Concurrency event wait time (in milliseconds) during the execution period.
             */
            public Builder avgConcurrencyWaitTime(Double avgConcurrencyWaitTime) {
                this.avgConcurrencyWaitTime = avgConcurrencyWaitTime;
                return this;
            }

            /**
             * Average CPU time (in milliseconds) during the execution period.
             */
            public Builder avgCpuTime(Double avgCpuTime) {
                this.avgCpuTime = avgCpuTime;
                return this;
            }

            /**
             * AvgDbTime.
             */
            public Builder avgDbTime(Double avgDbTime) {
                this.avgDbTime = avgDbTime;
                return this;
            }

            /**
             * Average syntax parsing time (in milliseconds) during the execution period.
             */
            public Builder avgDecodeTime(Double avgDecodeTime) {
                this.avgDecodeTime = avgDecodeTime;
                return this;
            }

            /**
             * Average physical read count during the execution period.
             */
            public Builder avgDiskReads(Double avgDiskReads) {
                this.avgDiskReads = avgDiskReads;
                return this;
            }

            /**
             * Average response time (in milliseconds) during the execution period.
             */
            public Builder avgElapsedTime(Double avgElapsedTime) {
                this.avgElapsedTime = avgElapsedTime;
                return this;
            }

            /**
             * Average plan execution time (in milliseconds) during the execution period.
             */
            public Builder avgExecuteTime(Double avgExecuteTime) {
                this.avgExecuteTime = avgExecuteTime;
                return this;
            }

            /**
             * Average number of RPC requests executed during the execution period.
             */
            public Builder avgExecutorRpcCount(Double avgExecutorRpcCount) {
                this.avgExecutorRpcCount = avgExecutorRpcCount;
                return this;
            }

            /**
             * Average degree of parallelism during the execution period.
             */
            public Builder avgExpectedWorkerCount(Double avgExpectedWorkerCount) {
                this.avgExpectedWorkerCount = avgExpectedWorkerCount;
                return this;
            }

            /**
             * Average plan generation time (in milliseconds) during the execution period.
             */
            public Builder avgGetPlanTime(Double avgGetPlanTime) {
                this.avgGetPlanTime = avgGetPlanTime;
                return this;
            }

            /**
             * Average logical reads of the SQL during the execution period.
             */
            public Builder avgLogicalReads(Double avgLogicalReads) {
                this.avgLogicalReads = avgLogicalReads;
                return this;
            }

            /**
             * Strong consistent transaction percentage during the execution period.
             */
            public Builder avgMemstoreReadRows(Double avgMemstoreReadRows) {
                this.avgMemstoreReadRows = avgMemstoreReadRows;
                return this;
            }

            /**
             * Average network transmission time (in milliseconds) during the execution period.
             */
            public Builder avgNetTime(Double avgNetTime) {
                this.avgNetTime = avgNetTime;
                return this;
            }

            /**
             * Average network enqueue time (in milliseconds) during the network waiting period.
             */
            public Builder avgNetWaitTime(Double avgNetWaitTime) {
                this.avgNetWaitTime = avgNetWaitTime;
                return this;
            }

            /**
             * Average number of partition accessed during the execution period.
             */
            public Builder avgPartitionCount(Double avgPartitionCount) {
                this.avgPartitionCount = avgPartitionCount;
                return this;
            }

            /**
             * Average queueing time (in milliseconds) during the execution period.
             */
            public Builder avgQueueTime(Double avgQueueTime) {
                this.avgQueueTime = avgQueueTime;
                return this;
            }

            /**
             * Average number of rows returned during the execution period.
             */
            public Builder avgReturnRows(Double avgReturnRows) {
                this.avgReturnRows = avgReturnRows;
                return this;
            }

            /**
             * Average RowCache hit count during the execution period.
             */
            public Builder avgRowCacheHit(Double avgRowCacheHit) {
                this.avgRowCacheHit = avgRowCacheHit;
                return this;
            }

            /**
             * Average number of RPC sent during the execution.
             */
            public Builder avgRpcCount(Double avgRpcCount) {
                this.avgRpcCount = avgRpcCount;
                return this;
            }

            /**
             * Average Schedule event wait time (in milliseconds) during the scheduling period.
             */
            public Builder avgScheduleTime(Double avgScheduleTime) {
                this.avgScheduleTime = avgScheduleTime;
                return this;
            }

            /**
             * Eventually consistent transaction percentage during the execution period.
             */
            public Builder avgSsstoreReadRows(Double avgSsstoreReadRows) {
                this.avgSsstoreReadRows = avgSsstoreReadRows;
                return this;
            }

            /**
             * Average number of threads used of the SQL during the execution period.
             */
            public Builder avgUsedWorkerCount(Double avgUsedWorkerCount) {
                this.avgUsedWorkerCount = avgUsedWorkerCount;
                return this;
            }

            /**
             * Average UserIO event wait time (in milliseconds) during the execution period.
             */
            public Builder avgUserIoWaitTime(Double avgUserIoWaitTime) {
                this.avgUserIoWaitTime = avgUserIoWaitTime;
                return this;
            }

            /**
             * Average number of waits during the execution period.
             */
            public Builder avgWaitCount(Double avgWaitCount) {
                this.avgWaitCount = avgWaitCount;
                return this;
            }

            /**
             * Average wait time (in milliseconds) during the execution period.
             */
            public Builder avgWaitTime(Double avgWaitTime) {
                this.avgWaitTime = avgWaitTime;
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
             * The name of the database.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * Distributed plan percentage during the execution period.
             */
            public Builder distPlanPercentage(Double distPlanPercentage) {
                this.distPlanPercentage = distPlanPercentage;
                return this;
            }

            /**
             * DynamicSql.
             */
            public Builder dynamicSql(Boolean dynamicSql) {
                this.dynamicSql = dynamicSql;
                return this;
            }

            /**
             * Average execution count per second during the execution period.
             */
            public Builder execPs(Double execPs) {
                this.execPs = execPs;
                return this;
            }

            /**
             * Total number of executions during the execution period.
             */
            public Builder executions(Double executions) {
                this.executions = executions;
                return this;
            }

            /**
             * Average number of partition accessed during the execution period.
             */
            public Builder failCount(Double failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * Error percentage during the execution period.
             */
            public Builder failPercentage(Double failPercentage) {
                this.failPercentage = failPercentage;
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
             * Local plan percentage during the execution period.
             */
            public Builder localPlanPercentage(Double localPlanPercentage) {
                this.localPlanPercentage = localPlanPercentage;
                return this;
            }

            /**
             * Max affected rows during the execution period.
             */
            public Builder maxAffectedRows(Double maxAffectedRows) {
                this.maxAffectedRows = maxAffectedRows;
                return this;
            }

            /**
             * Max Application event wait time (in milliseconds) during the execution period
             */
            public Builder maxApplicationWaitTime(Double maxApplicationWaitTime) {
                this.maxApplicationWaitTime = maxApplicationWaitTime;
                return this;
            }

            /**
             * Max Concurrency event wait time (in milliseconds) during the execution period
             */
            public Builder maxConcurrencyWaitTime(Double maxConcurrencyWaitTime) {
                this.maxConcurrencyWaitTime = maxConcurrencyWaitTime;
                return this;
            }

            /**
             * Max CPU time.
             */
            public Builder maxCpuTime(Double maxCpuTime) {
                this.maxCpuTime = maxCpuTime;
                return this;
            }

            /**
             * Max physical read count during the execution period.
             */
            public Builder maxDiskReads(Double maxDiskReads) {
                this.maxDiskReads = maxDiskReads;
                return this;
            }

            /**
             * Max response time during the execution period.
             */
            public Builder maxElapsedTime(Double maxElapsedTime) {
                this.maxElapsedTime = maxElapsedTime;
                return this;
            }

            /**
             * Max returned rows during the execution period.
             */
            public Builder maxReturnRows(Double maxReturnRows) {
                this.maxReturnRows = maxReturnRows;
                return this;
            }

            /**
             * Max UserIO event wait time (in milliseconds) during the execution period.
             */
            public Builder maxUserIoWaitTime(Double maxUserIoWaitTime) {
                this.maxUserIoWaitTime = maxUserIoWaitTime;
                return this;
            }

            /**
             * Max wait time (in milliseconds) during the execution period.
             */
            public Builder maxWaitTime(Double maxWaitTime) {
                this.maxWaitTime = maxWaitTime;
                return this;
            }

            /**
             * Plan hit rage during the execution period.
             */
            public Builder missPlanPercentage(Double missPlanPercentage) {
                this.missPlanPercentage = missPlanPercentage;
                return this;
            }

            /**
             * Missed hit count of the execution plan during the execution period.
             */
            public Builder missPlans(Double missPlans) {
                this.missPlans = missPlans;
                return this;
            }

            /**
             * Remote plan percentage during the execution period.
             */
            public Builder remotePlanPercentage(Double remotePlanPercentage) {
                this.remotePlanPercentage = remotePlanPercentage;
                return this;
            }

            /**
             * Remote execution count during the execution period.
             */
            public Builder remotePlans(Double remotePlans) {
                this.remotePlans = remotePlans;
                return this;
            }

            /**
             * Number of occurrences of code 4012 during the execution period.
             */
            public Builder retCode4012Count(Double retCode4012Count) {
                this.retCode4012Count = retCode4012Count;
                return this;
            }

            /**
             * Number of occurrences of code 4013 during the execution period.
             */
            public Builder retCode4013Count(Double retCode4013Count) {
                this.retCode4013Count = retCode4013Count;
                return this;
            }

            /**
             * Number of occurrences of code 5001 during the execution period.
             */
            public Builder retCode5001Count(Double retCode5001Count) {
                this.retCode5001Count = retCode5001Count;
                return this;
            }

            /**
             * Number of occurrences of code 5024 during the execution period.
             */
            public Builder retCode5024Count(Double retCode5024Count) {
                this.retCode5024Count = retCode5024Count;
                return this;
            }

            /**
             * Number of occurrences of code 5167 during the execution period.
             */
            public Builder retCode5167Count(Double retCode5167Count) {
                this.retCode5167Count = retCode5167Count;
                return this;
            }

            /**
             * Number of occurrences of code 5217 during the execution period.
             */
            public Builder retCode5217Count(Double retCode5217Count) {
                this.retCode5217Count = retCode5217Count;
                return this;
            }

            /**
             * Number of occurrences of code 6002 during the execution period.
             */
            public Builder retCode6002Count(Double retCode6002Count) {
                this.retCode6002Count = retCode6002Count;
                return this;
            }

            /**
             * Total number of retries during the execution period.
             */
            public Builder retryCount(Double retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * RPC count during the execution period.
             */
            public Builder rpcCount(Double rpcCount) {
                this.rpcCount = rpcCount;
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
             * The IP address of the server.
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * The server port where the SQL is executed.
             */
            public Builder serverPort(Long serverPort) {
                this.serverPort = serverPort;
                return this;
            }

            /**
             * SQL ID.
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * SqlList.
             */
            public Builder sqlList(java.util.List < SqlList> sqlList) {
                this.sqlList = sqlList;
                return this;
            }

            /**
             * SQL text (the first 100 characters).
             */
            public Builder sqlTextShort(String sqlTextShort) {
                this.sqlTextShort = sqlTextShort;
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
             * Strong consistent transaction percentage during the execution period.
             */
            public Builder strongConsistencyPercentage(Double strongConsistencyPercentage) {
                this.strongConsistencyPercentage = strongConsistencyPercentage;
                return this;
            }

            /**
             * SumDbTime.
             */
            public Builder sumDbTime(Double sumDbTime) {
                this.sumDbTime = sumDbTime;
                return this;
            }

            /**
             * Total response time (in milliseconds) during the execution period.
             */
            public Builder sumElapsedTime(Double sumElapsedTime) {
                this.sumElapsedTime = sumElapsedTime;
                return this;
            }

            /**
             * Total logical reads of the SQL during the execution period.
             */
            public Builder sumLogicalReads(Double sumLogicalReads) {
                this.sumLogicalReads = sumLogicalReads;
                return this;
            }

            /**
             * The total wait time (in milliseconds) during the internal waiting period.
             */
            public Builder sumWaitTime(Double sumWaitTime) {
                this.sumWaitTime = sumWaitTime;
                return this;
            }

            /**
             * Table scan percentage during the execution period.
             */
            public Builder tableScanPercentage(Double tableScanPercentage) {
                this.tableScanPercentage = tableScanPercentage;
                return this;
            }

            /**
             * Total wait time during the execution period.
             */
            public Builder totalWaitTime(Double totalWaitTime) {
                this.totalWaitTime = totalWaitTime;
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
             * Longest wait event during the execution period.
             */
            public Builder waitEvent(String waitEvent) {
                this.waitEvent = waitEvent;
                return this;
            }

            /**
             * Eventually consistent transaction percentage during the execution period.
             */
            public Builder weakConsistencyPercentage(Double weakConsistencyPercentage) {
                this.weakConsistencyPercentage = weakConsistencyPercentage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
