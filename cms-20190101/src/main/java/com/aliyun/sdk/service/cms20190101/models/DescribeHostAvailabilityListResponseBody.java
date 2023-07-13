// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHostAvailabilityListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHostAvailabilityListResponseBody</p>
 */
public class DescribeHostAvailabilityListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TaskList")
    private TaskList taskList;

    @NameInMap("Total")
    private Integer total;

    private DescribeHostAvailabilityListResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskList = builder.taskList;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHostAvailabilityListResponseBody create() {
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
     * @return taskList
     */
    public TaskList getTaskList() {
        return this.taskList;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private TaskList taskList; 
        private Integer total; 

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The details of the availability monitoring tasks.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The type of the availability monitoring task. Valid values:
         * <p>
         * 
         * *   PING
         * *   TELNET
         * *   HTTP
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The ID of the application group.
         */
        public Builder taskList(TaskList taskList) {
            this.taskList = taskList;
            return this;
        }

        /**
         * The name of the application group.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeHostAvailabilityListResponseBody build() {
            return new DescribeHostAvailabilityListResponseBody(this);
        } 

    } 

    public static class EscalationList extends TeaModel {
        @NameInMap("Aggregate")
        private String aggregate;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("Times")
        private String times;

        @NameInMap("Value")
        private String value;

        private EscalationList(Builder builder) {
            this.aggregate = builder.aggregate;
            this.metricName = builder.metricName;
            this.operator = builder.operator;
            this.times = builder.times;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EscalationList create() {
            return builder().build();
        }

        /**
         * @return aggregate
         */
        public String getAggregate() {
            return this.aggregate;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return times
         */
        public String getTimes() {
            return this.times;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String aggregate; 
            private String metricName; 
            private String operator; 
            private String times; 
            private String value; 

            /**
             * For more information about common request parameters, see [Common parameters](~~199331~~).
             */
            public Builder aggregate(String aggregate) {
                this.aggregate = aggregate;
                return this;
            }

            /**
             * The method used to calculate metric values that trigger alerts. Valid values:
             * <p>
             * 
             * *   Value: the value of the HTTP status code
             * *   Average: the average HTTP response time
             * *   Value: the value of the Telnet status code
             * *   TelnetLatency: the average Telnet response time
             * *   Average: the average Ping packet loss rate
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * This topic provides an example to show how to query all the availability monitoring tasks of your Alibaba Cloud account. The sample responses indicate that the account has one availability monitoring task named `ecs_instance`.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Queries availability monitoring tasks.
             */
            public Builder times(String times) {
                this.times = times;
                return this;
            }

            /**
             * The consecutive number of times for which the metric value is measured before an alert is triggered.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public EscalationList build() {
                return new EscalationList(this);
            } 

        } 

    }
    public static class AlertConfigEscalationList extends TeaModel {
        @NameInMap("escalationList")
        private java.util.List < EscalationList> escalationList;

        private AlertConfigEscalationList(Builder builder) {
            this.escalationList = builder.escalationList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertConfigEscalationList create() {
            return builder().build();
        }

        /**
         * @return escalationList
         */
        public java.util.List < EscalationList> getEscalationList() {
            return this.escalationList;
        }

        public static final class Builder {
            private java.util.List < EscalationList> escalationList; 

            /**
             * escalationList.
             */
            public Builder escalationList(java.util.List < EscalationList> escalationList) {
                this.escalationList = escalationList;
                return this;
            }

            public AlertConfigEscalationList build() {
                return new AlertConfigEscalationList(this);
            } 

        } 

    }
    public static class Target extends TeaModel {
        @NameInMap("Arn")
        private String arn;

        @NameInMap("Id")
        private String id;

        @NameInMap("JsonParams")
        private String jsonParams;

        @NameInMap("Level")
        private String level;

        private Target(Builder builder) {
            this.arn = builder.arn;
            this.id = builder.id;
            this.jsonParams = builder.jsonParams;
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
             * JsonParams.
             */
            public Builder jsonParams(String jsonParams) {
                this.jsonParams = jsonParams;
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
        @NameInMap("EndTime")
        private Integer endTime;

        @NameInMap("EscalationList")
        private AlertConfigEscalationList escalationList;

        @NameInMap("NotifyType")
        private Integer notifyType;

        @NameInMap("SilenceTime")
        private Integer silenceTime;

        @NameInMap("StartTime")
        private Integer startTime;

        @NameInMap("TargetList")
        private TargetList targetList;

        @NameInMap("WebHook")
        private String webHook;

        private AlertConfig(Builder builder) {
            this.endTime = builder.endTime;
            this.escalationList = builder.escalationList;
            this.notifyType = builder.notifyType;
            this.silenceTime = builder.silenceTime;
            this.startTime = builder.startTime;
            this.targetList = builder.targetList;
            this.webHook = builder.webHook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertConfig create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Integer getEndTime() {
            return this.endTime;
        }

        /**
         * @return escalationList
         */
        public AlertConfigEscalationList getEscalationList() {
            return this.escalationList;
        }

        /**
         * @return notifyType
         */
        public Integer getNotifyType() {
            return this.notifyType;
        }

        /**
         * @return silenceTime
         */
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        /**
         * @return startTime
         */
        public Integer getStartTime() {
            return this.startTime;
        }

        /**
         * @return targetList
         */
        public TargetList getTargetList() {
            return this.targetList;
        }

        /**
         * @return webHook
         */
        public String getWebHook() {
            return this.webHook;
        }

        public static final class Builder {
            private Integer endTime; 
            private AlertConfigEscalationList escalationList; 
            private Integer notifyType; 
            private Integer silenceTime; 
            private Integer startTime; 
            private TargetList targetList; 
            private String webHook; 

            /**
             * The alert notification methods. Valid values:
             * <p>
             * 
             * 0: Alert notifications are sent by using emails and DingTalk chatbots.
             */
            public Builder endTime(Integer endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The comparison operator that is used in the alert rule. Valid values:
             * <p>
             * 
             * *   `>`
             * *   `>=`
             * *   `<`
             * *   `<=`
             * *   `=`
             */
            public Builder escalationList(AlertConfigEscalationList escalationList) {
                this.escalationList = escalationList;
                return this;
            }

            /**
             * The name of the metric. Valid values:
             * <p>
             * 
             * *   HttpStatus: HTTP status code
             * *   HttpLatency: HTTP response time
             * *   TelnetStatus: Telnet status code
             * *   TelnetLatency: Telnet response time
             * *   PingLostRate: Ping packet loss rate
             */
            public Builder notifyType(Integer notifyType) {
                this.notifyType = notifyType;
                return this;
            }

            /**
             * The callback URL.
             * <p>
             * 
             * CloudMonitor pushes an alert notification to the specified callback URL by sending an HTTP POST request. Only the HTTP protocol is supported.
             */
            public Builder silenceTime(Integer silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * The trigger conditions of the alert rule.
             */
            public Builder startTime(Integer startTime) {
                this.startTime = startTime;
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
             * The alert threshold.
             */
            public Builder webHook(String webHook) {
                this.webHook = webHook;
                return this;
            }

            public AlertConfig build() {
                return new AlertConfig(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @NameInMap("Instance")
        private java.util.List < String > instance;

        private Instances(Builder builder) {
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public java.util.List < String > getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List < String > instance; 

            /**
             * Instance.
             */
            public Builder instance(java.util.List < String > instance) {
                this.instance = instance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    public static class TaskOption extends TeaModel {
        @NameInMap("HttpKeyword")
        private String httpKeyword;

        @NameInMap("HttpMethod")
        private String httpMethod;

        @NameInMap("HttpNegative")
        private Boolean httpNegative;

        @NameInMap("HttpPostContent")
        private String httpPostContent;

        @NameInMap("HttpResponseCharset")
        private String httpResponseCharset;

        @NameInMap("HttpURI")
        private String httpURI;

        @NameInMap("Interval")
        private Integer interval;

        @NameInMap("TelnetOrPingHost")
        private String telnetOrPingHost;

        private TaskOption(Builder builder) {
            this.httpKeyword = builder.httpKeyword;
            this.httpMethod = builder.httpMethod;
            this.httpNegative = builder.httpNegative;
            this.httpPostContent = builder.httpPostContent;
            this.httpResponseCharset = builder.httpResponseCharset;
            this.httpURI = builder.httpURI;
            this.interval = builder.interval;
            this.telnetOrPingHost = builder.telnetOrPingHost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskOption create() {
            return builder().build();
        }

        /**
         * @return httpKeyword
         */
        public String getHttpKeyword() {
            return this.httpKeyword;
        }

        /**
         * @return httpMethod
         */
        public String getHttpMethod() {
            return this.httpMethod;
        }

        /**
         * @return httpNegative
         */
        public Boolean getHttpNegative() {
            return this.httpNegative;
        }

        /**
         * @return httpPostContent
         */
        public String getHttpPostContent() {
            return this.httpPostContent;
        }

        /**
         * @return httpResponseCharset
         */
        public String getHttpResponseCharset() {
            return this.httpResponseCharset;
        }

        /**
         * @return httpURI
         */
        public String getHttpURI() {
            return this.httpURI;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return telnetOrPingHost
         */
        public String getTelnetOrPingHost() {
            return this.telnetOrPingHost;
        }

        public static final class Builder {
            private String httpKeyword; 
            private String httpMethod; 
            private Boolean httpNegative; 
            private String httpPostContent; 
            private String httpResponseCharset; 
            private String httpURI; 
            private Integer interval; 
            private String telnetOrPingHost; 

            /**
             * The mute period during which new alerts are not sent even if the trigger conditions are met. Unit: seconds. Default value: 86400.
             */
            public Builder httpKeyword(String httpKeyword) {
                this.httpKeyword = httpKeyword;
                return this;
            }

            /**
             * The domain name or IP address that you want to monitor.
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * The end of the time period during which the alert rule is effective. Valid values: 0 to 23.
             * <p>
             * 
             * For example, if the `AlertConfig.StartTime` parameter is set to 0 and the `AlertConfig.EndTime` parameter is set to 22, the alert rule is effective from 00:00:00 to 22:00:00.
             * 
             * >  Alert notifications are sent based on the specified threshold only if the alert rule is effective.
             */
            public Builder httpNegative(Boolean httpNegative) {
                this.httpNegative = httpNegative;
                return this;
            }

            /**
             * The configurations of the alert rule.
             */
            public Builder httpPostContent(String httpPostContent) {
                this.httpPostContent = httpPostContent;
                return this;
            }

            /**
             * The response to the HTTP request.
             */
            public Builder httpResponseCharset(String httpResponseCharset) {
                this.httpResponseCharset = httpResponseCharset;
                return this;
            }

            /**
             * The content of the HTTP POST request.
             */
            public Builder httpURI(String httpURI) {
                this.httpURI = httpURI;
                return this;
            }

            /**
             * The character set that is used in the HTTP response.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * The method to trigger an alert. The alert can be triggered based on whether the specified alert rule is included in the response body. Valid values:
             * <p>
             * 
             * *   true: If the HTTP response body includes the alert rule, an alert is triggered.
             * *   false: If the HTTP response does not include the alert rule, an alert is triggered.
             */
            public Builder telnetOrPingHost(String telnetOrPingHost) {
                this.telnetOrPingHost = telnetOrPingHost;
                return this;
            }

            public TaskOption build() {
                return new TaskOption(this);
            } 

        } 

    }
    public static class NodeTaskConfig extends TeaModel {
        @NameInMap("AlertConfig")
        private AlertConfig alertConfig;

        @NameInMap("Disabled")
        private Boolean disabled;

        @NameInMap("GroupId")
        private Long groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Instances")
        private Instances instances;

        @NameInMap("TaskName")
        private String taskName;

        @NameInMap("TaskOption")
        private TaskOption taskOption;

        @NameInMap("TaskScope")
        private String taskScope;

        @NameInMap("TaskType")
        private String taskType;

        private NodeTaskConfig(Builder builder) {
            this.alertConfig = builder.alertConfig;
            this.disabled = builder.disabled;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.id = builder.id;
            this.instances = builder.instances;
            this.taskName = builder.taskName;
            this.taskOption = builder.taskOption;
            this.taskScope = builder.taskScope;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeTaskConfig create() {
            return builder().build();
        }

        /**
         * @return alertConfig
         */
        public AlertConfig getAlertConfig() {
            return this.alertConfig;
        }

        /**
         * @return disabled
         */
        public Boolean getDisabled() {
            return this.disabled;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instances
         */
        public Instances getInstances() {
            return this.instances;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskOption
         */
        public TaskOption getTaskOption() {
            return this.taskOption;
        }

        /**
         * @return taskScope
         */
        public String getTaskScope() {
            return this.taskScope;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private AlertConfig alertConfig; 
            private Boolean disabled; 
            private Long groupId; 
            private String groupName; 
            private Long id; 
            private Instances instances; 
            private String taskName; 
            private TaskOption taskOption; 
            private String taskScope; 
            private String taskType; 

            /**
             * The beginning of the time period during which the alert rule is effective. Valid values: 0 to 23.
             * <p>
             * 
             * For example, if the `AlertConfig.StartTime` parameter is set to 0 and the `AlertConfig.EndTime` parameter is set to 22, the alert rule is effective from 00:00:00 to 22:00:00.
             * 
             * >  Alert notifications are sent based on the specified threshold only if the alert rule is effective.
             */
            public Builder alertConfig(AlertConfig alertConfig) {
                this.alertConfig = alertConfig;
                return this;
            }

            /**
             * The ECS instances that are monitored.
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * The range of instances that are monitored by the availability monitoring task. Valid values:
             * <p>
             * 
             * *   GROUP: All ECS instances in the application group are monitored.
             * *   GROUP_SPEC_INSTANCE: Specified ECS instances in the application group are monitored.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Indicates whether the availability monitoring task is disabled. Valid values:
             * <p>
             * 
             * *   true: The availability monitoring task is disabled.
             * *   false: The availability monitoring task is enabled.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The HTTP request method. Valid values:
             * <p>
             * 
             * *   GET
             * *   POST
             * *   HEAD
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The interval at which detection requests are sent. Unit: seconds.
             */
            public Builder instances(Instances instances) {
                this.instances = instances;
                return this;
            }

            /**
             * The ID of the availability monitoring task.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * The URI that you want to monitor. If the TaskType parameter is set to HTTP, this parameter is required.
             */
            public Builder taskOption(TaskOption taskOption) {
                this.taskOption = taskOption;
                return this;
            }

            /**
             * The optional parameters of the availability monitoring task.
             */
            public Builder taskScope(String taskScope) {
                this.taskScope = taskScope;
                return this;
            }

            /**
             * The name of the availability monitoring task.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public NodeTaskConfig build() {
                return new NodeTaskConfig(this);
            } 

        } 

    }
    public static class TaskList extends TeaModel {
        @NameInMap("NodeTaskConfig")
        private java.util.List < NodeTaskConfig> nodeTaskConfig;

        private TaskList(Builder builder) {
            this.nodeTaskConfig = builder.nodeTaskConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskList create() {
            return builder().build();
        }

        /**
         * @return nodeTaskConfig
         */
        public java.util.List < NodeTaskConfig> getNodeTaskConfig() {
            return this.nodeTaskConfig;
        }

        public static final class Builder {
            private java.util.List < NodeTaskConfig> nodeTaskConfig; 

            /**
             * NodeTaskConfig.
             */
            public Builder nodeTaskConfig(java.util.List < NodeTaskConfig> nodeTaskConfig) {
                this.nodeTaskConfig = nodeTaskConfig;
                return this;
            }

            public TaskList build() {
                return new TaskList(this);
            } 

        } 

    }
}
