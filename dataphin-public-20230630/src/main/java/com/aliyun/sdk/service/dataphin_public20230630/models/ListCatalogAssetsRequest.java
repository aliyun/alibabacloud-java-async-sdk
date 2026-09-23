// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListCatalogAssetsRequest} extends {@link RequestModel}
 *
 * <p>ListCatalogAssetsRequest</p>
 */
public class ListCatalogAssetsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListCatalogAssetsQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private ListCatalogAssetsQuery listCatalogAssetsQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private ListCatalogAssetsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listCatalogAssetsQuery = builder.listCatalogAssetsQuery;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCatalogAssetsRequest create() {
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
     * @return listCatalogAssetsQuery
     */
    public ListCatalogAssetsQuery getListCatalogAssetsQuery() {
        return this.listCatalogAssetsQuery;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    public static final class Builder extends Request.Builder<ListCatalogAssetsRequest, Builder> {
        private String regionId; 
        private ListCatalogAssetsQuery listCatalogAssetsQuery; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(ListCatalogAssetsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.listCatalogAssetsQuery = request.listCatalogAssetsQuery;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
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
         * <p>The query parameters.</p>
         * <p>This parameter is required.</p>
         */
        public Builder listCatalogAssetsQuery(ListCatalogAssetsQuery listCatalogAssetsQuery) {
            String listCatalogAssetsQueryShrink = shrink(listCatalogAssetsQuery, "ListCatalogAssetsQuery", "json");
            this.putBodyParameter("ListCatalogAssetsQuery", listCatalogAssetsQueryShrink);
            this.listCatalogAssetsQuery = listCatalogAssetsQuery;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>The ID of the operator user.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public ListCatalogAssetsRequest build() {
            return new ListCatalogAssetsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListCatalogAssetsRequest} extends {@link TeaModel}
     *
     * <p>ListCatalogAssetsRequest</p>
     */
    public static class ListCatalogAssetsQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetType")
        private String assetType;

        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("QueryMode")
        private String queryMode;

        @com.aliyun.core.annotation.NameInMap("ShelveDirectoryIds")
        private java.util.List<Long> shelveDirectoryIds;

        private ListCatalogAssetsQuery(Builder builder) {
            this.assetType = builder.assetType;
            this.keyword = builder.keyword;
            this.name = builder.name;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.queryMode = builder.queryMode;
            this.shelveDirectoryIds = builder.shelveDirectoryIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListCatalogAssetsQuery create() {
            return builder().build();
        }

        /**
         * @return assetType
         */
        public String getAssetType() {
            return this.assetType;
        }

        /**
         * @return keyword
         */
        public String getKeyword() {
            return this.keyword;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return queryMode
         */
        public String getQueryMode() {
            return this.queryMode;
        }

        /**
         * @return shelveDirectoryIds
         */
        public java.util.List<Long> getShelveDirectoryIds() {
            return this.shelveDirectoryIds;
        }

        public static final class Builder {
            private String assetType; 
            private String keyword; 
            private String name; 
            private Integer pageNum; 
            private Integer pageSize; 
            private String queryMode; 
            private java.util.List<Long> shelveDirectoryIds; 

            private Builder() {
            } 

            private Builder(ListCatalogAssetsQuery model) {
                this.assetType = model.assetType;
                this.keyword = model.keyword;
                this.name = model.name;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.queryMode = model.queryMode;
                this.shelveDirectoryIds = model.shelveDirectoryIds;
            } 

            /**
             * <p>The asset type. Default value: TABLE. Valid values:</p>
             * <ul>
             * <li>TABLE: tables, including views and materialized views.</li>
             * <li>INDEX: technical metrics.</li>
             * <li>BIZ_INDEX: business metrics.</li>
             * <li>API</li>
             * <li>PAGE: dashboards.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TABLE</p>
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>The search keyword. Used when queryMode is set to ASSET_SEARCH. Supports keyword matching against the asset full name, asset name, asset display name, and asset description. If not specified, all assets are returned by default.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * <p>The asset name. Used when queryMode is set to EXACT_MATCH. If not specified, all assets are returned by default.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The page number. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The page size. Default value: 10.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The query type. Determines whether to use name for exact match or keyword for fuzzy search. Default value: EXACT_MATCH. Valid values:</p>
             * <ul>
             * <li>EXACT_MATCH: exact match.</li>
             * <li>ASSET_SEARCH: fuzzy search.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EXACT_MATCH</p>
             */
            public Builder queryMode(String queryMode) {
                this.queryMode = queryMode;
                return this;
            }

            /**
             * <p>The list of folder IDs to which the assets belong. Multiple folders are matched with OR logic. Only the specified folders are matched, and subfolders are not included.</p>
             */
            public Builder shelveDirectoryIds(java.util.List<Long> shelveDirectoryIds) {
                this.shelveDirectoryIds = shelveDirectoryIds;
                return this;
            }

            public ListCatalogAssetsQuery build() {
                return new ListCatalogAssetsQuery(this);
            } 

        } 

    }
}
