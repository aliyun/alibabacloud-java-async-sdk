// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PriceInfo} extends {@link TeaModel}
 *
 * <p>PriceInfo</p>
 */
public class PriceInfo extends TeaModel {
    @NameInMap("Currency")
    private String currency;

    @NameInMap("DiscountPrice")
    private String discountPrice;

    @NameInMap("OriginalPrice")
    private String originalPrice;

    @NameInMap("PayType")
    private String payType;

    @NameInMap("PromotionResults")
    private java.util.List < PromotionInfo > promotionResults;

    @NameInMap("ResourceType")
    private String resourceType;

    @NameInMap("SpotInstanceTypeOriginalPrice")
    private String spotInstanceTypeOriginalPrice;

    @NameInMap("SpotInstanceTypePrice")
    private String spotInstanceTypePrice;

    @NameInMap("SpotOriginalPrice")
    private String spotOriginalPrice;

    @NameInMap("SpotPrice")
    private String spotPrice;

    @NameInMap("TaxPrice")
    private String taxPrice;

    @NameInMap("TradePrice")
    private String tradePrice;

    private PriceInfo(Builder builder) {
        this.currency = builder.currency;
        this.discountPrice = builder.discountPrice;
        this.originalPrice = builder.originalPrice;
        this.payType = builder.payType;
        this.promotionResults = builder.promotionResults;
        this.resourceType = builder.resourceType;
        this.spotInstanceTypeOriginalPrice = builder.spotInstanceTypeOriginalPrice;
        this.spotInstanceTypePrice = builder.spotInstanceTypePrice;
        this.spotOriginalPrice = builder.spotOriginalPrice;
        this.spotPrice = builder.spotPrice;
        this.taxPrice = builder.taxPrice;
        this.tradePrice = builder.tradePrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PriceInfo create() {
        return builder().build();
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * @return discountPrice
     */
    public String getDiscountPrice() {
        return this.discountPrice;
    }

    /**
     * @return originalPrice
     */
    public String getOriginalPrice() {
        return this.originalPrice;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return promotionResults
     */
    public java.util.List < PromotionInfo > getPromotionResults() {
        return this.promotionResults;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return spotInstanceTypeOriginalPrice
     */
    public String getSpotInstanceTypeOriginalPrice() {
        return this.spotInstanceTypeOriginalPrice;
    }

    /**
     * @return spotInstanceTypePrice
     */
    public String getSpotInstanceTypePrice() {
        return this.spotInstanceTypePrice;
    }

    /**
     * @return spotOriginalPrice
     */
    public String getSpotOriginalPrice() {
        return this.spotOriginalPrice;
    }

    /**
     * @return spotPrice
     */
    public String getSpotPrice() {
        return this.spotPrice;
    }

    /**
     * @return taxPrice
     */
    public String getTaxPrice() {
        return this.taxPrice;
    }

    /**
     * @return tradePrice
     */
    public String getTradePrice() {
        return this.tradePrice;
    }

    public static final class Builder {
        private String currency; 
        private String discountPrice; 
        private String originalPrice; 
        private String payType; 
        private java.util.List < PromotionInfo > promotionResults; 
        private String resourceType; 
        private String spotInstanceTypeOriginalPrice; 
        private String spotInstanceTypePrice; 
        private String spotOriginalPrice; 
        private String spotPrice; 
        private String taxPrice; 
        private String tradePrice; 

        /**
         * Currency.
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * DiscountPrice.
         */
        public Builder discountPrice(String discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }

        /**
         * OriginalPrice.
         */
        public Builder originalPrice(String originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * PromotionResults.
         */
        public Builder promotionResults(java.util.List < PromotionInfo > promotionResults) {
            this.promotionResults = promotionResults;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * SpotInstanceTypeOriginalPrice.
         */
        public Builder spotInstanceTypeOriginalPrice(String spotInstanceTypeOriginalPrice) {
            this.spotInstanceTypeOriginalPrice = spotInstanceTypeOriginalPrice;
            return this;
        }

        /**
         * SpotInstanceTypePrice.
         */
        public Builder spotInstanceTypePrice(String spotInstanceTypePrice) {
            this.spotInstanceTypePrice = spotInstanceTypePrice;
            return this;
        }

        /**
         * SpotOriginalPrice.
         */
        public Builder spotOriginalPrice(String spotOriginalPrice) {
            this.spotOriginalPrice = spotOriginalPrice;
            return this;
        }

        /**
         * SpotPrice.
         */
        public Builder spotPrice(String spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }

        /**
         * TaxPrice.
         */
        public Builder taxPrice(String taxPrice) {
            this.taxPrice = taxPrice;
            return this;
        }

        /**
         * TradePrice.
         */
        public Builder tradePrice(String tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }

        public PriceInfo build() {
            return new PriceInfo(this);
        } 

    } 

}
