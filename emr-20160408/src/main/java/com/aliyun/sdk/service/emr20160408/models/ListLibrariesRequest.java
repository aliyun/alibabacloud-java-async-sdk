// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLibrariesRequest} extends {@link RequestModel}
 *
 * <p>ListLibrariesRequest</p>
 */
public class ListLibrariesRequest extends Request {
    @Query
    @NameInMap("ClusterBizId")
    private String clusterBizId;

    @Query
    @NameInMap("CurrentSize")
    private Integer currentSize;

    @Query
    @NameInMap("Limit")
    private Integer limit;

    @Query
    @NameInMap("OrderField")
    private String orderField;

    @Query
    @NameInMap("OrderMode")
    private String orderMode;

    @Query
    @NameInMap("PageCount")
    private Integer pageCount;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ListLibrariesRequest(Builder builder) {
        super(builder);
        this.clusterBizId = builder.clusterBizId;
        this.currentSize = builder.currentSize;
        this.limit = builder.limit;
        this.orderField = builder.orderField;
        this.orderMode = builder.orderMode;
        this.pageCount = builder.pageCount;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLibrariesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterBizId
     */
    public String getClusterBizId() {
        return this.clusterBizId;
    }

    /**
     * @return currentSize
     */
    public Integer getCurrentSize() {
        return this.currentSize;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return orderField
     */
    public String getOrderField() {
        return this.orderField;
    }

    /**
     * @return orderMode
     */
    public String getOrderMode() {
        return this.orderMode;
    }

    /**
     * @return pageCount
     */
    public Integer getPageCount() {
        return this.pageCount;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<ListLibrariesRequest, Builder> {
        private String clusterBizId; 
        private Integer currentSize; 
        private Integer limit; 
        private String orderField; 
        private String orderMode; 
        private Integer pageCount; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ListLibrariesRequest response) {
            super(response);
            this.clusterBizId = response.clusterBizId;
            this.currentSize = response.currentSize;
            this.limit = response.limit;
            this.orderField = response.orderField;
            this.orderMode = response.orderMode;
            this.pageCount = response.pageCount;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * ClusterBizId.
         */
        public Builder clusterBizId(String clusterBizId) {
            this.putQueryParameter("ClusterBizId", clusterBizId);
            this.clusterBizId = clusterBizId;
            return this;
        }

        /**
         * CurrentSize.
         */
        public Builder currentSize(Integer currentSize) {
            this.putQueryParameter("CurrentSize", currentSize);
            this.currentSize = currentSize;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * OrderField.
         */
        public Builder orderField(String orderField) {
            this.putQueryParameter("OrderField", orderField);
            this.orderField = orderField;
            return this;
        }

        /**
         * OrderMode.
         */
        public Builder orderMode(String orderMode) {
            this.putQueryParameter("OrderMode", orderMode);
            this.orderMode = orderMode;
            return this;
        }

        /**
         * PageCount.
         */
        public Builder pageCount(Integer pageCount) {
            this.putQueryParameter("PageCount", pageCount);
            this.pageCount = pageCount;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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

        @Override
        public ListLibrariesRequest build() {
            return new ListLibrariesRequest(this);
        } 

    } 

}
