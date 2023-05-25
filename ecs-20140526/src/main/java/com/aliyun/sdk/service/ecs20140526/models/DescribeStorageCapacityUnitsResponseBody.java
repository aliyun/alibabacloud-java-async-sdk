// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStorageCapacityUnitsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStorageCapacityUnitsResponseBody</p>
 */
public class DescribeStorageCapacityUnitsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StorageCapacityUnits")
    private StorageCapacityUnits storageCapacityUnits;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeStorageCapacityUnitsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.storageCapacityUnits = builder.storageCapacityUnits;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStorageCapacityUnitsResponseBody create() {
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
     * @return storageCapacityUnits
     */
    public StorageCapacityUnits getStorageCapacityUnits() {
        return this.storageCapacityUnits;
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
        private StorageCapacityUnits storageCapacityUnits; 
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
         * Details about the SCUs.
         */
        public Builder storageCapacityUnits(StorageCapacityUnits storageCapacityUnits) {
            this.storageCapacityUnits = storageCapacityUnits;
            return this;
        }

        /**
         * The total number of SCUs.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeStorageCapacityUnitsResponseBody build() {
            return new DescribeStorageCapacityUnitsResponseBody(this);
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
             * The key of tag N.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The value of tag N.
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
    public static class StorageCapacityUnit extends TeaModel {
        @NameInMap("AllocationStatus")
        private String allocationStatus;

        @NameInMap("Capacity")
        private Integer capacity;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageCapacityUnitId")
        private String storageCapacityUnitId;

        @NameInMap("Tags")
        private Tags tags;

        private StorageCapacityUnit(Builder builder) {
            this.allocationStatus = builder.allocationStatus;
            this.capacity = builder.capacity;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.expiredTime = builder.expiredTime;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.storageCapacityUnitId = builder.storageCapacityUnitId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageCapacityUnit create() {
            return builder().build();
        }

        /**
         * @return allocationStatus
         */
        public String getAllocationStatus() {
            return this.allocationStatus;
        }

        /**
         * @return capacity
         */
        public Integer getCapacity() {
            return this.capacity;
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
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageCapacityUnitId
         */
        public String getStorageCapacityUnitId() {
            return this.storageCapacityUnitId;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String allocationStatus; 
            private Integer capacity; 
            private String creationTime; 
            private String description; 
            private String expiredTime; 
            private String name; 
            private String regionId; 
            private String startTime; 
            private String status; 
            private String storageCapacityUnitId; 
            private Tags tags; 

            /**
             * Indicates the allocation state of the SCU when the AllocationType parameter is set to Shared. Valid values:
             * <p>
             * 
             * *   allocated: The SCU is allocated to other accounts.
             * *   BeAllocated: The SCU is allocated from another account.
             */
            public Builder allocationStatus(String allocationStatus) {
                this.allocationStatus = allocationStatus;
                return this;
            }

            /**
             * The capacity of the SCU.
             */
            public Builder capacity(Integer capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * The time when the SCU was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the SCU.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the SCU expires.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The name of the SCU.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The region ID of the SCU.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The time when the SCU took effect.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The state of the SCU.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the SCU.
             */
            public Builder storageCapacityUnitId(String storageCapacityUnitId) {
                this.storageCapacityUnitId = storageCapacityUnitId;
                return this;
            }

            /**
             * The tag key-value pairs of the SCU.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public StorageCapacityUnit build() {
                return new StorageCapacityUnit(this);
            } 

        } 

    }
    public static class StorageCapacityUnits extends TeaModel {
        @NameInMap("StorageCapacityUnit")
        private java.util.List < StorageCapacityUnit> storageCapacityUnit;

        private StorageCapacityUnits(Builder builder) {
            this.storageCapacityUnit = builder.storageCapacityUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageCapacityUnits create() {
            return builder().build();
        }

        /**
         * @return storageCapacityUnit
         */
        public java.util.List < StorageCapacityUnit> getStorageCapacityUnit() {
            return this.storageCapacityUnit;
        }

        public static final class Builder {
            private java.util.List < StorageCapacityUnit> storageCapacityUnit; 

            /**
             * StorageCapacityUnit.
             */
            public Builder storageCapacityUnit(java.util.List < StorageCapacityUnit> storageCapacityUnit) {
                this.storageCapacityUnit = storageCapacityUnit;
                return this;
            }

            public StorageCapacityUnits build() {
                return new StorageCapacityUnits(this);
            } 

        } 

    }
}
