// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightRefundDetailResponseBody} extends {@link TeaModel}
 *
 * <p>FlightRefundDetailResponseBody</p>
 */
public class FlightRefundDetailResponseBody extends TeaModel {
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

    public static class RefundFeeList extends TeaModel {
        @NameInMap("alipay_trade_no")
        private String alipayTradeNo;

        @NameInMap("refund_fee")
        private Long refundFee;

        @NameInMap("refund_price")
        private Long refundPrice;

        @NameInMap("status")
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
             * 支付宝交易订单号
             */
            public Builder alipayTradeNo(String alipayTradeNo) {
                this.alipayTradeNo = alipayTradeNo;
                return this;
            }

            /**
             * 退票手续费
             */
            public Builder refundFee(Long refundFee) {
                this.refundFee = refundFee;
                return this;
            }

            /**
             * 退票金额
             */
            public Builder refundPrice(Long refundPrice) {
                this.refundPrice = refundPrice;
                return this;
            }

            /**
             * 退款状态
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
    public static class Module extends TeaModel {
        @NameInMap("btrip_order_id")
        private Long btripOrderId;

        @NameInMap("btrip_sub_order_id")
        private Long btripSubOrderId;

        @NameInMap("dis_order_id")
        private String disOrderId;

        @NameInMap("dis_sub_order_id")
        private String disSubOrderId;

        @NameInMap("is_voluntary")
        private Integer isVoluntary;

        @NameInMap("reason")
        private String reason;

        @NameInMap("refund_fee")
        private Long refundFee;

        @NameInMap("refund_fee_list")
        private java.util.List < RefundFeeList> refundFeeList;

        @NameInMap("refund_price")
        private Long refundPrice;

        @NameInMap("status")
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
        public java.util.List < RefundFeeList> getRefundFeeList() {
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
            private java.util.List < RefundFeeList> refundFeeList; 
            private Long refundPrice; 
            private String status; 

            /**
             * 订单号
             */
            public Builder btripOrderId(Long btripOrderId) {
                this.btripOrderId = btripOrderId;
                return this;
            }

            /**
             * 退票单号
             */
            public Builder btripSubOrderId(Long btripSubOrderId) {
                this.btripSubOrderId = btripSubOrderId;
                return this;
            }

            /**
             * 订单号
             */
            public Builder disOrderId(String disOrderId) {
                this.disOrderId = disOrderId;
                return this;
            }

            /**
             * 退票单号
             */
            public Builder disSubOrderId(String disSubOrderId) {
                this.disSubOrderId = disSubOrderId;
                return this;
            }

            /**
             * 是否是自愿退票
             */
            public Builder isVoluntary(Integer isVoluntary) {
                this.isVoluntary = isVoluntary;
                return this;
            }

            /**
             * 退票原因
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * 退票手续费
             */
            public Builder refundFee(Long refundFee) {
                this.refundFee = refundFee;
                return this;
            }

            /**
             * 退票费用列表
             */
            public Builder refundFeeList(java.util.List < RefundFeeList> refundFeeList) {
                this.refundFeeList = refundFeeList;
                return this;
            }

            /**
             * 退票金额
             */
            public Builder refundPrice(Long refundPrice) {
                this.refundPrice = refundPrice;
                return this;
            }

            /**
             * 状态
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
