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
 * {@link ListQualityTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListQualityTemplatesRequest</p>
 */
public class ListQualityTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListQuery")
    private ListQuery listQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private ListQualityTemplatesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQualityTemplatesRequest create() {
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
     * @return listQuery
     */
    public ListQuery getListQuery() {
        return this.listQuery;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<ListQualityTemplatesRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListQualityTemplatesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.listQuery = request.listQuery;
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
         * ListQuery.
         */
        public Builder listQuery(ListQuery listQuery) {
            String listQueryShrink = shrink(listQuery, "ListQuery", "json");
            this.putBodyParameter("ListQuery", listQueryShrink);
            this.listQuery = listQuery;
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
        public ListQualityTemplatesRequest build() {
            return new ListQualityTemplatesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListQualityTemplatesRequest} extends {@link TeaModel}
     *
     * <p>ListQualityTemplatesRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CatalogList")
        private java.util.List<String> catalogList;

        @com.aliyun.core.annotation.NameInMap("CurrentUserOwned")
        private Boolean currentUserOwned;

        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("SupportDataSourceTypeList")
        private java.util.List<String> supportDataSourceTypeList;

        @com.aliyun.core.annotation.NameInMap("TemplateOwnerList")
        private java.util.List<String> templateOwnerList;

        @com.aliyun.core.annotation.NameInMap("TemplateSourceList")
        private java.util.List<String> templateSourceList;

        @com.aliyun.core.annotation.NameInMap("TemplateTypeList")
        private java.util.List<String> templateTypeList;

        @com.aliyun.core.annotation.NameInMap("WatchTypeList")
        private java.util.List<String> watchTypeList;

        private ListQuery(Builder builder) {
            this.catalogList = builder.catalogList;
            this.currentUserOwned = builder.currentUserOwned;
            this.keyword = builder.keyword;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.supportDataSourceTypeList = builder.supportDataSourceTypeList;
            this.templateOwnerList = builder.templateOwnerList;
            this.templateSourceList = builder.templateSourceList;
            this.templateTypeList = builder.templateTypeList;
            this.watchTypeList = builder.watchTypeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListQuery create() {
            return builder().build();
        }

        /**
         * @return catalogList
         */
        public java.util.List<String> getCatalogList() {
            return this.catalogList;
        }

        /**
         * @return currentUserOwned
         */
        public Boolean getCurrentUserOwned() {
            return this.currentUserOwned;
        }

        /**
         * @return keyword
         */
        public String getKeyword() {
            return this.keyword;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return supportDataSourceTypeList
         */
        public java.util.List<String> getSupportDataSourceTypeList() {
            return this.supportDataSourceTypeList;
        }

        /**
         * @return templateOwnerList
         */
        public java.util.List<String> getTemplateOwnerList() {
            return this.templateOwnerList;
        }

        /**
         * @return templateSourceList
         */
        public java.util.List<String> getTemplateSourceList() {
            return this.templateSourceList;
        }

        /**
         * @return templateTypeList
         */
        public java.util.List<String> getTemplateTypeList() {
            return this.templateTypeList;
        }

        /**
         * @return watchTypeList
         */
        public java.util.List<String> getWatchTypeList() {
            return this.watchTypeList;
        }

        public static final class Builder {
            private java.util.List<String> catalogList; 
            private Boolean currentUserOwned; 
            private String keyword; 
            private Integer pageNo; 
            private Integer pageSize; 
            private java.util.List<String> supportDataSourceTypeList; 
            private java.util.List<String> templateOwnerList; 
            private java.util.List<String> templateSourceList; 
            private java.util.List<String> templateTypeList; 
            private java.util.List<String> watchTypeList; 

            private Builder() {
            } 

            private Builder(ListQuery model) {
                this.catalogList = model.catalogList;
                this.currentUserOwned = model.currentUserOwned;
                this.keyword = model.keyword;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.supportDataSourceTypeList = model.supportDataSourceTypeList;
                this.templateOwnerList = model.templateOwnerList;
                this.templateSourceList = model.templateSourceList;
                this.templateTypeList = model.templateTypeList;
                this.watchTypeList = model.watchTypeList;
            } 

            /**
             * CatalogList.
             */
            public Builder catalogList(java.util.List<String> catalogList) {
                this.catalogList = catalogList;
                return this;
            }

            /**
             * CurrentUserOwned.
             */
            public Builder currentUserOwned(Boolean currentUserOwned) {
                this.currentUserOwned = currentUserOwned;
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
             * PageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
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
             * SupportDataSourceTypeList.
             */
            public Builder supportDataSourceTypeList(java.util.List<String> supportDataSourceTypeList) {
                this.supportDataSourceTypeList = supportDataSourceTypeList;
                return this;
            }

            /**
             * TemplateOwnerList.
             */
            public Builder templateOwnerList(java.util.List<String> templateOwnerList) {
                this.templateOwnerList = templateOwnerList;
                return this;
            }

            /**
             * TemplateSourceList.
             */
            public Builder templateSourceList(java.util.List<String> templateSourceList) {
                this.templateSourceList = templateSourceList;
                return this;
            }

            /**
             * TemplateTypeList.
             */
            public Builder templateTypeList(java.util.List<String> templateTypeList) {
                this.templateTypeList = templateTypeList;
                return this;
            }

            /**
             * WatchTypeList.
             */
            public Builder watchTypeList(java.util.List<String> watchTypeList) {
                this.watchTypeList = watchTypeList;
                return this;
            }

            public ListQuery build() {
                return new ListQuery(this);
            } 

        } 

    }
}
