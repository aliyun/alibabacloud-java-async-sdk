// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRemindRequest} extends {@link RequestModel}
 *
 * <p>CreateRemindRequest</p>
 */
public class CreateRemindRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertInterval")
    private Integer alertInterval;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertMethods")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alertMethods;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertTargets")
    private String alertTargets;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertUnit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alertUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaselineIds")
    private String baselineIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizProcessIds")
    private String bizProcessIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Detail")
    private String detail;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DndEnd")
    private String dndEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxAlertTimes")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
    private Integer maxAlertTimes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeIds")
    private String nodeIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemindName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String remindName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemindType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String remindType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemindUnit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String remindUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RobotUrls")
    private String robotUrls;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Webhooks")
    private String webhooks;

    private CreateRemindRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alertInterval = builder.alertInterval;
        this.alertMethods = builder.alertMethods;
        this.alertTargets = builder.alertTargets;
        this.alertUnit = builder.alertUnit;
        this.baselineIds = builder.baselineIds;
        this.bizProcessIds = builder.bizProcessIds;
        this.detail = builder.detail;
        this.dndEnd = builder.dndEnd;
        this.maxAlertTimes = builder.maxAlertTimes;
        this.nodeIds = builder.nodeIds;
        this.projectId = builder.projectId;
        this.remindName = builder.remindName;
        this.remindType = builder.remindType;
        this.remindUnit = builder.remindUnit;
        this.robotUrls = builder.robotUrls;
        this.webhooks = builder.webhooks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRemindRequest create() {
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
     * @return alertInterval
     */
    public Integer getAlertInterval() {
        return this.alertInterval;
    }

    /**
     * @return alertMethods
     */
    public String getAlertMethods() {
        return this.alertMethods;
    }

    /**
     * @return alertTargets
     */
    public String getAlertTargets() {
        return this.alertTargets;
    }

    /**
     * @return alertUnit
     */
    public String getAlertUnit() {
        return this.alertUnit;
    }

    /**
     * @return baselineIds
     */
    public String getBaselineIds() {
        return this.baselineIds;
    }

    /**
     * @return bizProcessIds
     */
    public String getBizProcessIds() {
        return this.bizProcessIds;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return dndEnd
     */
    public String getDndEnd() {
        return this.dndEnd;
    }

    /**
     * @return maxAlertTimes
     */
    public Integer getMaxAlertTimes() {
        return this.maxAlertTimes;
    }

    /**
     * @return nodeIds
     */
    public String getNodeIds() {
        return this.nodeIds;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return remindName
     */
    public String getRemindName() {
        return this.remindName;
    }

    /**
     * @return remindType
     */
    public String getRemindType() {
        return this.remindType;
    }

    /**
     * @return remindUnit
     */
    public String getRemindUnit() {
        return this.remindUnit;
    }

    /**
     * @return robotUrls
     */
    public String getRobotUrls() {
        return this.robotUrls;
    }

    /**
     * @return webhooks
     */
    public String getWebhooks() {
        return this.webhooks;
    }

    public static final class Builder extends Request.Builder<CreateRemindRequest, Builder> {
        private String regionId; 
        private Integer alertInterval; 
        private String alertMethods; 
        private String alertTargets; 
        private String alertUnit; 
        private String baselineIds; 
        private String bizProcessIds; 
        private String detail; 
        private String dndEnd; 
        private Integer maxAlertTimes; 
        private String nodeIds; 
        private Long projectId; 
        private String remindName; 
        private String remindType; 
        private String remindUnit; 
        private String robotUrls; 
        private String webhooks; 

        private Builder() {
            super();
        } 

        private Builder(CreateRemindRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alertInterval = request.alertInterval;
            this.alertMethods = request.alertMethods;
            this.alertTargets = request.alertTargets;
            this.alertUnit = request.alertUnit;
            this.baselineIds = request.baselineIds;
            this.bizProcessIds = request.bizProcessIds;
            this.detail = request.detail;
            this.dndEnd = request.dndEnd;
            this.maxAlertTimes = request.maxAlertTimes;
            this.nodeIds = request.nodeIds;
            this.projectId = request.projectId;
            this.remindName = request.remindName;
            this.remindType = request.remindType;
            this.remindUnit = request.remindUnit;
            this.robotUrls = request.robotUrls;
            this.webhooks = request.webhooks;
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
         * The recipient of the alert. Valid values: OWNER and OTHER. The value OWNER indicates the node owner. The value OTHER indicates a specified user.
         */
        public Builder alertInterval(Integer alertInterval) {
            this.putBodyParameter("AlertInterval", alertInterval);
            this.alertInterval = alertInterval;
            return this;
        }

        /**
         * The webhook URL of the DingTalk chatbot. You can specify multiple webhook URLs. Separate the specified webhook URLs with commas (,).
         */
        public Builder alertMethods(String alertMethods) {
            this.putBodyParameter("AlertMethods", alertMethods);
            this.alertMethods = alertMethods;
            return this;
        }

        /**
         * The webhook URL of the WeCom or Lark chatbot. You can specify multiple webhook URLs. Separate the specified webhook URLs with commas (,). The WEBHOOKS notification method must be specified for alertMethods.
         * <p>
         * 
         * Only DataWorks Enterprise Edition supports this parameter.
         * 
         * The webhook URL-based alerting feature is supported in the following regions: China (Shanghai), China (Chengdu), China (Zhangjiakou), China (Beijing), China (Hangzhou), China (Shenzhen), China (Hong Kong), Germany (Frankfurt), and Singapore.
         */
        public Builder alertTargets(String alertTargets) {
            this.putBodyParameter("AlertTargets", alertTargets);
            this.alertTargets = alertTargets;
            return this;
        }

        /**
         * *   If the AlertUnit parameter is set to OWNER, leave this parameter empty.
         * <p>
         * *   If the AlertUnit parameter is set to OTHER, set this parameter to the ID of the Alibaba Cloud account used by a specific user. You can specify multiple IDs. Separate multiple IDs with commas (,). You can specify a maximum of 10 IDs.
         */
        public Builder alertUnit(String alertUnit) {
            this.putBodyParameter("AlertUnit", alertUnit);
            this.alertUnit = alertUnit;
            return this;
        }

        /**
         * The ID of the workflow to which the custom alert rule is applied. This parameter takes effect when the RemindUnit parameter is set to BIZPROCESS. You can specify multiple IDs. Separate multiple IDs with commas (,). A maximum of five workflows can be specified for a custom alert rule.
         */
        public Builder baselineIds(String baselineIds) {
            this.putBodyParameter("BaselineIds", baselineIds);
            this.baselineIds = baselineIds;
            return this;
        }

        /**
         * The maximum number of alerts. Valid values: 1 to 10. Default value: 3.
         */
        public Builder bizProcessIds(String bizProcessIds) {
            this.putBodyParameter("BizProcessIds", bizProcessIds);
            this.bizProcessIds = bizProcessIds;
            return this;
        }

        /**
         * The notification method. Valid values:
         * <p>
         * 
         * *   MAIL: Alert notifications are sent by emails.
         * 
         * *   SMS: Alert notifications are sent by text messages.
         * 
         *     Alert notifications can be sent by text messages only in the Singapore, Malaysia (Kuala Lumpur), and Germany (Frankfurt) regions.
         * 
         * *   WEBHOOKS (WeCom or Lark chatbot): Alert notifications are sent by WeCom or Lark messages. If you want to use this notification method, you must configure the Webhooks parameter.
         * 
         * You can specify multiple notification methods. Separate them with commas (,).
         */
        public Builder detail(String detail) {
            this.putBodyParameter("Detail", detail);
            this.detail = detail;
            return this;
        }

        /**
         * The ID of the node to which the custom alert rule is applied. This parameter takes effect when the RemindUnit parameter is set to NODE. You can specify multiple IDs. Separate multiple IDs with commas (,). A maximum of 50 nodes can be specified for a custom alert rule.
         */
        public Builder dndEnd(String dndEnd) {
            this.putBodyParameter("DndEnd", dndEnd);
            this.dndEnd = dndEnd;
            return this;
        }

        /**
         * The details of the conditions that trigger an alert.
         * <p>
         * 
         * *   If the RemindType parameter is set to FINISHED, leave this parameter empty.
         * *   If the RemindType parameter is set to UNFINISHED, specify this parameter as key-value pairs. Example: {"hour":23,"minu":59}. Valid values of hour: 0 to 47. Valid values of minu: 0 to 59.
         * *   If the RemindType parameter is set to ERROR, leave this parameter empty.
         * *   If the RemindType parameter is set to CYCLE_UNFINISHED, specify this parameter as key-value pairs. Example: {"1":"05:50","2":"06:50","3":"07:50","4":"08:50","5":"09:50","6":"10:50","7":"11:50","8":"12:50","9":"13:50","10":"14:50","11":"15:50","12":"16:50","13":"17:50","14":"18:50","15":"19:50","16":"20:50","17":"21:50","18":"22:50","19":"23:50","20":"24:50","21":"25:50"}. The key indicates the ID of the cycle. Valid values of the ID: 1 to 288. The value indicates the timeout period of the node that is running in the cycle. Specify the value in the hh:mm format. Valid values of hh: 0 to 47. Valid values of mm: 0 to 59.
         * *   If the RemindType parameter is set to TIMEOUT, set this parameter to the timeout period. Unit: seconds. Example: 1800. This value indicates that an alert is reported if the node has run for more than 30 minutes.
         */
        public Builder maxAlertTimes(Integer maxAlertTimes) {
            this.putBodyParameter("MaxAlertTimes", maxAlertTimes);
            this.maxAlertTimes = maxAlertTimes;
            return this;
        }

        /**
         * The ID of the workspace to which the custom alert rule is applied. This parameter takes effect when the RemindUnit parameter is set to PROJECT. Only one workspace can be specified for a custom alert rule.
         */
        public Builder nodeIds(String nodeIds) {
            this.putBodyParameter("NodeIds", nodeIds);
            this.nodeIds = nodeIds;
            return this;
        }

        /**
         * The conditions that trigger an alert. Valid values: FINISHED, UNFINISHED, ERROR, CYCLE_UNFINISHED, and TIMEOUT. The value FINISHED indicates that the node is run. The value UNFINISHED indicates that the node is still running at the specified point in time. The value ERROR indicates that an error occurs when the node is running. The value CYCLE_UNFINISHED indicates that the node is still running in the specified cycle. The value TIMEOUT indicates that the node times out.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The type of the object to which the custom alert rule is applied. Valid values: NODE, BASELINE, PROJECT, and BIZPROCESS. The value NODE indicates a node. The value BASELINE indicates a baseline. The value PROJECT indicates a workspace. The value BIZPROCESS indicates a workflow.
         */
        public Builder remindName(String remindName) {
            this.putBodyParameter("RemindName", remindName);
            this.remindName = remindName;
            return this;
        }

        /**
         * The minimum interval at which alerts are reported. Unit: seconds. Minimum value: 1200. Default value: 1800.
         */
        public Builder remindType(String remindType) {
            this.putBodyParameter("RemindType", remindType);
            this.remindType = remindType;
            return this;
        }

        /**
         * The ID of the baseline to which the custom alert rule is applied. This parameter takes effect when the RemindUnit parameter is set to BASELINE. You can specify multiple IDs. Separate multiple IDs with commas (,). A maximum of five baselines can be specified for a custom alert rule.
         */
        public Builder remindUnit(String remindUnit) {
            this.putBodyParameter("RemindUnit", remindUnit);
            this.remindUnit = remindUnit;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder robotUrls(String robotUrls) {
            this.putBodyParameter("RobotUrls", robotUrls);
            this.robotUrls = robotUrls;
            return this;
        }

        /**
         * The ID of the custom alert rule returned.
         */
        public Builder webhooks(String webhooks) {
            this.putBodyParameter("Webhooks", webhooks);
            this.webhooks = webhooks;
            return this;
        }

        @Override
        public CreateRemindRequest build() {
            return new CreateRemindRequest(this);
        } 

    } 

}
