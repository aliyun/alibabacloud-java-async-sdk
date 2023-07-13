// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyGroupMonitoringAgentProcessRequest} extends {@link RequestModel}
 *
 * <p>ModifyGroupMonitoringAgentProcessRequest</p>
 */
public class ModifyGroupMonitoringAgentProcessRequest extends Request {
    @Query
    @NameInMap("AlertConfig")
    @Validation(required = true)
    private java.util.List < AlertConfig> alertConfig;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("MatchExpressFilterRelation")
    private String matchExpressFilterRelation;

    private ModifyGroupMonitoringAgentProcessRequest(Builder builder) {
        super(builder);
        this.alertConfig = builder.alertConfig;
        this.groupId = builder.groupId;
        this.id = builder.id;
        this.matchExpressFilterRelation = builder.matchExpressFilterRelation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyGroupMonitoringAgentProcessRequest create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return matchExpressFilterRelation
     */
    public String getMatchExpressFilterRelation() {
        return this.matchExpressFilterRelation;
    }

    public static final class Builder extends Request.Builder<ModifyGroupMonitoringAgentProcessRequest, Builder> {
        private java.util.List < AlertConfig> alertConfig; 
        private String groupId; 
        private String id; 
        private String matchExpressFilterRelation; 

        private Builder() {
            super();
        } 

        private Builder(ModifyGroupMonitoringAgentProcessRequest request) {
            super(request);
            this.alertConfig = request.alertConfig;
            this.groupId = request.groupId;
            this.id = request.id;
            this.matchExpressFilterRelation = request.matchExpressFilterRelation;
        } 

        /**
         * AlertConfig.
         */
        public Builder alertConfig(java.util.List < AlertConfig> alertConfig) {
            this.putQueryParameter("AlertConfig", alertConfig);
            this.alertConfig = alertConfig;
            return this;
        }

        /**
         * The ID of the application group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The statistical aggregation method that is used to calculate the metric values. Valid values of N: 1 to 200.
         * <p>
         * 
         * >  Set the value to Average.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The comparison operator that is used to compare the metric value with the threshold. Valid values of N: 1 to 200. Valid values:
         * <p>
         * 
         * *   GreaterThanOrEqualToThreshold: greater than or equal to the threshold
         * *   GreaterThanThreshold: greater than the threshold
         * *   LessThanOrEqualToThreshold: less than or equal to the threshold
         * *   LessThanThreshold: less than the threshold.
         * *   NotEqualToThreshold: not equal to the threshold
         * *   GreaterThanYesterday: greater than the metric value at the same time yesterday.
         * *   LessThanYesterday: less than the metric value at the same time yesterday
         * *   GreaterThanLastWeek: greater than the metric value at the same time last week
         * *   LessThanLastWeek: less than the metric value at the same time last week
         * *   GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle
         * *   LessThanLastPeriod: less than the metric value in the last monitoring cycle
         */
        public Builder matchExpressFilterRelation(String matchExpressFilterRelation) {
            this.putQueryParameter("MatchExpressFilterRelation", matchExpressFilterRelation);
            this.matchExpressFilterRelation = matchExpressFilterRelation;
            return this;
        }

        @Override
        public ModifyGroupMonitoringAgentProcessRequest build() {
            return new ModifyGroupMonitoringAgentProcessRequest(this);
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
             * *   {userId}: the ID of the Alibaba Cloud account.
             * *   {regionId}: the region ID of the message queue or topic.
             * *   {Resource type}`: the type of the resource for which alerts are triggered. Valid values: - **queues** - **topics** {Resource name}: the name of the resource. - If the resource type is set to **queues**, the resource name is the name of the message queue. - If the resource type is set to **topics**, the resource name is the name of the topic.`
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * The time period during which the alert rule is ineffective. Valid values of N: 1 to 200.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The alert threshold. Valid values of N: 1 to 200.
             */
            public Builder jsonParams(String jsonParams) {
                this.jsonParams = jsonParams;
                return this;
            }

            /**
             * The callback URL to which a POST request is sent when an alert is triggered based on the alert rule. Valid values of N: 1 to 200.
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
             * The level of the alert. Valid values:
             * <p>
             * 
             * *   INFO: information
             * *   WARN: warning
             * *   CRITICAL: critical
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * The error message.
             */
            public Builder effectiveInterval(String effectiveInterval) {
                this.effectiveInterval = effectiveInterval;
                return this;
            }

            /**
             * The time period during which the alert rule is effective. Valid values of N: 1 to 200.
             */
            public Builder escalationsLevel(String escalationsLevel) {
                this.escalationsLevel = escalationsLevel;
                return this;
            }

            /**
             * The ID of the process monitoring task.
             */
            public Builder noEffectiveInterval(String noEffectiveInterval) {
                this.noEffectiveInterval = noEffectiveInterval;
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
            public Builder silenceTime(String silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * The level of the alert. Valid values of N: 1 to 200. Valid values:
             * <p>
             * 
             * *   critical (default value): critical
             * *   warn: warning
             * *   info: information
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * TargetList.
             */
            public Builder targetList(java.util.List < TargetList> targetList) {
                this.targetList = targetList;
                return this;
            }

            /**
             * The mute period during which new alerts are not sent even if the trigger conditions are met. Valid values of N: 1 to 200.
             * <p>
             * 
             * Unit: seconds. Minimum value: 3600, which is equivalent to one hour. Default value: 86400, which is equivalent to one day.
             * 
             * >  Only one alert notification is sent during a mute period even if the metric value exceeds the alert threshold during consecutive checks.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * The operation that you want to perform. Set the value to **ModifyGroupMonitoringAgentProcess**.
             */
            public Builder times(String times) {
                this.times = times;
                return this;
            }

            /**
             * The HTTP status code.
             * <p>
             * 
             * >  The status code 200 indicates that the call was successful.
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
}
