// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAlertEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlertEventsResponseBody</p>
 */
public class ListAlertEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageBean")
    private PageBean pageBean;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAlertEventsResponseBody(Builder builder) {
        this.pageBean = builder.pageBean;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertEventsResponseBody create() {
        return builder().build();
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
        private PageBean pageBean; 
        private String requestId; 

        /**
         * <p>The returned struct.</p>
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2FC13182-B9AF-4E6B-BE51-72669B7C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAlertEventsResponseBody build() {
            return new ListAlertEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAlertEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertEventsResponseBody</p>
     */
    public static class Alarms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmId")
        private Long alarmId;

        @com.aliyun.core.annotation.NameInMap("AlarmName")
        private String alarmName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private Integer state;

        private Alarms(Builder builder) {
            this.alarmId = builder.alarmId;
            this.alarmName = builder.alarmName;
            this.createTime = builder.createTime;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Alarms create() {
            return builder().build();
        }

        /**
         * @return alarmId
         */
        public Long getAlarmId() {
            return this.alarmId;
        }

        /**
         * @return alarmName
         */
        public String getAlarmName() {
            return this.alarmName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return state
         */
        public Integer getState() {
            return this.state;
        }

        public static final class Builder {
            private Long alarmId; 
            private String alarmName; 
            private String createTime; 
            private Integer state; 

            /**
             * <p>The ID of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>77444</p>
             */
            public Builder alarmId(Long alarmId) {
                this.alarmId = alarmId;
                return this;
            }

            /**
             * <p>The name of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>Test-triggered alert</p>
             */
            public Builder alarmName(String alarmName) {
                this.alarmName = alarmName;
                return this;
            }

            /**
             * <p>The time when the alert was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-20 07:10:18</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The status of the alert. Valid values:</p>
             * <ul>
             * <li>0: The alert is pending.</li>
             * <li>1: The alert is being handled.</li>
             * <li>2: The alert is cleared.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder state(Integer state) {
                this.state = state;
                return this;
            }

            public Alarms build() {
                return new Alarms(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAlertEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertEventsResponseBody</p>
     */
    public static class NotificationPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private NotificationPolicies(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotificationPolicies create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private String name; 

            /**
             * <p>The ID of the notification policy.</p>
             * 
             * <strong>example:</strong>
             * <p>646093</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the notification policy.</p>
             * 
             * <strong>example:</strong>
             * <p>P1 alert notification policy</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public NotificationPolicies build() {
                return new NotificationPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAlertEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertEventsResponseBody</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alarms")
        private java.util.List < Alarms> alarms;

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

        @com.aliyun.core.annotation.NameInMap("HandlerName")
        private String handlerName;

        @com.aliyun.core.annotation.NameInMap("IntegrationName")
        private String integrationName;

        @com.aliyun.core.annotation.NameInMap("IntegrationType")
        private String integrationType;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private String labels;

        @com.aliyun.core.annotation.NameInMap("NotificationPolicies")
        private java.util.List < NotificationPolicies> notificationPolicies;

        @com.aliyun.core.annotation.NameInMap("ReceiveTime")
        private String receiveTime;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TriggerCount")
        private Long triggerCount;

        private Events(Builder builder) {
            this.alarms = builder.alarms;
            this.alertName = builder.alertName;
            this.annotations = builder.annotations;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.generatorURL = builder.generatorURL;
            this.handlerName = builder.handlerName;
            this.integrationName = builder.integrationName;
            this.integrationType = builder.integrationType;
            this.labels = builder.labels;
            this.notificationPolicies = builder.notificationPolicies;
            this.receiveTime = builder.receiveTime;
            this.severity = builder.severity;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.triggerCount = builder.triggerCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return alarms
         */
        public java.util.List < Alarms> getAlarms() {
            return this.alarms;
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
         * @return handlerName
         */
        public String getHandlerName() {
            return this.handlerName;
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
         * @return notificationPolicies
         */
        public java.util.List < NotificationPolicies> getNotificationPolicies() {
            return this.notificationPolicies;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return triggerCount
         */
        public Long getTriggerCount() {
            return this.triggerCount;
        }

        public static final class Builder {
            private java.util.List < Alarms> alarms; 
            private String alertName; 
            private String annotations; 
            private String description; 
            private String endTime; 
            private String generatorURL; 
            private String handlerName; 
            private String integrationName; 
            private String integrationType; 
            private String labels; 
            private java.util.List < NotificationPolicies> notificationPolicies; 
            private String receiveTime; 
            private String severity; 
            private String startTime; 
            private String status; 
            private Long triggerCount; 

            /**
             * <p>The associated alerts.</p>
             */
            public Builder alarms(java.util.List < Alarms> alarms) {
                this.alarms = alarms;
                return this;
            }

            /**
             * <p>The name of the alert.</p>
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
             * <p>[{&quot;Name&quot;:&quot;annotation-a&quot;,&quot;Value&quot;:&quot;annotation a value&quot;}]</p>
             */
            public Builder annotations(String annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * <p>The description of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The end time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-20 17:42:16</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The URL of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx.xx/">https://xxx.xx/</a></p>
             */
            public Builder generatorURL(String generatorURL) {
                this.generatorURL = generatorURL;
                return this;
            }

            /**
             * <p>The user who handled the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>Tom</p>
             */
            public Builder handlerName(String handlerName) {
                this.handlerName = handlerName;
                return this;
            }

            /**
             * <p>The name of the alert integration.</p>
             * 
             * <strong>example:</strong>
             * <p>Custom integration</p>
             */
            public Builder integrationName(String integrationName) {
                this.integrationName = integrationName;
                return this;
            }

            /**
             * <p>The type of the alert integration.</p>
             * 
             * <strong>example:</strong>
             * <p>CUSTOM</p>
             */
            public Builder integrationType(String integrationType) {
                this.integrationType = integrationType;
                return this;
            }

            /**
             * <p>The tags.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;name&quot;:&quot;severity&quot;,&quot;value&quot;:&quot;error&quot;}]</p>
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The associated notification policies.</p>
             */
            public Builder notificationPolicies(java.util.List < NotificationPolicies> notificationPolicies) {
                this.notificationPolicies = notificationPolicies;
                return this;
            }

            /**
             * <p>The time when the alert event was received.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-20 17:42:16</p>
             */
            public Builder receiveTime(String receiveTime) {
                this.receiveTime = receiveTime;
                return this;
            }

            /**
             * <p>The severity level of the alert. Valid values:</p>
             * <ul>
             * <li>critical: P1</li>
             * <li>error: P2</li>
             * <li>warning: P3</li>
             * <li>page: P4</li>
             * <li>default: P6</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>critical</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-20 17:42:16</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the alert event. Valid values:</p>
             * <ul>
             * <li>Active</li>
             * <li>Silenced</li>
             * <li>Resolved</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The number of times the event is triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder triggerCount(Long triggerCount) {
                this.triggerCount = triggerCount;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAlertEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertEventsResponseBody</p>
     */
    public static class PageBean extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Events")
        private java.util.List < Events> events;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Long page;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private PageBean(Builder builder) {
            this.events = builder.events;
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
         * @return events
         */
        public java.util.List < Events> getEvents() {
            return this.events;
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
            private java.util.List < Events> events; 
            private Long page; 
            private Long size; 
            private Long total; 

            /**
             * <p>The queried historical alert events.</p>
             */
            public Builder events(java.util.List < Events> events) {
                this.events = events;
                return this;
            }

            /**
             * <p>The number of the page returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The total number of returned entries.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
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
