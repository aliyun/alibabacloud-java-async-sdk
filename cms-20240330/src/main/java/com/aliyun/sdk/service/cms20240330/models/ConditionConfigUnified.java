// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ConditionConfigUnified} extends {@link TeaModel}
 *
 * <p>ConditionConfigUnified</p>
 */
public class ConditionConfigUnified extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("absDeviation")
    private Double absDeviation;

    @com.aliyun.core.annotation.NameInMap("aggregate")
    private String aggregate;

    @com.aliyun.core.annotation.NameInMap("alertCount")
    private Integer alertCount;

    @com.aliyun.core.annotation.NameInMap("baselinePeriod")
    private String baselinePeriod;

    @com.aliyun.core.annotation.NameInMap("compareList")
    private java.util.List<CompareList> compareList;

    @com.aliyun.core.annotation.NameInMap("compositeEscalation")
    private CloudMonitoringCompositeEscalation compositeEscalation;

    @com.aliyun.core.annotation.NameInMap("countOperator")
    private String countOperator;

    @com.aliyun.core.annotation.NameInMap("countThreshold")
    private Long countThreshold;

    @com.aliyun.core.annotation.NameInMap("durationSecs")
    private Integer durationSecs;

    @com.aliyun.core.annotation.NameInMap("enableSeveritySuppression")
    private Boolean enableSeveritySuppression;

    @com.aliyun.core.annotation.NameInMap("escalationType")
    private String escalationType;

    @com.aliyun.core.annotation.NameInMap("expressEscalation")
    private CloudMonitoringExpressEscalation expressEscalation;

    @com.aliyun.core.annotation.NameInMap("legacyRaw")
    private String legacyRaw;

    @com.aliyun.core.annotation.NameInMap("legacyType")
    private String legacyType;

    @com.aliyun.core.annotation.NameInMap("matchField")
    private String matchField;

    @com.aliyun.core.annotation.NameInMap("matchOperator")
    private String matchOperator;

    @com.aliyun.core.annotation.NameInMap("matchValue")
    private String matchValue;

    @com.aliyun.core.annotation.NameInMap("max")
    private Double max;

    @com.aliyun.core.annotation.NameInMap("min")
    private Double min;

    @com.aliyun.core.annotation.NameInMap("noDataAlertLevel")
    private String noDataAlertLevel;

    @com.aliyun.core.annotation.NameInMap("noDataAlertSeverity")
    private String noDataAlertSeverity;

    @com.aliyun.core.annotation.NameInMap("noDataAppendValue")
    private Double noDataAppendValue;

    @com.aliyun.core.annotation.NameInMap("noDataPolicy")
    private String noDataPolicy;

    @com.aliyun.core.annotation.NameInMap("operator")
    private String operator;

    @com.aliyun.core.annotation.NameInMap("prometheus")
    private CloudMonitoringPrometheusEscalation prometheus;

    @com.aliyun.core.annotation.NameInMap("relation")
    private String relation;

    @com.aliyun.core.annotation.NameInMap("sensitivity")
    private String sensitivity;

    @com.aliyun.core.annotation.NameInMap("severity")
    private String severity;

    @com.aliyun.core.annotation.NameInMap("simpleEscalation")
    private CloudMonitoringSimpleEscalation simpleEscalation;

    @com.aliyun.core.annotation.NameInMap("threshold")
    private Double threshold;

    @com.aliyun.core.annotation.NameInMap("thresholdList")
    private java.util.List<ThresholdList> thresholdList;

    @com.aliyun.core.annotation.NameInMap("triggers")
    private java.util.List<Triggers> triggers;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.NameInMap("yoyTimeUnit")
    private String yoyTimeUnit;

    @com.aliyun.core.annotation.NameInMap("yoyTimeValue")
    private Integer yoyTimeValue;

    private ConditionConfigUnified(Builder builder) {
        this.absDeviation = builder.absDeviation;
        this.aggregate = builder.aggregate;
        this.alertCount = builder.alertCount;
        this.baselinePeriod = builder.baselinePeriod;
        this.compareList = builder.compareList;
        this.compositeEscalation = builder.compositeEscalation;
        this.countOperator = builder.countOperator;
        this.countThreshold = builder.countThreshold;
        this.durationSecs = builder.durationSecs;
        this.enableSeveritySuppression = builder.enableSeveritySuppression;
        this.escalationType = builder.escalationType;
        this.expressEscalation = builder.expressEscalation;
        this.legacyRaw = builder.legacyRaw;
        this.legacyType = builder.legacyType;
        this.matchField = builder.matchField;
        this.matchOperator = builder.matchOperator;
        this.matchValue = builder.matchValue;
        this.max = builder.max;
        this.min = builder.min;
        this.noDataAlertLevel = builder.noDataAlertLevel;
        this.noDataAlertSeverity = builder.noDataAlertSeverity;
        this.noDataAppendValue = builder.noDataAppendValue;
        this.noDataPolicy = builder.noDataPolicy;
        this.operator = builder.operator;
        this.prometheus = builder.prometheus;
        this.relation = builder.relation;
        this.sensitivity = builder.sensitivity;
        this.severity = builder.severity;
        this.simpleEscalation = builder.simpleEscalation;
        this.threshold = builder.threshold;
        this.thresholdList = builder.thresholdList;
        this.triggers = builder.triggers;
        this.type = builder.type;
        this.yoyTimeUnit = builder.yoyTimeUnit;
        this.yoyTimeValue = builder.yoyTimeValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConditionConfigUnified create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return absDeviation
     */
    public Double getAbsDeviation() {
        return this.absDeviation;
    }

    /**
     * @return aggregate
     */
    public String getAggregate() {
        return this.aggregate;
    }

    /**
     * @return alertCount
     */
    public Integer getAlertCount() {
        return this.alertCount;
    }

    /**
     * @return baselinePeriod
     */
    public String getBaselinePeriod() {
        return this.baselinePeriod;
    }

    /**
     * @return compareList
     */
    public java.util.List<CompareList> getCompareList() {
        return this.compareList;
    }

    /**
     * @return compositeEscalation
     */
    public CloudMonitoringCompositeEscalation getCompositeEscalation() {
        return this.compositeEscalation;
    }

    /**
     * @return countOperator
     */
    public String getCountOperator() {
        return this.countOperator;
    }

    /**
     * @return countThreshold
     */
    public Long getCountThreshold() {
        return this.countThreshold;
    }

    /**
     * @return durationSecs
     */
    public Integer getDurationSecs() {
        return this.durationSecs;
    }

    /**
     * @return enableSeveritySuppression
     */
    public Boolean getEnableSeveritySuppression() {
        return this.enableSeveritySuppression;
    }

    /**
     * @return escalationType
     */
    public String getEscalationType() {
        return this.escalationType;
    }

    /**
     * @return expressEscalation
     */
    public CloudMonitoringExpressEscalation getExpressEscalation() {
        return this.expressEscalation;
    }

    /**
     * @return legacyRaw
     */
    public String getLegacyRaw() {
        return this.legacyRaw;
    }

    /**
     * @return legacyType
     */
    public String getLegacyType() {
        return this.legacyType;
    }

    /**
     * @return matchField
     */
    public String getMatchField() {
        return this.matchField;
    }

    /**
     * @return matchOperator
     */
    public String getMatchOperator() {
        return this.matchOperator;
    }

    /**
     * @return matchValue
     */
    public String getMatchValue() {
        return this.matchValue;
    }

    /**
     * @return max
     */
    public Double getMax() {
        return this.max;
    }

    /**
     * @return min
     */
    public Double getMin() {
        return this.min;
    }

    /**
     * @return noDataAlertLevel
     */
    public String getNoDataAlertLevel() {
        return this.noDataAlertLevel;
    }

    /**
     * @return noDataAlertSeverity
     */
    public String getNoDataAlertSeverity() {
        return this.noDataAlertSeverity;
    }

    /**
     * @return noDataAppendValue
     */
    public Double getNoDataAppendValue() {
        return this.noDataAppendValue;
    }

    /**
     * @return noDataPolicy
     */
    public String getNoDataPolicy() {
        return this.noDataPolicy;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return prometheus
     */
    public CloudMonitoringPrometheusEscalation getPrometheus() {
        return this.prometheus;
    }

    /**
     * @return relation
     */
    public String getRelation() {
        return this.relation;
    }

    /**
     * @return sensitivity
     */
    public String getSensitivity() {
        return this.sensitivity;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * @return simpleEscalation
     */
    public CloudMonitoringSimpleEscalation getSimpleEscalation() {
        return this.simpleEscalation;
    }

    /**
     * @return threshold
     */
    public Double getThreshold() {
        return this.threshold;
    }

    /**
     * @return thresholdList
     */
    public java.util.List<ThresholdList> getThresholdList() {
        return this.thresholdList;
    }

    /**
     * @return triggers
     */
    public java.util.List<Triggers> getTriggers() {
        return this.triggers;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return yoyTimeUnit
     */
    public String getYoyTimeUnit() {
        return this.yoyTimeUnit;
    }

    /**
     * @return yoyTimeValue
     */
    public Integer getYoyTimeValue() {
        return this.yoyTimeValue;
    }

    public static final class Builder {
        private Double absDeviation; 
        private String aggregate; 
        private Integer alertCount; 
        private String baselinePeriod; 
        private java.util.List<CompareList> compareList; 
        private CloudMonitoringCompositeEscalation compositeEscalation; 
        private String countOperator; 
        private Long countThreshold; 
        private Integer durationSecs; 
        private Boolean enableSeveritySuppression; 
        private String escalationType; 
        private CloudMonitoringExpressEscalation expressEscalation; 
        private String legacyRaw; 
        private String legacyType; 
        private String matchField; 
        private String matchOperator; 
        private String matchValue; 
        private Double max; 
        private Double min; 
        private String noDataAlertLevel; 
        private String noDataAlertSeverity; 
        private Double noDataAppendValue; 
        private String noDataPolicy; 
        private String operator; 
        private CloudMonitoringPrometheusEscalation prometheus; 
        private String relation; 
        private String sensitivity; 
        private String severity; 
        private CloudMonitoringSimpleEscalation simpleEscalation; 
        private Double threshold; 
        private java.util.List<ThresholdList> thresholdList; 
        private java.util.List<Triggers> triggers; 
        private String type; 
        private String yoyTimeUnit; 
        private Integer yoyTimeValue; 

        private Builder() {
        } 

        private Builder(ConditionConfigUnified model) {
            this.absDeviation = model.absDeviation;
            this.aggregate = model.aggregate;
            this.alertCount = model.alertCount;
            this.baselinePeriod = model.baselinePeriod;
            this.compareList = model.compareList;
            this.compositeEscalation = model.compositeEscalation;
            this.countOperator = model.countOperator;
            this.countThreshold = model.countThreshold;
            this.durationSecs = model.durationSecs;
            this.enableSeveritySuppression = model.enableSeveritySuppression;
            this.escalationType = model.escalationType;
            this.expressEscalation = model.expressEscalation;
            this.legacyRaw = model.legacyRaw;
            this.legacyType = model.legacyType;
            this.matchField = model.matchField;
            this.matchOperator = model.matchOperator;
            this.matchValue = model.matchValue;
            this.max = model.max;
            this.min = model.min;
            this.noDataAlertLevel = model.noDataAlertLevel;
            this.noDataAlertSeverity = model.noDataAlertSeverity;
            this.noDataAppendValue = model.noDataAppendValue;
            this.noDataPolicy = model.noDataPolicy;
            this.operator = model.operator;
            this.prometheus = model.prometheus;
            this.relation = model.relation;
            this.sensitivity = model.sensitivity;
            this.severity = model.severity;
            this.simpleEscalation = model.simpleEscalation;
            this.threshold = model.threshold;
            this.thresholdList = model.thresholdList;
            this.triggers = model.triggers;
            this.type = model.type;
            this.yoyTimeUnit = model.yoyTimeUnit;
            this.yoyTimeValue = model.yoyTimeValue;
        } 

        /**
         * <p>The dynamic baseline minimum deviation or absolute deviation dead zone (UMODEL_METRICSET_CONDITION / APM_SIMPLE_CONDITION). Takes effect only for baseline operators. If |current value − boundary| &lt; absDeviation, no alert is fired. The unit is the same as the metric. The value must be &gt;= 0. A value of 0 means no restriction.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        public Builder absDeviation(Double absDeviation) {
            this.absDeviation = absDeviation;
            return this;
        }

        /**
         * <p>The aggregate functions (APM_SIMPLE_CONDITION).</p>
         * 
         * <strong>example:</strong>
         * <p>AVG</p>
         */
        public Builder aggregate(String aggregate) {
            this.aggregate = aggregate;
            return this;
        }

        /**
         * <p>The consecutive trigger count threshold (type=SLS_MULTI_CONDITION). An alert is fired only after the condition is met N times. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder alertCount(Integer alertCount) {
            this.alertCount = alertCount;
            return this;
        }

        /**
         * <p>The baseline period. Takes effect only for baseline operators. Valid values: AUTO (automatic detection), DAILY (daily), WEEKLY (weekly), and NONE (no period). When set to WEEKLY, the backend automatically expands the historical training window to at least 14 days. Automatic detection does not return the specific detection result.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTO</p>
         */
        public Builder baselinePeriod(String baselinePeriod) {
            this.baselinePeriod = baselinePeriod;
            return this;
        }

        /**
         * <p>The multiple comparisons (APM_COMPOSITE_CONDITION).</p>
         */
        public Builder compareList(java.util.List<CompareList> compareList) {
            this.compareList = compareList;
            return this;
        }

        /**
         * <p>The multi-metric composite trigger configuration for CLOUD_MONITORING_CONDITION when escalationType is set to COMPOSITE. Required fields: relation, severity, times, and escalations.</p>
         */
        public Builder compositeEscalation(CloudMonitoringCompositeEscalation compositeEscalation) {
            this.compositeEscalation = compositeEscalation;
            return this;
        }

        /**
         * <p>The count comparison operator (type=UMODEL_LOGSET_CONDITION).</p>
         * 
         * <strong>example:</strong>
         * <p>GTE</p>
         */
        public Builder countOperator(String countOperator) {
            this.countOperator = countOperator;
            return this;
        }

        /**
         * <p>The count threshold (type=UMODEL_LOGSET_CONDITION).</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder countThreshold(Long countThreshold) {
            this.countThreshold = countThreshold;
            return this;
        }

        /**
         * <p>The duration in seconds. Used by PROMETHEUS_SIMPLE and UMODEL_METRICSET.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder durationSecs(Integer durationSecs) {
            this.durationSecs = durationSecs;
            return this;
        }

        /**
         * <p>Specifies whether to enable severity suppression to the highest level (type=UMODEL_METRICSET_MULTI_CONDITION / PROMETHEUS_MULTI_CONDITION). Default value: true. When enabled, only the highest severity trigger is reported for the same entity.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableSeveritySuppression(Boolean enableSeveritySuppression) {
            this.enableSeveritySuppression = enableSeveritySuppression;
            return this;
        }

        /**
         * <p>The expression type for CLOUD_MONITORING_CONDITION. Valid values: SIMPLE, COMPOSITE, EXPRESS, and PROMETHEUS. Only SIMPLE and COMPOSITE are supported in write paths. Specify the corresponding escalation sub-object based on the type.</p>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        public Builder escalationType(String escalationType) {
            this.escalationType = escalationType;
            return this;
        }

        /**
         * <p>The expression-based trigger configuration for CLOUD_MONITORING_CONDITION when escalationType is set to EXPRESS. This field is output only in read paths.</p>
         */
        public Builder expressEscalation(CloudMonitoringExpressEscalation expressEscalation) {
            this.expressEscalation = expressEscalation;
            return this;
        }

        /**
         * <p>The raw V1 condition JSON string returned when type is set to UNKNOWN_CONDITION and the read path fails to parse the condition. When the frontend detects that this field is not empty, display it as read-only.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder legacyRaw(String legacyRaw) {
            this.legacyRaw = legacyRaw;
            return this;
        }

        /**
         * <p>Returned when type is set to UNKNOWN_CONDITION. Indicates that this rule cannot be edited through the new API. Submit a ticket to contact the CloudMonitor team.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder legacyType(String legacyType) {
            this.legacyType = legacyType;
            return this;
        }

        /**
         * <p>The log field name (used when type is set to UMODEL_LOGSET_CONDITION and matchOperator is set to CONTAINS, EQUALS, or REGEX).</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder matchField(String matchField) {
            this.matchField = matchField;
            return this;
        }

        /**
         * <p>The log match operator (type=UMODEL_LOGSET_CONDITION).</p>
         * 
         * <strong>example:</strong>
         * <p>PRESENT</p>
         */
        public Builder matchOperator(String matchOperator) {
            this.matchOperator = matchOperator;
            return this;
        }

        /**
         * <p>The log match value (used when type is set to UMODEL_LOGSET_CONDITION and matchOperator is set to CONTAINS, EQUALS, or REGEX).</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder matchValue(String matchValue) {
            this.matchValue = matchValue;
            return this;
        }

        /**
         * <p>The upper bound of the range (used when UMODEL_METRICSET_CONDITION operator is set to IN_RANGE or OUT_OF_RANGE).</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder max(Double max) {
            this.max = max;
            return this;
        }

        /**
         * <p>The lower bound of the range (used when UMODEL_METRICSET_CONDITION operator is set to IN_RANGE or OUT_OF_RANGE).</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder min(Double min) {
            this.min = min;
            return this;
        }

        /**
         * <p>The no-data alert level (SLS_MULTI_CONDITION). APM and Prometheus conditions have migrated to noDataPolicy and noDataAlertSeverity.</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        public Builder noDataAlertLevel(String noDataAlertLevel) {
            this.noDataAlertLevel = noDataAlertLevel;
            return this;
        }

        /**
         * <p>The no-data alert severity level (PROMETHEUS_SIMPLE_CONDITION / PROMETHEUS_MULTI_CONDITION). Takes effect only when noDataPolicy is set to NO_DATA_TO_ALERT. SLS_MULTI_CONDITION still uses noDataAlertLevel.</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        public Builder noDataAlertSeverity(String noDataAlertSeverity) {
            this.noDataAlertSeverity = noDataAlertSeverity;
            return this;
        }

        /**
         * <p>The value to substitute when no data is available (APM_SIMPLE_CONDITION / APM_COMPOSITE_CONDITION). Nullable.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder noDataAppendValue(Double noDataAppendValue) {
            this.noDataAppendValue = noDataAppendValue;
            return this;
        }

        /**
         * <p>The no-data handling policy (CLOUD_MONITORING_CONDITION / PROMETHEUS_MULTI_CONDITION / PROMETHEUS_SIMPLE_CONDITION / APM_SIMPLE_CONDITION / APM_COMPOSITE_CONDITION). Valid values: NO_DATA_TO_OK, NO_DATA_TO_ALERT, KEEP_LAST_STATE, and APPEND_VALUE (APM only).</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder noDataPolicy(String noDataPolicy) {
            this.noDataPolicy = noDataPolicy;
            return this;
        }

        /**
         * <p>The comparison operator (UMODEL_METRICSET_CONDITION or APM_SIMPLE_CONDITION).</p>
         * 
         * <strong>example:</strong>
         * <p>GT</p>
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * <p>The PromQL-based trigger configuration for CLOUD_MONITORING_CONDITION when escalationType is set to PROMETHEUS. This field is output only in read paths.</p>
         */
        public Builder prometheus(CloudMonitoringPrometheusEscalation prometheus) {
            this.prometheus = prometheus;
            return this;
        }

        /**
         * <p>The logical relationship between conditions (APM_COMPOSITE_CONDITION).</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        public Builder relation(String relation) {
            this.relation = relation;
            return this;
        }

        /**
         * <p>The dynamic baseline sensitivity (UMODEL_METRICSET_CONDITION / APM_SIMPLE_CONDITION). Takes effect only when operator is set to ABOVE_UPPER, BELOW_LOWER, or OUT_OF_BAND. Valid values: HIGH (narrowest band, most sensitive), MEDIUM, and LOW (widest band, least sensitive).</p>
         * 
         * <strong>example:</strong>
         * <p>MEDIUM</p>
         */
        public Builder sensitivity(String sensitivity) {
            this.sensitivity = sensitivity;
            return this;
        }

        /**
         * <p>The severity level (UMODEL / PROMETHEUS_SIMPLE / APM_COMPOSITE).</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * <p>The single-metric multi-level trigger configuration for CLOUD_MONITORING_CONDITION when escalationType is set to SIMPLE. Required fields: metricName, period, and escalations.</p>
         */
        public Builder simpleEscalation(CloudMonitoringSimpleEscalation simpleEscalation) {
            this.simpleEscalation = simpleEscalation;
            return this;
        }

        /**
         * <p>The threshold (UMODEL_METRICSET_CONDITION).</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder threshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }

        /**
         * <p>The multi-threshold list (APM_SIMPLE_CONDITION).</p>
         */
        public Builder thresholdList(java.util.List<ThresholdList> thresholdList) {
            this.thresholdList = thresholdList;
            return this;
        }

        /**
         * <p>The trigger list. This field is polymorphic based on type. CLOUD_MONITORING_CONDITION does not use this field. Use simpleEscalation.escalations or compositeEscalation.escalations instead. For SLS_MULTI_CONDITION, each case contains matchField, matchOperator, matchValue, countOperator, countThreshold, and severity. At least one case is required. For UMODEL_METRICSET_MULTI_CONDITION, each trigger contains severity, durationSecs, and an expression (SIMPLE or COMPOSITE). For PROMETHEUS_MULTI_CONDITION, each trigger contains severity, durationSecs, and an expression (SIMPLE or COMPOSITE). Triggers are sorted by severity priority, and the first match fires.</p>
         */
        public Builder triggers(java.util.List<Triggers> triggers) {
            this.triggers = triggers;
            return this;
        }

        /**
         * <p>The detection condition type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROMETHEUS_SIMPLE_CONDITION</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The year-over-year time unit (APM_SIMPLE_CONDITION). Takes effect only when operator is set to YOY_UP or YOY_DOWN.</p>
         * 
         * <strong>example:</strong>
         * <p>minute</p>
         */
        public Builder yoyTimeUnit(String yoyTimeUnit) {
            this.yoyTimeUnit = yoyTimeUnit;
            return this;
        }

        /**
         * <p>The year-over-year time value (APM_SIMPLE_CONDITION). Takes effect only when operator is set to YOY_UP or YOY_DOWN.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder yoyTimeValue(Integer yoyTimeValue) {
            this.yoyTimeValue = yoyTimeValue;
            return this;
        }

        public ConditionConfigUnified build() {
            return new ConditionConfigUnified(this);
        } 

    } 

}
