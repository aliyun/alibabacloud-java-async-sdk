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

    @com.aliyun.core.annotation.NameInMap("noDataDurationSecs")
    private Integer noDataDurationSecs;

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
        this.noDataDurationSecs = builder.noDataDurationSecs;
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
     * @return noDataDurationSecs
     */
    public Integer getNoDataDurationSecs() {
        return this.noDataDurationSecs;
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
        private Integer noDataDurationSecs; 
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
            this.noDataDurationSecs = model.noDataDurationSecs;
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
         * <p>The minimum deviation or absolute deviation dead zone for dynamic baselines. This parameter takes effect only for baseline operators in UMODEL_METRICSET_CONDITION and APM_SIMPLE_CONDITION. If the absolute difference between the current value and the boundary is less than the absDeviation value, no alert is triggered. The unit is the same as the metric unit. The value must be greater than or equal to 0. A value of 0 indicates no limit.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        public Builder absDeviation(Double absDeviation) {
            this.absDeviation = absDeviation;
            return this;
        }

        /**
         * <p>The aggregation function used for APM_SIMPLE_CONDITION. For UModel conditions, this semantic has been migrated to QueryConfigUnified, and this field no longer takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>AVG</p>
         */
        public Builder aggregate(String aggregate) {
            this.aggregate = aggregate;
            return this;
        }

        /**
         * <p>The consecutive trigger count threshold for SLS_MULTI_CONDITION. An alert is triggered only after the condition is met for the specified number of consecutive times. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder alertCount(Integer alertCount) {
            this.alertCount = alertCount;
            return this;
        }

        /**
         * <p>The baseline period. This parameter takes effect only for baseline operators. Valid values: AUTO (automatic identification), DAILY (daily), WEEKLY (weekly), and NONE (no period). For weekly baselines, the backend automatically extends the historical training window to 14 days or more. Automatic identification cannot echo specific identification conclusions.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTO</p>
         */
        public Builder baselinePeriod(String baselinePeriod) {
            this.baselinePeriod = baselinePeriod;
            return this;
        }

        /**
         * <p>The list of multiple comparisons for APM_COMPOSITE_CONDITION.</p>
         */
        public Builder compareList(java.util.List<CompareList> compareList) {
            this.compareList = compareList;
            return this;
        }

        /**
         * <p>The multi-metric composite trigger configuration for CLOUD_MONITORING_CONDITION when escalationType is set to COMPOSITE. The relation, severity, times, and escalations parameters are required.</p>
         */
        public Builder compositeEscalation(CloudMonitoringCompositeEscalation compositeEscalation) {
            this.compositeEscalation = compositeEscalation;
            return this;
        }

        /**
         * <p>The count comparison operator for UMODEL_LOGSET_CONDITION.</p>
         * 
         * <strong>example:</strong>
         * <p>GTE</p>
         */
        public Builder countOperator(String countOperator) {
            this.countOperator = countOperator;
            return this;
        }

        /**
         * <p>The count threshold for UMODEL_LOGSET_CONDITION.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder countThreshold(Long countThreshold) {
            this.countThreshold = countThreshold;
            return this;
        }

        /**
         * <p>The duration in seconds. This parameter is directly used for PROMETHEUS_SIMPLE, UMODEL_METRICSET_CONDITION, and UMODEL_LOGSET_CONDITION. For UMODEL_METRICSET_MULTI_CONDITION, it serves as the global default value, and each trigger can override it with its own durationSecs value.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder durationSecs(Integer durationSecs) {
            this.durationSecs = durationSecs;
            return this;
        }

        /**
         * <p>Specifies whether to enable severity suppression for UMODEL_METRICSET_MULTI_CONDITION and PROMETHEUS_MULTI_CONDITION. Default value: true. When enabled, only the highest severity trigger is reported for the same entity.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableSeveritySuppression(Boolean enableSeveritySuppression) {
            this.enableSeveritySuppression = enableSeveritySuppression;
            return this;
        }

        /**
         * <p>The expression type for CLOUD_MONITORING_CONDITION. Valid values: SIMPLE, COMPOSITE, EXPRESS, and PROMETHEUS. The write path only supports SIMPLE and COMPOSITE. Specify the corresponding escalation sub-object based on the type.</p>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        public Builder escalationType(String escalationType) {
            this.escalationType = escalationType;
            return this;
        }

        /**
         * <p>The expression trigger configuration for CLOUD_MONITORING_CONDITION when escalationType is set to EXPRESS. This parameter is output only in the read path.</p>
         */
        public Builder expressEscalation(CloudMonitoringExpressEscalation expressEscalation) {
            this.expressEscalation = expressEscalation;
            return this;
        }

        /**
         * <p>The original V1 condition JSON string returned as a fallback when parsing fails in the read path and the type is UNKNOWN_CONDITION. The frontend displays this field as read-only when it is not empty.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder legacyRaw(String legacyRaw) {
            this.legacyRaw = legacyRaw;
            return this;
        }

        /**
         * <p>The legacy type returned when the type is UNKNOWN_CONDITION. This indicates that the rule cannot be edited by using the new API. Submit a ticket to contact the CloudMonitor product team.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder legacyType(String legacyType) {
            this.legacyType = legacyType;
            return this;
        }

        /**
         * <p>The log field name used for UMODEL_LOGSET_CONDITION when matchOperator is set to CONTAINS, EQUALS, or REGEX.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder matchField(String matchField) {
            this.matchField = matchField;
            return this;
        }

        /**
         * <p>The log match operator for UMODEL_LOGSET_CONDITION.</p>
         * 
         * <strong>example:</strong>
         * <p>PRESENT</p>
         */
        public Builder matchOperator(String matchOperator) {
            this.matchOperator = matchOperator;
            return this;
        }

        /**
         * <p>The log match value used for UMODEL_LOGSET_CONDITION when matchOperator is set to CONTAINS, EQUALS, or REGEX.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder matchValue(String matchValue) {
            this.matchValue = matchValue;
            return this;
        }

        /**
         * <p>The upper bound of the range used for UMODEL_METRICSET_CONDITION when operator is set to IN_RANGE or OUT_OF_RANGE.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder max(Double max) {
            this.max = max;
            return this;
        }

        /**
         * <p>The lower bound of the range used for UMODEL_METRICSET_CONDITION when operator is set to IN_RANGE or OUT_OF_RANGE.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder min(Double min) {
            this.min = min;
            return this;
        }

        /**
         * <p>The no-data alert level for SLS_MULTI_CONDITION. For APM and Prometheus conditions, this parameter has been migrated to noDataPolicy and noDataAlertSeverity.</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        public Builder noDataAlertLevel(String noDataAlertLevel) {
            this.noDataAlertLevel = noDataAlertLevel;
            return this;
        }

        /**
         * <p>The no-data alert severity. This parameter takes effect for PROMETHEUS_SIMPLE_CONDITION, PROMETHEUS_MULTI_CONDITION, UMODEL_METRICSET_CONDITION, and UMODEL_METRICSET_MULTI_CONDITION when noDataPolicy is set to NO_DATA_TO_ALERT. For UMODEL_METRICSET conditions, this field is required when noDataPolicy is set to NO_DATA_TO_ALERT, and must not be specified for other policies. SLS_MULTI_CONDITION still uses noDataAlertLevel.</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        public Builder noDataAlertSeverity(String noDataAlertSeverity) {
            this.noDataAlertSeverity = noDataAlertSeverity;
            return this;
        }

        /**
         * <p>The compensated value when no data is available for APM_SIMPLE_CONDITION and APM_COMPOSITE_CONDITION. This parameter is nullable.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder noDataAppendValue(Double noDataAppendValue) {
            this.noDataAppendValue = noDataAppendValue;
            return this;
        }

        /**
         * <p>The tolerance duration in seconds before no data is determined. This parameter takes effect for UMODEL_METRICSET_CONDITION and UMODEL_METRICSET_MULTI_CONDITION when noDataPolicy is not empty. The noDataPolicy is applied only after no data is continuously reported for longer than this duration. This prevents empty query results in a single cycle caused by UModel data write jitter. The value must be a positive integer. If not specified, the backend uses the fallback value of max(collection interval × 2, 300).</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder noDataDurationSecs(Integer noDataDurationSecs) {
            this.noDataDurationSecs = noDataDurationSecs;
            return this;
        }

        /**
         * <p>The no-data processing policy for CLOUD_MONITORING_CONDITION, PROMETHEUS_MULTI_CONDITION, PROMETHEUS_SIMPLE_CONDITION, APM_SIMPLE_CONDITION, APM_COMPOSITE_CONDITION, UMODEL_METRICSET_CONDITION, and UMODEL_METRICSET_MULTI_CONDITION. Valid values: NO_DATA_TO_OK (treats no data as normal and recovers existing alerts), NO_DATA_TO_ALERT (triggers an alert for no data), KEEP_LAST_STATE (maintains the last state before no data), and APPEND_VALUE (APM only). If not specified, no-data determination is disabled, and the behavior remains the same as before this feature was released. UMODEL_METRICSET_CONDITION and UMODEL_METRICSET_MULTI_CONDITION do not support APPEND_VALUE because their data sources do not support backfilling.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder noDataPolicy(String noDataPolicy) {
            this.noDataPolicy = noDataPolicy;
            return this;
        }

        /**
         * <p>The comparison operator. For UMODEL_METRICSET_CONDITION, valid values are GT (greater than), GE (greater than or equal to), LT (less than), LE (less than or equal to), EQ (equal to), NE (not equal to), IN_RANGE (within the range, requires min and max), OUT_OF_RANGE (outside the range, requires min and max), PRESENT (field exists), NOT_PRESENT (field does not exist), ABOVE_UPPER (dynamic baseline spike), BELOW_LOWER (dynamic baseline drop), and OUT_OF_BAND (bidirectional dynamic baseline, requires sensitivity, do not specify threshold, min, or max). This field is not used for UMODEL_LOGSET_CONDITION. For APM_SIMPLE_CONDITION, valid values are GT, GTE, LT, LTE, EQ, NE, YOY_UP, YOY_DOWN (YOY operators require yoyTimeUnit and yoyTimeValue), ABOVE_UPPER, BELOW_LOWER, and OUT_OF_BAND (dynamic baseline, requires sensitivity).</p>
         * 
         * <strong>example:</strong>
         * <p>GT</p>
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * <p>The PromQL trigger configuration for CLOUD_MONITORING_CONDITION when escalationType is set to PROMETHEUS. This parameter is output only in the read path.</p>
         */
        public Builder prometheus(CloudMonitoringPrometheusEscalation prometheus) {
            this.prometheus = prometheus;
            return this;
        }

        /**
         * <p>The logical relation between conditions for APM_COMPOSITE_CONDITION.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        public Builder relation(String relation) {
            this.relation = relation;
            return this;
        }

        /**
         * <p>The dynamic baseline sensitivity for UMODEL_METRICSET_CONDITION and APM_SIMPLE_CONDITION. This parameter takes effect only when operator is set to ABOVE_UPPER, BELOW_LOWER, or OUT_OF_BAND. Valid values: HIGH (narrowest band and most sensitive), MEDIUM, and LOW (widest band and least sensitive).</p>
         * 
         * <strong>example:</strong>
         * <p>MEDIUM</p>
         */
        public Builder sensitivity(String sensitivity) {
            this.sensitivity = sensitivity;
            return this;
        }

        /**
         * <p>The severity level for UMODEL_METRICSET_CONDITION, UMODEL_LOGSET_CONDITION, PROMETHEUS_SIMPLE, and APM_COMPOSITE.</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * <p>The single-metric multi-level trigger configuration for CLOUD_MONITORING_CONDITION when escalationType is set to SIMPLE. The metricName, period, and escalations parameters are required.</p>
         */
        public Builder simpleEscalation(CloudMonitoringSimpleEscalation simpleEscalation) {
            this.simpleEscalation = simpleEscalation;
            return this;
        }

        /**
         * <p>The threshold used for UMODEL_METRICSET_CONDITION when a non-range operator is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder threshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }

        /**
         * <p>The list of multiple thresholds for APM_SIMPLE_CONDITION.</p>
         */
        public Builder thresholdList(java.util.List<ThresholdList> thresholdList) {
            this.thresholdList = thresholdList;
            return this;
        }

        /**
         * <p>The list of triggers. This field is polymorphic based on the type. CLOUD_MONITORING_CONDITION does not use this field; use simpleEscalation.escalations or compositeEscalation.escalations instead. For SLS_MULTI_CONDITION, each case includes matchField, matchOperator, matchValue, countOperator, countThreshold, and severity, and at least one case is required. For UMODEL_METRICSET_MULTI_CONDITION, each trigger includes severity, durationSecs, and an expression (SIMPLE or COMPOSITE). For PROMETHEUS_MULTI_CONDITION, each trigger includes severity, durationSecs, and an expression (SIMPLE or COMPOSITE). Triggers are sorted by severity priority, and the first matched trigger is executed.</p>
         */
        public Builder triggers(java.util.List<Triggers> triggers) {
            this.triggers = triggers;
            return this;
        }

        /**
         * <p>The detection condition type. Valid values and required fields: PROMETHEUS_SIMPLE_CONDITION (requires operator, threshold, durationSecs, and severity), UMODEL_METRICSET_CONDITION (requires operator, durationSecs, and severity; requires threshold for non-range operators; requires min and max when operator is IN_RANGE or OUT_OF_RANGE; noDataPolicy and noDataDurationSecs are optional, but noDataAlertSeverity is required when noDataPolicy is NO_DATA_TO_ALERT), UMODEL_LOGSET_CONDITION (requires matchOperator, durationSecs, and severity; requires matchField and matchValue when matchOperator is CONTAINS, EQUALS, or REGEX; countOperator and countThreshold are optional), UMODEL_METRICSET_MULTI_CONDITION (requires triggers; durationSecs as global default and enableSeveritySuppression are optional; noDataPolicy and noDataDurationSecs are optional, but noDataAlertSeverity is required when noDataPolicy is NO_DATA_TO_ALERT), APM_SIMPLE_CONDITION (requires operator and aggregate; requires thresholdList or threshold; requires yoyTimeUnit and yoyTimeValue when operator is YOY_UP or YOY_DOWN; noDataPolicy and noDataAppendValue are optional), APM_COMPOSITE_CONDITION (requires compareList, relation, and severity; noDataPolicy and noDataAppendValue are optional), CLOUD_MONITORING_CONDITION (requires escalationType; requires simpleEscalation when escalationType is SIMPLE; requires compositeEscalation when escalationType is COMPOSITE; noDataPolicy is optional), and UNKNOWN_CONDITION (read-only fallback, do not use in the write path). Non-enum values such as SLS_CONDITION or CMS_BASIC_CONDITION are prohibited. The backend returns an Invalidtype 400 error for invalid values.</p>
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
         * <p>The year-over-year time unit for APM_SIMPLE_CONDITION. This parameter takes effect only when operator is set to YOY_UP or YOY_DOWN.</p>
         * 
         * <strong>example:</strong>
         * <p>minute</p>
         */
        public Builder yoyTimeUnit(String yoyTimeUnit) {
            this.yoyTimeUnit = yoyTimeUnit;
            return this;
        }

        /**
         * <p>The year-over-year time value for APM_SIMPLE_CONDITION. This parameter takes effect only when operator is set to YOY_UP or YOY_DOWN.</p>
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
