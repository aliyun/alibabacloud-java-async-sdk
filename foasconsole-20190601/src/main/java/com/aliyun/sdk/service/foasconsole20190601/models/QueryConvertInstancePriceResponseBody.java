// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryConvertInstancePriceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryConvertInstancePriceResponseBody</p>
 */
public class QueryConvertInstancePriceResponseBody extends TeaModel {
    @NameInMap("PriceInfo")
    private PriceInfo priceInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryConvertInstancePriceResponseBody(Builder builder) {
        this.priceInfo = builder.priceInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryConvertInstancePriceResponseBody create() {
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
         * 价格信息，包括价格和优惠规则。
         */
        public Builder priceInfo(PriceInfo priceInfo) {
            this.priceInfo = priceInfo;
            return this;
        }

        /**
         * 请求id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 是否成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryConvertInstancePriceResponseBody build() {
            return new QueryConvertInstancePriceResponseBody(this);
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
             * 优惠券描述
             */
            public Builder promotionDesc(String promotionDesc) {
                this.promotionDesc = promotionDesc;
                return this;
            }

            /**
             * 优惠券名称
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * 优惠券编号
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
             * 活动规则描述。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 活动ID。
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

        @NameInMap("DiscountAmount")
        private Float discountAmount;

        @NameInMap("Message")
        private String message;

        @NameInMap("OptionalPromotions")
        private java.util.List < OptionalPromotions> optionalPromotions;

        @NameInMap("OriginalAmount")
        private Float originalAmount;

        @NameInMap("Rules")
        private java.util.List < Rules> rules;

        @NameInMap("TradeAmount")
        private Float tradeAmount;

        private PriceInfo(Builder builder) {
            this.code = builder.code;
            this.currency = builder.currency;
            this.discountAmount = builder.discountAmount;
            this.message = builder.message;
            this.optionalPromotions = builder.optionalPromotions;
            this.originalAmount = builder.originalAmount;
            this.rules = builder.rules;
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
         * @return discountAmount
         */
        public Float getDiscountAmount() {
            return this.discountAmount;
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
         * @return tradeAmount
         */
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

        public static final class Builder {
            private String code; 
            private String currency; 
            private Float discountAmount; 
            private String message; 
            private java.util.List < OptionalPromotions> optionalPromotions; 
            private Float originalAmount; 
            private java.util.List < Rules> rules; 
            private Float tradeAmount; 

            /**
             * 错误码
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * 货币单位。
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * 折扣
             */
            public Builder discountAmount(Float discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * 错误信息
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
             * 原价
             */
            public Builder originalAmount(Float originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            /**
             * 活动规则。
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * 最终价，为原价减去折扣。
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
