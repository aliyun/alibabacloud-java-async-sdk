// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEndpointsRequest} extends {@link RequestModel}
 *
 * <p>ListEndpointsRequest</p>
 */
public class ListEndpointsRequest extends Request {
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
    @NameInMap("SlotIds")
    private String slotIds;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("Type")
    private String type;

    private ListEndpointsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endpointIds = builder.endpointIds;
        this.instanceIds = builder.instanceIds;
        this.name = builder.name;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.slotIds = builder.slotIds;
        this.sortBy = builder.sortBy;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEndpointsRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListEndpointsRequest, Builder> {
        private String regionId; 
        private String endpointIds; 
        private String instanceIds; 
        private String name; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String slotIds; 
        private String sortBy; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListEndpointsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endpointIds = request.endpointIds;
            this.instanceIds = request.instanceIds;
            this.name = request.name;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.slotIds = request.slotIds;
            this.sortBy = request.sortBy;
            this.type = request.type;
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
         * EndpointIds.
         */
        public Builder endpointIds(String endpointIds) {
            this.putQueryParameter("EndpointIds", endpointIds);
            this.endpointIds = endpointIds;
            return this;
        }

        /**
         * 所属加速实例的ID。
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
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListEndpointsRequest build() {
            return new ListEndpointsRequest(this);
        } 

    } 

}
