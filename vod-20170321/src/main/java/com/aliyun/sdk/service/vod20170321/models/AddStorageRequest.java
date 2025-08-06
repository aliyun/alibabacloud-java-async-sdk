// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link AddStorageRequest} extends {@link RequestModel}
 *
 * <p>AddStorageRequest</p>
 */
public class AddStorageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private String resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceRealOwnerId")
    private String resourceRealOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageLocation")
    private String storageLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageRedundancyType")
    private String storageRedundancyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageRegion")
    private String storageRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    private AddStorageRequest(Builder builder) {
        super(builder);
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceRealOwnerId = builder.resourceRealOwnerId;
        this.storageLocation = builder.storageLocation;
        this.storageRedundancyType = builder.storageRedundancyType;
        this.storageRegion = builder.storageRegion;
        this.storageType = builder.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddStorageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return resourceRealOwnerId
     */
    public String getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

    /**
     * @return storageLocation
     */
    public String getStorageLocation() {
        return this.storageLocation;
    }

    /**
     * @return storageRedundancyType
     */
    public String getStorageRedundancyType() {
        return this.storageRedundancyType;
    }

    /**
     * @return storageRegion
     */
    public String getStorageRegion() {
        return this.storageRegion;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    public static final class Builder extends Request.Builder<AddStorageRequest, Builder> {
        private String ownerAccount; 
        private String ownerId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private String resourceOwnerId; 
        private String resourceRealOwnerId; 
        private String storageLocation; 
        private String storageRedundancyType; 
        private String storageRegion; 
        private String storageType; 

        private Builder() {
            super();
        } 

        private Builder(AddStorageRequest request) {
            super(request);
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourceRealOwnerId = request.resourceRealOwnerId;
            this.storageLocation = request.storageLocation;
            this.storageRedundancyType = request.storageRedundancyType;
            this.storageRegion = request.storageRegion;
            this.storageType = request.storageType;
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
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
        public Builder resourceOwnerId(String resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * ResourceRealOwnerId.
         */
        public Builder resourceRealOwnerId(String resourceRealOwnerId) {
            this.putQueryParameter("ResourceRealOwnerId", resourceRealOwnerId);
            this.resourceRealOwnerId = resourceRealOwnerId;
            return this;
        }

        /**
         * StorageLocation.
         */
        public Builder storageLocation(String storageLocation) {
            this.putQueryParameter("StorageLocation", storageLocation);
            this.storageLocation = storageLocation;
            return this;
        }

        /**
         * StorageRedundancyType.
         */
        public Builder storageRedundancyType(String storageRedundancyType) {
            this.putQueryParameter("StorageRedundancyType", storageRedundancyType);
            this.storageRedundancyType = storageRedundancyType;
            return this;
        }

        /**
         * StorageRegion.
         */
        public Builder storageRegion(String storageRegion) {
            this.putQueryParameter("StorageRegion", storageRegion);
            this.storageRegion = storageRegion;
            return this;
        }

        /**
         * StorageType.
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        @Override
        public AddStorageRequest build() {
            return new AddStorageRequest(this);
        } 

    } 

}
