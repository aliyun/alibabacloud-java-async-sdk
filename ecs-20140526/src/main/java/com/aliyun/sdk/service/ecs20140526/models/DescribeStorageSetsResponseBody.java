// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StorageSets")
    private StorageSets storageSets;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeStorageSetsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.storageSets = builder.storageSets;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStorageSetsResponseBody create() {
        return builder().build();
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
     * @return storageSets
     */
    public StorageSets getStorageSets() {
        return this.storageSets;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private StorageSets storageSets; 
        private Integer totalCount; 

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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Details about the storage sets. The value of this parameter is an array that consists of StorageSet data.
         */
        public Builder storageSets(StorageSets storageSets) {
            this.storageSets = storageSets;
            return this;
        }

        /**
         * The total number of storage sets.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
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

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("StorageSetId")
        private String storageSetId;

        @NameInMap("StorageSetName")
        private String storageSetName;

        @NameInMap("StorageSetPartitionNumber")
        private Integer storageSetPartitionNumber;

        @NameInMap("ZoneId")
        private String zoneId;

        private StorageSet(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.regionId = builder.regionId;
            this.storageSetId = builder.storageSetId;
            this.storageSetName = builder.storageSetName;
            this.storageSetPartitionNumber = builder.storageSetPartitionNumber;
            this.zoneId = builder.zoneId;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return storageSetId
         */
        public String getStorageSetId() {
            return this.storageSetId;
        }

        /**
         * @return storageSetName
         */
        public String getStorageSetName() {
            return this.storageSetName;
        }

        /**
         * @return storageSetPartitionNumber
         */
        public Integer getStorageSetPartitionNumber() {
            return this.storageSetPartitionNumber;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String creationTime; 
            private String description; 
            private String regionId; 
            private String storageSetId; 
            private String storageSetName; 
            private Integer storageSetPartitionNumber; 
            private String zoneId; 

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
             * The ID of the region to which the storage set belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * The name of the storage set.
             */
            public Builder storageSetName(String storageSetName) {
                this.storageSetName = storageSetName;
                return this;
            }

            /**
             * The maximum number of partitions supported by the storage set.
             */
            public Builder storageSetPartitionNumber(Integer storageSetPartitionNumber) {
                this.storageSetPartitionNumber = storageSetPartitionNumber;
                return this;
            }

            /**
             * The ID of the zone to which the storage set belongs.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
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
