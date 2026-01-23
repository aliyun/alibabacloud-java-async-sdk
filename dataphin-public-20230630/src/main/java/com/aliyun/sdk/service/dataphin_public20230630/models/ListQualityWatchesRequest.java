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
 * {@link ListQualityWatchesRequest} extends {@link RequestModel}
 *
 * <p>ListQualityWatchesRequest</p>
 */
public class ListQualityWatchesRequest extends Request {
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

    private ListQualityWatchesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQualityWatchesRequest create() {
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

    public static final class Builder extends Request.Builder<ListQualityWatchesRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListQualityWatchesRequest request) {
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
        public ListQualityWatchesRequest build() {
            return new ListQualityWatchesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListQualityWatchesRequest} extends {@link TeaModel}
     *
     * <p>ListQualityWatchesRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUnitNameList")
        private java.util.List<String> bizUnitNameList;

        @com.aliyun.core.annotation.NameInMap("CurrentUserOwned")
        private Boolean currentUserOwned;

        @com.aliyun.core.annotation.NameInMap("DataSourceIdList")
        private java.util.List<Long> dataSourceIdList;

        @com.aliyun.core.annotation.NameInMap("DataSourceOwnerList")
        private java.util.List<String> dataSourceOwnerList;

        @com.aliyun.core.annotation.NameInMap("DataSourceScopeList")
        private java.util.List<String> dataSourceScopeList;

        @com.aliyun.core.annotation.NameInMap("DataSourceTypeList")
        private java.util.List<String> dataSourceTypeList;

        @com.aliyun.core.annotation.NameInMap("IndexComputeTypeList")
        private java.util.List<String> indexComputeTypeList;

        @com.aliyun.core.annotation.NameInMap("IndexOwnerList")
        private java.util.List<String> indexOwnerList;

        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("LatestWatchTaskStatusList")
        private java.util.List<String> latestWatchTaskStatusList;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ProjectNameList")
        private java.util.List<String> projectNameList;

        @com.aliyun.core.annotation.NameInMap("QualityOwnerList")
        private java.util.List<String> qualityOwnerList;

        @com.aliyun.core.annotation.NameInMap("StatusList")
        private java.util.List<String> statusList;

        @com.aliyun.core.annotation.NameInMap("TableOwnerList")
        private java.util.List<String> tableOwnerList;

        @com.aliyun.core.annotation.NameInMap("TableTypeList")
        private java.util.List<String> tableTypeList;

        @com.aliyun.core.annotation.NameInMap("WatchTypeList")
        private java.util.List<String> watchTypeList;

