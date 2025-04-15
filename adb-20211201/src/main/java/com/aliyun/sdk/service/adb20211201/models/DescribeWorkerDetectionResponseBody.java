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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeWorkerDetectionResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.detectionItems = model.detectionItems;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>am-xxxxx</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The queried detection items and detection results.</p>
         */
        public Builder detectionItems(java.util.List<DetectionItems> detectionItems) {
            this.detectionItems = detectionItems;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E5B37B61-E6C9-5FE0-9374-45BAA548AEF6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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

            private Builder() {
            } 

            private Builder(SearchResults model) {
                this.avgValue = model.avgValue;
                this.maxValue = model.maxValue;
                this.operatorCount = model.operatorCount;
                this.operatorName = model.operatorName;
                this.totalValue = model.totalValue;
            } 

            /**
             * <p>The average value of the operator metric.</p>
             * 
             * <strong>example:</strong>
             * <p>2234</p>
             */
            public Builder avgValue(Double avgValue) {
                this.avgValue = avgValue;
                return this;
            }

            /**
             * <p>The maximum value of the operator metric.</p>
             * 
             * <strong>example:</strong>
             * <p>444</p>
             */
            public Builder maxValue(Long maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * <p>The number of occurrences of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder operatorCount(Long operatorCount) {
                this.operatorCount = operatorCount;
                return this;
            }

            /**
             * <p>The name of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>Aggregation</p>
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * <p>The cumulative value of the operator metric.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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

            private Builder() {
            } 

            private Builder(OperatorAgg model) {
                this.metricName = model.metricName;
                this.searchResults = model.searchResults;
            } 

            /**
             * <p>The detection result items of operator metric aggregation.</p>
             * 
             * <strong>example:</strong>
             * <p>Peak memory</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The detection result items of operator metric aggregation.</p>
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

            private Builder() {
            } 

            private Builder(OperatorDetailsSearchResults model) {
                this.inputRows = model.inputRows;
                this.inputSize = model.inputSize;
                this.operatorCost = model.operatorCost;
                this.operatorInfo = model.operatorInfo;
                this.operatorName = model.operatorName;
                this.outputRows = model.outputRows;
                this.outputSize = model.outputSize;
                this.peakMemory = model.peakMemory;
                this.processId = model.processId;
                this.stageId = model.stageId;
            } 

            /**
             * <p>The number of rows input by the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder inputRows(Long inputRows) {
                this.inputRows = inputRows;
                return this;
            }

            /**
             * <p>The amount of data input by the operator. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder inputSize(Long inputSize) {
                this.inputSize = inputSize;
                return this;
            }

            /**
             * <p>The total CPU time consumed by all operators in the stage, which is equivalent to the total CPU time of the stage. You can use this parameter to determine which parts of the stage consume a large amount of computing resources. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder operatorCost(Long operatorCost) {
                this.operatorCost = operatorCost;
                return this;
            }

            /**
             * <p>The property information about the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>GROUP BY field: id</p>
             */
            public Builder operatorInfo(String operatorInfo) {
                this.operatorInfo = operatorInfo;
                return this;
            }

            /**
             * <p>The name of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>TableScan</p>
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * <p>The number of rows output by the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder outputRows(Long outputRows) {
                this.outputRows = outputRows;
                return this;
            }

            /**
             * <p>The amount of data output by the operator. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder outputSize(Long outputSize) {
                this.outputSize = outputSize;
                return this;
            }

            /**
             * <p>The peak memory. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder peakMemory(Long peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * <p>The query ID that can be used for diagnostics.</p>
             * 
             * <strong>example:</strong>
             * <p>2024041909301402103302422803151411141</p>
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * <p>The stage ID.</p>
             * 
             * <strong>example:</strong>
             * <p>Stage[2]</p>
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

            private Builder() {
            } 

            private Builder(OperatorDetails model) {
                this.metricName = model.metricName;
                this.searchResults = model.searchResults;
            } 

            /**
             * <p>The name of the detection metric.</p>
             * 
             * <strong>example:</strong>
             * <p>PeakMemory</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The detection result items of abnormal operators.</p>
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

            private Builder() {
            } 

            private Builder(PartitionedTables model) {
                this.DDL = model.DDL;
                this.partitionCount = model.partitionCount;
                this.partitionIds = model.partitionIds;
                this.schemaName = model.schemaName;
                this.tableName = model.tableName;
                this.totalDataSize = model.totalDataSize;
            } 

            /**
             * <p>The SQL statement that is used to create the table.</p>
             * 
             * <strong>example:</strong>
             * <p>create table test(id varchar)</p>
             */
            public Builder DDL(String DDL) {
                this.DDL = DDL;
                return this;
            }

            /**
             * <p>The number of partitions.</p>
             * 
             * <strong>example:</strong>
             * <p>234</p>
             */
            public Builder partitionCount(String partitionCount) {
                this.partitionCount = partitionCount;
                return this;
            }

            /**
             * <p>The ID of the improper partition.</p>
             * 
             * <strong>example:</strong>
             * <p>[2024,2025]</p>
             */
            public Builder partitionIds(String partitionIds) {
                this.partitionIds = partitionIds;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>nxg</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>zhw_place_order</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The total data size of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
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

            private Builder() {
            } 

            private Builder(SkewedTables model) {
                this.DDL = model.DDL;
                this.partitionCount = model.partitionCount;
                this.schemaName = model.schemaName;
                this.shardSkewedRows = model.shardSkewedRows;
                this.tableName = model.tableName;
                this.totalDataSize = model.totalDataSize;
                this.totalLocalDataSize = model.totalLocalDataSize;
                this.totalPkSize = model.totalPkSize;
                this.totalRemoteDataSize = model.totalRemoteDataSize;
                this.totalRowCount = model.totalRowCount;
            } 

            /**
             * <p>The SQL statement that is used to create the table.</p>
             * 
             * <strong>example:</strong>
             * <p>create table test(id varchar)</p>
             */
            public Builder DDL(String DDL) {
                this.DDL = DDL;
                return this;
            }

            /**
             * <p>The number of partitions.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder partitionCount(Integer partitionCount) {
                this.partitionCount = partitionCount;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>platfunc</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The number of skewed rows in the table.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder shardSkewedRows(String shardSkewedRows) {
                this.shardSkewedRows = shardSkewedRows;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>sls_log_cheat_action</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The total data size of the table. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2345</p>
             */
            public Builder totalDataSize(Long totalDataSize) {
                this.totalDataSize = totalDataSize;
                return this;
            }

            /**
             * <p>The size of hot data. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2345</p>
             */
            public Builder totalLocalDataSize(String totalLocalDataSize) {
                this.totalLocalDataSize = totalLocalDataSize;
                return this;
            }

            /**
             * <p>The data size of the primary key. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>234</p>
             */
            public Builder totalPkSize(Long totalPkSize) {
                this.totalPkSize = totalPkSize;
                return this;
            }

            /**
             * <p>The size of cold data. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>234</p>
             */
            public Builder totalRemoteDataSize(Long totalRemoteDataSize) {
                this.totalRemoteDataSize = totalRemoteDataSize;
                return this;
            }

            /**
             * <p>The number of rows in the table.</p>
             * 
             * <strong>example:</strong>
             * <p>34</p>
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

            private Builder() {
            } 

            private Builder(TopAccessTablesSearchResults model) {
                this.accessCount = model.accessCount;
                this.avgScanCost = model.avgScanCost;
                this.avgScanSize = model.avgScanSize;
                this.maxScanCost = model.maxScanCost;
                this.maxScanSize = model.maxScanSize;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The number of accesses to the table.</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder accessCount(Long accessCount) {
                this.accessCount = accessCount;
                return this;
            }

            /**
             * <p>The average amount of time for scanning. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>234</p>
             */
            public Builder avgScanCost(Double avgScanCost) {
                this.avgScanCost = avgScanCost;
                return this;
            }

            /**
             * <p>The average data size for scanning. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>234</p>
             */
            public Builder avgScanSize(Double avgScanSize) {
                this.avgScanSize = avgScanSize;
                return this;
            }

            /**
             * <p>The maximum amount of time for scanning. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>345</p>
             */
            public Builder maxScanCost(Long maxScanCost) {
                this.maxScanCost = maxScanCost;
                return this;
            }

            /**
             * <p>The maximum data size for scanning. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2345</p>
             */
            public Builder maxScanSize(Long maxScanSize) {
                this.maxScanSize = maxScanSize;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>tiberias_2copt_origin_order_goods_info</p>
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

            private Builder() {
            } 

            private Builder(TopAccessTables model) {
                this.metricName = model.metricName;
                this.searchResults = model.searchResults;
            } 

            /**
             * <p>The name of the detection metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Peak memory detection</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The detection result items of table access.</p>
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

            private Builder() {
            } 

            private Builder(Results model) {
                this.operatorAgg = model.operatorAgg;
                this.operatorDetails = model.operatorDetails;
                this.partitionedTables = model.partitionedTables;
                this.skewedTables = model.skewedTables;
                this.topAccessTables = model.topAccessTables;
            } 

            /**
             * <p>The detection result items of operator metric aggregation.</p>
             */
            public Builder operatorAgg(java.util.List<OperatorAgg> operatorAgg) {
                this.operatorAgg = operatorAgg;
                return this;
            }

            /**
             * <p>The detection result items of abnormal operators.</p>
             */
            public Builder operatorDetails(java.util.List<OperatorDetails> operatorDetails) {
                this.operatorDetails = operatorDetails;
                return this;
            }

            /**
             * <p>The detection result items of improper partitioned tables.</p>
             */
            public Builder partitionedTables(java.util.List<PartitionedTables> partitionedTables) {
                this.partitionedTables = partitionedTables;
                return this;
            }

            /**
             * <p>The detection result items of skewed tables.</p>
             */
            public Builder skewedTables(java.util.List<SkewedTables> skewedTables) {
                this.skewedTables = skewedTables;
                return this;
            }

            /**
             * <p>The detection result items of table access.</p>
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

            private Builder() {
            } 

            private Builder(DetectionItems model) {
                this.message = model.message;
                this.name = model.name;
                this.results = model.results;
                this.status = model.status;
            } 

            /**
             * <p>The information about the detection result.</p>
             * 
             * <strong>example:</strong>
             * <p>There are a total of 10 tables with an excessive number of primary keys.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The name of the detection item.</p>
             * 
             * <strong>example:</strong>
             * <p>Metric detection</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The detection result items.</p>
             */
            public Builder results(Results results) {
                this.results = results;
                return this;
            }

            /**
             * <p>The severity level of the detection result. Valid values:</p>
             * <ul>
             * <li>NORMAL</li>
             * <li>WARNING</li>
             * <li>CRITICAL</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WARNING</p>
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
