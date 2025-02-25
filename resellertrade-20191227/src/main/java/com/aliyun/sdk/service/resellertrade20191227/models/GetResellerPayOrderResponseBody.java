// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resellertrade20191227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResellerPayOrderResponseBody} extends {@link TeaModel}
 *
 * <p>GetResellerPayOrderResponseBody</p>
 */
public class GetResellerPayOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetResellerPayOrderResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResellerPayOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetResellerPayOrderResponseBody build() {
            return new GetResellerPayOrderResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BuyerId")
        private String buyerId;

        @NameInMap("OrderId")
        private String orderId;

        @NameInMap("OrderStatus")
        private String orderStatus;

        @NameInMap("PayAmount")
        private String payAmount;

        private Data(Builder builder) {
            this.buyerId = builder.buyerId;
            this.orderId = builder.orderId;
            this.orderStatus = builder.orderStatus;
            this.payAmount = builder.payAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return buyerId
         */
        public String getBuyerId() {
            return this.buyerId;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderStatus
         */
        public String getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return payAmount
         */
        public String getPayAmount() {
            return this.payAmount;
        }

        public static final class Builder {
            private String buyerId; 
            private String orderId; 
            private String orderStatus; 
            private String payAmount; 

            /**
             * BuyerId.
             */
            public Builder buyerId(String buyerId) {
                this.buyerId = buyerId;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * OrderStatus.
             */
            public Builder orderStatus(String orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * PayAmount.
             */
            public Builder payAmount(String payAmount) {
                this.payAmount = payAmount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
