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
 * {@link DescribePatternPerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePatternPerformanceResponseBody</p>
 */
public class DescribePatternPerformanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessIp")
    private String accessIp;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("FailedCount")
    private Long failedCount;

    @com.aliyun.core.annotation.NameInMap("Performances")
    private java.util.List<Performances> performances;

    @com.aliyun.core.annotation.NameInMap("QueryCount")
    private Long queryCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SQLPattern")
    private String SQLPattern;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Tables")
    private String tables;

    @com.aliyun.core.annotation.NameInMap("User")
    private String user;

    private DescribePatternPerformanceResponseBody(Builder builder) {
        this.accessIp = builder.accessIp;
        this.endTime = builder.endTime;
        this.failedCount = builder.failedCount;
        this.performances = builder.performances;
        this.queryCount = builder.queryCount;
        this.requestId = builder.requestId;
        this.SQLPattern = builder.SQLPattern;
        this.startTime = builder.startTime;
        this.tables = builder.tables;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePatternPerformanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessIp
     */
    public String getAccessIp() {
        return this.accessIp;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return failedCount
     */
    public Long getFailedCount() {
        return this.failedCount;
    }

    /**
     * @return performances
     */
    public java.util.List<Performances> getPerformances() {
        return this.performances;
    }

    /**
     * @return queryCount
     */
    public Long getQueryCount() {
        return this.queryCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SQLPattern
     */
    public String getSQLPattern() {
        return this.SQLPattern;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
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
        private String endTime; 
        private Long failedCount; 
        private java.util.List<Performances> performances; 
        private Long queryCount; 
        private String requestId; 
        private String SQLPattern; 
        private String startTime; 
        private String tables; 
        private String user; 

        private Builder() {
        } 

        private Builder(DescribePatternPerformanceResponseBody model) {
            this.accessIp = model.accessIp;
            this.endTime = model.endTime;
            this.failedCount = model.failedCount;
            this.performances = model.performances;
            this.queryCount = model.queryCount;
            this.requestId = model.requestId;
            this.SQLPattern = model.SQLPattern;
            this.startTime = model.startTime;
            this.tables = model.tables;
            this.user = model.user;
        } 

        /**
         * <p>The client IP address that submitted the queries that match the sql pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.14.*</p>
         */
        public Builder accessIp(String accessIp) {
            this.accessIp = accessIp;
            return this;
        }

        /**
         * <p>The end of the query time range. The time is in UTC and is formatted as <em>yyyy-MM-ddTHH:mmZ</em>.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-22T01:06:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The number of failed executions for the sql pattern within the query time range.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder failedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * <p>The performance metrics.</p>
         */
        public Builder performances(java.util.List<Performances> performances) {
            this.performances = performances;
            return this;
        }

        /**
         * <p>The number of executions for the sql pattern within the query time range.</p>
         * 
         * <strong>example:</strong>
         * <p>1202</p>
         */
        public Builder queryCount(Long queryCount) {
            this.queryCount = queryCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F21AF487-B8C9-57E0-8E3A-A92BC3611FB6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The SQL statement for the sql pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT *nFROM HIVE.<code>ADB_EXTERNAL_TPCH_10GB</code>.<code>External_customer</code>nLIMIT ?</p>
         */
        public Builder SQLPattern(String SQLPattern) {
            this.SQLPattern = SQLPattern;
            return this;
        }

        /**
         * <p>The start of the query time range. The time is in UTC and is formatted as <em>yyyy-MM-ddTHH:mmZ</em>.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-21T02:15:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The tables queried by the sql pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>tpch_1g.part;tpch_1g.supplier;tpch_1g.lineitem;tpch_1g.partsupp;tpch_1g.orders;tpch_1g.nation</p>
         */
        public Builder tables(String tables) {
            this.tables = tables;
            return this;
        }

        /**
         * <p>The database account that executes the SQL statements.</p>
         * 
         * <strong>example:</strong>
         * <p>test_user</p>
         */
        public Builder user(String user) {
            this.user = user;
            return this;
        }

        public DescribePatternPerformanceResponseBody build() {
            return new DescribePatternPerformanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePatternPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePatternPerformanceResponseBody</p>
     */
    public static class Series extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private Series(Builder builder) {
            this.name = builder.name;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Series create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(Series model) {
                this.name = model.name;
                this.values = model.values;
            } 

            /**
             * <p>The name of the performance value. The value of this parameter varies based on the value of <code>Key</code>:</p>
             * <ul>
             * <li><p>If <code>Key</code> is <code>AnalyticDB_PatternQueryCount</code>, this parameter returns <code>pattern_query_count</code>, which indicates the query count for the sql pattern.</p>
             * </li>
             * <li><p>If <code>Key</code> is <code>AnalyticDB_PatternQueryTime</code>, this parameter can be one of the following values:</p>
             * <ul>
             * <li><p><code>average_query_time</code>: the average total time of queries that match the sql pattern.</p>
             * </li>
             * <li><p><code>max_query_time</code>: the maximum total time of queries that match the sql pattern.</p>
             * </li>
             * </ul>
             * </li>
             * <li><p>If <code>Key</code> is <code>AnalyticDB_PatternExecutionTime</code>, this parameter can be one of the following values:</p>
             * <ul>
             * <li><p><code>average_execution_time</code>: the average execution time of queries that match the sql pattern.</p>
             * </li>
             * <li><p><code>max_execution_time</code>: the maximum execution time of queries that match the sql pattern.</p>
             * </li>
             * </ul>
             * </li>
             * <li><p>If <code>Key</code> is <code>AnalyticDB_PatternPeakMemory</code>, this parameter can be one of the following values:</p>
             * <ul>
             * <li><p><code>average_peak_memory</code>: the average peak memory usage of queries that match the sql pattern.</p>
             * </li>
             * <li><p><code>max_peak_memory</code>: the maximum peak memory usage of queries that match the sql pattern.</p>
             * </li>
             * </ul>
             * </li>
             * <li><p>If <code>Key</code> is <code>AnalyticDB_PatternScanSize</code>, this parameter can be one of the following values:</p>
             * <ul>
             * <li><p><code>average_scan_size</code>: the average data scan size of queries that match the sql pattern.</p>
             * </li>
             * <li><p><code>max_scan_size</code>: the maximum data scan size of queries that match the sql pattern.</p>
             * </li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>max_query_time</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of performance values.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public Series build() {
                return new Series(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePatternPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePatternPerformanceResponseBody</p>
     */
    public static class Performances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Series")
        private java.util.List<Series> series;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        private Performances(Builder builder) {
            this.key = builder.key;
            this.series = builder.series;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Performances create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return series
         */
        public java.util.List<Series> getSeries() {
            return this.series;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String key; 
            private java.util.List<Series> series; 
            private String unit; 

            private Builder() {
            } 

            private Builder(Performances model) {
                this.key = model.key;
                this.series = model.series;
                this.unit = model.unit;
            } 

            /**
             * <p>The performance metric. Valid values:</p>
             * <ul>
             * <li><p><strong>AnalyticDB_PatternQueryCount</strong>: The total number of queries that match the sql pattern.</p>
             * </li>
             * <li><p><strong>AnalyticDB_PatternQueryTime</strong>: The total time for queries that match the sql pattern.</p>
             * </li>
             * <li><p><strong>AnalyticDB_PatternExecutionTime</strong>: The total execution time of queries that match the sql pattern.</p>
             * </li>
             * <li><p><strong>AnalyticDB_PatternPeakMemory</strong>: The peak memory usage of queries that match the sql pattern.</p>
             * </li>
             * <li><p><strong>AnalyticDB_PatternScanSize</strong>: The total data scan size of queries that match the sql pattern.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AnalyticDB_PatternExecutionTime</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The time series data for the performance metric.</p>
             */
            public Builder series(java.util.List<Series> series) {
                this.series = series;
                return this;
            }

            /**
             * <p>The unit of the performance metric. The returned unit varies based on the value of <code>Key</code>:</p>
             * <ul>
             * <li><p>If <code>Key</code> is <code>AnalyticDB_PatternQueryTime</code> or <code>AnalyticDB_PatternExecutionTime</code>, the unit is <strong>ms</strong>.</p>
             * </li>
             * <li><p>If <code>Key</code> is <code>AnalyticDB_PatternPeakMemory</code>, the unit is <strong>MB</strong>.</p>
             * </li>
             * <li><p>If <code>Key</code> is <code>AnalyticDB_PatternScanSize</code>, the unit is <strong>MB</strong>.</p>
             * </li>
             * <li><p>If <code>Key</code> is <code>AnalyticDB_PatternQueryCount</code>, this parameter is empty.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ms</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Performances build() {
                return new Performances(this);
            } 

        } 

    }
}
