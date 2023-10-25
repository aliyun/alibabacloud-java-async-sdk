// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLoadBalancerTCPListenerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>SetLoadBalancerTCPListenerAttributeResponseBody</p>
 */
public class SetLoadBalancerTCPListenerAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private SetLoadBalancerTCPListenerAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLoadBalancerTCPListenerAttributeResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetLoadBalancerTCPListenerAttributeResponseBody build() {
            return new SetLoadBalancerTCPListenerAttributeResponseBody(this);
        } 

    } 

}
