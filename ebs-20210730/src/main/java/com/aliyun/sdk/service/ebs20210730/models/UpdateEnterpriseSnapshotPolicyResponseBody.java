// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEnterpriseSnapshotPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateEnterpriseSnapshotPolicyResponseBody</p>
 */
public class UpdateEnterpriseSnapshotPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateEnterpriseSnapshotPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEnterpriseSnapshotPolicyResponseBody create() {
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
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateEnterpriseSnapshotPolicyResponseBody build() {
            return new UpdateEnterpriseSnapshotPolicyResponseBody(this);
        } 

    } 

}
