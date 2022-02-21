// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

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
    @NameInMap("InstanceId")
    @Validation(required = true)
    private java.util.List < String > instanceId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

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
        this.instanceId = builder.instanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
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
     * @return instanceId
     */
    public java.util.List < String > getInstanceId() {
        return this.instanceId;
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
        private java.util.List < String > instanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String removePolicy; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveInstancesRequest response) {
            super(response);
            this.decreaseDesiredCapacity = response.decreaseDesiredCapacity;
            this.instanceId = response.instanceId;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.removePolicy = response.removePolicy;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.scalingGroupId = response.scalingGroupId;
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
         * InstanceId.
         */
        public Builder instanceId(java.util.List < String > instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
