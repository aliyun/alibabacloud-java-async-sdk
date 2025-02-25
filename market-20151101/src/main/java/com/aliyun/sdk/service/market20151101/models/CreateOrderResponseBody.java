// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

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
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private InstanceIds instanceIds;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateOrderResponseBody(Builder builder) {
        this.instanceIds = builder.instanceIds;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceIds
     */
    public InstanceIds getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceIds instanceIds; 
        private String orderId; 
        private String requestId; 

        /**
         * InstanceIds.
         */
        public Builder instanceIds(InstanceIds instanceIds) {
            this.instanceIds = instanceIds;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
    public static class InstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private java.util.List<String> instanceId;

        private InstanceIds(Builder builder) {
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceIds create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private java.util.List<String> instanceId; 

            /**
             * InstanceId.
             */
            public Builder instanceId(java.util.List<String> instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstanceIds build() {
                return new InstanceIds(this);
            } 

        } 

    }
}
