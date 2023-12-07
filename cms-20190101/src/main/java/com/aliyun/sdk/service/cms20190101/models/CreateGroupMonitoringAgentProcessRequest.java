// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGroupMonitoringAgentProcessRequest} extends {@link RequestModel}
 *
 * <p>CreateGroupMonitoringAgentProcessRequest</p>
 */
public class CreateGroupMonitoringAgentProcessRequest extends Request {
    @Query
    @NameInMap("AlertConfig")
    @Validation(required = true)
    private java.util.List < AlertConfig> alertConfig;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("MatchExpress")
    private java.util.List < MatchExpress> matchExpress;

    @Query
    @NameInMap("MatchExpressFilterRelation")
    private String matchExpressFilterRelation;

    @Query
    @NameInMap("ProcessName")
    @Validation(required = true)
    private String processName;

    private CreateGroupMonitoringAgentProcessRequest(Builder builder) {
        super(builder);
        this.alertConfig = builder.alertConfig;
        this.groupId = builder.groupId;
        this.matchExpress = builder.matchExpress;
        this.matchExpressFilterRelation = builder.matchExpressFilterRelation;
        this.processName = builder.processName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGroupMonitoringAgentProcessRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertConfig
     */
    public java.util.List < AlertConfig> getAlertConfig() {
        return this.alertConfig;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return matchExpress
     */
    public java.util.List < MatchExpress> getMatchExpress() {
        return this.matchExpress;
    }

    /**
     * @return matchExpressFilterRelation
     */
    public String getMatchExpressFilterRelation() {
        return this.matchExpressFilterRelation;
    }

    /**
     * @return processName
     */
    public String getProcessName() {
        return this.processName;
    }

    public static final class Builder extends Request.Builder<CreateGroupMonitoringAgentProcessRequest, Builder> {
        private java.util.List < AlertConfig> alertConfig; 
        private String groupId; 
        private java.util.List < MatchExpress> matchExpress; 
        private String matchExpressFilterRelation; 
        private String processName; 

        private Builder() {
            super();
        } 

        private Builder(CreateGroupMonitoringAgentProcessRequest request) {
            super(request);
            this.alertConfig = request.alertConfig;
            this.groupId = request.groupId;
            this.matchExpress = request.matchExpress;
            this.matchExpressFilterRelation = request.matchExpressFilterRelation;
            this.processName = request.processName;
        } 

        /**
         * The alert rule configurations.
         * <p>
         * 
         * Valid values of N: 1 to 3.
         */
        public Builder alertConfig(java.util.List < AlertConfig> alertConfig) {
            this.putQueryParameter("AlertConfig", alertConfig);
            this.alertConfig = alertConfig;
            return this;
        }

        /**
         * The ID of the application group.
         * <p>
         * 
         * For more information about how to obtain the ID of an application group, see [DescribeMonitorGroups](~~115032~~).
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The expressions used to match instances.
         * <p>
         * 
         * Valid values of N: 1 to 3.
         */
        public Builder matchExpress(java.util.List < MatchExpress> matchExpress) {
            this.putQueryParameter("MatchExpress", matchExpress);
            this.matchExpress = matchExpress;
            return this;
        }

        /**
         * The logical operator used between conditional expressions that are used to match instances. Valid values:
         * <p>
         * 
         * *   all
         * *   and
         * *   or
         */
        public Builder matchExpressFilterRelation(String matchExpressFilterRelation) {
            this.putQueryParameter("MatchExpressFilterRelation", matchExpressFilterRelation);
            this.matchExpressFilterRelation = matchExpressFilterRelation;
            return this;
        }

        /**
         * The process name.
         */
        public Builder processName(String processName) {
            this.putQueryParameter("ProcessName", processName);
            this.processName = processName;
            return this;
        }

        @Override
        public CreateGroupMonitoringAgentProcessRequest build() {
            return new CreateGroupMonitoringAgentProcessRequest(this);
        } 

    } 

    public static class TargetList extends TeaModel {
        @NameInMap("Arn")
        private String arn;

        @NameInMap("Id")
        private String id;

        @NameInMap("JsonParams")
        private String jsonParams;

        @NameInMap("Level")
        private String level;

        private TargetList(Builder builder) {
            this.arn = builder.arn;
            this.id = builder.id;
            this.jsonParams = builder.jsonParams;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetList create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return jsonParams
         */
        public String getJsonParams() {
            return this.jsonParams;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        public static final class Builder {
            private String arn; 
            private String id; 
            private String jsonParams; 
            private String level; 

            /**
             * The Alibaba Cloud Resource Name (ARN) of the resource.
             * <p>
             * 
             * For information about how to obtain the ARN of a resource, see [DescribeMetricRuleTargets](~~121592~~).
             * 
             * Format: `acs:{Service name abbreviation}:{regionId}:{userId}:/{Resource type}/{Resource name}/message`. Example: `acs:mns:cn-hangzhou:120886317861****:/queues/test123/message`. Fields:
             * 
             * *   {Service name abbreviation}: the abbreviation of the service name. Valid value: mns.
             * 
             * *   {userId}: the ID of the Alibaba Cloud account.
             * 
             * *   {regionId}: the region ID of the message queue or topic.
             * 
             * *   {Resource type}: the type of the resource that triggers the alert. Valid values:
             * 
             *     *   **queues**
             *     *   **topics**
             * 
             * *   {Resource name}: the resource name.
             * 
             *     *   If the resource type is **queues**, the resource name is the queue name.
             *     *   If the resource type is **topics**, the resource name is the topic name.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * The ID of the resource for which alerts are triggered.
             * <p>
             * 
             * For information about how to obtain the ID of a resource for which alerts are triggered, see [DescribeMetricRuleTargets](~~121592~~).
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The parameters of the alert callback. Specify the parameters in the JSON format.
             */
            public Builder jsonParams(String jsonParams) {
                this.jsonParams = jsonParams;
                return this;
            }

            /**
             * The alert level. Valid values:
             * <p>
             * 
             * *   INFO
             * *   WARN
             * *   CRITICAL
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public TargetList build() {
                return new TargetList(this);
            } 

        } 

    }
    public static class AlertConfig extends TeaModel {
        @NameInMap("ComparisonOperator")
        @Validation(required = true)
        private String comparisonOperator;

        @NameInMap("EffectiveInterval")
        private String effectiveInterval;

        @NameInMap("EscalationsLevel")
        @Validation(required = true)
        private String escalationsLevel;

        @NameInMap("NoEffectiveInterval")
        private String noEffectiveInterval;

        @NameInMap("SilenceTime")
        private String silenceTime;

        @NameInMap("Statistics")
        @Validation(required = true)
        private String statistics;

        @NameInMap("TargetList")
        private java.util.List < TargetList> targetList;

        @NameInMap("Threshold")
        @Validation(required = true)
        private String threshold;

        @NameInMap("Times")
        @Validation(required = true)
        private String times;

        @NameInMap("Webhook")
        private String webhook;

        private AlertConfig(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.effectiveInterval = builder.effectiveInterval;
            this.escalationsLevel = builder.escalationsLevel;
            this.noEffectiveInterval = builder.noEffectiveInterval;
            this.silenceTime = builder.silenceTime;
            this.statistics = builder.statistics;
            this.targetList = builder.targetList;
            this.threshold = builder.threshold;
            this.times = builder.times;
            this.webhook = builder.webhook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertConfig create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return effectiveInterval
         */
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        /**
         * @return escalationsLevel
         */
        public String getEscalationsLevel() {
            return this.escalationsLevel;
        }

        /**
         * @return noEffectiveInterval
         */
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        /**
         * @return silenceTime
         */
        public String getSilenceTime() {
            return this.silenceTime;
        }

        /**
         * @return statistics
         */
        public String getStatistics() {
            return this.statistics;
        }

        /**
         * @return targetList
         */
        public java.util.List < TargetList> getTargetList() {
            return this.targetList;
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

        /**
         * @return webhook
         */
        public String getWebhook() {
            return this.webhook;
        }

        public static final class Builder {
            private String comparisonOperator; 
            private String effectiveInterval; 
            private String escalationsLevel; 
            private String noEffectiveInterval; 
            private String silenceTime; 
            private String statistics; 
            private java.util.List < TargetList> targetList; 
            private String threshold; 
            private String times; 
            private String webhook; 

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
             * Valid values of N: 1 to 3.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * The time period during which the alert rule is effective.
             * <p>
             * 
             * Valid values of N: 1 to 3.
             */
            public Builder effectiveInterval(String effectiveInterval) {
                this.effectiveInterval = effectiveInterval;
                return this;
            }

            /**
             * The alert level. Valid values:
             * <p>
             * 
             * *   critical (default): critical
             * *   warn: warning
             * *   info: information
             * 
             * Valid values of N: 1 to 3.
             */
            public Builder escalationsLevel(String escalationsLevel) {
                this.escalationsLevel = escalationsLevel;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder noEffectiveInterval(String noEffectiveInterval) {
                this.noEffectiveInterval = noEffectiveInterval;
                return this;
            }

            /**
             * The mute period during which new alert notifications are not sent even if the trigger conditions are met. Unit: seconds. Minimum value: 3600, which is equivalent to one hour. Default value: 86400, which is equivalent to one day.
             * <p>
             * 
             * Valid values of N: 1 to 3.
             * 
             * >  Only one alert notification is sent during each mute period even if the metric value exceeds the alert threshold several times.
             */
            public Builder silenceTime(String silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * The statistical method for alerts.
             * <p>
             * 
             * Valid values of N: 1 to 3.
             * 
             * >  Set the value to Average.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The alert triggers.
             */
            public Builder targetList(java.util.List < TargetList> targetList) {
                this.targetList = targetList;
                return this;
            }

            /**
             * The alert threshold.
             * <p>
             * 
             * Valid values of N: 1 to 3.
             * 
             * Unit: cores.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * The number of times for which the threshold can be consecutively exceeded. Default value: 3.
             * <p>
             * 
             * Valid values of N: 1 to 3.
             * 
             * >  An alert is triggered only if the number of times for which the threshold can be consecutively exceeded is reached.
             */
            public Builder times(String times) {
                this.times = times;
                return this;
            }

            /**
             * The callback URL.
             * <p>
             * 
             * Valid values of N: 1 to 3.
             */
            public Builder webhook(String webhook) {
                this.webhook = webhook;
                return this;
            }

            public AlertConfig build() {
                return new AlertConfig(this);
            } 

        } 

    }
    public static class MatchExpress extends TeaModel {
        @NameInMap("Function")
        private String function;

        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private MatchExpress(Builder builder) {
            this.function = builder.function;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchExpress create() {
            return builder().build();
        }

        /**
         * @return function
         */
        public String getFunction() {
            return this.function;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String function; 
            private String name; 
            private String value; 

            /**
             * The matching condition. Valid values:
             * <p>
             * 
             * *   all (default value): matches all
             * *   startWith: starts with a prefix
             * *   endWith: ends with a suffix
             * *   contains: contains
             * *   notContains: does not contain
             * *   equals: equals
             * 
             * Valid values of N: 1 to 3.
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * The criteria based on which the instances are matched.
             * <p>
             * 
             * Valid values of N: 1 to 3.
             * 
             * > Set the value to name. The value name indicates that the instances are matched based on the instance name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The keyword used to match the instance name.
             * <p>
             * 
             * Valid values of N: 1 to 3.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MatchExpress build() {
                return new MatchExpress(this);
            } 

        } 

    }
}
