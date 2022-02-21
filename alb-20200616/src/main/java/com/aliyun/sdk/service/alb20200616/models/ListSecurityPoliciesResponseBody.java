// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecurityPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSecurityPoliciesResponseBody</p>
 */
public class ListSecurityPoliciesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityPolicies")
    private java.util.List < SecurityPolicies> securityPolicies;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListSecurityPoliciesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.securityPolicies = builder.securityPolicies;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecurityPoliciesResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < SecurityPolicies> securityPolicies; 
        private Integer totalCount; 

        /**
         * 本次查询返回记录数量
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 分页查询标识
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * 安全策略
         */
        public Builder securityPolicies(java.util.List < SecurityPolicies> securityPolicies) {
            this.securityPolicies = securityPolicies;
            return this;
        }

        /**
         * 总记录数
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSecurityPoliciesResponseBody build() {
            return new ListSecurityPoliciesResponseBody(this);
        } 

    } 

    public static class SecurityPolicies extends TeaModel {
        @NameInMap("Ciphers")
        private java.util.List < String > ciphers;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SecurityPolicyId")
        private String securityPolicyId;

        @NameInMap("SecurityPolicyName")
        private String securityPolicyName;

        @NameInMap("SecurityPolicyStatus")
        private String securityPolicyStatus;

        @NameInMap("TLSVersions")
        private java.util.List < String > TLSVersions;

        private SecurityPolicies(Builder builder) {
            this.ciphers = builder.ciphers;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityPolicyId = builder.securityPolicyId;
            this.securityPolicyName = builder.securityPolicyName;
            this.securityPolicyStatus = builder.securityPolicyStatus;
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
        public java.util.List < String > getCiphers() {
            return this.ciphers;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
         * @return securityPolicyStatus
         */
        public String getSecurityPolicyStatus() {
            return this.securityPolicyStatus;
        }

        /**
         * @return TLSVersions
         */
        public java.util.List < String > getTLSVersions() {
            return this.TLSVersions;
        }

        public static final class Builder {
            private java.util.List < String > ciphers; 
            private String resourceGroupId; 
            private String securityPolicyId; 
            private String securityPolicyName; 
            private String securityPolicyStatus; 
            private java.util.List < String > TLSVersions; 

            /**
             * 加密套件
             */
            public Builder ciphers(java.util.List < String > ciphers) {
                this.ciphers = ciphers;
                return this;
            }

            /**
             * 资源组id
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * 安全策略id
             */
            public Builder securityPolicyId(String securityPolicyId) {
                this.securityPolicyId = securityPolicyId;
                return this;
            }

            /**
             * 安全策略名称
             */
            public Builder securityPolicyName(String securityPolicyName) {
                this.securityPolicyName = securityPolicyName;
                return this;
            }

            /**
             * 状态
             */
            public Builder securityPolicyStatus(String securityPolicyStatus) {
                this.securityPolicyStatus = securityPolicyStatus;
                return this;
            }

            /**
             * TLS策略
             */
            public Builder TLSVersions(java.util.List < String > TLSVersions) {
                this.TLSVersions = TLSVersions;
                return this;
            }

            public SecurityPolicies build() {
                return new SecurityPolicies(this);
            } 

        } 

    }
}
