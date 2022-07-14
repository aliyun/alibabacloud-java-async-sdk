// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLoadBalancerStatusRequest} extends {@link RequestModel}
 *
 * <p>SetLoadBalancerStatusRequest</p>
 */
public class SetLoadBalancerStatusRequest extends Request {
    @Query
    @NameInMap("LoadBalancerId")
    @Validation(required = true)
    private String loadBalancerId;

    @Query
    @NameInMap("LoadBalancerStatus")
    @Validation(required = true)
    private String loadBalancerStatus;

    private SetLoadBalancerStatusRequest(Builder builder) {
        super(builder);
        this.loadBalancerId = builder.loadBalancerId;
        this.loadBalancerStatus = builder.loadBalancerStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLoadBalancerStatusRequest create() {
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
     * @return loadBalancerStatus
     */
    public String getLoadBalancerStatus() {
        return this.loadBalancerStatus;
    }

    public static final class Builder extends Request.Builder<SetLoadBalancerStatusRequest, Builder> {
        private String loadBalancerId; 
        private String loadBalancerStatus; 

        private Builder() {
            super();
        } 

        private Builder(SetLoadBalancerStatusRequest request) {
            super(request);
            this.loadBalancerId = request.loadBalancerId;
            this.loadBalancerStatus = request.loadBalancerStatus;
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
         * LoadBalancerStatus.
         */
        public Builder loadBalancerStatus(String loadBalancerStatus) {
            this.putQueryParameter("LoadBalancerStatus", loadBalancerStatus);
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }

        @Override
        public SetLoadBalancerStatusRequest build() {
            return new SetLoadBalancerStatusRequest(this);
        } 

    } 

}
