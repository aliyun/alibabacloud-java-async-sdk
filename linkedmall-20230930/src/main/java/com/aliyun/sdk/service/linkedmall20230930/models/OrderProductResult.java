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
 * {@link OrderProductResult} extends {@link TeaModel}
 *
 * <p>OrderProductResult</p>
 */
public class OrderProductResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("canSell")
    private Boolean canSell;

    @com.aliyun.core.annotation.NameInMap("features")
    private java.util.Map<String, ?> features;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("price")
    private Long price;

    @com.aliyun.core.annotation.NameInMap("productId")
    private String productId;

    @com.aliyun.core.annotation.NameInMap("productPicUrl")
    private String productPicUrl;

    @com.aliyun.core.annotation.NameInMap("productTitle")
    private String productTitle;

    @com.aliyun.core.annotation.NameInMap("purchaserId")
    private String purchaserId;

    @com.aliyun.core.annotation.NameInMap("quantity")
    private Integer quantity;

    @com.aliyun.core.annotation.NameInMap("skuId")
    private String skuId;

    @com.aliyun.core.annotation.NameInMap("skuTitle")
    private String skuTitle;

    private OrderProductResult(Builder builder) {
        this.canSell = builder.canSell;
        this.features = builder.features;
        this.message = builder.message;
        this.price = builder.price;
        this.productId = builder.productId;
        this.productPicUrl = builder.productPicUrl;
        this.productTitle = builder.productTitle;
        this.purchaserId = builder.purchaserId;
        this.quantity = builder.quantity;
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
    public java.util.Map<String, ?> getFeatures() {
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

    /**
     * @return skuTitle
     */
    public String getSkuTitle() {
        return this.skuTitle;
    }

    public static final class Builder {
        private Boolean canSell; 
        private java.util.Map<String, ?> features; 
        private String message; 
        private Long price; 
        private String productId; 
        private String productPicUrl; 
        private String productTitle; 
        private String purchaserId; 
        private Integer quantity; 
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
        public Builder features(java.util.Map<String, ?> features) {
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
