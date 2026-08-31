// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link EvaluatorVariableExtractorMappingValue} extends {@link TeaModel}
 *
 * <p>EvaluatorVariableExtractorMappingValue</p>
 */
public class EvaluatorVariableExtractorMappingValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("originField")
    private String originField;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("expression")
    private String expression;

    private EvaluatorVariableExtractorMappingValue(Builder builder) {
        this.originField = builder.originField;
        this.type = builder.type;
        this.expression = builder.expression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EvaluatorVariableExtractorMappingValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return originField
     */
    public String getOriginField() {
        return this.originField;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    public static final class Builder {
        private String originField; 
        private String type; 
        private String expression; 

        private Builder() {
        } 

        private Builder(EvaluatorVariableExtractorMappingValue model) {
            this.originField = model.originField;
            this.type = model.type;
            this.expression = model.expression;
        } 

        /**
         * originField.
         */
        public Builder originField(String originField) {
            this.originField = originField;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * expression.
         */
        public Builder expression(String expression) {
            this.expression = expression;
            return this;
        }

        public EvaluatorVariableExtractorMappingValue build() {
            return new EvaluatorVariableExtractorMappingValue(this);
        } 

    } 

}
