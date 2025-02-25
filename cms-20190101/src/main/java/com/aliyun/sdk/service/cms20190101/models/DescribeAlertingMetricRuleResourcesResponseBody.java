// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAlertingMetricRuleResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlertingMetricRuleResourcesResponseBody</p>
 */
public class DescribeAlertingMetricRuleResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private Resources resources;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeAlertingMetricRuleResourcesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertingMetricRuleResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public Resources getResources() {
        return this.resources;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Resources resources; 
        private Boolean success; 
        private Integer total; 

        /**
         * <p>The status code.</p>
         * <blockquote>
         * <p>The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The request processing has failed due to some unknown error.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0724011B-D9E0-4B2F-8C51-F17A894CC42C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resources that are associated with the alert rule.</p>
         */
        public Builder resources(Resources resources) {
            this.resources = resources;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeAlertingMetricRuleResourcesResponseBody build() {
            return new DescribeAlertingMetricRuleResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAlertingMetricRuleResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertingMetricRuleResourcesResponseBody</p>
     */
    public static class ExpressionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Period")
        private String period;

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
        public String getPeriod() {
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
            private String period; 
            private String statistics; 
            private String threshold; 

            /**
             * <p>The operator that is used to compare the metric value with the threshold. Valid values:</p>
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
             * <p>The metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>cpu_total</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The statistical period of the metric. Unit: seconds. The default value is the interval at which the monitoring data of the metric is collected.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The statistical method of the alert level. Valid values:</p>
             * <ul>
             * <li>Maximum</li>
             * <li>Minimum</li>
             * <li>Average</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Average</p>
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
     * {@link DescribeAlertingMetricRuleResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertingMetricRuleResourcesResponseBody</p>
     */
    public static class ResourceExpressionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpressionList")
        private java.util.List < ExpressionList> expressionList;

        private ResourceExpressionList(Builder builder) {
            this.expressionList = builder.expressionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceExpressionList create() {
            return builder().build();
        }

        /**
         * @return expressionList
         */
        public java.util.List < ExpressionList> getExpressionList() {
            return this.expressionList;
        }

        public static final class Builder {
            private java.util.List < ExpressionList> expressionList; 

            /**
             * ExpressionList.
             */
            public Builder expressionList(java.util.List < ExpressionList> expressionList) {
                this.expressionList = expressionList;
                return this;
            }

            public ResourceExpressionList build() {
                return new ResourceExpressionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlertingMetricRuleResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertingMetricRuleResourcesResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("ExpressionList")
        private ResourceExpressionList expressionList;

        @com.aliyun.core.annotation.NameInMap("ExpressionListJoin")
        private String expressionListJoin;

        @com.aliyun.core.annotation.NameInMap("ExpressionRaw")
        private String expressionRaw;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Integer level;

        @com.aliyun.core.annotation.NameInMap("PreCondition")
        private String preCondition;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Times")
        private Integer times;

        private Resource(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.expression = builder.expression;
            this.expressionList = builder.expressionList;
            this.expressionListJoin = builder.expressionListJoin;
            this.expressionRaw = builder.expressionRaw;
            this.level = builder.level;
            this.preCondition = builder.preCondition;
            this.tag = builder.tag;
            this.threshold = builder.threshold;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return expressionList
         */
        public ResourceExpressionList getExpressionList() {
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
        public Integer getLevel() {
            return this.level;
        }

        /**
         * @return preCondition
         */
        public String getPreCondition() {
            return this.preCondition;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
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
            private String expression; 
            private ResourceExpressionList expressionList; 
            private String expressionListJoin; 
            private String expressionRaw; 
            private Integer level; 
            private String preCondition; 
            private String tag; 
            private String threshold; 
            private Integer times; 

            /**
             * <p>The operator that is used to compare the metric value with the threshold. Valid values:</p>
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
             * <p>The description of the alert rule.</p>
             * <blockquote>
             * <p> This parameter indicates the content of the alert rule. If the metric value meets the alert condition, an alert is triggered.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>$Average&gt;=10</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The description of the multi-metric alert rule.</p>
             */
            public Builder expressionList(ResourceExpressionList expressionList) {
                this.expressionList = expressionList;
                return this;
            }

            /**
             * <p>The relationship between multiple metrics. Valid values:</p>
             * <ul>
             * <li>&amp;&amp;: If all metrics meet the alert conditions, CloudMonitor sends alert notifications.</li>
             * <li>||: If one of the metrics meets the alert conditions, CloudMonitor sends alert notifications.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>&amp;&amp;</p>
             */
            public Builder expressionListJoin(String expressionListJoin) {
                this.expressionListJoin = expressionListJoin;
                return this;
            }

            /**
             * <p>The trigger conditions that are created by using expressions. You can use expressions to create trigger conditions in the following scenarios:</p>
             * <ul>
             * <li>Set an alert blacklist for specific resources. For example, if you specify <code>$instanceId != \&quot;i-io8kfvcpp7x5****\&quot; ``&amp;&amp;`` $Average &gt; 50</code>, no alert is triggered when the <code>average metric value</code> of the <code>i-io8kfvcpp7x5****</code> instance exceeds 50.</li>
             * <li>Set a special alert threshold for a specified instance in the rule. For example, if you specify <code>$Average &gt; ($instanceId == \&quot;i-io8kfvcpp7x5****\&quot;? 80: 50)</code>, an alert is triggered when the <code>average metric value</code> of the <code>i-io8kfvcpp7x5****</code> instance exceeds 80 or the <code>average metric value</code> of other instances exceeds 50.</li>
             * <li>Limit the number of instances whose metric values exceed the threshold. For example, if you specify <code>count($Average &gt; 20) &gt; 3</code>, an alert is triggered only when the <code>average metric value</code> of more than three instances exceeds 20.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>$Average &gt; ($instanceId == &quot;i-io8kfvcpp7x5****&quot;? 80: 50)</p>
             */
            public Builder expressionRaw(String expressionRaw) {
                this.expressionRaw = expressionRaw;
                return this;
            }

            /**
             * <p>The severity level and notification methods of the alert. Valid values:</p>
             * <ul>
             * <li>4: Alert notifications are sent by using emails and DingTalk chatbots.</li>
             * <li>OK: No alert is generated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder level(Integer level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The operator that is used to compare the metric value with the threshold. Valid values:</p>
             * <ul>
             * <li><code>&gt;=</code></li>
             * <li><code>=</code></li>
             * <li><code>&lt;=</code></li>
             * <li><code>&gt;</code></li>
             * <li><code>&lt;</code></li>
             * <li><code>!=</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <blockquote>
             * <p>=</p>
             * </blockquote>
             */
            public Builder preCondition(String preCondition) {
                this.preCondition = preCondition;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>mns</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The alert threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>The consecutive number of times for which the metric value meets the alert condition before an alert is triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlertingMetricRuleResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertingMetricRuleResourcesResponseBody</p>
     */
    public static class Escalation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Resource")
        private java.util.List < Resource> resource;

        private Escalation(Builder builder) {
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Escalation create() {
            return builder().build();
        }

        /**
         * @return resource
         */
        public java.util.List < Resource> getResource() {
            return this.resource;
        }

        public static final class Builder {
            private java.util.List < Resource> resource; 

            /**
             * Resource.
             */
            public Builder resource(java.util.List < Resource> resource) {
                this.resource = resource;
                return this;
            }

            public Escalation build() {
                return new Escalation(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlertingMetricRuleResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertingMetricRuleResourcesResponseBody</p>
     */
    public static class ResourcesResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private String dimensions;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        @com.aliyun.core.annotation.NameInMap("Escalation")
        private Escalation escalation;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("LastAlertTime")
        private String lastAlertTime;

        @com.aliyun.core.annotation.NameInMap("LastModifyTime")
        private String lastModifyTime;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Integer level;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("MetricValues")
        private String metricValues;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("ProductCategory")
        private String productCategory;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("RetryTimes")
        private String retryTimes;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        private ResourcesResource(Builder builder) {
            this.dimensions = builder.dimensions;
            this.enable = builder.enable;
            this.escalation = builder.escalation;
            this.groupId = builder.groupId;
            this.lastAlertTime = builder.lastAlertTime;
            this.lastModifyTime = builder.lastModifyTime;
            this.level = builder.level;
            this.metricName = builder.metricName;
            this.metricValues = builder.metricValues;
            this.namespace = builder.namespace;
            this.productCategory = builder.productCategory;
            this.resource = builder.resource;
            this.retryTimes = builder.retryTimes;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.startTime = builder.startTime;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcesResource create() {
            return builder().build();
        }

        /**
         * @return dimensions
         */
        public String getDimensions() {
            return this.dimensions;
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        /**
         * @return escalation
         */
        public Escalation getEscalation() {
            return this.escalation;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return lastAlertTime
         */
        public String getLastAlertTime() {
            return this.lastAlertTime;
        }

        /**
         * @return lastModifyTime
         */
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        /**
         * @return level
         */
        public Integer getLevel() {
            return this.level;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return metricValues
         */
        public String getMetricValues() {
            return this.metricValues;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return productCategory
         */
        public String getProductCategory() {
            return this.productCategory;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return retryTimes
         */
        public String getRetryTimes() {
            return this.retryTimes;
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
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
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
            private String dimensions; 
            private String enable; 
            private Escalation escalation; 
            private String groupId; 
            private String lastAlertTime; 
            private String lastModifyTime; 
            private Integer level; 
            private String metricName; 
            private String metricValues; 
            private String namespace; 
            private String productCategory; 
            private String resource; 
            private String retryTimes; 
            private String ruleId; 
            private String ruleName; 
            private String startTime; 
            private String statistics; 
            private String threshold; 

            /**
             * <p>The dimensions based on which the resources are queried.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;region&quot;:&quot;cn-huhehaote&quot;,&quot;queue&quot;:&quot;test-0128&quot;,&quot;userId&quot;:&quot;120886317861****&quot;}</p>
             */
            public Builder dimensions(String dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>Indicates whether the alert rule is enabled. Valid values:</p>
             * <ul>
             * <li>true: The alert rule is enabled.</li>
             * <li>false: The alert rule is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The alert rule based on which the alert is triggered.</p>
             */
            public Builder escalation(Escalation escalation) {
                this.escalation = escalation;
                return this;
            }

            /**
             * <p>The ID of the application group.</p>
             * <blockquote>
             * <p> If the alert rule is associated with an application group, the ID of the application group is returned in this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>7671****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The time when the last alert was triggered for the resource based on the alert rule. The value is a timestamp.</p>
             * <p>Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1622427900000</p>
             */
            public Builder lastAlertTime(String lastAlertTime) {
                this.lastAlertTime = lastAlertTime;
                return this;
            }

            /**
             * <p>The time when the alert rule was last modified. The value is a timestamp.</p>
             * <p>Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1622827900000</p>
             */
            public Builder lastModifyTime(String lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * <p>The severity level and notification methods of the alert. Valid values:</p>
             * <ul>
             * <li>4: Alert notifications are sent by using emails and DingTalk chatbots.</li>
             * <li>OK: No alert is generated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder level(Integer level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>ActiveMessages</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The metric value that triggered the alert based on the alert rule. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;timestamp&quot;:1623727500000,&quot;Sum&quot;:926,&quot;value&quot;:463,&quot;Maximum&quot;:463,&quot;Minimum&quot;:463,&quot;Average&quot;:463,&quot;SampleCount&quot;:2,&quot;userId&quot;:&quot;120886317861****&quot;,&quot;region&quot;:&quot;cn-huhehaote&quot;,&quot;queue&quot;:&quot;test-0128&quot;}</p>
             */
            public Builder metricValues(String metricValues) {
                this.metricValues = metricValues;
                return this;
            }

            /**
             * <p>The namespace of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>acs_mns_new</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The type of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>mns</p>
             */
            public Builder productCategory(String productCategory) {
                this.productCategory = productCategory;
                return this;
            }

            /**
             * <p>The resources that are monitored.</p>
             * 
             * <strong>example:</strong>
             * <p>userId=120886317861****,region=cn-huhehaote,queue=test-0128</p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The consecutive number of times for which the metric value meets the alert condition before an alert is triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder retryTimes(String retryTimes) {
                this.retryTimes = retryTimes;
                return this;
            }

            /**
             * <p>The ID of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>putNewAlarm_user_7e78d765-0e3e-4671-ba6d-7ce39108****</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test123456789</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The time when the resource was associated with the alert rule. The value is a timestamp.</p>
             * <p>Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1622427900000</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The method used to calculate the metric values that trigger alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>Average</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The alert threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            public ResourcesResource build() {
                return new ResourcesResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlertingMetricRuleResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertingMetricRuleResourcesResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Resource")
        private java.util.List < ResourcesResource> resource;

        private Resources(Builder builder) {
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return resource
         */
        public java.util.List < ResourcesResource> getResource() {
            return this.resource;
        }

        public static final class Builder {
            private java.util.List < ResourcesResource> resource; 

            /**
             * <p>The resources that are monitored.</p>
             * 
             * <strong>example:</strong>
             * <p>userId=120886317861****,region=cn-huhehaote,queue=test-0128</p>
             */
            public Builder resource(java.util.List < ResourcesResource> resource) {
                this.resource = resource;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
