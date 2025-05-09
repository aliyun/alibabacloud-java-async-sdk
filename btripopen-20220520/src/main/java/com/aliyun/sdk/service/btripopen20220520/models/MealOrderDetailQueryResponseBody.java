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
 * {@link MealOrderDetailQueryResponseBody} extends {@link TeaModel}
 *
 * <p>MealOrderDetailQueryResponseBody</p>
 */
public class MealOrderDetailQueryResponseBody extends TeaModel {
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(MealOrderDetailQueryResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.module = model.module;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

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
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>210f079e16603757182131635d866a</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public MealOrderDetailQueryResponseBody build() {
            return new MealOrderDetailQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MealOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>MealOrderDetailQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apply_id")
        private Long applyId;

        @com.aliyun.core.annotation.NameInMap("corp_code_order_id")
        private String corpCodeOrderId;

        @com.aliyun.core.annotation.NameInMap("corp_id")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("corp_pay_amount")
        private Long corpPayAmount;

        @com.aliyun.core.annotation.NameInMap("corp_refund_amount")
        private Long corpRefundAmount;

        @com.aliyun.core.annotation.NameInMap("meal_reason")
        private String mealReason;

        @com.aliyun.core.annotation.NameInMap("merchant_name")
        private String merchantName;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("order_status")
        private Integer orderStatus;

        @com.aliyun.core.annotation.NameInMap("order_sub_status")
        private Integer orderSubStatus;

        @com.aliyun.core.annotation.NameInMap("order_type")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("pay_amount")
        private Long payAmount;

        @com.aliyun.core.annotation.NameInMap("pay_type")
        private Integer payType;

        @com.aliyun.core.annotation.NameInMap("person_pay_amount")
        private Long personPayAmount;

        @com.aliyun.core.annotation.NameInMap("person_refund_amount")
        private Long personRefundAmount;

        @com.aliyun.core.annotation.NameInMap("refund_amount")
        private Long refundAmount;

        @com.aliyun.core.annotation.NameInMap("scene_name")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("settle_time")
        private String settleTime;

        @com.aliyun.core.annotation.NameInMap("third_part_apply_id")
        private String thirdPartApplyId;

        @com.aliyun.core.annotation.NameInMap("user_alipay_id")
        private String userAlipayId;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private Module(Builder builder) {
            this.applyId = builder.applyId;
            this.corpCodeOrderId = builder.corpCodeOrderId;
            this.corpId = builder.corpId;
            this.corpPayAmount = builder.corpPayAmount;
            this.corpRefundAmount = builder.corpRefundAmount;
            this.mealReason = builder.mealReason;
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
            this.thirdPartApplyId = builder.thirdPartApplyId;
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
         * @return applyId
         */
        public Long getApplyId() {
            return this.applyId;
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
         * @return mealReason
         */
        public String getMealReason() {
            return this.mealReason;
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
         * @return thirdPartApplyId
         */
        public String getThirdPartApplyId() {
            return this.thirdPartApplyId;
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
            private Long applyId; 
            private String corpCodeOrderId; 
            private String corpId; 
            private Long corpPayAmount; 
            private Long corpRefundAmount; 
            private String mealReason; 
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
            private String thirdPartApplyId; 
            private String userAlipayId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.applyId = model.applyId;
                this.corpCodeOrderId = model.corpCodeOrderId;
                this.corpId = model.corpId;
                this.corpPayAmount = model.corpPayAmount;
                this.corpRefundAmount = model.corpRefundAmount;
                this.mealReason = model.mealReason;
                this.merchantName = model.merchantName;
                this.orderId = model.orderId;
                this.orderStatus = model.orderStatus;
                this.orderSubStatus = model.orderSubStatus;
                this.orderType = model.orderType;
                this.payAmount = model.payAmount;
                this.payType = model.payType;
                this.personPayAmount = model.personPayAmount;
                this.personRefundAmount = model.personRefundAmount;
                this.refundAmount = model.refundAmount;
                this.sceneName = model.sceneName;
                this.settleTime = model.settleTime;
                this.thirdPartApplyId = model.thirdPartApplyId;
                this.userAlipayId = model.userAlipayId;
                this.userId = model.userId;
            } 

            /**
             * apply_id.
             */
            public Builder applyId(Long applyId) {
                this.applyId = applyId;
                return this;
            }

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
             * meal_reason.
             */
            public Builder mealReason(String mealReason) {
                this.mealReason = mealReason;
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
             * third_part_apply_id.
             */
            public Builder thirdPartApplyId(String thirdPartApplyId) {
                this.thirdPartApplyId = thirdPartApplyId;
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
