// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiskRequest} extends {@link RequestModel}
 *
 * <p>CreateDiskRequest</p>
 */
public class CreateDiskRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("AdvancedFeatures")
    private String advancedFeatures;

    @Query
    @NameInMap("EncryptAlgorithm")
    private String encryptAlgorithm;

    @Query
    @NameInMap("ProvisionedIops")
    private Long provisionedIops;

    @Query
    @NameInMap("BurstingEnabled")
    private Boolean burstingEnabled;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("Arn")
    private java.util.List < Arn> arn;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("KMSKeyId")
    private String KMSKeyId;

    @Query
    @NameInMap("StorageSetPartitionNumber")
    private Integer storageSetPartitionNumber;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("MultiAttach")
    private String multiAttach;

    @Query
    @NameInMap("DiskName")
    private String diskName;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("StorageClusterId")
    private String storageClusterId;

    @Query
    @NameInMap("SnapshotId")
    private String snapshotId;

    @Query
    @NameInMap("StorageSetId")
    private String storageSetId;

    @Query
    @NameInMap("Encrypted")
    private Boolean encrypted;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("PerformanceLevel")
    private String performanceLevel;

    @Query
    @NameInMap("DiskCategory")
    private String diskCategory;

    @Query
    @NameInMap("Size")
    private Integer size;

    private CreateDiskRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.advancedFeatures = builder.advancedFeatures;
        this.encryptAlgorithm = builder.encryptAlgorithm;
        this.provisionedIops = builder.provisionedIops;
        this.burstingEnabled = builder.burstingEnabled;
        this.tag = builder.tag;
        this.arn = builder.arn;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.zoneId = builder.zoneId;
        this.description = builder.description;
        this.clientToken = builder.clientToken;
        this.KMSKeyId = builder.KMSKeyId;
        this.storageSetPartitionNumber = builder.storageSetPartitionNumber;
        this.regionId = builder.regionId;
        this.multiAttach = builder.multiAttach;
        this.diskName = builder.diskName;
        this.instanceId = builder.instanceId;
        this.storageClusterId = builder.storageClusterId;
        this.snapshotId = builder.snapshotId;
        this.storageSetId = builder.storageSetId;
        this.encrypted = builder.encrypted;
        this.resourceGroupId = builder.resourceGroupId;
        this.performanceLevel = builder.performanceLevel;
        this.diskCategory = builder.diskCategory;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiskRequest create() {
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
     * @return advancedFeatures
     */
    public String getAdvancedFeatures() {
        return this.advancedFeatures;
    }

    /**
     * @return encryptAlgorithm
     */
    public String getEncryptAlgorithm() {
        return this.encryptAlgorithm;
    }

    /**
     * @return provisionedIops
     */
    public Long getProvisionedIops() {
        return this.provisionedIops;
    }

    /**
     * @return burstingEnabled
     */
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return arn
     */
    public java.util.List < Arn> getArn() {
        return this.arn;
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return KMSKeyId
     */
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    /**
     * @return storageSetPartitionNumber
     */
    public Integer getStorageSetPartitionNumber() {
        return this.storageSetPartitionNumber;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return multiAttach
     */
    public String getMultiAttach() {
        return this.multiAttach;
    }

    /**
     * @return diskName
     */
    public String getDiskName() {
        return this.diskName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return storageClusterId
     */
    public String getStorageClusterId() {
        return this.storageClusterId;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return storageSetId
     */
    public String getStorageSetId() {
        return this.storageSetId;
    }

    /**
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return performanceLevel
     */
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    /**
     * @return diskCategory
     */
    public String getDiskCategory() {
        return this.diskCategory;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<CreateDiskRequest, Builder> {
        private String sourceRegionId; 
        private String ownerAccount; 
        private String advancedFeatures; 
        private String encryptAlgorithm; 
        private Long provisionedIops; 
        private Boolean burstingEnabled; 
        private java.util.List < Tag> tag; 
        private java.util.List < Arn> arn; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String zoneId; 
        private String description; 
        private String clientToken; 
        private String KMSKeyId; 
        private Integer storageSetPartitionNumber; 
        private String regionId; 
        private String multiAttach; 
        private String diskName; 
        private String instanceId; 
        private String storageClusterId; 
        private String snapshotId; 
        private String storageSetId; 
        private Boolean encrypted; 
        private String resourceGroupId; 
        private String performanceLevel; 
        private String diskCategory; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(CreateDiskRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.ownerAccount = response.ownerAccount;
            this.advancedFeatures = response.advancedFeatures;
            this.encryptAlgorithm = response.encryptAlgorithm;
            this.provisionedIops = response.provisionedIops;
            this.burstingEnabled = response.burstingEnabled;
            this.tag = response.tag;
            this.arn = response.arn;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.zoneId = response.zoneId;
            this.description = response.description;
            this.clientToken = response.clientToken;
            this.KMSKeyId = response.KMSKeyId;
            this.storageSetPartitionNumber = response.storageSetPartitionNumber;
            this.regionId = response.regionId;
            this.multiAttach = response.multiAttach;
            this.diskName = response.diskName;
            this.instanceId = response.instanceId;
            this.storageClusterId = response.storageClusterId;
            this.snapshotId = response.snapshotId;
            this.storageSetId = response.storageSetId;
            this.encrypted = response.encrypted;
            this.resourceGroupId = response.resourceGroupId;
            this.performanceLevel = response.performanceLevel;
            this.diskCategory = response.diskCategory;
            this.size = response.size;
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
         * AdvancedFeatures.
         */
        public Builder advancedFeatures(String advancedFeatures) {
            this.putQueryParameter("AdvancedFeatures", advancedFeatures);
            this.advancedFeatures = advancedFeatures;
            return this;
        }

        /**
         * EncryptAlgorithm.
         */
        public Builder encryptAlgorithm(String encryptAlgorithm) {
            this.putQueryParameter("EncryptAlgorithm", encryptAlgorithm);
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }

        /**
         * ProvisionedIops.
         */
        public Builder provisionedIops(Long provisionedIops) {
            this.putQueryParameter("ProvisionedIops", provisionedIops);
            this.provisionedIops = provisionedIops;
            return this;
        }

        /**
         * BurstingEnabled.
         */
        public Builder burstingEnabled(Boolean burstingEnabled) {
            this.putQueryParameter("BurstingEnabled", burstingEnabled);
            this.burstingEnabled = burstingEnabled;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * Arn.
         */
        public Builder arn(java.util.List < Arn> arn) {
            this.putQueryParameter("Arn", arn);
            this.arn = arn;
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
         * The account name of the resource master account.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
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
         * Create a pay-as-you-go cloud disk in the specified zone.
         * <p>
         * 
         * -If you do not set InstanceId, ZoneId is required.
         * -You cannot specify both ZoneId and InstanceId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The description of the disk. The description must be 2 to 256 characters in length and cannot start with "http:// "or "https.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the KMS key used by the cloud disk.
         */
        public Builder KMSKeyId(String KMSKeyId) {
            this.putQueryParameter("KMSKeyId", KMSKeyId);
            this.KMSKeyId = KMSKeyId;
            return this;
        }

        /**
         * The number of partitions in the storage set.
         */
        public Builder storageSetPartitionNumber(Integer storageSetPartitionNumber) {
            this.putQueryParameter("StorageSetPartitionNumber", storageSetPartitionNumber);
            this.storageSetPartitionNumber = storageSetPartitionNumber;
            return this;
        }

        /**
         * Belongs geo ID. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to enable the multi-Mount feature. Valid values:
         * <p>
         * 
         * -Disabled: Disabled.
         * -Enabled: Enabled. Currently, only ESSDS can be set to enabled ".
         * 
         * Default value: Disabled.
         * 
         * Note:
         * 
         * <props="china">
         * -The multi-Mount feature is in public preview. For more information, see [enable multiple mount](~~ 262105 ~~).
         * 
         * -Only pay-as-you-go billing method is supported for disks with multiple mount features. Therefore, when "MultiAttach = Enabled ", you cannot set the "InstanceId" parameter at the same time. You can call [AttachDisk](~~ 25515 ~~) to mount a cloud disk after it is created. However, you must note that a cloud disk with multiple Mount functions can only be mounted as a data disk.
         * 
         * </props>
         * <props="intl">
         * -The multi-Mount feature is in public preview. For more information, [submit a ticket](https://workorder-intl.console.aliyun.com/console.htm#/ticket/list).
         * 
         * -Only pay-as-you-go billing method is supported for disks with multiple mount features. Therefore, when "MultiAttach = Enabled ", you cannot set the "InstanceId" parameter at the same time. You can call [AttachDisk](~~ 25515 ~~) to mount a cloud disk after it is created. However, you must note that a cloud disk with multiple Mount functions can only be mounted as a data disk.
         * 
         * </props>
         * 
         */
        public Builder multiAttach(String multiAttach) {
            this.putQueryParameter("MultiAttach", multiAttach);
            this.multiAttach = multiAttach;
            return this;
        }

        /**
         * The name of the disk. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with "http:// "or "https. It can contain numbers, colons (:), periods (.), underscores (_), and hyphens (-).
         */
        public Builder diskName(String diskName) {
            this.putQueryParameter("DiskName", diskName);
            this.diskName = diskName;
            return this;
        }

        /**
         * Create a subscription cloud disk and attach it to the specified subscription instance (InstanceId).
         * <p>
         * 
         * -After you set the instance ID, the ResourceGroupId, Tag.N.Key, Tag.N.Value, ClientToken, and KMSKeyId parameters are ignored.
         * -You cannot specify both ZoneId and InstanceId.
         * 
         * The default value is null, indicating that a pay-as-you-go cloud disk is created. The location of the cloud disk is determined by the RegionId and ZoneId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the dedicated block storage cluster. If you want to create a cloud disk in a specified exclusive block storage cluster, specify this parameter. For more information about dedicated block storage clusters, see [what is dedicated block storage cluster](~~ 208883 ~~).
         * <p>
         * 
         * > You can select only one of the parameters for the storage set ("StorageSetId", "StorageSetPartitionNumber") and the parameters for the exclusive block storage cluster ("StorageClusterId"). If you set this parameter at the same time, the operation fails.
         */
        public Builder storageClusterId(String storageClusterId) {
            this.putQueryParameter("StorageClusterId", storageClusterId);
            this.storageClusterId = storageClusterId;
            return this;
        }

        /**
         * The snapshot used to create a cloud disk. Snapshots created on or before July 15, 2013 cannot be used to create cloud disks.
         * <p>
         * 
         * The "SnapshotId" parameter and the "Size" parameter have the following limits:
         * 
         * -If the snapshot capacity of the "SnapshotId" parameter is greater than the value of the "Size" parameter, the size of the disk is the size of the specified snapshot.
         * -If the snapshot size of the "SnapshotId" parameter is smaller than the value of the "Size" parameter, the size of the created disk is the value of the specified "Size" parameter.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * The ID of the storage set.
         * <p>
         * 
         * > You can select only one of the parameters for the storage set ("StorageSetId", "StorageSetPartitionNumber") and the parameters for the exclusive block storage cluster ("StorageClusterId"). If you set this parameter at the same time, the operation fails.
         */
        public Builder storageSetId(String storageSetId) {
            this.putQueryParameter("StorageSetId", storageSetId);
            this.storageSetId = storageSetId;
            return this;
        }

        /**
         * Specifies whether to encrypt the disk.
         * <p>
         * 
         * Default value: false.
         */
        public Builder encrypted(Boolean encrypted) {
            this.putQueryParameter("Encrypted", encrypted);
            this.encrypted = encrypted;
            return this;
        }

        /**
         * The ID of the resource group to which the cloud disk belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * When creating an ESSD, set the performance level of the disk. Valid values:
         * <p>
         * 
         * -PL0: The maximum random read/write IOPS per disk is 10,000.
         * -PL1: The maximum random read/write IOPS per disk is 50,000.
         * -PL2: The maximum random read/write IOPS per disk is 100,000.
         * -PL3: The maximum random read/write IOPS per disk is 1 million.
         * 
         * Default value: pl1.
         * 
         * For more information about how to select an ESSD performance level, see [ESSD cloud disk](~~ 122389 ~~).
         */
        public Builder performanceLevel(String performanceLevel) {
            this.putQueryParameter("PerformanceLevel", performanceLevel);
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * Data disk the cloud species. Valid values:
         * <p>
         * -cloud: basic cloud disk.
         * -cloud_efficiency: Ultra disk.
         * -cloud_ssd:SSD cloud disk.
         * -cloud_essd:ESSD.
         * 
         * The default value is cloud.
         */
        public Builder diskCategory(String diskCategory) {
            this.putQueryParameter("DiskCategory", diskCategory);
            this.diskCategory = diskCategory;
            return this;
        }

        /**
         * The capacity. Unit: GiB. You must specify the parameter value for this parameter. Valid values:
         * <p>
         * 
         * -cloud:5~2,000
         * -cloud_efficiency:20~32,768
         * -cloud_ssd:20~32,768
         * -cloud_essd:
         * -PL0:40~32,768
         * -PL1:20~32,768
         * -PL2:461~32,768
         * -PL3:1,261~32,768
         * 
         * If you specify the "SnapshotId" parameter, the "SnapshotId" parameter and the "Size" parameter have the following limits:
         * 
         * -If the snapshot capacity of the "SnapshotId" parameter is greater than the value of the "Size" parameter, the size of the disk is the size of the specified snapshot.
         * -If the snapshot size of the "SnapshotId" parameter is smaller than the value of the "Size" parameter, the size of the created disk is the value of the specified "Size" parameter.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public CreateDiskRequest build() {
            return new CreateDiskRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("key")
        private String key;

        @NameInMap("Value")
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
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 云盘的标签值。N的取值范围：1~20。一旦传入该值，可以为空字符串。最多支持128个字符，不能以`acs:`开头，不能包含`http://`或者`https://`。
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
    public static class Arn extends TeaModel {
        @NameInMap("RoleType")
        private String roleType;

        @NameInMap("Rolearn")
        private String rolearn;

        @NameInMap("AssumeRoleFor")
        private Long assumeRoleFor;

        private Arn(Builder builder) {
            this.roleType = builder.roleType;
            this.rolearn = builder.rolearn;
            this.assumeRoleFor = builder.assumeRoleFor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Arn create() {
            return builder().build();
        }

        /**
         * @return roleType
         */
        public String getRoleType() {
            return this.roleType;
        }

        /**
         * @return rolearn
         */
        public String getRolearn() {
            return this.rolearn;
        }

        /**
         * @return assumeRoleFor
         */
        public Long getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public static final class Builder {
            private String roleType; 
            private String rolearn; 
            private Long assumeRoleFor; 

            /**
             * RoleType.
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * Rolearn.
             */
            public Builder rolearn(String rolearn) {
                this.rolearn = rolearn;
                return this;
            }

            /**
             * AssumeRoleFor.
             */
            public Builder assumeRoleFor(Long assumeRoleFor) {
                this.assumeRoleFor = assumeRoleFor;
                return this;
            }

            public Arn build() {
                return new Arn(this);
            } 

        } 

    }
}
