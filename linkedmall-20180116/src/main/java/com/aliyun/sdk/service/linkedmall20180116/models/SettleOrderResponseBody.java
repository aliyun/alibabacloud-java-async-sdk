// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SettleOrderResponseBody} extends {@link TeaModel}
 *
 * <p>SettleOrderResponseBody</p>
 */
public class SettleOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TradeOrderSettleResponse")
    private TradeOrderSettleResponse tradeOrderSettleResponse;

    private SettleOrderResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.tradeOrderSettleResponse = builder.tradeOrderSettleResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SettleOrderResponseBody create() {
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
     * @return tradeOrderSettleResponse
     */
    public TradeOrderSettleResponse getTradeOrderSettleResponse() {
        return this.tradeOrderSettleResponse;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private TradeOrderSettleResponse tradeOrderSettleResponse; 

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
         * TradeOrderSettleResponse.
         */
        public Builder tradeOrderSettleResponse(TradeOrderSettleResponse tradeOrderSettleResponse) {
            this.tradeOrderSettleResponse = tradeOrderSettleResponse;
            return this;
        }

        public SettleOrderResponseBody build() {
            return new SettleOrderResponseBody(this);
        } 

    } 

    public static class TradeOrderSettleResponse extends TeaModel {
        @NameInMap("OutRequestNo")
        private String outRequestNo;

        @NameInMap("TradeNo")
        private String tradeNo;

        private TradeOrderSettleResponse(Builder builder) {
            this.outRequestNo = builder.outRequestNo;
            this.tradeNo = builder.tradeNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TradeOrderSettleResponse create() {
            return builder().build();
        }

        /**
         * @return outRequestNo
         */
        public String getOutRequestNo() {
            return this.outRequestNo;
        }

        /**
         * @return tradeNo
         */
        public String getTradeNo() {
            return this.tradeNo;
        }

        public static final class Builder {
            private String outRequestNo; 
            private String tradeNo; 

            /**
             * OutRequestNo.
             */
            public Builder outRequestNo(String outRequestNo) {
                this.outRequestNo = outRequestNo;
                return this;
            }

            /**
             * TradeNo.
             */
            public Builder tradeNo(String tradeNo) {
                this.tradeNo = tradeNo;
                return this;
            }

            public TradeOrderSettleResponse build() {
                return new TradeOrderSettleResponse(this);
            } 

        } 

    }
}