        private ListQuery(Builder builder) {
            this.bizUnitNameList = builder.bizUnitNameList;
            this.currentUserOwned = builder.currentUserOwned;
            this.dataSourceIdList = builder.dataSourceIdList;
            this.dataSourceOwnerList = builder.dataSourceOwnerList;
            this.dataSourceScopeList = builder.dataSourceScopeList;
            this.dataSourceTypeList = builder.dataSourceTypeList;
            this.indexComputeTypeList = builder.indexComputeTypeList;
            this.indexOwnerList = builder.indexOwnerList;
            this.keyword = builder.keyword;
            this.latestWatchTaskStatusList = builder.latestWatchTaskStatusList;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.projectNameList = builder.projectNameList;
            this.qualityOwnerList = builder.qualityOwnerList;
            this.statusList = builder.statusList;
            this.tableOwnerList = builder.tableOwnerList;
            this.tableTypeList = builder.tableTypeList;
            this.watchTypeList = builder.watchTypeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListQuery create() {
            return builder().build();
        }

        /**
         * @return bizUnitNameList
         */
        public java.util.List<String> getBizUnitNameList() {
            return this.bizUnitNameList;
        }

        /**
         * @return currentUserOwned
         */
        public Boolean getCurrentUserOwned() {
            return this.currentUserOwned;
        }

        /**
         * @return dataSourceIdList
         */
        public java.util.List<Long> getDataSourceIdList() {
            return this.dataSourceIdList;
        }

        /**
         * @return dataSourceOwnerList
         */
        public java.util.List<String> getDataSourceOwnerList() {
            return this.dataSourceOwnerList;
        }

        /**
         * @return dataSourceScopeList
         */
        public java.util.List<String> getDataSourceScopeList() {
            return this.dataSourceScopeList;
        }

        /**
         * @return dataSourceTypeList
         */
        public java.util.List<String> getDataSourceTypeList() {
            return this.dataSourceTypeList;
        }

        /**
         * @return indexComputeTypeList
         */
        public java.util.List<String> getIndexComputeTypeList() {
            return this.indexComputeTypeList;
        }

        /**
         * @return indexOwnerList
         */
        public java.util.List<String> getIndexOwnerList() {
            return this.indexOwnerList;
        }

        /**
         * @return keyword
         */
        public String getKeyword() {
            return this.keyword;
        }

        /**
         * @return latestWatchTaskStatusList
         */
        public java.util.List<String> getLatestWatchTaskStatusList() {
            return this.latestWatchTaskStatusList;
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
         * @return projectNameList
         */
        public java.util.List<String> getProjectNameList() {
            return this.projectNameList;
        }

        /**
         * @return qualityOwnerList
         */
        public java.util.List<String> getQualityOwnerList() {
            return this.qualityOwnerList;
        }

        /**
         * @return statusList
         */
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

        /**
         * @return tableOwnerList
         */
        public java.util.List<String> getTableOwnerList() {
            return this.tableOwnerList;
        }

        /**
         * @return tableTypeList
         */
        public java.util.List<String> getTableTypeList() {
            return this.tableTypeList;
        }

        /**
         * @return watchTypeList
         */
        public java.util.List<String> getWatchTypeList() {
            return this.watchTypeList;
        }

        public static final class Builder {
            private java.util.List<String> bizUnitNameList; 
            private Boolean currentUserOwned; 
            private java.util.List<Long> dataSourceIdList; 
            private java.util.List<String> dataSourceOwnerList; 
            private java.util.List<String> dataSourceScopeList; 
            private java.util.List<String> dataSourceTypeList; 
            private java.util.List<String> indexComputeTypeList; 
            private java.util.List<String> indexOwnerList; 
            private String keyword; 
            private java.util.List<String> latestWatchTaskStatusList; 
            private Integer pageNo; 
            private Integer pageSize; 
            private java.util.List<String> projectNameList; 
            private java.util.List<String> qualityOwnerList; 
            private java.util.List<String> statusList; 
            private java.util.List<String> tableOwnerList; 
            private java.util.List<String> tableTypeList; 
            private java.util.List<String> watchTypeList; 

            private Builder() {
            } 

            private Builder(ListQuery model) {
                this.bizUnitNameList = model.bizUnitNameList;
                this.currentUserOwned = model.currentUserOwned;
                this.dataSourceIdList = model.dataSourceIdList;
                this.dataSourceOwnerList = model.dataSourceOwnerList;
                this.dataSourceScopeList = model.dataSourceScopeList;
                this.dataSourceTypeList = model.dataSourceTypeList;
                this.indexComputeTypeList = model.indexComputeTypeList;
                this.indexOwnerList = model.indexOwnerList;
                this.keyword = model.keyword;
                this.latestWatchTaskStatusList = model.latestWatchTaskStatusList;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.projectNameList = model.projectNameList;
                this.qualityOwnerList = model.qualityOwnerList;
                this.statusList = model.statusList;
                this.tableOwnerList = model.tableOwnerList;
                this.tableTypeList = model.tableTypeList;
                this.watchTypeList = model.watchTypeList;
            } 

            /**
             * BizUnitNameList.
             */
            public Builder bizUnitNameList(java.util.List<String> bizUnitNameList) {
                this.bizUnitNameList = bizUnitNameList;
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
             * DataSourceIdList.
             */
            public Builder dataSourceIdList(java.util.List<Long> dataSourceIdList) {
                this.dataSourceIdList = dataSourceIdList;
                return this;
            }

            /**
             * DataSourceOwnerList.
             */
            public Builder dataSourceOwnerList(java.util.List<String> dataSourceOwnerList) {
                this.dataSourceOwnerList = dataSourceOwnerList;
                return this;
            }

            /**
             * DataSourceScopeList.
             */
            public Builder dataSourceScopeList(java.util.List<String> dataSourceScopeList) {
                this.dataSourceScopeList = dataSourceScopeList;
                return this;
            }

            /**
             * DataSourceTypeList.
             */
            public Builder dataSourceTypeList(java.util.List<String> dataSourceTypeList) {
                this.dataSourceTypeList = dataSourceTypeList;
                return this;
            }

            /**
             * IndexComputeTypeList.
             */
            public Builder indexComputeTypeList(java.util.List<String> indexComputeTypeList) {
                this.indexComputeTypeList = indexComputeTypeList;
                return this;
            }

            /**
             * IndexOwnerList.
             */
            public Builder indexOwnerList(java.util.List<String> indexOwnerList) {
                this.indexOwnerList = indexOwnerList;
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
             * LatestWatchTaskStatusList.
             */
            public Builder latestWatchTaskStatusList(java.util.List<String> latestWatchTaskStatusList) {
                this.latestWatchTaskStatusList = latestWatchTaskStatusList;
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
             * ProjectNameList.
             */
            public Builder projectNameList(java.util.List<String> projectNameList) {
                this.projectNameList = projectNameList;
                return this;
            }

            /**
             * QualityOwnerList.
             */
            public Builder qualityOwnerList(java.util.List<String> qualityOwnerList) {
                this.qualityOwnerList = qualityOwnerList;
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
             * TableOwnerList.
             */
            public Builder tableOwnerList(java.util.List<String> tableOwnerList) {
                this.tableOwnerList = tableOwnerList;
                return this;
            }

            /**
             * TableTypeList.
             */
            public Builder tableTypeList(java.util.List<String> tableTypeList) {
                this.tableTypeList = tableTypeList;
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
