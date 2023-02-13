// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSnapshotGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSnapshotGroupResponseBody</p>
 */
public class CreateSnapshotGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SnapshotGroupId")
    private String snapshotGroupId;

    private CreateSnapshotGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.snapshotGroupId = builder.snapshotGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSnapshotGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshotGroupId
     */
    public String getSnapshotGroupId() {
        return this.snapshotGroupId;
    }

    public static final class Builder {
        private String requestId; 
        private String snapshotGroupId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the snapshot-consistent group.
         */
        public Builder snapshotGroupId(String snapshotGroupId) {
            this.snapshotGroupId = snapshotGroupId;
            return this;
        }

        public CreateSnapshotGroupResponseBody build() {
            return new CreateSnapshotGroupResponseBody(this);
        } 

    } 

}
