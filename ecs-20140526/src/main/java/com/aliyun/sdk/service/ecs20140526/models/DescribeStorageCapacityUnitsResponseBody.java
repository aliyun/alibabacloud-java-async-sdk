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
 * {@link DescribeStorageCapacityUnitsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStorageCapacityUnitsResponseBody</p>
 */
public class DescribeStorageCapacityUnitsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StorageCapacityUnits")
    private StorageCapacityUnits storageCapacityUnits;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeStorageCapacityUnitsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.storageCapacityUnits = model.storageCapacityUnits;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Details about the SCUs.</p>
         */
        public Builder storageCapacityUnits(StorageCapacityUnits storageCapacityUnits) {
            this.storageCapacityUnits = storageCapacityUnits;
            return this;
        }

        /**
         * <p>The total number of SCUs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeStorageCapacityUnitsResponseBody build() {
            return new DescribeStorageCapacityUnitsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeStorageCapacityUnitsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStorageCapacityUnitsResponseBody</p>
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
             * <p>The key of tag N.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of tag N.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
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
     * {@link DescribeStorageCapacityUnitsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStorageCapacityUnitsResponseBody</p>
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
     * {@link DescribeStorageCapacityUnitsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStorageCapacityUnitsResponseBody</p>
     */
    public static class StorageCapacityUnit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationStatus")
        private String allocationStatus;

        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Integer capacity;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageCapacityUnitId")
        private String storageCapacityUnitId;

        @com.aliyun.core.annotation.NameInMap("Tags")
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

            private Builder() {
            } 

            private Builder(StorageCapacityUnit model) {
                this.allocationStatus = model.allocationStatus;
                this.capacity = model.capacity;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.expiredTime = model.expiredTime;
                this.name = model.name;
                this.regionId = model.regionId;
                this.startTime = model.startTime;
                this.status = model.status;
                this.storageCapacityUnitId = model.storageCapacityUnitId;
                this.tags = model.tags;
            } 

            /**
             * <p>Indicates the allocation state of the SCU when the AllocationType parameter is set to Shared. Valid values:</p>
             * <ul>
             * <li>allocated: The SCU is allocated to other accounts.</li>
             * <li>BeAllocated: The SCU is allocated from another account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>allocated</p>
             */
            public Builder allocationStatus(String allocationStatus) {
                this.allocationStatus = allocationStatus;
                return this;
            }

            /**
             * <p>The capacity of the SCU.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder capacity(Integer capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The time when the SCU was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-17T02:55Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the SCU.</p>
             * 
             * <strong>example:</strong>
             * <p>testScuDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the SCU expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-17T16:00Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The name of the SCU.</p>
             * 
             * <strong>example:</strong>
             * <p>testScuName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The region ID of the SCU.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The time when the SCU took effect.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-17T02:55Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the SCU. Valid values:</p>
             * <ul>
             * <li>Creating: The SCUs are being created.</li>
             * <li>Active: The SCUs are in effect.</li>
             * <li>Expired: The SCUs have expired.</li>
             * <li>Pending: The SCUs have not taken effect.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the SCU.</p>
             * 
             * <strong>example:</strong>
             * <p>scu-bp67acfmxazb4p****</p>
             */
            public Builder storageCapacityUnitId(String storageCapacityUnitId) {
                this.storageCapacityUnitId = storageCapacityUnitId;
                return this;
            }

            /**
             * <p>The tag key-value pairs of the SCU.</p>
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
    /**
     * 
     * {@link DescribeStorageCapacityUnitsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStorageCapacityUnitsResponseBody</p>
     */
    public static class StorageCapacityUnits extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StorageCapacityUnit")
        private java.util.List<StorageCapacityUnit> storageCapacityUnit;

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
        public java.util.List<StorageCapacityUnit> getStorageCapacityUnit() {
            return this.storageCapacityUnit;
        }

        public static final class Builder {
            private java.util.List<StorageCapacityUnit> storageCapacityUnit; 

            private Builder() {
            } 

            private Builder(StorageCapacityUnits model) {
                this.storageCapacityUnit = model.storageCapacityUnit;
            } 

            /**
             * StorageCapacityUnit.
             */
            public Builder storageCapacityUnit(java.util.List<StorageCapacityUnit> storageCapacityUnit) {
                this.storageCapacityUnit = storageCapacityUnit;
                return this;
            }

            public StorageCapacityUnits build() {
                return new StorageCapacityUnits(this);
            } 

        } 

    }
}
