// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intlmarket20250812.models;

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
 * {@link DescribePriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePriceResponseBody</p>
 */
public class DescribePriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Coupons")
    private java.util.List<Coupons> coupons;

    @com.aliyun.core.annotation.NameInMap("Currency")
    private String currency;

    @com.aliyun.core.annotation.NameInMap("Cuxiao")
    private Boolean cuxiao;

    @com.aliyun.core.annotation.NameInMap("Cycle")
    private String cycle;

    @com.aliyun.core.annotation.NameInMap("DiscountPrice")
    private Float discountPrice;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.NameInMap("ExpressionCode")
    private String expressionCode;

    @com.aliyun.core.annotation.NameInMap("ExpressionMessage")
    private String expressionMessage;

    @com.aliyun.core.annotation.NameInMap("InfoTitle")
    private String infoTitle;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OriginalPrice")
    private Float originalPrice;

    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.NameInMap("PromotionRules")
    private java.util.List<PromotionRules> promotionRules;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TradePrice")
    private Float tradePrice;

    private DescribePriceResponseBody(Builder builder) {
        this.code = builder.code;
        this.coupons = builder.coupons;
        this.currency = builder.currency;
        this.cuxiao = builder.cuxiao;
        this.cycle = builder.cycle;
        this.discountPrice = builder.discountPrice;
        this.duration = builder.duration;
        this.expressionCode = builder.expressionCode;
        this.expressionMessage = builder.expressionMessage;
        this.infoTitle = builder.infoTitle;
        this.message = builder.message;
        this.originalPrice = builder.originalPrice;
        this.productCode = builder.productCode;
        this.promotionRules = builder.promotionRules;
        this.requestId = builder.requestId;
        this.tradePrice = builder.tradePrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePriceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return coupons
     */
    public java.util.List<Coupons> getCoupons() {
        return this.coupons;
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * @return cuxiao
     */
    public Boolean getCuxiao() {
        return this.cuxiao;
    }

    /**
     * @return cycle
     */
    public String getCycle() {
        return this.cycle;
    }

    /**
     * @return discountPrice
     */
    public Float getDiscountPrice() {
        return this.discountPrice;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return expressionCode
     */
    public String getExpressionCode() {
        return this.expressionCode;
    }

    /**
     * @return expressionMessage
     */
    public String getExpressionMessage() {
        return this.expressionMessage;
    }

    /**
     * @return infoTitle
     */
    public String getInfoTitle() {
        return this.infoTitle;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return originalPrice
     */
    public Float getOriginalPrice() {
        return this.originalPrice;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return promotionRules
     */
    public java.util.List<PromotionRules> getPromotionRules() {
        return this.promotionRules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tradePrice
     */
    public Float getTradePrice() {
        return this.tradePrice;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Coupons> coupons; 
        private String currency; 
        private Boolean cuxiao; 
        private String cycle; 
        private Float discountPrice; 
        private Integer duration; 
        private String expressionCode; 
        private String expressionMessage; 
        private String infoTitle; 
        private String message; 
        private Float originalPrice; 
        private String productCode; 
        private java.util.List<PromotionRules> promotionRules; 
        private String requestId; 
        private Float tradePrice; 

        private Builder() {
        } 

        private Builder(DescribePriceResponseBody model) {
            this.code = model.code;
            this.coupons = model.coupons;
            this.currency = model.currency;
            this.cuxiao = model.cuxiao;
            this.cycle = model.cycle;
            this.discountPrice = model.discountPrice;
            this.duration = model.duration;
            this.expressionCode = model.expressionCode;
            this.expressionMessage = model.expressionMessage;
            this.infoTitle = model.infoTitle;
            this.message = model.message;
            this.originalPrice = model.originalPrice;
            this.productCode = model.productCode;
            this.promotionRules = model.promotionRules;
            this.requestId = model.requestId;
            this.tradePrice = model.tradePrice;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Coupons.
         */
        public Builder coupons(java.util.List<Coupons> coupons) {
            this.coupons = coupons;
            return this;
        }

        /**
         * Currency.
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Cuxiao.
         */
        public Builder cuxiao(Boolean cuxiao) {
            this.cuxiao = cuxiao;
            return this;
        }

        /**
         * Cycle.
         */
        public Builder cycle(String cycle) {
            this.cycle = cycle;
            return this;
        }

        /**
         * DiscountPrice.
         */
        public Builder discountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.duration = duration;
            return this;
        }

        /**
         * ExpressionCode.
         */
        public Builder expressionCode(String expressionCode) {
            this.expressionCode = expressionCode;
            return this;
        }

        /**
         * ExpressionMessage.
         */
        public Builder expressionMessage(String expressionMessage) {
            this.expressionMessage = expressionMessage;
            return this;
        }

        /**
         * InfoTitle.
         */
        public Builder infoTitle(String infoTitle) {
            this.infoTitle = infoTitle;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * OriginalPrice.
         */
        public Builder originalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.productCode = productCode;
            return this;
        }

        /**
         * PromotionRules.
         */
        public Builder promotionRules(java.util.List<PromotionRules> promotionRules) {
            this.promotionRules = promotionRules;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TradePrice.
         */
        public Builder tradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }

        public DescribePriceResponseBody build() {
            return new DescribePriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
    public static class Coupons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanPromFee")
        private Long canPromFee;

        @com.aliyun.core.annotation.NameInMap("CouponDesc")
        private String couponDesc;

        @com.aliyun.core.annotation.NameInMap("CouponName")
        private String couponName;

        @com.aliyun.core.annotation.NameInMap("CouponOptionCode")
        private String couponOptionCode;

        @com.aliyun.core.annotation.NameInMap("CouponOptionNo")
        private String couponOptionNo;

        @com.aliyun.core.annotation.NameInMap("IsSelected")
        private Boolean isSelected;

        @com.aliyun.core.annotation.NameInMap("PromotionDesc")
        private String promotionDesc;

        private Coupons(Builder builder) {
            this.canPromFee = builder.canPromFee;
            this.couponDesc = builder.couponDesc;
            this.couponName = builder.couponName;
            this.couponOptionCode = builder.couponOptionCode;
            this.couponOptionNo = builder.couponOptionNo;
            this.isSelected = builder.isSelected;
            this.promotionDesc = builder.promotionDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Coupons create() {
            return builder().build();
        }

        /**
         * @return canPromFee
         */
        public Long getCanPromFee() {
            return this.canPromFee;
        }

        /**
         * @return couponDesc
         */
        public String getCouponDesc() {
            return this.couponDesc;
        }

        /**
         * @return couponName
         */
        public String getCouponName() {
            return this.couponName;
        }

        /**
         * @return couponOptionCode
         */
        public String getCouponOptionCode() {
            return this.couponOptionCode;
        }

        /**
         * @return couponOptionNo
         */
        public String getCouponOptionNo() {
            return this.couponOptionNo;
        }

        /**
         * @return isSelected
         */
        public Boolean getIsSelected() {
            return this.isSelected;
        }

        /**
         * @return promotionDesc
         */
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public static final class Builder {
            private Long canPromFee; 
            private String couponDesc; 
            private String couponName; 
            private String couponOptionCode; 
            private String couponOptionNo; 
            private Boolean isSelected; 
            private String promotionDesc; 

            private Builder() {
            } 

            private Builder(Coupons model) {
                this.canPromFee = model.canPromFee;
                this.couponDesc = model.couponDesc;
                this.couponName = model.couponName;
                this.couponOptionCode = model.couponOptionCode;
                this.couponOptionNo = model.couponOptionNo;
                this.isSelected = model.isSelected;
                this.promotionDesc = model.promotionDesc;
            } 

            /**
             * CanPromFee.
             */
            public Builder canPromFee(Long canPromFee) {
                this.canPromFee = canPromFee;
                return this;
            }

            /**
             * CouponDesc.
             */
            public Builder couponDesc(String couponDesc) {
                this.couponDesc = couponDesc;
                return this;
            }

            /**
             * CouponName.
             */
            public Builder couponName(String couponName) {
                this.couponName = couponName;
                return this;
            }

            /**
             * CouponOptionCode.
             */
            public Builder couponOptionCode(String couponOptionCode) {
                this.couponOptionCode = couponOptionCode;
                return this;
            }

            /**
             * CouponOptionNo.
             */
            public Builder couponOptionNo(String couponOptionNo) {
                this.couponOptionNo = couponOptionNo;
                return this;
            }

            /**
             * IsSelected.
             */
            public Builder isSelected(Boolean isSelected) {
                this.isSelected = isSelected;
                return this;
            }

            /**
             * PromotionDesc.
             */
            public Builder promotionDesc(String promotionDesc) {
                this.promotionDesc = promotionDesc;
                return this;
            }

            public Coupons build() {
                return new Coupons(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
    public static class PromotionRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private PromotionRules(Builder builder) {
            this.name = builder.name;
            this.ruleId = builder.ruleId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromotionRules create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String name; 
            private String ruleId; 
            private String title; 

            private Builder() {
            } 

            private Builder(PromotionRules model) {
                this.name = model.name;
                this.ruleId = model.ruleId;
                this.title = model.title;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public PromotionRules build() {
                return new PromotionRules(this);
            } 

        } 

    }
}
