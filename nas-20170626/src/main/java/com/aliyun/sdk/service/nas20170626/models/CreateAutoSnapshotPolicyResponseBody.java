// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateAutoSnapshotPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAutoSnapshotPolicyResponseBody</p>
 */
public class CreateAutoSnapshotPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyId")
    private String autoSnapshotPolicyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAutoSnapshotPolicyResponseBody(Builder builder) {
        this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAutoSnapshotPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoSnapshotPolicyId
     */
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String autoSnapshotPolicyId; 
        private String requestId; 

        /**
         * <p>The ID of the automatic snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-extreme-233e6****</p>
         */
        public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
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
