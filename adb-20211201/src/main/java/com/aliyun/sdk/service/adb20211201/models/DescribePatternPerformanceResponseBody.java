// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePatternPerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePatternPerformanceResponseBody</p>
 */
public class DescribePatternPerformanceResponseBody extends TeaModel {
    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("Performances")
    private java.util.List < Performances> performances;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
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
         * The end time of the query. The time follows the ISO 8601 standard in the *yyyy-MM-ddTHH:mmZ* format. The time is displayed in UTC.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The name of the performance metric value. Valid values:
         * <p>
         * 
         * *   When the `Key` parameter is set to `AnalyticDB_PatternQueryCount`, `pattern_query_count` is returned, which indicates the number of executions of the SQL statements in association with the SQL pattern.
         * 
         * *   When the `Key` value is `AnalyticDB_PatternQueryTime`, the following values are returned:
         * 
         *     *   `average_query_time`, which indicates the average total amount of time consumed by the SQL statements in association with the SQL pattern.
         *     *   `max_query_time`, which indicates the maximum total amount of time consumed by the SQL statements in association with the SQL pattern.
         * 
         * *   When the `Key` value is `AnalyticDB_PatternExecutionTime`, the following values are returned:
         * 
         *     *   `average_execution_time`, which indicates the average execution duration of the SQL statements in association with the SQL pattern.
         *     *   `max_execution_time`, which indicates the maximum execution duration of the SQL statements in association with the SQL pattern.
         * 
         * *   When the `Key` value is `AnalyticDB_PatternPeakMemory`, the following values are returned:
         * 
         *     *   `average_peak_memory`, which indicates the average peak memory usage of the SQL statements in association with the SQL pattern.
         *     *   `max_peak_memory`, which indicates the maximum peak memory usage of the SQL statements in association with the SQL pattern.
         * 
         * *   When the `Key` value is `AnalyticDB_PatternScanSize`, the following values are returned:
         * 
         *     *   `average_scan_size`, which indicates the average amount of data scanned by the SQL statements in association with the SQL pattern.
         *     *   `max_scan_size`, which indicates the maximum amount of data scanned by the SQL statements in association with the SQL pattern.
         */
        public Builder performances(java.util.List < Performances> performances) {
            this.performances = performances;
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
         * The start time of the query. The time follows the ISO 8601 standard in the *yyyy-MM-ddTHH:mmZ* format. The time is displayed in UTC.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribePatternPerformanceResponseBody build() {
            return new DescribePatternPerformanceResponseBody(this);
        } 

    } 

    public static class Series extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Values")
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Values.
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
    public static class Performances extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Series")
        private java.util.List < Series> series;

        @NameInMap("Unit")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Series.
             */
            public Builder series(java.util.List < Series> series) {
                this.series = series;
                return this;
            }

            /**
             * Unit.
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
