// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Performances")
    private java.util.List < Performances> performances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribePatternPerformanceResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.performances = builder.performances;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePatternPerformanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return performances
     */
    public java.util.List < Performances> getPerformances() {
        return this.performances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String endTime; 
        private java.util.List < Performances> performances; 
        private String requestId; 
        private String startTime; 

        /**
         * <p>The end time of the query. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mmZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-22T01:06:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The queried performance metrics.</p>
         */
        public Builder performances(java.util.List < Performances> performances) {
            this.performances = performances;
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
         * <p>The start time of the query. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mmZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-21T02:15:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
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
        private java.util.List < String > values;

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
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private String name; 
            private java.util.List < String > values; 

            /**
             * <p>The name of the performance metric value. Valid values:</p>
             * <ul>
             * <li><p>If the value of <code>Key</code> is <code>AnalyticDB_PatternQueryCount</code>, <code>pattern_query_count</code> is returned, which indicates the number of executions of the SQL statements in association with the SQL pattern.</p>
             * </li>
             * <li><p>If the value of <code>Key</code> is <code>AnalyticDB_PatternQueryTime</code>, the following values are returned:</p>
             * <ul>
             * <li><code>average_query_time</code>, which indicates the average total amount of time consumed by the SQL statements in association with the SQL pattern.</li>
             * <li><code>max_query_time</code>, which indicates the maximum total amount of time consumed by the SQL statements in association with the SQL pattern.</li>
             * </ul>
             * </li>
             * <li><p>If the value of <code>Key</code> is <code>AnalyticDB_PatternExecutionTime</code>, the following values are returned:</p>
             * <ul>
             * <li><code>average_execution_time</code>, which indicates the average execution duration of the SQL statements in association with the SQL pattern.</li>
             * <li><code>max_execution_time</code>, which indicates the maximum execution duration of the SQL statements in association with the SQL pattern.</li>
             * </ul>
             * </li>
             * <li><p>If the value of <code>Key</code> is <code>AnalyticDB_PatternPeakMemory</code>, the following values are returned:</p>
             * <ul>
             * <li><code>average_peak_memory</code>, which indicates the average peak memory usage of the SQL statements in association with the SQL pattern.</li>
             * <li><code>max_peak_memory</code>, which indicates the maximum peak memory usage of the SQL statements in association with the SQL pattern.</li>
             * </ul>
             * </li>
             * <li><p>If the value of <code>Key</code> is <code>AnalyticDB_PatternScanSize</code>, the following values are returned:</p>
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
             * <p>The values of the performance metric.</p>
             */
            public Builder values(java.util.List < String > values) {
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
        private java.util.List < Series> series;

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
        public java.util.List < Series> getSeries() {
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
            private java.util.List < Series> series; 
            private String unit; 

            /**
             * <p>The queried performance metric. Valid values:</p>
             * <ul>
             * <li><strong>AnalyticDB_PatternQueryCount</strong>: the total number of queries executed in association with the SQL pattern.</li>
             * <li><strong>AnalyticDB_PatternQueryTime</strong>: the total amount of time consumed by the queries executed in association with the SQL pattern.</li>
             * <li><strong>AnalyticDB_PatternExecutionTime</strong>: the execution duration of the queries executed in association with the SQL pattern.</li>
             * <li><strong>AnalyticDB_PatternPeakMemory</strong>: the peak memory usage of the queries executed in association with the SQL pattern.</li>
             * <li><strong>AnalyticDB_PatternScanSize</strong>: the amount of data scanned in the queries executed in association with the SQL pattern.</li>
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
             * <p>The values of the performance metrics.</p>
             */
            public Builder series(java.util.List < Series> series) {
                this.series = series;
                return this;
            }

            /**
             * <p>The unit of the performance metric. Valid values:</p>
             * <ul>
             * <li>If the performance metric is related to the query time (the value of <code>Key</code> is <code>AnalyticDB_PatternQueryTime</code> or <code>AnalyticDB_PatternExecutionTime</code>), <strong>ms</strong> is returned.</li>
             * <li>If the performance metric is related to the peak memory usage (the value of <code>Key</code> is <code>AnalyticDB_PatternPeakMemory</code>), <strong>MB</strong> is returned.</li>
             * <li>If the performance metric is related to the amount of data scanned (the value of <code>Key</code> is <code>AnalyticDB_PatternScanSize</code>), <strong>MB</strong> is returned.</li>
             * <li>If the performance metric is related to the number of queries (the value of <code>Key</code> is <code>AnalyticDB_PatternQueryCount</code>), null is returned.</li>
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
