// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSettleConfirmResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSettleConfirmResponseBody</p>
 */
public class CreateSettleConfirmResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TradeSettleConfirmResponse")
    private TradeSettleConfirmResponse tradeSettleConfirmResponse;

    private CreateSettleConfirmResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.tradeSettleConfirmResponse = builder.tradeSettleConfirmResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSettleConfirmResponseBody create() {
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
     * @return tradeSettleConfirmResponse
     */
    public TradeSettleConfirmResponse getTradeSettleConfirmResponse() {
        return this.tradeSettleConfirmResponse;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private TradeSettleConfirmResponse tradeSettleConfirmResponse; 

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
         * TradeSettleConfirmResponse.
         */
        public Builder tradeSettleConfirmResponse(TradeSettleConfirmResponse tradeSettleConfirmResponse) {
            this.tradeSettleConfirmResponse = tradeSettleConfirmResponse;
            return this;
        }

        public CreateSettleConfirmResponseBody build() {
            return new CreateSettleConfirmResponseBody(this);
        } 

    } 

    public static class TradeSettleConfirmResponse extends TeaModel {
        @NameInMap("OutRequestNo")
        private String outRequestNo;

        @NameInMap("TradeNo")
        private String tradeNo;

        private TradeSettleConfirmResponse(Builder builder) {
            this.outRequestNo = builder.outRequestNo;
            this.tradeNo = builder.tradeNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TradeSettleConfirmResponse create() {
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

            public TradeSettleConfirmResponse build() {
                return new TradeSettleConfirmResponse(this);
            } 

        } 

    }
}
