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
 * {@link GetModifyBEClusterInquiryResponseBody} extends {@link TeaModel}
 *
 * <p>GetModifyBEClusterInquiryResponseBody</p>
 */
public class GetModifyBEClusterInquiryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetModifyBEClusterInquiryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModifyBEClusterInquiryResponseBody create() {
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

        private Builder(GetModifyBEClusterInquiryResponseBody model) {
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

        public GetModifyBEClusterInquiryResponseBody build() {
            return new GetModifyBEClusterInquiryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetModifyBEClusterInquiryResponseBody} extends {@link TeaModel}
     *
     * <p>GetModifyBEClusterInquiryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("PricingRules")
        private java.util.Map<String, String> pricingRules;

        @com.aliyun.core.annotation.NameInMap("RefundAmount")
        private String refundAmount;

        @com.aliyun.core.annotation.NameInMap("TradeAmount")
        private String tradeAmount;

        private Data(Builder builder) {
            this.currency = builder.currency;
            this.pricingRules = builder.pricingRules;
            this.refundAmount = builder.refundAmount;
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
         * @return pricingRules
         */
        public java.util.Map<String, String> getPricingRules() {
            return this.pricingRules;
        }

        /**
         * @return refundAmount
         */
        public String getRefundAmount() {
            return this.refundAmount;
        }

        /**
         * @return tradeAmount
         */
        public String getTradeAmount() {
            return this.tradeAmount;
        }

        public static final class Builder {
            private String currency; 
            private java.util.Map<String, String> pricingRules; 
            private String refundAmount; 
            private String tradeAmount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currency = model.currency;
                this.pricingRules = model.pricingRules;
                this.refundAmount = model.refundAmount;
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
             * PricingRules.
             */
            public Builder pricingRules(java.util.Map<String, String> pricingRules) {
                this.pricingRules = pricingRules;
                return this;
            }

            /**
             * <p>The estimated refund amount when the subscription cluster of a subscription instance is changed to a pay-as-you-go cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>-100</p>
             */
            public Builder refundAmount(String refundAmount) {
                this.refundAmount = refundAmount;
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
