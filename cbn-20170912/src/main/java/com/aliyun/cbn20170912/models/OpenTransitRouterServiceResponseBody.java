// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link OpenTransitRouterServiceResponseBody} extends {@link TeaModel}
 *
 * <p>OpenTransitRouterServiceResponseBody</p>
 */
public class OpenTransitRouterServiceResponseBody extends TeaModel {
    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
    private String requestId;


    private OpenTransitRouterServiceResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenTransitRouterServiceResponseBody create() {
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
         * <p>OrderId.</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OpenTransitRouterServiceResponseBody build() {
            return new OpenTransitRouterServiceResponseBody(this);
        } 

    } 

}
