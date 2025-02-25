// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link AttachLoadBalancersRequest} extends {@link RequestModel}
 *
 * <p>AttachLoadBalancersRequest</p>
 */
public class AttachLoadBalancersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Async")
    private Boolean async;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceAttach")
    private Boolean forceAttach;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerConfigs")
    private java.util.List<LoadBalancerConfigs> loadBalancerConfigs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancers")
    private java.util.List<String> loadBalancers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingGroupId;

    private AttachLoadBalancersRequest(Builder builder) {
        super(builder);
        this.async = builder.async;
        this.clientToken = builder.clientToken;
        this.forceAttach = builder.forceAttach;
        this.loadBalancerConfigs = builder.loadBalancerConfigs;
        this.loadBalancers = builder.loadBalancers;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachLoadBalancersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return async
     */
    public Boolean getAsync() {
        return this.async;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return forceAttach
     */
    public Boolean getForceAttach() {
        return this.forceAttach;
    }

    /**
     * @return loadBalancerConfigs
     */
    public java.util.List<LoadBalancerConfigs> getLoadBalancerConfigs() {
        return this.loadBalancerConfigs;
    }

    /**
     * @return loadBalancers
     */
    public java.util.List<String> getLoadBalancers() {
        return this.loadBalancers;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static final class Builder extends Request.Builder<AttachLoadBalancersRequest, Builder> {
        private Boolean async; 
        private String clientToken; 
        private Boolean forceAttach; 
        private java.util.List<LoadBalancerConfigs> loadBalancerConfigs; 
        private java.util.List<String> loadBalancers; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AttachLoadBalancersRequest request) {
            super(request);
            this.async = request.async;
            this.clientToken = request.clientToken;
            this.forceAttach = request.forceAttach;
            this.loadBalancerConfigs = request.loadBalancerConfigs;
            this.loadBalancers = request.loadBalancers;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupId = request.scalingGroupId;
        } 

        /**
         * <p>Specifies whether to attach the CLB instance to the scaling group in an asynchronous manner. If you attach the CLB instance from the scaling group in an asynchronous manner, the call is successful only after all operations are successful. If a specific operation fails, the call fails. We recommend that you set this parameter to true. Valid values:</p>
         * <ul>
         * <li>true: attaches the CLB instance to the scaling group in an asynchronous manner. In this case, the ID of the scaling activity is returned.</li>
         * <li>false: does not attach the CLB instance to the scaling group in an asynchronous manner.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder async(Boolean async) {
            this.putQueryParameter("Async", async);
            this.async = async;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">Ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to add the existing instances in the scaling group as backend servers of the load balancer. Valid values:</p>
         * <ul>
         * <li><p>true: If you set this parameter to <code>true</code>, the attachment of the load balancer entails the addition of the existing instances in the scaling group to the backend server groups of the load balancer.</p>
         * <p>**</p>
         * <p><strong>Note</strong> If a load balancer is currently attached to your scaling group, and you want to add the instances in your scaling group to the backend server groups of the load balancer, you can call this operation again and set ForceAttach request to true.</p>
         * </li>
         * <li><p>false: If you set this parameter to false, the attachment of the load balancer does not entail the addition of the existing instances in the scaling group to the backend server groups of the load balancer.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceAttach(Boolean forceAttach) {
            this.putQueryParameter("ForceAttach", forceAttach);
            this.forceAttach = forceAttach;
            return this;
        }

        /**
         * <p>The configurations of the classic load balancer (CLB, formerly known as SLB) instance.</p>
         */
        public Builder loadBalancerConfigs(java.util.List<LoadBalancerConfigs> loadBalancerConfigs) {
            this.putQueryParameter("LoadBalancerConfigs", loadBalancerConfigs);
            this.loadBalancerConfigs = loadBalancerConfigs;
            return this;
        }

        /**
         * <p>The IDs of the load balancers that you want to attach to the scaling group.</p>
         */
        public Builder loadBalancers(java.util.List<String> loadBalancers) {
            this.putQueryParameter("LoadBalancers", loadBalancers);
            this.loadBalancers = loadBalancers;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * <p>The ID of the scaling group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp1avr6ensitts3w****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        @Override
        public AttachLoadBalancersRequest build() {
            return new AttachLoadBalancersRequest(this);
        } 

    } 

    /**
     * 
     * {@link AttachLoadBalancersRequest} extends {@link TeaModel}
     *
     * <p>AttachLoadBalancersRequest</p>
     */
    public static class LoadBalancerConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private LoadBalancerConfigs(Builder builder) {
            this.loadBalancerId = builder.loadBalancerId;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerConfigs create() {
            return builder().build();
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String loadBalancerId; 
            private Integer weight; 

            /**
             * <p>The ID of the CLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>147b46d767c-cn-qingdao-cm5****</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The weight of an Elastic Compute Service (ECS) instance or elastic container instance as a backend sever of the CLB instance. If an instance has a higher weight, more access traffic is routed to the instance. If an instance has zero weight, no access traffic is routed to the instance.</p>
             * <p>Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public LoadBalancerConfigs build() {
                return new LoadBalancerConfigs(this);
            } 

        } 

    }
}
