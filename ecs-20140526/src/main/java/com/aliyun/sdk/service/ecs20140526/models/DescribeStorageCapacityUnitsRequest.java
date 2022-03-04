// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("Capacity")
    private Integer capacity;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

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
    @NameInMap("Name")
    private String name;

    private DescribeStorageCapacityUnitsRequest(Builder builder) {
        super(builder);
        this.resourceOwnerId = builder.resourceOwnerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.tag = builder.tag;
        this.capacity = builder.capacity;
        this.regionId = builder.regionId;
        this.storageCapacityUnitId = builder.storageCapacityUnitId;
        this.allocationType = builder.allocationType;
        this.status = builder.status;
        this.name = builder.name;
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return capacity
     */
    public Integer getCapacity() {
        return this.capacity;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<DescribeStorageCapacityUnitsRequest, Builder> {
        private Long resourceOwnerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < Tag> tag; 
        private Integer capacity; 
        private String regionId; 
        private java.util.List < String > storageCapacityUnitId; 
        private String allocationType; 
        private java.util.List < String > status; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DescribeStorageCapacityUnitsRequest request) {
            super(request);
            this.resourceOwnerId = request.resourceOwnerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.tag = request.tag;
            this.capacity = request.capacity;
            this.regionId = request.regionId;
            this.storageCapacityUnitId = request.storageCapacityUnitId;
            this.allocationType = request.allocationType;
            this.status = request.status;
            this.name = request.name;
        } 

        /**
         * The ID of the Alibaba cloud account.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
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
         * Tag list
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The capacity of the SCU. Unit: GiB. Valid values:{20, 40, 100, 200, 500, 1024, 2048, 5120, 10240, 20480, 51200}.
         */
        public Builder capacity(Integer capacity) {
            this.putQueryParameter("Capacity", capacity);
            this.capacity = capacity;
            return this;
        }

        /**
         * The ID of the region to which the SCU belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * The allocation type. Valid values:
         * <p>
         * 
         * -Normal: queries the scus under the current alibaba cloud account.
         * -Shared: queries scus that are Shared with RAM users by alibaba cloud accounts.
         * 
         * Default value: Normal
         */
        public Builder allocationType(String allocationType) {
            this.putQueryParameter("AllocationType", allocationType);
            this.allocationType = allocationType;
            return this;
        }

        /**
         * The status of one or more scus. Valid values of N: 1 to 4. Valid values:
         * <p>
         * 
         * -Creating: Creating
         * -Active: enabling
         * -Expired: Expired
         * -Pending: to take effect
         */
        public Builder status(java.util.List < String > status) {
            this.putQueryParameter("Status", status);
            this.status = status;
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
