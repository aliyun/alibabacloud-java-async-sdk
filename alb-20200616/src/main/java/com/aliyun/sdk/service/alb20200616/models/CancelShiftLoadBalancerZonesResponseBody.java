// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelShiftLoadBalancerZonesResponseBody} extends {@link TeaModel}
 *
 * <p>CancelShiftLoadBalancerZonesResponseBody</p>
 */
public class CancelShiftLoadBalancerZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CancelShiftLoadBalancerZonesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelShiftLoadBalancerZonesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CancelShiftLoadBalancerZonesResponseBody build() {
            return new CancelShiftLoadBalancerZonesResponseBody(this);
        } 

    } 

}
