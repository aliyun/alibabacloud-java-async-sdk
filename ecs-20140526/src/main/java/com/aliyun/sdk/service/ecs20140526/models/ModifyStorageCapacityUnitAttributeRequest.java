// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyStorageCapacityUnitAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyStorageCapacityUnitAttributeRequest</p>
 */
public class ModifyStorageCapacityUnitAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageCapacityUnitId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storageCapacityUnitId;

    private ModifyStorageCapacityUnitAttributeRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.storageCapacityUnitId = builder.storageCapacityUnitId;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return storageCapacityUnitId
     */
    public String getStorageCapacityUnitId() {
        return this.storageCapacityUnitId;
    }

    public static final class Builder extends Request.Builder<ModifyStorageCapacityUnitAttributeRequest, Builder> {
        private String description; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String storageCapacityUnitId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyStorageCapacityUnitAttributeRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.storageCapacityUnitId = request.storageCapacityUnitId;
        } 

        /**
         * <p>The new description of the SCU. The description must be 2 to 256 characters in length and cannot start with <a href="http://https://%E3%80%82">http:// or https://.</a></p>
         * 
         * <strong>example:</strong>
         * <p>testNewScuDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The new name of the SCU. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with <a href="http://https://%E3%80%82%E3%80%81%EF%BC%88:%EF%BC%89%E3%80%81%EF%BC%88_%EF%BC%89%EF%BC%88-%EF%BC%89%E3%80%82">http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).</a></p>
         * 
         * <strong>example:</strong>
         * <p>testNewScuName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * <p>The region ID of the SCU. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>The ID of the SCU.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>scu-bp67acfmxazb4p****</p>
         */
        public Builder storageCapacityUnitId(String storageCapacityUnitId) {
            this.putQueryParameter("StorageCapacityUnitId", storageCapacityUnitId);
            this.storageCapacityUnitId = storageCapacityUnitId;
            return this;
        }

        @Override
        public ModifyStorageCapacityUnitAttributeRequest build() {
            return new ModifyStorageCapacityUnitAttributeRequest(this);
        } 

    } 

}
