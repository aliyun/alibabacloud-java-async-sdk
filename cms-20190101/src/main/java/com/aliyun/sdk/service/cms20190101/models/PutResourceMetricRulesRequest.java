// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutResourceMetricRulesRequest} extends {@link RequestModel}
 *
 * <p>PutResourceMetricRulesRequest</p>
 */
public class PutResourceMetricRulesRequest extends Request {
    @Query
    @NameInMap("Rules")
    @Validation(required = true)
    private java.util.List < Rules> rules;

    private PutResourceMetricRulesRequest(Builder builder) {
        super(builder);
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutResourceMetricRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return rules
     */
    public java.util.List < Rules> getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<PutResourceMetricRulesRequest, Builder> {
        private java.util.List < Rules> rules; 

        private Builder() {
            super();
        } 

        private Builder(PutResourceMetricRulesRequest request) {
            super(request);
            this.rules = request.rules;
        } 

        /**
         * Rules.
         */
        public Builder rules(java.util.List < Rules> rules) {
            this.putQueryParameter("Rules", rules);
            this.rules = rules;
            return this;
        }

        @Override
        public PutResourceMetricRulesRequest build() {
            return new PutResourceMetricRulesRequest(this);
        } 

    } 

    public static class Critical extends TeaModel {
        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("N")
        private Integer n;

        @NameInMap("PreCondition")
        private String preCondition;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
        private String threshold;

        @NameInMap("Times")
        private Integer times;

        private Critical(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.n = builder.n;
            this.preCondition = builder.preCondition;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Critical create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return n
         */
        public Integer getN() {
            return this.n;
        }

        /**
         * @return preCondition
         */
        public String getPreCondition() {
            return this.preCondition;
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
         * @return times
         */
        public Integer getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String comparisonOperator; 
            private Integer n; 
            private String preCondition; 
            private String statistics; 
            private String threshold; 
            private Integer times; 

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * N.
             */
            public Builder n(Integer n) {
                this.n = n;
                return this;
            }

            /**
             * PreCondition.
             */
            public Builder preCondition(String preCondition) {
                this.preCondition = preCondition;
                return this;
            }

            /**
             * Statistics.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * Times.
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            public Critical build() {
                return new Critical(this);
            } 

        } 

    }
    public static class Info extends TeaModel {
        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("N")
        private Integer n;

        @NameInMap("PreCondition")
        private String preCondition;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
        private String threshold;

        @NameInMap("Times")
        private Integer times;

        private Info(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.n = builder.n;
            this.preCondition = builder.preCondition;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Info create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return n
         */
        public Integer getN() {
            return this.n;
        }

        /**
         * @return preCondition
         */
        public String getPreCondition() {
            return this.preCondition;
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
         * @return times
         */
        public Integer getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String comparisonOperator; 
            private Integer n; 
            private String preCondition; 
            private String statistics; 
            private String threshold; 
            private Integer times; 

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * N.
             */
            public Builder n(Integer n) {
                this.n = n;
                return this;
            }

            /**
             * PreCondition.
             */
            public Builder preCondition(String preCondition) {
                this.preCondition = preCondition;
                return this;
            }

            /**
             * Statistics.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * Times.
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            public Info build() {
                return new Info(this);
            } 

        } 

    }
    public static class Warn extends TeaModel {
        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("N")
        private Integer n;

        @NameInMap("PreCondition")
        private String preCondition;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
        private String threshold;

        @NameInMap("Times")
        private Integer times;

        private Warn(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.n = builder.n;
            this.preCondition = builder.preCondition;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Warn create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return n
         */
        public Integer getN() {
            return this.n;
        }

        /**
         * @return preCondition
         */
        public String getPreCondition() {
            return this.preCondition;
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
         * @return times
         */
        public Integer getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String comparisonOperator; 
            private Integer n; 
            private String preCondition; 
            private String statistics; 
            private String threshold; 
            private Integer times; 

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * N.
             */
            public Builder n(Integer n) {
                this.n = n;
                return this;
            }

            /**
             * PreCondition.
             */
            public Builder preCondition(String preCondition) {
                this.preCondition = preCondition;
                return this;
            }

            /**
             * Statistics.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * Times.
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            public Warn build() {
                return new Warn(this);
            } 

        } 

    }
    public static class Escalations extends TeaModel {
        @NameInMap("Critical")
        @Validation(required = true)
        private Critical critical;

        @NameInMap("Info")
        @Validation(required = true)
        private Info info;

        @NameInMap("Warn")
        @Validation(required = true)
        private Warn warn;

        private Escalations(Builder builder) {
            this.critical = builder.critical;
            this.info = builder.info;
            this.warn = builder.warn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Escalations create() {
            return builder().build();
        }

        /**
         * @return critical
         */
        public Critical getCritical() {
            return this.critical;
        }

        /**
         * @return info
         */
        public Info getInfo() {
            return this.info;
        }

        /**
         * @return warn
         */
        public Warn getWarn() {
            return this.warn;
        }

        public static final class Builder {
            private Critical critical; 
            private Info info; 
            private Warn warn; 

            /**
             * Critical.
             */
            public Builder critical(Critical critical) {
                this.critical = critical;
                return this;
            }

            /**
             * Info.
             */
            public Builder info(Info info) {
                this.info = info;
                return this;
            }

            /**
             * Warn.
             */
            public Builder warn(Warn warn) {
                this.warn = warn;
                return this;
            }

            public Escalations build() {
                return new Escalations(this);
            } 

        } 

    }
    public static class Labels extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The interval at which the alert rule is executed.
             * <p>
             * 
             * Unit: seconds.
             * 
             * Valid values of N: 1 to 500.
             * 
             * >  For information about how to query the statistical period of a metric, see [Appendix 1: Metrics](~~163515~~).
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The subject of the alert notification email.
             * <p>
             * 
             * Valid values of N: 1 to 500.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    public static class Rules extends TeaModel {
        @NameInMap("Escalations")
        @Validation(required = true)
        private Escalations escalations;

        @NameInMap("ContactGroups")
        @Validation(required = true)
        private String contactGroups;

        @NameInMap("EffectiveInterval")
        private String effectiveInterval;

        @NameInMap("EmailSubject")
        private String emailSubject;

        @NameInMap("Interval")
        private String interval;

        @NameInMap("Labels")
        private java.util.List < Labels> labels;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("Namespace")
        @Validation(required = true)
        private String namespace;

        @NameInMap("NoDataPolicy")
        private String noDataPolicy;

        @NameInMap("NoEffectiveInterval")
        private String noEffectiveInterval;

        @NameInMap("Period")
        private String period;

        @NameInMap("Resources")
        @Validation(required = true)
        private String resources;

        @NameInMap("RuleId")
        @Validation(required = true)
        private String ruleId;

        @NameInMap("RuleName")
        @Validation(required = true)
        private String ruleName;

        @NameInMap("SilenceTime")
        private Integer silenceTime;

        @NameInMap("Webhook")
        private String webhook;

        private Rules(Builder builder) {
            this.escalations = builder.escalations;
            this.contactGroups = builder.contactGroups;
            this.effectiveInterval = builder.effectiveInterval;
            this.emailSubject = builder.emailSubject;
            this.interval = builder.interval;
            this.labels = builder.labels;
            this.metricName = builder.metricName;
            this.namespace = builder.namespace;
            this.noDataPolicy = builder.noDataPolicy;
            this.noEffectiveInterval = builder.noEffectiveInterval;
            this.period = builder.period;
            this.resources = builder.resources;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.silenceTime = builder.silenceTime;
            this.webhook = builder.webhook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return escalations
         */
        public Escalations getEscalations() {
            return this.escalations;
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
         * @return interval
         */
        public String getInterval() {
            return this.interval;
        }

        /**
         * @return labels
         */
        public java.util.List < Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return noDataPolicy
         */
        public String getNoDataPolicy() {
            return this.noDataPolicy;
        }

        /**
         * @return noEffectiveInterval
         */
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
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
         * @return webhook
         */
        public String getWebhook() {
            return this.webhook;
        }

        public static final class Builder {
            private Escalations escalations; 
            private String contactGroups; 
            private String effectiveInterval; 
            private String emailSubject; 
            private String interval; 
            private java.util.List < Labels> labels; 
            private String metricName; 
            private String namespace; 
            private String noDataPolicy; 
            private String noEffectiveInterval; 
            private String period; 
            private String resources; 
            private String ruleId; 
            private String ruleName; 
            private Integer silenceTime; 
            private String webhook; 

            /**
             * Escalations.
             */
            public Builder escalations(Escalations escalations) {
                this.escalations = escalations;
                return this;
            }

            /**
             * The error message.
             */
            public Builder contactGroups(String contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * The operation that you want to perform. Set the value to **PutResourceMetricRules**.
             */
            public Builder effectiveInterval(String effectiveInterval) {
                this.effectiveInterval = effectiveInterval;
                return this;
            }

            /**
             * The HTTP status code.
             */
            public Builder emailSubject(String emailSubject) {
                this.emailSubject = emailSubject;
                return this;
            }

            /**
             * The alert contact group. The alert notifications are sent to the alert contacts in the alert contact group.
             * <p>
             * 
             * Valid values of N: 1 to 500.
             * 
             * >  An alert contact group can contain one or more alert contacts. For information about how to create alert contacts and alert contact groups, see [PutContact](~~114923~~) and [PutContactGroup](~~114929~~).
             */
            public Builder interval(String interval) {
                this.interval = interval;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.List < Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * The HTTP status code.
             * <p>
             * 
             * >  The status code 200 indicates that the call was successful.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The name of the alert rule.
             * <p>
             * 
             * Valid values of N: 1 to 500.
             * 
             * You can specify a new name or the name of an existing alert rule. For information about how to query the name of an alert rule, see [DescribeMetricRuleList](~~114941~~).
             * 
             * >  If you specify a new name, you create a threshold-triggered alert rule.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * Indicates whether the call was successful. Valid values:
             * <p>
             * 
             * *   true: The call was successful.
             * *   false: The call failed.
             */
            public Builder noDataPolicy(String noDataPolicy) {
                this.noDataPolicy = noDataPolicy;
                return this;
            }

            /**
             * The time period during which the alert rule is effective.
             * <p>
             * 
             * Valid values of N: 1 to 500.
             */
            public Builder noEffectiveInterval(String noEffectiveInterval) {
                this.noEffectiveInterval = noEffectiveInterval;
                return this;
            }

            /**
             * The name of the metric.
             * <p>
             * 
             * Valid values of N: 1 to 500.
             * 
             * For information about how to query the name of a metric, see [Appendix 1: Metrics](~~163515~~).
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * The statistical methods for Warn-level alerts. Valid values:
             * <p>
             * 
             * *   Maximum: the maximum value
             * *   Minimum: the minimum value
             * *   Average: the average value
             * *   Availability: the availability rate
             * 
             * Valid values of N: 1 to 500.
             * 
             * >  You must set a collection of the Rules.N.Escalations.Critical.Statistics, Rules.N.Escalations.Critical.ComparisonOperator, Rules.N.Escalations.Critical.Threshold, and Rules.N.Escalations.Critical.Times parameters, a collection of the Rules.N.Escalations.Warn.Statistics, Rules.N.Escalations.Warn.ComparisonOperator, Rules.N.Escalations.Warn.Threshold, and Rules.N.Escalations.Warn.Times parameters, or a collection of the Rules.N.Escalations.Info.Statistics, Rules.N.Escalations.Info.ComparisonOperator, Rules.N.Escalations.Info.Threshold, and Rules.N.Escalations.Info.Times parameters.
             */
            public Builder resources(String resources) {
                this.resources = resources;
                return this;
            }

            /**
             * The error message.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The ID of the alert rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The method that is used to handle alerts when no monitoring data is found. Valid values:
             * <p>
             * 
             * *   KEEP_LAST_STATE (default value): No operation is performed.
             * *   INSUFFICIENT_DATA: An alert whose content is "Insufficient data" is triggered.
             * *   OK: The status is considered normal.
             * 
             * Valid values of N: 1 to 500.
             */
            public Builder silenceTime(Integer silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * The mute period during which new alerts are not sent even if the trigger conditions are met.
             * <p>
             * 
             * Unit: seconds. Default value: 86400.
             * 
             * Valid values of N: 1 to 500.
             * 
             * >  If an alert is not cleared after the mute period ends, CloudMonitor resends an alert notification.
             */
            public Builder webhook(String webhook) {
                this.webhook = webhook;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
