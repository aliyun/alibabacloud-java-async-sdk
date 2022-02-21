// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLoadBalancerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLoadBalancerResponseBody</p>
 */
public class CreateLoadBalancerResponseBody extends TeaModel {
    @NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateLoadBalancerResponseBody(Builder builder) {
        this.loadBalancerId = builder.loadBalancerId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLoadBalancerResponseBody create() {
        return builder().build();
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String loadBalancerId; 
        private String requestId; 

        /**
         * 负载均衡实例标识
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateLoadBalancerResponseBody build() {
            return new CreateLoadBalancerResponseBody(this);
        } 

    } 

}
