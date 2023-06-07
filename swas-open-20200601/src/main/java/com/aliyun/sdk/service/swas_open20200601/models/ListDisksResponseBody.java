// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDisksResponseBody} extends {@link TeaModel}
 *
 * <p>ListDisksResponseBody</p>
 */
public class ListDisksResponseBody extends TeaModel {
    @NameInMap("Disks")
    private java.util.List < Disks> disks;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * Details about the disks.
         */
        public Builder disks(java.util.List < Disks> disks) {
            this.disks = disks;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
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
         * The total number of disks.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDisksResponseBody build() {
            return new ListDisksResponseBody(this);
        } 

    } 

    public static class Disks extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Device")
        private String device;

        @NameInMap("DiskChargeType")
        private String diskChargeType;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("DiskName")
        private String diskName;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("Status")
        private String status;

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
            this.size = builder.size;
            this.status = builder.status;
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
            private Integer size; 
            private String status; 

            /**
             * The category of the disk. Valid values: Valid values:
             * <p>
             * 
             * *   ESSD: enhanced SSD (ESSD) at performance level 0 (PL0)
             * *   SSD: standard SSD
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
             * The device name of the disk on the simple application server.
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
             * The type of the disk. Valid values:
             * <p>
             * 
             * *   System: system disk
             * *   Data: data disk
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
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The region ID of the server.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
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
             * *   In_Use: The disk is being used.
             * *   Available: The disk can be attached.
             * *   Attaching: The disk is being attached.
             * *   Detaching: The disk is being detached.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Disks build() {
                return new Disks(this);
            } 

        } 

    }
}
