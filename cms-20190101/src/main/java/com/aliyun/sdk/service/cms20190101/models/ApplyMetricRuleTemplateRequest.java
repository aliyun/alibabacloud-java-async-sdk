// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ApplyMetricRuleTemplateRequest} extends {@link RequestModel}
 *
 * <p>ApplyMetricRuleTemplateRequest</p>
 */
public class ApplyMetricRuleTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppendMode")
    private String appendMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplyMode")
    private String applyMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableEndTime")
    private Long enableEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableStartTime")
    private Long enableStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyLevel")
    private Long notifyLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SilenceTime")
    private Long silenceTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Webhook")
    private String webhook;

    private ApplyMetricRuleTemplateRequest(Builder builder) {
        super(builder);
        this.appendMode = builder.appendMode;
        this.applyMode = builder.applyMode;
        this.enableEndTime = builder.enableEndTime;
        this.enableStartTime = builder.enableStartTime;
        this.groupId = builder.groupId;
        this.notifyLevel = builder.notifyLevel;
        this.silenceTime = builder.silenceTime;
        this.templateIds = builder.templateIds;
        this.webhook = builder.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyMetricRuleTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appendMode
     */
    public String getAppendMode() {
        return this.appendMode;
    }

    /**
     * @return applyMode
     */
    public String getApplyMode() {
        return this.applyMode;
    }

    /**
     * @return enableEndTime
     */
    public Long getEnableEndTime() {
        return this.enableEndTime;
    }

    /**
     * @return enableStartTime
     */
    public Long getEnableStartTime() {
        return this.enableStartTime;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return notifyLevel
     */
    public Long getNotifyLevel() {
        return this.notifyLevel;
    }

    /**
     * @return silenceTime
     */
    public Long getSilenceTime() {
        return this.silenceTime;
    }

    /**
     * @return templateIds
     */
    public String getTemplateIds() {
        return this.templateIds;
    }

    /**
     * @return webhook
     */
    public String getWebhook() {
        return this.webhook;
    }

    public static final class Builder extends Request.Builder<ApplyMetricRuleTemplateRequest, Builder> {
        private String appendMode; 
        private String applyMode; 
        private Long enableEndTime; 
        private Long enableStartTime; 
        private Long groupId; 
        private Long notifyLevel; 
        private Long silenceTime; 
        private String templateIds; 
        private String webhook; 

        private Builder() {
            super();
        } 

        private Builder(ApplyMetricRuleTemplateRequest request) {
            super(request);
            this.appendMode = request.appendMode;
            this.applyMode = request.applyMode;
            this.enableEndTime = request.enableEndTime;
            this.enableStartTime = request.enableStartTime;
            this.groupId = request.groupId;
            this.notifyLevel = request.notifyLevel;
            this.silenceTime = request.silenceTime;
            this.templateIds = request.templateIds;
            this.webhook = request.webhook;
        } 

        /**
         * <p>The template application policy. Valid values:</p>
         * <ul>
         * <li>all (default): deletes all the rules that are created by using the alert template from the selected application group, and then creates alert rules based on the template.</li>
         * <li>append: deletes the rules that are created by using the alert template from the selected application group, and then creates alert rules based on the existing template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder appendMode(String appendMode) {
            this.putQueryParameter("AppendMode", appendMode);
            this.appendMode = appendMode;
            return this;
        }

        /**
         * <p>The mode in which the alert template is applied. Valid values:</p>
         * <ul>
         * <li>GROUP_INSTANCE_FIRST: The metrics in the application group take precedence. If a metric specified in the alert template does not exist in the application group, the system does not generate an alert rule for the metric based on the alert template.</li>
         * <li>ALARM_TEMPLATE_FIRST: The metrics specified in the alert template take precedence. If a metric specified in the alert template does not exist in the application group, the system still generates an alert rule for the metric based on the alert template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GROUP_INSTANCE_FIRST</p>
         */
        public Builder applyMode(String applyMode) {
            this.putQueryParameter("ApplyMode", applyMode);
            this.applyMode = applyMode;
            return this;
        }

        /**
         * <p>The end of the time period during which the alert rule is effective. Valid values: 00 to 23. A value of 00 indicates 00:59 and a value of 23 indicates 23:59.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        public Builder enableEndTime(Long enableEndTime) {
            this.putQueryParameter("EnableEndTime", enableEndTime);
            this.enableEndTime = enableEndTime;
            return this;
        }

        /**
         * <p>The beginning of the time period during which the alert rule is effective. Valid values: 00 to 23. A value of 00 indicates 00:00 and a value of 23 indicates 23:00.</p>
         * 
         * <strong>example:</strong>
         * <p>00</p>
         */
        public Builder enableStartTime(Long enableStartTime) {
            this.putQueryParameter("EnableStartTime", enableStartTime);
            this.enableStartTime = enableStartTime;
            return this;
        }

        /**
         * <p>The ID of the application group to which the alert template is applied.</p>
         * <p>For more information about how to query the ID of an application group, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The alert notification method. Valid values:</p>
         * <p>Set the value to 4. A value of 4 indicates that alert notifications are sent by using TradeManager and DingTalk chatbots.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder notifyLevel(Long notifyLevel) {
            this.putQueryParameter("NotifyLevel", notifyLevel);
            this.notifyLevel = notifyLevel;
            return this;
        }

        /**
         * <p>The mute period during which notifications are not repeatedly sent for an alert. Unit: seconds. Default value: 86400.</p>
         * <blockquote>
         * <p> Only one alert notification is sent during each mute period even if the metric value exceeds the alert threshold several times.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        public Builder silenceTime(Long silenceTime) {
            this.putQueryParameter("SilenceTime", silenceTime);
            this.silenceTime = silenceTime;
            return this;
        }

        /**
         * <p>The ID of the alert template.</p>
         * <p>For more information about how to query the IDs of alert templates, see <a href="https://help.aliyun.com/document_detail/114982.html">DescribeMetricRuleTemplateList</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>700****</p>
         */
        public Builder templateIds(String templateIds) {
            this.putQueryParameter("TemplateIds", templateIds);
            this.templateIds = templateIds;
            return this;
        }

        /**
         * <p>The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
         */
        public Builder webhook(String webhook) {
            this.putQueryParameter("Webhook", webhook);
            this.webhook = webhook;
            return this;
        }

        @Override
        public ApplyMetricRuleTemplateRequest build() {
            return new ApplyMetricRuleTemplateRequest(this);
        } 

    } 

}
