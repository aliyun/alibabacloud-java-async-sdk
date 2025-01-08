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
 * {@link CreateOrUpdateAlertRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateAlertRuleResponseBody</p>
 */
public class CreateOrUpdateAlertRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlertRule")
    private AlertRule alertRule;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The details of the alert rule.</p>
         */
        public Builder alertRule(AlertRule alertRule) {
            this.alertRule = alertRule;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>337B8F7E-0A64-5768-9225-E9B3CF******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOrUpdateAlertRuleResponseBody build() {
            return new CreateOrUpdateAlertRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateOrUpdateAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateAlertRuleResponseBody</p>
     */
    public static class AlertRuleItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aggregate")
        private String aggregate;

        @com.aliyun.core.annotation.NameInMap("MetricKey")
        private String metricKey;

        @com.aliyun.core.annotation.NameInMap("N")
        private Float n;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The aggregation method of the alert condition. Valid values:</p>
             * <ul>
             * <li>AVG: calculates the average value</li>
             * <li>SUM: calculates the total value</li>
             * <li>MAX: selects the maximum value</li>
             * <li>MIN: selects the minimum value</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AVG</p>
             */
            public Builder aggregate(String aggregate) {
                this.aggregate = aggregate;
                return this;
            }

            /**
             * <p>The metric of the alert condition.</p>
             * 
             * <strong>example:</strong>
             * <p>appstat.jvm.non_heap_used</p>
             */
            public Builder metricKey(String metricKey) {
                this.metricKey = metricKey;
                return this;
            }

            /**
             * <p>Indicates the last N minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder n(Float n) {
                this.n = n;
                return this;
            }

            /**
             * <p>The comparison operator that was used to compare the metric value with the threshold. Valid values:</p>
             * <ul>
             * <li>CURRENT_GTE: greater than or equal to</li>
             * <li>CURRENT_LTE: less than or equal to</li>
             * <li>PREVIOUS_UP: the increase percentage compared with the last period</li>
             * <li>PREVIOUS_DOWN: the decrease percentage compared with the last period</li>
             * <li>HOH_UP: the increase percentage compared with the last hour</li>
             * <li>HOH_DOWN: the decrease percentage compared with the last hour</li>
             * <li>DOD_UP: the increase percentage compared with the last day</li>
             * <li>DOD_DOWN: the decrease percentage compared with the last day</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CURRENT_GTE</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The threshold of the alert condition.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link CreateOrUpdateAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateAlertRuleResponseBody</p>
     */
    public static class AlertRuleContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertRuleItems")
        private java.util.List<AlertRuleItems> alertRuleItems;

        @com.aliyun.core.annotation.NameInMap("Condition")
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
        public java.util.List<AlertRuleItems> getAlertRuleItems() {
            return this.alertRuleItems;
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        public static final class Builder {
            private java.util.List<AlertRuleItems> alertRuleItems; 
            private String condition; 

            /**
             * <p>The trigger conditions of the Application Monitoring or Browser Monitoring alert rule.</p>
             */
            public Builder alertRuleItems(java.util.List<AlertRuleItems> alertRuleItems) {
                this.alertRuleItems = alertRuleItems;
                return this;
            }

            /**
             * <p>The relationship between multiple alert conditions that were specified for the Application Monitoring or Browser Monitoring alert rule. Valid values:</p>
             * <ul>
             * <li>OR: meets any of the specified conditions.</li>
             * <li>AND: meets all the specified conditions.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>&quot;|&quot;</p>
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
    /**
     * 
     * {@link CreateOrUpdateAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateAlertRuleResponseBody</p>
     */
    public static class Annotations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The key of the annotation.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the annotation.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
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
    /**
     * 
     * {@link CreateOrUpdateAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateAlertRuleResponseBody</p>
     */
    public static class CustomSLSFilters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Opt")
        private String opt;

        @com.aliyun.core.annotation.NameInMap("Show")
        private Boolean show;

        @com.aliyun.core.annotation.NameInMap("T")
        private String t;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The key of the filter condition.</p>
             * 
             * <strong>example:</strong>
             * <p>username</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The logical operator of the filter condition. Valid values:</p>
             * <ul>
             * <li>=: equal to</li>
             * <li>not: not equal to</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>=</p>
             */
            public Builder opt(String opt) {
                this.opt = opt;
                return this;
            }

            /**
             * <p>Indicates whether this filter condition was displayed on the frontend.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder show(Boolean show) {
                this.show = show;
                return this;
            }

            /**
             * <p>The log type of Browser Monitoring. This field was not included in other filter conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder t(String t) {
                this.t = t;
                return this;
            }

            /**
             * <p>The value of the filter condition.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link CreateOrUpdateAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateAlertRuleResponseBody</p>
     */
    public static class DimFilters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FilterKey")
        private String filterKey;

        @com.aliyun.core.annotation.NameInMap("FilterOpt")
        private String filterOpt;

        @com.aliyun.core.annotation.NameInMap("FilterValues")
        private java.util.List<String> filterValues;

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
        public java.util.List<String> getFilterValues() {
            return this.filterValues;
        }

        public static final class Builder {
            private String filterKey; 
            private String filterOpt; 
            private java.util.List<String> filterValues; 

            /**
             * <p>The key of the filter condition.</p>
             * 
             * <strong>example:</strong>
             * <p>rootIp</p>
             */
            public Builder filterKey(String filterKey) {
                this.filterKey = filterKey;
                return this;
            }

            /**
             * <p>The logical operator of the filter condition.</p>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder filterOpt(String filterOpt) {
                this.filterOpt = filterOpt;
                return this;
            }

            /**
             * <p>The details of the filter condition.</p>
             */
            public Builder filterValues(java.util.List<String> filterValues) {
                this.filterValues = filterValues;
                return this;
            }

            public DimFilters build() {
                return new DimFilters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateOrUpdateAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateAlertRuleResponseBody</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomSLSFilters")
        private java.util.List<CustomSLSFilters> customSLSFilters;

        @com.aliyun.core.annotation.NameInMap("CustomSLSGroupByDimensions")
        private java.util.List<String> customSLSGroupByDimensions;

        @com.aliyun.core.annotation.NameInMap("CustomSLSWheres")
        private java.util.List<String> customSLSWheres;

        @com.aliyun.core.annotation.NameInMap("DimFilters")
        private java.util.List<DimFilters> dimFilters;

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
        public java.util.List<CustomSLSFilters> getCustomSLSFilters() {
            return this.customSLSFilters;
        }

        /**
         * @return customSLSGroupByDimensions
         */
        public java.util.List<String> getCustomSLSGroupByDimensions() {
            return this.customSLSGroupByDimensions;
        }

        /**
         * @return customSLSWheres
         */
        public java.util.List<String> getCustomSLSWheres() {
            return this.customSLSWheres;
        }

        /**
         * @return dimFilters
         */
        public java.util.List<DimFilters> getDimFilters() {
            return this.dimFilters;
        }

        public static final class Builder {
            private java.util.List<CustomSLSFilters> customSLSFilters; 
            private java.util.List<String> customSLSGroupByDimensions; 
            private java.util.List<String> customSLSWheres; 
            private java.util.List<DimFilters> dimFilters; 

            /**
             * <p>The custom filter condition of the Browser Monitoring alert rule.</p>
             */
            public Builder customSLSFilters(java.util.List<CustomSLSFilters> customSLSFilters) {
                this.customSLSFilters = customSLSFilters;
                return this;
            }

            /**
             * <p>The information of the aggregation dimension.</p>
             */
            public Builder customSLSGroupByDimensions(java.util.List<String> customSLSGroupByDimensions) {
                this.customSLSGroupByDimensions = customSLSGroupByDimensions;
                return this;
            }

            /**
             * <p>The details of the custom filter condition.</p>
             */
            public Builder customSLSWheres(java.util.List<String> customSLSWheres) {
                this.customSLSWheres = customSLSWheres;
                return this;
            }

            /**
             * <p>The information about each filter condition of the Application Monitoring or Browser Monitoring alert rule.</p>
             */
            public Builder dimFilters(java.util.List<DimFilters> dimFilters) {
                this.dimFilters = dimFilters;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateOrUpdateAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateAlertRuleResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
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
    /**
     * 
     * {@link CreateOrUpdateAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateAlertRuleResponseBody</p>
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
    /**
     * 
     * {@link CreateOrUpdateAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateAlertRuleResponseBody</p>
     */
    public static class AlertRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertCheckType")
        private String alertCheckType;

        @com.aliyun.core.annotation.NameInMap("AlertGroup")
        private Long alertGroup;

        @com.aliyun.core.annotation.NameInMap("AlertId")
        private Long alertId;

        @com.aliyun.core.annotation.NameInMap("AlertName")
        private String alertName;

        @com.aliyun.core.annotation.NameInMap("AlertRuleContent")
        private AlertRuleContent alertRuleContent;

        @com.aliyun.core.annotation.NameInMap("AlertStatus")
        private String alertStatus;

        @com.aliyun.core.annotation.NameInMap("AlertType")
        private String alertType;

        @com.aliyun.core.annotation.NameInMap("Annotations")
        private java.util.List<Annotations> annotations;

        @com.aliyun.core.annotation.NameInMap("AutoAddNewApplication")
        private Boolean autoAddNewApplication;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Extend")
        private String extend;

        @com.aliyun.core.annotation.NameInMap("Filters")
        private Filters filters;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("MetricsType")
        private String metricsType;

        @com.aliyun.core.annotation.NameInMap("NotifyMode")
        private String notifyMode;

        @com.aliyun.core.annotation.NameInMap("NotifyStrategy")
        private String notifyStrategy;

        @com.aliyun.core.annotation.NameInMap("Pids")
        private java.util.List<String> pids;

        @com.aliyun.core.annotation.NameInMap("PromQL")
        private String promQL;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
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
            this.notifyMode = builder.notifyMode;
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
        public java.util.List<Annotations> getAnnotations() {
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
        public java.util.List<Labels> getLabels() {
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
        public java.util.List<String> getPids() {
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
        public java.util.List<Tags> getTags() {
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
            private Long alertId; 
            private String alertName; 
            private AlertRuleContent alertRuleContent; 
            private String alertStatus; 
            private String alertType; 
            private java.util.List<Annotations> annotations; 
            private Boolean autoAddNewApplication; 
            private String clusterId; 
            private Long createdTime; 
            private String duration; 
            private String extend; 
            private Filters filters; 
            private java.util.List<Labels> labels; 
            private String level; 
            private String message; 
            private String metricsType; 
            private String notifyMode; 
            private String notifyStrategy; 
            private java.util.List<String> pids; 
            private String promQL; 
            private String regionId; 
            private java.util.List<Tags> tags; 
            private Long updatedTime; 
            private String userId; 

            /**
             * <p>The alert check type of the Prometheus alert rule. Valid values:</p>
             * <ul>
             * <li>STATIC: a static threshold value.</li>
             * <li>CUSTOM: a custom PromQL statement.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STATIC</p>
             */
            public Builder alertCheckType(String alertCheckType) {
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
                this.alertGroup = alertGroup;
                return this;
            }

            /**
             * <p>The alert rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5510445</p>
             */
            public Builder alertId(Long alertId) {
                this.alertId = alertId;
                return this;
            }

            /**
             * <p>The name of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>arms-test</p>
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * <p>The content of the Application Monitoring or Browser Monitoring alert rule.</p>
             */
            public Builder alertRuleContent(AlertRuleContent alertRuleContent) {
                this.alertRuleContent = alertRuleContent;
                return this;
            }

            /**
             * <p>The status of the alert rule. Valid values:</p>
             * <ul>
             * <li>RUNNING</li>
             * <li>STOPPED</li>
             * <li>PAUSED</li>
             * </ul>
             * <blockquote>
             * <p>The PAUSED status indicates that the alert rule is abnormal and is actively paused by the system. The alert rule may be paused because that it is not unique or the associated cluster has been deleted.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder alertStatus(String alertStatus) {
                this.alertStatus = alertStatus;
                return this;
            }

            /**
             * <p>The type of the alert rule. Valid values:</p>
             * <ul>
             * <li>APPLICATION_MONITORING_ALERT_RULE: alert rule for Application Monitoring</li>
             * <li>BROWSER_MONITORING_ALERT_RULE: alert rule for Browser Monitoring</li>
             * <li>PROMETHEUS_MONITORING_ALERT_RULE: alert rule for Prometheus Service</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>APPLICATION_MONITORING_ALERT_RULE</p>
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * <p>The annotations of the Prometheus alert rule.</p>
             */
            public Builder annotations(java.util.List<Annotations> annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * <p>Indicates whether the alert rule was applied to new applications that were created in Application Monitoring or Browser Monitoring. Valid values:</p>
             * <ul>
             * <li><code>true</code>: enables the health check feature.</li>
             * <li><code>false</code>: disables the automatic backup feature.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoAddNewApplication(Boolean autoAddNewApplication) {
                this.autoAddNewApplication = autoAddNewApplication;
                return this;
            }

            /**
             * <p>The ID of the monitored cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ceba9b9ea5b924dd0b6726d2de6******</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The timestamp generated when the alert rule was created. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1641438611000</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The duration of the Prometheus alert rule. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The extended fields.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;alarmContext\&quot;:\&quot;{\\&quot;content\\&quot;:\\Alert name: $Alert name\\\nFilter condition: $Filter condition\\\nAlert time: $Alert time\\\nAlert content: $Alert content\\\nNote: The alert persists before you receive an email that reminds you to clear the alert. You will be reminded of the alert again 24 hours later. \\&quot;,\\&quot;subTitle\\&quot;:\\&quot;\\&quot;}\&quot;,\&quot;alertWays\&quot;:\&quot;[0,1]\&quot;,\&quot;contactGroupIds\&quot;:\&quot;381,5075\&quot;,\&quot;notice\&quot;:\&quot;{\\&quot;endTime\\&quot;:1480607940000,\\&quot;noticeEndTime\\&quot;:1480607940000,\\&quot;noticeStartTime\\&quot;:1480521600000,\\&quot;startTime\\&quot;:1480521600000}\&quot;}</p>
             */
            public Builder extend(String extend) {
                this.extend = extend;
                return this;
            }

            /**
             * <p>The filter conditions of the Application Monitoring or Browser Monitoring alert rule.</p>
             */
            public Builder filters(Filters filters) {
                this.filters = filters;
                return this;
            }

            /**
             * <p>The tags of the Prometheus alert rule.</p>
             */
            public Builder labels(java.util.List<Labels> labels) {
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
                this.level = level;
                return this;
            }

            /**
             * <p>The alert message of the Prometheus alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Namespace: {{$labels.namespace}} / Pod: {{$labels.pod_name}} / Container: {{$labels.container}} Memory usage exceeds 80%. Current value: {{ printf \\&quot;%.2f\\&quot; $value }}%</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The metric type of the Application Monitoring or Browser Monitoring alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>JVM</p>
             */
            public Builder metricsType(String metricsType) {
                this.metricsType = metricsType;
                return this;
            }

            /**
             * <p>Notification Mode.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL_MODE</p>
             */
            public Builder notifyMode(String notifyMode) {
                this.notifyMode = notifyMode;
                return this;
            }

            /**
             * <p>The name of the notification policy.</p>
             * 
             * <strong>example:</strong>
             * <p>ALERT_MANAGER</p>
             */
            public Builder notifyStrategy(String notifyStrategy) {
                this.notifyStrategy = notifyStrategy;
                return this;
            }

            /**
             * <p>The process ID (PID) that was associated with the Application Monitoring or Browser Monitoring alert rule.</p>
             */
            public Builder pids(java.util.List<String> pids) {
                this.pids = pids;
                return this;
            }

            /**
             * <p>The PromQL statement of the Prometheus alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>node_memory_MemAvailable_bytes{} / node_memory_MemTotal_bytes{} * 100</p>
             */
            public Builder promQL(String promQL) {
                this.promQL = promQL;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The list of tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The timestamp generated when the alert rule was updated. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1641438611000</p>
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>1131971649******</p>
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
