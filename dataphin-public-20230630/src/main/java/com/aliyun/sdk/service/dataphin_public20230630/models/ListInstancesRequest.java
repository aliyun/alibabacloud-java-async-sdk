// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListInstancesRequest</p>
 */
public class ListInstancesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Env")
    private String env;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListQuery")
    private ListQuery listQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private ListInstancesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.env = builder.env;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesRequest create() {
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
     * @return env
     */
    public String getEnv() {
        return this.env;
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

    public static final class Builder extends Request.Builder<ListInstancesRequest, Builder> {
        private String regionId; 
        private String env; 
        private ListQuery listQuery; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListInstancesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.env = request.env;
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
         * Env.
         */
        public Builder env(String env) {
            this.putQueryParameter("Env", env);
            this.env = env;
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
        public ListInstancesRequest build() {
            return new ListInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListInstancesRequest} extends {@link TeaModel}
     *
     * <p>ListInstancesRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        private Long bizUnitId;

        @com.aliyun.core.annotation.NameInMap("MaxBizDate")
        private String maxBizDate;

        @com.aliyun.core.annotation.NameInMap("MaxRunDate")
        private String maxRunDate;

        @com.aliyun.core.annotation.NameInMap("MinBizDate")
        private String minBizDate;

        @com.aliyun.core.annotation.NameInMap("MinRunDate")
        private String minRunDate;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("OwnerList")
        private java.util.List < String > ownerList;

        @com.aliyun.core.annotation.NameInMap("Page")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("PriorityList")
        private java.util.List < String > priorityList;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("RunStatusList")
        private java.util.List < String > runStatusList;

        @com.aliyun.core.annotation.NameInMap("SchedulePaused")
        private Boolean schedulePaused;

        @com.aliyun.core.annotation.NameInMap("SchedulePeriodList")
        private java.util.List < String > schedulePeriodList;

        @com.aliyun.core.annotation.NameInMap("ScheduleType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String scheduleType;

        @com.aliyun.core.annotation.NameInMap("SearchText")
        private String searchText;

        @com.aliyun.core.annotation.NameInMap("SubBizTypeList")
        private java.util.List < String > subBizTypeList;

        private ListQuery(Builder builder) {
            this.bizType = builder.bizType;
            this.bizUnitId = builder.bizUnitId;
            this.maxBizDate = builder.maxBizDate;
            this.maxRunDate = builder.maxRunDate;
            this.minBizDate = builder.minBizDate;
            this.minRunDate = builder.minRunDate;
            this.nodeId = builder.nodeId;
            this.ownerList = builder.ownerList;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.priorityList = builder.priorityList;
            this.projectId = builder.projectId;
            this.runStatusList = builder.runStatusList;
            this.schedulePaused = builder.schedulePaused;
            this.schedulePeriodList = builder.schedulePeriodList;
            this.scheduleType = builder.scheduleType;
            this.searchText = builder.searchText;
            this.subBizTypeList = builder.subBizTypeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListQuery create() {
            return builder().build();
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return bizUnitId
         */
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        /**
         * @return maxBizDate
         */
        public String getMaxBizDate() {
            return this.maxBizDate;
        }

        /**
         * @return maxRunDate
         */
        public String getMaxRunDate() {
            return this.maxRunDate;
        }

        /**
         * @return minBizDate
         */
        public String getMinBizDate() {
            return this.minBizDate;
        }

        /**
         * @return minRunDate
         */
        public String getMinRunDate() {
            return this.minRunDate;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return ownerList
         */
        public java.util.List < String > getOwnerList() {
            return this.ownerList;
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

        /**
         * @return priorityList
         */
        public java.util.List < String > getPriorityList() {
            return this.priorityList;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return runStatusList
         */
        public java.util.List < String > getRunStatusList() {
            return this.runStatusList;
        }

        /**
         * @return schedulePaused
         */
        public Boolean getSchedulePaused() {
            return this.schedulePaused;
        }

        /**
         * @return schedulePeriodList
         */
        public java.util.List < String > getSchedulePeriodList() {
            return this.schedulePeriodList;
        }

        /**
         * @return scheduleType
         */
        public String getScheduleType() {
            return this.scheduleType;
        }

        /**
         * @return searchText
         */
        public String getSearchText() {
            return this.searchText;
        }

        /**
         * @return subBizTypeList
         */
        public java.util.List < String > getSubBizTypeList() {
            return this.subBizTypeList;
        }

        public static final class Builder {
            private String bizType; 
            private Long bizUnitId; 
            private String maxBizDate; 
            private String maxRunDate; 
            private String minBizDate; 
            private String minRunDate; 
            private String nodeId; 
            private java.util.List < String > ownerList; 
            private Integer page; 
            private Integer pageSize; 
            private java.util.List < String > priorityList; 
            private Long projectId; 
            private java.util.List < String > runStatusList; 
            private Boolean schedulePaused; 
            private java.util.List < String > schedulePeriodList; 
            private String scheduleType; 
            private String searchText; 
            private java.util.List < String > subBizTypeList; 

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * BizUnitId.
             */
            public Builder bizUnitId(Long bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * MaxBizDate.
             */
            public Builder maxBizDate(String maxBizDate) {
                this.maxBizDate = maxBizDate;
                return this;
            }

            /**
             * MaxRunDate.
             */
            public Builder maxRunDate(String maxRunDate) {
                this.maxRunDate = maxRunDate;
                return this;
            }

            /**
             * MinBizDate.
             */
            public Builder minBizDate(String minBizDate) {
                this.minBizDate = minBizDate;
                return this;
            }

            /**
             * MinRunDate.
             */
            public Builder minRunDate(String minRunDate) {
                this.minRunDate = minRunDate;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * OwnerList.
             */
            public Builder ownerList(java.util.List < String > ownerList) {
                this.ownerList = ownerList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * PriorityList.
             */
            public Builder priorityList(java.util.List < String > priorityList) {
                this.priorityList = priorityList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>131311111321</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * RunStatusList.
             */
            public Builder runStatusList(java.util.List < String > runStatusList) {
                this.runStatusList = runStatusList;
                return this;
            }

            /**
             * SchedulePaused.
             */
            public Builder schedulePaused(Boolean schedulePaused) {
                this.schedulePaused = schedulePaused;
                return this;
            }

            /**
             * SchedulePeriodList.
             */
            public Builder schedulePeriodList(java.util.List < String > schedulePeriodList) {
                this.schedulePeriodList = schedulePeriodList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder scheduleType(String scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * SearchText.
             */
            public Builder searchText(String searchText) {
                this.searchText = searchText;
                return this;
            }

            /**
             * SubBizTypeList.
             */
            public Builder subBizTypeList(java.util.List < String > subBizTypeList) {
                this.subBizTypeList = subBizTypeList;
                return this;
            }

            public ListQuery build() {
                return new ListQuery(this);
            } 

        } 

    }
}
