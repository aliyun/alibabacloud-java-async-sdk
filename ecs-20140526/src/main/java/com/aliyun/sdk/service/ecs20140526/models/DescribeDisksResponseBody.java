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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDisksResponseBody model) {
            this.disks = model.disks;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Disks.
         */
        public Builder disks(Disks disks) {
            this.disks = disks;
            return this;
        }

        /**
         * <p>The pagination token returned in this call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter will be offline soon. Use NextToken and MaxResults for paging operations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter will be offline soon. Use NextToken and MaxResults for paging operations.</p>
         * </blockquote>
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
         * <blockquote>
         * <p>When you use the MaxResults and NextToken parameters for paging, the returned TotalCount value is invalid.</p>
         * </blockquote>
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

            private Builder() {
            } 

            private Builder(Attachment model) {
                this.attachedTime = model.attachedTime;
                this.device = model.device;
                this.instanceId = model.instanceId;
            } 

            /**
             * AttachedTime.
             */
            public Builder attachedTime(String attachedTime) {
                this.attachedTime = attachedTime;
                return this;
            }

            /**
             * Device.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * InstanceId.
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
        private java.util.List<Attachment> attachment;

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
        public java.util.List<Attachment> getAttachment() {
            return this.attachment;
        }

        public static final class Builder {
            private java.util.List<Attachment> attachment; 

            private Builder() {
            } 

            private Builder(Attachments model) {
                this.attachment = model.attachment;
            } 

            /**
             * Attachment.
             */
            public Builder attachment(java.util.List<Attachment> attachment) {
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
    public static class DataSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DataSource(Builder builder) {
            this.id = builder.id;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSource create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String type; 

            private Builder() {
            } 

            private Builder(DataSource model) {
                this.id = model.id;
                this.type = model.type;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataSource build() {
                return new DataSource(this);
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

            private Builder() {
            } 

            private Builder(MountInstance model) {
                this.attachedTime = model.attachedTime;
                this.device = model.device;
                this.instanceId = model.instanceId;
            } 

            /**
             * AttachedTime.
             */
            public Builder attachedTime(String attachedTime) {
                this.attachedTime = attachedTime;
                return this;
            }

            /**
             * Device.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * InstanceId.
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
        private java.util.List<MountInstance> mountInstance;

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
        public java.util.List<MountInstance> getMountInstance() {
            return this.mountInstance;
        }

        public static final class Builder {
            private java.util.List<MountInstance> mountInstance; 

            private Builder() {
            } 

            private Builder(MountInstances model) {
                this.mountInstance = model.mountInstance;
            } 

            /**
             * MountInstance.
             */
            public Builder mountInstance(java.util.List<MountInstance> mountInstance) {
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

            private Builder() {
            } 

            private Builder(OperationLock model) {
                this.lockReason = model.lockReason;
            } 

            /**
             * LockReason.
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
        private java.util.List<OperationLock> operationLock;

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
        public java.util.List<OperationLock> getOperationLock() {
            return this.operationLock;
        }

        public static final class Builder {
            private java.util.List<OperationLock> operationLock; 

            private Builder() {
            } 

            private Builder(OperationLocks model) {
                this.operationLock = model.operationLock;
            } 

            /**
             * OperationLock.
             */
            public Builder operationLock(java.util.List<OperationLock> operationLock) {
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

            private Builder() {
            } 

            private Builder(Placement model) {
                this.zoneIds = model.zoneIds;
            } 

            /**
             * ZoneIds.
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
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
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
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

        @com.aliyun.core.annotation.NameInMap("DataSource")
        private DataSource dataSource;

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

        @com.aliyun.core.annotation.NameInMap("SourceDiskId")
        private String sourceDiskId;

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
            this.dataSource = builder.dataSource;
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
            this.sourceDiskId = builder.sourceDiskId;
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
         * @return dataSource
         */
        public DataSource getDataSource() {
            return this.dataSource;
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
         * @return sourceDiskId
         */
        public String getSourceDiskId() {
            return this.sourceDiskId;
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
            private DataSource dataSource; 
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
            private String sourceDiskId; 
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

            private Builder() {
            } 

            private Builder(Disk model) {
                this.attachedTime = model.attachedTime;
                this.attachments = model.attachments;
                this.autoSnapshotPolicyId = model.autoSnapshotPolicyId;
                this.bdfId = model.bdfId;
                this.burstingEnabled = model.burstingEnabled;
                this.category = model.category;
                this.creationTime = model.creationTime;
                this.dataSource = model.dataSource;
                this.deleteAutoSnapshot = model.deleteAutoSnapshot;
                this.deleteWithInstance = model.deleteWithInstance;
                this.description = model.description;
                this.detachedTime = model.detachedTime;
                this.device = model.device;
                this.diskChargeType = model.diskChargeType;
                this.diskId = model.diskId;
                this.diskName = model.diskName;
                this.enableAutoSnapshot = model.enableAutoSnapshot;
                this.enableAutomatedSnapshotPolicy = model.enableAutomatedSnapshotPolicy;
                this.encrypted = model.encrypted;
                this.expiredTime = model.expiredTime;
                this.IOPS = model.IOPS;
                this.IOPSRead = model.IOPSRead;
                this.IOPSWrite = model.IOPSWrite;
                this.imageId = model.imageId;
                this.instanceId = model.instanceId;
                this.KMSKeyId = model.KMSKeyId;
                this.mountInstanceNum = model.mountInstanceNum;
                this.mountInstances = model.mountInstances;
                this.multiAttach = model.multiAttach;
                this.operationLocks = model.operationLocks;
                this.performanceLevel = model.performanceLevel;
                this.placement = model.placement;
                this.portable = model.portable;
                this.productCode = model.productCode;
                this.provisionedIops = model.provisionedIops;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.serialNumber = model.serialNumber;
                this.size = model.size;
                this.sourceDiskId = model.sourceDiskId;
                this.sourceSnapshotId = model.sourceSnapshotId;
                this.status = model.status;
                this.storageClusterId = model.storageClusterId;
                this.storageSetId = model.storageSetId;
                this.storageSetPartitionNumber = model.storageSetPartitionNumber;
                this.tags = model.tags;
                this.throughput = model.throughput;
                this.throughputRead = model.throughputRead;
                this.throughputWrite = model.throughputWrite;
                this.type = model.type;
                this.zoneId = model.zoneId;
            } 

            /**
             * AttachedTime.
             */
            public Builder attachedTime(String attachedTime) {
                this.attachedTime = attachedTime;
                return this;
            }

            /**
             * Attachments.
             */
            public Builder attachments(Attachments attachments) {
                this.attachments = attachments;
                return this;
            }

            /**
             * AutoSnapshotPolicyId.
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * BdfId.
             */
            public Builder bdfId(String bdfId) {
                this.bdfId = bdfId;
                return this;
            }

            /**
             * BurstingEnabled.
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DataSource.
             */
            public Builder dataSource(DataSource dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * DeleteAutoSnapshot.
             */
            public Builder deleteAutoSnapshot(Boolean deleteAutoSnapshot) {
                this.deleteAutoSnapshot = deleteAutoSnapshot;
                return this;
            }

            /**
             * DeleteWithInstance.
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DetachedTime.
             */
            public Builder detachedTime(String detachedTime) {
                this.detachedTime = detachedTime;
                return this;
            }

            /**
             * Device.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * DiskChargeType.
             */
            public Builder diskChargeType(String diskChargeType) {
                this.diskChargeType = diskChargeType;
                return this;
            }

            /**
             * DiskId.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * DiskName.
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * EnableAutoSnapshot.
             */
            public Builder enableAutoSnapshot(Boolean enableAutoSnapshot) {
                this.enableAutoSnapshot = enableAutoSnapshot;
                return this;
            }

            /**
             * EnableAutomatedSnapshotPolicy.
             */
            public Builder enableAutomatedSnapshotPolicy(Boolean enableAutomatedSnapshotPolicy) {
                this.enableAutomatedSnapshotPolicy = enableAutomatedSnapshotPolicy;
                return this;
            }

            /**
             * Encrypted.
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * IOPS.
             */
            public Builder IOPS(Integer IOPS) {
                this.IOPS = IOPS;
                return this;
            }

            /**
             * IOPSRead.
             */
            public Builder IOPSRead(Integer IOPSRead) {
                this.IOPSRead = IOPSRead;
                return this;
            }

            /**
             * IOPSWrite.
             */
            public Builder IOPSWrite(Integer IOPSWrite) {
                this.IOPSWrite = IOPSWrite;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * KMSKeyId.
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * MountInstanceNum.
             */
            public Builder mountInstanceNum(Integer mountInstanceNum) {
                this.mountInstanceNum = mountInstanceNum;
                return this;
            }

            /**
             * MountInstances.
             */
            public Builder mountInstances(MountInstances mountInstances) {
                this.mountInstances = mountInstances;
                return this;
            }

            /**
             * MultiAttach.
             */
            public Builder multiAttach(String multiAttach) {
                this.multiAttach = multiAttach;
                return this;
            }

            /**
             * OperationLocks.
             */
            public Builder operationLocks(OperationLocks operationLocks) {
                this.operationLocks = operationLocks;
                return this;
            }

            /**
             * PerformanceLevel.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * Placement.
             */
            public Builder placement(Placement placement) {
                this.placement = placement;
                return this;
            }

            /**
             * Portable.
             */
            public Builder portable(Boolean portable) {
                this.portable = portable;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * ProvisionedIops.
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * SourceDiskId.
             */
            public Builder sourceDiskId(String sourceDiskId) {
                this.sourceDiskId = sourceDiskId;
                return this;
            }

            /**
             * SourceSnapshotId.
             */
            public Builder sourceSnapshotId(String sourceSnapshotId) {
                this.sourceSnapshotId = sourceSnapshotId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StorageClusterId.
             */
            public Builder storageClusterId(String storageClusterId) {
                this.storageClusterId = storageClusterId;
                return this;
            }

            /**
             * StorageSetId.
             */
            public Builder storageSetId(String storageSetId) {
                this.storageSetId = storageSetId;
                return this;
            }

            /**
             * StorageSetPartitionNumber.
             */
            public Builder storageSetPartitionNumber(Integer storageSetPartitionNumber) {
                this.storageSetPartitionNumber = storageSetPartitionNumber;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Throughput.
             */
            public Builder throughput(Integer throughput) {
                this.throughput = throughput;
                return this;
            }

            /**
             * ThroughputRead.
             */
            public Builder throughputRead(Integer throughputRead) {
                this.throughputRead = throughputRead;
                return this;
            }

            /**
             * ThroughputWrite.
             */
            public Builder throughputWrite(Integer throughputWrite) {
                this.throughputWrite = throughputWrite;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * ZoneId.
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
        private java.util.List<Disk> disk;

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
        public java.util.List<Disk> getDisk() {
            return this.disk;
        }

        public static final class Builder {
            private java.util.List<Disk> disk; 

            private Builder() {
            } 

            private Builder(Disks model) {
                this.disk = model.disk;
            } 

            /**
             * Disk.
             */
            public Builder disk(java.util.List<Disk> disk) {
                this.disk = disk;
                return this;
            }

            public Disks build() {
                return new Disks(this);
            } 

        } 

    }
}
