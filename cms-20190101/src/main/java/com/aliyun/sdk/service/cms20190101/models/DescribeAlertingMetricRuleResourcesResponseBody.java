// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertingMetricRuleResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlertingMetricRuleResourcesResponseBody</p>
 */
public class DescribeAlertingMetricRuleResourcesResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Resources")
    private Resources resources;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
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
         * The status code.
         * <p>
         * 
         * > The status code 200 indicates that the request was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The resources to which the alert rule is applied.
         */
        public Builder resources(Resources resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeAlertingMetricRuleResourcesResponseBody build() {
            return new DescribeAlertingMetricRuleResourcesResponseBody(this);
        } 

    } 

    public static class ExpressionList extends TeaModel {
        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("Period")
        private String period;

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
             * The metric name.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The statistical period of the metric. Unit: seconds. The default value is the interval at which the monitoring data of the metric is collected.
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * The statistical method of the alert level. Valid values:
             * <p>
             * 
             * *   Maximum
             * *   Minimum
             * *   Average
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
    public static class ResourceExpressionList extends TeaModel {
        @NameInMap("ExpressionList")
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
    public static class Resource extends TeaModel {
        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("Expression")
        private String expression;

        @NameInMap("ExpressionList")
        private ResourceExpressionList expressionList;

        @NameInMap("ExpressionListJoin")
        private String expressionListJoin;

        @NameInMap("ExpressionRaw")
        private String expressionRaw;

        @NameInMap("Level")
        private Integer level;

        @NameInMap("PreCondition")
        private String preCondition;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("Threshold")
        private String threshold;

        @NameInMap("Times")
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
             * The description of the alert rule.
             * <p>
             * 
             * > The content of the alert rule. If the metric value meets the alert condition, an alert is triggered.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * The description of the multi-metric alert rule.
             */
            public Builder expressionList(ResourceExpressionList expressionList) {
                this.expressionList = expressionList;
                return this;
            }

            /**
             * The relationship between multiple metrics. Valid values:
             * <p>
             * 
             * *   &&: If all metrics meet the alert conditions, CloudMonitor sends alert notifications.
             * *   ||: If one of the metrics meets the alert conditions, CloudMonitor sends alert notifications.
             */
            public Builder expressionListJoin(String expressionListJoin) {
                this.expressionListJoin = expressionListJoin;
                return this;
            }

            /**
             * The trigger conditions that are created by using expressions. You can use expressions to create trigger conditions in the following scenarios:
             * <p>
             * 
             * *   Set an alert blacklist for specific resources. For example, if you specify `$instanceId != \"i-io8kfvcpp7x5****\" ``&&`` $Average > 50`, no alert is triggered when the `average metric value` of the `i-io8kfvcpp7x5****` instance exceeds 50.
             * *   Set a special alert threshold for a specified instance in the rule. For example, if you specify `$Average > ($instanceId == \"i-io8kfvcpp7x5****\"? 80: 50)`, an alert is triggered when the `average metric value` of the `i-io8kfvcpp7x5****` instance exceeds 80 or the `average metric value` of other instances exceeds 50.
             * *   Limit the number of instances whose metric values exceed the threshold. For example, if you specify `count($Average > 20) > 3`, an alert is triggered only when the number of instances whose `average metric value` exceeds 20 exceeds three.
             */
            public Builder expressionRaw(String expressionRaw) {
                this.expressionRaw = expressionRaw;
                return this;
            }

            /**
             * The severity level and notification methods of the alert. Valid values:
             * <p>
             * 
             * *   4: Alert notifications are sent by using emails and DingTalk chatbots.
             * *   OK: No alert is generated.
             */
            public Builder level(Integer level) {
                this.level = level;
                return this;
            }

            /**
             * The operator that is used to compare the metric value with the threshold. Valid values:
             * <p>
             * 
             * *   `>=`
             * *   `=`
             * *   `<=`
             * *   `>`
             * *   `<`
             * *   `!=`
             */
            public Builder preCondition(String preCondition) {
                this.preCondition = preCondition;
                return this;
            }

            /**
             * The instance tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The alert threshold.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * The consecutive number of times for which the metric value meets the alert condition before an alert is triggered.
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
    public static class Escalation extends TeaModel {
        @NameInMap("Resource")
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
    public static class ResourcesResource extends TeaModel {
        @NameInMap("Dimensions")
        private String dimensions;

        @NameInMap("Enable")
        private String enable;

        @NameInMap("Escalation")
        private Escalation escalation;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("LastAlertTime")
        private String lastAlertTime;

        @NameInMap("LastModifyTime")
        private String lastModifyTime;

        @NameInMap("Level")
        private Integer level;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("MetricValues")
        private String metricValues;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("ProductCategory")
        private String productCategory;

        @NameInMap("Resource")
        private String resource;

        @NameInMap("RetryTimes")
        private String retryTimes;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
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
             * The dimensions that specify the resources whose monitoring data you want to query.
             */
            public Builder dimensions(String dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * Indicates whether the alert rule is enabled. Valid values:
             * <p>
             * 
             * *   true: The alert rule is enabled.
             * *   false: The alert rule is disabled.
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The alert rule based on which the alert is triggered.
             */
            public Builder escalation(Escalation escalation) {
                this.escalation = escalation;
                return this;
            }

            /**
             * The ID of the application group.
             * <p>
             * 
             * > If the alert rule is associated with an application group, the ID of the application group is returned in this parameter.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The timestamp when the last alert was triggered for the resource based on the alert rule.
             * <p>
             * 
             * Unit: milliseconds.
             */
            public Builder lastAlertTime(String lastAlertTime) {
                this.lastAlertTime = lastAlertTime;
                return this;
            }

            /**
             * The timestamp when the alert rule was last modified.
             * <p>
             * 
             * Unit: milliseconds.
             */
            public Builder lastModifyTime(String lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * The severity level and notification methods of the alert. Valid values:
             * <p>
             * 
             * *   4: Alert notifications are sent by using emails and DingTalk chatbots.
             * *   OK: No alert is generated.
             */
            public Builder level(Integer level) {
                this.level = level;
                return this;
            }

            /**
             * The metric name.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The metric value that triggered the alert based on the alert rule. The value is a JSON string.
             */
            public Builder metricValues(String metricValues) {
                this.metricValues = metricValues;
                return this;
            }

            /**
             * The namespace of the cloud service.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The type of the cloud service.
             */
            public Builder productCategory(String productCategory) {
                this.productCategory = productCategory;
                return this;
            }

            /**
             * The resources that are monitored.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * The consecutive number of times for which the metric value meets the alert condition before an alert is triggered.
             */
            public Builder retryTimes(String retryTimes) {
                this.retryTimes = retryTimes;
                return this;
            }

            /**
             * The ID of the alert rule.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The name of the alert rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The timestamp when the resource was associated with the alert rule.
             * <p>
             * 
             * Unit: milliseconds.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The method used to calculate metric values that trigger alerts.
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

            public ResourcesResource build() {
                return new ResourcesResource(this);
            } 

        } 

    }
    public static class Resources extends TeaModel {
        @NameInMap("Resource")
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
             * The resources that are monitored.
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
