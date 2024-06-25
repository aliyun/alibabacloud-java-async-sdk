// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecurityPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ListSecurityPolicyResponseBody</p>
 */
public class ListSecurityPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityPolicies")
    private java.util.List < SecurityPolicies> securityPolicies;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListSecurityPolicyResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.securityPolicies = builder.securityPolicies;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecurityPolicyResponseBody create() {
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
         * The number of entries per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If NextToken is empty, no next page exists.
         * *   If a value is returned for NextToken, specify the value in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * A list of TLS security policies.
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

        public ListSecurityPolicyResponseBody build() {
            return new ListSecurityPolicyResponseBody(this);
        } 

    } 

    public static class RelatedListeners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListenerId")
        private String listenerId;

        @com.aliyun.core.annotation.NameInMap("ListenerPort")
        private Long listenerPort;

        @com.aliyun.core.annotation.NameInMap("ListenerProtocol")
        private String listenerProtocol;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        private RelatedListeners(Builder builder) {
            this.listenerId = builder.listenerId;
            this.listenerPort = builder.listenerPort;
            this.listenerProtocol = builder.listenerProtocol;
            this.loadBalancerId = builder.loadBalancerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedListeners create() {
            return builder().build();
        }

        /**
         * @return listenerId
         */
        public String getListenerId() {
            return this.listenerId;
        }

        /**
         * @return listenerPort
         */
        public Long getListenerPort() {
            return this.listenerPort;
        }

        /**
         * @return listenerProtocol
         */
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public static final class Builder {
            private String listenerId; 
            private Long listenerPort; 
            private String listenerProtocol; 
            private String loadBalancerId; 

            /**
             * The listener ID.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * The listener port.
             */
            public Builder listenerPort(Long listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * The listener protocol. Valid value: **TCPSSL**.
             */
            public Builder listenerProtocol(String listenerProtocol) {
                this.listenerProtocol = listenerProtocol;
                return this;
            }

            /**
             * The NLB instance ID.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            public RelatedListeners build() {
                return new RelatedListeners(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key. You can specify up to 10 tag keys.
             * <p>
             * 
             * The tag key can be up to 64 characters in length, and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value. You can specify up to 10 tag values.
             * <p>
             * 
             * The tag value can be up to 128 characters in length, and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class SecurityPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ciphers")
        private String ciphers;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RelatedListeners")
        private java.util.List < RelatedListeners> relatedListeners;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityPolicyId")
        private String securityPolicyId;

        @com.aliyun.core.annotation.NameInMap("SecurityPolicyName")
        private String securityPolicyName;

        @com.aliyun.core.annotation.NameInMap("SecurityPolicyStatus")
        private String securityPolicyStatus;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TlsVersion")
        private String tlsVersion;

        private SecurityPolicies(Builder builder) {
            this.ciphers = builder.ciphers;
            this.regionId = builder.regionId;
            this.relatedListeners = builder.relatedListeners;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityPolicyId = builder.securityPolicyId;
            this.securityPolicyName = builder.securityPolicyName;
            this.securityPolicyStatus = builder.securityPolicyStatus;
            this.tags = builder.tags;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return relatedListeners
         */
        public java.util.List < RelatedListeners> getRelatedListeners() {
            return this.relatedListeners;
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
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return tlsVersion
         */
        public String getTlsVersion() {
            return this.tlsVersion;
        }

        public static final class Builder {
            private String ciphers; 
            private String regionId; 
            private java.util.List < RelatedListeners> relatedListeners; 
            private String resourceGroupId; 
            private String securityPolicyId; 
            private String securityPolicyName; 
            private String securityPolicyStatus; 
            private java.util.List < Tags> tags; 
            private String tlsVersion; 

            /**
             * The supported cipher suites, which are determined by the TLS protocol version. You can specify at most 32 cipher suites.
             * <p>
             * 
             * TLS 1.0 and TLS 1.1 support the following cipher suites:
             * 
             * *   **ECDHE-ECDSA-AES128-SHA**
             * *   **ECDHE-ECDSA-AES256-SHA**
             * *   **ECDHE-RSA-AES128-SHA**
             * *   **ECDHE-RSA-AES256-SHA**
             * *   **AES128-SHA**
             * *   **AES256-SHA**
             * *   **DES-CBC3-SHA**
             * 
             * TLS 1.2 supports the following cipher suites:
             * 
             * *   **ECDHE-ECDSA-AES128-SHA**
             * *   **ECDHE-ECDSA-AES256-SHA**
             * *   **ECDHE-RSA-AES128-SHA**
             * *   **ECDHE-RSA-AES256-SHA**
             * *   **AES128-SHA**
             * *   **AES256-SHA**
             * *   **DES-CBC3-SHA**
             * *   **ECDHE-ECDSA-AES128-GCM-SHA256**
             * *   **ECDHE-ECDSA-AES256-GCM-SHA384**
             * *   **ECDHE-ECDSA-AES128-SHA256**
             * *   **ECDHE-ECDSA-AES256-SHA384**
             * *   **ECDHE-RSA-AES128-GCM-SHA256**
             * *   **ECDHE-RSA-AES256-GCM-SHA384**
             * *   **ECDHE-RSA-AES128-SHA256**
             * *   **ECDHE-RSA-AES256-SHA384**
             * *   **AES128-GCM-SHA256**
             * *   **AES256-GCM-SHA384**
             * *   **AES128-SHA256**
             * *   **AES256-SHA256**
             * 
             * TLS 1.3 supports the following cipher suites:
             * 
             * *   **TLS_AES\_128\_GCM_SHA256**
             * *   **TLS_AES\_256\_GCM_SHA384**
             * *   **TLS_CHACHA20\_POLY1305\_SHA256**
             * *   **TLS_AES\_128\_CCM_SHA256**
             * *   **TLS_AES\_128\_CCM\_8\_SHA256**
             */
            public Builder ciphers(String ciphers) {
                this.ciphers = ciphers;
                return this;
            }

            /**
             * The region ID of the NLB instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The listeners that are associated with the NLB instance.
             */
            public Builder relatedListeners(java.util.List < RelatedListeners> relatedListeners) {
                this.relatedListeners = relatedListeners;
                return this;
            }

            /**
             * The resource group ID.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
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
             * The name of the TLS security policy.
             */
            public Builder securityPolicyName(String securityPolicyName) {
                this.securityPolicyName = securityPolicyName;
                return this;
            }

            /**
             * The status of the TLS security policy. Valid values:
             * <p>
             * 
             * *   **Configuring**
             * *   **Available**
             */
            public Builder securityPolicyStatus(String securityPolicyStatus) {
                this.securityPolicyStatus = securityPolicyStatus;
                return this;
            }

            /**
             * The tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The supported versions of the TLS protocol. Valid values: **TLSv1.0**, **TLSv1.1**, **TLSv1.2**, and **TLSv1.3**.
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
