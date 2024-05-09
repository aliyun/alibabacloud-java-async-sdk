// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < PatternDetails> patternDetails;

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
    public java.util.List < PatternDetails> getPatternDetails() {
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
        private java.util.List < PatternDetails> patternDetails; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The queried SQL pattern.
         */
        public Builder patternDetails(java.util.List < PatternDetails> patternDetails) {
            this.patternDetails = patternDetails;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSQLPatternsResponseBody build() {
            return new DescribeSQLPatternsResponseBody(this);
        } 

    } 

    public static class PatternDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessIp")
        private String accessIp;

        @com.aliyun.core.annotation.NameInMap("AverageExecutionTime")
        private Double averageExecutionTime;

        @com.aliyun.core.annotation.NameInMap("AveragePeakMemory")
        private Double averagePeakMemory;

        @com.aliyun.core.annotation.NameInMap("AverageQueryTime")
        private Double averageQueryTime;

        @com.aliyun.core.annotation.NameInMap("AverageScanSize")
        private Double averageScanSize;

        @com.aliyun.core.annotation.NameInMap("Blockable")
        private Boolean blockable;

        @com.aliyun.core.annotation.NameInMap("FailedCount")
        private Long failedCount;

        @com.aliyun.core.annotation.NameInMap("MaxExecutionTime")
        private Long maxExecutionTime;

        @com.aliyun.core.annotation.NameInMap("MaxPeakMemory")
        private Long maxPeakMemory;

        @com.aliyun.core.annotation.NameInMap("MaxQueryTime")
        private Long maxQueryTime;

        @com.aliyun.core.annotation.NameInMap("MaxScanSize")
        private Long maxScanSize;

        @com.aliyun.core.annotation.NameInMap("PatternCreationTime")
        private String patternCreationTime;

        @com.aliyun.core.annotation.NameInMap("PatternId")
        private String patternId;

        @com.aliyun.core.annotation.NameInMap("QueryCount")
        private Long queryCount;

        @com.aliyun.core.annotation.NameInMap("SQLPattern")
        private String SQLPattern;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private String tables;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private PatternDetails(Builder builder) {
            this.accessIp = builder.accessIp;
            this.averageExecutionTime = builder.averageExecutionTime;
            this.averagePeakMemory = builder.averagePeakMemory;
            this.averageQueryTime = builder.averageQueryTime;
            this.averageScanSize = builder.averageScanSize;
            this.blockable = builder.blockable;
            this.failedCount = builder.failedCount;
            this.maxExecutionTime = builder.maxExecutionTime;
            this.maxPeakMemory = builder.maxPeakMemory;
            this.maxQueryTime = builder.maxQueryTime;
            this.maxScanSize = builder.maxScanSize;
            this.patternCreationTime = builder.patternCreationTime;
            this.patternId = builder.patternId;
            this.queryCount = builder.queryCount;
            this.SQLPattern = builder.SQLPattern;
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
         * @return maxScanSize
         */
        public Long getMaxScanSize() {
            return this.maxScanSize;
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
         * @return queryCount
         */
        public Long getQueryCount() {
            return this.queryCount;
        }

        /**
         * @return SQLPattern
         */
        public String getSQLPattern() {
            return this.SQLPattern;
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
            private Double averagePeakMemory; 
            private Double averageQueryTime; 
            private Double averageScanSize; 
            private Boolean blockable; 
            private Long failedCount; 
            private Long maxExecutionTime; 
            private Long maxPeakMemory; 
            private Long maxQueryTime; 
            private Long maxScanSize; 
            private String patternCreationTime; 
            private String patternId; 
            private Long queryCount; 
            private String SQLPattern; 
            private String tables; 
            private String user; 

            /**
             * The IP address of the SQL client that commits the SQL pattern.
             */
            public Builder accessIp(String accessIp) {
                this.accessIp = accessIp;
                return this;
            }

            /**
             * The average execution duration of the SQL pattern within the query time range. Unit: milliseconds.
             */
            public Builder averageExecutionTime(Double averageExecutionTime) {
                this.averageExecutionTime = averageExecutionTime;
                return this;
            }

            /**
             * The average peak memory usage of the SQL pattern within the query time range. Unit: bytes.
             */
            public Builder averagePeakMemory(Double averagePeakMemory) {
                this.averagePeakMemory = averagePeakMemory;
                return this;
            }

            /**
             * The average total amount of time consumed by the SQL pattern within the query time range. Unit: milliseconds.
             */
            public Builder averageQueryTime(Double averageQueryTime) {
                this.averageQueryTime = averageQueryTime;
                return this;
            }

            /**
             * The average amount of data scanned based on the SQL pattern within the query time range. Unit: bytes.
             */
            public Builder averageScanSize(Double averageScanSize) {
                this.averageScanSize = averageScanSize;
                return this;
            }

            /**
             * Indicates whether the execution of the SQL pattern can be blocked. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * >  Only SELECT and INSERT statements can be blocked.
             */
            public Builder blockable(Boolean blockable) {
                this.blockable = blockable;
                return this;
            }

            /**
             * The number of failed queries executed in association with the SQL pattern within the query time range.
             */
            public Builder failedCount(Long failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * The maximum execution duration of the SQL pattern within the query time range. Unit: milliseconds.
             */
            public Builder maxExecutionTime(Long maxExecutionTime) {
                this.maxExecutionTime = maxExecutionTime;
                return this;
            }

            /**
             * The maximum peak memory usage of the SQL pattern within the query time range. Unit: bytes.
             */
            public Builder maxPeakMemory(Long maxPeakMemory) {
                this.maxPeakMemory = maxPeakMemory;
                return this;
            }

            /**
             * The maximum total amount of time consumed by the SQL pattern within the query time range. Unit: milliseconds.
             */
            public Builder maxQueryTime(Long maxQueryTime) {
                this.maxQueryTime = maxQueryTime;
                return this;
            }

            /**
             * The maximum amount of data scanned based on the SQL pattern within the query time range. Unit: bytes.
             */
            public Builder maxScanSize(Long maxScanSize) {
                this.maxScanSize = maxScanSize;
                return this;
            }

            /**
             * The earliest commit time of the SQL pattern within the query time range.
             */
            public Builder patternCreationTime(String patternCreationTime) {
                this.patternCreationTime = patternCreationTime;
                return this;
            }

            /**
             * The ID of the SQL pattern.
             */
            public Builder patternId(String patternId) {
                this.patternId = patternId;
                return this;
            }

            /**
             * The number of queries executed in association with the SQL pattern within the query time range.
             */
            public Builder queryCount(Long queryCount) {
                this.queryCount = queryCount;
                return this;
            }

            /**
             * The statement of the SQL pattern.
             */
            public Builder SQLPattern(String SQLPattern) {
                this.SQLPattern = SQLPattern;
                return this;
            }

            /**
             * The tables scanned based on the SQL pattern.
             */
            public Builder tables(String tables) {
                this.tables = tables;
                return this;
            }

            /**
             * The database username that is used to commit the SQL pattern.
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
