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
 * {@link ListNodesRequest} extends {@link RequestModel}
 *
 * <p>ListNodesRequest</p>
 */
public class ListNodesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Env")
    private String env;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private ListQuery listQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private ListNodesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.env = builder.env;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodesRequest create() {
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

    public static final class Builder extends Request.Builder<ListNodesRequest, Builder> {
        private String regionId; 
        private String env; 
        private ListQuery listQuery; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListNodesRequest request) {
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
        public ListNodesRequest build() {
            return new ListNodesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListNodesRequest} extends {@link TeaModel}
     *
     * <p>ListNodesRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DryRun")
        private Boolean dryRun;

        @com.aliyun.core.annotation.NameInMap("NodeBizType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nodeBizType;

        @com.aliyun.core.annotation.NameInMap("NodeSubBizTypeList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> nodeSubBizTypeList;

        @com.aliyun.core.annotation.NameInMap("OwnerList")
        private java.util.List<String> ownerList;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("PriorityList")
        private java.util.List<String> priorityList;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("SchedulePaused")
        private Boolean schedulePaused;

        @com.aliyun.core.annotation.NameInMap("SchedulePeriodList")
        private java.util.List<String> schedulePeriodList;

        @com.aliyun.core.annotation.NameInMap("ScheduleType")
        private String scheduleType;

        @com.aliyun.core.annotation.NameInMap("SearchText")
        private String searchText;

        private ListQuery(Builder builder) {
            this.dryRun = builder.dryRun;
            this.nodeBizType = builder.nodeBizType;
            this.nodeSubBizTypeList = builder.nodeSubBizTypeList;
            this.ownerList = builder.ownerList;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.priorityList = builder.priorityList;
            this.projectId = builder.projectId;
            this.schedulePaused = builder.schedulePaused;
            this.schedulePeriodList = builder.schedulePeriodList;
            this.scheduleType = builder.scheduleType;
            this.searchText = builder.searchText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListQuery create() {
            return builder().build();
        }

        /**
         * @return dryRun
         */
        public Boolean getDryRun() {
            return this.dryRun;
        }

        /**
         * @return nodeBizType
         */
        public String getNodeBizType() {
            return this.nodeBizType;
        }

        /**
         * @return nodeSubBizTypeList
         */
        public java.util.List<String> getNodeSubBizTypeList() {
            return this.nodeSubBizTypeList;
        }

        /**
         * @return ownerList
         */
        public java.util.List<String> getOwnerList() {
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
        public java.util.List<String> getPriorityList() {
            return this.priorityList;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
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
        public java.util.List<String> getSchedulePeriodList() {
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

        public static final class Builder {
            private Boolean dryRun; 
            private String nodeBizType; 
            private java.util.List<String> nodeSubBizTypeList; 
            private java.util.List<String> ownerList; 
            private Integer page; 
            private Integer pageSize; 
            private java.util.List<String> priorityList; 
            private Long projectId; 
            private Boolean schedulePaused; 
            private java.util.List<String> schedulePeriodList; 
            private String scheduleType; 
            private String searchText; 

            private Builder() {
            } 

            private Builder(ListQuery model) {
                this.dryRun = model.dryRun;
                this.nodeBizType = model.nodeBizType;
                this.nodeSubBizTypeList = model.nodeSubBizTypeList;
                this.ownerList = model.ownerList;
                this.page = model.page;
                this.pageSize = model.pageSize;
                this.priorityList = model.priorityList;
                this.projectId = model.projectId;
                this.schedulePaused = model.schedulePaused;
                this.schedulePeriodList = model.schedulePeriodList;
                this.scheduleType = model.scheduleType;
                this.searchText = model.searchText;
            } 

            /**
             * DryRun.
             */
            public Builder dryRun(Boolean dryRun) {
                this.dryRun = dryRun;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SCRIPT</p>
             */
            public Builder nodeBizType(String nodeBizType) {
                this.nodeBizType = nodeBizType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder nodeSubBizTypeList(java.util.List<String> nodeSubBizTypeList) {
                this.nodeSubBizTypeList = nodeSubBizTypeList;
                return this;
            }

            /**
             * OwnerList.
             */
            public Builder ownerList(java.util.List<String> ownerList) {
                this.ownerList = ownerList;
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

            /**
             * PriorityList.
             */
            public Builder priorityList(java.util.List<String> priorityList) {
                this.priorityList = priorityList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12111</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
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
            public Builder schedulePeriodList(java.util.List<String> schedulePeriodList) {
                this.schedulePeriodList = schedulePeriodList;
                return this;
            }

            /**
             * ScheduleType.
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

            public ListQuery build() {
                return new ListQuery(this);
            } 

        } 

    }
}
