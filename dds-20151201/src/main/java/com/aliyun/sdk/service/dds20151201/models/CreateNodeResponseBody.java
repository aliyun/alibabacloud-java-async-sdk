// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNodeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNodeResponseBody</p>
 */
public class CreateNodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateNodeResponseBody(Builder builder) {
        this.nodeId = builder.nodeId;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
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
        private String nodeId; 
        private String orderId; 
        private String requestId; 

        /**
         * The node ID.
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The order ID.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNodeResponseBody build() {
            return new CreateNodeResponseBody(this);
        } 

    } 

}
