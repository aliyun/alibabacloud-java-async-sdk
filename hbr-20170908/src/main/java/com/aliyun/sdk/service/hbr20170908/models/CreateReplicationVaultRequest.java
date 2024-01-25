// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReplicationVaultRequest} extends {@link RequestModel}
 *
 * <p>CreateReplicationVaultRequest</p>
 */
public class CreateReplicationVaultRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("RedundancyType")
    private String redundancyType;

    @Query
    @NameInMap("ReplicationSourceRegionId")
    @Validation(required = true)
    private String replicationSourceRegionId;

    @Query
    @NameInMap("ReplicationSourceVaultId")
    @Validation(required = true)
    private String replicationSourceVaultId;

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

    private CreateReplicationVaultRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
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
            this.redundancyType = request.redundancyType;
            this.replicationSourceRegionId = request.replicationSourceRegionId;
            this.replicationSourceVaultId = request.replicationSourceVaultId;
            this.vaultName = request.vaultName;
            this.vaultRegionId = request.vaultRegionId;
            this.vaultStorageClass = request.vaultStorageClass;
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
         * The data redundancy type of the backup vault. Valid values:
         * <p>
         * 
         * - LRS: Locally redundant storage (LRS) is enabled for the backup vault. HBR stores the copies of each object on multiple devices of different facilities in the same zone. This way, HBR ensures data durability and availability even if hardware failures occur.
         * - ZRS: Zone-redundant storage (ZRS) is enabled for the backup vault. HBR uses the multi-zone mechanism to distribute data across three zones within the same region. If a zone becomes unavailable, the data can still be accessed.
         */
        public Builder redundancyType(String redundancyType) {
            this.putQueryParameter("RedundancyType", redundancyType);
            this.redundancyType = redundancyType;
            return this;
        }

        /**
         * The ID of the region where the source vault resides.
         */
        public Builder replicationSourceRegionId(String replicationSourceRegionId) {
            this.putQueryParameter("ReplicationSourceRegionId", replicationSourceRegionId);
            this.replicationSourceRegionId = replicationSourceRegionId;
            return this;
        }

        /**
         * The ID of the source vault.
         */
        public Builder replicationSourceVaultId(String replicationSourceVaultId) {
            this.putQueryParameter("ReplicationSourceVaultId", replicationSourceVaultId);
            this.replicationSourceVaultId = replicationSourceVaultId;
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
         * The storage type of the backup vault. Valid value: **STANDARD**. The value indicates standard storage.
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
