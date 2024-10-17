// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The alert check type of the Prometheus alert rule. Valid values:</p>
         * <ul>
         * <li>STATIC: a static threshold value. If you set the parameter to STATIC, you must specify the <strong>MetricsKey</strong> parameter. For more information, see the <strong>Correspondence between AlertGroup and MetricsKey for Prometheus Service</strong> table.</li>
         * <li>CUSTOM: a custom PromQL statement. If you set the parameter to CUSTOM, you must specify the <strong>PromQL</strong>, <strong>Duration</strong>, and <strong>Message</strong> parameters to create a Prometheus alert rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STATIC</p>
         */
        public Builder alertCheckType(String alertCheckType) {
            this.putBodyParameter("AlertCheckType", alertCheckType);
            this.alertCheckType = alertCheckType;
            return this;
        }

        /**
         * <p>The alert contact group ID of the Prometheus alert rule. Valid values:</p>
         * <ul>
         * <li>-1: custom PromQL</li>
         * <li>1: Kubernetes load</li>
         * <li>15: Kubernetes node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder alertGroup(Long alertGroup) {
            this.putBodyParameter("AlertGroup", alertGroup);
            this.alertGroup = alertGroup;
            return this;
        }

        /**
         * <p>The ID of the alert rule.</p>
         * <ul>
         * <li>If you do not specify this parameter, a new alert rule is created.</li>
         * <li>If you specify this parameter, the specified alert rule is modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>546xxx</p>
         */
        public Builder alertId(Long alertId) {
            this.putBodyParameter("AlertId", alertId);
            this.alertId = alertId;
            return this;
        }

        /**
         * <p>The name of the alert rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Alert Rule Demo</p>
         */
        public Builder alertName(String alertName) {
            this.putBodyParameter("AlertName", alertName);
            this.alertName = alertName;
            return this;
        }

        /**
         * <p>The configuration of the alert sending channel. This parameter is used to be compatible with the old version of the rule.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder alertPiplines(String alertPiplines) {
            this.putBodyParameter("AlertPiplines", alertPiplines);
            this.alertPiplines = alertPiplines;
            return this;
        }

        /**
         * <p>The content of the Application Monitoring or Browser Monitoring alert rule. The following code provides an example of the <strong>AlertRuleContent</strong> parameter. For more information about the meaning of each field, see the supplementary description.</p>
         * <pre><code class="language-json">{ 
         *     &quot;Condition&quot;: &quot;OR&quot;,
         *      &quot;AlertRuleItems&quot;: [
         *              { &quot;Operator&quot;: &quot;CURRENT_LTE&quot;,
         *                  &quot;MetricKey&quot;: &quot;appstat.jvm.threadcount&quot;,
         *                  &quot;Value&quot;: 1000,
         *                  &quot;Aggregate&quot;: &quot;AVG&quot;,
         *                   &quot;N&quot;: 10,
         *                   &quot;Tolerability&quot;: 169
         *             } 
         *        ]  
         *   }
         * </code></pre>
         * <blockquote>
         * <p> The filter conditions specified by the <strong>AlertRuleItems.MetricKey</strong> field depends on the value of the <strong>MetricsType</strong> parameter. For more information about the types of metrics supported by Application Monitoring and Browser Monitoring and the alert rule fields corresponding to each metric, see the supplementary description.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;Condition&quot;: &quot;OR&quot;, &quot;AlertRuleItems&quot;: [ { &quot;Operator&quot;: &quot;CURRENT_LTE&quot;,  &quot;MetricKey&quot;: &quot;appstat.jvm.threadcount&quot;,  &quot;Value&quot;: 1000,  &quot;Aggregate&quot;: &quot;AVG&quot;,   &quot;N&quot;: 1  }  ]  }</p>
         */
        public Builder alertRuleContent(String alertRuleContent) {
            this.putBodyParameter("AlertRuleContent", alertRuleContent);
            this.alertRuleContent = alertRuleContent;
            return this;
        }

        /**
         * <p>The status of the alert rule. Valid values:</p>
         * <ul>
         * <li>RUNNING (default)</li>
         * <li>STOPPED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder alertStatus(String alertStatus) {
            this.putBodyParameter("AlertStatus", alertStatus);
            this.alertStatus = alertStatus;
            return this;
        }

        /**
         * <p>The type of the alert rule. Valid values:</p>
         * <ul>
         * <li>APPLICATION_MONITORING_ALERT_RULE: alert rule for Application Monitoring</li>
         * <li>BROWSER_MONITORING_ALERT_RULE: alert rule for Browser Monitoring</li>
         * <li>PROMETHEUS_MONITORING_ALERT_RULE: alert rule for Managed Service for Prometheus</li>
         * <li>XTRACE_MONITORING_ALERT_RULE: alert rule for Managed Service for OpenTelemetry</li>
         * <li>EBPF_MONITORING_ALERT_RULE: alert rule for Application Monitoring eBPF Edition</li>
         * <li>RUM_MONITORING_ALERT_RULE: alert rule for Real User Monitoring</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>APPLICATION_MONITORING_ALERT_RULE</p>
         */
        public Builder alertType(String alertType) {
            this.putBodyParameter("AlertType", alertType);
            this.alertType = alertType;
            return this;
        }

        /**
         * <p>The annotations of the Prometheus alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>[ { &quot;Value&quot;: &quot;PolarDB slow queries&quot;, &quot;Name&quot;: &quot;_aliyun_display_name&quot; }</p>
         */
        public Builder annotations(String annotations) {
            this.putBodyParameter("Annotations", annotations);
            this.annotations = annotations;
            return this;
        }

        /**
         * <p>Specifies whether to apply the alert rule to new applications that are created in Application Monitoring or Browser Monitoring. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables the health check feature.</li>
         * <li><code>false</code>: disables the automatic backup feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoAddNewApplication(Boolean autoAddNewApplication) {
            this.putBodyParameter("AutoAddNewApplication", autoAddNewApplication);
            this.autoAddNewApplication = autoAddNewApplication;
            return this;
        }

        /**
         * <p>The configurations that are automatically appended to monitor the application based on the specified alert rule.</p>
         * <ul>
         * <li><p>autoAddMatchType:</p>
         * <p>the matching mode. Valid values: REGULAR and NOT_REGULAR.</p>
         * </li>
         * <li><p>autoAddMatchExp: the regular expression</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;autoAddMatchType&quot;:&quot;REGULAR&quot;,&quot;autoAddMatchExp&quot;:&quot;.<em>cbw.</em>&quot;}</p>
         */
        public Builder autoAddTargetConfig(String autoAddTargetConfig) {
            this.putBodyParameter("AutoAddTargetConfig", autoAddTargetConfig);
            this.autoAddTargetConfig = autoAddTargetConfig;
            return this;
        }

        /**
         * <p>The ID of the monitored cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ceba9b9ea5b924dd0b6726d2de6******</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Data Configuration. The dataRevision field specifies the data repair method when there is no data for the metric.</p>
         * <ul>
         * <li>Fill with zero: 0</li>
         * <li>Fill with one: 1</li>
         * <li>Fill with null: 2 (default, does not trigger an alarm)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;dataRevision&quot;: 2
         * }</p>
         */
        public Builder dataConfig(String dataConfig) {
            this.putBodyParameter("DataConfig", dataConfig);
            this.dataConfig = dataConfig;
            return this;
        }

        /**
         * <p>The duration of the Prometheus alert rule, in minutes, in the range of [0,1440].</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder duration(Long duration) {
            this.putBodyParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>The filter conditions of the Application Monitoring or Browser Monitoring alert rule. Format:</p>
         * <pre><code>&quot;DimFilters&quot;: [ 
         * { 
         *  &quot;FilterOpt&quot;: &quot;ALL&quot;,
         * &quot;FilterValues&quot;: [],         //The value of the filter condition.
         * &quot;FilterKey&quot;: &quot;rootIp&quot;     //The key of the filter condition.
         * }
         * ]
         * </code></pre>
         * <p>Valid values of <strong>FilterOpt</strong>:</p>
         * <ul>
         * <li>STATIC: matches the value of the specified dimension.</li>
         * <li>ALL: traverses all dimension values. Dynamic thresholds do not support traversal.</li>
         * <li>DISABLE: aggregates the values of all dimensions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;DimFilters&quot;: [             {               &quot;FilterOpt&quot;: &quot;ALL&quot;,               &quot;FilterValues&quot;: [],               &quot;FilterKey&quot;: &quot;rootIp&quot;             }           ]         }</p>
         */
        public Builder filters(String filters) {
            this.putBodyParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The tags of the Prometheus alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>[  { &quot;Value&quot;: &quot;cms_polardb&quot;,             &quot;Name&quot;: &quot;_aliyun_cloud_product&quot;           }         ]</p>
         */
        public Builder labels(String labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The severity level of the Prometheus alert rule.</p>
         * <ul>
         * <li>P1: Alert notifications are sent for major issues that affect the availability of core business, have a huge impact, and may lead to serious consequences.</li>
         * <li>P2: Alert notifications are sent for service errors that affect the system availability with relatively limited impact.</li>
         * <li>P3: Alert notifications are sent for issues that may cause service errors or negative effects, or alert notifications for services that are relatively less important.</li>
         * <li>P4: Alert notifications are sent for low-priority issues that do not affect your business.</li>
         * <li>Default: Alert notifications are sent regardless of alert levels.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>P2</p>
         */
        public Builder level(String level) {
            this.putBodyParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * <p>Application Tags. Used for application monitoring alert rules, to filter applications associated with alert rules.</p>
         */
        public Builder markTags(java.util.List < MarkTags> markTags) {
            this.putBodyParameter("MarkTags", markTags);
            this.markTags = markTags;
            return this;
        }

        /**
         * <p>The alert message of the Prometheus alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Namespace: {{$labels.namespace}} / Pod: {{$labels.pod_name}} / Container: {{$labels.container}} Memory usage exceeds 80%. Current value: {{ printf \\&quot;%.2f\\&quot; $value }}%</p>
         */
        public Builder message(String message) {
            this.putBodyParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * <p>The alert metrics. If you set the <strong>AlertCheckType</strong> parameter to <strong>STATIC</strong> when you create a Prometheus alert rule, you must specify the <strong>MetricsKey</strong> parameter.</p>
         * <blockquote>
         * <p>Alert metrics vary depending on the value of the <strong>AlertGroup</strong> parameter. For more information about the correspondence between <strong>AlertGroup</strong> and <strong>MetricsKey</strong>, see the supplementary description.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pop.status.error</p>
         */
        public Builder metricsKey(String metricsKey) {
            this.putBodyParameter("MetricsKey", metricsKey);
            this.metricsKey = metricsKey;
            return this;
        }

        /**
         * <p>The metric type of the Application Monitoring or Browser Monitoring alert rule. For more information, see the following table.</p>
         * 
         * <strong>example:</strong>
         * <p>jvm</p>
         */
        public Builder metricsType(String metricsType) {
            this.putBodyParameter("MetricsType", metricsType);
            this.metricsType = metricsType;
            return this;
        }

        /**
         * <p>The effective time and notification time. This parameter is used to be compatible with the old version of the rule.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder notice(String notice) {
            this.putBodyParameter("Notice", notice);
            this.notice = notice;
            return this;
        }

        /**
         * <p>The notification mode. You can specify the normal mode or simple mode.</p>
         * <ul>
         * <li>DIRECTED_MODE</li>
         * <li>NORMAL_MODE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL_MODE</p>
         */
        public Builder notifyMode(String notifyMode) {
            this.putBodyParameter("NotifyMode", notifyMode);
            this.notifyMode = notifyMode;
            return this;
        }

        /**
         * <p>The notification policy.</p>
         * <ul>
         * <li>If you set this parameter to null, no notification policy is specified. After you create an alert rule, you can create a notification policy and specify match rules and match conditions. For example, you can specify the name of the alert rule as the match condition. When the alert rule is triggered, an alert event is generated and an alert notification is sent to the contacts or contact groups that are specified in the notification policy.</li>
         * <li>To specify a notification policy, set this parameter to the ID of the notification policy. Application Real-Time Monitoring Service (ARMS) automatically adds a match rule to the notification policy and specifies the ID of the alert rule as the match condition. The name of the alert rule is also displayed. This way, the alert events that are generated based on the alert rule can be matched by the specified notification policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>569xxx</p>
         */
        public Builder notifyStrategy(String notifyStrategy) {
            this.putBodyParameter("NotifyStrategy", notifyStrategy);
            this.notifyStrategy = notifyStrategy;
            return this;
        }

        /**
         * <p>The process ID (PID) that is associated with the Application Monitoring or Browser Monitoring alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;b590lhguqs@40d8deedfa9******&quot;]</p>
         */
        public Builder pids(String pids) {
            this.putBodyParameter("Pids", pids);
            this.pids = pids;
            return this;
        }

        /**
         * <p>The product code. If you specify this parameter when you create a Prometheus alert rule, the backend checks whether the product exists.</p>
         * 
         * <strong>example:</strong>
         * <p>clickhouse</p>
         */
        public Builder product(String product) {
            this.putBodyParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * <p>The PromQL statement of the Prometheus alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>node_memory_MemAvailable_bytes{} / node_memory_MemTotal_bytes{} * 100</p>
         */
        public Builder promQL(String promQL) {
            this.putBodyParameter("PromQL", promQL);
            this.promQL = promQL;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The list of tags.</p>
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

    /**
     * 
     * {@link CreateOrUpdateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateAlertRuleRequest</p>
     */
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
             * <p>The Tag Key.</p>
             * 
             * <strong>example:</strong>
             * <p>service</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The Tag Value.</p>
             * 
             * <strong>example:</strong>
             * <p>proudct</p>
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
    /**
     * 
     * {@link CreateOrUpdateAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateAlertRuleRequest</p>
     */
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>owner</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>John</p>
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
