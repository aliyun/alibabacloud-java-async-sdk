// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public static final class Builder {
        private String requestId; 
        private String snapshotId; 

        private Builder() {
        } 

        private Builder(CreateSnapshotResponseBody model) {
            this.requestId = model.requestId;
            this.snapshotId = model.snapshotId;
        } 

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>963BD7F9-0C02-5594-9550-BCC6DD43E3C0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Snapshot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>snap-asfg******123</p>
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
