// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

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
 * {@link CreateInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInstanceResponseBody</p>
 */
public class CreateInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderInfo")
    private OrderInfo orderInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateInstanceResponseBody(Builder builder) {
        this.orderInfo = builder.orderInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderInfo
     */
    public OrderInfo getOrderInfo() {
        return this.orderInfo;
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

    public static final class Builder {
        private OrderInfo orderInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateInstanceResponseBody model) {
            this.orderInfo = model.orderInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * OrderInfo.
         */
        public Builder orderInfo(OrderInfo orderInfo) {
            this.orderInfo = orderInfo;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateInstanceResponseBody build() {
            return new CreateInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateInstanceResponseBody</p>
     */
    public static class OrderInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("StorageInstanceId")
        private String storageInstanceId;

        @com.aliyun.core.annotation.NameInMap("StorageOrderId")
        private Long storageOrderId;

        private OrderInfo(Builder builder) {
            this.instanceId = builder.instanceId;
            this.orderId = builder.orderId;
            this.storageInstanceId = builder.storageInstanceId;
            this.storageOrderId = builder.storageOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderInfo create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return storageInstanceId
         */
        public String getStorageInstanceId() {
            return this.storageInstanceId;
        }

        /**
         * @return storageOrderId
         */
        public Long getStorageOrderId() {
            return this.storageOrderId;
        }

        public static final class Builder {
            private String instanceId; 
            private Long orderId; 
            private String storageInstanceId; 
            private Long storageOrderId; 

            private Builder() {
            } 

            private Builder(OrderInfo model) {
                this.instanceId = model.instanceId;
                this.orderId = model.orderId;
                this.storageInstanceId = model.storageInstanceId;
                this.storageOrderId = model.storageOrderId;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * StorageInstanceId.
             */
            public Builder storageInstanceId(String storageInstanceId) {
                this.storageInstanceId = storageInstanceId;
                return this;
            }

            /**
             * StorageOrderId.
             */
            public Builder storageOrderId(Long storageOrderId) {
                this.storageOrderId = storageOrderId;
                return this;
            }

            public OrderInfo build() {
                return new OrderInfo(this);
            } 

        } 

    }
}
