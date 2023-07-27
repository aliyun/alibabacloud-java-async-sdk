// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLPatternsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLPatternsResponseBody</p>
 */
public class DescribeSQLPatternsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PatternDetails")
    private java.util.List < PatternDetails> patternDetails;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PatternDetails.
         */
        public Builder patternDetails(java.util.List < PatternDetails> patternDetails) {
            this.patternDetails = patternDetails;
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSQLPatternsResponseBody build() {
            return new DescribeSQLPatternsResponseBody(this);
        } 

    } 

    public static class PatternDetails extends TeaModel {
        @NameInMap("AccessIp")
        private String accessIp;

        @NameInMap("AverageExecutionTime")
        private Double averageExecutionTime;

        @NameInMap("AveragePeakMemory")
        private Double averagePeakMemory;

        @NameInMap("AverageQueryTime")
        private Double averageQueryTime;

        @NameInMap("AverageScanSize")
        private Double averageScanSize;

        @NameInMap("Blockable")
        private Boolean blockable;

        @NameInMap("FailedCount")
        private Long failedCount;

        @NameInMap("MaxExecutionTime")
        private Long maxExecutionTime;

        @NameInMap("MaxPeakMemory")
        private Long maxPeakMemory;

        @NameInMap("MaxQueryTime")
        private Long maxQueryTime;

        @NameInMap("MaxScanSize")
        private Long maxScanSize;

        @NameInMap("PatternCreationTime")
        private String patternCreationTime;

        @NameInMap("PatternId")
        private String patternId;

        @NameInMap("QueryCount")
        private Long queryCount;

        @NameInMap("SQLPattern")
        private String SQLPattern;

        @NameInMap("Tables")
        private String tables;

        @NameInMap("User")
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
             * AccessIp.
             */
            public Builder accessIp(String accessIp) {
                this.accessIp = accessIp;
                return this;
            }

            /**
             * AverageExecutionTime.
             */
            public Builder averageExecutionTime(Double averageExecutionTime) {
                this.averageExecutionTime = averageExecutionTime;
                return this;
            }

            /**
             * AveragePeakMemory.
             */
            public Builder averagePeakMemory(Double averagePeakMemory) {
                this.averagePeakMemory = averagePeakMemory;
                return this;
            }

            /**
             * AverageQueryTime.
             */
            public Builder averageQueryTime(Double averageQueryTime) {
                this.averageQueryTime = averageQueryTime;
                return this;
            }

            /**
             * AverageScanSize.
             */
            public Builder averageScanSize(Double averageScanSize) {
                this.averageScanSize = averageScanSize;
                return this;
            }

            /**
             * Blockable.
             */
            public Builder blockable(Boolean blockable) {
                this.blockable = blockable;
                return this;
            }

            /**
             * FailedCount.
             */
            public Builder failedCount(Long failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * MaxExecutionTime.
             */
            public Builder maxExecutionTime(Long maxExecutionTime) {
                this.maxExecutionTime = maxExecutionTime;
                return this;
            }

            /**
             * MaxPeakMemory.
             */
            public Builder maxPeakMemory(Long maxPeakMemory) {
                this.maxPeakMemory = maxPeakMemory;
                return this;
            }

            /**
             * MaxQueryTime.
             */
            public Builder maxQueryTime(Long maxQueryTime) {
                this.maxQueryTime = maxQueryTime;
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
             * PatternCreationTime.
             */
            public Builder patternCreationTime(String patternCreationTime) {
                this.patternCreationTime = patternCreationTime;
                return this;
            }

            /**
             * PatternId.
             */
            public Builder patternId(String patternId) {
                this.patternId = patternId;
                return this;
            }

            /**
             * QueryCount.
             */
            public Builder queryCount(Long queryCount) {
                this.queryCount = queryCount;
                return this;
            }

            /**
             * SQLPattern.
             */
            public Builder SQLPattern(String SQLPattern) {
                this.SQLPattern = SQLPattern;
                return this;
            }

            /**
             * Tables.
             */
            public Builder tables(String tables) {
                this.tables = tables;
                return this;
            }

            /**
             * User.
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
