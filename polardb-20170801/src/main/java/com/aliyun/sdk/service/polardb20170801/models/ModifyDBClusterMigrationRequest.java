// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBClusterMigrationRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterMigrationRequest</p>
 */
public class ModifyDBClusterMigrationRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("NewMasterInstanceId")
    @Validation(required = true)
    private String newMasterInstanceId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("SourceRDSDBInstanceId")
    @Validation(required = true)
    private String sourceRDSDBInstanceId;

    @Query
    @NameInMap("SwapConnectionString")
    private String swapConnectionString;

    private ModifyDBClusterMigrationRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.newMasterInstanceId = builder.newMasterInstanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
        this.sourceRDSDBInstanceId = builder.sourceRDSDBInstanceId;
        this.swapConnectionString = builder.swapConnectionString;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterMigrationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return newMasterInstanceId
     */
    public String getNewMasterInstanceId() {
        return this.newMasterInstanceId;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return sourceRDSDBInstanceId
     */
    public String getSourceRDSDBInstanceId() {
        return this.sourceRDSDBInstanceId;
    }

    /**
     * @return swapConnectionString
     */
    public String getSwapConnectionString() {
        return this.swapConnectionString;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterMigrationRequest, Builder> {
        private String DBClusterId; 
        private String newMasterInstanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 
        private String sourceRDSDBInstanceId; 
        private String swapConnectionString; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterMigrationRequest response) {
            super(response);
            this.DBClusterId = response.DBClusterId;
            this.newMasterInstanceId = response.newMasterInstanceId;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.securityToken = response.securityToken;
            this.sourceRDSDBInstanceId = response.sourceRDSDBInstanceId;
            this.swapConnectionString = response.swapConnectionString;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * NewMasterInstanceId.
         */
        public Builder newMasterInstanceId(String newMasterInstanceId) {
            this.putQueryParameter("NewMasterInstanceId", newMasterInstanceId);
            this.newMasterInstanceId = newMasterInstanceId;
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
            this.putHostParameter("RegionId", regionId);
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * SourceRDSDBInstanceId.
         */
        public Builder sourceRDSDBInstanceId(String sourceRDSDBInstanceId) {
            this.putQueryParameter("SourceRDSDBInstanceId", sourceRDSDBInstanceId);
            this.sourceRDSDBInstanceId = sourceRDSDBInstanceId;
            return this;
        }

        /**
         * SwapConnectionString.
         */
        public Builder swapConnectionString(String swapConnectionString) {
            this.putQueryParameter("SwapConnectionString", swapConnectionString);
            this.swapConnectionString = swapConnectionString;
            return this;
        }

        @Override
        public ModifyDBClusterMigrationRequest build() {
            return new ModifyDBClusterMigrationRequest(this);
        } 

    } 

}
