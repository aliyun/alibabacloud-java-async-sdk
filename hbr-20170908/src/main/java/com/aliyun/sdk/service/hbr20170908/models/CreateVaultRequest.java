// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link CreateVaultRequest} extends {@link RequestModel}
 *
 * <p>CreateVaultRequest</p>
 */
public class CreateVaultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptType")
    private String encryptType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KmsKeyId")
    private String kmsKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vaultName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vaultRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultStorageClass")
    private String vaultStorageClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultType")
    private String vaultType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WormEnabled")
    private Boolean wormEnabled;

    private CreateVaultRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.encryptType = builder.encryptType;
        this.kmsKeyId = builder.kmsKeyId;
        this.vaultName = builder.vaultName;
        this.vaultRegionId = builder.vaultRegionId;
        this.vaultStorageClass = builder.vaultStorageClass;
        this.vaultType = builder.vaultType;
        this.wormEnabled = builder.wormEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVaultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return encryptType
     */
    public String getEncryptType() {
        return this.encryptType;
    }

    /**
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * @return vaultName
     */
    public String getVaultName() {
        return this.vaultName;
    }

    /**
     * @return vaultRegionId
     */
    public String getVaultRegionId() {
        return this.vaultRegionId;
    }

    /**
     * @return vaultStorageClass
     */
    public String getVaultStorageClass() {
        return this.vaultStorageClass;
    }

    /**
     * @return vaultType
     */
    public String getVaultType() {
        return this.vaultType;
    }

    /**
     * @return wormEnabled
     */
    public Boolean getWormEnabled() {
        return this.wormEnabled;
    }

    public static final class Builder extends Request.Builder<CreateVaultRequest, Builder> {
        private String description; 
        private String encryptType; 
        private String kmsKeyId; 
        private String vaultName; 
        private String vaultRegionId; 
        private String vaultStorageClass; 
        private String vaultType; 
        private Boolean wormEnabled; 

        private Builder() {
            super();
        } 

        private Builder(CreateVaultRequest request) {
            super(request);
            this.description = request.description;
            this.encryptType = request.encryptType;
            this.kmsKeyId = request.kmsKeyId;
            this.vaultName = request.vaultName;
            this.vaultRegionId = request.vaultRegionId;
            this.vaultStorageClass = request.vaultStorageClass;
            this.vaultType = request.vaultType;
            this.wormEnabled = request.wormEnabled;
        } 

        /**
         * <p>The description of the backup vault. The description must be 0 to 255 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The method that is used to encrypt the source data. This parameter is valid only if you set the VaultType parameter to STANDARD or OTS_BACKUP. Valid values:</p>
         * <ul>
         * <li><strong>HBR_PRIVATE</strong>: The source data is encrypted by using the built-in encryption method of Hybrid Backup Recovery (HBR).</li>
         * <li><strong>KMS</strong>: The source data is encrypted by using Key Management Service (KMS).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KMS</p>
         */
        public Builder encryptType(String encryptType) {
            this.putQueryParameter("EncryptType", encryptType);
            this.encryptType = encryptType;
            return this;
        }

        /**
         * <p>The customer master key (CMK) created in KMS or the alias of the key. This parameter is required only if you set the EncryptType parameter to KMS.</p>
         * 
         * <strong>example:</strong>
         * <p>alias/yzs-hhht</p>
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.putQueryParameter("KmsKeyId", kmsKeyId);
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * <p>The name of the backup vault. The name must be 1 to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>backupvaultname</p>
         */
        public Builder vaultName(String vaultName) {
            this.putQueryParameter("VaultName", vaultName);
            this.vaultName = vaultName;
            return this;
        }

        /**
         * <p>The ID of the region where the backup vault resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder vaultRegionId(String vaultRegionId) {
            this.putQueryParameter("VaultRegionId", vaultRegionId);
            this.vaultRegionId = vaultRegionId;
            return this;
        }

        /**
         * <p>The storage type of the backup vault. Valid value: </p>
         * <ul>
         * <li><strong>STANDARD</strong>: standard storage.</li>
         * <li><strong>ARCHIVE</strong>: deprected.</li>
         * <li><strong>COLD_ARCHIVE</strong>: deprected.</li>
         * <li><strong>IA</strong>: deprected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        public Builder vaultStorageClass(String vaultStorageClass) {
            this.putQueryParameter("VaultStorageClass", vaultStorageClass);
            this.vaultStorageClass = vaultStorageClass;
            return this;
        }

        /**
         * <p>The type of the backup vault. Valid values:</p>
         * <ul>
         * <li><strong>STANDARD</strong>: standard backup vault</li>
         * <li><strong>OTS_BACKUP</strong>: backup vault for Tablestore</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        public Builder vaultType(String vaultType) {
            this.putQueryParameter("VaultType", vaultType);
            this.vaultType = vaultType;
            return this;
        }

        /**
         * <p>Whether to enable the vault worm feature. Once the worm feature is enabled, the vault and all its backup data cannot be deleted before they automatically expire. After enabling the worm feature, it is not supported to disable it. The worm feature is only effective for standard and archive backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder wormEnabled(Boolean wormEnabled) {
            this.putQueryParameter("WormEnabled", wormEnabled);
            this.wormEnabled = wormEnabled;
            return this;
        }

        @Override
        public CreateVaultRequest build() {
            return new CreateVaultRequest(this);
        } 

    } 

}
