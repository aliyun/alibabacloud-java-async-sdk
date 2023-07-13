// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricRuleListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetricRuleListResponseBody</p>
 */
public class DescribeMetricRuleListResponseBody extends TeaModel {
    @NameInMap("Alarms")
    private Alarms alarms;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private String total;

    private DescribeMetricRuleListResponseBody(Builder builder) {
        this.alarms = builder.alarms;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricRuleListResponseBody create() {
        return builder().build();
    }

    /**
     * @return alarms
     */
    public Alarms getAlarms() {
        return this.alarms;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public String getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Alarms alarms; 
        private Integer code; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String total; 

        /**
         * The details of the alert rules.
         */
        public Builder alarms(Alarms alarms) {
            this.alarms = alarms;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call is successful.
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call is successful. Valid values:
         * <p>
         * 
         * *   true: The call is successful.
         * *   false: The call fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public DescribeMetricRuleListResponseBody build() {
            return new DescribeMetricRuleListResponseBody(this);
        } 

    } 

    public static class ExpressionList extends TeaModel {
        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("Period")
        private Integer period;

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
        public Integer getPeriod() {
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
            private Integer period; 
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
            public Builder period(Integer period) {
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
    public static class CompositeExpressionExpressionList extends TeaModel {
        @NameInMap("ExpressionList")
        private java.util.List < ExpressionList> expressionList;

        private CompositeExpressionExpressionList(Builder builder) {
            this.expressionList = builder.expressionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompositeExpressionExpressionList create() {
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

            public CompositeExpressionExpressionList build() {
                return new CompositeExpressionExpressionList(this);
            } 

        } 

    }
    public static class CompositeExpression extends TeaModel {
        @NameInMap("ExpressionList")
        private CompositeExpressionExpressionList expressionList;

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
        public CompositeExpressionExpressionList getExpressionList() {
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
            private CompositeExpressionExpressionList expressionList; 
            private String expressionListJoin; 
            private String expressionRaw; 
            private String level; 
            private Integer times; 

            /**
             * The trigger conditions that are created in standard mode.
             */
            public Builder expressionList(CompositeExpressionExpressionList expressionList) {
                this.expressionList = expressionList;
                return this;
            }

            /**
             * The relationship between the trigger conditions for multiple metrics. Valid values:
             * <p>
             * 
             * *   `&&`: An alert is triggered only if all metrics meet the trigger conditions. An alert is triggered only if the results of all expressions specified in the ExpressionList parameter are `true`.
             * *   `||`: An alert is triggered if one of the metrics meets the trigger conditions.
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
    public static class Critical extends TeaModel {
        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

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
            private String preCondition; 
            private String statistics; 
            private String threshold; 
            private Integer times; 

            /**
             * The comparison operator that is used to compare the metric value with the threshold. Valid values:
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
             * The additional conditions for triggering Critical-level alerts. The additional conditions take effect when the value of the ComparisonOperator parameter is GreaterThanYesterday, LessThanYesterday, GreaterThanLastWeek, LessThanLastWeek, GreaterThanLastPeriod, or LessThanLastPeriod.
             * <p>
             * 
             * For example, the values of the PreCondition, ComparisonOperator, and Threshold parameters are set to $Average>80, GreaterThanYesterday, and 10, respectively. An alert is triggered only when the average metric value is greater than 80 and 10% greater than the average metric value at the same time yesterday.
             * 
             * >  $Average is a placeholder that consists of `a dollar sign ($) and the statistical method`. CloudMonitor replaces the placeholder with the aggregated value or original value before value comparison.
             */
            public Builder preCondition(String preCondition) {
                this.preCondition = preCondition;
                return this;
            }

            /**
             * The statistical methods for Critical-level alerts.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The threshold for Critical-level alerts.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * The consecutive number of times for which the metric value meets the alert condition before a Critical-level alert is triggered.
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
            private String preCondition; 
            private String statistics; 
            private String threshold; 
            private Integer times; 

            /**
             * The comparison operator that is used to compare the metric value with the threshold. Valid values:
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
             * The additional conditions for triggering Info-level alerts. The additional conditions take effect when the value of the ComparisonOperator parameter is GreaterThanYesterday, LessThanYesterday, GreaterThanLastWeek, LessThanLastWeek, GreaterThanLastPeriod, or LessThanLastPeriod.
             * <p>
             * 
             * For example, the values of the PreCondition, ComparisonOperator, and Threshold parameters are set to $Average>80, GreaterThanYesterday, and 10, respectively. An alert is triggered only when the average metric value is greater than 80 and 10% greater than the average metric value at the same time yesterday.
             * 
             * >  $Average is a placeholder that consists of `a dollar sign ($) and the statistical method`. CloudMonitor replaces the placeholder with the aggregated value or original value before value comparison.
             */
            public Builder preCondition(String preCondition) {
                this.preCondition = preCondition;
                return this;
            }

            /**
             * The statistical methods for Info-level alerts.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The threshold for Info-level alerts.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * The consecutive number of times for which the metric value meets the alert condition before an Info-level alert is triggered.
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
            private String preCondition; 
            private String statistics; 
            private String threshold; 
            private Integer times; 

            /**
             * The comparison operator that is used to compare the metric value with the threshold. Valid values:
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
             * The additional conditions for triggering Warn-level alerts. The additional conditions take effect when the value of the ComparisonOperator parameter is GreaterThanYesterday, LessThanYesterday, GreaterThanLastWeek, LessThanLastWeek, GreaterThanLastPeriod, or LessThanLastPeriod.
             * <p>
             * 
             * For example, the values of the PreCondition, ComparisonOperator, and Threshold parameters are set to $Average>80, GreaterThanYesterday, and 10, respectively. An alert is triggered only when the average metric value is greater than 80 and 10% greater than the average metric value at the same time yesterday.
             * 
             * >  $Average is a placeholder that consists of `a dollar sign ($) and the statistical method`. CloudMonitor replaces the placeholder with the aggregated value or original value before value comparison.
             */
            public Builder preCondition(String preCondition) {
                this.preCondition = preCondition;
                return this;
            }

            /**
             * The statistical methods for Warn-level alerts.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The threshold for Warn-level alerts.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * The consecutive number of times for which the metric value meets the alert condition before a Warn-level alert is triggered.
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
        private Critical critical;

        @NameInMap("Info")
        private Info info;

        @NameInMap("Warn")
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
             * The conditions for triggering Critical-level alerts.
             */
            public Builder critical(Critical critical) {
                this.critical = critical;
                return this;
            }

            /**
             * The conditions for triggering Info-level alerts.
             */
            public Builder info(Info info) {
                this.info = info;
                return this;
            }

            /**
             * The conditions for triggering Warn-level alerts.
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
             * The tag key of the alert rule.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the alert rule.
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
    public static class AlarmLabels extends TeaModel {
        @NameInMap("Labels")
        private java.util.List < Labels> labels;

        private AlarmLabels(Builder builder) {
            this.labels = builder.labels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmLabels create() {
            return builder().build();
        }

        /**
         * @return labels
         */
        public java.util.List < Labels> getLabels() {
            return this.labels;
        }

        public static final class Builder {
            private java.util.List < Labels> labels; 

            /**
             * Labels.
             */
            public Builder labels(java.util.List < Labels> labels) {
                this.labels = labels;
                return this;
            }

            public AlarmLabels build() {
                return new AlarmLabels(this);
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
    public static class PrometheusAnnotations extends TeaModel {
        @NameInMap("Annotations")
        private java.util.List < Annotations> annotations;

        private PrometheusAnnotations(Builder builder) {
            this.annotations = builder.annotations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrometheusAnnotations create() {
            return builder().build();
        }

        /**
         * @return annotations
         */
        public java.util.List < Annotations> getAnnotations() {
            return this.annotations;
        }

        public static final class Builder {
            private java.util.List < Annotations> annotations; 

            /**
             * Annotations.
             */
            public Builder annotations(java.util.List < Annotations> annotations) {
                this.annotations = annotations;
                return this;
            }

            public PrometheusAnnotations build() {
                return new PrometheusAnnotations(this);
            } 

        } 

    }
    public static class Prometheus extends TeaModel {
        @NameInMap("Annotations")
        private PrometheusAnnotations annotations;

        @NameInMap("Level")
        private String level;

        @NameInMap("PromQL")
        private String promQL;

        @NameInMap("Times")
        private Long times;

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
        public PrometheusAnnotations getAnnotations() {
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
        public Long getTimes() {
            return this.times;
        }

        public static final class Builder {
            private PrometheusAnnotations annotations; 
            private String level; 
            private String promQL; 
            private Long times; 

            /**
             * The annotations of the Prometheus alert rule. When a Prometheus alert is triggered, the system renders the annotated keys and values to help you understand the metrics and alert rule.
             * <p>
             * 
             * >  This parameter is equivalent to the annotations parameter of open source Prometheus.
             */
            public Builder annotations(PrometheusAnnotations annotations) {
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
            public Builder times(Long times) {
                this.times = times;
                return this;
            }

            public Prometheus build() {
                return new Prometheus(this);
            } 

        } 

    }
    public static class Alarm extends TeaModel {
        @NameInMap("AlertState")
        private String alertState;

        @NameInMap("CompositeExpression")
        private CompositeExpression compositeExpression;

        @NameInMap("ContactGroups")
        private String contactGroups;

        @NameInMap("Dimensions")
        private String dimensions;

        @NameInMap("EffectiveInterval")
        private String effectiveInterval;

        @NameInMap("EnableState")
        private Boolean enableState;

        @NameInMap("Escalations")
        private Escalations escalations;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("Labels")
        private AlarmLabels labels;

        @NameInMap("MailSubject")
        private String mailSubject;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("NoDataPolicy")
        private String noDataPolicy;

        @NameInMap("NoEffectiveInterval")
        private String noEffectiveInterval;

        @NameInMap("Period")
        private String period;

        @NameInMap("Prometheus")
        private Prometheus prometheus;

        @NameInMap("Resources")
        private String resources;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("SilenceTime")
        private Integer silenceTime;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("Webhook")
        private String webhook;

        private Alarm(Builder builder) {
            this.alertState = builder.alertState;
            this.compositeExpression = builder.compositeExpression;
            this.contactGroups = builder.contactGroups;
            this.dimensions = builder.dimensions;
            this.effectiveInterval = builder.effectiveInterval;
            this.enableState = builder.enableState;
            this.escalations = builder.escalations;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.labels = builder.labels;
            this.mailSubject = builder.mailSubject;
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
            this.sourceType = builder.sourceType;
            this.webhook = builder.webhook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Alarm create() {
            return builder().build();
        }

        /**
         * @return alertState
         */
        public String getAlertState() {
            return this.alertState;
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
         * @return enableState
         */
        public Boolean getEnableState() {
            return this.enableState;
        }

        /**
         * @return escalations
         */
        public Escalations getEscalations() {
            return this.escalations;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return labels
         */
        public AlarmLabels getLabels() {
            return this.labels;
        }

        /**
         * @return mailSubject
         */
        public String getMailSubject() {
            return this.mailSubject;
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
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return webhook
         */
        public String getWebhook() {
            return this.webhook;
        }

        public static final class Builder {
            private String alertState; 
            private CompositeExpression compositeExpression; 
            private String contactGroups; 
            private String dimensions; 
            private String effectiveInterval; 
            private Boolean enableState; 
            private Escalations escalations; 
            private String groupId; 
            private String groupName; 
            private AlarmLabels labels; 
            private String mailSubject; 
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
            private String sourceType; 
            private String webhook; 

            /**
             * The status of the alert rule. Valid values:
             * <p>
             * 
             * *   OK: The alert rule has no active alerts.
             * *   ALARM: The alert rule has active alerts.
             * *   INSUFFICIENT_DATA: No data is available.
             */
            public Builder alertState(String alertState) {
                this.alertState = alertState;
                return this;
            }

            /**
             * The trigger conditions for multiple metrics.
             * <p>
             * 
             * >  The trigger conditions for a single metric and multiple metrics are mutually exclusive. You cannot specify trigger conditions for a single metric and multiple metrics at the same time.
             */
            public Builder compositeExpression(CompositeExpression compositeExpression) {
                this.compositeExpression = compositeExpression;
                return this;
            }

            /**
             * The alert contact group.
             */
            public Builder contactGroups(String contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * The dimensions of the alert rule.
             */
            public Builder dimensions(String dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * The time period during which the alert rule is effective.
             */
            public Builder effectiveInterval(String effectiveInterval) {
                this.effectiveInterval = effectiveInterval;
                return this;
            }

            /**
             * Indicates whether the alert rule is enabled. Valid values:
             * <p>
             * 
             * *   true: The alert rule is enabled.
             * *   false: The alert rule is disabled.
             */
            public Builder enableState(Boolean enableState) {
                this.enableState = enableState;
                return this;
            }

            /**
             * The conditions for triggering different levels of alerts.
             */
            public Builder escalations(Escalations escalations) {
                this.escalations = escalations;
                return this;
            }

            /**
             * The ID of the application group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the application group.
             * <p>
             * 
             * >  If the alert rule is associated with an application group, the name of the application group is returned in this parameter.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The tags of the alert rule.
             */
            public Builder labels(AlarmLabels labels) {
                this.labels = labels;
                return this;
            }

            /**
             * The subject of the alert notification email.
             */
            public Builder mailSubject(String mailSubject) {
                this.mailSubject = mailSubject;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
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
             * The method that is used to handle alerts when no monitoring data is found. Valid values:
             * <p>
             * 
             * *   KEEP_LAST_STATE (default value): No operation is performed.
             * *   INSUFFICIENT_DATA: An alert whose content is "Insufficient data" is triggered.
             * *   OK: The status is considered normal.
             */
            public Builder noDataPolicy(String noDataPolicy) {
                this.noDataPolicy = noDataPolicy;
                return this;
            }

            /**
             * The time period during which the alert rule is ineffective.
             */
            public Builder noEffectiveInterval(String noEffectiveInterval) {
                this.noEffectiveInterval = noEffectiveInterval;
                return this;
            }

            /**
             * The statistical period.
             */
            public Builder period(String period) {
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
                this.prometheus = prometheus;
                return this;
            }

            /**
             * The resources that are associated with the alert rule.
             */
            public Builder resources(String resources) {
                this.resources = resources;
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
             * The mute period during which new alert notifications are not sent even if the trigger conditions are met. Unit: seconds. Default value: 86400. Minimum value: 3600.
             * <p>
             * 
             * Only one alert is reported during each mute period even if the metric value consecutively exceeds the alert rule threshold several times.
             */
            public Builder silenceTime(Integer silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * The type of the alert rule. Valid value: METRIC. This value indicates an alert rule for time series metrics.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * The callback URL. CloudMonitor pushes an alert notification to the specified callback URL by sending an HTTP POST request. Only the HTTP protocol is supported.
             */
            public Builder webhook(String webhook) {
                this.webhook = webhook;
                return this;
            }

            public Alarm build() {
                return new Alarm(this);
            } 

        } 

    }
    public static class Alarms extends TeaModel {
        @NameInMap("Alarm")
        private java.util.List < Alarm> alarm;

        private Alarms(Builder builder) {
            this.alarm = builder.alarm;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Alarms create() {
            return builder().build();
        }

        /**
         * @return alarm
         */
        public java.util.List < Alarm> getAlarm() {
            return this.alarm;
        }

        public static final class Builder {
            private java.util.List < Alarm> alarm; 

            /**
             * Alarm.
             */
            public Builder alarm(java.util.List < Alarm> alarm) {
                this.alarm = alarm;
                return this;
            }

            public Alarms build() {
                return new Alarms(this);
            } 

        } 

    }
}
