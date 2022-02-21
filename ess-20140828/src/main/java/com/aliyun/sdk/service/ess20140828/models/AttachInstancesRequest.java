// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachInstancesRequest} extends {@link RequestModel}
 *
 * <p>AttachInstancesRequest</p>
 */
public class AttachInstancesRequest extends Request {
    @Query
    @NameInMap("Entrusted")
    private Boolean entrusted;

    @Query
    @NameInMap("InstanceId")
    private java.util.List < String > instanceId;

    @Query
    @NameInMap("LifecycleHook")
    private Boolean lifecycleHook;

    @Query
    @NameInMap("LoadBalancerWeight")
    private java.util.List < Integer > loadBalancerWeight;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ScalingGroupId")
    @Validation(required = true)
    private String scalingGroupId;

    private AttachInstancesRequest(Builder builder) {
        super(builder);
        this.entrusted = builder.entrusted;
        this.instanceId = builder.instanceId;
        this.lifecycleHook = builder.lifecycleHook;
        this.loadBalancerWeight = builder.loadBalancerWeight;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
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
     * @return entrusted
     */
    public Boolean getEntrusted() {
        return this.entrusted;
    }

    /**
     * @return instanceId
     */
    public java.util.List < String > getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lifecycleHook
     */
    public Boolean getLifecycleHook() {
        return this.lifecycleHook;
    }

    /**
     * @return loadBalancerWeight
     */
    public java.util.List < Integer > getLoadBalancerWeight() {
        return this.loadBalancerWeight;
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
        private Boolean entrusted; 
        private java.util.List < String > instanceId; 
        private Boolean lifecycleHook; 
        private java.util.List < Integer > loadBalancerWeight; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AttachInstancesRequest response) {
            super(response);
            this.entrusted = response.entrusted;
            this.instanceId = response.instanceId;
            this.lifecycleHook = response.lifecycleHook;
            this.loadBalancerWeight = response.loadBalancerWeight;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.scalingGroupId = response.scalingGroupId;
        } 

        /**
         * Entrusted.
         */
        public Builder entrusted(Boolean entrusted) {
            this.putQueryParameter("Entrusted", entrusted);
            this.entrusted = entrusted;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(java.util.List < String > instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LifecycleHook.
         */
        public Builder lifecycleHook(Boolean lifecycleHook) {
            this.putQueryParameter("LifecycleHook", lifecycleHook);
            this.lifecycleHook = lifecycleHook;
            return this;
        }

        /**
         * LoadBalancerWeight.
         */
        public Builder loadBalancerWeight(java.util.List < Integer > loadBalancerWeight) {
            this.putQueryParameter("LoadBalancerWeight", loadBalancerWeight);
            this.loadBalancerWeight = loadBalancerWeight;
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
         * ScalingGroupId.
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
