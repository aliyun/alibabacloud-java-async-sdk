// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link CreateFileSystemRequest} extends {@link RequestModel}
 *
 * <p>CreateFileSystemRequest</p>
 */
public class CreateFileSystemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Long bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Capacity")
    private Long capacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptType")
    private Integer encryptType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemType")
    private String fileSystemType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HpnZone")
    private String hpnZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KmsKeyId")
    private String kmsKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocolType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RedundancyType")
    private String redundancyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RedundancyVSwitchIds")
    private java.util.List<String> redundancyVSwitchIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    private String snapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateFileSystemRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.capacity = builder.capacity;
        this.chargeType = builder.chargeType;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.duration = builder.duration;
        this.encryptType = builder.encryptType;
        this.fileSystemType = builder.fileSystemType;
        this.hpnZone = builder.hpnZone;
        this.kmsKeyId = builder.kmsKeyId;
        this.protocolType = builder.protocolType;
        this.redundancyType = builder.redundancyType;
        this.redundancyVSwitchIds = builder.redundancyVSwitchIds;
        this.resourceGroupId = builder.resourceGroupId;
        this.snapshotId = builder.snapshotId;
        this.storageType = builder.storageType;
        this.tag = builder.tag;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileSystemRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Long getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return capacity
     */
    public Long getCapacity() {
        return this.capacity;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return encryptType
     */
    public Integer getEncryptType() {
        return this.encryptType;
    }

    /**
     * @return fileSystemType
     */
    public String getFileSystemType() {
        return this.fileSystemType;
    }

    /**
     * @return hpnZone
     */
    public String getHpnZone() {
        return this.hpnZone;
    }

    /**
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * @return redundancyType
     */
    public String getRedundancyType() {
        return this.redundancyType;
    }

    /**
     * @return redundancyVSwitchIds
     */
    public java.util.List<String> getRedundancyVSwitchIds() {
        return this.redundancyVSwitchIds;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateFileSystemRequest, Builder> {
        private Long bandwidth; 
        private Long capacity; 
        private String chargeType; 
        private String clientToken; 
        private String description; 
        private Boolean dryRun; 
        private Integer duration; 
        private Integer encryptType; 
        private String fileSystemType; 
        private String hpnZone; 
        private String kmsKeyId; 
        private String protocolType; 
        private String redundancyType; 
        private java.util.List<String> redundancyVSwitchIds; 
        private String resourceGroupId; 
        private String snapshotId; 
        private String storageType; 
        private java.util.List<Tag> tag; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateFileSystemRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.capacity = request.capacity;
            this.chargeType = request.chargeType;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.duration = request.duration;
            this.encryptType = request.encryptType;
            this.fileSystemType = request.fileSystemType;
            this.hpnZone = request.hpnZone;
            this.kmsKeyId = request.kmsKeyId;
            this.protocolType = request.protocolType;
            this.redundancyType = request.redundancyType;
            this.redundancyVSwitchIds = request.redundancyVSwitchIds;
            this.resourceGroupId = request.resourceGroupId;
            this.snapshotId = request.snapshotId;
            this.storageType = request.storageType;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The maximum throughput of the file system. Unit: MB/s.
         * For valid values, refer to the specifications on the buy page.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p><a href="https://common-buy.aliyun.com/?commodityCode=nas_cpfs_post#/buy">Buy page for pay-as-you-go Parallel file systems</a></p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p><a href="https://common-buy-intl.alibabacloud.com/?spm=5176.nas_overview.0.0.7ea01dbft0dTui&commodityCode=nas_cpfspost_public_intl#/buy">Buy page for pay-as-you-go Parallel file systems</a></p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        public Builder bandwidth(Long bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The capacity of the file system. Unit: GiB.
         * This parameter is required and valid only when FileSystemType is set to extreme, cpfs, or cpfsse.
         * For valid values, refer to the specifications on the buy page:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><a href="https://common-buy.aliyun.com/?commodityCode=nas_extreme_post#/buy">Buy page for pay-as-you-go Extreme NAS file systems</a></li>
         * <li><a href="https://common-buy.aliyun.com/?commodityCode=nas_cpfs_post#/buy">Buy page for pay-as-you-go Parallel file systems</a></li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li><p><a href="https://common-buy-intl.alibabacloud.com/?commodityCode=nas_extpost_public_intl#/buy">Buy page for pay-as-you-go Extreme NAS file systems</a></p>
         * </li>
         * <li><p><a href="https://common-buy-intl.alibabacloud.com/?spm=5176.nas_overview.0.0.7ea01dbft0dTui&commodityCode=nas_cpfspost_public_intl#/buy">Buy page for pay-as-you-go Parallel file systems</a></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder capacity(Long capacity) {
            this.putQueryParameter("Capacity", capacity);
            this.capacity = capacity;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>PayAsYouGo: pay-as-you-go. This is the default value.</li>
         * <li>Subscription: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request may be different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the file system.
         * Limits:</p>
         * <ul>
         * <li>The description must be 2 to 128 characters in length.</li>
         * <li>It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>It can contain digits, colons (:), underscores (_), and hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>The description of this file system</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run on the creation request.
         * A dry run checks whether the parameters are valid and whether resources are sufficient, but does not actually create the instance or incur fees.
         * Valid values:  </p>
         * <ul>
         * <li>true: performs a dry run without creating the instance. The system checks whether required parameters are specified, the request format is valid, the service limits are met, and NAS resources are sufficient. If the request fails the dry run, an error message is returned. If the request passes the dry run, the 200 HTTP status code is returned, but FileSystemId is empty.  </li>
         * <li>false: performs a normal request and creates the instance directly after the request passes the check. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The subscription duration. Unit: months. This parameter is required and valid only when ChargeType is set to Subscription.
         * If a subscription instance is not renewed upon expiration, it is automatically released.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>Specifies whether to encrypt the file system.
         * Uses KMS-managed keys to encrypt data at rest in the file system. You do not need to perform decryption when reading or writing the encrypted data.
         * Valid values:</p>
         * <ul>
         * <li>0: Not encrypted. This is the default value.</li>
         * <li>1: NAS-managed key. Supported when FileSystemType is set to standard or extreme.</li>
         * <li>2: Custom key. Supported when FileSystemType is set to standard or extreme.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Extreme NAS file systems: The custom key (KMS) feature is supported in all regions except China East 1 Finance Cloud.</li>
         * <li>General-purpose NAS file systems: The custom key (KMS) feature is supported in all regions.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder encryptType(Integer encryptType) {
            this.putQueryParameter("EncryptType", encryptType);
            this.encryptType = encryptType;
            return this;
        }

        /**
         * <p>The file system type. Valid values:</p>
         * <ul>
         * <li>standard: General-purpose NAS file system. This is the default value.</li>
         * <li>extreme: Extreme NAS file system.</li>
         * <li>cpfs: Cloud Parallel File Storage (CPFS) with locally redundant storage (LRS).</li>
         * <li>cpfsse: Cloud Parallel File Storage SE with zone-redundant storage (ZRS).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        public Builder fileSystemType(String fileSystemType) {
            this.putQueryParameter("FileSystemType", fileSystemType);
            this.fileSystemType = fileSystemType;
            return this;
        }

        /**
         * <p>The cluster ID of the high-performance network zone. This parameter is required when FileSystemType is set to bmcpfs and cannot be modified after creation. You can call the DescribeSpecifications operation to query valid values. Example: B1.</p>
         * 
         * <strong>example:</strong>
         * <p>B1</p>
         */
        public Builder hpnZone(String hpnZone) {
            this.putQueryParameter("HpnZone", hpnZone);
            this.hpnZone = hpnZone;
            return this;
        }

        /**
         * <p>The ID of the KMS key.
         * This parameter is required only when EncryptType is set to 2.</p>
         * 
         * <strong>example:</strong>
         * <p>fcbd****-62**-4a**-b605-c58cc1d5****</p>
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.putQueryParameter("KmsKeyId", kmsKeyId);
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * <p>The file transfer protocol type.</p>
         * <ul>
         * <li>When FileSystemType is set to standard, valid values are NFS and SMB.</li>
         * <li>When FileSystemType is set to extreme, the valid value is NFS.</li>
         * <li>When FileSystemType is set to cpfs, the valid value is cpfs.</li>
         * <li>When FileSystemType is set to cpfsse, the valid value is cpfs.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NFS</p>
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * <p>The storage redundancy type. This parameter takes effect only for CPFS SE. Valid value: ZRS.</p>
         * 
         * <strong>example:</strong>
         * <p>ZRS</p>
         */
        public Builder redundancyType(String redundancyType) {
            this.putQueryParameter("RedundancyType", redundancyType);
            this.redundancyType = redundancyType;
            return this;
        }

        /**
         * <p>The zone-redundant vSwitch IDs.
         * This parameter is required when RedundancyType is set to ZRS. You must specify three vSwitch IDs, and they must belong to three different zones.</p>
         */
        public Builder redundancyVSwitchIds(java.util.List<String> redundancyVSwitchIds) {
            this.putQueryParameter("RedundancyVSwitchIds", redundancyVSwitchIds);
            this.redundancyVSwitchIds = redundancyVSwitchIds;
            return this;
        }

        /**
         * <p>The resource group ID.
         * You can view the resource group ID in the <a href="https://resourcemanager.console.aliyun.com/resource-groups?">Resource Management console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmwavnfdf****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The snapshot ID.
         * This parameter is supported only for Extreme NAS file systems with the Advanced storage type.</p>
         * <blockquote>
         * <p>When you create a file system from a snapshot, the created file system has the same version as the source file system of the snapshot. For example, if the source file system of the snapshot is version 1 and you want to create a version 2 file system, you can first create File System A from the snapshot, then create File System B that meets the version 2 configurations, copy the data from File System A to File System B, and migrate your business to File System B after the copy is complete.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>s-extreme-snapsho****</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * <p>The storage type.</p>
         * <ul>
         * <li>When FileSystemType is set to standard, valid values are Performance, Capacity, Premium, and Agentic.</li>
         * <li>When FileSystemType is set to extreme, valid values are standard and advance.</li>
         * <li>When FileSystemType is set to cpfs, valid values are advance_100 (100 MB/s/TiB baseline), advance_200 (200 MB/s/TiB baseline), and economic (Economy).</li>
         * <li>When FileSystemType is set to cpfsse, the valid value is advance_100 (100 MB/s/TiB baseline).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Performance</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>The tags.
         * Array length: 1 to 20. If the array contains multiple tag objects, the tag keys must be unique.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * <ul>
         * <li>This parameter is required when FileSystemType is set to cpfs.</li>
         * <li>This parameter is reserved and does not take effect when FileSystemType is not set to cpfs. You do not need to configure it.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp131dkqilvw5pnlt****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The VPC ID.</p>
         * <ul>
         * <li>This parameter is required when FileSystemType is set to cpfs or cpfsse.</li>
         * <li>This parameter is reserved and does not take effect when FileSystemType is set to standard or extreme. You do not need to configure it.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp18cx9a7zoh0h9b4****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The zone ID.
         * A zone is a physical area with independent power grids and networks in the same region.
         * When FileSystemType is set to standard, this parameter is optional. By default, a zone that meets the conditional requirements is randomly selected based on the ProtocolType and StorageType settings.
         * When FileSystemType is set to extreme or cpfs, this parameter is required.</p>
         * <blockquote>
         * <ul>
         * <li>File systems and Elastic Compute Service (ECS) instances in different zones of the same region can communicate with each other.</li>
         * <li>Deploy the file system and the ECS instance in the same zone to avoid cross-zone latency.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateFileSystemRequest build() {
            return new CreateFileSystemRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateFileSystemRequest} extends {@link TeaModel}
     *
     * <p>CreateFileSystemRequest</p>
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
             * <p>The tag key.
             * Limits:</p>
             * <ul>
             * <li>It cannot be empty or an empty string.</li>
             * <li>It can be up to 128 characters in length.</li>
             * <li>It cannot start with <code>aliyun</code> or <code>acs:</code>.</li>
             * <li>It cannot contain <code>http://</code> or <code>https://</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>nastest</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.
             * Limits:</p>
             * <ul>
             * <li>It cannot be empty or an empty string.</li>
             * <li>It can be up to 128 characters in length.</li>
             * <li>It cannot contain <code>http://</code> or <code>https://</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>testValue</p>
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
