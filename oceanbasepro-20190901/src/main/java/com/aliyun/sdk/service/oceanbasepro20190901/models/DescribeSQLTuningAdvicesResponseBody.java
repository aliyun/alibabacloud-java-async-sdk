// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLTuningAdvicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLTuningAdvicesResponseBody</p>
 */
public class DescribeSQLTuningAdvicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSQLTuningAdvicesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLTuningAdvicesResponseBody create() {
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
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSQLTuningAdvicesResponseBody build() {
            return new DescribeSQLTuningAdvicesResponseBody(this);
        } 

    } 

    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("MaxValue")
        private String maxValue;

        @com.aliyun.core.annotation.NameInMap("MinValue")
        private String minValue;

        @com.aliyun.core.annotation.NameInMap("Ndv")
        private Float ndv;

        private Columns(Builder builder) {
            this.columnName = builder.columnName;
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
            this.ndv = builder.ndv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return maxValue
         */
        public String getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public String getMinValue() {
            return this.minValue;
        }

        /**
         * @return ndv
         */
        public Float getNdv() {
            return this.ndv;
        }

        public static final class Builder {
            private String columnName; 
            private String maxValue; 
            private String minValue; 
            private Float ndv; 

            /**
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * MaxValue.
             */
            public Builder maxValue(String maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * MinValue.
             */
            public Builder minValue(String minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * NDV
             */
            public Builder ndv(Float ndv) {
                this.ndv = ndv;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    public static class Plan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgApplicationWaitTime")
        private Float avgApplicationWaitTime;

        @com.aliyun.core.annotation.NameInMap("AvgBufferGets")
        private Float avgBufferGets;

        @com.aliyun.core.annotation.NameInMap("AvgConcurrencyWaitTime")
        private Float avgConcurrencyWaitTime;

        @com.aliyun.core.annotation.NameInMap("AvgCpuTime")
        private Float avgCpuTime;

        @com.aliyun.core.annotation.NameInMap("AvgDiskReads")
        private Float avgDiskReads;

        @com.aliyun.core.annotation.NameInMap("AvgDiskWrites")
        private Float avgDiskWrites;

        @com.aliyun.core.annotation.NameInMap("AvgElapsedTime")
        private Float avgElapsedTime;

        @com.aliyun.core.annotation.NameInMap("AvgRowProcessed")
        private Float avgRowProcessed;

        @com.aliyun.core.annotation.NameInMap("AvgUserIoWaitTime")
        private Float avgUserIoWaitTime;

        @com.aliyun.core.annotation.NameInMap("CollectTimeUs")
        private Long collectTimeUs;

        @com.aliyun.core.annotation.NameInMap("DelayedLargeQueryPercentage")
        private Float delayedLargeQueryPercentage;

        @com.aliyun.core.annotation.NameInMap("ExecPs")
        private Float execPs;

        @com.aliyun.core.annotation.NameInMap("Executions")
        private Long executions;

        @com.aliyun.core.annotation.NameInMap("FirstLoadTime")
        private String firstLoadTime;

        @com.aliyun.core.annotation.NameInMap("FirstLoadTimeUs")
        private Long firstLoadTimeUs;

        @com.aliyun.core.annotation.NameInMap("HitDiagnosis")
        private Boolean hitDiagnosis;

        @com.aliyun.core.annotation.NameInMap("HitPercentage")
        private Float hitPercentage;

        @com.aliyun.core.annotation.NameInMap("LargeQueryPercentage")
        private Float largeQueryPercentage;

        @com.aliyun.core.annotation.NameInMap("MergedVersion")
        private Long mergedVersion;

        @com.aliyun.core.annotation.NameInMap("ObDbId")
        private Long obDbId;

        @com.aliyun.core.annotation.NameInMap("ObServerId")
        private Long obServerId;

        @com.aliyun.core.annotation.NameInMap("OutlineData")
        private String outlineData;

        @com.aliyun.core.annotation.NameInMap("OutlineId")
        private Long outlineId;

        @com.aliyun.core.annotation.NameInMap("PlanHash")
        private String planHash;

        @com.aliyun.core.annotation.NameInMap("PlanId")
        private Long planId;

        @com.aliyun.core.annotation.NameInMap("PlanSize")
        private Long planSize;

        @com.aliyun.core.annotation.NameInMap("PlanType")
        private String planType;

        @com.aliyun.core.annotation.NameInMap("SchemaVersion")
        private Long schemaVersion;

        @com.aliyun.core.annotation.NameInMap("ServerSn")
        private String serverSn;

        @com.aliyun.core.annotation.NameInMap("TableScan")
        private Boolean tableScan;

        @com.aliyun.core.annotation.NameInMap("TimeoutPercentage")
        private Float timeoutPercentage;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        private Plan(Builder builder) {
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
            this.schemaVersion = builder.schemaVersion;
            this.serverSn = builder.serverSn;
            this.tableScan = builder.tableScan;
            this.timeoutPercentage = builder.timeoutPercentage;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Plan create() {
            return builder().build();
        }

        /**
         * @return avgApplicationWaitTime
         */
        public Float getAvgApplicationWaitTime() {
            return this.avgApplicationWaitTime;
        }

        /**
         * @return avgBufferGets
         */
        public Float getAvgBufferGets() {
            return this.avgBufferGets;
        }

        /**
         * @return avgConcurrencyWaitTime
         */
        public Float getAvgConcurrencyWaitTime() {
            return this.avgConcurrencyWaitTime;
        }

        /**
         * @return avgCpuTime
         */
        public Float getAvgCpuTime() {
            return this.avgCpuTime;
        }

        /**
         * @return avgDiskReads
         */
        public Float getAvgDiskReads() {
            return this.avgDiskReads;
        }

        /**
         * @return avgDiskWrites
         */
        public Float getAvgDiskWrites() {
            return this.avgDiskWrites;
        }

        /**
         * @return avgElapsedTime
         */
        public Float getAvgElapsedTime() {
            return this.avgElapsedTime;
        }

        /**
         * @return avgRowProcessed
         */
        public Float getAvgRowProcessed() {
            return this.avgRowProcessed;
        }

        /**
         * @return avgUserIoWaitTime
         */
        public Float getAvgUserIoWaitTime() {
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
        public Float getDelayedLargeQueryPercentage() {
            return this.delayedLargeQueryPercentage;
        }

        /**
         * @return execPs
         */
        public Float getExecPs() {
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
        public Float getHitPercentage() {
            return this.hitPercentage;
        }

        /**
         * @return largeQueryPercentage
         */
        public Float getLargeQueryPercentage() {
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
         * @return schemaVersion
         */
        public Long getSchemaVersion() {
            return this.schemaVersion;
        }

        /**
         * @return serverSn
         */
        public String getServerSn() {
            return this.serverSn;
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
        public Float getTimeoutPercentage() {
            return this.timeoutPercentage;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private Float avgApplicationWaitTime; 
            private Float avgBufferGets; 
            private Float avgConcurrencyWaitTime; 
            private Float avgCpuTime; 
            private Float avgDiskReads; 
            private Float avgDiskWrites; 
            private Float avgElapsedTime; 
            private Float avgRowProcessed; 
            private Float avgUserIoWaitTime; 
            private Long collectTimeUs; 
            private Float delayedLargeQueryPercentage; 
            private Float execPs; 
            private Long executions; 
            private String firstLoadTime; 
            private Long firstLoadTimeUs; 
            private Boolean hitDiagnosis; 
            private Float hitPercentage; 
            private Float largeQueryPercentage; 
            private Long mergedVersion; 
            private Long obDbId; 
            private Long obServerId; 
            private String outlineData; 
            private Long outlineId; 
            private String planHash; 
            private Long planId; 
            private Long planSize; 
            private String planType; 
            private Long schemaVersion; 
            private String serverSn; 
            private Boolean tableScan; 
            private Float timeoutPercentage; 
            private String uid; 

            /**
             * AvgApplicationWaitTime.
             */
            public Builder avgApplicationWaitTime(Float avgApplicationWaitTime) {
                this.avgApplicationWaitTime = avgApplicationWaitTime;
                return this;
            }

            /**
             * AvgBufferGets.
             */
            public Builder avgBufferGets(Float avgBufferGets) {
                this.avgBufferGets = avgBufferGets;
                return this;
            }

            /**
             * AvgConcurrencyWaitTime.
             */
            public Builder avgConcurrencyWaitTime(Float avgConcurrencyWaitTime) {
                this.avgConcurrencyWaitTime = avgConcurrencyWaitTime;
                return this;
            }

            /**
             * AvgCpuTime.
             */
            public Builder avgCpuTime(Float avgCpuTime) {
                this.avgCpuTime = avgCpuTime;
                return this;
            }

            /**
             * AvgDiskReads.
             */
            public Builder avgDiskReads(Float avgDiskReads) {
                this.avgDiskReads = avgDiskReads;
                return this;
            }

            /**
             * AvgDiskWrites.
             */
            public Builder avgDiskWrites(Float avgDiskWrites) {
                this.avgDiskWrites = avgDiskWrites;
                return this;
            }

            /**
             * AvgElapsedTime.
             */
            public Builder avgElapsedTime(Float avgElapsedTime) {
                this.avgElapsedTime = avgElapsedTime;
                return this;
            }

            /**
             * AvgRowProcessed.
             */
            public Builder avgRowProcessed(Float avgRowProcessed) {
                this.avgRowProcessed = avgRowProcessed;
                return this;
            }

            /**
             * AvgUserIoWaitTime.
             */
            public Builder avgUserIoWaitTime(Float avgUserIoWaitTime) {
                this.avgUserIoWaitTime = avgUserIoWaitTime;
                return this;
            }

            /**
             * CollectTimeUs.
             */
            public Builder collectTimeUs(Long collectTimeUs) {
                this.collectTimeUs = collectTimeUs;
                return this;
            }

            /**
             * DelayedLargeQueryPercentage.
             */
            public Builder delayedLargeQueryPercentage(Float delayedLargeQueryPercentage) {
                this.delayedLargeQueryPercentage = delayedLargeQueryPercentage;
                return this;
            }

            /**
             * ExecPs.
             */
            public Builder execPs(Float execPs) {
                this.execPs = execPs;
                return this;
            }

            /**
             * Executions.
             */
            public Builder executions(Long executions) {
                this.executions = executions;
                return this;
            }

            /**
             * FirstLoadTime.
             */
            public Builder firstLoadTime(String firstLoadTime) {
                this.firstLoadTime = firstLoadTime;
                return this;
            }

            /**
             * FirstLoadTimeUs.
             */
            public Builder firstLoadTimeUs(Long firstLoadTimeUs) {
                this.firstLoadTimeUs = firstLoadTimeUs;
                return this;
            }

            /**
             * HitDiagnosis.
             */
            public Builder hitDiagnosis(Boolean hitDiagnosis) {
                this.hitDiagnosis = hitDiagnosis;
                return this;
            }

            /**
             * HitPercentage.
             */
            public Builder hitPercentage(Float hitPercentage) {
                this.hitPercentage = hitPercentage;
                return this;
            }

            /**
             * LargeQueryPercentage.
             */
            public Builder largeQueryPercentage(Float largeQueryPercentage) {
                this.largeQueryPercentage = largeQueryPercentage;
                return this;
            }

            /**
             * MergedVersion.
             */
            public Builder mergedVersion(Long mergedVersion) {
                this.mergedVersion = mergedVersion;
                return this;
            }

            /**
             * ObDbId.
             */
            public Builder obDbId(Long obDbId) {
                this.obDbId = obDbId;
                return this;
            }

            /**
             * server  ID。
             */
            public Builder obServerId(Long obServerId) {
                this.obServerId = obServerId;
                return this;
            }

            /**
             * OutlineData.
             */
            public Builder outlineData(String outlineData) {
                this.outlineData = outlineData;
                return this;
            }

            /**
             * Outline ID。
             */
            public Builder outlineId(Long outlineId) {
                this.outlineId = outlineId;
                return this;
            }

            /**
             * PlanHash.
             */
            public Builder planHash(String planHash) {
                this.planHash = planHash;
                return this;
            }

            /**
             * PlanId.
             */
            public Builder planId(Long planId) {
                this.planId = planId;
                return this;
            }

            /**
             * PlanSize.
             */
            public Builder planSize(Long planSize) {
                this.planSize = planSize;
                return this;
            }

            /**
             * PlanType.
             */
            public Builder planType(String planType) {
                this.planType = planType;
                return this;
            }

            /**
             * SchemaVersion.
             */
            public Builder schemaVersion(Long schemaVersion) {
                this.schemaVersion = schemaVersion;
                return this;
            }

            /**
             * ServerSn.
             */
            public Builder serverSn(String serverSn) {
                this.serverSn = serverSn;
                return this;
            }

            /**
             * TableScan.
             */
            public Builder tableScan(Boolean tableScan) {
                this.tableScan = tableScan;
                return this;
            }

            /**
             * TimeoutPercentage.
             */
            public Builder timeoutPercentage(Float timeoutPercentage) {
                this.timeoutPercentage = timeoutPercentage;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public Plan build() {
                return new Plan(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnNames")
        private String columnNames;

        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List < Columns> columns;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("LocalityType")
        private String localityType;

        @com.aliyun.core.annotation.NameInMap("Plan")
        private Plan plan;

        @com.aliyun.core.annotation.NameInMap("Table")
        private String table;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.columnNames = builder.columnNames;
            this.columns = builder.columns;
            this.dbName = builder.dbName;
            this.localityType = builder.localityType;
            this.plan = builder.plan;
            this.table = builder.table;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return columnNames
         */
        public String getColumnNames() {
            return this.columnNames;
        }

        /**
         * @return columns
         */
        public java.util.List < Columns> getColumns() {
            return this.columns;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return localityType
         */
        public String getLocalityType() {
            return this.localityType;
        }

        /**
         * @return plan
         */
        public Plan getPlan() {
            return this.plan;
        }

        /**
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String columnNames; 
            private java.util.List < Columns> columns; 
            private String dbName; 
            private String localityType; 
            private Plan plan; 
            private String table; 
            private String type; 

            /**
             * ColumnNames.
             */
            public Builder columnNames(String columnNames) {
                this.columnNames = columnNames;
                return this;
            }

            /**
             * Columns.
             */
            public Builder columns(java.util.List < Columns> columns) {
                this.columns = columns;
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
             * LocalityType.
             */
            public Builder localityType(String localityType) {
                this.localityType = localityType;
                return this;
            }

            /**
             * Plan.
             */
            public Builder plan(Plan plan) {
                this.plan = plan;
                return this;
            }

            /**
             * Table.
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
