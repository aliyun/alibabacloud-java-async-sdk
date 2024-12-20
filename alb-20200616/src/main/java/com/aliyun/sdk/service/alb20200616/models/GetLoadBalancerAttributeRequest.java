// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link GetLoadBalancerAttributeRequest} extends {@link RequestModel}
 *
 * <p>GetLoadBalancerAttributeRequest</p>
 */
public class GetLoadBalancerAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    private GetLoadBalancerAttributeRequest(Builder builder) {
        super(builder);
        this.loadBalancerId = builder.loadBalancerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLoadBalancerAttributeRequest create() {
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

    public static final class Builder extends Request.Builder<GetLoadBalancerAttributeRequest, Builder> {
        private String loadBalancerId; 

        private Builder() {
            super();
        } 

        private Builder(GetLoadBalancerAttributeRequest request) {
            super(request);
            this.loadBalancerId = request.loadBalancerId;
        } 

        /**
         * <p>The ALB instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-o9ulmq5hgn68jk****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        @Override
        public GetLoadBalancerAttributeRequest build() {
            return new GetLoadBalancerAttributeRequest(this);
        } 

    } 

}
