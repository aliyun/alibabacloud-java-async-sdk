// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link GetCreateBEClusterInquiryResponseBody} extends {@link TeaModel}
 *
 * <p>GetCreateBEClusterInquiryResponseBody</p>
 */
public class GetCreateBEClusterInquiryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCreateBEClusterInquiryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCreateBEClusterInquiryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCreateBEClusterInquiryResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>06758CAB-1204-5852-A471-29C87D5C1D0F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCreateBEClusterInquiryResponseBody build() {
            return new GetCreateBEClusterInquiryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCreateBEClusterInquiryResponseBody} extends {@link TeaModel}
     *
     * <p>GetCreateBEClusterInquiryResponseBody</p>
     */
    public static class OptionalPromotions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanPromFee")
        private String canPromFee;

        @com.aliyun.core.annotation.NameInMap("OptionCode")
        private String optionCode;

        @com.aliyun.core.annotation.NameInMap("PromotionDesc")
        private String promotionDesc;

        @com.aliyun.core.annotation.NameInMap("PromotionName")
        private String promotionName;

        @com.aliyun.core.annotation.NameInMap("PromotionOptionNo")
        private String promotionOptionNo;

        private OptionalPromotions(Builder builder) {
            this.canPromFee = builder.canPromFee;
            this.optionCode = builder.optionCode;
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
         * @return canPromFee
         */
        public String getCanPromFee() {
            return this.canPromFee;
        }

        /**
         * @return optionCode
         */
        public String getOptionCode() {
            return this.optionCode;
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
            private String canPromFee; 
            private String optionCode; 
            private String promotionDesc; 
            private String promotionName; 
            private String promotionOptionNo; 

            private Builder() {
            } 

            private Builder(OptionalPromotions model) {
                this.canPromFee = model.canPromFee;
                this.optionCode = model.optionCode;
                this.promotionDesc = model.promotionDesc;
                this.promotionName = model.promotionName;
                this.promotionOptionNo = model.promotionOptionNo;
            } 

            /**
             * CanPromFee.
             */
            public Builder canPromFee(String canPromFee) {
                this.canPromFee = canPromFee;
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
     * {@link GetCreateBEClusterInquiryResponseBody} extends {@link TeaModel}
     *
     * <p>GetCreateBEClusterInquiryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("OptionalPromotions")
        private java.util.List<OptionalPromotions> optionalPromotions;

        @com.aliyun.core.annotation.NameInMap("PricingRules")
        private java.util.Map<String, String> pricingRules;

        @com.aliyun.core.annotation.NameInMap("TradeAmount")
        private String tradeAmount;

        private Data(Builder builder) {
            this.currency = builder.currency;
            this.optionalPromotions = builder.optionalPromotions;
            this.pricingRules = builder.pricingRules;
            this.tradeAmount = builder.tradeAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return optionalPromotions
         */
        public java.util.List<OptionalPromotions> getOptionalPromotions() {
            return this.optionalPromotions;
        }

        /**
         * @return pricingRules
         */
        public java.util.Map<String, String> getPricingRules() {
            return this.pricingRules;
        }

        /**
         * @return tradeAmount
         */
        public String getTradeAmount() {
            return this.tradeAmount;
        }

        public static final class Builder {
            private String currency; 
            private java.util.List<OptionalPromotions> optionalPromotions; 
            private java.util.Map<String, String> pricingRules; 
            private String tradeAmount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currency = model.currency;
                this.optionalPromotions = model.optionalPromotions;
                this.pricingRules = model.pricingRules;
                this.tradeAmount = model.tradeAmount;
            } 

            /**
             * <p>The currency.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
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
             * PricingRules.
             */
            public Builder pricingRules(java.util.Map<String, String> pricingRules) {
                this.pricingRules = pricingRules;
                return this;
            }

            /**
             * <p>The amount of money.</p>
             * 
             * <strong>example:</strong>
             * <p>1.76</p>
             */
            public Builder tradeAmount(String tradeAmount) {
                this.tradeAmount = tradeAmount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
