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
         * AlertRule.
         */
        public Builder alertRule(AlertRule alertRule) {
            this.alertRule = alertRule;
            return this;
        }

        /**
         * Id of the request
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
             * 应用监控/前端监控-聚合方式
             */
            public Builder aggregate(String aggregate) {
                this.aggregate = aggregate;
                return this;
            }

            /**
             * 应用监控/前端监控-具体告警条件的指标
             */
            public Builder metricKey(String metricKey) {
                this.metricKey = metricKey;
                return this;
            }

            /**
             * 应用监控/前端监控-最近N分钟
             */
            public Builder n(Float n) {
                this.n = n;
                return this;
            }

            /**
             * 应用监控/前端监控-判断条件
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * 应用监控/前端监控-阈值
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
             * 应用监控/前端监控-告警条件
             */
            public Builder alertRuleItems(java.util.List < AlertRuleItems> alertRuleItems) {
                this.alertRuleItems = alertRuleItems;
                return this;
            }

            /**
             * 应用监控/前端监控-多个告警条件触发逻辑
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
             * 键
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 值
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Opt.
             */
            public Builder opt(String opt) {
                this.opt = opt;
                return this;
            }

            /**
             * Show.
             */
            public Builder show(Boolean show) {
                this.show = show;
                return this;
            }

            /**
             * T.
             */
            public Builder t(String t) {
                this.t = t;
                return this;
            }

            /**
             * 值
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
             * FilterKey.
             */
            public Builder filterKey(String filterKey) {
                this.filterKey = filterKey;
                return this;
            }

            /**
             * FilterOpt.
             */
            public Builder filterOpt(String filterOpt) {
                this.filterOpt = filterOpt;
                return this;
            }

            /**
             * FilterValues.
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
             * CustomSLSFilters.
             */
            public Builder customSLSFilters(java.util.List < CustomSLSFilters> customSLSFilters) {
                this.customSLSFilters = customSLSFilters;
                return this;
            }

            /**
             * CustomSLSGroupByDimensions.
             */
            public Builder customSLSGroupByDimensions(java.util.List < String > customSLSGroupByDimensions) {
                this.customSLSGroupByDimensions = customSLSGroupByDimensions;
                return this;
            }

            /**
             * CustomSLSWheres.
             */
            public Builder customSLSWheres(java.util.List < String > customSLSWheres) {
                this.customSLSWheres = customSLSWheres;
                return this;
            }

            /**
             * DimFilters.
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
             * 键
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 值
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
            private Long updatedTime; 
            private String userId; 

            /**
             * Prometheus告警-告警检查类型
             */
            public Builder alertCheckType(String alertCheckType) {
                this.alertCheckType = alertCheckType;
                return this;
            }

            /**
             * Prometheus告警-告警分组ID
             */
            public Builder alertGroup(Long alertGroup) {
                this.alertGroup = alertGroup;
                return this;
            }

            /**
             * 告警规则ID
             */
            public Builder alertId(Float alertId) {
                this.alertId = alertId;
                return this;
            }

            /**
             * 告警规则名称
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * 应用监控/前端监控-告警规则内容
             */
            public Builder alertRuleContent(AlertRuleContent alertRuleContent) {
                this.alertRuleContent = alertRuleContent;
                return this;
            }

            /**
             * 告警规则状态
             */
            public Builder alertStatus(String alertStatus) {
                this.alertStatus = alertStatus;
                return this;
            }

            /**
             * 告警规则类型
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * Prometheus告警-Annotation
             */
            public Builder annotations(java.util.List < Annotations> annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * 应用监控/前端监控-是否开启新创建应用追加到此告警规则
             */
            public Builder autoAddNewApplication(Boolean autoAddNewApplication) {
                this.autoAddNewApplication = autoAddNewApplication;
                return this;
            }

            /**
             * Prometheus告警-集群ID
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * Prometheus告警-持续时间
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * 扩展字段
             */
            public Builder extend(String extend) {
                this.extend = extend;
                return this;
            }

            /**
             * 应用监控/前端监控-告警条件-过滤项
             */
            public Builder filters(Filters filters) {
                this.filters = filters;
                return this;
            }

            /**
             * Prometheus告警-Label
             */
            public Builder labels(java.util.List < Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * Prometheus告警-等级
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * Prometheus告警-告警内容
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * 应用监控/前端监控-告警指标类型
             */
            public Builder metricsType(String metricsType) {
                this.metricsType = metricsType;
                return this;
            }

            /**
             * 通知策略ID
             */
            public Builder notifyStrategy(String notifyStrategy) {
                this.notifyStrategy = notifyStrategy;
                return this;
            }

            /**
             * 应用监控/前端监控-告警关联应用ID
             */
            public Builder pids(java.util.List < String > pids) {
                this.pids = pids;
                return this;
            }

            /**
             * Prometheus告警-PromQL语句
             */
            public Builder promQL(String promQL) {
                this.promQL = promQL;
                return this;
            }

            /**
             * 地域
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * 更新时间
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * 用户UID
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
