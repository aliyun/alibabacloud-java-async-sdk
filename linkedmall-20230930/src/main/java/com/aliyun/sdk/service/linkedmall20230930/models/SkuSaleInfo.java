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
    @com.aliyun.core.annotation.NameInMap("canNotSellReason")
    private String canNotSellReason;

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
        this.canNotSellReason = builder.canNotSellReason;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return canNotSellReason
     */
    public String getCanNotSellReason() {
        return this.canNotSellReason;
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
        private String canNotSellReason; 
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

        private Builder() {
        } 

        private Builder(SkuSaleInfo model) {
            this.canNotSellReason = model.canNotSellReason;
            this.canSell = model.canSell;
            this.divisionCode = model.divisionCode;
            this.fuzzyQuantity = model.fuzzyQuantity;
            this.markPrice = model.markPrice;
            this.price = model.price;
            this.productId = model.productId;
            this.quantity = model.quantity;
            this.shopId = model.shopId;
            this.skuId = model.skuId;
            this.skuStatus = model.skuStatus;
            this.title = model.title;
        } 

        /**
         * <p>The unsellable reason.</p>
         * 
         * <strong>example:</strong>
         * <p>Unsellable</p>
         */
        public Builder canNotSellReason(String canNotSellReason) {
            this.canNotSellReason = canNotSellReason;
            return this;
        }

        /**
         * <p>The sellable status of the SKU.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder canSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }

        /**
         * <p>The division code.</p>
         * 
         * <strong>example:</strong>
         * <p>330106109</p>
         */
        public Builder divisionCode(String divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }

        /**
         * <p>The fuzzy available inventory.</p>
         * 
         * <strong>example:</strong>
         * <p>In stock</p>
         */
        public Builder fuzzyQuantity(String fuzzyQuantity) {
            this.fuzzyQuantity = fuzzyQuantity;
            return this;
        }

        /**
         * <p>The strikethrough price in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>999900</p>
         */
        public Builder markPrice(Long markPrice) {
            this.markPrice = markPrice;
            return this;
        }

        /**
         * <p>The distributor purchase price in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>19800</p>
         */
        public Builder price(Long price) {
            this.price = price;
            return this;
        }

        /**
         * <p>The product ID.</p>
         * 
         * <strong>example:</strong>
         * <p>660460842235822080</p>
         */
        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        /**
         * <p>The available inventory.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder quantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * <p>The store ID.</p>
         * 
         * <strong>example:</strong>
         * <p>21000017</p>
         */
        public Builder shopId(String shopId) {
            this.shopId = shopId;
            return this;
        }

        /**
         * <p>skuId</p>
         * 
         * <strong>example:</strong>
         * <p>660460842235822081</p>
         */
        public Builder skuId(String skuId) {
            this.skuId = skuId;
            return this;
        }

        /**
         * <p>The control status of the SKU.</p>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        public Builder skuStatus(String skuStatus) {
            this.skuStatus = skuStatus;
            return this;
        }

        /**
         * <p>The SKU title.</p>
         * 
         * <strong>example:</strong>
         * <p>Sky blue</p>
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
