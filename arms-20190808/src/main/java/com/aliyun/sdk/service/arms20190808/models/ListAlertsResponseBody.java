// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link ListAlertsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlertsResponseBody</p>
 */
public class ListAlertsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageBean")
    private PageBean pageBean;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAlertsResponseBody(Builder builder) {
        this.message = builder.message;
        this.pageBean = builder.pageBean;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertsResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageBean
     */
    public PageBean getPageBean() {
        return this.pageBean;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String message; 
        private PageBean pageBean; 
        private String requestId; 

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The information about the array object.</p>
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2FC13182-B9AF-4E6B-BE51-72669B7C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAlertsResponseBody build() {
            return new ListAlertsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAlertsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertsResponseBody</p>
     */
    public static class Activities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("HandlerName")
        private String handlerName;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Long type;

        private Activities(Builder builder) {
            this.content = builder.content;
            this.description = builder.description;
            this.handlerName = builder.handlerName;
            this.time = builder.time;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Activities create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return handlerName
         */
        public String getHandlerName() {
            return this.handlerName;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return type
         */
        public Long getType() {
            return this.type;
        }

        public static final class Builder {
            private String content; 
            private String description; 
            private String handlerName; 
            private String time; 
            private Long type; 

            /**
             * <p>The content of the alert notification.</p>
             * 
             * <strong>example:</strong>
             * <p>[Notification policy: Send notifications to DingTalk groups] Host monitoring. Host IP address: 10.76.XX.XX. Average memory usage of the host in the last 1 minute ≥ 1.0%. Current value: 84.7454%.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The description of the activity.</p>
             * 
             * <strong>example:</strong>
             * <p>[Alert Claimed] The alert is claimed</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the handler.</p>
             * 
             * <strong>example:</strong>
             * <p>O&amp;M Engineer A</p>
             */
            public Builder handlerName(String handlerName) {
                this.handlerName = handlerName;
                return this;
            }

            /**
             * <p>The operation time of the activity.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-20 19:08:57</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The type of the activity. Valid values:</p>
             * <ul>
             * <li>1: The alert is claimed.</li>
             * <li>2: The alert is disclaimed.</li>
             * <li>3: A comment is added for the alert.</li>
             * <li>4: The alert is disabled.</li>
             * <li>5: An alert notification is sent.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            public Activities build() {
                return new Activities(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAlertsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertsResponseBody</p>
     */
    public static class AlertEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertName")
        private String alertName;

        @com.aliyun.core.annotation.NameInMap("Annotations")
        private String annotations;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("GeneratorURL")
        private String generatorURL;

        @com.aliyun.core.annotation.NameInMap("IntegrationName")
        private String integrationName;

        @com.aliyun.core.annotation.NameInMap("IntegrationType")
        private String integrationType;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private String labels;

        @com.aliyun.core.annotation.NameInMap("ReceiveTime")
        private String receiveTime;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private AlertEvents(Builder builder) {
            this.alertName = builder.alertName;
            this.annotations = builder.annotations;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.generatorURL = builder.generatorURL;
            this.integrationName = builder.integrationName;
            this.integrationType = builder.integrationType;
            this.labels = builder.labels;
            this.receiveTime = builder.receiveTime;
            this.severity = builder.severity;
            this.startTime = builder.startTime;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertEvents create() {
            return builder().build();
        }

        /**
         * @return alertName
         */
        public String getAlertName() {
            return this.alertName;
        }

        /**
         * @return annotations
         */
        public String getAnnotations() {
            return this.annotations;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return generatorURL
         */
        public String getGeneratorURL() {
            return this.generatorURL;
        }

        /**
         * @return integrationName
         */
        public String getIntegrationName() {
            return this.integrationName;
        }

        /**
         * @return integrationType
         */
        public String getIntegrationType() {
            return this.integrationType;
        }

        /**
         * @return labels
         */
        public String getLabels() {
            return this.labels;
        }

        /**
         * @return receiveTime
         */
        public String getReceiveTime() {
            return this.receiveTime;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String alertName; 
            private String annotations; 
            private String description; 
            private String endTime; 
            private String generatorURL; 
            private String integrationName; 
            private String integrationType; 
            private String labels; 
            private String receiveTime; 
            private String severity; 
            private String startTime; 
            private String state; 

            /**
             * <p>The name of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Test-triggered alert</p>
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * <p>The annotations.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;_aliyun_arms_alert_value&quot;:&quot;4.0&quot; &quot;_aliyun_arms_alert_traceId&quot;:&quot;ac10c43116421327442277073d5461-105075299&quot;}</p>
             */
            public Builder annotations(String annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * <p>The description of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Host monitoring. Host IP address: 10.76.XX.XX. Average memory usage of the host in the last 1 minute ≥ 1.0%. Current value: 84.7454%.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the event ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-19 17:10:31</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The URL of the event.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://arms.console.aliyun.com">http://arms.console.aliyun.com</a></p>
             */
            public Builder generatorURL(String generatorURL) {
                this.generatorURL = generatorURL;
                return this;
            }

            /**
             * <p>The name of the integration that corresponds to the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>ARMS</p>
             */
            public Builder integrationName(String integrationName) {
                this.integrationName = integrationName;
                return this;
            }

            /**
             * <p>The type of the integration that corresponds to the alert event. Valid values:</p>
             * <ul>
             * <li>ARMS</li>
             * <li>CLOUD_MONITOR</li>
             * <li>MSE</li>
             * <li>ARMS_CLOUD_DIALTEST</li>
             * <li>PROMETHEUS</li>
             * <li>LOG_SERVICE</li>
             * <li>CUSTOM</li>
             * <li>ARMS_PROMETHEUS</li>
             * <li>ARMS_APP_MON</li>
             * <li>ARMS_FRONT_MON</li>
             * <li>ARMS_CUSTOM</li>
             * <li>XTRACE</li>
             * <li>GRAFANA</li>
             * <li>ZABBIX</li>
             * <li>SKYWALKING</li>
             * <li>EVENT_BRIDGE</li>
             * <li>NAGIOS</li>
             * <li>OPENFALCON</li>
             * <li>ARMS_INSIGHTS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ARMS_APP_MON</p>
             */
            public Builder integrationType(String integrationType) {
                this.integrationType = integrationType;
                return this;
            }

            /**
             * <p>The tags.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;severity&quot;:&quot;warning&quot; &quot;_aliyun_arms_alert_level&quot;:&quot;ERROR&quot; &quot;_aliyun_arms_entropy&quot;:&quot;0.30170457417889235&quot;}</p>
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The time when the event was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-19 17:05:42</p>
             */
            public Builder receiveTime(String receiveTime) {
                this.receiveTime = receiveTime;
                return this;
            }

            /**
             * <p>The severity level of the event. Valid values:</p>
             * <ul>
             * <li>critical</li>
             * <li>error</li>
             * <li>warning</li>
             * <li>info</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>warning</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The time when the event started.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-18 00:14:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the event. Valid values:</p>
             * <ul>
             * <li>Active: The event is not cleared.</li>
             * <li>Silenced: The event is silenced.</li>
             * <li>Resolved: The event is cleared.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public AlertEvents build() {
                return new AlertEvents(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAlertsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertsResponseBody</p>
     */
    public static class ListAlerts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcknowledgeTime")
        private Long acknowledgeTime;

        @com.aliyun.core.annotation.NameInMap("Activities")
        private java.util.List<Activities> activities;

        @com.aliyun.core.annotation.NameInMap("AlertEvents")
        private java.util.List<AlertEvents> alertEvents;

        @com.aliyun.core.annotation.NameInMap("AlertId")
        private Long alertId;

        @com.aliyun.core.annotation.NameInMap("AlertName")
        private String alertName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Describe")
        private String describe;

        @com.aliyun.core.annotation.NameInMap("DispatchRuleId")
        private Float dispatchRuleId;

        @com.aliyun.core.annotation.NameInMap("DispatchRuleName")
        private String dispatchRuleName;

        @com.aliyun.core.annotation.NameInMap("Handler")
        private String handler;

        @com.aliyun.core.annotation.NameInMap("NotifyRobots")
        private String notifyRobots;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("RecoverTime")
        private Long recoverTime;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("Solution")
        private String solution;

        @com.aliyun.core.annotation.NameInMap("State")
        private Long state;

        private ListAlerts(Builder builder) {
            this.acknowledgeTime = builder.acknowledgeTime;
            this.activities = builder.activities;
            this.alertEvents = builder.alertEvents;
            this.alertId = builder.alertId;
            this.alertName = builder.alertName;
            this.createTime = builder.createTime;
            this.describe = builder.describe;
            this.dispatchRuleId = builder.dispatchRuleId;
            this.dispatchRuleName = builder.dispatchRuleName;
            this.handler = builder.handler;
            this.notifyRobots = builder.notifyRobots;
            this.owner = builder.owner;
            this.recoverTime = builder.recoverTime;
            this.severity = builder.severity;
            this.solution = builder.solution;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListAlerts create() {
            return builder().build();
        }

        /**
         * @return acknowledgeTime
         */
        public Long getAcknowledgeTime() {
            return this.acknowledgeTime;
        }

        /**
         * @return activities
         */
        public java.util.List<Activities> getActivities() {
            return this.activities;
        }

        /**
         * @return alertEvents
         */
        public java.util.List<AlertEvents> getAlertEvents() {
            return this.alertEvents;
        }

        /**
         * @return alertId
         */
        public Long getAlertId() {
            return this.alertId;
        }

        /**
         * @return alertName
         */
        public String getAlertName() {
            return this.alertName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return describe
         */
        public String getDescribe() {
            return this.describe;
        }

        /**
         * @return dispatchRuleId
         */
        public Float getDispatchRuleId() {
            return this.dispatchRuleId;
        }

        /**
         * @return dispatchRuleName
         */
        public String getDispatchRuleName() {
            return this.dispatchRuleName;
        }

        /**
         * @return handler
         */
        public String getHandler() {
            return this.handler;
        }

        /**
         * @return notifyRobots
         */
        public String getNotifyRobots() {
            return this.notifyRobots;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return recoverTime
         */
        public Long getRecoverTime() {
            return this.recoverTime;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return solution
         */
        public String getSolution() {
            return this.solution;
        }

        /**
         * @return state
         */
        public Long getState() {
            return this.state;
        }

        public static final class Builder {
            private Long acknowledgeTime; 
            private java.util.List<Activities> activities; 
            private java.util.List<AlertEvents> alertEvents; 
            private Long alertId; 
            private String alertName; 
            private String createTime; 
            private String describe; 
            private Float dispatchRuleId; 
            private String dispatchRuleName; 
            private String handler; 
            private String notifyRobots; 
            private String owner; 
            private Long recoverTime; 
            private String severity; 
            private String solution; 
            private Long state; 

            /**
             * AcknowledgeTime.
             */
            public Builder acknowledgeTime(Long acknowledgeTime) {
                this.acknowledgeTime = acknowledgeTime;
                return this;
            }

            /**
             * <p>The list of activities.</p>
             */
            public Builder activities(java.util.List<Activities> activities) {
                this.activities = activities;
                return this;
            }

            /**
             * <p>The list of events.</p>
             */
            public Builder alertEvents(java.util.List<AlertEvents> alertEvents) {
                this.alertEvents = alertEvents;
                return this;
            }

            /**
             * <p>The alert ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2279</p>
             */
            public Builder alertId(Long alertId) {
                this.alertId = alertId;
                return this;
            }

            /**
             * <p>The name of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Test alert</p>
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * <p>The time when the alert was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-18 00:21:35</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Describe.
             */
            public Builder describe(String describe) {
                this.describe = describe;
                return this;
            }

            /**
             * <p>The ID of the notification policy.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder dispatchRuleId(Float dispatchRuleId) {
                this.dispatchRuleId = dispatchRuleId;
                return this;
            }

            /**
             * <p>The name of the notification policy.</p>
             * 
             * <strong>example:</strong>
             * <p>DingTalk Notification</p>
             */
            public Builder dispatchRuleName(String dispatchRuleName) {
                this.dispatchRuleName = dispatchRuleName;
                return this;
            }

            /**
             * Handler.
             */
            public Builder handler(String handler) {
                this.handler = handler;
                return this;
            }

            /**
             * NotifyRobots.
             */
            public Builder notifyRobots(String notifyRobots) {
                this.notifyRobots = notifyRobots;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * RecoverTime.
             */
            public Builder recoverTime(Long recoverTime) {
                this.recoverTime = recoverTime;
                return this;
            }

            /**
             * <p>The severity level of the alert. Valid values: P6, P5, P4, P3, P2, and P1. The preceding values are listed in ascending order of severity.</p>
             * 
             * <strong>example:</strong>
             * <p>P6</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The Alert solution.</p>
             * 
             * <strong>example:</strong>
             * <p>--</p>
             */
            public Builder solution(String solution) {
                this.solution = solution;
                return this;
            }

            /**
             * <p>The status of the alert. Valid values:</p>
             * <ul>
             * <li>0: The alert is pending.</li>
             * <li>1: The alert is being handled.</li>
             * <li>2: The alert is handled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder state(Long state) {
                this.state = state;
                return this;
            }

            public ListAlerts build() {
                return new ListAlerts(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAlertsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertsResponseBody</p>
     */
    public static class PageBean extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListAlerts")
        private java.util.List<ListAlerts> listAlerts;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Long page;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private PageBean(Builder builder) {
            this.listAlerts = builder.listAlerts;
            this.page = builder.page;
            this.size = builder.size;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageBean create() {
            return builder().build();
        }

        /**
         * @return listAlerts
         */
        public java.util.List<ListAlerts> getListAlerts() {
            return this.listAlerts;
        }

        /**
         * @return page
         */
        public Long getPage() {
            return this.page;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<ListAlerts> listAlerts; 
            private Long page; 
            private Long size; 
            private Long total; 

            /**
             * <p>The alerts for which the alert sending history is queried.</p>
             */
            public Builder listAlerts(java.util.List<ListAlerts> listAlerts) {
                this.listAlerts = listAlerts;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * <p>The number of alerts returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The total number of queried alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public PageBean build() {
                return new PageBean(this);
            } 

        } 

    }
}
