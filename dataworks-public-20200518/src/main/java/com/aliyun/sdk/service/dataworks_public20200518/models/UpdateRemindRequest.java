// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateRemindRequest} extends {@link RequestModel}
 *
 * <p>UpdateRemindRequest</p>
 */
public class UpdateRemindRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertInterval")
    @com.aliyun.core.annotation.Validation(maximum = 1800, minimum = 1200)
    private Integer alertInterval;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertMethods")
    private String alertMethods;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertTargets")
    private String alertTargets;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertUnit")
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
    @com.aliyun.core.annotation.NameInMap("RemindId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long remindId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemindName")
    private String remindName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemindType")
    private String remindType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemindUnit")
    private String remindUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RobotUrls")
    private String robotUrls;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UseFlag")
    private Boolean useFlag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Webhooks")
    private String webhooks;

    private UpdateRemindRequest(Builder builder) {
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
        this.remindId = builder.remindId;
        this.remindName = builder.remindName;
        this.remindType = builder.remindType;
        this.remindUnit = builder.remindUnit;
        this.robotUrls = builder.robotUrls;
        this.useFlag = builder.useFlag;
        this.webhooks = builder.webhooks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRemindRequest create() {
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
     * @return remindId
     */
    public Long getRemindId() {
        return this.remindId;
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
     * @return useFlag
     */
    public Boolean getUseFlag() {
        return this.useFlag;
    }

    /**
     * @return webhooks
     */
    public String getWebhooks() {
        return this.webhooks;
    }

    public static final class Builder extends Request.Builder<UpdateRemindRequest, Builder> {
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
        private Long remindId; 
        private String remindName; 
        private String remindType; 
        private String remindUnit; 
        private String robotUrls; 
        private Boolean useFlag; 
        private String webhooks; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRemindRequest request) {
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
            this.remindId = request.remindId;
            this.remindName = request.remindName;
            this.remindType = request.remindType;
            this.remindUnit = request.remindUnit;
            this.robotUrls = request.robotUrls;
            this.useFlag = request.useFlag;
            this.webhooks = request.webhooks;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The intervals at which alert notifications are sent. Unit: seconds. Minimum value: 1200. Default value: 1800.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        public Builder alertInterval(Integer alertInterval) {
            this.putBodyParameter("AlertInterval", alertInterval);
            this.alertInterval = alertInterval;
            return this;
        }

        /**
         * <p>The notification method. Valid values:</p>
         * <ul>
         * <li>MAIL: Alert notifications are sent by email.</li>
         * <li>SMS: Alert notifications are sent by text message.</li>
         * <li>PHONE: Alert notifications are sent by phone call. You can use this notification method only in DataWorks Professional Edition or more advanced editions.</li>
         * <li>DINGROBOTS: Alert notifications are sent by DingTalk message. You can use this notification method only if the RobotUrls parameter is configured.</li>
         * <li>WEBHOOKS (WeCom or Lark chatbot): Alert notifications are sent by WeCom or Lark message. You can use this notification method only if the Webhooks parameter is configured.</li>
         * </ul>
         * <p>Multiple notification methods are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>SMS,MAIL</p>
         */
        public Builder alertMethods(String alertMethods) {
            this.putBodyParameter("AlertMethods", alertMethods);
            this.alertMethods = alertMethods;
            return this;
        }

        /**
         * <p>The value format required by this parameter varies based on the value that you specify for the AlertUnit parameter. Take note of the following items:</p>
         * <ul>
         * <li>If the AlertUnit parameter is set to OWNER, leave this parameter empty.</li>
         * <li>If the AlertUnit parameter is set to OTHER, set this parameter to the unique ID (UID) of the specified user. You can specify multiple UIDs. Separate them with commas (,). A maximum of 10 UIDs can be specified for receiving alert notifications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>9527952795279527</p>
         */
        public Builder alertTargets(String alertTargets) {
            this.putBodyParameter("AlertTargets", alertTargets);
            this.alertTargets = alertTargets;
            return this;
        }

        /**
         * <p>The recipient to whom alert notifications are sent. Valid values: OWNER and OTHER. The value OWNER indicates that alert notifications are sent to the object owner. The value OTHER indicates that alert notifications are sent to a specified user.</p>
         * 
         * <strong>example:</strong>
         * <p>OWNER</p>
         */
        public Builder alertUnit(String alertUnit) {
            this.putBodyParameter("AlertUnit", alertUnit);
            this.alertUnit = alertUnit;
            return this;
        }

        /**
         * <p>The ID of the baseline to which the custom alert rule is applied. A maximum of 5 baselines can be specified for a custom alert rule. You can specify multiple IDs. Separate multiple IDs with commas (,). This parameter takes effect when you set the RemindUnit parameter to BASELINE.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        public Builder baselineIds(String baselineIds) {
            this.putBodyParameter("BaselineIds", baselineIds);
            this.baselineIds = baselineIds;
            return this;
        }

        /**
         * <p>The ID of the workflow to which the custom alert rule is applied. A maximum of 5 workflows can be specified for a custom alert rule. You can specify multiple IDs. Separate multiple IDs with commas (,). This parameter takes effect when you set the RemindUnit parameter to BIZPROCESS.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        public Builder bizProcessIds(String bizProcessIds) {
            this.putBodyParameter("BizProcessIds", bizProcessIds);
            this.bizProcessIds = bizProcessIds;
            return this;
        }

        /**
         * <p>The details of the conditions that trigger an alert.</p>
         * <ul>
         * <li>If the RemindType parameter is set to FINISHED, leave this parameter empty.</li>
         * <li>If the RemindType parameter is set to UNFINISHED, set this parameter to key-value pairs. Example: {&quot;hour&quot;:23,&quot;minu&quot;:59}. Valid values of hour: [0,47]. Valid values of minu: [0,59].</li>
         * <li>If the RemindType parameter is set to ERROR, leave this parameter empty.</li>
         * <li>If the RemindType parameter is set to CYCLE_UNFINISHED, set this parameter to key-value pairs in the JSON format. Example: {&quot;1&quot;:&quot;05:50&quot;,&quot;2&quot;:&quot;06:50&quot;,&quot;3&quot;:&quot;07:50&quot;,&quot;4&quot;:&quot;08:50&quot;,&quot;5&quot;:&quot;09:50&quot;,&quot;6&quot;:&quot;10:50&quot;,&quot;7&quot;:&quot;11:50&quot;,&quot;8&quot;:&quot;12:50&quot;,&quot;9&quot;:&quot;13:50&quot;,&quot;10&quot;:&quot;14:50&quot;,&quot;11&quot;:&quot;15:50&quot;,&quot;12&quot;:&quot;16:50&quot;,&quot;13&quot;:&quot;17:50&quot;,&quot;14&quot;:&quot;18:50&quot;,&quot;15&quot;:&quot;19:50&quot;,&quot;16&quot;:&quot;20:50&quot;,&quot;17&quot;:&quot;21:50&quot;,&quot;18&quot;:&quot;22:50&quot;,&quot;19&quot;:&quot;23:50&quot;,&quot;20&quot;:&quot;24:50&quot;,&quot;21&quot;:&quot;25:50&quot;}. A key in the JSON string indicates the sequence number of a cycle. Valid values of keys: 1 to 288. A value in the JSON string indicates the time in point when a monitored instance times out in the relevant cycle. Values must be in the format of hh:mm. Valid values of hh: [0,47]. Valid values of mm: [0,59].</li>
         * <li>If the RemindType parameter is set to TIMEOUT, set this parameter to the timeout period. Unit: seconds. Example: 1800. This indicates that an alert notification is sent if the running duration of a monitored instance exceeds 30 minutes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;hour&quot;:23,&quot;minu&quot;:59}</p>
         */
        public Builder detail(String detail) {
            this.putBodyParameter("Detail", detail);
            this.detail = detail;
            return this;
        }

        /**
         * <p>The end of the period during which no alert notifications are sent. Specify the time in the hh:mm format. Valid values of hh: [0,23]. Valid values of mm: [0,59].</p>
         * 
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        public Builder dndEnd(String dndEnd) {
            this.putBodyParameter("DndEnd", dndEnd);
            this.dndEnd = dndEnd;
            return this;
        }

        /**
         * <p>The maximum number of alerts. Valid values: 1 to 10. Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder maxAlertTimes(Integer maxAlertTimes) {
            this.putBodyParameter("MaxAlertTimes", maxAlertTimes);
            this.maxAlertTimes = maxAlertTimes;
            return this;
        }

        /**
         * <p>The ID of the node to which the custom alert rule is applied. A maximum of 50 nodes can be specified for a custom alert rule. You can specify multiple IDs. Separate multiple IDs with commas (,). This parameter takes effect when you set the RemindUnit parameter to NODE.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        public Builder nodeIds(String nodeIds) {
            this.putBodyParameter("NodeIds", nodeIds);
            this.nodeIds = nodeIds;
            return this;
        }

        /**
         * <p>The ID of the workspace to which the custom alert rule is applied. You can specify only one workspace for a custom alert rule. This parameter takes effect when you set the RemindUnit parameter to PROJECT.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The custom alert rule ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder remindId(Long remindId) {
            this.putBodyParameter("RemindId", remindId);
            this.remindId = remindId;
            return this;
        }

        /**
         * <p>The name of the custom alert rule. The name cannot exceed 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>update_remindname</p>
         */
        public Builder remindName(String remindName) {
            this.putBodyParameter("RemindName", remindName);
            this.remindName = remindName;
            return this;
        }

        /**
         * <p>The condition that triggers the alert rule. Valid values:</p>
         * <ul>
         * <li>FINISHED: The system monitors an instance when it starts to run and sends an alert notification after the running of the instance is complete.</li>
         * <li>UNFINISHED: The system monitors an instance when it starts to run and sends an alert notification if the instance is still running at the specified point in time.</li>
         * <li>ERROR: The system monitors an instance when it starts to run and sends an alert notification if an error occurs.</li>
         * <li>CYCLE_UNFINISHED: The system sends an alert notification if a monitored instance is still running at the end of the specified cycle. In most cases, you can configure this trigger condition for node instances that are scheduled to run by hour.</li>
         * <li>TIMEOUT: The system monitors an instance when it starts to run and sends an alert notification if the instance is still running after the specified period ends. In most cases, you can configure this trigger condition to monitor the running duration of node instances.</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/138172.html">Manage custom alert rules</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        public Builder remindType(String remindType) {
            this.putBodyParameter("RemindType", remindType);
            this.remindType = remindType;
            return this;
        }

        /**
         * <p>The type of the object to which the custom alert rule is applied. Valid values:</p>
         * <ul>
         * <li>NODE</li>
         * <li>BASELINE</li>
         * <li>PROJECT</li>
         * <li>BIZPROCESS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NODE</p>
         */
        public Builder remindUnit(String remindUnit) {
            this.putBodyParameter("RemindUnit", remindUnit);
            this.remindUnit = remindUnit;
            return this;
        }

        /**
         * <p>The webhook URL of the DingTalk chatbot. You can specify multiple webhook URLs. Separate multiple webhook URLs with commas (,). If this parameter is set to undefined, the specified webhook URLs are cleared.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=">https://oapi.dingtalk.com/robot/send?access_token=</a>******************************</p>
         */
        public Builder robotUrls(String robotUrls) {
            this.putBodyParameter("RobotUrls", robotUrls);
            this.robotUrls = robotUrls;
            return this;
        }

        /**
         * <p>Specifies whether to enable the alert rule. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder useFlag(Boolean useFlag) {
            this.putBodyParameter("UseFlag", useFlag);
            this.useFlag = useFlag;
            return this;
        }

        /**
         * <p>The webhook URL of the WeCom or Lark chatbot. You can specify multiple webhook URLs. Separate multiple webhook URLs with commas (,). The value of AlertMethods must include WEBHOOKS. If this parameter is set to undefined, the specified webhook URLs are cleared.</p>
         * <p>Only DataWorks Enterprise Edition supports this parameter. The webhook URL-based alerting feature is supported in the following regions: China (Shanghai), China (Chengdu), China (Zhangjiakou), China (Beijing), China (Hangzhou), China (Shenzhen), China (Hong Kong), Germany (Frankfurt), and Singapore.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://open.feishu.cn/open-apis/bot/v2/hook/">https://open.feishu.cn/open-apis/bot/v2/hook/</a>*******</p>
         */
        public Builder webhooks(String webhooks) {
            this.putBodyParameter("Webhooks", webhooks);
            this.webhooks = webhooks;
            return this;
        }

        @Override
        public UpdateRemindRequest build() {
            return new UpdateRemindRequest(this);
        } 

    } 

}
