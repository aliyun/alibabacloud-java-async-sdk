// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateResourceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateResourceGroupResponseBody</p>
 */
public class CreateResourceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupOrder")
    private ResourceGroupOrder resourceGroupOrder;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateResourceGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceGroupOrder = builder.resourceGroupOrder;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupOrder
     */
    public ResourceGroupOrder getResourceGroupOrder() {
        return this.resourceGroupOrder;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private ResourceGroupOrder resourceGroupOrder; 
        private Boolean success; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceGroupOrder.
         */
        public Builder resourceGroupOrder(ResourceGroupOrder resourceGroupOrder) {
            this.resourceGroupOrder = resourceGroupOrder;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateResourceGroupResponseBody build() {
            return new CreateResourceGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateResourceGroupResponseBody</p>
     */
    public static class ResourceGroupOrder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("OrderInstanceId")
        private String orderInstanceId;

        private ResourceGroupOrder(Builder builder) {
            this.id = builder.id;
            this.orderId = builder.orderId;
            this.orderInstanceId = builder.orderInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceGroupOrder create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderInstanceId
         */
        public String getOrderInstanceId() {
            return this.orderInstanceId;
        }

        public static final class Builder {
            private String id; 
            private Long orderId; 
            private String orderInstanceId; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * OrderInstanceId.
             */
            public Builder orderInstanceId(String orderInstanceId) {
                this.orderInstanceId = orderInstanceId;
                return this;
            }

            public ResourceGroupOrder build() {
                return new ResourceGroupOrder(this);
            } 

        } 

    }
}
