// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLibraryInstallTasksRequest} extends {@link RequestModel}
 *
 * <p>ListLibraryInstallTasksRequest</p>
 */
public class ListLibraryInstallTasksRequest extends Request {
    @Query
    @NameInMap("ClusterBizId")
    private String clusterBizId;

    @Query
    @NameInMap("CurrentSize")
    @Validation(maximum = 500, minimum = 1)
    private Integer currentSize;

    @Query
    @NameInMap("LibraryBizId")
    private String libraryBizId;

    @Query
    @NameInMap("Limit")
    @Validation(maximum = 500, minimum = 1)
    private Integer limit;

    @Query
    @NameInMap("OrderField")
    private String orderField;

    @Query
    @NameInMap("OrderMode")
    private String orderMode;

    @Query
    @NameInMap("PageCount")
    @Validation(maximum = 500, minimum = 1)
    private Integer pageCount;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 500, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 500, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ListLibraryInstallTasksRequest(Builder builder) {
        super(builder);
        this.clusterBizId = builder.clusterBizId;
        this.currentSize = builder.currentSize;
        this.libraryBizId = builder.libraryBizId;
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

    public static ListLibraryInstallTasksRequest create() {
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
     * @return libraryBizId
     */
    public String getLibraryBizId() {
        return this.libraryBizId;
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

    public static final class Builder extends Request.Builder<ListLibraryInstallTasksRequest, Builder> {
        private String clusterBizId; 
        private Integer currentSize; 
        private String libraryBizId; 
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

        private Builder(ListLibraryInstallTasksRequest request) {
            super(request);
            this.clusterBizId = request.clusterBizId;
            this.currentSize = request.currentSize;
            this.libraryBizId = request.libraryBizId;
            this.limit = request.limit;
            this.orderField = request.orderField;
            this.orderMode = request.orderMode;
            this.pageCount = request.pageCount;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * LibraryBizId.
         */
        public Builder libraryBizId(String libraryBizId) {
            this.putQueryParameter("LibraryBizId", libraryBizId);
            this.libraryBizId = libraryBizId;
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
        public ListLibraryInstallTasksRequest build() {
            return new ListLibraryInstallTasksRequest(this);
        } 

    } 

}
