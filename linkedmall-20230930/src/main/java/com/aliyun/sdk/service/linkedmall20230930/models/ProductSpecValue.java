// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ProductSpecValue} extends {@link TeaModel}
 *
 * <p>ProductSpecValue</p>
 */
public class ProductSpecValue extends TeaModel {
    @NameInMap("value")
    private String value;

    @NameInMap("valueId")
    private Long valueId;

    private ProductSpecValue(Builder builder) {
        this.value = builder.value;
        this.valueId = builder.valueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProductSpecValue create() {
        return builder().build();
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * @return valueId
     */
    public Long getValueId() {
        return this.valueId;
    }

    public static final class Builder {
        private String value; 
        private Long valueId; 

        /**
         * value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * valueId.
         */
        public Builder valueId(Long valueId) {
            this.valueId = valueId;
            return this;
        }

        public ProductSpecValue build() {
            return new ProductSpecValue(this);
        } 

    } 

}
