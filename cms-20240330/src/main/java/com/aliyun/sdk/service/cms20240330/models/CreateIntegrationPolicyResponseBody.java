// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreateIntegrationPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIntegrationPolicyResponseBody</p>
 */
public class CreateIntegrationPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("created")
    private Boolean created;

    @com.aliyun.core.annotation.NameInMap("policy")
    private Policy policy;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateIntegrationPolicyResponseBody(Builder builder) {
        this.created = builder.created;
        this.policy = builder.policy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIntegrationPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return created
     */
    public Boolean getCreated() {
        return this.created;
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
        private Boolean created; 
        private Policy policy; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateIntegrationPolicyResponseBody model) {
            this.created = model.created;
            this.policy = model.policy;
            this.requestId = model.requestId;
        } 

        /**
         * created.
         */
        public Builder created(Boolean created) {
            this.created = created;
            return this;
        }

        /**
         * policy.
         */
        public Builder policy(Policy policy) {
            this.policy = policy;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIntegrationPolicyResponseBody build() {
            return new CreateIntegrationPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateIntegrationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateIntegrationPolicyResponseBody</p>
     */
    public static class Policy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("entityGroupId")
        private String entityGroupId;

        @com.aliyun.core.annotation.NameInMap("policyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("policyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("policyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Policy(Builder builder) {
            this.entityGroupId = builder.entityGroupId;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.policyType = builder.policyType;
            this.regionId = builder.regionId;
            this.userId = builder.userId;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policy create() {
            return builder().build();
        }

        /**
         * @return entityGroupId
         */
        public String getEntityGroupId() {
            return this.entityGroupId;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String entityGroupId; 
            private String policyId; 
            private String policyName; 
            private String policyType; 
            private String regionId; 
            private String userId; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Policy model) {
                this.entityGroupId = model.entityGroupId;
                this.policyId = model.policyId;
                this.policyName = model.policyName;
                this.policyType = model.policyType;
                this.regionId = model.regionId;
                this.userId = model.userId;
                this.workspace = model.workspace;
            } 

            /**
             * entityGroupId.
             */
            public Builder entityGroupId(String entityGroupId) {
                this.entityGroupId = entityGroupId;
                return this;
            }

            /**
             * policyId.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * policyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * policyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
}
