// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link ProductSpec} extends {@link TeaModel}
 *
 * <p>ProductSpec</p>
 */
public class ProductSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("keyId")
    private Long keyId;

    @com.aliyun.core.annotation.NameInMap("values")
    private java.util.List<ProductSpecValue> values;

    private ProductSpec(Builder builder) {
        this.key = builder.key;
        this.keyId = builder.keyId;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProductSpec create() {
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
     * @return keyId
     */
    public Long getKeyId() {
        return this.keyId;
    }

    /**
     * @return values
     */
    public java.util.List<ProductSpecValue> getValues() {
        return this.values;
    }

    public static final class Builder {
        private String key; 
        private Long keyId; 
        private java.util.List<ProductSpecValue> values; 

        private Builder() {
        } 

        private Builder(ProductSpec model) {
            this.key = model.key;
            this.keyId = model.keyId;
            this.values = model.values;
        } 

        /**
         * key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * keyId.
         */
        public Builder keyId(Long keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * values.
         */
        public Builder values(java.util.List<ProductSpecValue> values) {
            this.values = values;
            return this;
        }

        public ProductSpec build() {
            return new ProductSpec(this);
        } 

    } 

}
