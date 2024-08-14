// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDedicatedBlockStorageClusterResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDedicatedBlockStorageClusterResponseBody</p>
 */
public class CreateDedicatedBlockStorageClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DbscId")
    private String dbscId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDedicatedBlockStorageClusterResponseBody(Builder builder) {
        this.dbscId = builder.dbscId;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDedicatedBlockStorageClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return dbscId
     */
    public String getDbscId() {
        return this.dbscId;
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
        private String dbscId; 
        private String orderId; 
        private String requestId; 

        /**
         * The ID of the dedicated block storage cluster.
         */
        public Builder dbscId(String dbscId) {
            this.dbscId = dbscId;
            return this;
        }

        /**
         * The order ID.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDedicatedBlockStorageClusterResponseBody build() {
            return new CreateDedicatedBlockStorageClusterResponseBody(this);
        } 

    } 

}
