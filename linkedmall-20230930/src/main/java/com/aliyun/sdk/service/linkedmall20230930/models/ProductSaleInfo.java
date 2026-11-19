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
 * {@link ProductSaleInfo} extends {@link TeaModel}
 *
 * <p>ProductSaleInfo</p>
 */
public class ProductSaleInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("canSell")
    private Boolean canSell;

    @com.aliyun.core.annotation.NameInMap("divisionCode")
    private String divisionCode;

    @com.aliyun.core.annotation.NameInMap("fuzzyQuantity")
    private String fuzzyQuantity;

    @com.aliyun.core.annotation.NameInMap("limitRules")
    private java.util.List<LimitRule> limitRules;

    @com.aliyun.core.annotation.NameInMap("lmItemId")
    private String lmItemId;

    @com.aliyun.core.annotation.NameInMap("productId")
    private String productId;

    @com.aliyun.core.annotation.NameInMap("productStatus")
    private String productStatus;

    @com.aliyun.core.annotation.NameInMap("quantity")
    private Long quantity;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("shopId")
    private String shopId;

    @com.aliyun.core.annotation.NameInMap("skus")
    private java.util.List<SkuSaleInfo> skus;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    private ProductSaleInfo(Builder builder) {
        this.canSell = builder.canSell;
        this.divisionCode = builder.divisionCode;
        this.fuzzyQuantity = builder.fuzzyQuantity;
        this.limitRules = builder.limitRules;
        this.lmItemId = builder.lmItemId;
        this.productId = builder.productId;
        this.productStatus = builder.productStatus;
        this.quantity = builder.quantity;
        this.requestId = builder.requestId;
        this.shopId = builder.shopId;
        this.skus = builder.skus;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProductSaleInfo create() {
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
     * @return limitRules
     */
    public java.util.List<LimitRule> getLimitRules() {
        return this.limitRules;
    }

    /**
     * @return lmItemId
     */
    public String getLmItemId() {
        return this.lmItemId;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return productStatus
     */
    public String getProductStatus() {
        return this.productStatus;
    }

    /**
     * @return quantity
     */
    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shopId
     */
    public String getShopId() {
        return this.shopId;
    }

    /**
     * @return skus
     */
    public java.util.List<SkuSaleInfo> getSkus() {
        return this.skus;
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
        private java.util.List<LimitRule> limitRules; 
        private String lmItemId; 
        private String productId; 
        private String productStatus; 
        private Long quantity; 
        private String requestId; 
        private String shopId; 
        private java.util.List<SkuSaleInfo> skus; 
        private String title; 

        private Builder() {
        } 

        private Builder(ProductSaleInfo model) {
            this.canSell = model.canSell;
            this.divisionCode = model.divisionCode;
            this.fuzzyQuantity = model.fuzzyQuantity;
            this.limitRules = model.limitRules;
            this.lmItemId = model.lmItemId;
            this.productId = model.productId;
            this.productStatus = model.productStatus;
            this.quantity = model.quantity;
            this.requestId = model.requestId;
            this.shopId = model.shopId;
            this.skus = model.skus;
            this.title = model.title;
        } 

        /**
         * <p>The calculated value that indicates whether the product is sellable.</p>
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
         * <p>The fuzzy inventory.</p>
         * 
         * <strong>example:</strong>
         * <p>In stock</p>
         */
        public Builder fuzzyQuantity(String fuzzyQuantity) {
            this.fuzzyQuantity = fuzzyQuantity;
            return this;
        }

        /**
         * <p>The purchase limit configuration.</p>
         */
        public Builder limitRules(java.util.List<LimitRule> limitRules) {
            this.limitRules = limitRules;
            return this;
        }

        /**
         * <p>The LM product ID.</p>
         * 
         * <strong>example:</strong>
         * <p>21000017-4580902812</p>
         */
        public Builder lmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
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
         * <p>The product status.</p>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        public Builder productStatus(String productStatus) {
            this.productStatus = productStatus;
            return this;
        }

        /**
         * <p>The inventory.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder quantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * <p>The API request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3239281273464326823</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The channel shop ID.</p>
         * 
         * <strong>example:</strong>
         * <p>21000017</p>
         */
        public Builder shopId(String shopId) {
            this.shopId = shopId;
            return this;
        }

        /**
         * <p>The SKU collection.</p>
         */
        public Builder skus(java.util.List<SkuSaleInfo> skus) {
            this.skus = skus;
            return this;
        }

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>Money tree</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public ProductSaleInfo build() {
            return new ProductSaleInfo(this);
        } 

    } 

}
