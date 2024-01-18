// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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

    private DescribePriceResponseBody(Builder builder) {
        this.order = builder.order;
        this.orderParams = builder.orderParams;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
        this.subOrders = builder.subOrders;
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

    public static final class Builder {
        private Order order; 
        private String orderParams; 
        private String requestId; 
        private Rules rules; 
        private SubOrders subOrders; 

        /**
         * The information about the order.
         */
        public Builder order(Order order) {
            this.order = order;
            return this;
        }

        /**
         * The parameters of the order. This parameter is returned when OrderParamOut is set to `true`.
         */
        public Builder orderParams(String orderParams) {
            this.orderParams = orderParams;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Details about promotion rules.
         */
        public Builder rules(Rules rules) {
            this.rules = rules;
            return this;
        }

        /**
         * Details about rules that match the coupon.
         */
        public Builder subOrders(SubOrders subOrders) {
            this.subOrders = subOrders;
            return this;
        }

        public DescribePriceResponseBody build() {
            return new DescribePriceResponseBody(this);
        } 

    } 

    public static class Coupon extends TeaModel {
        @NameInMap("CouponNo")
        private String couponNo;

        @NameInMap("Description")
        private String description;

        @NameInMap("IsSelected")
        private String isSelected;

        @NameInMap("Name")
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
             * Indicates whether the coupon was selected.
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

        @NameInMap("HandlingFeeAmount")
        private String handlingFeeAmount;

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
            this.handlingFeeAmount = builder.handlingFeeAmount;
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
         * @return handlingFeeAmount
         */
        public String getHandlingFeeAmount() {
            return this.handlingFeeAmount;
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
            private String handlingFeeAmount; 
            private String originalAmount; 
            private RuleIds ruleIds; 
            private Boolean showDiscountInfo; 
            private String tradeAmount; 

            /**
             * Details about coupons.
             */
            public Builder coupons(Coupons coupons) {
                this.coupons = coupons;
                return this;
            }

            /**
             * The currency used for payment. A value of CNY is used when the order was generated on the China site (aliyun.com), and a value of USD is used when the order was generated on the international site (alibabacloud.com).
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
             * The service fees of the order.
             */
            public Builder handlingFeeAmount(String handlingFeeAmount) {
                this.handlingFeeAmount = handlingFeeAmount;
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
             * Details about promotion rule IDs.
             */
            public Builder ruleIds(RuleIds ruleIds) {
                this.ruleIds = ruleIds;
                return this;
            }

            /**
             * Indicates whether the discount information is displayed.
             */
            public Builder showDiscountInfo(Boolean showDiscountInfo) {
                this.showDiscountInfo = showDiscountInfo;
                return this;
            }

            /**
             * The transaction price of the order.
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
             * The name of the promotion rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the rule.
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
             * The instance ID.
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
             * The rule IDs.
             */
            public Builder ruleIds(SubOrderRuleIds ruleIds) {
                this.ruleIds = ruleIds;
                return this;
            }

            /**
             * The final price of the order.
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
