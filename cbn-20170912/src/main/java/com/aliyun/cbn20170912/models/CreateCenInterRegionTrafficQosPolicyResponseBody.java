// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateCenInterRegionTrafficQosPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCenInterRegionTrafficQosPolicyResponseBody</p>
 */
public class CreateCenInterRegionTrafficQosPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TrafficQosPolicyId")
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
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>TrafficQosPolicyId.</p>
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
