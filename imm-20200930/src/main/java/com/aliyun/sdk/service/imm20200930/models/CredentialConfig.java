// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CredentialConfig} extends {@link TeaModel}
 *
 * <p>CredentialConfig</p>
 */
public class CredentialConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Chain")
    private java.util.List < Chain> chain;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("ServiceRole")
    private String serviceRole;

    private CredentialConfig(Builder builder) {
        this.chain = builder.chain;
        this.policy = builder.policy;
        this.serviceRole = builder.serviceRole;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CredentialConfig create() {
        return builder().build();
    }

    /**
     * @return chain
     */
    public java.util.List < Chain> getChain() {
        return this.chain;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return serviceRole
     */
    public String getServiceRole() {
        return this.serviceRole;
    }

    public static final class Builder {
        private java.util.List < Chain> chain; 
        private String policy; 
        private String serviceRole; 

        /**
         * Chain.
         */
        public Builder chain(java.util.List < Chain> chain) {
            this.chain = chain;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * ServiceRole.
         */
        public Builder serviceRole(String serviceRole) {
            this.serviceRole = serviceRole;
            return this;
        }

        public CredentialConfig build() {
            return new CredentialConfig(this);
        } 

    } 

    /**
     * 
     * {@link CredentialConfig} extends {@link TeaModel}
     *
     * <p>CredentialConfig</p>
     */
    public static class Chain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssumeRoleFor")
        private String assumeRoleFor;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("RoleType")
        private String roleType;

        private Chain(Builder builder) {
            this.assumeRoleFor = builder.assumeRoleFor;
            this.role = builder.role;
            this.roleType = builder.roleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Chain create() {
            return builder().build();
        }

        /**
         * @return assumeRoleFor
         */
        public String getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return roleType
         */
        public String getRoleType() {
            return this.roleType;
        }

        public static final class Builder {
            private String assumeRoleFor; 
            private String role; 
            private String roleType; 

            /**
             * AssumeRoleFor.
             */
            public Builder assumeRoleFor(String assumeRoleFor) {
                this.assumeRoleFor = assumeRoleFor;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * RoleType.
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            public Chain build() {
                return new Chain(this);
            } 

        } 

    }
}
