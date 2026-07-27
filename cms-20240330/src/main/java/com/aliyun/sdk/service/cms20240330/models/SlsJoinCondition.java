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
 * {@link SlsJoinCondition} extends {@link TeaModel}
 *
 * <p>SlsJoinCondition</p>
 */
public class SlsJoinCondition extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("lhsField")
    private String lhsField;

    @com.aliyun.core.annotation.NameInMap("operator")
    private String operator;

    @com.aliyun.core.annotation.NameInMap("rhsField")
    private String rhsField;

    private SlsJoinCondition(Builder builder) {
        this.lhsField = builder.lhsField;
        this.operator = builder.operator;
        this.rhsField = builder.rhsField;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SlsJoinCondition create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lhsField
     */
    public String getLhsField() {
        return this.lhsField;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return rhsField
     */
    public String getRhsField() {
        return this.rhsField;
    }

    public static final class Builder {
        private String lhsField; 
        private String operator; 
        private String rhsField; 

        private Builder() {
        } 

        private Builder(SlsJoinCondition model) {
            this.lhsField = model.lhsField;
            this.operator = model.operator;
            this.rhsField = model.rhsField;
        } 

        /**
         * lhsField.
         */
        public Builder lhsField(String lhsField) {
            this.lhsField = lhsField;
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
         * rhsField.
         */
        public Builder rhsField(String rhsField) {
            this.rhsField = rhsField;
            return this;
        }

        public SlsJoinCondition build() {
            return new SlsJoinCondition(this);
        } 

    } 

}
