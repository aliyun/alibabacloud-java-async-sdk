// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FlightCancelOrderResponseBody} extends {@link TeaModel}
 *
 * <p>FlightCancelOrderResponseBody</p>
 */
public class FlightCancelOrderResponseBody extends TeaModel {
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

    private FlightCancelOrderResponseBody(Builder builder) {
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

    public static FlightCancelOrderResponseBody create() {
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

        public FlightCancelOrderResponseBody build() {
            return new FlightCancelOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FlightCancelOrderResponseBody} extends {@link TeaModel}
     *
     * <p>FlightCancelOrderResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cancel_time")
        private String cancelTime;

        @com.aliyun.core.annotation.NameInMap("fail_code")
        private String failCode;

        @com.aliyun.core.annotation.NameInMap("fail_reason")
        private String failReason;

        @com.aliyun.core.annotation.NameInMap("order_status")
        private String orderStatus;

        private Module(Builder builder) {
            this.cancelTime = builder.cancelTime;
            this.failCode = builder.failCode;
            this.failReason = builder.failReason;
            this.orderStatus = builder.orderStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return cancelTime
         */
        public String getCancelTime() {
            return this.cancelTime;
        }

        /**
         * @return failCode
         */
        public String getFailCode() {
            return this.failCode;
        }

        /**
         * @return failReason
         */
        public String getFailReason() {
            return this.failReason;
        }

        /**
         * @return orderStatus
         */
        public String getOrderStatus() {
            return this.orderStatus;
        }

        public static final class Builder {
            private String cancelTime; 
            private String failCode; 
            private String failReason; 
            private String orderStatus; 

            /**
             * cancel_time.
             */
            public Builder cancelTime(String cancelTime) {
                this.cancelTime = cancelTime;
                return this;
            }

            /**
             * fail_code.
             */
            public Builder failCode(String failCode) {
                this.failCode = failCode;
                return this;
            }

            /**
             * fail_reason.
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * order_status.
             */
            public Builder orderStatus(String orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
