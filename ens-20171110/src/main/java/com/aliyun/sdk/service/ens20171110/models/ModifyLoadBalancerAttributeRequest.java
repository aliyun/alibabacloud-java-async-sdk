// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLoadBalancerAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyLoadBalancerAttributeRequest</p>
 */
public class ModifyLoadBalancerAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 2)
    private String loadBalancerName;

    private ModifyLoadBalancerAttributeRequest(Builder builder) {
        super(builder);
        this.loadBalancerId = builder.loadBalancerId;
        this.loadBalancerName = builder.loadBalancerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLoadBalancerAttributeRequest create() {
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

    /**
     * @return loadBalancerName
     */
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public static final class Builder extends Request.Builder<ModifyLoadBalancerAttributeRequest, Builder> {
        private String loadBalancerId; 
        private String loadBalancerName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLoadBalancerAttributeRequest request) {
            super(request);
            this.loadBalancerId = request.loadBalancerId;
            this.loadBalancerName = request.loadBalancerName;
        } 

        /**
         * The ID of the ELB instance.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * The name of the ELB instance. The name must be **2** to **128** characters in length.
         * <p>
         * 
         * >  The value cannot start with `http://` or `https://`.
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.putQueryParameter("LoadBalancerName", loadBalancerName);
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        @Override
        public ModifyLoadBalancerAttributeRequest build() {
            return new ModifyLoadBalancerAttributeRequest(this);
        } 

    } 

}
