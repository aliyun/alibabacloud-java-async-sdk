// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLoadBalancerUDPListenerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLoadBalancerUDPListenerResponseBody</p>
 */
public class CreateLoadBalancerUDPListenerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CreateLoadBalancerUDPListenerResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLoadBalancerUDPListenerResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateLoadBalancerUDPListenerResponseBody build() {
            return new CreateLoadBalancerUDPListenerResponseBody(this);
        } 

    } 

}
