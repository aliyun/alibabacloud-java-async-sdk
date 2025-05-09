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
 * {@link DescribeRenewalPriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRenewalPriceResponseBody</p>
 */
public class DescribeRenewalPriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PriceInfo")
    private PriceInfo priceInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRenewalPriceResponseBody(Builder builder) {
        this.priceInfo = builder.priceInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRenewalPriceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeRenewalPriceResponseBody model) {
            this.priceInfo = model.priceInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Details about the prices and promotion rules.</p>
         */
        public Builder priceInfo(PriceInfo priceInfo) {
            this.priceInfo = priceInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRenewalPriceResponseBody build() {
            return new DescribeRenewalPriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRenewalPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenewalPriceResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Rule model) {
                this.description = model.description;
                this.ruleId = model.ruleId;
            } 

            /**
             * <p>The description of the pricing rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Receive a 15% discount on a 1-year subscription.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the pricing rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890</p>
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
     * {@link DescribeRenewalPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenewalPriceResponseBody</p>
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

            private Builder() {
            } 

            private Builder(SubRules model) {
                this.rule = model.rule;
            } 

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
     * {@link DescribeRenewalPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenewalPriceResponseBody</p>
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

            private Builder() {
            } 

            private Builder(DetailInfo model) {
                this.discountPrice = model.discountPrice;
                this.originalPrice = model.originalPrice;
                this.resource = model.resource;
                this.subRules = model.subRules;
                this.tradePrice = model.tradePrice;
            } 

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
             * <p>The name of the resource that corresponds to the price.</p>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
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
     * {@link DescribeRenewalPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenewalPriceResponseBody</p>
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

            private Builder() {
            } 

            private Builder(DetailInfos model) {
                this.detailInfo = model.detailInfo;
            } 

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
     * {@link DescribeRenewalPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenewalPriceResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Price model) {
                this.currency = model.currency;
                this.detailInfos = model.detailInfos;
                this.discountPrice = model.discountPrice;
                this.originalPrice = model.originalPrice;
                this.tradePrice = model.tradePrice;
            } 

            /**
             * <p>The currency unit.</p>
             * <p>Alibaba Cloud China site (aliyun.com): CNY.</p>
             * <p>Alibaba Cloud International site (alibabacloud.com): USD.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>Details about the resource prices.</p>
             */
            public Builder detailInfos(DetailInfos detailInfos) {
                this.detailInfos = detailInfos;
                return this;
            }

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
             * <p>The transaction price, which is equal to the original price minus the discount.</p>
             * 
             * <strong>example:</strong>
             * <p>3712.8</p>
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
     * {@link DescribeRenewalPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenewalPriceResponseBody</p>
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

            private Builder() {
            } 

            private Builder(RulesRule model) {
                this.description = model.description;
                this.ruleId = model.ruleId;
            } 

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
     * {@link DescribeRenewalPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenewalPriceResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Rules model) {
                this.rule = model.rule;
            } 

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
     * {@link DescribeRenewalPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenewalPriceResponseBody</p>
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

            private Builder() {
            } 

            private Builder(PriceInfo model) {
                this.price = model.price;
                this.rules = model.rules;
            } 

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
