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
 * {@link OrderRefundDetailQueryResponseBody} extends {@link TeaModel}
 *
 * <p>OrderRefundDetailQueryResponseBody</p>
 */
public class OrderRefundDetailQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private OrderRefundDetailQueryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OrderRefundDetailQueryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private String code; 
        private String message; 
        private Module module; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(OrderRefundDetailQueryResponseBody model) {
            this.requestId = model.requestId;
            this.code = model.code;
            this.message = model.message;
            this.module = model.module;
            this.success = model.success;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
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
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public OrderRefundDetailQueryResponseBody build() {
            return new OrderRefundDetailQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OrderRefundDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>OrderRefundDetailQueryResponseBody</p>
     */
    public static class RefundDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("person_pay_channel")
        private String personPayChannel;

        @com.aliyun.core.annotation.NameInMap("person_refund_id")
        private String personRefundId;

        @com.aliyun.core.annotation.NameInMap("refund_amount")
        private Long refundAmount;

        @com.aliyun.core.annotation.NameInMap("refund_amount_corp")
        private Long refundAmountCorp;

        @com.aliyun.core.annotation.NameInMap("refund_amount_person")
        private Long refundAmountPerson;

        @com.aliyun.core.annotation.NameInMap("supplier_refund_id")
        private String supplierRefundId;

        private RefundDetails(Builder builder) {
            this.personPayChannel = builder.personPayChannel;
            this.personRefundId = builder.personRefundId;
            this.refundAmount = builder.refundAmount;
            this.refundAmountCorp = builder.refundAmountCorp;
            this.refundAmountPerson = builder.refundAmountPerson;
            this.supplierRefundId = builder.supplierRefundId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundDetails create() {
            return builder().build();
        }

        /**
         * @return personPayChannel
         */
        public String getPersonPayChannel() {
            return this.personPayChannel;
        }

        /**
         * @return personRefundId
         */
        public String getPersonRefundId() {
            return this.personRefundId;
        }

        /**
         * @return refundAmount
         */
        public Long getRefundAmount() {
            return this.refundAmount;
        }

        /**
         * @return refundAmountCorp
         */
        public Long getRefundAmountCorp() {
            return this.refundAmountCorp;
        }

        /**
         * @return refundAmountPerson
         */
        public Long getRefundAmountPerson() {
            return this.refundAmountPerson;
        }

        /**
         * @return supplierRefundId
         */
        public String getSupplierRefundId() {
            return this.supplierRefundId;
        }

        public static final class Builder {
            private String personPayChannel; 
            private String personRefundId; 
            private Long refundAmount; 
            private Long refundAmountCorp; 
            private Long refundAmountPerson; 
            private String supplierRefundId; 

            private Builder() {
            } 

            private Builder(RefundDetails model) {
                this.personPayChannel = model.personPayChannel;
                this.personRefundId = model.personRefundId;
                this.refundAmount = model.refundAmount;
                this.refundAmountCorp = model.refundAmountCorp;
                this.refundAmountPerson = model.refundAmountPerson;
                this.supplierRefundId = model.supplierRefundId;
            } 

            /**
             * person_pay_channel.
             */
            public Builder personPayChannel(String personPayChannel) {
                this.personPayChannel = personPayChannel;
                return this;
            }

            /**
             * person_refund_id.
             */
            public Builder personRefundId(String personRefundId) {
                this.personRefundId = personRefundId;
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
             * refund_amount_corp.
             */
            public Builder refundAmountCorp(Long refundAmountCorp) {
                this.refundAmountCorp = refundAmountCorp;
                return this;
            }

            /**
             * refund_amount_person.
             */
            public Builder refundAmountPerson(Long refundAmountPerson) {
                this.refundAmountPerson = refundAmountPerson;
                return this;
            }

            /**
             * supplier_refund_id.
             */
            public Builder supplierRefundId(String supplierRefundId) {
                this.supplierRefundId = supplierRefundId;
                return this;
            }

            public RefundDetails build() {
                return new RefundDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link OrderRefundDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>OrderRefundDetailQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("order_id")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("refund_details")
        private java.util.List<RefundDetails> refundDetails;

        @com.aliyun.core.annotation.NameInMap("total_amount")
        private Long totalAmount;

        private Module(Builder builder) {
            this.orderId = builder.orderId;
            this.refundDetails = builder.refundDetails;
            this.totalAmount = builder.totalAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return refundDetails
         */
        public java.util.List<RefundDetails> getRefundDetails() {
            return this.refundDetails;
        }

        /**
         * @return totalAmount
         */
        public Long getTotalAmount() {
            return this.totalAmount;
        }

        public static final class Builder {
            private String orderId; 
            private java.util.List<RefundDetails> refundDetails; 
            private Long totalAmount; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.orderId = model.orderId;
                this.refundDetails = model.refundDetails;
                this.totalAmount = model.totalAmount;
            } 

            /**
             * order_id.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * refund_details.
             */
            public Builder refundDetails(java.util.List<RefundDetails> refundDetails) {
                this.refundDetails = refundDetails;
                return this;
            }

            /**
             * total_amount.
             */
            public Builder totalAmount(Long totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
