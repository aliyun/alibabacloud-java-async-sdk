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
 * {@link CreateGroupMonitoringAgentProcessRequest} extends {@link RequestModel}
 *
 * <p>CreateGroupMonitoringAgentProcessRequest</p>
 */
public class CreateGroupMonitoringAgentProcessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<AlertConfig> alertConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchExpress")
    private java.util.List<MatchExpress> matchExpress;

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
    public java.util.List<AlertConfig> getAlertConfig() {
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
    public java.util.List<MatchExpress> getMatchExpress() {
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
        private java.util.List<AlertConfig> alertConfig; 
        private String groupId; 
        private java.util.List<MatchExpress> matchExpress; 
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
         * <p>The list of alert rule configurations.</p>
         * <p>Valid values of N: 1 to 3.</p>
         * <p>This parameter is required.</p>
         */
        public Builder alertConfig(java.util.List<AlertConfig> alertConfig) {
            this.putQueryParameter("AlertConfig", alertConfig);
            this.alertConfig = alertConfig;
            return this;
        }

        /**
         * <p>The application group ID.</p>
         * <p>For information about how to obtain the application group ID, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3607****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The list of match conditional expressions.</p>
         * <p>Valid values of N: 1 to 3.</p>
         */
        public Builder matchExpress(java.util.List<MatchExpress> matchExpress) {
            this.putQueryParameter("MatchExpress", matchExpress);
            this.matchExpress = matchExpress;
            return this;
        }

        /**
         * <p>The logical relation for matching instances. Valid values:</p>
         * <ul>
         * <li>all: all.</li>
         * <li>and: AND.</li>
         * <li>or: OR.</li>
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
         * <p>Process_Java</p>
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

            private Builder() {
            } 

            private Builder(TargetList model) {
                this.arn = model.arn;
                this.id = model.id;
                this.jsonParams = model.jsonParams;
                this.level = model.level;
            } 

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the resource.</p>
             * <p>For information about how to obtain the ARN of a resource, see <a href="https://help.aliyun.com/document_detail/121592.html">DescribeMetricRuleTargets</a>.</p>
             * <p>The ARN is in the following format: <code>acs:{service abbreviation}:{regionId}:{userId}:/{resource type}/{resource name}/message</code>. Example: <code>acs:mns:cn-hangzhou:120886317861****:/queues/test123/message</code>. The parameters are described as follows:</p>
             * <ul>
             * <li><p>{service abbreviation}: the abbreviation of the cloud service. Only Simple Message Queue (formerly MNS) is supported.</p>
             * </li>
             * <li><p>{userId}: the Alibaba Cloud account ID.</p>
             * </li>
             * <li><p>{regionId}: the region where the Simple Message Queue (formerly MNS) queue or topic resides.</p>
             * </li>
             * <li><p>{resource type}: the type of the resource that receives alert notifications. Valid values:</p>
             * <ul>
             * <li><strong>queues</strong>: queue.</li>
             * <li><strong>topics</strong>: topic.</li>
             * </ul>
             * </li>
             * <li><p>{resource name}: the name of the resource.</p>
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
             * <p>The ID of the alert target.</p>
             * <p>For information about how to obtain the ID of an alert target, see <a href="https://help.aliyun.com/document_detail/121592.html">DescribeMetricRuleTargets</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The JSON-formatted parameters for the alert callback.</p>
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
             * <li>INFO: informational.</li>
             * <li>WARN: warning.</li>
             * <li>CRITICAL: critical.</li>
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
        private java.util.List<TargetList> targetList;

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
        public java.util.List<TargetList> getTargetList() {
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
            private java.util.List<TargetList> targetList; 
            private String threshold; 
            private String times; 
            private String webhook; 

            private Builder() {
            } 

            private Builder(AlertConfig model) {
                this.comparisonOperator = model.comparisonOperator;
                this.effectiveInterval = model.effectiveInterval;
                this.escalationsLevel = model.escalationsLevel;
                this.noEffectiveInterval = model.noEffectiveInterval;
                this.silenceTime = model.silenceTime;
                this.statistics = model.statistics;
                this.targetList = model.targetList;
                this.threshold = model.threshold;
                this.times = model.times;
                this.webhook = model.webhook;
            } 

            /**
             * <p>The comparison operator for the threshold. Valid values:</p>
             * <ul>
             * <li>GreaterThanOrEqualToThreshold: greater than or equal to.</li>
             * <li>GreaterThanThreshold: greater than.</li>
             * <li>LessThanOrEqualToThreshold: less than or equal to.</li>
             * <li>LessThanThreshold: less than.</li>
             * <li>NotEqualToThreshold: not equal to.</li>
             * <li>GreaterThanYesterday: greater than the value at the same time yesterday.</li>
             * <li>LessThanYesterday: less than the value at the same time yesterday.</li>
             * <li>GreaterThanLastWeek: greater than the value at the same time last week.</li>
             * <li>LessThanLastWeek: less than the value at the same time last week.</li>
             * <li>GreaterThanLastPeriod: greater than the value in the previous period.</li>
             * <li>LessThanLastPeriod: less than the value in the previous period.</li>
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
             * <p>The effective period of the alert rule.</p>
             * <p>Valid values of N: 1 to 3.</p>
             * 
             * <strong>example:</strong>
             * <p>07:00-22:59</p>
             */
            public Builder effectiveInterval(String effectiveInterval) {
                this.effectiveInterval = effectiveInterval;
                return this;
            }

            /**
             * <p>The alert level. Valid values:</p>
             * <ul>
             * <li>critical: critical. This is the default value.</li>
             * <li>warn: warning.</li>
             * <li>info: informational.</li>
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
             * <p><strong>[Deprecated]</strong> This parameter is deprecated and no longer requires attention.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00-05:30</p>
             */
            public Builder noEffectiveInterval(String noEffectiveInterval) {
                this.noEffectiveInterval = noEffectiveInterval;
                return this;
            }

            /**
             * <p>The mute period. Unit: seconds. Minimum value: 3600, which indicates 1 hour. Default value: 86400, which indicates 1 day.</p>
             * <p>Valid values of N: 1 to 3.</p>
             * <blockquote>
             * <p>If the monitoring data continuously exceeds the alert rule threshold, the system sends only one alert notification within each mute period.</p>
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
             * <p>The statistical method for alerts.</p>
             * <p>Valid values of N: 1 to 3.</p>
             * <blockquote>
             * <p>Only Average is supported.</p>
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
             * <p>The list of alert targets.</p>
             */
            public Builder targetList(java.util.List<TargetList> targetList) {
                this.targetList = targetList;
                return this;
            }

            /**
             * <p>The alert threshold.</p>
             * <p>Valid values of N: 1 to 3.</p>
             * <p>Unit: count.</p>
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
             * <p>The number of consecutive times the alert level is triggered. Default value: 3.</p>
             * <p>Valid values of N: 1 to 3.</p>
             * <blockquote>
             * <p>An alert is triggered only when the alert level is reached for the specified number of consecutive times and the alert threshold is met.</p>
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
             * <p>The webhook URL for alert callbacks.</p>
             * <p>Valid values of N: 1 to 3.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
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

            private Builder() {
            } 

            private Builder(MatchExpress model) {
                this.function = model.function;
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The match condition. Valid values:</p>
             * <ul>
             * <li>all: matches all. This is the default value.</li>
             * <li>startWith: matches the prefix.</li>
             * <li>endWith: matches the suffix.</li>
             * <li>contains: contains the specified string.</li>
             * <li>notContains: does not contain the specified string.</li>
             * <li>equals: exactly matches.</li>
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
             * <p>The type of the match condition.</p>
             * <p>Valid values of N: 1 to 3.</p>
             * <blockquote>
             * <p>Only Name, which indicates the instance name, is supported.</p>
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
             * <p>The name of the matched instance.</p>
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
