// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PutGroupMetricRuleRequest} extends {@link RequestModel}
 *
 * <p>PutGroupMetricRuleRequest</p>
 */
public class PutGroupMetricRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Escalations")
    private Escalations escalations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroups")
    private String contactGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private String dimensions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveInterval")
    private String effectiveInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmailSubject")
    private String emailSubject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtraDimensionJson")
    private String extraDimensionJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private String interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List < Labels> labels;

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
    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

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
    @com.aliyun.core.annotation.NameInMap("SilenceTime")
    private Integer silenceTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Webhook")
    private String webhook;

    private PutGroupMetricRuleRequest(Builder builder) {
        super(builder);
        this.escalations = builder.escalations;
        this.category = builder.category;
        this.contactGroups = builder.contactGroups;
        this.dimensions = builder.dimensions;
        this.effectiveInterval = builder.effectiveInterval;
        this.emailSubject = builder.emailSubject;
        this.extraDimensionJson = builder.extraDimensionJson;
        this.groupId = builder.groupId;
        this.interval = builder.interval;
        this.labels = builder.labels;
        this.metricName = builder.metricName;
        this.namespace = builder.namespace;
        this.noDataPolicy = builder.noDataPolicy;
        this.noEffectiveInterval = builder.noEffectiveInterval;
        this.options = builder.options;
        this.period = builder.period;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
        this.silenceTime = builder.silenceTime;
        this.webhook = builder.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutGroupMetricRuleRequest create() {
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
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return contactGroups
     */
    public String getContactGroups() {
        return this.contactGroups;
    }

    /**
     * @return dimensions
     */
    public String getDimensions() {
        return this.dimensions;
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
     * @return extraDimensionJson
     */
    public String getExtraDimensionJson() {
        return this.extraDimensionJson;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
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
     * @return options
     */
    public String getOptions() {
        return this.options;
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

    public static final class Builder extends Request.Builder<PutGroupMetricRuleRequest, Builder> {
        private Escalations escalations; 
        private String category; 
        private String contactGroups; 
        private String dimensions; 
        private String effectiveInterval; 
        private String emailSubject; 
        private String extraDimensionJson; 
        private String groupId; 
        private String interval; 
        private java.util.List < Labels> labels; 
        private String metricName; 
        private String namespace; 
        private String noDataPolicy; 
        private String noEffectiveInterval; 
        private String options; 
        private String period; 
        private String ruleId; 
        private String ruleName; 
        private Integer silenceTime; 
        private String webhook; 

        private Builder() {
            super();
        } 

        private Builder(PutGroupMetricRuleRequest request) {
            super(request);
            this.escalations = request.escalations;
            this.category = request.category;
            this.contactGroups = request.contactGroups;
            this.dimensions = request.dimensions;
            this.effectiveInterval = request.effectiveInterval;
            this.emailSubject = request.emailSubject;
            this.extraDimensionJson = request.extraDimensionJson;
            this.groupId = request.groupId;
            this.interval = request.interval;
            this.labels = request.labels;
            this.metricName = request.metricName;
            this.namespace = request.namespace;
            this.noDataPolicy = request.noDataPolicy;
            this.noEffectiveInterval = request.noEffectiveInterval;
            this.options = request.options;
            this.period = request.period;
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
         * <p>The abbreviation of the cloud service name.</p>
         * <p>For more information about how to obtain the abbreviation of a cloud service name, see <code>metricCategory</code> in the response parameter <code>Labels</code> of the <a href="https://help.aliyun.com/document_detail/114916.html">DescribeProjectMeta</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The alert contact group.</p>
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
         * <p>The first-level dimension of the alert rule in the application group.</p>
         * <p>Set the value to a set of key-value pairs, for example, <code>userId:120886317861****</code> or <code>instanceId:i-m5e1qg6uo38rztr4****</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;instanceId&quot;:&quot;i-m5e1qg6uo38rztr4****&quot;}]</p>
         */
        public Builder dimensions(String dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>The time period during which the alert rule is effective.</p>
         * 
         * <strong>example:</strong>
         * <p>05:31-23:59</p>
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
         * <p>The second-level or third-level dimension of the alert rule in the application group.</p>
         * <p>Set the value to a set of key-value pairs, for example, <code>port:80</code> or <code>/dev/xvda:d-m5e6yphgzn3aprwu****</code>.</p>
         * <p>If the first-level dimension of the alert rule is <code>instanceId:i-m5e1qg6uo38rztr4****</code>, its second-level dimension is the <code>/dev/xvda:d-m5e6yphgzn3aprwu****</code> disk in the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;/dev/xvda&quot;:&quot;d-m5e6yphgzn3aprwu****&quot;}</p>
         */
        public Builder extraDimensionJson(String extraDimensionJson) {
            this.putQueryParameter("ExtraDimensionJson", extraDimensionJson);
            this.extraDimensionJson = extraDimensionJson;
            return this;
        }

        /**
         * <p>The application group ID.</p>
         * <p>For more information about how to obtain the ID of an application group, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>17285****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The interval at which CloudMonitor checks whether the alert rule is triggered. Unit: seconds.</p>
         * <blockquote>
         * <p> We recommend that you set the interval to the data aggregation period. If the interval is shorter than the data aggregation period, alerts cannot be triggered due to insufficient data.</p>
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
         * <p>The tags of the alert rule.</p>
         * <p>The specified tag is contained in alert notifications.</p>
         */
        public Builder labels(java.util.List < Labels> labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The metric name.</p>
         * <p>For more information about how to obtain the name of a metric, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
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
         * <p>The namespace of the cloud service.</p>
         * <p>For more information about how to obtain the namespace of a cloud service, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
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
         * <p>The method that is used to handle alerts when no monitoring data is found. Valid values:</p>
         * <ul>
         * <li>KEEP_LAST_STATE (default): No operation is performed.</li>
         * <li>INSUFFICIENT_DATA: An alert whose content is &quot;Insufficient data&quot; is triggered.</li>
         * <li>OK: The status is considered normal.</li>
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
         * <p>The time period during which the alert rule is ineffective.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00-05:30</p>
         */
        public Builder noEffectiveInterval(String noEffectiveInterval) {
            this.putQueryParameter("NoEffectiveInterval", noEffectiveInterval);
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }

        /**
         * Options.
         */
        public Builder options(String options) {
            this.putQueryParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * <p>The aggregation period of the metric data.</p>
         * <p>Set the <code>Period</code> parameter to an integral multiple of 60. Unit: seconds. Default value: 300.</p>
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
         * <ul>
         * <li>When you create an alert rule for the application group, enter the ID of the alert rule.</li>
         * <li>When you modify a specified alert rule in the application group, you must obtain the ID of the alert rule. For information about how to obtain the ID of an alert rule, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The name of the alert rule.</p>
         * <ul>
         * <li>When you create an alert rule for the application group, enter the name of the alert rule.</li>
         * <li>When you modify a specified alert rule in the application group, you must obtain the name of the alert rule. For more information about how to obtain the name of an alert rule, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Rule_01</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The mute period during which new alerts are not sent even if the trigger conditions are met.</p>
         * <p>Unit: seconds. Default value: 86400.</p>
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
         * <p>The callback URL.</p>
         * <p>The callback URL must be accessible over the Internet. CloudMonitor sends a POST request to push an alert notification to the callback URL that you specify. Only HTTP requests are supported.</p>
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
        public PutGroupMetricRuleRequest build() {
            return new PutGroupMetricRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link PutGroupMetricRuleRequest} extends {@link TeaModel}
     *
     * <p>PutGroupMetricRuleRequest</p>
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

            /**
             * <p>The operator that is used to compare the metric value with the threshold for Critical-level alerts. Valid values:</p>
             * <ul>
             * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold</li>
             * <li>GreaterThanThreshold: greater than the threshold</li>
             * <li>LessThanOrEqualToThreshold: less than or equal to the threshold</li>
             * <li>LessThanThreshold: less than the threshold</li>
             * <li>NotEqualToThreshold: not equal to the threshold</li>
             * <li>GreaterThanYesterday: greater than the metric value at the same time yesterday</li>
             * <li>LessThanYesterday: less than the metric value at the same time yesterday</li>
             * <li>GreaterThanLastWeek: greater than the metric value at the same time last week</li>
             * <li>LessThanLastWeek: less than the metric value at the same time last week</li>
             * <li>GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</li>
             * <li>LessThanLastPeriod: less than the metric value in the last monitoring cycle</li>
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
             * <p>The statistical methods for Critical-level alerts. Separate multiple statistical methods with commas (,).</p>
             * <p>The value of this parameter is determined by the <code>Statistics</code> column corresponding to the <code>MetricName</code> parameter of the specified cloud service. The value of this parameter can be Maximum, Minimum, or Average. For more information about how to obtain the value of this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Average</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The threshold for Critical-level alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>The consecutive number of times for which the metric value meets the alert condition before a Critical-level alert is triggered.</p>
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
     * {@link PutGroupMetricRuleRequest} extends {@link TeaModel}
     *
     * <p>PutGroupMetricRuleRequest</p>
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

            /**
             * <p>The operator that is used to compare the metric value with the threshold for Info-level alerts. Valid values:</p>
             * <ul>
             * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold</li>
             * <li>GreaterThanThreshold: greater than the threshold</li>
             * <li>LessThanOrEqualToThreshold: less than or equal to the threshold</li>
             * <li>LessThanThreshold: less than the threshold</li>
             * <li>NotEqualToThreshold: not equal to the threshold</li>
             * <li>GreaterThanYesterday: greater than the metric value at the same time yesterday</li>
             * <li>LessThanYesterday: less than the metric value at the same time yesterday</li>
             * <li>GreaterThanLastWeek: greater than the metric value at the same time last week</li>
             * <li>LessThanLastWeek: less than the metric value at the same time last week</li>
             * <li>GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</li>
             * <li>LessThanLastPeriod: less than the metric value in the last monitoring cycle</li>
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
             * <p>The statistical methods for Info-level alerts. Separate multiple statistical methods with commas (,).</p>
             * <p>The value of this parameter is determined by the <code>Statistics</code> column corresponding to the <code>MetricName</code> parameter of the specified cloud service. The value of this parameter can be Maximum, Minimum, or Average. For more information about how to obtain the value of this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Average</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The threshold for Info-level alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>The consecutive number of times for which the metric value meets the alert condition before an Info-level alert is triggered.</p>
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
     * {@link PutGroupMetricRuleRequest} extends {@link TeaModel}
     *
     * <p>PutGroupMetricRuleRequest</p>
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

            /**
             * <p>The operator that is used to compare the metric value with the threshold for Warn-level alerts. Valid values:</p>
             * <ul>
             * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold</li>
             * <li>GreaterThanThreshold: greater than the threshold</li>
             * <li>LessThanOrEqualToThreshold: less than or equal to the threshold</li>
             * <li>LessThanThreshold: less than the threshold</li>
             * <li>NotEqualToThreshold: not equal to the threshold</li>
             * <li>GreaterThanYesterday: greater than the metric value at the same time yesterday</li>
             * <li>LessThanYesterday: less than the metric value at the same time yesterday</li>
             * <li>GreaterThanLastWeek: greater than the metric value at the same time last week</li>
             * <li>LessThanLastWeek: less than the metric value at the same time last week</li>
             * <li>GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</li>
             * <li>LessThanLastPeriod: less than the metric value in the last monitoring cycle</li>
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
             * <p>The statistical methods for Warn-level alerts. Separate multiple statistical methods with commas (,).</p>
             * <p>The value of this parameter is determined by the <code>Statistics</code> column corresponding to the <code>MetricName</code> parameter of the specified cloud service. The value of this parameter can be Maximum, Minimum, or Average. For more information about how to obtain the value of this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Average</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The threshold for Warn-level alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>The consecutive number of times for which the metric value meets the alert condition before a Warn-level alert is triggered.</p>
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
     * {@link PutGroupMetricRuleRequest} extends {@link TeaModel}
     *
     * <p>PutGroupMetricRuleRequest</p>
     */
    public static class Escalations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Critical")
        @com.aliyun.core.annotation.Validation(required = true)
        private Critical critical;

        @com.aliyun.core.annotation.NameInMap("Info")
        @com.aliyun.core.annotation.Validation(required = true)
        private Info info;

        @com.aliyun.core.annotation.NameInMap("Warn")
        @com.aliyun.core.annotation.Validation(required = true)
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
    /**
     * 
     * {@link PutGroupMetricRuleRequest} extends {@link TeaModel}
     *
     * <p>PutGroupMetricRuleRequest</p>
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

            /**
             * <p>The tag key of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
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
}
