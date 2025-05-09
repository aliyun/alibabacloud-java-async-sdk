// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link CreateSnapshotGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSnapshotGroupResponseBody</p>
 */
public class CreateSnapshotGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnapshotGroupId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateSnapshotGroupResponseBody model) {
            this.requestId = model.requestId;
            this.snapshotGroupId = model.snapshotGroupId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01ABBD93-1ABB-4D92-B496-1A3D20EC0697</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the snapshot-consistent group.</p>
         * 
         * <strong>example:</strong>
         * <p>ssg-j6ciyh3k52qp7ovm****</p>
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
