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
 * {@link PrometheusMultiTrigger} extends {@link TeaModel}
 *
 * <p>PrometheusMultiTrigger</p>
 */
public class PrometheusMultiTrigger extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("conditions")
    private java.util.List<PrometheusSimpleExpression> conditions;

    @com.aliyun.core.annotation.NameInMap("durationSecs")
    private Integer durationSecs;

    @com.aliyun.core.annotation.NameInMap("expressionType")
    private String expressionType;

    @com.aliyun.core.annotation.NameInMap("logicOperator")
    private String logicOperator;

    @com.aliyun.core.annotation.NameInMap("operator")
    private String operator;

    @com.aliyun.core.annotation.NameInMap("queryName")
    private String queryName;

    @com.aliyun.core.annotation.NameInMap("severity")
    private String severity;

    @com.aliyun.core.annotation.NameInMap("threshold")
    private Double threshold;

    private PrometheusMultiTrigger(Builder builder) {
        this.conditions = builder.conditions;
        this.durationSecs = builder.durationSecs;
        this.expressionType = builder.expressionType;
        this.logicOperator = builder.logicOperator;
        this.operator = builder.operator;
        this.queryName = builder.queryName;
        this.severity = builder.severity;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrometheusMultiTrigger create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conditions
     */
    public java.util.List<PrometheusSimpleExpression> getConditions() {
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
        private java.util.List<PrometheusSimpleExpression> conditions; 
        private Integer durationSecs; 
        private String expressionType; 
        private String logicOperator; 
        private String operator; 
        private String queryName; 
        private String severity; 
        private Double threshold; 

        private Builder() {
        } 

        private Builder(PrometheusMultiTrigger model) {
            this.conditions = model.conditions;
            this.durationSecs = model.durationSecs;
            this.expressionType = model.expressionType;
            this.logicOperator = model.logicOperator;
            this.operator = model.operator;
            this.queryName = model.queryName;
            this.severity = model.severity;
            this.threshold = model.threshold;
        } 

        /**
         * conditions.
         */
        public Builder conditions(java.util.List<PrometheusSimpleExpression> conditions) {
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

        public PrometheusMultiTrigger build() {
            return new PrometheusMultiTrigger(this);
        } 

    } 

}
