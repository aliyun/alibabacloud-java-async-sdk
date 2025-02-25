// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link PAL7ConfigRewriteOp} extends {@link TeaModel}
 *
 * <p>PAL7ConfigRewriteOp</p>
 */
public class PAL7ConfigRewriteOp extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("OldValue")
    private String oldValue;

    @com.aliyun.core.annotation.NameInMap("Op")
    private String op;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    @com.aliyun.core.annotation.NameInMap("ValueVariable")
    private String valueVariable;

    private PAL7ConfigRewriteOp(Builder builder) {
        this.key = builder.key;
        this.oldValue = builder.oldValue;
        this.op = builder.op;
        this.value = builder.value;
        this.valueVariable = builder.valueVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PAL7ConfigRewriteOp create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return oldValue
     */
    public String getOldValue() {
        return this.oldValue;
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

    /**
     * @return valueVariable
     */
    public String getValueVariable() {
        return this.valueVariable;
    }

    public static final class Builder {
        private String key; 
        private String oldValue; 
        private String op; 
        private String value; 
        private String valueVariable; 

        /**
         * Key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * OldValue.
         */
        public Builder oldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }

        /**
         * Op.
         */
        public Builder op(String op) {
            this.op = op;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * ValueVariable.
         */
        public Builder valueVariable(String valueVariable) {
            this.valueVariable = valueVariable;
            return this;
        }

        public PAL7ConfigRewriteOp build() {
            return new PAL7ConfigRewriteOp(this);
        } 

    } 

}
