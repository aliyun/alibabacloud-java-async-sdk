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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * PriceList.
         */
        public Builder priceList(java.util.List<PriceList> priceList) {
            this.priceList = priceList;
            return this;
        }

        /**
         * PriceModel.
         */
        public Builder priceModel(PriceModel priceModel) {
            this.priceModel = priceModel;
            return this;
        }

        /**
         * RequestId.
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
             * OptionCode.
             */
            public Builder optionCode(String optionCode) {
                this.optionCode = optionCode;
                return this;
            }

            /**
             * PromotionDesc.
             */
            public Builder promotionDesc(String promotionDesc) {
                this.promotionDesc = promotionDesc;
                return this;
            }

            /**
             * PromotionId.
             */
            public Builder promotionId(String promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * PromotionName.
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * Selected.
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
             * Promotions.
             */
            public Builder promotions(java.util.List<Promotions> promotions) {
                this.promotions = promotions;
                return this;
            }

            /**
             * TradePrice.
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * RuleId.
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
             * Price.
             */
            public Builder price(Price price) {
                this.price = price;
                return this;
            }

            /**
             * PriceType.
             */
            public Builder priceType(String priceType) {
                this.priceType = priceType;
                return this;
            }

            /**
             * Rules.
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
             * OptionCode.
             */
            public Builder optionCode(String optionCode) {
                this.optionCode = optionCode;
                return this;
            }

            /**
             * PromotionDesc.
             */
            public Builder promotionDesc(String promotionDesc) {
                this.promotionDesc = promotionDesc;
                return this;
            }

            /**
             * PromotionId.
             */
            public Builder promotionId(String promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * PromotionName.
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * Selected.
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
             * Promotions.
             */
            public Builder promotions(java.util.List<PricePromotions> promotions) {
                this.promotions = promotions;
                return this;
            }

            /**
             * TradePrice.
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * RuleId.
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
             * Price.
             */
            public Builder price(PriceModelPrice price) {
                this.price = price;
                return this;
            }

            /**
             * Rules.
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
