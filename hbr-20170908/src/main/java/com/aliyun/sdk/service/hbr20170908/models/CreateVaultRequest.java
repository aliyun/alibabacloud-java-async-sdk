// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVaultRequest} extends {@link RequestModel}
 *
 * <p>CreateVaultRequest</p>
 */
public class CreateVaultRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EncryptType")
    private String encryptType;

    @Query
    @NameInMap("KmsKeyId")
    private String kmsKeyId;

    @Query
    @NameInMap("VaultName")
    @Validation(required = true)
    private String vaultName;

    @Query
    @NameInMap("VaultRegionId")
    @Validation(required = true)
    private String vaultRegionId;

    @Query
    @NameInMap("VaultStorageClass")
    private String vaultStorageClass;

    @Query
    @NameInMap("VaultType")
    private String vaultType;

    private CreateVaultRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.encryptType = builder.encryptType;
        this.kmsKeyId = builder.kmsKeyId;
        this.vaultName = builder.vaultName;
        this.vaultRegionId = builder.vaultRegionId;
        this.vaultStorageClass = builder.vaultStorageClass;
        this.vaultType = builder.vaultType;
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

    public static final class Builder extends Request.Builder<CreateVaultRequest, Builder> {
        private String description; 
        private String encryptType; 
        private String kmsKeyId; 
        private String vaultName; 
        private String vaultRegionId; 
        private String vaultStorageClass; 
        private String vaultType; 

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
        } 

        /**
         * The description of the backup vault. The description must be 0 to 255 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The method that is used to encrypt the source data. This parameter is valid only if you set the VaultType parameter to STANDARD or OTS_BACKUP. Valid values:
         * <p>
         * 
         * *   **HBR_PRIVATE**: The source data is encrypted by using the built-in encryption method of Hybrid Backup Recovery (HBR).
         * *   **KMS**: The source data is encrypted by using Key Management Service (KMS).
         */
        public Builder encryptType(String encryptType) {
            this.putQueryParameter("EncryptType", encryptType);
            this.encryptType = encryptType;
            return this;
        }

        /**
         * The customer master key (CMK) created in KMS or the alias of the key. This parameter is required only if you set the EncryptType parameter to KMS.
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.putQueryParameter("KmsKeyId", kmsKeyId);
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * The name of the backup vault. The name must be 1 to 64 characters in length.
         */
        public Builder vaultName(String vaultName) {
            this.putQueryParameter("VaultName", vaultName);
            this.vaultName = vaultName;
            return this;
        }

        /**
         * The ID of the region where the backup vault resides.
         */
        public Builder vaultRegionId(String vaultRegionId) {
            this.putQueryParameter("VaultRegionId", vaultRegionId);
            this.vaultRegionId = vaultRegionId;
            return this;
        }

        /**
         * The storage type of the backup vault. Valid value: **STANDARD**, which indicates standard storage.
         */
        public Builder vaultStorageClass(String vaultStorageClass) {
            this.putQueryParameter("VaultStorageClass", vaultStorageClass);
            this.vaultStorageClass = vaultStorageClass;
            return this;
        }

        /**
         * The type of the backup vault. Valid value
         * <p>
         * 
         * *   **STANDARD**: standard backup vault
         * *   **OTS_BACKUP**: backup vault for Tablestore
         */
        public Builder vaultType(String vaultType) {
            this.putQueryParameter("VaultType", vaultType);
            this.vaultType = vaultType;
            return this;
        }

        @Override
        public CreateVaultRequest build() {
            return new CreateVaultRequest(this);
        } 

    } 

}
