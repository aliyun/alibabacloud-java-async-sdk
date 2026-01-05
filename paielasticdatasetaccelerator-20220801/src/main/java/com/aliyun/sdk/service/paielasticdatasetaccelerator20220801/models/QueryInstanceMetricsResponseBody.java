// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

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
 * {@link QueryInstanceMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryInstanceMetricsResponseBody</p>
 */
public class QueryInstanceMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Metrics")
    private java.util.List<Metric> metrics;

    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metrics
     */
    public java.util.List<Metric> getMetrics() {
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
        private java.util.List<Metric> metrics; 
        private String period; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryInstanceMetricsResponseBody model) {
            this.metrics = model.metrics;
            this.period = model.period;
            this.requestId = model.requestId;
        } 

        /**
         * Metrics.
         */
        public Builder metrics(java.util.List<Metric> metrics) {
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>A731A84D-55C9-44F7-99BB-E1CF0CF19197</p>
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
