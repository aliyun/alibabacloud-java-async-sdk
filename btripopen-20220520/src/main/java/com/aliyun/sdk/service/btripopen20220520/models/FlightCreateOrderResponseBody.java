// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightCreateOrderResponseBody} extends {@link TeaModel}
 *
 * <p>FlightCreateOrderResponseBody</p>
 */
public class FlightCreateOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private FlightCreateOrderResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightCreateOrderResponseBody create() {
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
     * @return module
     */
    public Module getModule() {
        return this.module;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public FlightCreateOrderResponseBody build() {
            return new FlightCreateOrderResponseBody(this);
        } 

    } 

    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alipay_trade_no")
        private String alipayTradeNo;

        @com.aliyun.core.annotation.NameInMap("btrip_order_id")
        private Long btripOrderId;

        @com.aliyun.core.annotation.NameInMap("dis_order_id")
        private String disOrderId;

        @com.aliyun.core.annotation.NameInMap("last_pay_time")
        private String lastPayTime;

        @com.aliyun.core.annotation.NameInMap("order_status")
        private Integer orderStatus;

        @com.aliyun.core.annotation.NameInMap("pay_status")
        private Integer payStatus;

        @com.aliyun.core.annotation.NameInMap("payment_price")
        private Long paymentPrice;

        @com.aliyun.core.annotation.NameInMap("total_price")
        private Long totalPrice;

        private Module(Builder builder) {
            this.alipayTradeNo = builder.alipayTradeNo;
            this.btripOrderId = builder.btripOrderId;
            this.disOrderId = builder.disOrderId;
            this.lastPayTime = builder.lastPayTime;
            this.orderStatus = builder.orderStatus;
            this.payStatus = builder.payStatus;
            this.paymentPrice = builder.paymentPrice;
            this.totalPrice = builder.totalPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return alipayTradeNo
         */
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
        }

        /**
         * @return btripOrderId
         */
        public Long getBtripOrderId() {
            return this.btripOrderId;
        }

        /**
         * @return disOrderId
         */
        public String getDisOrderId() {
            return this.disOrderId;
        }

        /**
         * @return lastPayTime
         */
        public String getLastPayTime() {
            return this.lastPayTime;
        }

        /**
         * @return orderStatus
         */
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return payStatus
         */
        public Integer getPayStatus() {
            return this.payStatus;
        }

        /**
         * @return paymentPrice
         */
        public Long getPaymentPrice() {
            return this.paymentPrice;
        }

        /**
         * @return totalPrice
         */
        public Long getTotalPrice() {
            return this.totalPrice;
        }

        public static final class Builder {
            private String alipayTradeNo; 
            private Long btripOrderId; 
            private String disOrderId; 
            private String lastPayTime; 
            private Integer orderStatus; 
            private Integer payStatus; 
            private Long paymentPrice; 
            private Long totalPrice; 

            /**
             * alipay_trade_no.
             */
            public Builder alipayTradeNo(String alipayTradeNo) {
                this.alipayTradeNo = alipayTradeNo;
                return this;
            }

            /**
             * btrip_order_id.
             */
            public Builder btripOrderId(Long btripOrderId) {
                this.btripOrderId = btripOrderId;
                return this;
            }

            /**
             * dis_order_id.
             */
            public Builder disOrderId(String disOrderId) {
                this.disOrderId = disOrderId;
                return this;
            }

            /**
             * last_pay_time.
             */
            public Builder lastPayTime(String lastPayTime) {
                this.lastPayTime = lastPayTime;
                return this;
            }

            /**
             * order_status.
             */
            public Builder orderStatus(Integer orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * pay_status.
             */
            public Builder payStatus(Integer payStatus) {
                this.payStatus = payStatus;
                return this;
            }

            /**
             * payment_price.
             */
            public Builder paymentPrice(Long paymentPrice) {
                this.paymentPrice = paymentPrice;
                return this;
            }

            /**
             * total_price.
             */
            public Builder totalPrice(Long totalPrice) {
                this.totalPrice = totalPrice;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
