// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Toleration} extends {@link TeaModel}
 *
 * <p>Toleration</p>
 */
public class Toleration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Effect")
    private String effect;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Operator")
    private String operator;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private Toleration(Builder builder) {
        this.effect = builder.effect;
        this.key = builder.key;
        this.operator = builder.operator;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Toleration create() {
        return builder().build();
    }

    /**
     * @return effect
     */
    public String getEffect() {
        return this.effect;
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
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String effect; 
        private String key; 
        private String operator; 
        private String value; 

        /**
         * Effect.
         */
        public Builder effect(String effect) {
            this.effect = effect;
            return this;
        }

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
         * Value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public Toleration build() {
            return new Toleration(this);
        } 

    } 

}
