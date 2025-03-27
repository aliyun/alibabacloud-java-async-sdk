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
 * {@link DescribeNetworkFlowTimeSeriesMetricResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkFlowTimeSeriesMetricResponseBody</p>
 */
public class DescribeNetworkFlowTimeSeriesMetricResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkFlowTimeSeries")
    private java.util.List<NetworkFlowTimeSeries> networkFlowTimeSeries;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TimeSeriesMetaData")
    private TimeSeriesMetaData timeSeriesMetaData;

    private DescribeNetworkFlowTimeSeriesMetricResponseBody(Builder builder) {
        this.networkFlowTimeSeries = builder.networkFlowTimeSeries;
        this.requestId = builder.requestId;
        this.timeSeriesMetaData = builder.timeSeriesMetaData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkFlowTimeSeriesMetricResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkFlowTimeSeries
     */
    public java.util.List<NetworkFlowTimeSeries> getNetworkFlowTimeSeries() {
        return this.networkFlowTimeSeries;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timeSeriesMetaData
     */
    public TimeSeriesMetaData getTimeSeriesMetaData() {
        return this.timeSeriesMetaData;
    }

    public static final class Builder {
        private java.util.List<NetworkFlowTimeSeries> networkFlowTimeSeries; 
        private String requestId; 
        private TimeSeriesMetaData timeSeriesMetaData; 

        private Builder() {
        } 

        private Builder(DescribeNetworkFlowTimeSeriesMetricResponseBody model) {
            this.networkFlowTimeSeries = model.networkFlowTimeSeries;
            this.requestId = model.requestId;
            this.timeSeriesMetaData = model.timeSeriesMetaData;
        } 

        /**
         * <p>The array of time-series data. Supports returning data with multiple values.</p>
         */
        public Builder networkFlowTimeSeries(java.util.List<NetworkFlowTimeSeries> networkFlowTimeSeries) {
            this.networkFlowTimeSeries = networkFlowTimeSeries;
            return this;
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
         * <p>The time series metadata.</p>
         */
        public Builder timeSeriesMetaData(TimeSeriesMetaData timeSeriesMetaData) {
            this.timeSeriesMetaData = timeSeriesMetaData;
            return this;
        }

        public DescribeNetworkFlowTimeSeriesMetricResponseBody build() {
            return new DescribeNetworkFlowTimeSeriesMetricResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNetworkFlowTimeSeriesMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkFlowTimeSeriesMetricResponseBody</p>
     */
    public static class NetworkFlowTimeSeries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Metric")
        private String metric;

        @com.aliyun.core.annotation.NameInMap("Timestamps")
        private java.util.List<String> timestamps;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<Long> values;

        private NetworkFlowTimeSeries(Builder builder) {
            this.metric = builder.metric;
            this.timestamps = builder.timestamps;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkFlowTimeSeries create() {
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

            private Builder(NetworkFlowTimeSeries model) {
                this.metric = model.metric;
                this.timestamps = model.timestamps;
                this.values = model.values;
            } 

            /**
             * <p>The metric name, consistent with the Metric request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>total_requests</p>
             */
            public Builder metric(String metric) {
                this.metric = metric;
                return this;
            }

            /**
             * <p>The array of timestamps (seconds) marking the start of each time interval.</p>
             */
            public Builder timestamps(java.util.List<String> timestamps) {
                this.timestamps = timestamps;
                return this;
            }

            /**
             * <p>The array of counts, each representing the count for the corresponding time interval.</p>
             */
            public Builder values(java.util.List<Long> values) {
                this.values = values;
                return this;
            }

            public NetworkFlowTimeSeries build() {
                return new NetworkFlowTimeSeries(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkFlowTimeSeriesMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkFlowTimeSeriesMetricResponseBody</p>
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
             * <p>The end time of the query range (in UNIX timestamp, seconds). Same as the EndDate request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1713888600</p>
             */
            public Builder endDate(Long endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>The start time of the query range (in UNIX timestamp, seconds). It is the same as the StartDate request parameter.</p>
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
     * {@link DescribeNetworkFlowTimeSeriesMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkFlowTimeSeriesMetricResponseBody</p>
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
             * <p>The time granularity. For example, &quot;15m&quot; indicates that each data point is counted every 15 minutes. For details, see <strong>Time granularity of time series data points</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;1m&quot;</p>
             */
            public Builder aggregateInterval(String aggregateInterval) {
                this.aggregateInterval = aggregateInterval;
                return this;
            }

            /**
             * <p>The query time range.</p>
             */
            public Builder dateRange(DateRange dateRange) {
                this.dateRange = dateRange;
                return this;
            }

            /**
             * <p>The unit of the returned data. Defaults to the value: request.</p>
             * 
             * <strong>example:</strong>
             * <p>request</p>
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
