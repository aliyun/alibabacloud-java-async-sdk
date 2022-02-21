// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("StorageCapacityUnits")
    private StorageCapacityUnits storageCapacityUnits;

    private DescribeStorageCapacityUnitsResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.storageCapacityUnits = builder.storageCapacityUnits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStorageCapacityUnitsResponseBody create() {
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
     * @return storageCapacityUnits
     */
    public StorageCapacityUnits getStorageCapacityUnits() {
        return this.storageCapacityUnits;
    }

    public static final class Builder {
        private Integer pageSize; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private StorageCapacityUnits storageCapacityUnits; 

        /**
         * The number of entries to return on each page.
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
         * SCU list page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * SCU total number.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Returns the details of the SCU in an array of StorageCapacityUnits.
         */
        public Builder storageCapacityUnits(StorageCapacityUnits storageCapacityUnits) {
            this.storageCapacityUnits = storageCapacityUnits;
            return this;
        }

        public DescribeStorageCapacityUnitsResponseBody build() {
            return new DescribeStorageCapacityUnitsResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("TagValue")
        private String tagValue;

        @NameInMap("TagKey")
        private String tagKey;

        private Tag(Builder builder) {
            this.tagValue = builder.tagValue;
            this.tagKey = builder.tagKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        public static final class Builder {
            private String tagValue; 
            private String tagKey; 

            /**
             * SCU label key.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * SCU the label value.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
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
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Capacity")
        private Integer capacity;

        @NameInMap("Description")
        private String description;

        @NameInMap("AllocationStatus")
        private String allocationStatus;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("StorageCapacityUnitId")
        private String storageCapacityUnitId;

        @NameInMap("Name")
        private String name;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Tags")
        private Tags tags;

        private StorageCapacityUnit(Builder builder) {
            this.creationTime = builder.creationTime;
            this.status = builder.status;
            this.startTime = builder.startTime;
            this.capacity = builder.capacity;
            this.description = builder.description;
            this.allocationStatus = builder.allocationStatus;
            this.expiredTime = builder.expiredTime;
            this.storageCapacityUnitId = builder.storageCapacityUnitId;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageCapacityUnit create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return capacity
         */
        public Integer getCapacity() {
            return this.capacity;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return allocationStatus
         */
        public String getAllocationStatus() {
            return this.allocationStatus;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return storageCapacityUnitId
         */
        public String getStorageCapacityUnitId() {
            return this.storageCapacityUnitId;
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
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String creationTime; 
            private String status; 
            private String startTime; 
            private Integer capacity; 
            private String description; 
            private String allocationStatus; 
            private String expiredTime; 
            private String storageCapacityUnitId; 
            private String name; 
            private String regionId; 
            private Tags tags; 

            /**
             * The time when the SCU was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * SCU state.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The start time of the SCU.
             * <p>
             * 
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * SCU capacity.
             */
            public Builder capacity(Integer capacity) {
                this.capacity = capacity;
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
             * If the AllocationType value is Shared, this parameter indicates the allocation status of the SCU. Possible values:
             * <p>
             * -allocated: The SCUs that have been allocated to other users.
             * -beAllocated: The SCU allocated to other users.
             */
            public Builder allocationStatus(String allocationStatus) {
                this.allocationStatus = allocationStatus;
                return this;
            }

            /**
             * The expiration time of the SCU.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * SCU ID.
             */
            public Builder storageCapacityUnitId(String storageCapacityUnitId) {
                this.storageCapacityUnitId = storageCapacityUnitId;
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
             * SCU the respective geographical ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The key-value pair of the SCU tag.
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
