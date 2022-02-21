// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoadBalancerAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeLoadBalancerAttributeRequest</p>
 */
public class DescribeLoadBalancerAttributeRequest extends Request {
    @Query
    @NameInMap("LoadBalancerId")
    @Validation(required = true)
    private String loadBalancerId;

    private DescribeLoadBalancerAttributeRequest(Builder builder) {
        super(builder);
        this.loadBalancerId = builder.loadBalancerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoadBalancerAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public static final class Builder extends Request.Builder<DescribeLoadBalancerAttributeRequest, Builder> {
        private String loadBalancerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLoadBalancerAttributeRequest response) {
            super(response);
            this.loadBalancerId = response.loadBalancerId;
        } 

        /**
         * LoadBalancerId.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        @Override
        public DescribeLoadBalancerAttributeRequest build() {
            return new DescribeLoadBalancerAttributeRequest(this);
        } 

    } 

}
