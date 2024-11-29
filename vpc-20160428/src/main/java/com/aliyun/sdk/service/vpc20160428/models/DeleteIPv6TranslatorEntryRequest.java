// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteIPv6TranslatorEntryRequest} extends {@link RequestModel}
 *
 * <p>DeleteIPv6TranslatorEntryRequest</p>
 */
public class DeleteIPv6TranslatorEntryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6TranslatorEntryId")
    private String ipv6TranslatorEntryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6TranslatorId")
    private String ipv6TranslatorId;

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

    private DeleteIPv6TranslatorEntryRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.ipv6TranslatorEntryId = builder.ipv6TranslatorEntryId;
        this.ipv6TranslatorId = builder.ipv6TranslatorId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIPv6TranslatorEntryRequest create() {
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
     * @return ipv6TranslatorEntryId
     */
    public String getIpv6TranslatorEntryId() {
        return this.ipv6TranslatorEntryId;
    }

    /**
     * @return ipv6TranslatorId
     */
    public String getIpv6TranslatorId() {
        return this.ipv6TranslatorId;
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

    public static final class Builder extends Request.Builder<DeleteIPv6TranslatorEntryRequest, Builder> {
        private String clientToken; 
        private String ipv6TranslatorEntryId; 
        private String ipv6TranslatorId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIPv6TranslatorEntryRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.ipv6TranslatorEntryId = request.ipv6TranslatorEntryId;
            this.ipv6TranslatorId = request.ipv6TranslatorId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the IPv6 mapping entry to be deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv6transentry-bp1g8bhrde****</p>
         */
        public Builder ipv6TranslatorEntryId(String ipv6TranslatorEntryId) {
            this.putQueryParameter("Ipv6TranslatorEntryId", ipv6TranslatorEntryId);
            this.ipv6TranslatorEntryId = ipv6TranslatorEntryId;
            return this;
        }

        /**
         * <p>The ID of the IPv6 Translation Service instance.</p>
         * <blockquote>
         * <p>If you do not specify <strong>Ipv6TranslatorEntryId</strong>, all mapping entries in the specified instance are deleted.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ipv6trans-bp1858ys****</p>
         */
        public Builder ipv6TranslatorId(String ipv6TranslatorId) {
            this.putQueryParameter("Ipv6TranslatorId", ipv6TranslatorId);
            this.ipv6TranslatorId = ipv6TranslatorId;
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
         * <p>The region of the IPv6 Translation Service instance. You can call the <strong>DescribeRegions</strong> operation to query the most recent region list.</p>
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
        public DeleteIPv6TranslatorEntryRequest build() {
            return new DeleteIPv6TranslatorEntryRequest(this);
        } 

    } 

}
