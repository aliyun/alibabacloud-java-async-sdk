// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MealOrderDetailQueryResponseBody} extends {@link TeaModel}
 *
 * <p>MealOrderDetailQueryResponseBody</p>
 */
public class MealOrderDetailQueryResponseBody extends TeaModel {
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

    private MealOrderDetailQueryResponseBody(Builder builder) {
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

    public static MealOrderDetailQueryResponseBody create() {
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
         * traceId
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public MealOrderDetailQueryResponseBody build() {
            return new MealOrderDetailQueryResponseBody(this);
        } 

    } 

    public static class Module extends TeaModel {
        @NameInMap("corp_code_order_id")
        private String corpCodeOrderId;

        @NameInMap("corp_id")
        private String corpId;

        @NameInMap("corp_pay_amount")
        private Long corpPayAmount;

        @NameInMap("corp_refund_amount")
        private Long corpRefundAmount;

        @NameInMap("merchant_name")
        private String merchantName;

        @NameInMap("order_id")
        private String orderId;

        @NameInMap("order_status")
        private Integer orderStatus;

        @NameInMap("order_sub_status")
        private Integer orderSubStatus;

        @NameInMap("order_type")
        private String orderType;

        @NameInMap("pay_amount")
        private Long payAmount;

        @NameInMap("pay_type")
        private Integer payType;

        @NameInMap("person_pay_amount")
        private Long personPayAmount;

        @NameInMap("person_refund_amount")
        private Long personRefundAmount;

        @NameInMap("refund_amount")
        private Long refundAmount;

        @NameInMap("scene_name")
        private String sceneName;

        @NameInMap("settle_time")
        private String settleTime;

        @NameInMap("user_alipay_id")
        private String userAlipayId;

        @NameInMap("user_id")
        private String userId;

        private Module(Builder builder) {
            this.corpCodeOrderId = builder.corpCodeOrderId;
            this.corpId = builder.corpId;
            this.corpPayAmount = builder.corpPayAmount;
            this.corpRefundAmount = builder.corpRefundAmount;
            this.merchantName = builder.merchantName;
            this.orderId = builder.orderId;
            this.orderStatus = builder.orderStatus;
            this.orderSubStatus = builder.orderSubStatus;
            this.orderType = builder.orderType;
            this.payAmount = builder.payAmount;
            this.payType = builder.payType;
            this.personPayAmount = builder.personPayAmount;
            this.personRefundAmount = builder.personRefundAmount;
            this.refundAmount = builder.refundAmount;
            this.sceneName = builder.sceneName;
            this.settleTime = builder.settleTime;
            this.userAlipayId = builder.userAlipayId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return corpCodeOrderId
         */
        public String getCorpCodeOrderId() {
            return this.corpCodeOrderId;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return corpPayAmount
         */
        public Long getCorpPayAmount() {
            return this.corpPayAmount;
        }

        /**
         * @return corpRefundAmount
         */
        public Long getCorpRefundAmount() {
            return this.corpRefundAmount;
        }

        /**
         * @return merchantName
         */
        public String getMerchantName() {
            return this.merchantName;
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
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return orderSubStatus
         */
        public Integer getOrderSubStatus() {
            return this.orderSubStatus;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return payAmount
         */
        public Long getPayAmount() {
            return this.payAmount;
        }

        /**
         * @return payType
         */
        public Integer getPayType() {
            return this.payType;
        }

        /**
         * @return personPayAmount
         */
        public Long getPersonPayAmount() {
            return this.personPayAmount;
        }

        /**
         * @return personRefundAmount
         */
        public Long getPersonRefundAmount() {
            return this.personRefundAmount;
        }

        /**
         * @return refundAmount
         */
        public Long getRefundAmount() {
            return this.refundAmount;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return settleTime
         */
        public String getSettleTime() {
            return this.settleTime;
        }

        /**
         * @return userAlipayId
         */
        public String getUserAlipayId() {
            return this.userAlipayId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String corpCodeOrderId; 
            private String corpId; 
            private Long corpPayAmount; 
            private Long corpRefundAmount; 
            private String merchantName; 
            private String orderId; 
            private Integer orderStatus; 
            private Integer orderSubStatus; 
            private String orderType; 
            private Long payAmount; 
            private Integer payType; 
            private Long personPayAmount; 
            private Long personRefundAmount; 
            private Long refundAmount; 
            private String sceneName; 
            private String settleTime; 
            private String userAlipayId; 
            private String userId; 

            /**
             * corp_code_order_id.
             */
            public Builder corpCodeOrderId(String corpCodeOrderId) {
                this.corpCodeOrderId = corpCodeOrderId;
                return this;
            }

            /**
             * corp_id.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * corp_pay_amount.
             */
            public Builder corpPayAmount(Long corpPayAmount) {
                this.corpPayAmount = corpPayAmount;
                return this;
            }

            /**
             * corp_refund_amount.
             */
            public Builder corpRefundAmount(Long corpRefundAmount) {
                this.corpRefundAmount = corpRefundAmount;
                return this;
            }

            /**
             * merchant_name.
             */
            public Builder merchantName(String merchantName) {
                this.merchantName = merchantName;
                return this;
            }

            /**
             * order_id.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
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
             * order_sub_status.
             */
            public Builder orderSubStatus(Integer orderSubStatus) {
                this.orderSubStatus = orderSubStatus;
                return this;
            }

            /**
             * order_type.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * pay_amount.
             */
            public Builder payAmount(Long payAmount) {
                this.payAmount = payAmount;
                return this;
            }

            /**
             * pay_type.
             */
            public Builder payType(Integer payType) {
                this.payType = payType;
                return this;
            }

            /**
             * person_pay_amount.
             */
            public Builder personPayAmount(Long personPayAmount) {
                this.personPayAmount = personPayAmount;
                return this;
            }

            /**
             * person_refund_amount.
             */
            public Builder personRefundAmount(Long personRefundAmount) {
                this.personRefundAmount = personRefundAmount;
                return this;
            }

            /**
             * refund_amount.
             */
            public Builder refundAmount(Long refundAmount) {
                this.refundAmount = refundAmount;
                return this;
            }

            /**
             * scene_name.
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * settle_time.
             */
            public Builder settleTime(String settleTime) {
                this.settleTime = settleTime;
                return this;
            }

            /**
             * user_alipay_id.
             */
            public Builder userAlipayId(String userAlipayId) {
                this.userAlipayId = userAlipayId;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
