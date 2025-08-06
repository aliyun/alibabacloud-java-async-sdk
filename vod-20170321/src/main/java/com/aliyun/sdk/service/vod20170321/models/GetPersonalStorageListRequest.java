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
 * {@link GetPersonalStorageListRequest} extends {@link RequestModel}
 *
 * <p>GetPersonalStorageListRequest</p>
 */
public class GetPersonalStorageListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxKeys")
    private String maxKeys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Prefix")
    private String prefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private String resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceRealOwnerId")
    private Long resourceRealOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageRegion")
    private String storageRegion;

    private GetPersonalStorageListRequest(Builder builder) {
        super(builder);
        this.maxKeys = builder.maxKeys;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.prefix = builder.prefix;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceRealOwnerId = builder.resourceRealOwnerId;
        this.storageRegion = builder.storageRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPersonalStorageListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxKeys
     */
    public String getMaxKeys() {
        return this.maxKeys;
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
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
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
    public Long getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

    /**
     * @return storageRegion
     */
    public String getStorageRegion() {
        return this.storageRegion;
    }

    public static final class Builder extends Request.Builder<GetPersonalStorageListRequest, Builder> {
        private String maxKeys; 
        private String ownerAccount; 
        private String ownerId; 
        private String prefix; 
        private String resourceOwnerAccount; 
        private String resourceOwnerId; 
        private Long resourceRealOwnerId; 
        private String storageRegion; 

        private Builder() {
            super();
        } 

        private Builder(GetPersonalStorageListRequest request) {
            super(request);
            this.maxKeys = request.maxKeys;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.prefix = request.prefix;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourceRealOwnerId = request.resourceRealOwnerId;
            this.storageRegion = request.storageRegion;
        } 

        /**
         * MaxKeys.
         */
        public Builder maxKeys(String maxKeys) {
            this.putQueryParameter("MaxKeys", maxKeys);
            this.maxKeys = maxKeys;
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
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Prefix.
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("Prefix", prefix);
            this.prefix = prefix;
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
        public Builder resourceRealOwnerId(Long resourceRealOwnerId) {
            this.putQueryParameter("ResourceRealOwnerId", resourceRealOwnerId);
            this.resourceRealOwnerId = resourceRealOwnerId;
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

        @Override
        public GetPersonalStorageListRequest build() {
            return new GetPersonalStorageListRequest(this);
        } 

    } 

}
