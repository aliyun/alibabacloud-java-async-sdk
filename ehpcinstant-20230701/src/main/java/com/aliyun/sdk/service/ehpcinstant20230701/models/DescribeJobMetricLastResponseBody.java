// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link DescribeJobMetricLastResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeJobMetricLastResponseBody</p>
 */
public class DescribeJobMetricLastResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Metrics")
    private java.util.List<Metrics> metrics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeJobMetricLastResponseBody(Builder builder) {
        this.metrics = builder.metrics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobMetricLastResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metrics
     */
    public java.util.List<Metrics> getMetrics() {
        return this.metrics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Metrics> metrics; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeJobMetricLastResponseBody model) {
            this.metrics = model.metrics;
            this.requestId = model.requestId;
        } 

        /**
         * Metrics.
         */
        public Builder metrics(java.util.List<Metrics> metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeJobMetricLastResponseBody build() {
            return new DescribeJobMetricLastResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeJobMetricLastResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobMetricLastResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArrayIndex")
        private Integer arrayIndex;

        @com.aliyun.core.annotation.NameInMap("Metric")
        private String metric;

        private Metrics(Builder builder) {
            this.arrayIndex = builder.arrayIndex;
            this.metric = builder.metric;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return arrayIndex
         */
        public Integer getArrayIndex() {
            return this.arrayIndex;
        }

        /**
         * @return metric
         */
        public String getMetric() {
            return this.metric;
        }

        public static final class Builder {
            private Integer arrayIndex; 
            private String metric; 

            private Builder() {
            } 

            private Builder(Metrics model) {
                this.arrayIndex = model.arrayIndex;
                this.metric = model.metric;
            } 

            /**
             * ArrayIndex.
             */
            public Builder arrayIndex(Integer arrayIndex) {
                this.arrayIndex = arrayIndex;
                return this;
            }

            /**
             * Metric.
             */
            public Builder metric(String metric) {
                this.metric = metric;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
}
