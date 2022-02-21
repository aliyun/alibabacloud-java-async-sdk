// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDasInstanceConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyDasInstanceConfigRequest</p>
 */
public class ModifyDasInstanceConfigRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

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
    @NameInMap("StorageAutoScale")
    @Validation(required = true)
    private String storageAutoScale;

    @Query
    @NameInMap("StorageThreshold")
    @Validation(maximum = 50, minimum = 10)
    private Integer storageThreshold;

    @Query
    @NameInMap("StorageUpperBound")
    private Integer storageUpperBound;

    private ModifyDasInstanceConfigRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.storageAutoScale = builder.storageAutoScale;
        this.storageThreshold = builder.storageThreshold;
        this.storageUpperBound = builder.storageUpperBound;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDasInstanceConfigRequest create() {
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
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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
     * @return storageAutoScale
     */
    public String getStorageAutoScale() {
        return this.storageAutoScale;
    }

    /**
     * @return storageThreshold
     */
    public Integer getStorageThreshold() {
        return this.storageThreshold;
    }

    /**
     * @return storageUpperBound
     */
    public Integer getStorageUpperBound() {
        return this.storageUpperBound;
    }

    public static final class Builder extends Request.Builder<ModifyDasInstanceConfigRequest, Builder> {
        private String clientToken; 
        private String DBInstanceId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String storageAutoScale; 
        private Integer storageThreshold; 
        private Integer storageUpperBound; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDasInstanceConfigRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.DBInstanceId = response.DBInstanceId;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.storageAutoScale = response.storageAutoScale;
            this.storageThreshold = response.storageThreshold;
            this.storageUpperBound = response.storageUpperBound;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
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
         * StorageAutoScale.
         */
        public Builder storageAutoScale(String storageAutoScale) {
            this.putQueryParameter("StorageAutoScale", storageAutoScale);
            this.storageAutoScale = storageAutoScale;
            return this;
        }

        /**
         * StorageThreshold.
         */
        public Builder storageThreshold(Integer storageThreshold) {
            this.putQueryParameter("StorageThreshold", storageThreshold);
            this.storageThreshold = storageThreshold;
            return this;
        }

        /**
         * StorageUpperBound.
         */
        public Builder storageUpperBound(Integer storageUpperBound) {
            this.putQueryParameter("StorageUpperBound", storageUpperBound);
            this.storageUpperBound = storageUpperBound;
            return this;
        }

        @Override
        public ModifyDasInstanceConfigRequest build() {
            return new ModifyDasInstanceConfigRequest(this);
        } 

    } 

}
