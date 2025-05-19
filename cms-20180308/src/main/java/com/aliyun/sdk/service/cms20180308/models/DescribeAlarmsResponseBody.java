// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link DescribeAlarmsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlarmsResponseBody</p>
 */
public class DescribeAlarmsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Datapoints")
    private Datapoints datapoints;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private String total;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private DescribeAlarmsResponseBody(Builder builder) {
        this.code = builder.code;
        this.datapoints = builder.datapoints;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlarmsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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

    /**
     * @return total
     */
    public String getTotal() {
        return this.total;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private Integer code; 
        private Datapoints datapoints; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String total; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(DescribeAlarmsResponseBody model) {
            this.code = model.code;
            this.datapoints = model.datapoints;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
            this.traceId = model.traceId;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Datapoints.
         */
        public Builder datapoints(Datapoints datapoints) {
            this.datapoints = datapoints;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeAlarmsResponseBody build() {
            return new DescribeAlarmsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAlarmsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlarmsResponseBody</p>
     */
    public static class Critical extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertSensitivity")
        private String alertSensitivity;

        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("HistoryDataRange")
        private String historyDataRange;

        @com.aliyun.core.annotation.NameInMap("PreCondition")
        private String preCondition;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Times")
        private String times;

        private Critical(Builder builder) {
            this.alertSensitivity = builder.alertSensitivity;
            this.comparisonOperator = builder.comparisonOperator;
            this.historyDataRange = builder.historyDataRange;
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
         * @return alertSensitivity
         */
        public String getAlertSensitivity() {
            return this.alertSensitivity;
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return historyDataRange
         */
        public String getHistoryDataRange() {
            return this.historyDataRange;
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
        public String getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String alertSensitivity; 
            private String comparisonOperator; 
            private String historyDataRange; 
            private String preCondition; 
            private String statistics; 
            private String threshold; 
            private String times; 

            private Builder() {
            } 

            private Builder(Critical model) {
                this.alertSensitivity = model.alertSensitivity;
                this.comparisonOperator = model.comparisonOperator;
                this.historyDataRange = model.historyDataRange;
                this.preCondition = model.preCondition;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.times = model.times;
            } 

            /**
             * AlertSensitivity.
             */
            public Builder alertSensitivity(String alertSensitivity) {
                this.alertSensitivity = alertSensitivity;
                return this;
            }

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * HistoryDataRange.
             */
            public Builder historyDataRange(String historyDataRange) {
                this.historyDataRange = historyDataRange;
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
            public Builder times(String times) {
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
     * {@link DescribeAlarmsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlarmsResponseBody</p>
     */
    public static class Info extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertSensitivity")
        private String alertSensitivity;

        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("HistoryDataRange")
        private String historyDataRange;

        @com.aliyun.core.annotation.NameInMap("PreCondition")
        private String preCondition;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Times")
        private String times;

        private Info(Builder builder) {
            this.alertSensitivity = builder.alertSensitivity;
            this.comparisonOperator = builder.comparisonOperator;
            this.historyDataRange = builder.historyDataRange;
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
         * @return alertSensitivity
         */
        public String getAlertSensitivity() {
            return this.alertSensitivity;
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return historyDataRange
         */
        public String getHistoryDataRange() {
            return this.historyDataRange;
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
        public String getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String alertSensitivity; 
            private String comparisonOperator; 
            private String historyDataRange; 
            private String preCondition; 
            private String statistics; 
            private String threshold; 
            private String times; 

            private Builder() {
            } 

            private Builder(Info model) {
                this.alertSensitivity = model.alertSensitivity;
                this.comparisonOperator = model.comparisonOperator;
                this.historyDataRange = model.historyDataRange;
                this.preCondition = model.preCondition;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.times = model.times;
            } 

            /**
             * AlertSensitivity.
             */
            public Builder alertSensitivity(String alertSensitivity) {
                this.alertSensitivity = alertSensitivity;
                return this;
            }

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * HistoryDataRange.
             */
            public Builder historyDataRange(String historyDataRange) {
                this.historyDataRange = historyDataRange;
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
            public Builder times(String times) {
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
     * {@link DescribeAlarmsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlarmsResponseBody</p>
     */
    public static class Warn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertSensitivity")
        private String alertSensitivity;

        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("HistoryDataRange")
        private String historyDataRange;

        @com.aliyun.core.annotation.NameInMap("PreCondition")
        private String preCondition;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Times")
        private String times;

        private Warn(Builder builder) {
            this.alertSensitivity = builder.alertSensitivity;
            this.comparisonOperator = builder.comparisonOperator;
            this.historyDataRange = builder.historyDataRange;
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
         * @return alertSensitivity
         */
        public String getAlertSensitivity() {
            return this.alertSensitivity;
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return historyDataRange
         */
        public String getHistoryDataRange() {
            return this.historyDataRange;
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
        public String getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String alertSensitivity; 
            private String comparisonOperator; 
            private String historyDataRange; 
            private String preCondition; 
            private String statistics; 
            private String threshold; 
            private String times; 

            private Builder() {
            } 

            private Builder(Warn model) {
                this.alertSensitivity = model.alertSensitivity;
                this.comparisonOperator = model.comparisonOperator;
                this.historyDataRange = model.historyDataRange;
                this.preCondition = model.preCondition;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.times = model.times;
            } 

            /**
             * AlertSensitivity.
             */
            public Builder alertSensitivity(String alertSensitivity) {
                this.alertSensitivity = alertSensitivity;
                return this;
            }

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * HistoryDataRange.
             */
            public Builder historyDataRange(String historyDataRange) {
                this.historyDataRange = historyDataRange;
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
            public Builder times(String times) {
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
     * {@link DescribeAlarmsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlarmsResponseBody</p>
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
     * {@link DescribeAlarmsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlarmsResponseBody</p>
     */
    public static class Alarm extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("ContactGroups")
        private String contactGroups;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private String dimensions;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("EffectiveInterval")
        private String effectiveInterval;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("Escalations")
        private Escalations escalations;

        @com.aliyun.core.annotation.NameInMap("EvaluationCount")
        private String evaluationCount;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("NoEffectiveInterval")
        private String noEffectiveInterval;

        @com.aliyun.core.annotation.NameInMap("Period")
        private String period;

        @com.aliyun.core.annotation.NameInMap("Resources")
        private String resources;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("SilenceTime")
        private String silenceTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Subject")
        private String subject;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("Webhook")
        private String webhook;

        private Alarm(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.contactGroups = builder.contactGroups;
            this.dimensions = builder.dimensions;
            this.displayName = builder.displayName;
            this.effectiveInterval = builder.effectiveInterval;
            this.enable = builder.enable;
            this.escalations = builder.escalations;
            this.evaluationCount = builder.evaluationCount;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.level = builder.level;
            this.metricName = builder.metricName;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.noEffectiveInterval = builder.noEffectiveInterval;
            this.period = builder.period;
            this.resources = builder.resources;
            this.ruleName = builder.ruleName;
            this.ruleType = builder.ruleType;
            this.silenceTime = builder.silenceTime;
            this.state = builder.state;
            this.statistics = builder.statistics;
            this.subject = builder.subject;
            this.threshold = builder.threshold;
            this.uuid = builder.uuid;
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
         * @return dimensions
         */
        public String getDimensions() {
            return this.dimensions;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return effectiveInterval
         */
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return escalations
         */
        public Escalations getEscalations() {
            return this.escalations;
        }

        /**
         * @return evaluationCount
         */
        public String getEvaluationCount() {
            return this.evaluationCount;
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
         * @return name
         */
        public String getName() {
            return this.name;
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
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return silenceTime
         */
        public String getSilenceTime() {
            return this.silenceTime;
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
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        /**
         * @return threshold
         */
        public String getThreshold() {
            return this.threshold;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
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
            private String dimensions; 
            private String displayName; 
            private String effectiveInterval; 
            private Boolean enable; 
            private Escalations escalations; 
            private String evaluationCount; 
            private String groupId; 
            private String groupName; 
            private String level; 
            private String metricName; 
            private String name; 
            private String namespace; 
            private String noEffectiveInterval; 
            private String period; 
            private String resources; 
            private String ruleName; 
            private String ruleType; 
            private String silenceTime; 
            private String state; 
            private String statistics; 
            private String subject; 
            private String threshold; 
            private String uuid; 
            private String webhook; 

            private Builder() {
            } 

            private Builder(Alarm model) {
                this.comparisonOperator = model.comparisonOperator;
                this.contactGroups = model.contactGroups;
                this.dimensions = model.dimensions;
                this.displayName = model.displayName;
                this.effectiveInterval = model.effectiveInterval;
                this.enable = model.enable;
                this.escalations = model.escalations;
                this.evaluationCount = model.evaluationCount;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.level = model.level;
                this.metricName = model.metricName;
                this.name = model.name;
                this.namespace = model.namespace;
                this.noEffectiveInterval = model.noEffectiveInterval;
                this.period = model.period;
                this.resources = model.resources;
                this.ruleName = model.ruleName;
                this.ruleType = model.ruleType;
                this.silenceTime = model.silenceTime;
                this.state = model.state;
                this.statistics = model.statistics;
                this.subject = model.subject;
                this.threshold = model.threshold;
                this.uuid = model.uuid;
                this.webhook = model.webhook;
            } 

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * ContactGroups.
             */
            public Builder contactGroups(String contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * Dimensions.
             */
            public Builder dimensions(String dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * EffectiveInterval.
             */
            public Builder effectiveInterval(String effectiveInterval) {
                this.effectiveInterval = effectiveInterval;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * Escalations.
             */
            public Builder escalations(Escalations escalations) {
                this.escalations = escalations;
                return this;
            }

            /**
             * EvaluationCount.
             */
            public Builder evaluationCount(String evaluationCount) {
                this.evaluationCount = evaluationCount;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * MetricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * NoEffectiveInterval.
             */
            public Builder noEffectiveInterval(String noEffectiveInterval) {
                this.noEffectiveInterval = noEffectiveInterval;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * Resources.
             */
            public Builder resources(String resources) {
                this.resources = resources;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * RuleType.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * SilenceTime.
             */
            public Builder silenceTime(String silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
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
             * Subject.
             */
            public Builder subject(String subject) {
                this.subject = subject;
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
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * Webhook.
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
    /**
     * 
     * {@link DescribeAlarmsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlarmsResponseBody</p>
     */
    public static class Datapoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alarm")
        private java.util.List<Alarm> alarm;

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
        public java.util.List<Alarm> getAlarm() {
            return this.alarm;
        }

        public static final class Builder {
            private java.util.List<Alarm> alarm; 

            private Builder() {
            } 

            private Builder(Datapoints model) {
                this.alarm = model.alarm;
            } 

            /**
             * Alarm.
             */
            public Builder alarm(java.util.List<Alarm> alarm) {
                this.alarm = alarm;
                return this;
            }

            public Datapoints build() {
                return new Datapoints(this);
            } 

        } 

    }
}
