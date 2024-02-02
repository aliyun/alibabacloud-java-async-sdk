// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOasSQLHistoryListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOasSQLHistoryListResponseBody</p>
 */
public class DescribeOasSQLHistoryListResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeOasSQLHistoryListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOasSQLHistoryListResponseBody create() {
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
         * The list of SQL execution history.
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

        public DescribeOasSQLHistoryListResponseBody build() {
            return new DescribeOasSQLHistoryListResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AvgAffectedRows")
        private Long avgAffectedRows;

        @NameInMap("AvgApplicationWaitTime")
        private Double avgApplicationWaitTime;

        @NameInMap("AvgBlockCacheHit")
        private Long avgBlockCacheHit;

        @NameInMap("AvgBlockIndexCacheHit")
        private Long avgBlockIndexCacheHit;

        @NameInMap("AvgBloomFilterCacheHit")
        private Long avgBloomFilterCacheHit;

        @NameInMap("AvgConcurrencyWaitTime")
        private Double avgConcurrencyWaitTime;

        @NameInMap("AvgCpuTime")
        private Double avgCpuTime;

        @NameInMap("AvgDbTime")
        private Double avgDbTime;

        @NameInMap("AvgDecodeTime")
        private Double avgDecodeTime;

        @NameInMap("AvgDiskReads")
        private Long avgDiskReads;

        @NameInMap("AvgElapsedTime")
        private Double avgElapsedTime;

        @NameInMap("AvgExecuteTime")
        private Double avgExecuteTime;

        @NameInMap("AvgExecutorRpcCount")
        private Double avgExecutorRpcCount;

        @NameInMap("AvgExpectedWorkerCount")
        private Double avgExpectedWorkerCount;

        @NameInMap("AvgGetPlanTime")
        private Double avgGetPlanTime;

        @NameInMap("AvgLogicalReads")
        private Long avgLogicalReads;

        @NameInMap("AvgMemstoreReadRows")
        private Long avgMemstoreReadRows;

        @NameInMap("AvgNetTime")
        private Double avgNetTime;

        @NameInMap("AvgNetWaitTime")
        private Double avgNetWaitTime;

        @NameInMap("AvgPartitionCount")
        private Double avgPartitionCount;

        @NameInMap("AvgQueueTime")
        private Double avgQueueTime;

        @NameInMap("AvgReturnRows")
        private Long avgReturnRows;

        @NameInMap("AvgRowCacheHit")
        private Long avgRowCacheHit;

        @NameInMap("AvgRpcCount")
        private Long avgRpcCount;

        @NameInMap("AvgScheduleTime")
        private Double avgScheduleTime;

        @NameInMap("AvgSsstoreReadRows")
        private Long avgSsstoreReadRows;

        @NameInMap("AvgUsedWorkerCount")
        private Double avgUsedWorkerCount;

        @NameInMap("AvgUserIoWaitTime")
        private Double avgUserIoWaitTime;

        @NameInMap("AvgWaitCount")
        private Double avgWaitCount;

        @NameInMap("AvgWaitTime")
        private Double avgWaitTime;

        @NameInMap("DbName")
        private String dbName;

        @NameInMap("DistPlanPercentage")
        private Double distPlanPercentage;

        @NameInMap("ExecPs")
        private Double execPs;

        @NameInMap("Executions")
        private Long executions;

        @NameInMap("FailCount")
        private Long failCount;

        @NameInMap("FailPercentage")
        private Double failPercentage;

        @NameInMap("LocalPlanPercentage")
        private Double localPlanPercentage;

        @NameInMap("MaxAffectedRows")
        private Double maxAffectedRows;

        @NameInMap("MaxApplicationWaitTime")
        private Double maxApplicationWaitTime;

        @NameInMap("MaxConcurrencyWaitTime")
        private Double maxConcurrencyWaitTime;

        @NameInMap("MaxCpuTime")
        private Double maxCpuTime;

        @NameInMap("MaxDiskReads")
        private Double maxDiskReads;

        @NameInMap("MaxElapsedTime")
        private Double maxElapsedTime;

        @NameInMap("MaxReturnRows")
        private Double maxReturnRows;

        @NameInMap("MaxUserIoWaitTime")
        private Double maxUserIoWaitTime;

        @NameInMap("MaxWaitTime")
        private Double maxWaitTime;

        @NameInMap("MissPlanPercentage")
        private Double missPlanPercentage;

        @NameInMap("MissPlans")
        private Long missPlans;

        @NameInMap("RemotePlanPercentage")
        private Double remotePlanPercentage;

        @NameInMap("RemotePlans")
        private Long remotePlans;

        @NameInMap("RetCode4012Count")
        private Double retCode4012Count;

        @NameInMap("RetCode4013Count")
        private Double retCode4013Count;

        @NameInMap("RetCode5001Count")
        private Double retCode5001Count;

        @NameInMap("RetCode5024Count")
        private Double retCode5024Count;

        @NameInMap("RetCode5167Count")
        private Double retCode5167Count;

        @NameInMap("RetCode5217Count")
        private Double retCode5217Count;

        @NameInMap("RetCode6002Count")
        private Double retCode6002Count;

        @NameInMap("RetryCount")
        private Long retryCount;

        @NameInMap("SQLId")
        private String SQLId;

        @NameInMap("Server")
        private String server;

        @NameInMap("StrongConsistencyPercentage")
        private Double strongConsistencyPercentage;

        @NameInMap("SumDbTime")
        private Double sumDbTime;

        @NameInMap("SumElapsedTime")
        private Double sumElapsedTime;

        @NameInMap("SumLogicalReads")
        private Double sumLogicalReads;

        @NameInMap("SumWaitTime")
        private Double sumWaitTime;

        @NameInMap("TableScanPercentage")
        private Double tableScanPercentage;

        @NameInMap("Timestamp")
        private String timestamp;

        @NameInMap("UserName")
        private String userName;

        @NameInMap("WeakConsistencyPercentage")
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
            this.dbName = builder.dbName;
            this.distPlanPercentage = builder.distPlanPercentage;
            this.execPs = builder.execPs;
            this.executions = builder.executions;
            this.failCount = builder.failCount;
            this.failPercentage = builder.failPercentage;
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
            this.SQLId = builder.SQLId;
            this.server = builder.server;
            this.strongConsistencyPercentage = builder.strongConsistencyPercentage;
            this.sumDbTime = builder.sumDbTime;
            this.sumElapsedTime = builder.sumElapsedTime;
            this.sumLogicalReads = builder.sumLogicalReads;
            this.sumWaitTime = builder.sumWaitTime;
            this.tableScanPercentage = builder.tableScanPercentage;
            this.timestamp = builder.timestamp;
            this.userName = builder.userName;
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
        public Long getAvgAffectedRows() {
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
        public Long getAvgBlockCacheHit() {
            return this.avgBlockCacheHit;
        }

        /**
         * @return avgBlockIndexCacheHit
         */
        public Long getAvgBlockIndexCacheHit() {
            return this.avgBlockIndexCacheHit;
        }

        /**
         * @return avgBloomFilterCacheHit
         */
        public Long getAvgBloomFilterCacheHit() {
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
        public Long getAvgDiskReads() {
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
        public Long getAvgLogicalReads() {
            return this.avgLogicalReads;
        }

        /**
         * @return avgMemstoreReadRows
         */
        public Long getAvgMemstoreReadRows() {
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
        public Long getAvgReturnRows() {
            return this.avgReturnRows;
        }

        /**
         * @return avgRowCacheHit
         */
        public Long getAvgRowCacheHit() {
            return this.avgRowCacheHit;
        }

        /**
         * @return avgRpcCount
         */
        public Long getAvgRpcCount() {
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
        public Long getAvgSsstoreReadRows() {
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
        public Long getExecutions() {
            return this.executions;
        }

        /**
         * @return failCount
         */
        public Long getFailCount() {
            return this.failCount;
        }

        /**
         * @return failPercentage
         */
        public Double getFailPercentage() {
            return this.failPercentage;
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
        public Long getMissPlans() {
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
        public Long getRemotePlans() {
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
        public Long getRetryCount() {
            return this.retryCount;
        }

        /**
         * @return SQLId
         */
        public String getSQLId() {
            return this.SQLId;
        }

        /**
         * @return server
         */
        public String getServer() {
            return this.server;
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
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return weakConsistencyPercentage
         */
        public Double getWeakConsistencyPercentage() {
            return this.weakConsistencyPercentage;
        }

        public static final class Builder {
            private Long avgAffectedRows; 
            private Double avgApplicationWaitTime; 
            private Long avgBlockCacheHit; 
            private Long avgBlockIndexCacheHit; 
            private Long avgBloomFilterCacheHit; 
            private Double avgConcurrencyWaitTime; 
            private Double avgCpuTime; 
            private Double avgDbTime; 
            private Double avgDecodeTime; 
            private Long avgDiskReads; 
            private Double avgElapsedTime; 
            private Double avgExecuteTime; 
            private Double avgExecutorRpcCount; 
            private Double avgExpectedWorkerCount; 
            private Double avgGetPlanTime; 
            private Long avgLogicalReads; 
            private Long avgMemstoreReadRows; 
            private Double avgNetTime; 
            private Double avgNetWaitTime; 
            private Double avgPartitionCount; 
            private Double avgQueueTime; 
            private Long avgReturnRows; 
            private Long avgRowCacheHit; 
            private Long avgRpcCount; 
            private Double avgScheduleTime; 
            private Long avgSsstoreReadRows; 
            private Double avgUsedWorkerCount; 
            private Double avgUserIoWaitTime; 
            private Double avgWaitCount; 
            private Double avgWaitTime; 
            private String dbName; 
            private Double distPlanPercentage; 
            private Double execPs; 
            private Long executions; 
            private Long failCount; 
            private Double failPercentage; 
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
            private Long missPlans; 
            private Double remotePlanPercentage; 
            private Long remotePlans; 
            private Double retCode4012Count; 
            private Double retCode4013Count; 
            private Double retCode5001Count; 
            private Double retCode5024Count; 
            private Double retCode5167Count; 
            private Double retCode5217Count; 
            private Double retCode6002Count; 
            private Long retryCount; 
            private String SQLId; 
            private String server; 
            private Double strongConsistencyPercentage; 
            private Double sumDbTime; 
            private Double sumElapsedTime; 
            private Double sumLogicalReads; 
            private Double sumWaitTime; 
            private Double tableScanPercentage; 
            private String timestamp; 
            private String userName; 
            private Double weakConsistencyPercentage; 

            /**
             * Average updated rows during the execution period.
             */
            public Builder avgAffectedRows(Long avgAffectedRows) {
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
            public Builder avgBlockCacheHit(Long avgBlockCacheHit) {
                this.avgBlockCacheHit = avgBlockCacheHit;
                return this;
            }

            /**
             * Average BlockIndexCache hit count during the execution period.
             */
            public Builder avgBlockIndexCacheHit(Long avgBlockIndexCacheHit) {
                this.avgBlockIndexCacheHit = avgBlockIndexCacheHit;
                return this;
            }

            /**
             * Average BloomFilterCache hit count during the execution period.
             */
            public Builder avgBloomFilterCacheHit(Long avgBloomFilterCacheHit) {
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
            public Builder avgDiskReads(Long avgDiskReads) {
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
             * Average logical reads during the execution period.
             */
            public Builder avgLogicalReads(Long avgLogicalReads) {
                this.avgLogicalReads = avgLogicalReads;
                return this;
            }

            /**
             * Average Memstore read rows during the execution period.
             */
            public Builder avgMemstoreReadRows(Long avgMemstoreReadRows) {
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
            public Builder avgReturnRows(Long avgReturnRows) {
                this.avgReturnRows = avgReturnRows;
                return this;
            }

            /**
             * Average RowCache hit count during the execution period.
             */
            public Builder avgRowCacheHit(Long avgRowCacheHit) {
                this.avgRowCacheHit = avgRowCacheHit;
                return this;
            }

            /**
             * Average number of RPC sent during the execution.
             */
            public Builder avgRpcCount(Long avgRpcCount) {
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
             * Average Ssstore read rows during the execution period.
             */
            public Builder avgSsstoreReadRows(Long avgSsstoreReadRows) {
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
             * Average execution count per second during the execution period.
             */
            public Builder execPs(Double execPs) {
                this.execPs = execPs;
                return this;
            }

            /**
             * Total number of executions during the execution period.
             */
            public Builder executions(Long executions) {
                this.executions = executions;
                return this;
            }

            /**
             * The total number of errors during the execution period.
             */
            public Builder failCount(Long failCount) {
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
             * Local plan percentage during the execution period.
             */
            public Builder localPlanPercentage(Double localPlanPercentage) {
                this.localPlanPercentage = localPlanPercentage;
                return this;
            }

            /**
             * Max updated rows during the execution period.
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
             * Max response time.
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
             * Max UserIO event wait time (in milliseconds) during the execution period
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
             * Missed plan count.
             */
            public Builder missPlans(Long missPlans) {
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
             * Remote plan count.
             */
            public Builder remotePlans(Long remotePlans) {
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
            public Builder retryCount(Long retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * SQL ID.
             */
            public Builder SQLId(String SQLId) {
                this.SQLId = SQLId;
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
             * Total logical reads.
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
             * Timestamp for the sample.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
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
