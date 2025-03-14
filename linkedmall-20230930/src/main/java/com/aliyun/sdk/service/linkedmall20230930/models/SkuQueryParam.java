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
 * {@link SkuQueryParam} extends {@link TeaModel}
 *
 * <p>SkuQueryParam</p>
 */
public class SkuQueryParam extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("buyAmount")
    private Integer buyAmount;

    @com.aliyun.core.annotation.NameInMap("productId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productId;

    @com.aliyun.core.annotation.NameInMap("skuId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skuId;

    private SkuQueryParam(Builder builder) {
        this.buyAmount = builder.buyAmount;
        this.productId = builder.productId;
        this.skuId = builder.skuId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SkuQueryParam create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buyAmount
     */
    public Integer getBuyAmount() {
        return this.buyAmount;
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
        private Integer buyAmount; 
        private String productId; 
        private String skuId; 

        private Builder() {
        } 

        private Builder(SkuQueryParam model) {
            this.buyAmount = model.buyAmount;
            this.productId = model.productId;
            this.skuId = model.skuId;
        } 

        /**
         * buyAmount.
         */
        public Builder buyAmount(Integer buyAmount) {
            this.buyAmount = buyAmount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>660460842235822080</p>
         */
        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>660460842235822081</p>
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
