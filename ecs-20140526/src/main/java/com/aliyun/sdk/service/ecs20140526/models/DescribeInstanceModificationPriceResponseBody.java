// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeInstanceModificationPriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceModificationPriceResponseBody</p>
 */
public class DescribeInstanceModificationPriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PriceInfo")
    private PriceInfo priceInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceModificationPriceResponseBody(Builder builder) {
        this.priceInfo = builder.priceInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceModificationPriceResponseBody create() {
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
         * <p>Details about the prices and promotion rules.</p>
         */
        public Builder priceInfo(PriceInfo priceInfo) {
            this.priceInfo = priceInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A3DC3196-379B-4F32-A2C5-B937134FAD8A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceModificationPriceResponseBody build() {
            return new DescribeInstanceModificationPriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceModificationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceModificationPriceResponseBody</p>
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
             * <p>The description of the pricing rule.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the pricing rule.</p>
             * 
             * <strong>example:</strong>
             * <p>315716429631488</p>
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
     * {@link DescribeInstanceModificationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceModificationPriceResponseBody</p>
     */
    public static class SubRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rule")
        private java.util.List<Rule> rule;

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
        public java.util.List<Rule> getRule() {
            return this.rule;
        }

        public static final class Builder {
            private java.util.List<Rule> rule; 

            /**
             * Rule.
             */
            public Builder rule(java.util.List<Rule> rule) {
                this.rule = rule;
                return this;
            }

            public SubRules build() {
                return new SubRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceModificationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceModificationPriceResponseBody</p>
     */
    public static class DetailInfo extends TeaModel {
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

        private DetailInfo(Builder builder) {
            this.discountPrice = builder.discountPrice;
            this.originalPrice = builder.originalPrice;
            this.resource = builder.resource;
            this.subRules = builder.subRules;
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
             * <p>The discount.</p>
             * 
             * <strong>example:</strong>
             * <p>655.2</p>
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * <p>The original price.</p>
             * 
             * <strong>example:</strong>
             * <p>4368</p>
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The resource name. Valid values:</p>
             * <ul>
             * <li>InstanceType</li>
             * <li>bandwidth</li>
             * <li>image</li>
             * <li>SystemDisk</li>
             * <li>DataDisk</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>instanceType</p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The pricing rules.</p>
             */
            public Builder subRules(SubRules subRules) {
                this.subRules = subRules;
                return this;
            }

            /**
             * <p>The transaction price.</p>
             * 
             * <strong>example:</strong>
             * <p>3712.8</p>
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
     * {@link DescribeInstanceModificationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceModificationPriceResponseBody</p>
     */
    public static class DetailInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetailInfo")
        private java.util.List<DetailInfo> detailInfo;

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
        public java.util.List<DetailInfo> getDetailInfo() {
            return this.detailInfo;
        }

        public static final class Builder {
            private java.util.List<DetailInfo> detailInfo; 

            /**
             * DetailInfo.
             */
            public Builder detailInfo(java.util.List<DetailInfo> detailInfo) {
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
     * {@link DescribeInstanceModificationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceModificationPriceResponseBody</p>
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
             * <li>Alibaba Cloud China site (aliyun.com): CNY</li>
             * <li>Alibaba Cloud International site (alibabacloud.com): USD</li>
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
             * <blockquote>
             * <p> This parameter is returned only when ResourceType is set to instance.</p>
             * </blockquote>
             */
            public Builder detailInfos(DetailInfos detailInfos) {
                this.detailInfos = detailInfos;
                return this;
            }

            /**
             * <p>The discount.</p>
             * 
             * <strong>example:</strong>
             * <p>61.320</p>
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * <p>The original price.</p>
             * 
             * <strong>example:</strong>
             * <p>175.200</p>
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The transaction price, which is equal to the original price minus the discount.</p>
             * 
             * <strong>example:</strong>
             * <p>113.880</p>
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
     * {@link DescribeInstanceModificationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceModificationPriceResponseBody</p>
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
             * <p>Upgrade offers</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the promotion rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890</p>
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
     * {@link DescribeInstanceModificationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceModificationPriceResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rule")
        private java.util.List<RulesRule> rule;

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
        public java.util.List<RulesRule> getRule() {
            return this.rule;
        }

        public static final class Builder {
            private java.util.List<RulesRule> rule; 

            /**
             * Rule.
             */
            public Builder rule(java.util.List<RulesRule> rule) {
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
     * {@link DescribeInstanceModificationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceModificationPriceResponseBody</p>
     */
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
             * <p>The price.</p>
             */
            public Builder price(Price price) {
                this.price = price;
                return this;
            }

            /**
             * <p>The information about the promotion rules.</p>
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
