// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHostAvailabilityListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHostAvailabilityListResponseBody</p>
 */
public class DescribeHostAvailabilityListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskList")
    private TaskList taskList;

    @com.aliyun.core.annotation.NameInMap("Total")
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
         * The HTTP status code.
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The details of the availability monitoring tasks.
         */
        public Builder taskList(TaskList taskList) {
            this.taskList = taskList;
            return this;
        }

        /**
         * The total number of returned entries.
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
        @com.aliyun.core.annotation.NameInMap("Aggregate")
        private String aggregate;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Times")
        private String times;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * The method used to calculate metric values that trigger alerts. Valid values:
             * <p>
             * 
             * *   Value: the value of the HTTP status code
             * *   Average: the average HTTP response time
             * *   Value: the value of the Telnet status code
             * *   TelnetLatency: the average Telnet response time
             * *   Average: the average Ping packet loss rate
             */
            public Builder aggregate(String aggregate) {
                this.aggregate = aggregate;
                return this;
            }

            /**
             * The name of the metric. Valid values:
             * <p>
             * 
             * *   HttpStatus
             * *   HttpLatency
             * *   TelnetStatus
             * *   TelnetLatency
             * *   PingLostRate
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
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
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The consecutive number of times for which the metric value is measured before an alert is triggered.
             */
            public Builder times(String times) {
                this.times = times;
                return this;
            }

            /**
             * The alert threshold.
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
        @com.aliyun.core.annotation.NameInMap("escalationList")
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
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("JsonParams")
        private String jsonParams;

        @com.aliyun.core.annotation.NameInMap("Level")
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
             * The Alibaba Cloud Resource Name (ARN) of the function.
             * <p>
             * 
             * Format: `arn:acs:${Service}:${Region}:${Account}:${ResourceType}/${ResourceId}`. Fields:
             * 
             * *   Service: the service code
             * *   Region: the region ID
             * *   Account: the ID of the Alibaba Cloud account
             * *   ResourceType: the resource type
             * *   ResourceId: the resource ID.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * The ID of the resource that triggers the alert.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The JSON-formatted parameters of the alert callback.
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
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Integer endTime;

        @com.aliyun.core.annotation.NameInMap("EscalationList")
        private AlertConfigEscalationList escalationList;

        @com.aliyun.core.annotation.NameInMap("NotifyType")
        private Integer notifyType;

        @com.aliyun.core.annotation.NameInMap("SilenceTime")
        private Integer silenceTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Integer startTime;

        @com.aliyun.core.annotation.NameInMap("TargetList")
        private TargetList targetList;

        @com.aliyun.core.annotation.NameInMap("WebHook")
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
             * The end of the time period during which the alert rule is effective. Valid values: 0 to 23.
             * <p>
             * 
             * For example, if the `AlertConfig.StartTime` parameter is set to 0 and the `AlertConfig.EndTime` parameter is set to 22, the alert rule is effective from 00:00:00 to 22:00:00.
             * 
             * >  Alert notifications are sent based on the specified threshold only if the alert rule is effective.
             */
            public Builder endTime(Integer endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The trigger conditions of the alert rule.
             */
            public Builder escalationList(AlertConfigEscalationList escalationList) {
                this.escalationList = escalationList;
                return this;
            }

            /**
             * The alert notification methods. Valid values:
             * <p>
             * 
             * *   2: Alert notifications are sent by using emails and DingTalk chatbots.
             * *   1: Alert notifications are sent by using emails and DingTalk chatbots.
             * *   0: Alert notifications are sent by using emails and DingTalk chatbots.
             */
            public Builder notifyType(Integer notifyType) {
                this.notifyType = notifyType;
                return this;
            }

            /**
             * The mute period during which new alerts are not sent even if the trigger conditions are met. Unit: seconds. Default value: 86400.
             */
            public Builder silenceTime(Integer silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * The beginning of the time period during which the alert rule is effective. Valid values: 0 to 23.
             * <p>
             * 
             * For example, if the `AlertConfig.StartTime` parameter is set to 0 and the `AlertConfig.EndTime` parameter is set to 22, the alert rule is effective from 00:00:00 to 22:00:00.
             * 
             * >  Alert notifications are sent based on the specified threshold only if the alert rule is effective.
             */
            public Builder startTime(Integer startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The monitored resources.
             */
            public Builder targetList(TargetList targetList) {
                this.targetList = targetList;
                return this;
            }

            /**
             * The callback URL.
             * <p>
             * 
             * CloudMonitor pushes an alert notification to the specified callback URL by sending an HTTP POST request. Only the HTTP protocol is supported.
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
        @com.aliyun.core.annotation.NameInMap("Instance")
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
        @com.aliyun.core.annotation.NameInMap("HttpKeyword")
        private String httpKeyword;

        @com.aliyun.core.annotation.NameInMap("HttpMethod")
        private String httpMethod;

        @com.aliyun.core.annotation.NameInMap("HttpNegative")
        private Boolean httpNegative;

        @com.aliyun.core.annotation.NameInMap("HttpPostContent")
        private String httpPostContent;

        @com.aliyun.core.annotation.NameInMap("HttpResponseCharset")
        private String httpResponseCharset;

        @com.aliyun.core.annotation.NameInMap("HttpURI")
        private String httpURI;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("TelnetOrPingHost")
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
             * The response to the HTTP request.
             */
            public Builder httpKeyword(String httpKeyword) {
                this.httpKeyword = httpKeyword;
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
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * The method to trigger an alert. The alert can be triggered based on whether the specified alert rule is included in the response body. Valid values:
             * <p>
             * 
             * *   true: If the HTTP response body includes the alert rule, an alert is triggered.
             * *   false: If the HTTP response does not include the alert rule, an alert is triggered.
             */
            public Builder httpNegative(Boolean httpNegative) {
                this.httpNegative = httpNegative;
                return this;
            }

            /**
             * The content of the HTTP POST request.
             */
            public Builder httpPostContent(String httpPostContent) {
                this.httpPostContent = httpPostContent;
                return this;
            }

            /**
             * The character set that is used in the HTTP response.
             */
            public Builder httpResponseCharset(String httpResponseCharset) {
                this.httpResponseCharset = httpResponseCharset;
                return this;
            }

            /**
             * The URI that you want to monitor. If the TaskType parameter is set to HTTP, this parameter is required.
             */
            public Builder httpURI(String httpURI) {
                this.httpURI = httpURI;
                return this;
            }

            /**
             * The interval at which detection requests are sent. Unit: seconds.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * The domain name or IP address that you want to monitor.
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
        @com.aliyun.core.annotation.NameInMap("AlertConfig")
        private AlertConfig alertConfig;

        @com.aliyun.core.annotation.NameInMap("Disabled")
        private Boolean disabled;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Instances")
        private Instances instances;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskOption")
        private TaskOption taskOption;

        @com.aliyun.core.annotation.NameInMap("TaskScope")
        private String taskScope;

        @com.aliyun.core.annotation.NameInMap("TaskType")
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
             * The configurations of the alert rule.
             */
            public Builder alertConfig(AlertConfig alertConfig) {
                this.alertConfig = alertConfig;
                return this;
            }

            /**
             * Indicates whether the availability monitoring task is disabled. Valid values:
             * <p>
             * 
             * *   true: The availability monitoring task is disabled.
             * *   false: The availability monitoring task is enabled.
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * The ID of the application group.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the application group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The ID of the availability monitoring task.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The ECS instances that are monitored.
             */
            public Builder instances(Instances instances) {
                this.instances = instances;
                return this;
            }

            /**
             * The name of the availability monitoring task.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * The optional parameters of the availability monitoring task.
             */
            public Builder taskOption(TaskOption taskOption) {
                this.taskOption = taskOption;
                return this;
            }

            /**
             * The range of instances that are monitored by the availability monitoring task. Valid values:
             * <p>
             * 
             * *   GROUP: All ECS instances in the application group are monitored.
             * *   GROUP_SPEC_INSTANCE: Specified ECS instances in the application group are monitored.
             */
            public Builder taskScope(String taskScope) {
                this.taskScope = taskScope;
                return this;
            }

            /**
             * The task type. Valid values:
             * <p>
             * 
             * *   PING
             * *   TELNET
             * *   HTTP
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
        @com.aliyun.core.annotation.NameInMap("NodeTaskConfig")
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
