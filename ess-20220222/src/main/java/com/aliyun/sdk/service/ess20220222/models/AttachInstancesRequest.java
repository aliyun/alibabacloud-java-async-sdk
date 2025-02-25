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
 * {@link AttachInstancesRequest} extends {@link RequestModel}
 *
 * <p>AttachInstancesRequest</p>
 */
public class AttachInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Entrusted")
    private Boolean entrusted;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IgnoreInvalidInstance")
    private Boolean ignoreInvalidInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecycleHook")
    private Boolean lifecycleHook;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerWeights")
    private java.util.List<Integer> loadBalancerWeights;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingGroupId;

    private AttachInstancesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.entrusted = builder.entrusted;
        this.ignoreInvalidInstance = builder.ignoreInvalidInstance;
        this.instanceIds = builder.instanceIds;
        this.lifecycleHook = builder.lifecycleHook;
        this.loadBalancerWeights = builder.loadBalancerWeights;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachInstancesRequest create() {
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
     * @return entrusted
     */
    public Boolean getEntrusted() {
        return this.entrusted;
    }

    /**
     * @return ignoreInvalidInstance
     */
    public Boolean getIgnoreInvalidInstance() {
        return this.ignoreInvalidInstance;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return lifecycleHook
     */
    public Boolean getLifecycleHook() {
        return this.lifecycleHook;
    }

    /**
     * @return loadBalancerWeights
     */
    public java.util.List<Integer> getLoadBalancerWeights() {
        return this.loadBalancerWeights;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static final class Builder extends Request.Builder<AttachInstancesRequest, Builder> {
        private String clientToken; 
        private Boolean entrusted; 
        private Boolean ignoreInvalidInstance; 
        private java.util.List<String> instanceIds; 
        private Boolean lifecycleHook; 
        private java.util.List<Integer> loadBalancerWeights; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AttachInstancesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.entrusted = request.entrusted;
            this.ignoreInvalidInstance = request.ignoreInvalidInstance;
            this.instanceIds = request.instanceIds;
            this.lifecycleHook = request.lifecycleHook;
            this.loadBalancerWeights = request.loadBalancerWeights;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scalingGroupId = request.scalingGroupId;
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
         * <p>Specifies whether to use the scaling group to manage the lifecycles of manually added instances. Valid values:</p>
         * <ul>
         * <li>true: The scaling group manages the lifecycles of manually added instances and automatically created instances in the same manner. In this case, Auto Scaling releases the instances when they are removed from the scaling group. This rule does not apply to instances that are removed by calling the DetachInstances operation.</li>
         * <li>false: The scaling group does not manage the lifecycles of manually added instances. In this case, Auto Scaling does not release the instances when they are removed from the scaling group.</li>
         * </ul>
         * <blockquote>
         * <p> You cannot specify this parameter for subscription instances, non-Alibaba Cloud instances, and instances in Economical Mode.</p>
         * </blockquote>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder entrusted(Boolean entrusted) {
            this.putQueryParameter("Entrusted", entrusted);
            this.entrusted = entrusted;
            return this;
        }

        /**
         * <p>Specifies whether to ignore invalid instances when a batch of instances is added to the scaling group. Valid values:</p>
         * <ul>
         * <li>true: ignores invalid instances. If invalid instances exist and valid instances are added, the corresponding scaling activity enters the Warning state. You can check the scaling activity details to view the invalid instances that are ignored.</li>
         * <li>false: does not ignore invalid instances. If invalid instances exist in the batch of instances that you want to add to the scaling group, an error is reported.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder ignoreInvalidInstance(Boolean ignoreInvalidInstance) {
            this.putQueryParameter("IgnoreInvalidInstance", ignoreInvalidInstance);
            this.ignoreInvalidInstance = ignoreInvalidInstance;
            return this;
        }

        /**
         * <p>The IDs of the ECS instances, elastic container instances, non-Alibaba Cloud instances, or instances in Economical Mode.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>Specifies whether to trigger the lifecycle hook for scale-outs when you call this operation. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <blockquote>
         * <p> You cannot specify this parameter for subscription instances and instances in Economical Mode.</p>
         * </blockquote>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder lifecycleHook(Boolean lifecycleHook) {
            this.putQueryParameter("LifecycleHook", lifecycleHook);
            this.lifecycleHook = lifecycleHook;
            return this;
        }

        /**
         * <p>The weight of an ECS instance or elastic container instance as a backend server. You can use this parameter to specify weights for multiple instances at the same time.</p>
         */
        public Builder loadBalancerWeights(java.util.List<Integer> loadBalancerWeights) {
            this.putQueryParameter("LoadBalancerWeights", loadBalancerWeights);
            this.loadBalancerWeights = loadBalancerWeights;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * <p>The region ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The ID of the scaling group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp18p2yfxow2dloq****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        @Override
        public AttachInstancesRequest build() {
            return new AttachInstancesRequest(this);
        } 

    } 

}
