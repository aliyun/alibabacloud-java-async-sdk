// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListActivatedAlertsResponseBody} extends {@link TeaModel}
 *
 * <p>ListActivatedAlertsResponseBody</p>
 */
public class ListActivatedAlertsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Page")
    private Page page;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListActivatedAlertsResponseBody(Builder builder) {
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
        private Page page; 
        private String requestId; 

        /**
         * The struct returned.
         */
        public Builder page(Page page) {
            this.page = page;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListActivatedAlertsResponseBody build() {
            return new ListActivatedAlertsResponseBody(this);
        } 

    } 

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
             * The ID of the notification policy.
             */
            public Builder ruleId(Integer ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The name of the notification policy.
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
             * The ID of the alert rule.
             */
            public Builder alertId(String alertId) {
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
             * The type of the alert.
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * The number of times that the alert event was received.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The timestamp when the alert rule was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The notification policies.
             */
            public Builder dispatchRules(java.util.List < DispatchRules> dispatchRules) {
                this.dispatchRules = dispatchRules;
                return this;
            }

            /**
             * The timestamp when the alert was ended.
             */
            public Builder endsAt(Long endsAt) {
                this.endsAt = endsAt;
                return this;
            }

            /**
             * The extended fields that indicate the following tags:
             * <p>
             * 
             * *   The tags that are carried in the metrics of the alert rule expression.
             * *   The tags that are created based on the alert rule.
             * *   The default tags of Application Real-Time Monitoring Service (ARMS).
             */
            public Builder expandFields(java.util.Map < String, ? > expandFields) {
                this.expandFields = expandFields;
                return this;
            }

            /**
             * The name of the object that is associated with the alert.
             */
            public Builder integrationName(String integrationName) {
                this.integrationName = integrationName;
                return this;
            }

            /**
             * The type of the service integration that generated the alert.
             */
            public Builder integrationType(String integrationType) {
                this.integrationType = integrationType;
                return this;
            }

            /**
             * The type of the object that is associated with the alert.
             */
            public Builder involvedObjectKind(String involvedObjectKind) {
                this.involvedObjectKind = involvedObjectKind;
                return this;
            }

            /**
             * The name of the service integration that generated the alert.
             */
            public Builder involvedObjectName(String involvedObjectName) {
                this.involvedObjectName = involvedObjectName;
                return this;
            }

            /**
             * The description of the alert.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The level of the alert. Valid values:
             * <p>
             * 
             * *   `critical`
             * *   `error`
             * *   `warn`
             * *   `page`
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * The timestamp when the alert was generated.
             */
            public Builder startsAt(Long startsAt) {
                this.startsAt = startsAt;
                return this;
            }

            /**
             * The status of the alert. Valid values:
             * <p>
             * 
             * *   `Active`
             * *   `Inhibited`
             * *   `Silenced`
             * *   `Resolved`
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
             * The alerts that have been triggered.
             */
            public Builder alerts(java.util.List < Alerts> alerts) {
                this.alerts = alerts;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
