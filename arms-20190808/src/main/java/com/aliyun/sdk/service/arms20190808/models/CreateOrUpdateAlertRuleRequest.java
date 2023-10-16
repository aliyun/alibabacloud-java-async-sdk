// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateAlertRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateAlertRuleRequest</p>
 */
public class CreateOrUpdateAlertRuleRequest extends Request {
    @Body
    @NameInMap("AlertCheckType")
    private String alertCheckType;

    @Body
    @NameInMap("AlertGroup")
    private Long alertGroup;

    @Body
    @NameInMap("AlertId")
    private Long alertId;

    @Body
    @NameInMap("AlertName")
    @Validation(required = true)
    private String alertName;

    @Body
    @NameInMap("AlertPiplines")
    private String alertPiplines;

    @Body
    @NameInMap("AlertRuleContent")
    private String alertRuleContent;

    @Body
    @NameInMap("AlertStatus")
    private String alertStatus;

    @Body
    @NameInMap("AlertType")
    @Validation(required = true)
    private String alertType;

    @Body
    @NameInMap("Annotations")
    private String annotations;

    @Body
    @NameInMap("AutoAddNewApplication")
    private Boolean autoAddNewApplication;

    @Body
    @NameInMap("ClusterId")
    private String clusterId;

    @Body
    @NameInMap("DataConfig")
    private String dataConfig;

    @Body
    @NameInMap("Duration")
    private Long duration;

    @Body
    @NameInMap("Filters")
    private String filters;

    @Body
    @NameInMap("Labels")
    private String labels;

    @Body
    @NameInMap("Level")
    private String level;

    @Body
    @NameInMap("MarkTags")
    private java.util.List < MarkTags> markTags;

    @Body
    @NameInMap("Message")
    private String message;

    @Body
    @NameInMap("MetricsKey")
    private String metricsKey;

    @Body
    @NameInMap("MetricsType")
    private String metricsType;

    @Body
    @NameInMap("Notice")
    private String notice;

    @Body
    @NameInMap("NotifyMode")
    private String notifyMode;

    @Body
    @NameInMap("NotifyStrategy")
    private String notifyStrategy;

    @Body
    @NameInMap("Pids")
    private String pids;

    @Body
    @NameInMap("PromQL")
    private String promQL;

