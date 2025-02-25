// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
         * <p>The ID of the request. It is used to locate logs and troubleshoot problems.</p>
         * 
         * <strong>example:</strong>
         * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The order information for creating a serverless resource group.</p>
         */
        public Builder resourceGroupOrder(ResourceGroupOrder resourceGroupOrder) {
            this.resourceGroupOrder = resourceGroupOrder;
            return this;
        }

        /**
         * <p>Whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
             * <p>The unique identifier of the serverless resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>Serverless_res_group_524257424564736_6831777003XXXXX</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the order to create a serverless resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>2391982058XXXXX</p>
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>The ID of the order instance that created the serverless resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>c442b330-3b10-4584-959e-736e4edXXXXX</p>
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
