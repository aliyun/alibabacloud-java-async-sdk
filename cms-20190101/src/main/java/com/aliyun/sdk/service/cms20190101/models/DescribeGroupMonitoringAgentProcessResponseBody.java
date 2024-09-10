// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupMonitoringAgentProcessResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupMonitoringAgentProcessResponseBody</p>
 */
public class DescribeGroupMonitoringAgentProcessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("Processes")
    private Processes processes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private String total;

    private DescribeGroupMonitoringAgentProcessResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.processes = builder.processes;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupMonitoringAgentProcessResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return processes
     */
    public Processes getProcesses() {
        return this.processes;
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
        private String code; 
        private String message; 
        private String pageNumber; 
        private String pageSize; 
        private Processes processes; 
        private String requestId; 
        private Boolean success; 
        private String total; 

        /**
         * The HTTP status codes.
         * <p>
         * 
         * >  The status code 200 indicates that the request was successful.
         */
        public Builder code(String code) {
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
         * The page number. Default value: 1
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: 10.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The process monitoring tasks.
         */
        public Builder processes(Processes processes) {
            this.processes = processes;
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
         * Indicates whether the request was successful. Valid values: Valid values: true and false.
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

        public DescribeGroupMonitoringAgentProcessResponseBody build() {
            return new DescribeGroupMonitoringAgentProcessResponseBody(this);
        } 

    } 

    public static class Target extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("JsonParmas")
        private String jsonParmas;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        private Target(Builder builder) {
            this.arn = builder.arn;
            this.id = builder.id;
            this.jsonParmas = builder.jsonParmas;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Target create() {
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
         * @return jsonParmas
         */
        public String getJsonParmas() {
            return this.jsonParmas;
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
            private String jsonParmas; 
            private String level; 

            /**
             * The Alibaba Cloud Resource Name (ARN) of the resource. Format: acs:{Service name abbreviation}:{regionId}:{userId}:/{Resource type}/{Resource name}/message. Example: acs:mns:cn-hangzhou:120886317861\*\*\*\*:/queues/test123/message. Fields:
             * <p>
             * 
             * {Service name abbreviation}: the abbreviation of the service name. Valid value: mns. {userId}: the ID of the Alibaba Cloud account. {regionId}: the region ID of the message queue or topic. {Resource type}: the type of the resource that triggers the alert. Valid values: - **queues** - **topics** - {Resource name}: the resource name. - If the resource type is set to **queues**, the resource name is the name of the message queue. - If the resource type is set to **topics**, the resource name is the name of the topic.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * The ID of the resource for which alerts are triggered.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The parameters of the alert callback. The parameters are in the JSON format.
             */
            public Builder jsonParmas(String jsonParmas) {
                this.jsonParmas = jsonParmas;
                return this;
            }

            /**
             * The level of the alert. Valid values:
             * <p>
             * 
             * INFO WARN CRITICAL
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public Target build() {
                return new Target(this);
            } 

        } 

    }
    public static class TargetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Target")
        private java.util.List < Target> target;

        private TargetList(Builder builder) {
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetList create() {
            return builder().build();
        }

        /**
         * @return target
         */
        public java.util.List < Target> getTarget() {
            return this.target;
        }

        public static final class Builder {
            private java.util.List < Target> target; 

            /**
             * Target.
             */
            public Builder target(java.util.List < Target> target) {
                this.target = target;
                return this;
            }

            public TargetList build() {
                return new TargetList(this);
            } 

        } 

    }
    public static class AlertConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("EffectiveInterval")
        private String effectiveInterval;

        @com.aliyun.core.annotation.NameInMap("EscalationsLevel")
        private String escalationsLevel;

        @com.aliyun.core.annotation.NameInMap("NoEffectiveInterval")
        private String noEffectiveInterval;

        @com.aliyun.core.annotation.NameInMap("SilenceTime")
        private String silenceTime;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("TargetList")
        private TargetList targetList;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Times")
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
        public TargetList getTargetList() {
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
            private TargetList targetList; 
            private String threshold; 
            private String times; 
            private String webhook; 

            /**
             * The comparison operator that is used to compare the metric value with the threshold. Valid values:
             * <p>
             * 
             * *   GreaterThanOrEqualToThreshold: greater than or equal to the threshold
             * *   GreaterThanThreshold: greater than the threshold
             * *   LessThanOrEqualToThreshold: less than or equal to the threshold
             * *   LessThanThreshold: less than the threshold
             * *   NotEqualToThreshold: not equal to the threshold
             * *   GreaterThanYesterday: greater than the metric value at the same time yesterday.
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
             * The time period during which the alert rule is effective.
             */
            public Builder effectiveInterval(String effectiveInterval) {
                this.effectiveInterval = effectiveInterval;
                return this;
            }

            /**
             * The level of the alert. Valid values:
             * <p>
             * 
             * *   critical
             * *   warn
             * *   Info
             */
            public Builder escalationsLevel(String escalationsLevel) {
                this.escalationsLevel = escalationsLevel;
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
             * The mute period during which new alert notifications are not sent even if the trigger conditions are met. Unit: seconds. Minimum value: 3600, which is equivalent to one hour. Default value: 86400, which is equivalent to one day.
             * <p>
             * 
             * >  Only one alert notification is sent during each mute period even if the metric value exceeds the alert threshold several times.
             */
            public Builder silenceTime(String silenceTime) {
                this.silenceTime = silenceTime;
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
             * The resource for which alerts are triggered.
             */
            public Builder targetList(TargetList targetList) {
                this.targetList = targetList;
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
             * The number of times for which the threshold can be consecutively exceeded.
             * <p>
             * 
             * >  A metric triggers an alert only after the metric value reaches the threshold consecutively for the specified times.
             */
            public Builder times(String times) {
                this.times = times;
                return this;
            }

            /**
             * The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.
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
    public static class ProcessAlertConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertConfig")
        private java.util.List < AlertConfig> alertConfig;

        private ProcessAlertConfig(Builder builder) {
            this.alertConfig = builder.alertConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessAlertConfig create() {
            return builder().build();
        }

        /**
         * @return alertConfig
         */
        public java.util.List < AlertConfig> getAlertConfig() {
            return this.alertConfig;
        }

        public static final class Builder {
            private java.util.List < AlertConfig> alertConfig; 

            /**
             * AlertConfig.
             */
            public Builder alertConfig(java.util.List < AlertConfig> alertConfig) {
                this.alertConfig = alertConfig;
                return this;
            }

            public ProcessAlertConfig build() {
                return new ProcessAlertConfig(this);
            } 

        } 

    }
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
             * The matching condition. Valid values:
             * <p>
             * 
             * *   all (default): matches all
             * *   startWith: starts with a prefix
             * *   endWith: ends with a suffix
             * *   contains: contains
             * *   notContains: excludes
             * *   equals: equals
             * 
             * >  The matched instances are monitored by the process monitoring task.
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * The criteria based on which the instances are matched.
             * <p>
             * 
             * >  Set the value to `name`. The value name indicates that the instances are matched based on the instance name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The keyword used to match the instance name.
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
    public static class ProcessMatchExpress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MatchExpress")
        private java.util.List < MatchExpress> matchExpress;

        private ProcessMatchExpress(Builder builder) {
            this.matchExpress = builder.matchExpress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessMatchExpress create() {
            return builder().build();
        }

        /**
         * @return matchExpress
         */
        public java.util.List < MatchExpress> getMatchExpress() {
            return this.matchExpress;
        }

        public static final class Builder {
            private java.util.List < MatchExpress> matchExpress; 

            /**
             * MatchExpress.
             */
            public Builder matchExpress(java.util.List < MatchExpress> matchExpress) {
                this.matchExpress = matchExpress;
                return this;
            }

            public ProcessMatchExpress build() {
                return new ProcessMatchExpress(this);
            } 

        } 

    }
    public static class Process extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertConfig")
        private ProcessAlertConfig alertConfig;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MatchExpress")
        private ProcessMatchExpress matchExpress;

        @com.aliyun.core.annotation.NameInMap("MatchExpressFilterRelation")
        private String matchExpressFilterRelation;

        @com.aliyun.core.annotation.NameInMap("ProcessName")
        private String processName;

        private Process(Builder builder) {
            this.alertConfig = builder.alertConfig;
            this.groupId = builder.groupId;
            this.id = builder.id;
            this.matchExpress = builder.matchExpress;
            this.matchExpressFilterRelation = builder.matchExpressFilterRelation;
            this.processName = builder.processName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Process create() {
            return builder().build();
        }

        /**
         * @return alertConfig
         */
        public ProcessAlertConfig getAlertConfig() {
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
         * @return matchExpress
         */
        public ProcessMatchExpress getMatchExpress() {
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

        public static final class Builder {
            private ProcessAlertConfig alertConfig; 
            private String groupId; 
            private String id; 
            private ProcessMatchExpress matchExpress; 
            private String matchExpressFilterRelation; 
            private String processName; 

            /**
             * The alert rule configurations.
             */
            public Builder alertConfig(ProcessAlertConfig alertConfig) {
                this.alertConfig = alertConfig;
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
             * The ID of the process monitoring task.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The matching conditions.
             * <p>
             * 
             * >  Only the instances that meet the conditional expressions are monitored by the process monitoring task.
             */
            public Builder matchExpress(ProcessMatchExpress matchExpress) {
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
                this.matchExpressFilterRelation = matchExpressFilterRelation;
                return this;
            }

            /**
             * The process name.
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            public Process build() {
                return new Process(this);
            } 

        } 

    }
    public static class Processes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Process")
        private java.util.List < Process> process;

        private Processes(Builder builder) {
            this.process = builder.process;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Processes create() {
            return builder().build();
        }

        /**
         * @return process
         */
        public java.util.List < Process> getProcess() {
            return this.process;
        }

        public static final class Builder {
            private java.util.List < Process> process; 

            /**
             * Process.
             */
            public Builder process(java.util.List < Process> process) {
                this.process = process;
                return this;
            }

            public Processes build() {
                return new Processes(this);
            } 

        } 

    }
}
