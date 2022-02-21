// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePrePaidResourceRefundPriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePrePaidResourceRefundPriceResponseBody</p>
 */
public class DescribePrePaidResourceRefundPriceResponseBody extends TeaModel {
    @NameInMap("Currency")
    private String currency;

    @NameInMap("Refunds")
    private Float refunds;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePrePaidResourceRefundPriceResponseBody(Builder builder) {
        this.currency = builder.currency;
        this.refunds = builder.refunds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrePaidResourceRefundPriceResponseBody create() {
        return builder().build();
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * @return refunds
     */
    public Float getRefunds() {
        return this.refunds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String currency; 
        private Float refunds; 
        private String requestId; 

        /**
         * Currency.
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Refunds.
         */
        public Builder refunds(Float refunds) {
            this.refunds = refunds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePrePaidResourceRefundPriceResponseBody build() {
            return new DescribePrePaidResourceRefundPriceResponseBody(this);
        } 

    } 

}
