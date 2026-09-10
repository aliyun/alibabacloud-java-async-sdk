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
 * {@link AlertRuleCondition} extends {@link TeaModel}
 *
 * <p>AlertRuleCondition</p>
 */
public class AlertRuleCondition extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alertCount")
    private Integer alertCount;

    @com.aliyun.core.annotation.NameInMap("caseList")
    private java.util.List<CaseList> caseList;

    @com.aliyun.core.annotation.NameInMap("compareList")
    private java.util.List<CompareList> compareList;

    @com.aliyun.core.annotation.NameInMap("compositeEscalation")
    private CompositeEscalation compositeEscalation;

    @com.aliyun.core.annotation.NameInMap("countOperator")
    private String countOperator;

    @com.aliyun.core.annotation.NameInMap("countThreshold")
    private Long countThreshold;

    @com.aliyun.core.annotation.NameInMap("enableSeveritySuppression")
    private Boolean enableSeveritySuppression;

    @com.aliyun.core.annotation.NameInMap("escalationType")
    private String escalationType;

    @com.aliyun.core.annotation.NameInMap("expressEscalation")
    private ExpressEscalation expressEscalation;

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

    @com.aliyun.core.annotation.NameInMap("noDataAppendValue")
    private String noDataAppendValue;

    @com.aliyun.core.annotation.NameInMap("noDataPolicy")
    private String noDataPolicy;

    @com.aliyun.core.annotation.NameInMap("oper")
    private String oper;

    @com.aliyun.core.annotation.NameInMap("relation")
    private String relation;

    @com.aliyun.core.annotation.NameInMap("simpleEscalation")
    private SimpleEscalation simpleEscalation;

    @com.aliyun.core.annotation.NameInMap("thresholdList")
    private java.util.List<ThresholdList> thresholdList;

    @com.aliyun.core.annotation.NameInMap("triggers")
    private java.util.List<Triggers> triggers;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.NameInMap("value")
    private Double value;

    private AlertRuleCondition(Builder builder) {
        this.alertCount = builder.alertCount;
        this.caseList = builder.caseList;
        this.compareList = builder.compareList;
        this.compositeEscalation = builder.compositeEscalation;
        this.countOperator = builder.countOperator;
        this.countThreshold = builder.countThreshold;
        this.enableSeveritySuppression = builder.enableSeveritySuppression;
        this.escalationType = builder.escalationType;
        this.expressEscalation = builder.expressEscalation;
        this.matchField = builder.matchField;
        this.matchOperator = builder.matchOperator;
        this.matchValue = builder.matchValue;
        this.max = builder.max;
        this.min = builder.min;
        this.noDataAlertLevel = builder.noDataAlertLevel;
        this.noDataAppendValue = builder.noDataAppendValue;
        this.noDataPolicy = builder.noDataPolicy;
        this.oper = builder.oper;
        this.relation = builder.relation;
        this.simpleEscalation = builder.simpleEscalation;
        this.thresholdList = builder.thresholdList;
        this.triggers = builder.triggers;
        this.type = builder.type;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleCondition create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertCount
     */
    public Integer getAlertCount() {
        return this.alertCount;
    }

    /**
     * @return caseList
     */
    public java.util.List<CaseList> getCaseList() {
        return this.caseList;
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
    public CompositeEscalation getCompositeEscalation() {
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
    public ExpressEscalation getExpressEscalation() {
        return this.expressEscalation;
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
     * @return noDataAppendValue
     */
    public String getNoDataAppendValue() {
        return this.noDataAppendValue;
    }

    /**
     * @return noDataPolicy
     */
    public String getNoDataPolicy() {
        return this.noDataPolicy;
    }

    /**
     * @return oper
     */
    public String getOper() {
        return this.oper;
    }

    /**
     * @return relation
     */
    public String getRelation() {
        return this.relation;
    }

    /**
     * @return simpleEscalation
     */
    public SimpleEscalation getSimpleEscalation() {
        return this.simpleEscalation;
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
     * @return value
     */
    public Double getValue() {
        return this.value;
    }

    public static final class Builder {
        private Integer alertCount; 
        private java.util.List<CaseList> caseList; 
        private java.util.List<CompareList> compareList; 
        private CompositeEscalation compositeEscalation; 
        private String countOperator; 
        private Long countThreshold; 
        private Boolean enableSeveritySuppression; 
        private String escalationType; 
        private ExpressEscalation expressEscalation; 
        private String matchField; 
        private String matchOperator; 
        private String matchValue; 
        private Double max; 
        private Double min; 
        private String noDataAlertLevel; 
        private String noDataAppendValue; 
        private String noDataPolicy; 
        private String oper; 
        private String relation; 
        private SimpleEscalation simpleEscalation; 
        private java.util.List<ThresholdList> thresholdList; 
        private java.util.List<Triggers> triggers; 
        private String type; 
        private Double value; 

        private Builder() {
        } 

        private Builder(AlertRuleCondition model) {
            this.alertCount = model.alertCount;
            this.caseList = model.caseList;
            this.compareList = model.compareList;
            this.compositeEscalation = model.compositeEscalation;
            this.countOperator = model.countOperator;
            this.countThreshold = model.countThreshold;
            this.enableSeveritySuppression = model.enableSeveritySuppression;
            this.escalationType = model.escalationType;
            this.expressEscalation = model.expressEscalation;
            this.matchField = model.matchField;
            this.matchOperator = model.matchOperator;
            this.matchValue = model.matchValue;
            this.max = model.max;
            this.min = model.min;
            this.noDataAlertLevel = model.noDataAlertLevel;
            this.noDataAppendValue = model.noDataAppendValue;
            this.noDataPolicy = model.noDataPolicy;
            this.oper = model.oper;
            this.relation = model.relation;
            this.simpleEscalation = model.simpleEscalation;
            this.thresholdList = model.thresholdList;
            this.triggers = model.triggers;
            this.type = model.type;
            this.value = model.value;
        } 

        /**
         * <p>Applicable condition type: SLS_CONDITION.</p>
         * <p>The number of times the condition must be met before an alert is triggered. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder alertCount(Integer alertCount) {
            this.alertCount = alertCount;
            return this;
        }

        /**
         * <p>Applicable condition type: SLS_CONDITION.</p>
         * <p>The list of Simple Log Service (SLS) alert conditions.</p>
         */
        public Builder caseList(java.util.List<CaseList> caseList) {
            this.caseList = caseList;
            return this;
        }

        /**
         * <p>Applicable condition type: APM_CONDITION.</p>
         * <p>The list of Application Performance Monitoring (APM) alert comparison conditions.</p>
         */
        public Builder compareList(java.util.List<CompareList> compareList) {
            this.compareList = compareList;
            return this;
        }

        /**
         * <p>Applicable condition type: CMS_BASIC_CONDITION.</p>
         * <p>Valid when escalationType is set to composite. The composite metric alert condition.</p>
         */
        public Builder compositeEscalation(CompositeEscalation compositeEscalation) {
            this.compositeEscalation = compositeEscalation;
            return this;
        }

        /**
         * <p>The count comparison operator, specified when type=LOG_SET_CONDITION. Valid values: GTE / GT / EQ / LTE / LT.</p>
         * 
         * <strong>example:</strong>
         * <p>GTE</p>
         */
        public Builder countOperator(String countOperator) {
            this.countOperator = countOperator;
            return this;
        }

        /**
         * <p>The count threshold, specified when type=LOG_SET_CONDITION.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder countThreshold(Long countThreshold) {
            this.countThreshold = countThreshold;
            return this;
        }

        /**
         * <p>Used when type=UMODEL_METRICSET_MULTI_CONDITION. Specifies whether to enable severity suppression to the highest level. Default value: true. Only the highest severity level is reported for the same entity.</p>
         */
        public Builder enableSeveritySuppression(Boolean enableSeveritySuppression) {
            this.enableSeveritySuppression = enableSeveritySuppression;
            return this;
        }

        /**
         * <p>Applicable condition type: CMS_BASIC_CONDITION.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>simple: simple metric condition</li>
         * <li>composite: composite metric condition</li>
         * <li>express: expression condition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>simple</p>
         */
        public Builder escalationType(String escalationType) {
            this.escalationType = escalationType;
            return this;
        }

        /**
         * <p>Applicable condition type: CMS_BASIC_CONDITION.</p>
         * <p>Valid when escalationType=composite. Specifies the multi-metric composite alert conditions.</p>
         */
        public Builder expressEscalation(ExpressEscalation expressEscalation) {
            this.expressEscalation = expressEscalation;
            return this;
        }

        /**
         * <p>The log field name, specified when type=LOG_SET_CONDITION and matchOperator=CONTAINS/EQUALS/REGEX.</p>
         * 
         * <strong>example:</strong>
         * <p>logLevel</p>
         */
        public Builder matchField(String matchField) {
            this.matchField = matchField;
            return this;
        }

        /**
         * <p>The match operator, specified when type=LOG_SET_CONDITION. Valid values: PRESENT / NOT_PRESENT / CONTAINS / EQUALS / REGEX.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTAINS</p>
         */
        public Builder matchOperator(String matchOperator) {
            this.matchOperator = matchOperator;
            return this;
        }

        /**
         * <p>The match value, specified when type=LOG_SET_CONDITION and matchOperator=CONTAINS/EQUALS/REGEX.</p>
         * 
         * <strong>example:</strong>
         * <p>error</p>
         */
        public Builder matchValue(String matchValue) {
            this.matchValue = matchValue;
            return this;
        }

        /**
         * <p>The upper bound of the range specified when type=BASIC_CONDITION and oper=IN_RANGE/OUT_OF_RANGE.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder max(Double max) {
            this.max = max;
            return this;
        }

        /**
         * <p>The lower bound of the range specified when type=BASIC_CONDITION and oper=IN_RANGE/OUT_OF_RANGE.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder min(Double min) {
            this.min = min;
            return this;
        }

        /**
         * <p>Applicable condition type: APM_CONDITION.</p>
         * <p>The alert level when no data is available. If not specified, no alert is triggered for no-data scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        public Builder noDataAlertLevel(String noDataAlertLevel) {
            this.noDataAlertLevel = noDataAlertLevel;
            return this;
        }

        /**
         * <p>Applicable condition type: APM_CONDITION.</p>
         * <p>The value to use as compensation when no data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder noDataAppendValue(String noDataAppendValue) {
            this.noDataAppendValue = noDataAppendValue;
            return this;
        }

        /**
         * <p>Applicable condition type: CMS_BASIC_CONDITION.</p>
         * <p>Specifies how to handle alerts when no monitoring data is available. Valid values:</p>
         * <ul>
         * <li>KEEP_LAST_STATE (default): No action is taken.</li>
         * <li>INSUFFICIENT_DATA: The alert content indicates no data.</li>
         * <li>OK: Normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KEEP_LAST_STATE</p>
         */
        public Builder noDataPolicy(String noDataPolicy) {
            this.noDataPolicy = noDataPolicy;
            return this;
        }

        /**
         * <p>The comparison operator. Determines whether year-over-year or period-over-period comparison is used.</p>
         * <ul>
         * <li>Greater than: GT</li>
         * <li>Greater than or equal to: GTE</li>
         * <li>Less than: LT</li>
         * <li>Less than or equal to: LTE</li>
         * <li>Equal to: EQ</li>
         * <li>Not equal to: NE</li>
         * <li>Year-over-year increase: YOY_UP</li>
         * <li>Year-over-year decrease: YOY_DOWN</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LT</p>
         */
        public Builder oper(String oper) {
            this.oper = oper;
            return this;
        }

        /**
         * <p>Applicable condition type: APM_CONDITION.</p>
         * <p>The logical relationship between multiple conditions. Valid values:</p>
         * <ul>
         * <li>and</li>
         * <li>or</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>and</p>
         */
        public Builder relation(String relation) {
            this.relation = relation;
            return this;
        }

        /**
         * <p>Applicable condition type: CMS_BASIC_CONDITION.</p>
         * <p>Valid only when escalationType is set to simple. The alert condition for a single metric.</p>
         */
        public Builder simpleEscalation(SimpleEscalation simpleEscalation) {
            this.simpleEscalation = simpleEscalation;
            return this;
        }

        /**
         * <p>The list of multi-level thresholds and severity levels, used to map different thresholds to corresponding alert levels.</p>
         */
        public Builder thresholdList(java.util.List<ThresholdList> thresholdList) {
            this.thresholdList = thresholdList;
            return this;
        }

        /**
         * <p>Specified when type=UMODEL_METRICSET_MULTI_CONDITION. The list of trigger conditions. Each item contains severity, durationSecs, and an expression (SIMPLE for single-metric or COMPOSITE for multi-metric AND/OR/UNLESS).</p>
         */
        public Builder triggers(java.util.List<Triggers> triggers) {
            this.triggers = triggers;
            return this;
        }

        /**
         * <p>The rule condition type. Valid values:</p>
         * <ul>
         * <li>SLS_CONDITION: SLS alert condition.</li>
         * <li>APM_CONDITION: APM alert condition.</li>
         * <li>CMS_BASIC_CONDITION: CloudMonitor Basic CloudMonitor alerts condition.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SLS_CONDITION</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The threshold for triggering an alert.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder value(Double value) {
            this.value = value;
            return this;
        }

        public AlertRuleCondition build() {
            return new AlertRuleCondition(this);
        } 

    } 

    /**
     * 
     * {@link AlertRuleCondition} extends {@link TeaModel}
     *
     * <p>AlertRuleCondition</p>
     */
    public static class CaseList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("countCondition")
        private String countCondition;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private CaseList(Builder builder) {
            this.condition = builder.condition;
            this.countCondition = builder.countCondition;
            this.level = builder.level;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CaseList create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return countCondition
         */
        public String getCountCondition() {
            return this.countCondition;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String condition; 
            private String countCondition; 
            private String level; 
            private String type; 

            private Builder() {
            } 

            private Builder(CaseList model) {
                this.condition = model.condition;
                this.countCondition = model.countCondition;
                this.level = model.level;
                this.type = model.type;
            } 

            /**
             * <p>The match expression. Example: logLevel: error.</p>
             * 
             * <strong>example:</strong>
             * <p>logLevel: error</p>
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The count match expression. Examples:
             * Range combination: <strong>count</strong> &gt;= 3 &amp;&amp; <strong>count</strong> &lt;= 10
             * Single range: __count__ &gt;= 3</p>
             * 
             * <strong>example:</strong>
             * <p>count &gt;= 3</p>
             */
            public Builder countCondition(String countCondition) {
                this.countCondition = countCondition;
                return this;
            }

            /**
             * <p>The alert level when the condition is met.</p>
             * 
             * <strong>example:</strong>
             * <p>INFO</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The match type: has data, has specific count of data, has data match, or has specific count of data match.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>HasData: has data</li>
             * <li>HasDataCount: has specific count of data</li>
             * <li>HasDataMatch: has data match</li>
             * <li>HasDataMatchCount: has specific count of data match</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HasData</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CaseList build() {
                return new CaseList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AlertRuleCondition} extends {@link TeaModel}
     *
     * <p>AlertRuleCondition</p>
     */
    public static class ValueLevelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("value")
        private Double value;

        private ValueLevelList(Builder builder) {
            this.level = builder.level;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValueLevelList create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return value
         */
        public Double getValue() {
            return this.value;
        }

        public static final class Builder {
            private String level; 
            private Double value; 

            private Builder() {
            } 

            private Builder(ValueLevelList model) {
                this.level = model.level;
                this.value = model.value;
            } 

            /**
             * <p>The level corresponding to the threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>INFO</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The comparison threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder value(Double value) {
                this.value = value;
                return this;
            }

            public ValueLevelList build() {
                return new ValueLevelList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AlertRuleCondition} extends {@link TeaModel}
     *
     * <p>AlertRuleCondition</p>
     */
    public static class CompareList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aggregate")
        private String aggregate;

        @com.aliyun.core.annotation.NameInMap("baseUnit")
        private String baseUnit;

        @com.aliyun.core.annotation.NameInMap("displayUnit")
        private String displayUnit;

        @com.aliyun.core.annotation.NameInMap("oper")
        private String oper;

        @com.aliyun.core.annotation.NameInMap("value")
        private Double value;

        @com.aliyun.core.annotation.NameInMap("valueLevelList")
        private java.util.List<ValueLevelList> valueLevelList;

        @com.aliyun.core.annotation.NameInMap("yoyTimeUnit")
        private String yoyTimeUnit;

        @com.aliyun.core.annotation.NameInMap("yoyTimeValue")
        private Integer yoyTimeValue;

        private CompareList(Builder builder) {
            this.aggregate = builder.aggregate;
            this.baseUnit = builder.baseUnit;
            this.displayUnit = builder.displayUnit;
            this.oper = builder.oper;
            this.value = builder.value;
            this.valueLevelList = builder.valueLevelList;
            this.yoyTimeUnit = builder.yoyTimeUnit;
            this.yoyTimeValue = builder.yoyTimeValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompareList create() {
            return builder().build();
        }

        /**
         * @return aggregate
         */
        public String getAggregate() {
            return this.aggregate;
        }

        /**
         * @return baseUnit
         */
        public String getBaseUnit() {
            return this.baseUnit;
        }

        /**
         * @return displayUnit
         */
        public String getDisplayUnit() {
            return this.displayUnit;
        }

        /**
         * @return oper
         */
        public String getOper() {
            return this.oper;
        }

        /**
         * @return value
         */
        public Double getValue() {
            return this.value;
        }

        /**
         * @return valueLevelList
         */
        public java.util.List<ValueLevelList> getValueLevelList() {
            return this.valueLevelList;
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
            private String aggregate; 
            private String baseUnit; 
            private String displayUnit; 
            private String oper; 
            private Double value; 
            private java.util.List<ValueLevelList> valueLevelList; 
            private String yoyTimeUnit; 
            private Integer yoyTimeValue; 

            private Builder() {
            } 

            private Builder(CompareList model) {
                this.aggregate = model.aggregate;
                this.baseUnit = model.baseUnit;
                this.displayUnit = model.displayUnit;
                this.oper = model.oper;
                this.value = model.value;
                this.valueLevelList = model.valueLevelList;
                this.yoyTimeUnit = model.yoyTimeUnit;
                this.yoyTimeValue = model.yoyTimeValue;
            } 

            /**
             * <p>The aggregation function applied after time series.</p>
             * <ul>
             * <li>count</li>
             * <li>sum</li>
             * <li>avg</li>
             * <li>min</li>
             * <li>max</li>
             * <li>p90</li>
             * <li>p95</li>
             * <li>p99</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>count</p>
             */
            public Builder aggregate(String aggregate) {
                this.aggregate = aggregate;
                return this;
            }

            /**
             * <p>The data unit.</p>
             * 
             * <strong>example:</strong>
             * <p>%</p>
             */
            public Builder baseUnit(String baseUnit) {
                this.baseUnit = baseUnit;
                return this;
            }

            /**
             * <p>The display unit.</p>
             * 
             * <strong>example:</strong>
             * <p>%</p>
             */
            public Builder displayUnit(String displayUnit) {
                this.displayUnit = displayUnit;
                return this;
            }

            /**
             * <p>The comparison operator. Determines whether year-over-year or period-over-period comparison is used.</p>
             * <ul>
             * <li>Greater than: GT</li>
             * <li>Greater than or equal to: GTE</li>
             * <li>Less than: LT</li>
             * <li>Less than or equal to: LTE</li>
             * <li>Equal to: EQ</li>
             * <li>Not equal to: NE</li>
             * <li>Year-over-year increase: YOY_UP</li>
             * <li>Year-over-year decrease: YOY_DOWN</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GT</p>
             */
            public Builder oper(String oper) {
                this.oper = oper;
                return this;
            }

            /**
             * <p>The comparison threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder value(Double value) {
                this.value = value;
                return this;
            }

            /**
             * <p>The list of alert levels for different values.</p>
             */
            public Builder valueLevelList(java.util.List<ValueLevelList> valueLevelList) {
                this.valueLevelList = valueLevelList;
                return this;
            }

            /**
             * <p>The year-over-year time unit. Valid only when oper is set to YOY_UP or YOY_DOWN.
             * Valid values: minute, hour, day, week, month.</p>
             * 
             * <strong>example:</strong>
             * <p>month</p>
             */
            public Builder yoyTimeUnit(String yoyTimeUnit) {
                this.yoyTimeUnit = yoyTimeUnit;
                return this;
            }

            /**
             * <p>The year-over-year time value. Used together with yoyTimeUnit.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder yoyTimeValue(Integer yoyTimeValue) {
                this.yoyTimeValue = yoyTimeValue;
                return this;
            }

            public CompareList build() {
                return new CompareList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AlertRuleCondition} extends {@link TeaModel}
     *
     * <p>AlertRuleCondition</p>
     */
    public static class Escalations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("comparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("metricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("period")
        private Long period;

        @com.aliyun.core.annotation.NameInMap("statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("threshold")
        private Double threshold;

        private Escalations(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.metricName = builder.metricName;
            this.period = builder.period;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Escalations create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return period
         */
        public Long getPeriod() {
            return this.period;
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
        public Double getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String comparisonOperator; 
            private String metricName; 
            private Long period; 
            private String statistics; 
            private Double threshold; 

            private Builder() {
            } 

            private Builder(Escalations model) {
                this.comparisonOperator = model.comparisonOperator;
                this.metricName = model.metricName;
                this.period = model.period;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
            } 

            /**
             * <p>The threshold comparison operator. Valid values:</p>
             * <ul>
             * <li>GreaterThanOrEqualToThreshold: Greater than or equal to.</li>
             * <li>GreaterThanThreshold: Greater than.</li>
             * <li>LessThanOrEqualToThreshold: Less than or equal to.</li>
             * <li>LessThanThreshold: Less than.</li>
             * <li>NotEqualToThreshold: Not equal to.</li>
             * <li>EqualToThreshold: Equal to.</li>
             * <li>GreaterThanYesterday: Year-over-year increase compared with the same time yesterday.</li>
             * <li>LessThanYesterday: Year-over-year decrease compared with the same time yesterday.</li>
             * <li>GreaterThanLastWeek: Year-over-year increase compared with the same time last week.</li>
             * <li>LessThanLastWeek: Year-over-year decrease compared with the same time last week.</li>
             * <li>GreaterThanLastPeriod: Period-over-period increase compared with the previous period.</li>
             * <li>LessThanLastPeriod: Period-over-period decrease compared with the previous period.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GreaterThanOrEqualToThreshold</p>
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * <p>The metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>cpu_total</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The time window of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The statistical method. The value of this parameter is determined by the Statistics column corresponding to the MetricName of the specified cloud service. Example values for the statistical method of a metric:</p>
             * <ul>
             * <li>$Maximum: maximum value.</li>
             * <li>$Minimum: minimum value.</li>
             * <li>$Average: average value.</li>
             * <li>$Availability: availability rate (typically used for site monitoring).</li>
             * </ul>
             * <p>Note: $ is the unified prefix symbol for metrics.</p>
             * 
             * <strong>example:</strong>
             * <p>$Maximum</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The alert threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder threshold(Double threshold) {
                this.threshold = threshold;
                return this;
            }

            public Escalations build() {
                return new Escalations(this);
            } 

        } 

    }
    /**
     * 
     * {@link AlertRuleCondition} extends {@link TeaModel}
     *
     * <p>AlertRuleCondition</p>
     */
    public static class CompositeEscalation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("escalations")
        private java.util.List<Escalations> escalations;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("relation")
        private String relation;

        @com.aliyun.core.annotation.NameInMap("times")
        private Integer times;

        private CompositeEscalation(Builder builder) {
            this.escalations = builder.escalations;
            this.level = builder.level;
            this.relation = builder.relation;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompositeEscalation create() {
            return builder().build();
        }

        /**
         * @return escalations
         */
        public java.util.List<Escalations> getEscalations() {
            return this.escalations;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return relation
         */
        public String getRelation() {
            return this.relation;
        }

        /**
         * @return times
         */
        public Integer getTimes() {
            return this.times;
        }

        public static final class Builder {
            private java.util.List<Escalations> escalations; 
            private String level; 
            private String relation; 
            private Integer times; 

            private Builder() {
            } 

            private Builder(CompositeEscalation model) {
                this.escalations = model.escalations;
                this.level = model.level;
                this.relation = model.relation;
                this.times = model.times;
            } 

            /**
             * <p>The list of composite conditions for multiple metrics.</p>
             */
            public Builder escalations(java.util.List<Escalations> escalations) {
                this.escalations = escalations;
                return this;
            }

            /**
             * <p>The alert level triggered when the condition is met. Composite metric alerts support only one level.</p>
             * 
             * <strong>example:</strong>
             * <p>INFO</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The relationship between multiple metric conditions. Valid values: and, or.</p>
             * 
             * <strong>example:</strong>
             * <p>and</p>
             */
            public Builder relation(String relation) {
                this.relation = relation;
                return this;
            }

            /**
             * <p>The number of times the condition must be met to trigger an alert.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            public CompositeEscalation build() {
                return new CompositeEscalation(this);
            } 

        } 

    }
    /**
     * 
     * {@link AlertRuleCondition} extends {@link TeaModel}
     *
     * <p>AlertRuleCondition</p>
     */
    public static class ExpressEscalation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("rawExpression")
        private String rawExpression;

        @com.aliyun.core.annotation.NameInMap("times")
        private Integer times;

        private ExpressEscalation(Builder builder) {
            this.level = builder.level;
            this.rawExpression = builder.rawExpression;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpressEscalation create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return rawExpression
         */
        public String getRawExpression() {
            return this.rawExpression;
        }

        /**
         * @return times
         */
        public Integer getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String level; 
            private String rawExpression; 
            private Integer times; 

            private Builder() {
            } 

            private Builder(ExpressEscalation model) {
                this.level = model.level;
                this.rawExpression = model.rawExpression;
                this.times = model.times;
            } 

            /**
             * <p>The alert level triggered when the condition is met. Expression-based alerts support only one level.</p>
             * <ul>
             * <li>CRITICAL</li>
             * <li>WARNING</li>
             * <li>INFO</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INFO</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The alert conditional expression.</p>
             * 
             * <strong>example:</strong>
             * <p>@cpu_total[60].$Average &gt; 60</p>
             */
            public Builder rawExpression(String rawExpression) {
                this.rawExpression = rawExpression;
                return this;
            }

            /**
             * <p>The number of times the condition must be met to trigger an alert.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            public ExpressEscalation build() {
                return new ExpressEscalation(this);
            } 

        } 

    }
    /**
     * 
     * {@link AlertRuleCondition} extends {@link TeaModel}
     *
     * <p>AlertRuleCondition</p>
     */
    public static class SimpleEscalationEscalations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("comparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("threshold")
        private Double threshold;

        @com.aliyun.core.annotation.NameInMap("times")
        private Integer times;

        private SimpleEscalationEscalations(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.level = builder.level;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimpleEscalationEscalations create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
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
        public Double getThreshold() {
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
            private String level; 
            private String statistics; 
            private Double threshold; 
            private Integer times; 

            private Builder() {
            } 

            private Builder(SimpleEscalationEscalations model) {
                this.comparisonOperator = model.comparisonOperator;
                this.level = model.level;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.times = model.times;
            } 

            /**
             * <p>The threshold comparison operator. Valid values:</p>
             * <ul>
             * <li>GreaterThanOrEqualToThreshold: Greater than or equal to.</li>
             * <li>GreaterThanThreshold: Greater than.</li>
             * <li>LessThanOrEqualToThreshold: Less than or equal to.</li>
             * <li>LessThanThreshold: Less than.</li>
             * <li>NotEqualToThreshold: Not equal to.</li>
             * <li>EqualToThreshold: Equal to.</li>
             * <li>GreaterThanYesterday: Year-over-year increase compared with the same time yesterday.</li>
             * <li>LessThanYesterday: Year-over-year decrease compared with the same time yesterday.</li>
             * <li>GreaterThanLastWeek: Year-over-year increase compared with the same time last week.</li>
             * <li>LessThanLastWeek: Year-over-year decrease compared with the same time last week.</li>
             * <li>GreaterThanLastPeriod: Period-over-period increase compared with the previous period.</li>
             * <li>LessThanLastPeriod: Period-over-period decrease compared with the previous period.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GreaterThanOrEqualToThreshold</p>
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * <p>The alert level triggered when the condition is met. Expression-based alerts support only one level.</p>
             * <ul>
             * <li>CRITICAL</li>
             * <li>WARNING</li>
             * <li>INFO</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INFO</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The statistical method. The valid values of this parameter are determined by the Statistics column corresponding to the MetricName of the specified cloud service. Examples: Maximum, Minimum, and Average.</p>
             * 
             * <strong>example:</strong>
             * <p>Average</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The alert threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder threshold(Double threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>The number of times the condition must be met to trigger an alert.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            public SimpleEscalationEscalations build() {
                return new SimpleEscalationEscalations(this);
            } 

        } 

    }
    /**
     * 
     * {@link AlertRuleCondition} extends {@link TeaModel}
     *
     * <p>AlertRuleCondition</p>
     */
    public static class SimpleEscalation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("escalations")
        private java.util.List<SimpleEscalationEscalations> escalations;

        @com.aliyun.core.annotation.NameInMap("metricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("period")
        private Long period;

        private SimpleEscalation(Builder builder) {
            this.escalations = builder.escalations;
            this.metricName = builder.metricName;
            this.period = builder.period;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimpleEscalation create() {
            return builder().build();
        }

        /**
         * @return escalations
         */
        public java.util.List<SimpleEscalationEscalations> getEscalations() {
            return this.escalations;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return period
         */
        public Long getPeriod() {
            return this.period;
        }

        public static final class Builder {
            private java.util.List<SimpleEscalationEscalations> escalations; 
            private String metricName; 
            private Long period; 

            private Builder() {
            } 

            private Builder(SimpleEscalation model) {
                this.escalations = model.escalations;
                this.metricName = model.metricName;
                this.period = model.period;
            } 

            /**
             * <p>The list of conditions. If an alert rule corresponds to multiple levels, each level has a condition object.</p>
             */
            public Builder escalations(java.util.List<SimpleEscalationEscalations> escalations) {
                this.escalations = escalations;
                return this;
            }

            /**
             * <p>Applicable condition type: CMS_BASIC_CONDITION.</p>
             * <p>The metric associated with the alert condition.</p>
             * 
             * <strong>example:</strong>
             * <p>cpu_total</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The time window of the metric, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            public SimpleEscalation build() {
                return new SimpleEscalation(this);
            } 

        } 

    }
    /**
     * 
     * {@link AlertRuleCondition} extends {@link TeaModel}
     *
     * <p>AlertRuleCondition</p>
     */
    public static class ThresholdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("max")
        private Double max;

        @com.aliyun.core.annotation.NameInMap("min")
        private Double min;

        @com.aliyun.core.annotation.NameInMap("severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("threshold")
        private Double threshold;

        private ThresholdList(Builder builder) {
            this.max = builder.max;
            this.min = builder.min;
            this.severity = builder.severity;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ThresholdList create() {
            return builder().build();
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
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return threshold
         */
        public Double getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private Double max; 
            private Double min; 
            private String severity; 
            private Double threshold; 

            private Builder() {
            } 

            private Builder(ThresholdList model) {
                this.max = model.max;
                this.min = model.min;
                this.severity = model.severity;
                this.threshold = model.threshold;
            } 

            /**
             * <p>The upper bound of the range (required when operator=IN_RANGE/OUT_OF_RANGE).</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder max(Double max) {
                this.max = max;
                return this;
            }

            /**
             * <p>The lower bound of the range (required when operator=IN_RANGE/OUT_OF_RANGE).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder min(Double min) {
                this.min = min;
                return this;
            }

            /**
             * <p>The severity level.</p>
             * 
             * <strong>example:</strong>
             * <p>CRITICAL</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The threshold (required when the operator is not a range operator).</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder threshold(Double threshold) {
                this.threshold = threshold;
                return this;
            }

            public ThresholdList build() {
                return new ThresholdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AlertRuleCondition} extends {@link TeaModel}
     *
     * <p>AlertRuleCondition</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expressionType")
        private String expressionType;

        @com.aliyun.core.annotation.NameInMap("operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("queryName")
        private String queryName;

        @com.aliyun.core.annotation.NameInMap("threshold")
        private Double threshold;

        private Conditions(Builder builder) {
            this.expressionType = builder.expressionType;
            this.operator = builder.operator;
            this.queryName = builder.queryName;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return expressionType
         */
        public String getExpressionType() {
            return this.expressionType;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return queryName
         */
        public String getQueryName() {
            return this.queryName;
        }

        /**
         * @return threshold
         */
        public Double getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String expressionType; 
            private String operator; 
            private String queryName; 
            private Double threshold; 

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.expressionType = model.expressionType;
                this.operator = model.operator;
                this.queryName = model.queryName;
                this.threshold = model.threshold;
            } 

            /**
             * <p>The conditional expression type of the sub-condition, typically SIMPLE.</p>
             * 
             * <strong>example:</strong>
             * <p>SIMPLE</p>
             */
            public Builder expressionType(String expressionType) {
                this.expressionType = expressionType;
                return this;
            }

            /**
             * <p>The comparison operator of the sub-condition, used to compare the query result with the threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>GT</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The query name referenced by the sub-condition, corresponding to the name in queries.</p>
             * 
             * <strong>example:</strong>
             * <p>cpuUsageQuery</p>
             */
            public Builder queryName(String queryName) {
                this.queryName = queryName;
                return this;
            }

            /**
             * <p>The threshold value of the sub-condition.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder threshold(Double threshold) {
                this.threshold = threshold;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link AlertRuleCondition} extends {@link TeaModel}
     *
     * <p>AlertRuleCondition</p>
     */
    public static class Expression extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("conditions")
        private java.util.List<Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("expressionType")
        private String expressionType;

        @com.aliyun.core.annotation.NameInMap("logicOperator")
        private String logicOperator;

        private Expression(Builder builder) {
            this.conditions = builder.conditions;
            this.expressionType = builder.expressionType;
            this.logicOperator = builder.logicOperator;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Expression create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public java.util.List<Conditions> getConditions() {
            return this.conditions;
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

        public static final class Builder {
            private java.util.List<Conditions> conditions; 
            private String expressionType; 
            private String logicOperator; 

            private Builder() {
            } 

            private Builder(Expression model) {
                this.conditions = model.conditions;
                this.expressionType = model.expressionType;
                this.logicOperator = model.logicOperator;
            } 

            /**
             * <p>The list of sub-conditions for the trigger condition. Multiple sub-conditions are evaluated based on the logicOperator of the parent expression.</p>
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>The expression type. SIMPLE indicates a single-metric condition. COMPOSITE indicates a multi-metric composite condition.</p>
             * 
             * <strong>example:</strong>
             * <p>SIMPLE</p>
             */
            public Builder expressionType(String expressionType) {
                this.expressionType = expressionType;
                return this;
            }

            /**
             * <p>The multi-metric composite operator. Valid only when expressionType=COMPOSITE.</p>
             * 
             * <strong>example:</strong>
             * <p>AND</p>
             */
            public Builder logicOperator(String logicOperator) {
                this.logicOperator = logicOperator;
                return this;
            }

            public Expression build() {
                return new Expression(this);
            } 

        } 

    }
    /**
     * 
     * {@link AlertRuleCondition} extends {@link TeaModel}
     *
     * <p>AlertRuleCondition</p>
     */
    public static class Triggers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("durationSecs")
        private Integer durationSecs;

        @com.aliyun.core.annotation.NameInMap("expression")
        private Expression expression;

        @com.aliyun.core.annotation.NameInMap("severity")
        private String severity;

        private Triggers(Builder builder) {
            this.durationSecs = builder.durationSecs;
            this.expression = builder.expression;
            this.severity = builder.severity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Triggers create() {
            return builder().build();
        }

        /**
         * @return durationSecs
         */
        public Integer getDurationSecs() {
            return this.durationSecs;
        }

        /**
         * @return expression
         */
        public Expression getExpression() {
            return this.expression;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        public static final class Builder {
            private Integer durationSecs; 
            private Expression expression; 
            private String severity; 

            private Builder() {
            } 

            private Builder(Triggers model) {
                this.durationSecs = model.durationSecs;
                this.expression = model.expression;
                this.severity = model.severity;
            } 

            /**
             * <p>The duration in seconds that the condition must be continuously met before an alert is triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder durationSecs(Integer durationSecs) {
                this.durationSecs = durationSecs;
                return this;
            }

            /**
             * <p>The expression of the trigger condition. Supports two forms: SIMPLE (single-metric) and COMPOSITE (multi-metric AND/OR/UNLESS combination).</p>
             */
            public Builder expression(Expression expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The alert severity level that corresponds to this trigger condition when it is met.</p>
             * 
             * <strong>example:</strong>
             * <p>CRITICAL</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            public Triggers build() {
                return new Triggers(this);
            } 

        } 

    }
}
