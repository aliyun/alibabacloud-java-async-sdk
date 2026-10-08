// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeKmsAssociateResourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeKmsAssociateResourcesRequest</p>
 */
public class DescribeKmsAssociateResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KmsResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kmsResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KmsResourceRegionId")
    private String kmsResourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KmsResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kmsResourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KmsResourceUser")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kmsResourceUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
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
         * <p>The client token that is used to ensure the idempotence of the request and prevent repeated submissions. The token is generated by the client and must be unique across different requests.</p>
         * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCz****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The KMS resource ID. Currently, only key IDs are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a62f78**-65**-4f**-a0**-3ca4def8****</p>
         */
        public Builder kmsResourceId(String kmsResourceId) {
            this.putQueryParameter("KmsResourceId", kmsResourceId);
            this.kmsResourceId = kmsResourceId;
            return this;
        }

        /**
         * <p>The region ID of the KMS resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder kmsResourceRegionId(String kmsResourceRegionId) {
            this.putQueryParameter("KmsResourceRegionId", kmsResourceRegionId);
            this.kmsResourceRegionId = kmsResourceRegionId;
            return this;
        }

        /**
         * <p>The KMS resource type. Currently, only <strong>key</strong> is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        public Builder kmsResourceType(String kmsResourceType) {
            this.putQueryParameter("KmsResourceType", kmsResourceType);
            this.kmsResourceType = kmsResourceType;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID to which the KMS resource belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1788966360******</p>
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
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/26243.html">DescribeRegions</a> to query the available regions.</p>
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm27qsxjj****</p>
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
