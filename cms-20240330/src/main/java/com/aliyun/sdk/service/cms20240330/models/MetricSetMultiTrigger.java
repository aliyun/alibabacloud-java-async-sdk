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
 * {@link MetricSetMultiTrigger} extends {@link TeaModel}
 *
 * <p>MetricSetMultiTrigger</p>
 */
public class MetricSetMultiTrigger extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("conditions")
    private java.util.List<MetricSetTriggerSimpleExpression> conditions;

    @com.aliyun.core.annotation.NameInMap("durationSecs")
    private Integer durationSecs;

    @com.aliyun.core.annotation.NameInMap("expressionType")
    private String expressionType;

    @com.aliyun.core.annotation.NameInMap("logicOperator")
    private String logicOperator;

    @com.aliyun.core.annotation.NameInMap("max")
    private Double max;

    @com.aliyun.core.annotation.NameInMap("min")
    private Double min;

    @com.aliyun.core.annotation.NameInMap("operator")
    private String operator;

    @com.aliyun.core.annotation.NameInMap("queryName")
    private String queryName;

    @com.aliyun.core.annotation.NameInMap("severity")
    private String severity;

    @com.aliyun.core.annotation.NameInMap("threshold")
    private Double threshold;

    private MetricSetMultiTrigger(Builder builder) {
        this.conditions = builder.conditions;
        this.durationSecs = builder.durationSecs;
        this.expressionType = builder.expressionType;
        this.logicOperator = builder.logicOperator;
        this.max = builder.max;
        this.min = builder.min;
        this.operator = builder.operator;
        this.queryName = builder.queryName;
        this.severity = builder.severity;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetricSetMultiTrigger create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conditions
     */
    public java.util.List<MetricSetTriggerSimpleExpression> getConditions() {
        return this.conditions;
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
        private java.util.List<MetricSetTriggerSimpleExpression> conditions; 
        private Integer durationSecs; 
        private String expressionType; 
        private String logicOperator; 
        private Double max; 
        private Double min; 
        private String operator; 
        private String queryName; 
        private String severity; 
        private Double threshold; 

        private Builder() {
        } 

        private Builder(MetricSetMultiTrigger model) {
            this.conditions = model.conditions;
            this.durationSecs = model.durationSecs;
            this.expressionType = model.expressionType;
            this.logicOperator = model.logicOperator;
            this.max = model.max;
            this.min = model.min;
            this.operator = model.operator;
            this.queryName = model.queryName;
            this.severity = model.severity;
            this.threshold = model.threshold;
        } 

        /**
         * conditions.
         */
        public Builder conditions(java.util.List<MetricSetTriggerSimpleExpression> conditions) {
            this.conditions = conditions;
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
         * max.
         */
        public Builder max(Double max) {
            this.max = max;
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
         * threshold.
         */
        public Builder threshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }

        public MetricSetMultiTrigger build() {
            return new MetricSetMultiTrigger(this);
        } 

    } 

}
