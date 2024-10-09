// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDiskAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDiskAttributeRequest</p>
 */
public class ModifyDiskAttributeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
    private Boolean burstingEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteAutoSnapshot")
    private Boolean deleteAutoSnapshot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteWithInstance")
    private Boolean deleteWithInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    private String diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskIds")
    private java.util.List < String > diskIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskName")
    private String diskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAutoSnapshot")
    private Boolean enableAutoSnapshot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyDiskAttributeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.burstingEnabled = builder.burstingEnabled;
        this.deleteAutoSnapshot = builder.deleteAutoSnapshot;
        this.deleteWithInstance = builder.deleteWithInstance;
        this.description = builder.description;
        this.diskId = builder.diskId;
        this.diskIds = builder.diskIds;
        this.diskName = builder.diskName;
        this.enableAutoSnapshot = builder.enableAutoSnapshot;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
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
     * @return burstingEnabled
     */
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    /**
     * @return deleteAutoSnapshot
     */
    public Boolean getDeleteAutoSnapshot() {
        return this.deleteAutoSnapshot;
    }

    /**
     * @return deleteWithInstance
     */
    public Boolean getDeleteWithInstance() {
        return this.deleteWithInstance;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return diskIds
     */
    public java.util.List < String > getDiskIds() {
        return this.diskIds;
    }

    /**
     * @return diskName
     */
    public String getDiskName() {
        return this.diskName;
    }

    /**
     * @return enableAutoSnapshot
     */
    public Boolean getEnableAutoSnapshot() {
        return this.enableAutoSnapshot;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<ModifyDiskAttributeRequest, Builder> {
        private String sourceRegionId; 
        private Boolean burstingEnabled; 
        private Boolean deleteAutoSnapshot; 
        private Boolean deleteWithInstance; 
        private String description; 
        private String diskId; 
        private java.util.List < String > diskIds; 
        private String diskName; 
        private Boolean enableAutoSnapshot; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDiskAttributeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.burstingEnabled = request.burstingEnabled;
            this.deleteAutoSnapshot = request.deleteAutoSnapshot;
            this.deleteWithInstance = request.deleteWithInstance;
            this.description = request.description;
            this.diskId = request.diskId;
            this.diskIds = request.diskIds;
            this.diskName = request.diskName;
            this.enableAutoSnapshot = request.enableAutoSnapshot;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * <p>Specifies whether to enable the performance burst feature for data disk N. Valid values:</p>
         * <ul>
         * <li>true: encrypts the disk.</li>
         * <li>false: does not encrypt the disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder burstingEnabled(Boolean burstingEnabled) {
            this.putQueryParameter("BurstingEnabled", burstingEnabled);
            this.burstingEnabled = burstingEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to delete the automatic snapshots of the disk when the disk is released. This parameter is empty by default, which indicates that the current value remains unchanged.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deleteAutoSnapshot(Boolean deleteAutoSnapshot) {
            this.putQueryParameter("DeleteAutoSnapshot", deleteAutoSnapshot);
            this.deleteAutoSnapshot = deleteAutoSnapshot;
            return this;
        }

        /**
         * <p>Specifies whether to release the disk along with its associated instance. This parameter is empty by default, which indicates that the current value remains unchanged.</p>
         * <p>An error is returned if you set <code>DeleteWithInstance</code> to <code>false</code> in one of the following cases:</p>
         * <ul>
         * <li>The disk is a local disk.</li>
         * <li>The disk is a basic disk and is not removable. If the Portable attribute of a disk is set to false, the disk is not removable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deleteWithInstance(Boolean deleteWithInstance) {
            this.putQueryParameter("DeleteWithInstance", deleteWithInstance);
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }

        /**
         * <p>The description of the disk. The description must be 2 to 256 characters in length. It cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the disk.</p>
         * <blockquote>
         * <p>You can specify the <code>DiskId</code> parameter or the <code>DiskIds.N</code> parameter, but you cannot specify both parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>d-bp1famypsnar20bv****</p>
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * <p>The ID of disk N. Valid values of N: 0 to 100.</p>
         * <blockquote>
         * <p>You can specify the <code>DiskId</code> parameter or the <code>DiskIds.N</code> parameter, but you cannot specify both parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>d-bp1famypsnar20bv****</p>
         */
        public Builder diskIds(java.util.List < String > diskIds) {
            this.putQueryParameter("DiskIds", diskIds);
            this.diskIds = diskIds;
            return this;
        }

        /**
         * <p>The name of the disk. The name must be 2 to 128 characters in length and can contain Unicode characters under the Decimal Number category and the categories whose names contain Letter. The name can also contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>MyDiskName</p>
         */
        public Builder diskName(String diskName) {
            this.putQueryParameter("DiskName", diskName);
            this.diskName = diskName;
            return this;
        }

        /**
         * <p>Specifies whether to enable the automatic snapshot policy feature for the cloud disk. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>This parameter is empty by default, which indicates that the current value remains unchanged.</p>
         * <blockquote>
         * <p> By default, the automatic snapshot policy feature is enabled for cloud disks. You only need to associate an automatic snapshot policy with a cloud disk before you can use the policy.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAutoSnapshot(Boolean enableAutoSnapshot) {
            this.putQueryParameter("EnableAutoSnapshot", enableAutoSnapshot);
            this.enableAutoSnapshot = enableAutoSnapshot;
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
         * <p>The region ID of the command. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent list of regions.</p>
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
        public ModifyDiskAttributeRequest build() {
            return new ModifyDiskAttributeRequest(this);
        } 

    } 

}
