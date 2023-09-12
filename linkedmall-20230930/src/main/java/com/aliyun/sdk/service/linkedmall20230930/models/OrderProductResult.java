// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OrderProductResult} extends {@link TeaModel}
 *
 * <p>OrderProductResult</p>
 */
public class OrderProductResult extends TeaModel {
    @NameInMap("canSell")
    private Boolean canSell;

    @NameInMap("features")
    private java.util.Map < String, ? > features;

    @NameInMap("message")
    private String message;

    @NameInMap("price")
    private Long price;

    @NameInMap("productId")
    private String productId;

    @NameInMap("productPicUrl")
    private String productPicUrl;

    @NameInMap("productTitle")
    private String productTitle;

    @NameInMap("quantity")
    private Integer quantity;

    @NameInMap("shopId")
    private String shopId;

    @NameInMap("skuId")
    private String skuId;

    @NameInMap("skuTitle")
    private String skuTitle;

    private OrderProductResult(Builder builder) {
        this.canSell = builder.canSell;
        this.features = builder.features;
        this.message = builder.message;
        this.price = builder.price;
        this.productId = builder.productId;
        this.productPicUrl = builder.productPicUrl;
        this.productTitle = builder.productTitle;
        this.quantity = builder.quantity;
        this.shopId = builder.shopId;
        this.skuId = builder.skuId;
        this.skuTitle = builder.skuTitle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OrderProductResult create() {
        return builder().build();
    }

    /**
     * @return canSell
     */
    public Boolean getCanSell() {
        return this.canSell;
    }

    /**
     * @return features
     */
    public java.util.Map < String, ? > getFeatures() {
        return this.features;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return productPicUrl
     */
    public String getProductPicUrl() {
        return this.productPicUrl;
    }

    /**
     * @return productTitle
     */
    public String getProductTitle() {
        return this.productTitle;
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

    /**
     * @return skuTitle
     */
    public String getSkuTitle() {
        return this.skuTitle;
    }

    public static final class Builder {
        private Boolean canSell; 
        private java.util.Map < String, ? > features; 
        private String message; 
        private Long price; 
        private String productId; 
        private String productPicUrl; 
        private String productTitle; 
        private Integer quantity; 
        private String shopId; 
        private String skuId; 
        private String skuTitle; 

        /**
         * canSell.
         */
        public Builder canSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }

        /**
         * features.
         */
        public Builder features(java.util.Map < String, ? > features) {
            this.features = features;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

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
         * productPicUrl.
         */
        public Builder productPicUrl(String productPicUrl) {
            this.productPicUrl = productPicUrl;
            return this;
        }

        /**
         * productTitle.
         */
        public Builder productTitle(String productTitle) {
            this.productTitle = productTitle;
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

        /**
         * skuTitle.
         */
        public Builder skuTitle(String skuTitle) {
            this.skuTitle = skuTitle;
            return this;
        }

        public OrderProductResult build() {
            return new OrderProductResult(this);
        } 

    } 

}
