// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link ModifyIPv6TranslatorAclListEntryRequest} extends {@link RequestModel}
 *
 * <p>ModifyIPv6TranslatorAclListEntryRequest</p>
 */
public class ModifyIPv6TranslatorAclListEntryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclEntryComment")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclEntryComment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclEntryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclEntryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclId;

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

    private ModifyIPv6TranslatorAclListEntryRequest(Builder builder) {
        super(builder);
        this.aclEntryComment = builder.aclEntryComment;
        this.aclEntryId = builder.aclEntryId;
        this.aclId = builder.aclId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyIPv6TranslatorAclListEntryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclEntryComment
     */
    public String getAclEntryComment() {
        return this.aclEntryComment;
    }

    /**
     * @return aclEntryId
     */
    public String getAclEntryId() {
        return this.aclEntryId;
    }

    /**
     * @return aclId
     */
    public String getAclId() {
        return this.aclId;
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

    public static final class Builder extends Request.Builder<ModifyIPv6TranslatorAclListEntryRequest, Builder> {
        private String aclEntryComment; 
        private String aclEntryId; 
        private String aclId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyIPv6TranslatorAclListEntryRequest request) {
            super(request);
            this.aclEntryComment = request.aclEntryComment;
            this.aclEntryId = request.aclEntryId;
            this.aclId = request.aclId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The remarks of the ACL rule.</p>
         * <p>It must be 2 to 100 characters in length, and can contain digits, underscores (_), and hyphens (-). It must start with a letter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>client IP</p>
         */
        public Builder aclEntryComment(String aclEntryComment) {
            this.putQueryParameter("AclEntryComment", aclEntryComment);
            this.aclEntryComment = aclEntryComment;
            return this;
        }

        /**
         * <p>The ID of the ACL rule to which the IP entry belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv6transaclentry-bp1jzyn7ra8pyxehd****</p>
         */
        public Builder aclEntryId(String aclEntryId) {
            this.putQueryParameter("AclEntryId", aclEntryId);
            this.aclEntryId = aclEntryId;
            return this;
        }

        /**
         * <p>The ID of the ACL to which the IP entry belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv6transacl-bp1b4z3tleyhq1s50****</p>
         */
        public Builder aclId(String aclId) {
            this.putQueryParameter("AclId", aclId);
            this.aclId = aclId;
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
         * <p>The region of the ACL.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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

        @Override
        public ModifyIPv6TranslatorAclListEntryRequest build() {
            return new ModifyIPv6TranslatorAclListEntryRequest(this);
        } 

    } 

}
