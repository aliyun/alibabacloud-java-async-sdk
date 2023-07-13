// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHostAvailabilityRequest} extends {@link RequestModel}
 *
 * <p>ModifyHostAvailabilityRequest</p>
 */
public class ModifyHostAvailabilityRequest extends Request {
    @Query
    @NameInMap("AlertConfig")
    private AlertConfig alertConfig;

    @Query
    @NameInMap("TaskOption")
    private TaskOption taskOption;

    @Query
    @NameInMap("AlertConfigEscalationList")
    @Validation(required = true)
    private java.util.List < AlertConfigEscalationList> alertConfigEscalationList;

    @Query
    @NameInMap("AlertConfigTargetList")
    private java.util.List < AlertConfigTargetList> alertConfigTargetList;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private Long groupId;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("InstanceList")
    private java.util.List < String > instanceList;

    @Query
    @NameInMap("TaskName")
    @Validation(required = true)
    private String taskName;

    @Query
    @NameInMap("TaskScope")
    private String taskScope;

    private ModifyHostAvailabilityRequest(Builder builder) {
        super(builder);
        this.alertConfig = builder.alertConfig;
        this.taskOption = builder.taskOption;
        this.alertConfigEscalationList = builder.alertConfigEscalationList;
        this.alertConfigTargetList = builder.alertConfigTargetList;
        this.groupId = builder.groupId;
        this.id = builder.id;
        this.instanceList = builder.instanceList;
        this.taskName = builder.taskName;
        this.taskScope = builder.taskScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHostAvailabilityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertConfig
     */
    public AlertConfig getAlertConfig() {
        return this.alertConfig;
    }

    /**
     * @return taskOption
     */
    public TaskOption getTaskOption() {
        return this.taskOption;
    }

    /**
     * @return alertConfigEscalationList
     */
    public java.util.List < AlertConfigEscalationList> getAlertConfigEscalationList() {
        return this.alertConfigEscalationList;
    }

    /**
     * @return alertConfigTargetList
     */
    public java.util.List < AlertConfigTargetList> getAlertConfigTargetList() {
        return this.alertConfigTargetList;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return instanceList
     */
    public java.util.List < String > getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskScope
     */
    public String getTaskScope() {
        return this.taskScope;
    }

    public static final class Builder extends Request.Builder<ModifyHostAvailabilityRequest, Builder> {
        private AlertConfig alertConfig; 
        private TaskOption taskOption; 
        private java.util.List < AlertConfigEscalationList> alertConfigEscalationList; 
        private java.util.List < AlertConfigTargetList> alertConfigTargetList; 
        private Long groupId; 
        private Long id; 
        private java.util.List < String > instanceList; 
        private String taskName; 
        private String taskScope; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHostAvailabilityRequest request) {
            super(request);
            this.alertConfig = request.alertConfig;
            this.taskOption = request.taskOption;
            this.alertConfigEscalationList = request.alertConfigEscalationList;
            this.alertConfigTargetList = request.alertConfigTargetList;
            this.groupId = request.groupId;
            this.id = request.id;
            this.instanceList = request.instanceList;
            this.taskName = request.taskName;
            this.taskScope = request.taskScope;
        } 

        /**
         * AlertConfig.
         */
        public Builder alertConfig(AlertConfig alertConfig) {
            this.putQueryParameter("AlertConfig", alertConfig);
            this.alertConfig = alertConfig;
            return this;
        }

        /**
         * TaskOption.
         */
        public Builder taskOption(TaskOption taskOption) {
            this.putQueryParameter("TaskOption", taskOption);
            this.taskOption = taskOption;
            return this;
        }

        /**
         * AlertConfigEscalationList.
         */
        public Builder alertConfigEscalationList(java.util.List < AlertConfigEscalationList> alertConfigEscalationList) {
            this.putQueryParameter("AlertConfigEscalationList", alertConfigEscalationList);
            this.alertConfigEscalationList = alertConfigEscalationList;
            return this;
        }

        /**
         * AlertConfigTargetList.
         */
        public Builder alertConfigTargetList(java.util.List < AlertConfigTargetList> alertConfigTargetList) {
            this.putQueryParameter("AlertConfigTargetList", alertConfigTargetList);
            this.alertConfigTargetList = alertConfigTargetList;
            return this;
        }

        /**
         * The Alibaba Cloud Resource Name (ARN) of the resource.
         * <p>
         * 
         * Format: `acs:{Service name abbreviation}:{regionId}:{userId}:/{Resource type}/{Resource name}/message`. Example: `acs:mns:cn-hangzhou:120886317861****:/queues/test123/message`. Fields:
         * 
         * *   {Service name abbreviation}: the abbreviation of the service name. Valid value: mns.
         * *   {userId}: the ID of the Alibaba Cloud account.
         * *   {regionId}: the region ID of the message queue or topic.
         * *   {Resource type}`: the type of the resource for which alerts are triggered. Valid values: - **queues** - **topics** {Resource name}: the name of the resource. - If the resource type is set to **queues**, the resource name is the name of the message queue. - If the resource type is set to **topics**, the resource name is the name of the topic.`
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The metric for which the alert feature is enabled. Valid values of N: 1 to 21. Valid values:
         * <p>
         * 
         * *   HttpStatus: HTTP status code
         * *   HttpLatency: HTTP response time
         * *   TelnetStatus: Telnet status code
         * *   TelnetLatency: Telnet response time
         * *   PingLostRate: Ping packet loss rate
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * InstanceList.
         */
        public Builder instanceList(java.util.List < String > instanceList) {
            this.putQueryParameter("InstanceList", instanceList);
            this.instanceList = instanceList;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * The comparison operator that is used in the alert rule. Valid values of N: 1 to 21. Valid values:
         * <p>
         * 
         * *   `>`
         * *   `>=`
         * *   `<`
         * *   `<=`
         * *   `=`
         */
        public Builder taskScope(String taskScope) {
            this.putQueryParameter("TaskScope", taskScope);
            this.taskScope = taskScope;
            return this;
        }

        @Override
        public ModifyHostAvailabilityRequest build() {
            return new ModifyHostAvailabilityRequest(this);
        } 

    } 

    public static class AlertConfig extends TeaModel {
        @NameInMap("EndTime")
        private Integer endTime;

        @NameInMap("NotifyType")
        @Validation(required = true)
        private Integer notifyType;

        @NameInMap("SilenceTime")
        private Integer silenceTime;

        @NameInMap("StartTime")
        private Integer startTime;

        @NameInMap("WebHook")
        private String webHook;

        private AlertConfig(Builder builder) {
            this.endTime = builder.endTime;
            this.notifyType = builder.notifyType;
            this.silenceTime = builder.silenceTime;
            this.startTime = builder.startTime;
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
         * @return webHook
         */
        public String getWebHook() {
            return this.webHook;
        }

        public static final class Builder {
            private Integer endTime; 
            private Integer notifyType; 
            private Integer silenceTime; 
            private Integer startTime; 
            private String webHook; 

            /**
             * The ID of the availability monitoring task.
             */
            public Builder endTime(Integer endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The content of the HTTP POST request.
             */
            public Builder notifyType(Integer notifyType) {
                this.notifyType = notifyType;
                return this;
            }

            /**
             * The interval at which detection requests are sent. Unit: seconds. Valid values: 15, 30, 60, 120, 300, 900, 1800, and 3600.
             * <p>
             * 
             * >  This parameter is available only for the CloudMonitor agent V3.5.1 or later.
             */
            public Builder silenceTime(Integer silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * The method used to calculate metric values that trigger alerts. Valid values of N: 1 to 21. The value of this parameter varies based on the metric. The following points describe the correspondence between metrics and calculation methods:
             * <p>
             * 
             * *   HttpStatus: Value
             * *   HttpLatency: Average
             * *   TelnetStatus: Value
             * *   TelnetLatency: Average
             * *   PingLostRate: Average
             * 
             * >  The value Value indicates the original value and is used for metrics such as status codes. The value Average indicates the average value and is used for metrics, such as the latency and packet loss rate.
             */
            public Builder startTime(Integer startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The name of the availability monitoring task.
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
    public static class TaskOption extends TeaModel {
        @NameInMap("HttpHeader")
        private String httpHeader;

        @NameInMap("HttpMethod")
        private String httpMethod;

        @NameInMap("HttpNegative")
        private Boolean httpNegative;

        @NameInMap("HttpPostContent")
        private String httpPostContent;

        @NameInMap("HttpResponseCharset")
        private String httpResponseCharset;

        @NameInMap("HttpResponseMatchContent")
        private String httpResponseMatchContent;

        @NameInMap("HttpURI")
        private String httpURI;

        @NameInMap("Interval")
        private Integer interval;

        @NameInMap("TelnetOrPingHost")
        private String telnetOrPingHost;

        private TaskOption(Builder builder) {
            this.httpHeader = builder.httpHeader;
            this.httpMethod = builder.httpMethod;
            this.httpNegative = builder.httpNegative;
            this.httpPostContent = builder.httpPostContent;
            this.httpResponseCharset = builder.httpResponseCharset;
            this.httpResponseMatchContent = builder.httpResponseMatchContent;
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
         * @return httpHeader
         */
        public String getHttpHeader() {
            return this.httpHeader;
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
         * @return httpResponseMatchContent
         */
        public String getHttpResponseMatchContent() {
            return this.httpResponseMatchContent;
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
            private String httpHeader; 
            private String httpMethod; 
            private Boolean httpNegative; 
            private String httpPostContent; 
            private String httpResponseCharset; 
            private String httpResponseMatchContent; 
            private String httpURI; 
            private Integer interval; 
            private String telnetOrPingHost; 

            /**
             * The alert notification methods. Valid values:
             * <p>
             * 
             * 0: Alert notifications are sent by using emails and DingTalk chatbots.
             */
            public Builder httpHeader(String httpHeader) {
                this.httpHeader = httpHeader;
                return this;
            }

            /**
             * The consecutive number of times for which the metric value meets the alert condition before an alert is triggered. Valid values of N: 1 to 21.
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * The level of the alert. Valid values:
             * <p>
             * 
             * *   INFO: information
             * *   WARN: warning
             * *   CRITICAL: critical
             */
            public Builder httpNegative(Boolean httpNegative) {
                this.httpNegative = httpNegative;
                return this;
            }

            /**
             * The domain name or IP address that you want to monitor.
             * <p>
             * 
             * >  If the TaskType parameter is set to PING or TELNET, this parameter is required. For more information about how to set the TaskType parameter, see [CreateHostAvailability](~~115317~~).
             */
            public Builder httpPostContent(String httpPostContent) {
                this.httpPostContent = httpPostContent;
                return this;
            }

            /**
             * The error message.
             */
            public Builder httpResponseCharset(String httpResponseCharset) {
                this.httpResponseCharset = httpResponseCharset;
                return this;
            }

            /**
             * The ID of the application group.
             */
            public Builder httpResponseMatchContent(String httpResponseMatchContent) {
                this.httpResponseMatchContent = httpResponseMatchContent;
                return this;
            }

            /**
             * The operation that you want to perform. Set the value to **ModifyHostAvailability**.
             */
            public Builder httpURI(String httpURI) {
                this.httpURI = httpURI;
                return this;
            }

            /**
             * The header of the HTTP request. Format: `Parameter name:Parameter value`. Separate multiple parameters with carriage return characters. Example:
             * <p>
             * 
             * ```
             * 
             * params1:value1
             * params2:value2
             * ```
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * The URI that you want to monitor. If the TaskType parameter is set to HTTP, this parameter is required.
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
    public static class AlertConfigEscalationList extends TeaModel {
        @NameInMap("Aggregate")
        private String aggregate;

        @NameInMap("MetricName")
        @Validation(required = true)
        private String metricName;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("Times")
        private Integer times;

        @NameInMap("Value")
        private String value;

        private AlertConfigEscalationList(Builder builder) {
            this.aggregate = builder.aggregate;
            this.metricName = builder.metricName;
            this.operator = builder.operator;
            this.times = builder.times;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertConfigEscalationList create() {
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
        public Integer getTimes() {
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
            private Integer times; 
            private String value; 

            /**
             * The ECS instances that are monitored. Valid values of N: 1 to 21.
             * <p>
             * 
             * >  If the `TaskScope` parameter is set to `GROUP_SPEC_INSTANCE`, this parameter is required.
             */
            public Builder aggregate(String aggregate) {
                this.aggregate = aggregate;
                return this;
            }

            /**
             * The character set that is used in the HTTP response.
             * <p>
             * 
             * >  Valid value: UTF-8.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The method to trigger an alert. The alert can be triggered based on whether the specified alert rule is included in the response body. Valid values:
             * <p>
             * 
             * *   true: If the HTTP response body includes the alert rule, an alert is triggered.
             * *   false: If the HTTP response does not include the alert rule, an alert is triggered.
             * 
             * >  If the TaskType parameter is set to HTTP, this parameter is required. For more information about how to set the TaskType parameter, see [CreateHostAvailability](~~115317~~).
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The parameters of the alert callback. The parameters are in the JSON format.
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            /**
             * The callback URL.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AlertConfigEscalationList build() {
                return new AlertConfigEscalationList(this);
            } 

        } 

    }
    public static class AlertConfigTargetList extends TeaModel {
        @NameInMap("Arn")
        private String arn;

        @NameInMap("Id")
        private String id;

        @NameInMap("JsonParams")
        private String jsonParams;

        @NameInMap("Level")
        private String level;

        private AlertConfigTargetList(Builder builder) {
            this.arn = builder.arn;
            this.id = builder.id;
            this.jsonParams = builder.jsonParams;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertConfigTargetList create() {
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
             * The mute period during which new alerts are not sent even if the trigger conditions are met. Unit: seconds. Default value: 86400. The default value indicates one day.
             */
            public Builder arn(String arn) {
                this.arn = arn;
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
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder jsonParams(String jsonParams) {
                this.jsonParams = jsonParams;
                return this;
            }

            /**
             * The range of instances that are monitored by the availability monitoring task. Valid values:
             * <p>
             * 
             * *   GROUP: All ECS instances in the application group are monitored.
             * *   GROUP_SPEC_INSTANCE: Specified ECS instances in the application group are monitored. The TaskScope parameter must be used in combination with the InstanceList.N parameter. The InstanceList.N parameter specifies the ECS instances to be monitored.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public AlertConfigTargetList build() {
                return new AlertConfigTargetList(this);
            } 

        } 

    }
}