    @Body
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    private CreateOrUpdateAlertRuleRequest(Builder builder) {
        super(builder);
        this.alertCheckType = builder.alertCheckType;
        this.alertGroup = builder.alertGroup;
        this.alertId = builder.alertId;
        this.alertName = builder.alertName;
        this.alertPiplines = builder.alertPiplines;
        this.alertRuleContent = builder.alertRuleContent;
        this.alertStatus = builder.alertStatus;
        this.alertType = builder.alertType;
        this.annotations = builder.annotations;
        this.autoAddNewApplication = builder.autoAddNewApplication;
        this.clusterId = builder.clusterId;
        this.dataConfig = builder.dataConfig;
        this.duration = builder.duration;
        this.filters = builder.filters;
        this.labels = builder.labels;
        this.level = builder.level;
        this.markTags = builder.markTags;
        this.message = builder.message;
        this.metricsKey = builder.metricsKey;
        this.metricsType = builder.metricsType;
        this.notice = builder.notice;
        this.notifyMode = builder.notifyMode;
        this.notifyStrategy = builder.notifyStrategy;
        this.pids = builder.pids;
        this.promQL = builder.promQL;
        this.regionId = builder.regionId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateAlertRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertCheckType
     */
    public String getAlertCheckType() {
        return this.alertCheckType;
    }

    /**
     * @return alertGroup
     */
    public Long getAlertGroup() {
        return this.alertGroup;
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
     * @return alertPiplines
     */
    public String getAlertPiplines() {
        return this.alertPiplines;
    }

    /**
     * @return alertRuleContent
     */
    public String getAlertRuleContent() {
        return this.alertRuleContent;
    }

    /**
     * @return alertStatus
     */
    public String getAlertStatus() {
        return this.alertStatus;
    }

    /**
     * @return alertType
     */
    public String getAlertType() {
        return this.alertType;
    }

    /**
     * @return annotations
     */
    public String getAnnotations() {
        return this.annotations;
    }

    /**
     * @return autoAddNewApplication
     */
    public Boolean getAutoAddNewApplication() {
        return this.autoAddNewApplication;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dataConfig
     */
    public String getDataConfig() {
        return this.dataConfig;
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return filters
     */
    public String getFilters() {
        return this.filters;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return markTags
     */
    public java.util.List < MarkTags> getMarkTags() {
        return this.markTags;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return metricsKey
     */
    public String getMetricsKey() {
        return this.metricsKey;
    }

    /**
     * @return metricsType
     */
    public String getMetricsType() {
        return this.metricsType;
    }

    /**
     * @return notice
     */
    public String getNotice() {
        return this.notice;
    }

    /**
     * @return notifyMode
     */
    public String getNotifyMode() {
        return this.notifyMode;
    }

    /**
     * @return notifyStrategy
     */
    public String getNotifyStrategy() {
        return this.notifyStrategy;
    }

    /**
     * @return pids
     */
    public String getPids() {
        return this.pids;
    }

    /**
     * @return promQL
     */
    public String getPromQL() {
        return this.promQL;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateAlertRuleRequest, Builder> {
        private String alertCheckType; 
        private Long alertGroup; 
        private Long alertId; 
        private String alertName; 
        private String alertPiplines; 
        private String alertRuleContent; 
        private String alertStatus; 
        private String alertType; 
        private String annotations; 
        private Boolean autoAddNewApplication; 
        private String clusterId; 
        private String dataConfig; 
        private Long duration; 
        private String filters; 
        private String labels; 
        private String level; 
        private java.util.List < MarkTags> markTags; 
        private String message; 
        private String metricsKey; 
        private String metricsType; 
        private String notice; 
        private String notifyMode; 
        private String notifyStrategy; 
        private String pids; 
        private String promQL; 
        private String regionId; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateAlertRuleRequest request) {
            super(request);
            this.alertCheckType = request.alertCheckType;
            this.alertGroup = request.alertGroup;
            this.alertId = request.alertId;
            this.alertName = request.alertName;
            this.alertPiplines = request.alertPiplines;
            this.alertRuleContent = request.alertRuleContent;
            this.alertStatus = request.alertStatus;
            this.alertType = request.alertType;
            this.annotations = request.annotations;
            this.autoAddNewApplication = request.autoAddNewApplication;
            this.clusterId = request.clusterId;
            this.dataConfig = request.dataConfig;
            this.duration = request.duration;
            this.filters = request.filters;
            this.labels = request.labels;
            this.level = request.level;
            this.markTags = request.markTags;
            this.message = request.message;
            this.metricsKey = request.metricsKey;
            this.metricsType = request.metricsType;
            this.notice = request.notice;
            this.notifyMode = request.notifyMode;
            this.notifyStrategy = request.notifyStrategy;
            this.pids = request.pids;
            this.promQL = request.promQL;
            this.regionId = request.regionId;
            this.tags = request.tags;
        } 

        /**
         * The alert check type of the Prometheus alert rule. Valid values:
         * <p>
         * 
         * *   STATIC: a static threshold value. If you set the parameter to STATIC, you must specify the **MetricsKey** parameter. For more information, see the **Correspondence between AlertGroup and MetricsKey for Prometheus Service** table.
         * *   CUSTOM: a custom PromQL statement. If you set the parameter to CUSTOM, you must specify the **PromQL**, **Duration**, and **Message** parameters to create a Prometheus alert rule.
         */
        public Builder alertCheckType(String alertCheckType) {
            this.putBodyParameter("AlertCheckType", alertCheckType);
            this.alertCheckType = alertCheckType;
            return this;
        }

        /**
         * The alert contact group ID of the Prometheus alert rule. Valid values:
         * <p>
         * 
         * *   \-1: custom PromQL
         * *   1: Kubernetes load
         * *   15: Kubernetes node
         */
        public Builder alertGroup(Long alertGroup) {
            this.putBodyParameter("AlertGroup", alertGroup);
            this.alertGroup = alertGroup;
            return this;
        }

        /**
         * The ID of the alert rule.
         * <p>
         * 
         * *   If you do not specify this parameter, a new alert rule is created.
         * *   If you specify this parameter, the specified alert rule is modified.
         */
        public Builder alertId(Long alertId) {
            this.putBodyParameter("AlertId", alertId);
            this.alertId = alertId;
            return this;
        }

        /**
         * The name of the alert rule.
         */
        public Builder alertName(String alertName) {
            this.putBodyParameter("AlertName", alertName);
            this.alertName = alertName;
            return this;
        }

        /**
         * AlertPiplines.
         */
        public Builder alertPiplines(String alertPiplines) {
            this.putBodyParameter("AlertPiplines", alertPiplines);
            this.alertPiplines = alertPiplines;
            return this;
        }

        /**
         * The content of the Application Monitoring or Browser Monitoring alert rule. The following code provides an example of the **AlertRuleContent** parameter. For more information about the meaning of each field, see the supplementary description.
         * <p>
         * 
         * ```json
         * { 
         *     "Condition": "OR", 
         *      "AlertRuleItems": [ 
         *              { "Operator": "CURRENT_LTE",
         *                  "MetricKey": "appstat.jvm.threadcount", 
         *                  "Value": 1000, 
         *                  "Aggregate": "AVG",
         *                   "N": 1
         *             } 
         *        ]  
         *   }
         * ```
         * 
         * > The conditional fields vary depending on the values of the **MetricsType** and **AlertRuleItems.MetricKey** parameters. For more information about the types of metrics supported by Application Monitoring and Browser Monitoring and the alert rule fields corresponding to each metric, see the supplementary description.
         */
        public Builder alertRuleContent(String alertRuleContent) {
            this.putBodyParameter("AlertRuleContent", alertRuleContent);
            this.alertRuleContent = alertRuleContent;
            return this;
        }

        /**
         * The status of the alert rule. Valid values:
         * <p>
         * 
         * *   RUNNING (default)
         * *   STOPPED
         */
        public Builder alertStatus(String alertStatus) {
            this.putBodyParameter("AlertStatus", alertStatus);
            this.alertStatus = alertStatus;
            return this;
        }

        /**
         * The type of the alert rule. Valid values:
         * <p>
         * 
         * *   APPLICATION_MONITORING_ALERT_RULE: alert rule for Application Monitoring
         * *   BROWSER_MONITORING_ALERT_RULE: alert rule for Browser Monitoring
         * *   PROMETHEUS_MONITORING_ALERT_RULE: alert rule for Prometheus Service
         * 
         * Valid values:
         * 
         * *   PROMETHEUS_MONITORING_ALERT_RULE
         * *   APPLICATION_MONITORING_ALERT_RULE
         * *   BROWSER_MONITORING_ALERT_RULE
         * *   prometheus monitoring alert
         * *   application monitoring alert
         * *   browser monitoring alert
         */
        public Builder alertType(String alertType) {
            this.putBodyParameter("AlertType", alertType);
            this.alertType = alertType;
            return this;
        }

        /**
         * The annotations of the Prometheus alert rule.
         */
        public Builder annotations(String annotations) {
            this.putBodyParameter("Annotations", annotations);
            this.annotations = annotations;
            return this;
        }

        /**
         * Specifies whether to apply the alert rule to new applications that are created in Application Monitoring or Browser Monitoring. Valid values:
         * <p>
         * 
         * *   `true`: enables the health check feature.
         * *   `false`: disables the automatic backup feature.
         */
        public Builder autoAddNewApplication(Boolean autoAddNewApplication) {
            this.putBodyParameter("AutoAddNewApplication", autoAddNewApplication);
            this.autoAddNewApplication = autoAddNewApplication;
            return this;
        }

        /**
         * The ID of the monitored cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * DataConfig.
         */
        public Builder dataConfig(String dataConfig) {
            this.putBodyParameter("DataConfig", dataConfig);
            this.dataConfig = dataConfig;
            return this;
        }

        /**
         * The duration of the Prometheus alert rule. Unit: minutes.
         */
        public Builder duration(Long duration) {
            this.putBodyParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * The filter conditions of the Application Monitoring or Browser Monitoring alert rule. The following code shows the format of matching rules:
         * <p>
         * 
         *     "DimFilters": [ 
         *     { 
         *      "FilterOpt": "ALL",
         *      "FilterValues": [],         // The value of the filter condition. 
         *      "FilterKey": "rootIp"     // The key of the filter condition. 
         *     }
         *     ]
         * 
         * Valid values of **FilterOpt**:
         * 
         * *   STATIC: matches the value of the specified dimension.
         * *   ALL: matches the values of all dimensions.
         * *   DISABLE: aggregates the values of all dimensions.
         */
        public Builder filters(String filters) {
            this.putBodyParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * The tags of the Prometheus alert rule.
         */
        public Builder labels(String labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * The severity level of the Prometheus alert rule.
         * <p>
         * 
         * *   P1: Alert notifications are sent for major issues that affect the availability of core business, have a huge impact, and may lead to serious consequences.
         * *   P2: Alert notifications are sent for service errors that affect the system availability with relatively limited impact.
         * *   P3: Alert notifications are sent for issues that may cause service errors or negative effects, or alert notifications for services that are relatively less important.
         * *   P4: Alert notifications are sent for low-priority issues that do not affect your business.
         * *   Default: Alert notifications are sent regardless of alert levels.
         */
        public Builder level(String level) {
            this.putBodyParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * MarkTags.
         */
        public Builder markTags(java.util.List < MarkTags> markTags) {
            this.putBodyParameter("MarkTags", markTags);
            this.markTags = markTags;
            return this;
        }

        /**
         * The alert message of the Prometheus alert rule.
         */
        public Builder message(String message) {
            this.putBodyParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * The alert metrics. If you set the **AlertCheckType** parameter to **STATIC** when you create a Prometheus alert rule, you must specify the **MetricsKey** parameter.
         * <p>
         * 
         * > Alert metrics vary depending on the value of the **AlertGroup** parameter. For more information about the correspondence between **AlertGroup** and **MetricsKey**, see the supplementary description.
         */
        public Builder metricsKey(String metricsKey) {
            this.putBodyParameter("MetricsKey", metricsKey);
            this.metricsKey = metricsKey;
            return this;
        }

        /**
         * The metric type of the Application Monitoring or Browser Monitoring alert rule. For more information, see the following table.
         */
        public Builder metricsType(String metricsType) {
            this.putBodyParameter("MetricsType", metricsType);
            this.metricsType = metricsType;
            return this;
        }

        /**
         * Notice.
         */
        public Builder notice(String notice) {
            this.putBodyParameter("Notice", notice);
            this.notice = notice;
            return this;
        }

        /**
         * NotifyMode.
         */
        public Builder notifyMode(String notifyMode) {
            this.putBodyParameter("NotifyMode", notifyMode);
            this.notifyMode = notifyMode;
            return this;
        }

        /**
         * The notification policy.
         * <p>
         * 
         * *   If you set this parameter to null, no notification policy is specified. After you create an alert rule, you can create a notification policy and specify match rules and match conditions. For example, you can specify the name of the alert rule as the match condition. When the alert rule is triggered, an alert event is generated and an alert notification is sent to the contacts or contact groups that are specified in the notification policy.
         * *   To specify a notification policy, set this parameter to the ID of the notification policy. Application Real-Time Monitoring Service (ARMS) automatically adds a match rule to the notification policy and specifies the ID of the alert rule as the match condition. The name of the alert rule is also displayed. This way, the alert events that are generated based on the alert rule can be matched by the specified notification policy.
         */
        public Builder notifyStrategy(String notifyStrategy) {
            this.putBodyParameter("NotifyStrategy", notifyStrategy);
            this.notifyStrategy = notifyStrategy;
            return this;
        }

        /**
         * The process ID (PID) that is associated with the Application Monitoring or Browser Monitoring alert rule.
         */
        public Builder pids(String pids) {
            this.putBodyParameter("Pids", pids);
            this.pids = pids;
            return this;
        }

        /**
         * The PromQL statement of the Prometheus alert rule.
         */
        public Builder promQL(String promQL) {
            this.putBodyParameter("PromQL", promQL);
            this.promQL = promQL;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateOrUpdateAlertRuleRequest build() {
            return new CreateOrUpdateAlertRuleRequest(this);
        } 

    } 

    public static class MarkTags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private MarkTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MarkTags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MarkTags build() {
                return new MarkTags(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
