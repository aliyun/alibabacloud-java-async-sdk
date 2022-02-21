// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchRequest} extends {@link RequestModel}
 *
 * <p>SearchRequest</p>
 */
public class SearchRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("CatalogId")
    private String catalogId;

    @Body
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Body
    @NameInMap("PageSize")
    private Long pageSize;

    @Body
    @NameInMap("SearchText")
    private String searchText;

    @Body
    @NameInMap("SortCriteria")
    private java.util.List < SortCriterion > sortCriteria;

    private SearchRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogId = builder.catalogId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchText = builder.searchText;
        this.sortCriteria = builder.sortCriteria;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchRequest create() {
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
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return searchText
     */
    public String getSearchText() {
        return this.searchText;
    }

    /**
     * @return sortCriteria
     */
    public java.util.List < SortCriterion > getSortCriteria() {
        return this.sortCriteria;
    }

    public static final class Builder extends Request.Builder<SearchRequest, Builder> {
        private String regionId; 
        private String catalogId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String searchText; 
        private java.util.List < SortCriterion > sortCriteria; 

        private Builder() {
            super();
        } 

        private Builder(SearchRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.catalogId = response.catalogId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.searchText = response.searchText;
            this.sortCriteria = response.sortCriteria;
        } 

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * catalogid
         */
        public Builder catalogId(String catalogId) {
            this.putBodyParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * 当前查询的页号
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 当前查询的页大小
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 搜索问题
         */
        public Builder searchText(String searchText) {
            this.putBodyParameter("SearchText", searchText);
            this.searchText = searchText;
            return this;
        }

        /**
         * 排序结构
         */
        public Builder sortCriteria(java.util.List < SortCriterion > sortCriteria) {
            this.putBodyParameter("SortCriteria", sortCriteria);
            this.sortCriteria = sortCriteria;
            return this;
        }

        @Override
        public SearchRequest build() {
            return new SearchRequest(this);
        } 

    } 

}
