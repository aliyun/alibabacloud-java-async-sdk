// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

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
 * {@link ListSystemSecurityPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ListSystemSecurityPolicyResponseBody</p>
 */
public class ListSystemSecurityPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityPolicies")
    private java.util.List<SecurityPolicies> securityPolicies;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListSystemSecurityPolicyResponseBody model) {
            this.requestId = model.requestId;
            this.securityPolicies = model.securityPolicies;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5C057647-284B-5C67-A07E-4B8F3DABA9F9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>A list of TLS security policies.</p>
         */
        public Builder securityPolicies(java.util.List<SecurityPolicies> securityPolicies) {
            this.securityPolicies = securityPolicies;
            return this;
        }

        public ListSystemSecurityPolicyResponseBody build() {
            return new ListSystemSecurityPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSystemSecurityPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListSystemSecurityPolicyResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SecurityPolicies model) {
                this.ciphers = model.ciphers;
                this.securityPolicyId = model.securityPolicyId;
                this.securityPolicyName = model.securityPolicyName;
                this.tlsVersion = model.tlsVersion;
            } 

            /**
             * <p>The cipher suite.</p>
             * 
             * <strong>example:</strong>
             * <p>ECDHE-ECDSA-AES128-GCM-SHA256,ECDHE-ECDSA-AES256-GCM-SHA384,ECDHE-ECDSA-AES128-SHA256,ECDHE-ECDSA-AES256-SHA384,ECDHE-RSA-AES128-GCM-SHA256,ECDHE-RSA-AES256-GCM-SHA384,ECDHE-RSA-AES128-SHA256,ECDHE-RSA-AES256-SHA384,AES128-GCM-SHA256,AES256-GCM-SHA384,AES128-SHA256,AES256-SHA256,ECDHE-ECDSA-AES128-SHA,ECDHE-ECDSA-AES256-SHA,ECDHE-RSA-AES128-SHA,ECDHE-RSA-AES256-SHA,AES128-SHA,AES256-SHA,DES-CBC3-SHA</p>
             */
            public Builder ciphers(String ciphers) {
                this.ciphers = ciphers;
                return this;
            }

            /**
             * <p>The ID of the TLS security policy.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-3fdab6dkkke10s****</p>
             */
            public Builder securityPolicyId(String securityPolicyId) {
                this.securityPolicyId = securityPolicyId;
                return this;
            }

            /**
             * <p>The name of the TLS security policy.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder securityPolicyName(String securityPolicyName) {
                this.securityPolicyName = securityPolicyName;
                return this;
            }

            /**
             * <p>The TLS version.</p>
             * 
             * <strong>example:</strong>
             * <p>TLSv1.0</p>
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
