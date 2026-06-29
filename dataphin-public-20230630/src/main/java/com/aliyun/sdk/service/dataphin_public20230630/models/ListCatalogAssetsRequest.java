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

    private ListCatalogAssetsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listCatalogAssetsQuery = builder.listCatalogAssetsQuery;
        this.opTenantId = builder.opTenantId;
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

    public static final class Builder extends Request.Builder<ListCatalogAssetsRequest, Builder> {
        private String regionId; 
        private ListCatalogAssetsQuery listCatalogAssetsQuery; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListCatalogAssetsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.listCatalogAssetsQuery = request.listCatalogAssetsQuery;
            this.opTenantId = request.opTenantId;
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
         * <p>This parameter is required.</p>
         */
        public Builder listCatalogAssetsQuery(ListCatalogAssetsQuery listCatalogAssetsQuery) {
            String listCatalogAssetsQueryShrink = shrink(listCatalogAssetsQuery, "ListCatalogAssetsQuery", "json");
            this.putBodyParameter("ListCatalogAssetsQuery", listCatalogAssetsQueryShrink);
            this.listCatalogAssetsQuery = listCatalogAssetsQuery;
            return this;
        }

        /**
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

        private ListCatalogAssetsQuery(Builder builder) {
            this.assetType = builder.assetType;
            this.keyword = builder.keyword;
            this.name = builder.name;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.queryMode = builder.queryMode;
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

        public static final class Builder {
            private String assetType; 
            private String keyword; 
            private String name; 
            private Integer pageNum; 
            private Integer pageSize; 
            private String queryMode; 

            private Builder() {
            } 

            private Builder(ListCatalogAssetsQuery model) {
                this.assetType = model.assetType;
                this.keyword = model.keyword;
                this.name = model.name;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.queryMode = model.queryMode;
            } 

            /**
             * AssetType.
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * Keyword.
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * QueryMode.
             */
            public Builder queryMode(String queryMode) {
                this.queryMode = queryMode;
                return this;
            }

            public ListCatalogAssetsQuery build() {
                return new ListCatalogAssetsQuery(this);
            } 

        } 

    }
}
