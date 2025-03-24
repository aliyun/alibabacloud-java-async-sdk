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
 * {@link RenewDesktopGroupResponseBody} extends {@link TeaModel}
 *
 * <p>RenewDesktopGroupResponseBody</p>
 */
public class RenewDesktopGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private java.util.List<String> orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RenewDesktopGroupResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewDesktopGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return orderId
     */
    public java.util.List<String> getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> orderId; 
        private String requestId; 

        /**
         * <p>The order IDs.</p>
         */
        public Builder orderId(java.util.List<String> orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E55E6732-2028-52FA-AB06-EA29C36B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RenewDesktopGroupResponseBody build() {
            return new RenewDesktopGroupResponseBody(this);
        } 

    } 

}
