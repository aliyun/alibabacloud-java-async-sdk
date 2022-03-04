// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenAckServiceResponseBody} extends {@link TeaModel}
 *
 * <p>OpenAckServiceResponseBody</p>
 */
public class OpenAckServiceResponseBody extends TeaModel {
    @NameInMap("request_id")
    private String requestId;

    @NameInMap("order_id")
    private String orderId;

    private OpenAckServiceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenAckServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    public static final class Builder {
        private String requestId; 
        private String orderId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The order number of the service.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public OpenAckServiceResponseBody build() {
            return new OpenAckServiceResponseBody(this);
        } 

    } 

}
