// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWithholdTradeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWithholdTradeResponseBody</p>
 */
public class CreateWithholdTradeResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WithholdTradeResponse")
    private WithholdTradeResponse withholdTradeResponse;

    private CreateWithholdTradeResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.withholdTradeResponse = builder.withholdTradeResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWithholdTradeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return withholdTradeResponse
     */
    public WithholdTradeResponse getWithholdTradeResponse() {
        return this.withholdTradeResponse;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private WithholdTradeResponse withholdTradeResponse; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * WithholdTradeResponse.
         */
        public Builder withholdTradeResponse(WithholdTradeResponse withholdTradeResponse) {
            this.withholdTradeResponse = withholdTradeResponse;
            return this;
        }

        public CreateWithholdTradeResponseBody build() {
            return new CreateWithholdTradeResponseBody(this);
        } 

    } 

    public static class WithholdTradeResponse extends TeaModel {
        @NameInMap("OutRequestNo")
        private String outRequestNo;

        @NameInMap("OutTradeNo")
        private String outTradeNo;

        @NameInMap("PaymentDate")
        private String paymentDate;

        @NameInMap("TradeNo")
        private String tradeNo;

        private WithholdTradeResponse(Builder builder) {
            this.outRequestNo = builder.outRequestNo;
            this.outTradeNo = builder.outTradeNo;
            this.paymentDate = builder.paymentDate;
            this.tradeNo = builder.tradeNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WithholdTradeResponse create() {
            return builder().build();
        }

        /**
         * @return outRequestNo
         */
        public String getOutRequestNo() {
            return this.outRequestNo;
        }

        /**
         * @return outTradeNo
         */
        public String getOutTradeNo() {
            return this.outTradeNo;
        }

        /**
         * @return paymentDate
         */
        public String getPaymentDate() {
            return this.paymentDate;
        }

        /**
         * @return tradeNo
         */
        public String getTradeNo() {
            return this.tradeNo;
        }

        public static final class Builder {
            private String outRequestNo; 
            private String outTradeNo; 
            private String paymentDate; 
            private String tradeNo; 

            /**
             * OutRequestNo.
             */
            public Builder outRequestNo(String outRequestNo) {
                this.outRequestNo = outRequestNo;
                return this;
            }

            /**
             * OutTradeNo.
             */
            public Builder outTradeNo(String outTradeNo) {
                this.outTradeNo = outTradeNo;
                return this;
            }

            /**
             * PaymentDate.
             */
            public Builder paymentDate(String paymentDate) {
                this.paymentDate = paymentDate;
                return this;
            }

            /**
             * TradeNo.
             */
            public Builder tradeNo(String tradeNo) {
                this.tradeNo = tradeNo;
                return this;
            }

            public WithholdTradeResponse build() {
                return new WithholdTradeResponse(this);
            } 

        } 

    }
}
