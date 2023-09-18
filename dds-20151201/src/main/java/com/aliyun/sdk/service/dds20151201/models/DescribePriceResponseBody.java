// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
    @NameInMap("Order")
    private Order order;

    @NameInMap("OrderParams")
    private String orderParams;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rules")
    private Rules rules;

    @NameInMap("SubOrders")
    private SubOrders subOrders;

    @NameInMap("TraceId")
    private String traceId;

    private DescribePriceResponseBody(Builder builder) {
        this.order = builder.order;
        this.orderParams = builder.orderParams;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
        this.subOrders = builder.subOrders;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePriceResponseBody create() {
        return builder().build();
    }

    /**
     * @return order
     */
    public Order getOrder() {
        return this.order;
    }

    /**
     * @return orderParams
     */
    public String getOrderParams() {
        return this.orderParams;
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
     * @return subOrders
     */
    public SubOrders getSubOrders() {
        return this.subOrders;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private Order order; 
        private String orderParams; 
        private String requestId; 
        private Rules rules; 
        private SubOrders subOrders; 
        private String traceId; 

        /**
         * The order.
         */
        public Builder order(Order order) {
            this.order = order;
            return this;
        }

        /**
         * The order parameters.
         * <p>
         * 
         * > This parameter is returned only when the **OrderParamOut** parameter is set to **true**.
         */
        public Builder orderParams(String orderParams) {
            this.orderParams = orderParams;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The promotion rules.
         */
        public Builder rules(Rules rules) {
            this.rules = rules;
            return this;
        }

        /**
         * The coupon rules.
         */
        public Builder subOrders(SubOrders subOrders) {
            this.subOrders = subOrders;
            return this;
        }

        /**
         * The ID of the trace.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribePriceResponseBody build() {
            return new DescribePriceResponseBody(this);
        } 

    } 

    public static class PromotionRuleIdList extends TeaModel {
        @NameInMap("PromotionRuleId")
        private java.util.List < Long > promotionRuleId;

        private PromotionRuleIdList(Builder builder) {
            this.promotionRuleId = builder.promotionRuleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromotionRuleIdList create() {
            return builder().build();
        }

        /**
         * @return promotionRuleId
         */
        public java.util.List < Long > getPromotionRuleId() {
            return this.promotionRuleId;
        }

        public static final class Builder {
            private java.util.List < Long > promotionRuleId; 

            /**
             * PromotionRuleId.
             */
            public Builder promotionRuleId(java.util.List < Long > promotionRuleId) {
                this.promotionRuleId = promotionRuleId;
                return this;
            }

            public PromotionRuleIdList build() {
                return new PromotionRuleIdList(this);
            } 

        } 

    }
    public static class Coupon extends TeaModel {
        @NameInMap("ActivityCategory")
        private String activityCategory;

        @NameInMap("CouponNo")
        private String couponNo;

        @NameInMap("Description")
        private String description;

        @NameInMap("IsSelected")
        private String isSelected;

        @NameInMap("Name")
        private String name;

        @NameInMap("OptionCode")
        private String optionCode;

        @NameInMap("PromotionOptionCode")
        private String promotionOptionCode;

        @NameInMap("PromotionRuleIdList")
        private PromotionRuleIdList promotionRuleIdList;

        private Coupon(Builder builder) {
            this.activityCategory = builder.activityCategory;
            this.couponNo = builder.couponNo;
            this.description = builder.description;
            this.isSelected = builder.isSelected;
            this.name = builder.name;
            this.optionCode = builder.optionCode;
            this.promotionOptionCode = builder.promotionOptionCode;
            this.promotionRuleIdList = builder.promotionRuleIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Coupon create() {
            return builder().build();
        }

        /**
         * @return activityCategory
         */
        public String getActivityCategory() {
            return this.activityCategory;
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

        /**
         * @return optionCode
         */
        public String getOptionCode() {
            return this.optionCode;
        }

        /**
         * @return promotionOptionCode
         */
        public String getPromotionOptionCode() {
            return this.promotionOptionCode;
        }

        /**
         * @return promotionRuleIdList
         */
        public PromotionRuleIdList getPromotionRuleIdList() {
            return this.promotionRuleIdList;
        }

        public static final class Builder {
            private String activityCategory; 
            private String couponNo; 
            private String description; 
            private String isSelected; 
            private String name; 
            private String optionCode; 
            private String promotionOptionCode; 
            private PromotionRuleIdList promotionRuleIdList; 

            /**
             * The billing method to which the coupon was applied. Valid values: **payondemand**: subscription. **payasyougo**: pay-as-you-go.
             */
            public Builder activityCategory(String activityCategory) {
                this.activityCategory = activityCategory;
                return this;
            }

            /**
             * The coupon ID.
             */
            public Builder couponNo(String couponNo) {
                this.couponNo = couponNo;
                return this;
            }

            /**
             * The description of the coupon.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Indicates whether the coupon was selected. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder isSelected(String isSelected) {
                this.isSelected = isSelected;
                return this;
            }

            /**
             * The coupon name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The code of the coupon.
             */
            public Builder optionCode(String optionCode) {
                this.optionCode = optionCode;
                return this;
            }

            /**
             * The promotional option code.
             */
            public Builder promotionOptionCode(String promotionOptionCode) {
                this.promotionOptionCode = promotionOptionCode;
                return this;
            }

            /**
             * The rules that match the coupon.
             */
            public Builder promotionRuleIdList(PromotionRuleIdList promotionRuleIdList) {
                this.promotionRuleIdList = promotionRuleIdList;
                return this;
            }

            public Coupon build() {
                return new Coupon(this);
            } 

        } 

    }
    public static class Coupons extends TeaModel {
        @NameInMap("Coupon")
        private java.util.List < Coupon> coupon;

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
        public java.util.List < Coupon> getCoupon() {
            return this.coupon;
        }

        public static final class Builder {
            private java.util.List < Coupon> coupon; 

            /**
             * Coupon.
             */
            public Builder coupon(java.util.List < Coupon> coupon) {
                this.coupon = coupon;
                return this;
            }

            public Coupons build() {
                return new Coupons(this);
            } 

        } 

    }
    public static class RuleIds extends TeaModel {
        @NameInMap("RuleId")
        private java.util.List < String > ruleId;

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
        public java.util.List < String > getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private java.util.List < String > ruleId; 

            /**
             * RuleId.
             */
            public Builder ruleId(java.util.List < String > ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public RuleIds build() {
                return new RuleIds(this);
            } 

        } 

    }
    public static class Order extends TeaModel {
        @NameInMap("Coupons")
        private Coupons coupons;

        @NameInMap("Currency")
        private String currency;

        @NameInMap("DiscountAmount")
        private String discountAmount;

        @NameInMap("OriginalAmount")
        private String originalAmount;

        @NameInMap("RuleIds")
        private RuleIds ruleIds;

        @NameInMap("ShowDiscountInfo")
        private Boolean showDiscountInfo;

        @NameInMap("TradeAmount")
        private String tradeAmount;

        private Order(Builder builder) {
            this.coupons = builder.coupons;
            this.currency = builder.currency;
            this.discountAmount = builder.discountAmount;
            this.originalAmount = builder.originalAmount;
            this.ruleIds = builder.ruleIds;
            this.showDiscountInfo = builder.showDiscountInfo;
            this.tradeAmount = builder.tradeAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Order create() {
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
         * @return discountAmount
         */
        public String getDiscountAmount() {
            return this.discountAmount;
        }

        /**
         * @return originalAmount
         */
        public String getOriginalAmount() {
            return this.originalAmount;
        }

        /**
         * @return ruleIds
         */
        public RuleIds getRuleIds() {
            return this.ruleIds;
        }

        /**
         * @return showDiscountInfo
         */
        public Boolean getShowDiscountInfo() {
            return this.showDiscountInfo;
        }

        /**
         * @return tradeAmount
         */
        public String getTradeAmount() {
            return this.tradeAmount;
        }

        public static final class Builder {
            private Coupons coupons; 
            private String currency; 
            private String discountAmount; 
            private String originalAmount; 
            private RuleIds ruleIds; 
            private Boolean showDiscountInfo; 
            private String tradeAmount; 

            /**
             * The coupons.
             */
            public Builder coupons(Coupons coupons) {
                this.coupons = coupons;
                return this;
            }

            /**
             * The currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * The discount amount of the order.
             */
            public Builder discountAmount(String discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * The original price of the order.
             */
            public Builder originalAmount(String originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            /**
             * The rules of the order.
             */
            public Builder ruleIds(RuleIds ruleIds) {
                this.ruleIds = ruleIds;
                return this;
            }

            /**
             * ShowDiscountInfo.
             */
            public Builder showDiscountInfo(Boolean showDiscountInfo) {
                this.showDiscountInfo = showDiscountInfo;
                return this;
            }

            /**
             * The final price of the order.
             */
            public Builder tradeAmount(String tradeAmount) {
                this.tradeAmount = tradeAmount;
                return this;
            }

            public Order build() {
                return new Order(this);
            } 

        } 

    }
    public static class Rule extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("RuleDescId")
        private Long ruleDescId;

        @NameInMap("Title")
        private String title;

        private Rule(Builder builder) {
            this.name = builder.name;
            this.ruleDescId = builder.ruleDescId;
            this.title = builder.title;
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
         * @return ruleDescId
         */
        public Long getRuleDescId() {
            return this.ruleDescId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String name; 
            private Long ruleDescId; 
            private String title; 

            /**
             * The name of the rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the policy.
             */
            public Builder ruleDescId(Long ruleDescId) {
                this.ruleDescId = ruleDescId;
                return this;
            }

            /**
             * The title of the rule.
             */
            public Builder title(String title) {
                this.title = title;
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
    public static class SubOrderRuleIds extends TeaModel {
        @NameInMap("RuleId")
        private java.util.List < String > ruleId;

        private SubOrderRuleIds(Builder builder) {
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubOrderRuleIds create() {
            return builder().build();
        }

        /**
         * @return ruleId
         */
        public java.util.List < String > getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private java.util.List < String > ruleId; 

            /**
             * RuleId.
             */
            public Builder ruleId(java.util.List < String > ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public SubOrderRuleIds build() {
                return new SubOrderRuleIds(this);
            } 

        } 

    }
    public static class SubOrder extends TeaModel {
        @NameInMap("DiscountAmount")
        private String discountAmount;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("OriginalAmount")
        private String originalAmount;

        @NameInMap("RuleIds")
        private SubOrderRuleIds ruleIds;

        @NameInMap("TradeAmount")
        private String tradeAmount;

        private SubOrder(Builder builder) {
            this.discountAmount = builder.discountAmount;
            this.instanceId = builder.instanceId;
            this.originalAmount = builder.originalAmount;
            this.ruleIds = builder.ruleIds;
            this.tradeAmount = builder.tradeAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubOrder create() {
            return builder().build();
        }

        /**
         * @return discountAmount
         */
        public String getDiscountAmount() {
            return this.discountAmount;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return originalAmount
         */
        public String getOriginalAmount() {
            return this.originalAmount;
        }

        /**
         * @return ruleIds
         */
        public SubOrderRuleIds getRuleIds() {
            return this.ruleIds;
        }

        /**
         * @return tradeAmount
         */
        public String getTradeAmount() {
            return this.tradeAmount;
        }

        public static final class Builder {
            private String discountAmount; 
            private String instanceId; 
            private String originalAmount; 
            private SubOrderRuleIds ruleIds; 
            private String tradeAmount; 

            /**
             * The discount amount of the order.
             */
            public Builder discountAmount(String discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The original price of the order.
             */
            public Builder originalAmount(String originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            /**
             * The promotion rules.
             */
            public Builder ruleIds(SubOrderRuleIds ruleIds) {
                this.ruleIds = ruleIds;
                return this;
            }

            /**
             * The actual price of the order.
             */
            public Builder tradeAmount(String tradeAmount) {
                this.tradeAmount = tradeAmount;
                return this;
            }

            public SubOrder build() {
                return new SubOrder(this);
            } 

        } 

    }
    public static class SubOrders extends TeaModel {
        @NameInMap("SubOrder")
        private java.util.List < SubOrder> subOrder;

        private SubOrders(Builder builder) {
            this.subOrder = builder.subOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubOrders create() {
            return builder().build();
        }

        /**
         * @return subOrder
         */
        public java.util.List < SubOrder> getSubOrder() {
            return this.subOrder;
        }

        public static final class Builder {
            private java.util.List < SubOrder> subOrder; 

            /**
             * SubOrder.
             */
            public Builder subOrder(java.util.List < SubOrder> subOrder) {
                this.subOrder = subOrder;
                return this;
            }

            public SubOrders build() {
                return new SubOrders(this);
            } 

        } 

    }
}
