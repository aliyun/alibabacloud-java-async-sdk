// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchAcrossCatalogRequest} extends {@link RequestModel}
 *
 * <p>SearchAcrossCatalogRequest</p>
 */
public class SearchAcrossCatalogRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("CatalogIds")
    private java.util.List < String > catalogIds;

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
    @NameInMap("SearchTypes")
    private java.util.List < String > searchTypes;

    @Body
    @NameInMap("SortCriteria")
    private java.util.List < SortCriterion > sortCriteria;

    private SearchAcrossCatalogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogIds = builder.catalogIds;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchText = builder.searchText;
        this.searchTypes = builder.searchTypes;
        this.sortCriteria = builder.sortCriteria;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchAcrossCatalogRequest create() {
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
     * @return catalogIds
     */
    public java.util.List < String > getCatalogIds() {
        return this.catalogIds;
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
     * @return searchTypes
     */
    public java.util.List < String > getSearchTypes() {
        return this.searchTypes;
    }

    /**
     * @return sortCriteria
     */
    public java.util.List < SortCriterion > getSortCriteria() {
        return this.sortCriteria;
    }

    public static final class Builder extends Request.Builder<SearchAcrossCatalogRequest, Builder> {
        private String regionId; 
        private java.util.List < String > catalogIds; 
        private Long pageNumber; 
        private Long pageSize; 
        private String searchText; 
        private java.util.List < String > searchTypes; 
        private java.util.List < SortCriterion > sortCriteria; 

        private Builder() {
            super();
        } 

        private Builder(SearchAcrossCatalogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogIds = request.catalogIds;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchText = request.searchText;
            this.searchTypes = request.searchTypes;
            this.sortCriteria = request.sortCriteria;
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
         * CatalogId数组，为空则搜索所有Catalog
         */
        public Builder catalogIds(java.util.List < String > catalogIds) {
            this.putBodyParameter("CatalogIds", catalogIds);
            this.catalogIds = catalogIds;
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
         * SearchTypes数组，可选值为ALL/CATALOG/DATABASE/TABLE
         */
        public Builder searchTypes(java.util.List < String > searchTypes) {
            this.putBodyParameter("SearchTypes", searchTypes);
            this.searchTypes = searchTypes;
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
        public SearchAcrossCatalogRequest build() {
            return new SearchAcrossCatalogRequest(this);
        } 

    } 

}
