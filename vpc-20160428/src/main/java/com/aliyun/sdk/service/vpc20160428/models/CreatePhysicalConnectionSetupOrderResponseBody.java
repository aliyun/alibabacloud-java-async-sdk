// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePhysicalConnectionSetupOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePhysicalConnectionSetupOrderResponseBody</p>
 */
public class CreatePhysicalConnectionSetupOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("PhysicalConnectionId")
    private String physicalConnectionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePhysicalConnectionSetupOrderResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.physicalConnectionId = builder.physicalConnectionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePhysicalConnectionSetupOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return physicalConnectionId
     */
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String orderId; 
        private String physicalConnectionId; 
        private String requestId; 

        /**
         * The ID of the order.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * The ID of the Express Connect circuit.
         */
        public Builder physicalConnectionId(String physicalConnectionId) {
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePhysicalConnectionSetupOrderResponseBody build() {
            return new CreatePhysicalConnectionSetupOrderResponseBody(this);
        } 

    } 

}
