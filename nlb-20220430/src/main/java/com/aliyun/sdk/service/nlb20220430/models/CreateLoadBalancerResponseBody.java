// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

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
 * {@link CreateLoadBalancerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLoadBalancerResponseBody</p>
 */
public class CreateLoadBalancerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LoadbalancerId")
    private String loadbalancerId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateLoadBalancerResponseBody(Builder builder) {
        this.loadbalancerId = builder.loadbalancerId;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLoadBalancerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return this.loadbalancerId;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String loadbalancerId; 
        private Long orderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateLoadBalancerResponseBody model) {
            this.loadbalancerId = model.loadbalancerId;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the NLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>nlb-83ckzc8d4xlp8o****</p>
         */
        public Builder loadbalancerId(String loadbalancerId) {
            this.loadbalancerId = loadbalancerId;
            return this;
        }

        /**
         * <p>The ID of the order for the NLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>20230000</p>
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
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
