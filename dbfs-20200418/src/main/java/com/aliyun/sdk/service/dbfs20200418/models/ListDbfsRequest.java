// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDbfsRequest} extends {@link RequestModel}
 *
 * <p>ListDbfsRequest</p>
 */
public class ListDbfsRequest extends Request {
    @Query
    @NameInMap("FilterKey")
    private String filterKey;

    @Query
    @NameInMap("FilterValue")
    private String filterValue;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 999999, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 200, minimum = 10)
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SortKey")
    private String sortKey;

    @Query
    @NameInMap("SortType")
    private String sortType;

    @Query
    @NameInMap("Tags")
    private String tags;

    private ListDbfsRequest(Builder builder) {
        super(builder);
        this.filterKey = builder.filterKey;
        this.filterValue = builder.filterValue;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.sortKey = builder.sortKey;
        this.sortType = builder.sortType;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDbfsRequest create() {
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

    /**
     * @return sortKey
     */
    public String getSortKey() {
        return this.sortKey;
    }

    /**
     * @return sortType
     */
    public String getSortType() {
        return this.sortType;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListDbfsRequest, Builder> {
        private String filterKey; 
        private String filterValue; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String sortKey; 
        private String sortType; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(ListDbfsRequest response) {
            super(response);
            this.filterKey = response.filterKey;
            this.filterValue = response.filterValue;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.sortKey = response.sortKey;
            this.sortType = response.sortType;
            this.tags = response.tags;
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

        /**
         * SortKey.
         */
        public Builder sortKey(String sortKey) {
            this.putQueryParameter("SortKey", sortKey);
            this.sortKey = sortKey;
            return this;
        }

        /**
         * SortType.
         */
        public Builder sortType(String sortType) {
            this.putQueryParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public ListDbfsRequest build() {
            return new ListDbfsRequest(this);
        } 

    } 

}
