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
 * {@link QueryModifyCuPriceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryModifyCuPriceResponseBody</p>
 */
public class QueryModifyCuPriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

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

    private QueryModifyCuPriceResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
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

    public static QueryModifyCuPriceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public Data getData() {
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
        private String accessDeniedDetail; 
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryModifyCuPriceResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>AccessDeniedDetail</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public QueryModifyCuPriceResponseBody build() {
            return new QueryModifyCuPriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryModifyCuPriceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryModifyCuPriceResponseBody</p>
     */
    public static class ComponentPrices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentName")
        private String componentName;

        @com.aliyun.core.annotation.NameInMap("DiscountAmount")
        private Float discountAmount;

        @com.aliyun.core.annotation.NameInMap("OriginalAmount")
        private Float originalAmount;

        @com.aliyun.core.annotation.NameInMap("TradeAmount")
        private Float tradeAmount;

        private ComponentPrices(Builder builder) {
            this.componentName = builder.componentName;
            this.discountAmount = builder.discountAmount;
            this.originalAmount = builder.originalAmount;
            this.tradeAmount = builder.tradeAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentPrices create() {
            return builder().build();
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return discountAmount
         */
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        /**
         * @return originalAmount
         */
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        /**
         * @return tradeAmount
         */
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

        public static final class Builder {
            private String componentName; 
            private Float discountAmount; 
            private Float originalAmount; 
            private Float tradeAmount; 

            private Builder() {
            } 

            private Builder(ComponentPrices model) {
                this.componentName = model.componentName;
                this.discountAmount = model.discountAmount;
                this.originalAmount = model.originalAmount;
                this.tradeAmount = model.tradeAmount;
            } 

            /**
             * ComponentName.
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
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
             * OriginalAmount.
             */
            public Builder originalAmount(Float originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            /**
             * TradeAmount.
             */
            public Builder tradeAmount(Float tradeAmount) {
                this.tradeAmount = tradeAmount;
                return this;
            }

            public ComponentPrices build() {
                return new ComponentPrices(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryModifyCuPriceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryModifyCuPriceResponseBody</p>
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
             * CheapRate.
             */
            public Builder cheapRate(Float cheapRate) {
                this.cheapRate = cheapRate;
                return this;
            }

            /**
             * CheapStandAmount.
             */
            public Builder cheapStandAmount(Float cheapStandAmount) {
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
             * OriginalStandAmount.
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
     * {@link QueryModifyCuPriceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryModifyCuPriceResponseBody</p>
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

            public OptionalPromotions build() {
                return new OptionalPromotions(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryModifyCuPriceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryModifyCuPriceResponseBody</p>
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
             * Amount.
             */
            public Builder amount(Float amount) {
                this.amount = amount;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RuleDescId.
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
     * {@link QueryModifyCuPriceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryModifyCuPriceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentPrices")
        private java.util.List<ComponentPrices> componentPrices;

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
            this.componentPrices = builder.componentPrices;
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
         * @return componentPrices
         */
        public java.util.List<ComponentPrices> getComponentPrices() {
            return this.componentPrices;
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
            private java.util.List<ComponentPrices> componentPrices; 
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
                this.componentPrices = model.componentPrices;
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
             * ComponentPrices.
             */
            public Builder componentPrices(java.util.List<ComponentPrices> componentPrices) {
                this.componentPrices = componentPrices;
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
             * OptionalPromotions.
             */
            public Builder optionalPromotions(java.util.List<OptionalPromotions> optionalPromotions) {
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
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * StandDiscountPrice.
             */
            public Builder standDiscountPrice(Float standDiscountPrice) {
                this.standDiscountPrice = standDiscountPrice;
                return this;
            }

            /**
             * StandPrice.
             */
            public Builder standPrice(Float standPrice) {
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
