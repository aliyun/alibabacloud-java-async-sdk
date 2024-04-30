// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePriceResponseBody</p>
 */
public class DescribePriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderParams")
    private String orderParams;

    @com.aliyun.core.annotation.NameInMap("PriceInfo")
    private PriceInfo priceInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private Rules rules;

    @com.aliyun.core.annotation.NameInMap("ServerlessPrice")
    private ServerlessPrice serverlessPrice;

    @com.aliyun.core.annotation.NameInMap("ShowDiscount")
    private Boolean showDiscount;

    @com.aliyun.core.annotation.NameInMap("TradeMaxRCUAmount")
    private Float tradeMaxRCUAmount;

    @com.aliyun.core.annotation.NameInMap("TradeMinRCUAmount")
    private Float tradeMinRCUAmount;

    private DescribePriceResponseBody(Builder builder) {
        this.orderParams = builder.orderParams;
        this.priceInfo = builder.priceInfo;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
        this.serverlessPrice = builder.serverlessPrice;
        this.showDiscount = builder.showDiscount;
        this.tradeMaxRCUAmount = builder.tradeMaxRCUAmount;
        this.tradeMinRCUAmount = builder.tradeMinRCUAmount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePriceResponseBody create() {
        return builder().build();
    }

    /**
     * @return orderParams
     */
    public String getOrderParams() {
        return this.orderParams;
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
     * @return serverlessPrice
     */
    public ServerlessPrice getServerlessPrice() {
        return this.serverlessPrice;
    }

    /**
     * @return showDiscount
     */
    public Boolean getShowDiscount() {
        return this.showDiscount;
    }

    /**
     * @return tradeMaxRCUAmount
     */
    public Float getTradeMaxRCUAmount() {
        return this.tradeMaxRCUAmount;
    }

    /**
     * @return tradeMinRCUAmount
     */
    public Float getTradeMinRCUAmount() {
        return this.tradeMinRCUAmount;
    }

    public static final class Builder {
        private String orderParams; 
        private PriceInfo priceInfo; 
        private String requestId; 
        private Rules rules; 
        private ServerlessPrice serverlessPrice; 
        private Boolean showDiscount; 
        private Float tradeMaxRCUAmount; 
        private Float tradeMinRCUAmount; 

        /**
         * OrderParams.
         */
        public Builder orderParams(String orderParams) {
            this.orderParams = orderParams;
            return this;
        }

        /**
         * The price information.
         */
        public Builder priceInfo(PriceInfo priceInfo) {
            this.priceInfo = priceInfo;
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
         * The details of the promotion rule.
         */
        public Builder rules(Rules rules) {
            this.rules = rules;
            return this;
        }

        /**
         * ServerlessPrice.
         */
        public Builder serverlessPrice(ServerlessPrice serverlessPrice) {
            this.serverlessPrice = serverlessPrice;
            return this;
        }

        /**
         * Indicates whether discounts can be used.
         */
        public Builder showDiscount(Boolean showDiscount) {
            this.showDiscount = showDiscount;
            return this;
        }

        /**
         * The estimated hourly fee that is calculated based on the maximum number of RCUs.
         */
        public Builder tradeMaxRCUAmount(Float tradeMaxRCUAmount) {
            this.tradeMaxRCUAmount = tradeMaxRCUAmount;
            return this;
        }

        /**
         * The estimated hourly fee that is calculated based on the minimum number of RCUs.
         */
        public Builder tradeMinRCUAmount(Float tradeMinRCUAmount) {
            this.tradeMinRCUAmount = tradeMinRCUAmount;
            return this;
        }

        public DescribePriceResponseBody build() {
            return new DescribePriceResponseBody(this);
        } 

    } 

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

            /**
             * The returned message.
             */
            public Builder checkErrMsg(String checkErrMsg) {
                this.checkErrMsg = checkErrMsg;
                return this;
            }

            /**
             * The error code that is returned.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * Indicates whether the request was successful.
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
             * Indicates whether the coupon is selected.
             */
            public Builder isSelected(String isSelected) {
                this.isSelected = isSelected;
                return this;
            }

            /**
             * The name of the coupon.
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
    public static class PriceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityInfo")
        private ActivityInfo activityInfo;

        @com.aliyun.core.annotation.NameInMap("Coupons")
        private Coupons coupons;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Float discountPrice;

        @com.aliyun.core.annotation.NameInMap("OrderLines")
        private String orderLines;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Float originalPrice;

        @com.aliyun.core.annotation.NameInMap("RuleIds")
        private RuleIds ruleIds;

        @com.aliyun.core.annotation.NameInMap("TradeMaxRCUAmount")
        private Float tradeMaxRCUAmount;

        @com.aliyun.core.annotation.NameInMap("TradeMinRCUAmount")
        private Float tradeMinRCUAmount;

        @com.aliyun.core.annotation.NameInMap("TradePrice")
        private Float tradePrice;

        private PriceInfo(Builder builder) {
            this.activityInfo = builder.activityInfo;
            this.coupons = builder.coupons;
            this.currency = builder.currency;
            this.discountPrice = builder.discountPrice;
            this.orderLines = builder.orderLines;
            this.originalPrice = builder.originalPrice;
            this.ruleIds = builder.ruleIds;
            this.tradeMaxRCUAmount = builder.tradeMaxRCUAmount;
            this.tradeMinRCUAmount = builder.tradeMinRCUAmount;
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
         * @return orderLines
         */
        public String getOrderLines() {
            return this.orderLines;
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
         * @return tradeMaxRCUAmount
         */
        public Float getTradeMaxRCUAmount() {
            return this.tradeMaxRCUAmount;
        }

        /**
         * @return tradeMinRCUAmount
         */
        public Float getTradeMinRCUAmount() {
            return this.tradeMinRCUAmount;
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
            private String orderLines; 
            private Float originalPrice; 
            private RuleIds ruleIds; 
            private Float tradeMaxRCUAmount; 
            private Float tradeMinRCUAmount; 
            private Float tradePrice; 

            /**
             * The information about the promotion.
             */
            public Builder activityInfo(ActivityInfo activityInfo) {
                this.activityInfo = activityInfo;
                return this;
            }

            /**
             * The information about the coupon.
             */
            public Builder coupons(Coupons coupons) {
                this.coupons = coupons;
                return this;
            }

            /**
             * The currency unit.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * The discount.
             */
            public Builder discountPrice(Float discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * OrderLines.
             */
            public Builder orderLines(String orderLines) {
                this.orderLines = orderLines;
                return this;
            }

            /**
             * The original price.
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * An array that consists of the ID of the promotion rule.
             */
            public Builder ruleIds(RuleIds ruleIds) {
                this.ruleIds = ruleIds;
                return this;
            }

            /**
             * The estimated hourly fee that is calculated based on the maximum number of RCUs.
             */
            public Builder tradeMaxRCUAmount(Float tradeMaxRCUAmount) {
                this.tradeMaxRCUAmount = tradeMaxRCUAmount;
                return this;
            }

            /**
             * The estimated hourly fee that is calculated based on the minimum number of RCUs.
             */
            public Builder tradeMinRCUAmount(Float tradeMinRCUAmount) {
                this.tradeMinRCUAmount = tradeMinRCUAmount;
                return this;
            }

            /**
             * The transaction price, which is equal to the original price minus the discount.
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

            /**
             * The description of the promotion rule.
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
             * The ID of the promotion rule.
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
    public static class ServerlessPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RCUDiscountMaxAmount")
        private Float RCUDiscountMaxAmount;

        @com.aliyun.core.annotation.NameInMap("RCUDiscountMinAmount")
        private Float RCUDiscountMinAmount;

        @com.aliyun.core.annotation.NameInMap("RCUOriginalMaxAmount")
        private Float RCUOriginalMaxAmount;

        @com.aliyun.core.annotation.NameInMap("RCUOriginalMinAmount")
        private Float RCUOriginalMinAmount;

        @com.aliyun.core.annotation.NameInMap("StorageOriginalAmount")
        private Float storageOriginalAmount;

        @com.aliyun.core.annotation.NameInMap("TotalOriginalMaxAmount")
        private Float totalOriginalMaxAmount;

        @com.aliyun.core.annotation.NameInMap("TotalOriginalMinAmount")
        private Float totalOriginalMinAmount;

        @com.aliyun.core.annotation.NameInMap("TradeMaxRCUAmount")
        private Float tradeMaxRCUAmount;

        @com.aliyun.core.annotation.NameInMap("TradeMinRCUAmount")
        private Float tradeMinRCUAmount;

        @com.aliyun.core.annotation.NameInMap("storageDiscountAmount")
        private Float storageDiscountAmount;

        private ServerlessPrice(Builder builder) {
            this.RCUDiscountMaxAmount = builder.RCUDiscountMaxAmount;
            this.RCUDiscountMinAmount = builder.RCUDiscountMinAmount;
            this.RCUOriginalMaxAmount = builder.RCUOriginalMaxAmount;
            this.RCUOriginalMinAmount = builder.RCUOriginalMinAmount;
            this.storageOriginalAmount = builder.storageOriginalAmount;
            this.totalOriginalMaxAmount = builder.totalOriginalMaxAmount;
            this.totalOriginalMinAmount = builder.totalOriginalMinAmount;
            this.tradeMaxRCUAmount = builder.tradeMaxRCUAmount;
            this.tradeMinRCUAmount = builder.tradeMinRCUAmount;
            this.storageDiscountAmount = builder.storageDiscountAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerlessPrice create() {
            return builder().build();
        }

        /**
         * @return RCUDiscountMaxAmount
         */
        public Float getRCUDiscountMaxAmount() {
            return this.RCUDiscountMaxAmount;
        }

        /**
         * @return RCUDiscountMinAmount
         */
        public Float getRCUDiscountMinAmount() {
            return this.RCUDiscountMinAmount;
        }

        /**
         * @return RCUOriginalMaxAmount
         */
        public Float getRCUOriginalMaxAmount() {
            return this.RCUOriginalMaxAmount;
        }

        /**
         * @return RCUOriginalMinAmount
         */
        public Float getRCUOriginalMinAmount() {
            return this.RCUOriginalMinAmount;
        }

        /**
         * @return storageOriginalAmount
         */
        public Float getStorageOriginalAmount() {
            return this.storageOriginalAmount;
        }

        /**
         * @return totalOriginalMaxAmount
         */
        public Float getTotalOriginalMaxAmount() {
            return this.totalOriginalMaxAmount;
        }

        /**
         * @return totalOriginalMinAmount
         */
        public Float getTotalOriginalMinAmount() {
            return this.totalOriginalMinAmount;
        }

        /**
         * @return tradeMaxRCUAmount
         */
        public Float getTradeMaxRCUAmount() {
            return this.tradeMaxRCUAmount;
        }

        /**
         * @return tradeMinRCUAmount
         */
        public Float getTradeMinRCUAmount() {
            return this.tradeMinRCUAmount;
        }

        /**
         * @return storageDiscountAmount
         */
        public Float getStorageDiscountAmount() {
            return this.storageDiscountAmount;
        }

        public static final class Builder {
            private Float RCUDiscountMaxAmount; 
            private Float RCUDiscountMinAmount; 
            private Float RCUOriginalMaxAmount; 
            private Float RCUOriginalMinAmount; 
            private Float storageOriginalAmount; 
            private Float totalOriginalMaxAmount; 
            private Float totalOriginalMinAmount; 
            private Float tradeMaxRCUAmount; 
            private Float tradeMinRCUAmount; 
            private Float storageDiscountAmount; 

            /**
             * RCUDiscountMaxAmount.
             */
            public Builder RCUDiscountMaxAmount(Float RCUDiscountMaxAmount) {
                this.RCUDiscountMaxAmount = RCUDiscountMaxAmount;
                return this;
            }

            /**
             * RCUDiscountMinAmount.
             */
            public Builder RCUDiscountMinAmount(Float RCUDiscountMinAmount) {
                this.RCUDiscountMinAmount = RCUDiscountMinAmount;
                return this;
            }

            /**
             * RCUOriginalMaxAmount.
             */
            public Builder RCUOriginalMaxAmount(Float RCUOriginalMaxAmount) {
                this.RCUOriginalMaxAmount = RCUOriginalMaxAmount;
                return this;
            }

            /**
             * RCUOriginalMinAmount.
             */
            public Builder RCUOriginalMinAmount(Float RCUOriginalMinAmount) {
                this.RCUOriginalMinAmount = RCUOriginalMinAmount;
                return this;
            }

            /**
             * StorageOriginalAmount.
             */
            public Builder storageOriginalAmount(Float storageOriginalAmount) {
                this.storageOriginalAmount = storageOriginalAmount;
                return this;
            }

            /**
             * TotalOriginalMaxAmount.
             */
            public Builder totalOriginalMaxAmount(Float totalOriginalMaxAmount) {
                this.totalOriginalMaxAmount = totalOriginalMaxAmount;
                return this;
            }

            /**
             * TotalOriginalMinAmount.
             */
            public Builder totalOriginalMinAmount(Float totalOriginalMinAmount) {
                this.totalOriginalMinAmount = totalOriginalMinAmount;
                return this;
            }

            /**
             * The estimated hourly fee that is calculated based on the maximum number of RCUs.
             */
            public Builder tradeMaxRCUAmount(Float tradeMaxRCUAmount) {
                this.tradeMaxRCUAmount = tradeMaxRCUAmount;
                return this;
            }

            /**
             * The estimated hourly fee that is calculated based on the minimum number of RCUs.
             */
            public Builder tradeMinRCUAmount(Float tradeMinRCUAmount) {
                this.tradeMinRCUAmount = tradeMinRCUAmount;
                return this;
            }

            /**
             * storageDiscountAmount.
             */
            public Builder storageDiscountAmount(Float storageDiscountAmount) {
                this.storageDiscountAmount = storageDiscountAmount;
                return this;
            }

            public ServerlessPrice build() {
                return new ServerlessPrice(this);
            } 

        } 

    }
}
