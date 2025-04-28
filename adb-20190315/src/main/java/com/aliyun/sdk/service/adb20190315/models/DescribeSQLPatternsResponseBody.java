// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeSQLPatternsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLPatternsResponseBody</p>
 */
public class DescribeSQLPatternsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PatternDetails")
    private java.util.List<PatternDetails> patternDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSQLPatternsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.patternDetails = builder.patternDetails;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLPatternsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return patternDetails
     */
    public java.util.List<PatternDetails> getPatternDetails() {
        return this.patternDetails;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<PatternDetails> patternDetails; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSQLPatternsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.patternDetails = model.patternDetails;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The queried SQL patterns.</p>
         */
        public Builder patternDetails(java.util.List<PatternDetails> patternDetails) {
            this.patternDetails = patternDetails;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6BE0EDD1-0DE6-3EB6-81BF-BFE4F2******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSQLPatternsResponseBody build() {
            return new DescribeSQLPatternsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSQLPatternsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSQLPatternsResponseBody</p>
     */
    public static class PatternDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessIp")
        private String accessIp;

        @com.aliyun.core.annotation.NameInMap("AverageExecutionTime")
        private Double averageExecutionTime;

        @com.aliyun.core.annotation.NameInMap("AverageOperatorCost")
        private Double averageOperatorCost;

        @com.aliyun.core.annotation.NameInMap("AveragePeakMemory")
        private Double averagePeakMemory;

        @com.aliyun.core.annotation.NameInMap("AverageQueryTime")
        private Double averageQueryTime;

        @com.aliyun.core.annotation.NameInMap("AverageScanCost")
        private Double averageScanCost;

        @com.aliyun.core.annotation.NameInMap("AverageScanSize")
        private Double averageScanSize;

        @com.aliyun.core.annotation.NameInMap("Blockable")
        private Boolean blockable;

        @com.aliyun.core.annotation.NameInMap("FailedCount")
        private Long failedCount;

        @com.aliyun.core.annotation.NameInMap("MaxExecutionTime")
        private Long maxExecutionTime;

        @com.aliyun.core.annotation.NameInMap("MaxOperatorCost")
        private Double maxOperatorCost;

        @com.aliyun.core.annotation.NameInMap("MaxPeakMemory")
        private Long maxPeakMemory;

        @com.aliyun.core.annotation.NameInMap("MaxQueryTime")
        private Long maxQueryTime;

        @com.aliyun.core.annotation.NameInMap("MaxScanCost")
        private Double maxScanCost;

        @com.aliyun.core.annotation.NameInMap("MaxScanSize")
        private Long maxScanSize;

        @com.aliyun.core.annotation.NameInMap("OperatorCostPercentage")
        private Double operatorCostPercentage;

        @com.aliyun.core.annotation.NameInMap("OperatorCostSum")
        private Double operatorCostSum;

        @com.aliyun.core.annotation.NameInMap("PatternCreationTime")
        private String patternCreationTime;

        @com.aliyun.core.annotation.NameInMap("PatternId")
        private String patternId;

        @com.aliyun.core.annotation.NameInMap("PeakMemoryPercentage")
        private Double peakMemoryPercentage;

        @com.aliyun.core.annotation.NameInMap("PeakMemorySum")
        private Double peakMemorySum;

        @com.aliyun.core.annotation.NameInMap("QueryCount")
        private Long queryCount;

        @com.aliyun.core.annotation.NameInMap("QueryTimePercentage")
        private Double queryTimePercentage;

        @com.aliyun.core.annotation.NameInMap("QueryTimeSum")
        private Double queryTimeSum;

        @com.aliyun.core.annotation.NameInMap("SQLPattern")
        private String SQLPattern;

        @com.aliyun.core.annotation.NameInMap("ScanCostPercentage")
        private Double scanCostPercentage;

        @com.aliyun.core.annotation.NameInMap("ScanCostSum")
        private Double scanCostSum;

        @com.aliyun.core.annotation.NameInMap("ScanSizePercentage")
        private Double scanSizePercentage;

        @com.aliyun.core.annotation.NameInMap("ScanSizeSum")
        private Double scanSizeSum;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private String tables;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private PatternDetails(Builder builder) {
            this.accessIp = builder.accessIp;
            this.averageExecutionTime = builder.averageExecutionTime;
            this.averageOperatorCost = builder.averageOperatorCost;
            this.averagePeakMemory = builder.averagePeakMemory;
            this.averageQueryTime = builder.averageQueryTime;
            this.averageScanCost = builder.averageScanCost;
            this.averageScanSize = builder.averageScanSize;
            this.blockable = builder.blockable;
            this.failedCount = builder.failedCount;
            this.maxExecutionTime = builder.maxExecutionTime;
            this.maxOperatorCost = builder.maxOperatorCost;
            this.maxPeakMemory = builder.maxPeakMemory;
            this.maxQueryTime = builder.maxQueryTime;
            this.maxScanCost = builder.maxScanCost;
            this.maxScanSize = builder.maxScanSize;
            this.operatorCostPercentage = builder.operatorCostPercentage;
            this.operatorCostSum = builder.operatorCostSum;
            this.patternCreationTime = builder.patternCreationTime;
            this.patternId = builder.patternId;
            this.peakMemoryPercentage = builder.peakMemoryPercentage;
            this.peakMemorySum = builder.peakMemorySum;
            this.queryCount = builder.queryCount;
            this.queryTimePercentage = builder.queryTimePercentage;
            this.queryTimeSum = builder.queryTimeSum;
            this.SQLPattern = builder.SQLPattern;
            this.scanCostPercentage = builder.scanCostPercentage;
            this.scanCostSum = builder.scanCostSum;
            this.scanSizePercentage = builder.scanSizePercentage;
            this.scanSizeSum = builder.scanSizeSum;
            this.tables = builder.tables;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PatternDetails create() {
            return builder().build();
        }

        /**
         * @return accessIp
         */
        public String getAccessIp() {
            return this.accessIp;
        }

        /**
         * @return averageExecutionTime
         */
        public Double getAverageExecutionTime() {
            return this.averageExecutionTime;
        }

        /**
         * @return averageOperatorCost
         */
        public Double getAverageOperatorCost() {
            return this.averageOperatorCost;
        }

        /**
         * @return averagePeakMemory
         */
        public Double getAveragePeakMemory() {
            return this.averagePeakMemory;
        }

        /**
         * @return averageQueryTime
         */
        public Double getAverageQueryTime() {
            return this.averageQueryTime;
        }

        /**
         * @return averageScanCost
         */
        public Double getAverageScanCost() {
            return this.averageScanCost;
        }

        /**
         * @return averageScanSize
         */
        public Double getAverageScanSize() {
            return this.averageScanSize;
        }

        /**
         * @return blockable
         */
        public Boolean getBlockable() {
            return this.blockable;
        }

        /**
         * @return failedCount
         */
        public Long getFailedCount() {
            return this.failedCount;
        }

        /**
         * @return maxExecutionTime
         */
        public Long getMaxExecutionTime() {
            return this.maxExecutionTime;
        }

        /**
         * @return maxOperatorCost
         */
        public Double getMaxOperatorCost() {
            return this.maxOperatorCost;
        }

        /**
         * @return maxPeakMemory
         */
        public Long getMaxPeakMemory() {
            return this.maxPeakMemory;
        }

        /**
         * @return maxQueryTime
         */
        public Long getMaxQueryTime() {
            return this.maxQueryTime;
        }

        /**
         * @return maxScanCost
         */
        public Double getMaxScanCost() {
            return this.maxScanCost;
        }

        /**
         * @return maxScanSize
         */
        public Long getMaxScanSize() {
            return this.maxScanSize;
        }

        /**
         * @return operatorCostPercentage
         */
        public Double getOperatorCostPercentage() {
            return this.operatorCostPercentage;
        }

        /**
         * @return operatorCostSum
         */
        public Double getOperatorCostSum() {
            return this.operatorCostSum;
        }

        /**
         * @return patternCreationTime
         */
        public String getPatternCreationTime() {
            return this.patternCreationTime;
        }

        /**
         * @return patternId
         */
        public String getPatternId() {
            return this.patternId;
        }

        /**
         * @return peakMemoryPercentage
         */
        public Double getPeakMemoryPercentage() {
            return this.peakMemoryPercentage;
        }

        /**
         * @return peakMemorySum
         */
        public Double getPeakMemorySum() {
            return this.peakMemorySum;
        }

        /**
         * @return queryCount
         */
        public Long getQueryCount() {
            return this.queryCount;
        }

        /**
         * @return queryTimePercentage
         */
        public Double getQueryTimePercentage() {
            return this.queryTimePercentage;
        }

        /**
         * @return queryTimeSum
         */
        public Double getQueryTimeSum() {
            return this.queryTimeSum;
        }

        /**
         * @return SQLPattern
         */
        public String getSQLPattern() {
            return this.SQLPattern;
        }

        /**
         * @return scanCostPercentage
         */
        public Double getScanCostPercentage() {
            return this.scanCostPercentage;
        }

        /**
         * @return scanCostSum
         */
        public Double getScanCostSum() {
            return this.scanCostSum;
        }

        /**
         * @return scanSizePercentage
         */
        public Double getScanSizePercentage() {
            return this.scanSizePercentage;
        }

        /**
         * @return scanSizeSum
         */
        public Double getScanSizeSum() {
            return this.scanSizeSum;
        }

        /**
         * @return tables
         */
        public String getTables() {
            return this.tables;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String accessIp; 
            private Double averageExecutionTime; 
            private Double averageOperatorCost; 
            private Double averagePeakMemory; 
            private Double averageQueryTime; 
            private Double averageScanCost; 
            private Double averageScanSize; 
            private Boolean blockable; 
            private Long failedCount; 
            private Long maxExecutionTime; 
            private Double maxOperatorCost; 
            private Long maxPeakMemory; 
            private Long maxQueryTime; 
            private Double maxScanCost; 
            private Long maxScanSize; 
            private Double operatorCostPercentage; 
            private Double operatorCostSum; 
            private String patternCreationTime; 
            private String patternId; 
            private Double peakMemoryPercentage; 
            private Double peakMemorySum; 
            private Long queryCount; 
            private Double queryTimePercentage; 
            private Double queryTimeSum; 
            private String SQLPattern; 
            private Double scanCostPercentage; 
            private Double scanCostSum; 
            private Double scanSizePercentage; 
            private Double scanSizeSum; 
            private String tables; 
            private String user; 

            private Builder() {
            } 

            private Builder(PatternDetails model) {
                this.accessIp = model.accessIp;
                this.averageExecutionTime = model.averageExecutionTime;
                this.averageOperatorCost = model.averageOperatorCost;
                this.averagePeakMemory = model.averagePeakMemory;
                this.averageQueryTime = model.averageQueryTime;
                this.averageScanCost = model.averageScanCost;
                this.averageScanSize = model.averageScanSize;
                this.blockable = model.blockable;
                this.failedCount = model.failedCount;
                this.maxExecutionTime = model.maxExecutionTime;
                this.maxOperatorCost = model.maxOperatorCost;
                this.maxPeakMemory = model.maxPeakMemory;
                this.maxQueryTime = model.maxQueryTime;
                this.maxScanCost = model.maxScanCost;
                this.maxScanSize = model.maxScanSize;
                this.operatorCostPercentage = model.operatorCostPercentage;
                this.operatorCostSum = model.operatorCostSum;
                this.patternCreationTime = model.patternCreationTime;
                this.patternId = model.patternId;
                this.peakMemoryPercentage = model.peakMemoryPercentage;
                this.peakMemorySum = model.peakMemorySum;
                this.queryCount = model.queryCount;
                this.queryTimePercentage = model.queryTimePercentage;
                this.queryTimeSum = model.queryTimeSum;
                this.SQLPattern = model.SQLPattern;
                this.scanCostPercentage = model.scanCostPercentage;
                this.scanCostSum = model.scanCostSum;
                this.scanSizePercentage = model.scanSizePercentage;
                this.scanSizeSum = model.scanSizeSum;
                this.tables = model.tables;
                this.user = model.user;
            } 

            /**
             * <p>The IP address of the SQL client that commits the SQL pattern.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.xx.xx</p>
             */
            public Builder accessIp(String accessIp) {
                this.accessIp = accessIp;
                return this;
            }

            /**
             * <p>The average execution duration of the SQL pattern within the query time range. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>234.78</p>
             */
            public Builder averageExecutionTime(Double averageExecutionTime) {
                this.averageExecutionTime = averageExecutionTime;
                return this;
            }

            /**
             * <p>The average operation duration.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder averageOperatorCost(Double averageOperatorCost) {
                this.averageOperatorCost = averageOperatorCost;
                return this;
            }

            /**
             * <p>The average peak memory usage of the SQL pattern within the query time range. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>234.22</p>
             */
            public Builder averagePeakMemory(Double averagePeakMemory) {
                this.averagePeakMemory = averagePeakMemory;
                return this;
            }

            /**
             * <p>The average total amount of time consumed by the SQL pattern within the query time range. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder averageQueryTime(Double averageQueryTime) {
                this.averageQueryTime = averageQueryTime;
                return this;
            }

            /**
             * <p>The average scan duration.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder averageScanCost(Double averageScanCost) {
                this.averageScanCost = averageScanCost;
                return this;
            }

            /**
             * <p>The average amount of data scanned based on the SQL pattern within the query time range. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>234149.23</p>
             */
            public Builder averageScanSize(Double averageScanSize) {
                this.averageScanSize = averageScanSize;
                return this;
            }

            /**
             * <p>Indicates whether the execution of the SQL pattern can be blocked. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p>Only SELECT and INSERT statements can be blocked.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder blockable(Boolean blockable) {
                this.blockable = blockable;
                return this;
            }

            /**
             * <p>The number of failed queries executed in association with the SQL pattern within the query time range.</p>
             * 
             * <strong>example:</strong>
             * <p>234</p>
             */
            public Builder failedCount(Long failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * <p>The maximum execution duration of the SQL pattern within the query time range. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2142</p>
             */
            public Builder maxExecutionTime(Long maxExecutionTime) {
                this.maxExecutionTime = maxExecutionTime;
                return this;
            }

            /**
             * <p>The maximum operation duration.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxOperatorCost(Double maxOperatorCost) {
                this.maxOperatorCost = maxOperatorCost;
                return this;
            }

            /**
             * <p>The maximum peak memory usage of the SQL pattern within the query time range. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>234149</p>
             */
            public Builder maxPeakMemory(Long maxPeakMemory) {
                this.maxPeakMemory = maxPeakMemory;
                return this;
            }

            /**
             * <p>The maximum total amount of time consumed by the SQL pattern within the query time range. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2341</p>
             */
            public Builder maxQueryTime(Long maxQueryTime) {
                this.maxQueryTime = maxQueryTime;
                return this;
            }

            /**
             * <p>The maximum scan duration.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder maxScanCost(Double maxScanCost) {
                this.maxScanCost = maxScanCost;
                return this;
            }

            /**
             * <p>The maximum amount of data scanned based on the SQL pattern within the query time range. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>234149</p>
             */
            public Builder maxScanSize(Long maxScanSize) {
                this.maxScanSize = maxScanSize;
                return this;
            }

            /**
             * <p>The operation duration percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>75</p>
             */
            public Builder operatorCostPercentage(Double operatorCostPercentage) {
                this.operatorCostPercentage = operatorCostPercentage;
                return this;
            }

            /**
             * <p>The total operation duration.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder operatorCostSum(Double operatorCostSum) {
                this.operatorCostSum = operatorCostSum;
                return this;
            }

            /**
             * <p>The earliest commit time of the SQL pattern within the query time range. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-12 03:06:00</p>
             */
            public Builder patternCreationTime(String patternCreationTime) {
                this.patternCreationTime = patternCreationTime;
                return this;
            }

            /**
             * <p>The ID of the SQL pattern.</p>
             * 
             * <strong>example:</strong>
             * <p>5575924945138******</p>
             */
            public Builder patternId(String patternId) {
                this.patternId = patternId;
                return this;
            }

            /**
             * <p>The peak memory percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder peakMemoryPercentage(Double peakMemoryPercentage) {
                this.peakMemoryPercentage = peakMemoryPercentage;
                return this;
            }

            /**
             * <p>The total peak memory.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder peakMemorySum(Double peakMemorySum) {
                this.peakMemorySum = peakMemorySum;
                return this;
            }

            /**
             * <p>The number of queries executed in association with the SQL pattern within the query time range.</p>
             * 
             * <strong>example:</strong>
             * <p>345</p>
             */
            public Builder queryCount(Long queryCount) {
                this.queryCount = queryCount;
                return this;
            }

            /**
             * <p>The queue duration of the SQL statement. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder queryTimePercentage(Double queryTimePercentage) {
                this.queryTimePercentage = queryTimePercentage;
                return this;
            }

            /**
             * <p>The total query duration.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder queryTimeSum(Double queryTimeSum) {
                this.queryTimeSum = queryTimeSum;
                return this;
            }

            /**
             * <p>The statement of the SQL pattern.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM KEPLER_META_NODE_STATIC_INFO WHERE elastic_node = ? OR (elastic_node = ? AND enable = ?)</p>
             */
            public Builder SQLPattern(String SQLPattern) {
                this.SQLPattern = SQLPattern;
                return this;
            }

            /**
             * <p>The scan duration percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>75</p>
             */
            public Builder scanCostPercentage(Double scanCostPercentage) {
                this.scanCostPercentage = scanCostPercentage;
                return this;
            }

            /**
             * <p>The total scan duration.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder scanCostSum(Double scanCostSum) {
                this.scanCostSum = scanCostSum;
                return this;
            }

            /**
             * <p>The amount of time consumed to scan data from a data source in the task. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder scanSizePercentage(Double scanSizePercentage) {
                this.scanSizePercentage = scanSizePercentage;
                return this;
            }

            /**
             * <p>Total total scan size.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder scanSizeSum(Double scanSizeSum) {
                this.scanSizeSum = scanSizeSum;
                return this;
            }

            /**
             * <p>The tables scanned based on the SQL pattern.</p>
             * 
             * <strong>example:</strong>
             * <p>tpch.orders</p>
             */
            public Builder tables(String tables) {
                this.tables = tables;
                return this;
            }

            /**
             * <p>The database username that is used to commit the SQL pattern.</p>
             * 
             * <strong>example:</strong>
             * <p>reporter</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public PatternDetails build() {
                return new PatternDetails(this);
            } 

        } 

    }
}
