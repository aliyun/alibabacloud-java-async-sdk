// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CreateVirtualBridgeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVirtualBridgeResponseBody</p>
 */
public class CreateVirtualBridgeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BridgeId")
    private String bridgeId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateVirtualBridgeResponseBody(Builder builder) {
        this.bridgeId = builder.bridgeId;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVirtualBridgeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bridgeId
     */
    public String getBridgeId() {
        return this.bridgeId;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String bridgeId; 
        private Long orderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateVirtualBridgeResponseBody model) {
            this.bridgeId = model.bridgeId;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * BridgeId.
         */
        public Builder bridgeId(String bridgeId) {
            this.bridgeId = bridgeId;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateVirtualBridgeResponseBody build() {
            return new CreateVirtualBridgeResponseBody(this);
        } 

    } 

}
