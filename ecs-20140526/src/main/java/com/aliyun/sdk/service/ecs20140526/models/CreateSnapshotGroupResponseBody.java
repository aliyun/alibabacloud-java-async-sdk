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
    @NameInMap("SnapshotGroupId")
    private String snapshotGroupId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateSnapshotGroupResponseBody(Builder builder) {
        this.snapshotGroupId = builder.snapshotGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSnapshotGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return snapshotGroupId
     */
    public String getSnapshotGroupId() {
        return this.snapshotGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String snapshotGroupId; 
        private String requestId; 

        /**
         * The ID of the snapshot consistency group.
         */
        public Builder snapshotGroupId(String snapshotGroupId) {
            this.snapshotGroupId = snapshotGroupId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateSnapshotGroupResponseBody build() {
            return new CreateSnapshotGroupResponseBody(this);
        } 

    } 

}
