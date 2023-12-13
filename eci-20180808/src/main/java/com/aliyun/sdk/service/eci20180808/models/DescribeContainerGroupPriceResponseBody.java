// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerGroupPriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerGroupPriceResponseBody</p>
 */
public class DescribeContainerGroupPriceResponseBody extends TeaModel {
    @NameInMap("PriceInfo")
    private PriceInfo priceInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeContainerGroupPriceResponseBody(Builder builder) {
        this.priceInfo = builder.priceInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerGroupPriceResponseBody create() {
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
         * The information about the prices and discount rules.
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

        public DescribeContainerGroupPriceResponseBody build() {
            return new DescribeContainerGroupPriceResponseBody(this);
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
    public static class DetailInfo extends TeaModel {
        @NameInMap("DiscountPrice")
        private Float discountPrice;

        @NameInMap("OriginalPrice")
        private Float originalPrice;

        @NameInMap("Resource")
        private String resource;

        @NameInMap("Rules")
        private Rules rules;

        @NameInMap("TradePrice")
        private Float tradePrice;

        private DetailInfo(Builder builder) {
            this.discountPrice = builder.discountPrice;
            this.originalPrice = builder.originalPrice;
            this.resource = builder.resource;
            this.rules = builder.rules;
            this.tradePrice = builder.tradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailInfo create() {
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
         * @return rules
         */
        public Rules getRules() {
            return this.rules;
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
            private Rules rules; 
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
             * The name of the resource.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * Details about the pricing rules.
             */
            public Builder rules(Rules rules) {
                this.rules = rules;
                return this;
            }

            /**
             * The transaction price.
             */
            public Builder tradePrice(Float tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            public DetailInfo build() {
                return new DetailInfo(this);
            } 

        } 

    }
    public static class DetailInfos extends TeaModel {
        @NameInMap("DetailInfo")
        private java.util.List < DetailInfo> detailInfo;

        private DetailInfos(Builder builder) {
            this.detailInfo = builder.detailInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailInfos create() {
            return builder().build();
        }

        /**
         * @return detailInfo
         */
        public java.util.List < DetailInfo> getDetailInfo() {
            return this.detailInfo;
        }

        public static final class Builder {
            private java.util.List < DetailInfo> detailInfo; 

            /**
             * DetailInfo.
             */
            public Builder detailInfo(java.util.List < DetailInfo> detailInfo) {
                this.detailInfo = detailInfo;
                return this;
            }

            public DetailInfos build() {
                return new DetailInfos(this);
            } 

        } 

    }
    public static class Price extends TeaModel {
        @NameInMap("Currency")
        private String currency;

        @NameInMap("DetailInfos")
        private DetailInfos detailInfos;

        @NameInMap("DiscountPrice")
        private Float discountPrice;

        @NameInMap("OriginalPrice")
        private Float originalPrice;

        @NameInMap("TradePrice")
        private Float tradePrice;

        private Price(Builder builder) {
            this.currency = builder.currency;
            this.detailInfos = builder.detailInfos;
            this.discountPrice = builder.discountPrice;
            this.originalPrice = builder.originalPrice;
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
            private Float tradePrice; 

            /**
             * The currency unit. Valid values:
             * <p>
             * 
             * *   CNY: This value only applies to the China site (aliyun.com).
             * *   USD: This value only applies to the International site (alibabacloud.com).
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * The information about the price.
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
             * The transaction price, which is equal to the original price minus the discount.
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
        @NameInMap("Description")
        private String description;

        @NameInMap("RuleId")
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
             * The ID of the promotion rule.
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
    public static class PriceInfoRules extends TeaModel {
        @NameInMap("Rule")
        private java.util.List < RulesRule> rule;

        private PriceInfoRules(Builder builder) {
            this.rule = builder.rule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceInfoRules create() {
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

            public PriceInfoRules build() {
                return new PriceInfoRules(this);
            } 

        } 

    }
    public static class SpotPrice extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("OriginPrice")
        private Float originPrice;

        @NameInMap("SpotPrice")
        private Float spotPrice;

        @NameInMap("ZoneId")
        private String zoneId;

        private SpotPrice(Builder builder) {
            this.instanceType = builder.instanceType;
            this.originPrice = builder.originPrice;
            this.spotPrice = builder.spotPrice;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpotPrice create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return originPrice
         */
        public Float getOriginPrice() {
            return this.originPrice;
        }

        /**
         * @return spotPrice
         */
        public Float getSpotPrice() {
            return this.spotPrice;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String instanceType; 
            private Float originPrice; 
            private Float spotPrice; 
            private String zoneId; 

            /**
             * The ECS instance type.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The original price.
             */
            public Builder originPrice(Float originPrice) {
                this.originPrice = originPrice;
                return this;
            }

            /**
             * The prices of preemptible elastic container instances.
             */
            public Builder spotPrice(Float spotPrice) {
                this.spotPrice = spotPrice;
                return this;
            }

            /**
             * The zone ID of the instance.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public SpotPrice build() {
                return new SpotPrice(this);
            } 

        } 

    }
    public static class SpotPrices extends TeaModel {
        @NameInMap("SpotPrice")
        private java.util.List < SpotPrice> spotPrice;

        private SpotPrices(Builder builder) {
            this.spotPrice = builder.spotPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpotPrices create() {
            return builder().build();
        }

        /**
         * @return spotPrice
         */
        public java.util.List < SpotPrice> getSpotPrice() {
            return this.spotPrice;
        }

        public static final class Builder {
            private java.util.List < SpotPrice> spotPrice; 

            /**
             * The prices of preemptible elastic container instances.
             */
            public Builder spotPrice(java.util.List < SpotPrice> spotPrice) {
                this.spotPrice = spotPrice;
                return this;
            }

            public SpotPrices build() {
                return new SpotPrices(this);
            } 

        } 

    }
    public static class PriceInfo extends TeaModel {
        @NameInMap("Price")
        private Price price;

        @NameInMap("Rules")
        private PriceInfoRules rules;

        @NameInMap("SpotPrices")
        private SpotPrices spotPrices;

        private PriceInfo(Builder builder) {
            this.price = builder.price;
            this.rules = builder.rules;
            this.spotPrices = builder.spotPrices;
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
        public PriceInfoRules getRules() {
            return this.rules;
        }

        /**
         * @return spotPrices
         */
        public SpotPrices getSpotPrices() {
            return this.spotPrices;
        }

        public static final class Builder {
            private Price price; 
            private PriceInfoRules rules; 
            private SpotPrices spotPrices; 

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
            public Builder rules(PriceInfoRules rules) {
                this.rules = rules;
                return this;
            }

            /**
             * The information about the prices of preemptible elastic container instances.
             */
            public Builder spotPrices(SpotPrices spotPrices) {
                this.spotPrices = spotPrices;
                return this;
            }

            public PriceInfo build() {
                return new PriceInfo(this);
            } 

        } 

    }
}
