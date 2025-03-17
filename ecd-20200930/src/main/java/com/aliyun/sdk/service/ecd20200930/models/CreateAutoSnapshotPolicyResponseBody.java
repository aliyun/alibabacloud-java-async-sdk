// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CreateAutoSnapshotPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAutoSnapshotPolicyResponseBody</p>
 */
public class CreateAutoSnapshotPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private String policyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateAutoSnapshotPolicyResponseBody model) {
            this.policyId = model.policyId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the automatic snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-3hpa78d0qyt99****</p>
         */
        public Builder policyId(String policyId) {
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>51592A88-0F2C-55E6-AD2C-2AD9C10D****</p>
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
