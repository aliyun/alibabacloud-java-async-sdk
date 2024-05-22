// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLoadBalancerStatusRequest} extends {@link RequestModel}
 *
 * <p>SetLoadBalancerStatusRequest</p>
 */
public class SetLoadBalancerStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerStatus")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The ID of the ELB instance.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * The status of the ELB instance. Valid values:
         * <p>
         * 
         * *   **Active** (default): The listener for the instance can forward the received traffic based on the rule.
         * *   **InActive**: The listener for the instance does not forward the received traffic.
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
