// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveInstancesRequest} extends {@link RequestModel}
 *
 * <p>RemoveInstancesRequest</p>
 */
public class RemoveInstancesRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DecreaseDesiredCapacity")
    private Boolean decreaseDesiredCapacity;

    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private java.util.List < String > instanceIds;

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
    @NameInMap("RemovePolicy")
    private String removePolicy;

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

    private RemoveInstancesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.decreaseDesiredCapacity = builder.decreaseDesiredCapacity;
        this.instanceIds = builder.instanceIds;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.removePolicy = builder.removePolicy;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveInstancesRequest create() {
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
     * @return decreaseDesiredCapacity
     */
    public Boolean getDecreaseDesiredCapacity() {
        return this.decreaseDesiredCapacity;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
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
     * @return removePolicy
     */
    public String getRemovePolicy() {
        return this.removePolicy;
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

    public static final class Builder extends Request.Builder<RemoveInstancesRequest, Builder> {
        private String clientToken; 
        private Boolean decreaseDesiredCapacity; 
        private java.util.List < String > instanceIds; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String removePolicy; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveInstancesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.decreaseDesiredCapacity = request.decreaseDesiredCapacity;
            this.instanceIds = request.instanceIds;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.removePolicy = request.removePolicy;
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
         * Specifies whether to adjust the expected number of ECS instances in the scaling group. Valid values:
         * <p>
         * 
         * *   true: After ECS instances are removed from the scaling group, the expected number of ECS instances in the scaling group decreases.
         * *   false: After ECS instances are removed from the scaling group, the expected number of ECS instances in the scaling group remains unchanged.
         * 
         * Default value: true.
         */
        public Builder decreaseDesiredCapacity(Boolean decreaseDesiredCapacity) {
            this.putQueryParameter("DecreaseDesiredCapacity", decreaseDesiredCapacity);
            this.decreaseDesiredCapacity = decreaseDesiredCapacity;
            return this;
        }

        /**
         * The IDs of the ECS instances that you want to remove from the scaling group.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
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
         * The action that you want Auto Scaling to perform after the ECS instance is removed from the scaling group. Valid values:
         * <p>
         * 
         * *   recycle: puts the ECS instance into economical mode.
         * 
         *     **Note** This setting takes effect only if you set the ScalingPolicy parameter to recycle.
         * 
         * *   release: releases the ECS instance.
         * 
         * The ScalingPolicy parameter that you specify when you call the CreateScalingGroup operation specifies the reclaim mode of the scaling group. The RemovePolicy parameter that you specify when you call the RemoveInstances operation specifies the action to be performed on ECS instances after the ECS instances are removed. Example:
         * 
         * *   If you set both the ScalingPolicy parameter and the RemovePolicy parameter to recycle, the ECS instances are put into economical mode after the ECS instances are removed from the scaling group.
         * *   If you set the ScalingPolicy parameter to recycle and the RemovePolicy parameter to release, the ECS instances are released after the ECS instances are removed from the scaling group.
         * *   If you set the ScalingPolicy parameter to release and the RemovePolicy parameter to recycle, the ECS instances are released after the ECS instances are removed from the scaling group.
         * *   If you set both the ScalingPolicy parameter and the RemovePolicy parameter to release, the ECS instances are released after the ECS instances are removed from the scaling group.
         * 
         * Default value: release.
         */
        public Builder removePolicy(String removePolicy) {
            this.putQueryParameter("RemovePolicy", removePolicy);
            this.removePolicy = removePolicy;
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
        public RemoveInstancesRequest build() {
            return new RemoveInstancesRequest(this);
        } 

    } 

}
