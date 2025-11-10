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

    @com.aliyun.core.annotation.NameInMap("escalationType")
    private String escalationType;

    @com.aliyun.core.annotation.NameInMap("expressEscalation")
    private ExpressEscalation expressEscalation;

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
        this.escalationType = builder.escalationType;
        this.expressEscalation = builder.expressEscalation;
        this.noDataAlertLevel = builder.noDataAlertLevel;
        this.noDataAppendValue = builder.noDataAppendValue;
        this.noDataPolicy = builder.noDataPolicy;
        this.oper = builder.oper;
        this.relation = builder.relation;
        this.simpleEscalation = builder.simpleEscalation;
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
        private String escalationType; 
        private ExpressEscalation expressEscalation; 
        private String noDataAlertLevel; 
        private String noDataAppendValue; 
        private String noDataPolicy; 
        private String oper; 
        private String relation; 
        private SimpleEscalation simpleEscalation; 
        private String type; 
        private Double value; 

        private Builder() {
        } 

        private Builder(AlertRuleCondition model) {
            this.alertCount = model.alertCount;
            this.caseList = model.caseList;
            this.compareList = model.compareList;
            this.compositeEscalation = model.compositeEscalation;
            this.escalationType = model.escalationType;
            this.expressEscalation = model.expressEscalation;
            this.noDataAlertLevel = model.noDataAlertLevel;
            this.noDataAppendValue = model.noDataAppendValue;
            this.noDataPolicy = model.noDataPolicy;
            this.oper = model.oper;
            this.relation = model.relation;
            this.simpleEscalation = model.simpleEscalation;
            this.type = model.type;
            this.value = model.value;
        } 

        /**
         * <p>type=SLS_CONDITION时指定，满足条件几次后告警，默认为1</p>
         */
        public Builder alertCount(Integer alertCount) {
            this.alertCount = alertCount;
            return this;
        }

        /**
         * <p>type=SLS_CONDITION时指定</p>
         */
        public Builder caseList(java.util.List<CaseList> caseList) {
            this.caseList = caseList;
            return this;
        }

        /**
         * compareList.
         */
        public Builder compareList(java.util.List<CompareList> compareList) {
            this.compareList = compareList;
            return this;
        }

        /**
         * compositeEscalation.
         */
        public Builder compositeEscalation(CompositeEscalation compositeEscalation) {
            this.compositeEscalation = compositeEscalation;
            return this;
        }

        /**
         * escalationType.
         */
        public Builder escalationType(String escalationType) {
            this.escalationType = escalationType;
            return this;
        }

        /**
         * expressEscalation.
         */
        public Builder expressEscalation(ExpressEscalation expressEscalation) {
            this.expressEscalation = expressEscalation;
            return this;
        }

        /**
         * <p>无数据时按什么级别告警，不指定则不对无数据报警</p>
         */
        public Builder noDataAlertLevel(String noDataAlertLevel) {
            this.noDataAlertLevel = noDataAlertLevel;
            return this;
        }

        /**
         * noDataAppendValue.
         */
        public Builder noDataAppendValue(String noDataAppendValue) {
            this.noDataAppendValue = noDataAppendValue;
            return this;
        }

        /**
         * noDataPolicy.
         */
        public Builder noDataPolicy(String noDataPolicy) {
            this.noDataPolicy = noDataPolicy;
            return this;
        }

        /**
         * oper.
         */
        public Builder oper(String oper) {
            this.oper = oper;
            return this;
        }

        /**
         * relation.
         */
        public Builder relation(String relation) {
            this.relation = relation;
            return this;
        }

        /**
         * simpleEscalation.
         */
        public Builder simpleEscalation(SimpleEscalation simpleEscalation) {
            this.simpleEscalation = simpleEscalation;
            return this;
        }

        /**
         * <p>规则条件类型，可选值：SLS_CONDITION</p>
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * value.
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
             * condition.
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * countCondition.
             */
            public Builder countCondition(String countCondition) {
                this.countCondition = countCondition;
                return this;
            }

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>规则条件类型，可选值：SLS_CONDITION</p>
             * <p>This parameter is required.</p>
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
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * value.
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
             * aggregate.
             */
            public Builder aggregate(String aggregate) {
                this.aggregate = aggregate;
                return this;
            }

            /**
             * baseUnit.
             */
            public Builder baseUnit(String baseUnit) {
                this.baseUnit = baseUnit;
                return this;
            }

            /**
             * displayUnit.
             */
            public Builder displayUnit(String displayUnit) {
                this.displayUnit = displayUnit;
                return this;
            }

            /**
             * oper.
             */
            public Builder oper(String oper) {
                this.oper = oper;
                return this;
            }

            /**
             * value.
             */
            public Builder value(Double value) {
                this.value = value;
                return this;
            }

            /**
             * valueLevelList.
             */
            public Builder valueLevelList(java.util.List<ValueLevelList> valueLevelList) {
                this.valueLevelList = valueLevelList;
                return this;
            }

            /**
             * yoyTimeUnit.
             */
            public Builder yoyTimeUnit(String yoyTimeUnit) {
                this.yoyTimeUnit = yoyTimeUnit;
                return this;
            }

            /**
             * yoyTimeValue.
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
             * comparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * metricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * period.
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            /**
             * statistics.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * threshold.
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
             * escalations.
             */
            public Builder escalations(java.util.List<Escalations> escalations) {
                this.escalations = escalations;
                return this;
            }

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * relation.
             */
            public Builder relation(String relation) {
                this.relation = relation;
                return this;
            }

            /**
             * times.
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
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * rawExpression.
             */
            public Builder rawExpression(String rawExpression) {
                this.rawExpression = rawExpression;
                return this;
            }

            /**
             * times.
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
             * comparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * statistics.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * threshold.
             */
            public Builder threshold(Double threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * times.
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
             * escalations.
             */
            public Builder escalations(java.util.List<SimpleEscalationEscalations> escalations) {
                this.escalations = escalations;
                return this;
            }

            /**
             * metricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * period.
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
}
