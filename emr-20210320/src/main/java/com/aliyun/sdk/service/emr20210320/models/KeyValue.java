// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link KeyValue} extends {@link TeaModel}
 *
 * <p>KeyValue</p>
 */
public class KeyValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private KeyValue(Builder builder) {
        this.key = builder.key;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KeyValue create() {
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

    public static final class Builder {
        private String key; 
        private String value; 

        /**
         * <p>键。</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>值。</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public KeyValue build() {
            return new KeyValue(this);
        } 

    } 

}
