// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Taint} extends {@link TeaModel}
 *
 * <p>Taint</p>
 */
public class Taint extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("effect")
    private String effect;

    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private Taint(Builder builder) {
        this.effect = builder.effect;
        this.key = builder.key;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Taint create() {
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
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String effect; 
        private String key; 
        private String value; 

        /**
         * effect.
         */
        public Builder effect(String effect) {
            this.effect = effect;
            return this;
        }

        /**
         * key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public Taint build() {
            return new Taint(this);
        } 

    } 

}
