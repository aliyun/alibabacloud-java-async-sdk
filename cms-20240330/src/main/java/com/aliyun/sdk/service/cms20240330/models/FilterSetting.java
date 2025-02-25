// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
    private java.util.List < Conditions> conditions;

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

    /**
     * @return conditions
     */
    public java.util.List < Conditions> getConditions() {
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
        private java.util.List < Conditions> conditions; 
        private String expression; 
        private String relation; 

        /**
         * conditions.
         */
        public Builder conditions(java.util.List < Conditions> conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
         * expression.
         */
        public Builder expression(String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * relation.
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

            /**
             * field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * op.
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * value.
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
