// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadServerCertificateRequest} extends {@link RequestModel}
 *
 * <p>UploadServerCertificateRequest</p>
 */
public class UploadServerCertificateRequest extends Request {
    @Query
    @NameInMap("AliCloudCertificateId")
    private String aliCloudCertificateId;

    @Query
    @NameInMap("AliCloudCertificateName")
    private String aliCloudCertificateName;

    @Query
    @NameInMap("AliCloudCertificateRegionId")
    private String aliCloudCertificateRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PrivateKey")
    private String privateKey;

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
    @NameInMap("ServerCertificate")
    private String serverCertificate;

    @Query
    @NameInMap("ServerCertificateName")
    private String serverCertificateName;

    private UploadServerCertificateRequest(Builder builder) {
        super(builder);
        this.aliCloudCertificateId = builder.aliCloudCertificateId;
        this.aliCloudCertificateName = builder.aliCloudCertificateName;
        this.aliCloudCertificateRegionId = builder.aliCloudCertificateRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.privateKey = builder.privateKey;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.serverCertificate = builder.serverCertificate;
        this.serverCertificateName = builder.serverCertificateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadServerCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliCloudCertificateId
     */
    public String getAliCloudCertificateId() {
        return this.aliCloudCertificateId;
    }

    /**
     * @return aliCloudCertificateName
     */
    public String getAliCloudCertificateName() {
        return this.aliCloudCertificateName;
    }

    /**
     * @return aliCloudCertificateRegionId
     */
    public String getAliCloudCertificateRegionId() {
        return this.aliCloudCertificateRegionId;
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
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
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
     * @return serverCertificate
     */
    public String getServerCertificate() {
        return this.serverCertificate;
    }

    /**
     * @return serverCertificateName
     */
    public String getServerCertificateName() {
        return this.serverCertificateName;
    }

    public static final class Builder extends Request.Builder<UploadServerCertificateRequest, Builder> {
        private String aliCloudCertificateId; 
        private String aliCloudCertificateName; 
        private String aliCloudCertificateRegionId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String privateKey; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String serverCertificate; 
        private String serverCertificateName; 

        private Builder() {
            super();
        } 

        private Builder(UploadServerCertificateRequest response) {
            super(response);
            this.aliCloudCertificateId = response.aliCloudCertificateId;
            this.aliCloudCertificateName = response.aliCloudCertificateName;
            this.aliCloudCertificateRegionId = response.aliCloudCertificateRegionId;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.privateKey = response.privateKey;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.serverCertificate = response.serverCertificate;
            this.serverCertificateName = response.serverCertificateName;
        } 

        /**
         * AliCloudCertificateId.
         */
        public Builder aliCloudCertificateId(String aliCloudCertificateId) {
            this.putQueryParameter("AliCloudCertificateId", aliCloudCertificateId);
            this.aliCloudCertificateId = aliCloudCertificateId;
            return this;
        }

        /**
         * AliCloudCertificateName.
         */
        public Builder aliCloudCertificateName(String aliCloudCertificateName) {
            this.putQueryParameter("AliCloudCertificateName", aliCloudCertificateName);
            this.aliCloudCertificateName = aliCloudCertificateName;
            return this;
        }

        /**
         * AliCloudCertificateRegionId.
         */
        public Builder aliCloudCertificateRegionId(String aliCloudCertificateRegionId) {
            this.putQueryParameter("AliCloudCertificateRegionId", aliCloudCertificateRegionId);
            this.aliCloudCertificateRegionId = aliCloudCertificateRegionId;
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
         * PrivateKey.
         */
        public Builder privateKey(String privateKey) {
            this.putQueryParameter("PrivateKey", privateKey);
            this.privateKey = privateKey;
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

        /**
         * ServerCertificate.
         */
        public Builder serverCertificate(String serverCertificate) {
            this.putQueryParameter("ServerCertificate", serverCertificate);
            this.serverCertificate = serverCertificate;
            return this;
        }

        /**
         * ServerCertificateName.
         */
        public Builder serverCertificateName(String serverCertificateName) {
            this.putQueryParameter("ServerCertificateName", serverCertificateName);
            this.serverCertificateName = serverCertificateName;
            return this;
        }

        @Override
        public UploadServerCertificateRequest build() {
            return new UploadServerCertificateRequest(this);
        } 

    } 

}
