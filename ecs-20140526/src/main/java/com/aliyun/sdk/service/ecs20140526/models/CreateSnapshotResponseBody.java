// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    private String snapshotId;

    private CreateSnapshotResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.snapshotId = builder.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSnapshotResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public static final class Builder {
        private String requestId; 
        private String snapshotId; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp17441ohwka0yuh****</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        public CreateSnapshotResponseBody build() {
            return new CreateSnapshotResponseBody(this);
        } 

    } 

}
