// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStorageSetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStorageSetsResponseBody</p>
 */
public class DescribeStorageSetsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("StorageSets")
    private StorageSets storageSets;

    private DescribeStorageSetsResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.storageSets = builder.storageSets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStorageSetsResponseBody create() {
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
     * @return storageSets
     */
    public StorageSets getStorageSets() {
        return this.storageSets;
    }

    public static final class Builder {
        private Integer pageSize; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private StorageSets storageSets; 

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
         * The page number of the bucket list.
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
         * By StorageSet array of format, returns Storage Set details.
         */
        public Builder storageSets(StorageSets storageSets) {
            this.storageSets = storageSets;
            return this;
        }

        public DescribeStorageSetsResponseBody build() {
            return new DescribeStorageSetsResponseBody(this);
        } 

    } 

    public static class StorageSet extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("StorageSetId")
        private String storageSetId;

        @NameInMap("StorageSetPartitionNumber")
        private Integer storageSetPartitionNumber;

        @NameInMap("StorageSetName")
        private String storageSetName;

        @NameInMap("RegionId")
        private String regionId;

        private StorageSet(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.zoneId = builder.zoneId;
            this.storageSetId = builder.storageSetId;
            this.storageSetPartitionNumber = builder.storageSetPartitionNumber;
            this.storageSetName = builder.storageSetName;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageSet create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return storageSetPartitionNumber
         */
        public Integer getStorageSetPartitionNumber() {
            return this.storageSetPartitionNumber;
        }

        /**
         * @return storageSetName
         */
        public String getStorageSetName() {
            return this.storageSetName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String creationTime; 
            private String description; 
            private String zoneId; 
            private String storageSetId; 
            private Integer storageSetPartitionNumber; 
            private String storageSetName; 
            private String regionId; 

            /**
             * The time when the storage set was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the storage set.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the zone to which the bucket belongs.
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
             * The maximum number of partitions supported by a storage set.
             */
            public Builder storageSetPartitionNumber(Integer storageSetPartitionNumber) {
                this.storageSetPartitionNumber = storageSetPartitionNumber;
                return this;
            }

            /**
             * The name of the storage set.
             */
            public Builder storageSetName(String storageSetName) {
                this.storageSetName = storageSetName;
                return this;
            }

            /**
             * The ID of the region to which the bucket belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public StorageSet build() {
                return new StorageSet(this);
            } 

        } 

    }
    public static class StorageSets extends TeaModel {
        @NameInMap("StorageSet")
        private java.util.List < StorageSet> storageSet;

        private StorageSets(Builder builder) {
            this.storageSet = builder.storageSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageSets create() {
            return builder().build();
        }

        /**
         * @return storageSet
         */
        public java.util.List < StorageSet> getStorageSet() {
            return this.storageSet;
        }

        public static final class Builder {
            private java.util.List < StorageSet> storageSet; 

            /**
             * StorageSet.
             */
            public Builder storageSet(java.util.List < StorageSet> storageSet) {
                this.storageSet = storageSet;
                return this;
            }

            public StorageSets build() {
                return new StorageSets(this);
            } 

        } 

    }
}
