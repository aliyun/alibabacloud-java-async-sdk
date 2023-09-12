// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SkuQueryParam} extends {@link TeaModel}
 *
 * <p>SkuQueryParam</p>
 */
public class SkuQueryParam extends TeaModel {
    @NameInMap("productId")
    @Validation(required = true)
    private String productId;

    @NameInMap("skuId")
    @Validation(required = true)
    private String skuId;

    private SkuQueryParam(Builder builder) {
        this.productId = builder.productId;
        this.skuId = builder.skuId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SkuQueryParam create() {
        return builder().build();
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return skuId
     */
    public String getSkuId() {
        return this.skuId;
    }

    public static final class Builder {
        private String productId; 
        private String skuId; 

        /**
         * productId.
         */
        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        /**
         * skuId.
         */
        public Builder skuId(String skuId) {
            this.skuId = skuId;
            return this;
        }

        public SkuQueryParam build() {
            return new SkuQueryParam(this);
        } 

    } 

}
