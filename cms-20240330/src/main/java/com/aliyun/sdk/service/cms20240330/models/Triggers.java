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
 * {@link Triggers} extends {@link TeaModel}
 *
 * <p>Triggers</p>
 */
public class Triggers extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("comparisonOperator")
    private String comparisonOperator;

    @com.aliyun.core.annotation.NameInMap("condition")
    private String condition;

    @com.aliyun.core.annotation.NameInMap("conditions")
    private java.util.List<TriggerConditions> conditions;

    @com.aliyun.core.annotation.NameInMap("countCondition")
    private String countCondition;

    @com.aliyun.core.annotation.NameInMap("countOperator")
    @Deprecated
    private String countOperator;

    @com.aliyun.core.annotation.NameInMap("countThreshold")
    @Deprecated
    private Long countThreshold;

    @com.aliyun.core.annotation.NameInMap("durationSecs")
    private Integer durationSecs;

    @com.aliyun.core.annotation.NameInMap("expressionType")
    private String expressionType;

    @com.aliyun.core.annotation.NameInMap("logicOperator")
    private String logicOperator;

    @com.aliyun.core.annotation.NameInMap("matchField")
    @Deprecated
    private String matchField;

    @com.aliyun.core.annotation.NameInMap("matchOperator")
    @Deprecated
    private String matchOperator;

    @com.aliyun.core.annotation.NameInMap("matchValue")
    @Deprecated
    private String matchValue;

    @com.aliyun.core.annotation.NameInMap("max")
    private Double max;

    @com.aliyun.core.annotation.NameInMap("metricName")
    private String metricName;

    @com.aliyun.core.annotation.NameInMap("min")
    private Double min;

    @com.aliyun.core.annotation.NameInMap("operator")
    private String operator;

    @com.aliyun.core.annotation.NameInMap("period")
    private Integer period;

    @com.aliyun.core.annotation.NameInMap("preCondition")
    private String preCondition;

    @com.aliyun.core.annotation.NameInMap("queryName")
    private String queryName;

    @com.aliyun.core.annotation.NameInMap("severity")
    private String severity;

    @com.aliyun.core.annotation.NameInMap("statistics")
    private String statistics;

    @com.aliyun.core.annotation.NameInMap("threshold")
    private Object threshold;

    @com.aliyun.core.annotation.NameInMap("times")
    private Integer times;

    private Triggers(Builder builder) {
        this.comparisonOperator = builder.comparisonOperator;
        this.condition = builder.condition;
        this.conditions = builder.conditions;
        this.countCondition = builder.countCondition;
        this.countOperator = builder.countOperator;
        this.countThreshold = builder.countThreshold;
        this.durationSecs = builder.durationSecs;
        this.expressionType = builder.expressionType;
        this.logicOperator = builder.logicOperator;
        this.matchField = builder.matchField;
        this.matchOperator = builder.matchOperator;
        this.matchValue = builder.matchValue;
        this.max = builder.max;
        this.metricName = builder.metricName;
        this.min = builder.min;
        this.operator = builder.operator;
        this.period = builder.period;
        this.preCondition = builder.preCondition;
        this.queryName = builder.queryName;
        this.severity = builder.severity;
        this.statistics = builder.statistics;
        this.threshold = builder.threshold;
        this.times = builder.times;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Triggers create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comparisonOperator
     */
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * @return condition
     */
    public String getCondition() {
        return this.condition;
    }

    /**
     * @return conditions
     */
    public java.util.List<TriggerConditions> getConditions() {
        return this.conditions;
    }

    /**
     * @return countCondition
     */
    public String getCountCondition() {
        return this.countCondition;
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
     * @return expressionType
     */
    public String getExpressionType() {
        return this.expressionType;
    }

    /**
     * @return logicOperator
     */
    public String getLogicOperator() {
        return this.logicOperator;
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
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return min
     */
    public Double getMin() {
        return this.min;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return preCondition
     */
    public String getPreCondition() {
        return this.preCondition;
    }

    /**
     * @return queryName
     */
    public String getQueryName() {
        return this.queryName;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * @return statistics
     */
    public String getStatistics() {
        return this.statistics;
    }

    /**
     * @return threshold
     */
    public Object getThreshold() {
        return this.threshold;
    }

    /**
     * @return times
     */
    public Integer getTimes() {
        return this.times;
    }

    public static final class Builder {
        private String comparisonOperator; 
        private String condition; 
        private java.util.List<TriggerConditions> conditions; 
        private String countCondition; 
        private String countOperator; 
        private Long countThreshold; 
        private Integer durationSecs; 
        private String expressionType; 
        private String logicOperator; 
        private String matchField; 
        private String matchOperator; 
        private String matchValue; 
        private Double max; 
        private String metricName; 
        private Double min; 
        private String operator; 
        private Integer period; 
        private String preCondition; 
        private String queryName; 
        private String severity; 
        private String statistics; 
        private Object threshold; 
        private Integer times; 

        private Builder() {
        } 

        private Builder(Triggers model) {
            this.comparisonOperator = model.comparisonOperator;
            this.condition = model.condition;
            this.conditions = model.conditions;
            this.countCondition = model.countCondition;
            this.countOperator = model.countOperator;
            this.countThreshold = model.countThreshold;
            this.durationSecs = model.durationSecs;
            this.expressionType = model.expressionType;
            this.logicOperator = model.logicOperator;
            this.matchField = model.matchField;
            this.matchOperator = model.matchOperator;
            this.matchValue = model.matchValue;
            this.max = model.max;
            this.metricName = model.metricName;
            this.min = model.min;
            this.operator = model.operator;
            this.period = model.period;
            this.preCondition = model.preCondition;
            this.queryName = model.queryName;
            this.severity = model.severity;
            this.statistics = model.statistics;
            this.threshold = model.threshold;
            this.times = model.times;
        } 

        /**
         * <p>The comparison operator when the condition type is CLOUD_MONITORING_CONDITION.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleValue</p>
         */
        public Builder comparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * <p>The match expression when the condition type is SLS_MULTI_CONDITION. This corresponds to the V1 condition and is preserved as-is without parsing.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleValue</p>
         */
        public Builder condition(String condition) {
            this.condition = condition;
            return this;
        }

        /**
         * <p>The list of sub-conditions when the condition type is UMODEL_METRICSET_MULTI or PROMETHEUS_MULTI with expressionType=COMPOSITE. Each item contains queryName, operator, and threshold.</p>
         */
        public Builder conditions(java.util.List<TriggerConditions> conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
         * <p>The count match expression when the condition type is SLS_MULTI_CONDITION. This corresponds to the V1 countCondition and is preserved as-is without parsing.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleValue</p>
         */
        public Builder countCondition(String countCondition) {
            this.countCondition = countCondition;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The write path for SLS_MULTI_CONDITION has been disabled. Use countCondition instead.</p>
         * 
         * <strong>example:</strong>
         * <p>GTE</p>
         */
        public Builder countOperator(String countOperator) {
            this.countOperator = countOperator;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The write path for SLS_MULTI_CONDITION has been disabled. Use countCondition instead.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder countThreshold(Long countThreshold) {
            this.countThreshold = countThreshold;
            return this;
        }

        /**
         * <p>The duration in seconds during which data must continuously meet the condition before an alert is triggered. If not specified, the value is inherited from conditionConfig.durationSecs. This parameter is used by UMODEL_METRICSET_MULTI_CONDITION and PROMETHEUS_MULTI_CONDITION.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder durationSecs(Integer durationSecs) {
            this.durationSecs = durationSecs;
            return this;
        }

        /**
         * <p>The expression type. Set to SIMPLE or COMPOSITE when the condition type is UMODEL_METRICSET_MULTI_CONDITION or PROMETHEUS_MULTI_CONDITION.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder expressionType(String expressionType) {
            this.expressionType = expressionType;
            return this;
        }

        /**
         * <p>The logical operator when the condition type is UMODEL_METRICSET_MULTI or PROMETHEUS_MULTI with expressionType=COMPOSITE. Valid values: AND, OR, and UNLESS.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        public Builder logicOperator(String logicOperator) {
            this.logicOperator = logicOperator;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The write path for SLS_MULTI_CONDITION has been disabled. Use condition instead.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleValue</p>
         */
        public Builder matchField(String matchField) {
            this.matchField = matchField;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The write path for SLS_MULTI_CONDITION has been disabled. Use condition instead.</p>
         * 
         * <strong>example:</strong>
         * <p>PRESENT</p>
         */
        public Builder matchOperator(String matchOperator) {
            this.matchOperator = matchOperator;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The write path for SLS_MULTI_CONDITION has been disabled. Use condition instead.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleValue</p>
         */
        public Builder matchValue(String matchValue) {
            this.matchValue = matchValue;
            return this;
        }

        /**
         * <p>The upper bound of the range when the condition type is UMODEL_METRICSET_MULTI with expressionType=SIMPLE. This parameter is required when operator is set to IN_RANGE or OUT_OF_RANGE. The value must be greater than or equal to min.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder max(Double max) {
            this.max = max;
            return this;
        }

        /**
         * <p>The metric name when the condition type is CLOUD_MONITORING_CONDITION with expressionType=COMPOSITE. For SIMPLE expression type, the metric name is specified at the conditionConfig level by the metricName parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleMetricName</p>
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>The lower bound of the range when the condition type is UMODEL_METRICSET_MULTI with expressionType=SIMPLE. This parameter is required when operator is set to IN_RANGE or OUT_OF_RANGE.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder min(Double min) {
            this.min = min;
            return this;
        }

        /**
         * <p>The operator. For UMODEL_METRICSET_MULTI or PROMETHEUS_MULTI with expressionType=SIMPLE, this is a comparison operator (GT/GE/LT/LE/EQ/NE/IN_RANGE/OUT_OF_RANGE/PRESENT/NOT_PRESENT/ABOVE_UPPER/BELOW_LOWER/OUT_OF_BAND). For SLS_MULTI_CONDITION, this is aligned with the V1 caseList.type (HAS_DATA/HAS_DATA_COUNT/HAS_DATA_MATCH/HAS_DATA_MATCH_COUNT).</p>
         * 
         * <strong>example:</strong>
         * <p>GT</p>
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * <p>The collection period in seconds when the condition type is CLOUD_MONITORING_CONDITION with expressionType=COMPOSITE. For SIMPLE expression type, the period is specified at the conditionConfig level by the period parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.period = period;
            return this;
        }

        /**
         * <p>The precondition when the condition type is CLOUD_MONITORING_CONDITION.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleValue</p>
         */
        public Builder preCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }

        /**
         * <p>The referenced query name when the condition type is UMODEL_METRICSET_MULTI or PROMETHEUS_MULTI with expressionType=SIMPLE. This corresponds to QueryConfigUnified.queries[].name.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleMetricName</p>
         */
        public Builder queryName(String queryName) {
            this.queryName = queryName;
            return this;
        }

        /**
         * <p>The severity level. The priority order is CRITICAL &gt; ERROR &gt; WARN / WARNING &gt; INFO. When multiple triggers exist, they are sorted by this priority, and the first match triggers the alert. This parameter takes effect when the condition type is SLS_MULTI_CONDITION or CLOUD_MONITORING_CONDITION with expressionType=SIMPLE.</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * <p>The statistical method when the condition type is CLOUD_MONITORING_CONDITION.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleValue</p>
         */
        public Builder statistics(String statistics) {
            this.statistics = statistics;
            return this;
        }

        /**
         * <p>The threshold value. For CLOUD_MONITORING_CONDITION, this is a string. For UMODEL_METRICSET_MULTI and PROMETHEUS_MULTI, this is a numeric value.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        public Builder threshold(Object threshold) {
            this.threshold = threshold;
            return this;
        }

        /**
         * <p>The number of consecutive times the condition must be met before an alert is triggered when the condition type is CLOUD_MONITORING_CONDITION with expressionType=SIMPLE. Each entry has its own independent setting.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder times(Integer times) {
            this.times = times;
            return this;
        }

        public Triggers build() {
            return new Triggers(this);
        } 

    } 

}
