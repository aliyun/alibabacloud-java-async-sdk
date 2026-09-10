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
 * {@link FilterSetting} extends {@link TeaModel}
 *
 * <p>FilterSetting</p>
 */
public class FilterSetting extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("conditions")
    private java.util.List<Conditions> conditions;

    @com.aliyun.core.annotation.NameInMap("expression")
    private String expression;

    @com.aliyun.core.annotation.NameInMap("relation")
    private String relation;

    private FilterSetting(Builder builder) {
        this.conditions = builder.conditions;
        this.expression = builder.expression;
        this.relation = builder.relation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FilterSetting create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conditions
     */
    public java.util.List<Conditions> getConditions() {
        return this.conditions;
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return relation
     */
    public String getRelation() {
        return this.relation;
    }

    public static final class Builder {
        private java.util.List<Conditions> conditions; 
        private String expression; 
        private String relation; 

        private Builder() {
        } 

        private Builder(FilterSetting model) {
            this.conditions = model.conditions;
            this.expression = model.expression;
            this.relation = model.relation;
        } 

        /**
         * <p>The subscription conditions.</p>
         */
        public Builder conditions(java.util.List<Conditions> conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
         * <p>Use either expression or relation. If expression is not empty, it takes precedence and relation is ignored. If expression is empty or not specified, relation (AND or OR) is used to perform a simple AND/OR operation on all conditions. Condition numbers correspond to the indexes of the conditions array (starting from 1). Each condition evaluates whether a single event field matches by using field (the event field path, which supports dot-notation nesting such as resource.tags.pod), op (the operator, such as CONTAIN, EQ, or IN), and value (the matching value).</p>
         * 
         * <strong>example:</strong>
         * <p>1 and 2 or 3</p>
         */
        public Builder expression(String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * <p>The logical relationship between conditions. This parameter takes effect when expression is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        public Builder relation(String relation) {
            this.relation = relation;
            return this;
        }

        public FilterSetting build() {
            return new FilterSetting(this);
        } 

    } 

    /**
     * 
     * {@link FilterSetting} extends {@link TeaModel}
     *
     * <p>FilterSetting</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Conditions(Builder builder) {
            this.field = builder.field;
            this.op = builder.op;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String field; 
            private String op; 
            private String value; 

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.field = model.field;
                this.op = model.op;
                this.value = model.value;
            } 

            /**
             * <p>The JSON path of the event field. Dot-notation nesting is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>labels.alertname</p>
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * <p>The comparison operator.</p>
             * 
             * <strong>example:</strong>
             * <p>EQ</p>
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * <p>The matching value. Separate multiple values with commas when using IN or NOT_IN.</p>
             * 
             * <strong>example:</strong>
             * <p>CRITICAL</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
}
