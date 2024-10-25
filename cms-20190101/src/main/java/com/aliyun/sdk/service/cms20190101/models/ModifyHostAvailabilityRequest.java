// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyHostAvailabilityRequest} extends {@link RequestModel}
 *
 * <p>ModifyHostAvailabilityRequest</p>
 */
public class ModifyHostAvailabilityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertConfig")
    private AlertConfig alertConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskOption")
    private TaskOption taskOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertConfigEscalationList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < AlertConfigEscalationList> alertConfigEscalationList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertConfigTargetList")
    private java.util.List < AlertConfigTargetList> alertConfigTargetList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceList")
    private java.util.List < String > instanceList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskScope")
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
         * <p>The alert configurations.</p>
         * <p>This parameter is required.</p>
         */
        public Builder alertConfigEscalationList(java.util.List < AlertConfigEscalationList> alertConfigEscalationList) {
            this.putQueryParameter("AlertConfigEscalationList", alertConfigEscalationList);
            this.alertConfigEscalationList = alertConfigEscalationList;
            return this;
        }

        /**
         * <p>The information about the resources for which alerts are triggered.</p>
         */
        public Builder alertConfigTargetList(java.util.List < AlertConfigTargetList> alertConfigTargetList) {
            this.putQueryParameter("AlertConfigTargetList", alertConfigTargetList);
            this.alertConfigTargetList = alertConfigTargetList;
            return this;
        }

        /**
         * <p>The ID of the application group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the availability monitoring task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The ECS instances that are monitored. Valid values of N: 1 to 21.</p>
         * <blockquote>
         * <p>This parameter must be specified when <code>TaskScope</code> is set to <code>GROUP_SPEC_INSTANCE</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-absdfkwl321****</p>
         */
        public Builder instanceList(java.util.List < String > instanceList) {
            this.putQueryParameter("InstanceList", instanceList);
            this.instanceList = instanceList;
            return this;
        }

        /**
         * <p>The name of the availability monitoring task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>task2</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The range of instances that are monitored by the availability monitoring task. Valid values:</p>
         * <ul>
         * <li>GROUP: All Elastic Compute Service (ECS) instances in the application group are monitored.</li>
         * <li>GROUP_SPEC_INSTANCE: Specified ECS instances in the application group are monitored. The TaskScope parameter must be used in combination with the InstanceList.N parameter. The InstanceList.N parameter specifies the ECS instances to be monitored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GROUP</p>
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

    /**
     * 
     * {@link ModifyHostAvailabilityRequest} extends {@link TeaModel}
     *
     * <p>ModifyHostAvailabilityRequest</p>
     */
    public static class AlertConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Integer endTime;

        @com.aliyun.core.annotation.NameInMap("NotifyType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer notifyType;

        @com.aliyun.core.annotation.NameInMap("SilenceTime")
        private Integer silenceTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Integer startTime;

        @com.aliyun.core.annotation.NameInMap("WebHook")
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
             * <p>The end of the time range during which the alert rule is effective. Valid values: 0 to 23.</p>
             * <p>For example, if the <code>AlertConfig.StartTime</code> parameter is set to 0 and the <code>AlertConfig.EndTime</code> parameter is set to 22, the alert rule is effective from 00:00:00 to 22:00:00.</p>
             * <blockquote>
             * <p>Alert notifications are sent based on the specified threshold only if the alert rule is effective.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder endTime(Integer endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The alert notification methods. Valid values:</p>
             * <p>0: Alert notifications are sent by using emails and DingTalk chatbots.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder notifyType(Integer notifyType) {
                this.notifyType = notifyType;
                return this;
            }

            /**
             * <p>The mute period during which new alerts are not sent even if the trigger conditions are met. Unit: seconds. Default value: 86400. The default value indicates one day.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder silenceTime(Integer silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * <p>The beginning of the time range during which the alert rule is effective. Valid values: 0 to 23.</p>
             * <p>For example, if the <code>AlertConfig.StartTime</code> parameter is set to 0 and the <code>AlertConfig.EndTime</code> parameter is set to 22, the alert rule is effective from 00:00:00 to 22:00:00.</p>
             * <blockquote>
             * <p>Alert notifications are sent based on the specified threshold only if the alert rule is effective.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder startTime(Integer startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The callback URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com/webhook.json">https://www.aliyun.com/webhook.json</a></p>
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
    /**
     * 
     * {@link ModifyHostAvailabilityRequest} extends {@link TeaModel}
     *
     * <p>ModifyHostAvailabilityRequest</p>
     */
    public static class TaskOption extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HttpHeader")
        private String httpHeader;

        @com.aliyun.core.annotation.NameInMap("HttpMethod")
        private String httpMethod;

        @com.aliyun.core.annotation.NameInMap("HttpNegative")
        private Boolean httpNegative;

        @com.aliyun.core.annotation.NameInMap("HttpPostContent")
        private String httpPostContent;

        @com.aliyun.core.annotation.NameInMap("HttpResponseCharset")
        private String httpResponseCharset;

        @com.aliyun.core.annotation.NameInMap("HttpResponseMatchContent")
        private String httpResponseMatchContent;

        @com.aliyun.core.annotation.NameInMap("HttpURI")
        private String httpURI;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("TelnetOrPingHost")
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
             * <p>The header of the HTTP request. Format: <code>Parameter name:Parameter value</code>. Separate multiple parameters with carriage return characters. Example:</p>
             * <pre><code>params1:value1
             * params2:value2
             * </code></pre>
             * 
             * <strong>example:</strong>
             * <p>params1:value1</p>
             */
            public Builder httpHeader(String httpHeader) {
                this.httpHeader = httpHeader;
                return this;
            }

            /**
             * <p>The HTTP request method. Valid values:</p>
             * <ul>
             * <li>GET</li>
             * <li>POST</li>
             * <li>HEAD</li>
             * </ul>
             * <blockquote>
             * <p>This parameter must be specified when TaskType is set to HTTP. For more information about how to configure the TaskType parameter, see <a href="https://help.aliyun.com/document_detail/115317.html">CreateHostAvailability</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * <p>The method to trigger an alert. The alert can be triggered based on whether the specified alert rule is included in the response body. Valid values:</p>
             * <ul>
             * <li>true: If the HTTP response body includes the alert rule, an alert is triggered.</li>
             * <li>false: If the HTTP response does not include the alert rule, an alert is triggered.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter must be specified when TaskType is set to HTTP. For more information about how to configure the TaskType parameter, see <a href="https://help.aliyun.com/document_detail/115317.html">CreateHostAvailability</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder httpNegative(Boolean httpNegative) {
                this.httpNegative = httpNegative;
                return this;
            }

            /**
             * <p>The content of the HTTP POST request.</p>
             * 
             * <strong>example:</strong>
             * <p>params1=value1</p>
             */
            public Builder httpPostContent(String httpPostContent) {
                this.httpPostContent = httpPostContent;
                return this;
            }

            /**
             * <p>The character set that is used in the HTTP response.</p>
             * <blockquote>
             * <p>Only UTF-8 is supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>UTF-8</p>
             */
            public Builder httpResponseCharset(String httpResponseCharset) {
                this.httpResponseCharset = httpResponseCharset;
                return this;
            }

            /**
             * <p>The response to the HTTP request.</p>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder httpResponseMatchContent(String httpResponseMatchContent) {
                this.httpResponseMatchContent = httpResponseMatchContent;
                return this;
            }

            /**
             * <p>The URI that you want to monitor. This parameter is required if the TaskType parameter is set to HTTP or Telnet.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
             */
            public Builder httpURI(String httpURI) {
                this.httpURI = httpURI;
                return this;
            }

            /**
             * <p>The interval at which detection requests are sent. Unit: seconds. Valid values: 15, 30, 60, 120, 300, 900, 1800, and 3600.</p>
             * <blockquote>
             * <p>This parameter is available only for the CloudMonitor agent V3.5.1 or later.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The domain name or IP address that you want to monitor.</p>
             * <blockquote>
             * <p> This parameter is required if the TaskType parameter is set to PING. For more information about how to set the TaskType parameter, see <a href="https://help.aliyun.com/document_detail/115317.html">CreateHostAvailability</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
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
    /**
     * 
     * {@link ModifyHostAvailabilityRequest} extends {@link TeaModel}
     *
     * <p>ModifyHostAvailabilityRequest</p>
     */
    public static class AlertConfigEscalationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aggregate")
        private String aggregate;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Times")
        private Integer times;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The method used to calculate the metric values that trigger alerts. Valid values of N: 1 to 21. The value of this parameter varies based on the metric. The following items show the correspondence between metrics and calculation methods:</p>
             * <ul>
             * <li>HttpStatus: Value</li>
             * <li>HttpLatency: Average</li>
             * <li>TelnetStatus: Value</li>
             * <li>TelnetLatency: Average</li>
             * <li>PingLostRate: Average</li>
             * </ul>
             * <blockquote>
             * <p>The value Value indicates the original value and is used for metrics such as status codes. The value Average indicates the average value and is used for metrics such as the latency and packet loss rate.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Value</p>
             */
            public Builder aggregate(String aggregate) {
                this.aggregate = aggregate;
                return this;
            }

            /**
             * <p>The metric for which the alert feature is enabled. Valid values of N: 1 to 21. Valid values:</p>
             * <ul>
             * <li>HttpStatus: HTTP status code</li>
             * <li>HttpLatency: HTTP response time</li>
             * <li>TelnetStatus: Telnet status code</li>
             * <li>TelnetLatency: Telnet response time</li>
             * <li>PingLostRate: Ping packet loss rate</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>HttpStatus</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The comparison operator that is used in the alert rule. Valid values of N: 1 to 21. Valid values:</p>
             * <ul>
             * <li><code>&gt;</code></li>
             * <li><code>&gt;=</code></li>
             * <li><code>&lt;</code></li>
             * <li><code>&lt;=</code></li>
             * <li><code>=</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <blockquote>
             * </blockquote>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The consecutive number of times for which the metric value meets the alert condition before an alert is triggered. Valid values of N: 1 to 21.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            /**
             * <p>The alert threshold. Valid values of N: 1 to 21.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
    /**
     * 
     * {@link ModifyHostAvailabilityRequest} extends {@link TeaModel}
     *
     * <p>ModifyHostAvailabilityRequest</p>
     */
    public static class AlertConfigTargetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("JsonParams")
        private String jsonParams;

        @com.aliyun.core.annotation.NameInMap("Level")
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
             * <p>The Alibaba Cloud Resource Name (ARN) of the resource.</p>
             * <p>Format: <code>acs:{Service name abbreviation}:{regionId}:{userId}:/{Resource type}/{Resource name}/message</code>. Example: <code>acs:mns:cn-hangzhou:120886317861****:/queues/test123/message</code>. Fields:</p>
             * <ul>
             * <li><p>{Service name abbreviation}: the abbreviation of the service name. Valid value: mns.</p>
             * </li>
             * <li><p>{userId}: the ID of the Alibaba Cloud account.</p>
             * </li>
             * <li><p>{regionId}: the region ID of the message queue or topic.</p>
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
             * <p>acs:mns:cn-hangzhou:111:/queues/test/message</p>
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>The ID of the resource for which alerts are triggered.</p>
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

            public AlertConfigTargetList build() {
                return new AlertConfigTargetList(this);
            } 

        } 

    }
}
