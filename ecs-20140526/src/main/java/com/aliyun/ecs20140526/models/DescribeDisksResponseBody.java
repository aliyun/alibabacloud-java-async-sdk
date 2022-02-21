// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDisksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDisksResponseBody</p>
 */
public class DescribeDisksResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Disks")
    private Disks disks;

    private DescribeDisksResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.totalCount = builder.totalCount;
        this.disks = builder.disks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDisksResponseBody create() {
        return builder().build();
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return disks
     */
    public Disks getDisks() {
        return this.disks;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer totalCount; 
        private Disks disks; 

        /**
         * The query credential value returned by this call.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The page number of the cloud disk or local disk list.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The total number of query results.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * A collection of cloud disks or local disks.
         */
        public Builder disks(Disks disks) {
            this.disks = disks;
            return this;
        }

        public DescribeDisksResponseBody build() {
            return new DescribeDisksResponseBody(this);
        } 

    } 

    public static class OperationLock extends TeaModel {
        @NameInMap("LockReason")
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
             * The reason why the cloud disk or local disk is locked.
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
        @NameInMap("OperationLock")
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
    public static class MountInstance extends TeaModel {
        @NameInMap("AttachedTime")
        private String attachedTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Device")
        private String device;

        private MountInstance(Builder builder) {
            this.attachedTime = builder.attachedTime;
            this.instanceId = builder.instanceId;
            this.device = builder.device;
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        public static final class Builder {
            private String attachedTime; 
            private String instanceId; 
            private String device; 

            /**
             * Mount time. Follow the ISO8601](~~ 25696 ~~) Standard said, use the UTC +0 time, format for yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder attachedTime(String attachedTime) {
                this.attachedTime = attachedTime;
                return this;
            }

            /**
             * The ID of the instance to which the cloud disk or local disk is attached.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Cloud or local plate mount point.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            public MountInstance build() {
                return new MountInstance(this);
            } 

        } 

    }
    public static class MountInstances extends TeaModel {
        @NameInMap("MountInstance")
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
    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
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
             * The key of the tag.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The value of the tag.
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
        @NameInMap("Tag")
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
    public static class Attachment extends TeaModel {
        @NameInMap("AttachedTime")
        private String attachedTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Device")
        private String device;

        private Attachment(Builder builder) {
            this.attachedTime = builder.attachedTime;
            this.instanceId = builder.instanceId;
            this.device = builder.device;
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        public static final class Builder {
            private String attachedTime; 
            private String instanceId; 
            private String device; 

            /**
             * Mount time to UTC +0 time shall prevail.
             */
            public Builder attachedTime(String attachedTime) {
                this.attachedTime = attachedTime;
                return this;
            }

            /**
             * The Mount instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the device.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            public Attachment build() {
                return new Attachment(this);
            } 

        } 

    }
    public static class Attachments extends TeaModel {
        @NameInMap("Attachment")
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
    public static class Disk extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("Status")
        private String status;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("SerialNumber")
        private String serialNumber;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("EnableAutoSnapshot")
        private Boolean enableAutoSnapshot;

        @NameInMap("BdfId")
        private String bdfId;

        @NameInMap("StorageSetId")
        private String storageSetId;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("StorageSetPartitionNumber")
        private Integer storageSetPartitionNumber;

        @NameInMap("MultiAttach")
        private String multiAttach;

        @NameInMap("DeleteAutoSnapshot")
        private Boolean deleteAutoSnapshot;

        @NameInMap("Encrypted")
        private Boolean encrypted;

        @NameInMap("IOPSRead")
        private Integer IOPSRead;

        @NameInMap("MountInstanceNum")
        private Integer mountInstanceNum;

        @NameInMap("Description")
        private String description;

        @NameInMap("Device")
        private String device;

        @NameInMap("DiskName")
        private String diskName;

        @NameInMap("Portable")
        private Boolean portable;

        @NameInMap("StorageClusterId")
        private String storageClusterId;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("DeleteWithInstance")
        private Boolean deleteWithInstance;

        @NameInMap("KMSKeyId")
        private String KMSKeyId;

        @NameInMap("DetachedTime")
        private String detachedTime;

        @NameInMap("SourceSnapshotId")
        private String sourceSnapshotId;

        @NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @NameInMap("EnableAutomatedSnapshotPolicy")
        private Boolean enableAutomatedSnapshotPolicy;

        @NameInMap("IOPSWrite")
        private Integer IOPSWrite;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("IOPS")
        private Integer IOPS;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("DiskChargeType")
        private String diskChargeType;

        @NameInMap("Category")
        private String category;

        @NameInMap("AttachedTime")
        private String attachedTime;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("OperationLocks")
        private OperationLocks operationLocks;

        @NameInMap("MountInstances")
        private MountInstances mountInstances;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("Attachments")
        private Attachments attachments;

        private Disk(Builder builder) {
            this.type = builder.type;
            this.status = builder.status;
            this.creationTime = builder.creationTime;
            this.serialNumber = builder.serialNumber;
            this.performanceLevel = builder.performanceLevel;
            this.enableAutoSnapshot = builder.enableAutoSnapshot;
            this.bdfId = builder.bdfId;
            this.storageSetId = builder.storageSetId;
            this.diskId = builder.diskId;
            this.storageSetPartitionNumber = builder.storageSetPartitionNumber;
            this.multiAttach = builder.multiAttach;
            this.deleteAutoSnapshot = builder.deleteAutoSnapshot;
            this.encrypted = builder.encrypted;
            this.IOPSRead = builder.IOPSRead;
            this.mountInstanceNum = builder.mountInstanceNum;
            this.description = builder.description;
            this.device = builder.device;
            this.diskName = builder.diskName;
            this.portable = builder.portable;
            this.storageClusterId = builder.storageClusterId;
            this.imageId = builder.imageId;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.KMSKeyId = builder.KMSKeyId;
            this.detachedTime = builder.detachedTime;
            this.sourceSnapshotId = builder.sourceSnapshotId;
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
            this.enableAutomatedSnapshotPolicy = builder.enableAutomatedSnapshotPolicy;
            this.IOPSWrite = builder.IOPSWrite;
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.IOPS = builder.IOPS;
            this.expiredTime = builder.expiredTime;
            this.size = builder.size;
            this.resourceGroupId = builder.resourceGroupId;
            this.zoneId = builder.zoneId;
            this.diskChargeType = builder.diskChargeType;
            this.category = builder.category;
            this.attachedTime = builder.attachedTime;
            this.productCode = builder.productCode;
            this.operationLocks = builder.operationLocks;
            this.mountInstances = builder.mountInstances;
            this.tags = builder.tags;
            this.attachments = builder.attachments;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disk create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return enableAutoSnapshot
         */
        public Boolean getEnableAutoSnapshot() {
            return this.enableAutoSnapshot;
        }

        /**
         * @return bdfId
         */
        public String getBdfId() {
            return this.bdfId;
        }

        /**
         * @return storageSetId
         */
        public String getStorageSetId() {
            return this.storageSetId;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return storageSetPartitionNumber
         */
        public Integer getStorageSetPartitionNumber() {
            return this.storageSetPartitionNumber;
        }

        /**
         * @return multiAttach
         */
        public String getMultiAttach() {
            return this.multiAttach;
        }

        /**
         * @return deleteAutoSnapshot
         */
        public Boolean getDeleteAutoSnapshot() {
            return this.deleteAutoSnapshot;
        }

        /**
         * @return encrypted
         */
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return IOPSRead
         */
        public Integer getIOPSRead() {
            return this.IOPSRead;
        }

        /**
         * @return mountInstanceNum
         */
        public Integer getMountInstanceNum() {
            return this.mountInstanceNum;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return diskName
         */
        public String getDiskName() {
            return this.diskName;
        }

        /**
         * @return portable
         */
        public Boolean getPortable() {
            return this.portable;
        }

        /**
         * @return storageClusterId
         */
        public String getStorageClusterId() {
            return this.storageClusterId;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return deleteWithInstance
         */
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        /**
         * @return KMSKeyId
         */
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        /**
         * @return detachedTime
         */
        public String getDetachedTime() {
            return this.detachedTime;
        }

        /**
         * @return sourceSnapshotId
         */
        public String getSourceSnapshotId() {
            return this.sourceSnapshotId;
        }

        /**
         * @return autoSnapshotPolicyId
         */
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        /**
         * @return enableAutomatedSnapshotPolicy
         */
        public Boolean getEnableAutomatedSnapshotPolicy() {
            return this.enableAutomatedSnapshotPolicy;
        }

        /**
         * @return IOPSWrite
         */
        public Integer getIOPSWrite() {
            return this.IOPSWrite;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return IOPS
         */
        public Integer getIOPS() {
            return this.IOPS;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return diskChargeType
         */
        public String getDiskChargeType() {
            return this.diskChargeType;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return attachedTime
         */
        public String getAttachedTime() {
            return this.attachedTime;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return operationLocks
         */
        public OperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        /**
         * @return mountInstances
         */
        public MountInstances getMountInstances() {
            return this.mountInstances;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return attachments
         */
        public Attachments getAttachments() {
            return this.attachments;
        }

        public static final class Builder {
            private String type; 
            private String status; 
            private String creationTime; 
            private String serialNumber; 
            private String performanceLevel; 
            private Boolean enableAutoSnapshot; 
            private String bdfId; 
            private String storageSetId; 
            private String diskId; 
            private Integer storageSetPartitionNumber; 
            private String multiAttach; 
            private Boolean deleteAutoSnapshot; 
            private Boolean encrypted; 
            private Integer IOPSRead; 
            private Integer mountInstanceNum; 
            private String description; 
            private String device; 
            private String diskName; 
            private Boolean portable; 
            private String storageClusterId; 
            private String imageId; 
            private Boolean deleteWithInstance; 
            private String KMSKeyId; 
            private String detachedTime; 
            private String sourceSnapshotId; 
            private String autoSnapshotPolicyId; 
            private Boolean enableAutomatedSnapshotPolicy; 
            private Integer IOPSWrite; 
            private String instanceId; 
            private String regionId; 
            private Integer IOPS; 
            private String expiredTime; 
            private Integer size; 
            private String resourceGroupId; 
            private String zoneId; 
            private String diskChargeType; 
            private String category; 
            private String attachedTime; 
            private String productCode; 
            private OperationLocks operationLocks; 
            private MountInstances mountInstances; 
            private Tags tags; 
            private Attachments attachments; 

            /**
             * The type of the cloud disk or local disk. Possible values:
             * <p>
             * 
             * -system: system disk
             * -data: data disk
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The status of the disk. Possible values:
             * <p>
             * 
             * -In_use
             * -Available
             * -Attaching
             * -Detaching
             * -Creating
             * -ReIniting
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Cloud or local disk serial number.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * The performance level of an ESSD. Possible values:
             * <p>
             * 
             * -PL0: The maximum random read/write IOPS per disk is 10,000.
             * -PL1: The maximum random read/write IOPS per disk is 50,000.
             * -PL2: The maximum random read/write IOPS per disk is 100,000.
             * -PL3: The maximum random read/write IOPS per disk is 1 million.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * Specifies whether to enable automatic snapshot policies for disks.
             */
            public Builder enableAutoSnapshot(Boolean enableAutoSnapshot) {
                this.enableAutoSnapshot = enableAutoSnapshot;
                return this;
            }

            /**
             * This parameter is being invited for testing and is not available.
             */
            public Builder bdfId(String bdfId) {
                this.bdfId = bdfId;
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
             * The ID of the cloud disk or local disk.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * The maximum number of partitions in a bucket.
             */
            public Builder storageSetPartitionNumber(Integer storageSetPartitionNumber) {
                this.storageSetPartitionNumber = storageSetPartitionNumber;
                return this;
            }

            /**
             * Whether the multi-Mount feature is enabled for the cloud disk.
             */
            public Builder multiAttach(String multiAttach) {
                this.multiAttach = multiAttach;
                return this;
            }

            /**
             * Also delete automatic snapshot. Possible values:
             * <p>
             * 
             * -true: delete cloud on the snapshot.
             * -false: keep cloud on the snapshot.
             * 
             * Through [CreateSnapshot](~~ 25524 ~~) or console to create snapshot, not this parameters, will always be retained.
             */
            public Builder deleteAutoSnapshot(Boolean deleteAutoSnapshot) {
                this.deleteAutoSnapshot = deleteAutoSnapshot;
                return this;
            }

            /**
             * Whether for encryption cloud.
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * Per second read operation number of times, unit: Times/s.
             */
            public Builder IOPSRead(Integer IOPSRead) {
                this.IOPSRead = IOPSRead;
                return this;
            }

            /**
             * Shared Storage Mount number of instances.
             */
            public Builder mountInstanceNum(Integer mountInstanceNum) {
                this.mountInstanceNum = mountInstanceNum;
                return this;
            }

            /**
             * The description of the cloud disk or local disk.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Cloud or local plate mounted instance device name, for example,/dev/xvdb. Note:
             * <p>
             * 
             * -The parameter is only in "status" parameter value is "In_use" when with value, other state when empty.
             * 
             * -For open multiple mounting characteristics of cloud, the value is always empty. You can pass the returned "attachment" object list of, see cloud involved all mount information.
             * 
             * > This parameter will be discontinued soon. We recommend that you do not use this parameter to improve code compatibility.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * The name of the cloud disk or local disk.
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * Cloud or local plate can uninstall.
             */
            public Builder portable(Boolean portable) {
                this.portable = portable;
                return this;
            }

            /**
             * The ID of the exclusive block storage cluster to which the cloud disk belongs. If your cloud disk is in a public block storage cluster, the return value is null.
             */
            public Builder storageClusterId(String storageClusterId) {
                this.storageClusterId = storageClusterId;
                return this;
            }

            /**
             * The ID of the image used to create the ECS instance. Only the cloud disk created from the image has a value. Otherwise, it is empty. The value remains unchanged during the lifecycle of the disk.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * Whether with instance release. Possible values:
             * <p>
             * 
             * -true: release instance, this cloud with instance with release.
             * -false: release instance, this cloud reservation does not release.
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * The ID of the KMS key used by the cloud disk.
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * The last time when the disk was unmounted.
             */
            public Builder detachedTime(String detachedTime) {
                this.detachedTime = detachedTime;
                return this;
            }

            /**
             * Create cloud use snapshot ID.
             * <p>
             * 
             * If you create a cloud when not specified snapshot, the parameter value is empty. The parameter value is cloud the life cycle is always unchanged.
             * 
             * 
             */
            public Builder sourceSnapshotId(String sourceSnapshotId) {
                this.sourceSnapshotId = sourceSnapshotId;
                return this;
            }

            /**
             * The ID of the automatic snapshot policy used by the cloud disk.
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * Indicates whether the automatic snapshot policy is set for the disk.
             */
            public Builder enableAutomatedSnapshotPolicy(Boolean enableAutomatedSnapshotPolicy) {
                this.enableAutomatedSnapshotPolicy = enableAutomatedSnapshotPolicy;
                return this;
            }

            /**
             * The number of write operations per second. Unit: Times/s.
             */
            public Builder IOPSWrite(Integer IOPSWrite) {
                this.IOPSWrite = IOPSWrite;
                return this;
            }

            /**
             * The ID of the instance to which the cloud disk or local disk is attached. Note:
             * <p>
             * 
             * -The parameter value is only in "status" parameter value is "In_use" when with value, other state when empty.
             * 
             * -For open multiple mounting characteristics of cloud, the value is always empty. You can pass the returned "attachment" object list of, see cloud involved all mount information.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Cloud or local plate belongs geo ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The number of read/write (I/O) operations per second. Unit: Times/s.
             */
            public Builder IOPS(Integer IOPS) {
                this.IOPS = IOPS;
                return this;
            }

            /**
             * Annual commitment monthly cloud the Expiration Time.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The size of the cloud disk or local disk. Unit: GiB.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The ID of the enterprise resource group to which the cloud disk or local disk belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Cloud or local plate belongs available area ID.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The billing method of the cloud disk or local disk. Possible values:
             * <p>
             * 
             * -PrePaid: Subscription
             * -PostPaid: pay-as-you-go
             */
            public Builder diskChargeType(String diskChargeType) {
                this.diskChargeType = diskChargeType;
                return this;
            }

            /**
             * The type of the cloud disk or local disk. Possible values:
             * <p>
             * 
             * -cloud: basic cloud disk
             * -cloud_efficiency: Ultra disk
             * -cloud_ssd:SSD
             * -cloud_essd:ESSD
             * -local_ssd_pro:I/O-intensive local disks
             * -local_hdd_pro: Throughput-intensive local disks
             * -ephemeral:(discontinued) local disk
             * -ephemeral_ssd:(phased out) local SSD
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The cloud last mounted time. In accordance with ISO8601 Standard said, use the UTC +0 time. The format is yyyy-MM-ddThh:mmZ.
             */
            public Builder attachedTime(String attachedTime) {
                this.attachedTime = attachedTime;
                return this;
            }

            /**
             * The product ID of the Alibaba Cloud marketplace.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * Cloud or local plate lock reason type.
             */
            public Builder operationLocks(OperationLocks operationLocks) {
                this.operationLocks = operationLocks;
                return this;
            }

            /**
             * Shared Storage to mount on the instance of information collection.
             */
            public Builder mountInstances(MountInstances mountInstances) {
                this.mountInstances = mountInstances;
                return this;
            }

            /**
             * Cloud or local disk label collection.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The Mount information of the cloud disk. The list consisting of "Attachment" objects. This list is not returned when you query shared block storage.
             */
            public Builder attachments(Attachments attachments) {
                this.attachments = attachments;
                return this;
            }

            public Disk build() {
                return new Disk(this);
            } 

        } 

    }
    public static class Disks extends TeaModel {
        @NameInMap("Disk")
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
