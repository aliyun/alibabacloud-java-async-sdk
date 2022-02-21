// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableLoadBalancerAccessLogRequest} extends {@link RequestModel}
 *
 * <p>DisableLoadBalancerAccessLogRequest</p>
 */
public class DisableLoadBalancerAccessLogRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("LoadBalancerId")
    @Validation(required = true)
    private String loadBalancerId;

    private DisableLoadBalancerAccessLogRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.loadBalancerId = builder.loadBalancerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableLoadBalancerAccessLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public static final class Builder extends Request.Builder<DisableLoadBalancerAccessLogRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String loadBalancerId; 

        private Builder() {
            super();
        } 

        private Builder(DisableLoadBalancerAccessLogRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.loadBalancerId = response.loadBalancerId;
        } 

        /**
         * 幂等标识
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         *  是否只预检此次请求
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * 实例id
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        @Override
        public DisableLoadBalancerAccessLogRequest build() {
            return new DisableLoadBalancerAccessLogRequest(this);
        } 

    } 

}
