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
 * {@link ModifyDBInstanceCLSRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceCLSRequest</p>
 */
public class ModifyDBInstanceCLSRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionAlgorithm")
    private String encryptionAlgorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionKey")
    private String encryptionKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionKeyMode")
    private String encryptionKeyMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String encryptionStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsRotate")
    private Boolean isRotate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleArn")
    private String roleArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhiteListMode")
    private Boolean whiteListMode;

    private ModifyDBInstanceCLSRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.encryptionAlgorithm = builder.encryptionAlgorithm;
        this.encryptionKey = builder.encryptionKey;
        this.encryptionKeyMode = builder.encryptionKeyMode;
        this.encryptionStatus = builder.encryptionStatus;
        this.isRotate = builder.isRotate;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.roleArn = builder.roleArn;
        this.whiteListMode = builder.whiteListMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceCLSRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return encryptionAlgorithm
     */
    public String getEncryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    /**
     * @return encryptionKey
     */
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * @return encryptionKeyMode
     */
    public String getEncryptionKeyMode() {
        return this.encryptionKeyMode;
    }

    /**
     * @return encryptionStatus
     */
    public String getEncryptionStatus() {
        return this.encryptionStatus;
    }

    /**
     * @return isRotate
     */
    public Boolean getIsRotate() {
        return this.isRotate;
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
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return whiteListMode
     */
    public Boolean getWhiteListMode() {
        return this.whiteListMode;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceCLSRequest, Builder> {
        private String DBInstanceId; 
        private String encryptionAlgorithm; 
        private String encryptionKey; 
        private String encryptionKeyMode; 
        private String encryptionStatus; 
        private Boolean isRotate; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String roleArn; 
        private Boolean whiteListMode; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceCLSRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.encryptionAlgorithm = request.encryptionAlgorithm;
            this.encryptionKey = request.encryptionKey;
            this.encryptionKeyMode = request.encryptionKeyMode;
            this.encryptionStatus = request.encryptionStatus;
            this.isRotate = request.isRotate;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.roleArn = request.roleArn;
            this.whiteListMode = request.whiteListMode;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-t4n8t18o******6d5</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The encryption algorithm. Valid values:</p>
         * <ul>
         * <li>AES_128_CBC</li>
         * <li>AES_128_GCM</li>
         * <li>AES_128_CTR</li>
         * <li>AES_128_ECB</li>
         * <li>AES_256_CBC</li>
         * <li>AES_256_GCM</li>
         * <li>AES_256_CTR</li>
         * <li>AES_256_ECB</li>
         * <li>SM4_128_CBC</li>
         * <li>SM4_128_GCM</li>
         * <li>SM4_128_CTR</li>
         * <li>SM4_128_ECB</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AES_256_GCM</p>
         */
        public Builder encryptionAlgorithm(String encryptionAlgorithm) {
            this.putQueryParameter("EncryptionAlgorithm", encryptionAlgorithm);
            this.encryptionAlgorithm = encryptionAlgorithm;
            return this;
        }

        /**
         * <p>The encryption key ID. This parameter is required when you use a KMS key.</p>
         * 
         * <strong>example:</strong>
         * <p>749c1df7-<strong><strong>-</strong></strong>-<strong><strong>-</strong></strong></p>
         */
        public Builder encryptionKey(String encryptionKey) {
            this.putQueryParameter("EncryptionKey", encryptionKey);
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * <p>The column encryption key mode. Valid values:</p>
         * <ul>
         * <li>client_key: configures a user-generated random key on the client side.</li>
         * <li>kms_key: configures a custom key by using Alibaba Cloud Key Management Service (KMS).</li>
         * </ul>
         * <blockquote>
         * <p> After an instance is configured to use KMS for key management, you can no longer switch to the client-side random key mode.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>kms_key</p>
         */
        public Builder encryptionKeyMode(String encryptionKeyMode) {
            this.putQueryParameter("EncryptionKeyMode", encryptionKeyMode);
            this.encryptionKeyMode = encryptionKeyMode;
            return this;
        }

        /**
         * <p>The column encryption status. Valid values:</p>
         * <ul>
         * <li>1: Encryption is enabled.</li>
         * <li>0: Encryption is disabled.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder encryptionStatus(String encryptionStatus) {
            this.putQueryParameter("EncryptionStatus", encryptionStatus);
            this.encryptionStatus = encryptionStatus;
            return this;
        }

        /**
         * <p>Specifies whether to rotate the key.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isRotate(Boolean isRotate) {
            this.putQueryParameter("IsRotate", isRotate);
            this.isRotate = isRotate;
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
         * <p>The global resource descriptor of the RAM role, used to specify the role to assume. For details, see RAM role overview.</p>
         * <blockquote>
         * <p> This parameter takes effect only when the column encryption key pattern is set to kms_key. If you do not specify this parameter, the internal default value is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1406926****:role/aliyunrdsinstanceencryptiondefaultrole</p>
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>Specifies whether to enable the whitelist mode. A value of true indicates that only columns in the whitelist are encrypted. A value of false indicates that all columns are encrypted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder whiteListMode(Boolean whiteListMode) {
            this.putQueryParameter("WhiteListMode", whiteListMode);
            this.whiteListMode = whiteListMode;
            return this;
        }

        @Override
        public ModifyDBInstanceCLSRequest build() {
            return new ModifyDBInstanceCLSRequest(this);
        } 

    } 

}
