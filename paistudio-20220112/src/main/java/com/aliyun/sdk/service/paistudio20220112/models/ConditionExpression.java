// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link ConditionExpression} extends {@link TeaModel}
 *
 * <p>ConditionExpression</p>
 */
public class ConditionExpression extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.NameInMap("Operator")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operator;

    @com.aliyun.core.annotation.NameInMap("Values")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> values;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<String> getValues() {
        return this.values;
    }

    public static final class Builder {
        private String key; 
        private String operator; 
        private java.util.List<String> values; 

        private Builder() {
        } 

        private Builder(ConditionExpression model) {
            this.key = model.key;
            this.operator = model.operator;
            this.values = model.values;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SupportedMachineTypes</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder values(java.util.List<String> values) {
            this.values = values;
            return this;
        }

        public ConditionExpression build() {
            return new ConditionExpression(this);
        } 

    } 

}
