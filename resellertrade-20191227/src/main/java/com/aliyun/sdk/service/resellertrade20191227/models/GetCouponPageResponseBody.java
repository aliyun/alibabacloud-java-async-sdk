// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resellertrade20191227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCouponPageResponseBody} extends {@link TeaModel}
 *
 * <p>GetCouponPageResponseBody</p>
 */
public class GetCouponPageResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ContextMap")
    private java.util.Map < String, ? > contextMap;

    @NameInMap("Count")
    private Integer count;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private GetCouponPageResponseBody(Builder builder) {
        this.code = builder.code;
        this.contextMap = builder.contextMap;
        this.count = builder.count;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCouponPageResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return contextMap
     */
    public java.util.Map < String, ? > getContextMap() {
        return this.contextMap;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.Map < String, ? > contextMap; 
        private Integer count; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ContextMap.
         */
        public Builder contextMap(java.util.Map < String, ? > contextMap) {
            this.contextMap = contextMap;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetCouponPageResponseBody build() {
            return new GetCouponPageResponseBody(this);
        } 

    } 

    public static class Currency extends TeaModel {
        @NameInMap("CurrencyCode")
        private String currencyCode;

        private Currency(Builder builder) {
            this.currencyCode = builder.currencyCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Currency create() {
            return builder().build();
        }

        /**
         * @return currencyCode
         */
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public static final class Builder {
            private String currencyCode; 

            /**
             * CurrencyCode.
             */
            public Builder currencyCode(String currencyCode) {
                this.currencyCode = currencyCode;
                return this;
            }

            public Currency build() {
                return new Currency(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Amount")
        private Double amount;

        @NameInMap("CertainMoney")
        private Double certainMoney;

        @NameInMap("CouponId")
        private Long couponId;

        @NameInMap("CouponType")
        private String couponType;

        @NameInMap("Currency")
        private Currency currency;

        @NameInMap("Description")
        private String description;

        @NameInMap("DiscountRate")
        private Double discountRate;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("FrozenAmount")
        private Double frozenAmount;

        @NameInMap("FrozenCount")
        private Integer frozenCount;

        @NameInMap("PromotionId")
        private Long promotionId;

        @NameInMap("SellerId")
        private Long sellerId;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TemplateId")
        private Long templateId;

        @NameInMap("UniversalType")
        private String universalType;

        @NameInMap("UpperLimit")
        private Double upperLimit;

        @NameInMap("UsageCount")
        private Integer usageCount;

        @NameInMap("UsedAmount")
        private Double usedAmount;

        @NameInMap("UsedCount")
        private Integer usedCount;

        @NameInMap("UserId")
        private Long userId;

        private Data(Builder builder) {
            this.amount = builder.amount;
            this.certainMoney = builder.certainMoney;
            this.couponId = builder.couponId;
            this.couponType = builder.couponType;
            this.currency = builder.currency;
            this.description = builder.description;
            this.discountRate = builder.discountRate;
            this.endTime = builder.endTime;
            this.frozenAmount = builder.frozenAmount;
            this.frozenCount = builder.frozenCount;
            this.promotionId = builder.promotionId;
            this.sellerId = builder.sellerId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.templateId = builder.templateId;
            this.universalType = builder.universalType;
            this.upperLimit = builder.upperLimit;
            this.usageCount = builder.usageCount;
            this.usedAmount = builder.usedAmount;
            this.usedCount = builder.usedCount;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Double getAmount() {
            return this.amount;
        }

        /**
         * @return certainMoney
         */
        public Double getCertainMoney() {
            return this.certainMoney;
        }

        /**
         * @return couponId
         */
        public Long getCouponId() {
            return this.couponId;
        }

        /**
         * @return couponType
         */
        public String getCouponType() {
            return this.couponType;
        }

        /**
         * @return currency
         */
        public Currency getCurrency() {
            return this.currency;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return discountRate
         */
        public Double getDiscountRate() {
            return this.discountRate;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return frozenAmount
         */
        public Double getFrozenAmount() {
            return this.frozenAmount;
        }

        /**
         * @return frozenCount
         */
        public Integer getFrozenCount() {
            return this.frozenCount;
        }

        /**
         * @return promotionId
         */
        public Long getPromotionId() {
            return this.promotionId;
        }

        /**
         * @return sellerId
         */
        public Long getSellerId() {
            return this.sellerId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return universalType
         */
        public String getUniversalType() {
            return this.universalType;
        }

        /**
         * @return upperLimit
         */
        public Double getUpperLimit() {
            return this.upperLimit;
        }

        /**
         * @return usageCount
         */
        public Integer getUsageCount() {
            return this.usageCount;
        }

        /**
         * @return usedAmount
         */
        public Double getUsedAmount() {
            return this.usedAmount;
        }

        /**
         * @return usedCount
         */
        public Integer getUsedCount() {
            return this.usedCount;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Double amount; 
            private Double certainMoney; 
            private Long couponId; 
            private String couponType; 
            private Currency currency; 
            private String description; 
            private Double discountRate; 
            private String endTime; 
            private Double frozenAmount; 
            private Integer frozenCount; 
            private Long promotionId; 
            private Long sellerId; 
            private String startTime; 
            private String status; 
            private Long templateId; 
            private String universalType; 
            private Double upperLimit; 
            private Integer usageCount; 
            private Double usedAmount; 
            private Integer usedCount; 
            private Long userId; 

            /**
             * Amount.
             */
            public Builder amount(Double amount) {
                this.amount = amount;
                return this;
            }

            /**
             * CertainMoney.
             */
            public Builder certainMoney(Double certainMoney) {
                this.certainMoney = certainMoney;
                return this;
            }

            /**
             * CouponId.
             */
            public Builder couponId(Long couponId) {
                this.couponId = couponId;
                return this;
            }

            /**
             * CouponType.
             */
            public Builder couponType(String couponType) {
                this.couponType = couponType;
                return this;
            }

            /**
             * Currency.
             */
            public Builder currency(Currency currency) {
                this.currency = currency;
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
             * DiscountRate.
             */
            public Builder discountRate(Double discountRate) {
                this.discountRate = discountRate;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * FrozenAmount.
             */
            public Builder frozenAmount(Double frozenAmount) {
                this.frozenAmount = frozenAmount;
                return this;
            }

            /**
             * FrozenCount.
             */
            public Builder frozenCount(Integer frozenCount) {
                this.frozenCount = frozenCount;
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
             * SellerId.
             */
            public Builder sellerId(Long sellerId) {
                this.sellerId = sellerId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * UniversalType.
             */
            public Builder universalType(String universalType) {
                this.universalType = universalType;
                return this;
            }

            /**
             * UpperLimit.
             */
            public Builder upperLimit(Double upperLimit) {
                this.upperLimit = upperLimit;
                return this;
            }

            /**
             * UsageCount.
             */
            public Builder usageCount(Integer usageCount) {
                this.usageCount = usageCount;
                return this;
            }

            /**
             * UsedAmount.
             */
            public Builder usedAmount(Double usedAmount) {
                this.usedAmount = usedAmount;
                return this;
            }

            /**
             * UsedCount.
             */
            public Builder usedCount(Integer usedCount) {
                this.usedCount = usedCount;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
