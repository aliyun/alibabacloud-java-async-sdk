// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetResourcePriceResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourcePriceResponseBody</p>
 */
public class GetResourcePriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PriceList")
    private java.util.List<PriceList> priceList;

    @com.aliyun.core.annotation.NameInMap("PriceModel")
    private PriceModel priceModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetResourcePriceResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.priceList = builder.priceList;
        this.priceModel = builder.priceModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourcePriceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return priceList
     */
    public java.util.List<PriceList> getPriceList() {
        return this.priceList;
    }

    /**
     * @return priceModel
     */
    public PriceModel getPriceModel() {
        return this.priceModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List<PriceList> priceList; 
        private PriceModel priceModel; 
        private String requestId; 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter.ProductType</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The parameter ProductType is invalid.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The price objects.</p>
         * <p>This parameter is returned only if a value is specified for AppInstanceType.</p>
         */
        public Builder priceList(java.util.List<PriceList> priceList) {
            this.priceList = priceList;
            return this;
        }

        /**
         * <p>The price object.</p>
         * <p>This parameter is returned only if a value is specified for NodeInstanceType.</p>
         */
        public Builder priceModel(PriceModel priceModel) {
            this.priceModel = priceModel;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetResourcePriceResponseBody build() {
            return new GetResourcePriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourcePriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourcePriceResponseBody</p>
     */
    public static class Promotions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OptionCode")
        private String optionCode;

        @com.aliyun.core.annotation.NameInMap("PromotionDesc")
        private String promotionDesc;

        @com.aliyun.core.annotation.NameInMap("PromotionId")
        private String promotionId;

        @com.aliyun.core.annotation.NameInMap("PromotionName")
        private String promotionName;

        @com.aliyun.core.annotation.NameInMap("Selected")
        private Boolean selected;

        private Promotions(Builder builder) {
            this.optionCode = builder.optionCode;
            this.promotionDesc = builder.promotionDesc;
            this.promotionId = builder.promotionId;
            this.promotionName = builder.promotionName;
            this.selected = builder.selected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Promotions create() {
            return builder().build();
        }

        /**
         * @return optionCode
         */
        public String getOptionCode() {
            return this.optionCode;
        }

        /**
         * @return promotionDesc
         */
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        /**
         * @return promotionId
         */
        public String getPromotionId() {
            return this.promotionId;
        }

        /**
         * @return promotionName
         */
        public String getPromotionName() {
            return this.promotionName;
        }

        /**
         * @return selected
         */
        public Boolean getSelected() {
            return this.selected;
        }

        public static final class Builder {
            private String optionCode; 
            private String promotionDesc; 
            private String promotionId; 
            private String promotionName; 
            private Boolean selected; 

            /**
             * <p>The coupon code.</p>
             * 
             * <strong>example:</strong>
             * <p>coupon****</p>
             */
            public Builder optionCode(String optionCode) {
                this.optionCode = optionCode;
                return this;
            }

            /**
             * <p>The coupon description.</p>
             */
            public Builder promotionDesc(String promotionDesc) {
                this.promotionDesc = promotionDesc;
                return this;
            }

            /**
             * <p>The coupon ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1847709****</p>
             */
            public Builder promotionId(String promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * <p>The coupon name.</p>
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * <p>Indicates whether the coupon was used.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder selected(Boolean selected) {
                this.selected = selected;
                return this;
            }

            public Promotions build() {
                return new Promotions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourcePriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourcePriceResponseBody</p>
     */
    public static class Price extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private String discountPrice;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private String originalPrice;

        @com.aliyun.core.annotation.NameInMap("Promotions")
        private java.util.List<Promotions> promotions;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
        private String tradePrice;

        private Price(Builder builder) {
            this.currency = builder.currency;
            this.discountPrice = builder.discountPrice;
            this.originalPrice = builder.originalPrice;
            this.promotions = builder.promotions;
            this.tradePrice = builder.tradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Price create() {
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
         * @return promotions
         */
        public java.util.List<Promotions> getPromotions() {
            return this.promotions;
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
            private java.util.List<Promotions> promotions; 
            private String tradePrice; 

            /**
             * <p>The currency type.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The discount. The actual price is calculated based on the following formula: Actual price = Original price - Discount.</p>
             * 
             * <strong>example:</strong>
             * <p>999.0</p>
             */
            public Builder discountPrice(String discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * <p>The original price.</p>
             * 
             * <strong>example:</strong>
             * <p>6700</p>
             */
            public Builder originalPrice(String originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The coupon metadata.</p>
             */
            public Builder promotions(java.util.List<Promotions> promotions) {
                this.promotions = promotions;
                return this;
            }

            /**
             * <p>The actual price. The actual price is calculated based on the following formula: Actual price = Original price - Discount.</p>
             * 
             * <strong>example:</strong>
             * <p>5278.0</p>
             */
            public Builder tradePrice(String tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            public Price build() {
                return new Price(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourcePriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourcePriceResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        private Rules(Builder builder) {
            this.description = builder.description;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private String description; 
            private Long ruleId; 

            /**
             * <p>The description of the price calculation rule.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the price calculation rule.</p>
             * 
             * <strong>example:</strong>
             * <p>260904273633****</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourcePriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourcePriceResponseBody</p>
     */
    public static class PriceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Price")
        private Price price;

        @com.aliyun.core.annotation.NameInMap("PriceType")
        private String priceType;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        private PriceList(Builder builder) {
            this.price = builder.price;
            this.priceType = builder.priceType;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceList create() {
            return builder().build();
        }

        /**
         * @return price
         */
        public Price getPrice() {
            return this.price;
        }

        /**
         * @return priceType
         */
        public String getPriceType() {
            return this.priceType;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private Price price; 
            private String priceType; 
            private java.util.List<Rules> rules; 

            /**
             * <p>The price details.</p>
             */
            public Builder price(Price price) {
                this.price = price;
                return this;
            }

            /**
             * <p>The price type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Connected: in use</li>
             * <li>Standby: pending for use.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standby</p>
             */
            public Builder priceType(String priceType) {
                this.priceType = priceType;
                return this;
            }

            /**
             * <p>The price calculation rules.</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            public PriceList build() {
                return new PriceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourcePriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourcePriceResponseBody</p>
     */
    public static class PricePromotions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OptionCode")
        private String optionCode;

        @com.aliyun.core.annotation.NameInMap("PromotionDesc")
        private String promotionDesc;

        @com.aliyun.core.annotation.NameInMap("PromotionId")
        private String promotionId;

        @com.aliyun.core.annotation.NameInMap("PromotionName")
        private String promotionName;

        @com.aliyun.core.annotation.NameInMap("Selected")
        private Boolean selected;

        private PricePromotions(Builder builder) {
            this.optionCode = builder.optionCode;
            this.promotionDesc = builder.promotionDesc;
            this.promotionId = builder.promotionId;
            this.promotionName = builder.promotionName;
            this.selected = builder.selected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PricePromotions create() {
            return builder().build();
        }

        /**
         * @return optionCode
         */
        public String getOptionCode() {
            return this.optionCode;
        }

        /**
         * @return promotionDesc
         */
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        /**
         * @return promotionId
         */
        public String getPromotionId() {
            return this.promotionId;
        }

        /**
         * @return promotionName
         */
        public String getPromotionName() {
            return this.promotionName;
        }

        /**
         * @return selected
         */
        public Boolean getSelected() {
            return this.selected;
        }

        public static final class Builder {
            private String optionCode; 
            private String promotionDesc; 
            private String promotionId; 
            private String promotionName; 
            private Boolean selected; 

            /**
             * <p>The coupon code.</p>
             * 
             * <strong>example:</strong>
             * <p>coupon****</p>
             */
            public Builder optionCode(String optionCode) {
                this.optionCode = optionCode;
                return this;
            }

            /**
             * <p>The coupon description.</p>
             */
            public Builder promotionDesc(String promotionDesc) {
                this.promotionDesc = promotionDesc;
                return this;
            }

            /**
             * <p>The coupon ID.</p>
             * 
             * <strong>example:</strong>
             * <p>17440009****</p>
             */
            public Builder promotionId(String promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * <p>The coupon name.</p>
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * <p>Indicates whether the coupon was used.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder selected(Boolean selected) {
                this.selected = selected;
                return this;
            }

            public PricePromotions build() {
                return new PricePromotions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourcePriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourcePriceResponseBody</p>
     */
    public static class PriceModelPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private String discountPrice;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private String originalPrice;

        @com.aliyun.core.annotation.NameInMap("Promotions")
        private java.util.List<PricePromotions> promotions;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
        private String tradePrice;

        private PriceModelPrice(Builder builder) {
            this.currency = builder.currency;
            this.discountPrice = builder.discountPrice;
            this.originalPrice = builder.originalPrice;
            this.promotions = builder.promotions;
            this.tradePrice = builder.tradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceModelPrice create() {
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
         * @return promotions
         */
        public java.util.List<PricePromotions> getPromotions() {
            return this.promotions;
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
            private java.util.List<PricePromotions> promotions; 
            private String tradePrice; 

            /**
             * <p>The currency type.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The discount. The actual price is calculated based on the following formula: Actual price = Original price - Discount.</p>
             * 
             * <strong>example:</strong>
             * <p>1.00</p>
             */
            public Builder discountPrice(String discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * <p>The original price.</p>
             * 
             * <strong>example:</strong>
             * <p>11.00</p>
             */
            public Builder originalPrice(String originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The coupon metadata.</p>
             */
            public Builder promotions(java.util.List<PricePromotions> promotions) {
                this.promotions = promotions;
                return this;
            }

            /**
             * <p>The actual price. The actual price is calculated based on the following formula: Actual price = Original price - Discount.</p>
             * 
             * <strong>example:</strong>
             * <p>10.00</p>
             */
            public Builder tradePrice(String tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            public PriceModelPrice build() {
                return new PriceModelPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourcePriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourcePriceResponseBody</p>
     */
    public static class PriceModelRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        private PriceModelRules(Builder builder) {
            this.description = builder.description;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceModelRules create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private String description; 
            private Long ruleId; 

            /**
             * <p>The description of the price calculation rule.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the price calculation rule.</p>
             * 
             * <strong>example:</strong>
             * <p>102002100393****</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public PriceModelRules build() {
                return new PriceModelRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourcePriceResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourcePriceResponseBody</p>
     */
    public static class PriceModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Price")
        private PriceModelPrice price;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<PriceModelRules> rules;

        private PriceModel(Builder builder) {
            this.price = builder.price;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceModel create() {
            return builder().build();
        }

        /**
         * @return price
         */
        public PriceModelPrice getPrice() {
            return this.price;
        }

        /**
         * @return rules
         */
        public java.util.List<PriceModelRules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private PriceModelPrice price; 
            private java.util.List<PriceModelRules> rules; 

            /**
             * <p>The price details.</p>
             */
            public Builder price(PriceModelPrice price) {
                this.price = price;
                return this;
            }

            /**
             * <p>The price calculation rules.</p>
             */
            public Builder rules(java.util.List<PriceModelRules> rules) {
                this.rules = rules;
                return this;
            }

            public PriceModel build() {
                return new PriceModel(this);
            } 

        } 

    }
}
