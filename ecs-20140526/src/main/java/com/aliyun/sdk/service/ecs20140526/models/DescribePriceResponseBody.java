// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePriceResponseBody</p>
 */
public class DescribePriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PriceInfo")
    private PriceInfo priceInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * Details about the prices and promotion rules.
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

    public static class Rule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RuleId")
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
             * The description of the pricing rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the pricing rule.
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
    public static class SubRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rule")
        private java.util.List < Rule> rule;

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

            public SubRules build() {
                return new SubRules(this);
            } 

        } 

    }
    public static class ResourcePriceModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Float discountPrice;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Float originalPrice;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("SubRules")
        private SubRules subRules;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
        private Float tradePrice;

        private ResourcePriceModel(Builder builder) {
            this.discountPrice = builder.discountPrice;
            this.originalPrice = builder.originalPrice;
            this.resource = builder.resource;
            this.subRules = builder.subRules;
            this.tradePrice = builder.tradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePriceModel create() {
            return builder().build();
        }

        /**
         * @return discountPrice
         */
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return originalPrice
         */
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return subRules
         */
        public SubRules getSubRules() {
            return this.subRules;
        }

        /**
         * @return tradePrice
         */
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public static final class Builder {
            private Float discountPrice; 
            private Float originalPrice; 
            private String resource; 
            private SubRules subRules; 
            private Float tradePrice; 

            /**
             * The discount.
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
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
             * The resource name.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * Details about the pricing rules.
             */
            public Builder subRules(SubRules subRules) {
                this.subRules = subRules;
                return this;
            }

            /**
             * The transaction price.
             */
            public Builder tradePrice(Float tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            public ResourcePriceModel build() {
                return new ResourcePriceModel(this);
            } 

        } 

    }
    public static class DetailInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourcePriceModel")
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
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DetailInfos")
        private DetailInfos detailInfos;

        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Float discountPrice;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Float originalPrice;

        @com.aliyun.core.annotation.NameInMap("ReservedInstanceHourPrice")
        private Float reservedInstanceHourPrice;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
        private Float tradePrice;

        private Price(Builder builder) {
            this.currency = builder.currency;
            this.detailInfos = builder.detailInfos;
            this.discountPrice = builder.discountPrice;
            this.originalPrice = builder.originalPrice;
            this.reservedInstanceHourPrice = builder.reservedInstanceHourPrice;
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
         * @return detailInfos
         */
        public DetailInfos getDetailInfos() {
            return this.detailInfos;
        }

        /**
         * @return discountPrice
         */
        public Float getDiscountPrice() {
            return this.discountPrice;
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
         * @return tradePrice
         */
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public static final class Builder {
            private String currency; 
            private DetailInfos detailInfos; 
            private Float discountPrice; 
            private Float originalPrice; 
            private Float reservedInstanceHourPrice; 
            private Float tradePrice; 

            /**
             * The currency unit.
             * <p>
             * 
             * Alibaba Cloud China site (aliyun.com): CNY.
             * 
             * Alibaba Cloud International site (alibabacloud.com): USD.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * Details about the price.
             * <p>
             * 
             * > This parameter is in invitational preview and is unavailable for public use.
             */
            public Builder detailInfos(DetailInfos detailInfos) {
                this.detailInfos = detailInfos;
                return this;
            }

            /**
             * The discount.
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
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
             * The hourly price of the reserved instance for which the No Upfront or Partial Upfront payment option is used.
             */
            public Builder reservedInstanceHourPrice(Float reservedInstanceHourPrice) {
                this.reservedInstanceHourPrice = reservedInstanceHourPrice;
                return this;
            }

            /**
             * The transaction price of the order. The transaction price is equal to the original price minus the discount.
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
    public static class RulesRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        private RulesRule(Builder builder) {
            this.description = builder.description;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RulesRule create() {
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
             * The description of the promotion rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the pricing rule.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public RulesRule build() {
                return new RulesRule(this);
            } 

        } 

    }
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rule")
        private java.util.List < RulesRule> rule;

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
        public java.util.List < RulesRule> getRule() {
            return this.rule;
        }

        public static final class Builder {
            private java.util.List < RulesRule> rule; 

            /**
             * Rule.
             */
            public Builder rule(java.util.List < RulesRule> rule) {
                this.rule = rule;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    public static class PriceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Price")
        private Price price;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private Rules rules;

        private PriceInfo(Builder builder) {
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
         * @return price
         */
        public Price getPrice() {
            return this.price;
        }

        /**
         * @return rules
         */
        public Rules getRules() {
            return this.rules;
        }

        public static final class Builder {
            private Price price; 
            private Rules rules; 

            /**
             * The price.
             */
            public Builder price(Price price) {
                this.price = price;
                return this;
            }

            /**
             * Details about the promotion rules.
             */
            public Builder rules(Rules rules) {
                this.rules = rules;
                return this;
            }

            public PriceInfo build() {
                return new PriceInfo(this);
            } 

        } 

    }
}
