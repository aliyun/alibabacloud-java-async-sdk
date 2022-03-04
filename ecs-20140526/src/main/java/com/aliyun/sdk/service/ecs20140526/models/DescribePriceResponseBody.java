// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PriceInfo")
    private PriceInfo priceInfo;

    private DescribePriceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.priceInfo = builder.priceInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePriceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return priceInfo
     */
    public PriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public static final class Builder {
        private String requestId; 
        private PriceInfo priceInfo; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The type of Price information, including Price and discount rules.
         */
        public Builder priceInfo(PriceInfo priceInfo) {
            this.priceInfo = priceInfo;
            return this;
        }

        public DescribePriceResponseBody build() {
            return new DescribePriceResponseBody(this);
        } 

    } 

    public static class Rule extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("RuleId")
        private Long ruleId;

        private Rule(Builder builder) {
            this.description = builder.description;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rule create() {
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
             * The description of the activity rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the activity.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public Rule build() {
                return new Rule(this);
            } 

        } 

    }
    public static class Rules extends TeaModel {
        @NameInMap("Rule")
        private java.util.List < Rule> rule;

        private Rules(Builder builder) {
            this.rule = builder.rule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return rule
         */
        public java.util.List < Rule> getRule() {
            return this.rule;
        }

        public static final class Builder {
            private java.util.List < Rule> rule; 

            /**
             * Rule.
             */
            public Builder rule(java.util.List < Rule> rule) {
                this.rule = rule;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    public static class SubRulesRule extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("RuleId")
        private Long ruleId;

        private SubRulesRule(Builder builder) {
            this.description = builder.description;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubRulesRule create() {
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
             * The description of the rule subset.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the rule.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public SubRulesRule build() {
                return new SubRulesRule(this);
            } 

        } 

    }
    public static class SubRules extends TeaModel {
        @NameInMap("Rule")
        private java.util.List < SubRulesRule> rule;

        private SubRules(Builder builder) {
            this.rule = builder.rule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubRules create() {
            return builder().build();
        }

        /**
         * @return rule
         */
        public java.util.List < SubRulesRule> getRule() {
            return this.rule;
        }

        public static final class Builder {
            private java.util.List < SubRulesRule> rule; 

            /**
             * Rule.
             */
            public Builder rule(java.util.List < SubRulesRule> rule) {
                this.rule = rule;
                return this;
            }

            public SubRules build() {
                return new SubRules(this);
            } 

        } 

    }
    public static class ResourcePriceModel extends TeaModel {
        @NameInMap("Resource")
        private String resource;

        @NameInMap("OriginalPrice")
        private Float originalPrice;

        @NameInMap("DiscountPrice")
        private Float discountPrice;

        @NameInMap("TradePrice")
        private Float tradePrice;

        @NameInMap("SubRules")
        private SubRules subRules;

        private ResourcePriceModel(Builder builder) {
            this.resource = builder.resource;
            this.originalPrice = builder.originalPrice;
            this.discountPrice = builder.discountPrice;
            this.tradePrice = builder.tradePrice;
            this.subRules = builder.subRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePriceModel create() {
            return builder().build();
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return originalPrice
         */
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return discountPrice
         */
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return tradePrice
         */
        public Float getTradePrice() {
            return this.tradePrice;
        }

        /**
         * @return subRules
         */
        public SubRules getSubRules() {
            return this.subRules;
        }

        public static final class Builder {
            private String resource; 
            private Float originalPrice; 
            private Float discountPrice; 
            private Float tradePrice; 
            private SubRules subRules; 

            /**
             * The name of the resource.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * Original price.
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * Discount price.
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * The transaction price.
             */
            public Builder tradePrice(Float tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            /**
             * A subset of pricing rules.
             */
            public Builder subRules(SubRules subRules) {
                this.subRules = subRules;
                return this;
            }

            public ResourcePriceModel build() {
                return new ResourcePriceModel(this);
            } 

        } 

    }
    public static class DetailInfos extends TeaModel {
        @NameInMap("ResourcePriceModel")
        private java.util.List < ResourcePriceModel> resourcePriceModel;

        private DetailInfos(Builder builder) {
            this.resourcePriceModel = builder.resourcePriceModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailInfos create() {
            return builder().build();
        }

        /**
         * @return resourcePriceModel
         */
        public java.util.List < ResourcePriceModel> getResourcePriceModel() {
            return this.resourcePriceModel;
        }

        public static final class Builder {
            private java.util.List < ResourcePriceModel> resourcePriceModel; 

            /**
             * ResourcePriceModel.
             */
            public Builder resourcePriceModel(java.util.List < ResourcePriceModel> resourcePriceModel) {
                this.resourcePriceModel = resourcePriceModel;
                return this;
            }

            public DetailInfos build() {
                return new DetailInfos(this);
            } 

        } 

    }
    public static class Price extends TeaModel {
        @NameInMap("OriginalPrice")
        private Float originalPrice;

        @NameInMap("ReservedInstanceHourPrice")
        private Float reservedInstanceHourPrice;

        @NameInMap("DiscountPrice")
        private Float discountPrice;

        @NameInMap("Currency")
        private String currency;

        @NameInMap("TradePrice")
        private Float tradePrice;

        @NameInMap("DetailInfos")
        private DetailInfos detailInfos;

        private Price(Builder builder) {
            this.originalPrice = builder.originalPrice;
            this.reservedInstanceHourPrice = builder.reservedInstanceHourPrice;
            this.discountPrice = builder.discountPrice;
            this.currency = builder.currency;
            this.tradePrice = builder.tradePrice;
            this.detailInfos = builder.detailInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Price create() {
            return builder().build();
        }

        /**
         * @return originalPrice
         */
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return reservedInstanceHourPrice
         */
        public Float getReservedInstanceHourPrice() {
            return this.reservedInstanceHourPrice;
        }

        /**
         * @return discountPrice
         */
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return tradePrice
         */
        public Float getTradePrice() {
            return this.tradePrice;
        }

        /**
         * @return detailInfos
         */
        public DetailInfos getDetailInfos() {
            return this.detailInfos;
        }

        public static final class Builder {
            private Float originalPrice; 
            private Float reservedInstanceHourPrice; 
            private Float discountPrice; 
            private String currency; 
            private Float tradePrice; 
            private DetailInfos detailInfos; 

            /**
             * Original price.
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * The hourly price of reserved instances that are 0 or partially prepaid.
             */
            public Builder reservedInstanceHourPrice(Float reservedInstanceHourPrice) {
                this.reservedInstanceHourPrice = reservedInstanceHourPrice;
                return this;
            }

            /**
             * Discount.
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * The unit of currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * The final price, which is the original price minus the discount.
             */
            public Builder tradePrice(Float tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            /**
             * The price details.
             * <p>
             * 
             * > the returned value is being invited for testing and is not currently available.
             */
            public Builder detailInfos(DetailInfos detailInfos) {
                this.detailInfos = detailInfos;
                return this;
            }

            public Price build() {
                return new Price(this);
            } 

        } 

    }
    public static class PriceInfo extends TeaModel {
        @NameInMap("Rules")
        private Rules rules;

        @NameInMap("Price")
        private Price price;

        private PriceInfo(Builder builder) {
            this.rules = builder.rules;
            this.price = builder.price;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceInfo create() {
            return builder().build();
        }

        /**
         * @return rules
         */
        public Rules getRules() {
            return this.rules;
        }

        /**
         * @return price
         */
        public Price getPrice() {
            return this.price;
        }

        public static final class Builder {
            private Rules rules; 
            private Price price; 

            /**
             * The activity rule.
             */
            public Builder rules(Rules rules) {
                this.rules = rules;
                return this;
            }

            /**
             * The price.
             */
            public Builder price(Price price) {
                this.price = price;
                return this;
            }

            public PriceInfo build() {
                return new PriceInfo(this);
            } 

        } 

    }
}
