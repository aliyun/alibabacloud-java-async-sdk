// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link PurchaseCacheReserveResponseBody} extends {@link TeaModel}
 *
 * <p>PurchaseCacheReserveResponseBody</p>
 */
public class PurchaseCacheReserveResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PurchaseCacheReserveResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PurchaseCacheReserveResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
        private String instanceId; 
        private String orderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PurchaseCacheReserveResponseBody model) {
            this.instanceId = model.instanceId;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xcdn-ad*****s11w</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31223****11</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30423A7F-A83D-1E24-B80E-86DD25790758</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PurchaseCacheReserveResponseBody build() {
            return new PurchaseCacheReserveResponseBody(this);
        } 

    } 

}
