// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PutCustomEventRuleRequest} extends {@link RequestModel}
 *
 * <p>PutCustomEventRuleRequest</p>
 */
public class PutCustomEventRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroups")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveInterval")
    private String effectiveInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmailSubject")
    private String emailSubject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Level")
    @com.aliyun.core.annotation.Validation(required = true)
    private String level;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Threshold")
    @com.aliyun.core.annotation.Validation(required = true)
    private String threshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Webhook")
    private String webhook;

    private PutCustomEventRuleRequest(Builder builder) {
        super(builder);
        this.contactGroups = builder.contactGroups;
        this.effectiveInterval = builder.effectiveInterval;
        this.emailSubject = builder.emailSubject;
        this.eventName = builder.eventName;
        this.groupId = builder.groupId;
        this.level = builder.level;
        this.period = builder.period;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
        this.threshold = builder.threshold;
        this.webhook = builder.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutCustomEventRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactGroups
     */
    public String getContactGroups() {
        return this.contactGroups;
    }

    /**
     * @return effectiveInterval
     */
    public String getEffectiveInterval() {
        return this.effectiveInterval;
    }

    /**
     * @return emailSubject
     */
    public String getEmailSubject() {
        return this.emailSubject;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return threshold
     */
    public String getThreshold() {
        return this.threshold;
    }

    /**
     * @return webhook
     */
    public String getWebhook() {
        return this.webhook;
    }

    public static final class Builder extends Request.Builder<PutCustomEventRuleRequest, Builder> {
        private String contactGroups; 
        private String effectiveInterval; 
        private String emailSubject; 
        private String eventName; 
        private String groupId; 
        private String level; 
        private String period; 
        private String ruleId; 
        private String ruleName; 
        private String threshold; 
        private String webhook; 

        private Builder() {
            super();
        } 

        private Builder(PutCustomEventRuleRequest request) {
            super(request);
            this.contactGroups = request.contactGroups;
            this.effectiveInterval = request.effectiveInterval;
            this.emailSubject = request.emailSubject;
            this.eventName = request.eventName;
            this.groupId = request.groupId;
            this.level = request.level;
            this.period = request.period;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
            this.threshold = request.threshold;
            this.webhook = request.webhook;
        } 

        /**
         * <p>The alert contact group that receives alert notifications. Separate multiple contact groups with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_Group</p>
         */
        public Builder contactGroups(String contactGroups) {
            this.putQueryParameter("ContactGroups", contactGroups);
            this.contactGroups = contactGroups;
            return this;
        }

        /**
         * <p>The time period during which the alert rule is effective. Valid values: 00:00 to 23:59.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00-23:59</p>
         */
        public Builder effectiveInterval(String effectiveInterval) {
            this.putQueryParameter("EffectiveInterval", effectiveInterval);
            this.effectiveInterval = effectiveInterval;
            return this;
        }

        /**
         * <p>The subject of the alert notification email.</p>
         */
        public Builder emailSubject(String emailSubject) {
            this.putQueryParameter("EmailSubject", emailSubject);
            this.emailSubject = emailSubject;
            return this;
        }

        /**
         * <p>The name of the custom event. For more information about how to obtain the event name, see <a href="https://help.aliyun.com/document_detail/115262.html">DescribeCustomEventAttribute</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HostDown</p>
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * <p>The ID of the application group. For more information about how to obtain the group ID, see <a href="https://help.aliyun.com/document_detail/115262.html">DescribeCustomEventAttribute</a>.</p>
         * <blockquote>
         * <p> The value 0 indicates that the reported custom event does not belong to any application Group.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7378****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The level of the alert. Valid values:</p>
         * <ul>
         * <li>CRITICAL: critical issue</li>
         * <li>WARN: warning</li>
         * <li>INFO: information</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CRITICAL</p>
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * <p>The cycle that is used to aggregate monitoring data of the custom event. Unit: seconds. Set the value to an integral multiple of 60. Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The ID of the alert rule.</p>
         * <blockquote>
         * <p> You can specify an existing ID to modify the corresponding alert rule or specify a new ID to create an alert rule.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CustomRuleId1</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The name of the alert rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CustomeRule</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The alert threshold.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        public Builder threshold(String threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
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
        public PutCustomEventRuleRequest build() {
            return new PutCustomEventRuleRequest(this);
        } 

    } 

}
