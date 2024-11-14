// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDedicatedBlockStorageClusterDisksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedBlockStorageClusterDisksResponseBody</p>
 */
public class DescribeDedicatedBlockStorageClusterDisksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Disks")
    private Disks disks;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDedicatedBlockStorageClusterDisksResponseBody(Builder builder) {
        this.disks = builder.disks;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedBlockStorageClusterDisksResponseBody create() {
        return builder().build();
    }

    /**
     * @return disks
     */
    public Disks getDisks() {
        return this.disks;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Disks disks; 
        private String nextToken; 
        private String requestId; 

        /**
         * <p>Details about the cloud disks.</p>
         */
        public Builder disks(Disks disks) {
            this.disks = disks;
            return this;
        }

        /**
         * <p>The query token returned in this call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>11B55F58-D3A4-4A9B-9596-342420D0****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDedicatedBlockStorageClusterDisksResponseBody build() {
            return new DescribeDedicatedBlockStorageClusterDisksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDedicatedBlockStorageClusterDisksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedBlockStorageClusterDisksResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * <p>The tag key of the cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedBlockStorageClusterDisksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedBlockStorageClusterDisksResponseBody</p>
     */
    public static class Disk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachedTime")
        private String attachedTime;

        @com.aliyun.core.annotation.NameInMap("BdfId")
        private String bdfId;

        @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DeleteAutoSnapshot")
        private Boolean deleteAutoSnapshot;

        @com.aliyun.core.annotation.NameInMap("DeleteWithInstance")
        private Boolean deleteWithInstance;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DetachedTime")
        private String detachedTime;

        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("DiskChargeType")
        private String diskChargeType;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("DiskName")
        private String diskName;

        @com.aliyun.core.annotation.NameInMap("EnableAutoSnapshot")
        private Boolean enableAutoSnapshot;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private Boolean encrypted;

        @com.aliyun.core.annotation.NameInMap("IOPS")
        private Long IOPS;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("KMSKeyId")
        private String KMSKeyId;

        @com.aliyun.core.annotation.NameInMap("MountInstanceNum")
        private Integer mountInstanceNum;

        @com.aliyun.core.annotation.NameInMap("MultiAttach")
        private String multiAttach;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("Portable")
        private Boolean portable;

        @com.aliyun.core.annotation.NameInMap("ProvisionedIops")
        private Long provisionedIops;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("SourceSnapshotId")
        private String sourceSnapshotId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageClusterId")
        private String storageClusterId;

        @com.aliyun.core.annotation.NameInMap("StorageSetId")
        private String storageSetId;

        @com.aliyun.core.annotation.NameInMap("StorageSetPartitionNumber")
        private Integer storageSetPartitionNumber;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Throughput")
        private Long throughput;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Disk(Builder builder) {
            this.attachedTime = builder.attachedTime;
            this.bdfId = builder.bdfId;
            this.burstingEnabled = builder.burstingEnabled;
            this.category = builder.category;
            this.deleteAutoSnapshot = builder.deleteAutoSnapshot;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.description = builder.description;
            this.detachedTime = builder.detachedTime;
            this.device = builder.device;
            this.diskChargeType = builder.diskChargeType;
            this.diskId = builder.diskId;
            this.diskName = builder.diskName;
            this.enableAutoSnapshot = builder.enableAutoSnapshot;
            this.encrypted = builder.encrypted;
            this.IOPS = builder.IOPS;
            this.imageId = builder.imageId;
            this.instanceId = builder.instanceId;
            this.KMSKeyId = builder.KMSKeyId;
            this.mountInstanceNum = builder.mountInstanceNum;
            this.multiAttach = builder.multiAttach;
            this.performanceLevel = builder.performanceLevel;
            this.portable = builder.portable;
            this.provisionedIops = builder.provisionedIops;
            this.regionId = builder.regionId;
            this.size = builder.size;
            this.sourceSnapshotId = builder.sourceSnapshotId;
            this.status = builder.status;
            this.storageClusterId = builder.storageClusterId;
            this.storageSetId = builder.storageSetId;
            this.storageSetPartitionNumber = builder.storageSetPartitionNumber;
            this.tags = builder.tags;
            this.throughput = builder.throughput;
            this.type = builder.type;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disk create() {
            return builder().build();
        }

        /**
         * @return attachedTime
         */
        public String getAttachedTime() {
            return this.attachedTime;
        }

        /**
         * @return bdfId
         */
        public String getBdfId() {
            return this.bdfId;
        }

        /**
         * @return burstingEnabled
         */
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return detachedTime
         */
        public String getDetachedTime() {
            return this.detachedTime;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return diskChargeType
         */
        public String getDiskChargeType() {
            return this.diskChargeType;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
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
         * @return encrypted
         */
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return IOPS
         */
        public Long getIOPS() {
            return this.IOPS;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
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
         * @return mountInstanceNum
         */
        public Integer getMountInstanceNum() {
            return this.mountInstanceNum;
        }

        /**
         * @return multiAttach
         */
        public String getMultiAttach() {
            return this.multiAttach;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return portable
         */
        public Boolean getPortable() {
            return this.portable;
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
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return sourceSnapshotId
         */
        public String getSourceSnapshotId() {
            return this.sourceSnapshotId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return throughput
         */
        public Long getThroughput() {
            return this.throughput;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String attachedTime; 
            private String bdfId; 
            private Boolean burstingEnabled; 
            private String category; 
            private Boolean deleteAutoSnapshot; 
            private Boolean deleteWithInstance; 
            private String description; 
            private String detachedTime; 
            private String device; 
            private String diskChargeType; 
            private String diskId; 
            private String diskName; 
            private Boolean enableAutoSnapshot; 
            private Boolean encrypted; 
            private Long IOPS; 
            private String imageId; 
            private String instanceId; 
            private String KMSKeyId; 
            private Integer mountInstanceNum; 
            private String multiAttach; 
            private String performanceLevel; 
            private Boolean portable; 
            private Long provisionedIops; 
            private String regionId; 
            private Integer size; 
            private String sourceSnapshotId; 
            private String status; 
            private String storageClusterId; 
            private String storageSetId; 
            private Integer storageSetPartitionNumber; 
            private java.util.List < Tags> tags; 
            private Long throughput; 
            private String type; 
            private String zoneId; 

            /**
             * <p>The time when the cloud disk was last attached. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mmZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-07T06:08:56Z</p>
             */
            public Builder attachedTime(String attachedTime) {
                this.attachedTime = attachedTime;
                return this;
            }

            /**
             * <p>This parameter is currently in invitational preview and unavailable for general users.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder bdfId(String bdfId) {
                this.bdfId = bdfId;
                return this;
            }

            /**
             * <p>Whether the ESSD AutoPL disk is enabled burst IOPS / BPS. This parameter is available only if the DiskCategory parameter is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * <p>The category of the disk. A value of cloud_essd indicates that the disk is an ESSD.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Indicates whether the automatic snapshots of the cloud disk are deleted when the disk is released. Valid values:</p>
             * <ul>
             * <li>true: The automatic snapshots of the cloud disk are deleted when the disk is released.</li>
             * <li>false: The automatic snapshots of the cloud disk are retained when the disk is released.</li>
             * </ul>
             * <p>Snapshots that are created by calling the <a href="https://help.aliyun.com/document_detail/25524.html">CreateSnapshot</a> operation or by using the Elastic Compute Service (ECS) console are retained and not affected by this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder deleteAutoSnapshot(Boolean deleteAutoSnapshot) {
                this.deleteAutoSnapshot = deleteAutoSnapshot;
                return this;
            }

            /**
             * <p>Indicates whether the cloud disk is released when its associated instance is released. Valid values:</p>
             * <ul>
             * <li>true: The cloud disk is released when its associated instance is released.</li>
             * <li>false: The cloud disk is retained when its associated instance is released.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * <p>The description of the cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>testDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the cloud disk was last detached.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-07T21:01:22Z</p>
             */
            public Builder detachedTime(String detachedTime) {
                this.detachedTime = detachedTime;
                return this;
            }

            /**
             * <p>The device name of the cloud disk on its associated instance. Example: /dev/xvdb. Take note of the following items:</p>
             * <ul>
             * <li>This parameter has a value only when the <code>Status</code> value is <code>In_use</code>.</li>
             * <li>This parameter is empty for cloud disks that have the multi-attach feature enabled. You can query the attachment information of the cloud disk based on the <code>Attachment</code> values.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>/dev/xvdb</p>
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>The billing method of the cloud disk. Valid values:</p>
             * <ul>
             * <li>PrePaid: subscription</li>
             * <li>PostPaid: pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder diskChargeType(String diskChargeType) {
                this.diskChargeType = diskChargeType;
                return this;
            }

            /**
             * <p>The ID of the cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>d-bp67acfmxazb4p****</p>
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * <p>The name of the cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>testDiskName</p>
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * <p>Indicates whether the automatic snapshot policy feature is enabled for the cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableAutoSnapshot(Boolean enableAutoSnapshot) {
                this.enableAutoSnapshot = enableAutoSnapshot;
                return this;
            }

            /**
             * <p>Indicates whether the cloud disk is encrypted.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>The maximum number of IOPS.</p>
             * 
             * <strong>example:</strong>
             * <p>4000</p>
             */
            public Builder IOPS(Long IOPS) {
                this.IOPS = IOPS;
                return this;
            }

            /**
             * <p>The ID of the image that was used to create the instance. This parameter is empty unless the cloud disk was created from an image. The value of this parameter remains unchanged throughout the lifecycle of the cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>m-bp13aqm171qynt3u***</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The ID of the instance to which the cloud disk is attached. Take note of the following items:</p>
             * <ul>
             * <li>This parameter has a value only when the <code>Status</code> value is <code>In_use</code>.</li>
             * <li>This parameter is empty for cloud disks that have the multi-attach feature enabled. You can query the attachment information of the cloud disk based on the <code>Attachment</code> values.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>i-bp67acfmxazb4q****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the Key Management Service (KMS) key used by the cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * <p>The number of instances to which the Shared Block Storage device is attached.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder mountInstanceNum(Integer mountInstanceNum) {
                this.mountInstanceNum = mountInstanceNum;
                return this;
            }

            /**
             * <p>Indicates whether the multi-attach feature was enabled for the cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>Disabled</p>
             */
            public Builder multiAttach(String multiAttach) {
                this.multiAttach = multiAttach;
                return this;
            }

            /**
             * <p>The performance level of the enhanced SSD (ESSD). Valid values:</p>
             * <ul>
             * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
             * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
             * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
             * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PL0</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>Indicates whether the cloud disk is removable.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder portable(Boolean portable) {
                this.portable = portable;
                return this;
            }

            /**
             * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. </p>
             * <blockquote>
             * <p> This parameter is available only if the DiskCategory parameter is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a> and <a href="https://help.aliyun.com/document_detail/413275.html">Modify the performance configurations of an ESSD AutoPL disk</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>50000</p>
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * <p>The region ID of cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-heyuan</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The size of the disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The ID of the snapshot that was used to create the cloud disk.</p>
             * <p>This parameter is empty unless the cloud disk was created from a snapshot. The value of this parameter remains unchanged throughout the lifecycle of the cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>s-bp67acfmxazb4p****</p>
             */
            public Builder sourceSnapshotId(String sourceSnapshotId) {
                this.sourceSnapshotId = sourceSnapshotId;
                return this;
            }

            /**
             * <p>The state of the cloud disk. For more information, see <a href="https://help.aliyun.com/document_detail/25689.html">Disk states</a>. Valid values:</p>
             * <ul>
             * <li>In_use</li>
             * <li>Available</li>
             * <li>Attaching</li>
             * <li>Detaching</li>
             * <li>Creating</li>
             * <li>ReIniting</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>In_use</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the dedicated block storage cluster to which the cloud disk belongs. If your cloud disk belongs to the public block storage cluster, an empty value is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>dbsc-j5e1sf2vaf5he8m2****</p>
             */
            public Builder storageClusterId(String storageClusterId) {
                this.storageClusterId = storageClusterId;
                return this;
            }

            /**
             * <p>The ID of the storage set.</p>
             * 
             * <strong>example:</strong>
             * <p>ss-i-bp1j4i2jdf3owlhe****</p>
             */
            public Builder storageSetId(String storageSetId) {
                this.storageSetId = storageSetId;
                return this;
            }

            /**
             * <p>The maximum number of partitions in the storage set.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder storageSetPartitionNumber(Integer storageSetPartitionNumber) {
                this.storageSetPartitionNumber = storageSetPartitionNumber;
                return this;
            }

            /**
             * <p>The tags of the cloud disk.</p>
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The maximum number of BPS.</p>
             * 
             * <strong>example:</strong>
             * <p>350</p>
             */
            public Builder throughput(Long throughput) {
                this.throughput = throughput;
                return this;
            }

            /**
             * <p>The type of the disk. Valid values:</p>
             * <ul>
             * <li>system: system disk</li>
             * <li>data: data disk</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The zone ID of cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-heyuan-i</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Disk build() {
                return new Disk(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedBlockStorageClusterDisksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedBlockStorageClusterDisksResponseBody</p>
     */
    public static class Disks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Disk")
        private java.util.List < Disk> disk;

        private Disks(Builder builder) {
            this.disk = builder.disk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disks create() {
            return builder().build();
        }

        /**
         * @return disk
         */
        public java.util.List < Disk> getDisk() {
            return this.disk;
        }

        public static final class Builder {
            private java.util.List < Disk> disk; 

            /**
             * <p>Details about the cloud disks.</p>
             */
            public Builder disk(java.util.List < Disk> disk) {
                this.disk = disk;
                return this;
            }

            public Disks build() {
                return new Disks(this);
            } 

        } 

    }
}
