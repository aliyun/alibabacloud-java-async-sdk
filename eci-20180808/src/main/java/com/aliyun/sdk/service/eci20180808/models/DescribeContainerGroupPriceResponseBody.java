// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeContainerGroupPriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerGroupPriceResponseBody</p>
 */
public class DescribeContainerGroupPriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PriceInfo")
    private PriceInfo priceInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information about the prices and discount rules.</p>
         */
        public Builder priceInfo(PriceInfo priceInfo) {
            this.priceInfo = priceInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7A872585-33C7-4D69-AB8E-412E81EBA387</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContainerGroupPriceResponseBody build() {
            return new DescribeContainerGroupPriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeContainerGroupPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupPriceResponseBody</p>
     */
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
             * <p>The description of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Receive a 15% discount on a 1-year subscription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
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
    /**
     * 
     * {@link DescribeContainerGroupPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupPriceResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rule")
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
    /**
     * 
     * {@link DescribeContainerGroupPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupPriceResponseBody</p>
     */
    public static class DetailInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Float discountPrice;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Float originalPrice;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private Rules rules;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
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
             * <p>The discount.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * <p>The original price.</p>
             * 
             * <strong>example:</strong>
             * <p>0.000098</p>
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The name of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>cpu</p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>Details about the pricing rules.</p>
             */
            public Builder rules(Rules rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>The transaction price.</p>
             * 
             * <strong>example:</strong>
             * <p>0.000098</p>
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
    /**
     * 
     * {@link DescribeContainerGroupPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupPriceResponseBody</p>
     */
    public static class DetailInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetailInfo")
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
    /**
     * 
     * {@link DescribeContainerGroupPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupPriceResponseBody</p>
     */
    public static class Price extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DetailInfos")
        private DetailInfos detailInfos;

        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Float discountPrice;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Float originalPrice;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
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
             * <p>The currency unit. Valid values:</p>
             * <ul>
             * <li>CNY: This value only applies to the China site (aliyun.com).</li>
             * <li>USD: This value only applies to the International site (alibabacloud.com).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The information about the price.</p>
             */
            public Builder detailInfos(DetailInfos detailInfos) {
                this.detailInfos = detailInfos;
                return this;
            }

            /**
             * <p>The discount.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * <p>The original price.</p>
             * 
             * <strong>example:</strong>
             * <p>0.00012252</p>
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The transaction price, which is equal to the original price minus the discount.</p>
             * 
             * <strong>example:</strong>
             * <p>0.00012252</p>
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
    /**
     * 
     * {@link DescribeContainerGroupPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupPriceResponseBody</p>
     */
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
             * <p>The description of the promotion rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Receive a 15% discount on a 1-year subscription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the promotion rule.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
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
    /**
     * 
     * {@link DescribeContainerGroupPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupPriceResponseBody</p>
     */
    public static class PriceInfoRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rule")
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
    /**
     * 
     * {@link DescribeContainerGroupPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupPriceResponseBody</p>
     */
    public static class SpotPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("OriginPrice")
        private Float originPrice;

        @com.aliyun.core.annotation.NameInMap("SpotPrice")
        private Float spotPrice;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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
             * <p>The ECS instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c5.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The original price.</p>
             * 
             * <strong>example:</strong>
             * <p>0.622</p>
             */
            public Builder originPrice(Float originPrice) {
                this.originPrice = originPrice;
                return this;
            }

            /**
             * <p>The prices of preemptible elastic container instances.</p>
             * 
             * <strong>example:</strong>
             * <p>0.056</p>
             */
            public Builder spotPrice(Float spotPrice) {
                this.spotPrice = spotPrice;
                return this;
            }

            /**
             * <p>The zone ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
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
    /**
     * 
     * {@link DescribeContainerGroupPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupPriceResponseBody</p>
     */
    public static class SpotPrices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpotPrice")
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
             * <p>The prices of preemptible elastic container instances.</p>
             * 
             * <strong>example:</strong>
             * <p>0.056</p>
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
    /**
     * 
     * {@link DescribeContainerGroupPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupPriceResponseBody</p>
     */
    public static class PriceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Price")
        private Price price;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private PriceInfoRules rules;

        @com.aliyun.core.annotation.NameInMap("SpotPrices")
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
             * <p>The price.</p>
             */
            public Builder price(Price price) {
                this.price = price;
                return this;
            }

            /**
             * <p>Details about the promotion rules.</p>
             */
            public Builder rules(PriceInfoRules rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>The information about the prices of preemptible elastic container instances.</p>
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
