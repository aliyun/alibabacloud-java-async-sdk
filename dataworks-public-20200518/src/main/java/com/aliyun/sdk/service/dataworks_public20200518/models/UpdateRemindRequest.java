// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
         * <p>The alert interval, in seconds. Minimum value: 1200. Default value: 1800.</p>
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
         * <p>The alert notification method. Valid values:</p>
         * <ul>
         * <li>MAIL</li>
         * <li>SMS</li>
         * <li>PHONE. Only DataWorks Professional Edition and higher support phone alerts.</li>
         * <li>DINGROBOTS (DingTalk chatbot). This method takes effect only after the RobotUrls parameter is configured.</li>
         * <li>Webhooks (WeCom or Lark chatbot). This method takes effect only after the Webhooks parameter is configured.</li>
         * </ul>
         * <p>Separate multiple alert methods with commas (,).</p>
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
         * <p>The configuration details for different alert recipients:</p>
         * <ul>
         * <li>When AlertUnit is set to OWNER (node owner), the configuration is left empty.</li>
         * <li>When AlertUnit is set to OTHER (specified user), set this parameter to the Alibaba Cloud UIDs of the specified users. Separate multiple UIDs with commas (,). You can specify up to 10 users to receive alerts.</li>
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
         * <p>The recipient of the alert. Valid values:</p>
         * <ul>
         * <li>OWNER: the node owner.</li>
         * <li>OTHER: a specified user.</li>
         * </ul>
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
         * <p>The baseline IDs when the monitored object is a baseline. A rule can monitor up to 5 baselines. Separate multiple baseline IDs with commas (,).
         * This parameter takes effect only when RemindUnit is set to BASELINE.</p>
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
         * <p>The business process IDs when the monitored object is a business process. A rule can monitor up to 5 business processes. Separate multiple business process IDs with commas (,).
         * This parameter takes effect only when RemindUnit is set to BIZPROCESS.</p>
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
         * <p>The configuration details for different trigger conditions:</p>
         * <ul>
         * <li>When RemindType (trigger condition) is set to FINISHED, the configuration is left empty.</li>
         * <li>When RemindType (trigger condition) is set to UNFINISHED, the configuration format is {&quot;hour&quot;:23,&quot;minu&quot;:59}. Valid values of hour: [0,47\]. Valid values of minu: [0,59\].</li>
         * <li>When RemindType (trigger condition) is set to ERROR, the configuration is left empty.</li>
         * <li>When RemindType (trigger condition) is set to CYCLE_UNFINISHED (cycle unfinished), the configuration format is {&quot;1&quot;:&quot;05:50&quot;,&quot;2&quot;:&quot;06:50&quot;,&quot;3&quot;:&quot;07:50&quot;,&quot;4&quot;:&quot;08:50&quot;,&quot;5&quot;:&quot;09:50&quot;,&quot;6&quot;:&quot;10:50&quot;,&quot;7&quot;:&quot;11:50&quot;,&quot;8&quot;:&quot;12:50&quot;,&quot;9&quot;:&quot;13:50&quot;,&quot;10&quot;:&quot;14:50&quot;,&quot;11&quot;:&quot;15:50&quot;,&quot;12&quot;:&quot;16:50&quot;,&quot;13&quot;:&quot;17:50&quot;,&quot;14&quot;:&quot;18:50&quot;,&quot;15&quot;:&quot;19:50&quot;,&quot;16&quot;:&quot;20:50&quot;,&quot;17&quot;:&quot;21:50&quot;,&quot;18&quot;:&quot;22:50&quot;,&quot;19&quot;:&quot;23:50&quot;,&quot;20&quot;:&quot;24:50&quot;,&quot;21&quot;:&quot;25:50&quot;}.
         * The key in the JSON string is the cycle number. Valid values: [1,288\]. The value is the unfinished time for the corresponding cycle in the format hh:mm. Valid values of hh: [0,47\]. Valid values of mm: [0,59\].</li>
         * <li>When RemindType (trigger condition) is set to TIMEOUT, the configuration format is 1800, in seconds. This means an alert is triggered if the instance has been running for more than 30 minutes.</li>
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
         * <p>The end time of the do-not-disturb period. Alerts are not sent before this time. Format: hh:mm. Valid values of hh: [0,23\]. Valid values of mm: [0,59\].</p>
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
         * <p>The maximum number of alerts. Valid values: [1,10\]. Default value: 3.</p>
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
         * <p>The node IDs when the monitored object is a node. A rule can monitor up to 50 nodes. Separate multiple node IDs with commas (,).
         * This parameter takes effect only when RemindUnit is set to NODE.</p>
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
         * <p>The workspace ID when the monitored object is a workspace. A rule can monitor only one workspace.
         * This parameter takes effect only when RemindUnit is set to PROJECT.</p>
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
         * <p>The ID of the custom rule.</p>
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
         * <p>The name of the custom rule. The name cannot exceed 128 characters in length.</p>
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
         * <li>FINISHED: The system monitors the instance from the start time and sends an alert when the node runs successfully.</li>
         * <li>UNFINISHED: The system monitors the instance from the start time and sends an alert if the node has not finished running by the specified target time.</li>
         * <li>ERROR: The system monitors the instance from the start time and sends an alert when the node encounters an error.</li>
         * <li>CYCLE_UNFINISHED: The system sends an alert if the instance has not finished running within the specified cycle. This is typically used to monitor instances that run on an hourly cycle.</li>
         * <li>TIMEOUT: The system monitors the instance from the start time and sends an alert if the node has not finished running after the specified duration. This is typically used to monitor the running duration of instances.</li>
         * </ul>
         * <p>For more information about alert trigger conditions, see <a href="https://help.aliyun.com/document_detail/138172.html">Custom rules</a>.</p>
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
         * <p>The type of the monitored object. Valid values:</p>
         * <ul>
         * <li>NODE</li>
         * <li>BASELINE</li>
         * <li>PROJECT (workspace)</li>
         * <li>BIZPROCESS (business process)</li>
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
         * <p>The webhook URLs of DingTalk group chatbots. Separate multiple webhook URLs with commas (,).
         * When the parameter settings are set to undefined, the system clears the DingTalk chatbot webhook URLs.</p>
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
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
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
         * <p>The webhook URLs of WeCom or Lark chatbots. Separate multiple webhook URLs with commas (,). The alertMethods parameter must include the WEBHOOKS alerting method. When the parameter is set to undefined, the system clears the webhook URLs.</p>
         * <p>Only DataWorks Enterprise Edition is supported.
         * Active regions: China (Shanghai), China (Chengdu), China (Zhangjiakou), China (Beijing), China (Hangzhou), China (Shenzhen), Hong Kong (China), Germany (Frankfurt), Asia-Pacific Southeast 1 (Singapore).</p>
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
