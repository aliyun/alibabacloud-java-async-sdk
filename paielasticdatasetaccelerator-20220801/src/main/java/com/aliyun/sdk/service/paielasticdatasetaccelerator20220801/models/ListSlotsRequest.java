// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSlotsRequest} extends {@link RequestModel}
 *
 * <p>ListSlotsRequest</p>
 */
public class ListSlotsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("EndpointIds")
    private String endpointIds;

    @Query
    @NameInMap("InstanceIds")
    private String instanceIds;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Phase")
    private String phase;

    @Query
    @NameInMap("SlotIds")
    private String slotIds;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("StorageType")
    private String storageType;

    @Query
    @NameInMap("StorageUri")
    private String storageUri;

    private ListSlotsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endpointIds = builder.endpointIds;
        this.instanceIds = builder.instanceIds;
        this.name = builder.name;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.phase = builder.phase;
        this.slotIds = builder.slotIds;
        this.sortBy = builder.sortBy;
        this.storageType = builder.storageType;
        this.storageUri = builder.storageUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSlotsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return endpointIds
     */
    public String getEndpointIds() {
        return this.endpointIds;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return slotIds
     */
    public String getSlotIds() {
        return this.slotIds;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return storageUri
     */
    public String getStorageUri() {
        return this.storageUri;
    }

    public static final class Builder extends Request.Builder<ListSlotsRequest, Builder> {
        private String regionId; 
        private String endpointIds; 
        private String instanceIds; 
        private String name; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String phase; 
        private String slotIds; 
        private String sortBy; 
        private String storageType; 
        private String storageUri; 

        private Builder() {
            super();
        } 

        private Builder(ListSlotsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endpointIds = request.endpointIds;
            this.instanceIds = request.instanceIds;
            this.name = request.name;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.phase = request.phase;
            this.slotIds = request.slotIds;
            this.sortBy = request.sortBy;
            this.storageType = request.storageType;
            this.storageUri = request.storageUri;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 加速槽所对应的数据集加速挂载点的唯一标识符。
         */
        public Builder endpointIds(String endpointIds) {
            this.putQueryParameter("EndpointIds", endpointIds);
            this.endpointIds = endpointIds;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Phase.
         */
        public Builder phase(String phase) {
            this.putQueryParameter("Phase", phase);
            this.phase = phase;
            return this;
        }

        /**
         * SlotIds.
         */
        public Builder slotIds(String slotIds) {
            this.putQueryParameter("SlotIds", slotIds);
            this.slotIds = slotIds;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * StorageType.
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * 数据集加速槽的数据存储路径（URI）。
         */
        public Builder storageUri(String storageUri) {
            this.putQueryParameter("StorageUri", storageUri);
            this.storageUri = storageUri;
            return this;
        }

        @Override
        public ListSlotsRequest build() {
            return new ListSlotsRequest(this);
        } 

    } 

}
