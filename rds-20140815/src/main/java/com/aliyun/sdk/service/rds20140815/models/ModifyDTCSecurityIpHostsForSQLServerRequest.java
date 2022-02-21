// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDTCSecurityIpHostsForSQLServerRequest} extends {@link RequestModel}
 *
 * <p>ModifyDTCSecurityIpHostsForSQLServerRequest</p>
 */
public class ModifyDTCSecurityIpHostsForSQLServerRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

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

    @Query
    @NameInMap("SecurityIpHosts")
    @Validation(required = true)
    private String securityIpHosts;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("WhiteListGroupName")
    @Validation(required = true)
    private String whiteListGroupName;

    private ModifyDTCSecurityIpHostsForSQLServerRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityIpHosts = builder.securityIpHosts;
        this.securityToken = builder.securityToken;
        this.whiteListGroupName = builder.whiteListGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDTCSecurityIpHostsForSQLServerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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
     * @return securityIpHosts
     */
    public String getSecurityIpHosts() {
        return this.securityIpHosts;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return whiteListGroupName
     */
    public String getWhiteListGroupName() {
        return this.whiteListGroupName;
    }

    public static final class Builder extends Request.Builder<ModifyDTCSecurityIpHostsForSQLServerRequest, Builder> {
        private String DBInstanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityIpHosts; 
        private String securityToken; 
        private String whiteListGroupName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDTCSecurityIpHostsForSQLServerRequest response) {
            super(response);
            this.DBInstanceId = response.DBInstanceId;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.securityIpHosts = response.securityIpHosts;
            this.securityToken = response.securityToken;
            this.whiteListGroupName = response.whiteListGroupName;
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

        /**
         * SecurityIpHosts.
         */
        public Builder securityIpHosts(String securityIpHosts) {
            this.putQueryParameter("SecurityIpHosts", securityIpHosts);
            this.securityIpHosts = securityIpHosts;
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
         * WhiteListGroupName.
         */
        public Builder whiteListGroupName(String whiteListGroupName) {
            this.putQueryParameter("WhiteListGroupName", whiteListGroupName);
            this.whiteListGroupName = whiteListGroupName;
            return this;
        }

        @Override
        public ModifyDTCSecurityIpHostsForSQLServerRequest build() {
            return new ModifyDTCSecurityIpHostsForSQLServerRequest(this);
        } 

    } 

}
