// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

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
        this.dryRun = builder.dryRun;
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
        private Boolean dryRun; 
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
            this.dryRun = request.dryRun;
            this.enableEndTime = request.enableEndTime;
            this.enableStartTime = request.enableStartTime;
            this.groupId = request.groupId;
            this.notifyLevel = request.notifyLevel;
            this.silenceTime = request.silenceTime;
            this.templateIds = request.templateIds;
            this.webhook = request.webhook;
        } 

        /**
         * <p>The application policy of the template. Valid values:</p>
         * <ul>
         * <li><p>all: deletes all rules created by using alert templates on the selected group and then creates new alert rules based on the template. This is the default value.</p>
         * </li>
         * <li><p>append: deletes the rules created by using the current alert template on the selected group and then creates new alert rules based on the current template.</p>
         * </li>
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
         * <p>The application mode of the template. Valid values:</p>
         * <ul>
         * <li><p>GROUP_INSTANCE_FIRST: application group instances take precedence. When the alert template is applied, the instances in the application group take precedence. If an instance specified in the template does not exist in the application group, the rule for the instance in the template is ignored.</p>
         * </li>
         * <li><p>ALARM_TEMPLATE_FIRST: alert template instances take precedence. When the alert template is applied, alert rules are created regardless of whether the instances exist in the application group.</p>
         * </li>
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
         * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run and does not bind a security group to the instance. The system checks whether required parameters are specified, the request format is valid, and service limits are met. If the request fails the dry run, an error is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong>: performs a normal request. If the request passes the dry run, an HTTP 2xx status code is returned and the operation is performed. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The end time of the effective period for the alert, in hours. The value is a two-digit string, such as &quot;00&quot;, &quot;18&quot;, or &quot;23&quot;. Valid values: 00 to 23. The value specifies the hour of the end time, and the actual effective period ends at the 59th minute of the hour. For example, &quot;23&quot; indicates that the effective period ends at 23:59. The default time zone is UTC+8.</p>
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
         * <p>The start time of the effective period for the alert, in hours. The value is a two-digit string, such as &quot;00&quot;, &quot;09&quot;, or &quot;23&quot;. Valid values: 00 to 23, which represent 00:00 to 23:00. The default time zone is UTC+8.</p>
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
         * <p>The ID of the application group.</p>
         * <p>For more information about how to obtain the ID of an application group, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
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
         * <p>&lt;props=&quot;china&quot;&gt;- 2: phone call, text message, mailbox, TradeManager, and DingTalk chatbot.</p>
         * <p>&lt;props=&quot;china&quot;&gt;- 3: text message, mailbox, TradeManager, and DingTalk chatbot.</p>
         * <p>&lt;props=&quot;china&quot;&gt;- 4: TradeManager and DingTalk chatbot.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;4: TradeManager and DingTalk chatbot.</p>
         * <p>&lt;props=&quot;partner&quot;&gt;4: TradeManager and DingTalk chatbot.</p>
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
         * <p>The mute for. Unit: seconds. Default value: 86400.</p>
         * <blockquote>
         * <p>If the monitoring data continuously exceeds the threshold of the alert rule, the system sends only one alert notification within each epoch.</p>
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
         * <p>For more information about how to obtain the ID of an alert template, see <a href="https://help.aliyun.com/document_detail/114982.html">DescribeMetricRuleTemplateList</a>.</p>
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
         * <p>The webhook URL to which a POST request is sent when an alert is triggered.</p>
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
