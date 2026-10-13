// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link CreateRCNodePoolResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRCNodePoolResponseBody</p>
 */
public class CreateRCNodePoolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceIdSets")
    private java.util.List<String> instanceIdSets;

    @com.aliyun.core.annotation.NameInMap("NodePoolId")
    private String nodePoolId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateRCNodePoolResponseBody(Builder builder) {
        this.instanceIdSets = builder.instanceIdSets;
        this.nodePoolId = builder.nodePoolId;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRCNodePoolResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIdSets
     */
    public java.util.List<String> getInstanceIdSets() {
        return this.instanceIdSets;
    }

    /**
     * @return nodePoolId
     */
    public String getNodePoolId() {
        return this.nodePoolId;
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
        private java.util.List<String> instanceIdSets; 
        private String nodePoolId; 
        private String orderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateRCNodePoolResponseBody model) {
            this.instanceIdSets = model.instanceIdSets;
            this.nodePoolId = model.nodePoolId;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The instance IDs.</p>
         */
        public Builder instanceIdSets(java.util.List<String> instanceIdSets) {
            this.instanceIdSets = instanceIdSets;
            return this;
        }

        /**
         * <p>The node pool ID.</p>
         * 
         * <strong>example:</strong>
         * <p>np31da1b38983f4511b490fc62108a****</p>
         */
        public Builder nodePoolId(String nodePoolId) {
            this.nodePoolId = nodePoolId;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>50357661918****</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>08A3B71B-FE08-4B03-974F-CC7EA6DB1828</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateRCNodePoolResponseBody build() {
            return new CreateRCNodePoolResponseBody(this);
        } 

    } 

}
