// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeRefundPriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRefundPriceResponseBody</p>
 */
public class DescribeRefundPriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PriceInfo")
    private PriceInfo priceInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRefundPriceResponseBody(Builder builder) {
        this.priceInfo = builder.priceInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRefundPriceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private PriceInfo priceInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRefundPriceResponseBody model) {
            this.priceInfo = model.priceInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The price details.</p>
         */
        public Builder priceInfo(PriceInfo priceInfo) {
            this.priceInfo = priceInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRefundPriceResponseBody build() {
            return new DescribeRefundPriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRefundPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRefundPriceResponseBody</p>
     */
    public static class PriceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("RefundFee")
        private Float refundFee;

        private PriceInfo(Builder builder) {
            this.currency = builder.currency;
            this.refundFee = builder.refundFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceInfo create() {
            return builder().build();
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return refundFee
         */
        public Float getRefundFee() {
            return this.refundFee;
        }

        public static final class Builder {
            private String currency; 
            private Float refundFee; 

            private Builder() {
            } 

            private Builder(PriceInfo model) {
                this.currency = model.currency;
                this.refundFee = model.refundFee;
            } 

            /**
             * <p>The unit of currency (USD).</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The amount of the refund.</p>
             * 
             * <strong>example:</strong>
             * <p>3990.75</p>
             */
            public Builder refundFee(Float refundFee) {
                this.refundFee = refundFee;
                return this;
            }

            public PriceInfo build() {
                return new PriceInfo(this);
            } 

        } 

    }
}
