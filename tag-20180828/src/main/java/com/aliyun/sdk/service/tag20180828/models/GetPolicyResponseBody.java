// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetPolicyResponseBody</p>
 */
public class GetPolicyResponseBody extends TeaModel {
    @NameInMap("Policy")
    private Policy policy;

    @NameInMap("RequestId")
    private String requestId;

    private GetPolicyResponseBody(Builder builder) {
        this.policy = builder.policy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPolicyResponseBody create() {
        return builder().build();
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

        /**
         * The details of the tag policy.
         */
        public Builder policy(Policy policy) {
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

        public GetPolicyResponseBody build() {
            return new GetPolicyResponseBody(this);
        } 

    } 

    public static class Policy extends TeaModel {
        @NameInMap("PolicyContent")
        private String policyContent;

        @NameInMap("PolicyDesc")
        private String policyDesc;

        @NameInMap("PolicyName")
        private String policyName;

        @NameInMap("UserType")
        private String userType;

        private Policy(Builder builder) {
            this.policyContent = builder.policyContent;
            this.policyDesc = builder.policyDesc;
            this.policyName = builder.policyName;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policy create() {
            return builder().build();
        }

        /**
         * @return policyContent
         */
        public String getPolicyContent() {
            return this.policyContent;
        }

        /**
         * @return policyDesc
         */
        public String getPolicyDesc() {
            return this.policyDesc;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String policyContent; 
            private String policyDesc; 
            private String policyName; 
            private String userType; 

            /**
             * The document of the tag policy.
             */
            public Builder policyContent(String policyContent) {
                this.policyContent = policyContent;
                return this;
            }

            /**
             * The description of the tag policy.
             */
            public Builder policyDesc(String policyDesc) {
                this.policyDesc = policyDesc;
                return this;
            }

            /**
             * The name of the tag policy.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * The mode of the Tag Policy feature. Valid values:
             * <p>
             * 
             * *   USER: single-account mode
             * *   RD: multi-account mode
             * 
             * For more information about the modes of the Tag Policy feature, see [Modes of the Tag Policy feature](~~417434~~).
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
}
