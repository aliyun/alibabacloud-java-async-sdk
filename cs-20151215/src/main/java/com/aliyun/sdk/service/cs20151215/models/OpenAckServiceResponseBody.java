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
    @NameInMap("order_id")
    private String orderId;

    @NameInMap("request_id")
    private String requestId;

    private OpenAckServiceResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenAckServiceResponseBody create() {
        return builder().build();
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
        private String orderId; 
        private String requestId; 

        /**
         * 开通服务的订单号。
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OpenAckServiceResponseBody build() {
            return new OpenAckServiceResponseBody(this);
        } 

    } 

}
