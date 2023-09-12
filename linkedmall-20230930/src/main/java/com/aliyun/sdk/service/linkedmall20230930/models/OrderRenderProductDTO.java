// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OrderRenderProductDTO} extends {@link TeaModel}
 *
 * <p>OrderRenderProductDTO</p>
 */
public class OrderRenderProductDTO extends TeaModel {
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

    private OrderRenderProductDTO(Builder builder) {
        this.productId = builder.productId;
        this.quantity = builder.quantity;
        this.shopId = builder.shopId;
        this.skuId = builder.skuId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OrderRenderProductDTO create() {
        return builder().build();
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
        private String productId; 
        private Integer quantity; 
        private String shopId; 
        private String skuId; 

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

        public OrderRenderProductDTO build() {
            return new OrderRenderProductDTO(this);
        } 

    } 

}
