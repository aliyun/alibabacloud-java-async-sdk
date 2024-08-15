// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateAlertRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateAlertRuleRequest</p>
 */
public class CreateOrUpdateAlertRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertCheckType")
    private String alertCheckType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertGroup")
    private Long alertGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertId")
    private Long alertId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alertName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertPiplines")
    private String alertPiplines;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertRuleContent")
    private String alertRuleContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertStatus")
    private String alertStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alertType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Annotations")
    private String annotations;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoAddNewApplication")
    private Boolean autoAddNewApplication;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoAddTargetConfig")
    private String autoAddTargetConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataConfig")
    private String dataConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Long duration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Filters")
    private String filters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private String labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Level")
    private String level;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MarkTags")
    private java.util.List < MarkTags> markTags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetricsKey")
    private String metricsKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetricsType")
    private String metricsType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Notice")
    private String notice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NotifyMode")
    private String notifyMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NotifyStrategy")
    private String notifyStrategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Pids")
    private String pids;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PromQL")
    private String promQL;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
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
        this.autoAddTargetConfig = builder.autoAddTargetConfig;
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
        this.product = builder.product;
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
     * @return autoAddTargetConfig
     */
    public String getAutoAddTargetConfig() {
        return this.autoAddTargetConfig;
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
     * @return product
     */
    public String getProduct() {
        return this.product;
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
        private String autoAddTargetConfig; 
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
        private String product; 
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
            this.autoAddTargetConfig = request.autoAddTargetConfig;
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
            this.product = request.product;
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
         * The configuration of the alert sending channel. This parameter is used to be compatible with the old version of the rule.
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
         *                   "N": 10,
         *                   "Tolerability": 169
         *             } 
         *        ]  
         *   }
         * ```
         * 
         * >  The filter conditions specified by the **AlertRuleItems.MetricKey** field depends on the value of the **MetricsType** parameter. For more information about the types of metrics supported by Application Monitoring and Browser Monitoring and the alert rule fields corresponding to each metric, see the supplementary description.
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
         * *   PROMETHEUS_MONITORING_ALERT_RULE: alert rule for Managed Service for Prometheus
         * *   XTRACE_MONITORING_ALERT_RULE: alert rule for Managed Service for OpenTelemetry
         * *   EBPF_MONITORING_ALERT_RULE: alert rule for Application Monitoring eBPF Edition
         * *   RUM_MONITORING_ALERT_RULE: alert rule for Real User Monitoring
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
         * The configurations that are automatically appended to monitor the application based on the specified alert rule. autoAddMatchType: the matching mode. Valid values: REGULAR and NOT_REGULAR. autoAddMatchExp: the regular expression
         */
        public Builder autoAddTargetConfig(String autoAddTargetConfig) {
            this.putBodyParameter("AutoAddTargetConfig", autoAddTargetConfig);
            this.autoAddTargetConfig = autoAddTargetConfig;
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
         * Data Configuration. The dataRevision field specifies the data repair method when there is no data for the metric.
         * <p>
         * 
         * - Fill with zero: 0
         * - Fill with one: 1
         * - Fill with null: 2 (default, does not trigger an alarm)
         */
        public Builder dataConfig(String dataConfig) {
            this.putBodyParameter("DataConfig", dataConfig);
            this.dataConfig = dataConfig;
            return this;
        }

        /**
         * The duration of the Prometheus alert rule, in minutes, in the range of [0,1440].
         */
        public Builder duration(Long duration) {
            this.putBodyParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * The filter conditions of the Application Monitoring or Browser Monitoring alert rule. Format:
         * <p>
         * 
         *     "DimFilters": [ 
         *     { 
         *      "FilterOpt": "ALL",
         *     "FilterValues": [],         //The value of the filter condition.
         *     "FilterKey": "rootIp"     //The key of the filter condition.
         *     }
         *     ]
         * 
         * Valid values of **FilterOpt**:
         * 
         * *   STATIC: matches the value of the specified dimension.
         * *   ALL: traverses all dimension values. Dynamic thresholds do not support traversal.
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
         * Application Tags. Used for application monitoring alert rules, to filter applications associated with alert rules.
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
         * The effective time and notification time. This parameter is used to be compatible with the old version of the rule.
         */
        public Builder notice(String notice) {
            this.putBodyParameter("Notice", notice);
            this.notice = notice;
            return this;
        }

        /**
         * The notification mode. You can specify the normal mode or simple mode.
         * <p>
         * 
         * Valid values:
         * 
         * *   DIRECTED_MODE
         * *   NORMAL_MODE
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
         * When creating a Prometheus alert rule, the backend will verify whether this product exists, which is used to distinguish cloud product filtering queries.
         */
        public Builder product(String product) {
            this.putBodyParameter("Product", product);
            this.product = product;
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
         * The list of tags.
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
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * The Tag Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The Tag Value.
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
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
