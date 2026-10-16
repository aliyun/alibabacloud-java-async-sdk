// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link CreatePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePolicyResponseBody</p>
 */
public class CreatePolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Policy")
    private Policy policy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePolicyResponseBody(Builder builder) {
        this.policy = builder.policy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policy
     */
    public Policy getPolicy() {
        return this.policy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Policy policy; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreatePolicyResponseBody model) {
            this.policy = model.policy;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The policy details.</p>
         */
        public Builder policy(Policy policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>The unique identifier of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2A48EB1D-D645-5758-91AF-EDF8E36E257B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePolicyResponseBody build() {
            return new CreatePolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreatePolicyResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePolicyResponseBody</p>
     */
    public static class Policy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Definition")
        private Definition definition;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("PolicyArn")
        private String policyArn;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("PolicySetName")
        private String policySetName;

        private Policy(Builder builder) {
            this.createTime = builder.createTime;
            this.definition = builder.definition;
            this.description = builder.description;
            this.policyArn = builder.policyArn;
            this.policyName = builder.policyName;
            this.policySetName = builder.policySetName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policy create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return definition
         */
        public Definition getDefinition() {
            return this.definition;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return policyArn
         */
        public String getPolicyArn() {
            return this.policyArn;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return policySetName
         */
        public String getPolicySetName() {
            return this.policySetName;
        }

        public static final class Builder {
            private String createTime; 
            private Definition definition; 
            private String description; 
            private String policyArn; 
            private String policyName; 
            private String policySetName; 

            private Builder() {
            } 

            private Builder(Policy model) {
                this.createTime = model.createTime;
                this.definition = model.definition;
                this.description = model.description;
                this.policyArn = model.policyArn;
                this.policyName = model.policyName;
                this.policySetName = model.policySetName;
            } 

            /**
             * <p>The time when the policy was created, in UTC ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-08T06:19:17Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The policy definition.</p>
             */
            public Builder definition(Definition definition) {
                this.definition = definition;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>example description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ARN of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:agentidentity:cn-beijing:123456:policyset/default-policy-set/policy/rate-limit-policy</p>
             */
            public Builder policyArn(String policyArn) {
                this.policyArn = policyArn;
                return this;
            }

            /**
             * <p>The name of the policy. The name must be unique within the policy set to which the policy belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rate-limit-policy</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The name of the policy set. The name must be unique within the current Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>default-policy-set</p>
             */
            public Builder policySetName(String policySetName) {
                this.policySetName = policySetName;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
}
