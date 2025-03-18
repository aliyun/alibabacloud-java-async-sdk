// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
    private java.util.List<String> snapShotId;

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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapShotId
     */
    public java.util.List<String> getSnapShotId() {
        return this.snapShotId;
    }

    public static final class Builder {
        private String orderId; 
        private String requestId; 
        private java.util.List<String> snapShotId; 

        private Builder() {
        } 

        private Builder(CreateSnapshotResponseBody model) {
            this.orderId = model.orderId;
            this.requestId = model.requestId;
            this.snapShotId = model.snapShotId;
        } 

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>21969183547****</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The IDs of the snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp17441ohwka0yuh****</p>
         */
        public Builder snapShotId(java.util.List<String> snapShotId) {
            this.snapShotId = snapShotId;
            return this;
        }

        public CreateSnapshotResponseBody build() {
            return new CreateSnapshotResponseBody(this);
        } 

    } 

}
