// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCDisksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCDisksResponseBody</p>
 */
public class DescribeRCDisksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Disks")
    private java.util.List<Disks> disks;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeRCDisksResponseBody(Builder builder) {
        this.disks = builder.disks;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCDisksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return disks
     */
    public java.util.List<Disks> getDisks() {
        return this.disks;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Disks> disks; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeRCDisksResponseBody model) {
            this.disks = model.disks;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the disks.</p>
         */
        public Builder disks(java.util.List<Disks> disks) {
            this.disks = disks;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8B993DA9-5272-5414-94E3-4CA8BA0146C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRCDisksResponseBody build() {
            return new DescribeRCDisksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRCDisksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCDisksResponseBody</p>
     */
    public static class Disks extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("DiskChargeType")
        private String diskChargeType;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("DiskName")
        private String diskName;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private Boolean encrypted;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("IOPS")
        private Long IOPS;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("SourceSnapshotId")
        private String sourceSnapshotId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageClusterId")
        private String storageClusterId;

        @com.aliyun.core.annotation.NameInMap("StorageSetId")
        private String storageSetId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Disks(Builder builder) {
            this.category = builder.category;
            this.creationTime = builder.creationTime;
            this.deleteAutoSnapshot = builder.deleteAutoSnapshot;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.description = builder.description;
            this.device = builder.device;
            this.diskChargeType = builder.diskChargeType;
            this.diskId = builder.diskId;
            this.diskName = builder.diskName;
            this.encrypted = builder.encrypted;
            this.expiredTime = builder.expiredTime;
            this.IOPS = builder.IOPS;
            this.imageId = builder.imageId;
            this.instanceId = builder.instanceId;
            this.performanceLevel = builder.performanceLevel;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.serialNumber = builder.serialNumber;
            this.size = builder.size;
            this.sourceSnapshotId = builder.sourceSnapshotId;
            this.status = builder.status;
            this.storageClusterId = builder.storageClusterId;
            this.storageSetId = builder.storageSetId;
            this.type = builder.type;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disks create() {
            return builder().build();
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
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
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
        public Long getSize() {
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
            private String category; 
            private String creationTime; 
            private Boolean deleteAutoSnapshot; 
            private Boolean deleteWithInstance; 
            private String description; 
            private String device; 
            private String diskChargeType; 
            private String diskId; 
            private String diskName; 
            private Boolean encrypted; 
            private String expiredTime; 
            private Long IOPS; 
            private String imageId; 
            private String instanceId; 
            private String performanceLevel; 
            private String regionId; 
            private String resourceGroupId; 
            private String serialNumber; 
            private Long size; 
            private String sourceSnapshotId; 
            private String status; 
            private String storageClusterId; 
            private String storageSetId; 
            private String type; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Disks model) {
                this.category = model.category;
                this.creationTime = model.creationTime;
                this.deleteAutoSnapshot = model.deleteAutoSnapshot;
                this.deleteWithInstance = model.deleteWithInstance;
                this.description = model.description;
                this.device = model.device;
                this.diskChargeType = model.diskChargeType;
                this.diskId = model.diskId;
                this.diskName = model.diskName;
                this.encrypted = model.encrypted;
                this.expiredTime = model.expiredTime;
                this.IOPS = model.IOPS;
                this.imageId = model.imageId;
                this.instanceId = model.instanceId;
                this.performanceLevel = model.performanceLevel;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.serialNumber = model.serialNumber;
                this.size = model.size;
                this.sourceSnapshotId = model.sourceSnapshotId;
                this.status = model.status;
                this.storageClusterId = model.storageClusterId;
                this.storageSetId = model.storageSetId;
                this.type = model.type;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The category of the disk. Valid values:</p>
             * <ul>
             * <li><strong>cloud_efficiency</strong>: ultra disk</li>
             * <li><strong>cloud_ssd</strong>: standard SSD</li>
             * <li><strong>cloud_essd</strong>: ESSD</li>
             * <li><strong>cloud_auto</strong>: Premium ESSD</li>
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
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-22T02:41:37Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Indicates whether the automatic snapshots of the cloud disk are deleted after the disk is released. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deleteAutoSnapshot(Boolean deleteAutoSnapshot) {
                this.deleteAutoSnapshot = deleteAutoSnapshot;
                return this;
            }

            /**
             * <p>Indicates whether the cloud disk is released when its associated instance is released. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
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
             * <p>The disk description.</p>
             * 
             * <strong>example:</strong>
             * <p>zd_test</p>
             */
            public Builder description(String description) {
                this.description = description;
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
             * <p>The billing method of the disk.</p>
             * <p>Only <strong>PostPaid</strong> (pay-as-you-go) is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder diskChargeType(String diskChargeType) {
                this.diskChargeType = diskChargeType;
                return this;
            }

            /**
             * <p>The disk ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rcd-wz9f3peueu5npsl****</p>
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * <p>The disk name.</p>
             * 
             * <strong>example:</strong>
             * <p>fvt-ecs-bcfb3627</p>
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * <p>Indicates whether only encrypted cloud disks are queried. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false (default)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>A reserved parameter. You do not need to specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1,000 × *Capacity - Baseline performance}. Baseline performance = min{1,800 + 50 × *Capacity, 50,000}</p>
             * <p>This parameter is available only when the <code>Category</code> parameter is set to <code>cloud_auto</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>4000</p>
             */
            public Builder IOPS(Long IOPS) {
                this.IOPS = IOPS;
                return this;
            }

            /**
             * <p>The ID of the image that is used to create the instance. This parameter is returned only if the cloud disk is created from an image. The value of this parameter remains unchanged throughout the lifecycle of the cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>m-2zeb24dw6wripjn2****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rc-e8w1cn7634kiam****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The performance level (PL) of the ESSD. Valid values:</p>
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
             * <p>The region ID.</p>
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
             * <p>rg-aekzescnje5khnq</p>
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
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The ID of the snapshot that was used to create the cloud disk.</p>
             * <p>This parameter is empty unless the cloud disk was created from a snapshot. The value of this parameter remains unchanged throughout the lifecycle of the cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>rcds-bp67acfmxazb4p****</p>
             */
            public Builder sourceSnapshotId(String sourceSnapshotId) {
                this.sourceSnapshotId = sourceSnapshotId;
                return this;
            }

            /**
             * <p>The status of the disk. Valid values:</p>
             * <ul>
             * <li>In_use: The disk is in use.</li>
             * <li>Available: The disk can be attached.</li>
             * <li>Attaching: The disk is being attached.</li>
             * <li>Detaching: The cloud disk is being detached.</li>
             * <li>Creating: The disk is being created.</li>
             * <li>ReIniting: The disk is being initialized.</li>
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
             * <p>dbsc-cn-zvp2rl601****</p>
             */
            public Builder storageClusterId(String storageClusterId) {
                this.storageClusterId = storageClusterId;
                return this;
            }

            /**
             * <p>The storage set ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ss-i-bp1j4i2jdf3owlhe****</p>
             */
            public Builder storageSetId(String storageSetId) {
                this.storageSetId = storageSetId;
                return this;
            }

            /**
             * <p>The disk type. Valid values:</p>
             * <ul>
             * <li>system: system disk</li>
             * <li>data: data disk</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>data</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-j</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Disks build() {
                return new Disks(this);
            } 

        } 

    }
}
