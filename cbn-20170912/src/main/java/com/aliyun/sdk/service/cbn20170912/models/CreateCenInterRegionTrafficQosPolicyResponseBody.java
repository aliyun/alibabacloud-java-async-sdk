// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link CreateCenInterRegionTrafficQosPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCenInterRegionTrafficQosPolicyResponseBody</p>
 */
public class CreateCenInterRegionTrafficQosPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrafficQosPolicyId")
    private String trafficQosPolicyId;

    private CreateCenInterRegionTrafficQosPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trafficQosPolicyId = builder.trafficQosPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCenInterRegionTrafficQosPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trafficQosPolicyId
     */
    public String getTrafficQosPolicyId() {
        return this.trafficQosPolicyId;
    }

    public static final class Builder {
        private String requestId; 
        private String trafficQosPolicyId; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6DF9A765-BCD2-5C7E-8C32-C35C8A361A39</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the QoS policy.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-eczzew0v1kzrb5****</p>
         */
        public Builder trafficQosPolicyId(String trafficQosPolicyId) {
            this.trafficQosPolicyId = trafficQosPolicyId;
            return this;
        }

        public CreateCenInterRegionTrafficQosPolicyResponseBody build() {
            return new CreateCenInterRegionTrafficQosPolicyResponseBody(this);
        } 

    } 

}
