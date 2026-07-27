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

    @com.aliyun.core.annotation.NameInMap("conditions")
    private java.util.List<TriggerConditions> conditions;

    @com.aliyun.core.annotation.NameInMap("countOperator")
    private String countOperator;

    @com.aliyun.core.annotation.NameInMap("countThreshold")
    private Long countThreshold;

    @com.aliyun.core.annotation.NameInMap("durationSecs")
    private Integer durationSecs;

    @com.aliyun.core.annotation.NameInMap("expressionType")
    private String expressionType;

    @com.aliyun.core.annotation.NameInMap("logicOperator")
    private String logicOperator;

    @com.aliyun.core.annotation.NameInMap("matchField")
    private String matchField;

    @com.aliyun.core.annotation.NameInMap("matchOperator")
    private String matchOperator;

    @com.aliyun.core.annotation.NameInMap("matchValue")
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
        this.conditions = builder.conditions;
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
     * @return conditions
     */
    public java.util.List<TriggerConditions> getConditions() {
        return this.conditions;
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
        private java.util.List<TriggerConditions> conditions; 
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
            this.conditions = model.conditions;
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
         * comparisonOperator.
         */
        public Builder comparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * conditions.
         */
        public Builder conditions(java.util.List<TriggerConditions> conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
         * countOperator.
         */
        public Builder countOperator(String countOperator) {
            this.countOperator = countOperator;
            return this;
        }

        /**
         * countThreshold.
         */
        public Builder countThreshold(Long countThreshold) {
            this.countThreshold = countThreshold;
            return this;
        }

        /**
         * durationSecs.
         */
        public Builder durationSecs(Integer durationSecs) {
            this.durationSecs = durationSecs;
            return this;
        }

        /**
         * expressionType.
         */
        public Builder expressionType(String expressionType) {
            this.expressionType = expressionType;
            return this;
        }

        /**
         * logicOperator.
         */
        public Builder logicOperator(String logicOperator) {
            this.logicOperator = logicOperator;
            return this;
        }

        /**
         * matchField.
         */
        public Builder matchField(String matchField) {
            this.matchField = matchField;
            return this;
        }

        /**
         * matchOperator.
         */
        public Builder matchOperator(String matchOperator) {
            this.matchOperator = matchOperator;
            return this;
        }

        /**
         * matchValue.
         */
        public Builder matchValue(String matchValue) {
            this.matchValue = matchValue;
            return this;
        }

        /**
         * max.
         */
        public Builder max(Double max) {
            this.max = max;
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
         * min.
         */
        public Builder min(Double min) {
            this.min = min;
            return this;
        }

        /**
         * operator.
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * period.
         */
        public Builder period(Integer period) {
            this.period = period;
            return this;
        }

        /**
         * preCondition.
         */
        public Builder preCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }

        /**
         * queryName.
         */
        public Builder queryName(String queryName) {
            this.queryName = queryName;
            return this;
        }

        /**
         * severity.
         */
        public Builder severity(String severity) {
            this.severity = severity;
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
        public Builder threshold(Object threshold) {
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

        public Triggers build() {
            return new Triggers(this);
        } 

    } 

}
