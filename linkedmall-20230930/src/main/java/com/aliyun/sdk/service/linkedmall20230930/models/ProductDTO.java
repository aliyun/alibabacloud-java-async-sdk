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

    @NameInMap("quantity")
    @Validation(required = true)
    private Integer quantity;

    @NameInMap("shopId")
    @Validation(required = true)
    private String shopId;

    @NameInMap("skuId")
    @Validation(required = true)
    private String skuId;

    private ProductDTO(Builder builder) {
        this.price = builder.price;
        this.productId = builder.productId;
        this.quantity = builder.quantity;
        this.shopId = builder.shopId;
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
     * @return quantity
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * @return shopId
     */
    public String getShopId() {
        return this.shopId;
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
        private Integer quantity; 
        private String shopId; 
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
         * quantity.
         */
        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * shopId.
         */
        public Builder shopId(String shopId) {
            this.shopId = shopId;
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
