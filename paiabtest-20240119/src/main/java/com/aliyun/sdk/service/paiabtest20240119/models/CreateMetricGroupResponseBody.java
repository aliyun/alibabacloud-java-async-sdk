// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMetricGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMetricGroupResponseBody</p>
 */
public class CreateMetricGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MetricGroupId")
    private String metricGroupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateMetricGroupResponseBody(Builder builder) {
        this.metricGroupId = builder.metricGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMetricGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return metricGroupId
     */
    public String getMetricGroupId() {
        return this.metricGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String metricGroupId; 
        private String requestId; 

        /**
         * MetricGroupId.
         */
        public Builder metricGroupId(String metricGroupId) {
            this.metricGroupId = metricGroupId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMetricGroupResponseBody build() {
            return new CreateMetricGroupResponseBody(this);
        } 

    } 

}
