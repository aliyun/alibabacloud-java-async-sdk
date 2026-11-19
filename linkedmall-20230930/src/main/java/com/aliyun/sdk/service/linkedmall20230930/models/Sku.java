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
 * {@link Sku} extends {@link TeaModel}
 *
 * <p>Sku</p>
 */
public class Sku extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("barcode")
    private String barcode;

    @com.aliyun.core.annotation.NameInMap("canSell")
    private Boolean canSell;

    @com.aliyun.core.annotation.NameInMap("discountRetailPrice")
    private Long discountRetailPrice;

    @com.aliyun.core.annotation.NameInMap("divisionCode")
    private String divisionCode;

    @com.aliyun.core.annotation.NameInMap("fuzzyQuantity")
    private String fuzzyQuantity;

    @com.aliyun.core.annotation.NameInMap("markPrice")
    private Long markPrice;

    @com.aliyun.core.annotation.NameInMap("picUrl")
    private String picUrl;

    @com.aliyun.core.annotation.NameInMap("platformPrice")
    private Long platformPrice;

    @com.aliyun.core.annotation.NameInMap("price")
    private Long price;

    @com.aliyun.core.annotation.NameInMap("productId")
    private String productId;

    @com.aliyun.core.annotation.NameInMap("quantity")
    private Long quantity;

    @com.aliyun.core.annotation.NameInMap("rankValue")
    private Long rankValue;

    @com.aliyun.core.annotation.NameInMap("shopId")
    private String shopId;

    @com.aliyun.core.annotation.NameInMap("skuAlias")
    private String skuAlias;

    @com.aliyun.core.annotation.NameInMap("skuId")
    private String skuId;

    @com.aliyun.core.annotation.NameInMap("skuSpecs")
    private java.util.List<SkuSpec> skuSpecs;

    @com.aliyun.core.annotation.NameInMap("skuSpecsCode")
    private String skuSpecsCode;

    @com.aliyun.core.annotation.NameInMap("skuStatus")
    private String skuStatus;

    @com.aliyun.core.annotation.NameInMap("suggestedRetailPrice")
    private Long suggestedRetailPrice;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    private Sku(Builder builder) {
        this.barcode = builder.barcode;
        this.canSell = builder.canSell;
        this.discountRetailPrice = builder.discountRetailPrice;
        this.divisionCode = builder.divisionCode;
        this.fuzzyQuantity = builder.fuzzyQuantity;
        this.markPrice = builder.markPrice;
        this.picUrl = builder.picUrl;
        this.platformPrice = builder.platformPrice;
        this.price = builder.price;
        this.productId = builder.productId;
        this.quantity = builder.quantity;
        this.rankValue = builder.rankValue;
        this.shopId = builder.shopId;
        this.skuAlias = builder.skuAlias;
        this.skuId = builder.skuId;
        this.skuSpecs = builder.skuSpecs;
        this.skuSpecsCode = builder.skuSpecsCode;
        this.skuStatus = builder.skuStatus;
        this.suggestedRetailPrice = builder.suggestedRetailPrice;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Sku create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return barcode
     */
    public String getBarcode() {
        return this.barcode;
    }

    /**
     * @return canSell
     */
    public Boolean getCanSell() {
        return this.canSell;
    }

    /**
     * @return discountRetailPrice
     */
    public Long getDiscountRetailPrice() {
        return this.discountRetailPrice;
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
     * @return picUrl
     */
    public String getPicUrl() {
        return this.picUrl;
    }

    /**
     * @return platformPrice
     */
    public Long getPlatformPrice() {
        return this.platformPrice;
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
     * @return rankValue
     */
    public Long getRankValue() {
        return this.rankValue;
    }

    /**
     * @return shopId
     */
    public String getShopId() {
        return this.shopId;
    }

    /**
     * @return skuAlias
     */
    public String getSkuAlias() {
        return this.skuAlias;
    }

    /**
     * @return skuId
     */
    public String getSkuId() {
        return this.skuId;
    }

    /**
     * @return skuSpecs
     */
    public java.util.List<SkuSpec> getSkuSpecs() {
        return this.skuSpecs;
    }

    /**
     * @return skuSpecsCode
     */
    public String getSkuSpecsCode() {
        return this.skuSpecsCode;
    }

    /**
     * @return skuStatus
     */
    public String getSkuStatus() {
        return this.skuStatus;
    }

    /**
     * @return suggestedRetailPrice
     */
    public Long getSuggestedRetailPrice() {
        return this.suggestedRetailPrice;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder {
        private String barcode; 
        private Boolean canSell; 
        private Long discountRetailPrice; 
        private String divisionCode; 
        private String fuzzyQuantity; 
        private Long markPrice; 
        private String picUrl; 
        private Long platformPrice; 
        private Long price; 
        private String productId; 
        private Long quantity; 
        private Long rankValue; 
        private String shopId; 
        private String skuAlias; 
        private String skuId; 
        private java.util.List<SkuSpec> skuSpecs; 
        private String skuSpecsCode; 
        private String skuStatus; 
        private Long suggestedRetailPrice; 
        private String title; 

        private Builder() {
        } 

        private Builder(Sku model) {
            this.barcode = model.barcode;
            this.canSell = model.canSell;
            this.discountRetailPrice = model.discountRetailPrice;
            this.divisionCode = model.divisionCode;
            this.fuzzyQuantity = model.fuzzyQuantity;
            this.markPrice = model.markPrice;
            this.picUrl = model.picUrl;
            this.platformPrice = model.platformPrice;
            this.price = model.price;
            this.productId = model.productId;
            this.quantity = model.quantity;
            this.rankValue = model.rankValue;
            this.shopId = model.shopId;
            this.skuAlias = model.skuAlias;
            this.skuId = model.skuId;
            this.skuSpecs = model.skuSpecs;
            this.skuSpecsCode = model.skuSpecsCode;
            this.skuStatus = model.skuStatus;
            this.suggestedRetailPrice = model.suggestedRetailPrice;
            this.title = model.title;
        } 

        /**
         * <p>The barcode.</p>
         * 
         * <strong>example:</strong>
         * <p>6922454329176</p>
         */
        public Builder barcode(String barcode) {
            this.barcode = barcode;
            return this;
        }

        /**
         * <p>Indicates whether the SKU is available for sale.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder canSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }

        /**
         * <p>The reserved field.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder discountRetailPrice(Long discountRetailPrice) {
            this.discountRetailPrice = discountRetailPrice;
            return this;
        }

        /**
         * <p>The region code.</p>
         * 
         * <strong>example:</strong>
         * <p>110000</p>
         */
        public Builder divisionCode(String divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }

        /**
         * <p>The fuzzy available inventory.</p>
         * 
         * <strong>example:</strong>
         * <p>In stock
         * Out of stock
         * Low stock</p>
         */
        public Builder fuzzyQuantity(String fuzzyQuantity) {
            this.fuzzyQuantity = fuzzyQuantity;
            return this;
        }

        /**
         * <p>The list price in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>999900</p>
         */
        public Builder markPrice(Long markPrice) {
            this.markPrice = markPrice;
            return this;
        }

        /**
         * <p>The SKU image.</p>
         * 
         * <strong>example:</strong>
         * <p>https:////img.alicdn.com/imgextra///img.alicdn.com/imgextra/i2/2216003305543/O1CN010DEQCX1qokFYGRfPE_!!2216003305543.png</p>
         */
        public Builder picUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }

        /**
         * <p>The suggested retail price in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>999900</p>
         */
        public Builder platformPrice(Long platformPrice) {
            this.platformPrice = platformPrice;
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
         * <p>The available inventory. <notice>Currently, the value of this field is uniformly set to -1 and has no practical significance.</notice></p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder quantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * <p>The SKU sort order.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder rankValue(Long rankValue) {
            this.rankValue = rankValue;
            return this;
        }

        /**
         * <p>The shop ID.</p>
         * 
         * <strong>example:</strong>
         * <p>21000017</p>
         */
        public Builder shopId(String shopId) {
            this.shopId = shopId;
            return this;
        }

        /**
         * <p>The SKU remark.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample SKU remark</p>
         */
        public Builder skuAlias(String skuAlias) {
            this.skuAlias = skuAlias;
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
         * <p>sku</p>
         */
        public Builder skuSpecs(java.util.List<SkuSpec> skuSpecs) {
            this.skuSpecs = skuSpecs;
            return this;
        }

        /**
         * <p>The SKU sales specifications used to assist frontend filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>Color:Sky blue</p>
         */
        public Builder skuSpecsCode(String skuSpecsCode) {
            this.skuSpecsCode = skuSpecsCode;
            return this;
        }

        /**
         * <p>The SKU control status.</p>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        public Builder skuStatus(String skuStatus) {
            this.skuStatus = skuStatus;
            return this;
        }

        /**
         * <p>The reserved field.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder suggestedRetailPrice(Long suggestedRetailPrice) {
            this.suggestedRetailPrice = suggestedRetailPrice;
            return this;
        }

        /**
         * <p>The SKU title. <notice>Distributors should concatenate the value or valueAlias (if available) from the SkuSpec struct to form the SKU title for customer display. Do not use this field directly as the SKU title for customer display.</notice></p>
         * 
         * <strong>example:</strong>
         * <p>Sky blue</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Sku build() {
            return new Sku(this);
        } 

    } 

}
