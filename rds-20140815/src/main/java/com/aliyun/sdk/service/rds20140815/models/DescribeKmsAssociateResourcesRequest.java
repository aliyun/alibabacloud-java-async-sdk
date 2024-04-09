// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKmsAssociateResourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeKmsAssociateResourcesRequest</p>
 */
public class DescribeKmsAssociateResourcesRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("KmsResourceId")
    @Validation(required = true)
    private String kmsResourceId;

    @Query
    @NameInMap("KmsResourceRegionId")
    private String kmsResourceRegionId;

    @Query
    @NameInMap("KmsResourceType")
    @Validation(required = true)
    private String kmsResourceType;

    @Query
    @NameInMap("KmsResourceUser")
    @Validation(required = true)
    private String kmsResourceUser;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("RegionId")
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

    private DescribeKmsAssociateResourcesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.kmsResourceId = builder.kmsResourceId;
        this.kmsResourceRegionId = builder.kmsResourceRegionId;
        this.kmsResourceType = builder.kmsResourceType;
        this.kmsResourceUser = builder.kmsResourceUser;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKmsAssociateResourcesRequest create() {
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
     * @return kmsResourceId
     */
    public String getKmsResourceId() {
        return this.kmsResourceId;
    }

    /**
     * @return kmsResourceRegionId
     */
    public String getKmsResourceRegionId() {
        return this.kmsResourceRegionId;
    }

    /**
     * @return kmsResourceType
     */
    public String getKmsResourceType() {
        return this.kmsResourceType;
    }

    /**
     * @return kmsResourceUser
     */
    public String getKmsResourceUser() {
        return this.kmsResourceUser;
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
    public String getOwnerId() {
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

    public static final class Builder extends Request.Builder<DescribeKmsAssociateResourcesRequest, Builder> {
        private String clientToken; 
        private String kmsResourceId; 
        private String kmsResourceRegionId; 
        private String kmsResourceType; 
        private String kmsResourceUser; 
        private String ownerAccount; 
        private String ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeKmsAssociateResourcesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.kmsResourceId = request.kmsResourceId;
            this.kmsResourceRegionId = request.kmsResourceRegionId;
            this.kmsResourceType = request.kmsResourceType;
            this.kmsResourceUser = request.kmsResourceUser;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * KmsResourceId.
         */
        public Builder kmsResourceId(String kmsResourceId) {
            this.putQueryParameter("KmsResourceId", kmsResourceId);
            this.kmsResourceId = kmsResourceId;
            return this;
        }

        /**
         * KmsResourceRegionId.
         */
        public Builder kmsResourceRegionId(String kmsResourceRegionId) {
            this.putQueryParameter("KmsResourceRegionId", kmsResourceRegionId);
            this.kmsResourceRegionId = kmsResourceRegionId;
            return this;
        }

        /**
         * KmsResourceType.
         */
        public Builder kmsResourceType(String kmsResourceType) {
            this.putQueryParameter("KmsResourceType", kmsResourceType);
            this.kmsResourceType = kmsResourceType;
            return this;
        }

        /**
         * KmsResourceUser.
         */
        public Builder kmsResourceUser(String kmsResourceUser) {
            this.putQueryParameter("KmsResourceUser", kmsResourceUser);
            this.kmsResourceUser = kmsResourceUser;
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
        public Builder ownerId(String ownerId) {
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
         * ResourceGroupId.
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

        @Override
        public DescribeKmsAssociateResourcesRequest build() {
            return new DescribeKmsAssociateResourcesRequest(this);
        } 

    } 

}
