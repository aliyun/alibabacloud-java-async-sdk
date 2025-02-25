// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link QueryWithholdTradeResponseBody} extends {@link TeaModel}
 *
 * <p>QueryWithholdTradeResponseBody</p>
 */
public class QueryWithholdTradeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("QueryWithholdTradeResponse")
    private QueryWithholdTradeResponse queryWithholdTradeResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryWithholdTradeResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.queryWithholdTradeResponse = builder.queryWithholdTradeResponse;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryWithholdTradeResponseBody create() {
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
     * @return queryWithholdTradeResponse
     */
    public QueryWithholdTradeResponse getQueryWithholdTradeResponse() {
        return this.queryWithholdTradeResponse;
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
        private QueryWithholdTradeResponse queryWithholdTradeResponse; 
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
         * QueryWithholdTradeResponse.
         */
        public Builder queryWithholdTradeResponse(QueryWithholdTradeResponse queryWithholdTradeResponse) {
            this.queryWithholdTradeResponse = queryWithholdTradeResponse;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryWithholdTradeResponseBody build() {
            return new QueryWithholdTradeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryWithholdTradeResponseBody} extends {@link TeaModel}
     *
     * <p>QueryWithholdTradeResponseBody</p>
     */
    public static class QueryWithholdTradeResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OutTradeNo")
        private String outTradeNo;

        @com.aliyun.core.annotation.NameInMap("PaymentDate")
        private String paymentDate;

        @com.aliyun.core.annotation.NameInMap("SettleStatus")
        private String settleStatus;

        @com.aliyun.core.annotation.NameInMap("TotalAmount")
        private String totalAmount;

        @com.aliyun.core.annotation.NameInMap("TradeNo")
        private String tradeNo;

        @com.aliyun.core.annotation.NameInMap("TradeStatus")
        private String tradeStatus;

        private QueryWithholdTradeResponse(Builder builder) {
            this.outTradeNo = builder.outTradeNo;
            this.paymentDate = builder.paymentDate;
            this.settleStatus = builder.settleStatus;
            this.totalAmount = builder.totalAmount;
            this.tradeNo = builder.tradeNo;
            this.tradeStatus = builder.tradeStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryWithholdTradeResponse create() {
            return builder().build();
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
         * @return settleStatus
         */
        public String getSettleStatus() {
            return this.settleStatus;
        }

        /**
         * @return totalAmount
         */
        public String getTotalAmount() {
            return this.totalAmount;
        }

        /**
         * @return tradeNo
         */
        public String getTradeNo() {
            return this.tradeNo;
        }

        /**
         * @return tradeStatus
         */
        public String getTradeStatus() {
            return this.tradeStatus;
        }

        public static final class Builder {
            private String outTradeNo; 
            private String paymentDate; 
            private String settleStatus; 
            private String totalAmount; 
            private String tradeNo; 
            private String tradeStatus; 

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
             * SettleStatus.
             */
            public Builder settleStatus(String settleStatus) {
                this.settleStatus = settleStatus;
                return this;
            }

            /**
             * TotalAmount.
             */
            public Builder totalAmount(String totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            /**
             * TradeNo.
             */
            public Builder tradeNo(String tradeNo) {
                this.tradeNo = tradeNo;
                return this;
            }

            /**
             * TradeStatus.
             */
            public Builder tradeStatus(String tradeStatus) {
                this.tradeStatus = tradeStatus;
                return this;
            }

            public QueryWithholdTradeResponse build() {
                return new QueryWithholdTradeResponse(this);
            } 

        } 

    }
}
