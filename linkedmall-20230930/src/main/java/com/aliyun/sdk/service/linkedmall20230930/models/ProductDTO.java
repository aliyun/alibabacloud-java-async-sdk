// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ProductDTO} extends {@link TeaModel}
 *
 * <p>ProductDTO</p>
 */
public class ProductDTO extends TeaModel {
    @NameInMap("price")
    private Long price;

    @NameInMap("productId")
    @Validation(required = true)
    private String productId;

    @NameInMap("purchaserId")
    @Validation(required = true)
    private String purchaserId;

    @NameInMap("quantity")
    @Validation(required = true)
    private Integer quantity;

    @NameInMap("skuId")
    @Validation(required = true)
    private String skuId;

    private ProductDTO(Builder builder) {
        this.price = builder.price;
        this.productId = builder.productId;
        this.purchaserId = builder.purchaserId;
        this.quantity = builder.quantity;
        this.skuId = builder.skuId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProductDTO create() {
        return builder().build();
    }

    /**
     * @return price
     */
    public Long getPrice() {
        return this.price;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return purchaserId
     */
    public String getPurchaserId() {
        return this.purchaserId;
    }

    /**
     * @return quantity
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * @return skuId
     */
    public String getSkuId() {
        return this.skuId;
    }

    public static final class Builder {
        private Long price; 
        private String productId; 
        private String purchaserId; 
        private Integer quantity; 
        private String skuId; 

        /**
         * price.
         */
        public Builder price(Long price) {
            this.price = price;
            return this;
        }

        /**
         * productId.
         */
        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        /**
         * purchaserId.
         */
        public Builder purchaserId(String purchaserId) {
            this.purchaserId = purchaserId;
            return this;
        }

        /**
         * quantity.
         */
        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * skuId.
         */
        public Builder skuId(String skuId) {
            this.skuId = skuId;
            return this;
        }

        public ProductDTO build() {
            return new ProductDTO(this);
        } 

    } 

}
