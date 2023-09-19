// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutResourceMetricRuleRequest} extends {@link RequestModel}
 *
 * <p>PutResourceMetricRuleRequest</p>
 */
public class PutResourceMetricRuleRequest extends Request {
    @Query
    @NameInMap("Escalations")
    private Escalations escalations;

    @Query
    @NameInMap("CompositeExpression")
    private CompositeExpression compositeExpression;

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
    @NameInMap("Interval")
    private String interval;

    @Query
    @NameInMap("Labels")
    private java.util.List < Labels> labels;

    @Query
    @NameInMap("MetricName")
    @Validation(required = true)
    private String metricName;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("NoDataPolicy")
    private String noDataPolicy;

    @Query
    @NameInMap("NoEffectiveInterval")
    private String noEffectiveInterval;

    @Query
    @NameInMap("Period")
    private String period;

    @Query
    @NameInMap("Prometheus")
    private Prometheus prometheus;

    @Query
    @NameInMap("Resources")
    private String resources;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private String ruleId;

    @Query
    @NameInMap("RuleName")
    @Validation(required = true)
    private String ruleName;

    @Query
    @NameInMap("SilenceTime")
    private Integer silenceTime;

    @Query
    @NameInMap("Webhook")
    private String webhook;

    private PutResourceMetricRuleRequest(Builder builder) {
        super(builder);
        this.escalations = builder.escalations;
        this.compositeExpression = builder.compositeExpression;
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
        this.prometheus = builder.prometheus;
        this.resources = builder.resources;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
        this.silenceTime = builder.silenceTime;
        this.webhook = builder.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutResourceMetricRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return escalations
     */
    public Escalations getEscalations() {
        return this.escalations;
    }

    /**
     * @return compositeExpression
     */
    public CompositeExpression getCompositeExpression() {
        return this.compositeExpression;
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
     * @return prometheus
     */
    public Prometheus getPrometheus() {
        return this.prometheus;
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

    public static final class Builder extends Request.Builder<PutResourceMetricRuleRequest, Builder> {
        private Escalations escalations; 
        private CompositeExpression compositeExpression; 
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
        private Prometheus prometheus; 
        private String resources; 
        private String ruleId; 
        private String ruleName; 
        private Integer silenceTime; 
        private String webhook; 

        private Builder() {
            super();
        } 

        private Builder(PutResourceMetricRuleRequest request) {
            super(request);
            this.escalations = request.escalations;
            this.compositeExpression = request.compositeExpression;
            this.contactGroups = request.contactGroups;
            this.effectiveInterval = request.effectiveInterval;
            this.emailSubject = request.emailSubject;
            this.interval = request.interval;
            this.labels = request.labels;
            this.metricName = request.metricName;
            this.namespace = request.namespace;
            this.noDataPolicy = request.noDataPolicy;
            this.noEffectiveInterval = request.noEffectiveInterval;
            this.period = request.period;
            this.prometheus = request.prometheus;
            this.resources = request.resources;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
            this.silenceTime = request.silenceTime;
            this.webhook = request.webhook;
        } 

        /**
         * Escalations.
         */
        public Builder escalations(Escalations escalations) {
            this.putQueryParameter("Escalations", escalations);
            this.escalations = escalations;
            return this;
        }

        /**
         * The trigger conditions for multiple metrics.
         * <p>
         * 
         * >  The trigger conditions for a single metric and multiple metrics are mutually exclusive. You cannot specify trigger conditions for a single metric and multiple metrics at the same time.
         */
        public Builder compositeExpression(CompositeExpression compositeExpression) {
            String compositeExpressionShrink = shrink(compositeExpression, "CompositeExpression", "json");
            this.putQueryParameter("CompositeExpression", compositeExpressionShrink);
            this.compositeExpression = compositeExpression;
            return this;
        }

        /**
         * The alert contact group. The alert notifications are sent to the contacts that belong to the alert contact group.
         * <p>
         * 
         * >  An alert contact group can contain one or more alert contacts. For information about how to create alert contacts and alert contact groups, see [PutContact](~~114923~~) and [PutContactGroup](~~114929~~).
         */
        public Builder contactGroups(String contactGroups) {
            this.putQueryParameter("ContactGroups", contactGroups);
            this.contactGroups = contactGroups;
            return this;
        }

        /**
         * The time period during which the alert rule is effective.
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
         * The interval at which the alert is triggered. Unit: seconds.
         * <p>
         * 
         * >  For information about how to query the statistical period of a metric, see [Appendix 1: Metrics](~~163515~~).
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * The tags.
         */
        public Builder labels(java.util.List < Labels> labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * The name of the metric. For information about how to query the name of a metric, see [Appendix 1: Metrics](~~163515~~).
         * <p>
         * 
         * >  If you create a Prometheus alert rule for Hybrid Cloud Monitoring, you must set this parameter to the name of the namespace. For information about how to obtain the name of a namespace, see [DescribeHybridMonitorNamespaceList](~~428880~~).
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * The namespace of the cloud service. For information about how to query the namespace of a cloud service, see [Appendix 1: Metrics](~~163515~~).
         * <p>
         * 
         * >  If you create a Prometheus alert rule for Hybrid Cloud Monitoring, you must set this parameter to `acs_prometheus`.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The processing method of alerts when no monitoring data is found. Valid values:
         * <p>
         * 
         * *   KEEP_LAST_STATE (default value): No operation is performed.
         * *   INSUFFICIENT_DATA: An alert whose content is "Insufficient data" is triggered.
         * *   OK: The status is considered normal.
         */
        public Builder noDataPolicy(String noDataPolicy) {
            this.putQueryParameter("NoDataPolicy", noDataPolicy);
            this.noDataPolicy = noDataPolicy;
            return this;
        }

        /**
         * The time period during which the alert rule is ineffective.
         */
        public Builder noEffectiveInterval(String noEffectiveInterval) {
            this.putQueryParameter("NoEffectiveInterval", noEffectiveInterval);
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }

        /**
         * The statistical period of the metric. Unit: seconds. The default value is the interval at which the monitoring data of the metric is collected.
         * <p>
         * 
         * >  For information about how to query the statistical period of a metric, see [Appendix 1: Metrics](~~163515~~).
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The Prometheus alert rule.
         * <p>
         * 
         * >  This parameter is required only when you create a Prometheus alert rule for Hybrid Cloud Monitoring.
         */
        public Builder prometheus(Prometheus prometheus) {
            String prometheusShrink = shrink(prometheus, "Prometheus", "json");
            this.putQueryParameter("Prometheus", prometheusShrink);
            this.prometheus = prometheus;
            return this;
        }

        /**
         * The information about the resource. Examples: `[{"instanceId":"i-uf6j91r34rnwawoo****"}]` and `[{"userId":"100931896542****"}]`.
         * <p>
         * 
         * For information about the supported dimensions that are used to query resources, see [Appendix 1: Metrics](~~163515~~).
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
         * You can specify a new ID or the ID of an existing alert rule. For information about how to query the ID of an alert rule, see [DescribeMetricRuleList](~~114941~~).
         * 
         * >  If you specify a new ID, a threshold-triggered alert rule is created.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * The name of the alert rule.
         * <p>
         * 
         * You can specify a new name or the name of an existing alert rule. For information about how to query the name of an alert rule, see [DescribeMetricRuleList](~~114941~~).
         * 
         * >  If you specify a new name, a threshold-triggered alert rule is created.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The mute period during which new alerts are not sent even if the trigger conditions are met. Unit: seconds. Default value: 86400.
         * <p>
         * 
         * >  If an alert is not cleared within the mute period, a new alert notification is sent when the mute period ends.
         */
        public Builder silenceTime(Integer silenceTime) {
            this.putQueryParameter("SilenceTime", silenceTime);
            this.silenceTime = silenceTime;
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
        public PutResourceMetricRuleRequest build() {
            return new PutResourceMetricRuleRequest(this);
        } 

    } 

    public static class Critical extends TeaModel {
        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
        private String threshold;

        @NameInMap("Times")
        private Integer times;

        private Critical(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
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
            private String statistics; 
            private String threshold; 
            private Integer times; 

            /**
             * The operator that is used to compare the metric value with the threshold. Valid values:
             * <p>
             * 
             * *   GreaterThanOrEqualToThreshold: greater than or equal to the threshold
             * *   GreaterThanThreshold: greater than the threshold
             * *   LessThanOrEqualToThreshold: less than or equal to the threshold
             * *   LessThanThreshold: less than the threshold
             * *   NotEqualToThreshold: not equal to the threshold
             * *   GreaterThanYesterday: greater than the metric value at the same time yesterday
             * *   LessThanYesterday: less than the metric value at the same time yesterday
             * *   GreaterThanLastWeek: greater than the metric value at the same time last week
             * *   LessThanLastWeek: less than the metric value at the same time last week
             * *   GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle
             * *   LessThanLastPeriod: less than the metric value in the last monitoring cycle
             * 
             * >  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * The statistical methods for Critical-level alerts. Valid values:
             * <p>
             * 
             * *   Maximum: the maximum value
             * *   Minimum: the minimum value
             * *   Average: the average value
             * *   Availability: the availability rate
             * 
             * >  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The threshold for Critical-level alerts.
             * <p>
             * 
             * >  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * The consecutive number of times for which the metric value meets the trigger condition before a Critical-level alert is triggered.
             * <p>
             * 
             * >  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.
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

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
        private String threshold;

        @NameInMap("Times")
        private Integer times;

        private Info(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
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
            private String statistics; 
            private String threshold; 
            private Integer times; 

            /**
             * The operator that is used to compare the metric value with the threshold. Valid values:
             * <p>
             * 
             * *   GreaterThanOrEqualToThreshold: greater than or equal to the threshold
             * *   GreaterThanThreshold: greater than the threshold
             * *   LessThanOrEqualToThreshold: less than or equal to the threshold
             * *   LessThanThreshold: less than the threshold
             * *   NotEqualToThreshold: not equal to the threshold
             * *   GreaterThanYesterday: greater than the metric value at the same time yesterday
             * *   LessThanYesterday: less than the metric value at the same time yesterday
             * *   GreaterThanLastWeek: greater than the metric value at the same time last week
             * *   LessThanLastWeek: less than the metric value at the same time last week
             * *   GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle
             * *   LessThanLastPeriod: less than the metric value in the last monitoring cycle
             * 
             * >  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * The statistical methods for Info-level alerts. Valid values:
             * <p>
             * 
             * *   Maximum: the maximum value
             * *   Minimum: the minimum value
             * *   Average: the average value
             * *   Availability: the availability rate
             * 
             * >  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The threshold for Info-level alerts.
             * <p>
             * 
             * >  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * The consecutive number of times for which the metric value meets the trigger condition before an Info-level alert is triggered.
             * <p>
             * 
             * >  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.
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

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
        private String threshold;

        @NameInMap("Times")
        private Integer times;

        private Warn(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
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
            private String statistics; 
            private String threshold; 
            private Integer times; 

            /**
             * The operator that is used to compare the metric value with the threshold. Valid values:
             * <p>
             * 
             * *   GreaterThanOrEqualToThreshold: greater than or equal to the threshold
             * *   GreaterThanThreshold: greater than the threshold
             * *   LessThanOrEqualToThreshold: less than or equal to the threshold
             * *   LessThanThreshold: less than the threshold
             * *   NotEqualToThreshold: not equal to the threshold
             * *   GreaterThanYesterday: greater than the metric value at the same time yesterday
             * *   LessThanYesterday: less than the metric value at the same time yesterday
             * *   GreaterThanLastWeek: greater than the metric value at the same time last week
             * *   LessThanLastWeek: less than the metric value at the same time last week
             * *   GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle
             * *   LessThanLastPeriod: less than the metric value in the last monitoring cycle
             * 
             * >  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
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
             * >  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The threshold for Warn-level alerts.
             * <p>
             * 
             * >  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * The consecutive number of times for which the metric value meets the trigger condition before a Warn-level alert is triggered.
             * <p>
             * 
             * >  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.
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
    public static class ExpressionList extends TeaModel {
        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("Period")
        private Long period;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
        private String threshold;

        private ExpressionList(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.metricName = builder.metricName;
            this.period = builder.period;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpressionList create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
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
        public Long getPeriod() {
            return this.period;
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

        public static final class Builder {
            private String comparisonOperator; 
            private String metricName; 
            private Long period; 
            private String statistics; 
            private String threshold; 

            /**
             * The operator that is used to compare the metric value with the threshold. Valid values:
             * <p>
             * 
             * *   GreaterThanOrEqualToThreshold: greater than or equal to the threshold
             * *   GreaterThanThreshold: greater than the threshold
             * *   LessThanOrEqualToThreshold: less than or equal to the threshold
             * *   LessThanThreshold: less than the threshold
             * *   NotEqualToThreshold: not equal to the threshold
             * *   GreaterThanYesterday: greater than the metric value at the same time yesterday
             * *   LessThanYesterday: less than the metric value at the same time yesterday
             * *   GreaterThanLastWeek: greater than the metric value at the same time last week
             * *   LessThanLastWeek: less than the metric value at the same time last week
             * *   GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle
             * *   LessThanLastPeriod: less than the metric value in the last monitoring cycle
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * The metric that is used to monitor the cloud service.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The aggregation period of the metric.
             * <p>
             * 
             * Unit: seconds.
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            /**
             * The statistical method of the metric. Valid values:
             * <p>
             * 
             * *   $Maximum: the maximum value
             * *   $Minimum: the minimum value
             * *   $Average: the average value
             * *   $Availability: the availability rate (usually used for site monitoring)
             * 
             * >  `$` is the prefix of the metric. For information about the Alibaba Cloud services that are supported by CloudMonitor, see [Appendix 1: Metrics](~~163515~~).
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The alert threshold.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            public ExpressionList build() {
                return new ExpressionList(this);
            } 

        } 

    }
    public static class CompositeExpression extends TeaModel {
        @NameInMap("ExpressionList")
        private java.util.List < ExpressionList> expressionList;

        @NameInMap("ExpressionListJoin")
        private String expressionListJoin;

        @NameInMap("ExpressionRaw")
        private String expressionRaw;

        @NameInMap("Level")
        private String level;

        @NameInMap("Times")
        private Integer times;

        private CompositeExpression(Builder builder) {
            this.expressionList = builder.expressionList;
            this.expressionListJoin = builder.expressionListJoin;
            this.expressionRaw = builder.expressionRaw;
            this.level = builder.level;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompositeExpression create() {
            return builder().build();
        }

        /**
         * @return expressionList
         */
        public java.util.List < ExpressionList> getExpressionList() {
            return this.expressionList;
        }

        /**
         * @return expressionListJoin
         */
        public String getExpressionListJoin() {
            return this.expressionListJoin;
        }

        /**
         * @return expressionRaw
         */
        public String getExpressionRaw() {
            return this.expressionRaw;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return times
         */
        public Integer getTimes() {
            return this.times;
        }

        public static final class Builder {
            private java.util.List < ExpressionList> expressionList; 
            private String expressionListJoin; 
            private String expressionRaw; 
            private String level; 
            private Integer times; 

            /**
             * The trigger conditions that are created in standard mode.
             */
            public Builder expressionList(java.util.List < ExpressionList> expressionList) {
                this.expressionList = expressionList;
                return this;
            }

            /**
             * The relationship between the trigger conditions for multiple metrics. Valid values:
             * <p>
             * 
             * *   `&&`: An alert is triggered only if all metrics meet the trigger conditions. An alert is triggered only if the results of all expressions specified in the ExpressionList parameter are `true`.
             * *   `||`: If one of the metrics meets the trigger conditions, an alert is triggered.
             */
            public Builder expressionListJoin(String expressionListJoin) {
                this.expressionListJoin = expressionListJoin;
                return this;
            }

            /**
             * The trigger conditions that are created by using expressions. You can use expressions to create trigger conditions in the following scenarios:
             * <p>
             * 
             * *   Set an alert blacklist for specific resources. For example, if you specify ` $instanceId != \"i-io8kfvcpp7x5****\"  ``&&``  $Average > 50 `, no alert is generated even when the `average metric value` of the `i-io8kfvcpp7x5****` instance exceeds 50.
             * *   Set a special alert threshold for a specified instance in the rule. For example, if you specify `$Average > ($instanceId == \"i-io8kfvcpp7x5****\"? 80: 50)`, an alert is triggered when the `average metric value` of the `i-io8kfvcpp7x5****` instance exceeds 80 or the `average metric value` of other instances exceeds 50.
             * *   Limits the number of instances whose metric values exceed the threshold. For example, if you specify `count($Average > 20) > 3`, an alert is triggered only when the number of instances whose `average metric value` exceeds 20 exceeds three.
             */
            public Builder expressionRaw(String expressionRaw) {
                this.expressionRaw = expressionRaw;
                return this;
            }

            /**
             * The level of the alert. Valid values:
             * <p>
             * 
             * *   Critical
             * *   Warn
             * *   Info
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The number of consecutive triggers. If the number of times that the metric values meet the trigger conditions reaches the value of this parameter, CloudMonitor sends alert notifications.
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            public CompositeExpression build() {
                return new CompositeExpression(this);
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
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
             * <p>
             * 
             * >  You can use a template parameter to specify a tag value. CloudMonitor replaces the value of the template parameter with an actual tag value.
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
    public static class Annotations extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Annotations(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Annotations create() {
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
             * The key of the annotation.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the annotation.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Annotations build() {
                return new Annotations(this);
            } 

        } 

    }
    public static class Prometheus extends TeaModel {
        @NameInMap("Annotations")
        private java.util.List < Annotations> annotations;

        @NameInMap("Level")
        private String level;

        @NameInMap("PromQL")
        private String promQL;

        @NameInMap("Times")
        private Integer times;

        private Prometheus(Builder builder) {
            this.annotations = builder.annotations;
            this.level = builder.level;
            this.promQL = builder.promQL;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Prometheus create() {
            return builder().build();
        }

        /**
         * @return annotations
         */
        public java.util.List < Annotations> getAnnotations() {
            return this.annotations;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return promQL
         */
        public String getPromQL() {
            return this.promQL;
        }

        /**
         * @return times
         */
        public Integer getTimes() {
            return this.times;
        }

        public static final class Builder {
            private java.util.List < Annotations> annotations; 
            private String level; 
            private String promQL; 
            private Integer times; 

            /**
             * The annotations of the Prometheus alert rule. When a Prometheus alert is triggered, the system renders the annotated keys and values to help you understand the metrics and alert rule.
             * <p>
             * 
             * >  This parameter is equivalent to the annotations parameter of open source Prometheus.
             */
            public Builder annotations(java.util.List < Annotations> annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * The level of the alert. Valid values:
             * <p>
             * 
             * *   Critical
             * *   Warn
             * *   Info
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The PromQL query statement.
             * <p>
             * 
             * >  The data obtained by using the PromQL query statement is the monitoring data. You must include the alert threshold in this statement.
             */
            public Builder promQL(String promQL) {
                this.promQL = promQL;
                return this;
            }

            /**
             * The number of consecutive triggers. If the number of times that the metric values meet the trigger conditions reaches the value of this parameter, CloudMonitor sends alert notifications.
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            public Prometheus build() {
                return new Prometheus(this);
            } 

        } 

    }
}
