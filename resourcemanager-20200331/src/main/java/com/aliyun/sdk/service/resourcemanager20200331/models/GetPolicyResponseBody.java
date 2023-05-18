// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
         * The information of the policy.
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
        @NameInMap("AttachmentCount")
        private Integer attachmentCount;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("DefaultVersion")
        private String defaultVersion;

        @NameInMap("Description")
        private String description;

        @NameInMap("PolicyDocument")
        private String policyDocument;

        @NameInMap("PolicyName")
        private String policyName;

        @NameInMap("PolicyType")
        private String policyType;

        @NameInMap("UpdateDate")
        private String updateDate;

        private Policy(Builder builder) {
            this.attachmentCount = builder.attachmentCount;
            this.createDate = builder.createDate;
            this.defaultVersion = builder.defaultVersion;
            this.description = builder.description;
            this.policyDocument = builder.policyDocument;
            this.policyName = builder.policyName;
            this.policyType = builder.policyType;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policy create() {
            return builder().build();
        }

        /**
         * @return attachmentCount
         */
        public Integer getAttachmentCount() {
            return this.attachmentCount;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return defaultVersion
         */
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return policyDocument
         */
        public String getPolicyDocument() {
            return this.policyDocument;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private Integer attachmentCount; 
            private String createDate; 
            private String defaultVersion; 
            private String description; 
            private String policyDocument; 
            private String policyName; 
            private String policyType; 
            private String updateDate; 

            /**
             * The number of times the policy is referenced.
             */
            public Builder attachmentCount(Integer attachmentCount) {
                this.attachmentCount = attachmentCount;
                return this;
            }

            /**
             * The time when the policy was created.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The default version of the policy.
             */
            public Builder defaultVersion(String defaultVersion) {
                this.defaultVersion = defaultVersion;
                return this;
            }

            /**
             * The description of the policy.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The document of the policy.
             */
            public Builder policyDocument(String policyDocument) {
                this.policyDocument = policyDocument;
                return this;
            }

            /**
             * The name of the policy.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * The type of the policy. Valid values:
             * <p>
             * 
             * *   Custom: custom policy
             * *   System: system policy
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * The time when the policy was updated.
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
}
