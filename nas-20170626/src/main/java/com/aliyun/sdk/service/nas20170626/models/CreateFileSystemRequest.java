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
         * <p>The maximum throughput of the file system.</p>
         * <p>Unit: MB/s.</p>
         * <p>For available specification values, refer to the actual specifications on the purchase page.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p><a href="https://common-buy.aliyun.com/?commodityCode=nas_cpfs_post#/buy">Parallel file system CPFS pay-as-you-go purchase page</a></p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p><a href="https://common-buy-intl.alibabacloud.com/?spm=5176.nas_overview.0.0.7ea01dbft0dTui&commodityCode=nas_cpfspost_public_intl#/buy">Parallel file system CPFS pay-as-you-go purchase page</a></p>
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
         * This parameter is required and takes effect only when FileSystemType is set to extreme, cpfs, or cpfsse.</p>
         * <p>For available values, refer to the actual specifications on the purchase page:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><a href="https://common-buy.aliyun.com/?commodityCode=nas_extreme_post#/buy">Extreme NAS pay-as-you-go purchase page</a></li>
         * <li><a href="https://common-buy.aliyun.com/?commodityCode=nas_cpfs_post#/buy">Parallel file system CPFS pay-as-you-go purchase page</a></li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li><p><a href="https://common-buy-intl.alibabacloud.com/?commodityCode=nas_extpost_public_intl#/buy">Extreme NAS pay-as-you-go purchase page</a></p>
         * </li>
         * <li><p><a href="https://common-buy-intl.alibabacloud.com/?spm=5176.nas_overview.0.0.7ea01dbft0dTui&commodityCode=nas_cpfspost_public_intl#/buy">Parallel file system CPFS pay-as-you-go purchase page</a></p>
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
         * <p>The billing method.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PayAsYouGo (default): Pay-as-you-go.</li>
         * <li>Subscription: Subscription.</li>
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
         * <p>Ensures the idempotence of the request. Generate a unique parameter value from your client. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system uses the RequestId of the API request as the ClientToken. The RequestId may vary for each API request.</p>
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
         * <p>The description of the file system.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The description must be 2 to 128 characters in length.</li>
         * <li>The description must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>The description can contain digits, colons (:), underscores (_), and hyphens (-).</li>
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
         * <p>Specifies whether to perform a dry run for this request.</p>
         * <p>A dry run checks parameter validity and resource availability without actually creating the instance or incurring charges.</p>
         * <p>Valid values:  </p>
         * <ul>
         * <li>true: Sends a dry run request without creating the instance. The check items include required parameters, request format, service limits, and NAS inventory. If the check fails, the corresponding error is returned. If the check succeeds, HTTP status code 200 is returned, but FileSystemId is empty.  </li>
         * <li>false (default): Sends a normal request. After the check succeeds, the instance is created.</li>
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
         * <p>The subscription duration.</p>
         * <p>Unit: months. This parameter is required and takes effect only when ChargeType is set to Subscription.</p>
         * <p>If a subscription instance is not renewed before the instance expires, the instance is automatically released upon expiration. For more information about renewal, see the renewal documentation.</p>
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
         * <p>Specifies whether to encrypt the file system.</p>
         * <p>Uses keys managed by Key Management Service (KMS) to encrypt data stored on the file system. Decryption is not required when you read or write encrypted data.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0 (default): Not encrypted.</li>
         * <li>1: NAS-managed key. Supported when FileSystemType is set to standard or extreme.</li>
         * <li>2: Custom Key (KMS). Supported when FileSystemType is set to standard or extreme.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Extreme NAS: Custom Key (KMS) is supported in all regions except China East 1 Finance.</li>
         * <li>General-purpose NAS: Custom Key (KMS) is supported in all regions.</li>
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
         * <p>The type of the file system.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>standard (default): General-purpose NAS.</li>
         * <li>extreme: Extreme NAS.</li>
         * <li>cpfs: Cloud Parallel File Storage (CPFS) (locally redundant).</li>
         * <li>cpfsse: CPFS SE (zone-redundant).</li>
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
         * <p>The KMS key ID.</p>
         * <p>This parameter is required only when EncryptType is set to 2.</p>
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
         * <li>If FileSystemType is set to standard, valid values: NFS and SMB.</li>
         * <li>If FileSystemType is set to extreme, valid values: NFS.</li>
         * <li>If FileSystemType is set to cpfs, valid values: cpfs.</li>
         * <li>If FileSystemType is set to cpfsse, valid values: cpfs.</li>
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
         * <p>The storage redundancy type. This parameter takes effect only for CPFS SE.
         * Valid values: ZRS.</p>
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
         * <p>The list of zone-redundant vSwitch IDs.
         * If RedundancyType is set to ZRS, this parameter is required. You must specify three vSwitch IDs from three different zones.</p>
         */
        public Builder redundancyVSwitchIds(java.util.List<String> redundancyVSwitchIds) {
            this.putQueryParameter("RedundancyVSwitchIds", redundancyVSwitchIds);
            this.redundancyVSwitchIds = redundancyVSwitchIds;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * <p>You can view resource group IDs in the <a href="https://resourcemanager.console.aliyun.com/resource-groups?">Resource Management console</a>.</p>
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
         * <p>The snapshot ID.</p>
         * <p>This parameter is supported only for Extreme NAS file systems with the advanced storage type.</p>
         * <blockquote>
         * <p>A file system created from a snapshot has the same version as the source file system of the snapshot. For example, if the source file system version is 1 and you want to create a version 2 file system, first create file system A from the snapshot, then create file system B that meets the version 2 configuration, copy the data from file system A to file system B, and migrate your workloads to file system B after the copy is complete.</p>
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
         * <li>If FileSystemType is set to standard, valid values: Performance, Capacity, Premium, and Agentic (AgenticFS).</li>
         * <li>If FileSystemType is set to extreme, valid values: standard and advance.</li>
         * <li>If FileSystemType is set to cpfs, valid values: advance_100 (100 MB/s/TiB baseline), advance_200 (200 MB/s/TiB baseline), and economic.</li>
         * <li>If FileSystemType is set to cpfsse, valid values: advance_100 (100 MB/s/TiB baseline).</li>
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
         * <p>The tags.</p>
         * <p>Array length: 1 to 20. If the array contains multiple tag objects, the tag key (Key) must be unique.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * <ul>
         * <li>If FileSystemType is set to cpfs, this parameter is required.</li>
         * <li>If FileSystemType is not set to cpfs, this parameter is reserved and does not take effect. You do not need to configure it.</li>
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
         * <li>If FileSystemType is set to cpfs or cpfsse, this parameter is required.</li>
         * <li>If FileSystemType is set to standard or extreme, this parameter is reserved and does not take effect. You do not need to configure it.</li>
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
         * <p>The zone ID.</p>
         * <p>A zone is a physical area with independent power grids and networks within a region.</p>
         * <p>If FileSystemType is set to standard, this parameter is optional. By default, an active zone that meets the conditional ProtocolType and StorageType configurations is randomly selected.</p>
         * <p>If FileSystemType is set to extreme or cpfs, this parameter is required.</p>
         * <blockquote>
         * <ul>
         * <li>File systems and Elastic Computing Service (ECS) servers in different zones within the same region can communicate with each other.</li>
         * <li>Place the file system and the Elastic Computing Service (ECS) server in the same zone to avoid cross-zone latency.</li>
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
             * <p>The tag key.</p>
             * <p>Limits:</p>
             * <ul>
             * <li>The tag key cannot be empty or an empty string.</li>
             * <li>The tag key can be up to 128 characters in length.</li>
             * <li>The tag key cannot start with <code>aliyun</code> or <code>acs:</code>.</li>
             * <li>The tag key cannot contain <code>http://</code> or <code>https://</code>.</li>
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
             * <p>The tag value.</p>
             * <p>Limits:</p>
             * <ul>
             * <li>The tag value cannot be empty or an empty string.</li>
             * <li>The tag value can be up to 128 characters in length.</li>
             * <li>The tag value cannot contain <code>http://</code> or <code>https://</code>.</li>
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
