// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link CreateEnterpriseSnapshotPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEnterpriseSnapshotPolicyResponseBody</p>
 */
public class CreateEnterpriseSnapshotPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private String policyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateEnterpriseSnapshotPolicyResponseBody(Builder builder) {
        this.policyId = builder.policyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEnterpriseSnapshotPolicyResponseBody create() {
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

        private Builder(CreateEnterpriseSnapshotPolicyResponseBody model) {
            this.policyId = model.policyId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The id of a policy.</p>
         * 
         * <strong>example:</strong>
         * <p>esp-xxx</p>
         */
        public Builder policyId(String policyId) {
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7A8959DA-1E04-5724-8288-58334031454E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateEnterpriseSnapshotPolicyResponseBody build() {
            return new CreateEnterpriseSnapshotPolicyResponseBody(this);
        } 

    } 

}
