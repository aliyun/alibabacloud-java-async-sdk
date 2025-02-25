// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link UploadServerCertificateRequest} extends {@link RequestModel}
 *
 * <p>UploadServerCertificateRequest</p>
 */
public class UploadServerCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliCloudCertificateId")
    private String aliCloudCertificateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliCloudCertificateName")
    private String aliCloudCertificateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliCloudCertificateRegionId")
    private String aliCloudCertificateRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateKey")
    private String privateKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerCertificate")
    private String serverCertificate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerCertificateName")
    private String serverCertificateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

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
        this.tag = builder.tag;
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

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
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
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(UploadServerCertificateRequest request) {
            super(request);
            this.aliCloudCertificateId = request.aliCloudCertificateId;
            this.aliCloudCertificateName = request.aliCloudCertificateName;
            this.aliCloudCertificateRegionId = request.aliCloudCertificateRegionId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.privateKey = request.privateKey;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.serverCertificate = request.serverCertificate;
            this.serverCertificateName = request.serverCertificateName;
            this.tag = request.tag;
        } 

        /**
         * <p>AliCloud certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>775****</p>
         */
        public Builder aliCloudCertificateId(String aliCloudCertificateId) {
            this.putQueryParameter("AliCloudCertificateId", aliCloudCertificateId);
            this.aliCloudCertificateId = aliCloudCertificateId;
            return this;
        }

        /**
         * <p>AliCloud certificate name.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudcertificate</p>
         */
        public Builder aliCloudCertificateName(String aliCloudCertificateName) {
            this.putQueryParameter("AliCloudCertificateName", aliCloudCertificateName);
            this.aliCloudCertificateName = aliCloudCertificateName;
            return this;
        }

        /**
         * <p>The region ID of AliCloud certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>The private key of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN RSA PRIVATE KEY----- MIIEogIB****** -----END RSA PRIVATE KEY-----</p>
         */
        public Builder privateKey(String privateKey) {
            this.putQueryParameter("PrivateKey", privateKey);
            this.privateKey = privateKey;
            return this;
        }

        /**
         * <p>The region ID of the CLB instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/27584.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-atstuj3rto****</p>
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
         * <p>The server certificate to be uploaded.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE----- MIIGDTCC****** -----END CERTIFICATE-----</p>
         */
        public Builder serverCertificate(String serverCertificate) {
            this.putQueryParameter("ServerCertificate", serverCertificate);
            this.serverCertificate = serverCertificate;
            return this;
        }

        /**
         * <p>The name of the server certificate.</p>
         * <p>The name must be 1 to 80 characters in length. It must start with an English letter. It can contain letters, numbers, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>mycert01</p>
         */
        public Builder serverCertificateName(String serverCertificateName) {
            this.putQueryParameter("ServerCertificateName", serverCertificateName);
            this.serverCertificateName = serverCertificateName;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public UploadServerCertificateRequest build() {
            return new UploadServerCertificateRequest(this);
        } 

    } 

    /**
     * 
     * {@link UploadServerCertificateRequest} extends {@link TeaModel}
     *
     * <p>UploadServerCertificateRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The key of tag N. Valid values of N: <strong>1 to 20</strong>. The tag key cannot be an empty string.</p>
             * <p>The tag key can be up to 64 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N. Valid values of N: <strong>1 to 20</strong>. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag value cannot start with <code>aliyun</code> and <code>acs:</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
