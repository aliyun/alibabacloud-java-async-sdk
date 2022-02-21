// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStorageCapacityUnitsRequest} extends {@link RequestModel}
 *
 * <p>DescribeStorageCapacityUnitsRequest</p>
 */
public class DescribeStorageCapacityUnitsRequest extends Request {
    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("StorageCapacityUnitId")
    private java.util.List < String > storageCapacityUnitId;

    @Query
    @NameInMap("AllocationType")
    private String allocationType;

    @Query
    @NameInMap("Status")
    private java.util.List < String > status;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Capacity")
    private Integer capacity;

    private DescribeStorageCapacityUnitsRequest(Builder builder) {
        super(builder);
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.pageNumber = builder.pageNumber;
        this.storageCapacityUnitId = builder.storageCapacityUnitId;
        this.allocationType = builder.allocationType;
        this.status = builder.status;
        this.regionId = builder.regionId;
        this.capacity = builder.capacity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStorageCapacityUnitsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return storageCapacityUnitId
     */
    public java.util.List < String > getStorageCapacityUnitId() {
        return this.storageCapacityUnitId;
    }

    /**
     * @return allocationType
     */
    public String getAllocationType() {
        return this.allocationType;
    }

    /**
     * @return status
     */
    public java.util.List < String > getStatus() {
        return this.status;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return capacity
     */
    public Integer getCapacity() {
        return this.capacity;
    }

    public static final class Builder extends Request.Builder<DescribeStorageCapacityUnitsRequest, Builder> {
        private Long resourceOwnerId; 
        private java.util.List < Tag> tag; 
        private String name; 
        private Integer pageSize; 
        private Integer pageNumber; 
        private java.util.List < String > storageCapacityUnitId; 
        private String allocationType; 
        private java.util.List < String > status; 
        private String regionId; 
        private Integer capacity; 

        private Builder() {
            super();
        } 

        private Builder(DescribeStorageCapacityUnitsRequest response) {
            super(response);
            this.resourceOwnerId = response.resourceOwnerId;
            this.tag = response.tag;
            this.name = response.name;
            this.pageSize = response.pageSize;
            this.pageNumber = response.pageNumber;
            this.storageCapacityUnitId = response.storageCapacityUnitId;
            this.allocationType = response.allocationType;
            this.status = response.status;
            this.regionId = response.regionId;
            this.capacity = response.capacity;
        } 

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The name of the SCU.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Maximum Value: 100
         * 
         * Default value: 10
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The page number of the SCU list.
         * <p>
         * 
         * Start value: 1
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * One or more SCU ID. Valid values of N: 1 to 100.
         */
        public Builder storageCapacityUnitId(java.util.List < String > storageCapacityUnitId) {
            this.putQueryParameter("StorageCapacityUnitId", storageCapacityUnitId);
            this.storageCapacityUnitId = storageCapacityUnitId;
            return this;
        }

        /**
         * Distribution type. Valid values:
         * <p>
         * 
         * -Normal: query the current Alibaba Cloud account under the SCU.
         * -Shared: query has been established Alibaba Cloud account and RAM user Shared SCU.
         * 
         * Default: Normal
         */
        public Builder allocationType(String allocationType) {
            this.putQueryParameter("AllocationType", allocationType);
            this.allocationType = allocationType;
            return this;
        }

        /**
         * One or more SCU status value, N value range is 1~4. State value range:
         * <p>
         * 
         * -Creating: Creating
         * -Active: enable medium
         * -Expired: Expired
         * -Pending: stay entry into force
         */
        public Builder status(java.util.List < String > status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * SCU belongs geo ID. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SCU capacity size, unit for GiB. Value range:{20, 40, 100, 200, 500, 1024, 2048, 5120, 10240, 20480, 51200}
         */
        public Builder capacity(Integer capacity) {
            this.putQueryParameter("Capacity", capacity);
            this.capacity = capacity;
            return this;
        }

        @Override
        public DescribeStorageCapacityUnitsRequest build() {
            return new DescribeStorageCapacityUnitsRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
             * SCU的标签键。N表示可以设置多个标签键进行查询，N的取值范围：1~20。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * SCU的标签值。N表示可以设置多个标签值进行查询，且与`Tag.N.Key`的N对应，N的取值范围：1~20。
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
