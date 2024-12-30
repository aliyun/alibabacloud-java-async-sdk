// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeWorkerDetectionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWorkerDetectionResponseBody</p>
 */
public class DescribeWorkerDetectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("DetectionItems")
    private java.util.List<DetectionItems> detectionItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeWorkerDetectionResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.detectionItems = builder.detectionItems;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWorkerDetectionResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return detectionItems
     */
    public java.util.List<DetectionItems> getDetectionItems() {
        return this.detectionItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String DBClusterId; 
        private java.util.List<DetectionItems> detectionItems; 
        private String requestId; 
        private String totalCount; 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * DetectionItems.
         */
        public Builder detectionItems(java.util.List<DetectionItems> detectionItems) {
            this.detectionItems = detectionItems;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeWorkerDetectionResponseBody build() {
            return new DescribeWorkerDetectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWorkerDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWorkerDetectionResponseBody</p>
     */
    public static class SearchResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgValue")
        private Double avgValue;

        @com.aliyun.core.annotation.NameInMap("MaxValue")
        private Long maxValue;

        @com.aliyun.core.annotation.NameInMap("OperatorCount")
        private Long operatorCount;

        @com.aliyun.core.annotation.NameInMap("OperatorName")
        private String operatorName;

        @com.aliyun.core.annotation.NameInMap("TotalValue")
        private Long totalValue;

        private SearchResults(Builder builder) {
            this.avgValue = builder.avgValue;
            this.maxValue = builder.maxValue;
            this.operatorCount = builder.operatorCount;
            this.operatorName = builder.operatorName;
            this.totalValue = builder.totalValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchResults create() {
            return builder().build();
        }

        /**
         * @return avgValue
         */
        public Double getAvgValue() {
            return this.avgValue;
        }

        /**
         * @return maxValue
         */
        public Long getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return operatorCount
         */
        public Long getOperatorCount() {
            return this.operatorCount;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        /**
         * @return totalValue
         */
        public Long getTotalValue() {
            return this.totalValue;
        }

        public static final class Builder {
            private Double avgValue; 
            private Long maxValue; 
            private Long operatorCount; 
            private String operatorName; 
            private Long totalValue; 

            /**
             * AvgValue.
             */
            public Builder avgValue(Double avgValue) {
                this.avgValue = avgValue;
                return this;
            }

            /**
             * MaxValue.
             */
            public Builder maxValue(Long maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * OperatorCount.
             */
            public Builder operatorCount(Long operatorCount) {
                this.operatorCount = operatorCount;
                return this;
            }

            /**
             * OperatorName.
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * TotalValue.
             */
            public Builder totalValue(Long totalValue) {
                this.totalValue = totalValue;
                return this;
            }

            public SearchResults build() {
                return new SearchResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWorkerDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWorkerDetectionResponseBody</p>
     */
    public static class OperatorAgg extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("SearchResults")
        private java.util.List<SearchResults> searchResults;

        private OperatorAgg(Builder builder) {
            this.metricName = builder.metricName;
            this.searchResults = builder.searchResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperatorAgg create() {
            return builder().build();
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return searchResults
         */
        public java.util.List<SearchResults> getSearchResults() {
            return this.searchResults;
        }

        public static final class Builder {
            private String metricName; 
            private java.util.List<SearchResults> searchResults; 

            /**
             * MetricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * SearchResults.
             */
            public Builder searchResults(java.util.List<SearchResults> searchResults) {
                this.searchResults = searchResults;
                return this;
            }

            public OperatorAgg build() {
                return new OperatorAgg(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWorkerDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWorkerDetectionResponseBody</p>
     */
    public static class OperatorDetailsSearchResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputRows")
        private Long inputRows;

        @com.aliyun.core.annotation.NameInMap("InputSize")
        private Long inputSize;

        @com.aliyun.core.annotation.NameInMap("OperatorCost")
        private Long operatorCost;

        @com.aliyun.core.annotation.NameInMap("OperatorInfo")
        private String operatorInfo;

        @com.aliyun.core.annotation.NameInMap("OperatorName")
        private String operatorName;

        @com.aliyun.core.annotation.NameInMap("OutputRows")
        private Long outputRows;

        @com.aliyun.core.annotation.NameInMap("OutputSize")
        private Long outputSize;

        @com.aliyun.core.annotation.NameInMap("PeakMemory")
        private Long peakMemory;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private String processId;

        @com.aliyun.core.annotation.NameInMap("StageId")
        private String stageId;

        private OperatorDetailsSearchResults(Builder builder) {
            this.inputRows = builder.inputRows;
            this.inputSize = builder.inputSize;
            this.operatorCost = builder.operatorCost;
            this.operatorInfo = builder.operatorInfo;
            this.operatorName = builder.operatorName;
            this.outputRows = builder.outputRows;
            this.outputSize = builder.outputSize;
            this.peakMemory = builder.peakMemory;
            this.processId = builder.processId;
            this.stageId = builder.stageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperatorDetailsSearchResults create() {
            return builder().build();
        }

        /**
         * @return inputRows
         */
        public Long getInputRows() {
            return this.inputRows;
        }

        /**
         * @return inputSize
         */
        public Long getInputSize() {
            return this.inputSize;
        }

        /**
         * @return operatorCost
         */
        public Long getOperatorCost() {
            return this.operatorCost;
        }

        /**
         * @return operatorInfo
         */
        public String getOperatorInfo() {
            return this.operatorInfo;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        /**
         * @return outputRows
         */
        public Long getOutputRows() {
            return this.outputRows;
        }

        /**
         * @return outputSize
         */
        public Long getOutputSize() {
            return this.outputSize;
        }

        /**
         * @return peakMemory
         */
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        /**
         * @return processId
         */
        public String getProcessId() {
            return this.processId;
        }

        /**
         * @return stageId
         */
        public String getStageId() {
            return this.stageId;
        }

        public static final class Builder {
            private Long inputRows; 
            private Long inputSize; 
            private Long operatorCost; 
            private String operatorInfo; 
            private String operatorName; 
            private Long outputRows; 
            private Long outputSize; 
            private Long peakMemory; 
            private String processId; 
            private String stageId; 

            /**
             * InputRows.
             */
            public Builder inputRows(Long inputRows) {
                this.inputRows = inputRows;
                return this;
            }

            /**
             * InputSize.
             */
            public Builder inputSize(Long inputSize) {
                this.inputSize = inputSize;
                return this;
            }

            /**
             * OperatorCost.
             */
            public Builder operatorCost(Long operatorCost) {
                this.operatorCost = operatorCost;
                return this;
            }

            /**
             * OperatorInfo.
             */
            public Builder operatorInfo(String operatorInfo) {
                this.operatorInfo = operatorInfo;
                return this;
            }

            /**
             * OperatorName.
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * OutputRows.
             */
            public Builder outputRows(Long outputRows) {
                this.outputRows = outputRows;
                return this;
            }

            /**
             * OutputSize.
             */
            public Builder outputSize(Long outputSize) {
                this.outputSize = outputSize;
                return this;
            }

            /**
             * PeakMemory.
             */
            public Builder peakMemory(Long peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * ProcessId.
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * StageId.
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            public OperatorDetailsSearchResults build() {
                return new OperatorDetailsSearchResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWorkerDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWorkerDetectionResponseBody</p>
     */
    public static class OperatorDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("SearchResults")
        private java.util.List<OperatorDetailsSearchResults> searchResults;

        private OperatorDetails(Builder builder) {
            this.metricName = builder.metricName;
            this.searchResults = builder.searchResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperatorDetails create() {
            return builder().build();
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return searchResults
         */
        public java.util.List<OperatorDetailsSearchResults> getSearchResults() {
            return this.searchResults;
        }

        public static final class Builder {
            private String metricName; 
            private java.util.List<OperatorDetailsSearchResults> searchResults; 

            /**
             * MetricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * SearchResults.
             */
            public Builder searchResults(java.util.List<OperatorDetailsSearchResults> searchResults) {
                this.searchResults = searchResults;
                return this;
            }

            public OperatorDetails build() {
                return new OperatorDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWorkerDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWorkerDetectionResponseBody</p>
     */
    public static class PartitionedTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DDL")
        private String DDL;

        @com.aliyun.core.annotation.NameInMap("PartitionCount")
        private String partitionCount;

        @com.aliyun.core.annotation.NameInMap("PartitionIds")
        private String partitionIds;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TotalDataSize")
        private Long totalDataSize;

        private PartitionedTables(Builder builder) {
            this.DDL = builder.DDL;
            this.partitionCount = builder.partitionCount;
            this.partitionIds = builder.partitionIds;
            this.schemaName = builder.schemaName;
            this.tableName = builder.tableName;
            this.totalDataSize = builder.totalDataSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PartitionedTables create() {
            return builder().build();
        }

        /**
         * @return DDL
         */
        public String getDDL() {
            return this.DDL;
        }

        /**
         * @return partitionCount
         */
        public String getPartitionCount() {
            return this.partitionCount;
        }

        /**
         * @return partitionIds
         */
        public String getPartitionIds() {
            return this.partitionIds;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return totalDataSize
         */
        public Long getTotalDataSize() {
            return this.totalDataSize;
        }

        public static final class Builder {
            private String DDL; 
            private String partitionCount; 
            private String partitionIds; 
            private String schemaName; 
            private String tableName; 
            private Long totalDataSize; 

            /**
             * DDL.
             */
            public Builder DDL(String DDL) {
                this.DDL = DDL;
                return this;
            }

            /**
             * PartitionCount.
             */
            public Builder partitionCount(String partitionCount) {
                this.partitionCount = partitionCount;
                return this;
            }

            /**
             * PartitionIds.
             */
            public Builder partitionIds(String partitionIds) {
                this.partitionIds = partitionIds;
                return this;
            }

            /**
             * SchemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * TotalDataSize.
             */
            public Builder totalDataSize(Long totalDataSize) {
                this.totalDataSize = totalDataSize;
                return this;
            }

            public PartitionedTables build() {
                return new PartitionedTables(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWorkerDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWorkerDetectionResponseBody</p>
     */
    public static class SkewedTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DDL")
        private String DDL;

        @com.aliyun.core.annotation.NameInMap("PartitionCount")
        private Integer partitionCount;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("ShardSkewedRows")
        private String shardSkewedRows;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TotalDataSize")
        private Long totalDataSize;

        @com.aliyun.core.annotation.NameInMap("TotalLocalDataSize")
        private String totalLocalDataSize;

        @com.aliyun.core.annotation.NameInMap("TotalPkSize")
        private Long totalPkSize;

        @com.aliyun.core.annotation.NameInMap("TotalRemoteDataSize")
        private Long totalRemoteDataSize;

        @com.aliyun.core.annotation.NameInMap("TotalRowCount")
        private Long totalRowCount;

        private SkewedTables(Builder builder) {
            this.DDL = builder.DDL;
            this.partitionCount = builder.partitionCount;
            this.schemaName = builder.schemaName;
            this.shardSkewedRows = builder.shardSkewedRows;
            this.tableName = builder.tableName;
            this.totalDataSize = builder.totalDataSize;
            this.totalLocalDataSize = builder.totalLocalDataSize;
            this.totalPkSize = builder.totalPkSize;
            this.totalRemoteDataSize = builder.totalRemoteDataSize;
            this.totalRowCount = builder.totalRowCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkewedTables create() {
            return builder().build();
        }

        /**
         * @return DDL
         */
        public String getDDL() {
            return this.DDL;
        }

        /**
         * @return partitionCount
         */
        public Integer getPartitionCount() {
            return this.partitionCount;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return shardSkewedRows
         */
        public String getShardSkewedRows() {
            return this.shardSkewedRows;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return totalDataSize
         */
        public Long getTotalDataSize() {
            return this.totalDataSize;
        }

        /**
         * @return totalLocalDataSize
         */
        public String getTotalLocalDataSize() {
            return this.totalLocalDataSize;
        }

        /**
         * @return totalPkSize
         */
        public Long getTotalPkSize() {
            return this.totalPkSize;
        }

        /**
         * @return totalRemoteDataSize
         */
        public Long getTotalRemoteDataSize() {
            return this.totalRemoteDataSize;
        }

        /**
         * @return totalRowCount
         */
        public Long getTotalRowCount() {
            return this.totalRowCount;
        }

        public static final class Builder {
            private String DDL; 
            private Integer partitionCount; 
            private String schemaName; 
            private String shardSkewedRows; 
            private String tableName; 
            private Long totalDataSize; 
            private String totalLocalDataSize; 
            private Long totalPkSize; 
            private Long totalRemoteDataSize; 
            private Long totalRowCount; 

            /**
             * DDL.
             */
            public Builder DDL(String DDL) {
                this.DDL = DDL;
                return this;
            }

            /**
             * PartitionCount.
             */
            public Builder partitionCount(Integer partitionCount) {
                this.partitionCount = partitionCount;
                return this;
            }

            /**
             * SchemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * ShardSkewedRows.
             */
            public Builder shardSkewedRows(String shardSkewedRows) {
                this.shardSkewedRows = shardSkewedRows;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * TotalDataSize.
             */
            public Builder totalDataSize(Long totalDataSize) {
                this.totalDataSize = totalDataSize;
                return this;
            }

            /**
             * TotalLocalDataSize.
             */
            public Builder totalLocalDataSize(String totalLocalDataSize) {
                this.totalLocalDataSize = totalLocalDataSize;
                return this;
            }

            /**
             * TotalPkSize.
             */
            public Builder totalPkSize(Long totalPkSize) {
                this.totalPkSize = totalPkSize;
                return this;
            }

            /**
             * TotalRemoteDataSize.
             */
            public Builder totalRemoteDataSize(Long totalRemoteDataSize) {
                this.totalRemoteDataSize = totalRemoteDataSize;
                return this;
            }

            /**
             * TotalRowCount.
             */
            public Builder totalRowCount(Long totalRowCount) {
                this.totalRowCount = totalRowCount;
                return this;
            }

            public SkewedTables build() {
                return new SkewedTables(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWorkerDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWorkerDetectionResponseBody</p>
     */
    public static class TopAccessTablesSearchResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessCount")
        private Long accessCount;

        @com.aliyun.core.annotation.NameInMap("AvgScanCost")
        private Double avgScanCost;

        @com.aliyun.core.annotation.NameInMap("AvgScanSize")
        private Double avgScanSize;

        @com.aliyun.core.annotation.NameInMap("MaxScanCost")
        private Long maxScanCost;

        @com.aliyun.core.annotation.NameInMap("MaxScanSize")
        private Long maxScanSize;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private TopAccessTablesSearchResults(Builder builder) {
            this.accessCount = builder.accessCount;
            this.avgScanCost = builder.avgScanCost;
            this.avgScanSize = builder.avgScanSize;
            this.maxScanCost = builder.maxScanCost;
            this.maxScanSize = builder.maxScanSize;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopAccessTablesSearchResults create() {
            return builder().build();
        }

        /**
         * @return accessCount
         */
        public Long getAccessCount() {
            return this.accessCount;
        }

        /**
         * @return avgScanCost
         */
        public Double getAvgScanCost() {
            return this.avgScanCost;
        }

        /**
         * @return avgScanSize
         */
        public Double getAvgScanSize() {
            return this.avgScanSize;
        }

        /**
         * @return maxScanCost
         */
        public Long getMaxScanCost() {
            return this.maxScanCost;
        }

        /**
         * @return maxScanSize
         */
        public Long getMaxScanSize() {
            return this.maxScanSize;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private Long accessCount; 
            private Double avgScanCost; 
            private Double avgScanSize; 
            private Long maxScanCost; 
            private Long maxScanSize; 
            private String tableName; 

            /**
             * AccessCount.
             */
            public Builder accessCount(Long accessCount) {
                this.accessCount = accessCount;
                return this;
            }

            /**
             * AvgScanCost.
             */
            public Builder avgScanCost(Double avgScanCost) {
                this.avgScanCost = avgScanCost;
                return this;
            }

            /**
             * AvgScanSize.
             */
            public Builder avgScanSize(Double avgScanSize) {
                this.avgScanSize = avgScanSize;
                return this;
            }

            /**
             * MaxScanCost.
             */
            public Builder maxScanCost(Long maxScanCost) {
                this.maxScanCost = maxScanCost;
                return this;
            }

            /**
             * MaxScanSize.
             */
            public Builder maxScanSize(Long maxScanSize) {
                this.maxScanSize = maxScanSize;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public TopAccessTablesSearchResults build() {
                return new TopAccessTablesSearchResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWorkerDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWorkerDetectionResponseBody</p>
     */
    public static class TopAccessTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("SearchResults")
        private java.util.List<TopAccessTablesSearchResults> searchResults;

        private TopAccessTables(Builder builder) {
            this.metricName = builder.metricName;
            this.searchResults = builder.searchResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopAccessTables create() {
            return builder().build();
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return searchResults
         */
        public java.util.List<TopAccessTablesSearchResults> getSearchResults() {
            return this.searchResults;
        }

        public static final class Builder {
            private String metricName; 
            private java.util.List<TopAccessTablesSearchResults> searchResults; 

            /**
             * MetricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * SearchResults.
             */
            public Builder searchResults(java.util.List<TopAccessTablesSearchResults> searchResults) {
                this.searchResults = searchResults;
                return this;
            }

            public TopAccessTables build() {
                return new TopAccessTables(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWorkerDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWorkerDetectionResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperatorAgg")
        private java.util.List<OperatorAgg> operatorAgg;

        @com.aliyun.core.annotation.NameInMap("OperatorDetails")
        private java.util.List<OperatorDetails> operatorDetails;

        @com.aliyun.core.annotation.NameInMap("PartitionedTables")
        private java.util.List<PartitionedTables> partitionedTables;

        @com.aliyun.core.annotation.NameInMap("SkewedTables")
        private java.util.List<SkewedTables> skewedTables;

        @com.aliyun.core.annotation.NameInMap("TopAccessTables")
        private java.util.List<TopAccessTables> topAccessTables;

        private Results(Builder builder) {
            this.operatorAgg = builder.operatorAgg;
            this.operatorDetails = builder.operatorDetails;
            this.partitionedTables = builder.partitionedTables;
            this.skewedTables = builder.skewedTables;
            this.topAccessTables = builder.topAccessTables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return operatorAgg
         */
        public java.util.List<OperatorAgg> getOperatorAgg() {
            return this.operatorAgg;
        }

        /**
         * @return operatorDetails
         */
        public java.util.List<OperatorDetails> getOperatorDetails() {
            return this.operatorDetails;
        }

        /**
         * @return partitionedTables
         */
        public java.util.List<PartitionedTables> getPartitionedTables() {
            return this.partitionedTables;
        }

        /**
         * @return skewedTables
         */
        public java.util.List<SkewedTables> getSkewedTables() {
            return this.skewedTables;
        }

        /**
         * @return topAccessTables
         */
        public java.util.List<TopAccessTables> getTopAccessTables() {
            return this.topAccessTables;
        }

        public static final class Builder {
            private java.util.List<OperatorAgg> operatorAgg; 
            private java.util.List<OperatorDetails> operatorDetails; 
            private java.util.List<PartitionedTables> partitionedTables; 
            private java.util.List<SkewedTables> skewedTables; 
            private java.util.List<TopAccessTables> topAccessTables; 

            /**
             * OperatorAgg.
             */
            public Builder operatorAgg(java.util.List<OperatorAgg> operatorAgg) {
                this.operatorAgg = operatorAgg;
                return this;
            }

            /**
             * OperatorDetails.
             */
            public Builder operatorDetails(java.util.List<OperatorDetails> operatorDetails) {
                this.operatorDetails = operatorDetails;
                return this;
            }

            /**
             * PartitionedTables.
             */
            public Builder partitionedTables(java.util.List<PartitionedTables> partitionedTables) {
                this.partitionedTables = partitionedTables;
                return this;
            }

            /**
             * SkewedTables.
             */
            public Builder skewedTables(java.util.List<SkewedTables> skewedTables) {
                this.skewedTables = skewedTables;
                return this;
            }

            /**
             * TopAccessTables.
             */
            public Builder topAccessTables(java.util.List<TopAccessTables> topAccessTables) {
                this.topAccessTables = topAccessTables;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWorkerDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWorkerDetectionResponseBody</p>
     */
    public static class DetectionItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Results")
        private Results results;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DetectionItems(Builder builder) {
            this.message = builder.message;
            this.name = builder.name;
            this.results = builder.results;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetectionItems create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return results
         */
        public Results getResults() {
            return this.results;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String message; 
            private String name; 
            private Results results; 
            private String status; 

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Results.
             */
            public Builder results(Results results) {
                this.results = results;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DetectionItems build() {
                return new DetectionItems(this);
            } 

        } 

    }
}
