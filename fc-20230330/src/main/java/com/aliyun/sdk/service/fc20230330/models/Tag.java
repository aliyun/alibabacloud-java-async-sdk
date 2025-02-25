// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Tag} extends {@link TeaModel}
 *
 * <p>Tag</p>
 */
public class Tag extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private Tag(Builder builder) {
        this.key = builder.key;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Tag create() {
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
         * Key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public Tag build() {
            return new Tag(this);
        } 

    } 

}
