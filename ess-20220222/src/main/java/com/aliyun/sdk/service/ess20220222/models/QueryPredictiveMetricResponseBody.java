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
 * {@link QueryPredictiveMetricResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPredictiveMetricResponseBody</p>
 */
public class QueryPredictiveMetricResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PredictiveMetrics")
    private PredictiveMetrics predictiveMetrics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryPredictiveMetricResponseBody(Builder builder) {
        this.predictiveMetrics = builder.predictiveMetrics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPredictiveMetricResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return predictiveMetrics
     */
    public PredictiveMetrics getPredictiveMetrics() {
        return this.predictiveMetrics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PredictiveMetrics predictiveMetrics; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryPredictiveMetricResponseBody model) {
            this.predictiveMetrics = model.predictiveMetrics;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Predicted monitoring metrics.</p>
         */
        public Builder predictiveMetrics(PredictiveMetrics predictiveMetrics) {
            this.predictiveMetrics = predictiveMetrics;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CC107349-57B7-4405-B1BF-9BF5AF7F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryPredictiveMetricResponseBody build() {
            return new QueryPredictiveMetricResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryPredictiveMetricResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPredictiveMetricResponseBody</p>
     */
    public static class PredictiveMetric extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetricValue")
        private String metricValue;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private PredictiveMetric(Builder builder) {
            this.metricValue = builder.metricValue;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PredictiveMetric create() {
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

            private Builder(PredictiveMetric model) {
                this.metricValue = model.metricValue;
                this.time = model.time;
            } 

            /**
             * <p>Predicted monitoring value.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0</p>
             */
            public Builder metricValue(String metricValue) {
                this.metricValue = metricValue;
                return this;
            }

            /**
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mmZ format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-17T16:00Z</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public PredictiveMetric build() {
                return new PredictiveMetric(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryPredictiveMetricResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPredictiveMetricResponseBody</p>
     */
    public static class PredictiveMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PredictiveMetric")
        private java.util.List<PredictiveMetric> predictiveMetric;

        private PredictiveMetrics(Builder builder) {
            this.predictiveMetric = builder.predictiveMetric;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PredictiveMetrics create() {
            return builder().build();
        }

        /**
         * @return predictiveMetric
         */
        public java.util.List<PredictiveMetric> getPredictiveMetric() {
            return this.predictiveMetric;
        }

        public static final class Builder {
            private java.util.List<PredictiveMetric> predictiveMetric; 

            private Builder() {
            } 

            private Builder(PredictiveMetrics model) {
                this.predictiveMetric = model.predictiveMetric;
            } 

            /**
             * PredictiveMetric.
             */
            public Builder predictiveMetric(java.util.List<PredictiveMetric> predictiveMetric) {
                this.predictiveMetric = predictiveMetric;
                return this;
            }

            public PredictiveMetrics build() {
                return new PredictiveMetrics(this);
            } 

        } 

    }
}
