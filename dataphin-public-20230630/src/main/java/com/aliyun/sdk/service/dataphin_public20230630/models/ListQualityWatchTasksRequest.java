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
 * {@link ListQualityWatchTasksRequest} extends {@link RequestModel}
 *
 * <p>ListQualityWatchTasksRequest</p>
 */
public class ListQualityWatchTasksRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private ListQualityWatchTasksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQualityWatchTasksRequest create() {
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

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    public static final class Builder extends Request.Builder<ListQualityWatchTasksRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(ListQualityWatchTasksRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.listQuery = request.listQuery;
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
         * <p>The paged query conditions.</p>
         */
        public Builder listQuery(ListQuery listQuery) {
            String listQueryShrink = shrink(listQuery, "ListQuery", "json");
            this.putBodyParameter("ListQuery", listQueryShrink);
            this.listQuery = listQuery;
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
         * <p>The ID of the operator.</p>
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
        public ListQualityWatchTasksRequest build() {
            return new ListQualityWatchTasksRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListQualityWatchTasksRequest} extends {@link TeaModel}
     *
     * <p>ListQualityWatchTasksRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizDate")
        private String bizDate;

        @com.aliyun.core.annotation.NameInMap("BizUnitNameList")
        private java.util.List<String> bizUnitNameList;

        @com.aliyun.core.annotation.NameInMap("CurrentUserOwned")
        private Boolean currentUserOwned;

        @com.aliyun.core.annotation.NameInMap("DataSourceIdList")
        private java.util.List<String> dataSourceIdList;

        @com.aliyun.core.annotation.NameInMap("DataSourceOwnerList")
        private java.util.List<String> dataSourceOwnerList;

        @com.aliyun.core.annotation.NameInMap("DataSourceScopeList")
        private java.util.List<String> dataSourceScopeList;

        @com.aliyun.core.annotation.NameInMap("DataSourceTypeList")
        private java.util.List<String> dataSourceTypeList;

        @com.aliyun.core.annotation.NameInMap("ErrorRuleStrengthList")
        private java.util.List<String> errorRuleStrengthList;

        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

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
            this.bizDate = builder.bizDate;
            this.bizUnitNameList = builder.bizUnitNameList;
            this.currentUserOwned = builder.currentUserOwned;
            this.dataSourceIdList = builder.dataSourceIdList;
            this.dataSourceOwnerList = builder.dataSourceOwnerList;
            this.dataSourceScopeList = builder.dataSourceScopeList;
            this.dataSourceTypeList = builder.dataSourceTypeList;
            this.errorRuleStrengthList = builder.errorRuleStrengthList;
            this.keyword = builder.keyword;
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
         * @return bizDate
         */
        public String getBizDate() {
            return this.bizDate;
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
        public java.util.List<String> getDataSourceIdList() {
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
         * @return errorRuleStrengthList
         */
        public java.util.List<String> getErrorRuleStrengthList() {
            return this.errorRuleStrengthList;
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
            private String bizDate; 
            private java.util.List<String> bizUnitNameList; 
            private Boolean currentUserOwned; 
            private java.util.List<String> dataSourceIdList; 
            private java.util.List<String> dataSourceOwnerList; 
            private java.util.List<String> dataSourceScopeList; 
            private java.util.List<String> dataSourceTypeList; 
            private java.util.List<String> errorRuleStrengthList; 
            private String keyword; 
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
                this.bizDate = model.bizDate;
                this.bizUnitNameList = model.bizUnitNameList;
                this.currentUserOwned = model.currentUserOwned;
                this.dataSourceIdList = model.dataSourceIdList;
                this.dataSourceOwnerList = model.dataSourceOwnerList;
                this.dataSourceScopeList = model.dataSourceScopeList;
                this.dataSourceTypeList = model.dataSourceTypeList;
                this.errorRuleStrengthList = model.errorRuleStrengthList;
                this.keyword = model.keyword;
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
             * <p>The business date filter.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30</p>
             */
            public Builder bizDate(String bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * <p>The name of the business unit to which the object belongs.</p>
             */
            public Builder bizUnitNameList(java.util.List<String> bizUnitNameList) {
                this.bizUnitNameList = bizUnitNameList;
                return this;
            }

            /**
             * <p>Specifies whether to query only the watchtask objects owned by the current user.</p>
             */
            public Builder currentUserOwned(Boolean currentUserOwned) {
                this.currentUserOwned = currentUserOwned;
                return this;
            }

            /**
             * <p>The data source ID.</p>
             */
            public Builder dataSourceIdList(java.util.List<String> dataSourceIdList) {
                this.dataSourceIdList = dataSourceIdList;
                return this;
            }

            /**
             * <p>The data source owner.</p>
             */
            public Builder dataSourceOwnerList(java.util.List<String> dataSourceOwnerList) {
                this.dataSourceOwnerList = dataSourceOwnerList;
                return this;
            }

            /**
             * <p>The data source scope. Valid values:</p>
             * <ul>
             * <li>STREAMING: real-time only.</li>
             * <li>OFFLINE: offline only.</li>
             * <li>ALL: real-time and offline.</li>
             * </ul>
             */
            public Builder dataSourceScopeList(java.util.List<String> dataSourceScopeList) {
                this.dataSourceScopeList = dataSourceScopeList;
                return this;
            }

            /**
             * <p>The data source type, such as MAX_COMPUTE, HADOOP, or MYSQL.</p>
             */
            public Builder dataSourceTypeList(java.util.List<String> dataSourceTypeList) {
                this.dataSourceTypeList = dataSourceTypeList;
                return this;
            }

            /**
             * <p>The rule exception type. Valid values:</p>
             * <ul>
             * <li>STRONG: strong.</li>
             * <li>WEAK: weak.</li>
             * </ul>
             */
            public Builder errorRuleStrengthList(java.util.List<String> errorRuleStrengthList) {
                this.errorRuleStrengthList = errorRuleStrengthList;
                return this;
            }

            /**
             * <p>The search keyword. This parameter specifies the name of the monitored table.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * <p>The page number. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The number of entries per page. Default value: 20.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The name of the project to which the object belongs.</p>
             */
            public Builder projectNameList(java.util.List<String> projectNameList) {
                this.projectNameList = projectNameList;
                return this;
            }

            /**
             * <p>The quality owner.</p>
             */
            public Builder qualityOwnerList(java.util.List<String> qualityOwnerList) {
                this.qualityOwnerList = qualityOwnerList;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>NOT_RUN: not executed.</li>
             * <li>WAITING: waiting.</li>
             * <li>RUNNING: running.</li>
             * <li>SUCCESS: succeeded.</li>
             * <li>FAILED: failed.</li>
             * <li>CANCEL: canceled.</li>
             * <li>TIMEOUT: timed out.</li>
             * <li>OFFLINE: offline.</li>
             * </ul>
             */
            public Builder statusList(java.util.List<String> statusList) {
                this.statusList = statusList;
                return this;
            }

            /**
             * <p>The table owner.</p>
             */
            public Builder tableOwnerList(java.util.List<String> tableOwnerList) {
                this.tableOwnerList = tableOwnerList;
                return this;
            }

            /**
             * <p>The table type. Valid values:</p>
             * <ul>
             * <li>LOGIC_DIM_TABLE: logical dimension table.</li>
             * <li>LOGIC_FACT_TABLE: logical fact table.</li>
             * <li>LOGIC_SUM_TABLE: logical aggregate table.</li>
             * <li>LOGIC_LABEL_TABLE: logical label table.</li>
             * <li>PHYSICAL_TABLE: physical table.</li>
             * <li>REALTIME_LOGICAL_TABLE: real-time meta table.</li>
             * </ul>
             */
            public Builder tableTypeList(java.util.List<String> tableTypeList) {
                this.tableTypeList = tableTypeList;
                return this;
            }

            /**
             * <p>The monitored object type. Valid values:</p>
             * <ul>
             * <li>TABLE: Dataphin table.</li>
             * <li>DATASOURCE_TABLE: global domain table.</li>
             * <li>DATASOURCE: data source.</li>
             * <li>INDEX: metric.</li>
             * <li>REALTIME_LOGICAL_TABLE: real-time meta table.</li>
             * </ul>
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
