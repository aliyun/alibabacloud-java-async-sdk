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
 * {@link PutResourceMetricRuleRequest} extends {@link RequestModel}
 *
 * <p>PutResourceMetricRuleRequest</p>
 */
public class PutResourceMetricRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Escalations")
    private Escalations escalations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompositeExpression")
    private CompositeExpression compositeExpression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroups")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveInterval")
    private String effectiveInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmailSubject")
    private String emailSubject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private String interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoDataPolicy")
    private String noDataPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoEffectiveInterval")
    private String noEffectiveInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Prometheus")
    private Prometheus prometheus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resources")
    private String resources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendOK")
    private Boolean sendOK;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SilenceTime")
    private Integer silenceTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Webhook")
    private String webhook;

    private PutResourceMetricRuleRequest(Builder builder) {
        super(builder);
        this.escalations = builder.escalations;
        this.compositeExpression = builder.compositeExpression;
        this.contactGroups = builder.contactGroups;
        this.dryRun = builder.dryRun;
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
        this.sendOK = builder.sendOK;
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
    public java.util.List<Labels> getLabels() {
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
     * @return sendOK
     */
    public Boolean getSendOK() {
        return this.sendOK;
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
        private Boolean dryRun; 
        private String effectiveInterval; 
        private String emailSubject; 
        private String interval; 
        private java.util.List<Labels> labels; 
        private String metricName; 
        private String namespace; 
        private String noDataPolicy; 
        private String noEffectiveInterval; 
        private String period; 
        private Prometheus prometheus; 
        private String resources; 
        private String ruleId; 
        private String ruleName; 
        private Boolean sendOK; 
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
            this.dryRun = request.dryRun;
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
            this.sendOK = request.sendOK;
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
         * <p>The alert conditions for multiple metrics.</p>
         * <blockquote>
         * <p>Single-metric and multi-metric alert conditions are mutually exclusive and cannot be configured at the same time.</p>
         * </blockquote>
         */
        public Builder compositeExpression(CompositeExpression compositeExpression) {
            String compositeExpressionShrink = shrink(compositeExpression, "CompositeExpression", "json");
            this.putQueryParameter("CompositeExpression", compositeExpressionShrink);
            this.compositeExpression = compositeExpression;
            return this;
        }

        /**
         * <p>The alert contact group. Alert notifications are sent to the alert contacts in this alert contact group.</p>
         * <blockquote>
         * <p>An alert contact group contains one or more alert contacts. For more information about how to create alert contacts and alert contact groups, see <a href="https://help.aliyun.com/document_detail/114923.html">PutContact</a> and <a href="https://help.aliyun.com/document_detail/114929.html">PutContactGroup</a>.</p>
         * </blockquote>
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
         * <p>Specifies whether to only precheck the request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is prechecked but not executed. The system checks whether the required parameters are specified, the request format is valid, and the service limits are met. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): The request is sent and executed. If the request passes the precheck, an HTTP 2xx status code is returned and the operation is performed.</li>
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
         * <p>The effective period of the alert rule.</p>
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
         * <p>The subject of the alert email.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS instance alert</p>
         */
        public Builder emailSubject(String emailSubject) {
            this.putQueryParameter("EmailSubject", emailSubject);
            this.emailSubject = emailSubject;
            return this;
        }

        /**
         * <p>The trigger epoch of the alert rule. Unit: seconds.</p>
         * <blockquote>
         * <p>For more information about how to query the statistical epoch of a metric, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service metrics</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The labels that are added to the metric and displayed in the alert notification when the metric meets the alert condition and an alert is triggered.</p>
         * <blockquote>
         * <p>This feature is the same as the Label feature in Prometheus alerts.</p>
         * </blockquote>
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The name of the metric. For more information about how to query the name of a metric, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service metrics</a>.</p>
         * <blockquote>
         * <p>When you create a Prometheus alert rule for CloudMonitor, this parameter specifies the name of the metric repository. For more information about how to obtain the name of a metric repository, see <a href="https://help.aliyun.com/document_detail/428880.html">DescribeHybridMonitorNamespaceList</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>The data namespace of the Alibaba Cloud service. For more information about how to query the data namespace of an Alibaba Cloud service, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service metrics</a>.</p>
         * <blockquote>
         * <p>When you create a Prometheus alert rule for CloudMonitor, you must configure this parameter to <code>acs_prometheus</code>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The action to take when no monitoring data is found. Valid values:</p>
         * <ul>
         * <li>KEEP_LAST_STATE (default): No action is taken.</li>
         * <li>INSUFFICIENT_DATA: The alert content indicates that no data is found.</li>
         * <li>OK: The status is normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KEEP_LAST_STATE</p>
         */
        public Builder noDataPolicy(String noDataPolicy) {
            this.putQueryParameter("NoDataPolicy", noDataPolicy);
            this.noDataPolicy = noDataPolicy;
            return this;
        }

        /**
         * <p>The time range during which the alert rule is inactive.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00-06:00</p>
         */
        public Builder noEffectiveInterval(String noEffectiveInterval) {
            this.putQueryParameter("NoEffectiveInterval", noEffectiveInterval);
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }

        /**
         * <p>The statistical epoch of the metric. Unit: seconds. The default value is the original reporting epoch of the metric.</p>
         * <blockquote>
         * <p>For more information about how to query the statistical epoch of a metric, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service metrics</a>.</p>
         * </blockquote>
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
         * <p>The Prometheus alert.</p>
         * <blockquote>
         * <p>You need to configure this parameter only when you create a Prometheus alert rule for Hybrid Cloud Monitoring.</p>
         * </blockquote>
         */
        public Builder prometheus(Prometheus prometheus) {
            String prometheusShrink = shrink(prometheus, "Prometheus", "json");
            this.putQueryParameter("Prometheus", prometheusShrink);
            this.prometheus = prometheus;
            return this;
        }

        /**
         * <p>The resource information. Examples: <code>[{&quot;instanceId&quot;:&quot;i-uf6j91r34rnwawoo****&quot;}]</code> and <code>[{&quot;userId&quot;:&quot;100931896542****&quot;}]</code>.</p>
         * <p>For more information about the dimensions supported by resource information, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service metrics</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;instanceId&quot;:&quot;i-uf6j91r34rnwawoo****&quot;}]</p>
         */
        public Builder resources(String resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        /**
         * <p>The ID of the alert rule.</p>
         * <p>You can enter a new alert rule ID or use an existing alert rule ID in CloudMonitor. For more information about how to query the ID of an alert rule, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
         * <blockquote>
         * <p>Entering a new alert rule ID indicates that a threshold-based alert rule is created.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a151cd6023eacee2f0978e03863cc1697c89508****</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The name of the alert rule.</p>
         * <p>You can enter a new alert rule name or use an existing alert rule name in CloudMonitor. For more information about how to query the name of an alert rule, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
         * <blockquote>
         * <p>Entering a new alert rule name indicates that a threshold-based alert rule is created.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test123</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>Specifies whether to send a recovery notification.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder sendOK(Boolean sendOK) {
            this.putQueryParameter("SendOK", sendOK);
            this.sendOK = sendOK;
            return this;
        }

        /**
         * <p>The mute epoch. Unit: seconds. Default value: 86400.</p>
         * <blockquote>
         * <p>The mute epoch refers to the interval at which to send an alert notification again if the alert does not recover to Normal after it is triggered.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        public Builder silenceTime(Integer silenceTime) {
            this.putQueryParameter("SilenceTime", silenceTime);
            this.silenceTime = silenceTime;
            return this;
        }

        /**
         * <p>The webhook URL to which a POST request is sent when an alert is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://alert.aliyun.com.com:8080/callback">https://alert.aliyun.com.com:8080/callback</a></p>
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

    /**
     * 
     * {@link PutResourceMetricRuleRequest} extends {@link TeaModel}
     *
     * <p>PutResourceMetricRuleRequest</p>
     */
    public static class Critical extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Times")
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

            private Builder() {
            } 

            private Builder(Critical model) {
                this.comparisonOperator = model.comparisonOperator;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.times = model.times;
            } 

            /**
             * <p>The comparison operator for the Critical-level threshold. Valid values:</p>
             * <ul>
             * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold.</li>
             * <li>GreaterThanThreshold: greater than the threshold.</li>
             * <li>LessThanOrEqualToThreshold: less than or equal to the threshold.</li>
             * <li>LessThanThreshold: less than the threshold.</li>
             * <li>NotEqualToThreshold: not equal to the threshold.</li>
             * <li>EqualToThreshold: equal to the threshold.</li>
             * <li>GreaterThanYesterday: greater than the value at the same time yesterday.</li>
             * <li>LessThanYesterday: less than the value at the same time yesterday.</li>
             * <li>GreaterThanLastWeek: greater than the value at the same time last week.</li>
             * <li>LessThanLastWeek: less than the value at the same time last week.</li>
             * <li>GreaterThanLastPeriod: greater than the value in the previous period.</li>
             * <li>LessThanLastPeriod: less than the value in the previous period.</li>
             * </ul>
             * <blockquote>
             * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>GreaterThanOrEqualToThreshold</p>
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * <p>The statistical method for the Critical-level alert.</p>
             * <p>The valid values of this parameter are determined by the <code>Statistics</code> column corresponding to the <code>MetricName</code> of the specified Alibaba Cloud service. Examples: Maximum, Minimum, and Average. For more information about how to obtain the valid values for this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service metrics</a>.</p>
             * <blockquote>
             * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Average</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The threshold for the Critical-level alert.</p>
             * <blockquote>
             * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>The number of retries for the Critical-level alert.</p>
             * <blockquote>
             * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
    /**
     * 
     * {@link PutResourceMetricRuleRequest} extends {@link TeaModel}
     *
     * <p>PutResourceMetricRuleRequest</p>
     */
    public static class Info extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Times")
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

            private Builder() {
            } 

            private Builder(Info model) {
                this.comparisonOperator = model.comparisonOperator;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.times = model.times;
            } 

            /**
             * <p>The comparison operator for the Info-level threshold. Valid values:</p>
             * <ul>
             * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold.</li>
             * <li>GreaterThanThreshold: greater than the threshold.</li>
             * <li>LessThanOrEqualToThreshold: less than or equal to the threshold.</li>
             * <li>LessThanThreshold: less than the threshold.</li>
             * <li>NotEqualToThreshold: not equal to the threshold.</li>
             * <li>EqualToThreshold: equal to the threshold.</li>
             * <li>GreaterThanYesterday: greater than the value at the same time yesterday.</li>
             * <li>LessThanYesterday: less than the value at the same time yesterday.</li>
             * <li>GreaterThanLastWeek: greater than the value at the same time last week.</li>
             * <li>LessThanLastWeek: less than the value at the same time last week.</li>
             * <li>GreaterThanLastPeriod: greater than the value in the previous period.</li>
             * <li>LessThanLastPeriod: less than the value in the previous period.</li>
             * </ul>
             * <blockquote>
             * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>GreaterThanOrEqualToThreshold</p>
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * <p>The statistical method for the Info-level alert.</p>
             * <p>The valid values of this parameter are determined by the <code>Statistics</code> column corresponding to the <code>MetricName</code> of the specified Alibaba Cloud service. Examples: Maximum, Minimum, and Average. For more information about how to obtain the valid values for this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service metrics</a>.</p>
             * <blockquote>
             * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Average</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The threshold for the Info-level alert.</p>
             * <blockquote>
             * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>The number of retries for the Info-level alert.</p>
             * <blockquote>
             * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
    /**
     * 
     * {@link PutResourceMetricRuleRequest} extends {@link TeaModel}
     *
     * <p>PutResourceMetricRuleRequest</p>
     */
    public static class Warn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Times")
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

            private Builder() {
            } 

            private Builder(Warn model) {
                this.comparisonOperator = model.comparisonOperator;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.times = model.times;
            } 

            /**
             * <p>The comparison operator for the Warn-level threshold. Valid values:</p>
             * <ul>
             * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold.</li>
             * <li>GreaterThanThreshold: greater than the threshold.</li>
             * <li>LessThanOrEqualToThreshold: less than or equal to the threshold.</li>
             * <li>LessThanThreshold: less than the threshold.</li>
             * <li>NotEqualToThreshold: not equal to the threshold.</li>
             * <li>EqualToThreshold: equal to the threshold.</li>
             * <li>GreaterThanYesterday: greater than the value at the same time yesterday.</li>
             * <li>LessThanYesterday: less than the value at the same time yesterday.</li>
             * <li>GreaterThanLastWeek: greater than the value at the same time last week.</li>
             * <li>LessThanLastWeek: less than the value at the same time last week.</li>
             * <li>GreaterThanLastPeriod: greater than the value in the previous period.</li>
             * <li>LessThanLastPeriod: less than the value in the previous period.</li>
             * </ul>
             * <blockquote>
             * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>GreaterThanOrEqualToThreshold</p>
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * <p>The statistical method for the Warn-level alert.</p>
             * <p>The valid values of this parameter are determined by the <code>Statistics</code> column corresponding to the <code>MetricName</code> of the specified Alibaba Cloud service. Examples: Maximum, Minimum, and Average. For more information about how to obtain the valid values for this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service metrics</a>.</p>
             * <blockquote>
             * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Average</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The threshold for the Warn-level alert.</p>
             * <blockquote>
             * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>The number of retries for the Warn-level alert.</p>
             * <blockquote>
             * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
    /**
     * 
     * {@link PutResourceMetricRuleRequest} extends {@link TeaModel}
     *
     * <p>PutResourceMetricRuleRequest</p>
     */
    public static class Escalations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Critical")
        private Critical critical;

        @com.aliyun.core.annotation.NameInMap("Info")
        private Info info;

        @com.aliyun.core.annotation.NameInMap("Warn")
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

            private Builder() {
            } 

            private Builder(Escalations model) {
                this.critical = model.critical;
                this.info = model.info;
                this.warn = model.warn;
            } 

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
    /**
     * 
     * {@link PutResourceMetricRuleRequest} extends {@link TeaModel}
     *
     * <p>PutResourceMetricRuleRequest</p>
     */
    public static class ExpressionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Long period;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
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

            private Builder() {
            } 

            private Builder(ExpressionList model) {
                this.comparisonOperator = model.comparisonOperator;
                this.metricName = model.metricName;
                this.period = model.period;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
            } 

            /**
             * <p>The comparison operator for the threshold. Valid values:</p>
             * <ul>
             * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold.</li>
             * <li>GreaterThanThreshold: greater than the threshold.</li>
             * <li>LessThanOrEqualToThreshold: less than or equal to the threshold.</li>
             * <li>LessThanThreshold: less than the threshold.</li>
             * <li>NotEqualToThreshold: not equal to the threshold.</li>
             * <li>EqualToThreshold: equal to the threshold.</li>
             * <li>GreaterThanYesterday: greater than the value at the same time yesterday.</li>
             * <li>LessThanYesterday: less than the value at the same time yesterday.</li>
             * <li>GreaterThanLastWeek: greater than the value at the same time last week.</li>
             * <li>LessThanLastWeek: less than the value at the same time last week.</li>
             * <li>GreaterThanLastPeriod: greater than the value in the previous period.</li>
             * <li>LessThanLastPeriod: less than the value in the previous period.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GreaterThanOrEqualToThreshold</p>
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * <p>The name of the metric for the Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>cpu_total</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The aggregation period of the metric.</p>
             * <p>Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The statistical method of the metric. Valid values:</p>
             * <ul>
             * <li>$Maximum: the maximum value.</li>
             * <li>$Minimum: the minimum value.</li>
             * <li>$Average: the average value.</li>
             * <li>$Availability: the active rate. This is typically used for site monitoring.</li>
             * </ul>
             * <blockquote>
             * <p><code>$</code> is the unified prefix for metrics. For more information about supported Alibaba Cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service metrics</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>$Maximum</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The alert threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
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
    /**
     * 
     * {@link PutResourceMetricRuleRequest} extends {@link TeaModel}
     *
     * <p>PutResourceMetricRuleRequest</p>
     */
    public static class CompositeExpression extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpressionList")
        private java.util.List<ExpressionList> expressionList;

        @com.aliyun.core.annotation.NameInMap("ExpressionListJoin")
        private String expressionListJoin;

        @com.aliyun.core.annotation.NameInMap("ExpressionRaw")
        private String expressionRaw;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Times")
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
        public java.util.List<ExpressionList> getExpressionList() {
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
            private java.util.List<ExpressionList> expressionList; 
            private String expressionListJoin; 
            private String expressionRaw; 
            private String level; 
            private Integer times; 

            private Builder() {
            } 

            private Builder(CompositeExpression model) {
                this.expressionList = model.expressionList;
                this.expressionListJoin = model.expressionListJoin;
                this.expressionRaw = model.expressionRaw;
                this.level = model.level;
                this.times = model.times;
            } 

            /**
             * <p>The list of standard alert conditions.</p>
             */
            public Builder expressionList(java.util.List<ExpressionList> expressionList) {
                this.expressionList = expressionList;
                return this;
            }

            /**
             * <p>The logical relationship between multi-metric alert conditions. Valid values: </p>
             * <ul>
             * <li><p><code>&amp;&amp;</code>: An alert is triggered only when all metrics meet the alert conditions. An alert is triggered only when all expressions in ExpressionList evaluate to <code>true</code>.</p>
             * </li>
             * <li><p><code>||</code>: An alert is triggered when any metric meets the alert condition.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>||</p>
             */
            public Builder expressionListJoin(String expressionListJoin) {
                this.expressionListJoin = expressionListJoin;
                return this;
            }

            /**
             * <p>The alert conditions created by using expressions. This includes but is not limited to the following scenarios:</p>
             * <ul>
             * <li>Configure an alert blacklist for specific resources. Example: <code>$instanceId != \\&quot;i-io8kfvcpp7x5****\\&quot; ``&amp;&amp;`` $Average &gt; 50</code>. This indicates that no alert is triggered even if the <code>Average</code> value of the instance <code>i-io8kfvcpp7x5****</code> in the alert rule is greater than 50.</li>
             * <li>Configure a special alert threshold for a specific instance in the rule. Example: <code>$Average &gt; ($instanceId == \\&quot;i-io8kfvcpp7x5****\\&quot;? 80: 50)</code>. This indicates that an alert is triggered only when the <code>Average</code> value of the instance <code>i-io8kfvcpp7x5****</code> in the alert rule is greater than 80. For other instances, an alert is triggered when the <code>Average</code> value is greater than 50.</li>
             * <li>Limit the number of instances that exceed the threshold in the rule. Example: <code>count($Average &gt; 20) &gt; 3</code>. This indicates that an alert is triggered only when the number of instances whose <code>Average</code> value is greater than 20 exceeds 3.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>$Average &gt; ($instanceId == \&quot;i-io8kfvcpp7x5****\&quot;? 80: 50)</p>
             */
            public Builder expressionRaw(String expressionRaw) {
                this.expressionRaw = expressionRaw;
                return this;
            }

            /**
             * <p>The alert level. Valid values:</p>
             * <ul>
             * <li>CRITICAL: critical.</li>
             * <li>WARN: warning.</li>
             * <li>INFO: info.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CRITICAL</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The number of times that the alert condition must be met before an alert notification is sent.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
    /**
     * 
     * {@link PutResourceMetricRuleRequest} extends {@link TeaModel}
     *
     * <p>PutResourceMetricRuleRequest</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Labels model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The label key.</p>
             * 
             * <strong>example:</strong>
             * <p>tagKey1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The label value.</p>
             * <blockquote>
             * <p>The label value supports template parameters. The template parameters are replaced with the actual label values.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
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
    /**
     * 
     * {@link PutResourceMetricRuleRequest} extends {@link TeaModel}
     *
     * <p>PutResourceMetricRuleRequest</p>
     */
    public static class Annotations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Annotations model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The annotation key.</p>
             * 
             * <strong>example:</strong>
             * <p>summary</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The annotation value.</p>
             * 
             * <strong>example:</strong>
             * <p>{{ $labels.instance }} CPU usage above 10% {current value: {{ humanizePercentage $value }} }</p>
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
    /**
     * 
     * {@link PutResourceMetricRuleRequest} extends {@link TeaModel}
     *
     * <p>PutResourceMetricRuleRequest</p>
     */
    public static class Prometheus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Annotations")
        private java.util.List<Annotations> annotations;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("PromQL")
        private String promQL;

        @com.aliyun.core.annotation.NameInMap("Times")
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
        public java.util.List<Annotations> getAnnotations() {
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
            private java.util.List<Annotations> annotations; 
            private String level; 
            private String promQL; 
            private Integer times; 

            private Builder() {
            } 

            private Builder(Prometheus model) {
                this.annotations = model.annotations;
                this.level = model.level;
                this.promQL = model.promQL;
                this.times = model.times;
            } 

            /**
             * <p>The annotations that are rendered with their keys and values during a Prometheus alert to help you understand the metric or alert rule.</p>
             * <blockquote>
             * <p>This feature is equivalent to the Annotation feature in Prometheus.</p>
             * </blockquote>
             */
            public Builder annotations(java.util.List<Annotations> annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * <p>The alert level. Valid values:</p>
             * <ul>
             * <li>CRITICAL: critical.</li>
             * <li>WARN: warning.</li>
             * <li>INFO: info.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CRITICAL</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The PromQL query statement.</p>
             * <blockquote>
             * <p>The data obtained by using the PromQL query statement is used as the alert data. You must include the alert threshold in this statement.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cpuUsage{instanceId=&quot;xxxx&quot;}[1m]&gt;90</p>
             */
            public Builder promQL(String promQL) {
                this.promQL = promQL;
                return this;
            }

            /**
             * <p>The number of times that the alert condition must be met before an alert notification is sent.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
