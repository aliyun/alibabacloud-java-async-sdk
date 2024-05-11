// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMetricResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMetricResponseBody</p>
 */
public class CreateMetricResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MetricId")
    private String metricId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateMetricResponseBody(Builder builder) {
        this.metricId = builder.metricId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMetricResponseBody create() {
        return builder().build();
    }

    /**
     * @return metricId
     */
    public String getMetricId() {
        return this.metricId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String metricId; 
        private String requestId; 

        /**
         * MetricId.
         */
        public Builder metricId(String metricId) {
            this.metricId = metricId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMetricResponseBody build() {
            return new CreateMetricResponseBody(this);
        } 

    } 

}
