// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDiskDeploymentRequest} extends {@link RequestModel}
 *
 * <p>ModifyDiskDeploymentRequest</p>
 */
public class ModifyDiskDeploymentRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("DiskCategory")
    private String diskCategory;

    @Query
    @NameInMap("DiskId")
    @Validation(required = true)
    private String diskId;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PerformanceLevel")
    private String performanceLevel;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("StorageClusterId")
    private String storageClusterId;

    private ModifyDiskDeploymentRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.diskCategory = builder.diskCategory;
        this.diskId = builder.diskId;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.performanceLevel = builder.performanceLevel;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.storageClusterId = builder.storageClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDiskDeploymentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return diskCategory
     */
    public String getDiskCategory() {
        return this.diskCategory;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
     * @return performanceLevel
     */
    public String getPerformanceLevel() {
        return this.performanceLevel;
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
     * @return storageClusterId
     */
    public String getStorageClusterId() {
        return this.storageClusterId;
    }

    public static final class Builder extends Request.Builder<ModifyDiskDeploymentRequest, Builder> {
        private String sourceRegionId; 
        private String diskCategory; 
        private String diskId; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String performanceLevel; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String storageClusterId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDiskDeploymentRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.diskCategory = request.diskCategory;
            this.diskId = request.diskId;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.performanceLevel = request.performanceLevel;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.storageClusterId = request.storageClusterId;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * The new disk category. The parameter can be used only when you migrate a disk between dedicated block storage clusters. Only ESSDs can be created in dedicated block storage clusters. Set this parameter to cloud_essd.
         * <p>
         * 
         * This parameter is empty by default, which indicates that the disk category is not changed.
         */
        public Builder diskCategory(String diskCategory) {
            this.putQueryParameter("DiskCategory", diskCategory);
            this.diskCategory = diskCategory;
            return this;
        }

        /**
         * The ID of the disk.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   true: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, service limits, and unavailable ECS resources. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.
         * *   false: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         * 
         * Default value: false.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
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
         * The new performance level of the ESSD. The parameter can be used only when you migrate data between dedicated block storage clusters. Valid values:
         * <p>
         * 
         * *   PL0: A single ESSD can deliver up to 10000 random read/write IOPS.
         * *   PL1: A single ESSD can deliver up to 50000 random read/write IOPS.
         * 
         * This parameter is empty by default, which indicates that the performance level is not modified.
         */
        public Builder performanceLevel(String performanceLevel) {
            this.putQueryParameter("PerformanceLevel", performanceLevel);
            this.performanceLevel = performanceLevel;
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
         * The ID of the dedicated block storage cluster.
         * <p>
         * 
         * *   When you migrate a disk to a dedicated block storage cluster, the StorageClusterId parameter must be specified.
         * *   When you migrate a disk to a public block storage cluster, the StorageClusterId parameter must be left empty.
         * 
         * This parameter is empty by default, which indicates that the disk is migrated to a public block storage cluster.
         */
        public Builder storageClusterId(String storageClusterId) {
            this.putQueryParameter("StorageClusterId", storageClusterId);
            this.storageClusterId = storageClusterId;
            return this;
        }

        @Override
        public ModifyDiskDeploymentRequest build() {
            return new ModifyDiskDeploymentRequest(this);
        } 

    } 

}
