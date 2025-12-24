// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link QueryHistoricalMetricResponseBody} extends {@link TeaModel}
 *
 * <p>QueryHistoricalMetricResponseBody</p>
 */
public class QueryHistoricalMetricResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HistoricalMetrics")
    private HistoricalMetrics historicalMetrics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryHistoricalMetricResponseBody(Builder builder) {
        this.historicalMetrics = builder.historicalMetrics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryHistoricalMetricResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return historicalMetrics
     */
    public HistoricalMetrics getHistoricalMetrics() {
        return this.historicalMetrics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private HistoricalMetrics historicalMetrics; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryHistoricalMetricResponseBody model) {
            this.historicalMetrics = model.historicalMetrics;
            this.requestId = model.requestId;
        } 

        /**
         * HistoricalMetrics.
         */
        public Builder historicalMetrics(HistoricalMetrics historicalMetrics) {
            this.historicalMetrics = historicalMetrics;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryHistoricalMetricResponseBody build() {
            return new QueryHistoricalMetricResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryHistoricalMetricResponseBody} extends {@link TeaModel}
     *
     * <p>QueryHistoricalMetricResponseBody</p>
     */
    public static class HistoricalMetric extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetricValue")
        private String metricValue;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private HistoricalMetric(Builder builder) {
            this.metricValue = builder.metricValue;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HistoricalMetric create() {
            return builder().build();
        }

        /**
         * @return metricValue
         */
        public String getMetricValue() {
            return this.metricValue;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String metricValue; 
            private String time; 

            private Builder() {
            } 

            private Builder(HistoricalMetric model) {
                this.metricValue = model.metricValue;
                this.time = model.time;
            } 

            /**
             * MetricValue.
             */
            public Builder metricValue(String metricValue) {
                this.metricValue = metricValue;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public HistoricalMetric build() {
                return new HistoricalMetric(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryHistoricalMetricResponseBody} extends {@link TeaModel}
     *
     * <p>QueryHistoricalMetricResponseBody</p>
     */
    public static class HistoricalMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HistoricalMetric")
        private java.util.List<HistoricalMetric> historicalMetric;

        private HistoricalMetrics(Builder builder) {
            this.historicalMetric = builder.historicalMetric;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HistoricalMetrics create() {
            return builder().build();
        }

        /**
         * @return historicalMetric
         */
        public java.util.List<HistoricalMetric> getHistoricalMetric() {
            return this.historicalMetric;
        }

        public static final class Builder {
            private java.util.List<HistoricalMetric> historicalMetric; 

            private Builder() {
            } 

            private Builder(HistoricalMetrics model) {
                this.historicalMetric = model.historicalMetric;
            } 

            /**
             * HistoricalMetric.
             */
            public Builder historicalMetric(java.util.List<HistoricalMetric> historicalMetric) {
                this.historicalMetric = historicalMetric;
                return this;
            }

            public HistoricalMetrics build() {
                return new HistoricalMetrics(this);
            } 

        } 

    }
}
