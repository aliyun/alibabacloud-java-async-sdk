// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IntlFlightCreateOrderResponseBody} extends {@link TeaModel}
 *
 * <p>IntlFlightCreateOrderResponseBody</p>
 */
public class IntlFlightCreateOrderResponseBody extends TeaModel {
    @NameInMap("http_status_code")
    private Integer httpStatusCode;

    @NameInMap("module")
    private Module module;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result_code")
    private String resultCode;

    @NameInMap("result_msg")
    private String resultMsg;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private IntlFlightCreateOrderResponseBody(Builder builder) {
        this.httpStatusCode = builder.httpStatusCode;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMsg = builder.resultMsg;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntlFlightCreateOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMsg
     */
    public String getResultMsg() {
        return this.resultMsg;
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
        private Integer httpStatusCode; 
        private Module module; 
        private String requestId; 
        private String resultCode; 
        private String resultMsg; 
        private Boolean success; 
        private String traceId; 

        /**
         * http_status_code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * result_code.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * result_msg.
         */
        public Builder resultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
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

        public IntlFlightCreateOrderResponseBody build() {
            return new IntlFlightCreateOrderResponseBody(this);
        } 

    } 

    public static class Module extends TeaModel {
        @NameInMap("async_create_order_key")
        private String asyncCreateOrderKey;

        @NameInMap("latest_pay_time")
        private String latestPayTime;

        @NameInMap("order_id")
        private Long orderId;

        @NameInMap("out_order_id")
        private String outOrderId;

        @NameInMap("pay_status")
        private Integer payStatus;

        @NameInMap("status")
        private Integer status;

        @NameInMap("total_price")
        private Long totalPrice;

        private Module(Builder builder) {
            this.asyncCreateOrderKey = builder.asyncCreateOrderKey;
            this.latestPayTime = builder.latestPayTime;
            this.orderId = builder.orderId;
            this.outOrderId = builder.outOrderId;
            this.payStatus = builder.payStatus;
            this.status = builder.status;
            this.totalPrice = builder.totalPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return asyncCreateOrderKey
         */
        public String getAsyncCreateOrderKey() {
            return this.asyncCreateOrderKey;
        }

        /**
         * @return latestPayTime
         */
        public String getLatestPayTime() {
            return this.latestPayTime;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return outOrderId
         */
        public String getOutOrderId() {
            return this.outOrderId;
        }

        /**
         * @return payStatus
         */
        public Integer getPayStatus() {
            return this.payStatus;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return totalPrice
         */
        public Long getTotalPrice() {
            return this.totalPrice;
        }

        public static final class Builder {
            private String asyncCreateOrderKey; 
            private String latestPayTime; 
            private Long orderId; 
            private String outOrderId; 
            private Integer payStatus; 
            private Integer status; 
            private Long totalPrice; 

            /**
             * async_create_order_key.
             */
            public Builder asyncCreateOrderKey(String asyncCreateOrderKey) {
                this.asyncCreateOrderKey = asyncCreateOrderKey;
                return this;
            }

            /**
             * latest_pay_time.
             */
            public Builder latestPayTime(String latestPayTime) {
                this.latestPayTime = latestPayTime;
                return this;
            }

            /**
             * order_id.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * out_order_id.
             */
            public Builder outOrderId(String outOrderId) {
                this.outOrderId = outOrderId;
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
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
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
