// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wuying_personal_pc20251111.models;

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
 * {@link CreateOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrderResponseBody</p>
 */
public class CreateOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private CreateOrderResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrderResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(CreateOrderResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.traceId = model.traceId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public CreateOrderResponseBody build() {
            return new CreateOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateOrderResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrderResponseBody</p>
     */
    public static class OrderDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private java.util.List<String> instanceIds;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        private OrderDetailList(Builder builder) {
            this.instanceIds = builder.instanceIds;
            this.orderId = builder.orderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderDetailList create() {
            return builder().build();
        }

        /**
         * @return instanceIds
         */
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        public static final class Builder {
            private java.util.List<String> instanceIds; 
            private Long orderId; 

            private Builder() {
            } 

            private Builder(OrderDetailList model) {
                this.instanceIds = model.instanceIds;
                this.orderId = model.orderId;
            } 

            /**
             * InstanceIds.
             */
            public Builder instanceIds(java.util.List<String> instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            public OrderDetailList build() {
                return new OrderDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateOrderResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrderResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrderDetailList")
        private java.util.List<OrderDetailList> orderDetailList;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("PayLink")
        private String payLink;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        private Data(Builder builder) {
            this.orderDetailList = builder.orderDetailList;
            this.orderId = builder.orderId;
            this.payLink = builder.payLink;
            this.resourceId = builder.resourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return orderDetailList
         */
        public java.util.List<OrderDetailList> getOrderDetailList() {
            return this.orderDetailList;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return payLink
         */
        public String getPayLink() {
            return this.payLink;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        public static final class Builder {
            private java.util.List<OrderDetailList> orderDetailList; 
            private String orderId; 
            private String payLink; 
            private String resourceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.orderDetailList = model.orderDetailList;
                this.orderId = model.orderId;
                this.payLink = model.payLink;
                this.resourceId = model.resourceId;
            } 

            /**
             * OrderDetailList.
             */
            public Builder orderDetailList(java.util.List<OrderDetailList> orderDetailList) {
                this.orderDetailList = orderDetailList;
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
             * PayLink.
             */
            public Builder payLink(String payLink) {
                this.payLink = payLink;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
