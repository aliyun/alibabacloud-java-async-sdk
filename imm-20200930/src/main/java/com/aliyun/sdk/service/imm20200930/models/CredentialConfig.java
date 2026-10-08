// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link CredentialConfig} extends {@link TeaModel}
 *
 * <p>CredentialConfig</p>
 */
public class CredentialConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Chain")
    private java.util.List<Chain> chain;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chain
     */
    public java.util.List<Chain> getChain() {
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
        private java.util.List<Chain> chain; 
        private String policy; 
        private String serviceRole; 

        private Builder() {
        } 

        private Builder(CredentialConfig model) {
            this.chain = model.chain;
            this.policy = model.policy;
            this.serviceRole = model.serviceRole;
        } 

        /**
         * <p>The authorization chains. All roles in the array must have the <code>sts:AssumeRole</code> permission. You need to only grant other permissions, such as read and write permissions on OSS, to the last role in the array. You can grant permissions in the RAM console.</p>
         */
        public Builder chain(java.util.List<Chain> chain) {
            this.chain = chain;
            return this;
        }

        /**
         * <p>The policy that is attached to the role specified by the ServiceRole parameter. For example, the policy allows access to OSS. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Statement&quot;: [{&quot;Action&quot;: &quot;oss:<em>&quot;,&quot;Effect&quot;: &quot;Allow&quot;,&quot;Resource&quot;: &quot;</em>&quot;}],&quot;Version&quot;: &quot;1&quot;}</p>
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>The service role in the account that is used to call an IMM API operation. The role must have the <code>sts:AssumeRole</code> permission. You can configure permissions for the role in the Resource Access Management (RAM) console.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunSTSAssumeForIMMServiceRole</p>
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

            private Builder() {
            } 

            private Builder(Chain model) {
                this.assumeRoleFor = model.assumeRoleFor;
                this.role = model.role;
                this.roleType = model.roleType;
            } 

            /**
             * <p>The ID of the account that you use to grant permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>10232100246xxxxx</p>
             */
            public Builder assumeRoleFor(String assumeRoleFor) {
                this.assumeRoleFor = assumeRoleFor;
                return this;
            }

            /**
             * <p>The RAM role that can be assumed.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunOSSRole</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The role type. Valid values:</p>
             * <ul>
             * <li>user: Alibaba Cloud account.</li>
             * <li>service: Alibaba Cloud service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>user</p>
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
