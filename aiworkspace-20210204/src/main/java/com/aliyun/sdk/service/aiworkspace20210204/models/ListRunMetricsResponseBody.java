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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListRunMetricsResponseBody model) {
            this.metrics = model.metrics;
            this.nextPageToken = model.nextPageToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The metrics.</p>
         */
        public Builder metrics(java.util.List<RunMetric> metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * <p>The pagination token that is used to retrieve the next page. You do not need to specify this parameter for the first request. You must specify the pagination token in the result of the previous query. If the pagination token is 0, no next page exists. You can obtain the pagination token that is used to retrieve the next page in the value of the <strong>NextPageToken</strong> field.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
