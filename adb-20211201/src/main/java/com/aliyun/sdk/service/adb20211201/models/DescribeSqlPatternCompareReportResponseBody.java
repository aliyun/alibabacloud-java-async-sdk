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
 * {@link DescribeSqlPatternCompareReportResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSqlPatternCompareReportResponseBody</p>
 */
public class DescribeSqlPatternCompareReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("MetricType")
    private String metricType;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("ReportId")
    private Long reportId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSqlPatternCompareReportResponseBody(Builder builder) {
        this.items = builder.items;
        this.metricType = builder.metricType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.reportId = builder.reportId;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSqlPatternCompareReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
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
     * @return reportId
     */
    public Long getReportId() {
        return this.reportId;
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
        private java.util.List<Items> items; 
        private String metricType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long reportId; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSqlPatternCompareReportResponseBody model) {
            this.items = model.items;
            this.metricType = model.metricType;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.reportId = model.reportId;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The Pattern details on the current page. An empty array is returned if no results match the conditions.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The analysis metric. Valid values:</p>
         * <ul>
         * <li><code>QUERY_COUNT</code>: the number of query executions.</li>
         * <li><code>CPU_COST</code>: the CPU consumption.</li>
         * <li><code>SHUFFLE_SIZE</code>: the amount of shuffle data.</li>
         * <li><code>PEAK_MEMORY</code>: the peak memory consumption.</li>
         * <li><code>SCAN_SIZE</code>: the amount of scanned data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CPU_COST</p>
         */
        public Builder metricType(String metricType) {
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>The page number of the returned page, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The maximum number of entries returned per page for this query.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the SQL Pattern comparison report.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder reportId(Long reportId) {
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9A1B2C3D-4E5F-6789-ABCD-0123456789AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of Patterns that match the current report, analysis dimension, and change rate filter conditions. This is not the number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSqlPatternCompareReportResponseBody build() {
            return new DescribeSqlPatternCompareReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSqlPatternCompareReportResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlPatternCompareReportResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgExecutionTime")
        private String avgExecutionTime;

        @com.aliyun.core.annotation.NameInMap("AvgPlanningTime")
        private String avgPlanningTime;

        @com.aliyun.core.annotation.NameInMap("AvgRt")
        private String avgRt;

        @com.aliyun.core.annotation.NameInMap("MaxExecutionTime")
        private String maxExecutionTime;

        @com.aliyun.core.annotation.NameInMap("MaxPlanningTime")
        private String maxPlanningTime;

        @com.aliyun.core.annotation.NameInMap("MaxRt")
        private String maxRt;

        @com.aliyun.core.annotation.NameInMap("MetricValues")
        private java.util.Map<String, ItemsMetricValuesValue> metricValues;

        @com.aliyun.core.annotation.NameInMap("Pattern")
        private String pattern;

        @com.aliyun.core.annotation.NameInMap("QueryCount")
        private Long queryCount;

        @com.aliyun.core.annotation.NameInMap("QueryCountDisplayValue")
        private String queryCountDisplayValue;

        @com.aliyun.core.annotation.NameInMap("Rank")
        private Long rank;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("SqlPatternHash")
        private String sqlPatternHash;

        @com.aliyun.core.annotation.NameInMap("TotalQueryTime")
        private String totalQueryTime;

        @com.aliyun.core.annotation.NameInMap("TotalScanCost")
        private String totalScanCost;

        private Items(Builder builder) {
            this.avgExecutionTime = builder.avgExecutionTime;
            this.avgPlanningTime = builder.avgPlanningTime;
            this.avgRt = builder.avgRt;
            this.maxExecutionTime = builder.maxExecutionTime;
            this.maxPlanningTime = builder.maxPlanningTime;
            this.maxRt = builder.maxRt;
            this.metricValues = builder.metricValues;
            this.pattern = builder.pattern;
            this.queryCount = builder.queryCount;
            this.queryCountDisplayValue = builder.queryCountDisplayValue;
            this.rank = builder.rank;
            this.riskLevel = builder.riskLevel;
            this.sqlPatternHash = builder.sqlPatternHash;
            this.totalQueryTime = builder.totalQueryTime;
            this.totalScanCost = builder.totalScanCost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return avgExecutionTime
         */
        public String getAvgExecutionTime() {
            return this.avgExecutionTime;
        }

        /**
         * @return avgPlanningTime
         */
        public String getAvgPlanningTime() {
            return this.avgPlanningTime;
        }

        /**
         * @return avgRt
         */
        public String getAvgRt() {
            return this.avgRt;
        }

        /**
         * @return maxExecutionTime
         */
        public String getMaxExecutionTime() {
            return this.maxExecutionTime;
        }

        /**
         * @return maxPlanningTime
         */
        public String getMaxPlanningTime() {
            return this.maxPlanningTime;
        }

        /**
         * @return maxRt
         */
        public String getMaxRt() {
            return this.maxRt;
        }

        /**
         * @return metricValues
         */
        public java.util.Map<String, ItemsMetricValuesValue> getMetricValues() {
            return this.metricValues;
        }

        /**
         * @return pattern
         */
        public String getPattern() {
            return this.pattern;
        }

        /**
         * @return queryCount
         */
        public Long getQueryCount() {
            return this.queryCount;
        }

        /**
         * @return queryCountDisplayValue
         */
        public String getQueryCountDisplayValue() {
            return this.queryCountDisplayValue;
        }

        /**
         * @return rank
         */
        public Long getRank() {
            return this.rank;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return sqlPatternHash
         */
        public String getSqlPatternHash() {
            return this.sqlPatternHash;
        }

        /**
         * @return totalQueryTime
         */
        public String getTotalQueryTime() {
            return this.totalQueryTime;
        }

        /**
         * @return totalScanCost
         */
        public String getTotalScanCost() {
            return this.totalScanCost;
        }

        public static final class Builder {
            private String avgExecutionTime; 
            private String avgPlanningTime; 
            private String avgRt; 
            private String maxExecutionTime; 
            private String maxPlanningTime; 
            private String maxRt; 
            private java.util.Map<String, ItemsMetricValuesValue> metricValues; 
            private String pattern; 
            private Long queryCount; 
            private String queryCountDisplayValue; 
            private Long rank; 
            private String riskLevel; 
            private String sqlPatternHash; 
            private String totalQueryTime; 
            private String totalScanCost; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.avgExecutionTime = model.avgExecutionTime;
                this.avgPlanningTime = model.avgPlanningTime;
                this.avgRt = model.avgRt;
                this.maxExecutionTime = model.maxExecutionTime;
                this.maxPlanningTime = model.maxPlanningTime;
                this.maxRt = model.maxRt;
                this.metricValues = model.metricValues;
                this.pattern = model.pattern;
                this.queryCount = model.queryCount;
                this.queryCountDisplayValue = model.queryCountDisplayValue;
                this.rank = model.rank;
                this.riskLevel = model.riskLevel;
                this.sqlPatternHash = model.sqlPatternHash;
                this.totalQueryTime = model.totalQueryTime;
                this.totalScanCost = model.totalScanCost;
            } 

            /**
             * <p>The display string of the average execution duration for Time 2, in seconds. This field is returned only for the CPU_COST dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>0.4s</p>
             */
            public Builder avgExecutionTime(String avgExecutionTime) {
                this.avgExecutionTime = avgExecutionTime;
                return this;
            }

            /**
             * <p>The display string of the average planning duration for Time 2, in seconds. This field is returned only for the CPU_COST dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1s</p>
             */
            public Builder avgPlanningTime(String avgPlanningTime) {
                this.avgPlanningTime = avgPlanningTime;
                return this;
            }

            /**
             * <p>The display string of the average query response time for Time 2, in seconds. This field is returned for all analysis dimensions.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5s</p>
             */
            public Builder avgRt(String avgRt) {
                this.avgRt = avgRt;
                return this;
            }

            /**
             * <p>The display string of the maximum execution duration for Time 2, in seconds. This field is returned only for the CPU_COST dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>1.8s</p>
             */
            public Builder maxExecutionTime(String maxExecutionTime) {
                this.maxExecutionTime = maxExecutionTime;
                return this;
            }

            /**
             * <p>The display string of the maximum planning duration for Time 2, in seconds. This field is returned only for the CPU_COST dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2s</p>
             */
            public Builder maxPlanningTime(String maxPlanningTime) {
                this.maxPlanningTime = maxPlanningTime;
                return this;
            }

            /**
             * <p>The display string of the maximum query response time for Time 2, in seconds. This field is returned for all analysis dimensions.</p>
             * 
             * <strong>example:</strong>
             * <p>2s</p>
             */
            public Builder maxRt(String maxRt) {
                this.maxRt = maxRt;
                return this;
            }

            /**
             * <p>The primary metric mapping for the current analysis dimension. Valid keys:</p>
             * <ul>
             * <li><code>QUERY_COUNT</code>: the number of query executions.</li>
             * <li><code>CPU_COST</code>: the CPU consumption.</li>
             * <li><code>SHUFFLE_SIZE</code>: the shuffle data volume.</li>
             * <li><code>PEAK_MEMORY</code>: the peak memory consumption.</li>
             * <li><code>SCAN_SIZE</code>: the scan data volume.</li>
             * </ul>
             * <blockquote>
             * <p>Each result contains only one key that matches the <code>MetricType</code> request parameter.</p>
             * </blockquote>
             */
            public Builder metricValues(java.util.Map<String, ItemsMetricValuesValue> metricValues) {
                this.metricValues = metricValues;
                return this;
            }

            /**
             * <p>The parameterized SQL Pattern text. This field is empty or not returned when IncludePattern is set to false. When the text is unavailable, a prompt containing a hash identifier may be returned.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM orders WHERE order_id = ?</p>
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            /**
             * <p>The number of query executions for Time 2, in count. This field is returned for the CPU_COST, SHUFFLE_SIZE, PEAK_MEMORY, and SCAN_SIZE dimensions.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder queryCount(Long queryCount) {
                this.queryCount = queryCount;
                return this;
            }

            /**
             * <p>The display string of the number of query executions for Time 2. The applicable scope is the same as QueryCount.</p>
             * 
             * <strong>example:</strong>
             * <p>120 times</p>
             */
            public Builder queryCountDisplayValue(String queryCountDisplayValue) {
                this.queryCountDisplayValue = queryCountDisplayValue;
                return this;
            }

            /**
             * <p>The global sequence number in the current filtered and sorted results, starting from 1 and numbered continuously across pages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder rank(Long rank) {
                this.rank = rank;
                return this;
            }

            /**
             * <p>The change level for the current analysis dimension. Valid values:</p>
             * <ul>
             * <li><code>NEW</code>: A new Pattern. Returned only for NEW reports.</li>
             * <li><code>SLIGHT</code>: A slight change. The average change rate is in the range of (0%, 20%].</li>
             * <li><code>MODERATE</code>: A moderate change. The average change rate is in the range of (20%, 50%].</li>
             * <li><code>HIGH</code>: A high change. The average change rate is in the range of (50%, 100%].</li>
             * <li><code>SEVERE</code>: A severe change. The average change rate is greater than 100%, or the change represents zero-baseline growth.</li>
             * </ul>
             * <blockquote>
             * <p>The change level only indicates the magnitude of metric growth and cannot be used alone to determine the cause of a fault.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SEVERE</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The hash identifier of the SQL Pattern, returned as a string. Store and pass this value as a string to avoid precision loss caused by numeric conversion.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890123456789</p>
             */
            public Builder sqlPatternHash(String sqlPatternHash) {
                this.sqlPatternHash = sqlPatternHash;
                return this;
            }

            /**
             * <p>The display string of the total query duration for Time 2, in seconds. This field is returned only for the QUERY_COUNT dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>60s</p>
             */
            public Builder totalQueryTime(String totalQueryTime) {
                this.totalQueryTime = totalQueryTime;
                return this;
            }

            /**
             * <p>The display string of the total scan duration for Time 2, in seconds. This field is returned only for the SCAN_SIZE dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>12s</p>
             */
            public Builder totalScanCost(String totalScanCost) {
                this.totalScanCost = totalScanCost;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
