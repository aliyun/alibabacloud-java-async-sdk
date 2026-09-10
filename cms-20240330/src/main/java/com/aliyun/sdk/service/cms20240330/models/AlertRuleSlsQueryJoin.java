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
 * {@link AlertRuleSlsQueryJoin} extends {@link TeaModel}
 *
 * <p>AlertRuleSlsQueryJoin</p>
 */
public class AlertRuleSlsQueryJoin extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("conditions")
    private java.util.List<Conditions> conditions;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private AlertRuleSlsQueryJoin(Builder builder) {
        this.conditions = builder.conditions;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleSlsQueryJoin create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List<Conditions> conditions; 
        private String type; 

        private Builder() {
        } 

        private Builder(AlertRuleSlsQueryJoin model) {
            this.conditions = model.conditions;
            this.type = model.type;
        } 

        /**
         * <p>The list of join conditions.</p>
         */
        public Builder conditions(java.util.List<Conditions> conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
         * <p>The type of the collection operation.</p>
         * <ul>
         * <li><p>CrossJoin: The Cartesian product.</p>
         * </li>
         * <li><p>FullJoin: The full join.</p>
         * </li>
         * <li><p>InnerJoin: The inner join.</p>
         * </li>
         * <li><p>LeftExclude: The left exclusion.</p>
         * </li>
         * <li><p>RightExclude: The right exclusion.</p>
         * </li>
         * <li><p>LeftJoin: The left join.</p>
         * </li>
         * <li><p>RightJoin: The right join.</p>
         * </li>
         * <li><p>NoJoin: No merge operation is performed.</p>
         * </li>
         * <li><p>Concat: Concatenation.</p>
         * </li>
         * </ul>
         * <p>For more information, see https\://www\.alibabacloud.com/help/en/sls/user-guide/set-operations.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CrossJoin</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public AlertRuleSlsQueryJoin build() {
            return new AlertRuleSlsQueryJoin(this);
        } 

    } 

    /**
     * 
     * {@link AlertRuleSlsQueryJoin} extends {@link TeaModel}
     *
     * <p>AlertRuleSlsQueryJoin</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("firstField")
        private String firstField;

        @com.aliyun.core.annotation.NameInMap("oper")
        private String oper;

        @com.aliyun.core.annotation.NameInMap("secondField")
        private String secondField;

        private Conditions(Builder builder) {
            this.firstField = builder.firstField;
            this.oper = builder.oper;
            this.secondField = builder.secondField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return firstField
         */
        public String getFirstField() {
            return this.firstField;
        }

        /**
         * @return oper
         */
        public String getOper() {
            return this.oper;
        }

        /**
         * @return secondField
         */
        public String getSecondField() {
            return this.secondField;
        }

        public static final class Builder {
            private String firstField; 
            private String oper; 
            private String secondField; 

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.firstField = model.firstField;
                this.oper = model.oper;
                this.secondField = model.secondField;
            } 

            /**
             * <p>The left operand of the condition. The format is $\<query_idx>.\<field_name_in_result_set>.</p>
             * 
             * <strong>example:</strong>
             * <p>$0.<strong>topic</strong></p>
             */
            public Builder firstField(String firstField) {
                this.firstField = firstField;
                return this;
            }

            /**
             * <p>The comparison operator. Valid values are &lt;, &gt;, ==, !=, &lt;=, and &gt;=.</p>
             * 
             * <strong>example:</strong>
             * <p>==</p>
             */
            public Builder oper(String oper) {
                this.oper = oper;
                return this;
            }

            /**
             * <p>The right operand of the condition. The format is $\<query_idx>.\<field_name_in_result_set>.</p>
             * 
             * <strong>example:</strong>
             * <p>$0.<strong>topic</strong></p>
             */
            public Builder secondField(String secondField) {
                this.secondField = secondField;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
}
