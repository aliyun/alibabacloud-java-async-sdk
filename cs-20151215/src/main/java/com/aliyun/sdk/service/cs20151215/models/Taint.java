// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Taint} extends {@link TeaModel}
 *
 * <p>Taint</p>
 */
public class Taint extends TeaModel {
    @NameInMap("key")
    private String key;

    @NameInMap("value")
    private String value;

    @NameInMap("effect")
    private String effect;

    private Taint(Builder builder) {
        this.key = builder.key;
        this.value = builder.value;
        this.effect = builder.effect;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Taint create() {
        return builder().build();
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

    /**
     * @return effect
     */
    public String getEffect() {
        return this.effect;
    }

    public static final class Builder {
        private String key; 
        private String value; 
        private String effect; 

        /**
         * The value of the key.
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

        /**
         * The taint policy.
         */
        public Builder effect(String effect) {
            this.effect = effect;
            return this;
        }

        public Taint build() {
            return new Taint(this);
        } 

    } 

}
