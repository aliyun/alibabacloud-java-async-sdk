// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSnapshotResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSnapshotResponseBody</p>
 */
public class CreateSnapshotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnapShotId")
    private java.util.List < String > snapShotId;

    private CreateSnapshotResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.snapShotId = builder.snapShotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSnapshotResponseBody create() {
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

    /**
     * @return snapShotId
     */
    public java.util.List < String > getSnapShotId() {
        return this.snapShotId;
    }

    public static final class Builder {
        private String orderId; 
        private String requestId; 
        private java.util.List < String > snapShotId; 

        /**
         * The ID of the order.
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

        /**
         * The ID of the snapshot.
         */
        public Builder snapShotId(java.util.List < String > snapShotId) {
            this.snapShotId = snapShotId;
            return this;
        }

        public CreateSnapshotResponseBody build() {
            return new CreateSnapshotResponseBody(this);
        } 

    } 

}
