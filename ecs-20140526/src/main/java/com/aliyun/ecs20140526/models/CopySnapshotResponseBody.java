// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopySnapshotResponseBody} extends {@link TeaModel}
 *
 * <p>CopySnapshotResponseBody</p>
 */
public class CopySnapshotResponseBody extends TeaModel {
    @NameInMap("SnapshotId")
    private String snapshotId;

    @NameInMap("RequestId")
    private String requestId;

    private CopySnapshotResponseBody(Builder builder) {
        this.snapshotId = builder.snapshotId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopySnapshotResponseBody create() {
        return builder().build();
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String snapshotId; 
        private String requestId; 

        /**
         * The ID of the new snapshot.
         */
        public Builder snapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CopySnapshotResponseBody build() {
            return new CopySnapshotResponseBody(this);
        } 

    } 

}
