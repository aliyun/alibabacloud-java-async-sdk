// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListComponentsRequest} extends {@link RequestModel}
 *
 * <p>ListComponentsRequest</p>
 */
public class ListComponentsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ComponentIds")
    private String componentIds;

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
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("Version")
    private String version;

    private ListComponentsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.componentIds = builder.componentIds;
        this.name = builder.name;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComponentsRequest create() {
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
     * @return componentIds
     */
    public String getComponentIds() {
        return this.componentIds;
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
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<ListComponentsRequest, Builder> {
        private String regionId; 
        private String componentIds; 
        private String name; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sortBy; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(ListComponentsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.componentIds = request.componentIds;
            this.name = request.name;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.version = request.version;
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
         * ComponentIds.
         */
        public Builder componentIds(String componentIds) {
            this.putQueryParameter("ComponentIds", componentIds);
            this.componentIds = componentIds;
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
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public ListComponentsRequest build() {
            return new ListComponentsRequest(this);
        } 

    } 

}
