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
         * <p>Specifies whether to use asynchronous calls when adding load balancing instances. Asynchronous calls ensure the transactionality of operations, meaning that either all operations succeed or none of the operations take effect if any operation fails. Use asynchronous calls. Valid values:</p>
         * <ul>
         * <li>true: asynchronous call. The request returns the ID of the scaling activity.</li>
         * <li>false: synchronous call.</li>
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
         * <p>Ensures the idempotence of the request.</p>
         * <p>Generate a parameter value from your client to ensure that the value is unique across different requests. The value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">Ensure idempotence</a>.</p>
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
         * <p>Specifies whether to add all existing instances in the scaling group as backend servers of the load balancing instances. Valid values:</p>
         * <ul>
         * <li><p>true: adds all existing instances. If this parameter is set to <code>true</code>, when the load balancing instances are added to the scaling group, the system adds all existing instances in the scaling group as backend servers of the load balancing instances.</p>
         * <blockquote>
         * <p>If a load balancing instance is already added to the scaling group and you want to add all instances in the scaling group as backend servers of the load balancing instance, you can add the load balancing instance to the scaling group again and set ForceAttach to true.</p>
         * </blockquote>
         * </li>
         * <li><p>false: does not add existing instances. If this parameter is set to false, when the load balancing instances are added to the scaling group, the system does not add the existing instances in the scaling group as backend servers of the load balancing instances.</p>
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
         * <p>The configurations of the load balancing CLB (formerly SLB) instances.</p>
         */
        public Builder loadBalancerConfigs(java.util.List<LoadBalancerConfigs> loadBalancerConfigs) {
            this.putQueryParameter("LoadBalancerConfigs", loadBalancerConfigs);
            this.loadBalancerConfigs = loadBalancerConfigs;
            return this;
        }

        /**
         * <p>The IDs of the load balancing CLB (formerly SLB) instances to add.</p>
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

            private Builder() {
            } 

            private Builder(LoadBalancerConfigs model) {
                this.loadBalancerId = model.loadBalancerId;
                this.weight = model.weight;
            } 

            /**
             * <p>The ID of the load balancing CLB (formerly SLB) instance.</p>
             * 
             * <strong>example:</strong>
             * <p>147b46d767c-cn-qingdao-cm5****</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The weight of the ECS instance or ECI instance as a backend server after Auto Scaling adds the instance to the SLB server group. A higher weight indicates that the ECS instance or ECI instance is allocated more access requests. If the weight is 0, the ECS instance or ECI instance does not receive access requests.</p>
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
