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
 * {@link MetricSetTriggerCompositeExpression} extends {@link TeaModel}
 *
 * <p>MetricSetTriggerCompositeExpression</p>
 */
public class MetricSetTriggerCompositeExpression extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("conditions")
    private java.util.List<MetricSetTriggerSimpleExpression> conditions;

    @com.aliyun.core.annotation.NameInMap("expressionType")
    private String expressionType;

    @com.aliyun.core.annotation.NameInMap("logicOperator")
    private String logicOperator;

    private MetricSetTriggerCompositeExpression(Builder builder) {
        this.conditions = builder.conditions;
        this.expressionType = builder.expressionType;
        this.logicOperator = builder.logicOperator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetricSetTriggerCompositeExpression create() {
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
        private java.util.List<MetricSetTriggerSimpleExpression> conditions; 
        private String expressionType; 
        private String logicOperator; 

        private Builder() {
        } 

        private Builder(MetricSetTriggerCompositeExpression model) {
            this.conditions = model.conditions;
            this.expressionType = model.expressionType;
            this.logicOperator = model.logicOperator;
        } 

        /**
         * <p>The list of sub-conditions. Each item is a simple comparison expression.</p>
         */
        public Builder conditions(java.util.List<MetricSetTriggerSimpleExpression> conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
         * <p>The expression type, fixed as COMPOSITE.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPOSITE</p>
         */
        public Builder expressionType(String expressionType) {
            this.expressionType = expressionType;
            return this;
        }

        /**
         * <p>The logical operator. Valid values:</p>
         * <ul>
         * <li>AND: All conditions are met.</li>
         * <li>OR: Any condition is met.</li>
         * <li>UNLESS: The first condition is met and none of the remaining conditions are met.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        public Builder logicOperator(String logicOperator) {
            this.logicOperator = logicOperator;
            return this;
        }

        public MetricSetTriggerCompositeExpression build() {
            return new MetricSetTriggerCompositeExpression(this);
        } 

    } 

}
