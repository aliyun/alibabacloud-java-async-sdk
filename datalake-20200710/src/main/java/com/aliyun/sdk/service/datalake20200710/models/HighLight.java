// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HighLight} extends {@link TeaModel}
 *
 * <p>HighLight</p>
 */
public class HighLight extends TeaModel {
    @NameInMap("Key")
    private String key;

    @NameInMap("Value")
    private String value;

    private HighLight(Builder builder) {
        this.key = builder.key;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HighLight create() {
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
         * 高亮的key
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * 高亮的value
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public HighLight build() {
            return new HighLight(this);
        } 

    } 

}
