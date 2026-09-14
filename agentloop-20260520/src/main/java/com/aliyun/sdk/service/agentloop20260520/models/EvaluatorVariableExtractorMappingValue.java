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
         * <p>The evaluation data field from which content is extracted. The extraction expression is applied to the content of this field. Required when saving with the evaluation task. For the trial run API, this parameter can be omitted and the backend derives it from the expression. Multiple variables can share the same source field.</p>
         * 
         * <strong>example:</strong>
         * <p>trace.output</p>
         */
        public Builder originField(String originField) {
            this.originField = originField;
            return this;
        }

        /**
         * <p>The extraction method. jsonpath extracts values from the JSON content of the field by using JSONPath. regex performs regular expression matching on the full text of the field. When capturing groups are present, the first capturing group is returned. When no capturing group is present, the entire match is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>jsonpath</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The extraction expression. Its meaning is determined by type. When type is jsonpath, specify a JSONPath expression. You can use either a relative path relative to originField (such as $.order.expected) or an absolute path from the root (such as $trace.output.order.expected). When type is regex, specify a regular expression. Note that backslashes must be escaped in JSON. The expression syntax is validated upon saving. For regular expressions, RE2 compatibility is additionally validated. Patterns such as lookahead assertions, lookbehind assertions, backreferences, named groups, atomic groups, and possessive quantifiers are rejected.</p>
         * 
         * <strong>example:</strong>
         * <p>$.order.expected</p>
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
