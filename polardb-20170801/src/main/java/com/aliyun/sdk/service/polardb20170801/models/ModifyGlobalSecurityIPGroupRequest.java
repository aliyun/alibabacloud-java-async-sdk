// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyGlobalSecurityIPGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyGlobalSecurityIPGroupRequest</p>
 */
public class ModifyGlobalSecurityIPGroupRequest extends Request {
    @Query
    @NameInMap("GIpList")
    @Validation(required = true)
    private String gIpList;

    @Query
    @NameInMap("GlobalIgName")
    @Validation(required = true, maxLength = 120, minLength = 2)
    private String globalIgName;

    @Query
    @NameInMap("GlobalSecurityGroupId")
    @Validation(required = true)
    private String globalSecurityGroupId;

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
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private ModifyGlobalSecurityIPGroupRequest(Builder builder) {
        super(builder);
        this.gIpList = builder.gIpList;
        this.globalIgName = builder.globalIgName;
        this.globalSecurityGroupId = builder.globalSecurityGroupId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyGlobalSecurityIPGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gIpList
     */
    public String getGIpList() {
        return this.gIpList;
    }

    /**
     * @return globalIgName
     */
    public String getGlobalIgName() {
        return this.globalIgName;
    }

    /**
     * @return globalSecurityGroupId
     */
    public String getGlobalSecurityGroupId() {
        return this.globalSecurityGroupId;
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
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ModifyGlobalSecurityIPGroupRequest, Builder> {
        private String gIpList; 
        private String globalIgName; 
        private String globalSecurityGroupId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ModifyGlobalSecurityIPGroupRequest request) {
            super(request);
            this.gIpList = request.gIpList;
            this.globalIgName = request.globalIgName;
            this.globalSecurityGroupId = request.globalSecurityGroupId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
        } 

        /**
         * The IP address in the whitelist template.
         * <p>
         * 
         * >  Multiple IP addresses are separated by commas (,). You can create up to 1,000 IP addresses or CIDR blocks for all IP whitelists.
         */
        public Builder gIpList(String gIpList) {
            this.putQueryParameter("GIpList", gIpList);
            this.gIpList = gIpList;
            return this;
        }

        /**
         * The name of the IP whitelist template. The name must meet the following requirements:
         * <p>
         * 
         * *   The name can contain lowercase letters, digits, and underscores (\_).
         * *   The name must start with a letter and end with a letter or digit.
         * *   The name must be 2 to 120 characters in length.
         */
        public Builder globalIgName(String globalIgName) {
            this.putQueryParameter("GlobalIgName", globalIgName);
            this.globalIgName = globalIgName;
            return this;
        }

        /**
         * The ID of the IP whitelist template.
         */
        public Builder globalSecurityGroupId(String globalSecurityGroupId) {
            this.putQueryParameter("GlobalSecurityGroupId", globalSecurityGroupId);
            this.globalSecurityGroupId = globalSecurityGroupId;
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
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
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

        @Override
        public ModifyGlobalSecurityIPGroupRequest build() {
            return new ModifyGlobalSecurityIPGroupRequest(this);
        } 

    } 

}
