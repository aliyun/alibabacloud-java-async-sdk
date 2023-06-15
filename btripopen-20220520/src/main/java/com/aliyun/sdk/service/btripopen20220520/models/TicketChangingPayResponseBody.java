// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TicketChangingPayResponseBody} extends {@link TeaModel}
 *
 * <p>TicketChangingPayResponseBody</p>
 */
public class TicketChangingPayResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("module")
    private Module module;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private TicketChangingPayResponseBody(Builder builder) {
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

    public static TicketChangingPayResponseBody create() {
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

        public TicketChangingPayResponseBody build() {
            return new TicketChangingPayResponseBody(this);
        } 

    } 

    public static class Module extends TeaModel {
        @NameInMap("can_retry")
        private Boolean canRetry;

        @NameInMap("pay_price")
        private Long payPrice;

        @NameInMap("pay_status")
        private Integer payStatus;

        @NameInMap("pay_time")
        private String payTime;

        @NameInMap("trade_no")
        private String tradeNo;

        private Module(Builder builder) {
            this.canRetry = builder.canRetry;
            this.payPrice = builder.payPrice;
            this.payStatus = builder.payStatus;
            this.payTime = builder.payTime;
            this.tradeNo = builder.tradeNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return canRetry
         */
        public Boolean getCanRetry() {
            return this.canRetry;
        }

        /**
         * @return payPrice
         */
        public Long getPayPrice() {
            return this.payPrice;
        }

        /**
         * @return payStatus
         */
        public Integer getPayStatus() {
            return this.payStatus;
        }

        /**
         * @return payTime
         */
        public String getPayTime() {
            return this.payTime;
        }

        /**
         * @return tradeNo
         */
        public String getTradeNo() {
            return this.tradeNo;
        }

        public static final class Builder {
            private Boolean canRetry; 
            private Long payPrice; 
            private Integer payStatus; 
            private String payTime; 
            private String tradeNo; 

            /**
             * can_retry.
             */
            public Builder canRetry(Boolean canRetry) {
                this.canRetry = canRetry;
                return this;
            }

            /**
             * pay_price.
             */
            public Builder payPrice(Long payPrice) {
                this.payPrice = payPrice;
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
             * pay_time.
             */
            public Builder payTime(String payTime) {
                this.payTime = payTime;
                return this;
            }

            /**
             * trade_no.
             */
            public Builder tradeNo(String tradeNo) {
                this.tradeNo = tradeNo;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
