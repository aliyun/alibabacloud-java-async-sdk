// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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

    @com.aliyun.core.annotation.NameInMap("TraceId")
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
         * <p>The order information.</p>
         */
        public Builder order(Order order) {
            this.order = order;
            return this;
        }

        /**
         * <p>The order parameters.</p>
         * <blockquote>
         * <p>This parameter is returned only when the <strong>OrderParamOut</strong> parameter is set to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;autoPay&quot;:false}&quot;</p>
         */
        public Builder orderParams(String orderParams) {
            this.orderParams = orderParams;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>27227A3D-6B86-56F3-9E03-9E60F001CE12</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The promotion rules.</p>
         */
        public Builder rules(Rules rules) {
            this.rules = rules;
            return this;
        }

        /**
         * <p>The coupon rules.</p>
         */
        public Builder subOrders(SubOrders subOrders) {
            this.subOrders = subOrders;
            return this;
        }

        /**
         * <p>The ID of the trace.</p>
         * 
         * <strong>example:</strong>
         * <p>27227A3D-6B87-56F3-9E03-9E60F001****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribePriceResponseBody build() {
            return new DescribePriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
    public static class PromotionRuleIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PromotionRuleId")
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
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
    public static class Coupon extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityCategory")
        private String activityCategory;

        @com.aliyun.core.annotation.NameInMap("CouponNo")
        private String couponNo;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IsSelected")
        private String isSelected;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OptionCode")
        private String optionCode;

        @com.aliyun.core.annotation.NameInMap("PromotionOptionCode")
        private String promotionOptionCode;

        @com.aliyun.core.annotation.NameInMap("PromotionRuleIdList")
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
             * <p>The activity type of the coupon. Valid values:</p>
             * <ul>
             * <li><strong>payondemand</strong>: subscription</li>
             * <li><strong>payasyougo</strong>: pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>payondemand</p>
             */
            public Builder activityCategory(String activityCategory) {
                this.activityCategory = activityCategory;
                return this;
            }

            /**
             * <p>The coupon ID.</p>
             * 
             * <strong>example:</strong>
             * <p>youhuiquan_promotion_option_id_for_blank</p>
             */
            public Builder couponNo(String couponNo) {
                this.couponNo = couponNo;
                return this;
            }

            /**
             * <p>The description of the coupon.</p>
             * 
             * <strong>example:</strong>
             * <p>ceshi</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the coupon was selected. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isSelected(String isSelected) {
                this.isSelected = isSelected;
                return this;
            }

            /**
             * <p>The coupon name.</p>
             * 
             * <strong>example:</strong>
             * <p>youhuiquan111</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The code of the coupon.</p>
             * 
             * <strong>example:</strong>
             * <p>youhui_quan</p>
             */
            public Builder optionCode(String optionCode) {
                this.optionCode = optionCode;
                return this;
            }

            /**
             * <p>The promotional option code.</p>
             * 
             * <strong>example:</strong>
             * <p>youhui_quan</p>
             */
            public Builder promotionOptionCode(String promotionOptionCode) {
                this.promotionOptionCode = promotionOptionCode;
                return this;
            }

            /**
             * <p>The IDs of the rules that correspond to the coupon.</p>
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
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
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
             * <p>The activity ID.</p>
             * 
             * <strong>example:</strong>
             * <p>41120065996xxxxx</p>
             */
            public Builder activityId(Long activityId) {
                this.activityId = activityId;
                return this;
            }

            /**
             * <p>The activity name.</p>
             * 
             * <strong>example:</strong>
             * <p>contract promotion_order_xxx discount</p>
             */
            public Builder activityName(String activityName) {
                this.activityName = activityName;
                return this;
            }

            /**
             * <p>The price after the promotion.</p>
             * 
             * <strong>example:</strong>
             * <p>20522.4</p>
             */
            public Builder finalFee(Double finalFee) {
                this.finalFee = finalFee;
                return this;
            }

            /**
             * <p>The total discount amount.</p>
             * 
             * <strong>example:</strong>
             * <p>3621.6</p>
             */
            public Builder finalPromFee(Double finalPromFee) {
                this.finalPromFee = finalPromFee;
                return this;
            }

            /**
             * <p>The promotion ID.</p>
             * 
             * <strong>example:</strong>
             * <p>wanhua_activity</p>
             */
            public Builder optionCode(String optionCode) {
                this.optionCode = optionCode;
                return this;
            }

            /**
             * <p>The promotion IDs.</p>
             */
            public Builder optionIds(OptionIds optionIds) {
                this.optionIds = optionIds;
                return this;
            }

            /**
             * <p>The original price.</p>
             * 
             * <strong>example:</strong>
             * <p>24144.0</p>
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
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
    public static class DepreciateInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheapRate")
        private Double cheapRate;

        @com.aliyun.core.annotation.NameInMap("CheapStandAmount")
        private Double cheapStandAmount;

        @com.aliyun.core.annotation.NameInMap("ContractActivity")
        private ContractActivity contractActivity;

        @com.aliyun.core.annotation.NameInMap("Differential")
        private Double differential;

        @com.aliyun.core.annotation.NameInMap("DifferentialName")
        private String differentialName;

        @com.aliyun.core.annotation.NameInMap("IsContractActivity")
        private Boolean isContractActivity;

        @com.aliyun.core.annotation.NameInMap("IsShow")
        private String isShow;

        @com.aliyun.core.annotation.NameInMap("ListPrice")
        private Double listPrice;

        @com.aliyun.core.annotation.NameInMap("MonthPrice")
        private Double monthPrice;

        @com.aliyun.core.annotation.NameInMap("OriginalStandAmount")
        private Double originalStandAmount;

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
         * @return contractActivity
         */
        public ContractActivity getContractActivity() {
            return this.contractActivity;
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
        public String getIsShow() {
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

        public static final class Builder {
            private Double cheapRate; 
            private Double cheapStandAmount; 
            private ContractActivity contractActivity; 
            private Double differential; 
            private String differentialName; 
            private Boolean isContractActivity; 
            private String isShow; 
            private Double listPrice; 
            private Double monthPrice; 
            private Double originalStandAmount; 

            /**
             * <p>The price reduction rate.</p>
             * 
             * <strong>example:</strong>
             * <p>30%</p>
             */
            public Builder cheapRate(Double cheapRate) {
                this.cheapRate = cheapRate;
                return this;
            }

            /**
             * <p>The new total price displayed on the official website.</p>
             * 
             * <strong>example:</strong>
             * <p>9*</p>
             */
            public Builder cheapStandAmount(Double cheapStandAmount) {
                this.cheapStandAmount = cheapStandAmount;
                return this;
            }

            /**
             * <p>The contract promotion.</p>
             */
            public Builder contractActivity(ContractActivity contractActivity) {
                this.contractActivity = contractActivity;
                return this;
            }

            /**
             * <p>The price difference displayed in the total order amount.</p>
             * 
             * <strong>example:</strong>
             * <p>**</p>
             */
            public Builder differential(Double differential) {
                this.differential = differential;
                return this;
            }

            /**
             * <p>The name of the price difference.</p>
             * 
             * <strong>example:</strong>
             * <p>XXXXX</p>
             */
            public Builder differentialName(String differentialName) {
                this.differentialName = differentialName;
                return this;
            }

            /**
             * <p>Indicates whether the contract promotion is hit.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isContractActivity(Boolean isContractActivity) {
                this.isContractActivity = isContractActivity;
                return this;
            }

            /**
             * <p>Indicates whether the price reduction rate is displayed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isShow(String isShow) {
                this.isShow = isShow;
                return this;
            }

            /**
             * <p>The list price.</p>
             * 
             * <strong>example:</strong>
             * <p>1*</p>
             */
            public Builder listPrice(Double listPrice) {
                this.listPrice = listPrice;
                return this;
            }

            /**
             * <p>The monthly price.</p>
             * 
             * <strong>example:</strong>
             * <p>**</p>
             */
            public Builder monthPrice(Double monthPrice) {
                this.monthPrice = monthPrice;
                return this;
            }

            /**
             * <p>The original total price displayed on the official website.</p>
             * 
             * <strong>example:</strong>
             * <p>12*</p>
             */
            public Builder originalStandAmount(Double originalStandAmount) {
                this.originalStandAmount = originalStandAmount;
                return this;
            }

            public DepreciateInfo build() {
                return new DepreciateInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
    public static class Order extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ContractActivity")
        private Boolean contractActivity;

        @com.aliyun.core.annotation.NameInMap("Coupons")
        private Coupons coupons;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DepreciateInfo")
        private DepreciateInfo depreciateInfo;

        @com.aliyun.core.annotation.NameInMap("DiscountAmount")
        private String discountAmount;

        @com.aliyun.core.annotation.NameInMap("IsContractActivity")
        private Boolean isContractActivity;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("OptionalPromotions")
        private String optionalPromotions;

        @com.aliyun.core.annotation.NameInMap("OriginalAmount")
        private String originalAmount;

        @com.aliyun.core.annotation.NameInMap("PromDetailList")
        private String promDetailList;

        @com.aliyun.core.annotation.NameInMap("RuleIds")
        private RuleIds ruleIds;

        @com.aliyun.core.annotation.NameInMap("ShowDiscountInfo")
        private Boolean showDiscountInfo;

        @com.aliyun.core.annotation.NameInMap("StandDiscountPrice")
        private Double standDiscountPrice;

        @com.aliyun.core.annotation.NameInMap("StandPrice")
        private Double standPrice;

        @com.aliyun.core.annotation.NameInMap("TradeAmount")
        private String tradeAmount;

        private Order(Builder builder) {
            this.code = builder.code;
            this.contractActivity = builder.contractActivity;
            this.coupons = builder.coupons;
            this.currency = builder.currency;
            this.depreciateInfo = builder.depreciateInfo;
            this.discountAmount = builder.discountAmount;
            this.isContractActivity = builder.isContractActivity;
            this.message = builder.message;
            this.optionalPromotions = builder.optionalPromotions;
            this.originalAmount = builder.originalAmount;
            this.promDetailList = builder.promDetailList;
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
         * @return contractActivity
         */
        public Boolean getContractActivity() {
            return this.contractActivity;
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
         * @return optionalPromotions
         */
        public String getOptionalPromotions() {
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
        public String getPromDetailList() {
            return this.promDetailList;
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
        public Double getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        /**
         * @return standPrice
         */
        public Double getStandPrice() {
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
            private Boolean contractActivity; 
            private Coupons coupons; 
            private String currency; 
            private DepreciateInfo depreciateInfo; 
            private String discountAmount; 
            private Boolean isContractActivity; 
            private String message; 
            private String optionalPromotions; 
            private String originalAmount; 
            private String promDetailList; 
            private RuleIds ruleIds; 
            private Boolean showDiscountInfo; 
            private Double standDiscountPrice; 
            private Double standPrice; 
            private String tradeAmount; 

            /**
             * <p>The order code.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Indicates whether the contract promotion is hit.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder contractActivity(Boolean contractActivity) {
                this.contractActivity = contractActivity;
                return this;
            }

            /**
             * <p>The information of coupons.</p>
             */
            public Builder coupons(Coupons coupons) {
                this.coupons = coupons;
                return this;
            }

            /**
             * <p>The currency.</p>
             * 
             * <strong>example:</strong>
             * <p>USD</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The price reduction information.</p>
             */
            public Builder depreciateInfo(DepreciateInfo depreciateInfo) {
                this.depreciateInfo = depreciateInfo;
                return this;
            }

            /**
             * <p>The discount amount of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>322.4</p>
             */
            public Builder discountAmount(String discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * <p>Indicates whether the contract promotion is hit.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isContractActivity(Boolean isContractActivity) {
                this.isContractActivity = isContractActivity;
                return this;
            }

            /**
             * <p>The order information.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The promotional activity information.</p>
             * 
             * <strong>example:</strong>
             * <p>[{\”activityCategory\”:\”discount\”,\”activityExtInfo\”:{\”noUseYouhuiquan\”:\”true\”,\”activityId\”:\”191156098xxxx\”,\”activityExtraAttr\”:\”{\\”forbiddenCpsProfit\\”:\\”true\\”,\\”forbiddenCouponsRestricted\\”:\\”true\\”,\\”forbiddenAmbassadorProfit\\”:\\”true\\”}\”,\”isActivityIdFromWanHuaTong\”:\”true\”,\”isContractActivity\”:\”false\”},\”canPromFee\”:906130,\”optionCode\”:\”wanhua_activity\”,\”promotionName\”:\”FY24--MongoDB replica set - first-time purchase - * discount for a one-year period - first-time purchase benefits\”,\”promotionOptionNo\”:\”19115609882xxxx\”,\”promotionRuleIdList\”:[2091xxxx],\”selected\”:true,\”targetArticleItemCodes\”:[]},{\”activityCategory\”:\”discount\”,\”activityExtInfo\”:{\”activityId\”:\”1018040010xxxxx\”,\”wanHuaOrderExpireSec\”:\”604800\”,\”isActivityIdFromWanHuaTong\”:\”true\”,\”isContractActivity\”:\”false\”},\”canPromFee\”:339799,\”optionCode\”:\”wanhua_activity\”,\”promotionName\”:\”FY24--MongoDB discount for a one-year period \”,\”promotionOptionNo\”:\”10180400107xxxxx\”,\”promotionRuleIdList\”:[xxxxx],\”selected\”:false,\”targetArticleItemCodes\”:[]}]”</p>
             */
            public Builder optionalPromotions(String optionalPromotions) {
                this.optionalPromotions = optionalPromotions;
                return this;
            }

            /**
             * <p>The original price of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>322.4</p>
             */
            public Builder originalAmount(String originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            /**
             * <p>The promotional activity that is hit.</p>
             * 
             * <strong>example:</strong>
             * <p>[{\”finalPromFee\”:90xxx,\”optionCode\”:\”wanhua_activity\”,\”promType\”:\”discount\”,\”promotionId\”:2091xxxx,\”promotionName\”:\”* discount is provided for new users who purchase ApsaraDB for MongoDB replica set instances for one year. A new user can purchase an ApsaraDB for MongoDB replica set instance only by using the discount.\”}]”</p>
             */
            public Builder promDetailList(String promDetailList) {
                this.promDetailList = promDetailList;
                return this;
            }

            /**
             * <p>The rules of the order.</p>
             */
            public Builder ruleIds(RuleIds ruleIds) {
                this.ruleIds = ruleIds;
                return this;
            }

            /**
             * <p>Indicates whether the discount information is displayed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder showDiscountInfo(Boolean showDiscountInfo) {
                this.showDiscountInfo = showDiscountInfo;
                return this;
            }

            /**
             * <p>The discount.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder standDiscountPrice(Double standDiscountPrice) {
                this.standDiscountPrice = standDiscountPrice;
                return this;
            }

            /**
             * <p>The discount.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder standPrice(Double standPrice) {
                this.standPrice = standPrice;
                return this;
            }

            /**
             * <p>The final price of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
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
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>demoname</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2075****</p>
             */
            public Builder ruleDescId(Long ruleDescId) {
                this.ruleDescId = ruleDescId;
                return this;
            }

            /**
             * <p>The rule title.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
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
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
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
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
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
             * <p>The activity ID.</p>
             * 
             * <strong>example:</strong>
             * <p>41120065996xxxxx</p>
             */
            public Builder activityId(Long activityId) {
                this.activityId = activityId;
                return this;
            }

            /**
             * <p>The activity name.</p>
             * 
             * <strong>example:</strong>
             * <p>contract promotion_order_xxx discount</p>
             */
            public Builder activityName(String activityName) {
                this.activityName = activityName;
                return this;
            }

            /**
             * <p>The price after the promotion.</p>
             * 
             * <strong>example:</strong>
             * <p>20522.4</p>
             */
            public Builder finalFee(Double finalFee) {
                this.finalFee = finalFee;
                return this;
            }

            /**
             * <p>The total discount amount.</p>
             * 
             * <strong>example:</strong>
             * <p>3621.6</p>
             */
            public Builder finalPromFee(Double finalPromFee) {
                this.finalPromFee = finalPromFee;
                return this;
            }

            /**
             * <p>The promotion ID.</p>
             * 
             * <strong>example:</strong>
             * <p>wanhua_activity</p>
             */
            public Builder optionCode(String optionCode) {
                this.optionCode = optionCode;
                return this;
            }

            /**
             * <p>The promotion IDs.</p>
             */
            public Builder optionIds(ContractActivityOptionIds optionIds) {
                this.optionIds = optionIds;
                return this;
            }

            /**
             * <p>The original price.</p>
             * 
             * <strong>example:</strong>
             * <p>24144.0</p>
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
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
    public static class SubOrderDepreciateInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheapRate")
        private Double cheapRate;

        @com.aliyun.core.annotation.NameInMap("CheapStandAmount")
        private Double cheapStandAmount;

        @com.aliyun.core.annotation.NameInMap("ContractActivity")
        private DepreciateInfoContractActivity contractActivity;

        @com.aliyun.core.annotation.NameInMap("Differential")
        private Double differential;

        @com.aliyun.core.annotation.NameInMap("DifferentialName")
        private String differentialName;

        @com.aliyun.core.annotation.NameInMap("IsContractActivity")
        private Boolean isContractActivity;

        @com.aliyun.core.annotation.NameInMap("IsShow")
        private String isShow;

        @com.aliyun.core.annotation.NameInMap("ListPrice")
        private Double listPrice;

        @com.aliyun.core.annotation.NameInMap("MonthPrice")
        private Double monthPrice;

        @com.aliyun.core.annotation.NameInMap("OriginalStandAmount")
        private Double originalStandAmount;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private SubOrderDepreciateInfo(Builder builder) {
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
         * @return contractActivity
         */
        public DepreciateInfoContractActivity getContractActivity() {
            return this.contractActivity;
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
        public String getIsShow() {
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
            private DepreciateInfoContractActivity contractActivity; 
            private Double differential; 
            private String differentialName; 
            private Boolean isContractActivity; 
            private String isShow; 
            private Double listPrice; 
            private Double monthPrice; 
            private Double originalStandAmount; 
            private String startTime; 

            /**
             * <p>The price reduction rate.</p>
             * 
             * <strong>example:</strong>
             * <p>30%</p>
             */
            public Builder cheapRate(Double cheapRate) {
                this.cheapRate = cheapRate;
                return this;
            }

            /**
             * <p>The new total price displayed on the official website.</p>
             * 
             * <strong>example:</strong>
             * <p>9*</p>
             */
            public Builder cheapStandAmount(Double cheapStandAmount) {
                this.cheapStandAmount = cheapStandAmount;
                return this;
            }

            /**
             * <p>The activity information.</p>
             */
            public Builder contractActivity(DepreciateInfoContractActivity contractActivity) {
                this.contractActivity = contractActivity;
                return this;
            }

            /**
             * <p>The price difference displayed in the total order amount.</p>
             * 
             * <strong>example:</strong>
             * <p>**</p>
             */
            public Builder differential(Double differential) {
                this.differential = differential;
                return this;
            }

            /**
             * <p>The name of the price difference.</p>
             * 
             * <strong>example:</strong>
             * <p>XXXXX</p>
             */
            public Builder differentialName(String differentialName) {
                this.differentialName = differentialName;
                return this;
            }

            /**
             * <p>Indicates whether the contract promotion is hit.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isContractActivity(Boolean isContractActivity) {
                this.isContractActivity = isContractActivity;
                return this;
            }

            /**
             * <p>Indicates whether the price reduction rate is displayed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isShow(String isShow) {
                this.isShow = isShow;
                return this;
            }

            /**
             * <p>The list price.</p>
             * 
             * <strong>example:</strong>
             * <p>1*</p>
             */
            public Builder listPrice(Double listPrice) {
                this.listPrice = listPrice;
                return this;
            }

            /**
             * <p>The monthly price.</p>
             * 
             * <strong>example:</strong>
             * <p>**</p>
             */
            public Builder monthPrice(Double monthPrice) {
                this.monthPrice = monthPrice;
                return this;
            }

            /**
             * <p>The original total price displayed on the official website.</p>
             * 
             * <strong>example:</strong>
             * <p>12*</p>
             */
            public Builder originalStandAmount(Double originalStandAmount) {
                this.originalStandAmount = originalStandAmount;
                return this;
            }

            /**
             * <p>The start time of the activity.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-29 10:30:00</p>
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
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
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
        private String isShow;

        @com.aliyun.core.annotation.NameInMap("ListPrice")
        private Double listPrice;

        @com.aliyun.core.annotation.NameInMap("MonthPrice")
        private Double monthPrice;

        @com.aliyun.core.annotation.NameInMap("OriginalStandAmount")
        private Double originalStandAmount;

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
        public String getIsShow() {
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

        public static final class Builder {
            private Double cheapRate; 
            private Double cheapStandAmount; 
            private Double differential; 
            private String differentialName; 
            private Boolean isContractActivity; 
            private String isShow; 
            private Double listPrice; 
            private Double monthPrice; 
            private Double originalStandAmount; 

            /**
             * <p>The price reduction rate.</p>
             * 
             * <strong>example:</strong>
             * <p>30%</p>
             */
            public Builder cheapRate(Double cheapRate) {
                this.cheapRate = cheapRate;
                return this;
            }

            /**
             * <p>The new total price displayed on the official website.</p>
             * 
             * <strong>example:</strong>
             * <p>9*</p>
             */
            public Builder cheapStandAmount(Double cheapStandAmount) {
                this.cheapStandAmount = cheapStandAmount;
                return this;
            }

            /**
             * <p>The price difference displayed in the total order amount.</p>
             * 
             * <strong>example:</strong>
             * <p>**</p>
             */
            public Builder differential(Double differential) {
                this.differential = differential;
                return this;
            }

            /**
             * <p>The name of the price difference.</p>
             * 
             * <strong>example:</strong>
             * <p>XXXXX</p>
             */
            public Builder differentialName(String differentialName) {
                this.differentialName = differentialName;
                return this;
            }

            /**
             * <p>Indicates whether the contract promotion is hit.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isContractActivity(Boolean isContractActivity) {
                this.isContractActivity = isContractActivity;
                return this;
            }

            /**
             * <p>Indicates whether the price reduction rate is displayed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isShow(String isShow) {
                this.isShow = isShow;
                return this;
            }

            /**
             * <p>The list price.</p>
             * 
             * <strong>example:</strong>
             * <p>1*</p>
             */
            public Builder listPrice(Double listPrice) {
                this.listPrice = listPrice;
                return this;
            }

            /**
             * <p>The monthly price.</p>
             * 
             * <strong>example:</strong>
             * <p>**</p>
             */
            public Builder monthPrice(Double monthPrice) {
                this.monthPrice = monthPrice;
                return this;
            }

            /**
             * <p>The original total price displayed on the official website.</p>
             * 
             * <strong>example:</strong>
             * <p>12*</p>
             */
            public Builder originalStandAmount(Double originalStandAmount) {
                this.originalStandAmount = originalStandAmount;
                return this;
            }

            public ModuleInstanceDepreciateInfo build() {
                return new ModuleInstanceDepreciateInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
    public static class ModuleAttr extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

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
        public String getType() {
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
            private String type; 
            private String value; 

            /**
             * <p>The attribute code.</p>
             * 
             * <strong>example:</strong>
             * <p>dds_dbtype</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The attribute name.</p>
             * 
             * <strong>example:</strong>
             * <p>MongoDB</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The attribute type.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The attribute value.</p>
             * 
             * <strong>example:</strong>
             * <p>MongoDB</p>
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
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
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
             * <p>The additional promotion information.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;activityId&quot;: &quot;1512010241743170&quot;
             * }</p>
             */
            public Builder activityExtInfo(java.util.Map < String, ? > activityExtInfo) {
                this.activityExtInfo = activityExtInfo;
                return this;
            }

            /**
             * <p>The sub-type of the promotion.</p>
             * 
             * <strong>example:</strong>
             * <p>subPrice</p>
             */
            public Builder derivedPromType(String derivedPromType) {
                this.derivedPromType = derivedPromType;
                return this;
            }

            /**
             * <p>The discount amount.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder finalPromFee(Double finalPromFee) {
                this.finalPromFee = finalPromFee;
                return this;
            }

            /**
             * <p>The code of the commodity to which the coupon can be applied.</p>
             * 
             * <strong>example:</strong>
             * <p>wanhua_activity</p>
             */
            public Builder optionCode(String optionCode) {
                this.optionCode = optionCode;
                return this;
            }

            /**
             * <p>The sub-type of the promotion.</p>
             * 
             * <strong>example:</strong>
             * <p>discount</p>
             */
            public Builder promType(String promType) {
                this.promType = promType;
                return this;
            }

            /**
             * <p>The coupon code.</p>
             * 
             * <strong>example:</strong>
             * <p>aliwood-xxx</p>
             */
            public Builder promotionCode(String promotionCode) {
                this.promotionCode = promotionCode;
                return this;
            }

            /**
             * <p>The ID of the promotional activity.</p>
             * 
             * <strong>example:</strong>
             * <p>8105187xxxx</p>
             */
            public Builder promotionId(Long promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * <p>The promotional activity name.</p>
             * 
             * <strong>example:</strong>
             * <p>[Item with price reduction in x xxxx] ApsaraDB for MongoDB instances of a full range of specifications - xxxxx</p>
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
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
    public static class ModuleInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContractActivity")
        private Boolean contractActivity;

        @com.aliyun.core.annotation.NameInMap("CycleFee")
        private String cycleFee;

        @com.aliyun.core.annotation.NameInMap("DepreciateInfo")
        private ModuleInstanceDepreciateInfo depreciateInfo;

        @com.aliyun.core.annotation.NameInMap("DiscountFee")
        private String discountFee;

        @com.aliyun.core.annotation.NameInMap("ModuleAttrs")
        private ModuleAttrs moduleAttrs;

        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("ModuleId")
        private Long moduleId;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("NeedOrderPay")
        private Boolean needOrderPay;

        @com.aliyun.core.annotation.NameInMap("PayFee")
        private Double payFee;

        @com.aliyun.core.annotation.NameInMap("PricingModule")
        private Boolean pricingModule;

        @com.aliyun.core.annotation.NameInMap("PromDetailList")
        private PromDetailList promDetailList;

        @com.aliyun.core.annotation.NameInMap("StandDiscountPrice")
        private Double standDiscountPrice;

        @com.aliyun.core.annotation.NameInMap("StandPrice")
        private Double standPrice;

        @com.aliyun.core.annotation.NameInMap("TotalProductFee")
        private Double totalProductFee;

        private ModuleInstance(Builder builder) {
            this.contractActivity = builder.contractActivity;
            this.cycleFee = builder.cycleFee;
            this.depreciateInfo = builder.depreciateInfo;
            this.discountFee = builder.discountFee;
            this.moduleAttrs = builder.moduleAttrs;
            this.moduleCode = builder.moduleCode;
            this.moduleId = builder.moduleId;
            this.moduleName = builder.moduleName;
            this.needOrderPay = builder.needOrderPay;
            this.payFee = builder.payFee;
            this.pricingModule = builder.pricingModule;
            this.promDetailList = builder.promDetailList;
            this.standDiscountPrice = builder.standDiscountPrice;
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
         * @return cycleFee
         */
        public String getCycleFee() {
            return this.cycleFee;
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
        public String getDiscountFee() {
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
        public Long getModuleId() {
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
         * @return promDetailList
         */
        public PromDetailList getPromDetailList() {
            return this.promDetailList;
        }

        /**
         * @return standDiscountPrice
         */
        public Double getStandDiscountPrice() {
            return this.standDiscountPrice;
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
            private String cycleFee; 
            private ModuleInstanceDepreciateInfo depreciateInfo; 
            private String discountFee; 
            private ModuleAttrs moduleAttrs; 
            private String moduleCode; 
            private Long moduleId; 
            private String moduleName; 
            private Boolean needOrderPay; 
            private Double payFee; 
            private Boolean pricingModule; 
            private PromDetailList promDetailList; 
            private Double standDiscountPrice; 
            private Double standPrice; 
            private Double totalProductFee; 

            /**
             * <p>Indicates whether the contract promotion is hit.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder contractActivity(Boolean contractActivity) {
                this.contractActivity = contractActivity;
                return this;
            }

            /**
             * <p>The cycle fee of the module.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder cycleFee(String cycleFee) {
                this.cycleFee = cycleFee;
                return this;
            }

            /**
             * <p>The activity information.</p>
             */
            public Builder depreciateInfo(ModuleInstanceDepreciateInfo depreciateInfo) {
                this.depreciateInfo = depreciateInfo;
                return this;
            }

            /**
             * <p>The discount.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder discountFee(String discountFee) {
                this.discountFee = discountFee;
                return this;
            }

            /**
             * <p>The module attributes.</p>
             */
            public Builder moduleAttrs(ModuleAttrs moduleAttrs) {
                this.moduleAttrs = moduleAttrs;
                return this;
            }

            /**
             * <p>The module code.</p>
             * 
             * <strong>example:</strong>
             * <p>dds_dbtype</p>
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * <p>The module ID</p>
             * 
             * <strong>example:</strong>
             * <p>1017110000415xxx</p>
             */
            public Builder moduleId(Long moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * <p>The module name.</p>
             * 
             * <strong>example:</strong>
             * <p>database type</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>Indicates whether the order is paid.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needOrderPay(Boolean needOrderPay) {
                this.needOrderPay = needOrderPay;
                return this;
            }

            /**
             * <p>The actual amount paid.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder payFee(Double payFee) {
                this.payFee = payFee;
                return this;
            }

            /**
             * <p>Indicates whether the item is billed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder pricingModule(Boolean pricingModule) {
                this.pricingModule = pricingModule;
                return this;
            }

            /**
             * <p>The promotion details.</p>
             */
            public Builder promDetailList(PromDetailList promDetailList) {
                this.promDetailList = promDetailList;
                return this;
            }

            /**
             * <p>The discount.</p>
             * 
             * <strong>example:</strong>
             * <p>451.00</p>
             */
            public Builder standDiscountPrice(Double standDiscountPrice) {
                this.standDiscountPrice = standDiscountPrice;
                return this;
            }

            /**
             * <p>The discount.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder standPrice(Double standPrice) {
                this.standPrice = standPrice;
                return this;
            }

            /**
             * <p>The original price of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
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
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
    public static class OptionalPromotionPromotionRuleIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("promotionRuleId")
        private java.util.List < String > promotionRuleId;

        private OptionalPromotionPromotionRuleIdList(Builder builder) {
            this.promotionRuleId = builder.promotionRuleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OptionalPromotionPromotionRuleIdList create() {
            return builder().build();
        }

        /**
         * @return promotionRuleId
         */
        public java.util.List < String > getPromotionRuleId() {
            return this.promotionRuleId;
        }

        public static final class Builder {
            private java.util.List < String > promotionRuleId; 

            /**
             * promotionRuleId.
             */
            public Builder promotionRuleId(java.util.List < String > promotionRuleId) {
                this.promotionRuleId = promotionRuleId;
                return this;
            }

            public OptionalPromotionPromotionRuleIdList build() {
                return new OptionalPromotionPromotionRuleIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
    public static class TargetArticleItemCodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("targetArticleItemCode")
        private java.util.List < String > targetArticleItemCode;

        private TargetArticleItemCodes(Builder builder) {
            this.targetArticleItemCode = builder.targetArticleItemCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetArticleItemCodes create() {
            return builder().build();
        }

        /**
         * @return targetArticleItemCode
         */
        public java.util.List < String > getTargetArticleItemCode() {
            return this.targetArticleItemCode;
        }

        public static final class Builder {
            private java.util.List < String > targetArticleItemCode; 

            /**
             * targetArticleItemCode.
             */
            public Builder targetArticleItemCode(java.util.List < String > targetArticleItemCode) {
                this.targetArticleItemCode = targetArticleItemCode;
                return this;
            }

            public TargetArticleItemCodes build() {
                return new TargetArticleItemCodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
    public static class OptionalPromotion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityCategory")
        private String activityCategory;

        @com.aliyun.core.annotation.NameInMap("ActivityExtInfo")
        private java.util.Map < String, ? > activityExtInfo;

        @com.aliyun.core.annotation.NameInMap("CanPromFee")
        private Double canPromFee;

        @com.aliyun.core.annotation.NameInMap("OptionCode")
        private String optionCode;

        @com.aliyun.core.annotation.NameInMap("PromotionName")
        private String promotionName;

        @com.aliyun.core.annotation.NameInMap("PromotionOptionNo")
        private String promotionOptionNo;

        @com.aliyun.core.annotation.NameInMap("PromotionRuleIdList")
        private OptionalPromotionPromotionRuleIdList promotionRuleIdList;

        @com.aliyun.core.annotation.NameInMap("Selected")
        private Boolean selected;

        @com.aliyun.core.annotation.NameInMap("Show")
        private Boolean show;

        @com.aliyun.core.annotation.NameInMap("TargetArticleItemCodes")
        private TargetArticleItemCodes targetArticleItemCodes;

        private OptionalPromotion(Builder builder) {
            this.activityCategory = builder.activityCategory;
            this.activityExtInfo = builder.activityExtInfo;
            this.canPromFee = builder.canPromFee;
            this.optionCode = builder.optionCode;
            this.promotionName = builder.promotionName;
            this.promotionOptionNo = builder.promotionOptionNo;
            this.promotionRuleIdList = builder.promotionRuleIdList;
            this.selected = builder.selected;
            this.show = builder.show;
            this.targetArticleItemCodes = builder.targetArticleItemCodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OptionalPromotion create() {
            return builder().build();
        }

        /**
         * @return activityCategory
         */
        public String getActivityCategory() {
            return this.activityCategory;
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
        public Double getCanPromFee() {
            return this.canPromFee;
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
         * @return promotionRuleIdList
         */
        public OptionalPromotionPromotionRuleIdList getPromotionRuleIdList() {
            return this.promotionRuleIdList;
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

        /**
         * @return targetArticleItemCodes
         */
        public TargetArticleItemCodes getTargetArticleItemCodes() {
            return this.targetArticleItemCodes;
        }

        public static final class Builder {
            private String activityCategory; 
            private java.util.Map < String, ? > activityExtInfo; 
            private Double canPromFee; 
            private String optionCode; 
            private String promotionName; 
            private String promotionOptionNo; 
            private OptionalPromotionPromotionRuleIdList promotionRuleIdList; 
            private Boolean selected; 
            private Boolean show; 
            private TargetArticleItemCodes targetArticleItemCodes; 

            /**
             * <p>The activity type.</p>
             * 
             * <strong>example:</strong>
             * <p>discount</p>
             */
            public Builder activityCategory(String activityCategory) {
                this.activityCategory = activityCategory;
                return this;
            }

            /**
             * <p>The additional activity information.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;activityId&quot;: &quot;1512010241743170&quot;
             * }</p>
             */
            public Builder activityExtInfo(java.util.Map < String, ? > activityExtInfo) {
                this.activityExtInfo = activityExtInfo;
                return this;
            }

            /**
             * <p>The amount that can be deducted by using the coupon.</p>
             * 
             * <strong>example:</strong>
             * <p>4560789</p>
             */
            public Builder canPromFee(Double canPromFee) {
                this.canPromFee = canPromFee;
                return this;
            }

            /**
             * <p>The promotion type.</p>
             * 
             * <strong>example:</strong>
             * <p>wanhua_activity</p>
             */
            public Builder optionCode(String optionCode) {
                this.optionCode = optionCode;
                return this;
            }

            /**
             * <p>The promotion name.</p>
             * 
             * <strong>example:</strong>
             * <p>[Item with price reduction in xxx] ApsaraDB for MongoDB instances of a full range of specifications - xxx</p>
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * <p>The promotion ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1512010241xxxxx</p>
             */
            public Builder promotionOptionNo(String promotionOptionNo) {
                this.promotionOptionNo = promotionOptionNo;
                return this;
            }

            /**
             * <p>The IDs of the rules that correspond to the coupon.</p>
             */
            public Builder promotionRuleIdList(OptionalPromotionPromotionRuleIdList promotionRuleIdList) {
                this.promotionRuleIdList = promotionRuleIdList;
                return this;
            }

            /**
             * <p>Indicates whether</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder selected(Boolean selected) {
                this.selected = selected;
                return this;
            }

            /**
             * <p>Indicates whether the discount is displayed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder show(Boolean show) {
                this.show = show;
                return this;
            }

            /**
             * <p>The specification codes of the product.</p>
             */
            public Builder targetArticleItemCodes(TargetArticleItemCodes targetArticleItemCodes) {
                this.targetArticleItemCodes = targetArticleItemCodes;
                return this;
            }

            public OptionalPromotion build() {
                return new OptionalPromotion(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
    public static class PromDetailListPromDetail extends TeaModel {
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

        private PromDetailListPromDetail(Builder builder) {
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

        public static PromDetailListPromDetail create() {
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
             * <p>The additional activity information.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;activityId&quot;: &quot;1512010241743170&quot;
             * }</p>
             */
            public Builder activityExtInfo(java.util.Map < String, ? > activityExtInfo) {
                this.activityExtInfo = activityExtInfo;
                return this;
            }

            /**
             * <p>The sub-type of the promotion.</p>
             * 
             * <strong>example:</strong>
             * <p>subPrice</p>
             */
            public Builder derivedPromType(String derivedPromType) {
                this.derivedPromType = derivedPromType;
                return this;
            }

            /**
             * <p>The discount amount.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder finalPromFee(Double finalPromFee) {
                this.finalPromFee = finalPromFee;
                return this;
            }

            /**
             * <p>The code of the coupon.</p>
             * 
             * <strong>example:</strong>
             * <p>youhui_quan</p>
             */
            public Builder optionCode(String optionCode) {
                this.optionCode = optionCode;
                return this;
            }

            /**
             * <p>The sub-type of the promotion.</p>
             * 
             * <strong>example:</strong>
             * <p>discount</p>
             */
            public Builder promType(String promType) {
                this.promType = promType;
                return this;
            }

            /**
             * <p>The coupon code.</p>
             * 
             * <strong>example:</strong>
             * <p>ali-wood</p>
             */
            public Builder promotionCode(String promotionCode) {
                this.promotionCode = promotionCode;
                return this;
            }

            /**
             * <p>The promotion ID.</p>
             * 
             * <strong>example:</strong>
             * <p>233xxxxx</p>
             */
            public Builder promotionId(Long promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * <p>The name of the promotional activity.</p>
             * 
             * <strong>example:</strong>
             * <p>[Item with price reduction in x xxxx] ApsaraDB for MongoDB instances of a full range of specifications - xxxxx</p>
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            public PromDetailListPromDetail build() {
                return new PromDetailListPromDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
    public static class SubOrderPromDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PromDetail")
        private java.util.List < PromDetailListPromDetail> promDetail;

        private SubOrderPromDetailList(Builder builder) {
            this.promDetail = builder.promDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubOrderPromDetailList create() {
            return builder().build();
        }

        /**
         * @return promDetail
         */
        public java.util.List < PromDetailListPromDetail> getPromDetail() {
            return this.promDetail;
        }

        public static final class Builder {
            private java.util.List < PromDetailListPromDetail> promDetail; 

            /**
             * PromDetail.
             */
            public Builder promDetail(java.util.List < PromDetailListPromDetail> promDetail) {
                this.promDetail = promDetail;
                return this;
            }

            public SubOrderPromDetailList build() {
                return new SubOrderPromDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("IsNewOfficialActivity")
        private String isNewOfficialActivity;

        @com.aliyun.core.annotation.NameInMap("ModuleInstance")
        private SubOrderModuleInstance moduleInstance;

        @com.aliyun.core.annotation.NameInMap("OptionalPromotions")
        private OptionalPromotions optionalPromotions;

        @com.aliyun.core.annotation.NameInMap("OriginalAmount")
        private String originalAmount;

        @com.aliyun.core.annotation.NameInMap("PromDetailList")
        private SubOrderPromDetailList promDetailList;

        @com.aliyun.core.annotation.NameInMap("RuleIds")
        private SubOrderRuleIds ruleIds;

        @com.aliyun.core.annotation.NameInMap("StandDiscountPrice")
        private Double standDiscountPrice;

        @com.aliyun.core.annotation.NameInMap("StandPrice")
        private Double standPrice;

        @com.aliyun.core.annotation.NameInMap("TradeAmount")
        private String tradeAmount;

        private SubOrder(Builder builder) {
            this.contractActivity = builder.contractActivity;
            this.depreciateInfo = builder.depreciateInfo;
            this.discountAmount = builder.discountAmount;
            this.instanceId = builder.instanceId;
            this.isContractActivity = builder.isContractActivity;
            this.isNewOfficialActivity = builder.isNewOfficialActivity;
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
         * @return isNewOfficialActivity
         */
        public String getIsNewOfficialActivity() {
            return this.isNewOfficialActivity;
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
        public SubOrderPromDetailList getPromDetailList() {
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
        public Double getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        /**
         * @return standPrice
         */
        public Double getStandPrice() {
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
            private String isNewOfficialActivity; 
            private SubOrderModuleInstance moduleInstance; 
            private OptionalPromotions optionalPromotions; 
            private String originalAmount; 
            private SubOrderPromDetailList promDetailList; 
            private SubOrderRuleIds ruleIds; 
            private Double standDiscountPrice; 
            private Double standPrice; 
            private String tradeAmount; 

            /**
             * <p>Indicates whether the contract promotion is hit.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder contractActivity(Boolean contractActivity) {
                this.contractActivity = contractActivity;
                return this;
            }

            /**
             * <p>The price reduction information.</p>
             */
            public Builder depreciateInfo(SubOrderDepreciateInfo depreciateInfo) {
                this.depreciateInfo = depreciateInfo;
                return this;
            }

            /**
             * <p>The discount amount of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>322.4</p>
             */
            public Builder discountAmount(String discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dds-bp1b6e54e7cc****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the contract promotion is hit.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isContractActivity(Boolean isContractActivity) {
                this.isContractActivity = isContractActivity;
                return this;
            }

            /**
             * <p>Indicates whether the discount is hit.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isNewOfficialActivity(String isNewOfficialActivity) {
                this.isNewOfficialActivity = isNewOfficialActivity;
                return this;
            }

            /**
             * <p>The configuration item of the instance in the order.</p>
             */
            public Builder moduleInstance(SubOrderModuleInstance moduleInstance) {
                this.moduleInstance = moduleInstance;
                return this;
            }

            /**
             * <p>The promotional options that can be configured.</p>
             */
            public Builder optionalPromotions(OptionalPromotions optionalPromotions) {
                this.optionalPromotions = optionalPromotions;
                return this;
            }

            /**
             * <p>The original price of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>322.4</p>
             */
            public Builder originalAmount(String originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            /**
             * <p>The promotion details.</p>
             */
            public Builder promDetailList(SubOrderPromDetailList promDetailList) {
                this.promDetailList = promDetailList;
                return this;
            }

            /**
             * <p>The activity rules.</p>
             */
            public Builder ruleIds(SubOrderRuleIds ruleIds) {
                this.ruleIds = ruleIds;
                return this;
            }

            /**
             * <p>The discount.</p>
             * 
             * <strong>example:</strong>
             * <p>8687</p>
             */
            public Builder standDiscountPrice(Double standDiscountPrice) {
                this.standDiscountPrice = standDiscountPrice;
                return this;
            }

            /**
             * <p>The discount.</p>
             * 
             * <strong>example:</strong>
             * <p>62982</p>
             */
            public Builder standPrice(Double standPrice) {
                this.standPrice = standPrice;
                return this;
            }

            /**
             * <p>The actual price of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link DescribePriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceResponseBody</p>
     */
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
