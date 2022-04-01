// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyAutoSnapshotPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyAutoSnapshotPolicyResponseBody</p>
 */
public class ApplyAutoSnapshotPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ApplyAutoSnapshotPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyAutoSnapshotPolicyResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ApplyAutoSnapshotPolicyResponseBody build() {
            return new ApplyAutoSnapshotPolicyResponseBody(this);
        } 

    } 

}
