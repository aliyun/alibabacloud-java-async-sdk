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
 * {@link ListScheduleMonitorRequest} extends {@link RequestModel}
 *
 * <p>ListScheduleMonitorRequest</p>
 */
public class ListScheduleMonitorRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private ListScheduleMonitorRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScheduleMonitorRequest create() {
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

    public static final class Builder extends Request.Builder<ListScheduleMonitorRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(ListScheduleMonitorRequest request) {
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
         * <p>The query conditions for scheduling monitoring and alerting.</p>
         * <p>This parameter is required.</p>
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
         * <p>The user ID of the operator.</p>
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
        public ListScheduleMonitorRequest build() {
            return new ListScheduleMonitorRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListScheduleMonitorRequest} extends {@link TeaModel}
     *
     * <p>ListScheduleMonitorRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertReasonList")
        private java.util.List<String> alertReasonList;

        @com.aliyun.core.annotation.NameInMap("KeyWord")
        private String keyWord;

        @com.aliyun.core.annotation.NameInMap("LogicFieldIdList")
        private java.util.List<Long> logicFieldIdList;

        @com.aliyun.core.annotation.NameInMap("LogicalTableIdList")
        private java.util.List<Long> logicalTableIdList;

        @com.aliyun.core.annotation.NameInMap("OnCallTableList")
        private java.util.List<String> onCallTableList;

        @com.aliyun.core.annotation.NameInMap("OwnerList")
        private java.util.List<String> ownerList;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ProjectIds")
        private java.util.List<Long> projectIds;

        @com.aliyun.core.annotation.NameInMap("ReceivedWayTypeList")
        private java.util.List<String> receivedWayTypeList;

        @com.aliyun.core.annotation.NameInMap("ReceiverList")
        private java.util.List<String> receiverList;

