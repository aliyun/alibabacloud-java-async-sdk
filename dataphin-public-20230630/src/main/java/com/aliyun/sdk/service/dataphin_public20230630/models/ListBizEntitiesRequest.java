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
 * {@link ListBizEntitiesRequest} extends {@link RequestModel}
 *
 * <p>ListBizEntitiesRequest</p>
 */
public class ListBizEntitiesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private ListQuery listQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private ListBizEntitiesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBizEntitiesRequest create() {
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

    public static final class Builder extends Request.Builder<ListBizEntitiesRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListBizEntitiesRequest request) {
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
         * <p>This parameter is required.</p>
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
        public ListBizEntitiesRequest build() {
            return new ListBizEntitiesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListBizEntitiesRequest} extends {@link TeaModel}
     *
     * <p>ListBizEntitiesRequest</p>
     */
    public static class FilterCriteria extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUnitIdList")
        private java.util.List<Long> bizUnitIdList;

        @com.aliyun.core.annotation.NameInMap("BizUnitNameList")
        private java.util.List<String> bizUnitNameList;

        @com.aliyun.core.annotation.NameInMap("DataDomainIdList")
        private java.util.List<Long> dataDomainIdList;

        @com.aliyun.core.annotation.NameInMap("DataDomainNameList")
        private java.util.List<String> dataDomainNameList;

        @com.aliyun.core.annotation.NameInMap("HasTableRef")
        private Boolean hasTableRef;

        @com.aliyun.core.annotation.NameInMap("OwnerUserIdList")
        private java.util.List<String> ownerUserIdList;

        @com.aliyun.core.annotation.NameInMap("StatusList")
        private java.util.List<String> statusList;

        @com.aliyun.core.annotation.NameInMap("SubTypeList")
        private java.util.List<String> subTypeList;

        private FilterCriteria(Builder builder) {
            this.bizUnitIdList = builder.bizUnitIdList;
            this.bizUnitNameList = builder.bizUnitNameList;
            this.dataDomainIdList = builder.dataDomainIdList;
            this.dataDomainNameList = builder.dataDomainNameList;
            this.hasTableRef = builder.hasTableRef;
            this.ownerUserIdList = builder.ownerUserIdList;
            this.statusList = builder.statusList;
            this.subTypeList = builder.subTypeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterCriteria create() {
            return builder().build();
        }

        /**
         * @return bizUnitIdList
         */
        public java.util.List<Long> getBizUnitIdList() {
            return this.bizUnitIdList;
        }

        /**
         * @return bizUnitNameList
         */
        public java.util.List<String> getBizUnitNameList() {
            return this.bizUnitNameList;
        }

        /**
         * @return dataDomainIdList
         */
        public java.util.List<Long> getDataDomainIdList() {
            return this.dataDomainIdList;
        }

        /**
         * @return dataDomainNameList
         */
        public java.util.List<String> getDataDomainNameList() {
            return this.dataDomainNameList;
        }

        /**
         * @return hasTableRef
         */
        public Boolean getHasTableRef() {
            return this.hasTableRef;
        }

        /**
         * @return ownerUserIdList
         */
        public java.util.List<String> getOwnerUserIdList() {
            return this.ownerUserIdList;
        }

        /**
         * @return statusList
         */
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

        /**
         * @return subTypeList
         */
        public java.util.List<String> getSubTypeList() {
            return this.subTypeList;
        }

        public static final class Builder {
            private java.util.List<Long> bizUnitIdList; 
            private java.util.List<String> bizUnitNameList; 
            private java.util.List<Long> dataDomainIdList; 
            private java.util.List<String> dataDomainNameList; 
            private Boolean hasTableRef; 
            private java.util.List<String> ownerUserIdList; 
            private java.util.List<String> statusList; 
            private java.util.List<String> subTypeList; 

            /**
             * BizUnitIdList.
             */
            public Builder bizUnitIdList(java.util.List<Long> bizUnitIdList) {
                this.bizUnitIdList = bizUnitIdList;
                return this;
            }

            /**
             * BizUnitNameList.
             */
            public Builder bizUnitNameList(java.util.List<String> bizUnitNameList) {
                this.bizUnitNameList = bizUnitNameList;
                return this;
            }

            /**
             * DataDomainIdList.
             */
            public Builder dataDomainIdList(java.util.List<Long> dataDomainIdList) {
                this.dataDomainIdList = dataDomainIdList;
                return this;
            }

            /**
             * DataDomainNameList.
             */
            public Builder dataDomainNameList(java.util.List<String> dataDomainNameList) {
                this.dataDomainNameList = dataDomainNameList;
                return this;
            }

            /**
             * HasTableRef.
             */
            public Builder hasTableRef(Boolean hasTableRef) {
                this.hasTableRef = hasTableRef;
                return this;
            }

            /**
             * OwnerUserIdList.
             */
            public Builder ownerUserIdList(java.util.List<String> ownerUserIdList) {
                this.ownerUserIdList = ownerUserIdList;
                return this;
            }

            /**
             * StatusList.
             */
            public Builder statusList(java.util.List<String> statusList) {
                this.statusList = statusList;
                return this;
            }

            /**
             * SubTypeList.
             */
            public Builder subTypeList(java.util.List<String> subTypeList) {
                this.subTypeList = subTypeList;
                return this;
            }

            public FilterCriteria build() {
                return new FilterCriteria(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListBizEntitiesRequest} extends {@link TeaModel}
     *
     * <p>ListBizEntitiesRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FilterCriteria")
        private FilterCriteria filterCriteria;

        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        private ListQuery(Builder builder) {
            this.filterCriteria = builder.filterCriteria;
            this.keyword = builder.keyword;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListQuery create() {
            return builder().build();
        }

        /**
         * @return filterCriteria
         */
        public FilterCriteria getFilterCriteria() {
            return this.filterCriteria;
        }

        /**
         * @return keyword
         */
        public String getKeyword() {
            return this.keyword;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        public static final class Builder {
            private FilterCriteria filterCriteria; 
            private String keyword; 
            private Integer page; 
            private Integer pageSize; 

            /**
             * FilterCriteria.
             */
            public Builder filterCriteria(FilterCriteria filterCriteria) {
                this.filterCriteria = filterCriteria;
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
             * Page.
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            public ListQuery build() {
                return new ListQuery(this);
            } 

        } 

    }
}
