// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStorageSetDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStorageSetDetailsResponseBody</p>
 */
public class DescribeStorageSetDetailsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Disks")
    private Disks disks;

    private DescribeStorageSetDetailsResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.disks = builder.disks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStorageSetDetailsResponseBody create() {
        return builder().build();
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
        private Integer pageSize; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private Disks disks; 

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The number of pages in the bucket list.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of buckets.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * A Disk array that returns the details of cloud disks or shared block storage in a storage set.
         */
        public Builder disks(Disks disks) {
            this.disks = disks;
            return this;
        }

        public DescribeStorageSetDetailsResponseBody build() {
            return new DescribeStorageSetDetailsResponseBody(this);
        } 

    } 

    public static class Disk extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DiskName")
        private String diskName;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("StorageSetId")
        private String storageSetId;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("Category")
        private String category;

        @NameInMap("StorageSetPartitionNumber")
        private Integer storageSetPartitionNumber;

        @NameInMap("RegionId")
        private String regionId;

        private Disk(Builder builder) {
            this.creationTime = builder.creationTime;
            this.diskName = builder.diskName;
            this.zoneId = builder.zoneId;
            this.storageSetId = builder.storageSetId;
            this.diskId = builder.diskId;
            this.category = builder.category;
            this.storageSetPartitionNumber = builder.storageSetPartitionNumber;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disk create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return diskName
         */
        public String getDiskName() {
            return this.diskName;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
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
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return storageSetPartitionNumber
         */
        public Integer getStorageSetPartitionNumber() {
            return this.storageSetPartitionNumber;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String creationTime; 
            private String diskName; 
            private String zoneId; 
            private String storageSetId; 
            private String diskId; 
            private String category; 
            private Integer storageSetPartitionNumber; 
            private String regionId; 

            /**
             * The time when the disk or shared block storage was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The name of the cloud disk or shared block storage.
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * The zone to which the cloud disk or shared block storage belongs.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
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
             * The ID of the cloud disk or shared block storage.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * The type of cloud disk or shared block storage.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The number of partitions in the storage set.
             */
            public Builder storageSetPartitionNumber(Integer storageSetPartitionNumber) {
                this.storageSetPartitionNumber = storageSetPartitionNumber;
                return this;
            }

            /**
             * The region to which the cloud disk or shared block storage belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
