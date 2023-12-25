// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Entrusted")
    private Boolean entrusted;

    @Query
    @NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @Query
    @NameInMap("LifecycleHook")
    private Boolean lifecycleHook;

    @Query
    @NameInMap("LoadBalancerWeights")
    private java.util.List < Integer > loadBalancerWeights;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

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
        this.clientToken = builder.clientToken;
        this.entrusted = builder.entrusted;
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
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
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
    public java.util.List < Integer > getLoadBalancerWeights() {
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
        private java.util.List < String > instanceIds; 
        private Boolean lifecycleHook; 
        private java.util.List < Integer > loadBalancerWeights; 
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
         * 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。只支持ASCII字符，且不能超过64个字符。更多信息，请参见[如何保证幂等性](~~25965~~)。
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether the scaling group manages the lifecycles of instances that are manually added to the scaling group. Valid values:
         * <p>
         * 
         * *   true: The scaling group manages the lifecycles of instances that are manually added in a similar manner in which the scaling group manages the lifecycles of automatically created instances. After Auto Scaling removes instances from the scaling group, Auto Scaling releases the instances. After you call the DetachInstances operation to remove instances from the scaling group, Auto Scaling does not release the instances.
         * *   false: The scaling group does not manage the lifecycles of instances that are manually added. After Auto Scaling removes instances from the scaling group, Auto Scaling does not release the instances.
         * 
         * > You cannot specify this parameter for subscription instances.
         * 
         * Default value: false.
         */
        public Builder entrusted(Boolean entrusted) {
            this.putQueryParameter("Entrusted", entrusted);
            this.entrusted = entrusted;
            return this;
        }

        /**
         * The IDs of the ECS instances or elastic container instances that you want to add.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * Specifies whether to trigger a lifecycle hook for a scale-out activity. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: false.
         */
        public Builder lifecycleHook(Boolean lifecycleHook) {
            this.putQueryParameter("LifecycleHook", lifecycleHook);
            this.lifecycleHook = lifecycleHook;
            return this;
        }

        /**
         * The weights of the ECS instances or elastic container instances as the backend servers of the associated Classic Load Balancer (CLB) instance.
         */
        public Builder loadBalancerWeights(java.util.List < Integer > loadBalancerWeights) {
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
         * The region ID of the scaling group.
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
         * The ID of the scaling group.
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
