// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyMetricRuleTemplateRequest} extends {@link RequestModel}
 *
 * <p>ApplyMetricRuleTemplateRequest</p>
 */
public class ApplyMetricRuleTemplateRequest extends Request {
    @Query
    @NameInMap("AppendMode")
    private String appendMode;

    @Query
    @NameInMap("ApplyMode")
    private String applyMode;

    @Query
    @NameInMap("EnableEndTime")
    private Long enableEndTime;

    @Query
    @NameInMap("EnableStartTime")
    private Long enableStartTime;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private Long groupId;

    @Query
    @NameInMap("NotifyLevel")
    private Long notifyLevel;

    @Query
    @NameInMap("SilenceTime")
    private Long silenceTime;

    @Query
    @NameInMap("TemplateIds")
    @Validation(required = true)
    private String templateIds;

    @Query
    @NameInMap("Webhook")
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
         * AppendMode.
         */
        public Builder appendMode(String appendMode) {
            this.putQueryParameter("AppendMode", appendMode);
            this.appendMode = appendMode;
            return this;
        }

        /**
         * The mode in which the alert template is applied. Valid values:
         * <p>
         * 
         * *   GROUP_INSTANCE_FIRST: The metrics in the application group take precedence. If a metric specified in the alert template does not exist in the application group, the system does not generate an alert rule for the metric based on the alert template.
         * *   ALARM_TEMPLATE_FIRST: The metrics specified in the alert template take precedence. If a metric specified in the alert template does not exist in the application group, the system still generates an alert rule for the metric based on the alert template.
         */
        public Builder applyMode(String applyMode) {
            this.putQueryParameter("ApplyMode", applyMode);
            this.applyMode = applyMode;
            return this;
        }

        /**
         * The end of the time period during which the alert rule is effective. Valid values: 00 to 23. A value of 00 indicates 00:59 and a value of 23 indicates 23:59.
         */
        public Builder enableEndTime(Long enableEndTime) {
            this.putQueryParameter("EnableEndTime", enableEndTime);
            this.enableEndTime = enableEndTime;
            return this;
        }

        /**
         * The beginning of the time period during which the alert rule is effective. Valid values: 00 to 23. A value of 00 indicates 00:00 and a value of 23 indicates 23:00.
         */
        public Builder enableStartTime(Long enableStartTime) {
            this.putQueryParameter("EnableStartTime", enableStartTime);
            this.enableStartTime = enableStartTime;
            return this;
        }

        /**
         * The ID of the application group to which the alert template is applied.
         * <p>
         * 
         * For more information about how to query the ID of an application group, see [DescribeMonitorGroups](~~115032~~).
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The alert notification method. Valid values:
         * <p>
         * 
         * Set the value to 4. A value of 4 indicates that alert notifications are sent by using TradeManager and DingTalk chatbots.
         */
        public Builder notifyLevel(Long notifyLevel) {
            this.putQueryParameter("NotifyLevel", notifyLevel);
            this.notifyLevel = notifyLevel;
            return this;
        }

        /**
         * The mute period during which notifications are not repeatedly sent for an alert. Unit: seconds. Default value: 86400.
         * <p>
         * 
         * >  Only one alert notification is sent during each mute period even if the metric value exceeds the alert threshold several times.
         */
        public Builder silenceTime(Long silenceTime) {
            this.putQueryParameter("SilenceTime", silenceTime);
            this.silenceTime = silenceTime;
            return this;
        }

        /**
         * The ID of the alert template.
         * <p>
         * 
         * For more information about how to query the IDs of alert templates, see [DescribeMetricRuleTemplateList](~~114982~~).
         */
        public Builder templateIds(String templateIds) {
            this.putQueryParameter("TemplateIds", templateIds);
            this.templateIds = templateIds;
            return this;
        }

        /**
         * The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.
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
