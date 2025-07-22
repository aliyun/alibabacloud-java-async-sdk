// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mseap20210118.models;

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
 * {@link GetOrderSummaryForPartnerResponseBody} extends {@link TeaModel}
 *
 * <p>GetOrderSummaryForPartnerResponseBody</p>
 */
public class GetOrderSummaryForPartnerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetOrderSummaryForPartnerResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrderSummaryForPartnerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetOrderSummaryForPartnerResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>56B009EB-AAA5-52C9-B05F-AF425E3885E8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOrderSummaryForPartnerResponseBody build() {
            return new GetOrderSummaryForPartnerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOrderSummaryForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrderSummaryForPartnerResponseBody</p>
     */
    public static class OrderLines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("OrderLineId")
        private String orderLineId;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        private OrderLines(Builder builder) {
            this.instanceId = builder.instanceId;
            this.orderLineId = builder.orderLineId;
            this.orderType = builder.orderType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderLines create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return orderLineId
         */
        public String getOrderLineId() {
            return this.orderLineId;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        public static final class Builder {
            private String instanceId; 
            private String orderLineId; 
            private String orderType; 

            private Builder() {
            } 

            private Builder(OrderLines model) {
                this.instanceId = model.instanceId;
                this.orderLineId = model.orderLineId;
                this.orderType = model.orderType;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * OrderLineId.
             */
            public Builder orderLineId(String orderLineId) {
                this.orderLineId = orderLineId;
                return this;
            }

            /**
             * OrderType.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            public OrderLines build() {
                return new OrderLines(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOrderSummaryForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrderSummaryForPartnerResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncryptedBuyerId")
        private String encryptedBuyerId;

        @com.aliyun.core.annotation.NameInMap("EncryptedPayerId")
        private String encryptedPayerId;

        @com.aliyun.core.annotation.NameInMap("EncryptedUserId")
        private String encryptedUserId;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("OrderLines")
        private java.util.List<OrderLines> orderLines;

        private Data(Builder builder) {
            this.encryptedBuyerId = builder.encryptedBuyerId;
            this.encryptedPayerId = builder.encryptedPayerId;
            this.encryptedUserId = builder.encryptedUserId;
            this.orderId = builder.orderId;
            this.orderLines = builder.orderLines;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return encryptedBuyerId
         */
        public String getEncryptedBuyerId() {
            return this.encryptedBuyerId;
        }

        /**
         * @return encryptedPayerId
         */
        public String getEncryptedPayerId() {
            return this.encryptedPayerId;
        }

        /**
         * @return encryptedUserId
         */
        public String getEncryptedUserId() {
            return this.encryptedUserId;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderLines
         */
        public java.util.List<OrderLines> getOrderLines() {
            return this.orderLines;
        }

        public static final class Builder {
            private String encryptedBuyerId; 
            private String encryptedPayerId; 
            private String encryptedUserId; 
            private String orderId; 
            private java.util.List<OrderLines> orderLines; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.encryptedBuyerId = model.encryptedBuyerId;
                this.encryptedPayerId = model.encryptedPayerId;
                this.encryptedUserId = model.encryptedUserId;
                this.orderId = model.orderId;
                this.orderLines = model.orderLines;
            } 

            /**
             * EncryptedBuyerId.
             */
            public Builder encryptedBuyerId(String encryptedBuyerId) {
                this.encryptedBuyerId = encryptedBuyerId;
                return this;
            }

            /**
             * EncryptedPayerId.
             */
            public Builder encryptedPayerId(String encryptedPayerId) {
                this.encryptedPayerId = encryptedPayerId;
                return this;
            }

            /**
             * EncryptedUserId.
             */
            public Builder encryptedUserId(String encryptedUserId) {
                this.encryptedUserId = encryptedUserId;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * OrderLines.
             */
            public Builder orderLines(java.util.List<OrderLines> orderLines) {
                this.orderLines = orderLines;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
