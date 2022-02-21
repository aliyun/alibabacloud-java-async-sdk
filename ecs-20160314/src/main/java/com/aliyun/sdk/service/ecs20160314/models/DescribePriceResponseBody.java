// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

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
    @NameInMap("PriceInfo")
    private PriceInfo priceInfo;

    @NameInMap("RequestId")
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

        public DescribePriceResponseBody build() {
            return new DescribePriceResponseBody(this);
        } 

    } 

    public static class Coupon extends TeaModel {
        @NameInMap("CouponNo")
        private String couponNo;

        @NameInMap("Description")
        private String description;

        @NameInMap("DiscountOff")
        private Float discountOff;

        @NameInMap("IsSelected")
        private Boolean isSelected;

        @NameInMap("Name")
        private String name;

        private Coupon(Builder builder) {
            this.couponNo = builder.couponNo;
            this.description = builder.description;
            this.discountOff = builder.discountOff;
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
         * @return discountOff
         */
        public Float getDiscountOff() {
            return this.discountOff;
        }

        /**
         * @return isSelected
         */
        public Boolean getIsSelected() {
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
            private Float discountOff; 
            private Boolean isSelected; 
            private String name; 

            /**
             * CouponNo.
             */
            public Builder couponNo(String couponNo) {
                this.couponNo = couponNo;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DiscountOff.
             */
            public Builder discountOff(Float discountOff) {
                this.discountOff = discountOff;
                return this;
            }

            /**
             * IsSelected.
             */
            public Builder isSelected(Boolean isSelected) {
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
    public static class Rule extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("RuleId")
        private Long ruleId;

        @NameInMap("Title")
        private String title;

        private Rule(Builder builder) {
            this.name = builder.name;
            this.ruleId = builder.ruleId;
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
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String name; 
            private Long ruleId; 
            private String title; 

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

            /**
             * Title.
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
    public static class SubRules extends TeaModel {
        @NameInMap("Rule")
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
        @NameInMap("DiscountPrice")
        private Float discountPrice;

        @NameInMap("OriginalPrice")
        private Float originalPrice;

        @NameInMap("Resource")
        private String resource;

        @NameInMap("SubRules")
        private SubRules subRules;

        @NameInMap("TradePrice")
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
             * Resource.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * SubRules.
             */
            public Builder subRules(SubRules subRules) {
                this.subRules = subRules;
                return this;
            }

            /**
             * TradePrice.
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
    public static class RuleIdSet extends TeaModel {
        @NameInMap("RuleId")
        private java.util.List < String > ruleId;

        private RuleIdSet(Builder builder) {
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleIdSet create() {
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

            public RuleIdSet build() {
                return new RuleIdSet(this);
            } 

        } 

    }
    public static class SubOrderRuleIdSet extends TeaModel {
        @NameInMap("RuleId")
        private java.util.List < String > ruleId;

        private SubOrderRuleIdSet(Builder builder) {
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubOrderRuleIdSet create() {
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

            public SubOrderRuleIdSet build() {
                return new SubOrderRuleIdSet(this);
            } 

        } 

    }
    public static class SubOrder extends TeaModel {
        @NameInMap("DiscountPrice")
        private Float discountPrice;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("OriginalPrice")
        private Float originalPrice;

        @NameInMap("RuleIdSet")
        private SubOrderRuleIdSet ruleIdSet;

        @NameInMap("TradePrice")
        private Float tradePrice;

        private SubOrder(Builder builder) {
            this.discountPrice = builder.discountPrice;
            this.instanceId = builder.instanceId;
            this.originalPrice = builder.originalPrice;
            this.ruleIdSet = builder.ruleIdSet;
            this.tradePrice = builder.tradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubOrder create() {
            return builder().build();
        }

        /**
         * @return discountPrice
         */
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return originalPrice
         */
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return ruleIdSet
         */
        public SubOrderRuleIdSet getRuleIdSet() {
            return this.ruleIdSet;
        }

        /**
         * @return tradePrice
         */
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public static final class Builder {
            private Float discountPrice; 
            private String instanceId; 
            private Float originalPrice; 
            private SubOrderRuleIdSet ruleIdSet; 
            private Float tradePrice; 

            /**
             * DiscountPrice.
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * RuleIdSet.
             */
            public Builder ruleIdSet(SubOrderRuleIdSet ruleIdSet) {
                this.ruleIdSet = ruleIdSet;
                return this;
            }

            /**
             * TradePrice.
             */
            public Builder tradePrice(Float tradePrice) {
                this.tradePrice = tradePrice;
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
    public static class Order extends TeaModel {
        @NameInMap("Coupons")
        private Coupons coupons;

        @NameInMap("Currency")
        private String currency;

        @NameInMap("DetailInfos")
        private DetailInfos detailInfos;

        @NameInMap("DiscountPrice")
        private Float discountPrice;

        @NameInMap("OriginalPrice")
        private Float originalPrice;

        @NameInMap("RuleIdSet")
        private RuleIdSet ruleIdSet;

        @NameInMap("SpotInstanceTypeOriginalPrice")
        private Float spotInstanceTypeOriginalPrice;

        @NameInMap("SpotInstanceTypePrice")
        private Float spotInstanceTypePrice;

        @NameInMap("SubOrders")
        private SubOrders subOrders;

        @NameInMap("TradePrice")
        private Float tradePrice;

        private Order(Builder builder) {
            this.coupons = builder.coupons;
            this.currency = builder.currency;
            this.detailInfos = builder.detailInfos;
            this.discountPrice = builder.discountPrice;
            this.originalPrice = builder.originalPrice;
            this.ruleIdSet = builder.ruleIdSet;
            this.spotInstanceTypeOriginalPrice = builder.spotInstanceTypeOriginalPrice;
            this.spotInstanceTypePrice = builder.spotInstanceTypePrice;
            this.subOrders = builder.subOrders;
            this.tradePrice = builder.tradePrice;
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
         * @return ruleIdSet
         */
        public RuleIdSet getRuleIdSet() {
            return this.ruleIdSet;
        }

        /**
         * @return spotInstanceTypeOriginalPrice
         */
        public Float getSpotInstanceTypeOriginalPrice() {
            return this.spotInstanceTypeOriginalPrice;
        }

        /**
         * @return spotInstanceTypePrice
         */
        public Float getSpotInstanceTypePrice() {
            return this.spotInstanceTypePrice;
        }

        /**
         * @return subOrders
         */
        public SubOrders getSubOrders() {
            return this.subOrders;
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
            private DetailInfos detailInfos; 
            private Float discountPrice; 
            private Float originalPrice; 
            private RuleIdSet ruleIdSet; 
            private Float spotInstanceTypeOriginalPrice; 
            private Float spotInstanceTypePrice; 
            private SubOrders subOrders; 
            private Float tradePrice; 

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
             * DetailInfos.
             */
            public Builder detailInfos(DetailInfos detailInfos) {
                this.detailInfos = detailInfos;
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
             * RuleIdSet.
             */
            public Builder ruleIdSet(RuleIdSet ruleIdSet) {
                this.ruleIdSet = ruleIdSet;
                return this;
            }

            /**
             * SpotInstanceTypeOriginalPrice.
             */
            public Builder spotInstanceTypeOriginalPrice(Float spotInstanceTypeOriginalPrice) {
                this.spotInstanceTypeOriginalPrice = spotInstanceTypeOriginalPrice;
                return this;
            }

            /**
             * SpotInstanceTypePrice.
             */
            public Builder spotInstanceTypePrice(Float spotInstanceTypePrice) {
                this.spotInstanceTypePrice = spotInstanceTypePrice;
                return this;
            }

            /**
             * SubOrders.
             */
            public Builder subOrders(SubOrders subOrders) {
                this.subOrders = subOrders;
                return this;
            }

            /**
             * TradePrice.
             */
            public Builder tradePrice(Float tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            public Order build() {
                return new Order(this);
            } 

        } 

    }
    public static class OrderParams extends TeaModel {
        @NameInMap("OrderParam")
        private java.util.List < String > orderParam;

        private OrderParams(Builder builder) {
            this.orderParam = builder.orderParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderParams create() {
            return builder().build();
        }

        /**
         * @return orderParam
         */
        public java.util.List < String > getOrderParam() {
            return this.orderParam;
        }

        public static final class Builder {
            private java.util.List < String > orderParam; 

            /**
             * OrderParam.
             */
            public Builder orderParam(java.util.List < String > orderParam) {
                this.orderParam = orderParam;
                return this;
            }

            public OrderParams build() {
                return new OrderParams(this);
            } 

        } 

    }
    public static class PriceWarning extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Msg")
        private String msg;

        private PriceWarning(Builder builder) {
            this.code = builder.code;
            this.msg = builder.msg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceWarning create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        public static final class Builder {
            private String code; 
            private String msg; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Msg.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            public PriceWarning build() {
                return new PriceWarning(this);
            } 

        } 

    }
    public static class RulesRule extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("RuleId")
        private Long ruleId;

        @NameInMap("Title")
        private String title;

        private RulesRule(Builder builder) {
            this.name = builder.name;
            this.ruleId = builder.ruleId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RulesRule create() {
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

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String name; 
            private Long ruleId; 
            private String title; 

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

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public RulesRule build() {
                return new RulesRule(this);
            } 

        } 

    }
    public static class Rules extends TeaModel {
        @NameInMap("Rule")
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
        @NameInMap("Order")
        private Order order;

        @NameInMap("OrderParams")
        private OrderParams orderParams;

        @NameInMap("PriceWarning")
        private PriceWarning priceWarning;

        @NameInMap("Rules")
        private Rules rules;

        private PriceInfo(Builder builder) {
            this.order = builder.order;
            this.orderParams = builder.orderParams;
            this.priceWarning = builder.priceWarning;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceInfo create() {
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
        public OrderParams getOrderParams() {
            return this.orderParams;
        }

        /**
         * @return priceWarning
         */
        public PriceWarning getPriceWarning() {
            return this.priceWarning;
        }

        /**
         * @return rules
         */
        public Rules getRules() {
            return this.rules;
        }

        public static final class Builder {
            private Order order; 
            private OrderParams orderParams; 
            private PriceWarning priceWarning; 
            private Rules rules; 

            /**
             * Order.
             */
            public Builder order(Order order) {
                this.order = order;
                return this;
            }

            /**
             * OrderParams.
             */
            public Builder orderParams(OrderParams orderParams) {
                this.orderParams = orderParams;
                return this;
            }

            /**
             * PriceWarning.
             */
            public Builder priceWarning(PriceWarning priceWarning) {
                this.priceWarning = priceWarning;
                return this;
            }

            /**
             * Rules.
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
