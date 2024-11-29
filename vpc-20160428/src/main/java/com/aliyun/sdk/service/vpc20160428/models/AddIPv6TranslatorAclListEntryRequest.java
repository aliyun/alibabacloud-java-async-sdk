// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddIPv6TranslatorAclListEntryRequest} extends {@link RequestModel}
 *
 * <p>AddIPv6TranslatorAclListEntryRequest</p>
 */
public class AddIPv6TranslatorAclListEntryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclEntryComment")
    private String aclEntryComment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclEntryIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclEntryIp;

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

    private AddIPv6TranslatorAclListEntryRequest(Builder builder) {
        super(builder);
        this.aclEntryComment = builder.aclEntryComment;
        this.aclEntryIp = builder.aclEntryIp;
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

    public static AddIPv6TranslatorAclListEntryRequest create() {
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
     * @return aclEntryIp
     */
    public String getAclEntryIp() {
        return this.aclEntryIp;
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

    public static final class Builder extends Request.Builder<AddIPv6TranslatorAclListEntryRequest, Builder> {
        private String aclEntryComment; 
        private String aclEntryIp; 
        private String aclId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(AddIPv6TranslatorAclListEntryRequest request) {
            super(request);
            this.aclEntryComment = request.aclEntryComment;
            this.aclEntryIp = request.aclEntryIp;
            this.aclId = request.aclId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The remarks of the ACL entry.</p>
         * <p>It must be 2 to 100 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>clientIP1</p>
         */
        public Builder aclEntryComment(String aclEntryComment) {
            this.putQueryParameter("AclEntryComment", aclEntryComment);
            this.aclEntryComment = aclEntryComment;
            return this;
        }

        /**
         * <p>The IPv6 address or IPv6 CIDR block that you want to add to the ACL entry, for example, 12XX:0:0:XXXX::0102 or 12XX:0:0:XXXX::/60.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12XX:0:0:XXXX::0102</p>
         */
        public Builder aclEntryIp(String aclEntryIp) {
            this.putQueryParameter("AclEntryIp", aclEntryIp);
            this.aclEntryIp = aclEntryIp;
            return this;
        }

        /**
         * <p>The ID of the ACL to which you want to add the IP entry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv6transacl-bp1dcdvfe2****</p>
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
         * <p>The region ID of the ACL.</p>
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
        public AddIPv6TranslatorAclListEntryRequest build() {
            return new AddIPv6TranslatorAclListEntryRequest(this);
        } 

    } 

}
