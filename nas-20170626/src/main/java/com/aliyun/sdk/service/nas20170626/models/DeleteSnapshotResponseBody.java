// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSnapshotResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSnapshotResponseBody</p>
 */
public class DeleteSnapshotResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteSnapshotResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSnapshotResponseBody create() {
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
         * The request ID.
         * <p>
         * 
         * Every response returns a unique request ID regardless of whether the request is successful.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteSnapshotResponseBody build() {
            return new DeleteSnapshotResponseBody(this);
        } 

    } 

}