        @com.aliyun.core.annotation.NameInMap("TypeList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> typeList;

        private ListQuery(Builder builder) {
            this.alertReasonList = builder.alertReasonList;
            this.keyWord = builder.keyWord;
            this.logicFieldIdList = builder.logicFieldIdList;
            this.logicalTableIdList = builder.logicalTableIdList;
            this.onCallTableList = builder.onCallTableList;
            this.ownerList = builder.ownerList;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.projectIds = builder.projectIds;
            this.receivedWayTypeList = builder.receivedWayTypeList;
            this.receiverList = builder.receiverList;
            this.typeList = builder.typeList;
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
         * @return keyWord
         */
        public String getKeyWord() {
            return this.keyWord;
        }

        /**
         * @return logicFieldIdList
         */
        public java.util.List<Long> getLogicFieldIdList() {
            return this.logicFieldIdList;
        }

        /**
         * @return logicalTableIdList
         */
        public java.util.List<Long> getLogicalTableIdList() {
            return this.logicalTableIdList;
        }

        /**
         * @return onCallTableList
         */
        public java.util.List<String> getOnCallTableList() {
            return this.onCallTableList;
        }

        /**
         * @return ownerList
         */
        public java.util.List<String> getOwnerList() {
            return this.ownerList;
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
         * @return projectIds
         */
        public java.util.List<Long> getProjectIds() {
            return this.projectIds;
        }

        /**
         * @return receivedWayTypeList
         */
        public java.util.List<String> getReceivedWayTypeList() {
            return this.receivedWayTypeList;
        }

        /**
         * @return receiverList
         */
        public java.util.List<String> getReceiverList() {
            return this.receiverList;
        }

        /**
         * @return typeList
         */
        public java.util.List<String> getTypeList() {
            return this.typeList;
        }

        public static final class Builder {
            private java.util.List<String> alertReasonList; 
            private String keyWord; 
            private java.util.List<Long> logicFieldIdList; 
            private java.util.List<Long> logicalTableIdList; 
            private java.util.List<String> onCallTableList; 
            private java.util.List<String> ownerList; 
            private Integer pageNo; 
            private Integer pageSize; 
            private java.util.List<Long> projectIds; 
            private java.util.List<String> receivedWayTypeList; 
            private java.util.List<String> receiverList; 
            private java.util.List<String> typeList; 

            private Builder() {
            } 

            private Builder(ListQuery model) {
                this.alertReasonList = model.alertReasonList;
                this.keyWord = model.keyWord;
                this.logicFieldIdList = model.logicFieldIdList;
                this.logicalTableIdList = model.logicalTableIdList;
                this.onCallTableList = model.onCallTableList;
                this.ownerList = model.ownerList;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.projectIds = model.projectIds;
                this.receivedWayTypeList = model.receivedWayTypeList;
                this.receiverList = model.receiverList;
                this.typeList = model.typeList;
            } 

            /**
             * <p>The list of alert cause types. Valid values: FAILED (the task execution failed), TIME_OUT (the task execution timed out), UNFINISHED (the task did not generate output), SUCCESS (the task execution succeeded), and DATA_DELAY (the data is delayed).</p>
             */
            public Builder alertReasonList(java.util.List<String> alertReasonList) {
                this.alertReasonList = alertReasonList;
                return this;
            }

            /**
             * <p>The keyword for search. Supports fuzzy matching for monitored task names. If this parameter is empty or not specified, no filtering is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>dwd_order_detail</p>
             */
            public Builder keyWord(String keyWord) {
                this.keyWord = keyWord;
                return this;
            }

            /**
             * <p>The list of logical field IDs.</p>
             */
            public Builder logicFieldIdList(java.util.List<Long> logicFieldIdList) {
                this.logicFieldIdList = logicFieldIdList;
                return this;
            }

            /**
             * <p>The list of logical table IDs.</p>
             */
            public Builder logicalTableIdList(java.util.List<Long> logicalTableIdList) {
                this.logicalTableIdList = logicalTableIdList;
                return this;
            }

            /**
             * <p>The list of on-call schedule IDs.</p>
             */
            public Builder onCallTableList(java.util.List<String> onCallTableList) {
                this.onCallTableList = onCallTableList;
                return this;
            }

            /**
             * <p>The list of user IDs of the creators of monitored objects.</p>
             */
            public Builder ownerList(java.util.List<String> ownerList) {
                this.ownerList = ownerList;
                return this;
            }

            /**
             * <p>The current page number. Pages start from 1. Default value: 1.</p>
             * <p>This parameter is required.</p>
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
             * <p>The list of project IDs. If this parameter is empty, all projects that the current user has permissions on are automatically queried.</p>
             */
            public Builder projectIds(java.util.List<Long> projectIds) {
                this.projectIds = projectIds;
                return this;
            }

            /**
             * <p>The list of notification method types. Valid values: PHONE (phone call), MESSAGE (text message), EMAIL (email), DING_TALK (DingTalk), FEISHU (Lark), WECHAT (WeChat), and CUSTOM (custom channel).</p>
             */
            public Builder receivedWayTypeList(java.util.List<String> receivedWayTypeList) {
                this.receivedWayTypeList = receivedWayTypeList;
                return this;
            }

            /**
             * <p>The list of user IDs of the recipients.</p>
             */
            public Builder receiverList(java.util.List<String> receiverList) {
                this.receiverList = receiverList;
                return this;
            }

            /**
             * <p>The list of monitored object types. Valid values: LOGICAL_FIELD (logical field), OND_ID_NODE (logical table node), SCHEDULE_PHYSICAL_NODE (periodically scheduled physical task), MANUAL_PHYSICAL_NODE (manually scheduled physical task), ODM_NODE (source path task), LOGICAL_TABLE_NODE (logical table task), and PROJECT (project).</p>
             * <p>This parameter is required.</p>
             */
            public Builder typeList(java.util.List<String> typeList) {
                this.typeList = typeList;
                return this;
            }

            public ListQuery build() {
                return new ListQuery(this);
            } 

        } 

    }
}
