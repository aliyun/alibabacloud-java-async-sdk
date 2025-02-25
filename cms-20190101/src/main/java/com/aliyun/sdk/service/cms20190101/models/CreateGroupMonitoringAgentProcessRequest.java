// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateGroupMonitoringAgentProcessRequest} extends {@link RequestModel}
 *
 * <p>CreateGroupMonitoringAgentProcessRequest</p>
 */
public class CreateGroupMonitoringAgentProcessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < AlertConfig> alertConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchExpress")
    private java.util.List < MatchExpress> matchExpress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchExpressFilterRelation")
    private String matchExpressFilterRelation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The alert rule configurations.</p>
         * <p>Valid values of N: 1 to 3.</p>
         * <p>This parameter is required.</p>
         */
        public Builder alertConfig(java.util.List < AlertConfig> alertConfig) {
            this.putQueryParameter("AlertConfig", alertConfig);
            this.alertConfig = alertConfig;
            return this;
        }

        /**
         * <p>The ID of the application group.</p>
         * <p>For more information about how to obtain the ID of an application group, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The expressions used to match instances.</p>
         * <p>Valid values of N: 1 to 3.</p>
         */
        public Builder matchExpress(java.util.List < MatchExpress> matchExpress) {
            this.putQueryParameter("MatchExpress", matchExpress);
            this.matchExpress = matchExpress;
            return this;
        }

        /**
         * <p>The logical operator used between conditional expressions that are used to match instances. Valid values:</p>
         * <ul>
         * <li>all</li>
         * <li>and</li>
         * <li>or</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>and</p>
         */
        public Builder matchExpressFilterRelation(String matchExpressFilterRelation) {
            this.putQueryParameter("MatchExpressFilterRelation", matchExpressFilterRelation);
            this.matchExpressFilterRelation = matchExpressFilterRelation;
            return this;
        }

        /**
         * <p>The process name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
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

    /**
     * 
     * {@link CreateGroupMonitoringAgentProcessRequest} extends {@link TeaModel}
     *
     * <p>CreateGroupMonitoringAgentProcessRequest</p>
     */
    public static class TargetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("JsonParams")
        private String jsonParams;

        @com.aliyun.core.annotation.NameInMap("Level")
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
             * <p>The Alibaba Cloud Resource Name (ARN) of the resource.</p>
             * <p>For more information about how to query the ARN of a resource, see <a href="https://help.aliyun.com/document_detail/121592.html">DescribeMetricRuleTargets</a>.</p>
             * <p>Format: <code>acs:{Service name abbreviation}:{regionId}:{userId}:/{Resource type}/{Resource name}/message</code>. Example: <code>acs:mns:cn-hangzhou:120886317861****:/queues/test123/message</code>. Fields:</p>
             * <ul>
             * <li><p>{Service name abbreviation}: the abbreviation of the service name. Set the value to Simple Message Queue (formerly MNS) (SMQ).</p>
             * </li>
             * <li><p>{userId}: the ID of the Alibaba Cloud account.</p>
             * </li>
             * <li><p>{regionId}: the region ID of the SMQ queue or topic.</p>
             * </li>
             * <li><p>{Resource type}: the type of the resource that triggers the alert. Valid values:</p>
             * <ul>
             * <li><strong>queues</strong></li>
             * <li><strong>topics</strong></li>
             * </ul>
             * </li>
             * <li><p>{Resource name}: the resource name.</p>
             * <ul>
             * <li>If the resource type is <strong>queues</strong>, the resource name is the queue name.</li>
             * <li>If the resource type is <strong>topics</strong>, the resource name is the topic name.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>acs:mns:cn-hangzhou:120886317861****:/queues/test/message</p>
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>The ID of the resource for which alerts are triggered.</p>
             * <p>For more information about how to obtain the ID of a resource for which alerts are triggered, see <a href="https://help.aliyun.com/document_detail/121592.html">DescribeMetricRuleTargets</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The parameters of the alert callback. The parameters are in the JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;customField1&quot;:&quot;value1&quot;,&quot;customField2&quot;:&quot;$.name&quot;}</p>
             */
            public Builder jsonParams(String jsonParams) {
                this.jsonParams = jsonParams;
                return this;
            }

            /**
             * <p>The alert level. Valid values:</p>
             * <ul>
             * <li>INFO</li>
             * <li>WARN</li>
             * <li>CRITICAL</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[&quot;INFO&quot;, &quot;WARN&quot;, &quot;CRITICAL&quot;]</p>
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
    /**
     * 
     * {@link CreateGroupMonitoringAgentProcessRequest} extends {@link TeaModel}
     *
     * <p>CreateGroupMonitoringAgentProcessRequest</p>
     */
    public static class AlertConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        @com.aliyun.core.annotation.Validation(required = true)
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("EffectiveInterval")
        private String effectiveInterval;

        @com.aliyun.core.annotation.NameInMap("EscalationsLevel")
        @com.aliyun.core.annotation.Validation(required = true)
        private String escalationsLevel;

        @com.aliyun.core.annotation.NameInMap("NoEffectiveInterval")
        private String noEffectiveInterval;

        @com.aliyun.core.annotation.NameInMap("SilenceTime")
        private String silenceTime;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        @com.aliyun.core.annotation.Validation(required = true)
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("TargetList")
        private java.util.List < TargetList> targetList;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        @com.aliyun.core.annotation.Validation(required = true)
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Times")
        @com.aliyun.core.annotation.Validation(required = true)
        private String times;

        @com.aliyun.core.annotation.NameInMap("Webhook")
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
             * <li>LessThanLastPeriod: less than the metric value in the previous monitoring cycle</li>
             * </ul>
             * <p>Valid values of N: 1 to 3.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>GreaterThanOrEqualToThreshold</p>
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * <p>The period of time during which the alert rule is effective.</p>
             * <p>Valid values of N: 1 to 3.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00-23:59</p>
             */
            public Builder effectiveInterval(String effectiveInterval) {
                this.effectiveInterval = effectiveInterval;
                return this;
            }

            /**
             * <p>The alert level. Valid values:</p>
             * <ul>
             * <li>critical (default)</li>
             * <li>warn</li>
             * <li>info</li>
             * </ul>
             * <p>Valid values of N: 1 to 3.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>warn</p>
             */
            public Builder escalationsLevel(String escalationsLevel) {
                this.escalationsLevel = escalationsLevel;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00-23:59</p>
             */
            public Builder noEffectiveInterval(String noEffectiveInterval) {
                this.noEffectiveInterval = noEffectiveInterval;
                return this;
            }

            /**
             * <p>The mute period during which new alert notifications are not sent even if the trigger conditions are met. Unit: seconds. Minimum value: 3600, which is equivalent to one hour. Default value: 86400, which is equivalent to one day.</p>
             * <p>Valid values of N: 1 to 3.</p>
             * <blockquote>
             * <p> Only one alert notification is sent during a mute period even if the metric value exceeds the alert threshold during consecutive checks.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder silenceTime(String silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * <p>The statistical aggregation method that is used to calculate the metric values.</p>
             * <p>Valid values of N: 1 to 3.</p>
             * <blockquote>
             * <p> Set the value to Average.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Average</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The alert triggers.</p>
             */
            public Builder targetList(java.util.List < TargetList> targetList) {
                this.targetList = targetList;
                return this;
            }

            /**
             * <p>The alert threshold.</p>
             * <p>Valid values of N: 1 to 3.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>The number of times for which the threshold can be consecutively exceeded. Default value: 3.</p>
             * <p>Valid values of N: 1 to 3.</p>
             * <blockquote>
             * <p> A metric triggers an alert only after the metric value reaches the threshold consecutively for the specified times.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder times(String times) {
                this.times = times;
                return this;
            }

            /**
             * <p>The callback URL.</p>
             * <p>Valid values of N: 1 to 3.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
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
    /**
     * 
     * {@link CreateGroupMonitoringAgentProcessRequest} extends {@link TeaModel}
     *
     * <p>CreateGroupMonitoringAgentProcessRequest</p>
     */
    public static class MatchExpress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Function")
        private String function;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The matching condition. Valid values:</p>
             * <ul>
             * <li>all (default value): matches all</li>
             * <li>startWith: starts with a prefix</li>
             * <li>endWith: ends with a suffix</li>
             * <li>contains: contains</li>
             * <li>notContains: does not contain</li>
             * <li>equals: equals</li>
             * </ul>
             * <p>Valid values of N: 1 to 3.</p>
             * 
             * <strong>example:</strong>
             * <p>startWith</p>
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * <p>The criteria based on which the instances are matched.</p>
             * <p>Valid values of N: 1 to 3.</p>
             * <blockquote>
             * <p>Set the value to name. The value name indicates that the instances are matched based on the instance name.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>name1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The keyword used to match the instance name.</p>
             * <p>Valid values of N: 1 to 3.</p>
             * 
             * <strong>example:</strong>
             * <p>portalHost</p>
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
