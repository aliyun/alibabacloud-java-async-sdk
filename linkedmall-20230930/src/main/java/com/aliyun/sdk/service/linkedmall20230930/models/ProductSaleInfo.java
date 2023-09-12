// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ProductSaleInfo} extends {@link TeaModel}
 *
 * <p>ProductSaleInfo</p>
 */
public class ProductSaleInfo extends TeaModel {
    @NameInMap("canSell")
    private Boolean canSell;

    @NameInMap("divisionCode")
    private String divisionCode;

    @NameInMap("fuzzyQuantity")
    private String fuzzyQuantity;

    @NameInMap("productId")
    private String productId;

    @NameInMap("productStatus")
    private String productStatus;

    @NameInMap("quantity")
    private Long quantity;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("shopId")
    private String shopId;

    @NameInMap("skus")
    private java.util.List < SkuSaleInfo > skus;

    @NameInMap("title")
    private String title;

    private ProductSaleInfo(Builder builder) {
        this.canSell = builder.canSell;
        this.divisionCode = builder.divisionCode;
        this.fuzzyQuantity = builder.fuzzyQuantity;
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
    public java.util.List < SkuSaleInfo > getSkus() {
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
        private String productId; 
        private String productStatus; 
        private Long quantity; 
        private String requestId; 
        private String shopId; 
        private java.util.List < SkuSaleInfo > skus; 
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
         * productId.
         */
        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        /**
         * productStatus.
         */
        public Builder productStatus(String productStatus) {
            this.productStatus = productStatus;
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * skus.
         */
        public Builder skus(java.util.List < SkuSaleInfo > skus) {
            this.skus = skus;
            return this;
        }

        /**
         * title.
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
