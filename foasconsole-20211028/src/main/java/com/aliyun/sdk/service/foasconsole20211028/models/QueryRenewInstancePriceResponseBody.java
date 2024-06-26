// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRenewInstancePriceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRenewInstancePriceResponseBody</p>
 */
public class QueryRenewInstancePriceResponseBody extends TeaModel {
    @NameInMap("PriceInfo")
    private PriceInfo priceInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryRenewInstancePriceResponseBody(Builder builder) {
        this.priceInfo = builder.priceInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRenewInstancePriceResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private PriceInfo priceInfo; 
        private String requestId; 
        private Boolean success; 

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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryRenewInstancePriceResponseBody build() {
            return new QueryRenewInstancePriceResponseBody(this);
        } 

    } 

    public static class DepreciateInfo extends TeaModel {
        @NameInMap("CheapRate")
        private String cheapRate;

        @NameInMap("CheapStandAmount")
        private String cheapStandAmount;

        @NameInMap("IsShow")
        private Boolean isShow;

        @NameInMap("MonthPrice")
        private String monthPrice;

        @NameInMap("OriginalStandAmount")
        private String originalStandAmount;

        @NameInMap("StartTime")
        private String startTime;

        private DepreciateInfo(Builder builder) {
            this.cheapRate = builder.cheapRate;
            this.cheapStandAmount = builder.cheapStandAmount;
            this.isShow = builder.isShow;
            this.monthPrice = builder.monthPrice;
            this.originalStandAmount = builder.originalStandAmount;
            this.startTime = builder.startTime;
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
        public String getCheapRate() {
            return this.cheapRate;
        }

        /**
         * @return cheapStandAmount
         */
        public String getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        /**
         * @return isShow
         */
        public Boolean getIsShow() {
            return this.isShow;
        }

        /**
         * @return monthPrice
         */
        public String getMonthPrice() {
            return this.monthPrice;
        }

        /**
         * @return originalStandAmount
         */
        public String getOriginalStandAmount() {
            return this.originalStandAmount;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String cheapRate; 
            private String cheapStandAmount; 
            private Boolean isShow; 
            private String monthPrice; 
            private String originalStandAmount; 
            private String startTime; 

            /**
             * CheapRate.
             */
            public Builder cheapRate(String cheapRate) {
                this.cheapRate = cheapRate;
                return this;
            }

            /**
             * CheapStandAmount.
             */
            public Builder cheapStandAmount(String cheapStandAmount) {
                this.cheapStandAmount = cheapStandAmount;
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
             * MonthPrice.
             */
            public Builder monthPrice(String monthPrice) {
                this.monthPrice = monthPrice;
                return this;
            }

            /**
             * OriginalStandAmount.
             */
            public Builder originalStandAmount(String originalStandAmount) {
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

            public DepreciateInfo build() {
                return new DepreciateInfo(this);
            } 

        } 

    }
    public static class OptionalPromotions extends TeaModel {
        @NameInMap("PromotionDesc")
        private String promotionDesc;

        @NameInMap("PromotionName")
        private String promotionName;

        @NameInMap("PromotionOptionNo")
        private String promotionOptionNo;

        @NameInMap("Selected")
        private Boolean selected;

        private OptionalPromotions(Builder builder) {
            this.promotionDesc = builder.promotionDesc;
            this.promotionName = builder.promotionName;
            this.promotionOptionNo = builder.promotionOptionNo;
            this.selected = builder.selected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OptionalPromotions create() {
            return builder().build();
        }

        /**
         * @return promotionDesc
         */
        public String getPromotionDesc() {
            return this.promotionDesc;
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

        public static final class Builder {
            private String promotionDesc; 
            private String promotionName; 
            private String promotionOptionNo; 
            private Boolean selected; 

            /**
             * PromotionDesc.
             */
            public Builder promotionDesc(String promotionDesc) {
                this.promotionDesc = promotionDesc;
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

            public OptionalPromotions build() {
                return new OptionalPromotions(this);
            } 

        } 

    }
    public static class Rules extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("RuleId")
        private Long ruleId;

        private Rules(Builder builder) {
            this.description = builder.description;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    public static class PriceInfo extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Currency")
        private String currency;

        @NameInMap("DepreciateInfo")
        private DepreciateInfo depreciateInfo;

        @NameInMap("DiscountAmount")
        private Float discountAmount;

        @NameInMap("IsContractActivity")
        private Boolean isContractActivity;

        @NameInMap("Message")
        private String message;

        @NameInMap("OptionalPromotions")
        private java.util.List < OptionalPromotions> optionalPromotions;

        @NameInMap("OriginalAmount")
        private Float originalAmount;

        @NameInMap("Rules")
        private java.util.List < Rules> rules;

        @NameInMap("StandDiscountPrice")
        private String standDiscountPrice;

        @NameInMap("StandPrice")
        private String standPrice;

        @NameInMap("TradeAmount")
        private Float tradeAmount;

        private PriceInfo(Builder builder) {
            this.code = builder.code;
            this.currency = builder.currency;
            this.depreciateInfo = builder.depreciateInfo;
            this.discountAmount = builder.discountAmount;
            this.isContractActivity = builder.isContractActivity;
            this.message = builder.message;
            this.optionalPromotions = builder.optionalPromotions;
            this.originalAmount = builder.originalAmount;
            this.rules = builder.rules;
            this.standDiscountPrice = builder.standDiscountPrice;
            this.standPrice = builder.standPrice;
            this.tradeAmount = builder.tradeAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceInfo create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
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
        public Float getDiscountAmount() {
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
        public java.util.List < OptionalPromotions> getOptionalPromotions() {
            return this.optionalPromotions;
        }

        /**
         * @return originalAmount
         */
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        /**
         * @return rules
         */
        public java.util.List < Rules> getRules() {
            return this.rules;
        }

        /**
         * @return standDiscountPrice
         */
        public String getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        /**
         * @return standPrice
         */
        public String getStandPrice() {
            return this.standPrice;
        }

        /**
         * @return tradeAmount
         */
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

        public static final class Builder {
            private String code; 
            private String currency; 
            private DepreciateInfo depreciateInfo; 
            private Float discountAmount; 
            private Boolean isContractActivity; 
            private String message; 
            private java.util.List < OptionalPromotions> optionalPromotions; 
            private Float originalAmount; 
            private java.util.List < Rules> rules; 
            private String standDiscountPrice; 
            private String standPrice; 
            private Float tradeAmount; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * DepreciateInfo.
             */
            public Builder depreciateInfo(DepreciateInfo depreciateInfo) {
                this.depreciateInfo = depreciateInfo;
                return this;
            }

            /**
             * DiscountAmount.
             */
            public Builder discountAmount(Float discountAmount) {
                this.discountAmount = discountAmount;
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
             * OptionalPromotions.
             */
            public Builder optionalPromotions(java.util.List < OptionalPromotions> optionalPromotions) {
                this.optionalPromotions = optionalPromotions;
                return this;
            }

            /**
             * OriginalAmount.
             */
            public Builder originalAmount(Float originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            /**
             * Rules.
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * StandDiscountPrice.
             */
            public Builder standDiscountPrice(String standDiscountPrice) {
                this.standDiscountPrice = standDiscountPrice;
                return this;
            }

            /**
             * StandPrice.
             */
            public Builder standPrice(String standPrice) {
                this.standPrice = standPrice;
                return this;
            }

            /**
             * TradeAmount.
             */
            public Builder tradeAmount(Float tradeAmount) {
                this.tradeAmount = tradeAmount;
                return this;
            }

            public PriceInfo build() {
                return new PriceInfo(this);
            } 

        } 

    }
}
