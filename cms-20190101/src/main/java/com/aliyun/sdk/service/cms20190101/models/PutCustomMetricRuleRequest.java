// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutCustomMetricRuleRequest} extends {@link RequestModel}
 *
 * <p>PutCustomMetricRuleRequest</p>
 */
public class PutCustomMetricRuleRequest extends Request {
    @Query
    @NameInMap("ComparisonOperator")
    @Validation(required = true)
    private String comparisonOperator;

    @Query
    @NameInMap("ContactGroups")
    @Validation(required = true)
    private String contactGroups;

    @Query
    @NameInMap("EffectiveInterval")
    private String effectiveInterval;

    @Query
    @NameInMap("EmailSubject")
    private String emailSubject;

    @Query
    @NameInMap("EvaluationCount")
    @Validation(required = true)
    private Integer evaluationCount;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("Level")
    @Validation(required = true)
    private String level;

    @Query
    @NameInMap("MetricName")
    @Validation(required = true)
    private String metricName;

    @Query
    @NameInMap("Period")
    private String period;

    @Query
    @NameInMap("Resources")
    @Validation(required = true)
    private String resources;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private String ruleId;

    @Query
    @NameInMap("RuleName")
    private String ruleName;

    @Query
    @NameInMap("SilenceTime")
    private Integer silenceTime;

    @Query
    @NameInMap("Statistics")
    @Validation(required = true)
    private String statistics;

    @Query
    @NameInMap("Threshold")
    @Validation(required = true)
    private String threshold;

    @Query
    @NameInMap("Webhook")
    private String webhook;

    private PutCustomMetricRuleRequest(Builder builder) {
        super(builder);
        this.comparisonOperator = builder.comparisonOperator;
        this.contactGroups = builder.contactGroups;
        this.effectiveInterval = builder.effectiveInterval;
        this.emailSubject = builder.emailSubject;
        this.evaluationCount = builder.evaluationCount;
        this.groupId = builder.groupId;
        this.level = builder.level;
        this.metricName = builder.metricName;
        this.period = builder.period;
        this.resources = builder.resources;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
        this.silenceTime = builder.silenceTime;
        this.statistics = builder.statistics;
        this.threshold = builder.threshold;
        this.webhook = builder.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutCustomMetricRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comparisonOperator
     */
    public String getComparisonOperator() {
        return this.comparisonOperator;
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
     * @return evaluationCount
     */
    public Integer getEvaluationCount() {
        return this.evaluationCount;
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
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return resources
     */
    public String getResources() {
        return this.resources;
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
     * @return silenceTime
     */
    public Integer getSilenceTime() {
        return this.silenceTime;
    }

    /**
     * @return statistics
     */
    public String getStatistics() {
        return this.statistics;
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

    public static final class Builder extends Request.Builder<PutCustomMetricRuleRequest, Builder> {
        private String comparisonOperator; 
        private String contactGroups; 
        private String effectiveInterval; 
        private String emailSubject; 
        private Integer evaluationCount; 
        private String groupId; 
        private String level; 
        private String metricName; 
        private String period; 
        private String resources; 
        private String ruleId; 
        private String ruleName; 
        private Integer silenceTime; 
        private String statistics; 
        private String threshold; 
        private String webhook; 

        private Builder() {
            super();
        } 

        private Builder(PutCustomMetricRuleRequest request) {
            super(request);
            this.comparisonOperator = request.comparisonOperator;
            this.contactGroups = request.contactGroups;
            this.effectiveInterval = request.effectiveInterval;
            this.emailSubject = request.emailSubject;
            this.evaluationCount = request.evaluationCount;
            this.groupId = request.groupId;
            this.level = request.level;
            this.metricName = request.metricName;
            this.period = request.period;
            this.resources = request.resources;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
            this.silenceTime = request.silenceTime;
            this.statistics = request.statistics;
            this.threshold = request.threshold;
            this.webhook = request.webhook;
        } 

        /**
         * The comparison operator before the threshold. Valid values:
         * <p>
         * 
         * *   `>=`
         * *   `=`
         * *   `<=`
         * *   `>`
         * *   `<`
         * *   `!=`
         */
        public Builder comparisonOperator(String comparisonOperator) {
            this.putQueryParameter("ComparisonOperator", comparisonOperator);
            this.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * The alert group that receives alert notifications. Separate multiple alert groups with commas (,).
         */
        public Builder contactGroups(String contactGroups) {
            this.putQueryParameter("ContactGroups", contactGroups);
            this.contactGroups = contactGroups;
            return this;
        }

        /**
         * The time period during which the alert rule is effective. Valid values: 00:00 to 23:59.
         */
        public Builder effectiveInterval(String effectiveInterval) {
            this.putQueryParameter("EffectiveInterval", effectiveInterval);
            this.effectiveInterval = effectiveInterval;
            return this;
        }

        /**
         * The subject of the alert notification email.
         */
        public Builder emailSubject(String emailSubject) {
            this.putQueryParameter("EmailSubject", emailSubject);
            this.emailSubject = emailSubject;
            return this;
        }

        /**
         * The consecutive number of times for which the metric value is measured before an alert is triggered.
         */
        public Builder evaluationCount(Integer evaluationCount) {
            this.putQueryParameter("EvaluationCount", evaluationCount);
            this.evaluationCount = evaluationCount;
            return this;
        }

        /**
         * The ID of the application group to which the custom monitoring data belongs.
         * <p>
         * 
         * >  The value 0 indicates that the reported custom monitoring data does not belong to an application group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The level of the alert. Valid values:
         * <p>
         * 
         * *   CRITICAL
         * *   WARN
         * *   INFO
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * The name of the metric.
         * <p>
         * 
         * >  For more information about how to obtain the metric name, see [DescribeCustomMetricList](~~115005~~).
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * The cycle that is used to aggregate custom monitoring data. Unit: seconds. Set the value to an integral multiple of 60. The original reporting cycle of custom monitoring data is used by default.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The custom monitoring data to which the alert rule applies. The value includes the application group ID to which the custom monitoring data belongs and the dimension to which the metric belongs.
         */
        public Builder resources(String resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        /**
         * The ID of the alert rule.
         * <p>
         * 
         * >  You can specify an existing ID to modify the corresponding alert rule or specify a new ID to create an alert rule.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * The name of the alert rule.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The mute period during which notifications are not repeatedly sent for an alert. Unit: seconds. Default value: 86400. The default value indicates one day.
         * <p>
         * 
         * >  Only one alert notification is sent during each mute period even if the metric value consecutively exceeds the alert threshold several times.
         */
        public Builder silenceTime(Integer silenceTime) {
            this.putQueryParameter("SilenceTime", silenceTime);
            this.silenceTime = silenceTime;
            return this;
        }

        /**
         * The method that is used to calculate the metric values that trigger alerts.
         */
        public Builder statistics(String statistics) {
            this.putQueryParameter("Statistics", statistics);
            this.statistics = statistics;
            return this;
        }

        /**
         * The threshold of the metric value.
         */
        public Builder threshold(String threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
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
        public PutCustomMetricRuleRequest build() {
            return new PutCustomMetricRuleRequest(this);
        } 

    } 

}
