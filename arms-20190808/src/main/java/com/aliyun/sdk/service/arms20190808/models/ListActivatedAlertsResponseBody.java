// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListActivatedAlertsResponseBody} extends {@link TeaModel}
 *
 * <p>ListActivatedAlertsResponseBody</p>
 */
public class ListActivatedAlertsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Page page;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListActivatedAlertsResponseBody(Builder builder) {
        this.message = builder.message;
        this.page = builder.page;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListActivatedAlertsResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String message; 
        private Page page; 
        private String requestId; 

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The struct returned.</p>
         */
        public Builder page(Page page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BDB74B8F-4123-482A-ABB7-7F440349****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListActivatedAlertsResponseBody build() {
            return new ListActivatedAlertsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListActivatedAlertsResponseBody} extends {@link TeaModel}
     *
     * <p>ListActivatedAlertsResponseBody</p>
     */
    public static class DispatchRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Integer ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private DispatchRules(Builder builder) {
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DispatchRules create() {
            return builder().build();
        }

        /**
         * @return ruleId
         */
        public Integer getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private Integer ruleId; 
            private String ruleName; 

            /**
             * <p>The ID of the notification policy.</p>
             * 
             * <strong>example:</strong>
             * <p>7021</p>
             */
            public Builder ruleId(Integer ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the notification policy.</p>
             * 
             * <strong>example:</strong>
             * <p>NotificationPolicy1</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public DispatchRules build() {
                return new DispatchRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListActivatedAlertsResponseBody} extends {@link TeaModel}
     *
     * <p>ListActivatedAlertsResponseBody</p>
     */
    public static class Alerts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertId")
        private String alertId;

        @com.aliyun.core.annotation.NameInMap("AlertName")
        private String alertName;

        @com.aliyun.core.annotation.NameInMap("AlertType")
        private String alertType;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DispatchRules")
        private java.util.List < DispatchRules> dispatchRules;

        @com.aliyun.core.annotation.NameInMap("EndsAt")
        private Long endsAt;

        @com.aliyun.core.annotation.NameInMap("ExpandFields")
        private java.util.Map < String, ? > expandFields;

        @com.aliyun.core.annotation.NameInMap("IntegrationName")
        private String integrationName;

        @com.aliyun.core.annotation.NameInMap("IntegrationType")
        private String integrationType;

        @com.aliyun.core.annotation.NameInMap("InvolvedObjectKind")
        private String involvedObjectKind;

        @com.aliyun.core.annotation.NameInMap("InvolvedObjectName")
        private String involvedObjectName;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("StartsAt")
        private Long startsAt;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Alerts(Builder builder) {
            this.alertId = builder.alertId;
            this.alertName = builder.alertName;
            this.alertType = builder.alertType;
            this.count = builder.count;
            this.createTime = builder.createTime;
            this.dispatchRules = builder.dispatchRules;
            this.endsAt = builder.endsAt;
            this.expandFields = builder.expandFields;
            this.integrationName = builder.integrationName;
            this.integrationType = builder.integrationType;
            this.involvedObjectKind = builder.involvedObjectKind;
            this.involvedObjectName = builder.involvedObjectName;
            this.message = builder.message;
            this.severity = builder.severity;
            this.startsAt = builder.startsAt;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Alerts create() {
            return builder().build();
        }

        /**
         * @return alertId
         */
        public String getAlertId() {
            return this.alertId;
        }

        /**
         * @return alertName
         */
        public String getAlertName() {
            return this.alertName;
        }

        /**
         * @return alertType
         */
        public String getAlertType() {
            return this.alertType;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dispatchRules
         */
        public java.util.List < DispatchRules> getDispatchRules() {
            return this.dispatchRules;
        }

        /**
         * @return endsAt
         */
        public Long getEndsAt() {
            return this.endsAt;
        }

        /**
         * @return expandFields
         */
        public java.util.Map < String, ? > getExpandFields() {
            return this.expandFields;
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
         * @return involvedObjectKind
         */
        public String getInvolvedObjectKind() {
            return this.involvedObjectKind;
        }

        /**
         * @return involvedObjectName
         */
        public String getInvolvedObjectName() {
            return this.involvedObjectName;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return startsAt
         */
        public Long getStartsAt() {
            return this.startsAt;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String alertId; 
            private String alertName; 
            private String alertType; 
            private Integer count; 
            private Long createTime; 
            private java.util.List < DispatchRules> dispatchRules; 
            private Long endsAt; 
            private java.util.Map < String, ? > expandFields; 
            private String integrationName; 
            private String integrationType; 
            private String involvedObjectKind; 
            private String involvedObjectName; 
            private String message; 
            private String severity; 
            private Long startsAt; 
            private String status; 

            /**
             * <p>The ID of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>3888704</p>
             */
            public Builder alertId(String alertId) {
                this.alertId = alertId;
                return this;
            }

            /**
             * <p>The name of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Container CPU usage is greater than 80%</p>
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * <p>The type of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>PROMETHEUS_MONITORING_ALERT_RULE</p>
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * <p>The number of times that the alert event was received.</p>
             * 
             * <strong>example:</strong>
             * <p>598</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The timestamp when the alert rule was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1616466300000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The notification policies.</p>
             */
            public Builder dispatchRules(java.util.List < DispatchRules> dispatchRules) {
                this.dispatchRules = dispatchRules;
                return this;
            }

            /**
             * <p>The timestamp when the alert was ended.</p>
             * 
             * <strong>example:</strong>
             * <p>1616502540000</p>
             */
            public Builder endsAt(Long endsAt) {
                this.endsAt = endsAt;
                return this;
            }

            /**
             * <p>The extended fields that indicate the following tags:</p>
             * <ul>
             * <li>The tags that are carried in the metrics of the alert rule expression.</li>
             * <li>The tags that are created based on the alert rule.</li>
             * <li>The default tags of Application Real-Time Monitoring Service (ARMS).</li>
             * </ul>
             */
            public Builder expandFields(java.util.Map < String, ? > expandFields) {
                this.expandFields = expandFields;
                return this;
            }

            /**
             * <p>The name of the object that is associated with the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>testphp2</p>
             */
            public Builder integrationName(String integrationName) {
                this.integrationName = integrationName;
                return this;
            }

            /**
             * <p>The type of the service integration that generated the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>PROMETHEUS</p>
             */
            public Builder integrationType(String integrationType) {
                this.integrationType = integrationType;
                return this;
            }

            /**
             * <p>The type of the object that is associated with the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster</p>
             */
            public Builder involvedObjectKind(String involvedObjectKind) {
                this.involvedObjectKind = involvedObjectKind;
                return this;
            }

            /**
             * <p>The name of the service integration that generated the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>Test integration-prometheus</p>
             */
            public Builder involvedObjectName(String involvedObjectName) {
                this.involvedObjectName = involvedObjectName;
                return this;
            }

            /**
             * <p>The description of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>Alarm name: PodRestart_testphp2,\n Pod night-test-group-1-1-5f5d6f4d84-pszns is restart, Value: 133.33%, 1.33%</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The level of the alert. Valid values:</p>
             * <ul>
             * <li><code>critical</code></li>
             * <li><code>error</code></li>
             * <li><code>warn</code></li>
             * <li><code>page</code></li>
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
             * <p>The timestamp when the alert was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>1616466300000</p>
             */
            public Builder startsAt(Long startsAt) {
                this.startsAt = startsAt;
                return this;
            }

            /**
             * <p>The status of the alert. Valid values:</p>
             * <ul>
             * <li><code>Active</code></li>
             * <li><code>Inhibited</code></li>
             * <li><code>Silenced</code></li>
             * <li><code>Resolved</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Alerts build() {
                return new Alerts(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListActivatedAlertsResponseBody} extends {@link TeaModel}
     *
     * <p>ListActivatedAlertsResponseBody</p>
     */
    public static class Page extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alerts")
        private java.util.List < Alerts> alerts;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Page(Builder builder) {
            this.alerts = builder.alerts;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
            return builder().build();
        }

        /**
         * @return alerts
         */
        public java.util.List < Alerts> getAlerts() {
            return this.alerts;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < Alerts> alerts; 
            private Integer page; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * <p>The alerts that have been triggered.</p>
             */
            public Builder alerts(java.util.List < Alerts> alerts) {
                this.alerts = alerts;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Page build() {
                return new Page(this);
            } 

        } 

    }
}
