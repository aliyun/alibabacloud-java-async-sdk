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
         * <p>The IP address of the SQL client that submits the SQL pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.14.*</p>
         */
        public Builder accessIp(String accessIp) {
            this.accessIp = accessIp;
            return this;
        }

        /**
         * <p>The end time of the query. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-18T18:05Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The number of failed SQL patterns within the time range.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder failedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * <p>The queried performance metrics.</p>
         */
        public Builder performances(java.util.List<Performances> performances) {
            this.performances = performances;
            return this;
        }

        /**
         * <p>The number of queries executed in association with the SQL pattern within the time range.</p>
         * 
         * <strong>example:</strong>
         * <p>35018</p>
         */
        public Builder queryCount(Long queryCount) {
            this.queryCount = queryCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>210f47011634026610213529******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The SQL statement that represents the SQL pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT *nFROM HIVE.<code>ADB_EXTERNAL_TPCH_10GB</code>.<code>External_customer</code>nLIMIT ?</p>
         */
        public Builder SQLPattern(String SQLPattern) {
            this.SQLPattern = SQLPattern;
            return this;
        }

        /**
         * <p>The start time of the query. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-18T00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The tables that are in association with the SQL pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>tpch_1g.part;tpch_1g.supplier;tpch_1g.lineitem;tpch_1g.partsupp;tpch_1g.orders;tpch_1g.nation</p>
         */
        public Builder tables(String tables) {
            this.tables = tables;
            return this;
        }

        /**
         * <p>The database account that is used to execute the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
             * <p>The name of the performance metric value. Valid values:</p>
             * <ul>
             * <li><p>When the <code>Key</code> parameter is set to <code>AnalyticDB_PatternQueryCount</code>, <code>pattern_query_count</code> is returned, which indicates the number of executions of the SQL statements in association with the SQL pattern.</p>
             * </li>
             * <li><p>When the <code>Key</code> parameter is set to <code>AnalyticDB_PatternQueryTime</code>, the following values are returned:</p>
             * <ul>
             * <li><code>average_query_time</code>, which indicates the average total amount of time consumed by the SQL statements in association with the SQL pattern.</li>
             * <li><code>max_query_time</code>, which indicates the maximum total amount of time consumed by the SQL statements in association with the SQL pattern.</li>
             * </ul>
             * </li>
             * <li><p>When the <code>Key</code> parameter is set to <code>AnalyticDB_PatternExecutionTime</code>, the following values are returned:</p>
             * <ul>
             * <li><code>average_execution_time</code>, which indicates the average execution duration of the SQL statements in association with the SQL pattern.</li>
             * <li><code>max_execution_time</code>, which indicates the maximum execution duration of the SQL statements in association with the SQL pattern.</li>
             * </ul>
             * </li>
             * <li><p>When the <code>Key</code> parameter is set to <code>AnalyticDB_PatternPeakMemory</code>, the following values are returned:</p>
             * <ul>
             * <li><code>average_peak_memory</code>, which indicates the average peak memory usage of the SQL statements in association with the SQL pattern.</li>
             * <li><code>max_peak_memory</code>, which indicates the maximum peak memory usage of the SQL statements in association with the SQL pattern.</li>
             * </ul>
             * </li>
             * <li><p>When the <code>Key</code> parameter is set <code>AnalyticDB_PatternScanSize</code>, the following values are returned:</p>
             * <ul>
             * <li><code>average_scan_size</code>, which indicates the average amount of data scanned by the SQL statements in association with the SQL pattern.</li>
             * <li><code>max_scan_size</code>, which indicates the maximum amount of data scanned by the SQL statements in association with the SQL pattern.</li>
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
             * <p>The queried performance metrics.</p>
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
             * <p>The performance metric that was queried. Valid values:</p>
             * <ul>
             * <li><strong>AnalyticDB_PatternQueryCount</strong>: the total number of queries executed in association with the SQL pattern.</li>
             * <li><strong>AnalyticDB_PatternQueryTime</strong>: the total amount of time consumed by the queries executed in association with the SQL pattern.</li>
             * <li><strong>AnalyticDB_PatternExecutionTime</strong>: the total execution duration of the queries executed in association with the SQL pattern.</li>
             * <li><strong>AnalyticDB_PatternPeakMemory</strong>: the peak memory usage of the queries executed in association with the SQL pattern.</li>
             * <li><strong>AnalyticDB_PatternScanSize</strong>: the amount of data scanned in the queries executed in association with the SQL pattern.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AnalyticDB_PatternQueryCount</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The queried performance metrics.</p>
             */
            public Builder series(java.util.List<Series> series) {
                this.series = series;
                return this;
            }

            /**
             * <p>The unit of the performance metric. Valid values:</p>
             * <ul>
             * <li>When the performance metric is related to the query duration (the <code>Key</code> value is <code>AnalyticDB_PatternQueryTime</code> or <code>AnalyticDB_PatternExecutionTime</code>), <strong>ms</strong> is returned.</li>
             * <li>When the performance metric is related to the memory usage (the <code>Key</code> value is <code>AnalyticDB_PatternPeakMemory</code>), <strong>MB</strong> is returned.</li>
             * <li>When the performance metric is related to the amount of data scanned (the <code>Key</code> value is <code>AnalyticDB_PatternScanSize</code>), <strong>MB</strong> is returned.</li>
             * <li>When the performance metric is related to the number of queries (the <code>Key</code> value is <code>AnalyticDB_PatternQueryCount</code>), this parameter is empty.</li>
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
