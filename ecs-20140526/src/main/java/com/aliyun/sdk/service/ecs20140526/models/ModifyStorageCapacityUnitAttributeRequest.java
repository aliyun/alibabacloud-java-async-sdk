// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyStorageCapacityUnitAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyStorageCapacityUnitAttributeRequest</p>
 */
public class ModifyStorageCapacityUnitAttributeRequest extends Request {
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
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StorageCapacityUnitId")
    @Validation(required = true)
    private String storageCapacityUnitId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Description")
    private String description;

    private ModifyStorageCapacityUnitAttributeRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerAccount = builder.ownerAccount;
        this.regionId = builder.regionId;
        this.storageCapacityUnitId = builder.storageCapacityUnitId;
        this.name = builder.name;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyStorageCapacityUnitAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return storageCapacityUnitId
     */
    public String getStorageCapacityUnitId() {
        return this.storageCapacityUnitId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder<ModifyStorageCapacityUnitAttributeRequest, Builder> {
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ownerAccount; 
        private String regionId; 
        private String storageCapacityUnitId; 
        private String name; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(ModifyStorageCapacityUnitAttributeRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ownerAccount = request.ownerAccount;
            this.regionId = request.regionId;
            this.storageCapacityUnitId = request.storageCapacityUnitId;
            this.name = request.name;
            this.description = request.description;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * The ID of the region to which the SCU belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SCU ID.
         */
        public Builder storageCapacityUnitId(String storageCapacityUnitId) {
            this.putQueryParameter("StorageCapacityUnitId", storageCapacityUnitId);
            this.storageCapacityUnitId = storageCapacityUnitId;
            return this;
        }

        /**
         * The name of the SCU. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https. It can contain numbers, colons (:), underscores (_), and hyphens (-).
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The description of the SCU. It must be 2 to 256 characters in length and cannot start with http:// or https.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        @Override
        public ModifyStorageCapacityUnitAttributeRequest build() {
            return new ModifyStorageCapacityUnitAttributeRequest(this);
        } 

    } 

}
