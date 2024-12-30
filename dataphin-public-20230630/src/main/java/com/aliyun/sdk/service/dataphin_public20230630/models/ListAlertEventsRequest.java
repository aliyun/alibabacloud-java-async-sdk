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
 * {@link ListAlertEventsRequest} extends {@link RequestModel}
 *
 * <p>ListAlertEventsRequest</p>
 */
public class ListAlertEventsRequest extends Request {
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

    private ListAlertEventsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertEventsRequest create() {
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

    public static final class Builder extends Request.Builder<ListAlertEventsRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListAlertEventsRequest request) {
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
        public ListAlertEventsRequest build() {
            return new ListAlertEventsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListAlertEventsRequest} extends {@link TeaModel}
     *
     * <p>ListAlertEventsRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertEndTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String alertEndTime;

        @com.aliyun.core.annotation.NameInMap("AlertObjectTypeList")
        private java.util.List<String> alertObjectTypeList;

        @com.aliyun.core.annotation.NameInMap("AlertReasonList")
        private java.util.List<String> alertReasonList;

        @com.aliyun.core.annotation.NameInMap("AlertStartTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String alertStartTime;

        @com.aliyun.core.annotation.NameInMap("BizNameList")
        private java.util.List<String> bizNameList;

        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("MonitoredItemIdList")
        private java.util.List<String> monitoredItemIdList;

        @com.aliyun.core.annotation.NameInMap("Page")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ProjectNameList")
        private java.util.List<String> projectNameList;

        @com.aliyun.core.annotation.NameInMap("SourceSystem")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sourceSystem;

        @com.aliyun.core.annotation.NameInMap("StatusList")
        private java.util.List<String> statusList;

        @com.aliyun.core.annotation.NameInMap("UserIdList")
        private java.util.List<String> userIdList;

        private ListQuery(Builder builder) {
            this.alertEndTime = builder.alertEndTime;
            this.alertObjectTypeList = builder.alertObjectTypeList;
            this.alertReasonList = builder.alertReasonList;
            this.alertStartTime = builder.alertStartTime;
            this.bizNameList = builder.bizNameList;
            this.keyword = builder.keyword;
            this.monitoredItemIdList = builder.monitoredItemIdList;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.projectNameList = builder.projectNameList;
            this.sourceSystem = builder.sourceSystem;
            this.statusList = builder.statusList;
            this.userIdList = builder.userIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListQuery create() {
            return builder().build();
        }

        /**
         * @return alertEndTime
         */
        public String getAlertEndTime() {
            return this.alertEndTime;
        }

        /**
         * @return alertObjectTypeList
         */
        public java.util.List<String> getAlertObjectTypeList() {
            return this.alertObjectTypeList;
        }

        /**
         * @return alertReasonList
         */
        public java.util.List<String> getAlertReasonList() {
            return this.alertReasonList;
        }

        /**
         * @return alertStartTime
         */
        public String getAlertStartTime() {
            return this.alertStartTime;
        }

        /**
         * @return bizNameList
         */
        public java.util.List<String> getBizNameList() {
            return this.bizNameList;
        }

        /**
         * @return keyword
         */
        public String getKeyword() {
            return this.keyword;
        }

        /**
         * @return monitoredItemIdList
         */
        public java.util.List<String> getMonitoredItemIdList() {
            return this.monitoredItemIdList;
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
         * @return projectNameList
         */
        public java.util.List<String> getProjectNameList() {
            return this.projectNameList;
        }

        /**
         * @return sourceSystem
         */
        public String getSourceSystem() {
            return this.sourceSystem;
        }

        /**
         * @return statusList
         */
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

        /**
         * @return userIdList
         */
        public java.util.List<String> getUserIdList() {
            return this.userIdList;
        }

        public static final class Builder {
            private String alertEndTime; 
            private java.util.List<String> alertObjectTypeList; 
            private java.util.List<String> alertReasonList; 
            private String alertStartTime; 
            private java.util.List<String> bizNameList; 
            private String keyword; 
            private java.util.List<String> monitoredItemIdList; 
            private Integer page; 
            private Integer pageSize; 
            private java.util.List<String> projectNameList; 
            private String sourceSystem; 
            private java.util.List<String> statusList; 
            private java.util.List<String> userIdList; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-27 13:47:00</p>
             */
            public Builder alertEndTime(String alertEndTime) {
                this.alertEndTime = alertEndTime;
                return this;
            }

            /**
             * AlertObjectTypeList.
             */
            public Builder alertObjectTypeList(java.util.List<String> alertObjectTypeList) {
                this.alertObjectTypeList = alertObjectTypeList;
                return this;
            }

            /**
             * AlertReasonList.
             */
            public Builder alertReasonList(java.util.List<String> alertReasonList) {
                this.alertReasonList = alertReasonList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-16 00:00:00</p>
             */
            public Builder alertStartTime(String alertStartTime) {
                this.alertStartTime = alertStartTime;
                return this;
            }

            /**
             * BizNameList.
             */
            public Builder bizNameList(java.util.List<String> bizNameList) {
                this.bizNameList = bizNameList;
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
             * MonitoredItemIdList.
             */
            public Builder monitoredItemIdList(java.util.List<String> monitoredItemIdList) {
                this.monitoredItemIdList = monitoredItemIdList;
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
             * <p>10</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder sourceSystem(String sourceSystem) {
                this.sourceSystem = sourceSystem;
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
             * UserIdList.
             */
            public Builder userIdList(java.util.List<String> userIdList) {
                this.userIdList = userIdList;
                return this;
            }

            public ListQuery build() {
                return new ListQuery(this);
            } 

        } 

    }
}
