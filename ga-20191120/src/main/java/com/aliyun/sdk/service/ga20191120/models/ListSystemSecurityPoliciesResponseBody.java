// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSystemSecurityPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSystemSecurityPoliciesResponseBody</p>
 */
public class ListSystemSecurityPoliciesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityPolicies")
    private java.util.List < SecurityPolicies> securityPolicies;

    @NameInMap("TotalCount")
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecurityPolicies.
         */
        public Builder securityPolicies(java.util.List < SecurityPolicies> securityPolicies) {
            this.securityPolicies = securityPolicies;
            return this;
        }

        /**
         * TotalCount.
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
        @NameInMap("Ciphers")
        private java.util.List < String > ciphers;

        @NameInMap("SecurityPolicyId")
        private String securityPolicyId;

        @NameInMap("TlsVersions")
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
             * Ciphers.
             */
            public Builder ciphers(java.util.List < String > ciphers) {
                this.ciphers = ciphers;
                return this;
            }

            /**
             * SecurityPolicyId.
             */
            public Builder securityPolicyId(String securityPolicyId) {
                this.securityPolicyId = securityPolicyId;
                return this;
            }

            /**
             * TlsVersions.
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
