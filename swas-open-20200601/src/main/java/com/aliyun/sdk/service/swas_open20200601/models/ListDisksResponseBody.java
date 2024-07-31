// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDisksResponseBody} extends {@link TeaModel}
 *
 * <p>ListDisksResponseBody</p>
 */
public class ListDisksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Disks")
    private java.util.List < Disks> disks;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListDisksResponseBody(Builder builder) {
        this.disks = builder.disks;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDisksResponseBody create() {
        return builder().build();
    }

    /**
     * @return disks
     */
    public java.util.List < Disks> getDisks() {
        return this.disks;
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
        private java.util.List < Disks> disks; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The queried disks.
         */
        public Builder disks(java.util.List < Disks> disks) {
            this.disks = disks;
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

        public ListDisksResponseBody build() {
            return new ListDisksResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Disks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("DiskChargeType")
        private String diskChargeType;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("DiskName")
        private String diskName;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        private Disks(Builder builder) {
            this.category = builder.category;
            this.creationTime = builder.creationTime;
            this.device = builder.device;
            this.diskChargeType = builder.diskChargeType;
            this.diskId = builder.diskId;
            this.diskName = builder.diskName;
            this.diskType = builder.diskType;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.regionId = builder.regionId;
            this.remark = builder.remark;
            this.resourceGroupId = builder.resourceGroupId;
            this.size = builder.size;
            this.status = builder.status;
            this.tags = builder.tags;
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
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String category; 
            private String creationTime; 
            private String device; 
            private String diskChargeType; 
            private String diskId; 
            private String diskName; 
            private String diskType; 
            private String instanceId; 
            private String instanceName; 
            private String regionId; 
            private String remark; 
            private String resourceGroupId; 
            private Integer size; 
            private String status; 
            private java.util.List < Tags> tags; 

            /**
             * The category of the disk. Valid values:
             * <p>
             * 
             * *   ESSD: enhanced SSD (ESSD) of PL0
             * *   SSD: standard SSD
             * *   CLOUD_EFFICIENCY: ultra disk
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The time when the disk was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The device name of the disk after the disk is attached to the simple application server.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * The billing method of the disk.
             */
            public Builder diskChargeType(String diskChargeType) {
                this.diskChargeType = diskChargeType;
                return this;
            }

            /**
             * The disk ID.
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
             * The disk type. Valid values:
             * <p>
             * 
             * *   system: system disk
             * *   data: data disk
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * The ID of the simple application server to which the disk is attached.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the simple application server.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The remarks of the disk.
             */
            public Builder remark(String remark) {
                this.remark = remark;
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
             * The size of the disk. Unit: GB.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The status of the disk. Valid values:
             * <p>
             * 
             * *   ReIniting: The disk is being initialized.
             * *   Creating: The disk is being created.
             * *   In_use: The disk is in use.
             * *   Available: The disk can be attached.
             * *   Attaching: The disk is being attached.
             * *   Detaching: The disk is being detached.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tags that are added to the disks.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Disks build() {
                return new Disks(this);
            } 

        } 

    }
}
