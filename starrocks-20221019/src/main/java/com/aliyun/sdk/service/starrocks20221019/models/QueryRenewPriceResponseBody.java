// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link QueryRenewPriceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRenewPriceResponseBody</p>
 */
public class QueryRenewPriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryRenewPriceResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRenewPriceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryRenewPriceResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Response data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParams</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>32A44F0D-BFF6-5664-999A-218BBDE74XXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryRenewPriceResponseBody build() {
            return new QueryRenewPriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryRenewPriceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRenewPriceResponseBody</p>
     */
    public static class DepreciateInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheapRate")
        private Float cheapRate;

        @com.aliyun.core.annotation.NameInMap("CheapStandAmount")
        private Float cheapStandAmount;

        @com.aliyun.core.annotation.NameInMap("IsShow")
        private Boolean isShow;

        @com.aliyun.core.annotation.NameInMap("OriginalStandAmount")
        private Float originalStandAmount;

        private DepreciateInfo(Builder builder) {
            this.cheapRate = builder.cheapRate;
            this.cheapStandAmount = builder.cheapStandAmount;
            this.isShow = builder.isShow;
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
        public Float getCheapRate() {
            return this.cheapRate;
        }

        /**
         * @return cheapStandAmount
         */
        public Float getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        /**
         * @return isShow
         */
        public Boolean getIsShow() {
            return this.isShow;
        }

        /**
         * @return originalStandAmount
         */
        public Float getOriginalStandAmount() {
            return this.originalStandAmount;
        }

        public static final class Builder {
            private Float cheapRate; 
            private Float cheapStandAmount; 
            private Boolean isShow; 
            private Float originalStandAmount; 

            private Builder() {
            } 

            private Builder(DepreciateInfo model) {
                this.cheapRate = model.cheapRate;
                this.cheapStandAmount = model.cheapStandAmount;
                this.isShow = model.isShow;
                this.originalStandAmount = model.originalStandAmount;
            } 

            /**
             * <p>Discount rate.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cheapRate(Float cheapRate) {
                this.cheapRate = cheapRate;
                return this;
            }

            /**
             * <p>Total official price after discount.</p>
             * 
             * <strong>example:</strong>
             * <p>9812</p>
             */
            public Builder cheapStandAmount(Float cheapStandAmount) {
                this.cheapStandAmount = cheapStandAmount;
                return this;
            }

            /**
             * <p>Indicates whether the discount amount is displayed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isShow(Boolean isShow) {
                this.isShow = isShow;
                return this;
            }

            /**
             * <p>Original total official price.</p>
             * 
             * <strong>example:</strong>
             * <p>9812</p>
             */
            public Builder originalStandAmount(Float originalStandAmount) {
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
     * {@link QueryRenewPriceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRenewPriceResponseBody</p>
     */
    public static class OptionalPromotions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PromotionDesc")
        private String promotionDesc;

        @com.aliyun.core.annotation.NameInMap("PromotionName")
        private String promotionName;

        @com.aliyun.core.annotation.NameInMap("PromotionOptionNo")
        private String promotionOptionNo;

        private OptionalPromotions(Builder builder) {
            this.promotionDesc = builder.promotionDesc;
            this.promotionName = builder.promotionName;
            this.promotionOptionNo = builder.promotionOptionNo;
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

        public static final class Builder {
            private String promotionDesc; 
            private String promotionName; 
            private String promotionOptionNo; 

            private Builder() {
            } 

            private Builder(OptionalPromotions model) {
                this.promotionDesc = model.promotionDesc;
                this.promotionName = model.promotionName;
                this.promotionOptionNo = model.promotionOptionNo;
            } 

            /**
             * <p>Coupon description.</p>
             * 
             * <strong>example:</strong>
             * <p>youhuiquan_desc</p>
             */
            public Builder promotionDesc(String promotionDesc) {
                this.promotionDesc = promotionDesc;
                return this;
            }

            /**
             * <p>Coupon name.</p>
             * 
             * <strong>example:</strong>
             * <p>youhuiquan_promotion_option_id_for_blank</p>
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * <p>Coupon ID.</p>
             * 
             * <strong>example:</strong>
             * <p>youhuiquan_12378dfj6</p>
             */
            public Builder promotionOptionNo(String promotionOptionNo) {
                this.promotionOptionNo = promotionOptionNo;
                return this;
            }

            public OptionalPromotions build() {
                return new OptionalPromotions(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryRenewPriceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRenewPriceResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Float amount;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RuleDescId")
        private String ruleDescId;

        private Rules(Builder builder) {
            this.amount = builder.amount;
            this.name = builder.name;
            this.ruleDescId = builder.ruleDescId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Float getAmount() {
            return this.amount;
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
        public String getRuleDescId() {
            return this.ruleDescId;
        }

        public static final class Builder {
            private Float amount; 
            private String name; 
            private String ruleDescId; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.amount = model.amount;
                this.name = model.name;
                this.ruleDescId = model.ruleDescId;
            } 

            /**
             * <p>Resource count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder amount(Float amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>Rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>rule_8syh2j121ns</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>8su2i3hsdf128</p>
             */
            public Builder ruleDescId(String ruleDescId) {
                this.ruleDescId = ruleDescId;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryRenewPriceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRenewPriceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BillingInstanceId")
        private String billingInstanceId;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DepreciateInfo")
        private DepreciateInfo depreciateInfo;

        @com.aliyun.core.annotation.NameInMap("DiscountAmount")
        private Float discountAmount;

        @com.aliyun.core.annotation.NameInMap("OptionalPromotions")
        private java.util.List<OptionalPromotions> optionalPromotions;

        @com.aliyun.core.annotation.NameInMap("OriginalAmount")
        private Float originalAmount;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        @com.aliyun.core.annotation.NameInMap("StandDiscountPrice")
        private Float standDiscountPrice;

        @com.aliyun.core.annotation.NameInMap("StandPrice")
        private Float standPrice;

        @com.aliyun.core.annotation.NameInMap("TradeAmount")
        private Float tradeAmount;

        private Data(Builder builder) {
            this.billingInstanceId = builder.billingInstanceId;
            this.currency = builder.currency;
            this.depreciateInfo = builder.depreciateInfo;
            this.discountAmount = builder.discountAmount;
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

        public static Data create() {
            return builder().build();
        }

        /**
         * @return billingInstanceId
         */
        public String getBillingInstanceId() {
            return this.billingInstanceId;
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
         * @return optionalPromotions
         */
        public java.util.List<OptionalPromotions> getOptionalPromotions() {
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
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        /**
         * @return standDiscountPrice
         */
        public Float getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        /**
         * @return standPrice
         */
        public Float getStandPrice() {
            return this.standPrice;
        }

        /**
         * @return tradeAmount
         */
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

        public static final class Builder {
            private String billingInstanceId; 
            private String currency; 
            private DepreciateInfo depreciateInfo; 
            private Float discountAmount; 
            private java.util.List<OptionalPromotions> optionalPromotions; 
            private Float originalAmount; 
            private java.util.List<Rules> rules; 
            private Float standDiscountPrice; 
            private Float standPrice; 
            private Float tradeAmount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.billingInstanceId = model.billingInstanceId;
                this.currency = model.currency;
                this.depreciateInfo = model.depreciateInfo;
                this.discountAmount = model.discountAmount;
                this.optionalPromotions = model.optionalPromotions;
                this.originalAmount = model.originalAmount;
                this.rules = model.rules;
                this.standDiscountPrice = model.standDiscountPrice;
                this.standPrice = model.standPrice;
                this.tradeAmount = model.tradeAmount;
            } 

            /**
             * <p>Billing instance ID. For the default compute group (FE compute group and default BE compute group), this value is the instance ID. Otherwise, it is the compute group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c-96f3bc7f04b2****</p>
             */
            public Builder billingInstanceId(String billingInstanceId) {
                this.billingInstanceId = billingInstanceId;
                return this;
            }

            /**
             * <p>Currency.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>Total official price after discount.</p>
             * 
             * <strong>example:</strong>
             * <p>9812</p>
             */
            public Builder depreciateInfo(DepreciateInfo depreciateInfo) {
                this.depreciateInfo = depreciateInfo;
                return this;
            }

            /**
             * <p>Discount amount = original amount − billable amount (including coupon discounts).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder discountAmount(Float discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * <p>Coupon ID.</p>
             */
            public Builder optionalPromotions(java.util.List<OptionalPromotions> optionalPromotions) {
                this.optionalPromotions = optionalPromotions;
                return this;
            }

            /**
             * <p>Original amount = catalog price × usage.</p>
             * 
             * <strong>example:</strong>
             * <p>9812</p>
             */
            public Builder originalAmount(Float originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            /**
             * <p>Data structure of the response.</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>Discounted price based on the official discount.</p>
             * 
             * <strong>example:</strong>
             * <p>9812</p>
             */
            public Builder standDiscountPrice(Float standDiscountPrice) {
                this.standDiscountPrice = standDiscountPrice;
                return this;
            }

            /**
             * <p>Official discounted price.</p>
             * 
             * <strong>example:</strong>
             * <p>9812</p>
             */
            public Builder standPrice(Float standPrice) {
                this.standPrice = standPrice;
                return this;
            }

            /**
             * <p>Amount.</p>
             * 
             * <strong>example:</strong>
             * <p>9812</p>
             */
            public Builder tradeAmount(Float tradeAmount) {
                this.tradeAmount = tradeAmount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
