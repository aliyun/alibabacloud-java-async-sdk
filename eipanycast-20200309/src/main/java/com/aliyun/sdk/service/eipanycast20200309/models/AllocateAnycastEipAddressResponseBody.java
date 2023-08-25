// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateAnycastEipAddressResponseBody} extends {@link TeaModel}
 *
 * <p>AllocateAnycastEipAddressResponseBody</p>
 */
public class AllocateAnycastEipAddressResponseBody extends TeaModel {
    @NameInMap("AnycastId")
    private String anycastId;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
    private String requestId;

    private AllocateAnycastEipAddressResponseBody(Builder builder) {
        this.anycastId = builder.anycastId;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateAnycastEipAddressResponseBody create() {
        return builder().build();
    }

    /**
     * @return anycastId
     */
    public String getAnycastId() {
        return this.anycastId;
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
        private String anycastId; 
        private String orderId; 
        private String requestId; 

        /**
         * The ID of the Anycast EIP.
         */
        public Builder anycastId(String anycastId) {
            this.anycastId = anycastId;
            return this;
        }

        /**
         * The ID of the order.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AllocateAnycastEipAddressResponseBody build() {
            return new AllocateAnycastEipAddressResponseBody(this);
        } 

    } 

}
