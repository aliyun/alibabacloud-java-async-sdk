// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeSecurityEventTimeSeriesMetricResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityEventTimeSeriesMetricResponseBody</p>
 */
public class DescribeSecurityEventTimeSeriesMetricResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityEventTimeSeries")
    private java.util.List<SecurityEventTimeSeries> securityEventTimeSeries;

    @com.aliyun.core.annotation.NameInMap("TimeSeriesMetaData")
    private TimeSeriesMetaData timeSeriesMetaData;

    private DescribeSecurityEventTimeSeriesMetricResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityEventTimeSeries = builder.securityEventTimeSeries;
        this.timeSeriesMetaData = builder.timeSeriesMetaData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityEventTimeSeriesMetricResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityEventTimeSeries
     */
    public java.util.List<SecurityEventTimeSeries> getSecurityEventTimeSeries() {
        return this.securityEventTimeSeries;
    }

    /**
     * @return timeSeriesMetaData
     */
    public TimeSeriesMetaData getTimeSeriesMetaData() {
        return this.timeSeriesMetaData;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SecurityEventTimeSeries> securityEventTimeSeries; 
        private TimeSeriesMetaData timeSeriesMetaData; 

        private Builder() {
        } 

        private Builder(DescribeSecurityEventTimeSeriesMetricResponseBody model) {
            this.requestId = model.requestId;
            this.securityEventTimeSeries = model.securityEventTimeSeries;
            this.timeSeriesMetaData = model.timeSeriesMetaData;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D827FCFE-90A7-4330-9326-D33C8B4C7726</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time series data returned. This operation can return time series for multiple metrics.</p>
         */
        public Builder securityEventTimeSeries(java.util.List<SecurityEventTimeSeries> securityEventTimeSeries) {
            this.securityEventTimeSeries = securityEventTimeSeries;
            return this;
        }

        /**
         * <p>The metadata of the time series data returned.</p>
         */
        public Builder timeSeriesMetaData(TimeSeriesMetaData timeSeriesMetaData) {
            this.timeSeriesMetaData = timeSeriesMetaData;
            return this;
        }

        public DescribeSecurityEventTimeSeriesMetricResponseBody build() {
            return new DescribeSecurityEventTimeSeriesMetricResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecurityEventTimeSeriesMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityEventTimeSeriesMetricResponseBody</p>
     */
    public static class SecurityEventTimeSeries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Metric")
        private String metric;

        @com.aliyun.core.annotation.NameInMap("Timestamps")
        private java.util.List<String> timestamps;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<Long> values;

        private SecurityEventTimeSeries(Builder builder) {
            this.metric = builder.metric;
            this.timestamps = builder.timestamps;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityEventTimeSeries create() {
            return builder().build();
        }

        /**
         * @return metric
         */
        public String getMetric() {
            return this.metric;
        }

        /**
         * @return timestamps
         */
        public java.util.List<String> getTimestamps() {
            return this.timestamps;
        }

        /**
         * @return values
         */
        public java.util.List<Long> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String metric; 
            private java.util.List<String> timestamps; 
            private java.util.List<Long> values; 

            private Builder() {
            } 

            private Builder(SecurityEventTimeSeries model) {
                this.metric = model.metric;
                this.timestamps = model.timestamps;
                this.values = model.values;
            } 

            /**
             * <p>The metric. This value is the same as the value of Metric in the request parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>monitored_requests</p>
             */
            public Builder metric(String metric) {
                this.metric = metric;
                return this;
            }

            /**
             * <p>The time points. Each point represents a time range.</p>
             */
            public Builder timestamps(java.util.List<String> timestamps) {
                this.timestamps = timestamps;
                return this;
            }

            /**
             * <p>The data points. Each point represents a count for a time range.</p>
             */
            public Builder values(java.util.List<Long> values) {
                this.values = values;
                return this;
            }

            public SecurityEventTimeSeries build() {
                return new SecurityEventTimeSeries(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSecurityEventTimeSeriesMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityEventTimeSeriesMetricResponseBody</p>
     */
    public static class DateRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndDate")
        private Long endDate;

        @com.aliyun.core.annotation.NameInMap("StartDate")
        private Long startDate;

        private DateRange(Builder builder) {
            this.endDate = builder.endDate;
            this.startDate = builder.startDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DateRange create() {
            return builder().build();
        }

        /**
         * @return endDate
         */
        public Long getEndDate() {
            return this.endDate;
        }

        /**
         * @return startDate
         */
        public Long getStartDate() {
            return this.startDate;
        }

        public static final class Builder {
            private Long endDate; 
            private Long startDate; 

            private Builder() {
            } 

            private Builder(DateRange model) {
                this.endDate = model.endDate;
                this.startDate = model.startDate;
            } 

            /**
             * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds. This value is the same as the value of EndDate in the request parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>1713888600</p>
             */
            public Builder endDate(Long endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds. This value is the same as the value of StartDate in the request parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>1713888000</p>
             */
            public Builder startDate(Long startDate) {
                this.startDate = startDate;
                return this;
            }

            public DateRange build() {
                return new DateRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSecurityEventTimeSeriesMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityEventTimeSeriesMetricResponseBody</p>
     */
    public static class TimeSeriesMetaData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AggregateInterval")
        private String aggregateInterval;

        @com.aliyun.core.annotation.NameInMap("DateRange")
        private DateRange dateRange;

        @com.aliyun.core.annotation.NameInMap("Units")
        private String units;

        private TimeSeriesMetaData(Builder builder) {
            this.aggregateInterval = builder.aggregateInterval;
            this.dateRange = builder.dateRange;
            this.units = builder.units;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeSeriesMetaData create() {
            return builder().build();
        }

        /**
         * @return aggregateInterval
         */
        public String getAggregateInterval() {
            return this.aggregateInterval;
        }

        /**
         * @return dateRange
         */
        public DateRange getDateRange() {
            return this.dateRange;
        }

        /**
         * @return units
         */
        public String getUnits() {
            return this.units;
        }

        public static final class Builder {
            private String aggregateInterval; 
            private DateRange dateRange; 
            private String units; 

            private Builder() {
            } 

            private Builder(TimeSeriesMetaData model) {
                this.aggregateInterval = model.aggregateInterval;
                this.dateRange = model.dateRange;
                this.units = model.units;
            } 

            /**
             * <p>The time granularity of data points in the time series data returned. For example, a value of 15m indicates that data points are collected at 15-minute intervals. For more information about the supported time granularities, see the &quot;<strong>Time granularities for data points in time series records</strong>&quot; section of the <strong>DescribeNetworkFlowTimeSeriesMetric</strong> topic.</p>
             * 
             * <strong>example:</strong>
             * <p>1m</p>
             */
            public Builder aggregateInterval(String aggregateInterval) {
                this.aggregateInterval = aggregateInterval;
                return this;
            }

            /**
             * <p>The time range that is used for the query.</p>
             */
            public Builder dateRange(DateRange dateRange) {
                this.dateRange = dateRange;
                return this;
            }

            /**
             * <p>The unit of the returned data. Defaults to the value: request.</p>
             * 
             * <strong>example:</strong>
             * <p>requests</p>
             */
            public Builder units(String units) {
                this.units = units;
                return this;
            }

            public TimeSeriesMetaData build() {
                return new TimeSeriesMetaData(this);
            } 

        } 

    }
}
