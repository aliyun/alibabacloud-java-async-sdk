// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityPolicies")
    private java.util.List<SecurityPolicies> securityPolicies;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListSystemSecurityPoliciesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.securityPolicies = builder.securityPolicies;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSystemSecurityPoliciesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<SecurityPolicies> securityPolicies; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListSystemSecurityPoliciesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.securityPolicies = model.securityPolicies;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A9B4E54C-9CCD-4002-91A9-D38C6C209192</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of TLS security policies.</p>
         */
        public Builder securityPolicies(java.util.List<SecurityPolicies> securityPolicies) {
            this.securityPolicies = securityPolicies;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
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

        @com.aliyun.core.annotation.NameInMap("TlsVersions")
        private java.util.List<String> tlsVersions;

        private SecurityPolicies(Builder builder) {
            this.ciphers = builder.ciphers;
            this.securityPolicyId = builder.securityPolicyId;
            this.tlsVersions = builder.tlsVersions;
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
         * @return tlsVersions
         */
        public java.util.List<String> getTlsVersions() {
            return this.tlsVersions;
        }

        public static final class Builder {
            private java.util.List<String> ciphers; 
            private String securityPolicyId; 
            private java.util.List<String> tlsVersions; 

            private Builder() {
            } 

            private Builder(SecurityPolicies model) {
                this.ciphers = model.ciphers;
                this.securityPolicyId = model.securityPolicyId;
                this.tlsVersions = model.tlsVersions;
            } 

            /**
             * <p>The supported cipher suites. The value of this parameter is determined by the value of <strong>TLSVersions</strong>.</p>
             * <p>The specified cipher suites must be supported by at least one value of <strong>TLSVersions</strong>. For example, if you set TLSVersions to <strong>TLSv1.3</strong>, you must specify cipher suites that are supported by <strong>TLSv1.3</strong>.</p>
             * <ul>
             * <li><p>Valid values when TLSVersions is set to <strong>TLSv1.0</strong> or <strong>TLSv1.1</strong>:</p>
             * <ul>
             * <li>ECDHE-ECDSA-AES128-SHA</li>
             * <li>ECDHE-ECDSA-AES256-SHA</li>
             * <li>ECDHE-RSA-AES128-SHA</li>
             * <li>ECDHE-RSA-AES256-SHA</li>
             * <li>AES128-SHA</li>
             * <li>AES256-SHA</li>
             * <li>DES-CBC3-SHA</li>
             * </ul>
             * </li>
             * <li><p>Valid values when TLSVersions is set to <strong>TLSv1.2</strong>:</p>
             * <ul>
             * <li>ECDHE-ECDSA-AES128-SHA</li>
             * <li>ECDHE-ECDSA-AES256-SHA</li>
             * <li>ECDHE-RSA-AES128-SHA</li>
             * <li>ECDHE-RSA-AES256-SHA</li>
             * <li>AES128-SHA</li>
             * <li>AES256-SHA</li>
             * <li>DES-CBC3-SHA</li>
             * <li>ECDHE-ECDSA-AES128-GCM-SHA256</li>
             * <li>ECDHE-ECDSA-AES256-GCM-SHA384</li>
             * <li>ECDHE-ECDSA-AES128-SHA256</li>
             * <li>ECDHE-ECDSA-AES256-SHA384</li>
             * <li>ECDHE-RSA-AES128-GCM-SHA256</li>
             * <li>ECDHE-RSA-AES256-GCM-SHA384</li>
             * <li>ECDHE-RSA-AES128-SHA256</li>
             * <li>ECDHE-RSA-AES256-SHA384</li>
             * <li>AES128-GCM-SHA256</li>
             * <li>AES256-GCM-SHA384</li>
             * <li>AES128-SHA256</li>
             * <li>AES256-SHA256</li>
             * </ul>
             * </li>
             * <li><p>Valid values when TLSVersions is set to <strong>TLSv1.3</strong>:</p>
             * <ul>
             * <li>TLS_AES_128_GCM_SHA256</li>
             * <li>TLS_AES_256_GCM_SHA384</li>
             * <li>TLS_CHACHA20_POLY1305_SHA256</li>
             * <li>TLS_AES_128_CCM_SHA256</li>
             * <li>TLS_AES_128_CCM_8_SHA256</li>
             * </ul>
             * </li>
             * </ul>
             */
            public Builder ciphers(java.util.List<String> ciphers) {
                this.ciphers = ciphers;
                return this;
            }

            /**
             * <p>The ID of the TLS security policy.</p>
             * 
             * <strong>example:</strong>
             * <p>tls_cipher_policy_1_1</p>
             */
            public Builder securityPolicyId(String securityPolicyId) {
                this.securityPolicyId = securityPolicyId;
                return this;
            }

            /**
             * <p>The supported TLS versions. Valid values: <strong>TLSv1.0</strong>, <strong>TLSv1.1</strong>, <strong>TLSv1.2</strong>, and <strong>TLSv1.3</strong>.</p>
             */
            public Builder tlsVersions(java.util.List<String> tlsVersions) {
                this.tlsVersions = tlsVersions;
                return this;
            }

            public SecurityPolicies build() {
                return new SecurityPolicies(this);
            } 

        } 

    }
}
