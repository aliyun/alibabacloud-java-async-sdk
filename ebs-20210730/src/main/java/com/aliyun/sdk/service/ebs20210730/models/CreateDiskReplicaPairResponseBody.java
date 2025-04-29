// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateDiskReplicaPairResponseBody model) {
            this.orderId = model.orderId;
            this.replicaPairId = model.replicaPairId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the replication pair.</p>
         * 
         * <strong>example:</strong>
         * <p>pair-cn-dsa****</p>
         */
        public Builder replicaPairId(String replicaPairId) {
            this.replicaPairId = replicaPairId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C123F94F-4E38-19AE-942A-A8D6F44F****</p>
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
