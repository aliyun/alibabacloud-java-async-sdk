// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDisksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDisksResponseBody</p>
 */
public class DescribeDisksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Disks")
    private Disks disks;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDisksResponseBody(Builder builder) {
        this.disks = builder.disks;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDisksResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Disks disks; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The details about the disks.
         */
        public Builder disks(Disks disks) {
            this.disks = disks;
            return this;
        }

        /**
         * The returned pagination token which can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDisksResponseBody build() {
            return new DescribeDisksResponseBody(this);
        } 

    } 

    public static class Attachment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachedTime")
        private String attachedTime;

        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private Attachment(Builder builder) {
            this.attachedTime = builder.attachedTime;
            this.device = builder.device;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attachment create() {
            return builder().build();
        }

        /**
         * @return attachedTime
         */
        public String getAttachedTime() {
            return this.attachedTime;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String attachedTime; 
            private String device; 
            private String instanceId; 

            /**
             * The time when the disk was attached. The time is displayed in UTC.
             */
            public Builder attachedTime(String attachedTime) {
                this.attachedTime = attachedTime;
                return this;
            }

            /**
             * The device name of the disk.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * The ID of the instance to which the disk is attached.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public Attachment build() {
                return new Attachment(this);
            } 

        } 

    }
    public static class Attachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attachment")
        private java.util.List < Attachment> attachment;

        private Attachments(Builder builder) {
            this.attachment = builder.attachment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attachments create() {
            return builder().build();
        }

        /**
         * @return attachment
         */
        public java.util.List < Attachment> getAttachment() {
            return this.attachment;
        }

        public static final class Builder {
            private java.util.List < Attachment> attachment; 

            /**
             * Attachment.
             */
            public Builder attachment(java.util.List < Attachment> attachment) {
                this.attachment = attachment;
                return this;
            }

            public Attachments build() {
                return new Attachments(this);
            } 

        } 

    }
    public static class MountInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachedTime")
        private String attachedTime;

        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private MountInstance(Builder builder) {
            this.attachedTime = builder.attachedTime;
            this.device = builder.device;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountInstance create() {
            return builder().build();
        }

        /**
         * @return attachedTime
         */
        public String getAttachedTime() {
            return this.attachedTime;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String attachedTime; 
            private String device; 
            private String instanceId; 

            /**
             * The time when the disk was attached. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder attachedTime(String attachedTime) {
                this.attachedTime = attachedTime;
                return this;
            }

            /**
             * The mount point of the disk.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * The ID of the instance to which the disk is attached.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public MountInstance build() {
                return new MountInstance(this);
            } 

        } 

    }
    public static class MountInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountInstance")
        private java.util.List < MountInstance> mountInstance;

        private MountInstances(Builder builder) {
            this.mountInstance = builder.mountInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountInstances create() {
            return builder().build();
        }

        /**
         * @return mountInstance
         */
        public java.util.List < MountInstance> getMountInstance() {
            return this.mountInstance;
        }

        public static final class Builder {
            private java.util.List < MountInstance> mountInstance; 

            /**
             * MountInstance.
             */
            public Builder mountInstance(java.util.List < MountInstance> mountInstance) {
                this.mountInstance = mountInstance;
                return this;
            }

            public MountInstances build() {
                return new MountInstances(this);
            } 

        } 

    }
    public static class OperationLock extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        private OperationLock(Builder builder) {
            this.lockReason = builder.lockReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationLock create() {
            return builder().build();
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        public static final class Builder {
            private String lockReason; 

            /**
             * The reason why the disk was locked.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            public OperationLock build() {
                return new OperationLock(this);
            } 

        } 

    }
    public static class OperationLocks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperationLock")
        private java.util.List < OperationLock> operationLock;

        private OperationLocks(Builder builder) {
            this.operationLock = builder.operationLock;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationLocks create() {
            return builder().build();
        }

        /**
         * @return operationLock
         */
        public java.util.List < OperationLock> getOperationLock() {
            return this.operationLock;
        }

        public static final class Builder {
            private java.util.List < OperationLock> operationLock; 

            /**
             * OperationLock.
             */
            public Builder operationLock(java.util.List < OperationLock> operationLock) {
                this.operationLock = operationLock;
                return this;
            }

            public OperationLocks build() {
                return new OperationLocks(this);
            } 

        } 

    }
    public static class Placement extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ZoneIds")
        private String zoneIds;

        private Placement(Builder builder) {
            this.zoneIds = builder.zoneIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Placement create() {
            return builder().build();
        }

        /**
         * @return zoneIds
         */
        public String getZoneIds() {
            return this.zoneIds;
        }

        public static final class Builder {
            private String zoneIds; 

            /**
             * The IDs of the zones in which data is stored.
             */
            public Builder zoneIds(String zoneIds) {
                this.zoneIds = zoneIds;
                return this;
            }

            public Placement build() {
                return new Placement(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
             * The tag key of the disk.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value of the disk.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Disk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachedTime")
        private String attachedTime;

        @com.aliyun.core.annotation.NameInMap("Attachments")
        private Attachments attachments;

        @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @com.aliyun.core.annotation.NameInMap("BdfId")
        private String bdfId;

        @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

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

        @com.aliyun.core.annotation.NameInMap("EnableAutomatedSnapshotPolicy")
        private Boolean enableAutomatedSnapshotPolicy;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private Boolean encrypted;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("IOPS")
        private Integer IOPS;

        @com.aliyun.core.annotation.NameInMap("IOPSRead")
        private Integer IOPSRead;

        @com.aliyun.core.annotation.NameInMap("IOPSWrite")
        private Integer IOPSWrite;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("KMSKeyId")
        private String KMSKeyId;

        @com.aliyun.core.annotation.NameInMap("MountInstanceNum")
        private Integer mountInstanceNum;

        @com.aliyun.core.annotation.NameInMap("MountInstances")
        private MountInstances mountInstances;

        @com.aliyun.core.annotation.NameInMap("MultiAttach")
        private String multiAttach;

        @com.aliyun.core.annotation.NameInMap("OperationLocks")
        private OperationLocks operationLocks;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("Placement")
        private Placement placement;

        @com.aliyun.core.annotation.NameInMap("Portable")
        private Boolean portable;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProvisionedIops")
        private Long provisionedIops;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

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
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("Throughput")
        private Integer throughput;

        @com.aliyun.core.annotation.NameInMap("ThroughputRead")
        private Integer throughputRead;

        @com.aliyun.core.annotation.NameInMap("ThroughputWrite")
        private Integer throughputWrite;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Disk(Builder builder) {
            this.attachedTime = builder.attachedTime;
            this.attachments = builder.attachments;
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
            this.bdfId = builder.bdfId;
            this.burstingEnabled = builder.burstingEnabled;
            this.category = builder.category;
            this.creationTime = builder.creationTime;
            this.deleteAutoSnapshot = builder.deleteAutoSnapshot;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.description = builder.description;
            this.detachedTime = builder.detachedTime;
            this.device = builder.device;
            this.diskChargeType = builder.diskChargeType;
            this.diskId = builder.diskId;
            this.diskName = builder.diskName;
            this.enableAutoSnapshot = builder.enableAutoSnapshot;
            this.enableAutomatedSnapshotPolicy = builder.enableAutomatedSnapshotPolicy;
            this.encrypted = builder.encrypted;
            this.expiredTime = builder.expiredTime;
            this.IOPS = builder.IOPS;
            this.IOPSRead = builder.IOPSRead;
            this.IOPSWrite = builder.IOPSWrite;
            this.imageId = builder.imageId;
            this.instanceId = builder.instanceId;
            this.KMSKeyId = builder.KMSKeyId;
            this.mountInstanceNum = builder.mountInstanceNum;
            this.mountInstances = builder.mountInstances;
            this.multiAttach = builder.multiAttach;
            this.operationLocks = builder.operationLocks;
            this.performanceLevel = builder.performanceLevel;
            this.placement = builder.placement;
            this.portable = builder.portable;
            this.productCode = builder.productCode;
            this.provisionedIops = builder.provisionedIops;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.serialNumber = builder.serialNumber;
            this.size = builder.size;
            this.sourceSnapshotId = builder.sourceSnapshotId;
            this.status = builder.status;
            this.storageClusterId = builder.storageClusterId;
            this.storageSetId = builder.storageSetId;
            this.storageSetPartitionNumber = builder.storageSetPartitionNumber;
            this.tags = builder.tags;
            this.throughput = builder.throughput;
            this.throughputRead = builder.throughputRead;
            this.throughputWrite = builder.throughputWrite;
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
         * @return attachments
         */
        public Attachments getAttachments() {
            return this.attachments;
        }

        /**
         * @return autoSnapshotPolicyId
         */
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
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
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
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
         * @return enableAutomatedSnapshotPolicy
         */
        public Boolean getEnableAutomatedSnapshotPolicy() {
            return this.enableAutomatedSnapshotPolicy;
        }

        /**
         * @return encrypted
         */
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return IOPS
         */
        public Integer getIOPS() {
            return this.IOPS;
        }

        /**
         * @return IOPSRead
         */
        public Integer getIOPSRead() {
            return this.IOPSRead;
        }

        /**
         * @return IOPSWrite
         */
        public Integer getIOPSWrite() {
            return this.IOPSWrite;
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
         * @return mountInstances
         */
        public MountInstances getMountInstances() {
            return this.mountInstances;
        }

        /**
         * @return multiAttach
         */
        public String getMultiAttach() {
            return this.multiAttach;
        }

        /**
         * @return operationLocks
         */
        public OperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return placement
         */
        public Placement getPlacement() {
            return this.placement;
        }

        /**
         * @return portable
         */
        public Boolean getPortable() {
            return this.portable;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
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
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
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
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return throughput
         */
        public Integer getThroughput() {
            return this.throughput;
        }

        /**
         * @return throughputRead
         */
        public Integer getThroughputRead() {
            return this.throughputRead;
        }

        /**
         * @return throughputWrite
         */
        public Integer getThroughputWrite() {
            return this.throughputWrite;
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
            private Attachments attachments; 
            private String autoSnapshotPolicyId; 
            private String bdfId; 
            private Boolean burstingEnabled; 
            private String category; 
            private String creationTime; 
            private Boolean deleteAutoSnapshot; 
            private Boolean deleteWithInstance; 
            private String description; 
            private String detachedTime; 
            private String device; 
            private String diskChargeType; 
            private String diskId; 
            private String diskName; 
            private Boolean enableAutoSnapshot; 
            private Boolean enableAutomatedSnapshotPolicy; 
            private Boolean encrypted; 
            private String expiredTime; 
            private Integer IOPS; 
            private Integer IOPSRead; 
            private Integer IOPSWrite; 
            private String imageId; 
            private String instanceId; 
            private String KMSKeyId; 
            private Integer mountInstanceNum; 
            private MountInstances mountInstances; 
            private String multiAttach; 
            private OperationLocks operationLocks; 
            private String performanceLevel; 
            private Placement placement; 
            private Boolean portable; 
            private String productCode; 
            private Long provisionedIops; 
            private String regionId; 
            private String resourceGroupId; 
            private String serialNumber; 
            private Integer size; 
            private String sourceSnapshotId; 
            private String status; 
            private String storageClusterId; 
            private String storageSetId; 
            private Integer storageSetPartitionNumber; 
            private Tags tags; 
            private Integer throughput; 
            private Integer throughputRead; 
            private Integer throughputWrite; 
            private String type; 
            private String zoneId; 

            /**
             * The time when the disk was last attached. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mmZ format. The time is displayed in UTC.
             */
            public Builder attachedTime(String attachedTime) {
                this.attachedTime = attachedTime;
                return this;
            }

            /**
             * The attachment information of the disk. The value is an array that consists of the `Attachment` values. This value is not returned when you query Shared Block Storage devices.
             */
            public Builder attachments(Attachments attachments) {
                this.attachments = attachments;
                return this;
            }

            /**
             * The ID of the automatic snapshot policy that is applied to the cloud disk.
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * This parameter is in invitational preview and is not publicly available.
             */
            public Builder bdfId(String bdfId) {
                this.bdfId = bdfId;
                return this;
            }

            /**
             * Indicates whether the performance burst feature is enabled. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * This parameter is available only if you set `Category` to `cloud_auto`. For more information, see [ESSD AutoPL disks](~~368372~~).
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * The category of the disk. Valid values:
             * <p>
             * 
             * *   cloud: basic disk
             * *   cloud_efficiency: ultra disk
             * *   cloud_ssd: standard SSD
             * *   cloud_essd: ESSD
             * *   cloud_auto: ESSD AutoPL disk
             * *   local_ssd_pro: I/O-intensive local disk
             * *   local_hdd_pro: throughput-intensive local disk
             * *   cloud_essd_entry: ESSD Entry disk
             * *   elastic_ephemeral_disk_standard: standard elastic ephemeral disk
             * *   elastic_ephemeral_disk_premium: premium static ephemeral disk
             * *   ephemeral: retired local disk
             * *   ephemeral_ssd: retired local SSD
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The time when the disk was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Indicates whether the automatic snapshots of the cloud disk are deleted when the cloud disk is released. Valid values:
             * <p>
             * 
             * *   true: The automatic snapshots of the cloud disk are deleted when the disk is released.
             * *   false: The automatic snapshots of the cloud disk are retained when the disk is released.
             * 
             * Snapshots that were created in the ECS console or by calling the [CreateSnapshot](~~25524~~) operation are retained and not affected by this parameter.
             */
            public Builder deleteAutoSnapshot(Boolean deleteAutoSnapshot) {
                this.deleteAutoSnapshot = deleteAutoSnapshot;
                return this;
            }

            /**
             * Indicates whether the disk is released when the instance to which the disk is attached is released. Valid values:
             * <p>
             * 
             * *   true: The disk is released when the associated instance is released.
             * *   false: The disk is retained when the associated instance is released.
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * The description of the disk.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the disk was last detached.
             */
            public Builder detachedTime(String detachedTime) {
                this.detachedTime = detachedTime;
                return this;
            }

            /**
             * The device name of the disk on the instance to which the disk is attached. Example: /dev/xvdb. Take note of the following items:
             * <p>
             * 
             * *   This parameter has a value only when the `Status` value is `In_use` or `Detaching`.
             * *   This parameter is empty for cloud disks for which the multi-attach feature is enabled. You can query the attachment information of the cloud disk based on the returned list of `Attachment` objects.
             * 
             * >  This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * The billing method of the disk. Valid values:
             * <p>
             * 
             * *   PrePaid: subscription
             * *   PostPaid: pay-as-you-go
             */
            public Builder diskChargeType(String diskChargeType) {
                this.diskChargeType = diskChargeType;
                return this;
            }

            /**
             * The ID of the disk.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * The name of the disk.
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * Indicates whether the automatic snapshot policy feature is enabled for the disk.
             */
            public Builder enableAutoSnapshot(Boolean enableAutoSnapshot) {
                this.enableAutoSnapshot = enableAutoSnapshot;
                return this;
            }

            /**
             * Indicates whether an automatic snapshot policy is applied to the cloud disk.
             */
            public Builder enableAutomatedSnapshotPolicy(Boolean enableAutomatedSnapshotPolicy) {
                this.enableAutomatedSnapshotPolicy = enableAutomatedSnapshotPolicy;
                return this;
            }

            /**
             * Indicates whether the cloud disk is encrypted.
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * The time when the subscription disk expires.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The maximum number of read and write operations per second.
             */
            public Builder IOPS(Integer IOPS) {
                this.IOPS = IOPS;
                return this;
            }

            /**
             * The maximum number of read operations per second.
             */
            public Builder IOPSRead(Integer IOPSRead) {
                this.IOPSRead = IOPSRead;
                return this;
            }

            /**
             * The maximum number of write operations per second.
             */
            public Builder IOPSWrite(Integer IOPSWrite) {
                this.IOPSWrite = IOPSWrite;
                return this;
            }

            /**
             * The ID of the image that was used to create the instance. This parameter is empty unless the cloud disk was created from an image. The value of this parameter remains unchanged throughout the lifecycle of the cloud disk.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The ID of the instance to which the disk is attached. Take note of the following items:
             * <p>
             * 
             * *   This parameter has a value only when the `Status` value is `In_use` or `Detaching`.
             * *   This parameter is empty for cloud disks for which the multi-attach feature is enabled. You can query the attachment information of the cloud disk based on the returned `Attachment` objects.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the KMS key that is used for the cloud disk.
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * The number of instances to which the Shared Block Storage device is attached.
             */
            public Builder mountInstanceNum(Integer mountInstanceNum) {
                this.mountInstanceNum = mountInstanceNum;
                return this;
            }

            /**
             * The attachment information of the Shared Block Storage device.
             */
            public Builder mountInstances(MountInstances mountInstances) {
                this.mountInstances = mountInstances;
                return this;
            }

            /**
             * Indicates whether the multi-attach feature is enabled for the cloud disk.
             */
            public Builder multiAttach(String multiAttach) {
                this.multiAttach = multiAttach;
                return this;
            }

            /**
             * The reasons why the disk was locked.
             */
            public Builder operationLocks(OperationLocks operationLocks) {
                this.operationLocks = operationLocks;
                return this;
            }

            /**
             * The performance level of the ESSD. Valid values:
             * <p>
             * 
             * *   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
             * *   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
             * *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
             * *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * The locations in which data is stored.
             */
            public Builder placement(Placement placement) {
                this.placement = placement;
                return this;
            }

            /**
             * Indicates whether the disk is removable.
             */
            public Builder portable(Boolean portable) {
                this.portable = portable;
                return this;
            }

            /**
             * The product code of the disk in Alibaba Cloud Marketplace.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1,000 × *Capacity - Baseline IOPS}. Baseline IOPS = min{1,800 + 50 × *Capacity, 50,000}
             * <p>
             * 
             * This parameter is available only if you set `Category` to `cloud_auto`. For more information, see [ESSD AutoPL disks](~~368372~~).
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * The ID of the region to which the disk belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group to which the disk belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The serial number of the disk.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * The size of the disk. Unit: GiB.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The ID of the snapshot that was used to create the cloud disk.
             * <p>
             * 
             * This parameter is empty unless the cloud disk was created from a snapshot. The value of this parameter remains unchanged throughout the lifecycle of the cloud disk.
             */
            public Builder sourceSnapshotId(String sourceSnapshotId) {
                this.sourceSnapshotId = sourceSnapshotId;
                return this;
            }

            /**
             * The status of the disk. Valid values:
             * <p>
             * 
             * *   In_use
             * *   Available
             * *   Attaching
             * *   Detaching
             * *   Creating
             * *   ReIniting
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the dedicated block storage cluster to which the cloud disk belongs. If your cloud disk belongs to the public block storage cluster, an empty value is returned.
             */
            public Builder storageClusterId(String storageClusterId) {
                this.storageClusterId = storageClusterId;
                return this;
            }

            /**
             * The ID of the storage set.
             */
            public Builder storageSetId(String storageSetId) {
                this.storageSetId = storageSetId;
                return this;
            }

            /**
             * The maximum number of partitions in the storage set.
             */
            public Builder storageSetPartitionNumber(Integer storageSetPartitionNumber) {
                this.storageSetPartitionNumber = storageSetPartitionNumber;
                return this;
            }

            /**
             * The tags of the disk.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The amount of data that can be transferred per second. Unit: MB/s.
             */
            public Builder throughput(Integer throughput) {
                this.throughput = throughput;
                return this;
            }

            /**
             * The amount of data that can be read per second. Unit: MB/s.
             */
            public Builder throughputRead(Integer throughputRead) {
                this.throughputRead = throughputRead;
                return this;
            }

            /**
             * The amount of data that can be written per second. Unit: MB/s.
             */
            public Builder throughputWrite(Integer throughputWrite) {
                this.throughputWrite = throughputWrite;
                return this;
            }

            /**
             * The type of the disk. Valid values:
             * <p>
             * 
             * *   system: system disk
             * *   data: data disk
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The ID of the zone to which the disk belongs.
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
             * Disk.
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
