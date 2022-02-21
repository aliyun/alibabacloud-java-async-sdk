// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBClusterAccessWhitelistRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterAccessWhitelistRequest</p>
 */
public class ModifyDBClusterAccessWhitelistRequest extends Request {
    @Query
    @NameInMap("DBClusterIPArrayAttribute")
    private String DBClusterIPArrayAttribute;

    @Query
    @NameInMap("DBClusterIPArrayName")
    private String DBClusterIPArrayName;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("ModifyMode")
    private String modifyMode;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

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
    @NameInMap("SecurityGroupIds")
    private String securityGroupIds;

    @Query
    @NameInMap("SecurityIps")
    private String securityIps;

    @Query
    @NameInMap("WhiteListType")
    private String whiteListType;

    private ModifyDBClusterAccessWhitelistRequest(Builder builder) {
        super(builder);
        this.DBClusterIPArrayAttribute = builder.DBClusterIPArrayAttribute;
        this.DBClusterIPArrayName = builder.DBClusterIPArrayName;
        this.DBClusterId = builder.DBClusterId;
        this.modifyMode = builder.modifyMode;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityGroupIds = builder.securityGroupIds;
        this.securityIps = builder.securityIps;
        this.whiteListType = builder.whiteListType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterAccessWhitelistRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterIPArrayAttribute
     */
    public String getDBClusterIPArrayAttribute() {
        return this.DBClusterIPArrayAttribute;
    }

    /**
     * @return DBClusterIPArrayName
     */
    public String getDBClusterIPArrayName() {
        return this.DBClusterIPArrayName;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return modifyMode
     */
    public String getModifyMode() {
        return this.modifyMode;
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
     * @return securityGroupIds
     */
    public String getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * @return securityIps
     */
    public String getSecurityIps() {
        return this.securityIps;
    }

    /**
     * @return whiteListType
     */
    public String getWhiteListType() {
        return this.whiteListType;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterAccessWhitelistRequest, Builder> {
        private String DBClusterIPArrayAttribute; 
        private String DBClusterIPArrayName; 
        private String DBClusterId; 
        private String modifyMode; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityGroupIds; 
        private String securityIps; 
        private String whiteListType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterAccessWhitelistRequest response) {
            super(response);
            this.DBClusterIPArrayAttribute = response.DBClusterIPArrayAttribute;
            this.DBClusterIPArrayName = response.DBClusterIPArrayName;
            this.DBClusterId = response.DBClusterId;
            this.modifyMode = response.modifyMode;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.securityGroupIds = response.securityGroupIds;
            this.securityIps = response.securityIps;
            this.whiteListType = response.whiteListType;
        } 

        /**
         * DBClusterIPArrayAttribute.
         */
        public Builder DBClusterIPArrayAttribute(String DBClusterIPArrayAttribute) {
            this.putQueryParameter("DBClusterIPArrayAttribute", DBClusterIPArrayAttribute);
            this.DBClusterIPArrayAttribute = DBClusterIPArrayAttribute;
            return this;
        }

        /**
         * DBClusterIPArrayName.
         */
        public Builder DBClusterIPArrayName(String DBClusterIPArrayName) {
            this.putQueryParameter("DBClusterIPArrayName", DBClusterIPArrayName);
            this.DBClusterIPArrayName = DBClusterIPArrayName;
            return this;
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
         * ModifyMode.
         */
        public Builder modifyMode(String modifyMode) {
            this.putQueryParameter("ModifyMode", modifyMode);
            this.modifyMode = modifyMode;
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
         * SecurityGroupIds.
         */
        public Builder securityGroupIds(String securityGroupIds) {
            this.putQueryParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * SecurityIps.
         */
        public Builder securityIps(String securityIps) {
            this.putQueryParameter("SecurityIps", securityIps);
            this.securityIps = securityIps;
            return this;
        }

        /**
         * WhiteListType.
         */
        public Builder whiteListType(String whiteListType) {
            this.putQueryParameter("WhiteListType", whiteListType);
            this.whiteListType = whiteListType;
            return this;
        }

        @Override
        public ModifyDBClusterAccessWhitelistRequest build() {
            return new ModifyDBClusterAccessWhitelistRequest(this);
        } 

    } 

}
