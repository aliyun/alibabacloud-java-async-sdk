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
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroups")
    private String contactGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private String dimensions;

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
        this.clientToken = builder.clientToken;
        this.contactGroups = builder.contactGroups;
        this.dimensions = builder.dimensions;
        this.dryRun = builder.dryRun;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
        private String clientToken; 
        private String contactGroups; 
        private String dimensions; 
        private Boolean dryRun; 
        private String effectiveInterval; 
        private String emailSubject; 
        private String extraDimensionJson; 
        private String groupId; 
        private String interval; 
        private java.util.List<Labels> labels; 
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
            this.clientToken = request.clientToken;
            this.contactGroups = request.contactGroups;
            this.dimensions = request.dimensions;
            this.dryRun = request.dryRun;
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
         * <p>The abbreviation of the Alibaba Cloud service name.</p>
         * <p>For information about how to obtain the abbreviation, see the metricCategory field in the Labels response parameter of the <a href="https://help.aliyun.com/document_detail/114916.html">DescribeProjectMeta</a> operation.</p>
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * <p>Format: a collection of key:value pairs, such as <code>{&quot;userId&quot;:&quot;120886317861****&quot;}</code> and <code>{&quot;instanceId&quot;:&quot;i-m5e1qg6uo38rztr4****&quot;}</code>.</p>
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
         * <p>Specifies whether to only precheck the request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: A check request is sent, and no security group is associated with the instance. The check items include whether required parameters are specified, the request format, and service limits. If the check fails, an error is returned. If the check succeeds, the error code DryRunOperation is returned.</li>
         * <li><strong>false</strong>: A normal request is sent. If the check succeeds, an HTTP 2xx status code is returned and the operation is performed. This is the default value.</li>
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
         * <p>05:31-23:59</p>
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
         * <p>ECS instance</p>
         */
        public Builder emailSubject(String emailSubject) {
            this.putQueryParameter("EmailSubject", emailSubject);
            this.emailSubject = emailSubject;
            return this;
        }

        /**
         * <p>The second-level or third-level dimension of the alert rule in the application group.</p>
         * <p>Format: a collection of key:value pairs, such as <code>port:80</code> and <code>/dev/xvda:d-m5e6yphgzn3aprwu****</code>.</p>
         * <p>If the first-level dimension of the alert rule is <code>{&quot;instanceId&quot;:&quot;i-m5e1qg6uo38rztr4****&quot;}</code>, the second-level dimension is the cloud disk in the instance, such as <code>{&quot;/dev/xvda&quot;:&quot;d-m5e6yphgzn3aprwu****&quot;}</code>.</p>
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
         * <p>For information about how to obtain the application group ID, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
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
         * <p>The detection period of the alert rule. Unit: seconds.</p>
         * <blockquote>
         * <p>Set the detection period of the alert rule to the same as the data reporting period. If the detection period is shorter than the data reporting period, alerts cannot be triggered due to insufficient data.</p>
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
         * <p>Alert notifications include the tags.</p>
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The metric name.</p>
         * <p>For information about how to obtain the metric name, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
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
         * <p>The namespace of the Alibaba Cloud service.</p>
         * <p>For information about how to obtain the namespace, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
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
         * <p>The processing method when no monitoring data is available. Valid values:</p>
         * <ul>
         * <li>KEEP_LAST_STATE: No action is taken. This is the default value.</li>
         * <li>INSUFFICIENT_DATA: An alert indicating insufficient data is triggered.</li>
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
         * <p>00:00-05:30</p>
         */
        public Builder noEffectiveInterval(String noEffectiveInterval) {
            this.putQueryParameter("NoEffectiveInterval", noEffectiveInterval);
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }

        /**
         * <p>The advanced settings.</p>
         * <p>Format: <code>{&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:&quot;value2&quot;}</code>. Example: <code>{&quot;NotSendOK&quot;:true}</code>, which specifies whether to send alert recovery notifications. The key is NotSendOK, and the value is true (do not send) or false (send, which is the default value).</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotSendOK&quot;:true}</p>
         */
        public Builder options(String options) {
            this.putQueryParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * <p>The reporting period of monitoring data.</p>
         * <p>The value of Period must be 60 or an integer multiple of 60. Unit: seconds. Default value: 300.</p>
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
         * <p>The alert rule ID.</p>
         * <ul>
         * <li><p>When you create an alert rule for the application group, enter the alert rule ID.</p>
         * </li>
         * <li><p>When you modify a specified alert rule in the application group, you must obtain the alert rule ID. For information about how to obtain the alert rule ID, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
         * </li>
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
         * <p>The alert rule name.</p>
         * <ul>
         * <li><p>When you create an alert rule for the application group, enter the alert rule name.</p>
         * </li>
         * <li><p>When you modify a specified alert rule in the application group, you must obtain the alert rule name. For information about how to obtain the alert rule name, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
         * </li>
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
         * <p>The mute period.</p>
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
         * <p>The webhook URL that is called when an alert is triggered.</p>
         * <p>Enter a publicly accessible URL. CloudMonitor pushes alert notifications to this URL by sending POST requests. Only HTTP is supported.</p>
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

            private Builder() {
            } 

            private Builder(Critical model) {
                this.comparisonOperator = model.comparisonOperator;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.times = model.times;
            } 

            /**
             * <p>The threshold comparison operator for Critical-level alerts. Valid values:</p>
             * <ul>
             * <li>GreaterThanOrEqualToThreshold: Greater than or equal to the threshold.</li>
             * <li>GreaterThanThreshold: Greater than the threshold.</li>
             * <li>LessThanOrEqualToThreshold: Less than or equal to the threshold.</li>
             * <li>LessThanThreshold: Less than the threshold.</li>
             * <li>NotEqualToThreshold: Not equal to the threshold.</li>
             * <li>GreaterThanYesterday: Greater than the value at the same time yesterday.</li>
             * <li>LessThanYesterday: Less than the value at the same time yesterday.</li>
             * <li>GreaterThanLastWeek: Greater than the value at the same time last week.</li>
             * <li>LessThanLastWeek: Less than the value at the same time last week.</li>
             * <li>GreaterThanLastPeriod: Greater than the value in the last period.</li>
             * <li>LessThanLastPeriod: Less than the value in the last period.</li>
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
             * <p>The statistical method for Critical-level alerts. Separate multiple statistical methods with commas (,).</p>
             * <p>The valid values of this parameter are determined by the Statistics column corresponding to the MetricName of the specified Alibaba Cloud service, such as Maximum, Minimum, and Average. For information about how to obtain the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
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
             * <p>The number of retries for Critical-level alerts.</p>
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

            private Builder() {
            } 

            private Builder(Info model) {
                this.comparisonOperator = model.comparisonOperator;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.times = model.times;
            } 

            /**
             * <p>The threshold comparison operator for Info-level alerts. Valid values:</p>
             * <ul>
             * <li>GreaterThanOrEqualToThreshold: Greater than or equal to the threshold.</li>
             * <li>GreaterThanThreshold: Greater than the threshold.</li>
             * <li>LessThanOrEqualToThreshold: Less than or equal to the threshold.</li>
             * <li>LessThanThreshold: Less than the threshold.</li>
             * <li>NotEqualToThreshold: Not equal to the threshold.</li>
             * <li>GreaterThanYesterday: Greater than the value at the same time yesterday.</li>
             * <li>LessThanYesterday: Less than the value at the same time yesterday.</li>
             * <li>GreaterThanLastWeek: Greater than the value at the same time last week.</li>
             * <li>LessThanLastWeek: Less than the value at the same time last week.</li>
             * <li>GreaterThanLastPeriod: Greater than the value in the last period.</li>
             * <li>LessThanLastPeriod: Less than the value in the last period.</li>
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
             * <p>The statistical method for Info-level alerts. Separate multiple statistical methods with commas (,).</p>
             * <p>The valid values of this parameter are determined by the Statistics column corresponding to the MetricName of the specified Alibaba Cloud service, such as Maximum, Minimum, and Average. For information about how to obtain the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
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
             * <p>The number of retries for Info-level alerts.</p>
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

            private Builder() {
            } 

            private Builder(Warn model) {
                this.comparisonOperator = model.comparisonOperator;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.times = model.times;
            } 

            /**
             * <p>The threshold comparison operator for Warn-level alerts. Valid values:</p>
             * <ul>
             * <li>GreaterThanOrEqualToThreshold: Greater than or equal to the threshold.</li>
             * <li>GreaterThanThreshold: Greater than the threshold.</li>
             * <li>LessThanOrEqualToThreshold: Less than or equal to the threshold.</li>
             * <li>LessThanThreshold: Less than the threshold.</li>
             * <li>NotEqualToThreshold: Not equal to the threshold.</li>
             * <li>GreaterThanYesterday: Greater than the value at the same time yesterday.</li>
             * <li>LessThanYesterday: Less than the value at the same time yesterday.</li>
             * <li>GreaterThanLastWeek: Greater than the value at the same time last week.</li>
             * <li>LessThanLastWeek: Less than the value at the same time last week.</li>
             * <li>GreaterThanLastPeriod: Greater than the value in the last period.</li>
             * <li>LessThanLastPeriod: Less than the value in the last period.</li>
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
             * <p>The statistical method for Warn-level alerts. Separate multiple statistical methods with commas (,).</p>
             * <p>The valid values of this parameter are determined by the Statistics column corresponding to the MetricName of the specified Alibaba Cloud service, such as Maximum, Minimum, and Average. For information about how to obtain the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
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
             * <p>The number of retries for Warn-level alerts.</p>
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

            private Builder() {
            } 

            private Builder(Labels model) {
                this.key = model.key;
                this.value = model.value;
            } 

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
