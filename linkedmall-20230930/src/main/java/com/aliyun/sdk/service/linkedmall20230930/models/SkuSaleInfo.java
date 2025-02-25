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
 * {@link SkuSaleInfo} extends {@link TeaModel}
 *
 * <p>SkuSaleInfo</p>
 */
public class SkuSaleInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("canSell")
    private Boolean canSell;

    @com.aliyun.core.annotation.NameInMap("divisionCode")
    private String divisionCode;

    @com.aliyun.core.annotation.NameInMap("fuzzyQuantity")
    private String fuzzyQuantity;

    @com.aliyun.core.annotation.NameInMap("markPrice")
    private Long markPrice;

    @com.aliyun.core.annotation.NameInMap("price")
    private Long price;

    @com.aliyun.core.annotation.NameInMap("productId")
    private String productId;

    @com.aliyun.core.annotation.NameInMap("quantity")
    private Long quantity;

    @com.aliyun.core.annotation.NameInMap("shopId")
    private String shopId;

    @com.aliyun.core.annotation.NameInMap("skuId")
    private String skuId;

    @com.aliyun.core.annotation.NameInMap("skuStatus")
    private String skuStatus;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    private SkuSaleInfo(Builder builder) {
        this.canSell = builder.canSell;
        this.divisionCode = builder.divisionCode;
        this.fuzzyQuantity = builder.fuzzyQuantity;
        this.markPrice = builder.markPrice;
        this.price = builder.price;
        this.productId = builder.productId;
        this.quantity = builder.quantity;
        this.shopId = builder.shopId;
        this.skuId = builder.skuId;
        this.skuStatus = builder.skuStatus;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SkuSaleInfo create() {
        return builder().build();
    }

    /**
     * @return canSell
     */
    public Boolean getCanSell() {
        return this.canSell;
    }

    /**
     * @return divisionCode
     */
    public String getDivisionCode() {
        return this.divisionCode;
    }

    /**
     * @return fuzzyQuantity
     */
    public String getFuzzyQuantity() {
        return this.fuzzyQuantity;
    }

    /**
     * @return markPrice
     */
    public Long getMarkPrice() {
        return this.markPrice;
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
    public Long getQuantity() {
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
     * @return skuStatus
     */
    public String getSkuStatus() {
        return this.skuStatus;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder {
        private Boolean canSell; 
        private String divisionCode; 
        private String fuzzyQuantity; 
        private Long markPrice; 
        private Long price; 
        private String productId; 
        private Long quantity; 
        private String shopId; 
        private String skuId; 
        private String skuStatus; 
        private String title; 

        /**
         * canSell.
         */
        public Builder canSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }

        /**
         * divisionCode.
         */
        public Builder divisionCode(String divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }

        /**
         * fuzzyQuantity.
         */
        public Builder fuzzyQuantity(String fuzzyQuantity) {
            this.fuzzyQuantity = fuzzyQuantity;
            return this;
        }

        /**
         * markPrice.
         */
        public Builder markPrice(Long markPrice) {
            this.markPrice = markPrice;
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
         * quantity.
         */
        public Builder quantity(Long quantity) {
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
         * skuStatus.
         */
        public Builder skuStatus(String skuStatus) {
            this.skuStatus = skuStatus;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public SkuSaleInfo build() {
            return new SkuSaleInfo(this);
        } 

    } 

}
