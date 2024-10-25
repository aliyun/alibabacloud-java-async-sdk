// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetLoadBalancerTCPListenerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>SetLoadBalancerTCPListenerAttributeResponseBody</p>
 */
public class SetLoadBalancerTCPListenerAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>06F00FBB-3D9E-4CCE-9D43-1A6946A75456</p>
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
