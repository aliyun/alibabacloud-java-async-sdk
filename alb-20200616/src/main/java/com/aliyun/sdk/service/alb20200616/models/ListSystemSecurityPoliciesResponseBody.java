// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link ListSystemSecurityPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSystemSecurityPoliciesResponseBody</p>
 */
public class ListSystemSecurityPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityPolicies")
    private java.util.List<SecurityPolicies> securityPolicies;

    private ListSystemSecurityPoliciesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityPolicies = builder.securityPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSystemSecurityPoliciesResponseBody create() {
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
    public java.util.List<SecurityPolicies> getSecurityPolicies() {
        return this.securityPolicies;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SecurityPolicies> securityPolicies; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>593B0448-D13E-4C56-AC0D-FDF0FDE0E9A3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The security policies.</p>
         */
        public Builder securityPolicies(java.util.List<SecurityPolicies> securityPolicies) {
            this.securityPolicies = securityPolicies;
            return this;
        }

        public ListSystemSecurityPoliciesResponseBody build() {
            return new ListSystemSecurityPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSystemSecurityPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSystemSecurityPoliciesResponseBody</p>
     */
    public static class SecurityPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ciphers")
        private java.util.List<String> ciphers;

        @com.aliyun.core.annotation.NameInMap("SecurityPolicyId")
        private String securityPolicyId;

        @com.aliyun.core.annotation.NameInMap("TLSVersions")
        private java.util.List<String> TLSVersions;

        private SecurityPolicies(Builder builder) {
            this.ciphers = builder.ciphers;
            this.securityPolicyId = builder.securityPolicyId;
            this.TLSVersions = builder.TLSVersions;
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
        public java.util.List<String> getCiphers() {
            return this.ciphers;
        }

        /**
         * @return securityPolicyId
         */
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

        /**
         * @return TLSVersions
         */
        public java.util.List<String> getTLSVersions() {
            return this.TLSVersions;
        }

        public static final class Builder {
            private java.util.List<String> ciphers; 
            private String securityPolicyId; 
            private java.util.List<String> TLSVersions; 

            /**
             * <p>The supported cipher suite.</p>
             */
            public Builder ciphers(java.util.List<String> ciphers) {
                this.ciphers = ciphers;
                return this;
            }

            /**
             * <p>The ID of the security policy.</p>
             * 
             * <strong>example:</strong>
             * <p>spy-n0kn923****</p>
             */
            public Builder securityPolicyId(String securityPolicyId) {
                this.securityPolicyId = securityPolicyId;
                return this;
            }

            /**
             * <p>The supported TLS protocol versions.</p>
             */
            public Builder TLSVersions(java.util.List<String> TLSVersions) {
                this.TLSVersions = TLSVersions;
                return this;
            }

            public SecurityPolicies build() {
                return new SecurityPolicies(this);
            } 

        } 

    }
}
