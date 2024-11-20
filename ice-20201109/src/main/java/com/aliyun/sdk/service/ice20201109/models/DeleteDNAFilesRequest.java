// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteDNAFilesRequest} extends {@link RequestModel}
 *
 * <p>DeleteDNAFilesRequest</p>
 */
public class DeleteDNAFilesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
    @com.aliyun.core.annotation.Validation(required = true)
    private String primaryKeys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DeleteDNAFilesRequest(Builder builder) {
        super(builder);
        this.DBId = builder.DBId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.primaryKeys = builder.primaryKeys;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDNAFilesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBId
     */
    public String getDBId() {
        return this.DBId;
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
     * @return primaryKeys
     */
    public String getPrimaryKeys() {
        return this.primaryKeys;
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

    public static final class Builder extends Request.Builder<DeleteDNAFilesRequest, Builder> {
        private String DBId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String primaryKeys; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDNAFilesRequest request) {
            super(request);
            this.DBId = request.DBId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.primaryKeys = request.primaryKeys;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The ID of the media fingerprint library from which you want to delete files.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fb712a6890464059b1b2ea7c8647****</p>
         */
        public Builder DBId(String DBId) {
            this.putQueryParameter("DBId", DBId);
            this.DBId = DBId;
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
         * <p>The primary key values of the files that you want to delete. Separate multiple values with commas (,). You can delete up to 50 files at a time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>41e6536e4f2250e2e9bf26cdea19****</p>
         */
        public Builder primaryKeys(String primaryKeys) {
            this.putQueryParameter("PrimaryKeys", primaryKeys);
            this.primaryKeys = primaryKeys;
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
        public DeleteDNAFilesRequest build() {
            return new DeleteDNAFilesRequest(this);
        } 

    } 

}
