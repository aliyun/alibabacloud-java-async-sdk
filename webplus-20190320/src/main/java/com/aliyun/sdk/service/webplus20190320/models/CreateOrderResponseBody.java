// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrderResponseBody</p>
 */
public class CreateOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("OrderDetail")
    private OrderDetail orderDetail;

    @NameInMap("RequestId")
    private String requestId;

    private CreateOrderResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.orderDetail = builder.orderDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrderResponseBody create() {
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
     * @return orderDetail
     */
    public OrderDetail getOrderDetail() {
        return this.orderDetail;
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
        private OrderDetail orderDetail; 
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
         * OrderDetail.
         */
        public Builder orderDetail(OrderDetail orderDetail) {
            this.orderDetail = orderDetail;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOrderResponseBody build() {
            return new CreateOrderResponseBody(this);
        } 

    } 

    public static class OrderDetail extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Data")
        private String data;

        @NameInMap("Message")
        private String message;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("Success")
        private Boolean success;

        private OrderDetail(Builder builder) {
            this.code = builder.code;
            this.data = builder.data;
            this.message = builder.message;
            this.requestId = builder.requestId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderDetail create() {
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
        public String getData() {
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
            private String data; 
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
            public Builder data(String data) {
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

            public OrderDetail build() {
                return new OrderDetail(this);
            } 

        } 

    }
}
