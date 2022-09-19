// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMyBaseResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMyBaseResponseBody</p>
 */
public class CreateMyBaseResponseBody extends TeaModel {
    @NameInMap("OrderList")
    private OrderList orderList;

    @NameInMap("RequestId")
    private String requestId;

    private CreateMyBaseResponseBody(Builder builder) {
        this.orderList = builder.orderList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMyBaseResponseBody create() {
        return builder().build();
    }

    /**
     * @return orderList
     */
    public OrderList getOrderList() {
        return this.orderList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OrderList orderList; 
        private String requestId; 

        /**
         * OrderList.
         */
        public Builder orderList(OrderList orderList) {
            this.orderList = orderList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMyBaseResponseBody build() {
            return new CreateMyBaseResponseBody(this);
        } 

    } 

    public static class OrderListOrderList extends TeaModel {
        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("ECSInstanceIds")
        private String ECSInstanceIds;

        @NameInMap("OrderId")
        private String orderId;

        private OrderListOrderList(Builder builder) {
            this.createTimestamp = builder.createTimestamp;
            this.ECSInstanceIds = builder.ECSInstanceIds;
            this.orderId = builder.orderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderListOrderList create() {
            return builder().build();
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return ECSInstanceIds
         */
        public String getECSInstanceIds() {
            return this.ECSInstanceIds;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        public static final class Builder {
            private Long createTimestamp; 
            private String ECSInstanceIds; 
            private String orderId; 

            /**
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * ECSInstanceIds.
             */
            public Builder ECSInstanceIds(String ECSInstanceIds) {
                this.ECSInstanceIds = ECSInstanceIds;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            public OrderListOrderList build() {
                return new OrderListOrderList(this);
            } 

        } 

    }
    public static class OrderList extends TeaModel {
        @NameInMap("OrderList")
        private java.util.List < OrderListOrderList> orderList;

        private OrderList(Builder builder) {
            this.orderList = builder.orderList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderList create() {
            return builder().build();
        }

        /**
         * @return orderList
         */
        public java.util.List < OrderListOrderList> getOrderList() {
            return this.orderList;
        }

        public static final class Builder {
            private java.util.List < OrderListOrderList> orderList; 

            /**
             * OrderList.
             */
            public Builder orderList(java.util.List < OrderListOrderList> orderList) {
                this.orderList = orderList;
                return this;
            }

            public OrderList build() {
                return new OrderList(this);
            } 

        } 

    }
}
