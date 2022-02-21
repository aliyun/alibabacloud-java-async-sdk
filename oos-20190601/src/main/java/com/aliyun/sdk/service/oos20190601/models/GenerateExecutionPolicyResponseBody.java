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
    @NameInMap("Policy")
    private String policy;

    @NameInMap("RequestId")
    private String requestId;

    private GenerateExecutionPolicyResponseBody(Builder builder) {
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
        private String policy; 
        private String requestId; 

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * RequestId.
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
