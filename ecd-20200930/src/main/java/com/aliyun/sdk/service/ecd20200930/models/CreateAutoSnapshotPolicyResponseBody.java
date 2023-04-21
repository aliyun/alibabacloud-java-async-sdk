// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAutoSnapshotPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAutoSnapshotPolicyResponseBody</p>
 */
public class CreateAutoSnapshotPolicyResponseBody extends TeaModel {
    @NameInMap("PolicyId")
    private String policyId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateAutoSnapshotPolicyResponseBody(Builder builder) {
        this.policyId = builder.policyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAutoSnapshotPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String policyId; 
        private String requestId; 

        /**
         * The ID of the automatic snapshot policy.
         */
        public Builder policyId(String policyId) {
            this.policyId = policyId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAutoSnapshotPolicyResponseBody build() {
            return new CreateAutoSnapshotPolicyResponseBody(this);
        } 

    } 

}
