// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The information about the array object.
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAlertsResponseBody build() {
            return new ListAlertsResponseBody(this);
        } 

    } 

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
             * The content of the alert notification.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The description of the activity.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the handler.
             */
            public Builder handlerName(String handlerName) {
                this.handlerName = handlerName;
                return this;
            }

            /**
             * The operation time of the activity.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * The type of the activity. Valid values:
             * <p>
             * 
             * *   1: The alert is claimed.
             * *   2: The alert is disclaimed.
             * *   3: A comment is added for the alert.
             * *   4: The alert is disabled.
             * *   5: An alert notification is sent.
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
             * The name of the event.
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * The annotations.
             */
            public Builder annotations(String annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * The description of the event.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the event ended.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The URL of the event.
             */
            public Builder generatorURL(String generatorURL) {
                this.generatorURL = generatorURL;
                return this;
            }

            /**
             * The name of the integration that corresponds to the alert event.
             */
            public Builder integrationName(String integrationName) {
                this.integrationName = integrationName;
                return this;
            }

            /**
             * The type of the integration that corresponds to the alert event. Valid values:
             * <p>
             * 
             * *   ARMS
             * *   CLOUD_MONITOR
             * *   MSE
             * *   ARMS_CLOUD_DIALTEST
             * *   PROMETHEUS
             * *   LOG_SERVICE
             * *   CUSTOM
             * *   ARMS_PROMETHEUS
             * *   ARMS_APP_MON
             * *   ARMS_FRONT_MON
             * *   ARMS_CUSTOM
             * *   XTRACE
             * *   GRAFANA
             * *   ZABBIX
             * *   SKYWALKING
             * *   EVENT_BRIDGE
             * *   NAGIOS
             * *   OPENFALCON
             * *   ARMS_INSIGHTS
             */
            public Builder integrationType(String integrationType) {
                this.integrationType = integrationType;
                return this;
            }

            /**
             * The tags.
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * The time when the event was created.
             */
            public Builder receiveTime(String receiveTime) {
                this.receiveTime = receiveTime;
                return this;
            }

            /**
             * The severity level of the event. Valid values:
             * <p>
             * 
             * *   critical
             * *   error
             * *   warning
             * *   info
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * The time when the event started.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the event. Valid values:
             * <p>
             * 
             * *   Active: The event is not cleared.
             * *   Silenced: The event is silenced.
             * *   Resolved: The event is cleared.
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
    public static class ListAlerts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcknowledgeTime")
        private Long acknowledgeTime;

        @com.aliyun.core.annotation.NameInMap("Activities")
        private java.util.List < Activities> activities;

        @com.aliyun.core.annotation.NameInMap("AlertEvents")
        private java.util.List < AlertEvents> alertEvents;

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
        public java.util.List < Activities> getActivities() {
            return this.activities;
        }

        /**
         * @return alertEvents
         */
        public java.util.List < AlertEvents> getAlertEvents() {
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
            private java.util.List < Activities> activities; 
            private java.util.List < AlertEvents> alertEvents; 
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
             * The list of activities.
             */
            public Builder activities(java.util.List < Activities> activities) {
                this.activities = activities;
                return this;
            }

            /**
             * The list of events.
             */
            public Builder alertEvents(java.util.List < AlertEvents> alertEvents) {
                this.alertEvents = alertEvents;
                return this;
            }

            /**
             * The alert ID.
             */
            public Builder alertId(Long alertId) {
                this.alertId = alertId;
                return this;
            }

            /**
             * The name of the alert rule.
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * The time when the alert was created.
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
             * The ID of the notification policy.
             */
            public Builder dispatchRuleId(Float dispatchRuleId) {
                this.dispatchRuleId = dispatchRuleId;
                return this;
            }

            /**
             * The name of the notification policy.
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
             * The severity level of the alert. Valid values: P6, P5, P4, P3, P2, and P1. The preceding values are listed in ascending order of severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * The Alert solution.
             */
            public Builder solution(String solution) {
                this.solution = solution;
                return this;
            }

            /**
             * The status of the alert. Valid values:
             * <p>
             * 
             * *   0: The alert is pending.
             * *   1: The alert is being handled.
             * *   2: The alert is handled.
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
    public static class PageBean extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListAlerts")
        private java.util.List < ListAlerts> listAlerts;

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
        public java.util.List < ListAlerts> getListAlerts() {
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
            private java.util.List < ListAlerts> listAlerts; 
            private Long page; 
            private Long size; 
            private Long total; 

            /**
             * The alerts for which the alert sending history is queried.
             */
            public Builder listAlerts(java.util.List < ListAlerts> listAlerts) {
                this.listAlerts = listAlerts;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * The number of alerts returned per page.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The total number of queried alerts.
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
