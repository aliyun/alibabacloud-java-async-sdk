// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The details about the disks.</p>
         */
        public Builder disks(Disks disks) {
            this.disks = disks;
            return this;
        }

        /**
         * <p>The returned pagination token which can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDisksResponseBody build() {
            return new DescribeDisksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDisksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisksResponseBody</p>
     */
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
             * <p>The time when the disk was attached. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-07T06:08:56Z</p>
             */
            public Builder attachedTime(String attachedTime) {
                this.attachedTime = attachedTime;
                return this;
            }

            /**
             * <p>The device name of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>/dev/xvda</p>
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>The ID of the instance to which the disk is attached.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp67acfmxazb4q****</p>
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
    /**
     * 
     * {@link DescribeDisksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisksResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeDisksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisksResponseBody</p>
     */
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
             * <p>The time when the disk was attached. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-05T2340:00Z</p>
             */
            public Builder attachedTime(String attachedTime) {
                this.attachedTime = attachedTime;
                return this;
            }

            /**
             * <p>The mount point of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>/dev/xvda</p>
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>The ID of the instance to which the disk is attached.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1j4i2jdf3owlhe****</p>
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
    /**
     * 
     * {@link DescribeDisksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisksResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeDisksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisksResponseBody</p>
     */
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
             * <p>The reason why the disk was locked.</p>
             * 
             * <strong>example:</strong>
             * <p>security</p>
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
    /**
     * 
     * {@link DescribeDisksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisksResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeDisksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisksResponseBody</p>
     */
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
             * <p>The IDs of the zones in which data is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b
             * cn-hangzhou-j</p>
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
    /**
     * 
     * {@link DescribeDisksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisksResponseBody</p>
     */
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
             * <p>The tag key of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
    /**
     * 
     * {@link DescribeDisksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisksResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeDisksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisksResponseBody</p>
     */
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
             * <p>The time when the disk was last attached. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mmZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-07T06:08:56Z</p>
             */
            public Builder attachedTime(String attachedTime) {
                this.attachedTime = attachedTime;
                return this;
            }

            /**
             * <p>The attachment information of the disk. The value is an array that consists of the <code>Attachment</code> values. This value is not returned when you query Shared Block Storage devices.</p>
             */
            public Builder attachments(Attachments attachments) {
                this.attachments = attachments;
                return this;
            }

            /**
             * <p>The ID of the automatic snapshot policy that is applied to the cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-bp67acfmxazb4p****</p>
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * <p>This parameter is in invitational preview and is not publicly available.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder bdfId(String bdfId) {
                this.bdfId = bdfId;
                return this;
            }

            /**
             * <p>Indicates whether the performance burst feature is enabled. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <p>This parameter is available only if you set <code>Category</code> to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * <p>The category of the disk. Valid values:</p>
             * <ul>
             * <li>cloud: basic disk</li>
             * <li>cloud_efficiency: ultra disk</li>
             * <li>cloud_ssd: standard SSD</li>
             * <li>cloud_essd: ESSD</li>
             * <li>cloud_auto: ESSD AutoPL disk</li>
             * <li>local_ssd_pro: I/O-intensive local disk</li>
             * <li>local_hdd_pro: throughput-intensive local disk</li>
             * <li>cloud_essd_entry: ESSD Entry disk</li>
             * <li>elastic_ephemeral_disk_standard: standard elastic ephemeral disk</li>
             * <li>elastic_ephemeral_disk_premium: premium static ephemeral disk</li>
             * <li>ephemeral: retired local disk</li>
             * <li>ephemeral_ssd: retired local SSD</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The time when the disk was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-07T06:08:54Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Indicates whether the automatic snapshots of the cloud disk are deleted when the cloud disk is released. Valid values:</p>
             * <ul>
             * <li>true: The automatic snapshots of the cloud disk are deleted when the disk is released.</li>
             * <li>false: The automatic snapshots of the cloud disk are retained when the disk is released.</li>
             * </ul>
             * <p>Snapshots that were created in the ECS console or by calling the <a href="https://help.aliyun.com/document_detail/25524.html">CreateSnapshot</a> operation are retained and not affected by this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder deleteAutoSnapshot(Boolean deleteAutoSnapshot) {
                this.deleteAutoSnapshot = deleteAutoSnapshot;
                return this;
            }

            /**
             * <p>Indicates whether the disk is released when the instance to which the disk is attached is released. Valid values:</p>
             * <ul>
             * <li>true: The disk is released when the associated instance is released.</li>
             * <li>false: The disk is retained when the associated instance is released.</li>
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
             * <p>The description of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>testDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the disk was last detached.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-07T21:01:22Z</p>
             */
            public Builder detachedTime(String detachedTime) {
                this.detachedTime = detachedTime;
                return this;
            }

            /**
             * <p>The device name of the disk on the instance to which the disk is attached. Example: /dev/xvdb. Take note of the following items:</p>
             * <ul>
             * <li>This parameter has a value only when the <code>Status</code> value is <code>In_use</code> or <code>Detaching</code>.</li>
             * <li>This parameter is empty for cloud disks for which the multi-attach feature is enabled. You can query the attachment information of the cloud disk based on the returned list of <code>Attachment</code> objects.</li>
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
             * <p>The billing method of the disk. Valid values:</p>
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
             * <p>The ID of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>d-bp18um4r4f2fve24****</p>
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * <p>The name of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>testDiskName</p>
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * <p>Indicates whether the automatic snapshot policy feature is enabled for the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableAutoSnapshot(Boolean enableAutoSnapshot) {
                this.enableAutoSnapshot = enableAutoSnapshot;
                return this;
            }

            /**
             * <p>Indicates whether an automatic snapshot policy is applied to the cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableAutomatedSnapshotPolicy(Boolean enableAutomatedSnapshotPolicy) {
                this.enableAutomatedSnapshotPolicy = enableAutomatedSnapshotPolicy;
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
             * <p>The time when the subscription disk expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-07T16:00Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The maximum number of read and write operations per second.</p>
             * 
             * <strong>example:</strong>
             * <p>4000</p>
             */
            public Builder IOPS(Integer IOPS) {
                this.IOPS = IOPS;
                return this;
            }

            /**
             * <p>The maximum number of read operations per second.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder IOPSRead(Integer IOPSRead) {
                this.IOPSRead = IOPSRead;
                return this;
            }

            /**
             * <p>The maximum number of write operations per second.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder IOPSWrite(Integer IOPSWrite) {
                this.IOPSWrite = IOPSWrite;
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
             * <p>The ID of the instance to which the disk is attached. Take note of the following items:</p>
             * <ul>
             * <li>This parameter has a value only when the <code>Status</code> value is <code>In_use</code> or <code>Detaching</code>.</li>
             * <li>This parameter is empty for cloud disks for which the multi-attach feature is enabled. You can query the attachment information of the cloud disk based on the returned <code>Attachment</code> objects.</li>
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
             * <p>The ID of the KMS key that is used for the cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>0e478b7a-4262-4802-b8cb-00d3fb408***</p>
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
             * <p>The attachment information of the Shared Block Storage device.</p>
             */
            public Builder mountInstances(MountInstances mountInstances) {
                this.mountInstances = mountInstances;
                return this;
            }

            /**
             * <p>Indicates whether the multi-attach feature is enabled for the cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>Disabled</p>
             */
            public Builder multiAttach(String multiAttach) {
                this.multiAttach = multiAttach;
                return this;
            }

            /**
             * <p>The reasons why the disk was locked.</p>
             */
            public Builder operationLocks(OperationLocks operationLocks) {
                this.operationLocks = operationLocks;
                return this;
            }

            /**
             * <p>The performance level of the ESSD. Valid values:</p>
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
             * <p>The locations in which data is stored.</p>
             * <p>This parameter is returned only if you specify <code>Placement</code> in the AdditionalAttributes.N request parameter.</p>
             * <blockquote>
             * <p> This parameter is valid only for Regional ESSDs (cloud_regional_disk_auto).</p>
             * </blockquote>
             */
            public Builder placement(Placement placement) {
                this.placement = placement;
                return this;
            }

            /**
             * <p>Indicates whether the disk is removable.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder portable(Boolean portable) {
                this.portable = portable;
                return this;
            }

            /**
             * <p>The product code of the disk in Alibaba Cloud Marketplace.</p>
             * 
             * <strong>example:</strong>
             * <p>jxsc000204</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1,000 × *Capacity - Baseline IOPS}. Baseline IOPS = min{1,800 + 50 × *Capacity, 50,000}</p>
             * <p>This parameter is available only if you set <code>Category</code> to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>40000</p>
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * <p>The ID of the region to which the disk belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
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
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The serial number of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>bp18um4r4f2fve2****</p>
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
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
             * <p>The status of the disk. Valid values:</p>
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
             * <p>The tags of the disk.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The amount of data that can be transferred per second. Unit: MB/s.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder throughput(Integer throughput) {
                this.throughput = throughput;
                return this;
            }

            /**
             * <p>The amount of data that can be read per second. Unit: MB/s.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder throughputRead(Integer throughputRead) {
                this.throughputRead = throughputRead;
                return this;
            }

            /**
             * <p>The amount of data that can be written per second. Unit: MB/s.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder throughputWrite(Integer throughputWrite) {
                this.throughputWrite = throughputWrite;
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
             * <p>system</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The ID of the zone to which the disk belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
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
     * {@link DescribeDisksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisksResponseBody</p>
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
