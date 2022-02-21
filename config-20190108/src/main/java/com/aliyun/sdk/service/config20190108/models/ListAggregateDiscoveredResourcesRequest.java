// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAggregateDiscoveredResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListAggregateDiscoveredResourcesRequest</p>
 */
public class ListAggregateDiscoveredResourcesRequest extends Request {
    @Query
    @NameInMap("AggregatorId")
    @Validation(required = true)
    private String aggregatorId;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true, maximum = 100000, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("Regions")
    private String regions;

    @Query
    @NameInMap("ResourceDeleted")
    private Integer resourceDeleted;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ResourceTypes")
    private String resourceTypes;

    private ListAggregateDiscoveredResourcesRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regions = builder.regions;
        this.resourceDeleted = builder.resourceDeleted;
        this.resourceId = builder.resourceId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceTypes = builder.resourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAggregateDiscoveredResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
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
     * @return regions
     */
    public String getRegions() {
        return this.regions;
    }

    /**
     * @return resourceDeleted
     */
    public Integer getResourceDeleted() {
        return this.resourceDeleted;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return resourceTypes
     */
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public static final class Builder extends Request.Builder<ListAggregateDiscoveredResourcesRequest, Builder> {
        private String aggregatorId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regions; 
        private Integer resourceDeleted; 
        private String resourceId; 
        private Long resourceOwnerId; 
        private String resourceTypes; 

        private Builder() {
            super();
        } 

        private Builder(ListAggregateDiscoveredResourcesRequest response) {
            super(response);
            this.aggregatorId = response.aggregatorId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regions = response.regions;
            this.resourceDeleted = response.resourceDeleted;
            this.resourceId = response.resourceId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.resourceTypes = response.resourceTypes;
        } 

        /**
         * AggregatorId.
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
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
         * Regions.
         */
        public Builder regions(String regions) {
            this.putQueryParameter("Regions", regions);
            this.regions = regions;
            return this;
        }

        /**
         * ResourceDeleted.
         */
        public Builder resourceDeleted(Integer resourceDeleted) {
            this.putQueryParameter("ResourceDeleted", resourceDeleted);
            this.resourceDeleted = resourceDeleted;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
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
         * ResourceTypes.
         */
        public Builder resourceTypes(String resourceTypes) {
            this.putQueryParameter("ResourceTypes", resourceTypes);
            this.resourceTypes = resourceTypes;
            return this;
        }

        @Override
        public ListAggregateDiscoveredResourcesRequest build() {
            return new ListAggregateDiscoveredResourcesRequest(this);
        } 

    } 

}
