// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeActiveMetricRuleListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeActiveMetricRuleListResponseBody</p>
 */
public class DescribeActiveMetricRuleListResponseBody extends TeaModel {
    @NameInMap("AlertList")
    private AlertList alertList;

    @NameInMap("Code")
    private String code;

    @NameInMap("Datapoints")
    private Datapoints datapoints;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeActiveMetricRuleListResponseBody(Builder builder) {
        this.alertList = builder.alertList;
        this.code = builder.code;
        this.datapoints = builder.datapoints;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeActiveMetricRuleListResponseBody create() {
        return builder().build();
    }

    /**
     * @return alertList
     */
    public AlertList getAlertList() {
        return this.alertList;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return datapoints
     */
    public Datapoints getDatapoints() {
        return this.datapoints;
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

    public static final class Builder {
        private AlertList alertList; 
        private String code; 
        private Datapoints datapoints; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The mute period during which new alerts are not sent even if the trigger conditions are met. Unit: seconds. Default value: 86400.
         */
        public Builder alertList(AlertList alertList) {
            this.alertList = alertList;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The mute period during which new alerts are not sent even if the trigger conditions are met. Unit: seconds. Default value: 86400.
         */
        public Builder datapoints(Datapoints datapoints) {
            this.datapoints = datapoints;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the alert rules.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeActiveMetricRuleListResponseBody build() {
            return new DescribeActiveMetricRuleListResponseBody(this);
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
        private String times;

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
        public String getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String comparisonOperator; 
            private String statistics; 
            private String threshold; 
            private String times; 

            /**
             * The consecutive number of times for which the metric value meets the alert condition before a Critical-level alert is triggered.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * Queries details about one-click alert rules.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The statistical aggregation method for critical-level alerts.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * The threshold for critical-level alerts.
             */
            public Builder times(String times) {
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
        private String times;

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
        public String getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String comparisonOperator; 
            private String statistics; 
            private String threshold; 
            private String times; 

            /**
             * The consecutive number of times for which the metric value meets the alert condition before an info-level alert is triggered.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * The condition for triggering warn-level alerts.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The statistical aggregation method for info-level alerts.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * The threshold for info-level alerts.
             */
            public Builder times(String times) {
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
        private String times;

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
        public String getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String comparisonOperator; 
            private String statistics; 
            private String threshold; 
            private String times; 

            /**
             * The consecutive number of times for which the metric value meets the alert condition before a warn-level alert is triggered.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * The condition for triggering critical-level alerts.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The statistical aggregation method for warn-level alerts.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * The threshold of warn-level alerts.
             */
            public Builder times(String times) {
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
             * The comparison operator of the threshold for critical-level alerts. Valid values:
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
            public Builder critical(Critical critical) {
                this.critical = critical;
                return this;
            }

            /**
             * The comparison operator of the threshold for info-level alerts. Valid values:
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
            public Builder info(Info info) {
                this.info = info;
                return this;
            }

            /**
             * The comparison operator of the threshold for critical-level alerts. Valid values:
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
            public Builder warn(Warn warn) {
                this.warn = warn;
                return this;
            }

            public Escalations build() {
                return new Escalations(this);
            } 

        } 

    }
    public static class Alert extends TeaModel {
        @NameInMap("AlertState")
        private String alertState;

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

        @NameInMap("MailSubject")
        private String mailSubject;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("NoEffectiveInterval")
        private String noEffectiveInterval;

        @NameInMap("Period")
        private String period;

        @NameInMap("Resources")
        private String resources;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("SilenceTime")
        private String silenceTime;

        @NameInMap("Webhook")
        private String webhook;

        private Alert(Builder builder) {
            this.alertState = builder.alertState;
            this.contactGroups = builder.contactGroups;
            this.dimensions = builder.dimensions;
            this.effectiveInterval = builder.effectiveInterval;
            this.enableState = builder.enableState;
            this.escalations = builder.escalations;
            this.mailSubject = builder.mailSubject;
            this.metricName = builder.metricName;
            this.namespace = builder.namespace;
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

        public static Alert create() {
            return builder().build();
        }

        /**
         * @return alertState
         */
        public String getAlertState() {
            return this.alertState;
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
        public String getSilenceTime() {
            return this.silenceTime;
        }

        /**
         * @return webhook
         */
        public String getWebhook() {
            return this.webhook;
        }

        public static final class Builder {
            private String alertState; 
            private String contactGroups; 
            private String dimensions; 
            private String effectiveInterval; 
            private Boolean enableState; 
            private Escalations escalations; 
            private String mailSubject; 
            private String metricName; 
            private String namespace; 
            private String noEffectiveInterval; 
            private String period; 
            private String resources; 
            private String ruleId; 
            private String ruleName; 
            private String silenceTime; 
            private String webhook; 

            /**
             * The dimensions that specify the resources for which you want to query monitoring data.
             * <p>
             * 
             * The value is a collection of key-value pairs. A typical key-value pair is `instanceId:XXXXXX`.
             * 
             * The key and value must be 1 to 64 bytes in length, respectively. Excessive bytes are truncated from the string.
             * 
             * The key and value can contain letters, digits, periods (.), hyphens (-), underscores (\_), forward slashes (/), and backslashes (\\).
             * 
             * >  Dimensions must be organized in a JSON string and follow the required order.
             */
            public Builder alertState(String alertState) {
                this.alertState = alertState;
                return this;
            }

            /**
             * The namespace of the service. For more information, see [Appendix 1: Metrics](~~163515~~).
             */
            public Builder contactGroups(String contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * Indicates whether the alert rule is enabled. Valid values:
             * <p>
             * 
             * *   true: The alert rule is enabled.
             * *   false: The alert rule is disabled.
             */
            public Builder dimensions(String dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * The time period during which the alert rule is ineffective.
             */
            public Builder effectiveInterval(String effectiveInterval) {
                this.effectiveInterval = effectiveInterval;
                return this;
            }

            /**
             * The resources that are associated with the alert rule. A one-click alert rule is associated with all resources. The return value is fixed.
             */
            public Builder enableState(Boolean enableState) {
                this.enableState = enableState;
                return this;
            }

            /**
             * The condition for triggering info-level alerts.
             */
            public Builder escalations(Escalations escalations) {
                this.escalations = escalations;
                return this;
            }

            /**
             * MailSubject.
             */
            public Builder mailSubject(String mailSubject) {
                this.mailSubject = mailSubject;
                return this;
            }

            /**
             * The callback URL.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The time period during which the alert rule is effective.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The name of the alert rule.
             */
            public Builder noEffectiveInterval(String noEffectiveInterval) {
                this.noEffectiveInterval = noEffectiveInterval;
                return this;
            }

            /**
             * The status of the alert rule. Valid values:
             * <p>
             * 
             * *   OK: The alert rule has no active alert.
             * *   ALARM: The alert rule has at least one active alert.
             * *   INSUFFICIENT_DATA: The alert rule has no data.
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * The conditions for triggering different levels of alerts.
             */
            public Builder resources(String resources) {
                this.resources = resources;
                return this;
            }

            /**
             * The aggregation period of the monitoring data. Unit: seconds. The default value is the minimum aggregation period, indicating that the metric is polled at the highest frequency. Typically, you do not need to specify the minimum aggregation period.
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
             * The name of the metric.
             */
            public Builder silenceTime(String silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * The alert group that receives alert notifications.
             */
            public Builder webhook(String webhook) {
                this.webhook = webhook;
                return this;
            }

            public Alert build() {
                return new Alert(this);
            } 

        } 

    }
    public static class AlertList extends TeaModel {
        @NameInMap("Alert")
        private java.util.List < Alert> alert;

        private AlertList(Builder builder) {
            this.alert = builder.alert;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertList create() {
            return builder().build();
        }

        /**
         * @return alert
         */
        public java.util.List < Alert> getAlert() {
            return this.alert;
        }

        public static final class Builder {
            private java.util.List < Alert> alert; 

            /**
             * Alert.
             */
            public Builder alert(java.util.List < Alert> alert) {
                this.alert = alert;
                return this;
            }

            public AlertList build() {
                return new AlertList(this);
            } 

        } 

    }
    public static class Alarm extends TeaModel {
        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("ContactGroups")
        private String contactGroups;

        @NameInMap("Enable")
        private String enable;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("EvaluationCount")
        private String evaluationCount;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("Period")
        private String period;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("SilenceTime")
        private String silenceTime;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("State")
        private String state;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
        private String threshold;

        @NameInMap("Webhook")
        private String webhook;

        private Alarm(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.contactGroups = builder.contactGroups;
            this.enable = builder.enable;
            this.endTime = builder.endTime;
            this.evaluationCount = builder.evaluationCount;
            this.metricName = builder.metricName;
            this.namespace = builder.namespace;
            this.period = builder.period;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.silenceTime = builder.silenceTime;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
            this.webhook = builder.webhook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Alarm create() {
            return builder().build();
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
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return evaluationCount
         */
        public String getEvaluationCount() {
            return this.evaluationCount;
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
        public String getSilenceTime() {
            return this.silenceTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
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

        public static final class Builder {
            private String comparisonOperator; 
            private String contactGroups; 
            private String enable; 
            private String endTime; 
            private String evaluationCount; 
            private String metricName; 
            private String namespace; 
            private String period; 
            private String ruleId; 
            private String ruleName; 
            private String silenceTime; 
            private String startTime; 
            private String state; 
            private String statistics; 
            private String threshold; 
            private String webhook; 

            /**
             * The beginning of the time period during which the alert rule is effective. Unit: hours. For example, the value 23 indicates `23:59:59`.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * The namespace of the service. For more information, see [Appendix 1: Metrics](~~163515~~).
             */
            public Builder contactGroups(String contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * The details of the alert rules.
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The end of the time period during which the alert rule is effective. Unit: hours. For example, the value 00 indicates `00:00:00`.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The callback URL.
             */
            public Builder evaluationCount(String evaluationCount) {
                this.evaluationCount = evaluationCount;
                return this;
            }

            /**
             * The consecutive number of times for which the metric value meets the alert condition before an alert is triggered.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The name of the alert rule.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The comparison operator that is used in the alert rule. Valid values:
             * <p>
             * 
             * *   `>`
             * *   `<`
             * *   `>=`
             * *   `<=`
             * *   `=`
             * *   `=`
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * The aggregation period of the monitoring data. Unit: seconds. The default value is the minimum aggregation period, indicating that the metric is polled at the highest frequency. Typically, you do not need to specify the minimum aggregation period.
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
             * The name of the metric.
             */
            public Builder silenceTime(String silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * The threshold of the metric value.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The alert group that receives alert notifications.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Indicates whether the alert rule is enabled. Valid values:
             * <p>
             * 
             * *   true: The alert rule is enabled.
             * *   false: The alert rule is disabled.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The statistical aggregation method.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * Indicates whether the alert rule is enabled.
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
    public static class Datapoints extends TeaModel {
        @NameInMap("Alarm")
        private java.util.List < Alarm> alarm;

        private Datapoints(Builder builder) {
            this.alarm = builder.alarm;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datapoints create() {
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

            public Datapoints build() {
                return new Datapoints(this);
            } 

        } 

    }
}
