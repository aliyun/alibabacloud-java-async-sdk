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
 * {@link ListAlertNotificationsRequest} extends {@link RequestModel}
 *
 * <p>ListAlertNotificationsRequest</p>
 */
public class ListAlertNotificationsRequest extends Request {
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

    private ListAlertNotificationsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertNotificationsRequest create() {
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

    public static final class Builder extends Request.Builder<ListAlertNotificationsRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(ListAlertNotificationsRequest request) {
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
         * <p>The query conditions.</p>
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
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public ListAlertNotificationsRequest build() {
            return new ListAlertNotificationsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListAlertNotificationsRequest} extends {@link TeaModel}
     *
     * <p>ListAlertNotificationsRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertReasonList")
        private java.util.List<String> alertReasonList;

        @com.aliyun.core.annotation.NameInMap("ChannelTypeList")
        private java.util.List<String> channelTypeList;

        @com.aliyun.core.annotation.NameInMap("CustomChannelIdList")
        private java.util.List<String> customChannelIdList;

        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("MonitoredItemIdList")
        private java.util.List<String> monitoredItemIdList;

        @com.aliyun.core.annotation.NameInMap("NotifyEndTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String notifyEndTime;

        @com.aliyun.core.annotation.NameInMap("NotifyStartTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String notifyStartTime;

        @com.aliyun.core.annotation.NameInMap("Page")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("SourceSystem")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sourceSystem;

        @com.aliyun.core.annotation.NameInMap("StatusList")
        private java.util.List<String> statusList;

        @com.aliyun.core.annotation.NameInMap("UserIdList")
        private java.util.List<String> userIdList;

        private ListQuery(Builder builder) {
            this.alertReasonList = builder.alertReasonList;
            this.channelTypeList = builder.channelTypeList;
            this.customChannelIdList = builder.customChannelIdList;
            this.keyword = builder.keyword;
            this.monitoredItemIdList = builder.monitoredItemIdList;
            this.notifyEndTime = builder.notifyEndTime;
            this.notifyStartTime = builder.notifyStartTime;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
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
         * @return alertReasonList
         */
        public java.util.List<String> getAlertReasonList() {
            return this.alertReasonList;
        }

        /**
         * @return channelTypeList
         */
        public java.util.List<String> getChannelTypeList() {
            return this.channelTypeList;
        }

        /**
         * @return customChannelIdList
         */
        public java.util.List<String> getCustomChannelIdList() {
            return this.customChannelIdList;
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
         * @return notifyEndTime
         */
        public String getNotifyEndTime() {
            return this.notifyEndTime;
        }

        /**
         * @return notifyStartTime
         */
        public String getNotifyStartTime() {
            return this.notifyStartTime;
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
            private java.util.List<String> alertReasonList; 
            private java.util.List<String> channelTypeList; 
            private java.util.List<String> customChannelIdList; 
            private String keyword; 
            private java.util.List<String> monitoredItemIdList; 
            private String notifyEndTime; 
            private String notifyStartTime; 
            private Integer page; 
            private Integer pageSize; 
            private String sourceSystem; 
            private java.util.List<String> statusList; 
            private java.util.List<String> userIdList; 

            private Builder() {
            } 

            private Builder(ListQuery model) {
                this.alertReasonList = model.alertReasonList;
                this.channelTypeList = model.channelTypeList;
                this.customChannelIdList = model.customChannelIdList;
                this.keyword = model.keyword;
                this.monitoredItemIdList = model.monitoredItemIdList;
                this.notifyEndTime = model.notifyEndTime;
                this.notifyStartTime = model.notifyStartTime;
                this.page = model.page;
                this.pageSize = model.pageSize;
                this.sourceSystem = model.sourceSystem;
                this.statusList = model.statusList;
                this.userIdList = model.userIdList;
            } 

            /**
             * <p>The list of alert reasons.</p>
             */
            public Builder alertReasonList(java.util.List<String> alertReasonList) {
                this.alertReasonList = alertReasonList;
                return this;
            }

            /**
             * <p>The list of push channel types.</p>
             */
            public Builder channelTypeList(java.util.List<String> channelTypeList) {
                this.channelTypeList = channelTypeList;
                return this;
            }

            /**
             * <p>The list of custom message channel IDs.</p>
             */
            public Builder customChannelIdList(java.util.List<String> customChannelIdList) {
                this.customChannelIdList = customChannelIdList;
                return this;
            }

            /**
             * <p>The keyword for the query.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * <p>The list of monitored item IDs.</p>
             */
            public Builder monitoredItemIdList(java.util.List<String> monitoredItemIdList) {
                this.monitoredItemIdList = monitoredItemIdList;
                return this;
            }

            /**
             * <p>The end time of the push.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-27 13:47:00</p>
             */
            public Builder notifyEndTime(String notifyEndTime) {
                this.notifyEndTime = notifyEndTime;
                return this;
            }

            /**
             * <p>The start time of the push.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-16 00:00:00</p>
             */
            public Builder notifyStartTime(String notifyStartTime) {
                this.notifyStartTime = notifyStartTime;
                return this;
            }

            /**
             * <p>The page number.</p>
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
             * <p>The number of records per page.</p>
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
             * <p>The source system. Valid values:</p>
             * <ul>
             * <li>ALL: all.</li>
             * <li>DQE: data quality.</li>
             * <li>OS: data service.</li>
             * <li>STREAM: real-time computing.</li>
             * <li>VDM_BATCH: offline computing.</li>
             * <li>SOP: O&amp;M platform.</li>
             * <li>REAL_TIME_PIPELINE: real-time integration.</li>
             * <li>KGB: baseline monitoring.</li>
             * </ul>
             * <p>And more.</p>
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
             * <p>The list of push statuses.</p>
             */
            public Builder statusList(java.util.List<String> statusList) {
                this.statusList = statusList;
                return this;
            }

            /**
             * <p>The list of push recipient IDs.</p>
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
