// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateControlPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateControlPolicyResponseBody</p>
 */
public class CreateControlPolicyResponseBody extends TeaModel {
    @NameInMap("ControlPolicy")
    private ControlPolicy controlPolicy;

    @NameInMap("RequestId")
    private String requestId;

    private CreateControlPolicyResponseBody(Builder builder) {
        this.controlPolicy = builder.controlPolicy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateControlPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return controlPolicy
     */
    public ControlPolicy getControlPolicy() {
        return this.controlPolicy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ControlPolicy controlPolicy; 
        private String requestId; 

        /**
         * The details of the access control policy.
         */
        public Builder controlPolicy(ControlPolicy controlPolicy) {
            this.controlPolicy = controlPolicy;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateControlPolicyResponseBody build() {
            return new CreateControlPolicyResponseBody(this);
        } 

    } 

    public static class ControlPolicy extends TeaModel {
        @NameInMap("AttachmentCount")
        private String attachmentCount;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("Description")
        private String description;

        @NameInMap("EffectScope")
        private String effectScope;

        @NameInMap("PolicyId")
        private String policyId;

        @NameInMap("PolicyName")
        private String policyName;

        @NameInMap("PolicyType")
        private String policyType;

        @NameInMap("UpdateDate")
        private String updateDate;

        private ControlPolicy(Builder builder) {
            this.attachmentCount = builder.attachmentCount;
            this.createDate = builder.createDate;
            this.description = builder.description;
            this.effectScope = builder.effectScope;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.policyType = builder.policyType;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ControlPolicy create() {
            return builder().build();
        }

        /**
         * @return attachmentCount
         */
        public String getAttachmentCount() {
            return this.attachmentCount;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return effectScope
         */
        public String getEffectScope() {
            return this.effectScope;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
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
            private String attachmentCount; 
            private String createDate; 
            private String description; 
            private String effectScope; 
            private String policyId; 
            private String policyName; 
            private String policyType; 
            private String updateDate; 

            /**
             * The number of times that the access control policy is referenced.
             */
            public Builder attachmentCount(String attachmentCount) {
                this.attachmentCount = attachmentCount;
                return this;
            }

            /**
             * The time when the access control policy was created.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The description of the access control policy.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The effective scope of the access control policy.
             * <p>
             * 
             * The value RAM indicates that the access control policy takes effect only for RAM users and RAM roles.
             */
            public Builder effectScope(String effectScope) {
                this.effectScope = effectScope;
                return this;
            }

            /**
             * The ID of the access control policy.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * The name of the access control policy.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * The type of the access control policy. Valid values:
             * <p>
             * 
             * *   System: system access control policy
             * *   Custom: custom access control policy
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * The time when the access control policy was updated.
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public ControlPolicy build() {
                return new ControlPolicy(this);
            } 

        } 

    }
}
