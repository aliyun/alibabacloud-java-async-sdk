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
         * DecreaseDesiredCapacity.
         */
        public Builder decreaseDesiredCapacity(Boolean decreaseDesiredCapacity) {
            this.putQueryParameter("DecreaseDesiredCapacity", decreaseDesiredCapacity);
            this.decreaseDesiredCapacity = decreaseDesiredCapacity;
            return this;
        }

        /**
         * InstanceIds.
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RemovePolicy.
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
         * ScalingGroupId.
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
