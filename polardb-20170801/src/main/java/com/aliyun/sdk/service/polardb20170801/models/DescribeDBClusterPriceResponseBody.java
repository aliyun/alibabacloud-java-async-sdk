// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeDBClusterPriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterPriceResponseBody</p>
 */
public class DescribeDBClusterPriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.NameInMap("PriceInfo")
    private PriceInfo priceInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private Rules rules;

    @com.aliyun.core.annotation.NameInMap("ShowDiscount")
    private Boolean showDiscount;

    private DescribeDBClusterPriceResponseBody(Builder builder) {
        this.orderType = builder.orderType;
        this.priceInfo = builder.priceInfo;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
        this.showDiscount = builder.showDiscount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterPriceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
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

    /**
     * @return rules
     */
    public Rules getRules() {
        return this.rules;
    }

    /**
     * @return showDiscount
     */
    public Boolean getShowDiscount() {
        return this.showDiscount;
    }

    public static final class Builder {
        private String orderType; 
        private PriceInfo priceInfo; 
        private String requestId; 
        private Rules rules; 
        private Boolean showDiscount; 

        private Builder() {
        } 

        private Builder(DescribeDBClusterPriceResponseBody model) {
            this.orderType = model.orderType;
            this.priceInfo = model.priceInfo;
            this.requestId = model.requestId;
            this.rules = model.rules;
            this.showDiscount = model.showDiscount;
        } 

        /**
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.orderType = orderType;
            return this;
        }

        /**
         * PriceInfo.
         */
        public Builder priceInfo(PriceInfo priceInfo) {
            this.priceInfo = priceInfo;
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
         * Rules.
         */
        public Builder rules(Rules rules) {
            this.rules = rules;
            return this;
        }

        /**
         * ShowDiscount.
         */
        public Builder showDiscount(Boolean showDiscount) {
            this.showDiscount = showDiscount;
            return this;
        }

        public DescribeDBClusterPriceResponseBody build() {
            return new DescribeDBClusterPriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterPriceResponseBody</p>
     */
    public static class Coupon extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CouponNo")
        private String couponNo;

        @com.aliyun.core.annotation.NameInMap("IsSelected")
        private String isSelected;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Coupon(Builder builder) {
            this.couponNo = builder.couponNo;
            this.isSelected = builder.isSelected;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Coupon create() {
            return builder().build();
        }

        /**
         * @return couponNo
         */
        public String getCouponNo() {
            return this.couponNo;
        }

        /**
         * @return isSelected
         */
        public String getIsSelected() {
            return this.isSelected;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String couponNo; 
            private String isSelected; 
            private String name; 

            private Builder() {
            } 

            private Builder(Coupon model) {
                this.couponNo = model.couponNo;
                this.isSelected = model.isSelected;
                this.name = model.name;
            } 

            /**
             * CouponNo.
             */
            public Builder couponNo(String couponNo) {
                this.couponNo = couponNo;
                return this;
            }

            /**
             * IsSelected.
             */
            public Builder isSelected(String isSelected) {
                this.isSelected = isSelected;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Coupon build() {
                return new Coupon(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterPriceResponseBody</p>
     */
    public static class Coupons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Coupon")
        private java.util.List<Coupon> coupon;

        private Coupons(Builder builder) {
            this.coupon = builder.coupon;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Coupons create() {
            return builder().build();
        }

        /**
         * @return coupon
         */
        public java.util.List<Coupon> getCoupon() {
            return this.coupon;
        }

        public static final class Builder {
            private java.util.List<Coupon> coupon; 

            private Builder() {
            } 

            private Builder(Coupons model) {
                this.coupon = model.coupon;
            } 

            /**
             * Coupon.
             */
            public Builder coupon(java.util.List<Coupon> coupon) {
                this.coupon = coupon;
                return this;
            }

            public Coupons build() {
                return new Coupons(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterPriceResponseBody</p>
     */
    public static class RuleIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleId")
        private java.util.List<String> ruleId;

        private RuleIds(Builder builder) {
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleIds create() {
            return builder().build();
        }

        /**
         * @return ruleId
         */
        public java.util.List<String> getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private java.util.List<String> ruleId; 

            private Builder() {
            } 

            private Builder(RuleIds model) {
                this.ruleId = model.ruleId;
            } 

            /**
             * RuleId.
             */
            public Builder ruleId(java.util.List<String> ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public RuleIds build() {
                return new RuleIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterPriceResponseBody</p>
     */
    public static class PriceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Coupons")
        private Coupons coupons;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Float discountPrice;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Float originalPrice;

        @com.aliyun.core.annotation.NameInMap("RuleIds")
        private RuleIds ruleIds;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
        private Float tradePrice;

        private PriceInfo(Builder builder) {
            this.coupons = builder.coupons;
            this.currency = builder.currency;
            this.discountPrice = builder.discountPrice;
            this.originalPrice = builder.originalPrice;
            this.ruleIds = builder.ruleIds;
            this.tradePrice = builder.tradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceInfo create() {
            return builder().build();
        }

        /**
         * @return coupons
         */
        public Coupons getCoupons() {
            return this.coupons;
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
         * @return originalPrice
         */
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return ruleIds
         */
        public RuleIds getRuleIds() {
            return this.ruleIds;
        }

        /**
         * @return tradePrice
         */
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public static final class Builder {
            private Coupons coupons; 
            private String currency; 
            private Float discountPrice; 
            private Float originalPrice; 
            private RuleIds ruleIds; 
            private Float tradePrice; 

            private Builder() {
            } 

            private Builder(PriceInfo model) {
                this.coupons = model.coupons;
                this.currency = model.currency;
                this.discountPrice = model.discountPrice;
                this.originalPrice = model.originalPrice;
                this.ruleIds = model.ruleIds;
                this.tradePrice = model.tradePrice;
            } 

            /**
             * Coupons.
             */
            public Builder coupons(Coupons coupons) {
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
             * DiscountPrice.
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
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
             * RuleIds.
             */
            public Builder ruleIds(RuleIds ruleIds) {
                this.ruleIds = ruleIds;
                return this;
            }

            /**
             * TradePrice.
             */
            public Builder tradePrice(Float tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            public PriceInfo build() {
                return new PriceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterPriceResponseBody</p>
     */
    public static class Rule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        private Rule(Builder builder) {
            this.name = builder.name;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rule create() {
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
        public Long getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private String name; 
            private Long ruleId; 

            private Builder() {
            } 

            private Builder(Rule model) {
                this.name = model.name;
                this.ruleId = model.ruleId;
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
     * {@link DescribeDBClusterPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterPriceResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rule")
        private java.util.List<Rule> rule;

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
        public java.util.List<Rule> getRule() {
            return this.rule;
        }

        public static final class Builder {
            private java.util.List<Rule> rule; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.rule = model.rule;
            } 

            /**
             * Rule.
             */
            public Builder rule(java.util.List<Rule> rule) {
                this.rule = rule;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
