// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefundOrderResponseBody} extends {@link TeaModel}
 *
 * <p>RefundOrderResponseBody</p>
 */
public class RefundOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RefundResponse")
    private RefundResponse refundResponse;

    @NameInMap("RequestId")
    private String requestId;

    private RefundOrderResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.refundResponse = builder.refundResponse;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefundOrderResponseBody create() {
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
     * @return refundResponse
     */
    public RefundResponse getRefundResponse() {
        return this.refundResponse;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private RefundResponse refundResponse; 
        private String requestId; 

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
         * RefundResponse.
         */
        public Builder refundResponse(RefundResponse refundResponse) {
            this.refundResponse = refundResponse;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RefundOrderResponseBody build() {
            return new RefundOrderResponseBody(this);
        } 

    } 

    public static class RefundResponse extends TeaModel {
        @NameInMap("FundChange")
        private String fundChange;

        @NameInMap("GmtRefundPay")
        private String gmtRefundPay;

        @NameInMap("OutRequestNo")
        private String outRequestNo;

        @NameInMap("OutTradeNo")
        private String outTradeNo;

        @NameInMap("TradeNo")
        private String tradeNo;

        private RefundResponse(Builder builder) {
            this.fundChange = builder.fundChange;
            this.gmtRefundPay = builder.gmtRefundPay;
            this.outRequestNo = builder.outRequestNo;
            this.outTradeNo = builder.outTradeNo;
            this.tradeNo = builder.tradeNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundResponse create() {
            return builder().build();
        }

        /**
         * @return fundChange
         */
        public String getFundChange() {
            return this.fundChange;
        }

        /**
         * @return gmtRefundPay
         */
        public String getGmtRefundPay() {
            return this.gmtRefundPay;
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
         * @return tradeNo
         */
        public String getTradeNo() {
            return this.tradeNo;
        }

        public static final class Builder {
            private String fundChange; 
            private String gmtRefundPay; 
            private String outRequestNo; 
            private String outTradeNo; 
            private String tradeNo; 

            /**
             * FundChange.
             */
            public Builder fundChange(String fundChange) {
                this.fundChange = fundChange;
                return this;
            }

            /**
             * GmtRefundPay.
             */
            public Builder gmtRefundPay(String gmtRefundPay) {
                this.gmtRefundPay = gmtRefundPay;
                return this;
            }

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
             * TradeNo.
             */
            public Builder tradeNo(String tradeNo) {
                this.tradeNo = tradeNo;
                return this;
            }

            public RefundResponse build() {
                return new RefundResponse(this);
            } 

        } 

    }
}
