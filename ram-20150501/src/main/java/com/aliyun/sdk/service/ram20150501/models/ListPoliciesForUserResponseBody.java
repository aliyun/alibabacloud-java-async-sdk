// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link ListPoliciesForUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListPoliciesForUserResponseBody</p>
 */
public class ListPoliciesForUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Policies")
    private Policies policies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPoliciesForUserResponseBody(Builder builder) {
        this.policies = builder.policies;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPoliciesForUserResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policies
     */
    public Policies getPolicies() {
        return this.policies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Policies policies; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPoliciesForUserResponseBody model) {
            this.policies = model.policies;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the policy.</p>
         */
        public Builder policies(Policies policies) {
            this.policies = policies;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7B8A4E7D-6CFF-471D-84DF-195A7A241ECB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPoliciesForUserResponseBody build() {
            return new ListPoliciesForUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPoliciesForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListPoliciesForUserResponseBody</p>
     */
    public static class Policy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachDate")
        private String attachDate;

        @com.aliyun.core.annotation.NameInMap("DefaultVersion")
        private String defaultVersion;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        private Policy(Builder builder) {
            this.attachDate = builder.attachDate;
            this.defaultVersion = builder.defaultVersion;
            this.description = builder.description;
            this.policyName = builder.policyName;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policy create() {
            return builder().build();
        }

        /**
         * @return attachDate
         */
        public String getAttachDate() {
            return this.attachDate;
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

        public static final class Builder {
            private String attachDate; 
            private String defaultVersion; 
            private String description; 
            private String policyName; 
            private String policyType; 

            private Builder() {
            } 

            private Builder(Policy model) {
                this.attachDate = model.attachDate;
                this.defaultVersion = model.defaultVersion;
                this.description = model.description;
                this.policyName = model.policyName;
                this.policyType = model.policyType;
            } 

            /**
             * <p>The time at which the policy is attached to the RAM user. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-01-23T12:33:18Z</p>
             */
            public Builder attachDate(String attachDate) {
                this.attachDate = attachDate;
                return this;
            }

            /**
             * <p>The current version.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder defaultVersion(String defaultVersion) {
                this.defaultVersion = defaultVersion;
                return this;
            }

            /**
             * <p>The description of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS administrator</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS-Administrator</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The type of the policy. Valid values:</p>
             * <ul>
             * <li>System: system policy</li>
             * <li>Custom: custom policy</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPoliciesForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListPoliciesForUserResponseBody</p>
     */
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Policy")
        private java.util.List<Policy> policy;

        private Policies(Builder builder) {
            this.policy = builder.policy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return policy
         */
        public java.util.List<Policy> getPolicy() {
            return this.policy;
        }

        public static final class Builder {
            private java.util.List<Policy> policy; 

            private Builder() {
            } 

            private Builder(Policies model) {
                this.policy = model.policy;
            } 

            /**
             * Policy.
             */
            public Builder policy(java.util.List<Policy> policy) {
                this.policy = policy;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
}
