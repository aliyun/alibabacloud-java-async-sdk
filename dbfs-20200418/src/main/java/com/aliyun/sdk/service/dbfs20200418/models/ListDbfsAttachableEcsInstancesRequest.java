// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDbfsAttachableEcsInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListDbfsAttachableEcsInstancesRequest</p>
 */
public class ListDbfsAttachableEcsInstancesRequest extends Request {
    @Query
    @NameInMap("FilterKey")
    private String filterKey;

    @Query
    @NameInMap("FilterValue")
    private String filterValue;

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

    private ListDbfsAttachableEcsInstancesRequest(Builder builder) {
        super(builder);
        this.filterKey = builder.filterKey;
        this.filterValue = builder.filterValue;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDbfsAttachableEcsInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filterKey
     */
    public String getFilterKey() {
        return this.filterKey;
    }

    /**
     * @return filterValue
     */
    public String getFilterValue() {
        return this.filterValue;
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

    public static final class Builder extends Request.Builder<ListDbfsAttachableEcsInstancesRequest, Builder> {
        private String filterKey; 
        private String filterValue; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListDbfsAttachableEcsInstancesRequest request) {
            super(request);
            this.filterKey = request.filterKey;
            this.filterValue = request.filterValue;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
        } 

        /**
         * FilterKey.
         */
        public Builder filterKey(String filterKey) {
            this.putQueryParameter("FilterKey", filterKey);
            this.filterKey = filterKey;
            return this;
        }

        /**
         * FilterValue.
         */
        public Builder filterValue(String filterValue) {
            this.putQueryParameter("FilterValue", filterValue);
            this.filterValue = filterValue;
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

        @Override
        public ListDbfsAttachableEcsInstancesRequest build() {
            return new ListDbfsAttachableEcsInstancesRequest(this);
        } 

    } 

}
