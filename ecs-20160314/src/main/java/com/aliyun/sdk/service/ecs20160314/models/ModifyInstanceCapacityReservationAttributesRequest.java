// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceCapacityReservationAttributesRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceCapacityReservationAttributesRequest</p>
 */
public class ModifyInstanceCapacityReservationAttributesRequest extends Request {
    @Query
    @NameInMap("CapacityReservationId")
    private String capacityReservationId;

    @Query
    @NameInMap("CapacityReservationPreference")
    private String capacityReservationPreference;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyInstanceCapacityReservationAttributesRequest(Builder builder) {
        super(builder);
        this.capacityReservationId = builder.capacityReservationId;
        this.capacityReservationPreference = builder.capacityReservationPreference;
        this.instanceId = builder.instanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceCapacityReservationAttributesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capacityReservationId
     */
    public String getCapacityReservationId() {
        return this.capacityReservationId;
    }

    /**
     * @return capacityReservationPreference
     */
    public String getCapacityReservationPreference() {
        return this.capacityReservationPreference;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
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

    public static final class Builder extends Request.Builder<ModifyInstanceCapacityReservationAttributesRequest, Builder> {
        private String capacityReservationId; 
        private String capacityReservationPreference; 
        private String instanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceCapacityReservationAttributesRequest response) {
            super(response);
            this.capacityReservationId = response.capacityReservationId;
            this.capacityReservationPreference = response.capacityReservationPreference;
            this.instanceId = response.instanceId;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * CapacityReservationId.
         */
        public Builder capacityReservationId(String capacityReservationId) {
            this.putQueryParameter("CapacityReservationId", capacityReservationId);
            this.capacityReservationId = capacityReservationId;
            return this;
        }

        /**
         * CapacityReservationPreference.
         */
        public Builder capacityReservationPreference(String capacityReservationPreference) {
            this.putQueryParameter("CapacityReservationPreference", capacityReservationPreference);
            this.capacityReservationPreference = capacityReservationPreference;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
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
         * RegionId.
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

        @Override
        public ModifyInstanceCapacityReservationAttributesRequest build() {
            return new ModifyInstanceCapacityReservationAttributesRequest(this);
        } 

    } 

}
