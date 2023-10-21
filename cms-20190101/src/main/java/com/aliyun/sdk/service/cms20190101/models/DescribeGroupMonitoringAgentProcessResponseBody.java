// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupMonitoringAgentProcessResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupMonitoringAgentProcessResponseBody</p>
 */
public class DescribeGroupMonitoringAgentProcessResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private String pageNumber;

    @NameInMap("PageSize")
    private String pageSize;

    @NameInMap("Processes")
    private Processes processes;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
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
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The number of the returned page. Default value: 1.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned on each page. Default value: 10.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The process monitoring tasks created for the application group.
         */
        public Builder processes(Processes processes) {
            this.processes = processes;
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
         * Indicates whether the call was successful. The value true indicates a success. The value false indicates a failure.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of entries returned.
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
        @NameInMap("Arn")
        private String arn;

        @NameInMap("Id")
        private String id;

        @NameInMap("JsonParmas")
        private String jsonParmas;

        @NameInMap("Level")
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
             * Arn.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * JsonParmas.
             */
            public Builder jsonParmas(String jsonParmas) {
                this.jsonParmas = jsonParmas;
                return this;
            }

            /**
             * Level.
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
        @NameInMap("Target")
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
        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("EffectiveInterval")
        private String effectiveInterval;

        @NameInMap("EscalationsLevel")
        private String escalationsLevel;

        @NameInMap("NoEffectiveInterval")
        private String noEffectiveInterval;

        @NameInMap("SilenceTime")
        private String silenceTime;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("TargetList")
        private TargetList targetList;

        @NameInMap("Threshold")
        private String threshold;

        @NameInMap("Times")
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
             * *   info
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
             * The duration of the mute period during which new alerts are not sent even if the trigger conditions are met. Unit: seconds. Minimum value: 3600, which is equivalent to one hour. Default value: 86400, which is equivalent to one day.
             * <p>
             * 
             * >  Only one alert notification is sent during each mute period even if the metric value consecutively exceeds the alert threshold several times.
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
             * TargetList.
             */
            public Builder targetList(TargetList targetList) {
                this.targetList = targetList;
                return this;
            }

            /**
             * The threshold for triggering alerts.
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
        @NameInMap("AlertConfig")
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
             * The method used to match the instances. Default value: all. Valid values:
             * <p>
             * 
             * *   all
             * *   startWith
             * *   endWith
             * *   contains
             * *   notContains
             * *   equals
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
             * >  Set the value to `name`, indicating that the instances are matched based on instance name.
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
        @NameInMap("MatchExpress")
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
        @NameInMap("AlertConfig")
        private ProcessAlertConfig alertConfig;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("Id")
        private String id;

        @NameInMap("MatchExpress")
        private ProcessMatchExpress matchExpress;

        @NameInMap("MatchExpressFilterRelation")
        private String matchExpressFilterRelation;

        @NameInMap("ProcessName")
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
             * The configurations of the alert rule.
             */
            public Builder alertConfig(ProcessAlertConfig alertConfig) {
                this.alertConfig = alertConfig;
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
             * The ID of the process monitoring task.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The conditional expressions used to match the instances.
             * <p>
             * 
             * >  Only the instances that meet the conditional expressions are monitored by the process monitoring task.
             */
            public Builder matchExpress(ProcessMatchExpress matchExpress) {
                this.matchExpress = matchExpress;
                return this;
            }

            /**
             * MatchExpressFilterRelation.
             */
            public Builder matchExpressFilterRelation(String matchExpressFilterRelation) {
                this.matchExpressFilterRelation = matchExpressFilterRelation;
                return this;
            }

            /**
             * The name of the process monitoring task.
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
        @NameInMap("Process")
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
