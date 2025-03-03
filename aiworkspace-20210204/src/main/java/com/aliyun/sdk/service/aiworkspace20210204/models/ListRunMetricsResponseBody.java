// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link ListRunMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRunMetricsResponseBody</p>
 */
public class ListRunMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Metrics")
    private java.util.List<RunMetric> metrics;

    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private Long nextPageToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListRunMetricsResponseBody(Builder builder) {
        this.metrics = builder.metrics;
        this.nextPageToken = builder.nextPageToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRunMetricsResponseBody create() {
        return builder().build();
    }

    /**
     * @return metrics
     */
    public java.util.List<RunMetric> getMetrics() {
        return this.metrics;
    }

    /**
     * @return nextPageToken
     */
    public Long getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<RunMetric> metrics; 
        private Long nextPageToken; 
        private String requestId; 

        /**
         * Metrics.
         */
        public Builder metrics(java.util.List<RunMetric> metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * NextPageToken.
         */
        public Builder nextPageToken(Long nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>ADF6D849-*****-7E7030F0CE53</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRunMetricsResponseBody build() {
            return new ListRunMetricsResponseBody(this);
        } 

    } 

}
