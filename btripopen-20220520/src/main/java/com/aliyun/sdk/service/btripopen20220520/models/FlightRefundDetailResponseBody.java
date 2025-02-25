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
 * {@link FlightRefundDetailResponseBody} extends {@link TeaModel}
 *
 * <p>FlightRefundDetailResponseBody</p>
 */
public class FlightRefundDetailResponseBody extends TeaModel {
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

    private FlightRefundDetailResponseBody(Builder builder) {
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

    public static FlightRefundDetailResponseBody create() {
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

        public FlightRefundDetailResponseBody build() {
            return new FlightRefundDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FlightRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>FlightRefundDetailResponseBody</p>
     */
    public static class RefundFeeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alipay_trade_no")
        private String alipayTradeNo;

        @com.aliyun.core.annotation.NameInMap("refund_fee")
        private Long refundFee;

        @com.aliyun.core.annotation.NameInMap("refund_price")
        private Long refundPrice;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private RefundFeeList(Builder builder) {
            this.alipayTradeNo = builder.alipayTradeNo;
            this.refundFee = builder.refundFee;
            this.refundPrice = builder.refundPrice;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundFeeList create() {
            return builder().build();
        }

        /**
         * @return alipayTradeNo
         */
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
        }

        /**
         * @return refundFee
         */
        public Long getRefundFee() {
            return this.refundFee;
        }

        /**
         * @return refundPrice
         */
        public Long getRefundPrice() {
            return this.refundPrice;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String alipayTradeNo; 
            private Long refundFee; 
            private Long refundPrice; 
            private String status; 

            /**
             * alipay_trade_no.
             */
            public Builder alipayTradeNo(String alipayTradeNo) {
                this.alipayTradeNo = alipayTradeNo;
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
             * refund_price.
             */
            public Builder refundPrice(Long refundPrice) {
                this.refundPrice = refundPrice;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RefundFeeList build() {
                return new RefundFeeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightRefundDetailResponseBody} extends {@link TeaModel}
     *
     * <p>FlightRefundDetailResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("btrip_order_id")
        private Long btripOrderId;

        @com.aliyun.core.annotation.NameInMap("btrip_sub_order_id")
        private Long btripSubOrderId;

        @com.aliyun.core.annotation.NameInMap("dis_order_id")
        private String disOrderId;

        @com.aliyun.core.annotation.NameInMap("dis_sub_order_id")
        private String disSubOrderId;

        @com.aliyun.core.annotation.NameInMap("is_voluntary")
        private Integer isVoluntary;

        @com.aliyun.core.annotation.NameInMap("reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("refund_fee")
        private Long refundFee;

        @com.aliyun.core.annotation.NameInMap("refund_fee_list")
        private java.util.List<RefundFeeList> refundFeeList;

        @com.aliyun.core.annotation.NameInMap("refund_price")
        private Long refundPrice;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Module(Builder builder) {
            this.btripOrderId = builder.btripOrderId;
            this.btripSubOrderId = builder.btripSubOrderId;
            this.disOrderId = builder.disOrderId;
            this.disSubOrderId = builder.disSubOrderId;
            this.isVoluntary = builder.isVoluntary;
            this.reason = builder.reason;
            this.refundFee = builder.refundFee;
            this.refundFeeList = builder.refundFeeList;
            this.refundPrice = builder.refundPrice;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return btripOrderId
         */
        public Long getBtripOrderId() {
            return this.btripOrderId;
        }

        /**
         * @return btripSubOrderId
         */
        public Long getBtripSubOrderId() {
            return this.btripSubOrderId;
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
         * @return isVoluntary
         */
        public Integer getIsVoluntary() {
            return this.isVoluntary;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return refundFee
         */
        public Long getRefundFee() {
            return this.refundFee;
        }

        /**
         * @return refundFeeList
         */
        public java.util.List<RefundFeeList> getRefundFeeList() {
            return this.refundFeeList;
        }

        /**
         * @return refundPrice
         */
        public Long getRefundPrice() {
            return this.refundPrice;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long btripOrderId; 
            private Long btripSubOrderId; 
            private String disOrderId; 
            private String disSubOrderId; 
            private Integer isVoluntary; 
            private String reason; 
            private Long refundFee; 
            private java.util.List<RefundFeeList> refundFeeList; 
            private Long refundPrice; 
            private String status; 

            /**
             * btrip_order_id.
             */
            public Builder btripOrderId(Long btripOrderId) {
                this.btripOrderId = btripOrderId;
                return this;
            }

            /**
             * btrip_sub_order_id.
             */
            public Builder btripSubOrderId(Long btripSubOrderId) {
                this.btripSubOrderId = btripSubOrderId;
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
             * dis_sub_order_id.
             */
            public Builder disSubOrderId(String disSubOrderId) {
                this.disSubOrderId = disSubOrderId;
                return this;
            }

            /**
             * is_voluntary.
             */
            public Builder isVoluntary(Integer isVoluntary) {
                this.isVoluntary = isVoluntary;
                return this;
            }

            /**
             * reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
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
             * refund_fee_list.
             */
            public Builder refundFeeList(java.util.List<RefundFeeList> refundFeeList) {
                this.refundFeeList = refundFeeList;
                return this;
            }

            /**
             * refund_price.
             */
            public Builder refundPrice(Long refundPrice) {
                this.refundPrice = refundPrice;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
