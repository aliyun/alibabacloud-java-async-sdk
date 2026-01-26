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
         * <p>Specify a value based on the specifications on the buy page.</p>
         * <p><a href="https://common-buy-intl.alibabacloud.com/?spm=5176.nas_overview.0.0.7ea01dbft0dTui&commodityCode=nas_cpfspost_public_intl#/buy">CPFS (Pay-as-you-go)</a></p>
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
         * <p>Specify the capacity of the file system. Unit: GiB. This parameter is required and valid when FileSystemType is set to extreme, cpfs, or cpfsse.</p>
         * <p>Specify a value based on the specifications on the following buy page:</p>
         * <ul>
         * <li><a href="https://common-buy-intl.alibabacloud.com/?commodityCode=nas_extpost_public_intl#/buy">Extreme NAS (Pay-as-you-go)</a></li>
         * <li><a href="https://common-buy-intl.alibabacloud.com/?spm=5176.nas_overview.0.0.7ea01dbft0dTui&commodityCode=nas_cpfspost_public_intl#/buy">CPFS (Pay-as-you-go)</a></li>
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
         * <li>PayAsYouGo (default): pay-as-you-go</li>
         * <li>Subscription</li>
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
         * <p>A client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. ClientToken only supports ASCII characters and cannot exceed 64 characters. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
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
         * <li>Must be 2 to 128 characters in length.</li>
         * <li>Must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>Can contain digits, colons (:), underscores (_), and hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Whether to precheck the creation request.</p>
         * <p>The precheck operation helps you check the validity of parameters and verify inventory. It does not actually create instances and does not incur fees.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: Checks the request without creating an instance. The system checks the required parameters, request syntax, service limits, and available NAS resources. If the request fails to pass the check, an error message is returned. If the request passes the check, the HTTP status code 200 is returned. No value is returned for the FileSystemId parameter.</li>
         * <li>false (default): Sends the request. If the request passes the check, the instance is created.</li>
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
         * <p>This parameter is valid and required if ChargeType is set to Subscription. Unit: months.</p>
         * <p>If you do not renew a subscription file system when the file system expires, the file system is automatically released.</p>
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
         * <p>Specifies whether to encrypt data in the file system.</p>
         * <p>You can use the keys that are managed by Key Management Service (KMS) to encrypt data in a file system. When you read and write the encrypted data, the data is automatically decrypted.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0 (default): The data in the file system is not encrypted.</li>
         * <li>1: A NAS-managed key is used to encrypt the data in the file system. This value is valid if FileSystemType is set to standard or extreme.</li>
         * <li>2: A KMS-managed key is used to encrypt the data in the file system. This value is valid if the FileSystemType parameter is set to standard or extreme.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>Extreme NAS: All regions except China East 1 Finance support KMS-managed keys.</p>
         * </li>
         * <li><p>General-purpose NAS: All regions support KMS-managed keys.</p>
         * </li>
         * </ul>
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
         * <li>standard: General-purpose NAS</li>
         * <li>extreme: Extreme NAS</li>
         * <li>cpfs: CPFS (locally redundant storage)</li>
         * <li>cpfsse: CPFS SE (zone-redundant storage)</li>
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
         * <p>The ID of the KMS key.</p>
         * <p>This parameter is required if EncryptType is set to 2.</p>
         * 
         * <strong>example:</strong>
         * <p>3c0b3885-2adf-483d-8a65-5e280689****</p>
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.putQueryParameter("KmsKeyId", kmsKeyId);
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * <p>Specify the protocol type.</p>
         * <ul>
         * <li>If FileSystemType is set to standard, set this parameter to NFS or SMB.</li>
         * <li>If FileSystemType is set to extreme, set this parameter to NFS.</li>
         * <li>If FileSystemType is set to cpfs, set this parameter to cpfs.</li>
         * <li>If FileSystemType is set to cpfsse, set this parameter to cpfs.</li>
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
         * <p>Storage redundancy type. Only available for CPFS SE.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>ZRS</li>
         * </ul>
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
         * <p>A list of IDs for the zone-redundant vSwitches. This parameter is required if RedundancyType is set to ZRS. You must enter three vSwitch IDs from three different zones.</p>
         */
        public Builder redundancyVSwitchIds(java.util.List<String> redundancyVSwitchIds) {
            this.putQueryParameter("RedundancyVSwitchIds", redundancyVSwitchIds);
            this.redundancyVSwitchIds = redundancyVSwitchIds;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * <p>You can log on to the <a href="https://resourcemanager.console.aliyun.com/resource-groups?">Resource Management console</a> to view resource group IDs.</p>
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
         * <p>This parameter is available only for advanced Extreme NAS file systems.</p>
         * <blockquote>
         * <p>You can create a file system from a snapshot. The version of the file system is the same as that of the source file system. For example, the source file system of the snapshot uses version 1. To create a file system of version 2, create File System A from the snapshot and create File System B of version 2. Then copy the data and migrate your business from File System A to File System B.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>s-xxx</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * <p>The storage type.</p>
         * <ul>
         * <li>If FileSystemType is set to standard, set this parameter to Performance, Capacity, or Premium.</li>
         * <li>If FileSystemType is set to extreme, set this parameter to standard or advance.</li>
         * <li>If FileSystemType is set to cpfs, set this parameter to advance_100 (100 MB/s/TiB Baseline), advance_200 (200 MB/s/TiB Baseline), or economic.</li>
         * <li>If FileSystemType is set to cpfsse, set this parameter to advance_100 (100 MB/s/TiB Baseline).</li>
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
         * <p>An array of tags.</p>
         * <p>You can specify up to 20 tags. If you specify multiple tags, each tag key must be unique.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * <ul>
         * <li>This parameter is required if FileSystemType is set to cpfs.</li>
         * <li>If FileSystemType is not set to cpfs, this parameter is reserved and not required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vsw-2ze37k6jh8ums2fw2****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The VPC ID.</p>
         * <ul>
         * <li>This parameter is required if FileSystemType is set to cpfs or cpfsse.</li>
         * <li>This parameter is reserved and not required if FileSystemType is set to standard or extreme.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1cbv1ljve4j5hlw****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The ID of the zone.</p>
         * <p>Each region has multiple isolated locations known as zones. Each zone has its own independent power supply and network.</p>
         * <p>This parameter is not required if FileSystemType is set to standard. By default, a random zone is selected based on the protocol type and storage type.</p>
         * <p>This parameter is required if FileSystemType is set to extreme or cpfs.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>An Elastic Compute Service (ECS) instance and a file system that reside in different zones of the same region can access each other.</p>
         * </li>
         * <li><p>We recommend that you select the zone where the ECS instance resides. This prevents cross-zone latency between the file system and the ECS instance.</p>
         * </li>
         * </ul>
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
             * <li>Cannot be null or an empty string.</li>
             * <li>Can be up to 128 characters in length.</li>
             * <li>Cannot start with <code>aliyun</code> or <code>acs:</code>.</li>
             * <li>Cannot contain <code>http://</code> or <code>https://</code>.</li>
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
             * <li>Cannot be null or an empty string.</li>
             * <li>Can be up to 128 characters in length.</li>
             * <li>Cannot contain <code>http://</code> or <code>https://</code>.</li>
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
