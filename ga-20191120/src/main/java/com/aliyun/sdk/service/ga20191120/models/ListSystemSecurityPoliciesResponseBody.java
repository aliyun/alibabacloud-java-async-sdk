// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < SecurityPolicies> securityPolicies;

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
    public java.util.List < SecurityPolicies> getSecurityPolicies() {
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
        private java.util.List < SecurityPolicies> securityPolicies; 
        private Integer totalCount; 

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of TLS security policies.
         */
        public Builder securityPolicies(java.util.List < SecurityPolicies> securityPolicies) {
            this.securityPolicies = securityPolicies;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSystemSecurityPoliciesResponseBody build() {
            return new ListSystemSecurityPoliciesResponseBody(this);
        } 

    } 

    public static class SecurityPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ciphers")
        private java.util.List < String > ciphers;

        @com.aliyun.core.annotation.NameInMap("SecurityPolicyId")
        private String securityPolicyId;

        @com.aliyun.core.annotation.NameInMap("TlsVersions")
        private java.util.List < String > tlsVersions;

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
        public java.util.List < String > getCiphers() {
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
        public java.util.List < String > getTlsVersions() {
            return this.tlsVersions;
        }

        public static final class Builder {
            private java.util.List < String > ciphers; 
            private String securityPolicyId; 
            private java.util.List < String > tlsVersions; 

            /**
             * The supported cipher suites. The value of this parameter is determined by the value of **TLSVersions**.
             * <p>
             * 
             * The specified cipher suites must be supported by at least one value of **TLSVersions**. For example, if you set TLSVersions to **TLSv1.3**, you must specify cipher suites that are supported by **TLSv1.3**.
             * 
             * *   Valid values when TLSVersions is set to **TLSv1.0** or **TLSv1.1**:
             * 
             *     *   ECDHE-ECDSA-AES128-SHA
             *     *   ECDHE-ECDSA-AES256-SHA
             *     *   ECDHE-RSA-AES128-SHA
             *     *   ECDHE-RSA-AES256-SHA
             *     *   AES128-SHA
             *     *   AES256-SHA
             *     *   DES-CBC3-SHA
             * 
             * *   Valid values when TLSVersions is set to **TLSv1.2**:
             * 
             *     *   ECDHE-ECDSA-AES128-SHA
             *     *   ECDHE-ECDSA-AES256-SHA
             *     *   ECDHE-RSA-AES128-SHA
             *     *   ECDHE-RSA-AES256-SHA
             *     *   AES128-SHA
             *     *   AES256-SHA
             *     *   DES-CBC3-SHA
             *     *   ECDHE-ECDSA-AES128-GCM-SHA256
             *     *   ECDHE-ECDSA-AES256-GCM-SHA384
             *     *   ECDHE-ECDSA-AES128-SHA256
             *     *   ECDHE-ECDSA-AES256-SHA384
             *     *   ECDHE-RSA-AES128-GCM-SHA256
             *     *   ECDHE-RSA-AES256-GCM-SHA384
             *     *   ECDHE-RSA-AES128-SHA256
             *     *   ECDHE-RSA-AES256-SHA384
             *     *   AES128-GCM-SHA256
             *     *   AES256-GCM-SHA384
             *     *   AES128-SHA256
             *     *   AES256-SHA256
             * 
             * *   Valid values when TLSVersions is set to **TLSv1.3**:
             * 
             *     *   TLS_AES\_128\_GCM_SHA256
             *     *   TLS_AES\_256\_GCM_SHA384
             *     *   TLS_CHACHA20\_POLY1305\_SHA256
             *     *   TLS_AES\_128\_CCM_SHA256
             *     *   TLS_AES\_128\_CCM\_8\_SHA256
             */
            public Builder ciphers(java.util.List < String > ciphers) {
                this.ciphers = ciphers;
                return this;
            }

            /**
             * The ID of the TLS security policy.
             */
            public Builder securityPolicyId(String securityPolicyId) {
                this.securityPolicyId = securityPolicyId;
                return this;
            }

            /**
             * The supported TLS versions. Valid values: **TLSv1.0**, **TLSv1.1**, **TLSv1.2**, and **TLSv1.3**.
             */
            public Builder tlsVersions(java.util.List < String > tlsVersions) {
                this.tlsVersions = tlsVersions;
                return this;
            }

            public SecurityPolicies build() {
                return new SecurityPolicies(this);
            } 

        } 

    }
}
