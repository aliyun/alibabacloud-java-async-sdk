// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateAlertRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateAlertRuleResponseBody</p>
 */
public class CreateOrUpdateAlertRuleResponseBody extends TeaModel {
    @NameInMap("AlertRule")
    private AlertRule alertRule;

    @NameInMap("RequestId")
    private String requestId;

    private CreateOrUpdateAlertRuleResponseBody(Builder builder) {
        this.alertRule = builder.alertRule;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateAlertRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return alertRule
     */
    public AlertRule getAlertRule() {
        return this.alertRule;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AlertRule alertRule; 
        private String requestId; 

        /**
         * The details of the alert rule.
         */
        public Builder alertRule(AlertRule alertRule) {
            this.alertRule = alertRule;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOrUpdateAlertRuleResponseBody build() {
            return new CreateOrUpdateAlertRuleResponseBody(this);
        } 

    } 

    public static class AlertRuleItems extends TeaModel {
        @NameInMap("Aggregate")
        private String aggregate;

        @NameInMap("MetricKey")
        private String metricKey;

        @NameInMap("N")
        private Float n;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("Value")
        private String value;

        private AlertRuleItems(Builder builder) {
            this.aggregate = builder.aggregate;
            this.metricKey = builder.metricKey;
            this.n = builder.n;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertRuleItems create() {
            return builder().build();
        }

        /**
         * @return aggregate
         */
        public String getAggregate() {
            return this.aggregate;
        }

        /**
         * @return metricKey
         */
        public String getMetricKey() {
            return this.metricKey;
        }

        /**
         * @return n
         */
        public Float getN() {
            return this.n;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String aggregate; 
            private String metricKey; 
            private Float n; 
            private String operator; 
            private String value; 

            /**
             * The aggregation method of the alert condition. Valid values:
             * <p>
             * 
             * *   AVG: calculates the average value
             * *   SUM: calculates the total value
             * *   MAX: selects the maximum value
             * *   MIN: selects the minimum value
             */
            public Builder aggregate(String aggregate) {
                this.aggregate = aggregate;
                return this;
            }

            /**
             * The metric of the alert condition.
             */
            public Builder metricKey(String metricKey) {
                this.metricKey = metricKey;
                return this;
            }

            /**
             * Indicates the last N minutes.
             */
            public Builder n(Float n) {
                this.n = n;
                return this;
            }

            /**
             * The comparison operator that was used to compare the metric value with the threshold. Valid values:
             * <p>
             * 
             * *   CURRENT_GTE: greater than or equal to
             * *   CURRENT_LTE: less than or equal to
             * *   PREVIOUS_UP: the increase percentage compared with the last period
             * *   PREVIOUS_DOWN: the decrease percentage compared with the last period
             * *   HOH_UP: the increase percentage compared with the last hour
             * *   HOH_DOWN: the decrease percentage compared with the last hour
             * *   DOD_UP: the increase percentage compared with the last day
             * *   DOD_DOWN: the decrease percentage compared with the last day
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The threshold of the alert condition.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AlertRuleItems build() {
                return new AlertRuleItems(this);
            } 

        } 

    }
    public static class AlertRuleContent extends TeaModel {
        @NameInMap("AlertRuleItems")
        private java.util.List < AlertRuleItems> alertRuleItems;

        @NameInMap("Condition")
        private String condition;

        private AlertRuleContent(Builder builder) {
            this.alertRuleItems = builder.alertRuleItems;
            this.condition = builder.condition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertRuleContent create() {
            return builder().build();
        }

        /**
         * @return alertRuleItems
         */
        public java.util.List < AlertRuleItems> getAlertRuleItems() {
            return this.alertRuleItems;
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        public static final class Builder {
            private java.util.List < AlertRuleItems> alertRuleItems; 
            private String condition; 

            /**
             * The trigger conditions of the Application Monitoring or Browser Monitoring alert rule.
             */
            public Builder alertRuleItems(java.util.List < AlertRuleItems> alertRuleItems) {
                this.alertRuleItems = alertRuleItems;
                return this;
            }

            /**
             * The relationship between multiple alert conditions that were specified for the Application Monitoring or Browser Monitoring alert rule. Valid values:
             * <p>
             * 
             * *   OR: meets any of the specified conditions.
             * *   AND: meets all the specified conditions.
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            public AlertRuleContent build() {
                return new AlertRuleContent(this);
            } 

        } 

    }
    public static class Annotations extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private Annotations(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Annotations create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The key of the annotation.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the annotation.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Annotations build() {
                return new Annotations(this);
            } 

        } 

    }
    public static class CustomSLSFilters extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Opt")
        private String opt;

        @NameInMap("Show")
        private Boolean show;

        @NameInMap("T")
        private String t;

        @NameInMap("Value")
        private String value;

        private CustomSLSFilters(Builder builder) {
            this.key = builder.key;
            this.opt = builder.opt;
            this.show = builder.show;
            this.t = builder.t;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomSLSFilters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return opt
         */
        public String getOpt() {
            return this.opt;
        }

        /**
         * @return show
         */
        public Boolean getShow() {
            return this.show;
        }

        /**
         * @return t
         */
        public String getT() {
            return this.t;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String opt; 
            private Boolean show; 
            private String t; 
            private String value; 

            /**
             * The key of the filter condition.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The logical operator of the filter condition. Valid values:
             * <p>
             * 
             * *   \=: equal to
             * *   not: not equal to
             */
            public Builder opt(String opt) {
                this.opt = opt;
                return this;
            }

            /**
             * Indicates whether this filter condition was displayed on the frontend.
             */
            public Builder show(Boolean show) {
                this.show = show;
                return this;
            }

            /**
             * The log type of Browser Monitoring. This field was not included in other filter conditions.
             */
            public Builder t(String t) {
                this.t = t;
                return this;
            }

            /**
             * The value of the filter condition.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public CustomSLSFilters build() {
                return new CustomSLSFilters(this);
            } 

        } 

    }
    public static class DimFilters extends TeaModel {
        @NameInMap("FilterKey")
        private String filterKey;

        @NameInMap("FilterOpt")
        private String filterOpt;

        @NameInMap("FilterValues")
        private java.util.List < String > filterValues;

        private DimFilters(Builder builder) {
            this.filterKey = builder.filterKey;
            this.filterOpt = builder.filterOpt;
            this.filterValues = builder.filterValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DimFilters create() {
            return builder().build();
        }

        /**
         * @return filterKey
         */
        public String getFilterKey() {
            return this.filterKey;
        }

        /**
         * @return filterOpt
         */
        public String getFilterOpt() {
            return this.filterOpt;
        }

        /**
         * @return filterValues
         */
        public java.util.List < String > getFilterValues() {
            return this.filterValues;
        }

        public static final class Builder {
            private String filterKey; 
            private String filterOpt; 
            private java.util.List < String > filterValues; 

            /**
             * The key of the filter condition.
             */
            public Builder filterKey(String filterKey) {
                this.filterKey = filterKey;
                return this;
            }

            /**
             * The logical operator of the filter condition.
             */
            public Builder filterOpt(String filterOpt) {
                this.filterOpt = filterOpt;
                return this;
            }

            /**
             * The details of the filter condition.
             */
            public Builder filterValues(java.util.List < String > filterValues) {
                this.filterValues = filterValues;
                return this;
            }

            public DimFilters build() {
                return new DimFilters(this);
            } 

        } 

    }
    public static class Filters extends TeaModel {
        @NameInMap("CustomSLSFilters")
        private java.util.List < CustomSLSFilters> customSLSFilters;

        @NameInMap("CustomSLSGroupByDimensions")
        private java.util.List < String > customSLSGroupByDimensions;

        @NameInMap("CustomSLSWheres")
        private java.util.List < String > customSLSWheres;

        @NameInMap("DimFilters")
        private java.util.List < DimFilters> dimFilters;

        private Filters(Builder builder) {
            this.customSLSFilters = builder.customSLSFilters;
            this.customSLSGroupByDimensions = builder.customSLSGroupByDimensions;
            this.customSLSWheres = builder.customSLSWheres;
            this.dimFilters = builder.dimFilters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return customSLSFilters
         */
        public java.util.List < CustomSLSFilters> getCustomSLSFilters() {
            return this.customSLSFilters;
        }

        /**
         * @return customSLSGroupByDimensions
         */
        public java.util.List < String > getCustomSLSGroupByDimensions() {
            return this.customSLSGroupByDimensions;
        }

        /**
         * @return customSLSWheres
         */
        public java.util.List < String > getCustomSLSWheres() {
            return this.customSLSWheres;
        }

        /**
         * @return dimFilters
         */
        public java.util.List < DimFilters> getDimFilters() {
            return this.dimFilters;
        }

        public static final class Builder {
            private java.util.List < CustomSLSFilters> customSLSFilters; 
            private java.util.List < String > customSLSGroupByDimensions; 
            private java.util.List < String > customSLSWheres; 
            private java.util.List < DimFilters> dimFilters; 

            /**
             * The custom filter condition of the Browser Monitoring alert rule.
             */
            public Builder customSLSFilters(java.util.List < CustomSLSFilters> customSLSFilters) {
                this.customSLSFilters = customSLSFilters;
                return this;
            }

            /**
             * The information of the aggregation dimension.
             */
            public Builder customSLSGroupByDimensions(java.util.List < String > customSLSGroupByDimensions) {
                this.customSLSGroupByDimensions = customSLSGroupByDimensions;
                return this;
            }

            /**
             * The details of the custom filter condition.
             */
            public Builder customSLSWheres(java.util.List < String > customSLSWheres) {
                this.customSLSWheres = customSLSWheres;
                return this;
            }

            /**
             * The information about each filter condition of the Application Monitoring or Browser Monitoring alert rule.
             */
            public Builder dimFilters(java.util.List < DimFilters> dimFilters) {
                this.dimFilters = dimFilters;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
    public static class Labels extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
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
             * The key of the filter condition.
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
    public static class AlertRule extends TeaModel {
        @NameInMap("AlertCheckType")
        private String alertCheckType;

        @NameInMap("AlertGroup")
        private Long alertGroup;

        @NameInMap("AlertId")
        private Float alertId;

        @NameInMap("AlertName")
        private String alertName;

        @NameInMap("AlertRuleContent")
        private AlertRuleContent alertRuleContent;

        @NameInMap("AlertStatus")
        private String alertStatus;

        @NameInMap("AlertType")
        private String alertType;

        @NameInMap("Annotations")
        private java.util.List < Annotations> annotations;

        @NameInMap("AutoAddNewApplication")
        private Boolean autoAddNewApplication;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("Extend")
        private String extend;

        @NameInMap("Filters")
        private Filters filters;

        @NameInMap("Labels")
        private java.util.List < Labels> labels;

        @NameInMap("Level")
        private String level;

        @NameInMap("Message")
        private String message;

        @NameInMap("MetricsType")
        private String metricsType;

        @NameInMap("NotifyStrategy")
        private String notifyStrategy;

        @NameInMap("Pids")
        private java.util.List < String > pids;

        @NameInMap("PromQL")
        private String promQL;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("UpdatedTime")
        private Long updatedTime;

        @NameInMap("UserId")
        private String userId;

        private AlertRule(Builder builder) {
            this.alertCheckType = builder.alertCheckType;
            this.alertGroup = builder.alertGroup;
            this.alertId = builder.alertId;
            this.alertName = builder.alertName;
            this.alertRuleContent = builder.alertRuleContent;
            this.alertStatus = builder.alertStatus;
            this.alertType = builder.alertType;
            this.annotations = builder.annotations;
            this.autoAddNewApplication = builder.autoAddNewApplication;
            this.clusterId = builder.clusterId;
            this.createdTime = builder.createdTime;
            this.duration = builder.duration;
            this.extend = builder.extend;
            this.filters = builder.filters;
            this.labels = builder.labels;
            this.level = builder.level;
            this.message = builder.message;
            this.metricsType = builder.metricsType;
            this.notifyStrategy = builder.notifyStrategy;
            this.pids = builder.pids;
            this.promQL = builder.promQL;
            this.regionId = builder.regionId;
            this.tags = builder.tags;
            this.updatedTime = builder.updatedTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertRule create() {
            return builder().build();
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
        public Float getAlertId() {
            return this.alertId;
        }

        /**
         * @return alertName
         */
        public String getAlertName() {
            return this.alertName;
        }

        /**
         * @return alertRuleContent
         */
        public AlertRuleContent getAlertRuleContent() {
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
        public java.util.List < Annotations> getAnnotations() {
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
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return extend
         */
        public String getExtend() {
            return this.extend;
        }

        /**
         * @return filters
         */
        public Filters getFilters() {
            return this.filters;
        }

        /**
         * @return labels
         */
        public java.util.List < Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return metricsType
         */
        public String getMetricsType() {
            return this.metricsType;
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
        public java.util.List < String > getPids() {
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

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String alertCheckType; 
            private Long alertGroup; 
            private Float alertId; 
            private String alertName; 
            private AlertRuleContent alertRuleContent; 
            private String alertStatus; 
            private String alertType; 
            private java.util.List < Annotations> annotations; 
            private Boolean autoAddNewApplication; 
            private String clusterId; 
            private Long createdTime; 
            private String duration; 
            private String extend; 
            private Filters filters; 
            private java.util.List < Labels> labels; 
            private String level; 
            private String message; 
            private String metricsType; 
            private String notifyStrategy; 
            private java.util.List < String > pids; 
            private String promQL; 
            private String regionId; 
            private java.util.List < Tags> tags; 
            private Long updatedTime; 
            private String userId; 

            /**
             * The alert check type of the Prometheus alert rule. Valid values:
             * <p>
             * 
             * *   STATIC: a static threshold value.
             * *   CUSTOM: a custom PromQL statement.
             */
            public Builder alertCheckType(String alertCheckType) {
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
                this.alertGroup = alertGroup;
                return this;
            }

            /**
             * The ID of the alert rule.
             */
            public Builder alertId(Float alertId) {
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
             * The content of the Application Monitoring or Browser Monitoring alert rule.
             */
            public Builder alertRuleContent(AlertRuleContent alertRuleContent) {
                this.alertRuleContent = alertRuleContent;
                return this;
            }

            /**
             * The status of the alert rule. Valid values:
             * <p>
             * 
             * *   RUNNING
             * *   STOPPED
             * *   PAUSED
             * 
             * > The **PAUSED** status indicates that the alert rule was abnormal and was paused by the system. The alert rule might be paused because it was not unique or the associated cluster was deleted.
             */
            public Builder alertStatus(String alertStatus) {
                this.alertStatus = alertStatus;
                return this;
            }

            /**
             * The type of the alert rule.
             * <p>
             * 
             * *   APPLICATION_MONITORING_ALERT_RULE: an alert rule of Application Monitoring
             * *   BROWSER_MONITORING_ALERT_RULE: an alert rule of Browser Monitoring
             * *   PROMETHEUS_MONITORING_ALERT_RULE: an alert rule of Prometheus Service
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * The annotations of the Prometheus alert rule.
             */
            public Builder annotations(java.util.List < Annotations> annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * Indicates whether the alert rule was applied to new applications that were created in Application Monitoring or Browser Monitoring. Valid values:
             * <p>
             * 
             * *   `true`: yes
             * *   `false`: no
             */
            public Builder autoAddNewApplication(Boolean autoAddNewApplication) {
                this.autoAddNewApplication = autoAddNewApplication;
                return this;
            }

            /**
             * The cluster ID of the Prometheus alert rule.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The timestamp generated when the alert rule was created. Unit: seconds.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The duration of the Prometheus alert rule. Unit: minutes.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The extended fields.
             */
            public Builder extend(String extend) {
                this.extend = extend;
                return this;
            }

            /**
             * The filter conditions of the Application Monitoring or Browser Monitoring alert rule.
             */
            public Builder filters(Filters filters) {
                this.filters = filters;
                return this;
            }

            /**
             * The tags of the Prometheus alert rule.
             */
            public Builder labels(java.util.List < Labels> labels) {
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
                this.level = level;
                return this;
            }

            /**
             * The alert message of the Prometheus alert rule.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The metric type of the Application Monitoring or Browser Monitoring alert rule.
             */
            public Builder metricsType(String metricsType) {
                this.metricsType = metricsType;
                return this;
            }

            /**
             * The name of the notification policy.
             */
            public Builder notifyStrategy(String notifyStrategy) {
                this.notifyStrategy = notifyStrategy;
                return this;
            }

            /**
             * The process ID (PID) that was associated with the Application Monitoring or Browser Monitoring alert rule.
             */
            public Builder pids(java.util.List < String > pids) {
                this.pids = pids;
                return this;
            }

            /**
             * The PromQL statement of the Prometheus alert rule.
             */
            public Builder promQL(String promQL) {
                this.promQL = promQL;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The timestamp generated when the alert rule was updated. Unit: seconds.
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public AlertRule build() {
                return new AlertRule(this);
            } 

        } 

    }
}
