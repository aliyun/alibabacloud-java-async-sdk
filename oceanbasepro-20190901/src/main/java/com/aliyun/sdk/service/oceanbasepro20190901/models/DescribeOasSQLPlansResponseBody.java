// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOasSQLPlansResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOasSQLPlansResponseBody</p>
 */
public class DescribeOasSQLPlansResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeOasSQLPlansResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOasSQLPlansResponseBody create() {
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
         * The list of SQL execution plan.
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

        public DescribeOasSQLPlansResponseBody build() {
            return new DescribeOasSQLPlansResponseBody(this);
        } 

    } 

    public static class PlanExplain extends TeaModel {
        @NameInMap("PlanJsonString")
        private String planJsonString;

        private PlanExplain(Builder builder) {
            this.planJsonString = builder.planJsonString;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlanExplain create() {
            return builder().build();
        }

        /**
         * @return planJsonString
         */
        public String getPlanJsonString() {
            return this.planJsonString;
        }

        public static final class Builder {
            private String planJsonString; 

            /**
             * JSON string of the SQL execution plan.
             */
            public Builder planJsonString(String planJsonString) {
                this.planJsonString = planJsonString;
                return this;
            }

            public PlanExplain build() {
                return new PlanExplain(this);
            } 

        } 

    }
    public static class Plans extends TeaModel {
        @NameInMap("AvgApplicationWaitTime")
        private Double avgApplicationWaitTime;

        @NameInMap("AvgBufferGets")
        private Double avgBufferGets;

        @NameInMap("AvgConcurrencyWaitTime")
        private Double avgConcurrencyWaitTime;

        @NameInMap("AvgCpuTime")
        private Double avgCpuTime;

        @NameInMap("AvgDiskReads")
        private Double avgDiskReads;

        @NameInMap("AvgDiskWrites")
        private Double avgDiskWrites;

        @NameInMap("AvgElapsedTime")
        private Double avgElapsedTime;

        @NameInMap("AvgRowProcessed")
        private Double avgRowProcessed;

        @NameInMap("AvgUserIoWaitTime")
        private Double avgUserIoWaitTime;

        @NameInMap("CollectTimeUs")
        private Long collectTimeUs;

        @NameInMap("DelayedLargeQueryPercentage")
        private Double delayedLargeQueryPercentage;

        @NameInMap("ExecPs")
        private Double execPs;

        @NameInMap("Executions")
        private Long executions;

        @NameInMap("FirstLoadTime")
        private String firstLoadTime;

        @NameInMap("FirstLoadTimeUs")
        private Long firstLoadTimeUs;

        @NameInMap("HitDiagnosis")
        private Boolean hitDiagnosis;

        @NameInMap("HitPercentage")
        private Double hitPercentage;

        @NameInMap("LargeQueryPercentage")
        private Double largeQueryPercentage;

        @NameInMap("MergedVersion")
        private Long mergedVersion;

        @NameInMap("ObDbId")
        private Long obDbId;

        @NameInMap("ObServerId")
        private Long obServerId;

        @NameInMap("OutlineData")
        private String outlineData;

        @NameInMap("OutlineId")
        private Long outlineId;

        @NameInMap("PlanHash")
        private String planHash;

        @NameInMap("PlanId")
        private Long planId;

        @NameInMap("PlanSize")
        private Long planSize;

        @NameInMap("PlanType")
        private String planType;

        @NameInMap("PlanUnionHash")
        private String planUnionHash;

        @NameInMap("SchemaVersion")
        private Long schemaVersion;

        @NameInMap("Server")
        private String server;

        @NameInMap("ServerId")
        private Long serverId;

        @NameInMap("SqlId")
        private String sqlId;

        @NameInMap("TableScan")
        private Boolean tableScan;

        @NameInMap("TimeoutPercentage")
        private Double timeoutPercentage;

        @NameInMap("Uid")
        private String uid;

        private Plans(Builder builder) {
            this.avgApplicationWaitTime = builder.avgApplicationWaitTime;
            this.avgBufferGets = builder.avgBufferGets;
            this.avgConcurrencyWaitTime = builder.avgConcurrencyWaitTime;
            this.avgCpuTime = builder.avgCpuTime;
            this.avgDiskReads = builder.avgDiskReads;
            this.avgDiskWrites = builder.avgDiskWrites;
            this.avgElapsedTime = builder.avgElapsedTime;
            this.avgRowProcessed = builder.avgRowProcessed;
            this.avgUserIoWaitTime = builder.avgUserIoWaitTime;
            this.collectTimeUs = builder.collectTimeUs;
            this.delayedLargeQueryPercentage = builder.delayedLargeQueryPercentage;
            this.execPs = builder.execPs;
            this.executions = builder.executions;
            this.firstLoadTime = builder.firstLoadTime;
            this.firstLoadTimeUs = builder.firstLoadTimeUs;
            this.hitDiagnosis = builder.hitDiagnosis;
            this.hitPercentage = builder.hitPercentage;
            this.largeQueryPercentage = builder.largeQueryPercentage;
            this.mergedVersion = builder.mergedVersion;
            this.obDbId = builder.obDbId;
            this.obServerId = builder.obServerId;
            this.outlineData = builder.outlineData;
            this.outlineId = builder.outlineId;
            this.planHash = builder.planHash;
            this.planId = builder.planId;
            this.planSize = builder.planSize;
            this.planType = builder.planType;
            this.planUnionHash = builder.planUnionHash;
            this.schemaVersion = builder.schemaVersion;
            this.server = builder.server;
            this.serverId = builder.serverId;
            this.sqlId = builder.sqlId;
            this.tableScan = builder.tableScan;
            this.timeoutPercentage = builder.timeoutPercentage;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Plans create() {
            return builder().build();
        }

        /**
         * @return avgApplicationWaitTime
         */
        public Double getAvgApplicationWaitTime() {
            return this.avgApplicationWaitTime;
        }

        /**
         * @return avgBufferGets
         */
        public Double getAvgBufferGets() {
            return this.avgBufferGets;
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
         * @return avgDiskReads
         */
        public Double getAvgDiskReads() {
            return this.avgDiskReads;
        }

        /**
         * @return avgDiskWrites
         */
        public Double getAvgDiskWrites() {
            return this.avgDiskWrites;
        }

        /**
         * @return avgElapsedTime
         */
        public Double getAvgElapsedTime() {
            return this.avgElapsedTime;
        }

        /**
         * @return avgRowProcessed
         */
        public Double getAvgRowProcessed() {
            return this.avgRowProcessed;
        }

        /**
         * @return avgUserIoWaitTime
         */
        public Double getAvgUserIoWaitTime() {
            return this.avgUserIoWaitTime;
        }

        /**
         * @return collectTimeUs
         */
        public Long getCollectTimeUs() {
            return this.collectTimeUs;
        }

        /**
         * @return delayedLargeQueryPercentage
         */
        public Double getDelayedLargeQueryPercentage() {
            return this.delayedLargeQueryPercentage;
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
         * @return firstLoadTime
         */
        public String getFirstLoadTime() {
            return this.firstLoadTime;
        }

        /**
         * @return firstLoadTimeUs
         */
        public Long getFirstLoadTimeUs() {
            return this.firstLoadTimeUs;
        }

        /**
         * @return hitDiagnosis
         */
        public Boolean getHitDiagnosis() {
            return this.hitDiagnosis;
        }

        /**
         * @return hitPercentage
         */
        public Double getHitPercentage() {
            return this.hitPercentage;
        }

        /**
         * @return largeQueryPercentage
         */
        public Double getLargeQueryPercentage() {
            return this.largeQueryPercentage;
        }

        /**
         * @return mergedVersion
         */
        public Long getMergedVersion() {
            return this.mergedVersion;
        }

        /**
         * @return obDbId
         */
        public Long getObDbId() {
            return this.obDbId;
        }

        /**
         * @return obServerId
         */
        public Long getObServerId() {
            return this.obServerId;
        }

        /**
         * @return outlineData
         */
        public String getOutlineData() {
            return this.outlineData;
        }

        /**
         * @return outlineId
         */
        public Long getOutlineId() {
            return this.outlineId;
        }

        /**
         * @return planHash
         */
        public String getPlanHash() {
            return this.planHash;
        }

        /**
         * @return planId
         */
        public Long getPlanId() {
            return this.planId;
        }

        /**
         * @return planSize
         */
        public Long getPlanSize() {
            return this.planSize;
        }

        /**
         * @return planType
         */
        public String getPlanType() {
            return this.planType;
        }

        /**
         * @return planUnionHash
         */
        public String getPlanUnionHash() {
            return this.planUnionHash;
        }

        /**
         * @return schemaVersion
         */
        public Long getSchemaVersion() {
            return this.schemaVersion;
        }

        /**
         * @return server
         */
        public String getServer() {
            return this.server;
        }

        /**
         * @return serverId
         */
        public Long getServerId() {
            return this.serverId;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return tableScan
         */
        public Boolean getTableScan() {
            return this.tableScan;
        }

        /**
         * @return timeoutPercentage
         */
        public Double getTimeoutPercentage() {
            return this.timeoutPercentage;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private Double avgApplicationWaitTime; 
            private Double avgBufferGets; 
            private Double avgConcurrencyWaitTime; 
            private Double avgCpuTime; 
            private Double avgDiskReads; 
            private Double avgDiskWrites; 
            private Double avgElapsedTime; 
            private Double avgRowProcessed; 
            private Double avgUserIoWaitTime; 
            private Long collectTimeUs; 
            private Double delayedLargeQueryPercentage; 
            private Double execPs; 
            private Long executions; 
            private String firstLoadTime; 
            private Long firstLoadTimeUs; 
            private Boolean hitDiagnosis; 
            private Double hitPercentage; 
            private Double largeQueryPercentage; 
            private Long mergedVersion; 
            private Long obDbId; 
            private Long obServerId; 
            private String outlineData; 
            private Long outlineId; 
            private String planHash; 
            private Long planId; 
            private Long planSize; 
            private String planType; 
            private String planUnionHash; 
            private Long schemaVersion; 
            private String server; 
            private Long serverId; 
            private String sqlId; 
            private Boolean tableScan; 
            private Double timeoutPercentage; 
            private String uid; 

            /**
             * Average Application event waiting time (in milliseconds) during the execution period.
             */
            public Builder avgApplicationWaitTime(Double avgApplicationWaitTime) {
                this.avgApplicationWaitTime = avgApplicationWaitTime;
                return this;
            }

            /**
             * Average cache read count during the execution period.
             */
            public Builder avgBufferGets(Double avgBufferGets) {
                this.avgBufferGets = avgBufferGets;
                return this;
            }

            /**
             * Average Concurrency event waiting time (in milliseconds) during the execution period.
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
             * The average physical read count during the execution period.
             */
            public Builder avgDiskReads(Double avgDiskReads) {
                this.avgDiskReads = avgDiskReads;
                return this;
            }

            /**
             * The average physical write count during the execution period.
             */
            public Builder avgDiskWrites(Double avgDiskWrites) {
                this.avgDiskWrites = avgDiskWrites;
                return this;
            }

            /**
             * Average interval waiting time (in milliseconds) during the execution period.
             */
            public Builder avgElapsedTime(Double avgElapsedTime) {
                this.avgElapsedTime = avgElapsedTime;
                return this;
            }

            /**
             * Average row processing waiting time (in milliseconds) during the execution period.
             */
            public Builder avgRowProcessed(Double avgRowProcessed) {
                this.avgRowProcessed = avgRowProcessed;
                return this;
            }

            /**
             * Average UserIo event waiting time (in milliseconds) during the execution period.
             */
            public Builder avgUserIoWaitTime(Double avgUserIoWaitTime) {
                this.avgUserIoWaitTime = avgUserIoWaitTime;
                return this;
            }

            /**
             * Collection time.
             */
            public Builder collectTimeUs(Long collectTimeUs) {
                this.collectTimeUs = collectTimeUs;
                return this;
            }

            /**
             * Percentage of delayed long-running queries.
             */
            public Builder delayedLargeQueryPercentage(Double delayedLargeQueryPercentage) {
                this.delayedLargeQueryPercentage = delayedLargeQueryPercentage;
                return this;
            }

            /**
             * The average execution count per second during the execution period.
             */
            public Builder execPs(Double execPs) {
                this.execPs = execPs;
                return this;
            }

            /**
             * The total number of executions during the execution period.
             */
            public Builder executions(Long executions) {
                this.executions = executions;
                return this;
            }

            /**
             * First time to load the plan.
             */
            public Builder firstLoadTime(String firstLoadTime) {
                this.firstLoadTime = firstLoadTime;
                return this;
            }

            /**
             * First loading time.
             */
            public Builder firstLoadTimeUs(Long firstLoadTimeUs) {
                this.firstLoadTimeUs = firstLoadTimeUs;
                return this;
            }

            /**
             * Whether to hit the diagnosis.
             */
            public Builder hitDiagnosis(Boolean hitDiagnosis) {
                this.hitDiagnosis = hitDiagnosis;
                return this;
            }

            /**
             * Hit rate.
             */
            public Builder hitPercentage(Double hitPercentage) {
                this.hitPercentage = hitPercentage;
                return this;
            }

            /**
             * Percentage of completed long-running queries.
             */
            public Builder largeQueryPercentage(Double largeQueryPercentage) {
                this.largeQueryPercentage = largeQueryPercentage;
                return this;
            }

            /**
             * Merge version.
             */
            public Builder mergedVersion(Long mergedVersion) {
                this.mergedVersion = mergedVersion;
                return this;
            }

            /**
             * Database ID.
             */
            public Builder obDbId(Long obDbId) {
                this.obDbId = obDbId;
                return this;
            }

            /**
             * Server ID.
             */
            public Builder obServerId(Long obServerId) {
                this.obServerId = obServerId;
                return this;
            }

            /**
             * The outline_data parameter of the SQL execution plan.
             */
            public Builder outlineData(String outlineData) {
                this.outlineData = outlineData;
                return this;
            }

            /**
             * Outline ID.
             */
            public Builder outlineId(Long outlineId) {
                this.outlineId = outlineId;
                return this;
            }

            /**
             * The internal identifier of the SQL execution plan in the diagnostic system.
             */
            public Builder planHash(String planHash) {
                this.planHash = planHash;
                return this;
            }

            /**
             * The ID of the plan.
             */
            public Builder planId(Long planId) {
                this.planId = planId;
                return this;
            }

            /**
             * Plan size.
             */
            public Builder planSize(Long planSize) {
                this.planSize = planSize;
                return this;
            }

            /**
             * Plan type, including LOCAL, REMOTE, DIST.
             */
            public Builder planType(String planType) {
                this.planType = planType;
                return this;
            }

            /**
             * The internal unique identifier of the SQL execution plan in the diagnostic system.
             */
            public Builder planUnionHash(String planUnionHash) {
                this.planUnionHash = planUnionHash;
                return this;
            }

            /**
             * Schema version.
             */
            public Builder schemaVersion(Long schemaVersion) {
                this.schemaVersion = schemaVersion;
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
             * The ID of the backend server instance.
             */
            public Builder serverId(Long serverId) {
                this.serverId = serverId;
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
             * Whether a full table scan is performed.
             */
            public Builder tableScan(Boolean tableScan) {
                this.tableScan = tableScan;
                return this;
            }

            /**
             * Percentage of timeouts.
             */
            public Builder timeoutPercentage(Double timeoutPercentage) {
                this.timeoutPercentage = timeoutPercentage;
                return this;
            }

            /**
             * The unique identifier of the plan.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public Plans build() {
                return new Plans(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AvgCpuTime")
        private Double avgCpuTime;

        @NameInMap("Bounded")
        private Boolean bounded;

        @NameInMap("Executions")
        private Long executions;

        @NameInMap("FirstLoadTime")
        private String firstLoadTime;

        @NameInMap("HitDiagnosis")
        private Boolean hitDiagnosis;

        @NameInMap("HitPercentage")
        private Double hitPercentage;

        @NameInMap("MergedVersion")
        private Long mergedVersion;

        @NameInMap("PlanExplain")
        private PlanExplain planExplain;

        @NameInMap("PlanHash")
        private String planHash;

        @NameInMap("PlanType")
        private String planType;

        @NameInMap("PlanUnionHash")
        private String planUnionHash;

        @NameInMap("Plans")
        private java.util.List < Plans> plans;

        @NameInMap("QuerySql")
        private String querySql;

        private Data(Builder builder) {
            this.avgCpuTime = builder.avgCpuTime;
            this.bounded = builder.bounded;
            this.executions = builder.executions;
            this.firstLoadTime = builder.firstLoadTime;
            this.hitDiagnosis = builder.hitDiagnosis;
            this.hitPercentage = builder.hitPercentage;
            this.mergedVersion = builder.mergedVersion;
            this.planExplain = builder.planExplain;
            this.planHash = builder.planHash;
            this.planType = builder.planType;
            this.planUnionHash = builder.planUnionHash;
            this.plans = builder.plans;
            this.querySql = builder.querySql;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return avgCpuTime
         */
        public Double getAvgCpuTime() {
            return this.avgCpuTime;
        }

        /**
         * @return bounded
         */
        public Boolean getBounded() {
            return this.bounded;
        }

        /**
         * @return executions
         */
        public Long getExecutions() {
            return this.executions;
        }

        /**
         * @return firstLoadTime
         */
        public String getFirstLoadTime() {
            return this.firstLoadTime;
        }

        /**
         * @return hitDiagnosis
         */
        public Boolean getHitDiagnosis() {
            return this.hitDiagnosis;
        }

        /**
         * @return hitPercentage
         */
        public Double getHitPercentage() {
            return this.hitPercentage;
        }

        /**
         * @return mergedVersion
         */
        public Long getMergedVersion() {
            return this.mergedVersion;
        }

        /**
         * @return planExplain
         */
        public PlanExplain getPlanExplain() {
            return this.planExplain;
        }

        /**
         * @return planHash
         */
        public String getPlanHash() {
            return this.planHash;
        }

        /**
         * @return planType
         */
        public String getPlanType() {
            return this.planType;
        }

        /**
         * @return planUnionHash
         */
        public String getPlanUnionHash() {
            return this.planUnionHash;
        }

        /**
         * @return plans
         */
        public java.util.List < Plans> getPlans() {
            return this.plans;
        }

        /**
         * @return querySql
         */
        public String getQuerySql() {
            return this.querySql;
        }

        public static final class Builder {
            private Double avgCpuTime; 
            private Boolean bounded; 
            private Long executions; 
            private String firstLoadTime; 
            private Boolean hitDiagnosis; 
            private Double hitPercentage; 
            private Long mergedVersion; 
            private PlanExplain planExplain; 
            private String planHash; 
            private String planType; 
            private String planUnionHash; 
            private java.util.List < Plans> plans; 
            private String querySql; 

            /**
             * Average CPU time (in milliseconds) during the execution period.
             */
            public Builder avgCpuTime(Double avgCpuTime) {
                this.avgCpuTime = avgCpuTime;
                return this;
            }

            /**
             * Whether to bind the execution plan.
             */
            public Builder bounded(Boolean bounded) {
                this.bounded = bounded;
                return this;
            }

            /**
             * Execution count.
             */
            public Builder executions(Long executions) {
                this.executions = executions;
                return this;
            }

            /**
             * First loading time.
             */
            public Builder firstLoadTime(String firstLoadTime) {
                this.firstLoadTime = firstLoadTime;
                return this;
            }

            /**
             * Whether to hit the diagnosis.
             */
            public Builder hitDiagnosis(Boolean hitDiagnosis) {
                this.hitDiagnosis = hitDiagnosis;
                return this;
            }

            /**
             * Hit rate.
             */
            public Builder hitPercentage(Double hitPercentage) {
                this.hitPercentage = hitPercentage;
                return this;
            }

            /**
             * Merge version.
             */
            public Builder mergedVersion(Long mergedVersion) {
                this.mergedVersion = mergedVersion;
                return this;
            }

            /**
             * Execution plan.
             */
            public Builder planExplain(PlanExplain planExplain) {
                this.planExplain = planExplain;
                return this;
            }

            /**
             * The internal identifier of the SQL execution plan in the diagnostic system.
             */
            public Builder planHash(String planHash) {
                this.planHash = planHash;
                return this;
            }

            /**
             * Execution plan type.
             */
            public Builder planType(String planType) {
                this.planType = planType;
                return this;
            }

            /**
             * The internal unique identifier of the SQL execution plan in the diagnostic system.
             */
            public Builder planUnionHash(String planUnionHash) {
                this.planUnionHash = planUnionHash;
                return this;
            }

            /**
             * The list of the execution plan.
             */
            public Builder plans(java.util.List < Plans> plans) {
                this.plans = plans;
                return this;
            }

            /**
             * The SQL for the query.
             */
            public Builder querySql(String querySql) {
                this.querySql = querySql;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
