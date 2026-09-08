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
 * {@link CloneDisksRequest} extends {@link RequestModel}
 *
 * <p>CloneDisksRequest</p>
 */
public class CloneDisksRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

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
    @com.aliyun.core.annotation.NameInMap("DiskCategory")
    @com.aliyun.core.annotation.Validation(required = true)
    private String diskCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskName")
    private String diskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private String dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Encrypted")
    private Boolean encrypted;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KmsKeyId")
    private String kmsKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultiAttach")
    @com.aliyun.core.annotation.Validation(required = true)
    private String multiAttach;

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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDiskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceDiskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CloneDisksRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.arn = builder.arn;
        this.burstingEnabled = builder.burstingEnabled;
        this.clientToken = builder.clientToken;
        this.diskCategory = builder.diskCategory;
        this.diskName = builder.diskName;
        this.dryRun = builder.dryRun;
        this.encrypted = builder.encrypted;
        this.kmsKeyId = builder.kmsKeyId;
        this.multiAttach = builder.multiAttach;
        this.ownerId = builder.ownerId;
        this.performanceLevel = builder.performanceLevel;
        this.provisionedIops = builder.provisionedIops;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.size = builder.size;
        this.sourceDiskId = builder.sourceDiskId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneDisksRequest create() {
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
     * @return dryRun
     */
    public String getDryRun() {
        return this.dryRun;
    }

    /**
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * @return multiAttach
     */
    public String getMultiAttach() {
        return this.multiAttach;
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
     * @return sourceDiskId
     */
    public String getSourceDiskId() {
        return this.sourceDiskId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CloneDisksRequest, Builder> {
        private String sourceRegionId; 
        private java.util.List<Arn> arn; 
        private Boolean burstingEnabled; 
        private String clientToken; 
        private String diskCategory; 
        private String diskName; 
        private String dryRun; 
        private Boolean encrypted; 
        private String kmsKeyId; 
        private String multiAttach; 
        private Long ownerId; 
        private String performanceLevel; 
        private Long provisionedIops; 
        private String regionId; 
        private String resourceGroupId; 
        private Long resourceOwnerId; 
        private Integer size; 
        private String sourceDiskId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CloneDisksRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.arn = request.arn;
            this.burstingEnabled = request.burstingEnabled;
            this.clientToken = request.clientToken;
            this.diskCategory = request.diskCategory;
            this.diskName = request.diskName;
            this.dryRun = request.dryRun;
            this.encrypted = request.encrypted;
            this.kmsKeyId = request.kmsKeyId;
            this.multiAttach = request.multiAttach;
            this.ownerId = request.ownerId;
            this.performanceLevel = request.performanceLevel;
            this.provisionedIops = request.provisionedIops;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.size = request.size;
            this.sourceDiskId = request.sourceDiskId;
            this.tag = request.tag;
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
         * <p>Specifies whether to enable the performance burst feature for the new disk. Valid values:</p>
         * <ul>
         * <li>true: enables the performance burst feature.</li>
         * <li>false: does not enable the performance burst feature.<blockquote>
         * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://www.alibabacloud.com/help/en/ecs/user-guide/essd-autopl-disks">ESSD AutoPL disks</a>.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder burstingEnabled(Boolean burstingEnabled) {
            this.putQueryParameter("BurstingEnabled", burstingEnabled);
            this.burstingEnabled = burstingEnabled;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
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
         * <p>The category of the new disk. Valid values:</p>
         * <ul>
         * <li>cloud_essd: enterprise SSD (ESSD).</li>
         * <li>cloud_auto: ESSD AutoPL disk.</li>
         * <li>cloud_essd_entry: ESSD Entry disk.</li>
         * <li>cloud_regional_disk_auto: regional ESSD.</li>
         * </ul>
         * <blockquote>
         * <p>Disk category restrictions for disk cloning:</p>
         * <ul>
         * <li>Non-regional disks can only be cloned to non-regional disk types.</li>
         * <li>Regional disks can only be cloned to regional disk types.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        public Builder diskCategory(String diskCategory) {
            this.putQueryParameter("DiskCategory", diskCategory);
            this.diskCategory = diskCategory;
            return this;
        }

        /**
         * <p>The name of the disk. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-). The name must start with a letter.</p>
         * <p>Default value: empty.</p>
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
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li>true: sends a check request without querying the filing status. The check items include whether the AccessKey pair is valid, whether the Resource Access Management (RAM) user is granted the required authorization, and whether the required parameters are specified. If the check fails, the corresponding error message is returned. If the check succeeds, the DryRunOperation error code is returned.</li>
         * <li>false (default): sends a Normal request. After the check succeeds, a 2XX HTTP status code is returned and the filing status is directly queried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether the new disk is encrypted. Valid values:</p>
         * <ul>
         * <li>true: The new disk is encrypted.</li>
         * <li>false: The new disk is not encrypted.</li>
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
         * <p>The key ID of the KMS key used by the new disk.</p>
         * 
         * <strong>example:</strong>
         * <p>key-szz67b2f696f4wh9yeg5d</p>
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.putQueryParameter("KmsKeyId", kmsKeyId);
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the multi-attach attribute for the new disk. Valid values:</p>
         * <ul>
         * <li>Disabled: disables the multi-attach attribute.</li>
         * <li>Enabled: enables the multi-attach attribute. Only enterprise SSDs (ESSDs) support this parameter set to <code>Enabled</code>.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The performance level (PL) of the new standard SSD. Valid values:</p>
         * <ul>
         * <li>PL0: A single disk can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single disk can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single disk can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single disk can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <blockquote>
         * <p>If DiskCategory is set to cloud_essd, PerformanceLevel is required.</p>
         * </blockquote>
         * <p>For more information about how to select an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
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
         * <li>Capacity (GiB) &lt;= 3: Provisioned performance is not supported.</li>
         * <li>Capacity (GiB) &gt;= 4: [0, min{(1,000 IOPS/GiB × Capacity - Baseline IOPS), 50,000}]</li>
         * </ul>
         * <p>Baseline performance = max{min{1,800 + 50 × Capacity, 50,000}, 3,000}.</p>
         * <blockquote>
         * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://www.alibabacloud.com/help/en/ecs/user-guide/essd-autopl-disks">ESSD AutoPL disks</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder provisionedIops(Long provisionedIops) {
            this.putQueryParameter("ProvisionedIops", provisionedIops);
            this.provisionedIops = provisionedIops;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="https://www.alibabacloud.com/help/en/ecs/api-regions-describeregions">DescribeRegions</a> to query the most recent region list.</p>
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
         * <p>rg-bp199lyny9b3****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * <p>The capacity of the new disk. Unit: GiB. You must specify a value for this parameter. Valid values:</p>
         * <ul>
         * <li>cloud_essd: The valid values vary based on the performance level.<ul>
         * <li>PL0: 1 to 65,536.</li>
         * <li>PL1: 20 to 65,536.</li>
         * <li>PL2: 461 to 65,536.</li>
         * <li>PL3: 1,261 to 65,536.</li>
         * </ul>
         * </li>
         * <li>cloud_auto: 1 to 65,536.</li>
         * <li>cloud_essd_entry: 10 to 32,768.</li>
         * <li>cloud_regional_disk_auto: 10 to 65,536.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The ID of the source disk.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp1d6tsvznfghy7y****</p>
         */
        public Builder sourceDiskId(String sourceDiskId) {
            this.putQueryParameter("SourceDiskId", sourceDiskId);
            this.sourceDiskId = sourceDiskId;
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

        @Override
        public CloneDisksRequest build() {
            return new CloneDisksRequest(this);
        } 

    } 

    /**
     * 
     * {@link CloneDisksRequest} extends {@link TeaModel}
     *
     * <p>CloneDisksRequest</p>
     */
    public static class Arn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssumeRoleFor")
        private String assumeRoleFor;

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
        public String getAssumeRoleFor() {
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
            private String assumeRoleFor; 
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
             * <p>null</p>
             */
            public Builder assumeRoleFor(String assumeRoleFor) {
                this.assumeRoleFor = assumeRoleFor;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
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
             * <p>null</p>
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
     * {@link CloneDisksRequest} extends {@link TeaModel}
     *
     * <p>CloneDisksRequest</p>
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
             * <p>The tag key of the disk. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with aliyun or acs:. The tag key cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the disk. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain http:// or https://.</p>
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
