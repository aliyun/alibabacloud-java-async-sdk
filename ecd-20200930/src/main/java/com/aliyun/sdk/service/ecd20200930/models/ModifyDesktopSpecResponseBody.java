// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDesktopSpecResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDesktopSpecResponseBody</p>
 */
public class ModifyDesktopSpecResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("OrderIds")
    private java.util.List < Long > orderIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyDesktopSpecResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.orderIds = builder.orderIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopSpecResponseBody create() {
        return builder().build();
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return orderIds
     */
    public java.util.List < Long > getOrderIds() {
        return this.orderIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String orderId; 
        private java.util.List < Long > orderIds; 
        private String requestId; 

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * OrderIds.
         */
        public Builder orderIds(java.util.List < Long > orderIds) {
            this.orderIds = orderIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDesktopSpecResponseBody build() {
            return new ModifyDesktopSpecResponseBody(this);
        } 

    } 

}
