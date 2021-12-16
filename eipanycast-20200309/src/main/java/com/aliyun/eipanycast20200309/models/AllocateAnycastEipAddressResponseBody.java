// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
         * <p>AnycastId.</p>
         */
        public Builder anycastId(String anycastId) {
            this.anycastId = anycastId;
            return this;
        }

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

        public AllocateAnycastEipAddressResponseBody build() {
            return new AllocateAnycastEipAddressResponseBody(this);
        } 

    } 

}
