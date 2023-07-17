// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConditionExpression} extends {@link TeaModel}
 *
 * <p>ConditionExpression</p>
 */
public class ConditionExpression extends TeaModel {
    @NameInMap("Key")
    @Validation(required = true)
    private String key;

    @NameInMap("Operator")
    @Validation(required = true)
    private String operator;

    @NameInMap("Values")
    @Validation(required = true)
    private java.util.List < String > values;

    private ConditionExpression(Builder builder) {
        this.key = builder.key;
        this.operator = builder.operator;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConditionExpression create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return values
     */
    public java.util.List < String > getValues() {
        return this.values;
    }

    public static final class Builder {
        private String key; 
        private String operator; 
        private java.util.List < String > values; 

        /**
         * Key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * Operator.
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * Values.
         */
        public Builder values(java.util.List < String > values) {
            this.values = values;
            return this;
        }

        public ConditionExpression build() {
            return new ConditionExpression(this);
        } 

    } 

}
