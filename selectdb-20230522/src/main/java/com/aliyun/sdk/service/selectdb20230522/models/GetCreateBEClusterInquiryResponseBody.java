// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("TradeAmount")
        private String tradeAmount;

        private Data(Builder builder) {
            this.currency = builder.currency;
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
         * @return tradeAmount
         */
        public String getTradeAmount() {
            return this.tradeAmount;
        }

        public static final class Builder {
            private String currency; 
            private String tradeAmount; 

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
