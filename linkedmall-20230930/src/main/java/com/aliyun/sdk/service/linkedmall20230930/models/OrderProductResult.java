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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(OrderProductResult model) {
            this.canSell = model.canSell;
            this.features = model.features;
            this.message = model.message;
            this.price = model.price;
            this.productId = model.productId;
            this.productPicUrl = model.productPicUrl;
            this.productTitle = model.productTitle;
            this.purchaserId = model.purchaserId;
            this.quantity = model.quantity;
            this.skuId = model.skuId;
            this.skuTitle = model.skuTitle;
        } 

        /**
         * <p>Indicates whether the product is available for sale</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder canSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }

        /**
         * <p>Additional product information</p>
         */
        public Builder features(java.util.Map<String, ?> features) {
            this.features = features;
            return this;
        }

        /**
         * <p>Reason for unavailability</p>
         * 
         * <strong>example:</strong>
         * <p>库存为0</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Product price (unit: cent)</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder price(Long price) {
            this.price = price;
            return this;
        }

        /**
         * <p>Product ID</p>
         * 
         * <strong>example:</strong>
         * <p>6600****6736</p>
         */
        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        /**
         * <p>Product image link</p>
         * 
         * <strong>example:</strong>
         * <p>//img.alicdn.com/imgextra/i4/2216003305543/O1CN01bip3Un1qokG0</p>
         */
        public Builder productPicUrl(String productPicUrl) {
            this.productPicUrl = productPicUrl;
            return this;
        }

        /**
         * <p>Product title</p>
         * 
         * <strong>example:</strong>
         * <p>儿童学习桌</p>
         */
        public Builder productTitle(String productTitle) {
            this.productTitle = productTitle;
            return this;
        }

        /**
         * <p>Purchaser ID</p>
         * 
         * <strong>example:</strong>
         * <p>56****2304</p>
         */
        public Builder purchaserId(String purchaserId) {
            this.purchaserId = purchaserId;
            return this;
        }

        /**
         * <p>Quantity</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * <p>SKUID</p>
         * 
         * <strong>example:</strong>
         * <p>6600****6737</p>
         */
        public Builder skuId(String skuId) {
            this.skuId = skuId;
            return this;
        }

        /**
         * <p>SKU title</p>
         * 
         * <strong>example:</strong>
         * <p>浅绿色</p>
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
