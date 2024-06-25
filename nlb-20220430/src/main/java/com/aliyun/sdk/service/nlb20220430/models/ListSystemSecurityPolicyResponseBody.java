// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSystemSecurityPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ListSystemSecurityPolicyResponseBody</p>
 */
public class ListSystemSecurityPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityPolicies")
    private java.util.List < SecurityPolicies> securityPolicies;

    private ListSystemSecurityPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityPolicies = builder.securityPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSystemSecurityPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityPolicies
     */
    public java.util.List < SecurityPolicies> getSecurityPolicies() {
        return this.securityPolicies;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SecurityPolicies> securityPolicies; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * A list of TLS security policies.
         */
        public Builder securityPolicies(java.util.List < SecurityPolicies> securityPolicies) {
            this.securityPolicies = securityPolicies;
            return this;
        }

        public ListSystemSecurityPolicyResponseBody build() {
            return new ListSystemSecurityPolicyResponseBody(this);
        } 

    } 

    public static class SecurityPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ciphers")
        private String ciphers;

        @com.aliyun.core.annotation.NameInMap("SecurityPolicyId")
        private String securityPolicyId;

        @com.aliyun.core.annotation.NameInMap("SecurityPolicyName")
        private String securityPolicyName;

        @com.aliyun.core.annotation.NameInMap("TlsVersion")
        private String tlsVersion;

        private SecurityPolicies(Builder builder) {
            this.ciphers = builder.ciphers;
            this.securityPolicyId = builder.securityPolicyId;
            this.securityPolicyName = builder.securityPolicyName;
            this.tlsVersion = builder.tlsVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityPolicies create() {
            return builder().build();
        }

        /**
         * @return ciphers
         */
        public String getCiphers() {
            return this.ciphers;
        }

        /**
         * @return securityPolicyId
         */
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

        /**
         * @return securityPolicyName
         */
        public String getSecurityPolicyName() {
            return this.securityPolicyName;
        }

        /**
         * @return tlsVersion
         */
        public String getTlsVersion() {
            return this.tlsVersion;
        }

        public static final class Builder {
            private String ciphers; 
            private String securityPolicyId; 
            private String securityPolicyName; 
            private String tlsVersion; 

            /**
             * The cipher suites.
             */
            public Builder ciphers(String ciphers) {
                this.ciphers = ciphers;
                return this;
            }

            /**
             * The TLS policy ID.
             */
            public Builder securityPolicyId(String securityPolicyId) {
                this.securityPolicyId = securityPolicyId;
                return this;
            }

            /**
             * The TLS policy name.
             */
            public Builder securityPolicyName(String securityPolicyName) {
                this.securityPolicyName = securityPolicyName;
                return this;
            }

            /**
             * The version of the TLS protocol.
             */
            public Builder tlsVersion(String tlsVersion) {
                this.tlsVersion = tlsVersion;
                return this;
            }

            public SecurityPolicies build() {
                return new SecurityPolicies(this);
            } 

        } 

    }
}
