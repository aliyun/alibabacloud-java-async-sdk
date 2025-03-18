// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
         * <p>The ID of the ELB instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-5q73cv04zeyh43lh74lp4gtm8</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The name of the ELB instance. The name must be <strong>2</strong> to <strong>128</strong> characters in length.</p>
         * <blockquote>
         * <p> The value cannot start with <code>http://</code> or <code>https://</code>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
