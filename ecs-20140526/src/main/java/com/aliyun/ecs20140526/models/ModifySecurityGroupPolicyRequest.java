// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecurityGroupPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifySecurityGroupPolicyRequest</p>
 */
public class ModifySecurityGroupPolicyRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("InnerAccessPolicy")
    private String innerAccessPolicy;

    private ModifySecurityGroupPolicyRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerId = builder.ownerId;
        this.securityGroupId = builder.securityGroupId;
        this.innerAccessPolicy = builder.innerAccessPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecurityGroupPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return innerAccessPolicy
     */
    public String getInnerAccessPolicy() {
        return this.innerAccessPolicy;
    }

    public static final class Builder extends Request.Builder<ModifySecurityGroupPolicyRequest, Builder> {
        private String sourceRegionId; 
        private String ownerAccount; 
        private String regionId; 
        private String clientToken; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long ownerId; 
        private String securityGroupId; 
        private String innerAccessPolicy; 

        private Builder() {
            super();
        } 

        private Builder(ModifySecurityGroupPolicyRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.ownerAccount = response.ownerAccount;
            this.regionId = response.regionId;
            this.clientToken = response.clientToken;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.ownerId = response.ownerId;
            this.securityGroupId = response.securityGroupId;
            this.innerAccessPolicy = response.innerAccessPolicy;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
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
         * The ID of the region to which the security group belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The account name of the resource master account.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the RAM user.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The ID of the security group.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The Intranet connection policy between ECS instances in the security group. Valid values:
         * <p>
         * 
         * -Accept: interconnect
         * -Drop: Quarantine
         * 
         * The value is case insensitive.
         */
        public Builder innerAccessPolicy(String innerAccessPolicy) {
            this.putQueryParameter("InnerAccessPolicy", innerAccessPolicy);
            this.innerAccessPolicy = innerAccessPolicy;
            return this;
        }

        @Override
        public ModifySecurityGroupPolicyRequest build() {
            return new ModifySecurityGroupPolicyRequest(this);
        } 

    } 

}
