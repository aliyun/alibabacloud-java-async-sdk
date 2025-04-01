// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeOasSlowSQLListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOasSlowSQLListResponseBody</p>
 */
public class DescribeOasSlowSQLListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeOasSlowSQLListResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of slow queries.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOasSlowSQLListResponseBody build() {
            return new DescribeOasSlowSQLListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOasSlowSQLListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOasSlowSQLListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SqlList model) {
                this.avgAffectedRows = model.avgAffectedRows;
                this.avgApplicationWaitTime = model.avgApplicationWaitTime;
                this.avgBlockCacheHit = model.avgBlockCacheHit;
                this.avgBlockIndexCacheHit = model.avgBlockIndexCacheHit;
                this.avgBloomFilterCacheHit = model.avgBloomFilterCacheHit;
                this.avgConcurrencyWaitTime = model.avgConcurrencyWaitTime;
                this.avgCpuTime = model.avgCpuTime;
                this.avgDbTime = model.avgDbTime;
                this.avgDecodeTime = model.avgDecodeTime;
                this.avgDiskReads = model.avgDiskReads;
                this.avgElapsedTime = model.avgElapsedTime;
                this.avgExecuteTime = model.avgExecuteTime;
                this.avgExecutorRpcCount = model.avgExecutorRpcCount;
                this.avgExpectedWorkerCount = model.avgExpectedWorkerCount;
                this.avgGetPlanTime = model.avgGetPlanTime;
                this.avgLogicalReads = model.avgLogicalReads;
                this.avgMemstoreReadRows = model.avgMemstoreReadRows;
                this.avgNetTime = model.avgNetTime;
                this.avgNetWaitTime = model.avgNetWaitTime;
                this.avgPartitionCount = model.avgPartitionCount;
                this.avgQueueTime = model.avgQueueTime;
                this.avgReturnRows = model.avgReturnRows;
                this.avgRowCacheHit = model.avgRowCacheHit;
                this.avgRpcCount = model.avgRpcCount;
                this.avgScheduleTime = model.avgScheduleTime;
                this.avgSsstoreReadRows = model.avgSsstoreReadRows;
                this.avgUsedWorkerCount = model.avgUsedWorkerCount;
                this.avgUserIoWaitTime = model.avgUserIoWaitTime;
                this.avgWaitCount = model.avgWaitCount;
                this.avgWaitTime = model.avgWaitTime;
                this.clientIp = model.clientIp;
                this.dbName = model.dbName;
                this.distPlanPercentage = model.distPlanPercentage;
                this.execPs = model.execPs;
                this.executions = model.executions;
                this.failCount = model.failCount;
                this.failPercentage = model.failPercentage;
                this.inner = model.inner;
                this.localPlanPercentage = model.localPlanPercentage;
                this.maxAffectedRows = model.maxAffectedRows;
                this.maxApplicationWaitTime = model.maxApplicationWaitTime;
                this.maxConcurrencyWaitTime = model.maxConcurrencyWaitTime;
                this.maxCpuTime = model.maxCpuTime;
                this.maxDiskReads = model.maxDiskReads;
                this.maxElapsedTime = model.maxElapsedTime;
                this.maxReturnRows = model.maxReturnRows;
                this.maxUserIoWaitTime = model.maxUserIoWaitTime;
                this.maxWaitTime = model.maxWaitTime;
                this.missPlanPercentage = model.missPlanPercentage;
                this.missPlans = model.missPlans;
                this.remotePlanPercentage = model.remotePlanPercentage;
                this.remotePlans = model.remotePlans;
                this.retCode4012Count = model.retCode4012Count;
                this.retCode4013Count = model.retCode4013Count;
                this.retCode5001Count = model.retCode5001Count;
                this.retCode5024Count = model.retCode5024Count;
                this.retCode5167Count = model.retCode5167Count;
                this.retCode5217Count = model.retCode5217Count;
                this.retCode6002Count = model.retCode6002Count;
                this.retryCount = model.retryCount;
                this.rpcCount = model.rpcCount;
                this.server = model.server;
                this.serverIp = model.serverIp;
                this.serverPort = model.serverPort;
                this.sqlId = model.sqlId;
                this.sqlTextShort = model.sqlTextShort;
                this.sqlType = model.sqlType;
                this.strongConsistencyPercentage = model.strongConsistencyPercentage;
                this.sumDbTime = model.sumDbTime;
                this.sumElapsedTime = model.sumElapsedTime;
                this.sumLogicalReads = model.sumLogicalReads;
                this.sumWaitTime = model.sumWaitTime;
                this.tableScanPercentage = model.tableScanPercentage;
                this.totalWaitTime = model.totalWaitTime;
                this.userName = model.userName;
                this.waitEvent = model.waitEvent;
                this.weakConsistencyPercentage = model.weakConsistencyPercentage;
            } 

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
    /**
     * 
     * {@link DescribeOasSlowSQLListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOasSlowSQLListResponseBody</p>
     */
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
        private Long retCode4012Count;

        @com.aliyun.core.annotation.NameInMap("RetCode4013Count")
        private Long retCode4013Count;

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
        private java.util.List<SqlList> sqlList;

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
        public java.util.List<SqlList> getSqlList() {
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
            private Long retCode4012Count; 
            private Long retCode4013Count; 
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
            private java.util.List<SqlList> sqlList; 
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.avgAffectedRows = model.avgAffectedRows;
                this.avgApplicationWaitTime = model.avgApplicationWaitTime;
                this.avgBlockCacheHit = model.avgBlockCacheHit;
                this.avgBlockIndexCacheHit = model.avgBlockIndexCacheHit;
                this.avgBloomFilterCacheHit = model.avgBloomFilterCacheHit;
                this.avgConcurrencyWaitTime = model.avgConcurrencyWaitTime;
                this.avgCpuTime = model.avgCpuTime;
                this.avgDbTime = model.avgDbTime;
                this.avgDecodeTime = model.avgDecodeTime;
                this.avgDiskReads = model.avgDiskReads;
                this.avgElapsedTime = model.avgElapsedTime;
                this.avgExecuteTime = model.avgExecuteTime;
                this.avgExecutorRpcCount = model.avgExecutorRpcCount;
                this.avgExpectedWorkerCount = model.avgExpectedWorkerCount;
                this.avgGetPlanTime = model.avgGetPlanTime;
                this.avgLogicalReads = model.avgLogicalReads;
                this.avgMemstoreReadRows = model.avgMemstoreReadRows;
                this.avgNetTime = model.avgNetTime;
                this.avgNetWaitTime = model.avgNetWaitTime;
                this.avgPartitionCount = model.avgPartitionCount;
                this.avgQueueTime = model.avgQueueTime;
                this.avgReturnRows = model.avgReturnRows;
                this.avgRowCacheHit = model.avgRowCacheHit;
                this.avgRpcCount = model.avgRpcCount;
                this.avgScheduleTime = model.avgScheduleTime;
                this.avgSsstoreReadRows = model.avgSsstoreReadRows;
                this.avgUsedWorkerCount = model.avgUsedWorkerCount;
                this.avgUserIoWaitTime = model.avgUserIoWaitTime;
                this.avgWaitCount = model.avgWaitCount;
                this.avgWaitTime = model.avgWaitTime;
                this.clientIp = model.clientIp;
                this.dbName = model.dbName;
                this.distPlanPercentage = model.distPlanPercentage;
                this.dynamicSql = model.dynamicSql;
                this.execPs = model.execPs;
                this.executions = model.executions;
                this.failCount = model.failCount;
                this.failPercentage = model.failPercentage;
                this.inner = model.inner;
                this.localPlanPercentage = model.localPlanPercentage;
                this.maxAffectedRows = model.maxAffectedRows;
                this.maxApplicationWaitTime = model.maxApplicationWaitTime;
                this.maxConcurrencyWaitTime = model.maxConcurrencyWaitTime;
                this.maxCpuTime = model.maxCpuTime;
                this.maxDiskReads = model.maxDiskReads;
                this.maxElapsedTime = model.maxElapsedTime;
                this.maxReturnRows = model.maxReturnRows;
                this.maxUserIoWaitTime = model.maxUserIoWaitTime;
                this.maxWaitTime = model.maxWaitTime;
                this.missPlanPercentage = model.missPlanPercentage;
                this.missPlans = model.missPlans;
                this.remotePlanPercentage = model.remotePlanPercentage;
                this.remotePlans = model.remotePlans;
                this.retCode4012Count = model.retCode4012Count;
                this.retCode4013Count = model.retCode4013Count;
                this.retCode5001Count = model.retCode5001Count;
                this.retCode5024Count = model.retCode5024Count;
                this.retCode5167Count = model.retCode5167Count;
                this.retCode5217Count = model.retCode5217Count;
                this.retCode6002Count = model.retCode6002Count;
                this.retryCount = model.retryCount;
                this.rpcCount = model.rpcCount;
                this.server = model.server;
                this.serverIp = model.serverIp;
                this.serverPort = model.serverPort;
                this.sqlId = model.sqlId;
                this.sqlList = model.sqlList;
                this.sqlTextShort = model.sqlTextShort;
                this.sqlType = model.sqlType;
                this.strongConsistencyPercentage = model.strongConsistencyPercentage;
                this.sumDbTime = model.sumDbTime;
                this.sumElapsedTime = model.sumElapsedTime;
                this.sumLogicalReads = model.sumLogicalReads;
                this.sumWaitTime = model.sumWaitTime;
                this.tableScanPercentage = model.tableScanPercentage;
                this.totalWaitTime = model.totalWaitTime;
                this.userName = model.userName;
                this.waitEvent = model.waitEvent;
                this.weakConsistencyPercentage = model.weakConsistencyPercentage;
            } 

            /**
             * <p>Average updated rows during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>9978.75</p>
             */
            public Builder avgAffectedRows(Double avgAffectedRows) {
                this.avgAffectedRows = avgAffectedRows;
                return this;
            }

            /**
             * <p>Average Application event wait time (in milliseconds) during the client waiting period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder avgApplicationWaitTime(Double avgApplicationWaitTime) {
                this.avgApplicationWaitTime = avgApplicationWaitTime;
                return this;
            }

            /**
             * <p>Average BlockCache hit count during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder avgBlockCacheHit(Double avgBlockCacheHit) {
                this.avgBlockCacheHit = avgBlockCacheHit;
                return this;
            }

            /**
             * <p>Average BlockIndexCache hit count during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder avgBlockIndexCacheHit(Double avgBlockIndexCacheHit) {
                this.avgBlockIndexCacheHit = avgBlockIndexCacheHit;
                return this;
            }

            /**
             * <p>Average BloomFilterCache hit count during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder avgBloomFilterCacheHit(Double avgBloomFilterCacheHit) {
                this.avgBloomFilterCacheHit = avgBloomFilterCacheHit;
                return this;
            }

            /**
             * <p>Average Concurrency event wait time (in milliseconds) during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder avgConcurrencyWaitTime(Double avgConcurrencyWaitTime) {
                this.avgConcurrencyWaitTime = avgConcurrencyWaitTime;
                return this;
            }

            /**
             * <p>Average CPU time (in milliseconds) during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>1875.34</p>
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
             * <p>Average syntax parsing time (in milliseconds) during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder avgDecodeTime(Double avgDecodeTime) {
                this.avgDecodeTime = avgDecodeTime;
                return this;
            }

            /**
             * <p>Average physical read count during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder avgDiskReads(Double avgDiskReads) {
                this.avgDiskReads = avgDiskReads;
                return this;
            }

            /**
             * <p>Average response time (in milliseconds) during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>1876.78</p>
             */
            public Builder avgElapsedTime(Double avgElapsedTime) {
                this.avgElapsedTime = avgElapsedTime;
                return this;
            }

            /**
             * <p>Average plan execution time (in milliseconds) during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>1895.7</p>
             */
            public Builder avgExecuteTime(Double avgExecuteTime) {
                this.avgExecuteTime = avgExecuteTime;
                return this;
            }

            /**
             * <p>Average number of RPC requests executed during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder avgExecutorRpcCount(Double avgExecutorRpcCount) {
                this.avgExecutorRpcCount = avgExecutorRpcCount;
                return this;
            }

            /**
             * <p>Average degree of parallelism during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder avgExpectedWorkerCount(Double avgExpectedWorkerCount) {
                this.avgExpectedWorkerCount = avgExpectedWorkerCount;
                return this;
            }

            /**
             * <p>Average plan generation time (in milliseconds) during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder avgGetPlanTime(Double avgGetPlanTime) {
                this.avgGetPlanTime = avgGetPlanTime;
                return this;
            }

            /**
             * <p>Average logical reads of the SQL during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder avgLogicalReads(Double avgLogicalReads) {
                this.avgLogicalReads = avgLogicalReads;
                return this;
            }

            /**
             * <p>Strong consistent transaction percentage during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder avgMemstoreReadRows(Double avgMemstoreReadRows) {
                this.avgMemstoreReadRows = avgMemstoreReadRows;
                return this;
            }

            /**
             * <p>Average network transmission time (in milliseconds) during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder avgNetTime(Double avgNetTime) {
                this.avgNetTime = avgNetTime;
                return this;
            }

            /**
             * <p>Average network enqueue time (in milliseconds) during the network waiting period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder avgNetWaitTime(Double avgNetWaitTime) {
                this.avgNetWaitTime = avgNetWaitTime;
                return this;
            }

            /**
             * <p>Average number of partition accessed during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder avgPartitionCount(Double avgPartitionCount) {
                this.avgPartitionCount = avgPartitionCount;
                return this;
            }

            /**
             * <p>Average queueing time (in milliseconds) during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.01</p>
             */
            public Builder avgQueueTime(Double avgQueueTime) {
                this.avgQueueTime = avgQueueTime;
                return this;
            }

            /**
             * <p>Average number of rows returned during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder avgReturnRows(Double avgReturnRows) {
                this.avgReturnRows = avgReturnRows;
                return this;
            }

            /**
             * <p>Average RowCache hit count during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder avgRowCacheHit(Double avgRowCacheHit) {
                this.avgRowCacheHit = avgRowCacheHit;
                return this;
            }

            /**
             * <p>Average number of RPC sent during the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>8.0</p>
             */
            public Builder avgRpcCount(Double avgRpcCount) {
                this.avgRpcCount = avgRpcCount;
                return this;
            }

            /**
             * <p>Average Schedule event wait time (in milliseconds) during the scheduling period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder avgScheduleTime(Double avgScheduleTime) {
                this.avgScheduleTime = avgScheduleTime;
                return this;
            }

            /**
             * <p>Eventually consistent transaction percentage during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder avgSsstoreReadRows(Double avgSsstoreReadRows) {
                this.avgSsstoreReadRows = avgSsstoreReadRows;
                return this;
            }

            /**
             * <p>Average number of threads used of the SQL during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder avgUsedWorkerCount(Double avgUsedWorkerCount) {
                this.avgUsedWorkerCount = avgUsedWorkerCount;
                return this;
            }

            /**
             * <p>Average UserIO event wait time (in milliseconds) during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder avgUserIoWaitTime(Double avgUserIoWaitTime) {
                this.avgUserIoWaitTime = avgUserIoWaitTime;
                return this;
            }

            /**
             * <p>Average number of waits during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder avgWaitCount(Double avgWaitCount) {
                this.avgWaitCount = avgWaitCount;
                return this;
            }

            /**
             * <p>Average wait time (in milliseconds) during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>1.42</p>
             */
            public Builder avgWaitTime(Double avgWaitTime) {
                this.avgWaitTime = avgWaitTime;
                return this;
            }

            /**
             * <p>Client IP.</p>
             * 
             * <strong>example:</strong>
             * <p>1<em>2.</em><strong>.1<em>3.</em></strong></p>
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test_db</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>Distributed plan percentage during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>100.0</p>
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
             * <p>Average execution count per second during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.31</p>
             */
            public Builder execPs(Double execPs) {
                this.execPs = execPs;
                return this;
            }

            /**
             * <p>Total number of executions during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder executions(Double executions) {
                this.executions = executions;
                return this;
            }

            /**
             * <p>Average number of partition accessed during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failCount(Double failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * <p>Error percentage during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder failPercentage(Double failPercentage) {
                this.failPercentage = failPercentage;
                return this;
            }

            /**
             * <p>Whether an internal SQL.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder inner(Boolean inner) {
                this.inner = inner;
                return this;
            }

            /**
             * <p>Local plan percentage during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder localPlanPercentage(Double localPlanPercentage) {
                this.localPlanPercentage = localPlanPercentage;
                return this;
            }

            /**
             * <p>Max affected rows during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>10000.0</p>
             */
            public Builder maxAffectedRows(Double maxAffectedRows) {
                this.maxAffectedRows = maxAffectedRows;
                return this;
            }

            /**
             * <p>Max Application event wait time (in milliseconds) during the execution period</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder maxApplicationWaitTime(Double maxApplicationWaitTime) {
                this.maxApplicationWaitTime = maxApplicationWaitTime;
                return this;
            }

            /**
             * <p>Max Concurrency event wait time (in milliseconds) during the execution period</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder maxConcurrencyWaitTime(Double maxConcurrencyWaitTime) {
                this.maxConcurrencyWaitTime = maxConcurrencyWaitTime;
                return this;
            }

            /**
             * <p>Max CPU time.</p>
             * 
             * <strong>example:</strong>
             * <p>257.967</p>
             */
            public Builder maxCpuTime(Double maxCpuTime) {
                this.maxCpuTime = maxCpuTime;
                return this;
            }

            /**
             * <p>Max physical read count during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder maxDiskReads(Double maxDiskReads) {
                this.maxDiskReads = maxDiskReads;
                return this;
            }

            /**
             * <p>Max response time during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>260.044</p>
             */
            public Builder maxElapsedTime(Double maxElapsedTime) {
                this.maxElapsedTime = maxElapsedTime;
                return this;
            }

            /**
             * <p>Max returned rows during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder maxReturnRows(Double maxReturnRows) {
                this.maxReturnRows = maxReturnRows;
                return this;
            }

            /**
             * <p>Max UserIO event wait time (in milliseconds) during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder maxUserIoWaitTime(Double maxUserIoWaitTime) {
                this.maxUserIoWaitTime = maxUserIoWaitTime;
                return this;
            }

            /**
             * <p>Max wait time (in milliseconds) during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>3.4</p>
             */
            public Builder maxWaitTime(Double maxWaitTime) {
                this.maxWaitTime = maxWaitTime;
                return this;
            }

            /**
             * <p>Plan hit rage during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder missPlanPercentage(Double missPlanPercentage) {
                this.missPlanPercentage = missPlanPercentage;
                return this;
            }

            /**
             * <p>Missed hit count of the execution plan during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder missPlans(Double missPlans) {
                this.missPlans = missPlans;
                return this;
            }

            /**
             * <p>Remote plan percentage during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder remotePlanPercentage(Double remotePlanPercentage) {
                this.remotePlanPercentage = remotePlanPercentage;
                return this;
            }

            /**
             * <p>Remote execution count during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder remotePlans(Double remotePlans) {
                this.remotePlans = remotePlans;
                return this;
            }

            /**
             * <p>Number of occurrences of code 4012 during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder retCode4012Count(Long retCode4012Count) {
                this.retCode4012Count = retCode4012Count;
                return this;
            }

            /**
             * <p>Number of occurrences of code 4013 during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder retCode4013Count(Long retCode4013Count) {
                this.retCode4013Count = retCode4013Count;
                return this;
            }

            /**
             * <p>Number of occurrences of code 5001 during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder retCode5001Count(Double retCode5001Count) {
                this.retCode5001Count = retCode5001Count;
                return this;
            }

            /**
             * <p>Number of occurrences of code 5024 during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder retCode5024Count(Double retCode5024Count) {
                this.retCode5024Count = retCode5024Count;
                return this;
            }

            /**
             * <p>Number of occurrences of code 5167 during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder retCode5167Count(Double retCode5167Count) {
                this.retCode5167Count = retCode5167Count;
                return this;
            }

            /**
             * <p>Number of occurrences of code 5217 during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder retCode5217Count(Double retCode5217Count) {
                this.retCode5217Count = retCode5217Count;
                return this;
            }

            /**
             * <p>Number of occurrences of code 6002 during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder retCode6002Count(Double retCode6002Count) {
                this.retCode6002Count = retCode6002Count;
                return this;
            }

            /**
             * <p>Total number of retries during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder retryCount(Double retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * <p>RPC count during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rpcCount(Double rpcCount) {
                this.rpcCount = rpcCount;
                return this;
            }

            /**
             * <p>The server where the SQL is executed.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1db1a<strong>s038</strong>mej**</p>
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * <p>The IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1db1a<strong>s038</strong>mej**</p>
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * <p>The server port where the SQL is executed.</p>
             * 
             * <strong>example:</strong>
             * <p>10110</p>
             */
            public Builder serverPort(Long serverPort) {
                this.serverPort = serverPort;
                return this;
            }

            /**
             * <p>SQL ID.</p>
             * 
             * <strong>example:</strong>
             * <p>8D6E84<strong><strong>0B8FB1823D199E2CA1</strong></strong></p>
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * SqlList.
             */
            public Builder sqlList(java.util.List<SqlList> sqlList) {
                this.sqlList = sqlList;
                return this;
            }

            /**
             * <p>SQL text (the first 100 characters).</p>
             * 
             * <strong>example:</strong>
             * <p>select a from b where</p>
             */
            public Builder sqlTextShort(String sqlTextShort) {
                this.sqlTextShort = sqlTextShort;
                return this;
            }

            /**
             * <p>SQL type.</p>
             * 
             * <strong>example:</strong>
             * <p>select</p>
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * <p>Strong consistent transaction percentage during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>100.0</p>
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
             * <p>Total response time (in milliseconds) during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>11452126.36</p>
             */
            public Builder sumElapsedTime(Double sumElapsedTime) {
                this.sumElapsedTime = sumElapsedTime;
                return this;
            }

            /**
             * <p>Total logical reads of the SQL during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder sumLogicalReads(Double sumLogicalReads) {
                this.sumLogicalReads = sumLogicalReads;
                return this;
            }

            /**
             * <p>The total wait time (in milliseconds) during the internal waiting period.</p>
             * 
             * <strong>example:</strong>
             * <p>9421.73</p>
             */
            public Builder sumWaitTime(Double sumWaitTime) {
                this.sumWaitTime = sumWaitTime;
                return this;
            }

            /**
             * <p>Table scan percentage during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder tableScanPercentage(Double tableScanPercentage) {
                this.tableScanPercentage = tableScanPercentage;
                return this;
            }

            /**
             * <p>Total wait time during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>10.966</p>
             */
            public Builder totalWaitTime(Double totalWaitTime) {
                this.totalWaitTime = totalWaitTime;
                return this;
            }

            /**
             * <p>Username.</p>
             * 
             * <strong>example:</strong>
             * <p>test_user</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>Longest wait event during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder waitEvent(String waitEvent) {
                this.waitEvent = waitEvent;
                return this;
            }

            /**
             * <p>Eventually consistent transaction percentage during the execution period.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
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
