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
 * {@link OpenFlinkAiServiceResponseBody} extends {@link TeaModel}
 *
 * <p>OpenFlinkAiServiceResponseBody</p>
 */
public class OpenFlinkAiServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderInfo")
    private OrderInfo orderInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private OpenFlinkAiServiceResponseBody(Builder builder) {
        this.orderInfo = builder.orderInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenFlinkAiServiceResponseBody create() {
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

        private Builder(OpenFlinkAiServiceResponseBody model) {
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

        public OpenFlinkAiServiceResponseBody build() {
            return new OpenFlinkAiServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OpenFlinkAiServiceResponseBody} extends {@link TeaModel}
     *
     * <p>OpenFlinkAiServiceResponseBody</p>
     */
    public static class OrderInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        private OrderInfo(Builder builder) {
            this.instanceId = builder.instanceId;
            this.orderId = builder.orderId;
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

        public static final class Builder {
            private String instanceId; 
            private Long orderId; 

            private Builder() {
            } 

            private Builder(OrderInfo model) {
                this.instanceId = model.instanceId;
                this.orderId = model.orderId;
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

            public OrderInfo build() {
                return new OrderInfo(this);
            } 

        } 

    }
}
