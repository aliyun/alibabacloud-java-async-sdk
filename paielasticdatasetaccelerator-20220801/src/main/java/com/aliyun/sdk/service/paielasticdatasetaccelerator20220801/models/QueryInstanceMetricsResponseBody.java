// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryInstanceMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryInstanceMetricsResponseBody</p>
 */
public class QueryInstanceMetricsResponseBody extends TeaModel {
    @NameInMap("Metrics")
    private java.util.List < Metric > metrics;

    @NameInMap("Period")
    private String period;

    @NameInMap("RequestId")
    @Validation(required = true)
    private String requestId;

    private QueryInstanceMetricsResponseBody(Builder builder) {
        this.metrics = builder.metrics;
        this.period = builder.period;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInstanceMetricsResponseBody create() {
        return builder().build();
    }

    /**
     * @return metrics
     */
    public java.util.List < Metric > getMetrics() {
        return this.metrics;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Metric > metrics; 
        private String period; 
        private String requestId; 

        /**
         * Metrics.
         */
        public Builder metrics(java.util.List < Metric > metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(String period) {
            this.period = period;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryInstanceMetricsResponseBody build() {
            return new QueryInstanceMetricsResponseBody(this);
        } 

    } 

}
