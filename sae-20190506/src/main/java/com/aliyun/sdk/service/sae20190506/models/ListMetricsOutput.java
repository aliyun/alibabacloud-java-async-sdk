// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMetricsOutput} extends {@link TeaModel}
 *
 * <p>ListMetricsOutput</p>
 */
public class ListMetricsOutput extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("metrics")
    private java.util.Map < String, java.util.List<MetricInfo>> metrics;

    private ListMetricsOutput(Builder builder) {
        this.requestId = builder.requestId;
        this.metrics = builder.metrics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMetricsOutput create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return metrics
     */
    public java.util.Map < String, java.util.List<MetricInfo>> getMetrics() {
        return this.metrics;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map < String, java.util.List<MetricInfo>> metrics; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * metrics.
         */
        public Builder metrics(java.util.Map < String, java.util.List<MetricInfo>> metrics) {
            this.metrics = metrics;
            return this;
        }

        public ListMetricsOutput build() {
            return new ListMetricsOutput(this);
        } 

    } 

}
