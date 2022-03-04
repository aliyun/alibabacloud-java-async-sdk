// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDiskAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDiskAttributeRequest</p>
 */
public class ModifyDiskAttributeRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("DiskName")
    private String diskName;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DeleteWithInstance")
    private Boolean deleteWithInstance;

    @Query
    @NameInMap("DiskIds")
    private java.util.List < String > diskIds;

    @Query
    @NameInMap("DiskId")
    private String diskId;

    @Query
    @NameInMap("DeleteAutoSnapshot")
    private Boolean deleteAutoSnapshot;

    @Query
    @NameInMap("EnableAutoSnapshot")
    private Boolean enableAutoSnapshot;

    private ModifyDiskAttributeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.diskName = builder.diskName;
        this.description = builder.description;
        this.regionId = builder.regionId;
        this.deleteWithInstance = builder.deleteWithInstance;
        this.diskIds = builder.diskIds;
        this.diskId = builder.diskId;
        this.deleteAutoSnapshot = builder.deleteAutoSnapshot;
        this.enableAutoSnapshot = builder.enableAutoSnapshot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDiskAttributeRequest create() {
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return diskName
     */
    public String getDiskName() {
        return this.diskName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return deleteWithInstance
     */
    public Boolean getDeleteWithInstance() {
        return this.deleteWithInstance;
    }

    /**
     * @return diskIds
     */
    public java.util.List < String > getDiskIds() {
        return this.diskIds;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return deleteAutoSnapshot
     */
    public Boolean getDeleteAutoSnapshot() {
        return this.deleteAutoSnapshot;
    }

    /**
     * @return enableAutoSnapshot
     */
    public Boolean getEnableAutoSnapshot() {
        return this.enableAutoSnapshot;
    }

    public static final class Builder extends Request.Builder<ModifyDiskAttributeRequest, Builder> {
        private String sourceRegionId; 
        private String ownerAccount; 
        private Long ownerId; 
        private Long resourceOwnerId; 
        private String resourceOwnerAccount; 
        private String diskName; 
        private String description; 
        private String regionId; 
        private Boolean deleteWithInstance; 
        private java.util.List < String > diskIds; 
        private String diskId; 
        private Boolean deleteAutoSnapshot; 
        private Boolean enableAutoSnapshot; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDiskAttributeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.diskName = request.diskName;
            this.description = request.description;
            this.regionId = request.regionId;
            this.deleteWithInstance = request.deleteWithInstance;
            this.diskIds = request.diskIds;
            this.diskId = request.diskId;
            this.deleteAutoSnapshot = request.deleteAutoSnapshot;
            this.enableAutoSnapshot = request.enableAutoSnapshot;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * The ID of the RAM user.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The account name of the resource master account.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * The name of the disk. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with "http:// "or "https. It can contain numbers, colons (:), underscores (_), and hyphens (-).
         * <p>
         * 
         */
        public Builder diskName(String diskName) {
            this.putQueryParameter("DiskName", diskName);
            this.diskName = diskName;
            return this;
        }

        /**
         * The description of the disk. The description must be 2 to 256 characters in length and cannot start with "http:// "or "https.
         * <p>
         * 
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the region. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Indicates whether the disk is released with the instance. Default value: none.
         * <p>
         * 
         * <props = "china"> this parameter is not supported for disks with multiple mount features enabled. </props>
         * 
         * If you set the "DeleteWithInstance" parameter to "false", an error is returned.
         * 
         * -When the category of the disk is ephemeral.
         * -If the category of a disk is standard cloud and cannot be detached (Portable = false).
         * 
         */
        public Builder deleteWithInstance(Boolean deleteWithInstance) {
            this.putQueryParameter("DeleteWithInstance", deleteWithInstance);
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }

        /**
         * The IDs of multiple disks to be modified. Valid values of N: 0 to 100.
         * <p>
         * > "DiskId" and "DiskIds.... parameters cannot be called at the same time. Select either of them as needed.
         */
        public Builder diskIds(java.util.List < String > diskIds) {
            this.putQueryParameter("DiskIds", diskIds);
            this.diskIds = diskIds;
            return this;
        }

        /**
         * The ID of the disk to be modified.
         * <p>
         * > "DiskId" and "DiskIds.... parameters cannot be called at the same time. Select either of them as needed.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * Specifies whether to delete automatic snapshots of disks at the same time. Default value: none.
         */
        public Builder deleteAutoSnapshot(Boolean deleteAutoSnapshot) {
            this.putQueryParameter("DeleteAutoSnapshot", deleteAutoSnapshot);
            this.deleteAutoSnapshot = deleteAutoSnapshot;
            return this;
        }

        /**
         * Specifies whether to enable automatic snapshot policies for disks.
         * <p>
         * 
         * -ture: enabled
         * -false: disabled
         * 
         * Default value: none.
         * 
         * > by default, the automatic snapshot policy is enabled for the created cloud disk. You only need to bind an automatic snapshot policy to the disk.
         */
        public Builder enableAutoSnapshot(Boolean enableAutoSnapshot) {
            this.putQueryParameter("EnableAutoSnapshot", enableAutoSnapshot);
            this.enableAutoSnapshot = enableAutoSnapshot;
            return this;
        }

        @Override
        public ModifyDiskAttributeRequest build() {
            return new ModifyDiskAttributeRequest(this);
        } 

    } 

}
