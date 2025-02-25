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
 * {@link CreateReplicationVaultRequest} extends {@link RequestModel}
 *
 * <p>CreateReplicationVaultRequest</p>
 */
public class CreateReplicationVaultRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("RedundancyType")
    private String redundancyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicationSourceRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String replicationSourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicationSourceVaultId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String replicationSourceVaultId;

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

    private CreateReplicationVaultRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.encryptType = builder.encryptType;
        this.kmsKeyId = builder.kmsKeyId;
        this.redundancyType = builder.redundancyType;
        this.replicationSourceRegionId = builder.replicationSourceRegionId;
        this.replicationSourceVaultId = builder.replicationSourceVaultId;
        this.vaultName = builder.vaultName;
        this.vaultRegionId = builder.vaultRegionId;
        this.vaultStorageClass = builder.vaultStorageClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReplicationVaultRequest create() {
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
     * @return redundancyType
     */
    public String getRedundancyType() {
        return this.redundancyType;
    }

    /**
     * @return replicationSourceRegionId
     */
    public String getReplicationSourceRegionId() {
        return this.replicationSourceRegionId;
    }

    /**
     * @return replicationSourceVaultId
     */
    public String getReplicationSourceVaultId() {
        return this.replicationSourceVaultId;
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

    public static final class Builder extends Request.Builder<CreateReplicationVaultRequest, Builder> {
        private String description; 
        private String encryptType; 
        private String kmsKeyId; 
        private String redundancyType; 
        private String replicationSourceRegionId; 
        private String replicationSourceVaultId; 
        private String vaultName; 
        private String vaultRegionId; 
        private String vaultStorageClass; 

        private Builder() {
            super();
        } 

        private Builder(CreateReplicationVaultRequest request) {
            super(request);
            this.description = request.description;
            this.encryptType = request.encryptType;
            this.kmsKeyId = request.kmsKeyId;
            this.redundancyType = request.redundancyType;
            this.replicationSourceRegionId = request.replicationSourceRegionId;
            this.replicationSourceVaultId = request.replicationSourceVaultId;
            this.vaultName = request.vaultName;
            this.vaultRegionId = request.vaultRegionId;
            this.vaultStorageClass = request.vaultStorageClass;
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
         * <p>HBR_PRIVATE</p>
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
         * <p>alias/test</p>
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.putQueryParameter("KmsKeyId", kmsKeyId);
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * <p>The data redundancy type of the backup vault. Valid values:</p>
         * <ul>
         * <li>LRS: standard locally redundant storage (LRS). Cloud Backup stores the copies of each object on multiple devices of different facilities in the same zone. This way, Cloud Backup ensures data durability and availability even if hardware failures occur.</li>
         * <li>ZRS: standard zone-redundant storage (ZRS). Cloud Backup uses the multi-zone mechanism to distribute data across three zones within the same region. If a zone fails, the data that is stored in the other two zones is still accessible.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LRS</p>
         */
        public Builder redundancyType(String redundancyType) {
            this.putQueryParameter("RedundancyType", redundancyType);
            this.redundancyType = redundancyType;
            return this;
        }

        /**
         * <p>The ID of the region where the source vault resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder replicationSourceRegionId(String replicationSourceRegionId) {
            this.putQueryParameter("ReplicationSourceRegionId", replicationSourceRegionId);
            this.replicationSourceRegionId = replicationSourceRegionId;
            return this;
        }

        /**
         * <p>The ID of the source vault.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v-*********************</p>
         */
        public Builder replicationSourceVaultId(String replicationSourceVaultId) {
            this.putQueryParameter("ReplicationSourceVaultId", replicationSourceVaultId);
            this.replicationSourceVaultId = replicationSourceVaultId;
            return this;
        }

        /**
         * <p>The name of the backup vault. The name must be 1 to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mirrorvaultname</p>
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
         * <p>The storage type of the backup vault. Valid value: <strong>STANDARD</strong>, which indicates standard storage.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        public Builder vaultStorageClass(String vaultStorageClass) {
            this.putQueryParameter("VaultStorageClass", vaultStorageClass);
            this.vaultStorageClass = vaultStorageClass;
            return this;
        }

        @Override
        public CreateReplicationVaultRequest build() {
            return new CreateReplicationVaultRequest(this);
        } 

    } 

}
