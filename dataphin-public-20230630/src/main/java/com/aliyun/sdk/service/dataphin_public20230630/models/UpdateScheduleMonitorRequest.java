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
 * {@link UpdateScheduleMonitorRequest} extends {@link RequestModel}
 *
 * <p>UpdateScheduleMonitorRequest</p>
 */
public class UpdateScheduleMonitorRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateCommand updateCommand;

    private UpdateScheduleMonitorRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.updateCommand = builder.updateCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateScheduleMonitorRequest create() {
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

    /**
     * @return updateCommand
     */
    public UpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static final class Builder extends Request.Builder<UpdateScheduleMonitorRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private String opUserId; 
        private UpdateCommand updateCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpdateScheduleMonitorRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.updateCommand = request.updateCommand;
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

        /**
         * <p>The request body for updating scheduling monitoring.</p>
         * <p>This parameter is required.</p>
         */
        public Builder updateCommand(UpdateCommand updateCommand) {
            String updateCommandShrink = shrink(updateCommand, "UpdateCommand", "json");
            this.putBodyParameter("UpdateCommand", updateCommandShrink);
            this.updateCommand = updateCommand;
            return this;
        }

        @Override
        public UpdateScheduleMonitorRequest build() {
            return new UpdateScheduleMonitorRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateScheduleMonitorRequest} extends {@link TeaModel}
     *
     * <p>UpdateScheduleMonitorRequest</p>
     */
    public static class FilterRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FilterKey")
        private String filterKey;

        @com.aliyun.core.annotation.NameInMap("FilterValueList")
        private java.util.List<String> filterValueList;

        @com.aliyun.core.annotation.NameInMap("IsExclude")
        private Boolean isExclude;

        private FilterRuleList(Builder builder) {
            this.filterKey = builder.filterKey;
            this.filterValueList = builder.filterValueList;
            this.isExclude = builder.isExclude;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterRuleList create() {
            return builder().build();
        }

        /**
         * @return filterKey
         */
        public String getFilterKey() {
            return this.filterKey;
        }

        /**
         * @return filterValueList
         */
        public java.util.List<String> getFilterValueList() {
            return this.filterValueList;
        }

        /**
         * @return isExclude
         */
        public Boolean getIsExclude() {
            return this.isExclude;
        }

        public static final class Builder {
            private String filterKey; 
            private java.util.List<String> filterValueList; 
            private Boolean isExclude; 

            private Builder() {
            } 

            private Builder(FilterRuleList model) {
                this.filterKey = model.filterKey;
                this.filterValueList = model.filterValueList;
                this.isExclude = model.isExclude;
            } 

            /**
             * <p>The filter key.</p>
             * 
             * <strong>example:</strong>
             * <p>NODE_NAME</p>
             */
            public Builder filterKey(String filterKey) {
                this.filterKey = filterKey;
                return this;
            }

            /**
             * <p>The list of filter values. Multiple values are supported.</p>
             */
            public Builder filterValueList(java.util.List<String> filterValueList) {
                this.filterValueList = filterValueList;
                return this;
            }

            /**
             * <p>Specifies whether to exclude the selection.</p>
             */
            public Builder isExclude(Boolean isExclude) {
                this.isExclude = isExclude;
                return this;
            }

            public FilterRuleList build() {
                return new FilterRuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateScheduleMonitorRequest} extends {@link TeaModel}
     *
     * <p>UpdateScheduleMonitorRequest</p>
     */
    public static class MonitoredNodeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FilterRuleList")
        private java.util.List<FilterRuleList> filterRuleList;

        private MonitoredNodeRange(Builder builder) {
            this.filterRuleList = builder.filterRuleList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitoredNodeRange create() {
            return builder().build();
        }

        /**
         * @return filterRuleList
         */
        public java.util.List<FilterRuleList> getFilterRuleList() {
            return this.filterRuleList;
        }

        public static final class Builder {
            private java.util.List<FilterRuleList> filterRuleList; 

            private Builder() {
            } 

            private Builder(MonitoredNodeRange model) {
                this.filterRuleList = model.filterRuleList;
            } 

            /**
             * <p>The list of filter rules. If left empty, all rules are applied by default.</p>
             */
            public Builder filterRuleList(java.util.List<FilterRuleList> filterRuleList) {
                this.filterRuleList = filterRuleList;
                return this;
            }

            public MonitoredNodeRange build() {
                return new MonitoredNodeRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateScheduleMonitorRequest} extends {@link TeaModel}
     *
     * <p>UpdateScheduleMonitorRequest</p>
     */
    public static class MonitoredItemConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        private Long bizUnitId;

        @com.aliyun.core.annotation.NameInMap("LogicalTableId")
        private Long logicalTableId;

        @com.aliyun.core.annotation.NameInMap("LogicalTableName")
        private String logicalTableName;

        @com.aliyun.core.annotation.NameInMap("MonitoredItemType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String monitoredItemType;

        @com.aliyun.core.annotation.NameInMap("MonitoredNodeRange")
        private MonitoredNodeRange monitoredNodeRange;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeSubType")
        private String nodeSubType;

        @com.aliyun.core.annotation.NameInMap("OpsOwnerIdList")
        private java.util.List<String> opsOwnerIdList;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        private MonitoredItemConfig(Builder builder) {
            this.bizUnitId = builder.bizUnitId;
            this.logicalTableId = builder.logicalTableId;
            this.logicalTableName = builder.logicalTableName;
            this.monitoredItemType = builder.monitoredItemType;
            this.monitoredNodeRange = builder.monitoredNodeRange;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.nodeSubType = builder.nodeSubType;
            this.opsOwnerIdList = builder.opsOwnerIdList;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitoredItemConfig create() {
            return builder().build();
        }

        /**
         * @return bizUnitId
         */
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        /**
         * @return logicalTableId
         */
        public Long getLogicalTableId() {
            return this.logicalTableId;
        }

        /**
         * @return logicalTableName
         */
        public String getLogicalTableName() {
            return this.logicalTableName;
        }

        /**
         * @return monitoredItemType
         */
        public String getMonitoredItemType() {
            return this.monitoredItemType;
        }

        /**
         * @return monitoredNodeRange
         */
        public MonitoredNodeRange getMonitoredNodeRange() {
            return this.monitoredNodeRange;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeSubType
         */
        public String getNodeSubType() {
            return this.nodeSubType;
        }

        /**
         * @return opsOwnerIdList
         */
        public java.util.List<String> getOpsOwnerIdList() {
            return this.opsOwnerIdList;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private Long bizUnitId; 
            private Long logicalTableId; 
            private String logicalTableName; 
            private String monitoredItemType; 
            private MonitoredNodeRange monitoredNodeRange; 
            private String nodeId; 
            private String nodeName; 
            private String nodeSubType; 
            private java.util.List<String> opsOwnerIdList; 
            private Long projectId; 

            private Builder() {
            } 

            private Builder(MonitoredItemConfig model) {
                this.bizUnitId = model.bizUnitId;
                this.logicalTableId = model.logicalTableId;
                this.logicalTableName = model.logicalTableName;
                this.monitoredItemType = model.monitoredItemType;
                this.monitoredNodeRange = model.monitoredNodeRange;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.nodeSubType = model.nodeSubType;
                this.opsOwnerIdList = model.opsOwnerIdList;
                this.projectId = model.projectId;
            } 

            /**
             * <p>The business unit ID. Required when the summary logical table does not have a project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>100001</p>
             */
            public Builder bizUnitId(Long bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * <p>The logical table ID. Required for the LOGICAL_FIELD and LOGICAL_TABLE_NODE types.</p>
             * 
             * <strong>example:</strong>
             * <p>6812345678901234</p>
             */
            public Builder logicalTableId(Long logicalTableId) {
                this.logicalTableId = logicalTableId;
                return this;
            }

            /**
             * <p>The name of the logical table.</p>
             * 
             * <strong>example:</strong>
             * <p>dwd_order_detail</p>
             */
            public Builder logicalTableName(String logicalTableName) {
                this.logicalTableName = logicalTableName;
                return this;
            }

            /**
             * <p>The monitored object type. Valid values: LOGICAL_FIELD (logical field), OND_ID_NODE (logical table node), SCHEDULE_PHYSICAL_NODE (periodically scheduled physical task), MANUAL_PHYSICAL_NODE (manually scheduled physical task), ODM_NODE (source path task), LOGICAL_TABLE_NODE (logical table task), and PROJECT (project).</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SCHEDULE_PHYSICAL_NODE</p>
             */
            public Builder monitoredItemType(String monitoredItemType) {
                this.monitoredItemType = monitoredItemType;
                return this;
            }

            /**
             * <p>The monitored task scope, which specifies project-level monitoring filter rules. Required for the PROJECT type.</p>
             */
            public Builder monitoredNodeRange(MonitoredNodeRange monitoredNodeRange) {
                this.monitoredNodeRange = monitoredNodeRange;
                return this;
            }

            /**
             * <p>The monitored task ID, which is the node ID. Required for types other than PROJECT.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The monitored task name, which is the node name. Required for types other than PROJECT.</p>
             * 
             * <strong>example:</strong>
             * <p>dwd_order_detail_daily</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The node subtype. Required for types other than PROJECT and LOGICAL_FIELD.</p>
             * 
             * <strong>example:</strong>
             * <p>MAX_COMPUTE_SQL</p>
             */
            public Builder nodeSubType(String nodeSubType) {
                this.nodeSubType = nodeSubType;
                return this;
            }

            /**
             * <p>The list of node O&amp;M owner IDs. This serves as the source for OWNER recipients.</p>
             */
            public Builder opsOwnerIdList(java.util.List<String> opsOwnerIdList) {
                this.opsOwnerIdList = opsOwnerIdList;
                return this;
            }

            /**
             * <p>The project ID. Required for the PROJECT type. For other types, it specifies the project to which the monitored object belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>7086194564164288</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public MonitoredItemConfig build() {
                return new MonitoredItemConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateScheduleMonitorRequest} extends {@link TeaModel}
     *
     * <p>UpdateScheduleMonitorRequest</p>
     */
    public static class MonitoredTimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private MonitoredTimeRange(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitoredTimeRange create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(MonitoredTimeRange model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The end time in HH:mm format. Set this parameter to 0 to indicate no limit.</p>
             * 
             * <strong>example:</strong>
             * <p>11:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start time in HH:mm format. Set this parameter to 0 to indicate no limit.</p>
             * 
             * <strong>example:</strong>
             * <p>07:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public MonitoredTimeRange build() {
                return new MonitoredTimeRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateScheduleMonitorRequest} extends {@link TeaModel}
     *
     * <p>UpdateScheduleMonitorRequest</p>
     */
    public static class ReceiverConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomAlertChannelIdList")
        private java.util.List<String> customAlertChannelIdList;

        @com.aliyun.core.annotation.NameInMap("OnDutyTableIdList")
        private java.util.List<String> onDutyTableIdList;

        @com.aliyun.core.annotation.NameInMap("ReceivedWayList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> receivedWayList;

        @com.aliyun.core.annotation.NameInMap("ReceiverType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String receiverType;

        @com.aliyun.core.annotation.NameInMap("ReceiverUserIdList")
        private java.util.List<String> receiverUserIdList;

        private ReceiverConfigList(Builder builder) {
            this.customAlertChannelIdList = builder.customAlertChannelIdList;
            this.onDutyTableIdList = builder.onDutyTableIdList;
            this.receivedWayList = builder.receivedWayList;
            this.receiverType = builder.receiverType;
            this.receiverUserIdList = builder.receiverUserIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReceiverConfigList create() {
            return builder().build();
        }

        /**
         * @return customAlertChannelIdList
         */
        public java.util.List<String> getCustomAlertChannelIdList() {
            return this.customAlertChannelIdList;
        }

        /**
         * @return onDutyTableIdList
         */
        public java.util.List<String> getOnDutyTableIdList() {
            return this.onDutyTableIdList;
        }

        /**
         * @return receivedWayList
         */
        public java.util.List<String> getReceivedWayList() {
            return this.receivedWayList;
        }

        /**
         * @return receiverType
         */
        public String getReceiverType() {
            return this.receiverType;
        }

        /**
         * @return receiverUserIdList
         */
        public java.util.List<String> getReceiverUserIdList() {
            return this.receiverUserIdList;
        }

        public static final class Builder {
            private java.util.List<String> customAlertChannelIdList; 
            private java.util.List<String> onDutyTableIdList; 
            private java.util.List<String> receivedWayList; 
            private String receiverType; 
            private java.util.List<String> receiverUserIdList; 

            private Builder() {
            } 

            private Builder(ReceiverConfigList model) {
                this.customAlertChannelIdList = model.customAlertChannelIdList;
                this.onDutyTableIdList = model.onDutyTableIdList;
                this.receivedWayList = model.receivedWayList;
                this.receiverType = model.receiverType;
                this.receiverUserIdList = model.receiverUserIdList;
            } 

            /**
             * <p>The list of custom alert channel IDs.</p>
             */
            public Builder customAlertChannelIdList(java.util.List<String> customAlertChannelIdList) {
                this.customAlertChannelIdList = customAlertChannelIdList;
                return this;
            }

            /**
             * <p>The list of on-duty table IDs. This parameter is required when ReceiverType is set to ON_DUTY_TABLE.</p>
             */
            public Builder onDutyTableIdList(java.util.List<String> onDutyTableIdList) {
                this.onDutyTableIdList = onDutyTableIdList;
                return this;
            }

            /**
             * <p>The list of receiving methods. Valid values: PHONE: Phone call. MESSAGE: Text message. EMAIL: Email. DING_TALK: DingTalk. FEISHU: Lark. WECHAT: WeChat. CUSTOM: Custom channel.</p>
             * <p>This parameter is required.</p>
             */
            public Builder receivedWayList(java.util.List<String> receivedWayList) {
                this.receivedWayList = receivedWayList;
                return this;
            }

            /**
             * <p>The recipient type. Valid values: OWNER: Owner. USER_CUSTOM: Custom user. ON_DUTY_TABLE: On-duty table.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>OWNER</p>
             */
            public Builder receiverType(String receiverType) {
                this.receiverType = receiverType;
                return this;
            }

            /**
             * <p>The list of recipient user IDs. This parameter is required when ReceiverType is set to USER_CUSTOM.</p>
             */
            public Builder receiverUserIdList(java.util.List<String> receiverUserIdList) {
                this.receiverUserIdList = receiverUserIdList;
                return this;
            }

            public ReceiverConfigList build() {
                return new ReceiverConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateScheduleMonitorRequest} extends {@link TeaModel}
     *
     * <p>UpdateScheduleMonitorRequest</p>
     */
    public static class AlertStrategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertFrequency")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer alertFrequency;

        @com.aliyun.core.annotation.NameInMap("MonitoredTimeRange")
        private MonitoredTimeRange monitoredTimeRange;

        @com.aliyun.core.annotation.NameInMap("ReceiverConfigList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<ReceiverConfigList> receiverConfigList;

        @com.aliyun.core.annotation.NameInMap("SendTimes")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer sendTimes;

        private AlertStrategy(Builder builder) {
            this.alertFrequency = builder.alertFrequency;
            this.monitoredTimeRange = builder.monitoredTimeRange;
            this.receiverConfigList = builder.receiverConfigList;
            this.sendTimes = builder.sendTimes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertStrategy create() {
            return builder().build();
        }

        /**
         * @return alertFrequency
         */
        public Integer getAlertFrequency() {
            return this.alertFrequency;
        }

        /**
         * @return monitoredTimeRange
         */
        public MonitoredTimeRange getMonitoredTimeRange() {
            return this.monitoredTimeRange;
        }

        /**
         * @return receiverConfigList
         */
        public java.util.List<ReceiverConfigList> getReceiverConfigList() {
            return this.receiverConfigList;
        }

        /**
         * @return sendTimes
         */
        public Integer getSendTimes() {
            return this.sendTimes;
        }

        public static final class Builder {
            private Integer alertFrequency; 
            private MonitoredTimeRange monitoredTimeRange; 
            private java.util.List<ReceiverConfigList> receiverConfigList; 
            private Integer sendTimes; 

            private Builder() {
            } 

            private Builder(AlertStrategy model) {
                this.alertFrequency = model.alertFrequency;
                this.monitoredTimeRange = model.monitoredTimeRange;
                this.receiverConfigList = model.receiverConfigList;
                this.sendTimes = model.sendTimes;
            } 

            /**
             * <p>The alert trigger frequency.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder alertFrequency(Integer alertFrequency) {
                this.alertFrequency = alertFrequency;
                return this;
            }

            /**
             * <p>The monitored time range.</p>
             */
            public Builder monitoredTimeRange(MonitoredTimeRange monitoredTimeRange) {
                this.monitoredTimeRange = monitoredTimeRange;
                return this;
            }

            /**
             * <p>The list of recipient configurations.</p>
             * <p>This parameter is required.</p>
             */
            public Builder receiverConfigList(java.util.List<ReceiverConfigList> receiverConfigList) {
                this.receiverConfigList = receiverConfigList;
                return this;
            }

            /**
             * <p>The maximum number of times an alert can be sent.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder sendTimes(Integer sendTimes) {
                this.sendTimes = sendTimes;
                return this;
            }

            public AlertStrategy build() {
                return new AlertStrategy(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateScheduleMonitorRequest} extends {@link TeaModel}
     *
     * <p>UpdateScheduleMonitorRequest</p>
     */
    public static class DailyUnfinishedConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FixedUnfinishedTime")
        private String fixedUnfinishedTime;

        private DailyUnfinishedConfig(Builder builder) {
            this.fixedUnfinishedTime = builder.fixedUnfinishedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DailyUnfinishedConfig create() {
            return builder().build();
        }

        /**
         * @return fixedUnfinishedTime
         */
        public String getFixedUnfinishedTime() {
            return this.fixedUnfinishedTime;
        }

        public static final class Builder {
            private String fixedUnfinishedTime; 

            private Builder() {
            } 

            private Builder(DailyUnfinishedConfig model) {
                this.fixedUnfinishedTime = model.fixedUnfinishedTime;
            } 

            /**
             * <p>The daily check time for unfinished nodes in HH:mm format.</p>
             * 
             * <strong>example:</strong>
             * <p>07:00</p>
             */
            public Builder fixedUnfinishedTime(String fixedUnfinishedTime) {
                this.fixedUnfinishedTime = fixedUnfinishedTime;
                return this;
            }

            public DailyUnfinishedConfig build() {
                return new DailyUnfinishedConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateScheduleMonitorRequest} extends {@link TeaModel}
     *
     * <p>UpdateScheduleMonitorRequest</p>
     */
    public static class CustomPeriodList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FixedUnfinishedTime")
        private String fixedUnfinishedTime;

        @com.aliyun.core.annotation.NameInMap("PeriodNum")
        private Integer periodNum;

        private CustomPeriodList(Builder builder) {
            this.fixedUnfinishedTime = builder.fixedUnfinishedTime;
            this.periodNum = builder.periodNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomPeriodList create() {
            return builder().build();
        }

        /**
         * @return fixedUnfinishedTime
         */
        public String getFixedUnfinishedTime() {
            return this.fixedUnfinishedTime;
        }

        /**
         * @return periodNum
         */
        public Integer getPeriodNum() {
            return this.periodNum;
        }

        public static final class Builder {
            private String fixedUnfinishedTime; 
            private Integer periodNum; 

            private Builder() {
            } 

            private Builder(CustomPeriodList model) {
                this.fixedUnfinishedTime = model.fixedUnfinishedTime;
                this.periodNum = model.periodNum;
            } 

            /**
             * <p>The check time for unfinished nodes in HH:mm format.</p>
             * 
             * <strong>example:</strong>
             * <p>07:00</p>
             */
            public Builder fixedUnfinishedTime(String fixedUnfinishedTime) {
                this.fixedUnfinishedTime = fixedUnfinishedTime;
                return this;
            }

            /**
             * <p>The number of periods.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder periodNum(Integer periodNum) {
                this.periodNum = periodNum;
                return this;
            }

            public CustomPeriodList build() {
                return new CustomPeriodList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateScheduleMonitorRequest} extends {@link TeaModel}
     *
     * <p>UpdateScheduleMonitorRequest</p>
     */
    public static class MultiPeriodUnfinishedConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomPeriodList")
        private java.util.List<CustomPeriodList> customPeriodList;

        @com.aliyun.core.annotation.NameInMap("IntervalAfterDueTime")
        private Integer intervalAfterDueTime;

        @com.aliyun.core.annotation.NameInMap("IntervalUnit")
        private String intervalUnit;

        @com.aliyun.core.annotation.NameInMap("MonitorPeriodType")
        private String monitorPeriodType;

        @com.aliyun.core.annotation.NameInMap("TriggerRuleType")
        private String triggerRuleType;

        private MultiPeriodUnfinishedConfig(Builder builder) {
            this.customPeriodList = builder.customPeriodList;
            this.intervalAfterDueTime = builder.intervalAfterDueTime;
            this.intervalUnit = builder.intervalUnit;
            this.monitorPeriodType = builder.monitorPeriodType;
            this.triggerRuleType = builder.triggerRuleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiPeriodUnfinishedConfig create() {
            return builder().build();
        }

        /**
         * @return customPeriodList
         */
        public java.util.List<CustomPeriodList> getCustomPeriodList() {
            return this.customPeriodList;
        }

        /**
         * @return intervalAfterDueTime
         */
        public Integer getIntervalAfterDueTime() {
            return this.intervalAfterDueTime;
        }

        /**
         * @return intervalUnit
         */
        public String getIntervalUnit() {
            return this.intervalUnit;
        }

        /**
         * @return monitorPeriodType
         */
        public String getMonitorPeriodType() {
            return this.monitorPeriodType;
        }

        /**
         * @return triggerRuleType
         */
        public String getTriggerRuleType() {
            return this.triggerRuleType;
        }

        public static final class Builder {
            private java.util.List<CustomPeriodList> customPeriodList; 
            private Integer intervalAfterDueTime; 
            private String intervalUnit; 
            private String monitorPeriodType; 
            private String triggerRuleType; 

            private Builder() {
            } 

            private Builder(MultiPeriodUnfinishedConfig model) {
                this.customPeriodList = model.customPeriodList;
                this.intervalAfterDueTime = model.intervalAfterDueTime;
                this.intervalUnit = model.intervalUnit;
                this.monitorPeriodType = model.monitorPeriodType;
                this.triggerRuleType = model.triggerRuleType;
            } 

            /**
             * <p>The list of custom monitoring periods. Specify this parameter when MonitorPeriodType is set to CUSTOM.</p>
             */
            public Builder customPeriodList(java.util.List<CustomPeriodList> customPeriodList) {
                this.customPeriodList = customPeriodList;
                return this;
            }

            /**
             * <p>The interval time value. This parameter is used together with IntervalUnit.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder intervalAfterDueTime(Integer intervalAfterDueTime) {
                this.intervalAfterDueTime = intervalAfterDueTime;
                return this;
            }

            /**
             * <p>The interval unit. Valid values: SECONDS, MINUTES, and HOURS.</p>
             * 
             * <strong>example:</strong>
             * <p>MINUTES</p>
             */
            public Builder intervalUnit(String intervalUnit) {
                this.intervalUnit = intervalUnit;
                return this;
            }

            /**
             * <p>The monitoring period type. Valid values: ALL, FIRST, LAST, and CUSTOM.</p>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder monitorPeriodType(String monitorPeriodType) {
                this.monitorPeriodType = monitorPeriodType;
                return this;
            }

            /**
             * <p>The trigger rule type. Valid values: INTERVAL_AFTER_DUE_TIME: Triggered at an interval after the due time. FIX_TIME: Triggered at a fixed time.</p>
             * 
             * <strong>example:</strong>
             * <p>INTERVAL_AFTER_DUE_TIME</p>
             */
            public Builder triggerRuleType(String triggerRuleType) {
                this.triggerRuleType = triggerRuleType;
                return this;
            }

            public MultiPeriodUnfinishedConfig build() {
                return new MultiPeriodUnfinishedConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateScheduleMonitorRequest} extends {@link TeaModel}
     *
     * <p>UpdateScheduleMonitorRequest</p>
     */
    public static class UnfinishedRuleDetailConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DailyUnfinishedConfig")
        private DailyUnfinishedConfig dailyUnfinishedConfig;

        @com.aliyun.core.annotation.NameInMap("MultiPeriodUnfinishedConfig")
        private MultiPeriodUnfinishedConfig multiPeriodUnfinishedConfig;

        private UnfinishedRuleDetailConfig(Builder builder) {
            this.dailyUnfinishedConfig = builder.dailyUnfinishedConfig;
            this.multiPeriodUnfinishedConfig = builder.multiPeriodUnfinishedConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnfinishedRuleDetailConfig create() {
            return builder().build();
        }

        /**
         * @return dailyUnfinishedConfig
         */
        public DailyUnfinishedConfig getDailyUnfinishedConfig() {
            return this.dailyUnfinishedConfig;
        }

        /**
         * @return multiPeriodUnfinishedConfig
         */
        public MultiPeriodUnfinishedConfig getMultiPeriodUnfinishedConfig() {
            return this.multiPeriodUnfinishedConfig;
        }

        public static final class Builder {
            private DailyUnfinishedConfig dailyUnfinishedConfig; 
            private MultiPeriodUnfinishedConfig multiPeriodUnfinishedConfig; 

            private Builder() {
            } 

            private Builder(UnfinishedRuleDetailConfig model) {
                this.dailyUnfinishedConfig = model.dailyUnfinishedConfig;
                this.multiPeriodUnfinishedConfig = model.multiPeriodUnfinishedConfig;
            } 

            /**
             * <p>The daily unfinished configuration.</p>
             */
            public Builder dailyUnfinishedConfig(DailyUnfinishedConfig dailyUnfinishedConfig) {
                this.dailyUnfinishedConfig = dailyUnfinishedConfig;
                return this;
            }

            /**
             * <p>The multi-period unfinished configuration.</p>
             */
            public Builder multiPeriodUnfinishedConfig(MultiPeriodUnfinishedConfig multiPeriodUnfinishedConfig) {
                this.multiPeriodUnfinishedConfig = multiPeriodUnfinishedConfig;
                return this;
            }

            public UnfinishedRuleDetailConfig build() {
                return new UnfinishedRuleDetailConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateScheduleMonitorRequest} extends {@link TeaModel}
     *
     * <p>UpdateScheduleMonitorRequest</p>
     */
    public static class MonitoredRuleConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertReasonType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String alertReasonType;

        @com.aliyun.core.annotation.NameInMap("AlertStrategy")
        @com.aliyun.core.annotation.Validation(required = true)
        private AlertStrategy alertStrategy;

        @com.aliyun.core.annotation.NameInMap("FixedElapsedTime")
        private Long fixedElapsedTime;

        @com.aliyun.core.annotation.NameInMap("FixedUnfinishedTime")
        private String fixedUnfinishedTime;

        @com.aliyun.core.annotation.NameInMap("UnfinishedRuleDetailConfig")
        private UnfinishedRuleDetailConfig unfinishedRuleDetailConfig;

        private MonitoredRuleConfigList(Builder builder) {
            this.alertReasonType = builder.alertReasonType;
            this.alertStrategy = builder.alertStrategy;
            this.fixedElapsedTime = builder.fixedElapsedTime;
            this.fixedUnfinishedTime = builder.fixedUnfinishedTime;
            this.unfinishedRuleDetailConfig = builder.unfinishedRuleDetailConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitoredRuleConfigList create() {
            return builder().build();
        }

        /**
         * @return alertReasonType
         */
        public String getAlertReasonType() {
            return this.alertReasonType;
        }

        /**
         * @return alertStrategy
         */
        public AlertStrategy getAlertStrategy() {
            return this.alertStrategy;
        }

        /**
         * @return fixedElapsedTime
         */
        public Long getFixedElapsedTime() {
            return this.fixedElapsedTime;
        }

        /**
         * @return fixedUnfinishedTime
         */
        public String getFixedUnfinishedTime() {
            return this.fixedUnfinishedTime;
        }

        /**
         * @return unfinishedRuleDetailConfig
         */
        public UnfinishedRuleDetailConfig getUnfinishedRuleDetailConfig() {
            return this.unfinishedRuleDetailConfig;
        }

        public static final class Builder {
            private String alertReasonType; 
            private AlertStrategy alertStrategy; 
            private Long fixedElapsedTime; 
            private String fixedUnfinishedTime; 
            private UnfinishedRuleDetailConfig unfinishedRuleDetailConfig; 

            private Builder() {
            } 

            private Builder(MonitoredRuleConfigList model) {
                this.alertReasonType = model.alertReasonType;
                this.alertStrategy = model.alertStrategy;
                this.fixedElapsedTime = model.fixedElapsedTime;
                this.fixedUnfinishedTime = model.fixedUnfinishedTime;
                this.unfinishedRuleDetailConfig = model.unfinishedRuleDetailConfig;
            } 

            /**
             * <p>The alert cause type. Valid values: FAILED: The node fails to run. TIME_OUT: The node execution times out. UNFINISHED: The node does not generate data. SUCCESS: The node runs successfully. DATA_DELAY: Data is delayed.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TIME_OUT</p>
             */
            public Builder alertReasonType(String alertReasonType) {
                this.alertReasonType = alertReasonType;
                return this;
            }

            /**
             * <p>The alert strategy.</p>
             * <p>This parameter is required.</p>
             */
            public Builder alertStrategy(AlertStrategy alertStrategy) {
                this.alertStrategy = alertStrategy;
                return this;
            }

            /**
             * <p>The timeout period in minutes. Specify this parameter only when AlertReasonType is set to TIME_OUT.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder fixedElapsedTime(Long fixedElapsedTime) {
                this.fixedElapsedTime = fixedElapsedTime;
                return this;
            }

            /**
             * <p>The daily check time for unfinished nodes in HH:mm format. Specify this parameter only when AlertReasonType is set to UNFINISHED.</p>
             * 
             * <strong>example:</strong>
             * <p>07:00</p>
             */
            public Builder fixedUnfinishedTime(String fixedUnfinishedTime) {
                this.fixedUnfinishedTime = fixedUnfinishedTime;
                return this;
            }

            /**
             * <p>The detailed configuration for the unfinished rule. Specify this parameter only when AlertReasonType is set to UNFINISHED.</p>
             */
            public Builder unfinishedRuleDetailConfig(UnfinishedRuleDetailConfig unfinishedRuleDetailConfig) {
                this.unfinishedRuleDetailConfig = unfinishedRuleDetailConfig;
                return this;
            }

            public MonitoredRuleConfigList build() {
                return new MonitoredRuleConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateScheduleMonitorRequest} extends {@link TeaModel}
     *
     * <p>UpdateScheduleMonitorRequest</p>
     */
    public static class UpdateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MonitoredItemConfig")
        @com.aliyun.core.annotation.Validation(required = true)
        private MonitoredItemConfig monitoredItemConfig;

        @com.aliyun.core.annotation.NameInMap("MonitoredItemId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long monitoredItemId;

        @com.aliyun.core.annotation.NameInMap("MonitoredRuleConfigList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<MonitoredRuleConfigList> monitoredRuleConfigList;

        private UpdateCommand(Builder builder) {
            this.monitoredItemConfig = builder.monitoredItemConfig;
            this.monitoredItemId = builder.monitoredItemId;
            this.monitoredRuleConfigList = builder.monitoredRuleConfigList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateCommand create() {
            return builder().build();
        }

        /**
         * @return monitoredItemConfig
         */
        public MonitoredItemConfig getMonitoredItemConfig() {
            return this.monitoredItemConfig;
        }

        /**
         * @return monitoredItemId
         */
        public Long getMonitoredItemId() {
            return this.monitoredItemId;
        }

        /**
         * @return monitoredRuleConfigList
         */
        public java.util.List<MonitoredRuleConfigList> getMonitoredRuleConfigList() {
            return this.monitoredRuleConfigList;
        }

        public static final class Builder {
            private MonitoredItemConfig monitoredItemConfig; 
            private Long monitoredItemId; 
            private java.util.List<MonitoredRuleConfigList> monitoredRuleConfigList; 

            private Builder() {
            } 

            private Builder(UpdateCommand model) {
                this.monitoredItemConfig = model.monitoredItemConfig;
                this.monitoredItemId = model.monitoredItemId;
                this.monitoredRuleConfigList = model.monitoredRuleConfigList;
            } 

            /**
             * <p>The monitored object configuration.</p>
             * <p>This parameter is required.</p>
             */
            public Builder monitoredItemConfig(MonitoredItemConfig monitoredItemConfig) {
                this.monitoredItemConfig = monitoredItemConfig;
                return this;
            }

            /**
             * <p>The monitored object ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>6912345678901234</p>
             */
            public Builder monitoredItemId(Long monitoredItemId) {
                this.monitoredItemId = monitoredItemId;
                return this;
            }

            /**
             * <p>The list of monitored rule configurations. You can configure multiple rules with different alert causes.</p>
             * <p>This parameter is required.</p>
             */
            public Builder monitoredRuleConfigList(java.util.List<MonitoredRuleConfigList> monitoredRuleConfigList) {
                this.monitoredRuleConfigList = monitoredRuleConfigList;
                return this;
            }

            public UpdateCommand build() {
                return new UpdateCommand(this);
            } 

        } 

    }
}
