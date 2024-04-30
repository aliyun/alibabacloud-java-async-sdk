// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDTCSecurityIpHostsForSQLServerRequest} extends {@link RequestModel}
 *
 * <p>ModifyDTCSecurityIpHostsForSQLServerRequest</p>
 */
public class ModifyDTCSecurityIpHostsForSQLServerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

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
    @com.aliyun.core.annotation.NameInMap("SecurityIpHosts")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityIpHosts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhiteListGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(ModifyDTCSecurityIpHostsForSQLServerRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityIpHosts = request.securityIpHosts;
            this.securityToken = request.securityToken;
            this.whiteListGroupName = request.whiteListGroupName;
        } 

        /**
         * The instance ID. You can call the DescribeDBInstances operation to query the instance ID.
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
         * The region ID. You can call the DescribeRegions operation to query the most recent region list.
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
         * The IP address of the ECS instance and the hostname of the Windows computer. Format: `IP address,Hostname`. Separate multiple entries with semicolon (;).
         * <p>
         * 
         * >  For more information about how to query the computer hostname, see [Configure a distributed transaction whitelist](~~124321~~).
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
         * The name of the IP address whitelist.
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
