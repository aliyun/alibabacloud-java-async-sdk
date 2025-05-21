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
 * {@link DescribeDisksRequest} extends {@link RequestModel}
 *
 * <p>DescribeDisksRequest</p>
 */
public class DescribeDisksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private java.util.List<Filter> filter;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdditionalAttributes")
    private java.util.List<String> additionalAttributes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyId")
    private String autoSnapshotPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteAutoSnapshot")
    private Boolean deleteAutoSnapshot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteWithInstance")
    private Boolean deleteWithInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskChargeType")
    private String diskChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskIds")
    private String diskIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskName")
    private String diskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskType")
    private String diskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAutoSnapshot")
    private Boolean enableAutoSnapshot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAutomatedSnapshotPolicy")
    private Boolean enableAutomatedSnapshotPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableShared")
    private Boolean enableShared;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Encrypted")
    private Boolean encrypted;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KMSKeyId")
    private String KMSKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LockReason")
    private String lockReason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 500, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultiAttach")
    private String multiAttach;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Portable")
    private Boolean portable;

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
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    private String snapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeDisksRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.sourceRegionId = builder.sourceRegionId;
        this.additionalAttributes = builder.additionalAttributes;
        this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
        this.category = builder.category;
        this.deleteAutoSnapshot = builder.deleteAutoSnapshot;
        this.deleteWithInstance = builder.deleteWithInstance;
        this.diskChargeType = builder.diskChargeType;
        this.diskIds = builder.diskIds;
        this.diskName = builder.diskName;
        this.diskType = builder.diskType;
        this.dryRun = builder.dryRun;
        this.enableAutoSnapshot = builder.enableAutoSnapshot;
        this.enableAutomatedSnapshotPolicy = builder.enableAutomatedSnapshotPolicy;
        this.enableShared = builder.enableShared;
        this.encrypted = builder.encrypted;
        this.instanceId = builder.instanceId;
        this.KMSKeyId = builder.KMSKeyId;
        this.lockReason = builder.lockReason;
        this.maxResults = builder.maxResults;
        this.multiAttach = builder.multiAttach;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.portable = builder.portable;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.snapshotId = builder.snapshotId;
        this.status = builder.status;
        this.tag = builder.tag;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDisksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public java.util.List<Filter> getFilter() {
        return this.filter;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return additionalAttributes
     */
    public java.util.List<String> getAdditionalAttributes() {
        return this.additionalAttributes;
    }

    /**
     * @return autoSnapshotPolicyId
     */
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
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
     * @return diskChargeType
     */
    public String getDiskChargeType() {
        return this.diskChargeType;
    }

    /**
     * @return diskIds
     */
    public String getDiskIds() {
        return this.diskIds;
    }

    /**
     * @return diskName
     */
    public String getDiskName() {
        return this.diskName;
    }

    /**
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return enableAutoSnapshot
     */
    public Boolean getEnableAutoSnapshot() {
        return this.enableAutoSnapshot;
    }

    /**
     * @return enableAutomatedSnapshotPolicy
     */
    public Boolean getEnableAutomatedSnapshotPolicy() {
        return this.enableAutomatedSnapshotPolicy;
    }

    /**
     * @return enableShared
     */
    public Boolean getEnableShared() {
        return this.enableShared;
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
     * @return lockReason
     */
    public String getLockReason() {
        return this.lockReason;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return multiAttach
     */
    public String getMultiAttach() {
        return this.multiAttach;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return portable
     */
    public Boolean getPortable() {
        return this.portable;
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
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
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

    public static final class Builder extends Request.Builder<DescribeDisksRequest, Builder> {
        private java.util.List<Filter> filter; 
        private String sourceRegionId; 
        private java.util.List<String> additionalAttributes; 
        private String autoSnapshotPolicyId; 
        private String category; 
        private Boolean deleteAutoSnapshot; 
        private Boolean deleteWithInstance; 
        private String diskChargeType; 
        private String diskIds; 
        private String diskName; 
        private String diskType; 
        private Boolean dryRun; 
        private Boolean enableAutoSnapshot; 
        private Boolean enableAutomatedSnapshotPolicy; 
        private Boolean enableShared; 
        private Boolean encrypted; 
        private String instanceId; 
        private String KMSKeyId; 
        private String lockReason; 
        private Integer maxResults; 
        private String multiAttach; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Boolean portable; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String snapshotId; 
        private String status; 
        private java.util.List<Tag> tag; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDisksRequest request) {
            super(request);
            this.filter = request.filter;
            this.sourceRegionId = request.sourceRegionId;
            this.additionalAttributes = request.additionalAttributes;
            this.autoSnapshotPolicyId = request.autoSnapshotPolicyId;
            this.category = request.category;
            this.deleteAutoSnapshot = request.deleteAutoSnapshot;
            this.deleteWithInstance = request.deleteWithInstance;
            this.diskChargeType = request.diskChargeType;
            this.diskIds = request.diskIds;
            this.diskName = request.diskName;
            this.diskType = request.diskType;
            this.dryRun = request.dryRun;
            this.enableAutoSnapshot = request.enableAutoSnapshot;
            this.enableAutomatedSnapshotPolicy = request.enableAutomatedSnapshotPolicy;
            this.enableShared = request.enableShared;
            this.encrypted = request.encrypted;
            this.instanceId = request.instanceId;
            this.KMSKeyId = request.KMSKeyId;
            this.lockReason = request.lockReason;
            this.maxResults = request.maxResults;
            this.multiAttach = request.multiAttach;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.portable = request.portable;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.snapshotId = request.snapshotId;
            this.status = request.status;
            this.tag = request.tag;
            this.zoneId = request.zoneId;
        } 

        /**
         * Filter.
         */
        public Builder filter(java.util.List<Filter> filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
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
         * <p>The additional attributes. Set the value to <code>Placement</code>, which indicates the data storage locations of the disk.</p>
         * <blockquote>
         * <p> This attribute is valid only for Regional Enterprise SSDs (ESSDs).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>IOPS</p>
         */
        public Builder additionalAttributes(java.util.List<String> additionalAttributes) {
            this.putQueryParameter("AdditionalAttributes", additionalAttributes);
            this.additionalAttributes = additionalAttributes;
            return this;
        }

        /**
         * <p>The ID of the automatic snapshot policy that is applied to the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-m5e2w2jutw8bv31****</p>
         */
        public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.putQueryParameter("AutoSnapshotPolicyId", autoSnapshotPolicyId);
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }

        /**
         * <p>The disk category. Valid values:</p>
         * <ul>
         * <li>all: all disk categories</li>
         * <li>cloud: basic disk</li>
         * <li>cloud_efficiency: ultra disk</li>
         * <li>cloud_ssd: standard SSD</li>
         * <li>cloud_essd: Enterprise SSD (ESSD)</li>
         * <li>cloud_auto: ESSD AutoPL disk</li>
         * <li>cloud_regional_disk_auto: Regional ESSD</li>
         * <li>cloud_essd_entry: ESSD Entry disk</li>
         * <li>elastic_ephemeral_disk_standard: standard elastic ephemeral disk</li>
         * <li>elastic_ephemeral_disk_premium: premium elastic ephemeral disk</li>
         * <li>local_ssd_pro: I/O-intensive local disk</li>
         * <li>local_hdd_pro: throughput-intensive local disk</li>
         * <li>ephemeral: retired local disk</li>
         * <li>ephemeral_ssd: retired local SSD</li>
         * </ul>
         * <p>Default value: all.</p>
         * <p>Enumerated values:</p>
         * <ul>
         * <li>all: all disks categories</li>
         * <li>cloud_efficiency: ultra disk</li>
         * <li>cloud_ssd: standard SSD</li>
         * <li>local_ssd_pro: I/O-intensive local disk</li>
         * <li>ephemeral: retired local disk</li>
         * <li>cloud_essd_entry: ESSD Entry disk</li>
         * <li>elastic_ephemeral_disk_premium: premium elastic ephemeral disk</li>
         * <li>cloud: basic disk</li>
         * <li>ephemeral_ssd: retired local SSD</li>
         * <li>cloud_auto: ESSD AutoPL disk</li>
         * <li>cloud_regional_disk_auto: Regional ESSD</li>
         * <li>cloud_essd: ESSD</li>
         * <li>elastic_ephemeral_disk_standard: standard elastic ephemeral disk</li>
         * <li>local_hdd_pro: throughput-intensive local disk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>Specifies whether to delete the automatic snapshots of the cloud disk after the disk is released.</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false</p>
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
         * <p>Specifies whether the disk is released when the associated instance is released. Valid values:</p>
         * <ul>
         * <li>true: The disk is released when the associated instance is released.</li>
         * <li>false: The disk is retained as a pay-as-you-go data disk when the associated instance is released.</li>
         * </ul>
         * <p>Default value: false.</p>
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
         * <p>The billing method of the disk. Valid values:</p>
         * <ul>
         * <li>PrePaid: subscription</li>
         * <li>PostPaid: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder diskChargeType(String diskChargeType) {
            this.putQueryParameter("DiskChargeType", diskChargeType);
            this.diskChargeType = diskChargeType;
            return this;
        }

        /**
         * <p>The IDs of cloud disks, local disks, or elastic ephemeral disks. The value is a JSON array that consists of up to 100 disk IDs. Separate the disk IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;d-bp67acfmxazb4p****&quot;, &quot;d-bp67acfmxazb4g****&quot;, … &quot;d-bp67acfmxazb4d****&quot;]</p>
         */
        public Builder diskIds(String diskIds) {
            this.putQueryParameter("DiskIds", diskIds);
            this.diskIds = diskIds;
            return this;
        }

        /**
         * <p>The name of the disk. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
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
         * <p>The type of the disk. Valid values:</p>
         * <ul>
         * <li>all: system disk and data disk</li>
         * <li>system: system disk</li>
         * <li>data: data disk</li>
         * </ul>
         * <p>Default value: all.</p>
         * <blockquote>
         * <p> Elastic ephemeral disks cannot be used as system disks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder diskType(String diskType) {
            this.putQueryParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run without performing the actual request. Valid values:</p>
         * <ul>
         * <li>true: performs only a dry run. The systems checks whether your AccessKey pair is valid, whether RAM users are granted permissions, and whether the required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li>false: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * <p>Default value: false</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether the automatic snapshot policy feature is enabled for the cloud disk. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is deprecated. By default, the automatic snapshot policy feature is enabled for cloud disks. You need to only apply an automatic snapshot policy to a cloud disk before you can use the automatic snapshot policy.</p>
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
         * <p>Specifies whether an automatic snapshot policy is applied to the cloud disk.</p>
         * <ul>
         * <li>true: An automatic snapshot policy is applied to the cloud disk.</li>
         * <li>false: No automatic snapshot policy is applied to the cloud disk.</li>
         * </ul>
         * <p>Default value: false</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableAutomatedSnapshotPolicy(Boolean enableAutomatedSnapshotPolicy) {
            this.putQueryParameter("EnableAutomatedSnapshotPolicy", enableAutomatedSnapshotPolicy);
            this.enableAutomatedSnapshotPolicy = enableAutomatedSnapshotPolicy;
            return this;
        }

        /**
         * <p>Specifies whether the disk is a Shared Block Storage device.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableShared(Boolean enableShared) {
            this.putQueryParameter("EnableShared", enableShared);
            this.enableShared = enableShared;
            return this;
        }

        /**
         * <p>Specifies whether to query only encrypted cloud disks.</p>
         * <ul>
         * <li>true: queries only encrypted cloud disks.</li>
         * <li>false: does not query encrypted cloud disks.</li>
         * </ul>
         * <p>Default value: false</p>
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
         * <p>The ID of the Elastic Compute Service (ECS) instance to which the disk is attached.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4q****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the Key Management Service (KMS) key that is used by the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        public Builder KMSKeyId(String KMSKeyId) {
            this.putQueryParameter("KMSKeyId", KMSKeyId);
            this.KMSKeyId = KMSKeyId;
            return this;
        }

        /**
         * <p>The reason why the disk is locked. Valid values:</p>
         * <ul>
         * <li>financial: The disk is locked due to overdue payments.</li>
         * <li>security: The disk is locked due to security reasons.</li>
         * <li>recycling: The preemptible instance is locked and pending release.</li>
         * <li>dedicatedhostfinancial: The instance is locked due to overdue payments for the dedicated host.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>recycling</p>
         */
        public Builder lockReason(String lockReason) {
            this.putQueryParameter("LockReason", lockReason);
            this.lockReason = lockReason;
            return this;
        }

        /**
         * <p>The maximum number of entries per page. Valid values: 10 to 500.</p>
         * <p>Default value:</p>
         * <ul>
         * <li>If you do not specify this parameter or you set this parameter to a value less than 10, the default value is 10.</li>
         * <li>If you set this parameter to a value greater than 500, the default value is 500.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Specifies whether the multi-attach feature is enabled for the disk. Valid values:</p>
         * <ul>
         * <li>Disabled: The multi-attach feature is not enabled for the disk.</li>
         * <li>Enabled: The multi-attach feature is enabled for the disk.</li>
         * <li>LegacyShared: Shared Block Storage devices are queried.</li>
         * </ul>
         * <p>The multi-attach feature is available to select users. To use this feature, <a href="https://workorder-intl.console.aliyun.com/console.htm#/ticket/list">submit a ticket</a>.</p>
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
         * <p>The query token. Set the value to the <code>NextToken</code> value that was returned in the last call to this operation.</p>
         * <p>For more information about how to check the responses returned by this operation, see the preceding &quot;Description&quot; section.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
         * <blockquote>
         * <p> This parameter will be removed in the future. We recommend that you use <code>NextToken</code> and <code>MaxResults</code> for a paged query.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter will be removed in the future. We recommend that you use <code>NextToken</code> and <code>MaxResults</code> for a paged query.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Specifies whether the disk is removable. Valid values:</p>
         * <ul>
         * <li>true: The disk is removable. A removable disk can independently exist and can be attached to or detached from an instance within the same zone.</li>
         * <li>false: The disk is not removable. A disk that is not removable cannot independently exist or be attached to or detached from an instance within the same zone.</li>
         * </ul>
         * <p>The <code>Portable</code> attribute of the following types of disks is <code>false</code>, and these types of disks share the same lifecycle with their associated instances:</p>
         * <ul>
         * <li>Local disks</li>
         * <li>Local SSDs</li>
         * <li>Subscription data disks</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder portable(Boolean portable) {
            this.putQueryParameter("Portable", portable);
            this.portable = portable;
            return this;
        }

        /**
         * <p>The region ID of the disk. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The ID of the resource group to which the disk belongs. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.</p>
         * <blockquote>
         * <p> Resources in the default resource group are displayed in the response regardless of the value specified for this parameter.</p>
         * </blockquote>
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
         * <p>The ID of the snapshot from which you create the cloud disk.</p>
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
         * <p>The status of the disk. For more information, see <a href="https://help.aliyun.com/document_detail/25689.html">Disk states</a>. Valid values:</p>
         * <ul>
         * <li>In_use</li>
         * <li>Available</li>
         * <li>Attaching</li>
         * <li>Detaching</li>
         * <li>Creating</li>
         * <li>ReIniting</li>
         * <li>All</li>
         * </ul>
         * <p>Default value: All.</p>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The tags of the disk.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The zone ID.</p>
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
        public DescribeDisksRequest build() {
            return new DescribeDisksRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDisksRequest} extends {@link TeaModel}
     *
     * <p>DescribeDisksRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Filter(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
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

            private Builder(Filter model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of filter 1 used to query resources. Set the value to <code>CreationStartTime</code>. You can specify a time by setting both <code>Filter.1.Key</code> and <code>Filter.1.Value</code> to query resources that were created after the specified time.</p>
             * 
             * <strong>example:</strong>
             * <p>CreationStartTime</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of filter 1 used to query resources. Set the value to a time. If you specify this parameter, you must also specify the <code>Filter.1.Key</code> parameter. Specify the time in the <code>yyyy-MM-ddTHH:mmZ</code> format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-05T22:40Z</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDisksRequest} extends {@link TeaModel}
     *
     * <p>DescribeDisksRequest</p>
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
             * <p>The key of tag N of the disk. Valid values of N: 1 to 20.</p>
             * <p>If you specify a single tag to query resources, up to 1,000 resources to which the tag is added are returned. If you specify multiple tags to query resources, up to 1,000 resources to which all specified tags are added are returned. To query more than 1,000 resources that have specified tags added, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N of the disk. Valid values of N: 1 to 20.</p>
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
