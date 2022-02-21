// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLoadBalancerAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyLoadBalancerAttributeRequest</p>
 */
public class ModifyLoadBalancerAttributeRequest extends Request {
    @Query
    @NameInMap("LoadBalancerId")
    @Validation(required = true)
    private String loadBalancerId;

    @Query
    @NameInMap("LoadBalancerName")
    @Validation(required = true, maxLength = 128, minLength = 2)
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

        private Builder(ModifyLoadBalancerAttributeRequest response) {
            super(response);
            this.loadBalancerId = response.loadBalancerId;
            this.loadBalancerName = response.loadBalancerName;
        } 

        /**
         * LoadBalancerId.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * LoadBalancerName.
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
