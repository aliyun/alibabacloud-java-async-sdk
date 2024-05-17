// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the QoS policy.
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
