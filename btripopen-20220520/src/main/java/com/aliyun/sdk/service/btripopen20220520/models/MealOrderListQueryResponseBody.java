// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MealOrderListQueryResponseBody} extends {@link TeaModel}
 *
 * <p>MealOrderListQueryResponseBody</p>
 */
public class MealOrderListQueryResponseBody extends TeaModel {
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

    private MealOrderListQueryResponseBody(Builder builder) {
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

    public static MealOrderListQueryResponseBody create() {
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

        public MealOrderListQueryResponseBody build() {
            return new MealOrderListQueryResponseBody(this);
        } 

    } 

    public static class OrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("corp_pay_amount")
        private Long corpPayAmount;

        @com.aliyun.core.annotation.NameInMap("merchant_name")
        private String merchantName;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("order_status")
        private Integer orderStatus;

        @com.aliyun.core.annotation.NameInMap("order_type")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("pay_amount")
        private Long payAmount;

        @com.aliyun.core.annotation.NameInMap("person_pay_amount")
        private Long personPayAmount;

        @com.aliyun.core.annotation.NameInMap("settle_time")
        private String settleTime;

        private OrderList(Builder builder) {
            this.corpPayAmount = builder.corpPayAmount;
            this.merchantName = builder.merchantName;
            this.orderId = builder.orderId;
            this.orderStatus = builder.orderStatus;
            this.orderType = builder.orderType;
            this.payAmount = builder.payAmount;
            this.personPayAmount = builder.personPayAmount;
            this.settleTime = builder.settleTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderList create() {
            return builder().build();
        }

        /**
         * @return corpPayAmount
         */
        public Long getCorpPayAmount() {
            return this.corpPayAmount;
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
         * @return personPayAmount
         */
        public Long getPersonPayAmount() {
            return this.personPayAmount;
        }

        /**
         * @return settleTime
         */
        public String getSettleTime() {
            return this.settleTime;
        }

        public static final class Builder {
            private Long corpPayAmount; 
            private String merchantName; 
            private String orderId; 
            private Integer orderStatus; 
            private String orderType; 
            private Long payAmount; 
            private Long personPayAmount; 
            private String settleTime; 

            /**
             * corp_pay_amount.
             */
            public Builder corpPayAmount(Long corpPayAmount) {
                this.corpPayAmount = corpPayAmount;
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
             * person_pay_amount.
             */
            public Builder personPayAmount(Long personPayAmount) {
                this.personPayAmount = personPayAmount;
                return this;
            }

            /**
             * settle_time.
             */
            public Builder settleTime(String settleTime) {
                this.settleTime = settleTime;
                return this;
            }

            public OrderList build() {
                return new OrderList(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("order_list")
        private java.util.List < OrderList> orderList;

        private Module(Builder builder) {
            this.orderList = builder.orderList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return orderList
         */
        public java.util.List < OrderList> getOrderList() {
            return this.orderList;
        }

        public static final class Builder {
            private java.util.List < OrderList> orderList; 

            /**
             * order_list.
             */
            public Builder orderList(java.util.List < OrderList> orderList) {
                this.orderList = orderList;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
