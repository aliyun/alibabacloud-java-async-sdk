// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateExecutionPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateExecutionPolicyResponseBody</p>
 */
public class GenerateExecutionPolicyResponseBody extends TeaModel {
    @NameInMap("MissingPolicy")
    private String missingPolicy;

    @NameInMap("Policy")
    private String policy;

    @NameInMap("RequestId")
    private String requestId;

    private GenerateExecutionPolicyResponseBody(Builder builder) {
        this.missingPolicy = builder.missingPolicy;
        this.policy = builder.policy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateExecutionPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return missingPolicy
     */
    public String getMissingPolicy() {
        return this.missingPolicy;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String missingPolicy; 
        private String policy; 
        private String requestId; 

        /**
         * The policies that are missing.
         */
        public Builder missingPolicy(String missingPolicy) {
            this.missingPolicy = missingPolicy;
            return this;
        }

        /**
         * The RAM policy.
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateExecutionPolicyResponseBody build() {
            return new GenerateExecutionPolicyResponseBody(this);
        } 

    } 

}
