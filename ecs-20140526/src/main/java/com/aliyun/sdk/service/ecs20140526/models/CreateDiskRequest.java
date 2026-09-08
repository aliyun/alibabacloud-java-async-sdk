// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link CreateDiskRequest} extends {@link RequestModel}
 *
 * <p>CreateDiskRequest</p>
 */
public class CreateDiskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdvancedFeatures")
    private String advancedFeatures;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Arn")
    private java.util.List<Arn> arn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
    private Boolean burstingEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskCategory")
    private String diskCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskName")
    private String diskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptAlgorithm")
    private String encryptAlgorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Encrypted")
    private Boolean encrypted;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KMSKeyId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String KMSKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultiAttach")
    private String multiAttach;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
    private String performanceLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProvisionedIops")
    private Long provisionedIops;

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
    @com.aliyun.core.annotation.NameInMap("Size")
    @com.aliyun.core.annotation.Validation(maximum = 262144, minimum = 1)
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    private String snapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageClusterId")
    private String storageClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageSetId")
    private String storageSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageSetPartitionNumber")
    private Integer storageSetPartitionNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateDiskRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.advancedFeatures = builder.advancedFeatures;
        this.arn = builder.arn;
        this.burstingEnabled = builder.burstingEnabled;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.diskCategory = builder.diskCategory;
        this.diskName = builder.diskName;
        this.encryptAlgorithm = builder.encryptAlgorithm;
        this.encrypted = builder.encrypted;
        this.instanceId = builder.instanceId;
        this.KMSKeyId = builder.KMSKeyId;
        this.multiAttach = builder.multiAttach;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.performanceLevel = builder.performanceLevel;
        this.provisionedIops = builder.provisionedIops;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.size = builder.size;
        this.snapshotId = builder.snapshotId;
        this.storageClusterId = builder.storageClusterId;
        this.storageSetId = builder.storageSetId;
        this.storageSetPartitionNumber = builder.storageSetPartitionNumber;
        this.tag = builder.tag;
        this.zoneId = builder.zoneId;
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
     * @return advancedFeatures
     */
    public String getAdvancedFeatures() {
        return this.advancedFeatures;
    }

    /**
     * @return arn
     */
    public java.util.List<Arn> getArn() {
        return this.arn;
    }

    /**
     * @return burstingEnabled
     */
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return diskCategory
     */
    public String getDiskCategory() {
        return this.diskCategory;
    }

    /**
     * @return diskName
     */
    public String getDiskName() {
        return this.diskName;
    }

    /**
     * @return encryptAlgorithm
     */
    public String getEncryptAlgorithm() {
        return this.encryptAlgorithm;
    }

    /**
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return KMSKeyId
     */
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    /**
     * @return multiAttach
     */
    public String getMultiAttach() {
        return this.multiAttach;
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
     * @return provisionedIops
     */
    public Long getProvisionedIops() {
        return this.provisionedIops;
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
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return storageClusterId
     */
    public String getStorageClusterId() {
        return this.storageClusterId;
    }

    /**
     * @return storageSetId
     */
    public String getStorageSetId() {
        return this.storageSetId;
    }

    /**
     * @return storageSetPartitionNumber
     */
    public Integer getStorageSetPartitionNumber() {
        return this.storageSetPartitionNumber;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateDiskRequest, Builder> {
        private String sourceRegionId; 
        private String advancedFeatures; 
        private java.util.List<Arn> arn; 
        private Boolean burstingEnabled; 
        private String clientToken; 
        private String description; 
        private String diskCategory; 
        private String diskName; 
        private String encryptAlgorithm; 
        private Boolean encrypted; 
        private String instanceId; 
        private String KMSKeyId; 
        private String multiAttach; 
        private String ownerAccount; 
        private Long ownerId; 
        private String performanceLevel; 
        private Long provisionedIops; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer size; 
        private String snapshotId; 
        private String storageClusterId; 
        private String storageSetId; 
        private Integer storageSetPartitionNumber; 
        private java.util.List<Tag> tag; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDiskRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.advancedFeatures = request.advancedFeatures;
            this.arn = request.arn;
            this.burstingEnabled = request.burstingEnabled;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.diskCategory = request.diskCategory;
            this.diskName = request.diskName;
            this.encryptAlgorithm = request.encryptAlgorithm;
            this.encrypted = request.encrypted;
            this.instanceId = request.instanceId;
            this.KMSKeyId = request.KMSKeyId;
            this.multiAttach = request.multiAttach;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.performanceLevel = request.performanceLevel;
            this.provisionedIops = request.provisionedIops;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.size = request.size;
            this.snapshotId = request.snapshotId;
            this.storageClusterId = request.storageClusterId;
            this.storageSetId = request.storageSetId;
            this.storageSetPartitionNumber = request.storageSetPartitionNumber;
            this.tag = request.tag;
            this.zoneId = request.zoneId;
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
         * <p>This parameter is not publicly available.</p>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        public Builder advancedFeatures(String advancedFeatures) {
            this.putQueryParameter("AdvancedFeatures", advancedFeatures);
            this.advancedFeatures = advancedFeatures;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         */
        public Builder arn(java.util.List<Arn> arn) {
            this.putQueryParameter("Arn", arn);
            this.arn = arn;
            return this;
        }

        /**
         * <p>Specifies whether to enable the performance burst feature. Valid values:</p>
         * <ul>
         * <li>true: enables the performance burst feature.</li>
         * <li>false: does not enable the performance burst feature.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only when <code>DiskCategory</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * </blockquote>
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * <p>Default value: empty.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The category of the data disk. Valid values:</p>
         * <ul>
         * <li>cloud: basic disk.</li>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: enterprise SSD (ESSD).</li>
         * <li>cloud_auto: ESSD AutoPL disk.</li>
         * <li>cloud_essd_entry: ESSD Entry disk.</li>
         * <li>cloud_regional_disk_auto: regional Enterprise SSD (ESSD).</li>
         * <li>elastic_ephemeral_disk_standard: elastic ephemeral disk - Standard Edition.</li>
         * <li>elastic_ephemeral_disk_premium: elastic ephemeral disk - Premium Edition.</li>
         * </ul>
         * <p>Default value: cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        public Builder diskCategory(String diskCategory) {
            this.putQueryParameter("DiskCategory", diskCategory);
            this.diskCategory = diskCategory;
            return this;
        }

        /**
         * <p>The name of the disk. The name must be 2 to 128 characters in length and can contain Unicode characters under the letter category (including letters in English and Chinese) and ASCII digits (0-9). The name can contain colons (:), underscores (_), periods (.), and hyphens (-). The name must start with a Unicode character under the letter category.</p>
         * <p>Default value: empty.</p>
         * 
         * <strong>example:</strong>
         * <p>testDiskName</p>
         */
        public Builder diskName(String diskName) {
            this.putQueryParameter("DiskName", diskName);
            this.diskName = diskName;
            return this;
        }

        /**
         * <p>This parameter is not publicly available.</p>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        public Builder encryptAlgorithm(String encryptAlgorithm) {
            this.putQueryParameter("EncryptAlgorithm", encryptAlgorithm);
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }

        /**
         * <p>Specifies whether to encrypt the disk. Valid values:</p>
         * <ul>
         * <li>true: encrypts the disk.</li>
         * <li>false: does not encrypt the disk.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder encrypted(Boolean encrypted) {
            this.putQueryParameter("Encrypted", encrypted);
            this.encrypted = encrypted;
            return this;
        }

        /**
         * <p>The ID of the subscription instance to which the created subscription disk is automatically attached.</p>
         * <ul>
         * <li>After you specify the instance ID, the ResourceGroupId, Tag.N.Key, Tag.N.Value, ClientToken, and KMSKeyId parameters are ignored.</li>
         * <li>You cannot specify both ZoneId and InstanceId.</li>
         * </ul>
         * <p>Default value: empty. This indicates that a pay-as-you-go disk is created. The region of the disk is determined by RegionId and ZoneId.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp18pnlg1ds9rky4****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the Key Management Service (KMS) key used by the disk.</p>
         * <blockquote>
         * <p>If Encrypted is set to true and KMSKeyId is not specified, the default key is used for encryption. The KMSKeyId value is returned after the instance is created.</p>
         * <ul>
         * <li><ul>
         * <li>If the disk is created from a non-shared encrypted snapshot, the encryption key used by the snapshot is used by default.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>If the disk is created from a shared encrypted snapshot, the service key is used by default.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>If the disk is created in a region where account-level default encryption for block storage is enabled, the specified account-level key is used by default.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>In other cases, the service key is used by default.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40826X</p>
         */
        public Builder KMSKeyId(String KMSKeyId) {
            this.putQueryParameter("KMSKeyId", KMSKeyId);
            this.KMSKeyId = KMSKeyId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the multi-attach attribute. Valid values:</p>
         * <ul>
         * <li>Disabled: disables the multi-attach attribute.</li>
         * <li>Enabled: enables the multi-attach attribute. Only enterprise SSDs can be set to <code>Enabled</code>.</li>
         * </ul>
         * <p>Default value: Disabled.</p>
         * <blockquote>
         * <p>Disks with the multi-attach attribute enabled support only the pay-as-you-go billing method. Therefore, when <code>MultiAttach=Enabled</code>, you cannot specify the <code>InstanceId</code> parameter. You can call <a href="https://help.aliyun.com/document_detail/25515.html">AttachDisk</a> to attach the disk after it is created. Note that a disk with the multi-attach feature enabled can be attached only as a data disk.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        public Builder multiAttach(String multiAttach) {
            this.putQueryParameter("MultiAttach", multiAttach);
            this.multiAttach = multiAttach;
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
         * <p>The performance level of the enterprise SSD. This parameter is available only when you create an ESSD. Valid values:</p>
         * <ul>
         * <li>PL0: A single disk can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single disk can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single disk can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single disk can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>Default value: PL1.</p>
         * <p>For information about how to select an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">Enterprise SSDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        public Builder performanceLevel(String performanceLevel) {
            this.putQueryParameter("PerformanceLevel", performanceLevel);
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values:</p>
         * <ul>
         * <li><p>Capacity (GiB) &lt;= 3: Provisioned performance is not supported.</p>
         * </li>
         * <li><p>Capacity (GiB) &gt;= 4: [0, min{(1,000 IOPS/GiB × Capacity - Baseline IOPS), 50,000}]</p>
         * </li>
         * </ul>
         * <p>Baseline performance = max{min{1,800 + 50 × Capacity, 50,000}, 3,000}.</p>
         * <blockquote>
         * <p>This parameter is supported only when <code>DiskCategory</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>40000</p>
         */
        public Builder provisionedIops(Long provisionedIops) {
            this.putQueryParameter("ProvisionedIops", provisionedIops);
            this.provisionedIops = provisionedIops;
            return this;
        }

        /**
         * <p>The ID of the region in which to create the disk. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
         * <p>The ID of the resource group to which the disk belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
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
         * <p>Snapshot size of the disk. Unit: GiB. You must specify a value for this parameter. Valid values:</p>
         * <ul>
         * <li>cloud: 5 to 2,000.</li>
         * <li>cloud_efficiency: 20 to 32,768.</li>
         * <li>cloud_ssd: 20 to 32,768.</li>
         * <li>cloud_essd: The valid values depend on the value of <code>PerformanceLevel</code>.<ul>
         * <li>PL0: 1 to 65,536.</li>
         * <li>PL1: 20 to 65,536.</li>
         * <li>PL2: 461 to 65,536.</li>
         * <li>PL3: 1,261 to 65,536.</li>
         * </ul>
         * </li>
         * <li>cloud_auto: 1 to 65,536.</li>
         * <li>cloud_essd_entry: 10 to 32,768.</li>
         * <li>cloud_regional_disk_auto: 10 to 65,536.</li>
         * <li>elastic_ephemeral_disk_standard: 64 to 8,192.</li>
         * <li>elastic_ephemeral_disk_premium: 64 to 8,192.</li>
         * </ul>
         * <p>If you specify <code>SnapshotId</code>, the <code>SnapshotId</code> and <code>Size</code> parameters have the following limits:</p>
         * <ul>
         * <li>If the snapshot specified by <code>SnapshotId</code> is larger than the specified <code>Size</code> value, snapshot size of the created disk equals snapshot size of the specified snapshot.</li>
         * <li>If the snapshot specified by <code>SnapshotId</code> is smaller than the specified <code>Size</code> value, snapshot size of the created disk equals the specified <code>Size</code> value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The ID of the snapshot to use to create the disk. Snapshots created on or before July 15, 2013 cannot be used to create disks. </p>
         * <p>The <code>SnapshotId</code> and <code>Size</code> parameters have the following limits:</p>
         * <ul>
         * <li>If the snapshot specified by <code>SnapshotId</code> is larger than the specified <code>Size</code> value, snapshot size of the created disk equals snapshot size of the specified snapshot.</li>
         * <li>If the snapshot specified by <code>SnapshotId</code> is smaller than the specified <code>Size</code> value, snapshot size of the created disk equals the specified <code>Size</code> value.</li>
         * <li>Elastic ephemeral disks cannot be created from snapshots.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>s-bp67acfmxazb4p****</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * <p>The ID of the dedicated block storage cluster. To create a disk in a specific dedicated block storage cluster, specify this parameter.</p>
         * <blockquote>
         * <p>The storage set parameters (<code>StorageSetId</code> and <code>StorageSetPartitionNumber</code>) and the dedicated block storage cluster parameter (<code>StorageClusterId</code>) are mutually exclusive. If you specify both, the API call fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dbsc-j5e1sf2vaf5he8m2****</p>
         */
        public Builder storageClusterId(String storageClusterId) {
            this.putQueryParameter("StorageClusterId", storageClusterId);
            this.storageClusterId = storageClusterId;
            return this;
        }

        /**
         * <p>The ID of the storage set.</p>
         * <blockquote>
         * <p>The storage set parameters (<code>StorageSetId</code> and <code>StorageSetPartitionNumber</code>) and the dedicated block storage cluster parameter (<code>StorageClusterId</code>) are mutually exclusive. If you specify both, the API call fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ss-bp67acfmxazb4p****</p>
         */
        public Builder storageSetId(String storageSetId) {
            this.putQueryParameter("StorageSetId", storageSetId);
            this.storageSetId = storageSetId;
            return this;
        }

        /**
         * <p>The number of partitions in the storage set. Valid values: greater than or equal to 2, up to the privilege quota limit returned by <a href="https://help.aliyun.com/document_detail/73772.html">DescribeAccountAttributes</a>.</p>
         * <p>Default value: 2.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder storageSetPartitionNumber(Integer storageSetPartitionNumber) {
            this.putQueryParameter("StorageSetPartitionNumber", storageSetPartitionNumber);
            this.storageSetPartitionNumber = storageSetPartitionNumber;
            return this;
        }

        /**
         * <p>The list of tags for the disk.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the zone in which to create a pay-as-you-go disk.</p>
         * <ul>
         * <li>If you do not specify InstanceId, ZoneId is required.</li>
         * <li>You cannot specify both ZoneId and InstanceId.</li>
         * </ul>
         * <blockquote>
         * <p>You do not need to set ZoneId for disks of the <code>cloud_regional_disk_auto</code> type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateDiskRequest build() {
            return new CreateDiskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDiskRequest} extends {@link TeaModel}
     *
     * <p>CreateDiskRequest</p>
     */
    public static class Arn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssumeRoleFor")
        private Long assumeRoleFor;

        @com.aliyun.core.annotation.NameInMap("RoleType")
        private String roleType;

        @com.aliyun.core.annotation.NameInMap("Rolearn")
        private String rolearn;

        private Arn(Builder builder) {
            this.assumeRoleFor = builder.assumeRoleFor;
            this.roleType = builder.roleType;
            this.rolearn = builder.rolearn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Arn create() {
            return builder().build();
        }

        /**
         * @return assumeRoleFor
         */
        public Long getAssumeRoleFor() {
            return this.assumeRoleFor;
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

        public static final class Builder {
            private Long assumeRoleFor; 
            private String roleType; 
            private String rolearn; 

            private Builder() {
            } 

            private Builder(Arn model) {
                this.assumeRoleFor = model.assumeRoleFor;
                this.roleType = model.roleType;
                this.rolearn = model.rolearn;
            } 

            /**
             * <blockquote>
             * <p>This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1000000000</p>
             */
            public Builder assumeRoleFor(Long assumeRoleFor) {
                this.assumeRoleFor = assumeRoleFor;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>hide</p>
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>hide</p>
             */
            public Builder rolearn(String rolearn) {
                this.rolearn = rolearn;
                return this;
            }

            public Arn build() {
                return new Arn(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDiskRequest} extends {@link TeaModel}
     *
     * <p>CreateDiskRequest</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the disk. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the disk. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
