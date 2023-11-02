// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataProductListLogMapValueValue} extends {@link TeaModel}
 *
 * <p>DataProductListLogMapValueValue</p>
 */
public class DataProductListLogMapValueValue extends TeaModel {
    @NameInMap("Key")
    private String key;

    @NameInMap("Value")
    private String value;

    private DataProductListLogMapValueValue(Builder builder) {
        this.key = builder.key;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataProductListLogMapValueValue create() {
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

        public DataProductListLogMapValueValue build() {
            return new DataProductListLogMapValueValue(this);
        } 

    } 

}
