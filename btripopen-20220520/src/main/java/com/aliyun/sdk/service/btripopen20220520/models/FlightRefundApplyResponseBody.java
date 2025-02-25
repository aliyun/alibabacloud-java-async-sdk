// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link FlightRefundApplyResponseBody} extends {@link TeaModel}
 *
 * <p>FlightRefundApplyResponseBody</p>
 */
public class FlightRefundApplyResponseBody extends TeaModel {
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

    private FlightRefundApplyResponseBody(Builder builder) {
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

    public static FlightRefundApplyResponseBody create() {
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

        public FlightRefundApplyResponseBody build() {
            return new FlightRefundApplyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FlightRefundApplyResponseBody} extends {@link TeaModel}
     *
     * <p>FlightRefundApplyResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dis_order_id")
        private String disOrderId;

        @com.aliyun.core.annotation.NameInMap("dis_sub_order_id")
        private String disSubOrderId;

        @com.aliyun.core.annotation.NameInMap("refund_apply_id")
        private Long refundApplyId;

        @com.aliyun.core.annotation.NameInMap("refund_fee")
        private Long refundFee;

        @com.aliyun.core.annotation.NameInMap("refund_money")
        private Long refundMoney;

        private Module(Builder builder) {
            this.disOrderId = builder.disOrderId;
            this.disSubOrderId = builder.disSubOrderId;
            this.refundApplyId = builder.refundApplyId;
            this.refundFee = builder.refundFee;
            this.refundMoney = builder.refundMoney;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return disOrderId
         */
        public String getDisOrderId() {
            return this.disOrderId;
        }

        /**
         * @return disSubOrderId
         */
        public String getDisSubOrderId() {
            return this.disSubOrderId;
        }

        /**
         * @return refundApplyId
         */
        public Long getRefundApplyId() {
            return this.refundApplyId;
        }

        /**
         * @return refundFee
         */
        public Long getRefundFee() {
            return this.refundFee;
        }

        /**
         * @return refundMoney
         */
        public Long getRefundMoney() {
            return this.refundMoney;
        }

        public static final class Builder {
            private String disOrderId; 
            private String disSubOrderId; 
            private Long refundApplyId; 
            private Long refundFee; 
            private Long refundMoney; 

            /**
             * dis_order_id.
             */
            public Builder disOrderId(String disOrderId) {
                this.disOrderId = disOrderId;
                return this;
            }

            /**
             * dis_sub_order_id.
             */
            public Builder disSubOrderId(String disSubOrderId) {
                this.disSubOrderId = disSubOrderId;
                return this;
            }

            /**
             * refund_apply_id.
             */
            public Builder refundApplyId(Long refundApplyId) {
                this.refundApplyId = refundApplyId;
                return this;
            }

            /**
             * refund_fee.
             */
            public Builder refundFee(Long refundFee) {
                this.refundFee = refundFee;
                return this;
            }

            /**
             * refund_money.
             */
            public Builder refundMoney(Long refundMoney) {
                this.refundMoney = refundMoney;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
