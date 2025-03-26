// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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

    @com.aliyun.core.annotation.NameInMap("Rules")
    private Rules rules;

    private DescribeRenewalPriceResponseBody(Builder builder) {
        this.priceInfo = builder.priceInfo;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
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

    /**
     * @return rules
     */
    public Rules getRules() {
        return this.rules;
    }

    public static final class Builder {
        private PriceInfo priceInfo; 
        private String requestId; 
        private Rules rules; 

        private Builder() {
        } 

        private Builder(DescribeRenewalPriceResponseBody model) {
            this.priceInfo = model.priceInfo;
            this.requestId = model.requestId;
            this.rules = model.rules;
        } 

        /**
         * <p>Details of price information.</p>
         */
        public Builder priceInfo(PriceInfo priceInfo) {
            this.priceInfo = priceInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DC9F4EF6-D038-4405-B497-1F48E722C9F2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the details of the promotion rule.</p>
         */
        public Builder rules(Rules rules) {
            this.rules = rules;
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
    public static class ActivityInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckErrMsg")
        private String checkErrMsg;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("Success")
        private String success;

        private ActivityInfo(Builder builder) {
            this.checkErrMsg = builder.checkErrMsg;
            this.errorCode = builder.errorCode;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActivityInfo create() {
            return builder().build();
        }

        /**
         * @return checkErrMsg
         */
        public String getCheckErrMsg() {
            return this.checkErrMsg;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return success
         */
        public String getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String checkErrMsg; 
            private String errorCode; 
            private String success; 

            private Builder() {
            } 

            private Builder(ActivityInfo model) {
                this.checkErrMsg = model.checkErrMsg;
                this.errorCode = model.errorCode;
                this.success = model.success;
            } 

            /**
             * <p>The returned message.</p>
             * 
             * <strong>example:</strong>
             * <p>Error description</p>
             */
            public Builder checkErrMsg(String checkErrMsg) {
                this.checkErrMsg = checkErrMsg;
                return this;
            }

            /**
             * <p>The error code that is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>Indicates whether the request was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder success(String success) {
                this.success = success;
                return this;
            }

            public ActivityInfo build() {
                return new ActivityInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRenewalPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenewalPriceResponseBody</p>
     */
    public static class Coupon extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CouponNo")
        private String couponNo;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IsSelected")
        private String isSelected;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Coupon(Builder builder) {
            this.couponNo = builder.couponNo;
            this.description = builder.description;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
            private String description; 
            private String isSelected; 
            private String name; 

            private Builder() {
            } 

            private Builder(Coupon model) {
                this.couponNo = model.couponNo;
                this.description = model.description;
                this.isSelected = model.isSelected;
                this.name = model.name;
            } 

            /**
             * <p>The coupon ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder couponNo(String couponNo) {
                this.couponNo = couponNo;
                return this;
            }

            /**
             * <p>The description of the coupon.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the coupon is selected.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isSelected(String isSelected) {
                this.isSelected = isSelected;
                return this;
            }

            /**
             * <p>The name of the coupon.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
     * {@link DescribeRenewalPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenewalPriceResponseBody</p>
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
     * {@link DescribeRenewalPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenewalPriceResponseBody</p>
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
     * {@link DescribeRenewalPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenewalPriceResponseBody</p>
     */
    public static class PriceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityInfo")
        private ActivityInfo activityInfo;

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
            this.activityInfo = builder.activityInfo;
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
         * @return activityInfo
         */
        public ActivityInfo getActivityInfo() {
            return this.activityInfo;
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
            private ActivityInfo activityInfo; 
            private Coupons coupons; 
            private String currency; 
            private Float discountPrice; 
            private Float originalPrice; 
            private RuleIds ruleIds; 
            private Float tradePrice; 

            private Builder() {
            } 

            private Builder(PriceInfo model) {
                this.activityInfo = model.activityInfo;
                this.coupons = model.coupons;
                this.currency = model.currency;
                this.discountPrice = model.discountPrice;
                this.originalPrice = model.originalPrice;
                this.ruleIds = model.ruleIds;
                this.tradePrice = model.tradePrice;
            } 

            /**
             * <p>The information about the promotion.</p>
             */
            public Builder activityInfo(ActivityInfo activityInfo) {
                this.activityInfo = activityInfo;
                return this;
            }

            /**
             * <p>An array that consists of information about the coupon.</p>
             */
            public Builder coupons(Coupons coupons) {
                this.coupons = coupons;
                return this;
            }

            /**
             * <p>The currency unit.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The discount.</p>
             * 
             * <strong>example:</strong>
             * <p>27</p>
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * <p>The original price.</p>
             * 
             * <strong>example:</strong>
             * <p>138</p>
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>An array that consists of the ID of the promotion rule.</p>
             */
            public Builder ruleIds(RuleIds ruleIds) {
                this.ruleIds = ruleIds;
                return this;
            }

            /**
             * <p>The transaction price, which is equal to the original price minus the discount.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
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
     * {@link DescribeRenewalPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenewalPriceResponseBody</p>
     */
    public static class Rule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        private Rule(Builder builder) {
            this.description = builder.description;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
            private String description; 
            private String name; 
            private Long ruleId; 

            private Builder() {
            } 

            private Builder(Rule model) {
                this.description = model.description;
                this.name = model.name;
                this.ruleId = model.ruleId;
            } 

            /**
             * <p>The description of the activity.</p>
             * 
             * <strong>example:</strong>
             * <p>Content</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the promotion rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1001199213</p>
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
