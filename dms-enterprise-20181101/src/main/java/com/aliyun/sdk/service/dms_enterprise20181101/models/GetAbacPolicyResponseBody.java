// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link GetAbacPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetAbacPolicyResponseBody</p>
 */
public class GetAbacPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private Policy policy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAbacPolicyResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.policy = builder.policy;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAbacPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private Policy policy; 
        private String requestId; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(Policy policy) {
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAbacPolicyResponseBody build() {
            return new GetAbacPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAbacPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetAbacPolicyResponseBody</p>
     */
    public static class Policy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizedQuantity")
        private String authorizedQuantity;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private Long creatorId;

        @com.aliyun.core.annotation.NameInMap("PolicyContent")
        private String policyContent;

        @com.aliyun.core.annotation.NameInMap("PolicyDesc")
        private String policyDesc;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private Long policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("PolicySource")
        private String policySource;

        private Policy(Builder builder) {
            this.authorizedQuantity = builder.authorizedQuantity;
            this.creatorId = builder.creatorId;
            this.policyContent = builder.policyContent;
            this.policyDesc = builder.policyDesc;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.policySource = builder.policySource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policy create() {
            return builder().build();
        }

        /**
         * @return authorizedQuantity
         */
        public String getAuthorizedQuantity() {
            return this.authorizedQuantity;
        }

        /**
         * @return creatorId
         */
        public Long getCreatorId() {
            return this.creatorId;
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
         * @return policyId
         */
        public Long getPolicyId() {
            return this.policyId;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return policySource
         */
        public String getPolicySource() {
            return this.policySource;
        }

        public static final class Builder {
            private String authorizedQuantity; 
            private Long creatorId; 
            private String policyContent; 
            private String policyDesc; 
            private Long policyId; 
            private String policyName; 
            private String policySource; 

            /**
             * AuthorizedQuantity.
             */
            public Builder authorizedQuantity(String authorizedQuantity) {
                this.authorizedQuantity = authorizedQuantity;
                return this;
            }

            /**
             * CreatorId.
             */
            public Builder creatorId(Long creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * PolicyContent.
             */
            public Builder policyContent(String policyContent) {
                this.policyContent = policyContent;
                return this;
            }

            /**
             * PolicyDesc.
             */
            public Builder policyDesc(String policyDesc) {
                this.policyDesc = policyDesc;
                return this;
            }

            /**
             * PolicyId.
             */
            public Builder policyId(Long policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * PolicyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * PolicySource.
             */
            public Builder policySource(String policySource) {
                this.policySource = policySource;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
}
