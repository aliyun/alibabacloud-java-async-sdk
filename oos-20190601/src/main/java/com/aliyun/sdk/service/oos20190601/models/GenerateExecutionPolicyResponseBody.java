// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link GenerateExecutionPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateExecutionPolicyResponseBody</p>
 */
public class GenerateExecutionPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MissingPolicy")
    private String missingPolicy;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The policies that are missing.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Action&quot;: [&quot;ecs:DescribeInvocationResults&quot;, &quot;ecs:DescribeInstances&quot;, &quot;ecs:RunCommand&quot;, &quot;ecs:DescribeInvocations&quot;], &quot;ServiceName&quot;: &quot;ecs&quot;, &quot;Resources&quot;: &quot;*&quot;}]</p>
         */
        public Builder missingPolicy(String missingPolicy) {
            this.missingPolicy = missingPolicy;
            return this;
        }

        /**
         * <p>The RAM policy.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>14A07460-EBE7-47CA-9757-12CC4761D47A</p>
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
