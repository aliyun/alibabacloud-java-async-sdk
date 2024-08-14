// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiskReplicaPairResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDiskReplicaPairResponseBody</p>
 */
public class CreateDiskReplicaPairResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("ReplicaPairId")
    private String replicaPairId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDiskReplicaPairResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.replicaPairId = builder.replicaPairId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiskReplicaPairResponseBody create() {
        return builder().build();
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return replicaPairId
     */
    public String getReplicaPairId() {
        return this.replicaPairId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String orderId; 
        private String replicaPairId; 
        private String requestId; 

        /**
         * The ID of the order.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * The ID of the replication pair.
         */
        public Builder replicaPairId(String replicaPairId) {
            this.replicaPairId = replicaPairId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDiskReplicaPairResponseBody build() {
            return new CreateDiskReplicaPairResponseBody(this);
        } 

    } 

}
