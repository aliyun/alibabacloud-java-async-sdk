// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePriceResponseBody</p>
 */
public class DescribePriceResponseBody extends TeaModel {
    @NameInMap("PriceInfo")
    private PriceInfo priceInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePriceResponseBody(Builder builder) {
        this.priceInfo = builder.priceInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePriceResponseBody create() {
        return builder().build();
    }

    /**
     * @return priceInfo
     */
    public PriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PriceInfo priceInfo; 
        private String requestId; 

        /**
         * The price details.
         */
        public Builder priceInfo(PriceInfo priceInfo) {
            this.priceInfo = priceInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePriceResponseBody build() {
            return new DescribePriceResponseBody(this);
        } 

    } 

    public static class Promotions extends TeaModel {
        @NameInMap("OptionCode")
        private String optionCode;

        @NameInMap("PromotionDesc")
        private String promotionDesc;

        @NameInMap("PromotionId")
        private String promotionId;

        @NameInMap("PromotionName")
        private String promotionName;

        @NameInMap("Selected")
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
             * The description of the promotion rule.
             */
            public Builder optionCode(String optionCode) {
                this.optionCode = optionCode;
                return this;
            }

            /**
             * The description of the promotion.
             */
            public Builder promotionDesc(String promotionDesc) {
                this.promotionDesc = promotionDesc;
                return this;
            }

            /**
             * The promotion ID.
             */
            public Builder promotionId(String promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * The promotion name.
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * Indicates whether an item is selected.
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
    public static class Price extends TeaModel {
        @NameInMap("Currency")
        private String currency;

        @NameInMap("DiscountPrice")
        private Float discountPrice;

        @NameInMap("OrderLines")
        private java.util.Map < String, String > orderLines;

        @NameInMap("OriginalPrice")
        private Float originalPrice;

        @NameInMap("Promotions")
        private java.util.List < Promotions> promotions;

        @NameInMap("SpPrice")
        private Long spPrice;

        @NameInMap("TradePrice")
        private Float tradePrice;

        private Price(Builder builder) {
            this.currency = builder.currency;
            this.discountPrice = builder.discountPrice;
            this.orderLines = builder.orderLines;
            this.originalPrice = builder.originalPrice;
            this.promotions = builder.promotions;
            this.spPrice = builder.spPrice;
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
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return orderLines
         */
        public java.util.Map < String, String > getOrderLines() {
            return this.orderLines;
        }

        /**
         * @return originalPrice
         */
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return promotions
         */
        public java.util.List < Promotions> getPromotions() {
            return this.promotions;
        }

        /**
         * @return spPrice
         */
        public Long getSpPrice() {
            return this.spPrice;
        }

        /**
         * @return tradePrice
         */
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public static final class Builder {
            private String currency; 
            private Float discountPrice; 
            private java.util.Map < String, String > orderLines; 
            private Float originalPrice; 
            private java.util.List < Promotions> promotions; 
            private Long spPrice; 
            private Float tradePrice; 

            /**
             * The unit of the currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * The discounted price.
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * OrderLines.
             */
            public Builder orderLines(java.util.Map < String, String > orderLines) {
                this.orderLines = orderLines;
                return this;
            }

            /**
             * The original price.
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * The details of the promotion.
             */
            public Builder promotions(java.util.List < Promotions> promotions) {
                this.promotions = promotions;
                return this;
            }

            /**
             * SpPrice.
             */
            public Builder spPrice(Long spPrice) {
                this.spPrice = spPrice;
                return this;
            }

            /**
             * The actual price that is paid. The original price minus the discounted part equals the actual price.
             */
            public Builder tradePrice(Float tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            public Price build() {
                return new Price(this);
            } 

        } 

    }
    public static class Rules extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("RuleId")
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
             * The description of the rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The rule ID.
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
    public static class PriceInfo extends TeaModel {
        @NameInMap("FreeCdsQuota")
        private Boolean freeCdsQuota;

        @NameInMap("FreeCdsSize")
        private Long freeCdsSize;

        @NameInMap("Price")
        private Price price;

        @NameInMap("Rules")
        private java.util.List < Rules> rules;

        private PriceInfo(Builder builder) {
            this.freeCdsQuota = builder.freeCdsQuota;
            this.freeCdsSize = builder.freeCdsSize;
            this.price = builder.price;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceInfo create() {
            return builder().build();
        }

        /**
         * @return freeCdsQuota
         */
        public Boolean getFreeCdsQuota() {
            return this.freeCdsQuota;
        }

        /**
         * @return freeCdsSize
         */
        public Long getFreeCdsSize() {
            return this.freeCdsSize;
        }

        /**
         * @return price
         */
        public Price getPrice() {
            return this.price;
        }

        /**
         * @return rules
         */
        public java.util.List < Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private Boolean freeCdsQuota; 
            private Long freeCdsSize; 
            private Price price; 
            private java.util.List < Rules> rules; 

            /**
             * FreeCdsQuota.
             */
            public Builder freeCdsQuota(Boolean freeCdsQuota) {
                this.freeCdsQuota = freeCdsQuota;
                return this;
            }

            /**
             * FreeCdsSize.
             */
            public Builder freeCdsSize(Long freeCdsSize) {
                this.freeCdsSize = freeCdsSize;
                return this;
            }

            /**
             * The information about the price.
             */
            public Builder price(Price price) {
                this.price = price;
                return this;
            }

            /**
             * The details of the promotion rules.
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            public PriceInfo build() {
                return new PriceInfo(this);
            } 

        } 

    }
}
