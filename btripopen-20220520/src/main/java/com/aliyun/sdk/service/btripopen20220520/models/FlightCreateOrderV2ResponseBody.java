// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FlightCreateOrderV2ResponseBody} extends {@link TeaModel}
 *
 * <p>FlightCreateOrderV2ResponseBody</p>
 */
public class FlightCreateOrderV2ResponseBody extends TeaModel {
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

    private FlightCreateOrderV2ResponseBody(Builder builder) {
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

    public static FlightCreateOrderV2ResponseBody create() {
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
         * <p>module</p>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>210bc60a16916593445203790d2a16</p>
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
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>2103ad0716827336456723986d4bda</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public FlightCreateOrderV2ResponseBody build() {
            return new FlightCreateOrderV2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FlightCreateOrderV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightCreateOrderV2ResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("async_create_order_key")
        private String asyncCreateOrderKey;

        @com.aliyun.core.annotation.NameInMap("latest_pay_time")
        private String latestPayTime;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("out_order_id")
        private String outOrderId;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("total_price")
        private Long totalPrice;

        private Module(Builder builder) {
            this.asyncCreateOrderKey = builder.asyncCreateOrderKey;
            this.latestPayTime = builder.latestPayTime;
            this.orderId = builder.orderId;
            this.outOrderId = builder.outOrderId;
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
