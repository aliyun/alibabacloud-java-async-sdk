// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySnapshotGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySnapshotGroupResponseBody</p>
 */
public class ModifySnapshotGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifySnapshotGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySnapshotGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * The new description of the snapshot-consistent group. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifySnapshotGroupResponseBody build() {
            return new ModifySnapshotGroupResponseBody(this);
        } 

    } 

}
