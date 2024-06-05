// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UserTag} extends {@link TeaModel}
 *
 * <p>UserTag</p>
 */
public class UserTag extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Value")
    @com.aliyun.core.annotation.Validation(required = true)
    private String value;

    @com.aliyun.core.annotation.NameInMap("key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    private UserTag(Builder builder) {
        this.value = builder.value;
        this.key = builder.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserTag create() {
        return builder().build();
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    public static final class Builder {
        private String value; 
        private String key; 

        /**
         * Value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        public UserTag build() {
            return new UserTag(this);
        } 

    } 

}
