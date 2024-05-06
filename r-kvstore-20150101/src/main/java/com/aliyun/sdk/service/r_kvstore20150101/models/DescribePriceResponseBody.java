// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePriceResponseBody</p>
 */
public class DescribePriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Order")
    private Order order;

    @com.aliyun.core.annotation.NameInMap("OrderParams")
    private String orderParams;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private Rules rules;

    @com.aliyun.core.annotation.NameInMap("SubOrders")
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
        @com.aliyun.core.annotation.NameInMap("Coupon")
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
    public static class OptionIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OptionId")
        private java.util.List < Long > optionId;

        private OptionIds(Builder builder) {
            this.optionId = builder.optionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OptionIds create() {
            return builder().build();
        }

        /**
         * @return optionId
         */
        public java.util.List < Long > getOptionId() {
            return this.optionId;
        }

        public static final class Builder {
            private java.util.List < Long > optionId; 

            /**
             * OptionId.
             */
            public Builder optionId(java.util.List < Long > optionId) {
                this.optionId = optionId;
                return this;
            }

            public OptionIds build() {
                return new OptionIds(this);
            } 

        } 

    }
    public static class ContractActivity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityId")
        private Long activityId;

        @com.aliyun.core.annotation.NameInMap("ActivityName")
        private String activityName;

        @com.aliyun.core.annotation.NameInMap("FinalFee")
        private Double finalFee;

        @com.aliyun.core.annotation.NameInMap("FinalPromFee")
        private Double finalPromFee;

        @com.aliyun.core.annotation.NameInMap("OptionCode")
        private String optionCode;

        @com.aliyun.core.annotation.NameInMap("OptionIds")
        private OptionIds optionIds;

        @com.aliyun.core.annotation.NameInMap("ProdFee")
        private Double prodFee;

        private ContractActivity(Builder builder) {
            this.activityId = builder.activityId;
            this.activityName = builder.activityName;
            this.finalFee = builder.finalFee;
            this.finalPromFee = builder.finalPromFee;
            this.optionCode = builder.optionCode;
            this.optionIds = builder.optionIds;
            this.prodFee = builder.prodFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContractActivity create() {
            return builder().build();
        }

        /**
         * @return activityId
         */
        public Long getActivityId() {
            return this.activityId;
        }

        /**
         * @return activityName
         */
        public String getActivityName() {
            return this.activityName;
        }

        /**
         * @return finalFee
         */
        public Double getFinalFee() {
            return this.finalFee;
        }

        /**
         * @return finalPromFee
         */
        public Double getFinalPromFee() {
            return this.finalPromFee;
        }

        /**
         * @return optionCode
         */
        public String getOptionCode() {
            return this.optionCode;
        }

        /**
         * @return optionIds
         */
        public OptionIds getOptionIds() {
            return this.optionIds;
        }

        /**
         * @return prodFee
         */
        public Double getProdFee() {
            return this.prodFee;
        }

        public static final class Builder {
            private Long activityId; 
            private String activityName; 
            private Double finalFee; 
            private Double finalPromFee; 
            private String optionCode; 
            private OptionIds optionIds; 
            private Double prodFee; 

            /**
             * ActivityId.
             */
            public Builder activityId(Long activityId) {
                this.activityId = activityId;
                return this;
            }

            /**
             * ActivityName.
             */
            public Builder activityName(String activityName) {
                this.activityName = activityName;
                return this;
            }

            /**
             * FinalFee.
             */
            public Builder finalFee(Double finalFee) {
                this.finalFee = finalFee;
                return this;
            }

            /**
             * FinalPromFee.
             */
            public Builder finalPromFee(Double finalPromFee) {
                this.finalPromFee = finalPromFee;
                return this;
            }

            /**
             * OptionCode.
             */
            public Builder optionCode(String optionCode) {
                this.optionCode = optionCode;
                return this;
            }

            /**
             * OptionIds.
             */
            public Builder optionIds(OptionIds optionIds) {
                this.optionIds = optionIds;
                return this;
            }

            /**
             * ProdFee.
             */
            public Builder prodFee(Double prodFee) {
                this.prodFee = prodFee;
                return this;
            }

            public ContractActivity build() {
                return new ContractActivity(this);
            } 

        } 

    }
    public static class DepreciateInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheapRate")
        private Long cheapRate;

        @com.aliyun.core.annotation.NameInMap("CheapStandAmount")
        private Long cheapStandAmount;

        @com.aliyun.core.annotation.NameInMap("ContractActivity")
        private ContractActivity contractActivity;

        @com.aliyun.core.annotation.NameInMap("Differential")
        private Long differential;

        @com.aliyun.core.annotation.NameInMap("DifferentialName")
        private String differentialName;

        @com.aliyun.core.annotation.NameInMap("IsContractActivity")
        private Boolean isContractActivity;

        @com.aliyun.core.annotation.NameInMap("IsShow")
        private Boolean isShow;

        @com.aliyun.core.annotation.NameInMap("ListPrice")
        private Long listPrice;

        @com.aliyun.core.annotation.NameInMap("MonthPrice")
        private Long monthPrice;

        @com.aliyun.core.annotation.NameInMap("OriginalStandAmount")
        private Long originalStandAmount;

        private DepreciateInfo(Builder builder) {
            this.cheapRate = builder.cheapRate;
            this.cheapStandAmount = builder.cheapStandAmount;
            this.contractActivity = builder.contractActivity;
            this.differential = builder.differential;
            this.differentialName = builder.differentialName;
            this.isContractActivity = builder.isContractActivity;
            this.isShow = builder.isShow;
            this.listPrice = builder.listPrice;
            this.monthPrice = builder.monthPrice;
            this.originalStandAmount = builder.originalStandAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DepreciateInfo create() {
            return builder().build();
        }

        /**
         * @return cheapRate
         */
        public Long getCheapRate() {
            return this.cheapRate;
        }

        /**
         * @return cheapStandAmount
         */
        public Long getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        /**
         * @return contractActivity
         */
        public ContractActivity getContractActivity() {
            return this.contractActivity;
        }

        /**
         * @return differential
         */
        public Long getDifferential() {
            return this.differential;
        }

        /**
         * @return differentialName
         */
        public String getDifferentialName() {
            return this.differentialName;
        }

        /**
         * @return isContractActivity
         */
        public Boolean getIsContractActivity() {
            return this.isContractActivity;
        }

        /**
         * @return isShow
         */
        public Boolean getIsShow() {
            return this.isShow;
        }

        /**
         * @return listPrice
         */
        public Long getListPrice() {
            return this.listPrice;
        }

        /**
         * @return monthPrice
         */
        public Long getMonthPrice() {
            return this.monthPrice;
        }

        /**
         * @return originalStandAmount
         */
        public Long getOriginalStandAmount() {
            return this.originalStandAmount;
        }

        public static final class Builder {
            private Long cheapRate; 
            private Long cheapStandAmount; 
            private ContractActivity contractActivity; 
            private Long differential; 
            private String differentialName; 
            private Boolean isContractActivity; 
            private Boolean isShow; 
            private Long listPrice; 
            private Long monthPrice; 
            private Long originalStandAmount; 

            /**
             * CheapRate.
             */
            public Builder cheapRate(Long cheapRate) {
                this.cheapRate = cheapRate;
                return this;
            }

            /**
             * CheapStandAmount.
             */
            public Builder cheapStandAmount(Long cheapStandAmount) {
                this.cheapStandAmount = cheapStandAmount;
                return this;
            }

            /**
             * ContractActivity.
             */
            public Builder contractActivity(ContractActivity contractActivity) {
                this.contractActivity = contractActivity;
                return this;
            }

            /**
             * Differential.
             */
            public Builder differential(Long differential) {
                this.differential = differential;
                return this;
            }

            /**
             * DifferentialName.
             */
            public Builder differentialName(String differentialName) {
                this.differentialName = differentialName;
                return this;
            }

            /**
             * IsContractActivity.
             */
            public Builder isContractActivity(Boolean isContractActivity) {
                this.isContractActivity = isContractActivity;
                return this;
            }

            /**
             * IsShow.
             */
            public Builder isShow(Boolean isShow) {
                this.isShow = isShow;
                return this;
            }

            /**
             * ListPrice.
             */
            public Builder listPrice(Long listPrice) {
                this.listPrice = listPrice;
                return this;
            }

            /**
             * MonthPrice.
             */
            public Builder monthPrice(Long monthPrice) {
                this.monthPrice = monthPrice;
                return this;
            }

            /**
             * OriginalStandAmount.
             */
            public Builder originalStandAmount(Long originalStandAmount) {
                this.originalStandAmount = originalStandAmount;
                return this;
            }

            public DepreciateInfo build() {
                return new DepreciateInfo(this);
            } 

        } 

    }
    public static class RuleIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleId")
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
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Coupons")
        private Coupons coupons;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DepreciateInfo")
        private DepreciateInfo depreciateInfo;

        @com.aliyun.core.annotation.NameInMap("DiscountAmount")
        private String discountAmount;

        @com.aliyun.core.annotation.NameInMap("HandlingFeeAmount")
        private String handlingFeeAmount;

        @com.aliyun.core.annotation.NameInMap("IsContractActivity")
        private Boolean isContractActivity;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("OriginalAmount")
        private String originalAmount;

        @com.aliyun.core.annotation.NameInMap("RuleIds")
        private RuleIds ruleIds;

        @com.aliyun.core.annotation.NameInMap("ShowDiscountInfo")
        private Boolean showDiscountInfo;

        @com.aliyun.core.annotation.NameInMap("StandDiscountPrice")
        private Long standDiscountPrice;

        @com.aliyun.core.annotation.NameInMap("StandPrice")
        private Long standPrice;

        @com.aliyun.core.annotation.NameInMap("TradeAmount")
        private String tradeAmount;

        private Order(Builder builder) {
            this.code = builder.code;
            this.coupons = builder.coupons;
            this.currency = builder.currency;
            this.depreciateInfo = builder.depreciateInfo;
            this.discountAmount = builder.discountAmount;
            this.handlingFeeAmount = builder.handlingFeeAmount;
            this.isContractActivity = builder.isContractActivity;
            this.message = builder.message;
            this.originalAmount = builder.originalAmount;
            this.ruleIds = builder.ruleIds;
            this.showDiscountInfo = builder.showDiscountInfo;
            this.standDiscountPrice = builder.standDiscountPrice;
            this.standPrice = builder.standPrice;
            this.tradeAmount = builder.tradeAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Order create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
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
         * @return depreciateInfo
         */
        public DepreciateInfo getDepreciateInfo() {
            return this.depreciateInfo;
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
         * @return isContractActivity
         */
        public Boolean getIsContractActivity() {
            return this.isContractActivity;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
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
         * @return standDiscountPrice
         */
        public Long getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        /**
         * @return standPrice
         */
        public Long getStandPrice() {
            return this.standPrice;
        }

        /**
         * @return tradeAmount
         */
        public String getTradeAmount() {
            return this.tradeAmount;
        }

        public static final class Builder {
            private String code; 
            private Coupons coupons; 
            private String currency; 
            private DepreciateInfo depreciateInfo; 
            private String discountAmount; 
            private String handlingFeeAmount; 
            private Boolean isContractActivity; 
            private String message; 
            private String originalAmount; 
            private RuleIds ruleIds; 
            private Boolean showDiscountInfo; 
            private Long standDiscountPrice; 
            private Long standPrice; 
            private String tradeAmount; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

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
             * DepreciateInfo.
             */
            public Builder depreciateInfo(DepreciateInfo depreciateInfo) {
                this.depreciateInfo = depreciateInfo;
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
             * IsContractActivity.
             */
            public Builder isContractActivity(Boolean isContractActivity) {
                this.isContractActivity = isContractActivity;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
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
             * StandDiscountPrice.
             */
            public Builder standDiscountPrice(Long standDiscountPrice) {
                this.standDiscountPrice = standDiscountPrice;
                return this;
            }

            /**
             * StandPrice.
             */
            public Builder standPrice(Long standPrice) {
                this.standPrice = standPrice;
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
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RuleDescId")
        private Long ruleDescId;

        @com.aliyun.core.annotation.NameInMap("Title")
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
    public static class ContractActivityOptionIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OptionId")
        private java.util.List < Long > optionId;

        private ContractActivityOptionIds(Builder builder) {
            this.optionId = builder.optionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContractActivityOptionIds create() {
            return builder().build();
        }

        /**
         * @return optionId
         */
        public java.util.List < Long > getOptionId() {
            return this.optionId;
        }

        public static final class Builder {
            private java.util.List < Long > optionId; 

            /**
             * OptionId.
             */
            public Builder optionId(java.util.List < Long > optionId) {
                this.optionId = optionId;
                return this;
            }

            public ContractActivityOptionIds build() {
                return new ContractActivityOptionIds(this);
            } 

        } 

    }
    public static class DepreciateInfoContractActivity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityId")
        private Long activityId;

        @com.aliyun.core.annotation.NameInMap("ActivityName")
        private String activityName;

        @com.aliyun.core.annotation.NameInMap("FinalFee")
        private Double finalFee;

        @com.aliyun.core.annotation.NameInMap("FinalPromFee")
        private Double finalPromFee;

        @com.aliyun.core.annotation.NameInMap("OptionCode")
        private String optionCode;

        @com.aliyun.core.annotation.NameInMap("OptionIds")
        private ContractActivityOptionIds optionIds;

        @com.aliyun.core.annotation.NameInMap("ProdFee")
        private Double prodFee;

        private DepreciateInfoContractActivity(Builder builder) {
            this.activityId = builder.activityId;
            this.activityName = builder.activityName;
            this.finalFee = builder.finalFee;
            this.finalPromFee = builder.finalPromFee;
            this.optionCode = builder.optionCode;
            this.optionIds = builder.optionIds;
            this.prodFee = builder.prodFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DepreciateInfoContractActivity create() {
            return builder().build();
        }

        /**
         * @return activityId
         */
        public Long getActivityId() {
            return this.activityId;
        }

        /**
         * @return activityName
         */
        public String getActivityName() {
            return this.activityName;
        }

        /**
         * @return finalFee
         */
        public Double getFinalFee() {
            return this.finalFee;
        }

        /**
         * @return finalPromFee
         */
        public Double getFinalPromFee() {
            return this.finalPromFee;
        }

        /**
         * @return optionCode
         */
        public String getOptionCode() {
            return this.optionCode;
        }

        /**
         * @return optionIds
         */
        public ContractActivityOptionIds getOptionIds() {
            return this.optionIds;
        }

        /**
         * @return prodFee
         */
        public Double getProdFee() {
            return this.prodFee;
        }

        public static final class Builder {
            private Long activityId; 
            private String activityName; 
            private Double finalFee; 
            private Double finalPromFee; 
            private String optionCode; 
            private ContractActivityOptionIds optionIds; 
            private Double prodFee; 

            /**
             * ActivityId.
             */
            public Builder activityId(Long activityId) {
                this.activityId = activityId;
                return this;
            }

            /**
             * ActivityName.
             */
            public Builder activityName(String activityName) {
                this.activityName = activityName;
                return this;
            }

            /**
             * FinalFee.
             */
            public Builder finalFee(Double finalFee) {
                this.finalFee = finalFee;
                return this;
            }

            /**
             * FinalPromFee.
             */
            public Builder finalPromFee(Double finalPromFee) {
                this.finalPromFee = finalPromFee;
                return this;
            }

            /**
             * OptionCode.
             */
            public Builder optionCode(String optionCode) {
                this.optionCode = optionCode;
                return this;
            }

            /**
             * OptionIds.
             */
            public Builder optionIds(ContractActivityOptionIds optionIds) {
                this.optionIds = optionIds;
                return this;
            }

            /**
             * ProdFee.
             */
            public Builder prodFee(Double prodFee) {
                this.prodFee = prodFee;
                return this;
            }

            public DepreciateInfoContractActivity build() {
                return new DepreciateInfoContractActivity(this);
            } 

        } 

    }
    public static class SubOrderDepreciateInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheapRate")
        private Long cheapRate;

        @com.aliyun.core.annotation.NameInMap("CheapStandAmount")
        private Long cheapStandAmount;

        @com.aliyun.core.annotation.NameInMap("ContractActivity")
        private DepreciateInfoContractActivity contractActivity;

        @com.aliyun.core.annotation.NameInMap("Differential")
        private Long differential;

        @com.aliyun.core.annotation.NameInMap("DifferentialName")
        private String differentialName;

        @com.aliyun.core.annotation.NameInMap("IsContractActivity")
        private Boolean isContractActivity;

        @com.aliyun.core.annotation.NameInMap("ListPrice")
        private Long listPrice;

        @com.aliyun.core.annotation.NameInMap("MonthPrice")
        private Long monthPrice;

        @com.aliyun.core.annotation.NameInMap("OriginalStandAmount")
        private Long originalStandAmount;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private SubOrderDepreciateInfo(Builder builder) {
            this.cheapRate = builder.cheapRate;
            this.cheapStandAmount = builder.cheapStandAmount;
            this.contractActivity = builder.contractActivity;
            this.differential = builder.differential;
            this.differentialName = builder.differentialName;
            this.isContractActivity = builder.isContractActivity;
            this.listPrice = builder.listPrice;
            this.monthPrice = builder.monthPrice;
            this.originalStandAmount = builder.originalStandAmount;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubOrderDepreciateInfo create() {
            return builder().build();
        }

        /**
         * @return cheapRate
         */
        public Long getCheapRate() {
            return this.cheapRate;
        }

        /**
         * @return cheapStandAmount
         */
        public Long getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        /**
         * @return contractActivity
         */
        public DepreciateInfoContractActivity getContractActivity() {
            return this.contractActivity;
        }

        /**
         * @return differential
         */
        public Long getDifferential() {
            return this.differential;
        }

        /**
         * @return differentialName
         */
        public String getDifferentialName() {
            return this.differentialName;
        }

        /**
         * @return isContractActivity
         */
        public Boolean getIsContractActivity() {
            return this.isContractActivity;
        }

        /**
         * @return listPrice
         */
        public Long getListPrice() {
            return this.listPrice;
        }

        /**
         * @return monthPrice
         */
        public Long getMonthPrice() {
            return this.monthPrice;
        }

        /**
         * @return originalStandAmount
         */
        public Long getOriginalStandAmount() {
            return this.originalStandAmount;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long cheapRate; 
            private Long cheapStandAmount; 
            private DepreciateInfoContractActivity contractActivity; 
            private Long differential; 
            private String differentialName; 
            private Boolean isContractActivity; 
            private Long listPrice; 
            private Long monthPrice; 
            private Long originalStandAmount; 
            private String startTime; 

            /**
             * CheapRate.
             */
            public Builder cheapRate(Long cheapRate) {
                this.cheapRate = cheapRate;
                return this;
            }

            /**
             * CheapStandAmount.
             */
            public Builder cheapStandAmount(Long cheapStandAmount) {
                this.cheapStandAmount = cheapStandAmount;
                return this;
            }

            /**
             * ContractActivity.
             */
            public Builder contractActivity(DepreciateInfoContractActivity contractActivity) {
                this.contractActivity = contractActivity;
                return this;
            }

            /**
             * Differential.
             */
            public Builder differential(Long differential) {
                this.differential = differential;
                return this;
            }

            /**
             * DifferentialName.
             */
            public Builder differentialName(String differentialName) {
                this.differentialName = differentialName;
                return this;
            }

            /**
             * IsContractActivity.
             */
            public Builder isContractActivity(Boolean isContractActivity) {
                this.isContractActivity = isContractActivity;
                return this;
            }

            /**
             * ListPrice.
             */
            public Builder listPrice(Long listPrice) {
                this.listPrice = listPrice;
                return this;
            }

            /**
             * MonthPrice.
             */
            public Builder monthPrice(Long monthPrice) {
                this.monthPrice = monthPrice;
                return this;
            }

            /**
             * OriginalStandAmount.
             */
            public Builder originalStandAmount(Long originalStandAmount) {
                this.originalStandAmount = originalStandAmount;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public SubOrderDepreciateInfo build() {
                return new SubOrderDepreciateInfo(this);
            } 

        } 

    }
    public static class ModuleInstanceDepreciateInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheapRate")
        private Double cheapRate;

        @com.aliyun.core.annotation.NameInMap("CheapStandAmount")
        private Double cheapStandAmount;

        @com.aliyun.core.annotation.NameInMap("Differential")
        private Double differential;

        @com.aliyun.core.annotation.NameInMap("DifferentialName")
        private String differentialName;

        @com.aliyun.core.annotation.NameInMap("IsContractActivity")
        private Boolean isContractActivity;

        @com.aliyun.core.annotation.NameInMap("IsShow")
        private Boolean isShow;

        @com.aliyun.core.annotation.NameInMap("ListPrice")
        private Double listPrice;

        @com.aliyun.core.annotation.NameInMap("MonthPrice")
        private Double monthPrice;

        @com.aliyun.core.annotation.NameInMap("OriginalStandAmount")
        private Double originalStandAmount;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private ModuleInstanceDepreciateInfo(Builder builder) {
            this.cheapRate = builder.cheapRate;
            this.cheapStandAmount = builder.cheapStandAmount;
            this.differential = builder.differential;
            this.differentialName = builder.differentialName;
            this.isContractActivity = builder.isContractActivity;
            this.isShow = builder.isShow;
            this.listPrice = builder.listPrice;
            this.monthPrice = builder.monthPrice;
            this.originalStandAmount = builder.originalStandAmount;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleInstanceDepreciateInfo create() {
            return builder().build();
        }

        /**
         * @return cheapRate
         */
        public Double getCheapRate() {
            return this.cheapRate;
        }

        /**
         * @return cheapStandAmount
         */
        public Double getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        /**
         * @return differential
         */
        public Double getDifferential() {
            return this.differential;
        }

        /**
         * @return differentialName
         */
        public String getDifferentialName() {
            return this.differentialName;
        }

        /**
         * @return isContractActivity
         */
        public Boolean getIsContractActivity() {
            return this.isContractActivity;
        }

        /**
         * @return isShow
         */
        public Boolean getIsShow() {
            return this.isShow;
        }

        /**
         * @return listPrice
         */
        public Double getListPrice() {
            return this.listPrice;
        }

        /**
         * @return monthPrice
         */
        public Double getMonthPrice() {
            return this.monthPrice;
        }

        /**
         * @return originalStandAmount
         */
        public Double getOriginalStandAmount() {
            return this.originalStandAmount;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Double cheapRate; 
            private Double cheapStandAmount; 
            private Double differential; 
            private String differentialName; 
            private Boolean isContractActivity; 
            private Boolean isShow; 
            private Double listPrice; 
            private Double monthPrice; 
            private Double originalStandAmount; 
            private String startTime; 

            /**
             * CheapRate.
             */
            public Builder cheapRate(Double cheapRate) {
                this.cheapRate = cheapRate;
                return this;
            }

            /**
             * CheapStandAmount.
             */
            public Builder cheapStandAmount(Double cheapStandAmount) {
                this.cheapStandAmount = cheapStandAmount;
                return this;
            }

            /**
             * Differential.
             */
            public Builder differential(Double differential) {
                this.differential = differential;
                return this;
            }

            /**
             * DifferentialName.
             */
            public Builder differentialName(String differentialName) {
                this.differentialName = differentialName;
                return this;
            }

            /**
             * IsContractActivity.
             */
            public Builder isContractActivity(Boolean isContractActivity) {
                this.isContractActivity = isContractActivity;
                return this;
            }

            /**
             * IsShow.
             */
            public Builder isShow(Boolean isShow) {
                this.isShow = isShow;
                return this;
            }

            /**
             * ListPrice.
             */
            public Builder listPrice(Double listPrice) {
                this.listPrice = listPrice;
                return this;
            }

            /**
             * MonthPrice.
             */
            public Builder monthPrice(Double monthPrice) {
                this.monthPrice = monthPrice;
                return this;
            }

            /**
             * OriginalStandAmount.
             */
            public Builder originalStandAmount(Double originalStandAmount) {
                this.originalStandAmount = originalStandAmount;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public ModuleInstanceDepreciateInfo build() {
                return new ModuleInstanceDepreciateInfo(this);
            } 

        } 

    }
    public static class ModuleAttr extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Long type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ModuleAttr(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleAttr create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public Long getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String name; 
            private Long type; 
            private String value; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The name of the promotion rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ModuleAttr build() {
                return new ModuleAttr(this);
            } 

        } 

    }
    public static class ModuleAttrs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("moduleAttr")
        private java.util.List < ModuleAttr> moduleAttr;

        private ModuleAttrs(Builder builder) {
            this.moduleAttr = builder.moduleAttr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleAttrs create() {
            return builder().build();
        }

        /**
         * @return moduleAttr
         */
        public java.util.List < ModuleAttr> getModuleAttr() {
            return this.moduleAttr;
        }

        public static final class Builder {
            private java.util.List < ModuleAttr> moduleAttr; 

            /**
             * moduleAttr.
             */
            public Builder moduleAttr(java.util.List < ModuleAttr> moduleAttr) {
                this.moduleAttr = moduleAttr;
                return this;
            }

            public ModuleAttrs build() {
                return new ModuleAttrs(this);
            } 

        } 

    }
    public static class ModuleInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContractActivity")
        private Boolean contractActivity;

        @com.aliyun.core.annotation.NameInMap("DepreciateInfo")
        private ModuleInstanceDepreciateInfo depreciateInfo;

        @com.aliyun.core.annotation.NameInMap("DiscountFee")
        private Double discountFee;

        @com.aliyun.core.annotation.NameInMap("ModuleAttrs")
        private ModuleAttrs moduleAttrs;

        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("ModuleId")
        private String moduleId;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("NeedOrderPay")
        private Boolean needOrderPay;

        @com.aliyun.core.annotation.NameInMap("PayFee")
        private Double payFee;

        @com.aliyun.core.annotation.NameInMap("PricingModule")
        private Boolean pricingModule;

        @com.aliyun.core.annotation.NameInMap("StandPrice")
        private Double standPrice;

        @com.aliyun.core.annotation.NameInMap("TotalProductFee")
        private Double totalProductFee;

        private ModuleInstance(Builder builder) {
            this.contractActivity = builder.contractActivity;
            this.depreciateInfo = builder.depreciateInfo;
            this.discountFee = builder.discountFee;
            this.moduleAttrs = builder.moduleAttrs;
            this.moduleCode = builder.moduleCode;
            this.moduleId = builder.moduleId;
            this.moduleName = builder.moduleName;
            this.needOrderPay = builder.needOrderPay;
            this.payFee = builder.payFee;
            this.pricingModule = builder.pricingModule;
            this.standPrice = builder.standPrice;
            this.totalProductFee = builder.totalProductFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleInstance create() {
            return builder().build();
        }

        /**
         * @return contractActivity
         */
        public Boolean getContractActivity() {
            return this.contractActivity;
        }

        /**
         * @return depreciateInfo
         */
        public ModuleInstanceDepreciateInfo getDepreciateInfo() {
            return this.depreciateInfo;
        }

        /**
         * @return discountFee
         */
        public Double getDiscountFee() {
            return this.discountFee;
        }

        /**
         * @return moduleAttrs
         */
        public ModuleAttrs getModuleAttrs() {
            return this.moduleAttrs;
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return moduleId
         */
        public String getModuleId() {
            return this.moduleId;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return needOrderPay
         */
        public Boolean getNeedOrderPay() {
            return this.needOrderPay;
        }

        /**
         * @return payFee
         */
        public Double getPayFee() {
            return this.payFee;
        }

        /**
         * @return pricingModule
         */
        public Boolean getPricingModule() {
            return this.pricingModule;
        }

        /**
         * @return standPrice
         */
        public Double getStandPrice() {
            return this.standPrice;
        }

        /**
         * @return totalProductFee
         */
        public Double getTotalProductFee() {
            return this.totalProductFee;
        }

        public static final class Builder {
            private Boolean contractActivity; 
            private ModuleInstanceDepreciateInfo depreciateInfo; 
            private Double discountFee; 
            private ModuleAttrs moduleAttrs; 
            private String moduleCode; 
            private String moduleId; 
            private String moduleName; 
            private Boolean needOrderPay; 
            private Double payFee; 
            private Boolean pricingModule; 
            private Double standPrice; 
            private Double totalProductFee; 

            /**
             * ContractActivity.
             */
            public Builder contractActivity(Boolean contractActivity) {
                this.contractActivity = contractActivity;
                return this;
            }

            /**
             * DepreciateInfo.
             */
            public Builder depreciateInfo(ModuleInstanceDepreciateInfo depreciateInfo) {
                this.depreciateInfo = depreciateInfo;
                return this;
            }

            /**
             * DiscountFee.
             */
            public Builder discountFee(Double discountFee) {
                this.discountFee = discountFee;
                return this;
            }

            /**
             * ModuleAttrs.
             */
            public Builder moduleAttrs(ModuleAttrs moduleAttrs) {
                this.moduleAttrs = moduleAttrs;
                return this;
            }

            /**
             * ModuleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * ModuleId.
             */
            public Builder moduleId(String moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * NeedOrderPay.
             */
            public Builder needOrderPay(Boolean needOrderPay) {
                this.needOrderPay = needOrderPay;
                return this;
            }

            /**
             * PayFee.
             */
            public Builder payFee(Double payFee) {
                this.payFee = payFee;
                return this;
            }

            /**
             * PricingModule.
             */
            public Builder pricingModule(Boolean pricingModule) {
                this.pricingModule = pricingModule;
                return this;
            }

            /**
             * StandPrice.
             */
            public Builder standPrice(Double standPrice) {
                this.standPrice = standPrice;
                return this;
            }

            /**
             * TotalProductFee.
             */
            public Builder totalProductFee(Double totalProductFee) {
                this.totalProductFee = totalProductFee;
                return this;
            }

            public ModuleInstance build() {
                return new ModuleInstance(this);
            } 

        } 

    }
    public static class SubOrderModuleInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModuleInstance")
        private java.util.List < ModuleInstance> moduleInstance;

        private SubOrderModuleInstance(Builder builder) {
            this.moduleInstance = builder.moduleInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubOrderModuleInstance create() {
            return builder().build();
        }

        /**
         * @return moduleInstance
         */
        public java.util.List < ModuleInstance> getModuleInstance() {
            return this.moduleInstance;
        }

        public static final class Builder {
            private java.util.List < ModuleInstance> moduleInstance; 

            /**
             * ModuleInstance.
             */
            public Builder moduleInstance(java.util.List < ModuleInstance> moduleInstance) {
                this.moduleInstance = moduleInstance;
                return this;
            }

            public SubOrderModuleInstance build() {
                return new SubOrderModuleInstance(this);
            } 

        } 

    }
    public static class OptionalPromotion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityExtInfo")
        private java.util.Map < String, ? > activityExtInfo;

        @com.aliyun.core.annotation.NameInMap("CanPromFee")
        private String canPromFee;

        @com.aliyun.core.annotation.NameInMap("CouponNo")
        private String couponNo;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OptionCode")
        private String optionCode;

        @com.aliyun.core.annotation.NameInMap("PromotionName")
        private String promotionName;

        @com.aliyun.core.annotation.NameInMap("PromotionOptionNo")
        private String promotionOptionNo;

        @com.aliyun.core.annotation.NameInMap("Selected")
        private Boolean selected;

        @com.aliyun.core.annotation.NameInMap("Show")
        private Boolean show;

        private OptionalPromotion(Builder builder) {
            this.activityExtInfo = builder.activityExtInfo;
            this.canPromFee = builder.canPromFee;
            this.couponNo = builder.couponNo;
            this.description = builder.description;
            this.name = builder.name;
            this.optionCode = builder.optionCode;
            this.promotionName = builder.promotionName;
            this.promotionOptionNo = builder.promotionOptionNo;
            this.selected = builder.selected;
            this.show = builder.show;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OptionalPromotion create() {
            return builder().build();
        }

        /**
         * @return activityExtInfo
         */
        public java.util.Map < String, ? > getActivityExtInfo() {
            return this.activityExtInfo;
        }

        /**
         * @return canPromFee
         */
        public String getCanPromFee() {
            return this.canPromFee;
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
         * @return promotionName
         */
        public String getPromotionName() {
            return this.promotionName;
        }

        /**
         * @return promotionOptionNo
         */
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

        /**
         * @return selected
         */
        public Boolean getSelected() {
            return this.selected;
        }

        /**
         * @return show
         */
        public Boolean getShow() {
            return this.show;
        }

        public static final class Builder {
            private java.util.Map < String, ? > activityExtInfo; 
            private String canPromFee; 
            private String couponNo; 
            private String description; 
            private String name; 
            private String optionCode; 
            private String promotionName; 
            private String promotionOptionNo; 
            private Boolean selected; 
            private Boolean show; 

            /**
             * ActivityExtInfo.
             */
            public Builder activityExtInfo(java.util.Map < String, ? > activityExtInfo) {
                this.activityExtInfo = activityExtInfo;
                return this;
            }

            /**
             * CanPromFee.
             */
            public Builder canPromFee(String canPromFee) {
                this.canPromFee = canPromFee;
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
             * The name of the promotion rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OptionCode.
             */
            public Builder optionCode(String optionCode) {
                this.optionCode = optionCode;
                return this;
            }

            /**
             * PromotionName.
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * PromotionOptionNo.
             */
            public Builder promotionOptionNo(String promotionOptionNo) {
                this.promotionOptionNo = promotionOptionNo;
                return this;
            }

            /**
             * Selected.
             */
            public Builder selected(Boolean selected) {
                this.selected = selected;
                return this;
            }

            /**
             * Show.
             */
            public Builder show(Boolean show) {
                this.show = show;
                return this;
            }

            public OptionalPromotion build() {
                return new OptionalPromotion(this);
            } 

        } 

    }
    public static class OptionalPromotions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OptionalPromotion")
        private java.util.List < OptionalPromotion> optionalPromotion;

        private OptionalPromotions(Builder builder) {
            this.optionalPromotion = builder.optionalPromotion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OptionalPromotions create() {
            return builder().build();
        }

        /**
         * @return optionalPromotion
         */
        public java.util.List < OptionalPromotion> getOptionalPromotion() {
            return this.optionalPromotion;
        }

        public static final class Builder {
            private java.util.List < OptionalPromotion> optionalPromotion; 

            /**
             * OptionalPromotion.
             */
            public Builder optionalPromotion(java.util.List < OptionalPromotion> optionalPromotion) {
                this.optionalPromotion = optionalPromotion;
                return this;
            }

            public OptionalPromotions build() {
                return new OptionalPromotions(this);
            } 

        } 

    }
    public static class PromDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityExtInfo")
        private java.util.Map < String, ? > activityExtInfo;

        @com.aliyun.core.annotation.NameInMap("DerivedPromType")
        private String derivedPromType;

        @com.aliyun.core.annotation.NameInMap("FinalPromFee")
        private Double finalPromFee;

        @com.aliyun.core.annotation.NameInMap("OptionCode")
        private String optionCode;

        @com.aliyun.core.annotation.NameInMap("PromType")
        private String promType;

        @com.aliyun.core.annotation.NameInMap("PromotionCode")
        private String promotionCode;

        @com.aliyun.core.annotation.NameInMap("PromotionId")
        private Long promotionId;

        @com.aliyun.core.annotation.NameInMap("PromotionName")
        private String promotionName;

        private PromDetail(Builder builder) {
            this.activityExtInfo = builder.activityExtInfo;
            this.derivedPromType = builder.derivedPromType;
            this.finalPromFee = builder.finalPromFee;
            this.optionCode = builder.optionCode;
            this.promType = builder.promType;
            this.promotionCode = builder.promotionCode;
            this.promotionId = builder.promotionId;
            this.promotionName = builder.promotionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromDetail create() {
            return builder().build();
        }

        /**
         * @return activityExtInfo
         */
        public java.util.Map < String, ? > getActivityExtInfo() {
            return this.activityExtInfo;
        }

        /**
         * @return derivedPromType
         */
        public String getDerivedPromType() {
            return this.derivedPromType;
        }

        /**
         * @return finalPromFee
         */
        public Double getFinalPromFee() {
            return this.finalPromFee;
        }

        /**
         * @return optionCode
         */
        public String getOptionCode() {
            return this.optionCode;
        }

        /**
         * @return promType
         */
        public String getPromType() {
            return this.promType;
        }

        /**
         * @return promotionCode
         */
        public String getPromotionCode() {
            return this.promotionCode;
        }

        /**
         * @return promotionId
         */
        public Long getPromotionId() {
            return this.promotionId;
        }

        /**
         * @return promotionName
         */
        public String getPromotionName() {
            return this.promotionName;
        }

        public static final class Builder {
            private java.util.Map < String, ? > activityExtInfo; 
            private String derivedPromType; 
            private Double finalPromFee; 
            private String optionCode; 
            private String promType; 
            private String promotionCode; 
            private Long promotionId; 
            private String promotionName; 

            /**
             * ActivityExtInfo.
             */
            public Builder activityExtInfo(java.util.Map < String, ? > activityExtInfo) {
                this.activityExtInfo = activityExtInfo;
                return this;
            }

            /**
             * DerivedPromType.
             */
            public Builder derivedPromType(String derivedPromType) {
                this.derivedPromType = derivedPromType;
                return this;
            }

            /**
             * FinalPromFee.
             */
            public Builder finalPromFee(Double finalPromFee) {
                this.finalPromFee = finalPromFee;
                return this;
            }

            /**
             * OptionCode.
             */
            public Builder optionCode(String optionCode) {
                this.optionCode = optionCode;
                return this;
            }

            /**
             * PromType.
             */
            public Builder promType(String promType) {
                this.promType = promType;
                return this;
            }

            /**
             * PromotionCode.
             */
            public Builder promotionCode(String promotionCode) {
                this.promotionCode = promotionCode;
                return this;
            }

            /**
             * PromotionId.
             */
            public Builder promotionId(Long promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * PromotionName.
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            public PromDetail build() {
                return new PromDetail(this);
            } 

        } 

    }
    public static class PromDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PromDetail")
        private java.util.List < PromDetail> promDetail;

        private PromDetailList(Builder builder) {
            this.promDetail = builder.promDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromDetailList create() {
            return builder().build();
        }

        /**
         * @return promDetail
         */
        public java.util.List < PromDetail> getPromDetail() {
            return this.promDetail;
        }

        public static final class Builder {
            private java.util.List < PromDetail> promDetail; 

            /**
             * PromDetail.
             */
            public Builder promDetail(java.util.List < PromDetail> promDetail) {
                this.promDetail = promDetail;
                return this;
            }

            public PromDetailList build() {
                return new PromDetailList(this);
            } 

        } 

    }
    public static class SubOrderRuleIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleId")
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
        @com.aliyun.core.annotation.NameInMap("ContractActivity")
        private Boolean contractActivity;

        @com.aliyun.core.annotation.NameInMap("DepreciateInfo")
        private SubOrderDepreciateInfo depreciateInfo;

        @com.aliyun.core.annotation.NameInMap("DiscountAmount")
        private String discountAmount;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IsContractActivity")
        private Boolean isContractActivity;

        @com.aliyun.core.annotation.NameInMap("ModuleInstance")
        private SubOrderModuleInstance moduleInstance;

        @com.aliyun.core.annotation.NameInMap("OptionalPromotions")
        private OptionalPromotions optionalPromotions;

        @com.aliyun.core.annotation.NameInMap("OriginalAmount")
        private String originalAmount;

        @com.aliyun.core.annotation.NameInMap("PromDetailList")
        private PromDetailList promDetailList;

        @com.aliyun.core.annotation.NameInMap("RuleIds")
        private SubOrderRuleIds ruleIds;

        @com.aliyun.core.annotation.NameInMap("StandDiscountPrice")
        private Long standDiscountPrice;

        @com.aliyun.core.annotation.NameInMap("StandPrice")
        private Long standPrice;

        @com.aliyun.core.annotation.NameInMap("TradeAmount")
        private String tradeAmount;

        private SubOrder(Builder builder) {
            this.contractActivity = builder.contractActivity;
            this.depreciateInfo = builder.depreciateInfo;
            this.discountAmount = builder.discountAmount;
            this.instanceId = builder.instanceId;
            this.isContractActivity = builder.isContractActivity;
            this.moduleInstance = builder.moduleInstance;
            this.optionalPromotions = builder.optionalPromotions;
            this.originalAmount = builder.originalAmount;
            this.promDetailList = builder.promDetailList;
            this.ruleIds = builder.ruleIds;
            this.standDiscountPrice = builder.standDiscountPrice;
            this.standPrice = builder.standPrice;
            this.tradeAmount = builder.tradeAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubOrder create() {
            return builder().build();
        }

        /**
         * @return contractActivity
         */
        public Boolean getContractActivity() {
            return this.contractActivity;
        }

        /**
         * @return depreciateInfo
         */
        public SubOrderDepreciateInfo getDepreciateInfo() {
            return this.depreciateInfo;
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
         * @return isContractActivity
         */
        public Boolean getIsContractActivity() {
            return this.isContractActivity;
        }

        /**
         * @return moduleInstance
         */
        public SubOrderModuleInstance getModuleInstance() {
            return this.moduleInstance;
        }

        /**
         * @return optionalPromotions
         */
        public OptionalPromotions getOptionalPromotions() {
            return this.optionalPromotions;
        }

        /**
         * @return originalAmount
         */
        public String getOriginalAmount() {
            return this.originalAmount;
        }

        /**
         * @return promDetailList
         */
        public PromDetailList getPromDetailList() {
            return this.promDetailList;
        }

        /**
         * @return ruleIds
         */
        public SubOrderRuleIds getRuleIds() {
            return this.ruleIds;
        }

        /**
         * @return standDiscountPrice
         */
        public Long getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        /**
         * @return standPrice
         */
        public Long getStandPrice() {
            return this.standPrice;
        }

        /**
         * @return tradeAmount
         */
        public String getTradeAmount() {
            return this.tradeAmount;
        }

        public static final class Builder {
            private Boolean contractActivity; 
            private SubOrderDepreciateInfo depreciateInfo; 
            private String discountAmount; 
            private String instanceId; 
            private Boolean isContractActivity; 
            private SubOrderModuleInstance moduleInstance; 
            private OptionalPromotions optionalPromotions; 
            private String originalAmount; 
            private PromDetailList promDetailList; 
            private SubOrderRuleIds ruleIds; 
            private Long standDiscountPrice; 
            private Long standPrice; 
            private String tradeAmount; 

            /**
             * ContractActivity.
             */
            public Builder contractActivity(Boolean contractActivity) {
                this.contractActivity = contractActivity;
                return this;
            }

            /**
             * DepreciateInfo.
             */
            public Builder depreciateInfo(SubOrderDepreciateInfo depreciateInfo) {
                this.depreciateInfo = depreciateInfo;
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
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * IsContractActivity.
             */
            public Builder isContractActivity(Boolean isContractActivity) {
                this.isContractActivity = isContractActivity;
                return this;
            }

            /**
             * ModuleInstance.
             */
            public Builder moduleInstance(SubOrderModuleInstance moduleInstance) {
                this.moduleInstance = moduleInstance;
                return this;
            }

            /**
             * OptionalPromotions.
             */
            public Builder optionalPromotions(OptionalPromotions optionalPromotions) {
                this.optionalPromotions = optionalPromotions;
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
             * PromDetailList.
             */
            public Builder promDetailList(PromDetailList promDetailList) {
                this.promDetailList = promDetailList;
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
             * StandDiscountPrice.
             */
            public Builder standDiscountPrice(Long standDiscountPrice) {
                this.standDiscountPrice = standDiscountPrice;
                return this;
            }

            /**
             * StandPrice.
             */
            public Builder standPrice(Long standPrice) {
                this.standPrice = standPrice;
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
        @com.aliyun.core.annotation.NameInMap("SubOrder")
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
